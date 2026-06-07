---
title: "委外入库列表查询"
apiId: "a321db2a1d7f4e4ba4859f28a57a9da6"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontracting Receipt Doc"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontracting Receipt Doc]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外入库列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Subcontracting Receipt Doc (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/osminrecord/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| isSum | boolean | 否 | 否 | 是否按照表头查询 true:表头 false:表头+明细 默认为false 默认值：false |
| code | string | 否 | 否 | 单据编号 示例：OSMI20220317000001 |
| pageSize | int | 否 | 是 | 每页显示数据数 示例：20 默认值：20 |
| pageIndex | int | 否 | 是 | 当前页数 示例：1 默认值：1 |
| open_vouchdate_begin | string | 否 | 否 | 单据开始日期 示例：2022-03-17 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 单据结束日期 示例：2022-03-21 00:00:00 |
| status | string | 否 | 否 | 单据状态，0 开立 1已审核 3 审核中 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件传属性的名称，如单据编号code、单据日期vouchdate、收货组织org.code、委外组织osmOrg.code、收票组织inInvoiceOrg.code、委外供应商vendor.code、仓库编码warehouse.code、物料编码osmInRecords.product.cCode、物料分类osmInRecords.product.manageClass.code、物料SKU编码osmInRecords.productsku.cCode等) |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) |
| value1 | string | 否 | 否 | 值1(条件) |
| value2 | string | 否 | 否 | 值2(条件) |

## 3. 请求示例

Url: /yonbip/scm/osminrecord/list?access_token=访问令牌
Body: {
	"isSum": true,
	"code": "OSMI20220317000001",
	"pageSize": 20,
	"pageIndex": 1,
	"open_vouchdate_begin": "2022-03-17 00:00:00",
	"open_vouchdate_end": "2022-03-21 00:00:00",
	"status": "",
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
| code | string | 否 | 返回码，调用成功时返回200。 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 当前页 |
| pageSize | int | 否 | 每页显示数据数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页 |
| endPageIndex | int | 否 | 结束页 |
| recordCount | long | 否 | 总记录数 |
| recordList | object | 是 | 返回结果对象 |

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
		"recordList": [
			{
				"osmInRecords_productionType": 0,
				"vendor_code": "",
				"oriTax": 0,
				"pocode": "",
				"product_cCode": "",
				"invoiceVendor": 0,
				"sfee": 0,
				"priceUOM_Precision": 0,
				"memo": "",
				"stockStatusDoc_name": "",
				"priceUOM_Code": "",
				"totalQuantity": 0,
				"natCurrency": "",
				"taxitems_name": "",
				"stockUnitId_Precision": 0,
				"costMoney": 0,
				"id": 0,
				"tplid": 0,
				"isWfControlled": true,
				"natSum": 0,
				"warehouse": 0,
				"isAutomaticVerify": true,
				"warehouse_name": "",
				"auditTime": "",
				"natCurrency_priceDigit": 0,
				"exchRateType": "",
				"billqty": 0,
				"invExchRate": 0,
				"status": 0,
				"isGiftProduct": true,
				"returncount": 0,
				"verifystate": 0,
				"invoicingDocEntryAndMgmt": "",
				"isVerification": 0,
				"currency_moneyDigit": 0,
				"warehouse_code": "",
				"stockStatusDoc": 0,
				"productsku_cName": "",
				"osmOrg_name": "",
				"vouchdate": "",
				"receiptDocEntryAndMgmt": "",
				"natCurrency_name": "",
				"invoiceVendor_name": "",
				"invPriceExchRate": 0,
				"vendor": 0,
				"sqty": 0,
				"currency": "",
				"pubts": "",
				"smoney": 0,
				"org_name": "",
				"isFlowCoreBill": true,
				"auditDate": "",
				"creator": "",
				"product": 0,
				"oriSum": 0,
				"inInvoiceOrg_name": "",
				"exchRateType_name": "",
				"department_name": "",
				"auditor": "",
				"accountOrg": "",
				"priceQty": 0,
				"createTime": "",
				"natMoney": 0,
				"taxitems_code": "",
				"department_code": "",
				"osmInRecords_osmType": 0,
				"currency_priceDigit": 0,
				"stockUnit_name": "",
				"isBeginning": true,
				"bustype_name": "",
				"modifier": "",
				"natTax": 0,
				"source": "",
				"srcBill": "",
				"subQty": 0,
				"modifyTime": "",
				"inInvoiceOrg": "",
				"product_cName": "",
				"vendor_name": "",
				"oriUnitPrice": 0,
				"barCode": "",
				"unit_name": "",
				"taxRate": 0,
				"unit": 0,
				"productsku": 0,
				"productsku_cCode": "",
				"natCurrency_moneyDigit": 0,
				"accountOrg_name": "",
				"qty": 0,
				"unit_Precision": 0,
				"oriTaxUnitPrice": 0,
				"oriMoney": 0,
				"contactsPieces": 0,
				"contactsQuantity": 0,
				"natUnitPrice": 0,
				"code": "",
				"exchRate": 0,
				"osmInRecords_id": 0,
				"priceUOM": 0,
				"department": "",
				"currency_name": "",
				"org": "",
				"custom": 0,
				"osmOrg": "",
				"bustype": "",
				"costUnitPrice": 0,
				"upcode": "",
				"priceUOM_Name": "",
				"taxitems": "",
				"natTaxUnitPrice": 0,
				"unDeductTaxRate": 0,
				"unDeductTax": 0,
				"oriUnDeductTax": 0,
				"bodyItem": {
					"define1": ""
				},
				"headItem": {
					"define1": ""
				},
				"osmInRecords": {
					"opSn": 0,
					"operationId": 0,
					"endOp": true,
					"sourcePoOrderCode": "",
					"sourcePoOrderProductRowno": "",
					"sourcePoOrderId": 0,
					"sourcePoOrderProductId": 0
				},
				"costAccountingMethod": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


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

