---
title: "收款状态批量查询"
apiId: "1431359321025282048"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款状态批量查询

> `ContentType	application/json` 请求方式	POST | 分类: Collection Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/cmpreceivebill/status

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
| ids | string | 是 | 否 | 收款工作台单据的主键 |
| codes | string | 是 | 否 | 收款工作台单据编码 |

## 3. 请求示例

Url: /yonbip/fi/cmpreceivebill/status?access_token=访问令牌
Body: {
	"ids": [
		""
	],
	"codes": [
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
| code | long | 否 | 返回码，请求成功时返回200 示例：200 |
| message | string | 否 | 返回消息，请求失败时返回错误原因 示例：操作成功 |
| data | object | 是 | 返回结果数据 |
| id | string | 否 | 收款工作台单据主键 示例：2023547697992448 |
| auditstatus | string | 否 | 审批状态,1：已审批，2：未审批 示例：1 |
| auditTime | string | 否 | 审批时间 示例：2020-11-30 13:42:04 |
| settledate | string | 否 | 结算日期 示例：2020-11-30 18:42:04 |
| settlestatus | string | 否 | 结算状态，1：未结算，2：已结算 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"id": "2023547697992448",
			"auditstatus": "1",
			"auditTime": "2020-11-30 13:42:04",
			"settledate": "2020-11-30 18:42:04",
			"settlestatus": ""
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	查询异常	请确认请求JSON是否正确


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

