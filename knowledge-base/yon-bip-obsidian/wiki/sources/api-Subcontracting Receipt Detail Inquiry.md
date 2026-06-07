---
title: "委外入库详情查询"
apiId: "514416117fce4a7fad573a26a4152ddc"
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

# 委外入库详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Subcontracting Receipt Doc (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/osminrecord/detail

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 业务数据ID |
| code | string | query | 否 | 单据编码 |

## 3. 请求示例

Url: /yonbip/scm/osminrecord/detail?access_token=访问令牌&id=&code=

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
| currency_priceDigit | long | 否 | 币种单价精度 |
| isBeginning | boolean | 否 | 期初标识，true:是、false:否。 |
| bustype_name | string | 否 | 交易类型 |
| invoiceVendor | long | 否 | 开票供应商ID |
| warehouse_isGoodsPositionStock | boolean | 否 | 仓库货位是否记存量，true:是、false:否 |
| modifier | string | 否 | 最后修改人 |
| modifierId | long | 否 | 修改人id |
| memo | string | 否 | 备注 |
| srcBill | string | 否 | 来源单据id |
| natCurrency | string | 否 | 本币ID |
| totalQuantity | long | 否 | 整单数量 |
| modifyTime | string | 否 | 最后修改时间 |
| inInvoiceOrg | string | 否 | 收票组织ID |
| wmsCancelStatus | long | 否 | WMS取消状态 |
| id | long | 否 | 主表ID |
| bustype_extend_attrs_json | string | 否 | 交易类型扩展字段 |
| tplid | long | 否 | 模板id |
| modifyDate | string | 否 | 最后修改日期 |
| isWfControlled | boolean | 否 | 是否审批流控制， true:是、false:否 |
| vendor_name | string | 否 | 委外供应商 |
| srcBillNO | string | 否 | 来源单据号 |
| warehouse | long | 否 | 仓库id |
| srcBillType | string | 否 | 来源类型，委外订单：po_subcontract_order，委外到货单：po_osm_arrive_order |
| warehouse_countCost | boolean | 否 | 仓库是否计算成本， true:是、false:否 |
| barCode | string | 否 | 单据条码 |
| isAutomaticVerify | boolean | 否 | 是否自动核销， true:是、false:否 |
| warehouse_name | string | 否 | 仓库 |
| auditorId | long | 否 | 审核人ID |
| natCurrency_moneyDigit | long | 否 | 本币金额精度 |
| natCurrency_priceDigit | long | 否 | 本币单价精度 |
| auditTime | string | 否 | 审核时间 |
| accountOrg_name | string | 否 | 会计主体 |
| exchRateType | string | 否 | 汇率类型ID |
| natCurrency_code | string | 否 | 本币编码 |
| isUpdateCost | boolean | 否 | 更新存货成本， true:是、false:否 |
| status | long | 否 | 单据状态，0 开立 1已审核 3 审核中 |
| returncount | long | 否 | 退回次数 |
| verifystate | long | 否 | 审批状态 （0：未提交 1：已提交 2：已审核） |
| currency_moneyDigit | long | 否 | 币种金额精度 |
| invoicingDocEntryAndMgmt | string | 否 | 立账开票依据 |
| code | string | 否 | 单据编号 |
| shop | long | 否 | 商家id |
| creatorId | long | 否 | 创建人id |
| exchRate | long | 否 | 汇率 |
| currency_code | string | 否 | 币种编码 |
| osmOrg_name | string | 否 | 委外组织 |
| vouchdate | string | 否 | 单据日期 |
| natCurrency_name | string | 否 | 本币名称 |
| receiptDocEntryAndMgmt | string | 否 | 入库立账方式，invoicing_confirm_AP：开票确认应付，receipt_confirm_AP：入库确认应付，receipt_estimated_AP：入库暂估应付 |
| invoiceVendor_name | string | 否 | 开票供应商 |
| vendor | long | 否 | 委外供应商id |
| currency | string | 否 | 币种ID |
| warehouse_isGoodsPosition | boolean | 否 | 仓库是否货位管理， true:是、false:否 |
| org_name | string | 否 | 收货组织 |
| department | string | 否 | 委外部门ID |
| pubts | string | 否 | 时间戳 |
| isInvBack | boolean | 否 | 红票标识， true:是、false:否 |
| wmsInStatus | long | 否 | WMS转入状态 |
| exchRateType_digit | long | 否 | 汇率类型精度 |
| isFlowCoreBill | boolean | 否 | 是否流程核心单据， true:是、false:否 |
| createDate | string | 否 | 创建日期 |
| auditDate | string | 否 | 审核日期 |
| creator | string | 否 | 创建人 |
| currency_name | string | 否 | 币种名称 |
| org | string | 否 | 收货组织ID |
| inInvoiceOrg_name | string | 否 | 收票组织 |
| department_name | string | 否 | 委外部门 |
| exchRateType_name | string | 否 | 汇率类型 |
| auditor | string | 否 | 审核人 |
| accountOrg | string | 否 | 会计主体ID |
| osmOrg | string | 否 | 委外组织ID |
| warehouse_iSerialManage | boolean | 否 | 仓库是否序列号严格管理， true:是、false:否 |
| bustype | string | 否 | 业务类型id |
| createTime | string | 否 | 创建时间 |
| osmInRecords | object | 是 | 委外入库单子表[st.osminrecord.OsmInRecords] |
| costAccountingMethod | int | 否 | 委外成本核算方式(0:按委外入库核算成本,1:按委外订单核算成本) |
| specialBizType | string | 否 | 委外特殊业务类型 0:跨组织委外结算，1：跨组织委外入库 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"currency_priceDigit": 0,
		"isBeginning": true,
		"bustype_name": "",
		"invoiceVendor": 0,
		"warehouse_isGoodsPositionStock": true,
		"modifier": "",
		"modifierId": 0,
		"memo": "",
		"srcBill": "",
		"natCurrency": "",
		"totalQuantity": 0,
		"modifyTime": "",
		"inInvoiceOrg": "",
		"wmsCancelStatus": 0,
		"id": 0,
		"bustype_extend_attrs_json": "",
		"tplid": 0,
		"modifyDate": "",
		"isWfControlled": true,
		"vendor_name": "",
		"srcBillNO": "",
		"warehouse": 0,
		"srcBillType": "",
		"warehouse_countCost": true,
		"barCode": "",
		"isAutomaticVerify": true,
		"warehouse_name": "",
		"auditorId": 0,
		"natCurrency_moneyDigit": 0,
		"natCurrency_priceDigit": 0,
		"auditTime": "",
		"accountOrg_name": "",
		"exchRateType": "",
		"natCurrency_code": "",
		"isUpdateCost": true,
		"status": 0,
		"returncount": 0,
		"verifystate": 0,
		"currency_moneyDigit": 0,
		"invoicingDocEntryAndMgmt": "",
		"code": "",
		"shop": 0,
		"creatorId": 0,
		"exchRate": 0,
		"currency_code": "",
		"osmOrg_name": "",
		"vouchdate": "",
		"natCurrency_name": "",
		"receiptDocEntryAndMgmt": "",
		"invoiceVendor_name": "",
		"vendor": 0,
		"currency": "",
		"warehouse_isGoodsPosition": true,
		"org_name": "",
		"department": "",
		"pubts": "",
		"isInvBack": true,
		"wmsInStatus": 0,
		"exchRateType_digit": 0,
		"isFlowCoreBill": true,
		"createDate": "",
		"auditDate": "",
		"creator": "",
		"currency_name": "",
		"org": "",
		"inInvoiceOrg_name": "",
		"department_name": "",
		"exchRateType_name": "",
		"auditor": "",
		"accountOrg": "",
		"osmOrg": "",
		"warehouse_iSerialManage": true,
		"bustype": "",
		"createTime": "",
		"osmInRecords": [
			{
				"product": 0,
				"product_cCode": "",
				"product_cName": "",
				"stockUnit_name": "",
				"oriTax": 0,
				"pocode": "",
				"priceUOM_Precision": 0,
				"sfee": 0,
				"stockStatusDoc_name": "",
				"natTax": 0,
				"source": "",
				"subQty": 0,
				"isExpiryDateManage": true,
				"taxitems_name": "",
				"unit_code": "",
				"stockUnitId_Precision": 0,
				"costMoney": 0,
				"id": 0,
				"mainid": 0,
				"isSerialNoManage": true,
				"productClass": 0,
				"product_oUnitId": 0,
				"oriUnitPrice": 0,
				"realProductAttribute": 0,
				"natSum": 0,
				"isScrap": true,
				"unit_name": "",
				"taxRate": 0,
				"unit": 0,
				"product_productOfflineRetail_storeOrderUnit": 0,
				"productsku": 0,
				"productsku_cCode": "",
				"qty": 0,
				"unit_Precision": 0,
				"podetailid": 0,
				"oriTaxUnitPrice": 0,
				"billqty": 0,
				"stockUnit_code": "",
				"oriMoney": 0,
				"invExchRate": 0,
				"contactsPieces": 0,
				"contactsQuantity": 0,
				"stockUnitId": 0,
				"isGiftProduct": true,
				"natUnitPrice": 0,
				"priceUOM_code": "",
				"autoCalcCost": true,
				"reserveid": 0,
				"amoney": 0,
				"makeRuleCode": "",
				"stockStatusDoc": 0,
				"productionType": 0,
				"productsku_cName": "",
				"realProductAttributeType": 0,
				"priceUOM": 0,
				"invPriceExchRate": 0,
				"isBatchManage": true,
				"sqty": 0,
				"productClassName": "",
				"osmType": 0,
				"smoney": 0,
				"pubts": "",
				"sourceid": 0,
				"rowno": 0,
				"sumamoney": 0,
				"oriSum": 0,
				"priceUOM_name": "",
				"unitExchangeType": 0,
				"aprice": 0,
				"poid": 0,
				"sourceautoid": 0,
				"priceQty": 0,
				"costUnitPrice": 0,
				"upcode": "",
				"taxitems": "",
				"natTaxUnitPrice": 0,
				"natMoney": 0,
				"taxitems_code": "",
				"firstsourceautoid": 0,
				"firstsource": "",
				"firstupcode": "",
				"recorddate": "",
				"unDeductTaxRate": 0,
				"unDeductTax": 0,
				"oriUnDeductTax": 0,
				"osmInRecordsSNs": {
					"id": 0,
					"sn": "",
					"pubts": "",
					"grandpaid": 0,
					"detailid": 0
				},
				"opSn": 0,
				"operationId": 0,
				"endOp": true,
				"sourcePoOrderCode": "",
				"sourcePoOrderProductRowno": "",
				"sourcePoOrderId": 0,
				"sourcePoOrderProductId": 0,
				"bodyParallel": {
					"uitCurrency": "",
					"uitCostUnitPrice": 0,
					"uitCostMoney": 0,
					"uitCostNatUnitPrice": 0,
					"uitCostNatMoney": 0,
					"uitVendor": "",
					"uitExchRate": 0,
					"uitExchRateType": "",
					"uitCurrency_code": "",
					"uitCurrency_name": "",
					"uitExchRateType_name": "",
					"uitVendor_name": "",
					"uitExchRateType_digit": ""
				}
			}
		],
		"costAccountingMethod": 0,
		"specialBizType": ""
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

