---
title: "销售发票单个保存"
apiId: "0dc3911dfd234c55863c6e372fdd2ddb"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Invoice"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售发票单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Sales Invoice (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/vouchersaleinvoice/singleSave

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
| data | object | 否 | 是 | 销售发票[voucher.invoice.SaleInvoice] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| blueEinvoiceKprq | string | 否 | 否 | 蓝字税票日期 |
| issuedTaxQty | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 开税票数量 |
| issuedTaxAmount | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 开税票税额 |
| issuedTaxSum | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 开税票含税金额 |
| orgId | string | 否 | 是 | 开票组织，传id或者code 示例：2219080280674816 |
| erpSystem | number |
| 小数位数:0,最大长度:28 | 否 | 否 | 外部系统, 1:NC、2:U8、3:U9、4:U8cloud、 示例：4 |
| invoiceSrcSystem | number |
| 小数位数:0,最大长度:28 | 否 | 否 | 来源系统, 1:销售、2:U订货门户、3:其他外部系统、 示例：2 |
| transactionTypeId | string | 否 | 否 | 交易类型，传id或者code 示例：1248018423173393 |
| agentId | string | 否 | 是 | 客户，传id或code 示例：2219081455980800 |
| invAgentId | string | 否 | 是 | 开票客户，传id或code 示例：2219081455980800 |
| code | string | 否 | 否 | 单据编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输； 示例：TI4816210603000003 |
| currency | string | 否 | 是 | 原币，传id或code 示例：2213420703028224 |
| exchangeRateType | string | 否 | 是 | 汇率类型，传id或code 示例：0000KNFNTQ4ZBZAVBV0000 |
| natCurrency | string | 否 | 是 | 本币，传id或code 示例：2213420703028224 |
| isWfControlled | boolean | 否 | 否 | 是否受审批流控制 示例：false |
| vouchdate | string | 否 | 是 | 单据日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2021-06-03 00:00:00 |
| source | string | 否 | 是 | 来源单据类型，voucher_order （销售订单），st_salesout(销售出库单)，voucher_deliverylist（销售发货单），voucher_salereturnlist（销售退货单） 示例：voucher_order |
| invDirection | number |
| 小数位数:0,最大长度:28 | 否 | 是 | 单据方向, 1:红票、2:蓝票、 示例：2 |
| isIssueRedInvoice | boolean | 否 | 否 | 已开红票, true:是、false:否、 示例：false |
| invoiceTitle | string | 否 | 否 | 发票抬头 发票类型是收据时非必填，其他类型必填 示例：AA |
| receievInvoiceMobile | string | 否 | 否 | 收票手机号 示例：17895642311 |
| receievInvoiceEmail | string | 否 | 否 | 收票邮箱 示例：1789564231@qq.com |
| invAgentTaxNo | string | 否 | 否 | 纳税人识别号 发票类型是收据时非必填，其他类型必填 示例：SH999000999 |
| invAgentBank | string | 否 | 否 | 开户银行 发票类型是增值税专用发票必填，其他类型非必填 示例：中国工商银行 |
| invAgentSubBank | string | 否 | 否 | 开户支行 发票类型是增值税专用发票必填，其他类型非必填 示例：中国工商银行股份有限公司天津中北支行 |
| invAgentBankNo | string | 否 | 否 | 银行账号 发票类型是增值税专用发票必填，其他类型非必填 示例：888888888888888 |
| invAgentAdress | string | 否 | 否 | 营业地址 发票类型是增值税专用发票必填，其他类型非必填 示例：天津市 |
| invAgentTel | string | 否 | 否 | 营业电话 发票类型是增值税专用发票必填，其他类型非必填 示例：022-36269520 |
| einvoiceHm | string | 否 | 否 | 税票号码 示例：123651313313 |
| einvoiceNo | string | 否 | 否 | 税票代码 示例：010233 |
| bdInvoiceTypeId | string | 否 | 否 | 发票类型,0:收据,1:增值税电子普通发票,2:增值税电子专用发票,3:增值税普通发票,4:增值税专用发票,5:机动车销售统一发票,8:增值税电子普通发票（成品油）,10:增值税普通发票（成品油）,11:增值税专用发票（成品油）,e0:电子收购发票, 31:数电票（增值税专用发票）,32:数电票（普通发票）,33:数电纸质发票（增值税专用发票）,34:数电纸质发票（普通发票） 示例：0 |
| invoiceType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、5：增值税电子普通发票(成品油)、6：增值税普通发票(成品油)、7：增值税专用发票(成品油)、8：电子收购发票、9：增值税电子专用发票、10：数电票（增值税专用发票）、11:数电票（普通发票）、12:数电纸质发票（增值税专用发票）、13:数电纸质发票（普通发票） 示例：0 |
| invoiceTitleType | string | 否 | 否 | 发票抬头类型, 0:企业、1:个人、2:非营利组织、 发票类型是收据时非必填，其他类型必填 示例：0 |
| modifyInvoiceType | boolean | 否 | 否 | 发票类型是否可改 示例：true |
| exchRate | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 汇率 示例：1 |
| oriSum | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 含税金额 示例：132 |
| oriMoney | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 无税金额 示例：116.81416 |
| oriTax | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 税额 示例：15.18584 |
| natSum | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 本币含税金额 示例：132 |
| natMoney | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 本币无税金额 示例：116.81416 |
| natTax | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 本币税额 示例：15.18584 |
| agentRelationId | number |
| 小数位数:0,最大长度:28 | 否 | 否 | 客户交易关系id 示例：2219081457946893 |
| bizFlow_name | string | 否 | 否 | 流程名称 示例：订单开票 |
| bizFlow_version | string | 否 | 否 | 版本信息 示例：V1.0 |
| bizFlow | string | 否 | 否 | 流程ID 示例：38a845c1-a42e-11eb-a27c-0624d60000dc |
| isFlowCoreBill | boolean | 否 | 否 | 是否流程核心单据 示例：false |
| stockAccount | string | 否 | 否 | 发出商品,期初发出商品:beginningSendGoods,期初发出商品:sendGoods 示例：sendGoods |
| headItem | object | 否 | 否 | 表头自定义项(1-60) |
| headFreeItem | object | 否 | 否 | 表头自由自定义项(1-60) |
| saleInvoiceDetails | object | 是 | 是 | 销售发票子表 |
| _status | string | 否 | 是 | 操作标识，Insert:新增 示例：Insert |

## 3. 请求示例

Url: /yonbip/sd/vouchersaleinvoice/singleSave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"blueEinvoiceKprq": "",
		"issuedTaxQty": 0,
		"issuedTaxAmount": 0,
		"issuedTaxSum": 0,
		"orgId": "2219080280674816",
		"erpSystem": 4,
		"invoiceSrcSystem": 2,
		"transactionTypeId": "1248018423173393",
		"agentId": "2219081455980800",
		"invAgentId": "2219081455980800",
		"code": "TI4816210603000003",
		"currency": "2213420703028224",
		"exchangeRateType": "0000KNFNTQ4ZBZAVBV0000",
		"natCurrency": "2213420703028224",
		"isWfControlled": false,
		"vouchdate": "2021-06-03 00:00:00",
		"source": "voucher_order",
		"invDirection": 2,
		"isIssueRedInvoice": false,
		"invoiceTitle": "AA",
		"receievInvoiceMobile": "17895642311",
		"receievInvoiceEmail": "1789564231@qq.com",
		"invAgentTaxNo": "SH999000999",
		"invAgentBank": "中国工商银行",
		"invAgentSubBank": "中国工商银行股份有限公司天津中北支行",
		"invAgentBankNo": "888888888888888",
		"invAgentAdress": "天津市",
		"invAgentTel": "022-36269520",
		"einvoiceHm": "123651313313",
		"einvoiceNo": "010233",
		"bdInvoiceTypeId": "0",
		"invoiceType": 0,
		"invoiceTitleType": "0",
		"modifyInvoiceType": true,
		"exchRate": 1,
		"oriSum": 132,
		"oriMoney": 116.81416,
		"oriTax": 15.18584,
		"natSum": 132,
		"natMoney": 116.81416,
		"natTax": 15.18584,
		"agentRelationId": 2219081457946893,
		"bizFlow_name": "订单开票",
		"bizFlow_version": "V1.0",
		"bizFlow": "38a845c1-a42e-11eb-a27c-0624d60000dc",
		"isFlowCoreBill": false,
		"stockAccount": "sendGoods",
		"headItem": {
			"id": "131221132131321",
			"define1": "表头自定义项1",
			"define2": "表头自定义项2"
		},
		"headFreeItem": {
			"id": "654561123413453",
			"define1": "表头自由自定义项1",
			"define2": "表头自由自定义项2"
		},
		"saleInvoiceDetails": [
			{
				"issuedTaxSum": 0,
				"issuedTaxAmount": 0,
				"issuedTaxQty": "",
				"source": "voucher_order",
				"makeRuleCode": "order_saleinvoice",
				"saleOrgId": "2219080280674816",
				"costCenter_code": "111",
				"providerProfitCenter_code": "333",
				"consumerProfitCenter_code": "444",
				"salesoutAccountingMethod": "invoiceConfirm",
				"saleDeptId": "",
				"saleDeptName": "",
				"taxIssuedDiscountline": false,
				"srcVoucherNo": "UO-481620210526000008",
				"productId": "2216368330805760",
				"skuId": "2216368337097216",
				"modelDescription": "规格说明85",
				"unitId": "2214783714054400",
				"qty": 6,
				"priceQty": 6,
				"chargeUnitId": "2214783714054400",
				"natUnitPrice": 19.46903,
				"natTaxUnitPrice": 22,
				"natMoney": 116.81416,
				"natSum": 132,
				"natTax": 15.18584,
				"oriUnitPrice": 19.46903,
				"oriTaxUnitPrice": 22,
				"sourceOriPrice": 22,
				"oriMoney": 116.81416,
				"oriSum": 132,
				"oriTax": 15.18584,
				"invPriceExchRate": 1,
				"unitExchangeType": 0,
				"unitExchangeTypePrice": 0,
				"sourceid": 2274590767485440,
				"sourceautoid": 2274590767501825,
				"model": "型号219",
				"orderNo": "UO-481620210526000008",
				"orderId": 2274590767485440,
				"orderDetailId": 2274590767501825,
				"firstsourceid": 2274590767485440,
				"firstsourceautoid": 2274590767501825,
				"firstupcode": "UO-481620210526000008",
				"firstsource": "udinghuo.voucher_order",
				"invProductType": "SALE",
				"isAccEstimate": true,
				"taxId": "2213420705993728",
				"rebateMoney": 1,
				"orderRebateMoney": 1,
				"cashRebateMoney": 1,
				"invoiceSource": 1,
				"costBillNoType": "usp_signconfirmation",
				"isUpdateCost": false,
				"uplineno": "10",
				"stockOrgId": "1981145268531757058",
				"isAdvRecInv": false,
				"prepayInvRvnRecogBkgMeth": "1",
				"calBase": "0",
				"taxCodeId": "",
				"taxCode_taxCode": "",
				"warehouse": "",
				"warehouse_name": "",
				"carryOverOfCostMethod": "",
				"sourcesys": "",
				"excessiveSigning": "1",
				"bodyItem": {
					"id": "564131325",
					"define1": "表体自定义项1",
					"define2": "表体自定义项2"
				},
				"bodyFreeItem": {
					"id": "132132132564",
					"define1": "表体自由自定义项1",
					"define2": "表体自由自定义项2"
				},
				"_status": "Insert",
				"batchNo": "2"
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| blueEinvoiceKprq | string | 否 | 蓝字税票日期 |
| issuedTaxQty | string | 否 | 开税票数量 |
| issuedTaxAmount | string | 否 | 开税票税额 |
| issuedTaxSum | string | 否 | 开税票含税金额 |
| agentConfirmStatus | number |
| 小数位数:0,最大长度:10 | 否 | 客户确认状态 0:无需客户确认、1:未客户确认、2:已客户确认 |
| orgId | string | 否 | 开票组织 |
| id | number |
| 小数位数:0,最大长度:28 | 否 | 主体ID |
| invoiceSrcSystem | number |
| 小数位数:0,最大长度:10 | 否 | 来源系统, 1:销售、2:U订货门户、3:其他外部系统、 |
| erpSystem | number |
| 小数位数:0,最大长度:10 | 否 | 外部系统, 1:NC、2:U8、3:U9、4:U8cloud、 |
| transactionTypeId | string | 否 | 交易类型 |
| blueInvId | number |
| 小数位数:0,最大长度:28 | 否 | 蓝字发票ID |
| agentId | number |
| 小数位数:0,最大长度:28 | 否 | 客户 |
| orgName | string | 否 | 开票组织 |
| invAgentId | number |
| 小数位数:0,最大长度:28 | 否 | 开票客户 |
| billStationId | number |
| 小数位数:0,最大长度:28 | 否 | 开票点ID |
| code | string | 否 | 单据编号 |
| currency | string | 否 | 原币pk |
| currency_priceDigit | number |
| 小数位数:0,最大长度:28 | 否 | 原币价格精度 |
| currency_moneyDigit | number |
| 小数位数:0,最大长度:28 | 否 | 原币金额精度 |
| natCurrency | string | 否 | 本币 |
| natCurrency_priceDigit | number |
| 小数位数:0,最大长度:28 | 否 | 本币单价精度 |
| natCurrency_moneyDigit | number |
| 小数位数:0,最大长度:28 | 否 | 本币金额精度 |
| transactionTypeId_name | string | 否 | 交易类型名称 |
| pubts | string | 否 | 时间戳 |
| isWfControlled | boolean | 否 | 是否受审批流控制 |
| verifystate | number |
| 小数位数:0,最大长度:10 | 否 | 审批流状态 0:未提交, 1:审批中, 2:审批完成, 3:不通过流程终止, 4:驳回到制单 |
| headItem | object | 否 | 表头自定义项 |
| vouchdate | string | 否 | 单据日期 |
| source | string | 否 | 来源单据 |
| agentName | string | 否 | 客户名称 |
| retailInvestors | string | 否 | 是否散户, true:是、false:否、 |
| retailAgentName | string | 否 | 散户名称 |
| invAgentName | string | 否 | 开票客户名称 |
| agentContacts | string | 否 | 客户联系人 |
| agentContactsTel | string | 否 | 联系电话 |
| invDirection | number |
| 小数位数:0,最大长度:10 | 否 | 单据方向, 1:红票、2:蓝票、 |
| blueInvNo | string | 否 | 蓝字发票号 |
| isIssueRedInvoice | boolean | 否 | 已开红票, true:是、false:否、 |
| bdInvoiceTypeId | string | 否 | 发票类型,0:收据,1:增值税电子普通发票,2:增值税电子专用发票,3:增值税普通发票,4:增值税专用发票,5:机动车销售统一发票,8:增值税电子普通发票（成品油）,10:增值税普通发票（成品油）,11:增值税专用发票（成品油）,e0:电子收购发票, 31:电子发票（增值税专用发票）,32:电子发票（普通发票）,33:数电纸质发票（增值税专用发票）,34:数电纸质发票（普通发票） |
| invoiceType | number |
| 小数位数:0,最大长度:10 | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、5：增值税电子普通发票(成品油)、6：增值税普通发票(成品油)、7：增值税专用发票(成品油)、8：电子收购发票、9：增值税电子专用发票、10：电子发票（增值税专用发票）、11:电子发票（普通发票）、12:数电纸质发票（增值税专用发票）、13:数电纸质发票（普通发票） |
| invoiceTitle | string | 否 | 发票抬头 |
| invoiceTitleType | number |
| 小数位数:0,最大长度:10 | 否 | 发票抬头类型, 0:企业、1:个人、2:非营利组织、 |
| modifyInvoiceType | boolean | 否 | 发票类型可改 |
| invAgentTaxNo | string | 否 | 纳税人识别号 |
| receievInvoiceMobile | string | 否 | 收票手机号 |
| receievInvoiceEmail | string | 否 | 收票邮箱 |
| invAgentAdress | string | 否 | 营业地址 |
| invAgentTel | string | 否 | 营业电话 |
| invAgentBank | string | 否 | 开户银行 |
| invAgentSubBank | string | 否 | 开户支行 |
| invAgentBankNo | string | 否 | 银行账号 |
| currencyCode | string | 否 | 原币简称 |
| currencyName | string | 否 | 币种名称 |
| exchangeRateType | string | 否 | 汇率类型Id |
| exchRate | number |
| 小数位数:8,最大长度:28 | 否 | 汇率 |
| natCurrencyCode | string | 否 | 本币简称 |
| natCurrencyName | string | 否 | 本币名称名称 |
| oriSum | number |
| 小数位数:8,最大长度:28 | 否 | 含税金额 |
| oriMoney | number |
| 小数位数:8,最大长度:28 | 否 | 无税金额 |
| oriTax | number |
| 小数位数:8,最大长度:28 | 否 | 税额 |
| natSum | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税金额 |
| natMoney | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税金额 |
| natTax | number |
| 小数位数:8,最大长度:28 | 否 | 本币税额 |
| billStationName | string | 否 | 开票点 |
| billStationCode | string | 否 | 开票点编码 |
| einvoiceHm | string | 否 | 税票号码 |
| einvoiceNo | string | 否 | 税票代码 |
| blueEinvoiceHm | string | 否 | 蓝字税票号码 |
| blueEinvoiceNo | string | 否 | 蓝字税票代码 |
| status | number |
| 小数位数:0,最大长度:10 | 否 | 单据状态, 0:开立、3:审核中、1:已审核、2:已关闭、 |
| businessState | number |
| 小数位数:0,最大长度:10 | 否 | 发票业务状态, 0:开票中、1:未开税票、2:已开税票、3:已作废、4:已红冲、5:作废中、6:红冲中、7:开票失败、 |
| creator | string | 否 | 制单人 |
| createTime | string | 否 | 制单时间 |
| bizFlow | string | 否 | 流程ID |
| isFlowCoreBill | boolean | 否 | 是否流程核心单据 |
| saleInvoiceDetails | object | 是 | 销售发票子表[voucher.invoice.SaleInvoiceDetail] |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"blueEinvoiceKprq": "",
		"issuedTaxQty": "",
		"issuedTaxAmount": "",
		"issuedTaxSum": "",
		"agentConfirmStatus": 0,
		"orgId": "",
		"id": 0,
		"invoiceSrcSystem": 0,
		"erpSystem": 0,
		"transactionTypeId": "",
		"blueInvId": 0,
		"agentId": 0,
		"orgName": "",
		"invAgentId": 0,
		"billStationId": 0,
		"code": "",
		"currency": "",
		"currency_priceDigit": 0,
		"currency_moneyDigit": 0,
		"natCurrency": "",
		"natCurrency_priceDigit": 0,
		"natCurrency_moneyDigit": 0,
		"transactionTypeId_name": "",
		"pubts": "",
		"isWfControlled": true,
		"verifystate": 0,
		"headItem": {
			"id": 0,
			"define1": "",
			"define60": ""
		},
		"vouchdate": "",
		"source": "",
		"agentName": "",
		"retailInvestors": "",
		"retailAgentName": "",
		"invAgentName": "",
		"agentContacts": "",
		"agentContactsTel": "",
		"invDirection": 0,
		"blueInvNo": "",
		"isIssueRedInvoice": true,
		"bdInvoiceTypeId": "",
		"invoiceType": 0,
		"invoiceTitle": "",
		"invoiceTitleType": 0,
		"modifyInvoiceType": true,
		"invAgentTaxNo": "",
		"receievInvoiceMobile": "",
		"receievInvoiceEmail": "",
		"invAgentAdress": "",
		"invAgentTel": "",
		"invAgentBank": "",
		"invAgentSubBank": "",
		"invAgentBankNo": "",
		"currencyCode": "",
		"currencyName": "",
		"exchangeRateType": "",
		"exchRate": 0,
		"natCurrencyCode": "",
		"natCurrencyName": "",
		"oriSum": 0,
		"oriMoney": 0,
		"oriTax": 0,
		"natSum": 0,
		"natMoney": 0,
		"natTax": 0,
		"billStationName": "",
		"billStationCode": "",
		"einvoiceHm": "",
		"einvoiceNo": "",
		"blueEinvoiceHm": "",
		"blueEinvoiceNo": "",
		"status": 0,
		"businessState": 0,
		"creator": "",
		"createTime": "",
		"bizFlow": "",
		"isFlowCoreBill": true,
		"saleInvoiceDetails": [
			{
				"issuedTaxSum": "",
				"issuedTaxAmount": "",
				"issuedTaxQty": "",
				"id": 0,
				"columnNo": 0,
				"mainid": 0,
				"saleOrgId": "",
				"salesoutAccountingMethod": "",
				"srcVoucherColumnNo": "",
				"srcVoucherChildColumnNo": "",
				"sourceid": 0,
				"sourceautoid": 0,
				"source": "",
				"costCenter": 0,
				"providerProfitCenter": "",
				"consumerProfitCenter": "",
				"makeRuleCode": "",
				"productId": 0,
				"skuId": 0,
				"skuCode": "",
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
				"projectId": "",
				"unitId": 0,
				"chargeUnitId": 0,
				"subQty": 0,
				"invExchRate": 0,
				"unitExchangeType": 0,
				"unitExchangeTypePrice": 0,
				"taxId": "",
				"bodyItem": {
					"id": 0,
					"define1": "",
					"define60": ""
				},
				"invoiceSource": 0,
				"srcVoucherNo": "",
				"productCode": "",
				"productName": "",
				"modelDescription": "",
				"model": "",
				"speciDes": "",
				"invProductType": "",
				"chargeUnitName": "",
				"invPriceExchRate": 0,
				"priceQty": 0,
				"unitName": "",
				"qty": 0,
				"batchNo": "",
				"projectCode": "",
				"projectName": "",
				"oriTaxUnitPrice": 0,
				"oriUnitPrice": 0,
				"oriSum": 0,
				"oriMoney": 0,
				"taxItems": "",
				"taxCode": "",
				"taxRate": 0,
				"oriTax": 0,
				"natTaxUnitPrice": 0,
				"natUnitPrice": 0,
				"natSum": 0,
				"natMoney": 0,
				"natTax": 0,
				"saleDeptId": "",
				"saleDeptName": "",
				"memo": "",
				"stockOrgId": "",
				"isAdvRecInv": true,
				"prepayInvRvnRecogBkgMeth": "",
				"lineAgentId": 0,
				"calBase": {},
				"taxCodeId": "",
				"taxCode_taxCode": "",
				"warehouse": "",
				"warehouse_name": "",
				"carryOverOfCostMethod": "",
				"sourcesys": "",
				"invExchRateNum": 0,
				"invExchRateDen": 0,
				"invPriceExchRateNum": 0,
				"invPriceExchRateDen": 0
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-09

新增

请求参数 batchNo

更新

请求参数 (24)

新增

返回参数 (4)

更新

返回参数 (170)

销售发票单个保存删除请求入参换算率分子分母

2	2025-11-19

新增

请求参数 (7)

更新

请求参数 qty

新增

返回参数 (7)

NBJY-37374-【日常环境】【开税票】销售发票API保存、批量更新API接口没有增加开税票相关字段

3	2025-08-20

新增

请求参数 carryOverOfCostMethod

新增

请求参数 sourcesys

新增

返回参数 carryOverOfCostMethod

新增

返回参数 sourcesys

NBJY-33521-【日常环境】【发出商品】销售发票单个保存和出库推发票接口没有增加结转成本和出库来源系统字段

4	2025-08-13

新增

请求参数 warehouse

新增

请求参数 warehouse_name

新增

返回参数 warehouse

新增

返回参数 warehouse_name

NBJY-33130-在销售发票单个保存的接口上添加一下仓库字段

5	2025-06-19

新增

请求参数 (4)

新增

返回参数 (4)

NBJY-26444-全球化计税引擎：销售发票api接口对税码的处理


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

