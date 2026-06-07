---
title: "销售发票详情查询"
apiId: "1437169587130466304"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Sales Invoice"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售发票详情查询

> `ContentType` 请求方式	GET | 分类: Sales Invoice (SCMSD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/sd/vouchersaleinvoice/detail

请求方式	GET

ContentType

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务单据id |

## 3. 请求示例

Url: /yonbip/sd/vouchersaleinvoice/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | number |
| 小数位数:0,最大长度:28 | 否 | 请求状态码 示例：200 |
| message | string | 否 | 请求返回信息 示例：操作成功 |
| data | object | 否 | 请求返回数据体 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| transactionTypeId_name | string | 否 | 交易类型名称 示例：销售发票 |
| invoiceAsynTaxMark | boolean | 否 | 发票同步税务成功标志 示例：false |
| currency_priceDigit | number |
| 小数位数:0,最大长度:28 | 否 | 币种价格精度 示例：2 |
| invAgentId | number |
| 小数位数:0,最大长度:28 | 否 | 开票客户 示例：2667631127433984 |
| invDirection | number |
| 小数位数:0,最大长度:28 | 否 | 发票方向（红票：1，蓝票：2） 示例：2 |
| oriTax | number |
| 小数位数:8,最大长度:28 | 否 | 税额 示例：12.65 |
| masterOrgKeyField | string | 否 | 主组织key 示例：orgId |
| source | string | 否 | 来源单据id 示例：voucher_order |
| isInvalidInvoice | boolean | 否 | 是否已作废 示例：false |
| redType | object | 否 | 红冲类型 示例：1 |
| natTax | number |
| 小数位数:8,最大长度:28 | 否 | 本币税额 示例：12.65 |
| natCurrency | string | 否 | 本币id 示例：2364609091195136 |
| isNotSendTax | boolean | 否 | 是否与税务云集成 示例：false |
| invoiceTitleType | number |
| 小数位数:0,最大长度:28 | 否 | 发票抬头类型（"企业":0,"个人":1,"非营利组织":2） 示例：0 |
| invoiceType | number |
| 小数位数:0,最大长度:28 | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、5：增值税电子普通发票(成品油)、6：增值税普通发票(成品油)、7：增值税专用发票(成品油)、8：电子收购发票、9：增值税电子专用发票、10：电子发票（增值税专用发票）、11:电子发票（普通发票）、12:数电纸质发票（增值税专用发票）、13:数电纸质发票（普通发票） 示例：0 |
| modifyInvoiceType | boolean | 否 | 发票类型是否可改 示例：true |
| id | number |
| 小数位数:0,最大长度:28 | 否 | 单据id 示例：2731292453179904 |
| orgName | string | 否 | 开票组织名称 示例：小黄公司 |
| isWfControlled | boolean | 否 | 是否开启审批流控制 示例：false |
| agentName | string | 否 | 客户名称 示例：小黄客户 |
| agentRelationId | number |
| 小数位数:0,最大长度:28 | 否 | 客户交易关系id 示例：2667631131087616 |
| natSum | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税金额 示例：110 |
| wholeDiscountRate | number |
| 小数位数:8,最大长度:28 | 否 | 整单扣率% 示例：100 |
| wholeFavorableRate | number |
| 小数位数:8,最大长度:28 | 否 | 整单倒扣% 示例：0 |
| natCurrency_moneyDigit | number |
| 小数位数:0,最大长度:28 | 否 | 本币金额精度 示例：2 |
| taxEnable | boolean | 否 | 是否开通税务 示例：true |
| natCurrency_priceDigit | number |
| 小数位数:0,最大长度:28 | 否 | 本币价格精度 示例：2 |
| invAgentName | string | 否 | 开票客户名称 示例：小黄客户 |
| receievInvoiceMobile | string | 否 | 收票手机号 |
| receievInvoiceEmail | string | 否 | 收票邮箱 |
| isIssueRedInvoice | boolean | 否 | 是否已开红票 示例：false |
| oriMoney | number |
| 小数位数:8,最大长度:28 | 否 | 无税金额 示例：97.35 |
| natCurrency_code | string | 否 | 本币编码 示例：CNY |
| status | number |
| 小数位数:0,最大长度:28 | 否 | 单据状态（0:开立,3:审核中,1:已审核,2:已关闭） 示例：0 |
| verifystate | number |
| 小数位数:0,最大长度:28 | 否 | 审批状态（0：开立，1：审批中，2：审批完成，3：流程终止） 示例：0 |
| currency_moneyDigit | number |
| 小数位数:0,最大长度:28 | 否 | 币种金额精度 示例：2 |
| agentId | number |
| 小数位数:0,最大长度:28 | 否 | 客户id 示例：2667631127433984 |
| code | string | 否 | 单据编码 示例：TI8208220414000001 |
| exchangeRateType!name | string | 否 | 汇率类型名称 示例：基准汇率 |
| creatorId | number |
| 小数位数:0,最大长度:28 | 否 | 创建人id 示例：2663658666644992 |
| bizFlow | string | 否 | 流程id 示例：a85befb3-bafc-11ec-976e-b8599f51a276 |
| exchRate | number |
| 小数位数:8,最大长度:28 | 否 | 汇率 示例：1 |
| orgId | string | 否 | 开票组织id 示例：2647760533918208 |
| currency_code | string | 否 | 币种编码 示例：CNY |
| vouchdate | string | 否 | 单据日期 示例：2022-04-14 00:00:00 |
| natCurrency_name | string | 否 | 本币名称 示例：人民币 |
| businessState | number |
| 小数位数:0,最大长度:28 | 否 | 发票业务状态(0:开票中、3:已作废、4:已红冲) 示例：1 |
| taxBillingStatus | number |
| 小数位数:0,最大长度:28 | 否 | 税务开票状态 0:开票中、1:未开税票、2:已开税票、3:开票失败 示例：1 |
| bizFlow_version | string | 否 | 流程版本 示例：V2.0 |
| currency | string | 否 | 币种id 示例：2364609091195136 |
| issuedTaxQty | number |
| 小数位数:8,最大长度:28 | 否 | 开税票数量 |
| issuedTaxAmount | number |
| 小数位数:8,最大长度:28 | 否 | 开税票税额 |
| issuedTaxSum | number |
| 小数位数:8,最大长度:28 | 否 | 开税票含税金额 |
| blueEinvoiceKprq | string | 否 | 蓝字税票日期 |
| natDiscountMoney | number |
| 小数位数:8,最大长度:28 | 否 | 本币整单扣额 示例：11 |
| currency_priceRount | number |
| 小数位数:0,最大长度:28 | 否 | 原币单价舍入方式（RoundingMode（0:ROUND_UP,1:ROUND_DOWN,2:ROUND_CEILING,3:ROUND_FLOOR,4:ROUND_HALF_UP,5:ROUND_HALF_DOWN,6:ROUND_HALF_EVEN,7:ROUND_UNNECESSARY）) 示例：4 |
| pubts | string | 否 | 时间戳 示例：2022-04-14 10:54:22 |
| isFlowCoreBill | boolean | 否 | 是否核心单据 示例：false |
| creator | string | 否 | 创建人 示例：一三 |
| currency_name | string | 否 | 币种名称 示例：人民币 |
| transactionTypeId | string | 否 | 交易类型id 示例：2364609089278215 |
| oriSum | number |
| 小数位数:8,最大长度:28 | 否 | 含税金额 示例：110 |
| invoiceSrcSystem | number |
| 小数位数:0,最大长度:28 | 否 | 发票来源系统（"销售":1,"U订货门户":2,"其他外部系统":3） 示例：2 |
| saleInvoiceDetails | object | 是 | 销售发票详情子集 |
| discountMoney | number |
| 小数位数:8,最大长度:28 | 否 | 整单扣额 示例：24 |
| transTypeKeyField | string | 否 | 交易类型key 示例：transactionTypeId |
| natWithholdingTax | number |
| 小数位数:8,最大长度:28 | 否 | 本币代扣税税额 示例：10 |
| oriWithholdingTax | number |
| 小数位数:8,最大长度:28 | 否 | 代扣税税额 示例：10 |
| currency_moneyRount | number |
| 小数位数:0,最大长度:28 | 否 | 原币金额舍入方式（RoundingMode（0:ROUND_UP,1:ROUND_DOWN,2:ROUND_CEILING,3:ROUND_FLOOR,4:ROUND_HALF_UP,5:ROUND_HALF_DOWN,6:ROUND_HALF_EVEN,7:ROUND_UNNECESSARY）） 示例：4 |
| natCurrency_priceRount | number |
| 小数位数:0,最大长度:28 | 否 | 本币单价舍入方式（RoundingMode（0:ROUND_UP,1:ROUND_DOWN,2:ROUND_CEILING,3:ROUND_FLOOR,4:ROUND_HALF_UP,5:ROUND_HALF_DOWN,6:ROUND_HALF_EVEN,7:ROUND_UNNECESSARY）） 示例：4 |
| retailInvestors | boolean | 否 | 是否散户 示例：false |
| exchangeRateType | string | 否 | 汇率类型id 示例：2364609079120128 |
| erpSystem | number |
| 小数位数:0,最大长度:28 | 否 | 外部系统名称（NC:1,U8:2,U9:3,u8cloud:4） 示例：4 |
| createTime | string | 否 | 创建事件 示例：2022-04-14 10:54:21 |
| natCurrency_moneyRount | number |
| 小数位数:0,最大长度:28 | 否 | 本币金额舍入方式（RoundingMode（0:ROUND_UP,1:ROUND_DOWN,2:ROUND_CEILING,3:ROUND_FLOOR,4:ROUND_HALF_UP,5:ROUND_HALF_DOWN,6:ROUND_HALF_EVEN,7:ROUND_UNNECESSARY）） 示例：4 |
| natMoney | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税金额 示例：97.35 |
| einvoiceNo | string | 否 | 税票代码 示例：12321 |
| einvoiceHm | string | 否 | 税票号码 示例：123 |
| bizFlow_name | string | 否 | 流程名称 示例：1订单直接开票 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"transactionTypeId_name": "销售发票",
		"invoiceAsynTaxMark": false,
		"currency_priceDigit": 2,
		"invAgentId": 2667631127433984,
		"invDirection": 2,
		"oriTax": 12.65,
		"masterOrgKeyField": "orgId",
		"source": "voucher_order",
		"isInvalidInvoice": false,
		"redType": "1",
		"natTax": 12.65,
		"natCurrency": "2364609091195136",
		"isNotSendTax": false,
		"invoiceTitleType": 0,
		"invoiceType": 0,
		"modifyInvoiceType": true,
		"id": 2731292453179904,
		"orgName": "小黄公司",
		"isWfControlled": false,
		"agentName": "小黄客户",
		"agentRelationId": 2667631131087616,
		"natSum": 110,
		"wholeDiscountRate": 100,
		"wholeFavorableRate": 0,
		"natCurrency_moneyDigit": 2,
		"taxEnable": true,
		"natCurrency_priceDigit": 2,
		"invAgentName": "小黄客户",
		"receievInvoiceMobile": "",
		"receievInvoiceEmail": "",
		"isIssueRedInvoice": false,
		"oriMoney": 97.35,
		"natCurrency_code": "CNY",
		"status": 0,
		"verifystate": 0,
		"currency_moneyDigit": 2,
		"agentId": 2667631127433984,
		"code": "TI8208220414000001",
		"exchangeRateType!name": "基准汇率",
		"creatorId": 2663658666644992,
		"bizFlow": "a85befb3-bafc-11ec-976e-b8599f51a276",
		"exchRate": 1,
		"orgId": "2647760533918208",
		"currency_code": "CNY",
		"vouchdate": "2022-04-14 00:00:00",
		"natCurrency_name": "人民币",
		"businessState": 1,
		"taxBillingStatus": 1,
		"bizFlow_version": "V2.0",
		"currency": "2364609091195136",
		"issuedTaxQty": 0,
		"issuedTaxAmount": 0,
		"issuedTaxSum": 0,
		"blueEinvoiceKprq": "",
		"natDiscountMoney": 11,
		"currency_priceRount": 4,
		"pubts": "2022-04-14 10:54:22",
		"isFlowCoreBill": false,
		"creator": "一三",
		"currency_name": "人民币",
		"transactionTypeId": "2364609089278215",
		"oriSum": 110,
		"invoiceSrcSystem": 2,
		"saleInvoiceDetails": [
			{
				"saleOrgId": "2647760533918208",
				"discountRate": 100,
				"favorableRate": 0,
				"oriTax": 12.65,
				"orderId": 2731291792790272,
				"priceUOM_Precision": 2,
				"firstupcode": "UO-820820220414000001",
				"source": "voucher_order",
				"natTax": 12.65,
				"productName": "商城运费模板1",
				"taxItems": "13%",
				"sourceOriPrice": 11,
				"lineDiscountMoney": 18,
				"id": 2731292453179905,
				"chargeUnitName": "瓶",
				"mainid": 2731292453179904,
				"firstlineno": 10,
				"skuId": 2392026622349568,
				"masterTruncationType": 4,
				"orderNo": "UO-820820220414000001",
				"productId": 2392026610897152,
				"unitName": "瓶",
				"oriUnitPrice": 9.74,
				"natSum": 110,
				"taxCode": "VAT13",
				"isScrap": false,
				"rebateMoney": 12,
				"invProductType": "SALE",
				"chargeUnitId": 2370279691358464,
				"taxRate": 13,
				"taxId": "2364609095307520",
				"srcVoucherNo": "UO-820820220414000001",
				"qty": 10,
				"unit_Precision": 2,
				"oriTaxUnitPrice": 11,
				"saleOrgId_name": "小黄公司",
				"oriMoney": 97.35,
				"unitExchangeTypePrice": 1,
				"skuCode": "073125",
				"natUnitPrice": 9.74,
				"isUpdateCost": false,
				"accOrigReceiveMoney": 122,
				"voucher_saleinvoicedetails_userDefine003": 10,
				"voucher_saleinvoicedetails_userDefine002": "UO-820820220414000001",
				"natAccReceiveMoney": 132,
				"firstsourceautoid": 2731291792790273,
				"makeRuleCode": "order_saleinvoice",
				"skuName": "商城运费模板1",
				"invPriceExchRate": 1,
				"lineNatDiscountMoney": 12,
				"unitId": 2370279691358464,
				"firstsourceid": 2731291792790272,
				"sourceid": 2731291792790272,
				"oriSum": 110,
				"salePrice": 11,
				"rebateFlag": false,
				"unitExchangeType": 1,
				"saleCost": 110,
				"priceTruncationType": 4,
				"invoiceSource": 1,
				"cashRebateMoney": 11,
				"orderRebateMoney": 13,
				"orderDetailId": 2731291792790273,
				"lineAgentId": 2667631127433984,
				"sourceautoid": 2731291792790273,
				"lineno": 10,
				"productCode": "073125",
				"priceQty": 10,
				"issuedTaxQty": 0,
				"issuedTaxAmount": 0,
				"issuedTaxSum": 0,
				"uplineno": 10,
				"natTaxUnitPrice": 11,
				"priceMark": true,
				"natMoney": 97.35,
				"isAdvRecInv": true,
				"prepayInvRvnRecogBkgMeth": "",
				"offsetAdvRecInv": true,
				"offsetNo": 0,
				"offsetId": 0,
				"offsetAdvRecInvQty": 0,
				"offsetAdvRecInvMoney": 0,
				"offsetAdvRecInvNatMoney": 0,
				"offsetAdvRecInvTaxMoney": 0,
				"offsetAdvRecInvNatTaxMoney": 0,
				"lineAgentId_name": "小黄客户",
				"salesoutAccountingMethod": "invoiceConfirm",
				"costBillNoType": "voucher_saleinvoice",
				"blueInvlineno": "10",
				"totalRedQty": "10",
				"totalRedPriceQty": {},
				"totalRedOrisum": "100",
				"checkByRevenueManagement": false,
				"issuedRevSettleInfo": false,
				"taxCodeId": "",
				"taxCode_taxCode": "",
				"batchNo": "1",
				"excessiveSigning": "1",
				"calBase": "0",
				"priceDate": "",
				"noTaxSaleCost": 0,
				"noTaxSalePrice": 0,
				"carryOverOfCostMethod": "",
				"invExchRateNum": 1,
				"sourcesys": "",
				"advancePaymentOffsetMethod": "",
				"invExchRateDen": 1,
				"invPriceExchRateNum": 1,
				"invPriceExchRateDen": 1
			}
		],
		"discountMoney": 24,
		"transTypeKeyField": "transactionTypeId",
		"natWithholdingTax": 10,
		"oriWithholdingTax": 10,
		"currency_moneyRount": 4,
		"natCurrency_priceRount": 4,
		"retailInvestors": false,
		"exchangeRateType": "2364609079120128",
		"erpSystem": 4,
		"createTime": "2022-04-14 10:54:21",
		"natCurrency_moneyRount": 4,
		"natMoney": 97.35,
		"einvoiceNo": "12321",
		"einvoiceHm": "123",
		"bizFlow_name": "1订单直接开票"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-21

新增

返回参数 (4)

更新

返回参数 (33)

换算比分子分母

2	2025-12-12

更新

请求说明

新增

返回参数 (10)

增加“预收款开票冲抵方式”

3	2025-12-02

更新

请求说明

新增

返回参数 (9)

销售发票新增代扣税和本币代扣税字段

4	2025-11-19

更新

请求说明

新增

返回参数 (7)

NBJY-37168-【日常环境】【蓝字税票日期】销售发票列表查询和详情查询API接口没有增加蓝字税票日期

5	2025-08-20

新增

返回参数 carryOverOfCostMethod

新增

返回参数 sourcesys

NBJY-33521-【日常环境】【发出商品】销售发票单个保存和出库推发票接口没有增加结转成本和出库来源系统字段

6	2025-06-19

新增

返回参数 taxCodeId

新增

返回参数 taxCode_taxCode

NBJY-26444-全球化计税引擎：销售发票api接口对税码的处理


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

