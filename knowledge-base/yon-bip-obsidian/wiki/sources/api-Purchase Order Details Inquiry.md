---
title: "采购订单详情查询"
apiId: "0a56a97d16244708881f22381a8a1b69"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Purchase Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购订单详情查询

> `ContentType` 请求方式	GET | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/purchaseorder/detail

请求方式	GET

ContentType

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 采购订单id    示例: 1998432606391107591 |

## 3. 请求示例

Url: /yonbip/scm/purchaseorder/detail?access_token=访问令牌&id=1998432606391107591

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
| message | string | 否 | 调用失败时的错误信息 示例：["错误信息"] |
| data | object | 否 | 调用成功时的返回数据 |
| org | string | 否 | 采购组织id 示例：1998446281572745225 |
| org_name | string | 否 | 采购组织名称 示例：达利园采购组织 |
| paymentagrement | string | 否 | 付款协议档案 示例：2381689780506880 |
| generalPurchaseOrderType | string | 否 | 交易类型扩展参数 示例：0 |
| bustype | string | 否 | 交易类型id 示例：2155547426590991 |
| bustype_name | string | 否 | 交易类型名称 示例：普通采购 |
| code | string | 否 | 订单编号 示例：CG000140 |
| vouchdate | string | 否 | 单据日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-16 00:00:00 |
| expectDate | string | 否 | 希望到货日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-16 00:00:00 |
| department_name | string | 否 | 采购部门名称 示例：达利园部门 |
| operator_name | string | 否 | 采购员名称 示例：王欢 |
| vendor | string | 否 | 供货供应商id 示例：1998446281572745226 |
| vendor_name | string | 否 | 供货供应商名称 示例：达利园供应商 |
| vendor_code | string | 否 | 供货供应商编码 示例：DLY001 |
| vendor_correspondingorg | string | 否 | 供应商对应组织id 示例：1998449073295720451 |
| contact | string | 否 | 供方联系人 示例：张强 |
| operator | string | 否 | 采购员id 示例：1998449073295720452 |
| contactTel | string | 否 | 供方联系人手机 示例：12345678923 |
| otherOrderCode | string | 否 | 对方销售订单号 示例：XS00012 |
| inInvoiceOrg | string | 否 | 收票组织id 示例：1998449562927759363 |
| department | string | 否 | 采购部门id 示例：1998449562927759364 |
| invoiceVendor | string | 否 | 开票供应商id 示例：1998449726130749443 |
| invoiceVendor_name | string | 否 | 开票供应商名称 示例：达利园供应商 |
| currency_moneyDigit | string | 否 | 币种金额精度 示例：2 |
| currency_priceDigit | string | 否 | 币种单价精度 示例：2 |
| currency | string | 否 | 币种id 示例：1998449726130749444 |
| currency_code | string | 否 | 币种编码 示例：CHI |
| currency_name | string | 否 | 币种名称 示例：人民币 |
| natCurrency | string | 否 | 本币id 示例：1998449726130749444 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 示例：2 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 示例：2 |
| natCurrency_code | string | 否 | 本币编码 示例：CHI |
| natCurrency_name | string | 否 | 本币名称 示例：人民币 |
| exchRateType | string | 否 | 汇率类型id 示例：1998450860002115585 |
| exchRateType_name | string | 否 | 汇率类型名称 示例：用户自定义汇率 |
| exchRate | number |
| 小数位数:8,最大长度:19 | 否 | 汇率 示例：1 |
| taxRate | number |
| 小数位数:8,最大长度:19 | 否 | 税率 示例：0 |
| payAgreement | string | 否 | 立账规则id 示例：1998450860002115586 |
| payAgreement_name | string | 否 | 立账规则名称 示例：测试立账 |
| paymentagrement_code | string | 否 | 付款协议档案编码 示例：1002 |
| accountDate | string | 否 | 立账日，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-16 00:00:00 |
| maturityDate | string | 否 | 到期日，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-16 00:00:00 |
| accountDays | int | 否 | 账期 示例：1 |
| bizstatus | string | 否 | 单据状态：0：未提交、1：已提交、2：已关闭、3：待入库、4：已完成 示例：0 |
| modifyStatus | string | 否 | 变更状态： 0：未变更、1：变更中、2：变更完成 示例：0 |
| status | string | 否 | 单据状态：0：开立、1：已审核、2:已关闭、3：审核中 示例：0 |
| isWfControlled | string | 否 | 是否审批流控制：true：是、false：否 示例：false |
| isMaxLimitPrice | string | 否 | 是否超最高限价： true：是、false：否 示例：false |
| verifystate | string | 否 | 审批状态：0：初始开立、1：审批中、2：审批完成、3：不通过流程终止、4：驳回到制单： 示例：0 |
| memo | string | 否 | 备注 示例：采购要货测试 |
| printCount | string | 否 | 打印次数 示例：1 |
| returncount | string | 否 | 退回次数 示例：1 |
| totalQuantity | number |
| 小数位数:8,最大长度:28 | 否 | 总数量 示例：12 |
| oriSum | number |
| 小数位数:8,最大长度:28 | 否 | 含税金额 示例：45 |
| exchRateType_Digit | string | 否 | 汇率类型精度 示例：2 |
| oriMoney | number |
| 小数位数:8,最大长度:28 | 否 | 无税金额 示例：35 |
| oriTax | number |
| 小数位数:8,最大长度:28 | 否 | 税额 示例：10 |
| natSum | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税金额 示例：45 |
| natMoney | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税金额 示例：35 |
| natTax | number |
| 小数位数:8,最大长度:28 | 否 | 本币税额 示例：10 |
| approvenum | number |
| 小数位数:8,最大长度:28 | 否 | 审批数量 示例：0 |
| closenum | number |
| 小数位数:8,最大长度:28 | 否 | 关闭数量 示例：0 |
| moneysum | number |
| 小数位数:8,最大长度:28 | 否 | 金额 示例：45 |
| custom | string | 否 | 客户id 示例：1998455756270600196 |
| id | string | 否 | 采购订单id 示例：1998455756270600197 |
| pubts | string | 否 | 时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-16 16:25:25 |
| tplid | string | 否 | 模板id 示例：1998456134227722240 |
| headItem | object | 否 | 表头自定义项 |
| creator | string | 否 | 创建人 示例：王欢 |
| locker | string | 否 | 锁定人 示例：刘强 |
| createTime | string | 否 | 创建时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-16 16:25:25 |
| lockTime | string | 否 | 锁定时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-16 16:25:25 |
| createDate | string | 否 | 创建日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-16 00:00:00 |
| lockDate | string | 否 | 锁定日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-16 00:00:00 |
| modifier | string | 否 | 修改人 示例：刘强 |
| modifyTime | string | 否 | 修改时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-16 16:25:25 |
| modifyDate | string | 否 | 修改日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-16 00:00:00 |
| closeDate | string | 否 | 关闭日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-16 00:00:00 |
| auditor | string | 否 | 审核人 示例：刘强 |
| auditTime | string | 否 | 审核时间 示例：2024-05-16 16:25:25 |
| auditDate | string | 否 | 审核日期 示例：2024-05-16 00:00:00 |
| creatorId | long | 否 | 创建人id 示例：1998460180086915072 |
| lockerId | string | 否 | 锁定人id 示例：1998460180086915073 |
| closer | string | 否 | 关闭人 示例：刘强 |
| modifierId | string | 否 | 修改人id 示例：1998460420605083651 |
| closeTime | string | 否 | 关闭时间 示例：2024-05-16 16:25:25 |
| auditorId | string | 否 | 审批人id 示例：1998460420605083652 |
| closerId | string | 否 | 关闭人id 示例：1998460592403775496 |
| allTotalArrivedTaxMoney | number |
| 小数位数:8,最大长度:28 | 否 | 累计到货含税金额 示例：45 |
| allTotalInTaxMoney | number |
| 小数位数:8,最大长度:28 | 否 | 累计入库含税金额 示例：45 |
| srcBill | string | 否 | 来源单据ID 示例：1998460592403775497 |
| allTotalInvoiceMoney | number |
| 小数位数:8,最大长度:28 | 否 | 累计开票含税金额 示例：45 |
| totalPayMoney | number |
| 小数位数:8,最大长度:28 | 否 | 累计付款核销金额 示例：56 |
| srcBillNO | string | 否 | 来源单据号 示例：QG1002 |
| totalPayNATMoney | number |
| 小数位数:8,最大长度:28 | 否 | 累计本币付款核销金额 示例：56 |
| source | string | 否 | 来源单据类型, pu_applyorder:采购请购单、st_purchaseorder:采购订单、pu_arrivalorder:采购到货单、st_purinrecord:采购入库单、st_purinvoice:采购发票、pu_pursettle:采购结算单、pu_adjustprice:采购调价单、st_storecheckplan:盘点计划、st_storecheck:实盘单、voucher_order:销售订单、voucher_delivery:发货单、udinghuo.voucher_order:销售订单、ustock.st_purinrecord:采购入库单、requirementsplanning.mr_plan_workbench_pullandpush:计划订单、 示例：pu_applyorder |
| directShipment | string | 否 | 直运采购 示例：0 |
| bEffectStock | string | 否 | 影响可用量 示例：0 |
| ecsuiteperson | string | 否 | 气泡联系人 示例：刘强 |
| ecsuiteuser | string | 否 | 气泡联系人 示例：刘强 |
| bmake_st_purinrecord_red | string | 否 | 流程退库 示例：1 |
| bmake_st_purinrecord | string | 否 | 流程入库 示例：0 |
| bmake_pu_arrivalorder | string | 否 | 流程到货 示例：1 |
| bizFlow_name | string | 否 | 流程名称 示例：普通采购（无到货） |
| bizFlow | string | 否 | 流程IDid 示例：1998462361924534281 |
| bizFlow_version | string | 否 | 版本信息 示例：V1.0 |
| isFlowCoreBill | string | 否 | 是否流程核心单据 示例：0 |
| bmake_st_purinvoice | string | 否 | 流程订货订单开蓝票 示例：0 |
| bmake_st_purinvoice_red | string | 否 | 流程订货订单开红票 示例：1 |
| bmake_st_purinvoice_pored | string | 否 | 流程订货订单开红票 示例：0 |
| purchaseOrders | object | 是 | 采购订单子表[pu.purchaseorder.PurchaseOrders] |
| paymentSchedules | object | 是 | 采购订单付款计划子表[pu.purchaseorder.PaymentSchedules] |
| paymentExeDetail | object | 是 | 采购订单付款执行明细[pu.purchaseorder.PaymentExeDetail] |
| tradeRouteID | string | 否 | 贸易路径id 示例：1998486662851592201 |
| tradeRouteID_name | string | 否 | 贸易路径 示例：采购订单内抛 |
| tradeRouteID_code | string | 否 | 贸易路径编码 示例：caigoudingdanneipao001 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "[\"错误信息\"]",
	"data": {
		"org": "1998446281572745225",
		"org_name": "达利园采购组织",
		"paymentagrement": "2381689780506880",
		"generalPurchaseOrderType": "0",
		"bustype": "2155547426590991",
		"bustype_name": "普通采购",
		"code": "CG000140",
		"vouchdate": "2024-05-16 00:00:00",
		"expectDate": "2024-05-16 00:00:00",
		"department_name": "达利园部门",
		"operator_name": "王欢",
		"vendor": "1998446281572745226",
		"vendor_name": "达利园供应商",
		"vendor_code": "DLY001",
		"vendor_correspondingorg": "1998449073295720451",
		"contact": "张强",
		"operator": "1998449073295720452",
		"contactTel": "12345678923",
		"otherOrderCode": "XS00012",
		"inInvoiceOrg": "1998449562927759363",
		"department": "1998449562927759364",
		"invoiceVendor": "1998449726130749443",
		"invoiceVendor_name": "达利园供应商",
		"currency_moneyDigit": "2",
		"currency_priceDigit": "2",
		"currency": "1998449726130749444",
		"currency_code": "CHI",
		"currency_name": "人民币",
		"natCurrency": "1998449726130749444",
		"natCurrency_moneyDigit": "2",
		"natCurrency_priceDigit": "2",
		"natCurrency_code": "CHI",
		"natCurrency_name": "人民币",
		"exchRateType": "1998450860002115585",
		"exchRateType_name": "用户自定义汇率",
		"exchRate": 1,
		"taxRate": 0,
		"payAgreement": "1998450860002115586",
		"payAgreement_name": "测试立账",
		"paymentagrement_code": "1002",
		"accountDate": "2024-05-16 00:00:00",
		"maturityDate": "2024-05-16 00:00:00",
		"accountDays": 1,
		"bizstatus": "0",
		"modifyStatus": "0",
		"status": "0",
		"isWfControlled": "false",
		"isMaxLimitPrice": "false",
		"verifystate": "0",
		"memo": "采购要货测试",
		"printCount": "1",
		"returncount": "1",
		"totalQuantity": 12,
		"oriSum": 45,
		"exchRateType_Digit": "2",
		"oriMoney": 35,
		"oriTax": 10,
		"natSum": 45,
		"natMoney": 35,
		"natTax": 10,
		"approvenum": 0,
		"closenum": 0,
		"moneysum": 45,
		"custom": "1998455756270600196",
		"id": "1998455756270600197",
		"pubts": "2024-05-16 16:25:25",
		"tplid": "1998456134227722240",
		"headItem": {
			"id": "1998456134227722241",
			"define1": "表头自定义项1",
			"define2": "表头自定义项2",
			"define3": "表头自定义项3",
			"define60": "表头自定义项60"
		},
		"creator": "王欢",
		"locker": "刘强",
		"createTime": "2024-05-16 16:25:25",
		"lockTime": "2024-05-16 16:25:25",
		"createDate": "2024-05-16 00:00:00",
		"lockDate": "2024-05-16 00:00:00",
		"modifier": "刘强",
		"modifyTime": "2024-05-16 16:25:25",
		"modifyDate": "2024-05-16 00:00:00",
		"closeDate": "2024-05-16 00:00:00",
		"auditor": "刘强",
		"auditTime": "2024-05-16 16:25:25",
		"auditDate": "2024-05-16 00:00:00",
		"creatorId": 1998460180086915072,
		"lockerId": "1998460180086915073",
		"closer": "刘强",
		"modifierId": "1998460420605083651",
		"closeTime": "2024-05-16 16:25:25",
		"auditorId": "1998460420605083652",
		"closerId": "1998460592403775496",
		"allTotalArrivedTaxMoney": 45,
		"allTotalInTaxMoney": 45,
		"srcBill": "1998460592403775497",
		"allTotalInvoiceMoney": 45,
		"totalPayMoney": 56,
		"srcBillNO": "QG1002",
		"totalPayNATMoney": 56,
		"source": "pu_applyorder",
		"directShipment": "0",
		"bEffectStock": "0",
		"ecsuiteperson": "刘强",
		"ecsuiteuser": "刘强",
		"bmake_st_purinrecord_red": "1",
		"bmake_st_purinrecord": "0",
		"bmake_pu_arrivalorder": "1",
		"bizFlow_name": "普通采购（无到货）",
		"bizFlow": "1998462361924534281",
		"bizFlow_version": "V1.0",
		"isFlowCoreBill": "0",
		"bmake_st_purinvoice": "0",
		"bmake_st_purinvoice_red": "1",
		"bmake_st_purinvoice_pored": "0",
		"purchaseOrders": [
			{
				"demandOrg": "1998463564521144321",
				"demandOrg_name": "达利园组织",
				"inOrg": "1998463564521144322",
				"inOrg_name": "达利园组织",
				"inInvoiceOrg": "1998463564521144322",
				"inInvoiceOrg_name": "达利园组织",
				"product": "1998464543770017799",
				"product_cCode": "SNWO0001",
				"product_cName": "铁丝",
				"product_modelDescription": "细小铁丝",
				"product_model": "5mm",
				"productsku": "1998464543770017799",
				"product_defaultAlbumId": "ba3daf532bca8deedda4e16b328c2b3",
				"materialId": "1998464543770017800",
				"productsku_cCode": "SNWO0001",
				"productsku_cName": "铁丝",
				"productsku_modelDescription": "5mm",
				"propertiesValue": "细小",
				"approveqty": 12,
				"closeqty": 13,
				"rowno": 10,
				"unit_Precision": "2",
				"unit": "1998464543770017799",
				"unit_code": "MI",
				"unit_name": "米",
				"qty": 12,
				"purUOM_Code": "MI",
				"purUOM_Name": "米",
				"invExchRate": 1,
				"subQty": 12,
				"priceUOM_Code": "MI",
				"virtualProductAttribute": "规格虚拟",
				"realProductAttribute": "极细",
				"realProductAttributeType": "极细",
				"priceUOM_Name": "米",
				"invPriceExchRate": 1,
				"priceQty": 12,
				"product_oUnitId": "1998464543770017799",
				"product_productOfflineRetail_purchaseUnit": "1998464543770017799",
				"productOfflineRetail_purchaseRate": 1,
				"product_primeCosts": 12,
				"productsku_primeCosts": 12,
				"oriUnitPrice": 23,
				"oriTaxUnitPrice": 23,
				"taxRate": 0,
				"oriMoney": 46,
				"oriSum": 46,
				"oriTax": 12,
				"natUnitPrice": 24,
				"natTaxUnitPrice": 24,
				"maxLimitPrice": 32,
				"natMoney": 46,
				"natSum": 46,
				"recieveDate": "2024-05-16 00:00:00",
				"natTax": 12,
				"linecloser": "刘强",
				"project_name": "虚拟项目",
				"linecloseTime": "2024-05-16 00:00:00",
				"isGiftProduct": "false",
				"memo": "商品测试",
				"id": "1998464543770017800",
				"mainid": "1998468787197706248",
				"pubts": "2024-05-16 16:25:25",
				"bodyItem": {
					"id": "1998468787197706249",
					"define1": "表体自定义项1",
					"define2": "表体自定义项2",
					"define3": "表体自定义项3",
					"define33": "表体自定义项33",
					"define4": "表体自定义项4",
					"define58": "表体自定义项58",
					"define54": "表体自定义项54",
					"define50": "表体自定义项50",
					"define46": "表体自定义项46",
					"define42": "表体自定义项42",
					"define38": "表体自定义项38",
					"define34": "表体自定义项34",
					"define59": "表体自定义项59",
					"define55": "表体自定义项55",
					"define51": "表体自定义项51",
					"define47": "表体自定义项47",
					"define43": "表体自定义项43",
					"define39": "表体自定义项39",
					"define35": "表体自定义项35",
					"define31": "表体自定义项31",
					"define60": "表体自定义项60",
					"define56": "表体自定义项56",
					"define52": "表体自定义项52",
					"define48": "表体自定义项48",
					"define44": "表体自定义项44",
					"define40": "表体自定义项40",
					"define36": "表体自定义项36",
					"define32": "表体自定义项32",
					"define57": "表体自定义项57",
					"define53": "表体自定义项53",
					"define49": "表体自定义项49",
					"define45": "表体自定义项45",
					"define41": "表体自定义项41",
					"define37": "表体自定义项37",
					"define5": "表体自定义项5",
					"define6": "表体自定义项6",
					"define7": "表体自定义项7",
					"define8": "表体自定义项8",
					"define9": "表体自定义项9",
					"define10": "表体自定义项10",
					"define11": "表体自定义项11",
					"define12": "表体自定义项12",
					"define13": "表体自定义项13",
					"define14": "表体自定义项14",
					"define15": "表体自定义项15",
					"define16": "表体自定义项16",
					"define17": "表体自定义项17",
					"define18": "表体自定义项18",
					"define19": "表体自定义项19",
					"define20": "表体自定义项20",
					"define21": "表体自定义项21",
					"define22": "表体自定义项22",
					"define23": "表体自定义项23",
					"define24": "表体自定义项24",
					"define25": "表体自定义项25",
					"define26": "表体自定义项26",
					"define27": "表体自定义项27",
					"define28": "表体自定义项28",
					"define29": "表体自定义项29",
					"define30": "表体自定义项30"
				},
				"trigger_getallprice": "0",
				"agentId": "1998473485876199431",
				"agentId_name": "王芸",
				"receiver": "王芸",
				"receiveTelePhone": "12345678912",
				"receiveAddress": "北京用友",
				"isBatchManage": "false",
				"isExpiryDateManage": "0",
				"expireDateNo": "100",
				"expireDateUnit": "天",
				"project": "1998473485876199432",
				"project_code": "XN1002",
				"warehouse": "1998475444397015049",
				"store": "1998475444397015050",
				"warehouse_name": "自动仓库",
				"warehouse_code": "AUTO1001",
				"store_name": "售卖门店",
				"supplyItemCode": "CH1002",
				"supplyItemName": "采购存货",
				"priceUOM": "1998475770798800900",
				"priceUOM_Precision": "2",
				"purUOM": "1998475770798800900",
				"purUOM_Precision": "2",
				"maxInPrice": 25,
				"totalPayQty": 12,
				"totalSaleQty": 23,
				"sourceid": "1998475770798800901",
				"sourceautoid": "1998476775836876800",
				"makeRuleCode": "lendrecordToPurchaseOrder",
				"arrivedStatus": "2",
				"inWHStatus": "2",
				"invoiceStatus": "2",
				"payStatus": "2",
				"totalRecieveQty": 23,
				"totalInQty": 23,
				"totalInvoiceQty": 23,
				"totalInvoiceMoney": 46,
				"totalArrivedTaxMoney": 156,
				"totalInTaxMoney": 123,
				"otherOrderRowNO": "10",
				"totalPayOriMoney": 123,
				"totalPayNATMoney": 234,
				"outSrcBillRowNO": "10",
				"outSrcBillId": "1998476775836876801",
				"outSrcBillRowId": "1998478691376562183",
				"unitExchangeType": 0,
				"upcode": "QG1001",
				"unitExchangeTypePrice": 0,
				"source": "pu_applyorder",
				"firstsource": "pu_applyorder",
				"firstupcode": "QG1001",
				"outSrcBillNO": "QG1001",
				"outSource": "pu_applyorder",
				"trackingNO": "1001",
				"totalRecieveSubqty": 123,
				"totalPayAmount": 23,
				"totalInSubqty": 123,
				"firstsourceautoid": "1998478691376562184",
				"firstsourceid": "1998479833837862916",
				"totalReturnInQty": 12,
				"totalReturnInSubQty": 12,
				"signatory": "刘强",
				"outForeignBusinessmen": "1998479833837862917",
				"outForeignBusinessmen_code": "WWS0023",
				"outForeignBusinessmen_name": "达利园委外",
				"hasForeignInvestors": "false",
				"tradeRouteID": "1998479833837862916",
				"tradeRouteID_name": "采购订单内抛",
				"tradeRouteID_code": "caigoudingdan001"
			}
		],
		"paymentSchedules": [
			{
				"number": "1",
				"name": "订单自定义付款",
				"payRatio": 100,
				"amount": 123,
				"payNatMoney": 123,
				"startDate": "1998482324918894599",
				"sourceType": "0",
				"startDate_name": "测试时点",
				"startDateTime": "2024-05-16 00:00:00",
				"fixAccoutDayTwo": "2024-05-16 00:00:00",
				"delayDay": "",
				"fixAccoutDayThree": "2024-05-16 00:00:00",
				"delayMonth": "",
				"fixAccoutDayFour": "2024-05-16 00:00:00",
				"accountDay": "",
				"fixExpireDayOne": "2024-05-16 00:00:00",
				"fixExpireDayTwo": "2024-05-16 00:00:00",
				"accountUnit": "0",
				"fixExpireDayThree": "2024-05-16 00:00:00",
				"accountType": "0",
				"fixExpireDayFour": "2024-05-16 00:00:00",
				"fixAccoutDateTime": "2024-05-16 00:00:00",
				"rowno": "10",
				"expiringDateTime": "2024-05-16 00:00:00",
				"mainid": "",
				"isAdvancePay": "false",
				"totalPayAmount": 123,
				"paidAmount": 234,
				"id": "1998482324918894600",
				"fixAccoutDayOne": "2024-05-16 00:00:00",
				"pubts": "2024-05-16 16:25:25"
			}
		],
		"paymentExeDetail": [
			{
				"rowno": "10",
				"mainid": "1998485468850683913",
				"id": "1998485468850683914",
				"pubts": "2024-05-16 16:25:25",
				"number": "1",
				"vouchtype": "pu_applyorder",
				"vouchid": "1998486018590769154",
				"vouchsubid": "1998486018590769155",
				"vouchcode": "CG1001",
				"period": "pu_applyorder",
				"payRatio": 100,
				"payMoney": 234,
				"inInvoiceOrg_name": "达利园组织",
				"inInvoiceOrg": "1998486662851592200",
				"totalPayAmount": 234,
				"paidMoney": 234,
				"payNatMoney": 123,
				"writeBackSum": 234,
				"startDateTime": "2024-05-16 16:35:21",
				"copyStartBaseDate": "2024-05-16 16:35:21",
				"expiringDateTime": "2024-05-16 16:35:21",
				"isAdvancePay": "true",
				"payNatSum": 234
			}
		],
		"tradeRouteID": "1998486662851592201",
		"tradeRouteID_name": "采购订单内抛",
		"tradeRouteID_code": "caigoudingdanneipao001"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-22

更新

返回参数 unitExchangeType

更新

返回参数 unitExchangeTypePrice


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

