---
title: "采购入库单个保存V2"
apiId: "032e45249b704ebc8b9151df3a2acad7"
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

# 采购入库单个保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Receipt (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purinrecord/single/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 采购入库单[st.purinrecord.PurInRecord] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| needCalcLines | boolean | 否 | 否 | 表体行计算标识：不传或传入false时不对子表进行二次计算，需调用方保证数据的正确性；为true时，以原币无税金额和数量进行件数及其他金额、单价、成本的反算 示例：false |
| id | string | 否 | 否 | 主表id，更新操作时必填 |
| code | string | 否 | 否 | 单据编号，以系统编码规则配置为准，系统设置为手工编号时必输，系统设置为自动编号时非必输；更新操作时必填 示例：CGRK00001 |
| org | string | 否 | 是 | 收货组织，传入id或code 示例：wzyqzn |
| purchaseOrg | string | 否 | 是 | 采购组织，传入id或code 示例：wzyqzn |
| accountOrg | string | 否 | 是 | 会计主体，传入id或code 示例：wzyqzn |
| inInvoiceOrg | string | 否 | 是 | 收票组织，传入id或code 示例：wzyqzn |
| vouchdate | string | 否 | 是 | 单据日期，日期格式:yyyy-MM-dd 示例：2021-03-05 |
| bustype | string | 否 | 是 | 交易类型，传入id或code 示例：A15001 |
| store | string | 否 | 否 | 门店，传入id或code 示例：store_code_01 |
| warehouse | string | 否 | 是 | 仓库，传入id或code 示例：ck_01 |
| vendor | string | 否 | 是 | 供应商，传入id或code 示例：vendor_01 |
| invoiceVendor | string | 否 | 否 | 开票供应商，传入id或code；不传入默认开票供应商=供应商。 示例：vendor_01 |
| department | string | 否 | 否 | 部门，传入id或code 示例：dept_01 |
| paymentagrement | string | 否 | 否 | 付款协议档案，传入id或code 示例：pay_01 |
| invoicingDocEntryAndMgmt | string | 否 | 否 | 立账开票依据，枚举值，{"st_purinrecord": "入库单", "st_purinvoice": "发票"}，与“入库立账方式”成对传入。立账开票依据“入库单”对应入库立账方式为“入库暂估应付”或“入库确认应付”，“发票”对应“开票确认应付”。立账开票依据与入库立账方式优先取保存前规则的设置，若业务流或者交易类型中保存前规则指定了入库立账方式，则API传入的值不生效，以业务流或者交易类型中的配置为准。 示例：st_purinvoice |
| receiptDocEntryAndMgmt | string | 否 | 否 | 入库立账方式，枚举值，与“立账开票依据”成对传入。{"receipt_estimated_AP":"入库暂估应付","receipt_confirm_AP":"入库确认应付","invoicing_confirm_AP":"开票确认应付"}，立账开票依据“入库单”对应入库立账方式为“入库暂估应付”或“入库确认应付”，“发票”对应“开票确认应付”。立账开票依据与入库立账方式优先取保存前规则的设置，若业务流或者交易类型中保存前规则指定了入库立账方式，则API传入的值不生效，以业务流或者交易类型中的配置为准。 示例：invoicing_confirm_AP |
| currency | string | 否 | 是 | 币种，传入id或code 示例：CNY |
| natCurrency | string | 否 | 是 | 本币，传入id或code 示例：CNY |
| exchRateType | string | 否 | 是 | 汇率类型，传入id或code 示例：01 |
| exchRate | BigDecimal | 否 | 是 | 汇率 示例：1 |
| taxRate | int | 否 | 否 | 税率 示例：5 |
| contact | string | 否 | 否 | 联系人 示例：王XX |
| contactTel | string | 否 | 否 | 联系人电话 示例：18800001111 |
| operator | string | 否 | 否 | 业务员，传入id或code 示例：operator_01 |
| stockMgr | string | 否 | 否 | 库管员，传入id或code 示例：operator_02 |
| taxSettingType | string | 否 | 否 | 计税方式，"0"为行计税，"1"为整单计税，不传或传其他值默认为行计税 示例：0 |
| isBeginning | string | 否 | 否 | 期初标识, true:是，false:否 示例：false |
| memo | string | 否 | 否 | 备注 示例：XXX |
| pubts | string | 否 | 否 | 时间戳，编辑时传入单据当前时间戳 |
| bizFlow | string | 否 | 否 | 流程id 示例：a50fd3d2-e063-11ea-8c0b-98039b073634 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| headItem | object | 是 | 否 | 表头自定义项（1-60） |
| defines | object | 否 | 否 | 表头自由自定义项（1-60） |
| purInRecords | object | 是 | 是 | 采购入库单子表 |
| out_sys_id | string | 否 | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 否 | 外部来源类型 |

## 3. 请求示例

Url: /yonbip/scm/purinrecord/single/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"needCalcLines": false,
		"id": "",
		"code": "CGRK00001",
		"org": "wzyqzn",
		"purchaseOrg": "wzyqzn",
		"accountOrg": "wzyqzn",
		"inInvoiceOrg": "wzyqzn",
		"vouchdate": "2021-03-05",
		"bustype": "A15001",
		"store": "store_code_01",
		"warehouse": "ck_01",
		"vendor": "vendor_01",
		"invoiceVendor": "vendor_01",
		"department": "dept_01",
		"paymentagrement": "pay_01",
		"invoicingDocEntryAndMgmt": "st_purinvoice",
		"receiptDocEntryAndMgmt": "invoicing_confirm_AP",
		"currency": "CNY",
		"natCurrency": "CNY",
		"exchRateType": "01",
		"exchRate": 1,
		"taxRate": 5,
		"contact": "王XX",
		"contactTel": "18800001111",
		"operator": "operator_01",
		"stockMgr": "operator_02",
		"taxSettingType": "0",
		"isBeginning": "false",
		"memo": "XXX",
		"pubts": "",
		"bizFlow": "a50fd3d2-e063-11ea-8c0b-98039b073634",
		"_status": "Insert",
		"headItem": [
			{
				"id": "",
				"define1": "自定义项1",
				"define2": "1891079656820992"
			}
		],
		"defines": {
			"id": "",
			"define1": "自由自定义项1",
			"define2": "1891079656820993"
		},
		"purInRecords": [
			{
				"id": "",
				"rowno": 1,
				"product": "PD0817000001",
				"productsku": "PD08170000010004",
				"free1": "红色",
				"free2": "100ml",
				"isBatchManage": true,
				"isExpiryDateManage": true,
				"batchno": "SH01",
				"producedate": "2020-09-24 00:00:00",
				"invaliddate": "2020-10-24 00:00:00",
				"define1": "SH01_属性1",
				"define2": "SH01_属性2",
				"qty": 10,
				"unit": "KGM",
				"invExchRate": 1,
				"unitExchangeType": 0,
				"subQty": 10,
				"stockUnitId": "KGM",
				"goodsposition": "ck01_hw01",
				"contactsQuantity": 10,
				"contactsPieces": 10,
				"unitExchangeTypePrice": 0,
				"priceQty": 10,
				"invPriceExchRate": 1,
				"priceUOM": "KGM",
				"isGiftProduct": false,
				"oriUnitPrice": 10,
				"oriTaxUnitPrice": 10,
				"oriMoney": 100,
				"oriSum": 100,
				"oriTax": 10,
				"taxitems": "VAT9",
				"natUnitPrice": 10,
				"natTaxUnitPrice": 10,
				"natMoney": 100,
				"natSum": 100,
				"natTax": 10,
				"autoCalcCost": false,
				"unDeductTaxRate": 10,
				"expenseItems": "\"1803923605829451781\"",
				"unDeductTax": 1,
				"costUnitPrice": 10,
				"costMoney": 101,
				"oriUnDeductTax": 1,
				"oriCostUnitPrice": 10,
				"oriCostMoney": 101,
				"memo": "备注信息",
				"project": "project_01",
				"pubts": "",
				"_status": "Insert",
				"purInRecordsSNs": [
					{
						"id": 0,
						"sn": "SN_001",
						"_status": "Insert",
						"pubts": ""
					}
				],
				"bodyItem": {
					"id": "",
					"define1": "自定义项1",
					"define2": "2411545234969601"
				},
				"defines": {
					"id": "",
					"define1": "自由项1",
					"define2": "2411545234969603"
				},
				"out_sys_rowno": "",
				"out_sys_lineid": ""
			}
		],
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": ""
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
| org | long | 否 | 收货组织id |
| purchaseOrg | long | 否 | 采购组织id |
| accountOrg | long | 否 | 会计主体id |
| inInvoiceOrg | long | 否 | 收票组织id |
| org_name | string | 否 | 收货组织名称 |
| accountOrg_name | string | 否 | 会计主体名称 |
| purchaseOrg_name | string | 否 | 采购组织名称 |
| inInvoiceOrg_name | string | 否 | 收票组织名称 |
| code | string | 否 | 单据编号 |
| vouchdate | DateTime | 否 | 单据日期 |
| bustype | long | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| store | long | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| warehouse | long | 否 | 仓库id |
| warehouse_iSerialManage | boolean | 否 | 仓库是否序列号严格管理 |
| warehouse_isGoodsPosition | string | 否 | 仓库是否货位管理 |
| warehouse_name | string | 否 | 仓库名称 |
| vendor | long | 否 | 供应商id |
| vendor_name | string | 否 | 供应商名称 |
| invoiceVendor | long | 否 | 开票供应商id |
| invoiceVendor_name | string | 否 | 开票供应商名称 |
| department | long | 否 | 部门id |
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
| exchRate | BigDecimal | 否 | 汇率 |
| taxRate | int | 否 | 税率 |
| contact | string | 否 | 联系人 |
| contactTel | string | 否 | 联系人电话 |
| operator | long | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| stockMgr | string | 否 | 库管员id |
| stockMgr_name | string | 否 | 库管员名称 |
| status | int | 否 | 单据状态, 0:未提交、1:已提交、 |
| taxSettingType | string | 否 | 计税方式，"0"为行计税，"1"为整单计税，不传或传其他值默认为行计税 |
| isBeginning | boolean | 否 | 期初标识, true:是、false:否、 |
| memo | string | 否 | 备注 |
| srcBill | long | 否 | 来源单据id |
| srcBillNO | string | 否 | 来源单据号 |
| printCount | int | 否 | 打印次数 |
| custom | long | 否 | 客户id |
| pubts | string | 否 | 时间戳 |
| printer | string | 否 | 打印人 |
| printTime | DateTime | 否 | 打印时间 |
| isInvBack | boolean | 否 | 红票标识 |
| bizFlow | string | 否 | 流程id |
| bizFlow_name | string | 否 | 流程名称 |
| bmake_st_purinvoice | string | 否 | 流程蓝票 |
| bmake_st_purinvoice_red | string | 否 | 流程红票 |
| isFlowCoreBill | boolean | 否 | 是否流程核心单据 |
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
| createTime | DateTime | 否 | 创建时间 |
| createDate | DateTime | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | DateTime | 否 | 修改时间 |
| modifyDate | DateTime | 否 | 修改日期 |
| auditor | string | 否 | 提交人 |
| auditTime | DateTime | 否 | 提交时间 |
| auditDate | DateTime | 否 | 提交日期 |
| creatorId | long | 否 | 创建人id |
| auditorId | long | 否 | 审批人id |
| modifierId | long | 否 | 修改人id |
| purInRecords | object | 是 | 采购入库单子表 |
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
		"org": 0,
		"purchaseOrg": 0,
		"accountOrg": 0,
		"inInvoiceOrg": 0,
		"org_name": "",
		"accountOrg_name": "",
		"purchaseOrg_name": "",
		"inInvoiceOrg_name": "",
		"code": "",
		"vouchdate": "",
		"bustype": 0,
		"bustype_name": "",
		"store": 0,
		"store_name": "",
		"warehouse": 0,
		"warehouse_iSerialManage": true,
		"warehouse_isGoodsPosition": "",
		"warehouse_name": "",
		"vendor": 0,
		"vendor_name": "",
		"invoiceVendor": 0,
		"invoiceVendor_name": "",
		"department": 0,
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
		"taxRate": 0,
		"contact": "",
		"contactTel": "",
		"operator": 0,
		"operator_name": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"status": 0,
		"taxSettingType": "",
		"isBeginning": true,
		"memo": "",
		"srcBill": 0,
		"srcBillNO": "",
		"printCount": 0,
		"custom": 0,
		"pubts": "",
		"printer": "",
		"printTime": "",
		"isInvBack": true,
		"bizFlow": "",
		"bizFlow_name": "",
		"bmake_st_purinvoice": "",
		"bmake_st_purinvoice_red": "",
		"isFlowCoreBill": true,
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
		"creatorId": 0,
		"auditorId": 0,
		"modifierId": 0,
		"purInRecords": [
			{
				"mainid": 0,
				"id": 0,
				"isSerialNoManage": true,
				"rowno": 0,
				"realProductAttribute": "",
				"realProductAttributeType": "",
				"virtualProductAttribute": "",
				"product": 0,
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
				"productsku": 0,
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
				"isBatchManage": true,
				"isExpiryDateManage": true,
				"batchno": "",
				"expireDateNo": 0,
				"expireDateUnit": 0,
				"producedate": "",
				"invaliddate": "",
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
				"totalOutStockSubQty": 0,
				"totalOutStockQuantity": 0,
				"qty": 0,
				"unit": 0,
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
				"goodsposition": 0,
				"goodsposition_cName": "",
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"unitExchangeTypePrice": 0,
				"priceQty": 0,
				"priceUOM_name": "",
				"invPriceExchRate": 0,
				"priceUOM_Precision": 0,
				"priceUOM_code": "",
				"priceUOM": 0,
				"product_oUnitId": 0,
				"product_productOfflineRetail_storeOrderUnit": 0,
				"isGiftProduct": true,
				"oriUnitPrice": 0,
				"oriTaxUnitPrice": 0,
				"oriMoney": 0,
				"oriSum": 0,
				"oriTax": 0,
				"taxRate": 0,
				"natUnitPrice": 0,
				"natTaxUnitPrice": 0,
				"natMoney": 0,
				"natSum": 0,
				"natTax": 0,
				"autoCalcCost": true,
				"costMoney": 0,
				"costUnitPrice": 0,
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
				"project": 0,
				"project_code": "",
				"project_name": "",
				"makeRuleCode": "",
				"sourceid": 0,
				"sourceautoid": 0,
				"poid": 0,
				"podetailid": 0,
				"firstsourceid": 0,
				"firstsourceautoid": 0,
				"source": "",
				"upcode": "",
				"firstsource": "",
				"pocode": "",
				"firstupcode": "",
				"pubts": "",
				"purInRecordsSNs": [
					{
						"id": 0,
						"sn": "",
						"pubts": ""
					}
				],
				"out_sys_rowno": "",
				"out_sys_lineid": ""
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

