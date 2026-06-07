---
title: "采购入库列表查询"
apiId: "3f6ee57a6bcc435dad3c91b7d1a06dcd"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Receipt"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Receipt]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购入库列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Receipt (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purinrecord/list

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
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| code | string | 否 | 否 | 单据编号 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| bustype_name | string | 否 | 否 | 交易类型，需传入交易类型id |
| warehouse_name | string | 否 | 否 | 仓库，需传入仓库名称 |
| vendor_name | string | 否 | 否 | 供应商，需传入供应商名称 |
| org_id | string | 是 | 否 | 库存组织id |
| org_name | string | 否 | 否 | 库存组织名称 |
| org_code | string | 是 | 否 | 库存组织编码 |
| purchaseOrg_name | string | 是 | 否 | 采购组织，需传入采购组织id |
| inInvoiceOrg_name | string | 是 | 否 | 收票组织，需传入收票组织id |
| stockMgr_name | string | 是 | 否 | 库管员，需传入库管员id |
| operator_name | string | 是 | 否 | 业务员，需传入业务员id |
| department_name | string | 是 | 否 | 部门，需传部门id |
| project_name | string | 是 | 否 | 项目，需传入项目id |
| product.productClass.name | long | 是 | 否 | 物料分类，需传入物料分类id |
| pocode | string | 否 | 否 | 源头单据编码 |
| product_cName | long | 是 | 否 | 物料，需传入物料id |
| open_vouchdate_begin | string | 否 | 否 | 开始时间，日期格式：YYYY-MM-DD |
| open_vouchdate_end | string | 否 | 否 | 结束时间，日期格式：YYYY-MM-DD |
| isSum | boolean | 否 | 否 | 查询表头 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件传属性的名称，如仓库编码warehouse.code、时间戳pubts、物料编码purInRecords.product.cCode、表头自定义项headItem.define1、表体自定义项purInRecords.bodyItem.define1等) |
| op | string | 否 | 否 | 比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 ) |
| value1 | string | 否 | 否 | 值1(条件) |
| value2 | string | 否 | 否 | 值2(条件) |

## 3. 请求示例

Url: /yonbip/scm/purinrecord/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"code": "",
	"pageSize": 0,
	"bustype_name": "",
	"warehouse_name": "",
	"vendor_name": "",
	"org_id": [
		""
	],
	"org_name": "",
	"org_code": [
		""
	],
	"purchaseOrg_name": [
		""
	],
	"inInvoiceOrg_name": [
		""
	],
	"stockMgr_name": [
		""
	],
	"operator_name": [
		""
	],
	"department_name": [
		""
	],
	"project_name": [
		""
	],
	"product.productClass.name": [
		0
	],
	"pocode": "",
	"product_cName": [
		0
	],
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"isSum": false,
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
| pageSize | int | 否 | 当前页数 |
| pageCount | int | 否 | 页面数 |
| beginPageIndex | int | 否 | 开始页码（第一页） |
| endPageIndex | int | 否 | 结束页码（有多少页） |
| recordCount | int | 否 | 总数 |
| pubts | string | 否 | 时间戳字符串 |
| recordList | object | 是 | 返回结果对象 |
| sumRecordList | object | 否 | 合计对象 |
| totalQuantity | double | 否 | 整单数量 |
| totalPieces | double | 否 | 整单件数 |
| subQty | double | 否 | 件数 |
| currency | string | 否 | 币种id |
| paymentsum | double | 否 | 付款金额 |
| sfee | double | 否 | 累计结算费用 |
| unit_Precision | int | 否 | 主计量精度 |
| currency_priceDigit | int | 否 | 币种单价精度 |
| priceUOM_Precision | int | 否 | 计价单位精度 |
| moneysum | double | 否 | 金额 |
| oriMoney | double | 否 | 无税金额 |
| oriSum | double | 否 | 含税金额 |
| stockUnitId_Precision | int | 否 | 库存单位精度 |
| qty | int | 否 | 数量 |
| purInRecords_unit | long | 否 | 计量单位 |
| natCurrency | string | 否 | 本币币种id |
| natCurrency_moneyDigit | int | 否 | 本币金额精度 |
| unpaymentsum | double | 否 | 未付款金额 |
| smoney | double | 否 | 累计结算金额 |
| sqty | double | 否 | 累计结算数量 |
| natCurrency_priceDigit | int | 否 | 本币单价精度 |
| purInRecords_stockUnitId | string | 否 | 库存单位 |
| purInRecords_priceUOM | long | 否 | 计价单位 |
| oriTax | double | 否 | 税额 |
| currency_moneyDigit | int | 否 | 币种金额精度 |
| billqty | double | 否 | 累计开票数量 |

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
				"bustype_name": "",
				"vendor_name": "",
				"warehouse_name": "",
				"vendor_code": "",
				"warehouse_code": "",
				"stockMgr_name": "",
				"status": 0,
				"purchaseOrg_name": "",
				"department_name": "",
				"org_code": "",
				"org_name": "",
				"department_code": "",
				"operator_name": "",
				"totalQuantity": 0,
				"totalPieces": 0,
				"inInvoiceOrg_name": "",
				"inInvoiceOrg": "",
				"accountOrg": "",
				"isBeginning": true,
				"bustype": "",
				"vendor": 0,
				"contact": "",
				"warehouse": 0,
				"operator": 0,
				"purchaseOrg": "",
				"org": "",
				"department": "",
				"stockMgr": "",
				"moneysum": 0,
				"paymentsum": 0,
				"unpaymentsum": 0,
				"store": "",
				"store_name": "",
				"custom": 0,
				"payor": "",
				"payor_name": "",
				"paytime": "",
				"paymentstatus": "",
				"creator": "",
				"createTime": "",
				"modifier": "",
				"modifyTime": "",
				"auditor": "",
				"auditTime": "",
				"memo": "",
				"id": "",
				"srcBill": "",
				"pubts": "",
				"tplid": 0,
				"exchangestatus": "",
				"purInRecords_id": "",
				"product": "",
				"product_cCode": "",
				"product_cName": "",
				"productsku": "",
				"tradeRoute_name": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"productClass_code": "",
				"propertiesValue": "",
				"batchno": "",
				"invaliddate": "",
				"producedate": "",
				"unit": "",
				"qty": 0,
				"unit_code": "",
				"unit_name": "",
				"subQty": 0,
				"stockUnit_name": "",
				"project_code": "",
				"project_name": "",
				"oriUnitPrice": 0,
				"oriTaxUnitPrice": 0,
				"oriMoney": 0,
				"oriSum": 0,
				"oriTax": 0,
				"taxRate": 0,
				"billqty": 0,
				"billSubQty": 0,
				"sqty": 0,
				"smoney": 0,
				"sfee": 0,
				"totalBillOriSum": 0,
				"priceUOM": 0,
				"priceUOM_Code": "",
				"priceUOM_Name": "",
				"natCurrency_priceDigit": 0,
				"natCurrency_moneyDigit": 0,
				"currency_priceDigit": 0,
				"currency_moneyDigit": 0,
				"unit_Precision": 0,
				"priceUOM_Precision": 0,
				"stockUnitId_Precision": 0,
				"isGiftProduct": true,
				"bmake_st_purinvoice_red": "",
				"bmake_st_purinvoice": "",
				"bizFlow": "",
				"bizFlow_version": "",
				"isFlowCoreBill": "",
				"out_sys_id": "",
				"out_sys_code": "",
				"out_sys_version": "",
				"out_sys_type": "",
				"out_sys_rowno": "",
				"out_sys_lineid": "",
				"tradeRouteID": 0,
				"isEndTrade": 0,
				"tradeRouteLineno": "",
				"collaborationPolineno": "",
				"coSourceType": "",
				"coUpcode": "",
				"coSourceLineNo": "",
				"coSourceid": "",
				"coSourceautoid": 0,
				"collaborationPodetailid": 0,
				"collaborationPocode": "",
				"collaborationPoid": 0,
				"collaborationSource": "",
				"totalOutStockQuantity": 0
			}
		]
	},
	"sumRecordList": {
		"totalQuantity": 0,
		"totalPieces": 0,
		"subQty": 0,
		"currency": "",
		"paymentsum": 0,
		"sfee": 0,
		"unit_Precision": 0,
		"currency_priceDigit": 0,
		"priceUOM_Precision": 0,
		"moneysum": 0,
		"oriMoney": 0,
		"oriSum": 0,
		"stockUnitId_Precision": 0,
		"qty": 0,
		"purInRecords_unit": 0,
		"natCurrency": "",
		"natCurrency_moneyDigit": 0,
		"unpaymentsum": 0,
		"smoney": 0,
		"sqty": 0,
		"natCurrency_priceDigit": 0,
		"purInRecords_stockUnitId": "",
		"purInRecords_priceUOM": 0,
		"oriTax": 0,
		"currency_moneyDigit": 0,
		"billqty": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-05

更新

返回参数 (21)

采购入库列表查询，simpleVO支持传入期初标识


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

