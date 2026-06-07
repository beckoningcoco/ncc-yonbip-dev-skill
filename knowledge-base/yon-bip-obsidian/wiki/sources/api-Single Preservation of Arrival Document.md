---
title: "到货单单个保存V2"
apiId: "f579353b15e64144bb68acd175c2abc7"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Arrival Notice"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Arrival Notice]
platform_version: "BIP"
source_type: community-api-docs
---

# 到货单单个保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Arrival Notice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/arrivalorder/singleSave_v1

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
| data | object | 否 | 是 | 传参 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 否 | 到货单id，新增时无需填写，修改时必填 示例：1997044387060645896 |
| purchaseOrg | string | 否 | 是 | 采购组织id，或采购组织code 示例：1796944956870912 |
| org | string | 否 | 是 | 收货组织id，或收货组织code 示例：1796944956870912 |
| inInvoiceOrg | string | 否 | 是 | 收票组织id，或收票组织code 示例：1796944956870912 |
| code | string | 否 | 否 | 到货单code，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输；修改时必传，批号建档需要传code 示例：DH21042200000005 |
| isContract | boolean | 否 | 是 | 是否需要与供应商协同：true or false 示例：false |
| vouchdate | string | 否 | 是 | 单据日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-04-23 00:00:00 |
| busType | string | 否 | 是 | 交易类型id，或交易类型code 示例：1988954591564032 |
| vendor | string | 否 | 是 | 供货供应商id，或供货供应商code 示例：1797689091543296 |
| purchaseDepartment | string | 否 | 否 | 采购部门, 录入采购部门id或code 示例：1997049085754867715 |
| purchaseAgent | string | 否 | 否 | 采购员, 录入采购员id或code 示例：1997049085754867716 |
| retailInvestors | boolean | 否 | 否 | 是否散户：false or true 示例：false |
| invoiceSupplier | string | 否 | 是 | 开票供应商id，或开票供应商code 示例：1797689091543296 |
| currency | string | 否 | 是 | 币种id，或币种code 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| natCurrency | string | 否 | 是 | 本币id，或本币code 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| exchRateType | string | 否 | 是 | 汇率类型id 或 汇率类型code 示例：lzsrm3iy |
| exchRate | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 汇率，最多是20位数，最大精度为8位 示例：1 |
| taxRate | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 税率，最多是20位数，最大精度为8位 示例：9 |
| totalQuantity | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 总数量，最多是20位数，最大精度为8位 示例：0.1 |
| nativeSum | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 本币含税金额；小数位数取自单据上[本币]对应的币种档案上设置的“金额精度”，最多是20位数，最大精度为8位 示例：0.103 |
| creator | string | 否 | 否 | 创建人 示例：17600880447 |
| createDate | string | 否 | 否 | 创建日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-04-22 |
| creatorId | long | 否 | 否 | 创建人id 示例：2057529564270848 |
| isWfControlled | boolean | 否 | 否 | 是否为审批流控制，由系统业务自动生成，接口无需传值。 示例：false |
| verifystate | string | 否 | 否 | 审批状态，由系统业务自动生成，接口无需传值。 |
| returncount | long | 否 | 否 | 退回次数 示例：0 |
| bizFlow | string | 否 | 否 | 流程ID 示例：105702af-39cd-11eb-a279-0624d60000dc |
| isReturn | boolean | 否 | 否 | 退货:交易类型参数退货属性 示例：false |
| isFlowCoreBill | boolean | 否 | 否 | 是否流程核心单据 示例：false |
| bizFlow_version | string | 否 | 否 | 版本信息 示例：V1.0 |
| srcBill | long | 否 | 否 | 来源单据id 示例：2222029029429504 |
| headItem | object | 否 | 否 | 表头自定义项 |
| headFreeItem | object | 否 | 否 | 表头自由自定义项 |
| arrivalOrders | object | 是 | 是 | 到货单子表数据 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| arrivalSaveAndAuditFlag | boolean | 否 | 否 | 供应商协同时，true：保存后自动审核；false：保存后不自动审核 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/scm/arrivalorder/singleSave_v1?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 1997044387060645896,
		"purchaseOrg": "1796944956870912",
		"org": "1796944956870912",
		"inInvoiceOrg": "1796944956870912",
		"code": "DH21042200000005",
		"isContract": false,
		"vouchdate": "2021-04-23 00:00:00",
		"busType": "1988954591564032",
		"vendor": "1797689091543296",
		"purchaseDepartment": "1997049085754867715",
		"purchaseAgent": "1997049085754867716",
		"retailInvestors": false,
		"invoiceSupplier": "1797689091543296",
		"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"exchRateType": "lzsrm3iy",
		"exchRate": 1,
		"taxRate": 9,
		"totalQuantity": 0.1,
		"nativeSum": 0.103,
		"creator": "17600880447",
		"createDate": "2021-04-22",
		"creatorId": 2057529564270848,
		"isWfControlled": false,
		"verifystate": "",
		"returncount": 0,
		"bizFlow": "105702af-39cd-11eb-a279-0624d60000dc",
		"isReturn": false,
		"isFlowCoreBill": false,
		"bizFlow_version": "V1.0",
		"srcBill": 2222029029429504,
		"headItem": {
			"id": "12343123433434",
			"define1": "12343123433434",
			"define2": "1234321232234"
		},
		"headFreeItem": {
			"id": "1234321232234",
			"define1": "2343234345435",
			"define2": "3454345434543"
		},
		"arrivalOrders": [
			{
				"id": 1997052573268312064,
				"_status": "Insert",
				"makeRule": "77726760",
				"source": "st_purchaseorder",
				"sourceMainPubts": "2021-04-22 14:55:12",
				"makeRuleCode": "st_purchaseorder2",
				"productsku": "1791341692113152",
				"product": "1791341684347136",
				"arrivalInspect": true,
				"warehousingByResult": true,
				"oriUnitPrice": 1,
				"oriTaxUnitPrice": 1.03,
				"oriMoney": 0.1,
				"oriSum": 0.103,
				"oriTax": 0.003,
				"taxitems_code": "VAT13",
				"natUnitPrice": 1,
				"natTaxUnitPrice": 1.03,
				"natMoney": 0.1,
				"natSum": 0.103,
				"natTax": 0.003,
				"qty": 0.1,
				"rowno": 10,
				"upcode": "CGA20002000408",
				"sourceautoid": 2222029029445888,
				"sourceid": 2222029029429504,
				"warehouse": "1730495165452544",
				"unit": "1730486466924800",
				"purUOM": "1730486466924800",
				"invExchRate": 1,
				"priceUOM": "1730486466924800",
				"invPriceExchRate": 1,
				"isGift": false,
				"DemandOrg": "1796944956870912",
				"isBatchManage": false,
				"isExpiryDateManage": false,
				"unitExchangeType": 0,
				"firstsourceid": 2222029029429504,
				"firstsourceautoid": 2222029029445888,
				"firstsource": "st_purchaseorder",
				"firstupcode": "CGA20002000408",
				"realProductAttribute": "1",
				"realProductAttributeType": "1",
				"discountTaxType": 0,
				"project_code": "23345502000408",
				"sourceProDescFlag": "0",
				"isLogisticsRelated": false,
				"unitExchangeTypePrice": 0,
				"acceptqty": 0.1,
				"refuseqty": 1.9,
				"subQty": 0.1,
				"purchaseAcceptQty": 0.1,
				"purchaseRefuseQty": 3.7,
				"priceQty": 0.1,
				"valuationRefuseQty": 12,
				"valuationAcceptQty": 0.1,
				"bodyItem": {
					"id": "234323454345",
					"define1": "234344345454",
					"define2": "3456765445654"
				},
				"bodyFreeItem": {
					"id": "234323454345",
					"define1": "234323454345",
					"define2": "345434543454"
				},
				"bodyParallel": {
					"erpArrivalOrderId": "3456765445654",
					"erpArrivalOrderBodyId": "3456765445654"
				}
			}
		],
		"_status": "Insert",
		"arrivalSaveAndAuditFlag": false
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
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| currency_priceDigit | string | 否 | 币种单价精度 示例：6 |
| srcBill | long | 否 | 来源单据ID 示例：2222029029429504 |
| natCurrency | string | 否 | 本币 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| totalQuantity | number |
| 小数位数:8,最大长度:28 | 否 | 总数量 示例：0.1 |
| inInvoiceOrg | string | 否 | 收票组织id 示例：1796944956870912 |
| id | long | 否 | 主表id 示例：2226185570210048 |
| busType | string | 否 | 交易类型 示例：1988954591564032 |
| purchaseOrg | string | 否 | 采购组织id 示例：1796944956870912 |
| tenant | long | 否 | 租户id 示例：1730438231412992 |
| isWfControlled | boolean | 否 | 是否审批流控制 示例：false |
| vendor_name | string | 否 | 供货供应商 示例：沙漏供应商 |
| purchaseOrg_name | string | 否 | 采购组织 示例：沙漏（销售+开票） |
| barCode | string | 否 | 单据条码 示例：pu_arrivalorder|2226185570210048 |
| isContract | boolean | 否 | 是否需要与供应商协同 示例：false |
| taxRate | number |
| 小数位数:8,最大长度:28 | 否 | 税率 示例：9 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 示例：6 |
| natCurrency_priceDigit | string | 否 | 本币单价精度 示例：6 |
| exchRateType | string | 否 | 汇率类型 示例：lzsrm3iy |
| invoiceSupplier | long | 否 | 开票供应商 示例：1797689091543296 |
| busType_name | string | 否 | 交易类型名称 示例：测试到货 |
| exchRateType_Digit | string | 否 | 汇率类型精度 示例：6 |
| natCurrency_code | string | 否 | 本币编码 示例：CNY |
| status | long | 否 | 单据状态：0:未审核、1:已审核、2:已关闭、3:审核中 示例：0 |
| returncount | long | 否 | 退回次数 示例：0 |
| currency_moneyDigit | string | 否 | 币种金额精度 示例：6 |
| code | string | 否 | 单据编码 示例：DH21042200000006 |
| arrivalOrders | object | 是 | 子表信息 |
| creatorId | long | 否 | 创建者id 示例：2057529564270848 |
| bizFlow | string | 否 | 流程ID 示例：105702af-39cd-11eb-a279-0624d60000dc |
| exchRate | number |
| 小数位数:8,最大长度:28 | 否 | 汇率 示例：1 |
| currency_code | string | 否 | 币种编码 示例：CNY |
| vouchdate | string | 否 | 单据日期 示例：2021-04-22 00:00:00 |
| natCurrency_name | string | 否 | 本币 示例：人民币 |
| nativeSum | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税金额 示例：0.103 |
| vendor | long | 否 | 供货供应商id 示例：1797689091543296 |
| bizFlow_version | string | 否 | 版本信息 示例：V1.0 |
| currency | string | 否 | 币种编码 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| org_name | string | 否 | 收货组织 示例：沙漏（销售+开票） |
| pubts | string | 否 | 时间戳 示例：2021-04-22 15:13:06 |
| isFlowCoreBill | boolean | 否 | 是否流程核心单据 示例：false |
| isReturn | boolean | 否 | 退货：交易类型参数退货属性 示例：false |
| createDate | string | 否 | 创建时间 示例：2021-04-22 15:13:04 |
| creator | string | 否 | 创建者 示例：17600880447 |
| currency_name | string | 否 | 币种 示例：人民币 |
| org | string | 否 | 收货组织id 示例：1796944956870912 |
| inInvoiceOrg_name | string | 否 | 收票组织 示例：沙漏（销售+开票） |
| exchRateType_name | string | 否 | 基准汇率 示例：基准汇率 |
| retailInvestors | boolean | 否 | 是否散户 示例：false |
| createTime | string | 否 | 创建时间 示例：2021-04-22 15:13:04 |
| invoiceSupplier_name | string | 否 | 开票供应商 示例：沙漏供应商 |
| batchnoCodeRule | string | 否 | 规则 示例：0 |
| bizFlow_name | string | 否 | 流程名称 示例：1209业务流暂估 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"currency_priceDigit": "6",
		"srcBill": 2222029029429504,
		"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"totalQuantity": 0.1,
		"inInvoiceOrg": "1796944956870912",
		"id": 2226185570210048,
		"busType": "1988954591564032",
		"purchaseOrg": "1796944956870912",
		"tenant": 1730438231412992,
		"isWfControlled": false,
		"vendor_name": "沙漏供应商",
		"purchaseOrg_name": "沙漏（销售+开票）",
		"barCode": "pu_arrivalorder|2226185570210048",
		"isContract": false,
		"taxRate": 9,
		"natCurrency_moneyDigit": "6",
		"natCurrency_priceDigit": "6",
		"exchRateType": "lzsrm3iy",
		"invoiceSupplier": 1797689091543296,
		"busType_name": "测试到货",
		"exchRateType_Digit": "6",
		"natCurrency_code": "CNY",
		"status": 0,
		"returncount": 0,
		"currency_moneyDigit": "6",
		"code": "DH21042200000006",
		"arrivalOrders": [
			{
				"purUOM_Precision": "1",
				"purUOM": 1730486466924800,
				"oriTax": 0.003,
				"product_cCode": "00000104",
				"priceUOM_Precision": "1",
				"firstsource": "st_purchaseorder",
				"firstupcode": "CGA20002000408",
				"source": "st_purchaseorder",
				"natTax": 0.003,
				"subQty": 0.1,
				"costedMoney": 0.1,
				"proDescFlag": "0",
				"priceUOM_Code": "001",
				"isLogisticsRelated": false,
				"valuationRefuseQty": 0,
				"product_cName": "liyu内部物料1",
				"refuseqty": 0,
				"isExpiryDateManage": false,
				"id": 2226185570226432,
				"mainid": 2226185570210048,
				"purUOM_Name": "个",
				"oriUnitPrice": 1,
				"natSum": 0.103,
				"realProductAttribute": "1",
				"warehouse": 1730495165452544,
				"valuationAcceptQty": 0.1,
				"unit_name": "个",
				"taxRate": 3,
				"unit": 1730486466924800,
				"productsku": 1791341692113152,
				"warehouse_name": "000",
				"productsku_cCode": "00000104",
				"qty": 0.1,
				"DemandOrg": "1796944956870912",
				"unit_Precision": "1",
				"oriTaxUnitPrice": 1.03,
				"oriMoney": 0.1,
				"invExchRate": 1,
				"discountTaxType": 0,
				"unitExchangeTypePrice": 0,
				"natUnitPrice": 1,
				"firstsourceautoid": 2222029029445888,
				"makeRuleCode": "st_purchaseorder2",
				"productsku_cName": "liyu内部物料1",
				"realProductAttributeType": "1",
				"purUOM_Code": "001",
				"priceUOM": 1730486466924800,
				"invPriceExchRate": 1,
				"isBatchManage": false,
				"isGift": false,
				"firstsourceid": 2222029029429504,
				"pubts": "2021-04-22 15:13:04",
				"purchaseRefuseQty": 0.9,
				"sourceid": 2222029029429504,
				"purchaseAcceptQty": 0.1,
				"rowno": 1,
				"product": 1791341684347136,
				"makeRule": "77726760",
				"sourceMainPubts": "2021-04-22 14:55:12",
				"oriSum": 0.103,
				"sourceProDescFlag": "0",
				"totalInQuantity": 0,
				"unitExchangeType": 0,
				"acceptqty": 0.1,
				"sourceautoid": 2222029029445888,
				"priceQty": 0.1,
				"DemandOrg_name": "沙漏（销售+开票）",
				"upcode": "CGA20002000408",
				"priceUOM_Name": "个",
				"natTaxUnitPrice": 1.03,
				"natMoney": 0.1
			}
		],
		"creatorId": 2057529564270848,
		"bizFlow": "105702af-39cd-11eb-a279-0624d60000dc",
		"exchRate": 1,
		"currency_code": "CNY",
		"vouchdate": "2021-04-22 00:00:00",
		"natCurrency_name": "人民币",
		"nativeSum": 0.103,
		"vendor": 1797689091543296,
		"bizFlow_version": "V1.0",
		"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"org_name": "沙漏（销售+开票）",
		"pubts": "2021-04-22 15:13:06",
		"isFlowCoreBill": false,
		"isReturn": false,
		"createDate": "2021-04-22 15:13:04",
		"creator": "17600880447",
		"currency_name": "人民币",
		"org": "1796944956870912",
		"inInvoiceOrg_name": "沙漏（销售+开票）",
		"exchRateType_name": "基准汇率",
		"retailInvestors": false,
		"createTime": "2021-04-22 15:13:04",
		"invoiceSupplier_name": "沙漏供应商",
		"batchnoCodeRule": "0",
		"bizFlow_name": "1209业务流暂估"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-22

更新

请求说明

更新

请求参数 source

更新

请求参数 firstsource

更新

返回参数 firstsource

更新

返回参数 source

2	2024-11-27

更新

返回参数 natTaxUnitPrice

更新

返回参数 natMoney

重新发布


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

