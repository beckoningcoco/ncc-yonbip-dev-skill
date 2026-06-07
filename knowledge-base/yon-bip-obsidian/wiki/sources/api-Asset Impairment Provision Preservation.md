---
title: "资产减值准备保存"
apiId: "2d24177c8b784b3eacf2775c81b1c85c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Change Request"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Change Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产减值准备保存

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Change Request (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/impairmentofassets/save

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
| data | object | 否 | 是 | 减值准备数据 |
| code | string | 否 | 是 | 减值准备编码 示例：DIV000002 |
| accentity_code | string | 否 | 否 | 会计主体编码 示例：0226 |
| accentity | string | 否 | 是 | 会计主体 示例：2148237326782720 |
| accentity_name | string | 否 | 是 | 会计主体名称 示例：固定资产 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2021-04-03 |
| totalbookvalue | long | 否 | 是 | 账面价值 示例：2 |
| totalaccrued | long | 否 | 是 | 本次计提 示例：0 |
| currency | string | 否 | 否 | 币种 示例：2145519866484224 |
| currency_name | string | 否 | 否 | 币种名称 示例：人民币 |
| currency_priceDigit | long | 否 | 否 | 币种单价精度 示例：2 |
| currency_moneyDigit | long | 否 | 否 | 币种金额精度 示例：2 |
| periodcode | string | 否 | 否 | 会计期间编码 示例：2021-04 |
| creator | string | 否 | 否 | 创建人 示例：17835411342 |
| createTime | string | 否 | 否 | 创建时间 示例：2021-03-03 10:11:28 |
| isWfControlled | boolean | 否 | 否 | 是否工作流控制 示例：false |
| status | long | 否 | 否 | 操作标识, Insert:新增、Update:更新 示例：0 |
| verifystate | long | 否 | 否 | 审批状态 示例：0 |
| returncount | long | 否 | 否 | 返回次数 示例：0 |
| bodies | object | 是 | 是 | bodies |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/fi/impairmentofassets/save?access_token=访问令牌
Body: {
	"data": {
		"code": "DIV000002",
		"accentity_code": "0226",
		"accentity": "2148237326782720",
		"accentity_name": "固定资产",
		"vouchdate": "2021-04-03",
		"totalbookvalue": 2,
		"totalaccrued": 0,
		"currency": "2145519866484224",
		"currency_name": "人民币",
		"currency_priceDigit": 2,
		"currency_moneyDigit": 2,
		"periodcode": "2021-04",
		"creator": "17835411342",
		"createTime": "2021-03-03 10:11:28",
		"isWfControlled": false,
		"status": 0,
		"verifystate": 0,
		"returncount": 0,
		"bodies": [
			{
				"hasDefaultInit": true,
				"_tableDisplayOutlineAll": false,
				"assetid": 2155106965836032,
				"assetid_code": "0001210303000003",
				"assetid_name": "测试1",
				"calculateid": 2155106965852416,
				"becategorycode": 2142662516806416,
				"becategorycode_name": "土地",
				"beoriginalvalue": 2,
				"beinitialdepreciation": 0,
				"bescrapvaluerate": 5,
				"recoveramount": 2,
				"curaccrued": "0",
				"impairmentreason": 1933424923637145,
				"impairmentreason_name": "长期闲置不用，在可预见的未来不会再使用，且已无转让价值的固定资产",
				"beimpairment": 0,
				"impairment": 0,
				"netvalue": "2",
				"netamount": "2",
				"scrapvalue": 0.1,
				"initflag": false,
				"period": "2021-03",
				"periodid": 2145519937442048,
				"bodyItem!id": "",
				"bodyItem!define1": "",
				"bodyItem!define2": "",
				"bodyItem!define3": "",
				"bodyItem!define4": "",
				"bodyItem!define5": "",
				"bodyItem!define6": "",
				"bodyItem!define7": "",
				"bodyItem!define8": "",
				"bodyItem!define9": "",
				"bodyItem!define10": "",
				"bodyItem!define11": "",
				"bodyItem!define12": "",
				"bodyItem!define13": "",
				"bodyItem!define14": "",
				"bodyItem!define15": "",
				"bodyItem!define16": "",
				"bodyItem!define17": "",
				"bodyItem!define18": "",
				"bodyItem!define19": "",
				"bodyItem!define20": "",
				"bodyItem!define21": "",
				"bodyItem!define22": "",
				"bodyItem!define23": "",
				"bodyItem!define24": "",
				"bodyItem!define25": "",
				"bodyItem!define26": "",
				"bodyItem!define27": "",
				"bodyItem!define28": "",
				"bodyItem!define29": "",
				"bodyItem!define30": "",
				"bodyItem!define31": "",
				"bodyItem!define32": "",
				"bodyItem!define33": "",
				"bodyItem!define34": "",
				"bodyItem!define35": "",
				"bodyItem!define36": "",
				"bodyItem!define37": "",
				"bodyItem!define38": "",
				"bodyItem!define39": "",
				"bodyItem!define40": "",
				"bodyItem!define41": "",
				"bodyItem!define42": "",
				"bodyItem!define43": "",
				"bodyItem!define44": "",
				"bodyItem!define45": "",
				"bodyItem!define46": "",
				"bodyItem!define47": "",
				"bodyItem!define48": "",
				"bodyItem!define49": "",
				"bodyItem!define50": "",
				"bodyItem!define51": "",
				"bodyItem!define52": "",
				"bodyItem!define53": "",
				"bodyItem!define54": "",
				"bodyItem!define55": "",
				"bodyItem!define56": "",
				"bodyItem!define57": "",
				"bodyItem!define58": "",
				"bodyItem!define59": "",
				"bodyItem!define60": "",
				"_status": "Insert"
			}
		],
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| message | string | 否 | 调用失败时的错误信息 data object 否 调用成功时的返回数据 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| code | string | 否 | 单据编码 示例：DIV000002 |
| accentity_code | string | 否 | 会计主体编码 示例：0226 |
| accentity | string | 否 | 会计主体 示例：2148237326782720 |
| accentity_name | string | 否 | 会计主体名称 示例：固定资产 |
| vouchdate | string | 否 | 凭证日期 示例：2021-04-03 00:00:00 |
| totalbookvalue | long | 否 | 账面价值 示例：2 |
| totalaccrued | long | 否 | 本次计提 示例：0 |
| currency | string | 否 | 币种 示例：2145519866484224 |
| currency_name | string | 否 | 币种名称 示例：人民币 |
| currency_priceDigit | string | 否 | 币种单价精度 示例：2 |
| currency_moneyDigit | string | 否 | 币种金额精度 示例：2 |
| periodcode | string | 否 | 会计期间编码 示例：2021-04 |
| creator | string | 否 | 创建人 示例：17835411342 |
| createTime | string | 否 | 创建时间 示例：2021-03-03 10:12:40 |
| isWfControlled | boolean | 否 | 是否工作流控制 示例：false |
| status | long | 否 | status 示例：0 |
| verifystate | long | 否 | 审批状态 示例：0 |
| returncount | long | 否 | 返回次数 示例：0 |
| bodies | object | 是 | bodies |
| id | long | 否 | id 示例：2155111375442176 |
| busiaccbook | long | 否 | 账簿 示例：2148237766856960 |
| period | long | 否 | 会计期间 示例：2145519937458432 |
| voucherstatus | string | 否 | 凭证状态 示例：2 |
| tradetype | string | 否 | 交易类型ID 示例：2145521022243076 |
| creatorId | long | 否 | 创建人id 示例：2148240887222528 |
| createDate | string | 否 | 创建时间 示例：2021-03-03 10:12:40 |
| pubts | string | 否 | 时间戳 示例：2021-03-03 10:12:40 |
| tenant | long | 否 | 租户id 示例：2145517607293184 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "DIV000002",
		"accentity_code": "0226",
		"accentity": "2148237326782720",
		"accentity_name": "固定资产",
		"vouchdate": "2021-04-03 00:00:00",
		"totalbookvalue": 2,
		"totalaccrued": 0,
		"currency": "2145519866484224",
		"currency_name": "人民币",
		"currency_priceDigit": "2",
		"currency_moneyDigit": "2",
		"periodcode": "2021-04",
		"creator": "17835411342",
		"createTime": "2021-03-03 10:12:40",
		"isWfControlled": false,
		"status": 0,
		"verifystate": 0,
		"returncount": 0,
		"bodies": [
			{
				"hasDefaultInit": true,
				"assetid": 2155106965836032,
				"assetid_code": "0001210303000003",
				"assetid_name": "测试1",
				"calculateid": 2155106965852416,
				"becategorycode": 2142662516806416,
				"becategorycode_name": "土地",
				"beoriginalvalue": 2,
				"beinitialdepreciation": 0,
				"bescrapvaluerate": "5",
				"recoveramount": 2,
				"curaccrued": 0,
				"impairmentreason": 1933424923637145,
				"impairmentreason_name": "长期闲置不用，在可预见的未来不会再使用，且已无转让价值的固定资产",
				"beimpairment": 0,
				"impairment": 0,
				"netvalue": 2,
				"netamount": 2,
				"scrapvalue": 0.1,
				"initflag": false,
				"period": "2021-03",
				"periodid": "2145519937442048",
				"id": 2155111375442177,
				"impairmentbill": 2155111375442176,
				"pubts": "2021-03-03 10:12:40",
				"tenant": 2145517607293184,
				"bodyItem!id": 2155111375442177,
				"bodyItem!pubts": "2021-03-03 10:12:40"
			}
		],
		"id": 2155111375442176,
		"busiaccbook": 2148237766856960,
		"period": 2145519937458432,
		"voucherstatus": "2",
		"tradetype": "2145521022243076",
		"creatorId": 2148240887222528,
		"createDate": "2021-03-03 10:12:40",
		"pubts": "2021-03-03 10:12:40",
		"tenant": 2145517607293184
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

