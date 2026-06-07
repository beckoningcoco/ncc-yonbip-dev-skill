---
title: "委外入库来源生单保存"
apiId: "6c33a36bf3f241829e03915b47f0763e"
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

# 委外入库来源生单保存

> `ContentType	application/json` 请求方式	POST | 分类: Subcontracting Receipt Doc (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/osminrecord/mergeSourceData/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 委外入库单[st.osminrecord.OsmInRecord] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| mergeSourceData | string | 否 | 是 | 合并上游数据，固定值传入true。 |
| needCalcLines | boolean | 否 | 否 | 表体行计算标识：不传或传入false时不对子表进行二次计算，数量及价格相关从上游带入；为true时，以数量进行件数、计价数量相关反算，金额相关计算依据以参数calcLinesKey为准； |
| calcLinesKey | string | 否 | 否 | 表体行计算依据，不传或传入null时默认原币无税金额（oriMoney），支持传入：oriUnitPrice、oriTaxUnitPrice、oriMoney、oriSum、natUnitPrice、natTaxUnitPrice、natMoney、natSum。作为计算依据的金额类字段，表体中对应参数不可为空。 |
| code | string | 否 | 否 | 单据编号：以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 |
| vouchdate | string | 否 | 是 | 单据日期，日期格式:YYYYMMDD |
| bustype | string | 否 | 是 | 交易类型id，或交易类型code |
| warehouse | string | 否 | 否 | 仓库id，或仓库code；上游单据未指定仓库时必输 |
| memo | string | 否 | 否 | 备注 |
| _status | string | 否 | 是 | 操作标识, Insert:新增 |
| osmInRecords | object | 是 | 是 | 委外入库单子表 |

## 3. 请求示例

Url: /yonbip/scm/osminrecord/mergeSourceData/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"mergeSourceData": "",
		"needCalcLines": true,
		"calcLinesKey": "",
		"code": "",
		"vouchdate": "",
		"bustype": "",
		"warehouse": "",
		"memo": "",
		"_status": "",
		"osmInRecords": [
			{
				"makeRuleCode": "",
				"sourceid": "",
				"sourceautoid": "",
				"sourceGrandchildrenId": "",
				"qmsResultId": "",
				"batchno": "",
				"producedate": "",
				"goodsposition": "",
				"qty": 0,
				"oriUnitPrice": 0,
				"oriTaxUnitPrice": 0,
				"oriMoney": 0,
				"oriSum": 0,
				"natUnitPrice": 0,
				"natTaxUnitPrice": 0,
				"natMoney": 0,
				"natSum": 0,
				"unDeductTaxRate": 0,
				"memo": "",
				"_status": "",
				"osmInRecordsSNs": [
					{
						"sn": "",
						"_status": ""
					}
				]
			}
		]
	}
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
| id | long | 否 | 主表主键id |
| org | string | 否 | 收货组织id |
| osmOrg | string | 否 | 委外组织id |
| accountOrg | string | 否 | 会计主体id |
| inInvoiceOrg | string | 否 | 收票组织id |
| org_name | string | 否 | 收货组织名称 |
| accountOrg_name | string | 否 | 会计主体名称 |
| osmOrg_name | string | 否 | 委外组织名称 |
| inInvoiceOrg_name | string | 否 | 收票组织名称 |
| code | string | 否 | 单据编号 |
| vouchdate | string | 否 | 单据日期 |
| bustype | string | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| store | long | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| warehouse | string | 否 | 仓库id |
| warehouse_iSerialManage | boolean | 否 | 仓库是否序列号严格管理 |
| warehouse_isGoodsPosition | string | 否 | 仓库是否货位管理 |
| warehouse_name | string | 否 | 仓库名称 |
| vendor | string | 否 | 委外供应商id |
| vendor_name | string | 否 | 委外供应商名称 |
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
| natCurrency | string | 否 | 本币id |
| natCurrency_code | string | 否 | 本币编码 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 |
| currency_name | string | 否 | 币种名称 |
| natCurrency_name | string | 否 | 本币名称 |
| exchRateType | string | 否 | 汇率类型id |
| exchRateType_name | string | 否 | 汇率类型名称 |
| exchRateType_digit | string | 否 | 汇率类型精度 |
| exchRate | int | 否 | 汇率 |
| taxRate | string | 否 | 税率 |
| vendor_taxrate | string | 否 | 供应商税率 |
| contact | string | 否 | 联系人 |
| contactTel | string | 否 | 联系人电话 |
| operator | string | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| stockMgr | string | 否 | 库管员id |
| stockMgr_name | string | 否 | 库管员名称 |
| paymentsum | BigDecimal | 否 | 付款金额 |
| payor | string | 否 | 付款人id |
| payor_name | string | 否 | 付款人名称 |
| paytime | string | 否 | 付款时间 |
| paymentstatus | string | 否 | 付款状态, 0:未完成、1:完成、 |
| status | string | 否 | 单据状态, 0:未提交、1:已提交、 |
| isBeginning | string | 否 | 期初标识, true:是、false:否、 |
| memo | string | 否 | 备注 |
| totalQuantity | BigDecimal | 否 | 整单数量 |
| moneysum | BigDecimal | 否 | 金额 |
| orisum | BigDecimal | 否 | 含税金额 |
| orimoney | BigDecimal | 否 | 无税金额 |
| tax | BigDecimal | 否 | 税额 |
| srcBill | string | 否 | 来源单据id |
| srcBillNO | string | 否 | 来源单据号 |
| printCount | int | 否 | 打印次数 |
| pubts | string | 否 | 时间戳 |
| tplid | string | 否 | 模板id |
| totalPieces | BigDecimal | 否 | 整单件数 |
| printer | string | 否 | 打印人 |
| printTime | string | 否 | 打印时间 |
| isInvBack | string | 否 | 红票标识 |
| payAgreement | string | 否 | 立账规则id |
| payAgreement_name | string | 否 | 立账规则名称 |
| bizFlow | string | 否 | 流程id |
| bizFlow_name | string | 否 | 流程名称 |
| bmake_st_osminvoice | string | 否 | 流程蓝票 |
| bmake_st_osminvoice_red | string | 否 | 流程红票 |
| isFlowCoreBill | string | 否 | 是否流程核心单据 |
| bizFlow_version | string | 否 | 版本信息 |
| vendor_define1 | string | 否 | 供应商自定义项1 |
| vendor_define2 | string | 否 | 供应商自定义项2 |
| vendor_define3 | string | 否 | 供应商自定义项3 |
| vendor_define4 | string | 否 | 供应商自定义项4 |
| vendor_define5 | string | 否 | 供应商自定义项5 |
| vendor_define6 | string | 否 | 供应商自定义项6 |
| vendor_define7 | string | 否 | 供应商自定义项7 |
| vendor_define8 | string | 否 | 供应商自定义项8 |
| vendor_define9 | string | 否 | 供应商自定义项9 |
| vendor_define10 | string | 否 | 供应商自定义项10 |
| vendor_define11 | string | 否 | 供应商自定义项11 |
| vendor_define12 | string | 否 | 供应商自定义项12 |
| vendor_define13 | string | 否 | 供应商自定义项13 |
| vendor_define14 | string | 否 | 供应商自定义项14 |
| vendor_define15 | string | 否 | 供应商自定义项15 |
| vendor_define16 | string | 否 | 供应商自定义项16 |
| vendor_define17 | string | 否 | 供应商自定义项17 |
| vendor_define18 | string | 否 | 供应商自定义项18 |
| vendor_define19 | string | 否 | 供应商自定义项19 |
| vendor_define20 | string | 否 | 供应商自定义项20 |
| vendor_define21 | string | 否 | 供应商自定义项21 |
| vendor_define22 | string | 否 | 供应商自定义项22 |
| vendor_define23 | string | 否 | 供应商自定义项23 |
| vendor_define24 | string | 否 | 供应商自定义项24 |
| vendor_define25 | string | 否 | 供应商自定义项25 |
| vendor_define26 | string | 否 | 供应商自定义项26 |
| vendor_define27 | string | 否 | 供应商自定义项27 |
| vendor_define28 | string | 否 | 供应商自定义项28 |
| vendor_define29 | string | 否 | 供应商自定义项29 |
| vendor_define30 | string | 否 | 供应商自定义项30 |
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
| osmInRecords | object | 是 | 委外入库单子表 |
| osmBusiType | int | 否 | 委外业务类型(1:全程委外,2:工序委外) |
| costAccountingMethod | int | 否 | 委外成本核算方式(0:按委外入库核算成本,1:按委外订单核算成本) |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": 0,
		"org": "",
		"osmOrg": "",
		"accountOrg": "",
		"inInvoiceOrg": "",
		"org_name": "",
		"accountOrg_name": "",
		"osmOrg_name": "",
		"inInvoiceOrg_name": "",
		"code": "",
		"vouchdate": "",
		"bustype": "",
		"bustype_name": "",
		"store": 0,
		"store_name": "",
		"warehouse": "",
		"warehouse_iSerialManage": true,
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
		"natCurrency": "",
		"natCurrency_code": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
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
		"paymentstatus": "",
		"status": "",
		"isBeginning": "",
		"memo": "",
		"totalQuantity": 0,
		"moneysum": 0,
		"orisum": 0,
		"orimoney": 0,
		"tax": 0,
		"srcBill": "",
		"srcBillNO": "",
		"printCount": 0,
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
		"bmake_st_osminvoice": "",
		"bmake_st_osminvoice_red": "",
		"isFlowCoreBill": "",
		"bizFlow_version": "",
		"vendor_define1": "",
		"vendor_define2": "",
		"vendor_define3": "",
		"vendor_define4": "",
		"vendor_define5": "",
		"vendor_define6": "",
		"vendor_define7": "",
		"vendor_define8": "",
		"vendor_define9": "",
		"vendor_define10": "",
		"vendor_define11": "",
		"vendor_define12": "",
		"vendor_define13": "",
		"vendor_define14": "",
		"vendor_define15": "",
		"vendor_define16": "",
		"vendor_define17": "",
		"vendor_define18": "",
		"vendor_define19": "",
		"vendor_define20": "",
		"vendor_define21": "",
		"vendor_define22": "",
		"vendor_define23": "",
		"vendor_define24": "",
		"vendor_define25": "",
		"vendor_define26": "",
		"vendor_define27": "",
		"vendor_define28": "",
		"vendor_define29": "",
		"vendor_define30": "",
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
		"osmInRecords": [
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
				"prodefine1": "",
				"prodefine2": "",
				"prodefine3": "",
				"prodefine4": "",
				"prodefine5": "",
				"prodefine6": "",
				"prodefine7": "",
				"prodefine8": "",
				"prodefine9": "",
				"prodefine10": "",
				"prodefine11": "",
				"prodefine12": "",
				"prodefine13": "",
				"prodefine14": "",
				"prodefine15": "",
				"prodefine16": "",
				"prodefine17": "",
				"prodefine18": "",
				"prodefine19": "",
				"prodefine20": "",
				"prodefine21": "",
				"prodefine22": "",
				"prodefine23": "",
				"prodefine24": "",
				"prodefine25": "",
				"prodefine26": "",
				"prodefine27": "",
				"prodefine28": "",
				"prodefine29": "",
				"prodefine30": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"skudefine1": "",
				"skudefine2": "",
				"skudefine3": "",
				"skudefine4": "",
				"skudefine5": "",
				"skudefine6": "",
				"skudefine7": "",
				"skudefine8": "",
				"skudefine9": "",
				"skudefine10": "",
				"skudefine11": "",
				"skudefine12": "",
				"skudefine13": "",
				"skudefine14": "",
				"skudefine15": "",
				"skudefine16": "",
				"skudefine17": "",
				"skudefine18": "",
				"skudefine19": "",
				"skudefine20": "",
				"skudefine21": "",
				"skudefine22": "",
				"skudefine23": "",
				"skudefine24": "",
				"skudefine25": "",
				"skudefine26": "",
				"skudefine27": "",
				"skudefine28": "",
				"skudefine29": "",
				"skudefine30": "",
				"skudefine31": "",
				"skudefine32": "",
				"skudefine33": "",
				"skudefine34": "",
				"skudefine35": "",
				"skudefine36": "",
				"skudefine37": "",
				"skudefine38": "",
				"skudefine39": "",
				"skudefine40": "",
				"skudefine41": "",
				"skudefine42": "",
				"skudefine43": "",
				"skudefine44": "",
				"skudefine45": "",
				"skudefine46": "",
				"skudefine47": "",
				"skudefine48": "",
				"skudefine49": "",
				"skudefine50": "",
				"skudefine51": "",
				"skudefine52": "",
				"skudefine53": "",
				"skudefine54": "",
				"skudefine55": "",
				"skudefine56": "",
				"skudefine57": "",
				"skudefine58": "",
				"skudefine59": "",
				"skudefine60": "",
				"product_model": "",
				"modelDescription": "",
				"free1": "",
				"free2": "",
				"free3": "",
				"free4": "",
				"free5": "",
				"free6": "",
				"free7": "",
				"free8": "",
				"free9": "",
				"free10": "",
				"propertiesValue": "",
				"isBatchManage": "",
				"isExpiryDateManage": "",
				"batchno": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"producedate": "",
				"invaliddate": "",
				"define1": "",
				"define2": "",
				"define3": "",
				"opSn": 0,
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
				"qty": 0,
				"unit": "",
				"unit_Precision": 0,
				"unit_name": "",
				"unit_code": "",
				"invExchRate": 0,
				"unitExchangeType": 0,
				"subQty": 0,
				"stockUnitId": "",
				"stockUnitId_Precision": 0,
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
				"priceUOM_Precision": 0,
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
				"sourceautoid": "",
				"qmsResultId": "",
				"poid": "",
				"podetailid": "",
				"firstsourceid": "",
				"firstsourceautoid": "",
				"source": "",
				"upcode": "",
				"firstsource": "",
				"pocode": "",
				"firstupcode": "",
				"unDeductTaxRate": 0,
				"unDeductTax": 0,
				"oriUnDeductTax": 0,
				"pubts": "",
				"osmInRecordsSNs": [
					{
						"id": 0,
						"sn": "",
						"pubts": ""
					}
				],
				"operationId": 0,
				"endOp": true,
				"sourcePoOrderCode": "",
				"sourcePoOrderProductRowno": "",
				"sourcePoOrderId": 0,
				"sourcePoOrderProductId": 0
			}
		],
		"osmBusiType": 0,
		"costAccountingMethod": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	系统异常	联系管理员处理


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

