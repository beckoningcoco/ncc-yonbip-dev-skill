---
title: "调拨订单列表查询"
apiId: "58d77cc57b3a484786f2ef574676fe78"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 调拨订单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Transfer Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/transferapply/list

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
| isSum | boolean | 否 | 否 | 是否按照表头查询 true:表头 false:表头+明细 默认为false 默认值：false |
| code | string | 否 | 否 | 单据编号 示例： DBDD0003 |
| pageSize | long | 否 | 是 | 每页显示数据数 示例：10 默认值：10 |
| pageIndex | long | 否 | 是 | 当前页数 示例：1 默认值：1 |
| open_vouchdate_begin | string | 否 | 否 | 单据开始日期 示例：2020-09-09 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 单据结束日期 示例：2020-09-25 23:59:59 |
| inwarehouse | long | 否 | 否 | 调入仓库id |
| bustype | string | 否 | 否 | 交易类型id 示例：110000000000037 |
| outorg | string | 否 | 否 | 调出组织id 示例：1513866252718336 |
| inorg | string | 否 | 否 | 调入组织id 示例：1520919005434112 |
| outwarehouse | long | 否 | 否 | 调出仓库id 示例：1538112225530112 |
| outdepartment | string | 是 | 否 | 调出部门id |
| indepartment | string | 是 | 否 | 调入部门id |
| outbizperson | string | 否 | 否 | 调出业务员id |
| inbizperson | string | 否 | 否 | 调入业务员id |
| status | string | 否 | 否 | 单据状态（0：开立，1：已审核，2：已关闭，3：审核中） |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| value1 | string | 否 | 否 | 值1(条件) |
| value2 | string | 否 | 否 | 值2(条件) |
| field | string | 否 | 否 | 属性名（例：code，vouchdate，status，inwarehouse，operator，bustype，outorg，inorg，outwarehouse，outdepartment，outbizperson，indepartment，inbizperson） |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) |

## 3. 请求示例

Url: /yonbip/scm/transferapply/list?access_token=访问令牌
Body: {
	"isSum": true,
	"code": " DBDD0003",
	"pageSize": 10,
	"pageIndex": 1,
	"open_vouchdate_begin": "2020-09-09 00:00:00",
	"open_vouchdate_end": "2020-09-25 23:59:59",
	"inwarehouse": 0,
	"bustype": "110000000000037",
	"outorg": "1513866252718336",
	"inorg": "1520919005434112",
	"outwarehouse": 1538112225530112,
	"outdepartment": [
		""
	],
	"indepartment": [
		""
	],
	"outbizperson": "",
	"inbizperson": "",
	"status": "",
	"simpleVOs": [
		{
			"value1": "",
			"value2": "",
			"field": "",
			"op": ""
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| sumRecordList | object | 是 | 数据求和集合 |
| pageIndex | int | 否 | 当前页 |
| pageSize | int | 否 | 分页大小 |
| pageCount | int | 否 | 页数 |
| beginPageIndex | int | 否 | 查询开始页码 |
| endPageIndex | int | 否 | 查询结束页 |
| recordCount | int | 否 | 总记录数 |
| pubts | string | 否 | 时间戳字符串 |
| recordList | object | 是 | 返回结果对象 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"sumRecordList": [
			{
				"natMoney": "",
				"qty": "",
				"subQty": "",
				"finishoutqty": ""
			}
		],
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"transferApplys_productsku": "",
				"transferApplys_unit": "",
				"transferApplys_product": "",
				"vouchdate": "",
				"code": "",
				"outstore": "",
				"outstore_name": "",
				"inwarehouse": "",
				"inwarehouse_name": "",
				"instore": "",
				"instore_name": "",
				"bustype": "",
				"bustype_name": "",
				"status": "",
				"operator": "",
				"operator_name": "",
				"memo": "",
				"headItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": ""
				},
				"creator": "",
				"exchangestatus": "",
				"createTime": "",
				"modifier": "",
				"modifyTime": "",
				"auditor": "",
				"auditTime": "",
				"auditDate": "",
				"id": "",
				"pubts": "",
				"tplid": "",
				"breturn": true,
				"outwarehouse": "",
				"outwarehouse_name": "",
				"merchant": "",
				"merchant_name": "",
				"outorg": "",
				"outorg_name": "",
				"outaccount": "",
				"outaccount_name": "",
				"outdepartment": "",
				"outdepartment_name": "",
				"outbizperson": "",
				"outbizperson_name": "",
				"inorg": "",
				"inorg_name": "",
				"inaccount": "",
				"inaccount_name": "",
				"indepartment": "",
				"indepartment_name": "",
				"inbizperson": "",
				"inbizperson_name": "",
				"cust": "",
				"cust_name": "",
				"vendor": "",
				"vendor_name": "",
				"taxRate": "",
				"currency": "",
				"currency_moneyDigit": "",
				"currency_priceDigit": "",
				"currency_name": "",
				"natCurrency": "",
				"natCurrency_moneyDigit": "",
				"natCurrency_priceDigit": "",
				"natCurrency_name": "",
				"exchRate": "",
				"payAgreement": "",
				"payAgreement_name": "",
				"accountDate": "",
				"maturityDate": "",
				"accountDays": "",
				"srcBillType": "",
				"totalQuantity": "",
				"totalPieces": "",
				"dplanshipmentdate": "",
				"dplanarrivaldate": "",
				"receiver": "",
				"receivemobile": "",
				"receiveaddr": "",
				"receivezipcode": "",
				"isWfControlled": true,
				"verifystate": "",
				"returncount": "",
				"closer": "",
				"closeTime": "",
				"product_cCode": "",
				"product_cName": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"propertiesValue": "",
				"batchno": "",
				"invaliddate": "",
				"qty": 0,
				"finishoutqty": 0,
				"unitName": "",
				"transferApplys_id": 0,
				"subQty": 0,
				"stockUnitId": "",
				"stockUnit_name": "",
				"project": "",
				"project_code": "",
				"source": "",
				"project_name": "",
				"natUnitPrice": 0,
				"natMoney": 0,
				"unit_Precision": "",
				"stockUnitId_Precision": "",
				"bodyItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": "",
					"define6": "",
					"define7": "",
					"define8": "",
					"define9": "",
					"define10": "",
					"define11": "",
					"define12": "",
					"define13": "",
					"define14": "",
					"define15": "",
					"define16": "",
					"define17": "",
					"define18": "",
					"define19": "",
					"define20": "",
					"define21": "",
					"define22": "",
					"define23": "",
					"define24": "",
					"define25": "",
					"define26": "",
					"define27": "",
					"define28": "",
					"define29": "",
					"define30": "",
					"define31": "",
					"define32": "",
					"define33": "",
					"define34": "",
					"define35": "",
					"define36": "",
					"define37": "",
					"define38": "",
					"define39": "",
					"define40": "",
					"define41": "",
					"define42": "",
					"define43": "",
					"define44": "",
					"define45": "",
					"define46": "",
					"define47": "",
					"define48": "",
					"define49": "",
					"define50": "",
					"define51": "",
					"define52": "",
					"define53": "",
					"define54": "",
					"define55": "",
					"define56": "",
					"define57": "",
					"define58": "",
					"define59": "",
					"define60": ""
				},
				"out_sys_id": "",
				"out_sys_code": "",
				"out_sys_version": "",
				"out_sys_type": "",
				"out_sys_rowno": "",
				"out_sys_lineid": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	根据返回结果检查，再调用即可


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

