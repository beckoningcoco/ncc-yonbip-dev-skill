---
title: "销售退货单个保存V2"
apiId: "4a36ae2fc0da4e81a3384d7e0861459c"
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

# 销售退货单个保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Sales Return (SCMSD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/sd/vouchersalereturn/singleSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

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
| id | long | 否 | 否 | 单据主表id 新增时无需填写，修改时必填 示例：3123432154321 |
| code | string | 否 | 否 | 单据编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输；修改时必传 示例：S0T5-0000000000-20210831-000000 |
| salesOrgId | string | 否 | 是 | 销售组织，传id或者code 示例：2163951720681984 |
| transactionTypeId | long | 否 | 是 | 交易类型，传id或者code 示例：2155547426656517 |
| agentId | long | 否 | 是 | 客户，传id或者code 示例：2251598175195392 |
| retailInvestors | boolean | 否 | 否 | 是否散户, true:是、false:否、 示例：false |
| saleDepartmentId | string | 否 | 否 | 销售部门，传id或者code 示例：2163953113665792 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2021-08-31 00:00:00 |
| corpContact | string | 否 | 否 | 销售业务员 示例：2163960865427712 |
| settlementOrgId | string | 否 | 是 | 开票组织，传id或者code 示例：2163951720681984 |
| currency | string | 否 | 是 | 币种，传id或者code 示例：2155547424560384 |
| exchangeRateType | string | 否 | 是 | 汇率类型，传id或者code 示例：csrka3z7 |
| natCurrency | string | 否 | 是 | 本币，传id或者code 示例：2155547424560384 |
| retailAgentName | string | 否 | 否 | 散户名称 示例：散户2 |
| saleReturnMemo | object | 否 | 否 | 备注 |
| agentTaxItem | string | 否 | 否 | 客户销项税率ID 示例：2155547427149061 |
| bizId | long | 否 | 否 | 供应商id 示例：2155538208313600 |
| saleAreaId | string | 否 | 否 | 销售区域id 示例：222121233 |
| agentRelationId | long | 否 | 否 | 客户交易关系id 示例：55555656565 |
| refundStatus | string | 否 | 否 | 退货单退款状态，由系统业务自动生成，接口无需传值。 示例：NONE |
| refundAmount | BigDecimal | 否 | 否 | 退款金额 示例：1 |
| isWfControlled | boolean | 否 | 否 | 是否受审批流控制 示例：false |
| exchRate | BigDecimal | 否 | 是 | 汇率 示例：1 |
| taxInclusive | boolean | 否 | 是 | 单价含税, true:是、false:否、 示例：true |
| saleReturnStatus | string | 否 | 否 | 单据状态, 由系统业务自动生成，接口无需传值 示例：SUBMITSALERETURN 默认值：SUBMITSALERETURN |
| saleReturnSourceType | string | 否 | 是 | 退货类型, NONE:无来源、DELIVERYEND:销售出库单、ORDER:销售订单 示例：DELIVERYEND |
| bizFlow_name | string | 否 | 否 | 流程名称 示例：001 |
| bizFlow_version | string | 否 | 否 | 版本信息 示例：版本1 |
| logisticWayId | long | 否 | 否 | 物流公司id 示例：321321 |
| invoiceAgentId | long | 否 | 是 | 开票客户，传id或者code 示例：2216247878177024 |
| realMoney | BigDecimal | 否 | 否 | 应付金额，等于表头的退货金额 示例：100 |
| modifyInvoiceType | boolean | 否 | 否 | 发票类型是否可改, true:是、false:否、 示例：true |
| logisticsBillNo | string | 否 | 否 | 物流单号 示例：4321 |
| logisticsUserName | string | 否 | 否 | 司机姓名 示例：王一 |
| logisticsUserPhone | string | 否 | 否 | 司机电话 示例：18888888888 |
| logisticsCarNum | string | 否 | 否 | 车牌号 示例：京A-ax245 |
| receiver | string | 否 | 否 | 收货人 示例：王二 |
| receiveMobile | string | 否 | 否 | 收货人移动电话 示例：010-12345678 |
| receiveTelePhone | string | 否 | 否 | 收货人固定电话 示例：1555555555 |
| receiveAddress | string | 否 | 否 | 收货地址 示例：北京市海淀区 |
| receiveZipCode | string | 否 | 否 | 收货人邮编 示例：011 |
| bdInvoiceTypeId | string | 否 | 否 | 发票类型,0:收据,1:增值税电子普通发票,2:增值税电子专用发票,3:增值税普通发票,4:增值税专用发票,5:机动车销售统一发票,8:增值税电子普通发票（成品油）,10:增值税普通发票（成品油）,11:增值税专用发票（成品油）,e0:电子收购发票, 31:电子发票（增值税专用发票）,32:电子发票（普通发票）,33:数电纸质发票（增值税专用发票）,34:数电纸质发票（普通发票） 示例：0 |
| invoiceUpcType | string | 否 | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、5：增值税电子普通发票(成品油)、6：增值税普通发票(成品油)、7：增值税专用发票(成品油)、8：电子收购发票、9：增值税电子专用发票、10：电子发票（增值税专用发票）、11:电子发票（普通发票）、12:数电纸质发票（增值税专用发票）、13:数电纸质发票（普通发票） 示例：0 |
| invoiceTitleType | string | 否 | 否 | 抬头类型, 0:企业、1:个人、2:非营利组织、 示例：0 |
| invoiceTitle | string | 否 | 否 | 发票抬头 示例：中央大客户工信部 |
| taxNum | string | 否 | 否 | 纳税识别号 示例：SH999000999 |
| bankName | string | 否 | 否 | 开户银行 示例：中国工商银行 |
| subBankName | string | 否 | 否 | 开户支行 示例：中国工商银行股份有限公司天津中北支行 |
| bankAccount | string | 否 | 否 | 账号 示例：888888888888888 |
| invoiceTelephone | string | 否 | 否 | 营业电话 示例：012-9998893 |
| invoiceAddress | string | 否 | 否 | 营业地址 示例：北京市海淀区 |
| totalMoney | BigDecimal | 否 | 否 | 总金额 示例：43214 |
| payMoney | BigDecimal | 否 | 是 | 退货金额，需等于表体含税金额的合计 示例：312 |
| totalMoneyOrigTaxfree | BigDecimal | 否 | 否 | 无税总金额 示例：321 |
| payMoneyOrigTaxfree | BigDecimal | 否 | 否 | 无税退货金额 示例：321 |
| totalOriTax | BigDecimal | 否 | 否 | 税额 示例：3 |
| totalMoneyDomestic | BigDecimal | 否 | 否 | 本币总金额 示例：643256 |
| payMoneyDomestic | BigDecimal | 否 | 否 | 本币退货金额 示例：5432 |
| totalMoneyDomesticTaxfree | BigDecimal | 否 | 否 | 本币无税总金额 示例：5432 |
| payMoneyDomesticTaxfree | BigDecimal | 否 | 否 | 本币无税退货金额 示例：5432 |
| totalNatTax | BigDecimal | 否 | 否 | 本币税额 示例：5421 |
| bizFlow | string | 否 | 否 | 流程ID 示例：213 |
| isFlowCoreBill | boolean | 否 | 否 | 是否流程核心单据 示例：true |
| headItem | object | 否 | 否 | 表头自定义项(1-60) |
| headFreeItem | object | 否 | 否 | 表头自由自定义项(1-60) |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| saleReturnDetails | object | 是 | 是 | 退货单详情[voucher.salereturn.SaleReturnDetail] |
| saleReturnAttachments | object | 是 | 否 | 退货单附件[voucher.salereturn.SaleReturnAttachment] |

## 3. 请求示例

Url: /yonbip/sd/vouchersalereturn/singleSave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 3123432154321,
		"code": "S0T5-0000000000-20210831-000000",
		"salesOrgId": "2163951720681984",
		"transactionTypeId": 2155547426656517,
		"agentId": 2251598175195392,
		"retailInvestors": false,
		"saleDepartmentId": "2163953113665792",
		"vouchdate": "2021-08-31 00:00:00",
		"corpContact": "2163960865427712",
		"settlementOrgId": "2163951720681984",
		"currency": "2155547424560384",
		"exchangeRateType": "csrka3z7",
		"natCurrency": "2155547424560384",
		"retailAgentName": "散户2",
		"saleReturnMemo": {
			"remark": "\"销售退货\""
		},
		"agentTaxItem": "2155547427149061",
		"bizId": 2155538208313600,
		"saleAreaId": "222121233",
		"agentRelationId": 55555656565,
		"refundStatus": "NONE",
		"refundAmount": 1,
		"isWfControlled": false,
		"exchRate": 1,
		"taxInclusive": true,
		"saleReturnStatus": "SUBMITSALERETURN",
		"saleReturnSourceType": "DELIVERYEND",
		"bizFlow_name": "001",
		"bizFlow_version": "版本1",
		"logisticWayId": 321321,
		"invoiceAgentId": 2216247878177024,
		"realMoney": 100,
		"modifyInvoiceType": true,
		"logisticsBillNo": "4321",
		"logisticsUserName": "王一",
		"logisticsUserPhone": "18888888888",
		"logisticsCarNum": "京A-ax245",
		"receiver": "王二",
		"receiveMobile": "010-12345678",
		"receiveTelePhone": "1555555555",
		"receiveAddress": "北京市海淀区",
		"receiveZipCode": "011",
		"bdInvoiceTypeId": "0",
		"invoiceUpcType": "0",
		"invoiceTitleType": "0",
		"invoiceTitle": "中央大客户工信部",
		"taxNum": "SH999000999",
		"bankName": "中国工商银行",
		"subBankName": "中国工商银行股份有限公司天津中北支行",
		"bankAccount": "888888888888888",
		"invoiceTelephone": "012-9998893",
		"invoiceAddress": "北京市海淀区",
		"totalMoney": 43214,
		"payMoney": 312,
		"totalMoneyOrigTaxfree": 321,
		"payMoneyOrigTaxfree": 321,
		"totalOriTax": 3,
		"totalMoneyDomestic": 643256,
		"payMoneyDomestic": 5432,
		"totalMoneyDomesticTaxfree": 5432,
		"payMoneyDomesticTaxfree": 5432,
		"totalNatTax": 5421,
		"bizFlow": "213",
		"isFlowCoreBill": true,
		"headItem": {
			"define1": "表头自定义项1",
			"define2": "表头自定义项2"
		},
		"headFreeItem": {
			"id": "54654123",
			"define1": "表头自由自定义项1",
			"define2": "表头自由自定义项2"
		},
		"_status": "Insert",
		"saleReturnDetails": [
			{
				"id": 4312432,
				"orderDetailId": 2403153858154753,
				"orderDetailIdKey": "6425432",
				"sourceid": 2403160486547968,
				"sourceautoid": 2403160486547970,
				"source": "ustock.st_salesout",
				"costCenter_code": "32312312342",
				"providerProfitCenter_code": "CODE_0001",
				"consumerProfitCenter_code": "CODE_0003",
				"makeRuleCode": "salesoutTosalereturn",
				"productId": 2320711092457728,
				"skuId": 2313763385315584,
				"projectId": "\"123124312\"",
				"unitExchangeType": 0,
				"unitExchangeTypePrice": 0,
				"taxId": "2155547427149061",
				"stockId": 2192242573644032,
				"stockOrgId": "2163951720681984",
				"saleReturnDepartmentId": "14321",
				"iProductAuxUnitId": 2263072523178240,
				"iProductUnitId": 2312582309908736,
				"masterUnitId": 2261943548399872,
				"orderProductType": "SALE",
				"bizProductId": 31243141,
				"salesOrgId": "6425432",
				"enable": true,
				"orderNo": "QbOJ-000000000-20210825-000017",
				"upcode": "XSCK20210825000005",
				"modelDescription": "规格01",
				"model": "001",
				"specDescription": "规格",
				"invExchRate": 1,
				"subQty": 100,
				"invPriceExchRate": 1,
				"priceQty": 100,
				"qty": 1,
				"isBatchManage": false,
				"batchNo": "2",
				"isExpiryDateManage": false,
				"productDate": "2021-08-31 00:00:00",
				"expireDateNo": "3",
				"expireDateUnit": "1",
				"invalidDate": "2021-08-31 00:00:00",
				"oriTaxUnitPrice": 500,
				"oriUnitPrice": 500,
				"oriSum": 500,
				"oriMoney": 500,
				"oriTax": 0,
				"natTaxUnitPrice": 500,
				"natUnitPrice": 500,
				"natSum": 500,
				"natMoney": 500,
				"natTax": 500,
				"retNotNeedInvoiceQty": 100,
				"bodyItem": {
					"saleReturnDetailId": "543213215",
					"define1": "表体自定义项1",
					"define2": "表体自定义项2"
				},
				"bodyFreeItem": {
					"id": "542312",
					"define1": "表体自由自定义项1",
					"define2": "表体自由自定义项2"
				},
				"firstsourceid": 2403063657222400,
				"firstsourceautoid": 2403063657238784,
				"firstsource": "udinghuo.voucher_order",
				"firstupcode": "QbOJ-000000000-20210825-000014",
				"orderId": "QbOJ-000000000-20210825-000014",
				"_status": "Insert",
				"oriTaxUnitOffer": 500,
				"freeTaxUnitOffer": 500,
				"lineSaleCost": 500,
				"freeLineSaleCost": 500,
				"discountRate": 100,
				"lineDiscountMoney": 10,
				"lineNatDiscountMoney": 10,
				"favorableRate": 10,
				"checkByRevenueManagement": false
			}
		],
		"saleReturnAttachments": [
			{
				"id": 1233414,
				"folder": "/attachments/orders/2009391957807360/",
				"saleReturnId": 3123432154321,
				"type": "image/png",
				"size": "183043",
				"_status": "Insert"
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
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 调用成功时的返回数据 |
| id | string | 否 | 单据主表id |
| salesOrgId | string | 否 | 销售组织id |
| transactionTypeId | string | 否 | 交易类型id |
| orderNo | string | 否 | 订单号 |
| salesOrgId_name | string | 否 | 销售组织名称 |
| agentId | string | 否 | 客户id |
| retailInvestors | string | 否 | 是否散户 |
| transactionTypeId_name | string | 否 | 交易类型名称 |
| saleDepartmentId | string | 否 | 销售部门id |
| vouchdate | string | 否 | 单据日期 |
| corpContact | string | 否 | 销售业务员 |
| auditDate | string | 否 | 审批日期 |
| settlementOrgId | string | 否 | 财务组织id |
| saleAreaId | string | 否 | 销售区域id |
| code | string | 否 | 单据编号 |
| currency | string | 否 | 币种id |
| currency_priceDigit | string | 否 | 原币单价精度 |
| currency_moneyDigit | string | 否 | 原币金额精度 |
| agentId_name | string | 否 | 客户名称 |
| natCurrency | string | 否 | 本币pk |
| natCurrency_priceDigit | string | 否 | 本币单价精度 |
| retailAgentName | string | 否 | 散户名称 |
| natCurrency_moneyDigit | string | 否 | 本币金额精度 |
| saleReturnMemo | object | 否 | 备注 |
| saleDepartmentId_name | string | 否 | 销售部门名称 |
| agentTaxItem | string | 否 | 客户销项税率ID |
| bizId | string | 否 | 供应商id |
| corpContactUserName | string | 否 | 业务员 |
| bizName | string | 否 | 供应商名称 |
| agentRelationId | string | 否 | 客户交易关系id |
| refundStatus | string | 否 | 退货单退款状态, NONE:全部未退款、PARTNONECONFIRM:部分退款待审核、PARTNONE:部分退款、CONFIRM:退款待审批、FINISH:已退款、 |
| opposeMemo | string | 否 | 批注 |
| settlementOrgId_name | string | 否 | 开票组织名称 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| creatorId | string | 否 | 制单人 |
| currencyCode | string | 否 | 原币简称 |
| modifierId | string | 否 | 修改人id |
| currencyName | string | 否 | 币种 |
| modifyDate | string | 否 | 修改日期 |
| confirmUserId | string | 否 | 审核人id |
| source | string | 否 | API来源 |
| refundAmount | string | 否 | 退款金额 |
| isWfControlled | string | 否 | 是否受审批流控制 |
| natCurrencyCode | string | 否 | 本币简称 |
| verifystate | string | 否 | 审批状态，0:未提交、1:已提交、2:已审批 |
| status | string | 否 | 单据状态，0：待退货审批；1：待退货；2退货中；3已完成；4：已驳回；5审批中 |
| natCurrencyName | string | 否 | 本币 |
| headItem | object | 否 | 表头自定义项 |
| exchangeRateType | object | 否 | 汇率类型Id |
| exchRate | number |
| 小数位数:8,最大长度:28 | 否 | 汇率 |
| taxInclusive | string | 否 | 单价含税, true:是、false:否、 |
| saleReturnStatus | string | 否 | 单据状态, SUBMITSALERETURN:开立、CONFIRMSALERETURNORDER:已确认、SALERETURNING:退货中、ENDSALERETURN:已审核、OPPOSESALERETURN:已驳回、 |
| returnStatus | string | 否 | 退货状态，SUBMITSALERETURN:待退货审核、CONFIRMSALERETURNORDER:待退货、SALERETURNING:退货中、ENDSALERETURN:已完成、OPPOSESALERETURN:已驳回、 |
| deliverTime | string | 否 | 出库时点，DELIVEAFTERCONFIRM：确认后出库，DELIVEAFTERAUDIT：审核后出库 |
| saleReturnSourceType | string | 否 | 退货类型, NONE:无来源、DELIVERYEND:销售出库单、 |
| bizFlow_name | string | 否 | 流程名称 |
| bizFlow_version | string | 否 | 版本信息 |
| logisticWayId | string | 否 | 物流公司id |
| invoiceAgentId | string | 否 | 开票客户id |
| modifyInvoiceType | string | 否 | 发票类型是否可改, true:是、false:否、 |
| rebateToOrderMoney | BigDecimal | 否 | 整单返利金额 |
| rebateToCashMoney | BigDecimal | 否 | 抵现返利金额 |
| rebateToOrderMoneyOrigTaxfree | BigDecimal | 否 | 无税整单返利金额 |
| rebateToCashMoneyOrigTaxfree | BigDecimal | 否 | 无税抵现返利金额 |
| rebateToOrderMoneyDomestic | BigDecimal | 否 | 本币含税整单返利金额 |
| rebateToCashMoneyDomestic | BigDecimal | 否 | 本币含税抵现返利金额 |
| rebateToOrderMoneyDomesticTaxfree | BigDecimal | 否 | 本币无税整单返利金额 |
| rebateToCashMoneyDomesticTaxfree | BigDecimal | 否 | 本币无税抵现返利金额 |
| creator | string | 否 | 制单人 |
| createTime | string | 否 | 创建时间 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| auditor | string | 否 | 审核人 |
| auditTime | string | 否 | 审核时间 |
| logisticWayId_name | string | 否 | 物流公司名称 |
| logisticsBillNo | string | 否 | 物流单号 |
| logisticsUserName | string | 否 | 司机姓名 |
| logisticsUserPhone | string | 否 | 司机电话 |
| logisticsCarNum | string | 否 | 车牌号 |
| receiver | string | 否 | 收货人 |
| receiveMobile | string | 否 | 收货人移动电话 |
| receiveTelePhone | string | 否 | 收货人固定电话 |
| receiveAddress | string | 否 | 收货地址 |
| receiveZipCode | string | 否 | 收货人邮编 |
| invoiceAgentId_name | string | 否 | 开票客户名称 |
| bdInvoiceTypeId | string | 否 | 发票类型,0:收据,1:增值税电子普通发票,2:增值税电子专用发票,3:增值税普通发票,4:增值税专用发票,5:机动车销售统一发票,8:增值税电子普通发票（成品油）,10:增值税普通发票（成品油）,11:增值税专用发票（成品油）,e0:电子收购发票, 31:电子发票（增值税专用发票）,32:电子发票（普通发票）,33:数电纸质发票（增值税专用发票）,34:数电纸质发票（普通发票） |
| invoiceUpcType | string | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、5：增值税电子普通发票(成品油)、6：增值税普通发票(成品油)、7：增值税专用发票(成品油)、8：电子收购发票、9：增值税电子专用发票、10：电子发票（增值税专用发票）、11:电子发票（普通发票）、12:数电纸质发票（增值税专用发票）、13:数电纸质发票（普通发票） |
| invoiceTitleType | string | 否 | 抬头类型, 0:企业、1:个人、2:非营利组织、 |
| invoiceTitle | string | 否 | 发票抬头 |
| taxNum | string | 否 | 纳税识别号 |
| bankName | string | 否 | 开户银行 |
| subBankName | string | 否 | 开户支行 |
| bankAccount | string | 否 | 账号 |
| invoiceTelephone | string | 否 | 营业电话 |
| totalMoney | BigDecimal | 否 | 总金额 |
| payMoney | BigDecimal | 否 | 退货金额 |
| totalMoneyOrigTaxfree | BigDecimal | 否 | 无税总金额 |
| payMoneyOrigTaxfree | BigDecimal | 否 | 无税退货金额 |
| totalOriTax | BigDecimal | 否 | 税额 |
| totalMoneyDomestic | BigDecimal | 否 | 本币总金额 |
| payMoneyDomestic | BigDecimal | 否 | 本币退货金额 |
| totalMoneyDomesticTaxfree | BigDecimal | 否 | 本币无税总金额 |
| payMoneyDomesticTaxfree | BigDecimal | 否 | 本币无税退货金额 |
| totalNatTax | number |
| 小数位数:8,最大长度:28 | 否 | 本币税额 |
| bizFlow | string | 否 | 流程id |
| isFlowCoreBill | string | 否 | 是否流程核心单据 |
| saleReturnDetail | object | 是 | 退货单详情[voucher.salereturn.SaleReturnDetail] |
| saleReturnAttachments | object | 是 | 退货单附件[voucher.salereturn.SaleReturnAttachment] |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"id": "",
		"salesOrgId": "",
		"transactionTypeId": "",
		"orderNo": "",
		"salesOrgId_name": "",
		"agentId": "",
		"retailInvestors": "",
		"transactionTypeId_name": "",
		"saleDepartmentId": "",
		"vouchdate": "",
		"corpContact": "",
		"auditDate": "",
		"settlementOrgId": "",
		"saleAreaId": "",
		"code": "",
		"currency": "",
		"currency_priceDigit": "",
		"currency_moneyDigit": "",
		"agentId_name": "",
		"natCurrency": "",
		"natCurrency_priceDigit": "",
		"retailAgentName": "",
		"natCurrency_moneyDigit": "",
		"saleReturnMemo": {
			"id": "",
			"remark": ""
		},
		"saleDepartmentId_name": "",
		"agentTaxItem": "",
		"bizId": "",
		"corpContactUserName": "",
		"bizName": "",
		"agentRelationId": "",
		"refundStatus": "",
		"opposeMemo": "",
		"settlementOrgId_name": "",
		"pubts": "",
		"creatorId": "",
		"currencyCode": "",
		"modifierId": "",
		"currencyName": "",
		"modifyDate": "",
		"confirmUserId": "",
		"source": "",
		"refundAmount": "",
		"isWfControlled": "",
		"natCurrencyCode": "",
		"verifystate": "",
		"status": "",
		"natCurrencyName": "",
		"headItem": {
			"saleReturnId": "",
			"define1": "",
			"define2": "",
			"define3": "",
			"define4": ""
		},
		"exchangeRateType": {
			"name": ""
		},
		"exchRate": 0,
		"taxInclusive": "",
		"saleReturnStatus": "",
		"returnStatus": "",
		"deliverTime": "",
		"saleReturnSourceType": "",
		"bizFlow_name": "",
		"bizFlow_version": "",
		"logisticWayId": "",
		"invoiceAgentId": "",
		"modifyInvoiceType": "",
		"rebateToOrderMoney": 0,
		"rebateToCashMoney": 0,
		"rebateToOrderMoneyOrigTaxfree": 0,
		"rebateToCashMoneyOrigTaxfree": 0,
		"rebateToOrderMoneyDomestic": 0,
		"rebateToCashMoneyDomestic": 0,
		"rebateToOrderMoneyDomesticTaxfree": 0,
		"rebateToCashMoneyDomesticTaxfree": 0,
		"creator": "",
		"createTime": "",
		"modifier": "",
		"modifyTime": "",
		"auditor": "",
		"auditTime": "",
		"logisticWayId_name": "",
		"logisticsBillNo": "",
		"logisticsUserName": "",
		"logisticsUserPhone": "",
		"logisticsCarNum": "",
		"receiver": "",
		"receiveMobile": "",
		"receiveTelePhone": "",
		"receiveAddress": "",
		"receiveZipCode": "",
		"invoiceAgentId_name": "",
		"bdInvoiceTypeId": "",
		"invoiceUpcType": "",
		"invoiceTitleType": "",
		"invoiceTitle": "",
		"taxNum": "",
		"bankName": "",
		"subBankName": "",
		"bankAccount": "",
		"invoiceTelephone": "",
		"totalMoney": 0,
		"payMoney": 0,
		"totalMoneyOrigTaxfree": 0,
		"payMoneyOrigTaxfree": 0,
		"totalOriTax": 0,
		"totalMoneyDomestic": 0,
		"payMoneyDomestic": 0,
		"totalMoneyDomesticTaxfree": 0,
		"payMoneyDomesticTaxfree": 0,
		"totalNatTax": 0,
		"bizFlow": "",
		"isFlowCoreBill": "",
		"saleReturnDetail": [
			{
				"id": "",
				"saleReturnId": "",
				"saleReturnNo": "",
				"orderDetailId": "",
				"orderDetailIdKey": "",
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"costCenter": "",
				"providerProfitCenter": "",
				"consumerProfitCenter": "",
				"makeRuleCode": "",
				"productId": "",
				"skuId": "",
				"projectId": "",
				"unitExchangeType": 0,
				"unitExchangeTypePrice": 0,
				"salePrice": 0,
				"taxId": "",
				"stockId": "",
				"stockOrgId": 0,
				"saleReturnDepartmentId": "",
				"realMoney": 0,
				"totalOutStockOriTaxMoney": 0,
				"totalOutStockOriMoney": 0,
				"totalOutStockOriTax": 0,
				"iProductAuxUnitId": "",
				"iProductUnitId": "",
				"masterUnitId": "",
				"purUOM_Precision": 0,
				"priceUOM_Precision": 0,
				"unit_Precision": 0,
				"bizId": "",
				"bizName": "",
				"orderProductType": "",
				"groupId": "",
				"bizProductId": "",
				"salesOrgId": "",
				"enable": 0,
				"saleOutStatus": "",
				"saleOutClose": true,
				"createdDate": "",
				"pubts": "",
				"bodyItem": {
					"saleReturnDetailId": "",
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
					"define31": "",
					"define32": "",
					"define33": "",
					"define34": "",
					"define35": "",
					"define36": "",
					"define37": "",
					"define38": "",
					"define39": "",
					"define40": "",
					"define41": "",
					"define42": "",
					"define43": "",
					"define44": "",
					"define45": "",
					"define46": "",
					"define47": "",
					"define48": "",
					"define49": "",
					"define50": "",
					"define51": "",
					"define52": "",
					"define53": "",
					"define54": "",
					"define55": "",
					"define56": "",
					"define57": "",
					"define58": "",
					"define59": "",
					"define60": ""
				},
				"orderNo": "",
				"upcode": "",
				"productCode": "",
				"productName": "",
				"modelDescription": "",
				"model": "",
				"skuCode": "",
				"skuName": "",
				"specDescription": "",
				"productAuxUnitName": "",
				"invExchRate": 0,
				"subQty": 0,
				"productUnitName": "",
				"invPriceExchRate": 0,
				"priceQty": 0,
				"qtyName": "",
				"qty": 0,
				"stockName": "",
				"isBatchManage": "",
				"batchNo": "",
				"isExpiryDateManage": "",
				"productDate": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"invalidDate": "",
				"projectId_code": "",
				"projectId_name": "",
				"stockOrgId_name": "",
				"oriTaxUnitPrice": 0,
				"oriUnitPrice": 0,
				"oriSum": 0,
				"oriMoney": 0,
				"taxItems": "",
				"taxCode": "",
				"taxRate": "",
				"oriTax": 0,
				"natTaxUnitPrice": 0,
				"natUnitPrice": 0,
				"natSum": 0,
				"natMoney": 0,
				"natTax": 0,
				"totalOutStockQuantity": 0,
				"totalOutStockSubQty": 0,
				"invoiceQty": 0,
				"retNotNeedInvoiceQty": 0,
				"invoiceOriSum": 0,
				"checkByRevenueManagement": true,
				"invExchRateNum": 3,
				"invExchRateDen": 3,
				"invPriceExchRateNum": 3,
				"invPriceExchRateDen": 3
			}
		],
		"saleReturnAttachments": [
			{
				"fileName": "",
				"folder": "",
				"saleReturnId": "",
				"type": "",
				"size": "",
				"id": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据是否正确


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

新增

请求参数 saleAreaId

更新

请求参数 (48)

新增

返回参数 saleAreaId

2	2026-04-03

更新

请求说明

更新

请求参数 (11)

新增

返回参数 (4)

更新

返回参数 (279)

删除

返回参数 invoiceAddress


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

