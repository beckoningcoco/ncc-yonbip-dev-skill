"""
YonBIP 元数据查询工具
用途：通过 BIP OpenAPI 查询任意实体的完整元数据定义
用法：python bip_metadata_query.py <entityUri>

示例：
  python bip_metadata_query.py voucher.order.Order
  python bip_metadata_query.py voucher.order.OrderDetail        # 订单明细子表
  python bip_metadata_query.py voucher.order.OrderStatus         # 订单状态子表
  python bip_metadata_query.py voucher.order.PaymentSchedules    # 收款计划子表
  python bip_metadata_query.py voucher.order.RebateSum           # 返利汇总子表
  python bip_metadata_query.py --list                            # 批量拉取所有子表
  python bip_metadata_query.py --all                             # 拉取所有（主表+全部子表）
"""

import requests
import hashlib
import hmac
import json
import time
import os
import sys
import argparse
import base64
import urllib.parse

# ============ 配置 ============
BASE_DOMAIN = "c3.yonyoucloud.com"
APP_KEY = "e77265ec5af84baca3430c27683a7ab6"
APP_SECRET = "b98d848e05ef7500e8ddb7233cff8dadcfb34229"
TENANT_ID = "nfkwaryp"

# API 端点
AUTH_URL = f"https://{BASE_DOMAIN}/iuap-api-auth/open-auth/selfAppAuth/getAccessToken"
META_URL = f"https://{BASE_DOMAIN}/iuap-api-gateway/{TENANT_ID}/current_yonbip_default_sys/GDBG/queryByUri"

# ============ 销售订单及其全部子表 URI ============
ORDER_MAIN = "voucher.order.Order"
ORDER_SUB_TABLES = [
    "voucher.order.OrderDetail",            # 订单明细 (1..n)
    "voucher.order.OrderDetailGroup",       # 订单明细组 (0..n)
    "voucher.order.OrderStatus",            # 订单状态历史 (0..n)
    "voucher.order.OrderPaymentStatus",     # 订单支付状态 (0..n)
    "voucher.order.PaymentVerification",    # 支付核验 (0..n)
    "voucher.order.PaymentSchedules",       # 收款协议子表 (0..n)
    "voucher.order.PaymentExeDetail",       # 收款执行明细 (0..n)
    "voucher.order.OrderPrice",             # 订单价格 (1)
    "voucher.order.RebateSum",              # 返利汇总 (1)
    "voucher.order.RebateDetail",           # 返利明细 (0..n)
    "voucher.order.RebateRecord",           # 返利记录 (0..n)
    "voucher.order.ProductRebateRecord",    # 产品返利记录 (0..n)
    "voucher.order.SignSubject",            # 合同签署主体 (0..n)
    "voucher.order.OrderAttachment",        # 订单附件 (0..n)
    "voucher.order.IBpmCurrentAuditorOrder",# 当前审批人 (0..n)
    "voucher.order.OrderIBpmStep",          # 业务阶段 (0..n)
    "voucher.order.ClueParticipant",        # 线索参与人 (0..n)
    "voucher.order.OrderFreeDefine",        # 头自由定义项（已废弃）
    "voucher.order.OrderDefine",            # 头自定义项（已废弃）
]

# ============ 输出目录 ============
OUTPUT_DIR = os.path.dirname(os.path.abspath(__file__))


def sign(params):
    """
    BIP OpenAPI HmacSHA256 签名
    1. 按 key 字母序排列参数
    2. 拼接为 key1value1key2value2（无分隔符）
    3. HmacSHA256 签名 → Base64（不 URLEncode）
    """
    sorted_keys = sorted(params.keys())
    sign_str = "".join(f"{k}{params[k]}" for k in sorted_keys)

    mac = hmac.new(
        APP_SECRET.encode("utf-8"),
        sign_str.encode("utf-8"),
        hashlib.sha256
    )
    return base64.b64encode(mac.digest()).decode("utf-8")


def get_access_token():
    """通过 HmacSHA256 签名获取 BIP OpenAPI access_token"""
    timestamp = str(int(time.time() * 1000))

    params = {"appKey": APP_KEY, "timestamp": timestamp}
    signature = sign(params)

    print(f"[AUTH] 获取 access_token...")
    resp = requests.get(AUTH_URL, params={
        **params,
        "signature": signature
    }, timeout=30)

    result = resp.json()
    code = result.get("code", "")
    if code != "00000":
        raise Exception(f"鉴权失败: {result.get('message', resp.text)}")

    token = result["data"]["access_token"]
    expire = result["data"].get("expire", "?")
    print(f"[AUTH] 成功, token 前8位: {token[:8]}..., 有效期: {expire}s")
    return token


def query_metadata(token, uri):
    """查询指定 URI 的元数据"""
    print(f"[QUERY] {uri} ...")
    resp = requests.get(META_URL, params={
        "access_token": token,
        "uri": uri,
        "tenantId": TENANT_ID
    }, timeout=60)

    result = resp.json()
    if result.get("code") != "200":
        inner_code = result.get("data", {}).get("resultCode", "")
        raise Exception(f"查询失败: code={result.get('code')}, resultCode={inner_code}, message={result.get('message','')}")

    return result


def extract_summary(data):
    """从元数据 JSON 中提取关键摘要"""
    inner = data.get("data", {}).get("data", {})
    return {
        "displayName": inner.get("displayName", ""),
        "description": inner.get("description", ""),
        "tableName": inner.get("tableName", ""),
        "classUri": inner.get("classUri", ""),
        "applicationCode": inner.get("applicationCode", ""),
        "metaType": inner.get("metaType", ""),
        "attrCount": len(inner.get("attributes", [])),
        "assocCount": len(inner.get("associationAttributes", [])),
        "supplierCount": len(inner.get("suppliers", [])),
    }


def extract_fields(data):
    """提取所有字段的 字段名→数据库列 映射"""
    inner = data.get("data", {}).get("data", {})
    attrs = inner.get("attributes", [])
    fields = []
    for a in attrs:
        name = a.get("name", "")
        col = a.get("columnName", "")
        display = a.get("displayName", "")
        typ_raw = a.get("type", "")
        if isinstance(typ_raw, dict):
            typ = typ_raw.get("name", "")
        else:
            typ = str(typ_raw)
        biztype = a.get("biztype", "")
        required = a.get("isRequired", "")
        nullable = a.get("nullable", "")
        fields.append({
            "name": name, "column": col, "display": display,
            "type": typ, "biztype": biztype,
            "required": required, "nullable": nullable
        })

    # 关联属性
    assoc_attrs = inner.get("associationAttributes", [])
    assocs = []
    for a in assoc_attrs:
        asc = a.get("association", {})
        assocs.append({
            "name": a.get("name", ""),
            "column": a.get("columnName", ""),
            "typeUri": a.get("typeUri", ""),
            "display": a.get("displayName", ""),
            "roleA": asc.get("roleA", ""),
            "roleB": asc.get("roleB", ""),
            "multi": asc.get("roleAMulti", ""),
            "assocType": asc.get("type", ""),
            "isolation": a.get("isolationLevel", ""),
            "isComposition": a.get("isCompositionAttribute", ""),
            "deactivated": a.get("deactivated", ""),
        })

    return fields, assocs


def save_json(data, uri, output_dir):
    """保存原始 JSON"""
    safe_name = uri.replace(".", "_").replace("/", "_")
    path = os.path.join(output_dir, f"metadata_{safe_name}.json")
    with open(path, 'w', encoding='utf-8') as f:
        json.dump(data, f, ensure_ascii=False, indent=2)
    print(f"  -> 已保存: {path} ({os.path.getsize(path)} bytes)")
    return path


def print_summary(uri, summary, fields, assocs):
    """打印字段摘要"""
    print(f"\n{'='*60}")
    print(f"  {summary['displayName']}  ({uri})")
    print(f"  表名: {summary['tableName']}  |  应用: {summary['applicationCode']}  |  类型: {summary['metaType']}")
    print(f"  直接属性: {summary['attrCount']}  |  关联: {summary['assocCount']}  |  依赖接口: {summary['supplierCount']}")
    print(f"{'='*60}")

    if fields:
        print(f"\n  [直接属性字段 → 数据库列映射]")
        print(f"  {'字段名':<35} {'数据库列':<30} {'类型':<10} {'业务类型':<10}")
        print(f"  {'-'*35} {'-'*30} {'-'*10} {'-'*10}")
        for f in fields:
            print(f"  {f['name']:<35} {f['column']:<30} {f['type']:<10} {f['biztype']:<10}")

    if assocs:
        print(f"\n  [关联属性]")
        comps = [a for a in assocs if a['isComposition'] == 'true']
        svcs = [a for a in assocs if a['isolation'] == 'Service']
        print(f"  Composition (子表): {len(comps)} 个")
        for a in comps:
            dep = " [已废弃]" if a['deactivated'] == 'true' else ''
            print(f"    - {a['name']}: {a['roleA']}({a['multi']}) -> {a['roleB']}  typeUri={a['typeUri']}{dep}")
        print(f"  Service (外键引用): {len(svcs)} 个")
        for a in svcs:
            print(f"    - {a['name']}: col={a['column']}  -> {a['typeUri']}")


def main():
    parser = argparse.ArgumentParser(description="YonBIP 元数据查询工具")
    parser.add_argument("uri", nargs="?", help="实体 URI，如 voucher.order.Order")
    parser.add_argument("--list", action="store_true", help="批量拉取所有子表（不含主表）")
    parser.add_argument("--all", action="store_true", help="拉取全部：主表 + 所有子表")
    parser.add_argument("--json-only", action="store_true", help="仅保存 JSON，不打印摘要")
    parser.add_argument("--output-dir", default=None, help="输出目录")
    args = parser.parse_args()

    output_dir = args.output_dir or OUTPUT_DIR
    os.makedirs(output_dir, exist_ok=True)

    # 确定要查询的 URI 列表
    uris = []
    if args.list:
        uris = ORDER_SUB_TABLES
        print(f"批量模式: 查询 {len(uris)} 个子表")
    elif args.all:
        uris = [ORDER_MAIN] + ORDER_SUB_TABLES
        print(f"全量模式: 查询主表 + {len(ORDER_SUB_TABLES)} 个子表 = {len(uris)} 个")
    elif args.uri:
        uris = [args.uri]
    else:
        parser.print_help()
        print(f"\n示例:")
        print(f"  python {sys.argv[0]} voucher.order.Order")
        print(f"  python {sys.argv[0]} voucher.order.OrderDetail")
        print(f"  python {sys.argv[0]} --list   (批量拉所有子表)")
        print(f"  python {sys.argv[0]} --all    (拉主表+全部子表)")
        sys.exit(1)

    # 获取 token（一次，复用）
    try:
        token = get_access_token()
    except Exception as e:
        print(f"[ERROR] {e}")
        sys.exit(1)

    # 批量查询
    success = 0
    for i, uri in enumerate(uris):
        if len(uris) > 1:
            print(f"\n[{i+1}/{len(uris)}]", end=" ")

        try:
            data = query_metadata(token, uri)
            summary = extract_summary(data)
            fields, assocs = extract_fields(data)
            save_json(data, uri, output_dir)

            if not args.json_only:
                print_summary(uri, summary, fields, assocs)

            success += 1
        except Exception as e:
            print(f"[ERROR] {uri}: {e}")

    print(f"\n{'='*60}")
    print(f"完成: {success}/{len(uris)} 个查询成功, 文件保存在 {output_dir}")


if __name__ == "__main__":
    main()
