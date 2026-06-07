---
title: "转账状态批量查询"
apiId: "48d6e7cbc0d34d57836f7e0665f700d7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Same-name Account Transfer"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Same-name Account Transfer]
platform_version: "BIP"
source_type: community-api-docs
---

# 转账状态批量查询

> `ContentType	application/json` 请求方式	POST | 分类: Same-name Account Transfer (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/bill/transferstatus

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| codes | string | 是 | 否 | 转账工作台单据编码 |
| ids | string | 是 | 否 | 转账工作台单据主键 |

## 3. 请求示例

Url: /yonbip/fi/bill/transferstatus?access_token=访问令牌
Body: {
	"codes": [
		""
	],
	"ids": [
		""
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回的状态码 |
| message | string | 否 | 返回信息 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 用友系统转账工作台单据主键 示例：1822835516510464 |
| auditstatus | string | 否 | 审批状态,1:已审批，2：未审批 示例：1 |
| auditTime | string | 否 | 审批时间 |
| paystatus | string | 否 | 支付状态, 0:待支付、1:预下单成功、2:预下单失败、3:支付成功、4:支付失败、5:支付中、6:支付不明、7:线下支付成功、8:部分成功、 示例：4 |
| paydate | string | 否 | 支付日期 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": "1822835516510464",
		"auditstatus": "1",
		"auditTime": "",
		"paystatus": "4",
		"paydate": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	查询异常	请确认请求JSON是否正确


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-04-15

更新

返回参数 (8)

微服务编码调整


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

