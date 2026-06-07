---
title: "货币兑换列表查询"
apiId: "2396792059920384009"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Currency Exchange"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Currency Exchange]
platform_version: "BIP"
source_type: community-api-docs
---

# 货币兑换列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Currency Exchange (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/ctm/currencyexchange/list

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | number |
| 小数位数:0,最大长度:38 | 否 | 是 | 页号 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:38 | 否 | 是 | 每页行数 默认值：10 |
| accentity | string | 否 | 否 | 资金组织id 示例：2591580914225408 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始日期 示例：2022-05-23 |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束日期 示例：2022-05-23 |
| settlestatus | string | 否 | 否 | 交割状态；1：待处理，2：手工交割完成，3：处理中，4：待交割，5：已交割，6：逾期，7：交割失败 示例：5 |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| field | string | 否 | 否 | 属性名(条件) ，1：defines.define4(表头自由自定义项4) ，2：pubts(时间戳) 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |
| value1 | string | 否 | 否 | 值1 示例：2022-05-24 20:34:29 |
| value2 | string | 否 | 否 | 值2 示例：2022-05-25 20:34:29 |

## 3. 请求示例

Url: /yonbip/ctm/currencyexchange/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"accentity": "2591580914225408",
	"open_vouchdate_begin": "2022-05-23",
	"open_vouchdate_end": "2022-05-23",
	"settlestatus": "5",
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2022-05-24 20:34:29",
			"value2": "2022-05-25 20:34:29"
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
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页号 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页数量 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 返回数据 |
| pageCount | number |
| 小数位数:2,最大长度:10 | 否 | 总页数 示例：1 |
| beginPageIndex | number |
| 小数位数:2,最大长度:10 | 否 | 开始页号 示例：1 |
| endPageIndex | number |
| 小数位数:2,最大长度:10 | 否 | 终止页号 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"purchasebankaccount": "2719941813391872",
				"purchasecashaccount": "2719941813391872",
				"sellbankaccount": "2719941813391872",
				"sellcashaccount": "2719941813391872",
				"commissionbankaccount": "2719941813391872",
				"commissioncashaccount": "2719941813391872",
				"depositAccountNo": "2719941813391872",
				"settlemode": "2591099436552463",
				"tradetype_code": "cmp_fund_payment_other",
				"accentity_name": "曾氏总部",
				"characterDef": "",
				"accentity": "2591580914225408",
				"purchaseCurrency": "2591342867010560",
				"depositCurrency": "2591342867010560",
				"id": "2788485821747968",
				"voucherId": "2788485821747968",
				"exchangeRateType_digit": "6",
				"accentityRaw": "34",
				"paybankbill": "2788485821747968",
				"collectbankbill": "2788485821747968",
				"paybankbillbank_seq_no": "2788485821747968",
				"collectbankbill_seq_no": "2788485821747968",
				"paybillclaim": "2788485821747968",
				"collectbillclaim": "2788485821747968",
				"paybillclaim_code": "2788485821747968",
				"collectbillclaim_code": "2788485821747968",
				"batchno": "34",
				"buysmartcheckno": "34",
				"sellsmartcheckno": "34",
				"foreignlimitno": "34",
				"contractNo": "34",
				"inquiryNo": "34",
				"transactionCode": "255955994136934",
				"transactionCode_code": "255955994136934",
				"sourcecode": "255955994136934",
				"sourcecode_codingname": "255955994136934",
				"purposecode": "255955994136934",
				"purposecode_codingname": "255955994136934",
				"settlePurposeCode": "255955994136934",
				"settlePurposeCode_code": "255955994136934",
				"settlePurposeCode_name": "255955994136934",
				"settlePurposeDetail": "255955994136934",
				"safeApprovalNo": "255955994136934",
				"fileName": "255955994136934",
				"statisticalCode": "255955994136934",
				"projectclassification": "255955994136934",
				"isWfControlled": false,
				"associationStatusPay": "false",
				"associationStatusCollect": "false",
				"isCheckAccount": false,
				"isDelayed": false,
				"pricingParty": "1",
				"businessType": "1",
				"deliverytime": "1",
				"delegationType": "1",
				"purchasebankaccount_name": "北京畅捷通支付技术有限公司",
				"purchasecashaccount_name": "北京畅捷通支付技术有限公司",
				"sellbankaccount_name": "北京畅捷通支付技术有限公司",
				"sellcashaccount_name": "北京畅捷通支付技术有限公司",
				"commissionbankaccount_name": "北京畅捷通支付技术有限公司",
				"commissioncashaccount_name": "北京畅捷通支付技术有限公司",
				"purchaseamount": "100",
				"sellamount": "100",
				"accentityRaw_name": "用友网络",
				"verifystate": "0",
				"code": "FDP20220524000246",
				"description": "备注",
				"exchangerate": 1,
				"inquiryExchangerate": 1,
				"purchaserate": 0,
				"sellrate": 1,
				"expectexchangerate": 1,
				"commissionrate": 1,
				"vouchdate": "2022-05-24 00:00:00",
				"settledate": "2022-05-24 00:00:00",
				"expectedDeliveryDate": "2022-05-24 00:00:00",
				"delayedDate": "2022-05-24 00:00:00",
				"purchaseCurrency_name": "人民币",
				"sellCurrency_name": "人民币",
				"regionCurrency_name": "人民币",
				"depositCurrency_name": "人民币",
				"settlestatus": "5",
				"projectType": "1",
				"inquiryType": "1",
				"depositAccountNo_name": "699973566",
				"commissionCurrency": "2591342867010560",
				"pubts": "2022-05-24 20:34:29",
				"settlemode_name": "银行转账",
				"createDate": "2022-05-24 00:00:00",
				"settleuser": "曾刚",
				"modifier": "曾刚",
				"auditor": "曾刚",
				"creator": "曾刚",
				"declarer": "曾刚",
				"declarerPhone": "13131313131",
				"commissionCurrency_name": "人民币",
				"commissionamount": "100",
				"commissionlocalamount": "100",
				"exchangeloss": "100",
				"purchaselocalamount": "100",
				"sellloaclamount": "100",
				"collateralOccupation": "1",
				"marginAccountFlag": "1",
				"org": "2591580914225408",
				"tradetype_name": "其他付款",
				"dept_name": "测试部",
				"dept": "2663265966461184",
				"accentity_code": "ZSZB",
				"fundsource": "ZSZB",
				"fundtarget": "ZSZB",
				"project": "ZSZB",
				"project_name": "ZSZB",
				"wbs": "ZSZB",
				"wbs_name": "ZSZB",
				"activity": "ZSZB",
				"activity_name": "ZSZB",
				"summary": "ZSZB",
				"enterpriseBackMessg": "ZSZB",
				"srcitem": "8",
				"rateconversiontype": "8",
				"voucherstatus": "8",
				"tradetype": "2553204791808512",
				"exchangeRateType": "0000KY14MIJC0SDERP0000",
				"operator_name": "曾刚",
				"createTime": "2022-05-24 20:34:28",
				"modifyTime": "2022-05-24 20:34:28",
				"auditTime": "2022-05-24 20:34:28",
				"exchangeRateType_name": "基准汇率",
				"defines": {}
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

