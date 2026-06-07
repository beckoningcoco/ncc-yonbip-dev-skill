---
title: "销售退货详情查询"
apiId: "357ee5b0d1e742aea97264de777807c3"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Sales Return"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Return]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售退货详情查询

> `ContentType` 请求方式	GET | 分类: Sales Return (SCMSD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/sd/vouchersalereturn/detail

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
| id | string | query | 是 | 业务数据ID     示例: 222433234234323423 |

## 3. 请求示例

Url: /yonbip/sd/vouchersalereturn/detail?access_token=访问令牌&id=222433234234323423

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
| bmake_st_salesout | boolean | 否 | 流程出库 |
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
| exchangeRateType | string | 否 | 汇率类型Id |
| exchRate | number |
| 小数位数:8,最大长度:28 | 否 | 汇率 |
| taxInclusive | boolean | 否 | 单价含税, true:是、false:否、 |
| saleReturnStatus | string | 否 | 单据状态, SUBMITSALERETURN:开立、CONFIRMSALERETURNORDER:已确认、SALERETURNING:退货中、ENDSALERETURN:已审核、OPPOSESALERETURN:已驳回、 |
| returnStatus | string | 否 | 退货状态： 退货状态，SUBMITSALERETURN:待退货审核、CONFIRMSALERETURNORDER:待退货、SALERETURNING:退货中、ENDSALERETURN:已完成、OPPOSESALERETURN:已驳回、 |
| deliverTime | string | 否 | 出库时点，DELIVEAFTERCONFIRM:确认后出库、DELIVEAFTERAUDIT：审核后出库 |
| saleReturnSourceType | string | 否 | 退货类型, NONE:无来源、DELIVERYEND:销售出库单、 |
| bizFlow_name | string | 否 | 流程名称 |
| bizFlow_version | string | 否 | 版本信息 |
| logisticWayId | string | 否 | 物流公司id |
| invoiceAgentId | string | 否 | 开票客户id |
| modifyInvoiceType | string | 否 | 发票类型是否可改, true:是、false:否、 |
| shippingChoiceId | string | 否 | 发运方式id |
| rebateToOrderMoney | number |
| 小数位数:8,最大长度:28 | 否 | 整单返利金额 |
| rebateToCashMoney | number |
| 小数位数:8,最大长度:28 | 否 | 抵现返利金额 |
| shippingChoiceId_code | string | 否 | 发运方式编码 |
| rebateToOrderMoneyOrigTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 无税整单返利金额 |
| rebateToCashMoneyOrigTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 无税抵现返利金额 |
| shippingChoiceId_name | string | 否 | 发运方式名称 |
| wholeDiscountRate | number |
| 小数位数:8,最大长度:28 | 否 | 整单扣率% |
| wholeFavorableRate | number |
| 小数位数:8,最大长度:28 | 否 | 整单倒扣% |
| rebateToOrderMoneyDomestic | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税整单返利金额 |
| rebateToCashMoneyDomestic | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税抵现返利金额 |
| rebateToOrderMoneyDomesticTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税整单返利金额 |
| rebateToCashMoneyDomesticTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税抵现返利金额 |
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
| totalMoney | number |
| 小数位数:8,最大长度:28 | 否 | 总金额 |
| payMoney | number |
| 小数位数:8,最大长度:28 | 否 | 退货金额 |
| totalMoneyOrigTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 无税总金额 |
| payMoneyOrigTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 无税退货金额 |
| totalOriTax | number |
| 小数位数:8,最大长度:28 | 否 | 税额 |
| totalMoneyDomestic | number |
| 小数位数:8,最大长度:28 | 否 | 本币总金额 |
| payMoneyDomestic | number |
| 小数位数:8,最大长度:28 | 否 | 本币退货金额 |
| totalMoneyDomesticTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税总金额 |
| payMoneyDomesticTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 本币无税退货金额 |
| totalNatTax | number |
| 小数位数:8,最大长度:28 | 否 | 本币税额 |
| ecsuiteperson | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| bizFlow | string | 否 | 流程IDid |
| isFlowCoreBill | string | 否 | 是否流程核心单据 |
| saleReturnDetails | object | 是 | 退货单详情[voucher.salereturn.SaleReturnDetail] |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"bmake_st_salesout": true,
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
		"exchangeRateType": "",
		"exchRate": 0,
		"taxInclusive": true,
		"saleReturnStatus": "",
		"returnStatus": "",
		"deliverTime": "",
		"saleReturnSourceType": "",
		"bizFlow_name": "",
		"bizFlow_version": "",
		"logisticWayId": "",
		"invoiceAgentId": "",
		"modifyInvoiceType": "",
		"shippingChoiceId": "",
		"rebateToOrderMoney": 0,
		"rebateToCashMoney": 0,
		"shippingChoiceId_code": "",
		"rebateToOrderMoneyOrigTaxfree": 0,
		"rebateToCashMoneyOrigTaxfree": 0,
		"shippingChoiceId_name": "",
		"wholeDiscountRate": 0,
		"wholeFavorableRate": 0,
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
		"saleReturnDetails": [
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
				"saleOutStatus": "",
				"saleOutClose": true,
				"productId": "",
				"skuId": "",
				"projectId": "",
				"unitExchangeType": 0,
				"unitExchangeTypePrice": 0,
				"salePrice": 0,
				"taxId": "",
				"stockId": "",
				"stockOrgId": "",
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
				"enable": true,
				"createdDate": "",
				"pubts": "",
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
				"discountRate": 0,
				"favorableRate": 0,
				"tradeRouteID": "",
				"tradeRouteID_code": "",
				"tradeRouteID_name": "",
				"checkByRevenueManagement": "",
				"isEndTrade": 0,
				"tradeRouteLineno": "",
				"lineno": "",
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

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-02-03

更新

请求说明

新增

返回参数 (4)

更新

返回参数 (214)

【供应链适配物料分数换算率】销售退货API支持分数换算率


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

