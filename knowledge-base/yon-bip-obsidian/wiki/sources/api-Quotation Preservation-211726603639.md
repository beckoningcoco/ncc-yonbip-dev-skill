---
title: "purcorpId	string	否	采购企业id 示例：1753541851851784194"
apiId: "2117266036392198151"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Quotation"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Quotation]
platform_version: "BIP"
source_type: community-api-docs
---

# purcorpId	string	否	采购企业id 示例：1753541851851784194

>  请求方式	POST | Quotation (STC)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/qtoffer/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	报价单数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
subject	string	否	否	询价标题 示例：api测试2
purcorpName	string	否	否	采购企业 示例：230621日常旗舰新架构广汽2
purorgName	string	否	否	采购组织 示例：采购云
limitPriceTimes	string	否	否	报价限制次数 示例：0
vbuyofferBillcode	string	否	否	询价单号 示例：XJD20241024000763
suppliername	string	否	是	报价人 示例：lzd
supplyPhone	string	否	是	报价人联系电话 示例：18989999228
currencyNameDiwork	string	否	否	询价币种 示例：TT-人民币
currencyIdDiwork_priceDigit	number
小数位数:0,最大长度:10	否	否	询价币种单价精度 示例：4
offerId_quotExchRateType	string	否	否	报价汇率类型id 示例：0000LJ5I3I7H6YAPZ90000
currencyIdDiwork_moneyDigit	number
小数位数:0,最大长度:10	否	否	询价币种金额精度 示例：4
hasPriceInvoice	boolean	否	是	是否提供发票 示例：false
offerId	number
小数位数:0,最大长度:20	否	是	报价单关联的询价单Id} 示例：4039893368459520
offerId_quotExchRateType_digit	number
小数位数:0,最大长度:10	否	否	报价汇率类型精度 示例：6
currencyIdDiwork_priceRount	number
小数位数:0,最大长度:10	否	否	询价币种单价舍入规则 示例：4
currencyIdDiwork_moneyRount	number
小数位数:0,最大长度:10	否	否	询价币种金额舍入规则 示例：4
offerId_quotExchRateType_name	string	否	否	报价汇率类型 示例：基准汇率
qtCurrencyNameDiwork	string	否	否	报价币种 示例：TT-人民币
currencyIsfixed	number
小数位数:0,最大长度:10	否	否	固定币种 示例：0
qtexpiredate	string	否	否	报价截止时间 示例：2024-11-23 21:11:50
convertTotalmny	number
小数位数:2,最大长度:10	否	否	折算询价币含税总金额(现金) 示例：406.56
offerId_buyofferTime	string	否	否	报价汇率日期 示例：2024-10-24 21:12:18
priceInvoiceType_name	string	否	否	发票名称
offerReferExchRate	number
小数位数:0,最大长度:10	否	否	报价参考汇率 示例：1
purchaser	string	否	否	联系人 示例：ljl
purchaserPhone	string	否	否	联系电话 示例：+86-18628416339
priceModel	string	否	否	报价模式 示例：1
allowPartQuote	boolean	否	否	允许供应商部分报价 示例：true
buyofferType	string	否	否	履行方式 示例：1
convertNoTaxTotalmny	number
小数位数:0,最大长度:10	否	否	折算询价币无税总金额(现金) 示例：363
priceStatus	number
小数位数:0,最大长度:10	否	否	报价单数据状态 示例：0
enterpriseId	string	否	否	企业号{cpu_auth.cpu_enterprise} 示例：1607968307653640195
enterpriseName	string	否	否	企业名称 示例：新架构特征委外协同测试供应商
purcorpId	string	否	否	采购企业{cpu_auth.cpu_enterprise} 示例：1753541851851784194
latestTalks	number
小数位数:0,最大长度:10	否	否	是否最新谈判轮次 示例：1
onofflineType	string	否	否	报价方式--线上、线上+线下、线下 示例：0
supplierDocId	string	否	否	供应商档案id 示例：1884788974317207558
supplierDocName	string	否	否	供应商档案名称 示例：新架构特征委外协同测试供应商
lastBuyofferRound	number
小数位数:0,最大长度:10	否	否	是否是最新一轮询价 示例：1
pricePolicy	number
小数位数:0,最大长度:10	否	否	报价品范围策略(1:按供货目录自动分配, 2:手动分配, 3:不限定报价品范围) 示例：3
offerId_priceStructure	string	否	否	价格构成
purorgId	string	否	否	采购组织id 示例：1753605503279693830
quoteCertif	string	否	否	已盖章的报价单附件字段 示例：0
needLimitPriceTimes	number
小数位数:0,最大长度:10	否	否	是否限制报价次数(默认“否”) 示例：0
showPriceRanking	boolean	否	否	是否提示报价排名(默认“否”) 示例：false
allowRisePrice	boolean	否	否	允许涨价 示例：true
acceptReferPrice	boolean	否	否	“接收平台参考报价”选项：选项有“接收/不接收”（默认“接收”） 示例：true
supplyIsInvited	boolean	否	否	当前供应商是否在询价单邀请列表中（默认值：否） 示例：true
publicTypeWide	boolean	否	否	询价方式（广泛征集供应商报价） 示例：false
publicTypeInvite	boolean	否	否	询价方式（邀请指定供应商报价） 示例：true
qtCurrencyIdDiwork	string	否	否	报价币种id 示例：1858848059050950656
qtCurrencyCodeDiwork	string	否	否	报价币种code 示例：RMB
qtCurrencyTypeSignDiwork	string	否	否	报价币种符号 示例：￥
currencyIdDiwork	string	否	否	多币种融合 币种id 示例：1858848059050950656
currencyCodeDiwork	string	否	否	币种编码 示例：RMB
currencyTypeSignDiwork	string	否	否	币种符号 示例：￥
certif	string	否	否	供应商资质证书 示例：1
buyerTenant	string	否	否	采购商租户 示例：0000LJ5I3I7H6YAPZ90000
vendorTenant	string	否	否	供应商租户 示例：0000LBD8CAVK9L5OGJ0000
supplierOtherCertif	string	否	否	供应商资质证书 示例：0
ytenant	string	否	否	租户 示例：0000LJ5I3I7H6YAPZ90000
priceDigit	number
小数位数:0,最大长度:10	否	否	单价精度 示例：4
priceRount	number
小数位数:0,最大长度:10	否	否	单价舍入规则 示例：4
moneyDigit	number
小数位数:0,最大长度:10	否	否	金额精度 示例：4
moneyRount	number
小数位数:0,最大长度:10	否	否	金额舍入规则 示例：4
exchRateAccuracy	string	否	否	换算率精度 示例：4
detailList	object	是	是	报价单子表
_status	string	否	是	操作标识：Insert:新增、Update:更新 示例: Insert 示例：Insert
isReplace	boolean	否	否	是否代录入：是否是由采购商代录入 示例：false

## 3. 请求示例

Url: /yonbip/cpu/qtoffer/save?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"subject": "api测试2",
			"purcorpName": "230621日常旗舰新架构广汽2",
			"purorgName": "采购云",
			"limitPriceTimes": "0",
			"vbuyofferBillcode": "XJD20241024000763",
			"suppliername": "lzd",
			"supplyPhone": "18989999228",
			"currencyNameDiwork": "TT-人民币",
			"currencyIdDiwork_priceDigit": 4,
			"offerId_quotExchRateType": "0000LJ5I3I7H6YAPZ90000",
			"currencyIdDiwork_moneyDigit": 4,
			"hasPriceInvoice": false,
			"offerId": 4039893368459520,
			"offerId_quotExchRateType_digit": 6,
			"currencyIdDiwork_priceRount": 4,
			"currencyIdDiwork_moneyRount": 4,
			"offerId_quotExchRateType_name": "基准汇率",
			"qtCurrencyNameDiwork": "TT-人民币",
			"currencyIsfixed": 0,
			"qtexpiredate": "2024-11-23 21:11:50",
			"convertTotalmny": 406.56,
			"offerId_buyofferTime": "2024-10-24 21:12:18",
			"priceInvoiceType_name": "",
			"offerReferExchRate": 1,
			"purchaser": "ljl",
			"purchaserPhone": "+86-18628416339",
			"priceModel": "1",
			"allowPartQuote": true,
			"buyofferType": "1",
			"convertNoTaxTotalmny": 363,
			"priceStatus": 0,
			"enterpriseId": "1607968307653640195",
			"enterpriseName": "新架构特征委外协同测试供应商",
			"purcorpId": "1753541851851784194",
			"latestTalks": 1,
			"onofflineType": "0",
			"supplierDocId": "1884788974317207558",
			"supplierDocName": "新架构特征委外协同测试供应商",
			"lastBuyofferRound": 1,
			"pricePolicy": 3,
			"offerId_priceStructure": "",
			"purorgId": "1753605503279693830",
			"quoteCertif": "0",
			"needLimitPriceTimes": 0,
			"showPriceRanking": false,
			"allowRisePrice": true,
			"acceptReferPrice": true,
			"supplyIsInvited": true,
			"publicTypeWide": false,
			"publicTypeInvite": true,
			"qtCurrencyIdDiwork": "1858848059050950656",
			"qtCurrencyCodeDiwork": "RMB",
			"qtCurrencyTypeSignDiwork": "￥",
			"currencyIdDiwork": "1858848059050950656",
			"currencyCodeDiwork": "RMB",
			"currencyTypeSignDiwork": "￥",
			"certif": "1",
			"buyerTenant": "0000LJ5I3I7H6YAPZ90000",
			"vendorTenant": "0000LBD8CAVK9L5OGJ0000",
			"supplierOtherCertif": "0",
			"ytenant": "0000LJ5I3I7H6YAPZ90000",
			"priceDigit": 4,
			"priceRount": 4,
			"moneyDigit": 4,
			"moneyRount": 4,
			"exchRateAccuracy": "4",
			"detailList": [
				{
					"_status": "Insert",
					"makeRule": "1484841087045993075",
					"plannerName": "",
					"productDescribe": "规格: 型号:",
					"productId": "1756327404434358280",
					"productName": "xmy物料",
					"purchaseamount": 11,
					"purchaseunitcode": "",
					"purchaseunitname": "千克",
					"reqdate": "",
					"reqOrgid": "",
					"reqOrgName": "采购云",
					"unit": "千克",
					"offerBId": 4039893368459521,
					"purchasenum": 11,
					"memo": "",
					"productCode": "0001000003",
					"qDetailFile": "",
					"amount": 11,
					"unitid": "1753668373007302671",
					"mainunitid": "1753668373007302671",
					"purchaseunitid": "1753668373007302671",
					"rowNo": 1,
					"invPurExchRateType": 0,
					"mainnum": 11,
					"mainunitname": "千克",
					"invpurexchrate": 1,
					"invpriceexchrate": 1,
					"nmaxPrice": "",
					"reqdeptName": "",
					"erpProjectName": "",
					"receiveOrgId": "",
					"receiveOrgName": "",
					"receivePersonId": "",
					"receivePersonName": "",
					"receivePersonTel": "",
					"receiveAddress": "",
					"skuId": "1756455789597818902",
					"skuCode": "0001000004",
					"skuModel": "",
					"skuName": "采购云-测试物料-01",
					"skuSpec": "测试说明",
					"purchaseDigit": "6",
					"unitDigit": "6",
					"mainDigit": "6",
					"offerBId_bmemo": "",
					"pritemid_reqProjectName": "",
					"priceStrategy": "",
					"dimensionPricingId": "",
					"priceStrategyName": "",
					"costQuoteGroupId": "",
					"purchaseRount": "4",
					"mainRount": "4",
					"unitRount": "4",
					"priceMark": 0,
					"discountTaxType": "0",
					"wbs": "",
					"activity": "",
					"wbsName": "",
					"wbsCode": "",
					"activityName": "",
					"activityCode": "",
					"processCode": "",
					"processName": "",
					"offerId": 4039893368459520,
					"allowTalkPrice": true,
					"refuseQuot": false,
					"hasDefaultInit": true,
					"attachmentId": "67f6f6a2-27b1-40d5-97bc-052d53e81a41",
					"_id": "rowId_45",
					"quotEnable": true,
					"taxrate": "12",
					"_tableDisplayOutlineAll": false,
					"noTaxPrice": 33,
					"_realtype": "",
					"_entityName": "",
					"_keyName": "",
					"ttt_id": "rowId_45",
					"unitExchangeType": "0",
					"invPriceExchRate": "1",
					"priceDigit": "4",
					"priceRount": "4",
					"moneyDigit": "4",
					"moneyRount": "4",
					"qtCurrencyIdDiwork": "1858848059050950656",
					"offerReferExchRate": 1,
					"nattag": false,
					"changeTaxRate": false,
					"currencyIdDiwork_priceDigit": "4",
					"currencyIdDiwork_priceRount": "4",
					"currencyIdDiwork_moneyDigit": "4",
					"currencyIdDiwork_moneyRount": "4",
					"currencyIdDiwork": "1858848059050950656",
					"steps": "",
					"_convert_steps": "",
					"price": 36.96,
					"noTaxMoney": 363,
					"totalPrice": 406.56,
					"tax": 43.56,
					"convertNoTaxPrice": 33,
					"convertPrice": 36.96,
					"convertNoTaxMny": 363,
					"natTax": 43.56,
					"convertMny": 406.56
				}
			],
			"_status": "Insert",
			"isReplace": false
		}
	]
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
code	number
小数位数:0,最大长度:10	否	返回状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	是	单据信息
subject	string	否	询价标题 示例：api测试2
id	number
小数位数:0,最大长度:16	否	报价单id 示例：4039897692475648
priceTimes	number
小数位数:0,最大长度:10	否	已经报价次数 示例：1
purcorpName	string	否	采购企业 示例：230621日常旗舰新架构广汽2
isExpireGtCurDate	string	否	截止时间是否大于当前时间 示例：1
purorgName	string	否	采购组织 示例：采购云
limitPriceTimes	number
小数位数:0,最大长度:10	否	是否限制报价次数(默认“否”) 示例：3
vbuyofferBillcode	string	否	询价单号 示例：XJD20241024000763
suppliername	string	否	报价人 示例：lzd
supplyPhone	string	否	报价人联系电话 示例：18989999228
currencyNameDiwork	string	否	询价币种 示例：TT-人民币
currencyIdDiwork_priceDigit	string	否	询价币种单价精度 示例：4
offerId_quotExchRateType	string	否	报价汇率类型id 示例：0000LJ5I3I7H6YAPZ90000
currencyIdDiwork_moneyDigit	string	否	询价币种金额精度 示例：4
hasPriceInvoice	boolean	否	是否提供发票 示例：false
offerId	number
小数位数:0,最大长度:16	否	询价单id 示例：4039893368459520
offerId_quotExchRateType_digit	string	否	报价汇率类型精度 示例：6
currencyIdDiwork_priceRount	string	否	询价币种单价舍入规则 示例：4
currencyIdDiwork_moneyRount	string	否	询价币种金额舍入规则 示例：4
offerId_quotExchRateType_name	string	否	报价汇率类型 示例：基准汇率
qtCurrencyNameDiwork	string	否	报价币种 示例：TT-人民币
qoDefineCharacter	object	是	报价单主表自定义项
qoDefineCharacter__id	string	否	报价单主表自定义项id 示例：4039897692475652
ip	string	否	报价IP地址 示例：10.6.220.31
qtexpiredate	string	否	报价截止时间 示例：2024-11-23 21:11:50
convertTotalmny	string	否	折算询价币含税总金额(现金) 示例：406.56
totalmny	number
小数位数:2,最大长度:10	否	总金额 示例：406.56
offerId_buyofferTime	string	否	报价汇率日期 示例：2024-10-24 21:12:18
createtime	string	否	报价单创建时间 示例：2024-10-24 21:16:31
offerReferExchRate	number
小数位数:0,最大长度:10	否	报价参考汇率 示例：1
purchaser	string	否	联系人 示例：ljl
purchaserPhone	string	否	联系电话 示例：+86-18628416339
corpSubAccount	string	否	外系统人员 示例：ljl
priceModel	string	否	报价模式 示例：1
allowPartQuote	boolean	否	允许供应商部分报价 示例：true
buyofferType	string	否	履行方式 示例：1
corpSubAccountid	string	否	外系统人员ID 示例：2051036927722258437
processTime	string	否	处理时间 示例：2024-10-25 17:38:40
updateTime	string	否	更新时间 示例：2024-10-24 21:16:38
convertNoTaxTotalmny	string	否	折算询价币无税总金额(现金) 示例：363
convertAcceptanceTotalMny	string	否	折算询价币含税总金额(承兑) 示例：0
convertNoTaxAccTotalMny	string	否	折算询价币无税总金额(承兑) 示例：0
priceStatus	number
小数位数:0,最大长度:10	否	报价单数据状态 示例：2
enterpriseId	string	否	企业id 示例：1607968307653640195
enterpriseName	string	否	企业名称 示例：新架构特征委外协同测试供应商
offerReleaseTime	string	否	询价单发布时间 示例：2024-10-24 21:12:18
supplierCertif	string	否	对供应商证件要求 示例：0
publicType	string	否	公开招标，还是邀请招标标志 0-公开 1-邀请 示例：0
latestTalks	boolean	否	是否最新谈判轮次 示例：true
onofflineType	string	否	报价方式--线上、线上+线下、线下 示例：0
isReplace	boolean	否	是否代录入：是否是由采购商代录入 示例：false
convertPaymentTotalMny	string	否	折算询价币含税总金额(账期) 示例：0
supplierDocId	string	否	供应商档案id 示例：1884788974317207558
supplierDocName	string	否	供应商档案名称 示例：新架构特征委外协同测试供应商
acceptanceTotalMny	number
小数位数:0,最大长度:10	否	承兑总金额 示例：0
paymentTotalMny	number
小数位数:0,最大长度:10	否	账期总金额 示例：0
diffQuotaUnit	boolean	否	是否指定特殊报价单位 示例：false
noTaxTotalmny	number
小数位数:0,最大长度:10	否	无税总金额 示例：363
noTaxAccTotalMny	number
小数位数:0,最大长度:10	否	无税承兑总金额 示例：0
noTaxPayTotalMny	number
小数位数:0,最大长度:10	否	无税账期总金额 示例：0
buyofferRound	number
小数位数:0,最大长度:10	否	询价轮次（1,2,3.....），记录重新询价的次数 示例：1
lastBuyofferRound	boolean	否	是否是最新一轮询价，用于标识重新询价时，当前的询价 示例：true
pricePolicy	number
小数位数:0,最大长度:10	否	报价品范围策略(1:按供货目录自动分配, 2:手动分配, 3:不限定报价品范围) 示例：3
priceQuoted	boolean	否	已经报价(谈判之后，供应商没有主动报价的时候，会是false，lastTotalmny将被废弃) 示例：true
purorgId	string	否	采购组织id 示例：1753605503279693830
convertNoTaxPayTotalMny	string	否	折算询价币无税总金额(账期) 示例：0
quoteCertif	string	否	已盖章的报价单附件字段 示例：0
needLimitPriceTimes	boolean	否	是否限制报价次数(默认“否”) 示例：false
showPriceRanking	boolean	否	是否提示报价排名(默认“否”) 示例：false
noTaxPriceRanking	number
小数位数:0,最大长度:10	否	现金无税报价排名 示例：0
noTaxPaymentPriceRanking	number
小数位数:0,最大长度:10	否	账期无税报价排名 示例：0
noTaxAcceptancePriceRanking	number
小数位数:0,最大长度:10	否	承兑无税报价排名 示例：0
firstTotalmny	number
小数位数:2,最大长度:10	否	总金额(首次保存报价) 示例：406.56
firstNoTaxTotalmny	number
小数位数:0,最大长度:10	否	无税总金额(首次保存报价) 示例：363
allowRisePrice	boolean	否	允许涨价 示例：true
contractVisibleLevel	string	否	联系方式可见等级(登录后可见, 报价后可见, 公开) 示例：1
acceptReferPrice	boolean	否	“接收平台参考报价”选项：选项有“接收/不接收”（默认“接收”） 示例：true
allowPriceFormal	boolean	否	“允许将参考报价加入正式报价”选项：选项有“允许/不允许”（默认“允许”） 示例：true
purchaserRead	boolean	否	“采购方查阅状态”字段：选项有“采购方未查阅”“采购方已查询” 示例：false
priceCompare	boolean	否	是否已经加入比价参考（默认值：否） 示例：false
supplyIsInvited	boolean	否	当前供应商是否在询价单邀请列表中（默认值：否） 示例：true
publicTypeWide	boolean	否	询价方式（广泛征集供应商报价） 示例：false
publicTypeInvite	boolean	否	询价方式（邀请指定供应商报价） 示例：true
talkAllowQuote	boolean	否	“需谈判”：发起谈判的时候是否允许供应商修改报价 示例：true
qtCurrencyIdDiwork	string	否	报价币种id 示例：1858848059050950656
qtCurrencyCodeDiwork	string	否	报价币种code 示例：RMB
qtCurrencyTypeSignDiwork	string	否	报价币种符号 示例：￥
lastQtCurrencyIdDiwork	string	否	上轮报价币种id 示例：1858848059050950656
currencyIdDiwork	string	否	多币种融合 币种id 示例：1858848059050950656
currencyCodeDiwork	string	否	币种编码 示例：RMB
currencyTypeSignDiwork	string	否	币种符号 示例：￥
exchangeRate	number
小数位数:0,最大长度:10	否	汇率 示例：1
editStatus	string	否	驳回后编辑标记 示例：0
attachNeedCtrl	string	否	对供应商报价要求上传附件的管控级别 示例：0
ts	string	否	时间 示例：2024-10-25 17:38:41
pubts	string	否	时间戳 示例：2024-10-25 17:38:41
buyerTenant	string	否	采购商租户id 示例：0000LJ5I3I7H6YAPZ90000
vendorTenant	string	否	供应商租户id 示例：0000LBD8CAVK9L5OGJ0000
priceRanking	number
小数位数:0,最大长度:10	否	现金排名 示例：0
acceptancePriceRanking	number
小数位数:0,最大长度:10	否	承兑排名 示例：0
paymentPriceRanking	number
小数位数:0,最大长度:10	否	账期排名 示例：0
supplierOtherCertif	string	否	供应商资质证书 示例：0
ytenant	string	否	租户 示例：0000LJ5I3I7H6YAPZ90000
priceDigit	string	否	单价精度 示例：4
priceRount	string	否	单价舍入规则 示例：4
moneyDigit	string	否	金额精度 示例：4
moneyRount	string	否	金额舍入规则 示例：4
exchRateAccuracy	string	否	换算率精度 示例：4
detailList	object	是	报价单子表
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
remainTimes	string	否	报价剩余次数
dr	number
小数位数:0,最大长度:10	否	删除标识 示例：0
addressName	string	否	地址
modifierId	string	否	修改人id 示例：1659807841362378756
modifier	string	否	修改人 示例：ljl
modifyTime	string	否	修改时间 示例：2024-10-25 17:38:40
tagName	string	否	状态标签 示例：已报价
tagBackColor	string	否	状态标签颜色 示例：#C6D3FF
traceId	string	否	traceId 示例：a91c7c3ac321f7b1
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"subject": "api测试2",
			"id": 4039897692475648,
			"priceTimes": 1,
			"purcorpName": "230621日常旗舰新架构广汽2",
			"isExpireGtCurDate": "1",
			"purorgName": "采购云",
			"limitPriceTimes": 3,
			"vbuyofferBillcode": "XJD20241024000763",
			"suppliername": "lzd",
			"supplyPhone": "18989999228",
			"currencyNameDiwork": "TT-人民币",
			"currencyIdDiwork_priceDigit": "4",
			"offerId_quotExchRateType": "0000LJ5I3I7H6YAPZ90000",
			"currencyIdDiwork_moneyDigit": "4",
			"hasPriceInvoice": false,
			"offerId": 4039893368459520,
			"offerId_quotExchRateType_digit": "6",
			"currencyIdDiwork_priceRount": "4",
			"currencyIdDiwork_moneyRount": "4",
			"offerId_quotExchRateType_name": "基准汇率",
			"qtCurrencyNameDiwork": "TT-人民币",
			"qoDefineCharacter": [
				{
					"id": "4039897692475652",
					"ytenant": "0000LJ5I3I7H6YAPZ90000"
				}
			],
			"qoDefineCharacter__id": "4039897692475652",
			"ip": "10.6.220.31",
			"qtexpiredate": "2024-11-23 21:11:50",
			"convertTotalmny": "406.56",
			"totalmny": 406.56,
			"offerId_buyofferTime": "2024-10-24 21:12:18",
			"createtime": "2024-10-24 21:16:31",
			"offerReferExchRate": 1,
			"purchaser": "ljl",
			"purchaserPhone": "+86-18628416339",
			"corpSubAccount": "ljl",
			"priceModel": "1",
			"allowPartQuote": true,
			"buyofferType": "1",
			"corpSubAccountid": "2051036927722258437",
			"processTime": "2024-10-25 17:38:40",
			"updateTime": "2024-10-24 21:16:38",
			"convertNoTaxTotalmny": "363",
			"convertAcceptanceTotalMny": "0",
			"convertNoTaxAccTotalMny": "0",
			"priceStatus": 2,
			"enterpriseId": "1607968307653640195",
			"enterpriseName": "新架构特征委外协同测试供应商",
			"purcorpId": "1753541851851784194",
			"offerReleaseTime": "2024-10-24 21:12:18",
			"supplierCertif": "0",
			"publicType": "0",
			"latestTalks": true,
			"onofflineType": "0",
			"isReplace": false,
			"convertPaymentTotalMny": "0",
			"supplierDocId": "1884788974317207558",
			"supplierDocName": "新架构特征委外协同测试供应商",
			"acceptanceTotalMny": 0,
			"paymentTotalMny": 0,
			"diffQuotaUnit": false,
			"noTaxTotalmny": 363,
			"noTaxAccTotalMny": 0,
			"noTaxPayTotalMny": 0,
			"buyofferRound": 1,
			"lastBuyofferRound": true,
			"pricePolicy": 3,
			"priceQuoted": true,
			"purorgId": "1753605503279693830",
			"convertNoTaxPayTotalMny": "0",
			"quoteCertif": "0",
			"needLimitPriceTimes": false,
			"showPriceRanking": false,
			"noTaxPriceRanking": 0,
			"noTaxPaymentPriceRanking": 0,
			"noTaxAcceptancePriceRanking": 0,
			"firstTotalmny": 406.56,
			"firstNoTaxTotalmny": 363,
			"allowRisePrice": true,
			"contractVisibleLevel": "1",
			"acceptReferPrice": true,
			"allowPriceFormal": true,
			"purchaserRead": false,
			"priceCompare": false,
			"supplyIsInvited": true,
			"publicTypeWide": false,
			"publicTypeInvite": true,
			"talkAllowQuote": true,
			"qtCurrencyIdDiwork": "1858848059050950656",
			"qtCurrencyCodeDiwork": "RMB",
			"qtCurrencyTypeSignDiwork": "￥",
			"lastQtCurrencyIdDiwork": "1858848059050950656",
			"currencyIdDiwork": "1858848059050950656",
			"currencyCodeDiwork": "RMB",
			"currencyTypeSignDiwork": "￥",
			"exchangeRate": 1,
			"editStatus": "0",
			"attachNeedCtrl": "0",
			"ts": "2024-10-25 17:38:41",
			"pubts": "2024-10-25 17:38:41",
			"buyerTenant": "0000LJ5I3I7H6YAPZ90000",
			"vendorTenant": "0000LBD8CAVK9L5OGJ0000",
			"priceRanking": 0,
			"acceptancePriceRanking": 0,
			"paymentPriceRanking": 0,
			"supplierOtherCertif": "0",
			"ytenant": "0000LJ5I3I7H6YAPZ90000",
			"priceDigit": "4",
			"priceRount": "4",
			"moneyDigit": "4",
			"moneyRount": "4",
			"exchRateAccuracy": "4",
			"detailList": [
				{
					"noTaxPrice": 33,
					"exchangeRateDiwork": 1,
					"invPurExchRateType": 0,
					"supplyChanged": false,
					"noTaxPriceRanking": 0,
					"firstNoTaxMoney": 363,
					"productName": "xmy物料",
					"offerBId": 4039893368459521,
					"paymentPriceRanking": 0,
					"buyOfferBodyVOFreeCharacteristics": [
						{
							"ytenant": "0000LJ5I3I7H6YAPZ90000",
							"id": "4039893368459523",
							"dr": "0"
						}
					],
					"price": 36.96,
					"qoDetailDefineCharacter__TZ001111": "0",
					"acceptancePriceRanking": 0,
					"id": 4039897692475649,
					"noTaxPaymentPriceRanking": 0,
					"allowTalkPrice": true,
					"skuId": "1756455789597818902",
					"cpuofferid": 4039897692475648,
					"taxrate": "12",
					"productId": "1756327404434358280",
					"mainunitname": "千克",
					"refuseQuot": false,
					"mainnum": 11,
					"noTaxMoney": 363,
					"qtCurrencyCodeDiwork": "RMB",
					"noTaxAcceptancePriceRanking": 0,
					"firstTotalPrice": 406.56,
					"productDescribe": "规格: 型号:",
					"invpriceexchrate": 1,
					"tax": 43.56,
					"currencyNameDiwork": "TT-人民币",
					"priceRanking": 0,
					"currencyTypeSignDiwork": "￥",
					"qtCurrencyNameDiwork": "TT-人民币",
					"unit": "千克",
					"qtCurrencyIdDiwork": "1858848059050950656",
					"qoDetailFreeCharacteristics": [
						{
							"ytenant": "0000LJ5I3I7H6YAPZ90000",
							"id": "4039897692475651"
						}
					],
					"mainRount": "4",
					"qoDetailDefineCharacter__id": "4039897692475650",
					"firstNoTaxPrice": 33,
					"offerId": 4039893368459520,
					"purchaseDigit": "6",
					"vendorTenant": "0000LBD8CAVK9L5OGJ0000",
					"discountTaxType": "0",
					"status": "2",
					"rowNo": 1,
					"qtCurrencyTypeSignDiwork": "￥",
					"purchaseRount": "4",
					"totalPrice": "406.5600",
					"qDetailFile": "",
					"qoDetailDefineCharacter": [
						{
							"TZ001111": 0,
							"ytenant": "0000LJ5I3I7H6YAPZ90000",
							"id": "4039897692475650"
						}
					],
					"quotEnable": true,
					"buyerTenant": "0000LJ5I3I7H6YAPZ90000",
					"unitDigit": "6",
					"invpurexchrate": 1,
					"currencyIdDiwork": "1858848059050950656",
					"unitRount": "4",
					"purchasenum": 11,
					"currencyCodeDiwork": "RMB",
					"amount": 11,
					"purchaseunitname": "千克",
					"ytenant": "0000LJ5I3I7H6YAPZ90000",
					"purchaseamount": 11,
					"reqOrgName": "采购云",
					"firstPrice": 36.96,
					"productCode": "0001000003",
					"unitid": "1753668373007302671",
					"unpdReleased": false,
					"mainunitid": "1753668373007302671",
					"reqOrgid": "1753605503279693830",
					"mainDigit": "6",
					"priceMark": 0,
					"purchaseunitid": "1753668373007302671",
					"ts": "2024-10-24 21:16:32",
					"unitExchangeType": "0",
					"convertMny": "406.56",
					"convertNoTaxMny": "363",
					"convertPrice": "36.96",
					"convertNoTaxPrice": "33",
					"attachmentId": "4039897692475649",
					"dr": 0,
					"exchangeRate": 1
				}
			],
			"resubmitCheckKey": "ipricecard_edit_f5d420a5-5efb-480f-859b-79315b64ac24",
			"remainTimes": "",
			"dr": 0,
			"addressName": "",
			"modifierId": "1659807841362378756",
			"modifier": "ljl",
			"modifyTime": "2024-10-25 17:38:40",
			"tagName": "已报价",
			"tagBackColor": "#C6D3FF"
		}
	],
	"traceId": "a91c7c3ac321f7b1",
	"uploadable": "0"
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
	1	2025-08-26	
更新
请求参数 offerId
更新
请求参数 offerBId
更新
请求参数 offerId
id调整大小

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

