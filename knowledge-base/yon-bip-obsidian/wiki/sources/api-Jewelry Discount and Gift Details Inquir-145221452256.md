---
title: "珠宝满减满赠详情查询"
apiId: "1452214522560380928"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Product Promotion"
domain: "RetailServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Promotion]
platform_version: "BIP"
source_type: community-api-docs
---

# 珠宝满减满赠详情查询

>  请求方式	GET | Product Promotion (RetailServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/promotion/jewelrygiftpromotion/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	促销活动id    示例: 1

## 3. 请求示例

Url: /yonbip/sd/promotion/jewelrygiftpromotion/detail?access_token=访问令牌&id=1

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
code	long	否	操作状态码 示例：200
message	string	否	操作信息 示例：操作成功
data	object	是	返回对象信息
pValid	int	否	启用状态 0代表未启用 1代表启用 示例：1
cEndTime	DateTime	否	结束日期 示例：2022-05-08 11:46:04
isDelete	int	否	是否逻辑删除 0代表未删除 1代表删除 示例：0
applyOffLineChannel	int	否	适用线下门店 0不适用 1适用 示例：1
cPromotionName	string	否	活动名称 示例：促销活动1
applyOnlineChannel	int	否	适用线上商城 0不适用 1适用 示例：0
iMemberLevelAll	int	否	会员等级 1 全部买家 2 全部会员 0 指定会员 示例：1
iPromotionalType	int	否	活动规则0：按克促销 1：按件计量 示例：1
cStartTime	DateTime	否	开始日期 示例：2022-04-29 11:46:12
mallcorp	long	否	租户id 示例：32132313124
offLineStore	int	否	线下门店 1 全部门店 2 指定适用门店 3 指定不适用门店 示例：2
id	long	否	满减促销活动id 示例：12
pubts	DateTime	否	活动更新时间 示例：2022-04-29 11:47:22
jewelryGiftProduct	object	是	商品子表
jewelryGiftPromotionStore	object	是	关联门店
jewelryGiftPromotionItem	object	是	活动梯次
jewelryProductTag	object	是	促销活动标签项
jewelryGiftPromotionMemberLevel	object	是	珠宝满赠会员级别子表（选择会员级别时返回）
iActiveiDimension	int	否	促销维度(部分商品时用) 1：商品分类 2：款式（商品） 3：单品（sku） 4:标签 示例：3
iActivityRange	int	否	商品范围（0：全部商品 1：部分商品） 示例：1
isTakeInShare	int	否	赠品参与分摊 0代表不参与 1代表参与 示例：0
isShare	int	否	赠品优惠分摊规则(0 不分摊. 1 加权平均分摊) 示例：1
jeweActiveProductClass	object	是	商品分类子表（选择商品分类时返回）

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"pValid": 1,
			"cEndTime": "2022-05-08 11:46:04",
			"isDelete": 0,
			"applyOffLineChannel": 1,
			"cPromotionName": "促销活动1",
			"applyOnlineChannel": 0,
			"iMemberLevelAll": 1,
			"iPromotionalType": 1,
			"cStartTime": "2022-04-29 11:46:12",
			"mallcorp": 32132313124,
			"offLineStore": 2,
			"id": 12,
			"pubts": "2022-04-29 11:47:22",
			"jewelryGiftProduct": [
				{
					"imageUrl": "https://ys-yxy-testres.yonyoucloud.com/1f446f07-ac7b-4df8-8fc9-2880d7d04ef4.jpg",
					"lProductId": 11,
					"mallcorp": 111,
					"cName": "樱桃",
					"jewelryGiftPromotion": 1,
					"id": 1,
					"pubts": "2022-04-29 11:47:22",
					"fmarketPrice": 1.1
				}
			],
			"jewelryGiftPromotionStore": [
				{
					"mallcorp": 1,
					"iStoreId": 1,
					"jewelryGiftPromotion": 1,
					"storeName": "海淀门店",
					"id": 1,
					"pubts": "2022-04-29 11:47:22"
				}
			],
			"jewelryGiftPromotionItem": [
				{
					"discountNum": 0.01,
					"consumerPrice": 33,
					"isCapping": 0,
					"jewelryGiftPromotion": 1111,
					"addprice": 0.01,
					"iDeleted": 0,
					"pointstype": 1,
					"cGiftNums": "1,2",
					"fireNum": 1,
					"consumerSpending": 4,
					"itemtype": 1,
					"mallcorp": 11,
					"id": 11,
					"pubts": "2022-04-29 11:47:22",
					"discountRatio": 99.9,
					"givenum": 1.11
				}
			],
			"jewelryProductTag": [
				{
					"cTagName": "商品标签A",
					"iDeleted": 0,
					"iTagId": 111,
					"id": 11,
					"jewelryGiftPromotion": 11,
					"mallcorp": 1,
					"pubts": "2022-04-29 11:47:22"
				}
			],
			"jewelryGiftPromotionMemberLevel": [
				{
					"id": 1,
					"jewelryGiftPromotion": 1,
					"lMemberLeverId": 1,
					"levelName": "黄金会员",
					"mallcorp": 1,
					"pubts": "2022-04-29 11:47:22"
				}
			],
			"iActiveiDimension": 3,
			"iActivityRange": 1,
			"isTakeInShare": 0,
			"isShare": 1,
			"jeweActiveProductClass": [
				{
					"jewelryGiftPromotion": 1,
					"mallcorp": 1,
					"cName": "蔬菜类",
					"iclassId": 1,
					"id": 1,
					"pubts": "2022-04-29 11:47:22",
					"iDeleted": 0
				}
			]
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	失败原因	

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

