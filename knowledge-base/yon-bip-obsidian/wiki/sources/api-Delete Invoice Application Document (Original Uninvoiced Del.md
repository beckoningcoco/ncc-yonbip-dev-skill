---
title: "开票申请单删除（原未开票删除）"
apiId: "1841870457067274242"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoice Request"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoice Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 开票申请单删除（原未开票删除）

> `ContentType	application/json` 请求方式	POST | 分类: Invoice Request (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/output-tax/api/invoice-will/delete

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条删除

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| djqqlsh | string | 否 | 是 | 单据请求流水号 示例：33333 |
| lyid | string | 否 | 否 | 来源id 示例：123456 |

## 3. 请求示例

Url: /yonbip/tax/output-tax/api/invoice-will/delete?access_token=访问令牌
Body: {
	"djqqlsh": "33333",
	"lyid": "123456"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息说明 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	操作失败	业务操作失败统一码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

