---
title: "采购订单列表查询"
apiId: "b20cfa042e5848309e96c689158c17d1"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购订单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purchaseorder/list

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
| pageIndex | long | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | long | 否 | 是 | 每页数 示例：10 默认值：10 |
| isSum | boolean | 否 | 否 | 查询表头 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 查询条件 |
| field | string | 否 | 否 | 查询字段（条件） 示例：code |
| op | string | 否 | 否 | 比较符：eq：等于、neq：不等于、lt：小于、gt：大于、between：介于、in：包含、nin：不包含、like：模糊匹配、leftlike：左模糊匹配、rightlike：右模糊匹配、is_null：为空、is_not_null：不为空、and：并且、or：或者 示例：eq |
| value1 | string | 否 | 否 | 参数值1 示例：CGA20005000456 |
| queryOrders | object | 是 | 否 | 排序字段 |
| field | string | 否 | 否 | 排序条件字段:必须传实体上有的字段;主表字段查询时字段名(例: id);子表字段查询是子表对象.字段名(例：purchaseOrders.id);参照类型只能传id(例:按物料查询只能传物料id,不能传物料code) 示例：id |
| order | string | 否 | 否 | 顺序：正序(asc)、倒序(desc) 示例：asc |

## 3. 请求示例

Url: /yonbip/scm/purchaseorder/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"isSum": false,
	"simpleVOs": [
		{
			"field": "code",
			"op": "eq",
			"value1": "CGA20005000456"
		}
	],
	"queryOrders": [
		{
			"field": "id",
			"order": "asc"
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
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据项 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 每页数 示例：10 |
| recordCount | long | 否 | 数量 示例：1 |
| recordList | object | 是 | 返回信息 |
| pageCount | long | 否 | 页数 示例：1 |
| beginPageIndex | long | 否 | 起始页 示例：1 |
| endPageIndex | long | 否 | 结束页 示例：1 |
| pubts | string | 否 | 时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-04-23 12:40:06 |

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
				"product_cCode": "00000002",
				"invoiceVendor": 2057714685366528,
				"priceUOM_Precision": 1,
				"modifyStatus": 0,
				"receiveStatus": 1,
				"listOriSum": 1,
				"priceUOM_Code": "001",
				"totalInTaxMoney": 0,
				"totalQuantity": 1,
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"listTotalPayOriMoney": 0,
				"unit_code": "001",
				"id": 2227385816011008,
				"isWfControlled": false,
				"totalArrivedTaxMoney": 0,
				"purchaseOrders_arrivedStatus": 2,
				"bmake_st_purinvoice": true,
				"realProductAttribute": 1,
				"purchaseOrders_inWHStatus": 2,
				"totalSendQty": 0,
				"natCurrency_priceDigit": 6,
				"bmake_st_purinrecord_red": true,
				"status": 0,
				"currency_moneyDigit": 6,
				"listTotalPayApplyAmount": 0,
				"currency_code": "CNY",
				"vouchdate": "2021-04-23 00:00:00",
				"invoiceVendor_name": "达利园供货目录转移专用供应商",
				"vendor": 2057714685366528,
				"purchaseOrders_payStatus": 2,
				"purchaseOrders_warehouse_code": "000001",
				"listOriMoney": 1,
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"pubts": "2021-04-23 11:34:02",
				"org_name": "eflong",
				"generalPurchaseOrderType": "1",
				"isFlowCoreBill": true,
				"creator": "17600880447",
				"product": 1730491724599552,
				"oriSum": 1,
				"inInvoiceOrg_name": "eflong",
				"product_defaultAlbumId": "http://ys-yxy-testres.yonyoucloud.com/fa813c9d-a182-457c-ab2a-a0c40ab113ea.jpg",
				"purchaseOrders_id": 2227385816011009,
				"totalRecieveQty": 0,
				"demandOrg_name": "eflong",
				"createTime": "2021-04-23 11:34:01",
				"purUOM_Precision": 1,
				"currency_priceDigit": 6,
				"bEffectStock": true,
				"inOrg": "1730475987734784",
				"bustype_name": "普通订货-订单开票",
				"purchaseOrders_invPriceExchRate": 1,
				"subQty": 1,
				"inInvoiceOrg": "1730475987734784",
				"product_cName": "eflong-规格1",
				"listTaxRate": 0,
				"bmake_st_purinvoice_red": true,
				"product_model": "型号",
				"storagenum": 0,
				"purchaseOrders_invExchRate": 1,
				"vendor_name": "达利园供货目录转移专用供应商",
				"vendor_code": "0001000101",
				"oriUnitPrice": 1,
				"barCode": "st_purchaseorder|2227385816011008",
				"isContract": false,
				"unit_name": "个",
				"unit": 1730486466924800,
				"purchaseOrders_invoiceStatus": 2,
				"natCurrency_moneyDigit": 6,
				"qty": 1,
				"unit_Precision": 1,
				"oriTaxUnitPrice": 1,
				"moneysum": 1,
				"natCurrency_code": "CNY",
				"product_modelDescription": "说明2",
				"code": "CGA20005000456",
				"demandOrg": "1730475987734784",
				"bizFlow": "f596bd30-aee8-11ea-8d5f-0624d60000dc",
				"realProductAttributeType": 1,
				"priceUOM": 1730486466924800,
				"bizstatus": 0,
				"totalInQty": 0,
				"bizFlow_version": "V1.0",
				"currency_name": "人民币",
				"org": "1730475987734784",
				"bmake_st_purinrecord": true,
				"purchaseOrders_purUOM": 1730486466924800,
				"bustype": "1785637352591616",
				"listOriTax": 0,
				"retailInvestors": false,
				"inOrg_name": "eflong",
				"listTotalPayAmount": 0,
				"priceUOM_Name": "个",
				"listTotalPayNATMoney": 0,
				"approvenum": 0,
				"listdiscountTaxType": "0",
				"bizFlow_name": "普通订货（订单开票）",
				"headItem": {
					"id": 2227385816011008,
					"define46": "红色"
				}
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"pubts": "2021-04-23 12:40:06"
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

