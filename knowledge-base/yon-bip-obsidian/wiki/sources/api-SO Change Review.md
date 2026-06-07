---
title: "销售订单变更审核"
apiId: "18c530724b1040c89752fc02c262b95d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "SO Change"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, SO Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售订单变更审核

> `ContentType	application/json` 请求方式	POST | 分类: SO Change (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/voucherorderchange/audit

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
| data | object | 是 | 否 | 销售订单变更 |
| id | long | 否 | 是 | 销售订单变更单据的id 示例：1958317327470848 |

## 3. 请求示例

Url: /yonbip/sd/voucherorderchange/audit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1958317327470848
		}
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | object | 否 | 调用返回信息 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用返回数据 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| count | long | 否 | 数据总条数 示例：1 |
| sucessCount | long | 否 | 数据成功条数 示例：1 |
| failCount | long | 否 | 数据失败条数 示例：0 |
| messages | string | 是 | 调用失败信息 |
| infos | object | 是 | 调用成功信息 |
| failInfos | object | 是 | 数据返回失败信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": {},
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": 1608731626422927400,
				"verifystate": 2,
				"auditor": "YonSuite默认用户",
				"auditorId": 1536776879655616500,
				"auditTime": "2022-12-08 14:40:01",
				"auditDate": "2022-12-08 00:00:00",
				"status": 1,
				"pubts": "2022-12-08 14:30:26"
			}
		],
		"failInfos": [
			{}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


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

