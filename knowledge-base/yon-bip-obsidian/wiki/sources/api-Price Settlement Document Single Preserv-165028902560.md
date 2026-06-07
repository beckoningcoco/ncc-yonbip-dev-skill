---
title: "价格结算单单个保存"
apiId: "1650289025602813955"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Settlement Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 价格结算单单个保存

>  请求方式	POST | Price Settlement Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/scm/pricesettlement/singleSave_v1
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	价格结算单[pu.pricesettlement.PriceSettlement]
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	单据id，修改必传 示例：1488518506869686276
inOrg	string	否	是	收货组织id，或收货组织code 示例：1488518506869686276
code	string	否	否	采购订单code，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：JGJSJGJS202206000034
inInvoiceOrg	string	否	是	收票组织id，或收票组织code 示例：1488518506869686276
purOrg	string	否	是	采购组织id，或采购组织code 示例：1488518506869686276
bustype	string	否	是	交易类型id，或交易类型code 示例：1482454227801866632
vouchdate	Date	否	是	单据日期 示例：2021-03-05
vendor	string	否	是	供货供应商id，或供货供应商code 示例：1489151249943625729
isUpdateEstimation	boolean	否	否	更新存货成本 示例：false
postAccountStatus	long	否	否	过账状态：未过账 99，过账失败 3，不过账 0，过账中 1，过账成功 2 示例：99
exchRate	double	否	是	汇率 示例：1
invoiceVendor	string	否	是	开票供应商id，开票供应商code 示例：1489151249943625729
currency	string	否	是	币种id，或币种code 示例：1482454219190435869
creationWay	long	否	否	生单方式：1汇总生单，0明细生单 示例：0
natCurrency	string	否	是	本币id,本币code 示例：1482454219190435869
exchRateType	string	否	是	汇率类型id 或 汇率类型code 示例：0000L4NKTA4VBYF37O0000
isWfControlled	boolean	否	否	是否审批流控制 示例：false
priceSettlements	object	是	是	价格结算单子表
_status	string	否	是	Insert 保存；Update 修改 示例：Insert

## 3. 请求示例

Url: /yonbip/scm/pricesettlement/singleSave_v1?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1488518506869686276",
		"inOrg": "1488518506869686276",
		"code": "JGJSJGJS202206000034",
		"inInvoiceOrg": "1488518506869686276",
		"purOrg": "1488518506869686276",
		"bustype": "1482454227801866632",
		"vouchdate": "2021-03-05",
		"vendor": "1489151249943625729",
		"isUpdateEstimation": false,
		"postAccountStatus": 99,
		"exchRate": 1,
		"invoiceVendor": "1489151249943625729",
		"currency": "1482454219190435869",
		"creationWay": 0,
		"natCurrency": "1482454219190435869",
		"exchRateType": "0000L4NKTA4VBYF37O0000",
		"isWfControlled": false,
		"priceSettlements": [
			{
				"id": "1513617866230333444",
				"_status": "Insert",
				"source": "ustock.st_purinrecord",
				"makeRuleCode": "purinrecordToPriceSettlement",
				"product": "1513617866230333444",
				"productsku": "1513617866230333457",
				"project": "1507705276823240712",
				"warehouse": "1489152486875332617",
				"qualitypriceScheme": "1493597657774424077",
				"batchno": "12",
				"qty": 1100,
				"unit": "1493597657774424077",
				"stockUnitId": "1493597657774424077",
				"invExchRate": 1,
				"subQty": 1100,
				"priceQty": 1100,
				"priceClutteredQty": 23,
				"priceUOM": "1493597657774424077",
				"invPriceExchRate": 1,
				"oriTax": 1,
				"natTax": 2,
				"oriUnitPrice": 100,
				"oriTaxUnitPrice": 100,
				"oriMoney": 110000,
				"oriSum": 110000,
				"natUnitPrice": 100,
				"natTaxUnitPrice": 100,
				"natMoney": 110000,
				"natSum": 110000,
				"discountTaxType": 0,
				"clutteredQty": 23,
				"settlementQty": 1100,
				"priceSettlementQty": 1100,
				"settleOriUnitPrice": 100,
				"settleOriTaxUnitPrice": 100,
				"taxitems": "1482454219190435887",
				"settlementTax": 3,
				"settleOriMoney": 110000,
				"unDeductTaxRate": 2,
				"settleOriSum": 110000,
				"unNatDeductTax": 2,
				"sourceid": "1626029151934742532",
				"sourceautoid": "1626029151934742533",
				"upcode": "CGRK20221231000004",
				"upLineno": 10,
				"unitExchangeType": 0,
				"unitExchangeTypePrice": 0,
				"consumerProfitCenter": "1626029151934742533",
				"providerProfitCenter": "1626029151934742533",
				"costCenter": "1626029151934742533",
				"benchmarkPrice": 100,
				"priceSettlementSun": [
					{
						"id": 1626029151934742533,
						"_status": "Insert",
						"source": "ustock.st_purinrecord",
						"makeRuleCode": "purinrecordToPriceSettlement",
						"receiptDocEntryAndMgmt": "invoicing_confirm_AP",
						"product": "1513617866230333444",
						"productsku": "1513617866230333457",
						"project": "1507705276823240712",
						"warehouse": "1489152486875332617",
						"priceClutteredQty": 12,
						"clutteredQty": 12,
						"unit": "1493597657774424077",
						"stockUnitId": "1493597657774424077",
						"invExchRate": 1,
						"priceUOM": "1493597657774424077",
						"invPriceExchRate": 1,
						"oriTax": 2,
						"oriUnitPrice": 100,
						"oriTaxUnitPrice": 100,
						"natUnitPrice": 100,
						"natTaxUnitPrice": 100,
						"discountTaxType": 0,
						"settlementQty": 1100,
						"priceSettlementQty": 1100,
						"taxitems": "1482454219190435887",
						"sourceid": "1626029151934742532",
						"sourceautoid": "1626029151934742533",
						"upcode": "CGRK20221231000004",
						"unitExchangeType": 0,
						"unitExchangeTypePrice": 0,
						"purInRecord": "1626029151934742533",
						"iNatMWarehouseUnitPrice": 100,
						"warehouseOriMoney": 110000,
						"warehouseInvExchRate": 1,
						"natCurrency": "1482454219190435869",
						"ustockPubts": "2023-01-18 14:31:49",
						"iNatMWarehouseSum": 110000,
						"warehouseOriUnitPrice": 100,
						"iNatMWarehouseMoney": 110000,
						"warehouseSubQty": 1100,
						"warehouseOriTax": 2,
						"iNatWarehouseTax": 3,
						"iNatMWarehouseTaxUnitPrice": 100,
						"currency": "1482454219190435869",
						"isUpdateEstimation": true,
						"rowno": 10,
						"warehouseOriTaxUnitPrice": 100,
						"warehouseOriSum": 110000,
						"warehouseTaxItems": "1482454219190435887",
						"bustype": "1613805116669820947",
						"warehousePriceQty": 1100,
						"costUnitPrice": 100,
						"oriCostUnitPrice": 100
					}
				],
				"warehouseSubQty": 1100
			}
		],
		"_status": ""
	}
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	string	否	返回状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	单据信息
inOrg	string	否	收货组织id 示例：1479492985279741956
invoiceVendor	long	否	开票供应商id 示例：1526372381423566850
natCurrency	string	否	本币id 示例：1468336086076358677
inInvoiceOrg	string	否	收票组织id 示例：1479492985279741956
id	long	否	单据id 示例：1654767293504159753
isWfControlled	boolean	否	是否审批流控制 示例：true
exchRateType	string	否	汇率类型id 示例：0000L3WE7R4W25O1SI0000
status	long	否	单据状态 示例：0
code	string	否	单据编码 示例：FKJDFKJD230208000004
creatorId	long	否	创建人id 示例：1481791050466459656
exchRate	double	否	换算率 示例：1
vouchdate	string	否	单据日期 示例：2023-02-08 00:00:00
postAccountStatus	long	否	过账状态 示例：99
purOrg	string	否	采购组织id 示例：1479492985279741956
creationWay	long	否	生单方式 示例：0
vendor	long	否	供货供应商id 示例：1526372381423566850
currency	string	否	币种id 示例：1468336086076358677
pubts	string	否	时间戳 示例：2023-02-08 15:11:08
isUpdateEstimation	boolean	否	更新存货成本 示例：true
createDate	string	否	创建日期 示例：2023-02-08 15:11:07
creator	string	否	创建人 示例：昵称-达利园集团
bustype	string	否	交易类型 示例：1481834266430013441
createTime	string	否	创建时间 示例：2023-02-08 15:11:07
priceSettlements	object	是	价格结算单子表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"inOrg": "1479492985279741956",
		"invoiceVendor": 1526372381423566850,
		"natCurrency": "1468336086076358677",
		"inInvoiceOrg": "1479492985279741956",
		"id": 1654767293504159753,
		"isWfControlled": true,
		"exchRateType": "0000L3WE7R4W25O1SI0000",
		"status": 0,
		"code": "FKJDFKJD230208000004",
		"creatorId": 1481791050466459656,
		"exchRate": 1,
		"vouchdate": "2023-02-08 00:00:00",
		"postAccountStatus": 99,
		"purOrg": "1479492985279741956",
		"creationWay": 0,
		"vendor": 1526372381423566850,
		"currency": "1468336086076358677",
		"pubts": "2023-02-08 15:11:08",
		"isUpdateEstimation": true,
		"createDate": "2023-02-08 15:11:07",
		"creator": "昵称-达利园集团",
		"bustype": "1481834266430013441",
		"createTime": "2023-02-08 15:11:07",
		"priceSettlements": [
			{
				"oriTax": 0,
				"source": "ustock.st_purinrecord",
				"natTax": 0,
				"subQty": 0,
				"id": 1654767293504159754,
				"mainid": 1654767293504159753,
				"costCenter": "1580520400015589384",
				"oriUnitPrice": 22,
				"natSum": 0,
				"warehouse": "1471458501510823941",
				"benchmarkPrice": 22,
				"taxRate": 1.5,
				"unit": 1471409676319981575,
				"productsku": 1471410243255664644,
				"qty": 0,
				"oriTaxUnitPrice": 22.33,
				"oriMoney": 0,
				"invExchRate": 1,
				"discountTaxType": 0,
				"unitExchangeTypePrice": 0,
				"stockUnitId": 1471409676319981575,
				"natUnitPrice": 22,
				"warehouseSubQty": 0,
				"receiptDocEntryAndMgmt": "receipt_estimated_AP",
				"priceUOM": 1471409676319981575,
				"invPriceExchRate": 1,
				"settleOriTaxUnitPrice": 22.33,
				"settleOriSum": 0,
				"pubts": "2023-02-08 15:11:08",
				"settleOriUnitPrice": 22,
				"sourceid": 1618638724397006851,
				"priceSettlementSun": [
					{
						"oriTax": 0,
						"natCurrency": "1468336086076358677",
						"unDeductTax": 0,
						"costMoney": 0,
						"id": 1654767293504159755,
						"mainid": 1654767293504159754,
						"iNatMWarehouseSum": 0,
						"costCenter": "1580520400015589384",
						"oriCostUnitPrice": 22,
						"natSum": 0,
						"warehouse": "1471458501510823941",
						"invExchRate": 1,
						"discountTaxType": 0,
						"unitExchangeTypePrice": 0,
						"stockUnitId": 1471409676319981575,
						"warehouseSubQty": 0,
						"warehouseOriTax": 0,
						"iNatWarehouseTax": 0,
						"invPriceExchRate": 1,
						"iNatMWarehouseTaxUnitPrice": 22.33,
						"currency": "1468336086076358677",
						"pubts": "2023-02-08 15:11:08",
						"sourceid": 1618638724397006851,
						"rowno": 10,
						"product": 1471410234665730052,
						"oriSum": 0,
						"consumerProfitCenter": "1479492985279741956",
						"priceQty": 0,
						"warehousePriceQty": 0,
						"natMoney": 0,
						"priceSettlementQty": 0,
						"upLineno": 10,
						"iNatMWarehouseUnitPrice": 22,
						"warehouseOriMoney": 0,
						"source": "ustock.st_purinrecord",
						"natTax": 0,
						"subQty": 0,
						"providerProfitCenter": "1479492985279741956",
						"warehouseInvExchRate": 1,
						"oriUnitPrice": 22,
						"taxRate": 1.5,
						"unit": 1471409676319981575,
						"productsku": 1471410243255664644,
						"warehouseOriUnitPrice": 22,
						"iNatMWarehouseMoney": 0,
						"qty": 0,
						"oriTaxUnitPrice": 22.33,
						"oriMoney": 0,
						"natUnitPrice": 22,
						"exchRate": 1,
						"priceUOM": 1471409676319981575,
						"isUpdateEstimation": true,
						"warehouseOriTaxUnitPrice": 22.33,
						"purInRecord": 1618638724397006852,
						"warehouseOriSum": 0,
						"unitExchangeType": 0,
						"warehouseTaxItems": "1468336086076358700",
						"bustype": "1468336043126685725",
						"sourceautoid": 1618638724397006852,
						"oriCostMoney": 0,
						"costUnitPrice": 22,
						"upcode": "CGRK001336",
						"settlementQty": 0,
						"unNatDeductTax": 0,
						"natTaxUnitPrice": 22.33,
						"taxitems": "1468336086076358700"
					}
				],
				"product": 1471410234665730052,
				"oriSum": 0,
				"settleOriMoney": 0,
				"unitExchangeType": 0,
				"consumerProfitCenter": "1479492985279741956",
				"sourceautoid": 1618638724397006852,
				"lineno": 10,
				"priceQty": 0,
				"settlementTax": 0,
				"upcode": "CGRK001336",
				"settlementQty": 0,
				"natTaxUnitPrice": 22.33,
				"taxitems": "1468336086076358700",
				"natMoney": 0,
				"priceSettlementQty": 0
			}
		]
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	

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

