---
title: "采购入库详情查询"
apiId: "1b4715d9a60442108fa0602789007507"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Purchase Receipt"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Receipt]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购入库详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Purchase Receipt (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/purinrecord/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID |

## 3. 请求示例

Url: /yonbip/scm/purinrecord/detail?access_token=访问令牌&id=

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
| id | long | 否 | 主表ID |
| org | string | 否 | 收货组织id |
| purchaseOrg | string | 否 | 采购组织id |
| accountOrg | string | 否 | 会计主体id |
| inInvoiceOrg | string | 否 | 收票组织id |
| org_name | string | 否 | 收货组织名称 |
| accountOrg_name | string | 否 | 会计主体名称 |
| purchaseOrg_name | string | 否 | 采购组织名称 |
| inInvoiceOrg_name | string | 否 | 收票组织名称 |
| code | string | 否 | 单据编号 |
| vouchdate | string | 否 | 单据日期 |
| bustype | string | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| store | string | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| warehouse | long | 否 | 仓库id |
| warehouse_iSerialManage | string | 否 | 仓库是否序列号严格管理 |
| warehouse_isGoodsPosition | string | 否 | 仓库是否货位管理 |
| warehouse_name | string | 否 | 仓库名称 |
| vendor | string | 否 | 供应商id |
| vendor_name | string | 否 | 供应商名称 |
| invoiceVendor | string | 否 | 开票供应商id |
| invoiceVendor_name | string | 否 | 开票供应商名称 |
| department | string | 否 | 部门id |
| department_name | string | 否 | 部门名称 |
| paymentagrement | string | 否 | 付款协议档案 |
| paymentagrement_code | string | 否 | 付款协议档案编码 |
| currency | string | 否 | 币种id |
| currency_code | string | 否 | 币种编码 |
| currency_priceDigit | string | 否 | 币种单价精度 |
| currency_moneyDigit | string | 否 | 币种金额精度 |
| tradeRouteID | long | 否 | 贸易路径id |
| natCurrency | string | 否 | 本币id |
| tradeRoute_name | string | 否 | 贸易路径 |
| natCurrency_code | string | 否 | 本币编码 |
| tradeRouteLineno | string | 否 | 站点 |
| natCurrency_priceDigit | int | 否 | 本币单价精度 |
| natCurrency_moneyDigit | int | 否 | 本币金额精度 |
| isEndTrade | short | 否 | 是否末级(0:否,1:是) |
| currency_name | string | 否 | 币种名称 |
| natCurrency_name | string | 否 | 本币名称 |
| exchRateType | string | 否 | 汇率类型IDid |
| exchRateType_name | string | 否 | 汇率类型名称 |
| exchRateType_digit | string | 否 | 汇率类型精度 |
| exchRate | int | 否 | 汇率 |
| taxRate | string | 否 | 税率 |
| vendor_taxrate | string | 否 | 税率 |
| contact | string | 否 | 联系人 |
| contactTel | string | 否 | 联系人电话 |
| operator | string | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| stockMgr | string | 否 | 库管员IDid |
| stockMgr_name | string | 否 | 库管员名称 |
| paymentsum | int | 否 | 付款金额 |
| payor | string | 否 | 付款人id |
| payor_name | string | 否 | 付款人名称 |
| paytime | string | 否 | 付款时间 |
| paymentstatus | int | 否 | 付款状态, 0:未完成、1:完成、 |
| status | int | 否 | 单据状态, 0:开立、1:已审核、3:审核中 |
| isBeginning | string | 否 | 期初标识, true:是、false:否、 |
| memo | string | 否 | 备注 |
| totalQuantity | int | 否 | 整单数量 |
| moneysum | int | 否 | 金额 |
| orisum | int | 否 | 含税金额 |
| orimoney | int | 否 | 无税金额 |
| tax | int | 否 | 税额 |
| srcBill | string | 否 | 来源单据id |
| srcBillNO | int | 否 | 来源单据号 |
| printCount | int | 否 | 打印次数 |
| custom | long | 否 | 客户id |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| tplid | string | 否 | 模板id |
| totalPieces | int | 否 | 整单件数 |
| printer | string | 否 | 打印人 |
| printTime | string | 否 | 打印时间 |
| isInvBack | string | 否 | 红票标识 |
| payAgreement | string | 否 | 立账规则id |
| payAgreement_name | string | 否 | 立账规则名称 |
| bizFlow | string | 否 | 流程IDid |
| bizFlow_name | string | 否 | 流程名称 |
| bmake_st_purinvoice | string | 否 | 流程蓝票 |
| bmake_st_purinvoice_red | string | 否 | 流程红票 |
| isFlowCoreBill | string | 否 | 是否流程核心单据 |
| bizFlow_version | string | 否 | 版本信息 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 修改日期 |
| auditor | string | 否 | 提交人 |
| auditTime | string | 否 | 提交时间 |
| auditDate | string | 否 | 提交日期 |
| creatorId | string | 否 | 创建人id |
| auditorId | string | 否 | 审批人id |
| modifierId | string | 否 | 修改人id |
| purInRecords | object | 是 | 采购入库单子表[st.purinrecord.PurInRecords] |
| out_sys_id | string | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 外部来源类型 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": 0,
		"org": "",
		"purchaseOrg": "",
		"accountOrg": "",
		"inInvoiceOrg": "",
		"org_name": "",
		"accountOrg_name": "",
		"purchaseOrg_name": "",
		"inInvoiceOrg_name": "",
		"code": "",
		"vouchdate": "",
		"bustype": "",
		"bustype_name": "",
		"store": "",
		"store_name": "",
		"warehouse": 0,
		"warehouse_iSerialManage": "",
		"warehouse_isGoodsPosition": "",
		"warehouse_name": "",
		"vendor": "",
		"vendor_name": "",
		"invoiceVendor": "",
		"invoiceVendor_name": "",
		"department": "",
		"department_name": "",
		"paymentagrement": "",
		"paymentagrement_code": "",
		"currency": "",
		"currency_code": "",
		"currency_priceDigit": "",
		"currency_moneyDigit": "",
		"tradeRouteID": 0,
		"natCurrency": "",
		"tradeRoute_name": "",
		"natCurrency_code": "",
		"tradeRouteLineno": "",
		"natCurrency_priceDigit": 0,
		"natCurrency_moneyDigit": 0,
		"isEndTrade": 0,
		"currency_name": "",
		"natCurrency_name": "",
		"exchRateType": "",
		"exchRateType_name": "",
		"exchRateType_digit": "",
		"exchRate": 0,
		"taxRate": "",
		"vendor_taxrate": "",
		"contact": "",
		"contactTel": "",
		"operator": "",
		"operator_name": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"paymentsum": 0,
		"payor": "",
		"payor_name": "",
		"paytime": "",
		"paymentstatus": 0,
		"status": 0,
		"isBeginning": "",
		"memo": "",
		"totalQuantity": 0,
		"moneysum": 0,
		"orisum": 0,
		"orimoney": 0,
		"tax": 0,
		"srcBill": "",
		"srcBillNO": 0,
		"printCount": 0,
		"custom": 0,
		"pubts": "",
		"tplid": "",
		"totalPieces": 0,
		"printer": "",
		"printTime": "",
		"isInvBack": "",
		"payAgreement": "",
		"payAgreement_name": "",
		"bizFlow": "",
		"bizFlow_name": "",
		"bmake_st_purinvoice": "",
		"bmake_st_purinvoice_red": "",
		"isFlowCoreBill": "",
		"bizFlow_version": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"creatorId": "",
		"auditorId": "",
		"modifierId": "",
		"purInRecords": [
			{
				"mainid": "",
				"id": "",
				"isSerialNoManage": "",
				"rowno": 0,
				"realProductAttribute": "",
				"realProductAttributeType": "",
				"virtualProductAttribute": "",
				"product": "",
				"product_cCode": "",
				"product_cName": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"product_model": "",
				"modelDescription": "",
				"propertiesValue": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"batchno": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"producedate": "",
				"invaliddate": "",
				"totalOutStockSubQty": 0,
				"totalOutStockQuantity": 0,
				"qty": 0,
				"unit": 0,
				"unit_Precision": "",
				"unit_name": "",
				"unit_code": "",
				"invExchRate": 0,
				"unitExchangeType": 0,
				"subQty": 0,
				"stockUnitId": "",
				"stockUnitId_Precision": "",
				"stockUnit_code": "",
				"stockUnit_name": "",
				"goodsposition": "",
				"goodsposition_cName": "",
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"unitExchangeTypePrice": 0,
				"priceQty": 0,
				"priceUOM_name": "",
				"invPriceExchRate": 0,
				"priceUOM_Precision": "",
				"priceUOM_code": "",
				"priceUOM": "",
				"product_oUnitId": "",
				"product_productOfflineRetail_storeOrderUnit": "",
				"productOfflineRetail_orderConversionRate": 0,
				"product_primeCosts": 0,
				"productsku_primeCosts": 0,
				"isGiftProduct": "",
				"oriUnitPrice": 0,
				"oriTaxUnitPrice": 0,
				"oriMoney": 0,
				"oriSum": 0,
				"oriTax": 0,
				"taxRate": "",
				"natUnitPrice": 0,
				"natTaxUnitPrice": 0,
				"natMoney": 0,
				"natSum": 0,
				"natTax": 0,
				"autoCalcCost": "",
				"costMoney": 0,
				"costUnitPrice": 0,
				"aprice": 0,
				"amoney": 0,
				"maxLimitPrice": 0,
				"memo": "",
				"totalBillOriSum": 0,
				"totalBillNatSum": 0,
				"billSubQty": 0,
				"billqty": 0,
				"sqty": 0,
				"smoney": 0,
				"sfee": 0,
				"sumamoney": 0,
				"sdate": "",
				"recorddate": "",
				"project": "",
				"project_code": "",
				"project_name": "",
				"makeRuleCode": "",
				"sourceid": "",
				"sourceautoid": 0,
				"poid": "",
				"podetailid": "",
				"firstsourceid": "",
				"firstsourceautoid": "",
				"source": "",
				"upcode": "",
				"firstsource": "",
				"pocode": "",
				"firstupcode": "",
				"pubts": "",
				"purInRecordsSNs": {
					"id": 0,
					"sn": "",
					"pubts": ""
				},
				"out_sys_rowno": "",
				"out_sys_lineid": "",
				"tradeRoute_name": "",
				"tradeRouteID": 0,
				"tradeRouteLineno": "",
				"isEndTrade": 0,
				"collaborationPoid": 0,
				"collaborationPocode": "",
				"collaborationPodetailid": 0,
				"collaborationPolineno": "",
				"coUpcode": "",
				"coSourceLineNo": "",
				"coSourceid": 0,
				"coSourceautoid": 0,
				"collaborationSource": "",
				"coSourceType": ""
			}
		],
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": ""
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

