---
title: "终端网点保存"
apiId: "3fae21cd54f84562b7c1afef047290b6"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Terminal Outlets"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Terminal Outlets]
platform_version: "BIP"
source_type: community-api-docs
---

# 终端网点保存

>  请求方式	POST | Terminal Outlets (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/uretail/store/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	数据节点
org	string	否	是	销售组织ID或编码 示例：2728431692337408
codebianma	string	否	是	终端编码 示例：ZYD01
name	object	否	是	终端名称
mnemonic	string	否	否	助记码 示例：ZYD01
terminalType	string	否	是	终端类型(1零售门店2自建商城3电商平台4营销网点，多个逗号分隔) 示例：1,3 默认值：1
storeType	string	否	是	门店类型(1直营店2直营专柜3加盟店) 示例：1 默认值：1
platformType	string	否	否	线上渠道(1淘宝2京东3苏宁4自建商城5亚马逊6小红书7有赞8 1688 9拼多多10工行融E购11淘宝供销平台12门店) 示例：12 默认值：12
code	string	否	是	终端代码 示例：0023
terminalCategory	string	否	否	终端分类ID或编码 示例：1477340227421863938
dept	string	否	否	部门ID或编码 示例：2728432395079936
contact	string	否	否	联系人姓名 示例：张三
contactPhone	string	否	否	联系电话 示例：16101440911
centralWarehouseDistribution	string	否	否	是否中心仓配送(1是0否) 示例：0 默认值：0
channelCustomer	string	否	否	是否渠道客户(1是0否) 示例：0 默认值：0
merchantStore	long	否	否	是否商家门店(1是0否) 示例：0 默认值：0
cust	string	否	是	客户ID或编码 示例：2728468940313602
areaClass	string	否	否	销售区域ID或编码 示例：1434926488931008512
regionCode	string	否	否	行政区划ID或编码 示例：110101000000
province	string	否	否	行政区划省 示例：北京市
city	string	否	否	行政区划市 示例：市辖区
area	string	否	否	行政区划区 示例：东城区
deliveryMethod	string	否	否	配送范围(circle按半径配送polygon按电子围栏配送) 示例：circle 默认值：circle
kmradius	string	否	否	配送半径 (千米) 示例：5
circleRadius	long	否	否	配送半径(米) 示例：5000
storeArea	long	否	否	营业面积 示例：100
startTime	string	否	否	营业开始时间 示例：10:00:00
warehouses	object	是	否	门店仓库设置，终端类型为零售门店为必填，其他非必填
welcome	object	否	否	扫码欢迎词
iQRCode	object	否	否	扫码设置
desc	string	否	否	简介 示例：总公司直营店
endTime	string	否	否	营业截止时间 示例：21:00:00
stop	string	否	否	是否停用(1是0否) 示例：0 默认值：0
productsOfStore	string	否	否	经营范围ID或编码 示例：1477342263209623557
maxNumLicence	long	否	否	最大许可数 示例：100 默认值：100
iOnlineDelivery	string	否	否	线上订单发货(1是0否) 示例：1 默认值：1
shoppingMall	object	否	是	商城业务设置
electronicCommerce	object	是	否	电商业务设置
operatorStore	object	是	否	店员设置
AdjacentStores	object	是	否	周边门店设置
paymentMethodStore	object	是	否	收款方式设置
_status	string	否	是	新增状态 示例：Insert 默认值：Insert
latestFollowUpTime	string	否	否	最近跟进时间 示例：2022-06-14 02:13:58

## 3. 请求示例

Url: /yonbip/sd/uretail/store/save?access_token=访问令牌
Body: {
	"data": [
		{
			"org": "2728431692337408",
			"codebianma": "ZYD01",
			"name": {
				"zh_CN": "直营店01",
				"en_US": "",
				"zh_TW": ""
			},
			"mnemonic": "ZYD01",
			"terminalType": "1,3",
			"storeType": "1",
			"platformType": "12",
			"code": "0023",
			"terminalCategory": "1477340227421863938",
			"dept": "2728432395079936",
			"contact": "张三",
			"contactPhone": "16101440911",
			"centralWarehouseDistribution": "0",
			"channelCustomer": "0",
			"merchantStore": 0,
			"cust": "2728468940313602",
			"areaClass": "1434926488931008512",
			"regionCode": "110101000000",
			"province": "北京市",
			"city": "市辖区",
			"area": "东城区",
			"deliveryMethod": "circle",
			"kmradius": "5",
			"circleRadius": 5000,
			"storeArea": 100,
			"startTime": "10:00:00",
			"warehouses": [
				{
					"isDefault": "1",
					"isDefaultMaterial": "0",
					"isDefaultRequire": "0",
					"warehouse": "1435825674688921600",
					"priorityLevel": "",
					"_status": "Insert"
				}
			],
			"welcome": {
				"zh_CN": "欢迎",
				"en_US": "",
				"zh_TW": ""
			},
			"iQRCode": {
				"iQRCodeType": "2",
				"_status": "Insert"
			},
			"desc": "总公司直营店",
			"endTime": "21:00:00",
			"stop": "0",
			"productsOfStore": "1477342263209623557",
			"maxNumLicence": 100,
			"iOnlineDelivery": "1",
			"shoppingMall": {
				"iStart": "1",
				"iDeleted": "0",
				"isHeadQuarters": "FALSE",
				"iHotSpot": "0",
				"name": "111",
				"referenceRetailPrice": "0",
				"cInventoryType": "0",
				"deliveryMethod": "",
				"cPaytypeCodes": "weixin",
				"deliveryType": "0",
				"iDistributionMode": "2",
				"fDistributionRadius": 0,
				"latitude": "11",
				"longitude": "22",
				"_status": "Insert"
			},
			"electronicCommerce": [
				{
					"platType": "12",
					"invoiceType": "EnterpriseDeliver",
					"isAutoAccessOrder": "false",
					"autoMergerDelivery": "true",
					"autoMatchWarehouse": "true",
					"autoMatchLogistics": "true",
					"autoMatchWarehouseByInv": "false",
					"autoMatchExpressByWeight": "false",
					"isModifyAdress": "false",
					"isSplitRefund": 0,
					"autoMatchRefund": "false",
					"taxPayer": "0",
					"isAgRefund": "false",
					"isModifySku": "false",
					"isProviderShop": "false",
					"autoDeliveryWarning": "true",
					"shopName": "直营店01",
					"shopCode": "ZYD01",
					"accordingTo": "1",
					"storevalue_transtype": "1153091135960156",
					"trade_transtype": "1417998485159936431",
					"refund_transtype": "1417998485159936432",
					"returnWarehouse": 2721870765069056,
					"ys_salesman": "2778278007279875",
					"memo": "电商备注",
					"ys_currency": "G001ZM0000DEFAULTCURRENCT00000000004",
					"_status": "Insert"
				}
			],
			"operatorStore": [
				{
					"operatorId": "2728766659973382",
					"_status": "Insert"
				}
			],
			"AdjacentStores": [
				{
					"adjacentStoreGroup": 2749552122056960,
					"_status": "Insert"
				}
			],
			"paymentMethodStore": [
				{
					"paymentMethodId": 2698984030049541,
					"_status": "Insert"
				}
			],
			"_status": "Insert",
			"latestFollowUpTime": "2022-06-14 02:13:58"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	返回数据
count	long	否	总数量 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
messages	string	是	失败消息
infos	object	是	信息集合
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
				"orgPath": "2728431692337408|",
				"codeType": "T",
				"channelCustomer": 0,
				"platformType": "12",
				"operatorStore": [
					{
						"operatorId": "2728766659973382",
						"_status": "Insert",
						"pubts": "2022-06-21 16:58:37",
						"iStoreId": 1482639169068990500,
						"_entityName": "rm.operator.OperatorStore",
						"_keyName": "id",
						"id": 1482639177658925000
					}
				],
				"maxNumLicence": 100,
				"province": "北京市",
				"contact": "张三",
				"mnemonic": "ZYD01_2",
				"areaClass": 1434926488931008500,
				"terminalCategory": 1434935688931001200,
				"id": 1482639169068990500,
				"merchantStore": 0,
				"welcome": {
					"zh_CN": "欢迎"
				},
				"iQRCode": {
					"cAppID": "yl_e7sj2AmCxMYU",
					"cChannelCode": "aaa",
					"cChannelScope": "store",
					"iQRCodeType": 2,
					"iBizId": 1482639169068990500,
					"iChannelType": 2,
					"yTenantId": "0000L17HCIE402J7R50000",
					"cChannelName": "直营店01_2",
					"id": 1482639169068990500,
					"pubts": "2022-06-21 16:58:37",
					"tenant": 2704617327825392
				},
				"tenant": 2704617327825392,
				"area": "东城区",
				"productsOfStore": 1477342263209623600,
				"warehouse": 1435825674688921600,
				"yTenantId": "0000L17HCIE402J7R50000",
				"terminalType": "1,3",
				"stop": 0,
				"name": "直营店01_2",
				"electronicCommerce": [
					{
						"autoMatchExpressByWeight": false,
						"memo": "电商备注",
						"isModifySku": false,
						"invoiceType": "EnterpriseDeliver",
						"id": 1482639169068990500,
						"tenant": 2704617327825392,
						"autoMatchRefund": false,
						"isSplitRefund": false,
						"autoMatchWarehouse": true,
						"storevalue_transtype": "1417998485159936431",
						"refund_transtype": "1417998485159936432",
						"yTenantId": "0000L17HCIE402J7R50000",
						"autoDeliveryWarning": true,
						"ys_department": "2728432395079936",
						"isAutoAccessOrder": false,
						"platType": 12,
						"ys_salesman": "2778278007279875",
						"trade_transtype": "1417998485159936431",
						"isModifyAdress": false,
						"shopName": "直营店01_2",
						"autoMatchLogistics": true,
						"isAgRefund": false,
						"ys_currency": "G001ZM0000DEFAULTCURRENCT00000000004",
						"autoMergerDelivery": true,
						"autoMatchWarehouseByInv": false,
						"pubts": "2022-06-21 16:58:37",
						"stopstatus": false,
						"isDouYinModifyAdress": false,
						"shopCode": "ZYD01_2",
						"org": "2728431692337408",
						"store": 1482639169068990500,
						"isProviderShop": false,
						"accordingTo": "1",
						"taxPayer": "0",
						"trade_receivable_transtype": "1417998485159936431",
						"returnWarehouse": 2721870765069056,
						"ys_customer": 2728468940313602
					}
				],
				"desc": "总公司直营店",
				"paymentMethodStore": [
					{
						"paymentMethodId": 2698984030049541,
						"_status": "Insert",
						"pubts": "2022-06-21 16:58:37",
						"store": 1482639169068990500,
						"_entityName": "aa.paymentmethod.PaymentMethodStore",
						"_keyName": "id",
						"id": 1482639177658925000
					}
				],
				"code": "0024",
				"city": "市辖区",
				"deliveryMethod": "circle",
				"kmradius": 5,
				"creatorId": 2704617329622016,
				"iOnlineDelivery": 1,
				"regionCode": "110101000000",
				"centralWarehouseDistribution": 0,
				"startTime": "10:00:00",
				"AdjacentStores": [
					{
						"adjacentStoreGroup": 2749552122056960,
						"_status": "Insert",
						"pubts": "2022-06-21 16:58:37",
						"store": 1482639169068990500,
						"id": 1482639177658925000
					}
				],
				"storeArea": 100,
				"createDate": "2022-06-21 16:58:37",
				"cAppID": "yl_e7sj2AmCxMYU",
				"storeType": 1,
				"org": "2728431692337408",
				"warehouses": [
					{
						"isDefaultRequire": 1,
						"store": 1482639169068990500,
						"warehouse": 1435825674688921600,
						"yTenantId": "0000L17HCIE402J7R50000",
						"isDefaultMaterial": 1,
						"isDefault": 1,
						"id": 1482639169068990500,
						"pubts": "2022-06-21 16:58:37",
						"tenant": 2704617327825392
					}
				],
				"shoppingMall": {
					"deliveryMethod": "circle",
					"latitude": 11,
					"deliveryType": "0",
					"cInventoryType": 0,
					"store": 1482639169068990500,
					"iStart": true,
					"iDeleted": false,
					"fDistributionRadius": 7,
					"referenceRetailPrice": 0,
					"cPaytypeCodes": "weixin",
					"iHotSpot": 0,
					"name": "111",
					"iDistributionMode": 2,
					"id": 1482639169068990500,
					"isHeadQuarters": false,
					"longitude": 22
				},
				"dept": "2728432395079936",
				"latestFollowUpTime": "2022-06-14 02:13:58",
				"circleRadius": 5000,
				"createTime": "2022-06-21 16:58:37",
				"codebianma": "ZYD01_2",
				"endTime": "21:00:00",
				"contactPhone": "16101440911",
				"cust": 2728468940313602
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
999	错误信息	请联系管理员

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

