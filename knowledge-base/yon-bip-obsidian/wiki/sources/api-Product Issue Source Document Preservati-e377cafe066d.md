---
title: "销售出库来源生单保存"
apiId: "e377cafe066d45ef85d0bb66d6af231e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Issue"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Issue]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售出库来源生单保存

>  请求方式	POST | Sales Issue (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/scm/salesout/mergeSourceData/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	销售出库单[st.salesout.SalesOut]
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
mergeSourceData	boolean	否	是	是否合并上游数据。值为true的话则sourceid：来源单据主表id，sourceautoid：来源单据行id，makeRuleCode：单据转换规则，_status：操作标识，不可为空。 示例：true
vouchdate	string	否	否	单据日期 示例：2020-11-30 00:00:00
warehouse	string	否	否	仓库id或编码（上游有值可以不填写，通过转单携带，上游没有仓库，需要自行补充仓库值） 示例：Z001
code	string	否	否	单据编号 示例:XSCK20201130000002 自动编码可以不携带
bustype	string	否	是	交易类型id或编码 示例:A30001
details	object	是	是	销售出库单子表[st.salesout.SalesOuts]
_status	string	否	是	操作标识, Insert:新增 示例：Insert

## 3. 请求示例

Url: /yonbip/scm/salesout/mergeSourceData/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"mergeSourceData": true,
		"vouchdate": "2020-11-30 00:00:00",
		"warehouse": "Z001",
		"code": "",
		"bustype": "",
		"details": [
			{
				"_status": "Insert",
				"qty": 0,
				"sourceid": 0,
				"sourceautoid": 0,
				"batchno": "",
				"makeRuleCode": "",
				"goodsposition": "whhw2467516",
				"salesOutsSNs": [
					{}
				]
			}
		],
		"_status": "Insert"
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
code	string	否	单据编号 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	调用成功时的返回数据
count	long	否	数量 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
messages	string	是	返回信息
infos	object	是	调用成功时的返回数据
failInfos	string	是	失败信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"cReceiveAddress": "北京市海淀区北清路68号",
				"warehouse_isGoodsPositionStock": false,
				"natCurrency": "2157958787700224",
				"sourcesys": "udinghuo",
				"id": 2561620858474752,
				"tenant": 2157957602398464,
				"internalSign": false,
				"isWfControlled": false,
				"barcodeRecord": [
					""
				],
				"warehouse": 2212172580278528,
				"srcBillType": "2",
				"diliverStatus": "DELIVERING",
				"warehouse_name": "鼠标仓库",
				"natCurrency_priceDigit": 6,
				"exchRateType": "wbwzmj5r",
				"mergeSourceData": "true",
				"inventoryowner": 0,
				"status": 0,
				"currency_moneyDigit": 6,
				"invoiceCust_name": "北京同仁客户",
				"salesOrg": "2204894649602304",
				"invoiceOrg_name": "zsr全组织",
				"vouchdate": "2021-12-15 00:00:00",
				"currency": "2157958787700224",
				"org_name": "zsr全组织",
				"pubts": "2021-12-15 14:15:30",
				"isFlowCoreBill": false,
				"cReceiveMobile": "18910721867",
				"isUpdateStock": true,
				"createDate": "2021-12-15 14:15:30",
				"fromApi_ustock": true,
				"creator": "YonSuite默认用户",
				"exchRateType_name": "基准汇率",
				"accountOrg": "2204894649602304",
				"cReceiver": "张红",
				"createTime": "2021-12-15 14:15:30",
				"ownertype": 0,
				"cust": 2206290875782912,
				"invoiceUpcType": 0,
				"currency_priceDigit": 6,
				"invoiceOrg": "2204894649602304",
				"invoiceTitleType": 0,
				"modifyInvoiceType": true,
				"details": [
					{
						"product_cCode": "002000002",
						"priceUOM_Precision": 2,
						"firstsource": "udinghuo.voucher_order",
						"stockStatusDoc_name": "合格",
						"stockUnitId_Precision": 3,
						"natSum": 5900,
						"inventoryowner": 0,
						"reserveid": 0,
						"stockStatusDoc": 2156275582718293,
						"invPriceExchRate": 1,
						"pubts": "2021-12-15 14:15:30",
						"sourceid": 2561615199786496,
						"makeRule": 77726798,
						"oriSum": 5900,
						"cashRebateMoney": 0,
						"orderDetailId": 2561615199786497,
						"taxUnitPriceTag": true,
						"natMoney": 5619.047619,
						"source": "2",
						"subQty": 9.834,
						"taxItems": "5%",
						"unitName": "袋",
						"taxCode": "VAT5",
						"rebateMoney": 0,
						"taxId": "2157958788027909",
						"qty": 59,
						"oriTaxUnitPrice": 100,
						"contactsPieces": 9.834,
						"natUnitPrice": 95.238095,
						"isUpdateCost": true,
						"firstsourceautoid": 2561615199786497,
						"priceUOM": 2204939201550080,
						"firstsourceid": 2561615199786496,
						"sourceMainPubts": "2021-12-15 14:12:35",
						"upcode": "895002",
						"saleStyle": "SALE",
						"orderCode": "895002",
						"natTaxUnitPrice": 100,
						"oriTax": 280.952381,
						"orderId": 2561615199786496,
						"isExpiryDateManage": false,
						"reservation": false,
						"id": 2561620858474753,
						"mainid": 2561620858474752,
						"tenant": 2157957602398464,
						"productClass": 2204897689571584,
						"salesOutsSNs": [
							{
								"id": 0,
								"sn": "",
								"snstate": "",
								"presnstate": "",
								"updatecount": 0
							}
						],
						"invExchRate": 6,
						"stockUnitId": 2204939024078336,
						"makeRuleCode": "orderTosalesout",
						"productsku_cName": "zsr浮动换算率物料规格001",
						"isBatchManage": false,
						"productClassName": "浮动换算率存货",
						"product": 2206047849142528,
						"propertiesValue": "颜色:红色;尺码:160;",
						"priceQty": 59,
						"ownertype": 0,
						"stockUnit_name": "箱",
						"firstupcode": "895002",
						"natTax": 280.952381,
						"product_cName": "zsr浮动换算率物料规格",
						"isSerialNoManage": false,
						"oriUnitPrice": 95.238095,
						"isScrap": false,
						"taxRate": 5,
						"unit": 2204939201550080,
						"productsku": 2206047849142529,
						"productsku_cCode": "000006",
						"unit_Precision": 2,
						"oriMoney": 5619.047619,
						"contactsQuantity": 59,
						"priceUOM_name": "袋",
						"unitExchangeType": 1,
						"orderRebateMoney": 0,
						"sourceautoid": 2561615199786497,
						"srcBillRow": 2561615199786497
					}
				],
				"natCurrencyName": "人民币",
				"salesOrg_name": "zsr全组织",
				"srcBillNO": "895002",
				"barCode": "st_salesout|2561620858474752",
				"taxRate": 5,
				"natCurrency_moneyDigit": 6,
				"accountOrg_name": "zsr全组织",
				"invoiceCust": 2206290875782912,
				"isUpdateCost": true,
				"code": "XSCK20211215000013",
				"shop": -1,
				"receiveAccountingBasis": "st_salesout",
				"creatorId": 2157957602676992,
				"bizFlow": "5d54da2a-9835-11eb-8c0b-98039b073634",
				"exchRate": 1,
				"currencyName": "人民币",
				"creditDetails": [
					{
						"product_cCode": "002000002",
						"priceUOM_Precision": 2,
						"firstsource": "udinghuo.voucher_order",
						"stockStatusDoc_name": "合格",
						"stockUnitId_Precision": 3,
						"natSum": 5900,
						"inventoryowner": 0,
						"reserveid": 0,
						"stockStatusDoc": 2156275582718293,
						"invPriceExchRate": 1,
						"pubts": "2021-12-15 14:15:30",
						"sourceid": 2561615199786496,
						"makeRule": 77726798,
						"oriSum": 5900,
						"cashRebateMoney": 0,
						"orderDetailId": 2561615199786497,
						"taxUnitPriceTag": true,
						"natMoney": 5619.047619,
						"source": "2",
						"subQty": 9.834,
						"taxItems": "5%",
						"unitName": "袋",
						"taxCode": "VAT5",
						"rebateMoney": 0,
						"taxId": "2157958788027909",
						"qty": 59,
						"oriTaxUnitPrice": 100,
						"contactsPieces": 9.834,
						"natUnitPrice": 95.238095,
						"isUpdateCost": true,
						"firstsourceautoid": 2561615199786497,
						"priceUOM": 2204939201550080,
						"firstsourceid": 2561615199786496,
						"sourceMainPubts": "2021-12-15 14:12:35",
						"upcode": "895002",
						"saleStyle": "SALE",
						"orderCode": "895002",
						"natTaxUnitPrice": 100,
						"oriTax": 280.952381,
						"orderId": 2561615199786496,
						"isExpiryDateManage": false,
						"reservation": false,
						"id": 2561620858474753,
						"mainid": 2561620858474752,
						"tenant": 2157957602398464,
						"productClass": 2204897689571584,
						"invExchRate": 6,
						"stockUnitId": 2204939024078336,
						"makeRuleCode": "orderTosalesout",
						"productsku_cName": "zsr浮动换算率物料规格001",
						"isBatchManage": false,
						"productClassName": "浮动换算率存货",
						"product": 2206047849142528,
						"propertiesValue": "颜色:红色;尺码:160;",
						"priceQty": 59,
						"ownertype": 0,
						"stockUnit_name": "箱",
						"firstupcode": "895002",
						"natTax": 280.952381,
						"product_cName": "zsr浮动换算率物料规格",
						"isSerialNoManage": false,
						"oriUnitPrice": 95.238095,
						"isScrap": false,
						"taxRate": 5,
						"unit": 2204939201550080,
						"productsku": 2206047849142529,
						"productsku_cCode": "000006",
						"unit_Precision": 2,
						"oriMoney": 5619.047619,
						"contactsQuantity": 59,
						"priceUOM_name": "袋",
						"unitExchangeType": 1,
						"orderRebateMoney": 0,
						"sourceautoid": 2561615199786497,
						"srcBillRow": 2561615199786497
					}
				],
				"bizFlow_version": "V1.0",
				"cust_name": "北京同仁客户",
				"warehouse_isGoodsPosition": false,
				"org": "2204894649602304",
				"warehouse_iSerialManage": false,
				"bustype": "2157958782980354",
				"retailInvestors": false,
				"receiveId": 2206290875782913,
				"salesoutAccountingMethod": "invoiceConfirm",
				"bizFlow_name": "普通销售（无发货）"
			}
		],
		"failInfos": [
			""
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2024-11-08	
更新
请求说明
更新
请求参数 warehouse
更新
返回参数 (45)
UKC-135318【API专项】接口、事件缺少描述，参数类型描述不正确

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

