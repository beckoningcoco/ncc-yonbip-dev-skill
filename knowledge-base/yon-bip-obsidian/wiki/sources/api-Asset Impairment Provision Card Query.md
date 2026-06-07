---
title: "资产减值准备卡片查询"
apiId: "7a2197b1e71a4316b85374df2b210496"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Change Request"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Change Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产减值准备卡片查询

> `ContentType	application/json` 请求方式	GET | 分类: Fixed Asset Change Request (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/impairmentofassets/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 资产减值准备单据id    示例: 2154135492579584 |

## 3. 请求示例

Url: /yonbip/fi/impairmentofassets/detail?access_token=访问令牌&id=2154135492579584

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| returncount | long | 否 | 返回次数 示例：0 |
| periodcode | string | 否 | 会计期间编码 示例：2021-02 |
| verifystate | long | 否 | 审批状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 示例：0 |
| currency_moneyDigit | long | 否 | 币种金额精度 示例：2 |
| creator | string | 否 | 创建人 示例：17835411342 |
| currency_priceDigit | long | 否 | 币种单价精度 示例：2 |
| code | string | 否 | 单据编码 示例：DIV000001 |
| currency_name | string | 否 | 币种名称 示例：人民币 |
| masterOrgKeyField | string | 否 | 主组织键领域 示例：accentity |
| isWfControlled | boolean | 否 | 是否工作流控制, true:是、false:否、 示例：false |
| bodies | object | 是 | 表体 |
| accentity_name | string | 否 | 会计主体名称 示例：固定资产 |
| accentity | string | 否 | 会计主体id 示例：2148237326782720 |
| accentity_code | string | 否 | 会计主体编码 示例：0226 |
| totalaccrued | long | 否 | 本次计提 示例：1 |
| vouchdate | string | 否 | 单据日期 示例：2021-02-02 00:00:00 |
| tradetype | string | 否 | 交易类型 示例：2145521022243076 |
| createTime | string | 否 | 创建时间 示例：2021-03-02 17:39:57 |
| totalbookvalue | double | 否 | 账面价值 示例：9983.17 |
| currency | string | 否 | 币种id 示例：2145519866484224 |
| id | long | 否 | 资产减值准备卡片id 示例：2154135492579584 |
| pubts | string | 否 | 时间戳 示例：2021-03-02 17:39:58 |
| status | long | 否 | 单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"returncount": 0,
		"periodcode": "2021-02",
		"verifystate": 0,
		"currency_moneyDigit": 2,
		"creator": "17835411342",
		"currency_priceDigit": 2,
		"code": "DIV000001",
		"currency_name": "人民币",
		"masterOrgKeyField": "accentity",
		"isWfControlled": false,
		"bodies": [
			{
				"bescrapvaluerate": 5,
				"impairmentreason": 1933424923637145,
				"netvalue": 9984.17,
				"scrapvalue": 500,
				"recoveramount": 9983.17,
				"impairmentreason_name": "长期闲置不用，在可预见的未来不会再使用，且已无转让价值的固定资产",
				"calculateid": 2148248202318337,
				"becategorycode": 2142662516806416,
				"curaccrued": 1,
				"assetid_name": "豪宅",
				"assetid_code": "0001210126000002",
				"beinitialdepreciation": 15.83,
				"initflag": false,
				"impairment": 1,
				"assetid": 2148248202318336,
				"beoriginalvalue": 10000,
				"impairmentbill": 2154135492579584,
				"becategorycode_name": "土地",
				"beimpairment": 0,
				"id": 2154135492579585,
				"pubts": "2021-03-02 17:39:58",
				"netamount": 9983.17
			}
		],
		"accentity_name": "固定资产",
		"accentity": "2148237326782720",
		"accentity_code": "0226",
		"totalaccrued": 1,
		"vouchdate": "2021-02-02 00:00:00",
		"tradetype": "2145521022243076",
		"createTime": "2021-03-02 17:39:57",
		"totalbookvalue": 9983.17,
		"currency": "2145519866484224",
		"id": 2154135492579584,
		"pubts": "2021-03-02 17:39:58",
		"status": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	操作成功	资产减值准备查询无错误码，只是查询出来的data可能为空。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

返回参数 (48)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

