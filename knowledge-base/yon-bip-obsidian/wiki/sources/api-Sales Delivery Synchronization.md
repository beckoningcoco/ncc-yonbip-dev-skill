---
title: "销售发货同步"
apiId: "1835202614811164677"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Shipping Document"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Shipping Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售发货同步

> `ContentType	application/json` 请求方式	POST | 分类: Sales Shipping Document (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/voucherdelivery/syncDeliveryMix

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| routeDirection | string | header | 是 | 路由参数 |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| creatorIdYht | string | 否 | 否 | 制单人-友互通 |
| auditorIdYht | string | 否 | 否 | 审核人-友互通 |
| stockOrgId | string | 否 | 否 | 库存组织id |
| transactionTypeId | string | 否 | 否 | 交易类型id |
| transactionTypeId_code | string | 否 | 否 | 交易类型code |
| systemDate | string | 否 | 否 | 制单系统时间 |
| agentRelationId | string | 否 | 否 | 客户交易关系id |
| agentId | string | 否 | 是 | 客户id |
| receiveContacterId | string | 否 | 否 | 客户联系人id |
| receiveContacterTelephone | string | 否 | 否 | 客户联系人固定电话 |
| stockOrgName | string | 否 | 否 | 库存组织name |
| deliveryPrices | object | 否 | 否 | deliveryPrices |
| currency_priceDigit | string | 否 | 否 | 原币单价精度 |
| currency_moneyDigit | string | 否 | 否 | 原币金额精度 |
| currency | string | 否 | 否 | 币种id |
| natCurrency_priceDigit | string | 否 | 否 | 本币单价精度 |
| natCurrency_moneyDigit | string | 否 | 否 | 本币金额精度 |
| natCurrency | string | 否 | 否 | 本币pk |
| exchangeRateType | string | 否 | 否 | 汇率类型Idid |
| totalOutStockRebateMoney | float | 否 | 否 | 累计出库折扣返利分摊金额 |
| deliveryId | string | 否 | 否 | 主键ID |
| originalCode | string | 否 | 否 | 原币简称 |
| originalName | string | 否 | 否 | 币种 |
| domesticCode | string | 否 | 否 | 本币简称 |
| domesticName | string | 否 | 否 | 本币 |
| taxInclusive | string | 否 | 否 | 单价含税 |
| exchangeRateType_name | string | 否 | 否 | 汇率类型名称 |
| exchRate | float | 否 | 否 | 汇率 |
| payOriTax | float | 否 | 否 | 税额 |
| payNatTax | float | 否 | 否 | 本币税额 |
| transactionTypeId_name | string | 否 | 否 | 交易类型名称 |
| vouchdate | string | 否 | 是 | 单据日期 |
| reight | float | 否 | 否 | 运费金额 |
| auditDate | string | 否 | 否 | 审批日期 |
| deliveryPayMoney | float | 否 | 否 | 实付金额 |
| deliveryRealMoney | float | 否 | 否 | 应收金额real |
| rebateToOrderMoney | float | 否 | 否 | 整单返利金额 |
| code | string | 否 | 否 | 发货单编号 |
| rebateToCashMoney | float | 否 | 否 | 抵现返利金额 |
| settlementOrgId | string | 否 | 否 | 开票组织id |
| deliveryDepartmentId | string | 否 | 否 | 发货部门id |
| id | string | 否 | 否 | 主表id |
| orderId | string | 否 | 否 | 订单id |
| outSysKey | string | 否 | 否 | 接口标识 |
| sourceType | string | 否 | 否 | 来源单据 |
| source | string | 否 | 否 | API来源 |
| isWfControlled | string | 否 | 否 | 是否审批流控制 |
| agentId_name | string | 否 | 否 | 客户名称 |
| verifystate | string | 否 | 否 | 审批状态 |
| returncount | string | 否 | 否 | 退回次数 |
| pubts | string | 否 | 否 | 时间戳 |
| defaultReceiveDay | string | 否 | 否 | 自动收货天数 |
| receiveId | float | 否 | 否 | 客户收货地址ID |
| receiverCustId | float | 否 | 否 | 收货客户id |
| logisticsOrgId | string | 否 | 是 | 物流组织id |
| retailInvestors | string | 否 | 否 | 是否散户 |
| unConfirmPrice | string | 否 | 否 | 支付未审核的金额 |
| confirmPrice | string | 否 | 否 | 已支付金额 |
| payStatusCode | string | 否 | 否 | 支付状态 |
| enable | float | 否 | 否 | 是否有效enable |
| bizId | string | 否 | 否 | 供应商id |
| retailAgentName | string | 否 | 否 | 散户名称 |
| bizName | string | 否 | 否 | 供应商名称 |
| outSysNo | string | 否 | 否 | 接口外部单号 |
| uordercorp | string | 否 | 否 | 租户id |
| iDeleted | string | 否 | 否 | 是否删除 |
| benable | string | 否 | 否 | 是否有效 |
| iOrgId | string | 否 | 否 | 组织ID |
| version | string | 否 | 否 | 版本 |
| cSubmitName | string | 否 | 否 | 提交人 |
| receiveContacter | string | 否 | 否 | 客户联系人 |
| status | string | 否 | 否 | 单据状态 |
| creatorId | string | 否 | 是 | 制单人id |
| receiveContacterPhone | string | 否 | 否 | 客户联系人移动电话 |
| shippingChoiceId | float | 否 | 否 | 发运方式id |
| auditorId | string | 否 | 否 | 审核人id |
| modifierId | string | 否 | 否 | 修改id |
| printMessage | string | 否 | 否 | 打印信息 |
| printCount | string | 否 | 否 | 打印次数 |
| lastPrintDate | string | 否 | 否 | 最近打印日期 |
| lastPrintUserId | string | 否 | 否 | 最近打印人Id |
| lastPrintUserName | string | 否 | 否 | 最近打印人 |
| settlementOrgName | string | 否 | 否 | 开票组织 |
| statusCode | string | 否 | 否 | 发货状态 |
| cShippingChoiceCode | string | 否 | 否 | 发运方式编码 |
| shippingMemo | string | 否 | 否 | 备注 |
| bizFlow_name | string | 否 | 否 | 流程名称 |
| bizFlow_version | string | 否 | 否 | 版本信息 |
| logisticWayId | string | 否 | 否 | 物流公司id |
| receiveZipCode | string | 否 | 否 | 收货人区域编码 |
| invoiceAgentId | string | 否 | 否 | 开票客户id |
| stockCheck | float | 否 | 否 | 库存查拣 |
| receiveDate | string | 否 | 否 | 收货时间 |
| receiver | string | 否 | 否 | 收货联系人 |
| receiveMobile | string | 否 | 否 | 收货联系人移动电话 |
| receiveTelePhone | string | 否 | 否 | 收货联系人固定电话 |
| receiveAddress | string | 否 | 否 | 收货地址 |
| receievInvoiceMobile | string | 否 | 否 | 收票手机号 |
| receievInvoiceEmail | string | 否 | 否 | 收票邮箱 |
| logisticWayId_name | string | 否 | 否 | 物流公司名称 |
| logisticsBillNo | string | 否 | 否 | 物流单号 |
| logisticsCarNum | string | 否 | 否 | 车牌号 |
| logisticsUserName | string | 否 | 否 | 司机姓名 |
| logisticsUserPhone | string | 否 | 否 | 司机电话 |
| creator | string | 否 | 否 | 制单人 |
| createDate | string | 否 | 否 | 创建日期 |
| createTime | string | 否 | 否 | 创建时间 |
| auditor | string | 否 | 否 | 审核人 |
| auditTime | string | 否 | 否 | 审核时间 |
| modifier | string | 否 | 否 | 修改人 |
| modifyDate | string | 否 | 否 | 修改日期 |
| modifyTime | string | 否 | 否 | 修改时间 |
| realMoney | float | 否 | 否 | 应收金额 |
| payMoney | float | 否 | 否 | 含税金额 |
| invoiceAgentName | string | 否 | 否 | 开票客户 |
| modifyInvoiceType | string | 否 | 否 | 发票类型可改 |
| invoiceUpcType | string | 否 | 否 | 发票类型 |
| invoiceTitleType | string | 否 | 否 | 抬头类型 |
| invoiceTitle | string | 否 | 否 | 发票抬头 |
| taxNum | string | 否 | 否 | 纳税识别号 |
| bankName | string | 否 | 否 | 开户银行 |
| subBankName | string | 否 | 否 | 开户支行 |
| bankAccount | string | 否 | 否 | 银行账号 |
| invoiceTelephone | string | 否 | 否 | 营业电话 |
| invoiceAddress | string | 否 | 否 | 营业地址 |
| bizFlow | string | 否 | 否 | 流程IDid |
| isFlowCoreBill | string | 否 | 否 | 是否流程核心单据 |
| deliverydetails | object | 是 | 否 | 发货单详情 |
| deliveryId | string | 否 | 是 | 发货单ID |
| orderNo | string | 否 | 否 | 来源单据号 |
| orderId | string | 否 | 否 | 来源订单id |
| orderDetailId | string | 否 | 否 | 来源单据行id |
| orderDetailIdKey | string | 否 | 否 | 来源单据idkey |
| sourceid | string | 否 | 否 | 来源单据ID |
| sourceautoid | string | 否 | 否 | 来源单据子表ID |
| source | string | 否 | 否 | 来源单据类型 |
| makeRuleCode | string | 否 | 否 | 生单类型编码 |
| erpCode | string | 否 | 否 | erp编码 |
| skuId | string | 否 | 否 | 商品SKUid |
| productAuxUnitId | string | 否 | 是 | 销售单位id |
| productUnitId | string | 否 | 是 | 计价单位id |
| masterUnitId | string | 否 | 是 | 主计量单位id |
| purUOM_Precision | float | 否 | 否 | 销售单位精度 |
| priceUOM_Precision | float | 否 | 否 | 计价单位精度 |
| unit_Precision | float | 否 | 否 | 主计量单位精度 |
| sourceOriPrice | float | 否 | 否 | 来源含税单价 |
| salePrice | float | 否 | 否 | 含税原始报价 |
| tailDifferenceMoney | float | 否 | 否 | 尾差金额 |
| idKey | string | 否 | 否 | idKey |
| groupId | string | 否 | 否 | 分组ID |
| productId | string | 否 | 是 | 商品id |
| deliveredQuantity | string | 否 | 否 | 订单已发货数量 |
| outSysKey | string | 否 | 否 | 接口标识 |
| created | string | 否 | 否 | 创建时间 |
| stockId | string | 否 | 否 | 发货仓库id |
| batchId | string | 否 | 否 | 批次id |
| enable | float | 否 | 否 | 是否有效 |
| bizProductId | string | 否 | 否 | 商家商品id |
| id | string | 否 | 否 | 主体ID |
| pubts | string | 否 | 否 | 时间戳 |
| corpContact | string | 否 | 否 | 销售业务员 |
| corpContactUserErpCode | string | 否 | 否 | 业务员erp编码 |
| detailStockOrgId | string | 否 | 是 | 库存组织id |
| detailSettlementOrgId | string | 否 | 否 | 开票组织id |
| detailSalesOrgId | string | 否 | 否 | 销售组织id |
| detailSaleDepartmentId | string | 否 | 否 | 销售部门id |
| taxId | string | 否 | 否 | 税目税率id |
| projectId | string | 否 | 否 | 项目id |
| unitExchangeType | float | 否 | 否 | 浮动换算率 |
| unitExchangeTypePrice | float | 否 | 否 | 浮动换算率price |
| totalOutStockOriTaxMoney | float | 否 | 否 | 累计出库含税金额 |
| totalOutStockOriMoney | float | 否 | 否 | 累计出库无税金额 |
| totalOutStockOriTax | float | 否 | 否 | 累计出库税额 |
| totalSaleInvoiceOriMoney | float | 否 | 否 | 累计开票无税金额 |
| totalSaleInvoiceOriTax | float | 否 | 否 | 累计开票税额 |
| deliveryDetailPrices | object | 否 | 是 | deliveryDetailPrices |
| upcode | string | 否 | 否 | 来源单据号code |
| productCode | string | 否 | 否 | 商品编码 |
| productName | string | 否 | 否 | 商品名称 |
| modelDescription | string | 否 | 否 | 规格 |
| model | string | 否 | 否 | 型号 |
| skuCode | string | 否 | 否 | SKU编码 |
| skuName | string | 否 | 否 | SKU名称 |
| specDescription | string | 否 | 否 | 规格描述 |
| orderProductType | string | 否 | 否 | 商品售卖类型 |
| productAuxUnitName | string | 否 | 否 | 销售单位 |
| invExchRate | float | 否 | 是 | 销售换算率 |
| subQty | float | 否 | 是 | 发货数量 |
| productUnitName | string | 否 | 否 | 计价单位 |
| invPriceExchRate | float | 否 | 是 | 计价换算率 |
| priceQty | float | 否 | 是 | 计价数量 |
| qtyName | string | 否 | 否 | 主计量 |
| qty | float | 否 | 是 | 数量 |
| stockName | string | 否 | 否 | 仓库 |
| sendDate | string | 否 | 否 | 计划发货日期 |
| isBatchManage | string | 否 | 否 | 是否批次管理 |
| batchNo | string | 否 | 否 | 批次号 |
| isExpiryDateManage | string | 否 | 否 | 是否生效日期管理 |
| productDate | string | 否 | 否 | 生产日期 |
| expireDateNo | string | 否 | 否 | 有效期 |
| expireDateUnit | string | 否 | 否 | 有效期单位 |
| invalidDate | string | 否 | 否 | 有效期至 |
| projectCode | string | 否 | 否 | 项目编码 |
| projectName | string | 否 | 否 | 项目名称 |
| detailStockOrgName | string | 否 | 否 | 库存组织 |
| detailSettlementOrgName | string | 否 | 否 | 开票组织 |
| detailSalesOrgName | string | 否 | 否 | 销售组织name |
| detailSaleDepartmentName | string | 否 | 否 | 销售部门 |
| corpContactUserName | string | 否 | 否 | 销售业务员name |
| oriTaxUnitPrice | float | 否 | 是 | 含税单价 |
| oriSum | float | 否 | 是 | 含税金额 |
| taxItems | string | 否 | 否 | 税目 |
| taxCode | string | 否 | 否 | 税率编码 |
| taxRate | string | 否 | 否 | 税率 |
| totalOutStockQuantity | float | 否 | 否 | 累计出库数量 |
| totalOutStockSubQty | float | 否 | 否 | 累计出库件数 |
| invoiceQty | float | 否 | 否 | 累计开票数量 |
| invoiceOriSum | float | 否 | 否 | 累计开票含税金额 |
| remark | string | 否 | 否 | 备注 |
| discountRate | float | 否 | 否 | 扣率 |
| oriTaxUnitOffer | float | 否 | 否 | 含税报价 |
| lineDiscountMoney | float | 否 | 否 | 扣额 |
| lineNatDiscountMoney | float | 否 | 否 | 本币扣额 |
| lineno | string | 否 | 是 | 行号 |

## 3. 请求示例

Url: /yonbip/sd/voucherdelivery/syncDeliveryMix?access_token=访问令牌
Header: 
	routeDirection : ""
Body: [{
	"creatorIdYht": "",
	"auditorIdYht": "",
	"stockOrgId": "",
	"transactionTypeId": "",
	"transactionTypeId_code": "",
	"systemDate": "",
	"agentRelationId": "",
	"agentId": "",
	"receiveContacterId": "",
	"receiveContacterTelephone": "",
	"stockOrgName": "",
	"deliveryPrices": {
		"currency_priceDigit": "",
		"currency_moneyDigit": "",
		"currency": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"natCurrency": "",
		"exchangeRateType": "",
		"totalOutStockRebateMoney": 0,
		"deliveryId": "",
		"originalCode": "",
		"originalName": "",
		"domesticCode": "",
		"domesticName": "",
		"taxInclusive": "",
		"exchangeRateType_name": "",
		"exchRate": 0,
		"payOriTax": 0,
		"payNatTax": 0
	},
	"transactionTypeId_name": "",
	"vouchdate": "",
	"reight": 0,
	"auditDate": "",
	"deliveryPayMoney": 0,
	"deliveryRealMoney": 0,
	"rebateToOrderMoney": 0,
	"code": "",
	"rebateToCashMoney": 0,
	"settlementOrgId": "",
	"deliveryDepartmentId": "",
	"id": "",
	"orderId": "",
	"outSysKey": "",
	"sourceType": "",
	"source": "",
	"isWfControlled": "",
	"agentId_name": "",
	"verifystate": "",
	"returncount": "",
	"pubts": "",
	"defaultReceiveDay": "",
	"receiveId": 0,
	"receiverCustId": 0,
	"logisticsOrgId": "",
	"retailInvestors": "",
	"unConfirmPrice": "",
	"confirmPrice": "",
	"payStatusCode": "",
	"enable": 0,
	"bizId": "",
	"retailAgentName": "",
	"bizName": "",
	"outSysNo": "",
	"uordercorp": "",
	"iDeleted": "",
	"benable": "",
	"iOrgId": "",
	"version": "",
	"cSubmitName": "",
	"receiveContacter": "",
	"status": "",
	"creatorId": "",
	"receiveContacterPhone": "",
	"shippingChoiceId": 0,
	"auditorId": "",
	"modifierId": "",
	"printMessage": "",
	"printCount": "",
	"lastPrintDate": "",
	"lastPrintUserId": "",
	"lastPrintUserName": "",
	"settlementOrgName": "",
	"statusCode": "",
	"cShippingChoiceCode": "",
	"shippingMemo": "",
	"bizFlow_name": "",
	"bizFlow_version": "",
	"logisticWayId": "",
	"receiveZipCode": "",
	"invoiceAgentId": "",
	"stockCheck": 0,
	"receiveDate": "",
	"receiver": "",
	"receiveMobile": "",
	"receiveTelePhone": "",
	"receiveAddress": "",
	"receievInvoiceMobile": "",
	"receievInvoiceEmail": "",
	"logisticWayId_name": "",
	"logisticsBillNo": "",
	"logisticsCarNum": "",
	"logisticsUserName": "",
	"logisticsUserPhone": "",
	"creator": "",
	"createDate": "",
	"createTime": "",
	"auditor": "",
	"auditTime": "",
	"modifier": "",
	"modifyDate": "",
	"modifyTime": "",
	"realMoney": 0,
	"payMoney": 0,
	"invoiceAgentName": "",
	"modifyInvoiceType": "",
	"invoiceUpcType": "",
	"invoiceTitleType": "",
	"invoiceTitle": "",
	"taxNum": "",
	"bankName": "",
	"subBankName": "",
	"bankAccount": "",
	"invoiceTelephone": "",
	"invoiceAddress": "",
	"bizFlow": "",
	"isFlowCoreBill": "",
	"deliverydetails": [
		{
			"deliveryId": "",
			"orderNo": "",
			"orderId": "",
			"orderDetailId": "",
			"orderDetailIdKey": "",
			"sourceid": "",
			"sourceautoid": "",
			"source": "",
			"makeRuleCode": "",
			"erpCode": "",
			"skuId": "",
			"productAuxUnitId": "",
			"productUnitId": "",
			"masterUnitId": "",
			"purUOM_Precision": 0,
			"priceUOM_Precision": 0,
			"unit_Precision": 0,
			"sourceOriPrice": 0,
			"salePrice": 0,
			"tailDifferenceMoney": 0,
			"idKey": "",
			"groupId": "",
			"productId": "",
			"deliveredQuantity": "",
			"outSysKey": "",
			"created": "",
			"stockId": "",
			"batchId": "",
			"enable": 0,
			"bizProductId": "",
			"id": "",
			"pubts": "",
			"corpContact": "",
			"corpContactUserErpCode": "",
			"detailStockOrgId": "",
			"detailSettlementOrgId": "",
			"detailSalesOrgId": "",
			"detailSaleDepartmentId": "",
			"taxId": "",
			"projectId": "",
			"unitExchangeType": 0,
			"unitExchangeTypePrice": 0,
			"totalOutStockOriTaxMoney": 0,
			"totalOutStockOriMoney": 0,
			"totalOutStockOriTax": 0,
			"totalSaleInvoiceOriMoney": 0,
			"totalSaleInvoiceOriTax": 0,
			"deliveryDetailPrices": {
				"deliveryDetailId": "",
				"oriUnitPrice": 0,
				"oriMoney": 0,
				"oriTax": 0,
				"natTaxUnitPrice": 0,
				"natUnitPrice": 0,
				"natSum": 0,
				"natMoney": 0,
				"natTax": 0
			},
			"upcode": "",
			"productCode": "",
			"productName": "",
			"modelDescription": "",
			"model": "",
			"skuCode": "",
			"skuName": "",
			"specDescription": "",
			"orderProductType": "",
			"productAuxUnitName": "",
			"invExchRate": 0,
			"subQty": 0,
			"productUnitName": "",
			"invPriceExchRate": 0,
			"priceQty": 0,
			"qtyName": "",
			"qty": 0,
			"stockName": "",
			"sendDate": "",
			"isBatchManage": "",
			"batchNo": "",
			"isExpiryDateManage": "",
			"productDate": "",
			"expireDateNo": "",
			"expireDateUnit": "",
			"invalidDate": "",
			"projectCode": "",
			"projectName": "",
			"detailStockOrgName": "",
			"detailSettlementOrgName": "",
			"detailSalesOrgName": "",
			"detailSaleDepartmentName": "",
			"corpContactUserName": "",
			"oriTaxUnitPrice": 0,
			"oriSum": 0,
			"taxItems": "",
			"taxCode": "",
			"taxRate": "",
			"totalOutStockQuantity": 0,
			"totalOutStockSubQty": 0,
			"invoiceQty": 0,
			"invoiceOriSum": 0,
			"remark": "",
			"discountRate": 0,
			"oriTaxUnitOffer": 0,
			"lineDiscountMoney": 0,
			"lineNatDiscountMoney": 0,
			"lineno": ""
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| success | string | 否 | 请求是否成功 |
| data | string | 否 | 返回参数 |
| code | string | 否 | 请求返回编码 |
| message | string | 否 | 请求返回信息 |

## 5. 正确返回示例

{
	"success": "",
	"data": "",
	"code": "",
	"message": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

