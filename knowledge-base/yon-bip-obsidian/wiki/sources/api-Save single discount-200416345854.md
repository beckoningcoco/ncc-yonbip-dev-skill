---
title: "商品优惠单个保存"
apiId: "2004163458543124489"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Discount"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Discount]
platform_version: "BIP"
source_type: community-api-docs
---

# 商品优惠单个保存

>  请求方式	POST | Product Discount (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/promotionNew/save
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
data	object	否	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
saleOrgId	string	否	是	创建组织ID(当前身份调用) 示例：1686482740771291145
transTypeId	string	否	是	交易类型ID 示例：1965824201058156546
name	object	否	是	政策名称
code	string	否	否	政策编码(自动编码时根据编码规则自动生成) 示例：SPYH2024052400000033
departmentId	string	否	否	部门ID 示例：1811523429314592778
displayName	object	否	否	商城显示名称
policyStartDate	date
格式:yyyy-MM-dd HH:mm:ss	否	是	政策开始时间 示例：2024-05-24 00:00:00
policyEndDate	date
格式:yyyy-MM-dd HH:mm:ss	否	是	政策结束时间 示例：2024-05-24 23:59:59
currencyId	string	否	是	币种ID 示例：1680626484125368348
feeItemId	string	否	否	费用项目ID 示例：1899019300484677633
displayPriority	number
小数位数:0,最大长度:4	否	否	商城显示优先级 示例：3
persistentType	number
小数位数:0,最大长度:10	否	是	持续类型:{{1:期间内持续生效;2:期间内间歇生效}} 示例：1 默认值：1
cycleStartType	number
小数位数:0,最大长度:10	否	否	周期开始类型:{1:本月} 示例：1
cycleStartDay	number
小数位数:0,最大长度:10	否	否	周期开始日期:{自然日，1-31} 示例：1
cycleStartTime	date
格式:HH:mm:ss	否	否	周期开始时间 示例：00:00:06
cycleEndType	number
小数位数:0,最大长度:10	否	否	周期结束类型:{1:本月;2:次月} 示例：2
cycleEndDay	number
小数位数:0,最大长度:10	否	否	周期结束日期:{自然日，1-31} 示例：1
cycleEndTime	date
格式:HH:mm:ss	否	否	周期结束时间 示例：00:00:20
ladderType	number
小数位数:0,最大长度:10	否	是	梯度类型:{1:满件;2:满额} 示例：1 默认值：1
preConditionProductScope	string	否	否	优惠规则条件设置方式:{ALL:整单;BRAND:品牌;PRODUCT:商品;PRODUCTCLASS:商品分类;PRODUCTTAG:标签商品;SKU:SKU}（多选时英文逗号分隔） 示例：PRODUCT
preConditionControlDimen	string	否	否	优惠规则条件控制维度:{1:数量;2:金额;3:商品种类数}（多选时英文逗号分隔） 示例：1
preferentialType	number
小数位数:0,最大长度:10	否	否	优惠类型:{1:打折;2:减价;3:买赠;4:一口价} 示例：1 默认值：1
giveawayCalRule	number
小数位数:0,最大长度:10	否	否	赠品计算规则:{1:赠指定数量赠品;2:赠指定金额赠品} 示例：1 默认值：1
giveawayType	string	否	否	赠品维度:{ALL:全场任选;ORIGINAL:赠原品;PRODUCT:赠指定商品;PRODUCT_CLASS:赠商品分类;PRODUCT_SKU:赠指定SKU}（多选时英文逗号分隔） 示例：PRODUCT
originalGiveawayRule	number
小数位数:0,最大长度:10	否	否	原品赠品计算规则:{1:平均分摊;2:价格属低} 示例：1 默认值：1
ladderMatchWay	number
小数位数:0,最大长度:10	否	否	梯度匹配方式:{1:多梯度递减匹配;2:仅匹配最大梯度} 示例：1 默认值：1
excessCalWay	number
小数位数:0,最大长度:10	否	否	超出部分计算方式:{1:忽略超出且未达到下一梯度的值;2:满足梯度后按比例赠送} 示例：1 默认值：1
giveawayRoundType	number
小数位数:0,最大长度:10	否	否	赠品数量取整方式:{1:按单位精度;2:向下取整;3:向上取整;4:四舍五入} 示例：1 默认值：1
giveawaySelection	number
小数位数:0,最大长度:10	否	否	梯度间赠品可选:{1:不可选，多梯度由高到低自动匹配;2:可自由选择适合自己的梯度} 示例：1 默认值：1
giveawayAmountProcess	number
小数位数:0,最大长度:10	否	否	赠品金额处理:{1:赠品优惠仅由活动商品承担;2:赠品优惠由活动商品+赠品共同承担;3:赠品优惠仅由赠品承担(赠品金额为0)} 示例：1 默认值：1
giveawayRule	number
小数位数:0,最大长度:10	否	否	买赠规则:{1:每满X赠Y;2:满X赠Y} 示例：1 默认值：1
customerScopeType	string	否	否	适用客户类型(支持全部客户,客户,包含排除客户,默认为全部客户.)(0:全部客户;1:客户;6:包含排除客户)(多选时英文逗号分隔) 示例：1
promotionProductRuleInfos	object	是	是	优惠规则
promotionDisplayPosterInfos	object	是	是	海报图片

## 3. 请求示例

Url: /yonbip/sd/promotionNew/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"saleOrgId": "1686482740771291145",
		"transTypeId": "1965824201058156546",
		"name": {
			"zh_CN": "api保存",
			"zh_TW": "api保存",
			"en_US": "apisave"
		},
		"code": "SPYH2024052400000033",
		"departmentId": "1811523429314592778",
		"displayName": {
			"zh_CN": "test商城显示名称",
			"zh_TW": "test商城顯示名稱",
			"en_US": "testdisplay"
		},
		"policyStartDate": "2024-05-24 00:00:00",
		"policyEndDate": "2024-05-24 23:59:59",
		"currencyId": "1680626484125368348",
		"feeItemId": "1899019300484677633",
		"displayPriority": 3,
		"persistentType": 1,
		"cycleStartType": 1,
		"cycleStartDay": 1,
		"cycleStartTime": "00:00:06",
		"cycleEndType": 2,
		"cycleEndDay": 1,
		"cycleEndTime": "00:00:20",
		"ladderType": 1,
		"preConditionProductScope": "PRODUCT",
		"preConditionControlDimen": "1",
		"preferentialType": 1,
		"giveawayCalRule": 1,
		"giveawayType": "PRODUCT",
		"originalGiveawayRule": 1,
		"ladderMatchWay": 1,
		"excessCalWay": 1,
		"giveawayRoundType": 1,
		"giveawaySelection": 1,
		"giveawayAmountProcess": 1,
		"giveawayRule": 1,
		"customerScopeType": "1",
		"promotionProductRuleInfos": [
			{
				"productId": 1685911209466396675,
				"ladder": 10,
				"unitPriceReduction": 20,
				"unitPriceFixed": 20,
				"unitPriceDiscount": 8,
				"gGroupNumber": 1,
				"isOriginal": false,
				"gProductId": 1852910799331786755,
				"gSkuId": 1852913041304715267,
				"gProductClassId": 1894351933756407814,
				"isAll": false,
				"gDefaultProductId": 2007271305487319049,
				"gDefaultSkuId": 2007271803703525379,
				"gQuantity": 10,
				"gAmount": 20,
				"ladderPriority": 4,
				"ladderRuleDesc": {
					"zh_CN": "优惠规则描述",
					"zh_TW": "優惠規則描述",
					"en_US": "Discount Rule Description"
				},
				"promotionRuleConditionInfos": [
					{
						"conditionIndex": 1,
						"productId": 1784642706475057152,
						"skuId": 1784642706475057180,
						"productClassId": 1868544686453948422,
						"productBrandId": 1833601133174063106,
						"productTagId": 2050295985735204870,
						"isWholeOrder": false,
						"quantity": 20,
						"amount": 20,
						"productVarieties": 20,
						"skuVarieties": 20
					}
				]
			}
		],
		"promotionDisplayPosterInfos": [
			{
				"relationProduct": 1784620930990866434
			}
		]
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
id	string	否	id 示例：1982926168121671681
saleOrgId	string	否	saleOrgId 示例：1686482740771291145
saleOrgName	string	否	saleOrgName 示例：营销费用
transTypeId	string	否	transTypeId 示例：1971765343406784522
transTypeName	string	否	transTypeName 示例：test审批流
name	object	否	name
code	string	否	code 示例：SPYH2024042500000022
departmentId	string	否	departmentId 示例：1811523429314592778
departmentName	string	否	departmentName 示例：费用分部
displayName	object	否	displayName
policyStartDate	string	否	policyStartDate 示例：2024-04-25 00:00:00
policyEndDate	string	否	policyEndDate 示例：2024-04-25 23:59:59
currencyId	string	否	currencyId 示例：1680626484125368348
priceDigit	number
小数位数:0,最大长度:10	否	priceDigit 示例：5
moneyRount	number
小数位数:0,最大长度:10	否	moneyRount 示例：0
moneyDigit	number
小数位数:0,最大长度:10	否	moneyDigit 示例：2
currencyName	string	否	currencyName 示例：人民币
currencyCode	string	否	currencyCode 示例：CNY
priceRount	number
小数位数:0,最大长度:10	否	priceRount 示例：4
feeItemId	string	否	feeItemId 示例：1899019300484677633
feeItemName	string	否	feeItemName 示例：test0103
displayPriority	number
小数位数:0,最大长度:10	否	displayPriority 示例：123
displayWay	number
小数位数:0,最大长度:10	否	displayWay 示例：1
persistentType	number
小数位数:0,最大长度:10	否	persistentType 示例：1
cycleStartType	number
小数位数:0,最大长度:10	否	cycleStartType 示例：1
cycleStartDay	number
小数位数:0,最大长度:10	否	cycleStartDay 示例：1
cycleStartTime	string	否	cycleStartTime 示例：00:00:01
cycleEndType	string	否	cycleEndType 示例：1
cycleEndDay	number
小数位数:0,最大长度:10	否	cycleEndDay 示例：31
cycleEndTime	string	否	cycleEndTime 示例：02:02:02
pcPoster	string	否	pcPoster 示例：433b8f64-ecd3-4281-bfb2-ca3e8d253229
mobilePoster	string	否	mobilePoster 示例：57529790-5f7b-4ac4-8e04-063a74da81b8
ladderType	number
小数位数:0,最大长度:10	否	ladderType 示例：1
preferentialProductType	string	否	preferentialProductType 示例：PRODUCT
preferentialMatchType	number
小数位数:0,最大长度:10	否	preferentialMatchType 示例：1
preConditionProductScope	string	否	preConditionProductScope 示例：PRODUCT,SKU,PRODUCTCLASS,BRAND,PRODUCTTAG,ALL
preConditionControlDimen	string	否	preConditionControlDimen 示例：2,1,3
preferentialType	number
小数位数:0,最大长度:10	否	preferentialType 示例：3
giveawayCalRule	number
小数位数:0,最大长度:10	否	giveawayCalRule 示例：1
giveawayType	string	否	giveawayType 示例：ORIGINAL,PRODUCT,PRODUCT_SKU,PRODUCT_CLASS,BRAND,PRODUCT_TAG,ALL
giveawayUnit	string	否	giveawayUnit 示例：1
originalGiveawayRule	number
小数位数:0,最大长度:10	否	originalGiveawayRule 示例：1
ladderMatchWay	number
小数位数:0,最大长度:10	否	ladderMatchWay 示例：1
excessCalWay	number
小数位数:0,最大长度:10	否	excessCalWay 示例：1
giveawayRoundType	number
小数位数:0,最大长度:10	否	giveawayRoundType 示例：1
giveawaySelection	number
小数位数:0,最大长度:10	否	giveawaySelection 示例：1
giveawayAmountProcess	number
小数位数:0,最大长度:10	否	giveawayAmountProcess 示例：1
giveawayRule	number
小数位数:0,最大长度:10	否	giveawayRule 示例：1
isGiveawayLimit	number
小数位数:0,最大长度:10	否	isGiveawayLimit 示例：0
customerScopeType	string	否	customerScopeType 示例：2,3,4,5
matchPriority	number
小数位数:0,最大长度:10	否	matchPriority 示例：321
isContainedSpecialMatch	number
小数位数:0,最大长度:10	否	isContainedSpecialMatch 示例：1
specialMatchType	string	否	specialMatchType 示例：21,22,20,23,24
isContainedOrderCharacter	number
小数位数:0,最大长度:10	否	isContainedOrderCharacter 示例：0
orderCharacter	string	否	orderCharacter
isCustomerOrderLimit	number
小数位数:0,最大长度:10	否	isCustomerOrderLimit 示例：1
customerOrderLimitCount	number
小数位数:0,最大长度:10	否	customerOrderLimitCount 示例：111
isPreferentialProductLimit	number
小数位数:0,最大长度:10	否	isPreferentialProductLimit 示例：1
preferentialProductLimitType	number
小数位数:0,最大长度:10	否	preferentialProductLimitType 示例：1
promotionDefineCharacter	string	否	promotionDefineCharacter 示例：0
isGeneratedSubPromotion	boolean	否	isGeneratedSubPromotion 示例：false
isPlatform	boolean	否	isPlatform 示例：true
canWithDraw	number
小数位数:0,最大长度:10	否	canWithDraw 示例：1
isCanEdit	boolean	否	isCanEdit 示例：true
vouchdate	string	否	vouchdate 示例：2024-04-25 00:00:00
creatorId	string	否	creatorId 示例：1686483900406693892
creator	string	否	creator 示例：昵称-录用测试
createDate	string	否	createDate 示例：2024-04-25 00:00:00
createTime	string	否	createTime 示例：2024-04-25 19:03:08
modifierId	string	否	modifierId 示例：1686483900406693892
modifier	string	否	modifier 示例：昵称-录用测试
modifyDate	string	否	modifyDate 示例：2024-04-10
modifyTime	string	否	modifyTime 示例：2024-04-12 15:54:33
auditorId	string	否	auditorId 示例：1961858219666046976
auditor	string	否	auditor 示例：昵称-录用测试
auditTime	string	否	auditTime 示例：2024-05-06 11:29:09
isWfControlled	number
小数位数:0,最大长度:10	否	isWfControlled 示例：1
returncount	string	否	returncount 示例：2
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
status	number
小数位数:0,最大长度:10	否	status 示例：0
stopstatus	boolean	否	stopstatus 示例：true
pubts	string	否	pubts 示例：2024-04-25 19:03:08
promotionCustomerScopeInfos	object	是	promotionCustomerScopeInfos
promotionMatchDimensionInfos	object	是	promotionMatchDimensionInfos
promotionProductLimitInfos	object	是	promotionProductLimitInfos
promotionProductRuleInfos	object	是	promotionProductRuleInfos
promotionOrgSettingsInfos	object	是	promotionOrgSettingsInfos

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "1982926168121671681",
		"saleOrgId": "1686482740771291145",
		"saleOrgName": "营销费用",
		"transTypeId": "1971765343406784522",
		"transTypeName": "test审批流",
		"name": {
			"zh_TW": "test名称繁体",
			"en_US": "test名称英文",
			"zh_CN": "test004全乎的"
		},
		"code": "SPYH2024042500000022",
		"departmentId": "1811523429314592778",
		"departmentName": "费用分部",
		"displayName": {
			"zh_TW": "test繁体显示名称",
			"en_US": "test英文显示名称",
			"zh_CN": "test商城显示名称"
		},
		"policyStartDate": "2024-04-25 00:00:00",
		"policyEndDate": "2024-04-25 23:59:59",
		"currencyId": "1680626484125368348",
		"priceDigit": 5,
		"moneyRount": 0,
		"moneyDigit": 2,
		"currencyName": "人民币",
		"currencyCode": "CNY",
		"priceRount": 4,
		"feeItemId": "1899019300484677633",
		"feeItemName": "test0103",
		"displayPriority": 123,
		"displayWay": 1,
		"persistentType": 1,
		"cycleStartType": 1,
		"cycleStartDay": 1,
		"cycleStartTime": "00:00:01",
		"cycleEndType": "1",
		"cycleEndDay": 31,
		"cycleEndTime": "02:02:02",
		"pcPoster": "433b8f64-ecd3-4281-bfb2-ca3e8d253229",
		"mobilePoster": "57529790-5f7b-4ac4-8e04-063a74da81b8",
		"ladderType": 1,
		"preferentialProductType": "PRODUCT",
		"preferentialMatchType": 1,
		"preConditionProductScope": "PRODUCT,SKU,PRODUCTCLASS,BRAND,PRODUCTTAG,ALL",
		"preConditionControlDimen": "2,1,3",
		"preferentialType": 3,
		"giveawayCalRule": 1,
		"giveawayType": "ORIGINAL,PRODUCT,PRODUCT_SKU,PRODUCT_CLASS,BRAND,PRODUCT_TAG,ALL",
		"giveawayUnit": "1",
		"originalGiveawayRule": 1,
		"ladderMatchWay": 1,
		"excessCalWay": 1,
		"giveawayRoundType": 1,
		"giveawaySelection": 1,
		"giveawayAmountProcess": 1,
		"giveawayRule": 1,
		"isGiveawayLimit": 0,
		"customerScopeType": "2,3,4,5",
		"matchPriority": 321,
		"isContainedSpecialMatch": 1,
		"specialMatchType": "21,22,20,23,24",
		"isContainedOrderCharacter": 0,
		"orderCharacter": "",
		"isCustomerOrderLimit": 1,
		"customerOrderLimitCount": 111,
		"isPreferentialProductLimit": 1,
		"preferentialProductLimitType": 1,
		"promotionDefineCharacter": "0",
		"isGeneratedSubPromotion": false,
		"isPlatform": true,
		"canWithDraw": 1,
		"isCanEdit": true,
		"vouchdate": "2024-04-25 00:00:00",
		"creatorId": "1686483900406693892",
		"creator": "昵称-录用测试",
		"createDate": "2024-04-25 00:00:00",
		"createTime": "2024-04-25 19:03:08",
		"modifierId": "1686483900406693892",
		"modifier": "昵称-录用测试",
		"modifyDate": "2024-04-10",
		"modifyTime": "2024-04-12 15:54:33",
		"auditorId": "1961858219666046976",
		"auditor": "昵称-录用测试",
		"auditTime": "2024-05-06 11:29:09",
		"isWfControlled": 1,
		"returncount": "2",
		"verifystate": 0,
		"status": 0,
		"stopstatus": true,
		"pubts": "2024-04-25 19:03:08",
		"promotionCustomerScopeInfos": [
			{
				"id": "",
				"pubts": "",
				"promotionId": "",
				"customerAreaId": "",
				"customerAreaCode": "",
				"customerAreaName": "",
				"customerClassIdName": "",
				"customerClassId": "",
				"customerLevelName": "",
				"customerLevelId": "",
				"customerChannelId": "",
				"customerChannelName": "",
				"customerName": "",
				"customerId": "",
				"customerCode": ""
			}
		],
		"promotionMatchDimensionInfos": [
			{
				"id": "",
				"pubts": "",
				"promotionId": "",
				"sendTransWayId": "",
				"sendTransWayName": "",
				"settlementId": "",
				"settlementName": "",
				"paymentMethod": "",
				"invoiceTypeName": "",
				"invoiceTypeId": "",
				"transTypeId": "",
				"orderTransTypeName": "",
				"matchDimensionCharacter": "",
				"zoneName": "",
				"zoneId": "",
				"paymentPolicyName": "",
				"paymentPolicyId": ""
			}
		],
		"promotionProductLimitInfos": [
			{
				"id": "1982926168121671698",
				"pubts": "2024-04-25 19:03:08",
				"promotionId": "1982926168121671681",
				"productCode": "523855",
				"productId": "1982672739297656845",
				"productName": "小水浒",
				"skuId": "1976987774537433095",
				"skuCode": "523845",
				"skuName": "金角测试组织商城测试",
				"productClassId": "1913817747754057735",
				"productClassName": "ghk商品分类",
				"productClassCode": "1242",
				"productBrandId": "1826974917778735107",
				"productBrandCode": "000001",
				"productBrandName": "佳农",
				"productGroupId": "1985856916362362889",
				"productGroupCode": "code001",
				"productGroupName": "商品组01",
				"productTagId": "1869294939944779785",
				"productTagName": "热销商品图片",
				"maxPreferentialQuantity": 11,
				"customerPreferentialQuantity": 111,
				"maxPreferentialAmount": "100",
				"customerPreferentialAmount": "200"
			}
		],
		"promotionProductRuleInfos": [
			{
				"id": "1982926168121671682",
				"pubts": "2024-04-25 19:03:08",
				"promotionId": "1982926168121671681",
				"productId": "1982672739297656845",
				"productCode": "523855",
				"productName": "小水浒",
				"promotionProductRuleCharacter": "",
				"skuId": "1976987774537433095",
				"skuCode": "523845",
				"skuName": "金角测试组织商城测试",
				"productClassId": "1913817747754057735",
				"productClassName": "ghk商品分类",
				"productClassCode": "1242",
				"productBrandId": "1826974917778735107",
				"productBrandCode": "000001",
				"productBrandName": "佳农",
				"productGroupId": "1985856916362362889",
				"productGroupCode": "code001",
				"productGroupName": "商品组01",
				"productTagId": "1869294939944779785",
				"productTagName": "热销商品图片",
				"ladder": 1,
				"unitPriceReduction": "20",
				"unitPriceFixed": "20",
				"unitPriceDiscount": "20",
				"discount": "80",
				"gGroupNumber": 11,
				"isOriginal": 0,
				"gProductId": "1976987765947498497",
				"gProductCode": "523845",
				"gProductName": "金角测试组织商城测试",
				"gSkuId": "1976987774537433095",
				"gSkuName": "金角测试组织商城测试",
				"gSkuCode": "523845",
				"gProductClassId": "1913817747754057735",
				"gProductClassName": "ghk商品分类",
				"gProductClassCode": "1242",
				"gProductBrandId": "1826974917778735107",
				"gProductBrandCode": "000001",
				"gProductBrandName": "佳农",
				"gProductGroupId": "1985856916362362889",
				"gProductGroupName": "商品组01",
				"gProductGroupCode": "code001",
				"gTagId": "1869294939944779785",
				"gTagName": "热销商品图片",
				"isAll": 0,
				"gDefaultProductId": "1976987765947498497",
				"gDefaultProductCode": "523845",
				"gDefaultProductName": "金角测试组织商城测试",
				"gDefaultSkuId": "1976987774537433095",
				"gDefaultSkuName": "金角测试组织商城测试",
				"gDefaultSkuCode": "523845",
				"gQuantity": 100,
				"gUnitId": "1993015716219453447",
				"gUnitName": "箱",
				"gUnitPrecision": "0",
				"gAmount": "200",
				"gQuantityLimit": "100",
				"gCustomerQuantityLimit": "200",
				"ladderPriority": "22",
				"ladderRuleDesc": "test描述",
				"promotionRuleConditionInfos": [
					{
						"id": "1982926168121671683",
						"pubts": "2024-04-25 19:03:08",
						"promotionId": "1982926168121671681",
						"promotionRuleId": "1982926168121671682",
						"productId": "1976987765947498497",
						"productName": "金角测试组织商城测试",
						"productCode": "523845",
						"skuId": "1976987774537433095",
						"skuName": "金角测试组织商城测试",
						"skuCode": "523845",
						"productClassId": "1913817747754057735",
						"productClassName": "ghk商品分类",
						"productClassCode": "1242",
						"productBrandId": "1826974917778735107",
						"productBrandName": "000001",
						"productBrandCode": "佳农",
						"productTagId": "1869294939944779785",
						"productTagName": "热销商品图片",
						"productGroupId": "1985856916362362889",
						"productGroupName": "商品组01",
						"productGroupCode": "code001",
						"isWholeOrder": 0,
						"quantity": "100",
						"amount": 300,
						"productVarieties": 200,
						"skuVarieties": 900,
						"ruleConditionDesc": "test描述"
					}
				]
			}
		],
		"promotionOrgSettingsInfos": [
			{
				"id": "1982926168121671700",
				"promotionId": "1982926168121671681",
				"saleOrgId": "1686482740771291145",
				"saleOrgName": "营销费用",
				"subOrgVisible": 1,
				"subChannelVisible": 1,
				"includeSubChannel": 0,
				"includeSubOrg": 0
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
999	业务校验异常码	业务校验异常码
message	业务校验具体信息	业务校验具体信息

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

