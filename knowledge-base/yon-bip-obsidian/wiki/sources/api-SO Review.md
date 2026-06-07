---
title: "销售订单审核"
apiId: "382650d125734368a522902224060cb2"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Order"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售订单审核

> `ContentType	application/json` 请求方式	POST | 分类: Sales Order (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/voucherorder/batchaudit

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 否 | 销售订单[voucher.order.Order] |
| id | long | 否 | 否 | id 示例：1958317327470848 |

## 3. 请求示例

Url: /yonbip/sd/voucherorder/batchaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1958317327470848
		}
	]
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
| code | string | 否 | 单据编号 |
| vouchdate | string | 否 | 单据日期 |
| id | string | 否 | 主体ID |
| parentOrderNo | string | 否 | 父级订单号 |
| salesOrgId | string | 否 | 销售组织id |
| salesOrgId_name | string | 否 | 销售组织名称 |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| transactionTypeId_name | string | 否 | 交易类型名称 |
| agentId | string | 否 | 客户id |
| agentId_name | string | 否 | 客户名称 |
| receiveContacter | string | 否 | 客户联系人 |
| receiveContacterPhone | string | 否 | 客户联系人电话 |
| purchaseNo | string | 否 | 客户采购订单号 |
| corpContactUserName | string | 否 | 销售业务员 |
| settlementOrgId_name | string | 否 | 开票组织名称 |
| corpContactUserErpCode | string | 否 | 业务员erp编码 |
| orderPrices | object | 否 | 订单价格 |
| payMoney | number |
| 小数位数:8,最大长度:28 | 否 | 合计含税金额 |
| orderPayMoney | number |
| 小数位数:8,最大长度:28 | 否 | 商品实付金额 |
| realMoney | number |
| 小数位数:8,最大长度:28 | 否 | 应收金额 |
| orderRealMoney | number |
| 小数位数:8,最大长度:28 | 否 | 商品应付金额 |
| statusCode | string | 否 | 订单当前状态码 |
| nextStatus | string | 否 | 订单状态, CONFIRMORDER:开立、DELIVERY_PART:部分发货、DELIVERY_TAKE_PART:部分发货待收货、DELIVERGOODS:待发货、TAKEDELIVERY:待收货、ENDORDER:已完成、OPPOSE:已取消、APPROVING:审批中、 |
| currentStatus | string | 否 | 当前状态位置 |
| payStatusCode | string | 否 | 付款状态, NOTPAYMENT:未付款、PARTPAYMENT:部分付款、CONFIRMPAYMENT:部分付款待确认、CONFIRMPAYMENT_ALL:付款待确认、FINISHPAYMENT:付款完成、 |
| settlementOrgId | string | 否 | 开票组织id |
| lockIn | string | 否 | 标记锁 |
| confirmDate | string | 否 | 订单确认时间 |
| payDate | string | 否 | 订单付款时间 |
| orderPayType | string | 否 | 支付方式 |
| settlement | string | 否 | 结算方式id |
| shippingChoiceId | string | 否 | 发运方式id |
| sendDate | string | 否 | 预计发货日期 |
| hopeReceiveDate | string | 否 | 期望收货日期 |
| opposeMemo | string | 否 | 驳回批注 |
| haveDelivery | string | 否 | 是否存在发货单 |
| occupyInventory | string | 否 | 库存占用时机标识 |
| separatePromotionType | string | 否 | 拆单规则标识 |
| reight | number |
| 小数位数:8,最大长度:28 | 否 | 运费 |
| synSourceOrg | string | 否 | 协同来源组织id |
| synSourceTenant | string | 否 | 协同来源租户 |
| pointsMoney | number |
| 小数位数:8,最大长度:28 | 否 | 积分抵扣金额 |
| synSourceOrg_name | string | 否 | 协同来源组织名称 |
| totalMoney | number |
| 小数位数:8,最大长度:28 | 否 | 总金额 |
| tagName | string | 否 | 采购组织弹框 |
| rebateCashMoney | number |
| 小数位数:8,最大长度:28 | 否 | 抵现金额 |
| unConfirmPrice | number |
| 小数位数:8,最大长度:28 | 否 | 未审核的金额 |
| confirmPrice | number |
| 小数位数:8,最大长度:28 | 否 | 已支付金额 |
| bizId | string | 否 | 商家id |
| bizName | string | 否 | 商家名称 |
| agentRelationId | string | 否 | 客户交易关系id |
| points | string | 否 | 积分 |
| pubts | string | 否 | 时间戳 |
| pubuts | string | 否 | 时间戳 |
| orderInvoice | string | 否 | 发票信息 |
| orderShippingAddress | string | 否 | 收货地址信息 |
| orderErp | string | 否 | 订单erp |
| deliveryDate | string | 否 | 交货日期 |
| isWfControlled | string | 否 | 是否审批流控制 |
| verifystate | string | 否 | 审批状态 |
| status | string | 否 | 状态 |
| isFinishDelivery | string | 否 | 订单是否发完货 |
| productId_pbatchName | string | 否 | 商品包装单位 |
| idKey | string | 否 | 行标识 |
| productId | string | 否 | 商品id |
| isBatchManage | string | 否 | 是否批次管理 |
| isExpiryDateManage | string | 否 | 是否有效期管理 |
| expireDateNo | string | 否 | 保质期 |
| expireDateUnit | string | 否 | 保质期单位 |
| skuId | string | 否 | 商品SKUid |
| erpCode | string | 否 | skuERP编码 |
| orderProductType | string | 否 | 商品售卖类型, SALE:销售品、GIFT:赠品、MARKUP:加价购、REBATE:返利商品、 |
| productCode | string | 否 | 商品编码 |
| productName | string | 否 | 商品名称 |
| skuCode | string | 否 | SKU编码 |
| specDescription | string | 否 | 规格描述 |
| projectId | string | 否 | 项目id |
| unitExchangeType | int | 否 | 浮动（计价） |
| unitExchangeTypePrice | int | 否 | 浮动（销售） |
| productAuxUnitName | string | 否 | 销售单位 |
| invExchRate | number |
| 小数位数:8,最大长度:28 | 否 | 销售换算率 |
| subQty | number |
| 小数位数:8,最大长度:28 | 否 | 销售数量 |
| productUnitName | string | 否 | 计价单位 |
| invPriceExchRate | number |
| 小数位数:8,最大长度:28 | 否 | 计价换算率 |
| priceQty | number |
| 小数位数:8,最大长度:28 | 否 | 计价数量 |
| qtyName | string | 否 | 主计量 |
| qty | number |
| 小数位数:8,最大长度:28 | 否 | 数量 |
| stockName | string | 否 | 发货仓库 |
| stockOrgId_name | string | 否 | 库存组织名称 |
| consignTime | string | 否 | 计划发货日期 |
| projectId_name | string | 否 | 项目名称名称 |
| projectId_code | string | 否 | 项目编码 |
| salePrice | number |
| 小数位数:8,最大长度:28 | 否 | 含税报价 |
| taxId | string | 否 | 数目税率id |
| saleCost | number |
| 小数位数:8,最大长度:28 | 否 | 报价含税金额 |
| stockId | string | 否 | 仓库ID |
| particularlyMoney | number |
| 小数位数:8,最大长度:28 | 否 | 特殊优惠 |
| oriTaxUnitPrice | number |
| 小数位数:8,最大长度:28 | 否 | 含税成交价 |
| orderDetails_stockOrgId | int | 否 | 库存组织id |
| oriSum | number |
| 小数位数:8,最大长度:28 | 否 | 含税金额 |
| transactionTypeId | string | 否 | 交易类型id |
| taxRate | number |
| 小数位数:8,最大长度:28 | 否 | 税率 |
| taxItems | int | 否 | 税目 |
| taxCode | string | 否 | 税目税率编码 |
| rebateMoney | number |
| 小数位数:8,最大长度:28 | 否 | 返利分摊金额 |
| promotionMoney | number |
| 小数位数:8,最大长度:28 | 否 | 促销分摊 |
| shoppingCartId | string | 否 | 购物车id |
| groupId | string | 否 | 分组Id |
| rebateReturnProductId | string | 否 | 返货单商品id |
| mutualActivities | string | 否 | 活动的对象,用于校验互斥活动 |
| activities | string | 否 | 包含的类型,用于校验互斥 |
| bizId | string | 否 | 商家id |
| salesOrgId | string | 否 | 销售组织id |
| sendPayMoney | number |
| 小数位数:8,最大长度:28 | 否 | 累计已发货含税金额 |
| saleDepartmentId | string | 否 | 销售部门id |
| invoiceQty | number |
| 小数位数:8,最大长度:28 | 否 | 累计开票数量 |
| settlementOrgId | string | 否 | 财务组织id |
| invoiceOriSum | number |
| 小数位数:8,最大长度:28 | 否 | 累计开票含税金额 |
| bizProductId | string | 否 | 商家商品id |
| takeQuantity | number |
| 小数位数:8,最大长度:28 | 否 | 已审核收数量 |
| bizSkuId | string | 否 | 商家skuid |
| takeSalePayMoney | number |
| 小数位数:8,最大长度:28 | 否 | 已审核收金额 |
| orderDetailPrice | number |
| 小数位数:8,最大长度:28 | 否 | 订单金额 |
| sendQty | number |
| 小数位数:8,最大长度:28 | 否 | 累计已发货数量 |
| closedSumMoney | number |
| 小数位数:8,最大长度:28 | 否 | 关闭总金额 |
| closedRowCount | number |
| 小数位数:8,最大长度:28 | 否 | 行关闭数量 |
| iDeleted | string | 否 | 未定义名称 |
| iOrgId | string | 否 | 组织ID |
| createDate | string | 否 | 创建时间 |
| memo | string | 否 | 备注 |
| createDate | string | 否 | 创建日期 |
| creatorId | string | 否 | 创建人 |
| auditorId | string | 否 | 审核人ID |
| auditDate | string | 否 | 审批日期 |
| closerId | string | 否 | 关闭人ID |
| closeDate | string | 否 | 关闭日期 |
| modifierId | string | 否 | 修改人id |
| modifyDate | string | 否 | 修改日期 |
| cCreator | string | 否 | 创建人 |
| iProductAuxUnitId | string | 否 | 销售单位id |
| iProductUnitId | string | 否 | 计价单位id |
| masterUnitId | string | 否 | 主计量单位id |
| purUOM_Precision | string | 否 | 销售单位精度 |
| priceUOM_Precision | string | 否 | 计价单位精度 |
| unit_Precision | string | 否 | 主计量单位精度 |
| cBizName | string | 否 | 供应商名称 |
| orderDetailId | string | 否 | 主体ID |
| orderId | long | 否 | 订单ID |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| auditor | string | 否 | 审批人 |
| auditTime | string | 否 | 审批时间 |
| closeTime | string | 否 | 关闭时间 |
| closer | string | 否 | 关闭人 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| bmake_st_salesout | string | 否 | 流程入库 |
| bmake_voucher_delivery | string | 否 | 流程发货 |
| bizFlow | string | 否 | 流程IDid |
| bmake_voucher_saleinvoice | string | 否 | 流程开票 |
| isFlowCoreBill | string | 否 | 是否流程核心单据 |
| bizFlow_version | string | 否 | 版本信息 |
| batchNo | string | 否 | 批次号 |
| productDate | string | 否 | 生产日期 |
| invalidDate | string | 否 | 有效期至 |
| receiveTelePhone | string | 否 | 收货人固定电话 |
| receiveZipCode | string | 否 | 收货人邮编 |
| cSettlementCode | string | 否 | 结算方式编码 |
| retailAgentName | string | 否 | 散户名称 |
| retailInvestors | string | 否 | 是否散户, true:是、false:否、 |
| saleDepartmentId_name | string | 否 | 销售部门名称 |
| source | string | 否 | 单据来源, 0:PC端、1:移动端、3:导入、4:ERP、 |
| receiveAgreementId_name | string | 否 | 收款协议名称 |
| receiver | string | 否 | 收货人 |
| receiveMobile | string | 否 | 收货电话 |
| receiveAddress | string | 否 | 收货地址 |
| settlement_name | string | 否 | 结算方式名称 |
| shippingChoiceId_name | string | 否 | 发运方式名称 |
| shippingChoiceId_code | string | 否 | 发运方式编码 |
| modifyInvoiceType | string | 否 | 发票类型可改, true:是、false:否、 |
| invoiceUpcType | string | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、 |
| invoiceTitleType | string | 否 | 抬头类型, 0:企业、1:个人、2:非营利组织、 |
| invoiceTitle | string | 否 | 发票抬头 |
| taxNum | string | 否 | 纳税识别号 |
| bankName | string | 否 | 开户银行 |
| subBankName | string | 否 | 开户支行 |
| bankAccount | string | 否 | 银行账号 |
| invoiceTelephone | string | 否 | 营业电话 |
| invoiceAddress | string | 否 | 营业地址 |
| createSource | string | 否 | 来源系统, 1:销售、2:U订货门户、4:采购、3:其他外部系统、 |
| payMoneyOrigTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 合计无税金额 |
| bizFlow_name | string | 否 | 流程名称名称, CONFIRMORDER:开立、DELIVERY_PART:部分发货、DELIVERY_TAKE_PART:部分发货待收货、DELIVERGOODS:待发货、TAKEDELIVERY:待收货、ENDORDER:已完成、OPPOSE:已取消、APPROVING:审批中、 |
| skuName | string | 否 | SKU名称 |
| model | string | 否 | 型号 |
| deliveryDays | string | 否 | 交货周期 |
| upcode | string | 否 | 协同来源单据号 |
| auditCount | number |
| 小数位数:8,最大长度:28 | 否 | 累计发货已审数量 |
| orderOutPut | string | 否 | 累计下达生产量 |
| orderPurchaseQty | number |
| 小数位数:8,最大长度:28 | 否 | 累计采购数量 |
| totalOutStockSubQty | string | 否 | 累计出库件数 |
| totalOutStockOriMoney | number |
| 小数位数:8,最大长度:28 | 否 | 累计出库无税金额 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"code": "",
		"vouchdate": "",
		"id": "",
		"parentOrderNo": "",
		"salesOrgId": "",
		"salesOrgId_name": "",
		"saleDepartmentId": "",
		"transactionTypeId": "",
		"transactionTypeId_name": "",
		"agentId": "",
		"agentId_name": "",
		"receiveContacter": "",
		"receiveContacterPhone": "",
		"purchaseNo": "",
		"corpContactUserName": "",
		"settlementOrgId_name": "",
		"corpContactUserErpCode": "",
		"orderPrices": {
			"currency": "",
			"currency_priceDigit": "",
			"currency_moneyDigit": "",
			"originalName": "",
			"natCurrency": "",
			"natCurrency_priceDigit": "",
			"natCurrency_moneyDigit": "",
			"domesticCode": "",
			"domesticName": "",
			"exchRate": 0,
			"exchangeRateType_name": "",
			"exchangeRateType": "",
			"originalCode": "",
			"taxInclusive": "",
			"totalNatTax": 0
		},
		"payMoney": 0,
		"orderPayMoney": 0,
		"realMoney": 0,
		"orderRealMoney": 0,
		"statusCode": "",
		"nextStatus": "",
		"currentStatus": "",
		"payStatusCode": "",
		"settlementOrgId": "",
		"lockIn": "",
		"confirmDate": "",
		"payDate": "",
		"orderPayType": "",
		"settlement": "",
		"shippingChoiceId": "",
		"sendDate": "",
		"hopeReceiveDate": "",
		"opposeMemo": "",
		"haveDelivery": "",
		"occupyInventory": "",
		"separatePromotionType": "",
		"reight": 0,
		"synSourceOrg": "",
		"synSourceTenant": "",
		"pointsMoney": 0,
		"synSourceOrg_name": "",
		"totalMoney": 0,
		"tagName": "",
		"rebateCashMoney": 0,
		"unConfirmPrice": 0,
		"confirmPrice": 0,
		"bizId": "",
		"bizName": "",
		"agentRelationId": "",
		"points": "",
		"pubts": "",
		"pubuts": "",
		"orderInvoice": "",
		"orderShippingAddress": "",
		"orderErp": "",
		"deliveryDate": "",
		"isWfControlled": "",
		"verifystate": "",
		"status": "",
		"isFinishDelivery": "",
		"productId_pbatchName": "",
		"idKey": "",
		"productId": "",
		"isBatchManage": "",
		"isExpiryDateManage": "",
		"expireDateNo": "",
		"expireDateUnit": "",
		"skuId": "",
		"erpCode": "",
		"orderProductType": "",
		"productCode": "",
		"productName": "",
		"skuCode": "",
		"specDescription": "",
		"projectId": "",
		"unitExchangeType": 0,
		"unitExchangeTypePrice": 0,
		"productAuxUnitName": "",
		"invExchRate": 0,
		"subQty": 0,
		"productUnitName": "",
		"invPriceExchRate": 0,
		"priceQty": 0,
		"qtyName": "",
		"qty": 0,
		"stockName": "",
		"stockOrgId_name": "",
		"consignTime": "",
		"projectId_name": "",
		"projectId_code": "",
		"salePrice": 0,
		"taxId": "",
		"saleCost": 0,
		"stockId": "",
		"particularlyMoney": 0,
		"oriTaxUnitPrice": 0,
		"orderDetails_stockOrgId": 0,
		"oriSum": 0,
		"taxRate": 0,
		"taxItems": 0,
		"taxCode": "",
		"rebateMoney": 0,
		"promotionMoney": 0,
		"shoppingCartId": "",
		"groupId": "",
		"rebateReturnProductId": "",
		"mutualActivities": "",
		"activities": "",
		"sendPayMoney": 0,
		"invoiceQty": 0,
		"invoiceOriSum": 0,
		"bizProductId": "",
		"takeQuantity": 0,
		"bizSkuId": "",
		"takeSalePayMoney": 0,
		"orderDetailPrice": 0,
		"sendQty": 0,
		"closedSumMoney": 0,
		"closedRowCount": 0,
		"iDeleted": "",
		"iOrgId": "",
		"createDate": "",
		"memo": "",
		"creatorId": "",
		"auditorId": "",
		"auditDate": "",
		"closerId": "",
		"closeDate": "",
		"modifierId": "",
		"modifyDate": "",
		"cCreator": "",
		"iProductAuxUnitId": "",
		"iProductUnitId": "",
		"masterUnitId": "",
		"purUOM_Precision": "",
		"priceUOM_Precision": "",
		"unit_Precision": "",
		"cBizName": "",
		"orderDetailId": "",
		"orderId": 0,
		"creator": "",
		"createTime": "",
		"auditor": "",
		"auditTime": "",
		"closeTime": "",
		"closer": "",
		"modifier": "",
		"modifyTime": "",
		"bmake_st_salesout": "",
		"bmake_voucher_delivery": "",
		"bizFlow": "",
		"bmake_voucher_saleinvoice": "",
		"isFlowCoreBill": "",
		"bizFlow_version": "",
		"batchNo": "",
		"productDate": "",
		"invalidDate": "",
		"receiveTelePhone": "",
		"receiveZipCode": "",
		"cSettlementCode": "",
		"retailAgentName": "",
		"retailInvestors": "",
		"saleDepartmentId_name": "",
		"source": "",
		"receiveAgreementId_name": "",
		"receiver": "",
		"receiveMobile": "",
		"receiveAddress": "",
		"settlement_name": "",
		"shippingChoiceId_name": "",
		"shippingChoiceId_code": "",
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
		"createSource": "",
		"payMoneyOrigTaxfree": 0,
		"bizFlow_name": "",
		"skuName": "",
		"model": "",
		"deliveryDays": "",
		"upcode": "",
		"auditCount": 0,
		"orderOutPut": "",
		"orderPurchaseQty": 0,
		"totalOutStockSubQty": "",
		"totalOutStockOriMoney": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-01

更新

返回参数 settlementOrgId

更新

返回参数 createDate

销售订单审核支持用户身份透传

2	2025-06-30

更新

请求说明

更新

返回参数 settlementOrgId

更新

返回参数 createDate

销售订单审核接口支持用户身份透传


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

