---
title: "调入单列表查询"
apiId: "2af9e71795b844559af43d255ce90e37"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer-in Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer-in Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 调入单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Transfer-in Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storein/list

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
| code | string | 否 | 否 | 单据编号 |
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| srcBillNO | string | 否 | 否 | 调出单号 |
| breturn | string | 否 | 否 | 调拨退货, true:是、false:否、 |
| bustype_name | string | 否 | 否 | 交易类型id |
| inorg_name | string | 否 | 否 | 调入组织id |
| inwarehouse_name | long | 否 | 否 | 调入仓库id |
| indepartment_name | string | 是 | 否 | 调入部门id |
| inbizperson_name | string | 否 | 否 | 调入业务员id |
| inStorekeeper_name | string | 否 | 否 | 调入库管员id |
| outorg_name | string | 否 | 否 | 调出组织id |
| outwarehouse_name | long | 否 | 否 | 调出仓库id |
| productClass | long | 是 | 否 | 物料分类id |
| product | long | 是 | 否 | 物料id |
| outStore_name | string | 否 | 否 | 调出门店名称 |
| inStore_name | string | 否 | 否 | 调入门店名称 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名（例：vouchdate，pubts） |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) |
| value1 | string | 否 | 否 | 值1（条件） |
| value2 | string | 否 | 否 | 值2（条件） |

## 3. 请求示例

Url: /yonbip/scm/storein/list?access_token=访问令牌
Body: {
	"isSum": true,
	"code": "",
	"pageIndex": 0,
	"pageSize": 0,
	"srcBillNO": "",
	"breturn": "",
	"bustype_name": "",
	"inorg_name": "",
	"inwarehouse_name": 0,
	"indepartment_name": [
		""
	],
	"inbizperson_name": "",
	"inStorekeeper_name": "",
	"outorg_name": "",
	"outwarehouse_name": 0,
	"productClass": [
		0
	],
	"product": [
		0
	],
	"outStore_name": "",
	"inStore_name": "",
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
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
| pageIndex | int | 否 | 当前页数 |
| pageSize | int | 否 | 每页显示数据行数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页数 |
| endPageIndex | int | 否 | 结束页数 |
| recordCount | int | 否 | 总行数 |
| pubts | string | 否 | 时间戳 |
| recordList | object | 是 | 数据集合 |
| sumRecordList | object | 是 | 汇总信息 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"recordList": [
			{
				"vouchdate": "",
				"code": "",
				"outstore": "",
				"outstore_name": "",
				"outwarehouse": "",
				"outwarehouse_name": "",
				"inStore": "",
				"inStore_name": "",
				"inwarehouse": "",
				"inwarehouse_name": "",
				"bustype": "",
				"bustype_name": "",
				"status": "",
				"totalQuantity": 0,
				"exchangestatus": "",
				"operator": "",
				"srcbillno": "",
				"operator_name": "",
				"memo": "",
				"srcbill": "",
				"creator": "",
				"createTime": "",
				"createDate": "",
				"modifier": "",
				"modifyTime": "",
				"modifyDate": "",
				"auditor": "",
				"auditTime": "",
				"auditDate": "",
				"id": "",
				"pubts": "",
				"tplid": "",
				"headItem": {
					"id": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": ""
				},
				"breturn": "",
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
				"inStorekeeper": "",
				"inStorekeeper_name": "",
				"totalPieces": 0,
				"product_cCode": "",
				"product_cName": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"propertiesValue": "",
				"batchno": "",
				"invaliddate": "",
				"allTotalInternalUnit": 0,
				"qty": 0,
				"unitName": "",
				"subQty": 0,
				"stockUnit_name": "",
				"project_code": "",
				"project_name": "",
				"natUnitPrice": 0,
				"natMoney": 0,
				"unit_Precision": "",
				"stockUnitId_Precision": "",
				"details_id": 0,
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
				"details_stockUnitId": 0,
				"firstsource": "",
				"firstupcode": "",
				"status_mobile_row": 0,
				"details_unit": 0,
				"financeOrg_currency": "",
				"srcBillType": "",
				"barCode": "",
				"contactsPieces": 0,
				"invExchRate": 0,
				"contactsQuantity": 0,
				"bizType": 0,
				"details_productsku": 0,
				"isBulkConver": true,
				"upcode": "",
				"details_product": "",
				"status_mobile": 0,
				"product_model": "",
				"product_modelDescription": "",
				"product_defaultAlbumId": "",
				"pickreqAutoid": 0,
				"pickreqId": 0,
				"expireDateNo": "",
				"producedate": "",
				"expireDateUnit": "",
				"store": 0,
				"details_project": 0,
				"natCurrency_priceDigit": "",
				"natCurrency_moneyDigit": "",
				"expenseNatSum": 0,
				"expenseNatMoney": 0,
				"details_expenseNatSum": 0,
				"details_expenseNatMoney": 0,
				"details_sfee": 0
			}
		],
		"sumRecordList": [
			{
				"details_stockUnitId": 0,
				"details_unit": 0,
				"natCurrency_moneyDigit": 0,
				"natCurrency_priceDigit": 0,
				"natMoney": 0,
				"qty": 0,
				"stockUnitId_Precision": 0,
				"subQty": 0,
				"unit_Precision": 0
			}
		]
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

