---
title: "采购发票审批弃审发送 - YonBIP OpenAPI"
source: "https://community.yonyou.com/open-home?apiId=2044441266713264132"
apiId: "2044441266713264132"
apiPath: "/ybp/scm/pu/approveInvoiceToYC"
method: POST
domain: "Supply Chain > Purchase Management"
date: 2026-06-07
ingested: 2026-06-07
tags: [OpenAPI, 采购管理, 发票, 审批, 弃审]
platform_version: "BIP 旗舰版"
source_type: community-api-docs
---

# 采购发票审批弃审发送

> API: `POST /ybp/scm/pu/approveInvoiceToYC`
> 发布: 2024-11-16 | 来源: 用友社区 API 文档

## 1. 请求说明

| 属性 | 值 |
|------|-----|
| 请求域名 | 动态域名，获取方式详见 **获取租户所在数据中心域名** |
| 请求地址 | `/ybp/scm/pu/approveInvoiceToYC` |
| 请求方式 | **POST** |
| ContentType | application/json |
| 事务和幂等性 | 无 |
| 来源 | 系统级 |

## 2. 请求参数

### Query 参数

| 名称 | 类型 | 必填 | 描述 |
|------|------|------|------|
| access_token | string | 是 | 调用方应用 token（企业自建获取 token / 服务商获取 token） |

### Header 参数

| 名称 | 类型 | 必填 | 描述 |
|------|------|------|------|
| pk_org | string | 是 | pk_org |

### Body 参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
|------|------|------|------|------|
| approver | string | 否 | 否 | Approved By |
| cextsrcid | string | 否 | 否 | External Source Table Header Primary Key |
| fbillstatus | string | 否 | 否 | Document Status |

## 3. 请求示例

```
Url: /ybp/scm/pu/approveInvoiceToYC?access_token=访问令牌

Header:
    pk_org : ""

Body: [{
    "approver": "",
    "cextsrcid": "",
    "fbillstatus": ""
}]
```

## 4. 返回值参数

（无额外返回值参数）

## 5. 正确返回示例

```json
{
    "code": "200",
    "message": "",
    "data": {}
}
```

## 6. 业务异常码

暂无数据

## 7. 错误返回码

暂无数据

## 9. 接口变更日志

暂无数据
