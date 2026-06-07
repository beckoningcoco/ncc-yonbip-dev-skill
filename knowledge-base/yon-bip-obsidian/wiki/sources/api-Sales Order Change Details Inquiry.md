---
title: "销售订单变更详情查询"
apiId: "2352291869416226821"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "SO Change"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, SO Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售订单变更详情查询

> `ContentType	application/json` 请求方式	GET | 分类: SO Change (SCMSD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/SCC/voucherorderchange/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 业务单据id，如果传此字段，code、originalOrderId可不传。查询优先级：id>originalOrderId>code    示例: 6666666666666666 |
| code | string | query | 否 | 业务单据编码，如果传此字段，id、originalOrderId可不传。查询优先级：id>originalOrderId>code |
| originalOrderId | string | query | 否 | 原销售订单id，如果传此字段，id、code可不传。查询优先级：id>originalOrderId>code |
| changeVersion | string | query | 否 | 销售订单变更版本号，如果不传默认查最新版本 |

## 3. 请求示例

Url: /yonbip/SCC/voucherorderchange/detail?access_token=访问令牌&id=6666666666666666&code=&originalOrderId=&changeVersion=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
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
| id | string | 否 | 销售订单变更id 示例：2345625427521306632 |
| originalOrderId | string | 否 | 原销售订单id 示例：2345625315848486921 |
| corpContact | string | 否 | 销售业务员id 示例：2345625427521308888 |
| corpContactUserName | string | 否 | 销售业务员 示例：李四 |
| agentId | string | 否 | 客户id 示例：1234567890123456 |
| saleDepartmentId | string | 否 | 销售部门id 示例：2345625427521307777 |
| saleAreaId | string | 否 | 销售区域id 示例：2293093639571633333 |
| transactionTypeId | string | 否 | 交易类型id 示例：9876543211234561 |
| merchAddrAutoSynFlag | boolean | 否 | 收货信息自动建档，是：true，否：false 示例：false |
| receiveId | string | 否 | 收货人id 示例：2293093639571636366 |
| receiver | string | 否 | 收货人 示例：王五 |
| receiveMobile | string | 否 | 收货电话 示例：18978978654 |
| receiveCode | string | 否 | 收货地址编码 示例：A111 |
| receiveAddress | string | 否 | 收货地址 示例：北京市海淀区幸福小区298号楼199单元2999 |
| receiveTelePhone | string | 否 | 收货人固定电话 示例：2545678 |
| receiverCustId | string | 否 | 收货客户id 示例：2293104428510085128 |
| receiveContacterId | string | 否 | 客户联系人id 示例：2345625427521306666 |
| receiveContacter | string | 否 | 客户联系人 示例：张三 |
| receiveContacterPhone | string | 否 | 客户联系电话 示例：17669280478 |
| shippingChoiceId | string | 否 | 发运方式id 示例：2184036465583325201 |
| isDespatch | boolean | 否 | 启用发运管理，是：true，否：false 示例：false |
| endAreaId | string | 否 | 目的地运输区域id 示例：2184036465583325203 |
| endAreaName | string | 否 | 目的地运输区域 示例：海淀区 |
| purchaseNo | string | 否 | 客户采购订单号 示例：KHCGDD0000001 |
| hopeReceiveDate | string | 否 | 希望到货日期 示例：2025-08-28 00:00:00 |
| reasonMemo | string | 否 | 变更原因 示例：变更原因 |
| receiveAgreementId | string | 否 | 收款协议id 示例：2345625427521306868 |
| mainprojectId | string | 否 | 项目id 示例：2345625427521309898 |
| oadayConfirmType | number |
| 小数位数:0,最大长度:28 | 否 | 出账日确认方式，0：按月、1：按周。控制方式同收款协议id。 示例：0 |
| expiredayConfirmType | number |
| 小数位数:0,最大长度:28 | 否 | 到期日确认方式，0：按月、1：按周。控制方式同收款协议id。 示例：0 |
| memo | string | 否 | 备注 示例：备注 |
| tradeRouteID | string | 否 | 贸易路径id 示例：2345625427521307897 |
| tradeRouteLineno | string | 否 | 站点 示例：12 |
| tradeThrowVersion | string | 否 | 抛单版本号 |
| orderPayType | string | 否 | 支付方式, FIRSTPAY:款到发货、FIRSTDELIVER:其他、 示例：FIRSTPAY |
| settlement | string | 否 | 结算方式 示例：2184036465583325204 |
| modifyInvoiceType | boolean | 否 | 发票类型可改, true:是、false:否、 示例：false |
| bdInvoiceTypeId | string | 否 | 发票类型,0:收据,1:增值税电子普通发票,2:增值税电子专用发票,3:增值税普通发票,4:增值税专用发票,5:机动车销售统一发票,8:增值税电子普通发票（成品油）,10:增值税普通发票（成品油）,11:增值税专用发票（成品油）,e0:电子收购发票, 31:电子发票（增值税专用发票）,32:电子发票（普通发票）,33:数电纸质发票（增值税专用发票）,34:数电纸质发票（普通发票） 示例: 0 示例：0 |
| invoiceTitle | string | 否 | 发票抬头 示例：李四股份有限公司 |
| invoiceTitleType | string | 否 | 抬头类型id 示例：0 |
| bankName | string | 否 | 开户银行 示例：中国工商银行 |
| bankAccount | string | 否 | 银行账号 示例：21474834255322156732 |
| userBankName | string | 否 | 开户名 |
| subBankName | string | 否 | 开户支行 示例：中国工商银行股份有限公司濮阳兴工支行 |
| taxNum | string | 否 | 纳税识别号 示例：432443243222 |
| receievInvoiceMobile | string | 否 | 收票手机号 示例：16567897654 |
| receievInvoiceEmail | string | 否 | 收票邮箱 示例：xxx@youxiang.com |
| invoiceAddress | string | 否 | 营业地址 |
| totalMoney | number |
| 小数位数:8,最大长度:28 | 否 | 总金额 示例：666 |
| promotionMoney | number |
| 小数位数:8,最大长度:28 | 否 | 总优惠金额 示例：0 |
| reight | number |
| 小数位数:8,最大长度:28 | 否 | 运费 示例：0 |
| payMoney | number |
| 小数位数:8,最大长度:28 | 否 | 合计含税金额 示例：666 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| orderPayMoney | number |
| 小数位数:8,最大长度:28 | 否 | 商品实付金额 示例：666 |
| realMoney | number |
| 小数位数:8,最大长度:28 | 否 | 应收金额 示例：666 |
| orderRealMoney | number |
| 小数位数:8,最大长度:28 | 否 | 商品应付金额 示例：666 |
| particularlyMoney | number |
| 小数位数:8,最大长度:28 | 否 | 特殊优惠 示例：0 |
| orderPrices!totalMoneyOrigTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 无税总金额 示例：666 |
| orderPrices!payMoneyOrigTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 合计无税金额 示例：666 |
| orderPrices!orderPayMoneyOrigTaxfree | number |
| 小数位数:8,最大长度:28 | 否 | 商品实付无税金额 示例：666 |
| orderPrices!id | string | 否 | 平行表id |
| orderPrices!payMoneyDomestic | number |
| 小数位数:8,最大长度:28 | 否 | 本币含税金额 示例：666 |
| orderPrices!orderPayMoneyDomestic | number |
| 小数位数:8,最大长度:28 | 否 | 商品本币含税实付金额 示例：666 |
| orderPrices!orderId | string | 否 | 销售订单变更id 示例：2345625427521306632 |
| orderPrices!totalOriTax | number |
| 小数位数:8,最大长度:28 | 否 | 原币总税额 示例：666 |
| orderPrices!totalNatTax | number |
| 小数位数:8,最大长度:28 | 否 | 本币总税额 示例：666 |
| orderPrices!wholeDiscountRate | number |
| 小数位数:8,最大长度:28 | 否 | 整单扣率% 示例：100 |
| orderPrices!discountAfterMoney | number |
| 小数位数:8,最大长度:28 | 否 | 整单折后金额 示例：666 |
| orderPrices!discountMoney | number |
| 小数位数:8,最大长度:28 | 否 | 折扣总金额 示例：0 |
| orderDetails | object | 是 | 销售订单变更子表[voucher.orderchange.OrderChangeDetail] |
| orderChangePaymentSchedules | object | 是 | 收款协议[voucher.orderchange.OrderChangePaymentSchedules] |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "2345625427521306632",
		"originalOrderId": "2345625315848486921",
		"corpContact": "2345625427521308888",
		"corpContactUserName": "李四",
		"agentId": "1234567890123456",
		"saleDepartmentId": "2345625427521307777",
		"saleAreaId": "2293093639571633333",
		"transactionTypeId": "9876543211234561",
		"merchAddrAutoSynFlag": false,
		"receiveId": "2293093639571636366",
		"receiver": "王五",
		"receiveMobile": "18978978654",
		"receiveCode": "A111",
		"receiveAddress": "北京市海淀区幸福小区298号楼199单元2999",
		"receiveTelePhone": "2545678",
		"receiverCustId": "2293104428510085128",
		"receiveContacterId": "2345625427521306666",
		"receiveContacter": "张三",
		"receiveContacterPhone": "17669280478",
		"shippingChoiceId": "2184036465583325201",
		"isDespatch": false,
		"endAreaId": "2184036465583325203",
		"endAreaName": "海淀区",
		"purchaseNo": "KHCGDD0000001",
		"hopeReceiveDate": "2025-08-28 00:00:00",
		"reasonMemo": "变更原因",
		"receiveAgreementId": "2345625427521306868",
		"mainprojectId": "2345625427521309898",
		"oadayConfirmType": 0,
		"expiredayConfirmType": 0,
		"memo": "备注",
		"tradeRouteID": "2345625427521307897",
		"tradeRouteLineno": "12",
		"tradeThrowVersion": "",
		"orderPayType": "FIRSTPAY",
		"settlement": "2184036465583325204",
		"modifyInvoiceType": false,
		"bdInvoiceTypeId": "0",
		"invoiceTitle": "李四股份有限公司",
		"invoiceTitleType": "0",
		"bankName": "中国工商银行",
		"bankAccount": "21474834255322156732",
		"userBankName": "",
		"subBankName": "中国工商银行股份有限公司濮阳兴工支行",
		"taxNum": "432443243222",
		"receievInvoiceMobile": "16567897654",
		"receievInvoiceEmail": "xxx@youxiang.com",
		"invoiceAddress": "",
		"totalMoney": 666,
		"promotionMoney": 0,
		"reight": 0,
		"payMoney": 666,
		"orderPayMoney": 666,
		"realMoney": 666,
		"orderRealMoney": 666,
		"particularlyMoney": 0,
		"orderPrices!totalMoneyOrigTaxfree": 666,
		"orderPrices!payMoneyOrigTaxfree": 666,
		"orderPrices!orderPayMoneyOrigTaxfree": 666,
		"orderPrices!id": "",
		"orderPrices!payMoneyDomestic": 666,
		"orderPrices!orderPayMoneyDomestic": 666,
		"orderPrices!orderId": "2345625427521306632",
		"orderPrices!totalOriTax": 666,
		"orderPrices!totalNatTax": 666,
		"orderPrices!wholeDiscountRate": 100,
		"orderPrices!discountAfterMoney": 666,
		"orderPrices!discountMoney": 0,
		"orderDetails": [
			{
				"id": "",
				"orderId": "2345625427521306632",
				"originalOrderId": "2345625315848486921",
				"originalOrderDetailId": "1345625315848486123",
				"productId": "1814454564096311297",
				"realProductCode": "P123456",
				"skuId": "1971718021286988655",
				"skuCode": "S123456",
				"skuName": "SKU001",
				"agentProductId": "",
				"agentProductCode": "",
				"agentProductName": "",
				"agentSkuCode": "",
				"agentSkuName": "",
				"stockOrgId": "2282800216593664",
				"settlementOrgId": "2282800216593664",
				"stockId": "1814454392297619460",
				"specDescription": "颜色：红",
				"batchId": 23422223324324,
				"batchNo": "PC00001",
				"masterUnitId": "2206936294906396672",
				"unit_Precision": 2,
				"iProductAuxUnitId": "2206936294906396672",
				"purUOM_Precision": 2,
				"unitExchangeType": 0,
				"iProductUnitId": "2206936294906396672",
				"priceUOM_Precision": 2,
				"unitExchangeTypePrice": 0,
				"qty": 2,
				"priceQty": "2",
				"subQty": "2",
				"oriTaxUnitPrice": 6.6,
				"orderDetailPrices!natTaxUnitPrice": 6.6,
				"orderDetailPrices!oriUnitPrice": 6.6,
				"orderDetailPrices!natUnitPrice": 6.6,
				"ordRealMoney": 13.2,
				"oriSum": 13.2,
				"orderDetailPrices!oriMoney": 13.2,
				"taxId": "2281153771049217",
				"taxCode": "VAT5",
				"taxItems": "5%",
				"taxRate": 5,
				"orderDetailPrices!oriTax": 0,
				"orderDetailPrices!natSum": 13.2,
				"orderDetailPrices!natMoney": 13.2,
				"orderDetailPrices!natTax": 0,
				"prodPrice": 6.6,
				"prodCost": 13.2,
				"salePrice": 6.6,
				"noTaxSalePrice": 6.6,
				"orderDetailPrices!salePrice_domestic": 6.6,
				"orderDetailPrices!salePrice_domestic_taxfree": 6.6,
				"saleCost": 13.2,
				"noTaxSaleCost": 13.2,
				"orderDetailPrices!saleCost_domestic": 13.2,
				"orderDetailPrices!saleCost_domestic_taxfree": 13.2,
				"cusDiscountRate": 100,
				"cusFavorableRate": 0,
				"cusDiscountMoney": 0,
				"orderDetailPrices!discountRate": 100,
				"orderDetailPrices!lineDiscountMoney": 0,
				"particularlyMoney": 0,
				"orderDetailPrices!particularlyMoneyOrigTaxfree": 0,
				"orderDetailPrices!particularlyMoneyDomestic": 0,
				"orderDetailPrices!particularlyMoneyDomesticTaxfree": 0,
				"pointsMoney": 0,
				"consignTime": "2021-06-23 00:00:00",
				"orderProductType": "SALE",
				"costCenter": "1123423423423423",
				"providerProfitCenter": "1164192695018523",
				"consumerProfitCenter": "2712341926950185",
				"overflowRate": 0,
				"shortageRate": 0,
				"loadModeId": "1721641926950185",
				"receivedBilling": false,
				"shipPointId": "2223641926951208",
				"orderDetailPrices!excessiveSigning": "0",
				"priceMark": true,
				"memo": "行备注",
				"isreserve": false,
				"wbs": "1349494583055876128",
				"mtoPolicy": false,
				"receiverId": "2348296063778226181",
				"receiver": "赵云",
				"receiveCode": "A111",
				"receiveAddress": "北京市海淀区幸福小区298号楼199单元2999",
				"receiveZipCode": "010000",
				"receiveMobile": "18986723323",
				"receiveTelePhone": "2545678",
				"merchAddrAutoSynFlag": false,
				"receiverCustId": "2293104428510085128",
				"receiveStoreId": "1478295943519141894",
				"orderDetailPrices!id": ""
			}
		],
		"orderChangePaymentSchedules": [
			{
				"id": "",
				"_status": "Update",
				"mainid": "2345625427521306632",
				"oriOrderId": "2345625315848486921",
				"oriPaymentScheduleId": "1814454899103760387",
				"startDateTime": "2025-06-09 00:00:00",
				"fixAccoutDateTime": "2025-06-09 00:00:00",
				"expiringDateTime": "2025-07-09 00:00:00",
				"number": 1,
				"name": "订单保存",
				"payRatio": 25,
				"startDate": "2020875402352084",
				"accountType": "0",
				"accountDay": 30,
				"accountUnit": "0",
				"currencyPk": "248f097be0e5fdaf0ad05b831bf61cbf",
				"rate": 1,
				"natCurrencyPk": "248f097be0e5fdaf0ad05b831bf61cbf",
				"amount": 666
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	请检查传入数据的正确性


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-10-21

新增

返回参数 (20)

删除

返回参数 (20)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

