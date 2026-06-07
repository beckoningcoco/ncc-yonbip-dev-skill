---
title: "商品优惠详情查询"
apiId: "1993056458375168000"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Product Discount"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Discount]
platform_version: "BIP"
source_type: community-api-docs
---

# 商品优惠详情查询

>  请求方式	GET | Product Discount (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/promotionNew/getPromotionDetail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	number
小数位数:0,最大长度:19	query	否	促销政策id(id,code必传其一，如果同时传递以id为准)    示例: 1994537285802000388
code	string	query	否	政策编码(id,code必传其一，如果同时传递以id为准)    示例: SPYH2024051100000028

## 3. 请求示例

Url: /yonbip/sd/promotionNew/getPromotionDetail?access_token=访问令牌&id=1994537285802000388&code=SPYH2024051100000028

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
小数位数:0,最大长度:10	否	状态码调用成功返回200 示例：200
message	string	否	调用成功时的消息 示例：操作成功
data	object	否	调用成功时返回的数据
id	string	否	id 示例：1982926168121671681
saleOrgId	string	否	创建组织ID 示例：1686482740771291145
saleOrgName	string	否	创建组织 示例：营销费用
transTypeId	string	否	交易类型ID 示例：1971765343406784522
transTypeName	string	否	交易类型 示例：test审批流
transTypeExtendJson	string	否	交易类型扩展参数 示例：{\"isApplicableMerchants\":\"false\"}
name	object	否	政策名称
code	string	否	政策编码 示例：SPYH2024042500000022
departmentId	string	否	部门ID 示例：1811523429314592778
departmentName	string	否	部门 示例：费用分部
displayName	object	否	商城显示名称
policyStartDate	date
格式:yyyy-MM-dd HH:mm:ss	否	政策开始时间 示例：2024-04-25 00:00:00
policyEndDate	date
格式:yyyy-MM-dd HH:mm:ss	否	政策结束时间 示例：2024-04-25 23:59:59
currencyId	string	否	币种ID 示例：1680626484125368348
priceDigit	number
小数位数:0,最大长度:2	否	单价精度 示例：5
moneyRount	number
小数位数:0,最大长度:2	否	金额舍入规则:{0:全部进位;1:全部舍位;4:四舍五入} 示例：0
moneyDigit	number
小数位数:0,最大长度:2	否	金额精度 示例：2
currencyName	string	否	币种 示例：人民币
currencyCode	string	否	币种编码 示例：CNY
priceRount	number
小数位数:0,最大长度:2	否	单价舍入规则:{0: 全部进位;1:全部舍位;4: 四舍五入} 示例：4
currTypeSign	string	否	币种标识符号 示例：¥
feeItemId	string	否	费用项目ID 示例：1899019300484677633
feeItemName	string	否	费用项目 示例：test0103
displayPriority	number
小数位数:0,最大长度:4	否	商城显示优先级 示例：123
displayWay	number
小数位数:0,最大长度:1	否	商城显示方式:{1:按活动商品海报展示;2:促销政策显示一张海报} 示例：1
persistentType	number
小数位数:0,最大长度:1	否	持续类型:{{1:期间内持续生效;2:期间内间歇生效}} 示例：1
cycleStartType	number
小数位数:0,最大长度:2	否	周期开始日期:{1:本月} 示例：1
cycleStartDay	number
小数位数:0,最大长度:2	否	周期开始日期:{自然日，1-31} 示例：1
cycleStartTime	date
格式:HH:mm:ss	否	周期开始时间 示例：00:00:01
cycleEndType	number
小数位数:0,最大长度:2	否	周期结束日期:{1:本月;2:次月} 示例：1
cycleEndDay	number
小数位数:0,最大长度:2	否	周期结束日期:{自然日，1-31} 示例：31
cycleEndTime	date
格式:HH:mm:ss	否	周期结束时间 示例：02:02:02
pcPoster	string	否	促销海报PC 示例：433b8f64-ecd3-4281-bfb2-ca3e8d253229
mobilePoster	string	否	促销海报移动 示例：57529790-5f7b-4ac4-8e04-063a74da81b8
ladderType	number
小数位数:0,最大长度:1	否	梯度类型:{1:满件;2:满额} 示例：1
preferentialProductType	string	否	优惠商品类型:{FREE_CT:商品自由项特征;PRODUCT:商品;PRODUCT_BRAND:品牌;PRODUCT_CLASS:商品分类;PRODUCT_GROUP:商品组;PRODUCT_TAG:标签;SKU:SKU} 示例：PRODUCT
preferentialMatchType	number
小数位数:0,最大长度:2	否	优惠匹配方式: {1:单品;2:合计} 示例：1
preConditionProductScope	string	否	优惠规则条件设置方式:{ALL:整单;BRAND:品牌;PRODUCT:商品;PRODUCTCLASS:商品分类;PRODUCTGROUP:商品组;PRODUCTTAG:标签商品;SKU:SKU} 示例：PRODUCT,SKU,PRODUCTCLASS,BRAND,PRODUCTTAG,ALL
preConditionControlDimen	string	否	优惠规则条件控制维度:{1:数量;2:金额;3:商品种类数} 示例：2,1,3
preferentialType	number
小数位数:0,最大长度:1	否	优惠类型:{1:打折;2:减价;3:买赠;4:一口价} 示例：3
priceFixedType	number
小数位数:0,最大长度:1	否	一口价类型:{1单价一口价；2:合计一口价} 示例：1
giveawayCalRule	number
小数位数:0,最大长度:1	否	赠品计算规则:{1:赠指定数量赠品;2:赠指定金额赠品} 示例：1
giveawayType	string	否	赠品维度:{ALL:全场任选;BRAND:赠品牌;GIVEAWAY_GROUP:赠品商品组;ORIGINAL:赠原品;PRODUCT:赠指定商品;PRODUCT_CLASS:赠商品分类;PRODUCT_SKU:赠指定SKU;PRODUCT_TAG:赠标签商品} 示例：ORIGINAL,PRODUCT,PRODUCT_SKU,PRODUCT_CLASS,BRAND,PRODUCT_TAG,ALL
giveawayUnit	string	否	赠品指定单位:{1:赠品指定单位} 示例：1
originalGiveawayRule	number
小数位数:0,最大长度:1	否	原品赠品计算规则:{1:平均分摊;2:价格属低} 示例：1
ladderMatchWay	number
小数位数:0,最大长度:1	否	梯度匹配方式:{1:多梯度递减匹配;2:仅匹配最大梯度} 示例：1
excessCalWay	number
小数位数:0,最大长度:1	否	超出部分计算方式:{1:忽略超出且未达到下一梯度的值;2:满足梯度后按比例赠送} 示例：1
giveawayRoundType	number
小数位数:0,最大长度:1	否	赠品数量取整方式:{1:按单位精度;2:向下取整;3:向上取整;4:四舍五入} 示例：1
giveawaySelection	number
小数位数:0,最大长度:1	否	梯度间赠品可选:{1:不可选，多梯度由高到低自动匹配;2:可自由选择适合自己的梯度} 示例：1
giveawayAmountProcess	number
小数位数:0,最大长度:1	否	赠品金额处理:{1:赠品优惠仅由活动商品承担;2:赠品优惠由活动商品+赠品共同承担;3:赠品优惠仅由赠品承担(赠品金额为0)} 示例：1
giveawayRule	number
小数位数:0,最大长度:1	否	买赠规则:{1:每满X赠Y;2:满X赠Y} 示例：1
isGiveawayLimit	number
小数位数:0,最大长度:1	否	赠品限量:{0:停用;1:启用} 示例：0
customerScopeType	string	否	适用客户类型:{0:全部客户;1:客户;2:销售区域;3:客户分类;4:客户级别;5:销售渠道;6:包含排除客户} 示例：2,3,4,5
matchPriority	number
小数位数:0,最大长度:4	否	匹配优先级 示例：321
isContainedSpecialMatch	number
小数位数:0,最大长度:1	否	包含特殊匹配维度:{0:否;1:是} 示例：1
specialMatchType	string	否	匹配维度类型:{20:发运方式;21:结算方式;22:支付方式;23:发票类型;24:交易类型;25:专区;26:来款政策} 示例：21,22,20,23,24
isContainedOrderCharacter	number
小数位数:0,最大长度:1	否	包含订单特征:{0:否;1:是} 示例：0
isCustomerOrderLimit	number
小数位数:0,最大长度:1	否	每客户订单限量:{0:停用;1:启用} 示例：1
customerOrderLimitCount	number
小数位数:0,最大长度:4	否	每客户订单数限量 示例：111
isPreferentialProductLimit	number
小数位数:0,最大长度:1	否	活动商品优惠限量:{0:停用;1:启用} 示例：1
preferentialProductLimitType	number
小数位数:0,最大长度:1	否	活动商品限量类型:{1:活动商品总优惠计价数量;2:活动商品总优惠金额} 示例：1
isGeneratedSubPromotion	boolean	否	是否生成过下级促销 示例：false
isPlatform	boolean	否	是否平台促销 示例：true
canWithDraw	number
小数位数:0,最大长度:1	否	canWithDraw 示例：1
isCanEdit	boolean	否	下发不可改不可编辑 示例：true
vouchdate	date
格式:yyyy-MM-dd HH:mm:ss	否	单据日期 示例：2024-04-25 00:00:00
creatorId	string	否	创建人ID 示例：1686483900406693892
creator	string	否	创建人 示例：昵称-录用测试
createDate	date
格式:yyyy-MM-dd HH:mm:ss	否	创建日期 示例：2024-04-25 00:00:00
createTime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间 示例：2024-04-25 19:03:08
modifierId	string	否	修改人id 示例：1686483900406693892
modifier	string	否	修改人 示例：昵称-录用测试
modifyDate	date
格式:yyyy-MM-dd HH:mm:ss	否	修改时间 示例：2024-04-10
modifyTime	date
格式:yyyy-MM-dd HH:mm:ss	否	修改日期 示例：2024-04-12 15:54:33
auditorId	string	否	审批人ID 示例：1961858219666046976
auditor	string	否	审批人 示例：昵称-录用测试
auditTime	date
格式:yyyy-MM-dd HH:mm:ss	否	审批时间 示例：2024-05-06 11:29:09
isWfControlled	number
小数位数:0,最大长度:1	否	是否审批流控制:{0:否;1:是} 示例：1
returncount	string	否	退回次数 示例：2
verifystate	number
小数位数:0,最大长度:1	否	审批状态 示例：0
status	number
小数位数:0,最大长度:1	否	单据状态:{0:开立;1:审核通过;2:已关闭;3:审核中;5:已驳回} 示例：0
stopstatus	boolean	否	启用状态:{false:启用;true:停用} 示例：true
masterOrgKeyField	string	否	主组织标识字段,框架用 示例：saleOrgId
transTypeKeyField	string	否	交易类型标识字段 示例：transTypeId
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳 示例：2024-04-25 19:03:08
promotionCustomerScopeInfos	object	是	适用客户
promotionMatchDimensionInfos	object	是	订单匹配
promotionProductLimitInfos	object	是	促销限量
promotionProductRuleInfos	object	是	优惠规则
promotionOrgSettingsInfos	object	是	适用组织

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
		"transTypeExtendJson": "{\\\"isApplicableMerchants\\\":\\\"false\\\"}",
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
		"currTypeSign": "¥",
		"feeItemId": "1899019300484677633",
		"feeItemName": "test0103",
		"displayPriority": 123,
		"displayWay": 1,
		"persistentType": 1,
		"cycleStartType": 1,
		"cycleStartDay": 1,
		"cycleStartTime": "00:00:01",
		"cycleEndType": 1,
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
		"priceFixedType": 1,
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
		"isCustomerOrderLimit": 1,
		"customerOrderLimitCount": 111,
		"isPreferentialProductLimit": 1,
		"preferentialProductLimitType": 1,
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
		"masterOrgKeyField": "saleOrgId",
		"transTypeKeyField": "transTypeId",
		"pubts": "2024-04-25 19:03:08",
		"promotionCustomerScopeInfos": [
			{
				"id": "1982926168121671688",
				"pubts": "2024-04-25 19:03:08",
				"promotionId": "1982926168121671681",
				"customerAreaId": "1869117480486043653",
				"customerAreaCode": "1111111",
				"customerAreaName": "华北大区",
				"customerClassIdName": "上级分类",
				"customerClassId": "1826184832758054921",
				"customerLevelName": "111",
				"customerLevelId": "1889297813816737798",
				"customerChannelId": "1904738676496138244",
				"customerChannelName": "新渠道",
				"customerName": "客户1",
				"customerId": "1973039763304742917",
				"customerCode": "cxkh"
			}
		],
		"promotionMatchDimensionInfos": [
			{
				"id": "1982926168121671696",
				"pubts": "2024-04-25 19:03:08",
				"promotionId": "1982926168121671681",
				"sendTransWayId": "1680627162734919742",
				"sendTransWayName": "公路运输-集装箱",
				"settlementId": "1680627162734919738",
				"settlementName": "票据结算",
				"paymentMethod": "DELIVERYBYITEM",
				"invoiceTypeName": "增值税普通发票（卷票-成品油）",
				"invoiceTypeId": "9",
				"transTypeId": "1918104022011084801",
				"orderTransTypeName": "新增交易类型给商家-发布",
				"matchDimensionCharacter": "",
				"zoneName": "爆品专区",
				"zoneId": "1971964080139796484",
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
				"ladderRuleDesc": {
					"zh_CN": "优惠规则描述",
					"zh_TW": "優惠規則描述",
					"en_US": "Discount Rule Description"
				},
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
	1	2025-06-25	
新增
返回参数 (12)
更新
返回参数 (23)
新增
错误码 message
更新
错误码 999

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

