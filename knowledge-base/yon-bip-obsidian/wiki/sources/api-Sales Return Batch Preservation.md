---
title: "销售退货批量保存"
apiId: "d09a14187cbb4293a58d229323c16466"
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

# 销售退货批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Sales Return (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/vouchersalereturn/batchsave

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
| data | object | 否 | 是 | 退货单[voucher.salereturn.SaleReturn] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 否 | 主表id 新增时无需填写，修改时必填 新增时无需填写，修改时必填 新增时无需填写，修改时必填 |
| code | string | 否 | 否 | 单据编号 |
| salesOrgId | string | 否 | 是 | 销售组织id |
| transactionTypeId | long | 否 | 是 | 交易类型id |
| orderNo | string | 否 | 否 | 订单号 |
| agentId | long | 否 | 是 | 客户id |
| retailInvestors | boolean | 否 | 否 | 是否散户 |
| saleDepartmentId | string | 否 | 否 | 销售部门id |
| vouchdate | string | 否 | 是 | 单据日期 |
| corpContact | string | 否 | 否 | 销售业务员 |
| auditDate | string | 否 | 否 | 审批日期 |
| settlementOrgId | string | 否 | 是 | 财务组织id |
| currency | string | 否 | 是 | 币种id |
| exchangeRateType | string | 否 | 是 | 汇率类型Id |
| natCurrency | string | 否 | 是 | 本币pk |
| retailAgentName | string | 否 | 否 | 散户名称 |
| saleReturnMemo | object | 否 | 否 | 备注 |
| agentTaxItem | string | 否 | 是 | 客户销项税率ID |
| bizId | long | 否 | 否 | 供应商id |
| corpContactUserName | string | 否 | 否 | 业务员 |
| bizName | string | 否 | 否 | 供应商名称 |
| agentRelationId | long | 否 | 是 | 客户交易关系id |
| refundStatus | string | 否 | 否 | 退货单退款状态, NONE:全部未退款、PARTNONECONFIRM:部分退款待审核、PARTNONE:部分退款、CONFIRM:退款待审批、FINISH:已退款、 |
| opposeMemo | string | 否 | 否 | 批注 |
| settlementOrgId_name | string | 否 | 否 | 开票组织名称 |
| pubts | string | 否 | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| creatorId | long | 否 | 否 | 制单人 |
| currencyCode | string | 否 | 否 | 原币简称 |
| modifierId | long | 否 | 否 | 修改人id |
| currencyName | string | 否 | 否 | 币种 |
| modifyDate | string | 否 | 否 | 修改日期 |
| confirmUserId | long | 否 | 否 | 审核人id |
| source | string | 否 | 否 | API来源，0：PC、1：移动、2：导入、3：ERP、4：OPENAPI、 |
| refundAmount | BigDecimal | 否 | 否 | 退款金额 |
| isWfControlled | boolean | 否 | 否 | 是否受审批流控制 |
| natCurrencyCode | string | 否 | 否 | 本币简称 |
| verifystate | short | 否 | 否 | 审批状态，0:未提交、1:已提交、2:已审批、, 新增设为0 |
| status | short | 否 | 否 | 单据状态, 0:开立、3:审核中、1:已审核、2:已关闭 |
| natCurrencyName | string | 否 | 否 | 本币 |
| headItem | object | 否 | 否 | 表头自定义项 |
| exchRate | BigDecimal | 否 | 是 | 汇率 |
| taxInclusive | boolean | 否 | 否 | 单价含税, true:是、false:否、 |
| saleReturnStatus | string | 否 | 是 | 单据状态, SUBMITSALERETURN:待退货审批、CONFIRMSALERETURNORDER:待退货、SALERETURNING:退货中、ENDSALERETURN:已完成、OPPOSESALERETURN:已驳回、 |
| saleReturnSourceType | string | 否 | 是 | 退货类型, NONE:无来源、DELIVERYEND:销售出库单、 |
| logisticWayId | long | 否 | 否 | 物流公司id |
| invoiceAgentId | long | 否 | 是 | 开票客户id |
| modifyInvoiceType | boolean | 否 | 否 | 发票类型是否可改, true:是、false:否、 |
| rebateToOrderMoney | BigDecimal | 否 | 否 | 整单返利金额 |
| rebateToCashMoney | BigDecimal | 否 | 否 | 抵现返利金额 |
| rebateToOrderMoneyOrigTaxfree | BigDecimal | 否 | 否 | 无税整单返利金额 |
| rebateToCashMoneyOrigTaxfree | BigDecimal | 否 | 否 | 无税抵现返利金额 |
| rebateToOrderMoneyDomestic | BigDecimal | 否 | 否 | 本币含税整单返利金额 |
| rebateToCashMoneyDomestic | BigDecimal | 否 | 否 | 本币含税抵现返利金额 |
| rebateToOrderMoneyDomesticTaxfree | BigDecimal | 否 | 否 | 本币无税整单返利金额 |
| rebateToCashMoneyDomesticTaxfree | BigDecimal | 否 | 否 | 本币无税抵现返利金额 |
| creator | string | 否 | 是 | 制单人 |
| createTime | string | 否 | 否 | 创建时间 |
| modifier | string | 否 | 否 | 修改人 |
| modifyTime | string | 否 | 否 | 修改时间 |
| auditor | string | 否 | 否 | 审核人 |
| auditTime | string | 否 | 否 | 审核时间 |
| logisticsBillNo | string | 否 | 否 | 物流单号 |
| logisticsUserName | string | 否 | 否 | 司机姓名 |
| logisticsUserPhone | string | 否 | 否 | 司机电话 |
| logisticsCarNum | string | 否 | 否 | 车牌号 |
| realMoney | BigDecimal | 否 | 是 | 应付金额 |
| receiver | string | 否 | 否 | 收货人 |
| receiveMobile | string | 否 | 否 | 收货人移动电话 |
| receiveTelePhone | string | 否 | 否 | 收货人固定电话 |
| receiveAddress | string | 否 | 否 | 收货地址 |
| receiveZipCode | string | 否 | 否 | 收货人邮编 |
| invoiceAgentId_name | string | 否 | 否 | 开票客户名称 |
| invoiceUpcType | string | 否 | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、 |
| invoiceTitleType | string | 否 | 否 | 抬头类型, 0:企业、1:个人、2:非营利组织、 |
| invoiceTitle | string | 否 | 否 | 发票抬头 |
| taxNum | string | 否 | 否 | 纳税识别号 |
| bankName | string | 否 | 否 | 开户银行 |
| subBankName | string | 否 | 否 | 开户支行 |
| bankAccount | string | 否 | 否 | 账号 |
| invoiceTelephone | string | 否 | 否 | 营业电话 |
| invoiceAddress | string | 否 | 否 | 营业地址 |
| totalMoney | BigDecimal | 否 | 是 | 总金额 |
| payMoney | BigDecimal | 否 | 是 | 退货金额 |
| totalMoneyOrigTaxfree | BigDecimal | 否 | 是 | 无税总金额 |
| payMoneyOrigTaxfree | BigDecimal | 否 | 是 | 无税退货金额 |
| totalOriTax | BigDecimal | 否 | 是 | 税额 |
| totalMoneyDomestic | BigDecimal | 否 | 是 | 本币总金额 |
| payMoneyDomestic | BigDecimal | 否 | 是 | 本币退货金额 |
| totalMoneyDomesticTaxfree | BigDecimal | 否 | 是 | 本币无税总金额 |
| payMoneyDomesticTaxfree | BigDecimal | 否 | 是 | 本币无税退货金额 |
| totalNatTax | BigDecimal | 否 | 是 | 本币税额 |
| bizFlow | string | 否 | 否 | 流程ID |
| isFlowCoreBill | boolean | 否 | 否 | 是否流程核心单据 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| saleReturnDetails | object | 是 | 是 | 退货单详情[voucher.salereturn.SaleReturnDetail] |
| saleReturnAttachments | object | 是 | 是 | 退货单附件[voucher.salereturn.SaleReturnAttachment] |

## 3. 请求示例

Url: /yonbip/sd/vouchersalereturn/batchsave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 0,
		"code": "",
		"salesOrgId": "",
		"transactionTypeId": 0,
		"orderNo": "",
		"agentId": 0,
		"retailInvestors": true,
		"saleDepartmentId": "",
		"vouchdate": "",
		"corpContact": "",
		"auditDate": "",
		"settlementOrgId": "",
		"currency": "",
		"exchangeRateType": "",
		"natCurrency": "",
		"retailAgentName": "",
		"saleReturnMemo": {
			"id": 0,
			"remark": ""
		},
		"agentTaxItem": "",
		"bizId": 0,
		"corpContactUserName": "",
		"bizName": "",
		"agentRelationId": 0,
		"refundStatus": "",
		"opposeMemo": "",
		"settlementOrgId_name": "",
		"pubts": "",
		"creatorId": 0,
		"currencyCode": "",
		"modifierId": 0,
		"currencyName": "",
		"modifyDate": "",
		"confirmUserId": 0,
		"source": "",
		"refundAmount": 0,
		"isWfControlled": true,
		"natCurrencyCode": "",
		"verifystate": 0,
		"status": 0,
		"natCurrencyName": "",
		"headItem": {
			"saleReturnId": 0,
			"define1": "",
			"define2": "",
			"define3": "",
			"define4": ""
		},
		"exchRate": 0,
		"taxInclusive": true,
		"saleReturnStatus": "",
		"saleReturnSourceType": "",
		"logisticWayId": 0,
		"invoiceAgentId": 0,
		"modifyInvoiceType": true,
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
		"logisticsBillNo": "",
		"logisticsUserName": "",
		"logisticsUserPhone": "",
		"logisticsCarNum": "",
		"realMoney": 0,
		"receiver": "",
		"receiveMobile": "",
		"receiveTelePhone": "",
		"receiveAddress": "",
		"receiveZipCode": "",
		"invoiceAgentId_name": "",
		"invoiceUpcType": "",
		"invoiceTitleType": "",
		"invoiceTitle": "",
		"taxNum": "",
		"bankName": "",
		"subBankName": "",
		"bankAccount": "",
		"invoiceTelephone": "",
		"invoiceAddress": "",
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
		"isFlowCoreBill": true,
		"_status": "",
		"saleReturnDetails": [
			{
				"id": 0,
				"saleReturnId": 0,
				"saleReturnNo": "",
				"orderDetailId": 0,
				"orderDetailIdKey": "",
				"sourceid": 0,
				"sourceautoid": 0,
				"source": "",
				"makeRuleCode": "",
				"productId": 0,
				"skuId": 0,
				"projectId": "",
				"unitExchangeType": 0,
				"unitExchangeTypePrice": 0,
				"salePrice": 0,
				"taxId": "",
				"stockId": 0,
				"stockOrgId": "",
				"saleReturnDepartmentId": "",
				"realMoney": 0,
				"totalOutStockOriTaxMoney": 0,
				"totalOutStockOriMoney": 0,
				"totalOutStockOriTax": 0,
				"iProductAuxUnitId": 0,
				"iProductUnitId": 0,
				"masterUnitId": 0,
				"purUOM_Precision": 0,
				"priceUOM_Precision": 0,
				"unit_Precision": 0,
				"bizId": 0,
				"bizName": "",
				"orderProductType": "",
				"groupId": 0,
				"bizProductId": 0,
				"salesOrgId": "",
				"enable": true,
				"createdDate": "",
				"pubts": "",
				"bodyItem": {
					"saleReturnDetailId": 0,
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
				"isBatchManage": true,
				"batchNo": "",
				"isExpiryDateManage": true,
				"productDate": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"invalidDate": "",
				"projectId_code": "",
				"projectId_name": "",
				"stockOrgId_name": "",
				"priceMark": true,
				"oriTaxUnitOffer": 0,
				"lineSaleCost": 0,
				"freeTaxUnitOffer": 0,
				"freeLineSaleCost": 0,
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
				"totalOutStockQuantity": 0,
				"totalOutStockSubQty": 0,
				"invoiceQty": 0,
				"retNotNeedInvoiceQty": 0,
				"invoiceOriSum": 0,
				"_status": ""
			}
		],
		"saleReturnAttachments": [
			{
				"id": 0,
				"folder": "",
				"saleReturnId": 0,
				"type": "",
				"size": "",
				"_status": ""
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
| verifystate | string | 否 | 审批状态 |
| status | string | 否 | 单据状态 |
| natCurrencyName | string | 否 | 本币 |
| headItem | object | 否 | 表头自定义项 |
| exchangeRateType | object | 否 | 汇率类型Id |
| exchRate | int | 否 | 汇率 |
| taxInclusive | string | 否 | 单价含税, true:是、false:否、 |
| saleReturnStatus | string | 否 | 单据状态, SUBMITSALERETURN:待退货审批、CONFIRMSALERETURNORDER:待退货、SALERETURNING:退货中、ENDSALERETURN:已完成、OPPOSESALERETURN:已驳回、 |
| saleReturnSourceType | string | 否 | 退货类型, NONE:无来源、DELIVERYEND:销售出库单、 |
| bizFlow_name | string | 否 | 流程名称 |
| bizFlow_version | string | 否 | 版本信息 |
| logisticWayId | string | 否 | 物流公司id |
| invoiceAgentId | string | 否 | 开票客户id |
| modifyInvoiceType | string | 否 | 发票类型是否可改, true:是、false:否、 |
| rebateToOrderMoney | int | 否 | 整单返利金额 |
| rebateToCashMoney | int | 否 | 抵现返利金额 |
| rebateToOrderMoneyOrigTaxfree | int | 否 | 无税整单返利金额 |
| rebateToCashMoneyOrigTaxfree | int | 否 | 无税抵现返利金额 |
| rebateToOrderMoneyDomestic | int | 否 | 本币含税整单返利金额 |
| rebateToCashMoneyDomestic | int | 否 | 本币含税抵现返利金额 |
| rebateToOrderMoneyDomesticTaxfree | int | 否 | 本币无税整单返利金额 |
| rebateToCashMoneyDomesticTaxfree | int | 否 | 本币无税抵现返利金额 |
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
| invoiceUpcType | string | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、 |
| invoiceTitleType | string | 否 | 抬头类型, 0:企业、1:个人、2:非营利组织、 |
| invoiceTitle | string | 否 | 发票抬头 |
| taxNum | string | 否 | 纳税识别号 |
| bankName | string | 否 | 开户银行 |
| subBankName | string | 否 | 开户支行 |
| bankAccount | string | 否 | 账号 |
| invoiceTelephone | string | 否 | 营业电话 |
| invoiceAddress | string | 否 | 营业地址 |
| totalMoney | int | 否 | 总金额 |
| payMoney | int | 否 | 退货金额 |
| totalMoneyOrigTaxfree | int | 否 | 无税总金额 |
| payMoneyOrigTaxfree | int | 否 | 无税退货金额 |
| totalOriTax | int | 否 | 税额 |
| totalMoneyDomestic | int | 否 | 本币总金额 |
| payMoneyDomestic | int | 否 | 本币退货金额 |
| totalMoneyDomesticTaxfree | int | 否 | 本币无税总金额 |
| payMoneyDomesticTaxfree | int | 否 | 本币无税退货金额 |
| totalNatTax | int | 否 | 本币税额 |
| ecsuiteperson | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| bizFlow | string | 否 | 流程IDid |
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
		"invoiceUpcType": "",
		"invoiceTitleType": "",
		"invoiceTitle": "",
		"taxNum": "",
		"bankName": "",
		"subBankName": "",
		"bankAccount": "",
		"invoiceTelephone": "",
		"invoiceAddress": "",
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
		"ecsuiteperson": "",
		"ecsuiteuser": "",
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
				"qtyName": 0,
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
				"invoiceOriSum": 0
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

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-04-18

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

