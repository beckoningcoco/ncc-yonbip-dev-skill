---
title: "销售发货详情查询"
apiId: "ebc421eda8fc4341b781050a7ad540ed"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Sales Shipping Document"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Shipping Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售发货详情查询

> `ContentType` 请求方式	GET | 分类: Sales Shipping Document (SCMSD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/sd/voucherdelivery/detail

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
| id | string | query | 是 | 业务数据ID     示例: 1898921154351360 |

## 3. 请求示例

Url: /yonbip/sd/voucherdelivery/detail?access_token=访问令牌&id=1898921154351360

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
| stockOrgId | string | 否 | 库存组织 |
| transactionTypeId | string | 否 | 交易类型id |
| systemDate | string | 否 | 制单系统时间 |
| agentRelationId | string | 否 | 客户交易关系id |
| agentId | string | 否 | 客户id |
| receiveContacterId | string | 否 | 客户联系人id |
| receiveContacterTelephone | string | 否 | 客户联系人固定电话 |
| deliveryType | string | 否 | 发货类型 |
| stockOrgName | string | 否 | 库存组织 |
| deliveryPrices | object | 否 | deliveryPrices |
| transactionTypeId_name | string | 否 | 交易类型名称 |
| vouchdate | string | 否 | 单据日期 |
| reight | number |
| 小数位数:8,最大长度:28 | 否 | 运费金额 |
| auditDate | string | 否 | 审批日期 |
| deliveryPayMoney | number |
| 小数位数:8,最大长度:28 | 否 | 实付金额(不含运费) |
| deliveryRealMoney | number |
| 小数位数:8,最大长度:28 | 否 | 应收金额(不含运费) |
| rebateToOrderMoney | number |
| 小数位数:8,最大长度:28 | 否 | 整单返利金额 |
| code | string | 否 | 发货单编号 |
| rebateToCashMoney | number |
| 小数位数:8,最大长度:28 | 否 | 抵现返利金额 |
| settlementOrgId | string | 否 | 开票组织id |
| deliveryDepartmentId | string | 否 | 发货部门id |
| id | string | 否 | 主表id |
| orderId | string | 否 | 订单id |
| outSysKey | string | 否 | 接口标识 |
| sourceType | string | 否 | 来源单据 |
| source | string | 否 | API来源 |
| isWfControlled | string | 否 | 是否审批流控制 |
| agentId_name | string | 否 | 客户名称 |
| verifystate | string | 否 | 审批状态 |
| returncount | string | 否 | 退回次数（审批流） |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| defaultReceiveDay | string | 否 | 自动收货天数 |
| receiveId | long | 否 | 客户收货地址ID |
| receiverCustId | long | 否 | 收货客户id |
| logisticsOrgId | string | 否 | 物流组织id |
| retailInvestors | string | 否 | 是否散户, true:是、false:否、 |
| unConfirmPrice | string | 否 | 支付未审核的金额 |
| wholeDiscountRate | number |
| 小数位数:8,最大长度:28 | 否 | 整单扣率% |
| wholeFavorableRate | number |
| 小数位数:8,最大长度:28 | 否 | 整单倒扣% |
| confirmPrice | string | 否 | 已支付金额 |
| payStatusCode | string | 否 | 支付状态 |
| enable | boolean | 否 | 是否有效 |
| bizId | string | 否 | 供应商id |
| retailAgentName | string | 否 | 散户名称 |
| bizName | string | 否 | 供应商名称 |
| outSysNo | string | 否 | 接口外部单号 |
| uordercorp | string | 否 | 租户id |
| iDeleted | string | 否 | 是否删除 |
| benable | string | 否 | 是否有效 |
| iOrgId | string | 否 | 组织ID |
| version | string | 否 | 版本 |
| cSubmitName | string | 否 | 提交人 |
| receiveContacter | string | 否 | 客户联系人 |
| status | string | 否 | 单据状态 |
| creatorId | string | 否 | 制单人 |
| receiveContacterPhone | string | 否 | 客户联系人移动电话 |
| shippingChoiceId | long | 否 | 发运方式id |
| auditorId | string | 否 | 审核人id |
| modifierId | string | 否 | 修改id |
| printMessage | string | 否 | 打印信息 |
| printCount | string | 否 | 打印次数 |
| lastPrintDate | string | 否 | 最近打印日期 |
| lastPrintUserId | string | 否 | 最近打印人Id |
| lastPrintUserName | string | 否 | 最近打印人 |
| settlementOrgName | string | 否 | 开票组织 |
| statusCode | string | 否 | 发货状态, DELIVERUNAUDITED:发货待审、DELIVERING:发货已审、OUTSTOCKED:出库完成、DELIVERED:已收货、APPROVING:审批中、PARTOUTSTOCKED:部分出库 |
| cShippingChoiceCode | string | 否 | 发运方式编码 |
| shippingMemo | string | 否 | 备注 |
| bizFlow_name | string | 否 | 流程名称 |
| bizFlow_version | string | 否 | 版本信息 |
| logisticWayId | string | 否 | 物流公司id |
| receiveZipCode | string | 否 | 收货人区域编码 |
| invoiceAgentId | string | 否 | 开票客户id |
| stockCheck | number |
| 小数位数:0,最大长度:10 | 否 | 库存查拣 |
| receiveDate | string | 否 | 收货时间 |
| receiver | string | 否 | 收货联系人 |
| receiveMobile | string | 否 | 收货联系人移动电话 |
| receiveTelePhone | string | 否 | 收货联系人固定电话 |
| receiveAddress | string | 否 | 收货地址 |
| receievInvoiceMobile | string | 否 | 收票手机号 |
| receievInvoiceEmail | string | 否 | 收票邮箱 |
| logisticWayId_name | string | 否 | 物流公司名称 |
| logisticsBillNo | string | 否 | 物流单号 |
| logisticsCarNum | string | 否 | 车牌号 |
| logisticsUserName | string | 否 | 司机姓名 |
| logisticsUserPhone | string | 否 | 司机电话 |
| creator | string | 否 | 制单人 |
| createDate | string | 否 | 创建日期 |
| createTime | string | 否 | 创建时间 |
| auditor | string | 否 | 审核人 |
| auditTime | string | 否 | 审核时间 |
| modifier | string | 否 | 修改人 |
| modifyDate | string | 否 | 修改日期 |
| modifyTime | string | 否 | 修改时间 |
| realMoney | number |
| 小数位数:8,最大长度:28 | 否 | 应收金额 |
| payMoney | number |
| 小数位数:8,最大长度:28 | 否 | 含税金额 |
| invoiceAgentName | string | 否 | 开票客户 |
| modifyInvoiceType | string | 否 | 发票类型可改, true:是、false:否、 |
| invoiceUpcType | string | 否 | 发票类型, 0:收据、1:增值税专用发票、2:增值税普通发票、3:增值税电子普通发票、4:机动车销售销售统一发票、5：增值税电子普通发票(成品油)、6：增值税普通发票(成品油)、7：增值税专用发票(成品油)、8：电子收购发票、9：增值税电子专用发票、10：电子发票（增值税专用发票）、11:电子发票（普通发票） |
| invoiceTitleType | string | 否 | 抬头类型, 0:企业、1:个人、2:非营利组织、 |
| invoiceTitle | string | 否 | 发票抬头 |
| taxNum | string | 否 | 纳税识别号 |
| bankName | string | 否 | 开户银行 |
| subBankName | string | 否 | 开户支行 |
| bankAccount | string | 否 | 银行账号 |
| invoiceTelephone | string | 否 | 营业电话 |
| invoiceAddress | string | 否 | 营业地址 |
| bizFlow | string | 否 | 流程IDid |
| isFlowCoreBill | string | 否 | 是否流程核心单据 |
| deliverydetails | object | 是 | 发货单详情[voucher.delivery.DeliveryDetail] |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"stockOrgId": "",
		"transactionTypeId": "",
		"systemDate": "",
		"agentRelationId": "",
		"agentId": "",
		"receiveContacterId": "",
		"receiveContacterTelephone": "",
		"deliveryType": "",
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
		"wholeDiscountRate": 0,
		"wholeFavorableRate": 0,
		"confirmPrice": "",
		"payStatusCode": "",
		"enable": true,
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
				"enable": true,
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
				"favorableRate": 0,
				"oriTaxUnitOffer": 0,
				"lineDiscountMoney": 0,
				"lineNatDiscountMoney": 0,
				"lineno": "",
				"tradeRouteID": "",
				"tradeRouteID_code": "",
				"tradeRouteID_name": "",
				"isEndTrade": 0,
				"tradeRouteLineno": "",
				"collaborationPocode": "",
				"collaborationPodetailid": "",
				"collaborationPoid": "",
				"collaborationPorowno": "",
				"collaborationSource": "",
				"emergePassStatus": "0：开立；1：审核中；2：已审核",
				"emergePassApplyQty": 12,
				"emergePassClearanceQty": 12,
				"activity": "",
				"activityName": "",
				"activityCode": "",
				"inventoryowner": 123,
				"ownertype": NaN,
				"invExchRateNum": 3,
				"invExchRateDen": 3,
				"invPriceExchRateNum": 3,
				"invPriceExchRateDen": 3
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

1	2026-05-13

新增

返回参数 deliveryType

更新

返回参数 exchangeRateType

更新

返回参数 statusCode

2	2026-02-03

更新

请求说明

新增

返回参数 (4)

更新

返回参数 (253)

【供应链适配物料分数换算率】销售发货API支持分数换算率

3	2025-05-20

新增

返回参数 inventoryowner

新增

返回参数 ownertype

OpenAPI查询接口支持查询货主、货权归属


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

