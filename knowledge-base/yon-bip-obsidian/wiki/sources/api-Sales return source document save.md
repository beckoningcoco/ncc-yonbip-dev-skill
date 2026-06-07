---
title: "销售退货来源生单保存"
apiId: "2361922697940697088"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Return"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Return]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售退货来源生单保存

> `ContentType	application/json` 请求方式	POST | 分类: Sales Return (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/SCC/vouchersaleReturn/saveFromSaleReturn

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
| data | object | 否 | 是 | 退货单[voucher.salereturn.SaleReturn] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| vouchdate | string | 否 | 否 | 单据日期 示例：2025-10-11 |
| code | string | 否 | 否 | 单据编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 示例： UR-214720251022000005 |
| transactionTypeId | string | 否 | 是 | 交易类型，传Id或code 示例：2350786624721665 |
| saleReturnSourceType | string | 否 | 是 | 退货类型, DELIVERYEND:销售出库单；ORDER:销售订单；RETURNORDER:退货订单 示例：DELIVERYEND |
| saleReturnDetails | object | 是 | 是 | 退货单子表数据 |
| _status | string | 否 | 是 | 操作标识, Insert:新增 示例：Insert |

## 3. 请求示例

Url: /yonbip/SCC/vouchersaleReturn/saveFromSaleReturn?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"vouchdate": "2025-10-11",
		"code": " UR-214720251022000005",
		"transactionTypeId": "2350786624721665",
		"saleReturnSourceType": "DELIVERYEND",
		"saleReturnDetails": [
			{
				"qty": 1,
				"subQty": 1,
				"stockId": "12312312312312312",
				"batchNo": "VT001",
				"skuId": "1232132133423423",
				"sourceid": 2669303750956032,
				"sourceautoid": 2669303750956033,
				"originalOrderSupplyAgain": false,
				"newOrderSupplyAgain": false,
				"_status": "Insert"
			}
		],
		"_status": "Insert"
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时的返回数据 |
| natCurrencyCode | string | 否 | 本币简称 示例：CNY |
| returnStatus | string | 否 | 退货状态，SUBMITSALERETURN:待退货审核、CONFIRMSALERETURNORDER:待退货、SALERETURNING:退货中、ENDSALERETURN:已完成、OPPOSESALERETURN:已驳回、 示例：SUBMITSALERETURN |
| payMoneyDomestic | number |
| 小数位数:2,最大长度:10 | 否 | 本币退货金额 示例：0.44 |
| settlementOrgId_name | string | 否 | 开票组织名称 示例：二狗超市第一站(沧浩采购订单内抛） |
| natCurrency | string | 否 | 本币pk 示例：2022886079985614899 |
| bizId | number |
| 小数位数:0,最大长度:16 | 否 | 供应商id 示例：3858347585608816 |
| id | string | 否 | 单据主表id 示例：2362659276325388294 |
| agentId_name | string | 否 | 客户名称 示例：沧浩客户（采购订单内抛） |
| payMoneyOrigTaxfree | number |
| 小数位数:2,最大长度:10 | 否 | 无税退货金额 示例：1.97 |
| salesOrgId_code | string | 否 | 销售组织编码 示例：ergcanghao |
| totalMoney | number |
| 小数位数:0,最大长度:10 | 否 | 总金额 示例：2 |
| saleReturnStatus | string | 否 | 单据状态, SUBMITSALERETURN:开立、CONFIRMSALERETURNORDER:已确认、SALERETURNING:退货中、ENDSALERETURN:已审核、OPPOSESALERETURN:已驳回、 示例：SUBMITSALERETURN |
| wholeDiscountRate | number |
| 小数位数:0,最大长度:10 | 否 | 整单扣率 示例：100 |
| rebateToOrderMoneyOrigTaxfree | number |
| 小数位数:0,最大长度:10 | 否 | 无税整单返利金额 示例：0 |
| status | number |
| 小数位数:0,最大长度:10 | 否 | 单据状态，0：待退货审批；1：待退货；2退货中；3已完成；4：已驳回；5审批中 示例：0 |
| deliverierId | number |
| 小数位数:0,最大长度:10 | 否 | 发货人id 示例：0 |
| currency_moneyDigit | number |
| 小数位数:0,最大长度:10 | 否 | 原币金额精度 示例：2 |
| verifystate | number |
| 小数位数:0,最大长度:10 | 否 | 审批状态，0:未提交、1:已提交、2:已审批 示例：0 |
| rebateToCashMoneyDomestic | number |
| 小数位数:0,最大长度:10 | 否 | 本币含税抵现返利金额 示例：0 |
| rebateToCashMoney | number |
| 小数位数:0,最大长度:10 | 否 | 抵现返利金额 示例：0 |
| vouchdate | string | 否 | 单据日期 示例：2025-09-19 00:00:00 |
| offerSaleCost | number |
| 小数位数:0,最大长度:10 | 否 | 报价含税金额 示例：0 |
| taxInclusive | string | 否 | 单价含税, true:是、false:否、 示例：true |
| payMoney | number |
| 小数位数:0,最大长度:10 | 否 | 退货金额 示例：2 |
| exchRateOps | number |
| 小数位数:0,最大长度:10 | 否 | 汇率折算方式 示例：1 |
| invoiceAgentId_code | string | 否 | 开票客户编码 示例：canghao |
| exchRateDate | string | 否 | 汇率日期 示例：2025-09-19 00:00:00 |
| currency | string | 否 | 币种id 示例：2022886079985614910 |
| pubts | string | 否 | 时间戳 示例：2025-09-19 10:42:22 |
| isFlowCoreBill | string | 否 | 是否流程核心单据 示例：false |
| wholeDiscountMoney | number |
| 小数位数:0,最大长度:10 | 否 | 整单扣额 示例：0 |
| createDate | string | 否 | 制单时间 示例：2025-09-19 10:42:22 |
| refundAmount | number |
| 小数位数:0,最大长度:10 | 否 | 退款金额 示例：0 |
| creator | string | 否 | 制单人 示例：123asd |
| rebateToCashMoneyOrigTaxfree | number |
| 小数位数:0,最大长度:10 | 否 | 无税抵现返利金额 示例：0 |
| uordercorp | number |
| 小数位数:0,最大长度:16 | 否 | 租户id 示例：3858347585608816 |
| transactionTypeId | string | 否 | 交易类型id 示例：2022886861692207572 |
| taxSettingType | number |
| 小数位数:0,最大长度:10 | 否 | 计税方式 示例：0 |
| createTime | string | 否 | 制单时间 示例：2025-09-19 10:42:22 |
| currencyCode | string | 否 | 原币简称 示例：TWD |
| invoiceUpcType | number |
| 小数位数:0,最大长度:10 | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、5：增值税电子普通发票(成品油)、6：增值税普通发票(成品油)、7：增值税专用发票(成品油)、8：电子收购发票、9：增值税电子专用发票、10：电子发票（增值税专用发票）、11:电子发票（普通发票）、12:数电纸质发票（增值税专用发票）、13:数电纸质发票（普通发票） 示例：0 |
| totalOriTax | number |
| 小数位数:2,最大长度:10 | 否 | 税额 示例：0.03 |
| transactionTypeId_name | string | 否 | 交易类型名称 示例：销售退货 |
| currency_priceDigit | number |
| 小数位数:0,最大长度:10 | 否 | 原币单价精度 示例：2 |
| source | string | 否 | 来源单据类型 示例：voucher_saleoutlist_pull |
| realMoney | number |
| 小数位数:0,最大长度:10 | 否 | 应付金额 示例：2 |
| bdInvoiceTypeName | string | 否 | 发票类型名称 示例：收据 |
| invoiceTitleType | number |
| 小数位数:0,最大长度:10 | 否 | 抬头类型, 0:企业、1:个人、2:非营利组织、 示例：0 |
| modifyInvoiceType | string | 否 | 发票类型是否可改, true:是、false:否、 示例：true |
| billBusinessType | number |
| 小数位数:0,最大长度:10 | 否 | 业务类型 示例：0 |
| natCurrencyName | string | 否 | 本币 示例：人民币 |
| refundUnConfirmMoney | number |
| 小数位数:0,最大长度:10 | 否 | 退款未确认金额 示例：0 |
| bdInvoiceTypeId | string | 否 | 发票类型,0:收据,1:增值税电子普通发票,2:增值税电子专用发票,3:增值税普通发票,4:增值税专用发票,5:机动车销售统一发票,8:增值税电子普通发票（成品油）,10:增值税普通发票（成品油）,11:增值税专用发票（成品油）,e0:电子收购发票, 31:电子发票（增值税专用发票）,32:电子发票（普通发票）,33:数电纸质发票（增值税专用发票）,34:数电纸质发票（普通发票） 示例：0 |
| agentRelationId | string | 否 | 客户交易关系id 示例：2064296522571317251 |
| invoiceAgentId | string | 否 | 开票客户id 示例：2064296513981382664 |
| yTenantId | string | 否 | 租户id 示例：0000LXK2JBVL70GWEC0000 |
| barCode | string | 否 | 条形码 示例：voucher_salereturn|2362659276325388294 |
| rebateToOrderMoney | number |
| 小数位数:0,最大长度:10 | 否 | 整单返利金额 示例：0 |
| payMoneyDomesticTaxfree | number |
| 小数位数:2,最大长度:10 | 否 | 本币无税退货金额 示例：0.43 |
| rebateToCashMoneyDomesticTaxfree | number |
| 小数位数:0,最大长度:10 | 否 | 本币无税抵现返利金额 示例：0 |
| settlementOrgId_code | string | 否 | 开票组织编码 示例：ergcanghao |
| settlementOrgId | string | 否 | 开票组织 示例：2064284273340317727 |
| totalNatTax | number |
| 小数位数:2,最大长度:10 | 否 | 本币税额 示例：0.01 |
| agentId_code | string | 否 | 客户编码 示例：canghao |
| agentId | string | 否 | 客户 示例：2064296513981382664 |
| code | string | 否 | 单据编号 示例：UR-206420250919000002 |
| rebateToOrderMoneyDomesticTaxfree | number |
| 小数位数:0,最大长度:10 | 否 | 本币无税整单返利金额 示例：0 |
| creatorId | string | 否 | 制单人 示例：2023649244138176514 |
| bizFlow | string | 否 | 流程id 示例：ab9b5aeb-2e70-487b-8212-08c7131babb1 |
| exchRate | number |
| 小数位数:6,最大长度:10 | 否 | 汇率 示例：0.219298 |
| refundConfirmMoney | number |
| 小数位数:0,最大长度:10 | 否 | 退款已确认金额 示例：0 |
| currencyName | string | 否 | 币种 示例：新台币 |
| totalMoneyDomesticTaxfree | number |
| 小数位数:2,最大长度:10 | 否 | 本币无税总金额 示例：0.43 |
| bizFlow_version | string | 否 | 版本信息 示例：V1.0 |
| saleReturnDetails | object | 是 | 退货单详情[voucher.salereturn.SaleReturnDetail] |
| saleReturnMemoId | string | 否 | 备注id 示例：2362659276325388294 |
| saleReturnSourceType | string | 否 | 退货类型, NONE:无来源、DELIVERYEND:销售出库单、 示例：DELIVERYEND |
| rebateToOrderMoneyDomestic | number |
| 小数位数:0,最大长度:10 | 否 | 本币含税整单返利金额 示例：0 |
| deliverTime | string | 否 | 出库时点，DELIVEAFTERCONFIRM：确认后出库，DELIVEAFTERAUDIT：审核后出库 示例：DELIVEAFTERAUDIT |
| invoiceAgentId_name | string | 否 | 开票客户 示例：沧浩客户（采购订单内抛） |
| totalMoneyDomestic | number |
| 小数位数:2,最大长度:10 | 否 | 本币总金额 示例：0.44 |
| ytenant | string | 否 | 租户id 示例：0000LXK2JBVL70GWEC0000 |
| retailInvestors | string | 否 | 是否散户 示例：false |
| bdInvoiceTypeCode | string | 否 | 发票类型编码 示例：0 |
| exchangeRateType | string | 否 | 汇率类型Id 示例：0000LXK2JBVL70GWEC0000 |
| totalMoneyOrigTaxfree | number |
| 小数位数:2,最大长度:10 | 否 | 无税总金额 示例：1.97 |
| salesOrgId_name | string | 否 | 销售组织名称 示例：二狗超市第一站(沧浩采购订单内抛） |
| salesOrgId | string | 否 | 销售组织id 示例：2064284273340317727 |
| bizFlow_name | string | 否 | 流程名称 示例：普通销售（无发货） |
| saleReturnMemo!uordercorp | number |
| 小数位数:0,最大长度:16 | 否 | 租户id 示例：3858347585608816 |
| saleReturnMemo!voucherType | string | 否 | 表头备注单据类型 示例：SALERETURN |
| saleReturnMemo!ytenant | string | 否 | 表头备注租户id 示例：0000LXK2JBVL70GWEC0000 |
| saleReturnMemo!remark | string | 否 | 表头备注内容 示例：123 |
| saleReturnMemo!userId | string | 否 | 表头备注用户id 示例：2023649244138176514 |
| saleReturnMemo!yTenantId | string | 否 | 表头备注租户id 示例：0000LXK2JBVL70GWEC0000 |
| saleReturnMemo!voucherNo | string | 否 | 表头备注单据编码 示例：UR-206420250919000002 |
| saleReturnMemo!id | string | 否 | 备注id 示例：2362659276325388294 |
| saleReturnMemo!pubts | string | 否 | 备注时间戳 示例：2025-09-19 10:42:22 |
| creatorId_code | string | 否 | 制单人 示例：YHT-286-2111557133351262 |
| pubuts | string | 否 | 时间戳 示例：2025-09-19 10:42:22 |
| natCurrency_priceDigit | number |
| 小数位数:0,最大长度:10 | 否 | 本币单价精度 示例：4 |
| refundStatus | string | 否 | 退货单退款状态, NONE:全部未退款、PARTNONECONFIRM:部分退款待审核、PARTNONE:部分退款、CONFIRM:退款待审批、FINISH:已退款、 示例：NONE |
| transactionTypeId_code | string | 否 | 交易类型编码 示例：RET001 |
| settlementVersion | number |
| 小数位数:0,最大长度:10 | 否 | 结算版本 示例：0 |
| natCurrency_moneyDigit | number |
| 小数位数:0,最大长度:10 | 否 | 本币金额精度 示例：2 |
| exchangeRateType!name | string | 否 | 汇率类型名称 示例：基准汇率 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"natCurrencyCode": "CNY",
		"returnStatus": "SUBMITSALERETURN",
		"payMoneyDomestic": 0.44,
		"settlementOrgId_name": "二狗超市第一站(沧浩采购订单内抛）",
		"natCurrency": "2022886079985614899",
		"bizId": 3858347585608816,
		"id": "2362659276325388294",
		"agentId_name": "沧浩客户（采购订单内抛）",
		"payMoneyOrigTaxfree": 1.97,
		"salesOrgId_code": "ergcanghao",
		"totalMoney": 2,
		"saleReturnStatus": "SUBMITSALERETURN",
		"wholeDiscountRate": 100,
		"rebateToOrderMoneyOrigTaxfree": 0,
		"status": 0,
		"deliverierId": 0,
		"currency_moneyDigit": 2,
		"verifystate": 0,
		"rebateToCashMoneyDomestic": 0,
		"rebateToCashMoney": 0,
		"vouchdate": "2025-09-19 00:00:00",
		"offerSaleCost": 0,
		"taxInclusive": "true",
		"payMoney": 2,
		"exchRateOps": 1,
		"invoiceAgentId_code": "canghao",
		"exchRateDate": "2025-09-19 00:00:00",
		"currency": "2022886079985614910",
		"pubts": "2025-09-19 10:42:22",
		"isFlowCoreBill": "false",
		"wholeDiscountMoney": 0,
		"createDate": "2025-09-19 10:42:22",
		"refundAmount": 0,
		"creator": "123asd",
		"rebateToCashMoneyOrigTaxfree": 0,
		"uordercorp": 3858347585608816,
		"transactionTypeId": "2022886861692207572",
		"taxSettingType": 0,
		"createTime": "2025-09-19 10:42:22",
		"currencyCode": "TWD",
		"invoiceUpcType": 0,
		"totalOriTax": 0.03,
		"transactionTypeId_name": "销售退货",
		"currency_priceDigit": 2,
		"source": "voucher_saleoutlist_pull",
		"realMoney": 2,
		"bdInvoiceTypeName": "收据",
		"invoiceTitleType": 0,
		"modifyInvoiceType": "true",
		"billBusinessType": 0,
		"natCurrencyName": "人民币",
		"refundUnConfirmMoney": 0,
		"bdInvoiceTypeId": "0",
		"agentRelationId": "2064296522571317251",
		"invoiceAgentId": "2064296513981382664",
		"yTenantId": "0000LXK2JBVL70GWEC0000",
		"barCode": "voucher_salereturn|2362659276325388294",
		"rebateToOrderMoney": 0,
		"payMoneyDomesticTaxfree": 0.43,
		"rebateToCashMoneyDomesticTaxfree": 0,
		"settlementOrgId_code": "ergcanghao",
		"settlementOrgId": "2064284273340317727",
		"totalNatTax": 0.01,
		"agentId_code": "canghao",
		"agentId": "2064296513981382664",
		"code": "UR-206420250919000002",
		"rebateToOrderMoneyDomesticTaxfree": 0,
		"creatorId": "2023649244138176514",
		"bizFlow": "ab9b5aeb-2e70-487b-8212-08c7131babb1",
		"exchRate": 0.219298,
		"refundConfirmMoney": 0,
		"currencyName": "新台币",
		"totalMoneyDomesticTaxfree": 0.43,
		"bizFlow_version": "V1.0",
		"saleReturnDetails": [
			{
				"discountRate": 100,
				"qtyName": "小数点后1位",
				"freeLineSaleCost": 0,
				"oriTax": 0.03,
				"orderId": "2359902929535631362",
				"priceUOM_Precision": 1,
				"salesOutRowNo": 10,
				"firstsource": "upu.st_purchaseorder",
				"rebateMoneyDomestic": 0,
				"productName": "货主功能测试普通物料001",
				"settlementOrgId_name": "二狗超市第一站(沧浩采购订单内抛）",
				"logisticsOrgId": "2064284273340317727",
				"originalOrderSupplyAgain": "true",
				"isExpiryDateManage": "false",
				"enable": "true",
				"bizId": 3858347585608816,
				"id": "2362659276325388295",
				"firstlineno": 10,
				"productId": "2224599390860345347",
				"orderDetailLineno": 10,
				"natSum": 0.44,
				"saleReturnId": "2362659276325388294",
				"newOrderSupplyAgain": "false",
				"masterUnitId": "2064336543076581383",
				"invExchRate": 1,
				"unitExchangeTypePrice": 0,
				"skuCode": "0003000061",
				"iProductAuxUnitId": "2064336543076581383",
				"makeRuleCode": "salesoutTosalereturn",
				"saleOutClose": "false",
				"lineSaleCost": 0,
				"stockName": "二狗小仓库",
				"invPriceExchRate": 1,
				"isBatchManage": "false",
				"stockOrgId_code": "ergcanghao",
				"pubts": "2025-09-19 10:42:22",
				"sourceid": "2361261728342736906",
				"salesOutCode": "20250917250000000010",
				"oriSum": 2,
				"salePrice": 1,
				"inspectionType": "false",
				"rebateFlag": "false",
				"cashRebateMoney": 0,
				"orderDetailId": "2359902929535631363",
				"isAllowOrginReplenish": "true",
				"productCode": "0003000061",
				"priceQty": 2,
				"saleOutStatus": "NOTDELIVERED",
				"productUnitName": "小数点后1位",
				"stockId": "2064404755762380800",
				"stockOrgId": "2064284273340317727",
				"iProductUnitId": "2064336543076581383",
				"orderProductType": "SALE",
				"natMoney": 0.43,
				"purUOM_Precision": 1,
				"saleReturnNo": "UR-206420250919000002",
				"firstupcode": "250915000015",
				"source": "ustock.st_salesout",
				"natTax": 0.01,
				"realMoney": 2,
				"subQty": 2,
				"taxItems": "1.5%增值税税率",
				"freeTaxUnitOffer": 0,
				"lineDiscountMoney": 0,
				"skuId": "2224599390860345361",
				"orderNo": "2025-0385",
				"oriUnitPrice": 0.99,
				"taxCode": "VATR6",
				"rebateMoney": 0,
				"stockCode": "erg22",
				"taxRate": 1.5,
				"idKey": "10",
				"oriTaxUnitOffer": 0,
				"productAuxUnitName": "小数点后1位",
				"taxId": "10003",
				"qty": 2,
				"unit_Precision": 1,
				"settlementOrgId_code": "二狗超市第一站(沧浩采购订单内抛）",
				"realProductCode": "0003000061",
				"oriTaxUnitPrice": 1,
				"settlementOrgId": "2064284273340317727",
				"oriMoney": 1.97,
				"natUnitPrice": 0.215,
				"isUpdateCost": "true",
				"firstsourceautoid": "2359900636029911049",
				"checkByRevenueManagement": "false",
				"logisticsOrgName": "二狗超市第一站(沧浩采购订单内抛）",
				"isreserve": "false",
				"salesOutId": "2361261728342736906",
				"skuName": "货主功能测试普通物料001",
				"lineNatDiscountMoney": 0,
				"orderRebateMoneyDomestic": 0,
				"retNotNeedInvoiceQty": 0,
				"firstsourceid": "2359900636029911048",
				"custodianType": "0",
				"custodian": 0,
				"unitExchangeType": 0,
				"orderRebateMoney": 0,
				"salesOutDetailId": "2361261728342736907",
				"saleReturnDetailDefineCharacter": {
					"ytenant": "0000LXK2JBVL70GWEC0000",
					"id": "2362659276325388297",
					"pubts": "2025-09-15 13:59:36"
				},
				"sourceautoid": "2361261728342736907",
				"lineno": 10,
				"upcode": "20250917250000000010",
				"uplineno": 10,
				"natTaxUnitPrice": 0.22,
				"priceMark": "true",
				"stockOrgId_name": "二狗超市第一站(沧浩采购订单内抛）",
				"salesOrgId": "2064284273340317727"
			}
		],
		"saleReturnMemoId": "2362659276325388294",
		"saleReturnSourceType": "DELIVERYEND",
		"rebateToOrderMoneyDomestic": 0,
		"deliverTime": "DELIVEAFTERAUDIT",
		"invoiceAgentId_name": "沧浩客户（采购订单内抛）",
		"totalMoneyDomestic": 0.44,
		"ytenant": "0000LXK2JBVL70GWEC0000",
		"retailInvestors": "false",
		"bdInvoiceTypeCode": "0",
		"exchangeRateType": "0000LXK2JBVL70GWEC0000",
		"totalMoneyOrigTaxfree": 1.97,
		"salesOrgId_name": "二狗超市第一站(沧浩采购订单内抛）",
		"salesOrgId": "2064284273340317727",
		"bizFlow_name": "普通销售（无发货）",
		"saleReturnMemo!uordercorp": 3858347585608816,
		"saleReturnMemo!voucherType": "SALERETURN",
		"saleReturnMemo!ytenant": "0000LXK2JBVL70GWEC0000",
		"saleReturnMemo!remark": "123",
		"saleReturnMemo!userId": "2023649244138176514",
		"saleReturnMemo!yTenantId": "0000LXK2JBVL70GWEC0000",
		"saleReturnMemo!voucherNo": "UR-206420250919000002",
		"saleReturnMemo!id": "2362659276325388294",
		"saleReturnMemo!pubts": "2025-09-19 10:42:22",
		"creatorId_code": "YHT-286-2111557133351262",
		"pubuts": "2025-09-19 10:42:22",
		"natCurrency_priceDigit": 4,
		"refundStatus": "NONE",
		"transactionTypeId_code": "RET001",
		"settlementVersion": 0,
		"natCurrency_moneyDigit": 2,
		"exchangeRateType!name": "基准汇率"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-16

更新

请求参数 saleReturnSourceType

更新

请求参数 salereturnDefineCharacter

更新

请求参数 saleReturnDetailDefineCharacter

2	2025-12-09

更新

请求参数 (4)

3	2025-11-28

新增

请求参数 salereturnDefineCharacter

更新

请求参数 saleReturnDetailDefineCharacter

删除

请求参数 saleReturnDefineCharacter


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

