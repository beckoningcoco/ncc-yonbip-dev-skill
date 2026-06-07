---
title: "辅助核算详情查询"
apiId: "161244d65bfd4058a1f36ecabd1b5901"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Auxiliary Accounting Item"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Auxiliary Accounting Item]
platform_version: "BIP"
source_type: community-api-docs
---

# 辅助核算详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Auxiliary Accounting Item (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/fi/fipub/multidimension_ext/getapimultidimension

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |

## 3. 请求示例

Url: /yonbip/fi/fipub/multidimension_ext/getapimultidimension?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 返回信息 示例：操作成功。 |
| data | object | 是 | 数据 |
| creator | string | 否 | 创建人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| def1 | string | 否 | 辅助核算def1 示例：人员 |
| code | string | 否 | 编码 示例：0003 |
| sort | long | 否 | 排序 示例：3 |
| strongctrl | boolean | 否 | 是否强管控 是:true,否:false 示例：false |
| dr | long | 否 | 删除标识 示例：0 |
| doctype | string | 否 | 档案类型 示例：personnel |
| name6 | string | 否 | 辅助核算多语预留 示例：辅助核算多语预留 |
| name5 | string | 否 | 辅助核算多语预留 示例：辅助核算多语预留 |
| name4 | string | 否 | 辅助核算多语预留 示例：辅助核算多语预留 |
| modifiedtime | long | 否 | 修改时间 示例：1556528089000 |
| multidimension | string | 否 | 辅助核算项id 示例：19e87737-56fc-11eb-92ca-0646ec0005a6 |
| name3 | string | 否 | 辅助核算繁体 示例：personnel |
| srctplid | string | 否 | 来源 示例：3AE6A9DD-F8DC-4A39-8300-3D3C9AF22506 |
| vrs | string | 否 | 辅助核算vrs 示例：vr3 |
| name | string | 否 | 辅助核算中文名 示例：人员 |
| tenantid | string | 否 | 租户 示例：c04cstr1 |
| creationtime | long | 否 | 创建时间 示例：1497059916000 |
| id | string | 否 | 主键 示例：1a097afc-56fc-11eb-92ca-0646ec0005a6 |
| state | long | 否 | 状态 示例：0 |
| mutiLang | string | 否 | 中文 示例：人员 |
| name2 | string | 否 | 辅助核算英文名 示例：人員 |
| sourceDoc | object | 否 | 来源档案 |
| ts | long | 否 | 时间 示例：1556528089000 |
| code | long | 否 | 编码 示例：200 |

## 5. 正确返回示例

{
	"message": "操作成功。",
	"data": [
		{
			"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"def1": "人员",
			"code": "0003",
			"sort": 3,
			"strongctrl": false,
			"dr": 0,
			"doctype": "personnel",
			"name6": "辅助核算多语预留",
			"name5": "辅助核算多语预留",
			"name4": "辅助核算多语预留",
			"modifiedtime": 1556528089000,
			"multidimension": "19e87737-56fc-11eb-92ca-0646ec0005a6",
			"name3": "personnel",
			"srctplid": "3AE6A9DD-F8DC-4A39-8300-3D3C9AF22506",
			"vrs": "vr3",
			"name": "人员",
			"tenantid": "c04cstr1",
			"creationtime": 1497059916000,
			"id": "1a097afc-56fc-11eb-92ca-0646ec0005a6",
			"state": 0,
			"mutiLang": "人员",
			"name2": "人員",
			"sourceDoc": {
				"code": "personnel",
				"name": "人员",
				"id": "1579b7c3-56fc-11eb-92ca-0646ec0005a6"
			},
			"ts": 1556528089000
		}
	],
	"code": 200
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

310036	非法token	token错误，不合法


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

