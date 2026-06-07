---
title: "资产处置保存"
apiId: "1f64a3f910e04308a2be8d6632c17c4c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Disposal Document"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Disposal Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产处置保存

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Disposal Document (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fixedassetshandle/save

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
| data | object | 否 | 否 | data |
| accentity_code | string | 否 | 否 | accentity_code 示例：0226 |
| accentity | string | 否 | 否 | accentity 示例：2148237326782720 |
| accentity_name | string | 否 | 否 | accentity_name 示例：固定资产 |
| code | string | 否 | 否 | code 示例：DP000002 |
| reducedate | string | 否 | 否 | reducedate 示例：2021-04-04 |
| reduceway | long | 否 | 否 | reduceway 示例：2066527463189396 |
| reduceway_name | string | 否 | 否 | reduceway_name 示例：出售 |
| cleanincome | long | 否 | 否 | cleanincome 示例：2 |
| valueaddedtax | long | 否 | 否 | valueaddedtax 示例：1 |
| cleancost | long | 否 | 否 | cleancost 示例：2 |
| cleanreason | object | 否 | 否 | cleanreason |
| isenabled | boolean | 否 | 否 | isenabled 示例：false |
| creator | string | 否 | 否 | creator 示例：17835411342 |
| createTime | string | 否 | 否 | createTime 示例：2021-03-04 17:19:42 |
| currency | string | 否 | 否 | currency 示例：2145519866484224 |
| currency_name | string | 否 | 否 | currency_name 示例：人民币 |
| currency_priceDigit | long | 否 | 否 | currency_priceDigit 示例：2 |
| currency_moneyDigit | long | 否 | 否 | currency_moneyDigit 示例：2 |
| reduceway_code | string | 否 | 否 | reduceway_code 示例：01 |
| period | string | 否 | 否 | period 示例：2021-04 |
| isWfControlled | boolean | 否 | 否 | isWfControlled 示例：false |
| verifystate | long | 否 | 否 | verifystate 示例：0 |
| returncount | long | 否 | 否 | returncount 示例：0 |
| bodies | object | 是 | 否 | bodies |
| _status | string | 否 | 否 | _status 示例：Insert |

## 3. 请求示例

Url: /yonbip/fi/fixedassetshandle/save?access_token=访问令牌
Body: {
	"data": {
		"accentity_code": "0226",
		"accentity": "2148237326782720",
		"accentity_name": "固定资产",
		"code": "DP000002",
		"reducedate": "2021-04-04",
		"reduceway": 2066527463189396,
		"reduceway_name": "出售",
		"cleanincome": 2,
		"valueaddedtax": 1,
		"cleancost": 2,
		"cleanreason": {
			"zh_CN": "测试11",
			"en_US": "",
			"zh_TW": ""
		},
		"isenabled": false,
		"creator": "17835411342",
		"createTime": "2021-03-04 17:19:42",
		"currency": "2145519866484224",
		"currency_name": "人民币",
		"currency_priceDigit": 2,
		"currency_moneyDigit": 2,
		"reduceway_code": "01",
		"period": "2021-04",
		"isWfControlled": false,
		"verifystate": 0,
		"returncount": 0,
		"bodies": [
			{
				"hasDefaultInit": true,
				"_tableDisplayOutlineAll": false,
				"assetid_code": "0001210303000003",
				"assetid": 2155106965836032,
				"assetid_name": "测试1",
				"beaccruedoriginalvalue": 2,
				"bescrapvaluerate": 5,
				"bedepreciationmethod": 67971,
				"bedepreciationmethod_name": "平均年限法(二)",
				"beinitialdepreciation": 0,
				"bescrapvalue": 0.1,
				"belifemonth": 600,
				"beusagestate": 2112934987388602,
				"beusagestate_name": "在用",
				"bemanagedepredept": "2148245505003776",
				"bemanagedepredept_name": "采购",
				"beusedepredept": "2148245505003776",
				"beusedepredept_name": "采购",
				"becategorycode": 2142662516806416,
				"becategorycode_name": "土地",
				"calculateid": 2155106965852416,
				"impairment": 0,
				"_status": "Insert"
			}
		],
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| code | long | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| accentity_code | string | 否 | accentity_code 示例：0226 |
| accentity | string | 否 | accentity 示例：2148237326782720 |
| accentity_name | string | 否 | accentity_name 示例：固定资产 |
| code | string | 否 | code 示例：DP000002 |
| reducedate | string | 否 | reducedate 示例：2021-04-04 00:00:00 |
| reduceway | long | 否 | reduceway 示例：2066527463189396 |
| reduceway_name | string | 否 | reduceway_name 示例：出售 |
| cleanincome | long | 否 | cleanincome 示例：2 |
| valueaddedtax | long | 否 | valueaddedtax 示例：1 |
| cleancost | long | 否 | cleancost 示例：2 |
| cleanreason | object | 否 | cleanreason |
| isenabled | boolean | 否 | isenabled 示例：false |
| creator | string | 否 | creator 示例：17835411342 |
| createTime | string | 否 | createTime 示例：2021-03-04 17:22:40 |
| currency | string | 否 | currency 示例：2145519866484224 |
| currency_name | string | 否 | currency_name 示例：人民币 |
| currency_priceDigit | string | 否 | currency_priceDigit 示例：2 |
| currency_moneyDigit | string | 否 | currency_moneyDigit 示例：2 |
| reduceway_code | string | 否 | reduceway_code 示例：01 |
| period | string | 否 | period 示例：2021-04 |
| isWfControlled | boolean | 否 | isWfControlled 示例：false |
| verifystate | long | 否 | verifystate 示例：0 |
| returncount | long | 否 | returncount 示例：0 |
| bodies | object | 是 | bodies |
| billExistStatus | long | 否 | billExistStatus 示例：1 |
| id | long | 否 | id 示例：2156949660963072 |
| busiaccbook | long | 否 | busiaccbook 示例：2148237766856960 |
| periodid | long | 否 | periodid 示例：2145519937458432 |
| vouchdate | string | 否 | vouchdate 示例：2021-04-04 00:00:00 |
| auditstatus | long | 否 | auditstatus 示例：0 |
| voucherstatus | string | 否 | voucherstatus 示例：2 |
| tradetype | string | 否 | tradetype 示例：2145521022210315 |
| isnoweffect | boolean | 否 | isnoweffect 示例：true |
| creatorId | long | 否 | creatorId 示例：2148240887222528 |
| createDate | string | 否 | createDate 示例：2021-03-04 17:22:40 |
| status | long | 否 | status 示例：0 |
| pubts | string | 否 | pubts 示例：2021-03-04 17:22:40 |
| tenant | long | 否 | tenant 示例：2145517607293184 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"accentity_code": "0226",
		"accentity": "2148237326782720",
		"accentity_name": "固定资产",
		"code": "DP000002",
		"reducedate": "2021-04-04 00:00:00",
		"reduceway": 2066527463189396,
		"reduceway_name": "出售",
		"cleanincome": 2,
		"valueaddedtax": 1,
		"cleancost": 2,
		"cleanreason": {
			"zh_CN": "测试11"
		},
		"isenabled": false,
		"creator": "17835411342",
		"createTime": "2021-03-04 17:22:40",
		"currency": "2145519866484224",
		"currency_name": "人民币",
		"currency_priceDigit": "2",
		"currency_moneyDigit": "2",
		"reduceway_code": "01",
		"period": "2021-04",
		"isWfControlled": false,
		"verifystate": 0,
		"returncount": 0,
		"bodies": [
			{
				"hasDefaultInit": true,
				"assetid_code": "0001210303000003",
				"assetid": 2155106965836032,
				"assetid_name": "测试1",
				"beaccruedoriginalvalue": 2,
				"bescrapvaluerate": 5,
				"bedepreciationmethod": 67971,
				"bedepreciationmethod_name": "平均年限法(二)",
				"beinitialdepreciation": 0,
				"bescrapvalue": 0.1,
				"belifemonth": 600,
				"beusagestate": 2112934987388602,
				"beusagestate_name": "在用",
				"bemanagedepredept": "2148245505003776",
				"bemanagedepredept_name": "采购",
				"beusedepredept": "2148245505003776",
				"beusedepredept_name": "采购",
				"becategorycode": 2142662516806416,
				"becategorycode_name": "土地",
				"calculateid": 2155106965852416,
				"impairment": 0,
				"id": 2156949660979456,
				"disposalbill": 2156949660963072,
				"pubts": "2021-03-04 17:22:40",
				"tenant": 2145517607293184
			}
		],
		"billExistStatus": 1,
		"id": 2156949660963072,
		"busiaccbook": 2148237766856960,
		"periodid": 2145519937458432,
		"vouchdate": "2021-04-04 00:00:00",
		"auditstatus": 0,
		"voucherstatus": "2",
		"tradetype": "2145521022210315",
		"isnoweffect": true,
		"creatorId": 2148240887222528,
		"createDate": "2021-03-04 17:22:40",
		"status": 0,
		"pubts": "2021-03-04 17:22:40",
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

