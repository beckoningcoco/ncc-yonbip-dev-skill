---
title: "营销网点保存"
apiId: "1549254446852079623"
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

# 营销网点保存

>  请求方式	POST | Terminal Outlets (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/terminal/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	数据节点
id	string	否	否	终端ID(更新时需传，新增不用传)
org	string	否	是	销售组织ID或编码 示例：2728431692337408
codebianma	string	否	是	终端编码 示例：ZYD01
name	object	否	是	终端名称
mnemonic	string	否	否	助记码 示例：ZYD01
terminalType	string	否	是	终端类型(1零售门店2自建商城3电商平台4营销网点，多个逗号分隔) 示例：4 默认值：4
code	string	否	否	终端代码 示例：0023
terminalCategory	string	否	否	终端分类ID或编码 示例：1477340227421863938
chainSystem	string	否	否	连锁系统ID或编码 示例：1550130577280598016
dept	string	否	否	部门ID或编码 示例：2728432395079936
contact	string	否	否	联系人姓名 示例：张三
contactPhone	string	否	否	联系电话 示例：16101440911
centralWarehouseDistribution	string	否	否	是否中心仓配送(1是0否) 示例：0 默认值：0
channelCustomer	string	否	否	是否渠道客户(1是0否) 示例：0 默认值：0
supplier	string	否	否	供货商家ID或编码（渠道客户为是时，该字段和渠道客户分类字段任填一个） 示例：2649215529472768
customerName	object	否	否	客户名称（渠道客户为是时，才需要填该字段）
channelCustomerClass	string	否	否	渠道客户分类ID或编码（渠道客户为是时，该字段和供货商家字段任填一个） 示例：1478909934766129157
merchantStore	long	否	否	是否商家门店(1是0否) 示例：0 默认值：0
cust	string	否	否	客户ID或编码 示例：2728468940313602
socialCreditCode	string	否	否	统一社会信用代码 示例：91110000600001760P
areaClass	string	否	否	销售区域ID或编码 示例：1434926488931008512
regionCode	string	否	否	行政区划ID或编码 示例：110101000000
address	string	否	否	详细地址 示例：北京市海淀区
province	string	否	否	行政区划省 示例：北京市
city	string	否	否	行政区划市 示例：市辖区
area	string	否	否	行政区划区 示例：东城区
deliveryMethod	string	否	否	配送范围(circle按半径配送polygon按电子围栏配送) 示例：circle 默认值：circle
kmradius	BigDecimal	否	否	配送半径 (千米) 示例：5
circleRadius	BigDecimal	否	否	配送半径(米) 示例：5000
storeArea	BigDecimal	否	否	营业面积 示例：100
startTime	string	否	否	营业开始时间 示例：10:00:00
salesBusinessInfo	object	是	是	销售业务信息
relatedPerson	object	是	否	相关人员
storeLabels	object	是	否	终端标签
welcome	object	否	否	扫码欢迎词
iQRCode	object	否	否	扫码设置
desc	string	否	否	简介 示例：总公司直营店
endTime	string	否	否	营业截止时间 示例：21:00:00
stop	string	否	否	是否停用(1是0否) 示例：0 默认值：0
maxNumLicence	int	否	否	最大许可数 示例：100 默认值：100
iOnlineDelivery	short	否	否	线上订单发货(1是0否) 示例：1 默认值：1
shoppingMall	object	否	是	商城业务设置
_status	string	否	是	状态(新增:Insert,更新:Update) 示例：Insert 默认值：Insert
latestFollowUpTime	string	否	否	最近跟进时间 示例：2022-06-14 02:13:58
storeCustomItem	object	否	否	网点基本信息自定义项(支持60个自定义项)

## 3. 请求示例

Url: /yonbip/crm/terminal/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"org": "2728431692337408",
			"codebianma": "ZYD01",
			"name": {
				"zh_CN": "直营店01",
				"en_US": "",
				"zh_TW": ""
			},
			"mnemonic": "ZYD01",
			"terminalType": "4",
			"code": "0023",
			"terminalCategory": "1477340227421863938",
			"chainSystem": "1550130577280598016",
			"dept": "2728432395079936",
			"contact": "张三",
			"contactPhone": "16101440911",
			"centralWarehouseDistribution": "0",
			"channelCustomer": "0",
			"supplier": "2649215529472768",
			"customerName": {
				"zh_CN": "李四",
				"en_US": "",
				"zh_TW": ""
			},
			"channelCustomerClass": "1478909934766129157",
			"merchantStore": 0,
			"cust": "2728468940313602",
			"socialCreditCode": "91110000600001760P",
			"areaClass": "1434926488931008512",
			"regionCode": "110101000000",
			"address": "北京市海淀区",
			"province": "北京市",
			"city": "市辖区",
			"area": "东城区",
			"deliveryMethod": "circle",
			"kmradius": 5,
			"circleRadius": 5000,
			"storeArea": 100,
			"startTime": "10:00:00",
			"salesBusinessInfo": [
				{
					"id": "",
					"saleOrg": "2728431692337408",
					"saleArea": "1434926488931008512",
					"storeLevel": "2653779996332288",
					"_status": "Insert",
					"salesBusinessInfoDefine": {
						"define1": "",
						"define2": ""
					}
				}
			],
			"relatedPerson": [
				{
					"id": "",
					"saleOrg": "2728431692337408",
					"person": "2612569843536128",
					"ower": false,
					"_status": "Insert"
				}
			],
			"storeLabels": [
				{
					"id": 0,
					"label": 1494312615320485889,
					"labelValueId": "",
					"createTime": "2022-06-14 02:13:58",
					"_status": "Insert"
				}
			],
			"welcome": {
				"zh_CN": "欢迎",
				"en_US": "",
				"zh_TW": ""
			},
			"iQRCode": {
				"id": "",
				"iQRCodeType": "2",
				"_status": "Insert"
			},
			"desc": "总公司直营店",
			"endTime": "21:00:00",
			"stop": "0",
			"maxNumLicence": 100,
			"iOnlineDelivery": 1,
			"shoppingMall": {
				"id": "",
				"iStart": "1",
				"iDeleted": "0",
				"isHeadQuarters": "FALSE",
				"iHotSpot": "0",
				"name": "111",
				"referenceRetailPrice": "0",
				"cInventoryType": "0",
				"deliveryMethod": "",
				"cPaytypeCodes": "weixin",
				"deliveryType": "1",
				"iDistributionMode": "2",
				"fDistributionRadius": 11.1,
				"latitude": "11",
				"longitude": "22",
				"_status": "Insert"
			},
			"_status": "Insert",
			"latestFollowUpTime": "2022-06-14 02:13:58",
			"storeCustomItem": {
				"define1": "",
				"define2": ""
			}
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
messages	object	是	失败消息
infos	object	是	信息集合
storeCustomItem	object	否	网点基本信息自定义项
failInfos	object	是	失败信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"orgPath": "2353294571770113|",
				"codeType": "T",
				"channelCustomer": 0,
				"maxNumLicence": 100,
				"province": "北京市",
				"salesBusinessInfo": [
					{
						"storeLevel": 1549438511977332700,
						"saleArea": 2353515465281792,
						"store": 1549440281503858700,
						"saleOrg": "2353294571770113",
						"id": 1549440281503858700,
						"pubts": "2022-09-19 17:09:50",
						"salesBusinessInfoDefine": {
							"define1": "",
							"define2": ""
						}
					}
				],
				"contact": "张三",
				"mnemonic": "zytest091901",
				"areaClass": 2353515465281792,
				"id": 1549440281503858700,
				"merchantStore": 0,
				"welcome": {
					"zh_CN": "欢迎",
					"en_US": "",
					"zh_TW": ""
				},
				"iQRCode": {
					"cAppID": "yl_2JZWHjhXpivV",
					"iBizId": 1549440281503858700,
					"cChannelName": "zytest091901",
					"id": 1549440281503858700
				},
				"area": "东城区",
				"terminalType": "4",
				"relatedPerson": [
					{
						"ower": true,
						"store": 1549440281503858700,
						"saleOrg": "2353294571770113",
						"person": "1538868752080699400",
						"id": 1549440281503858700,
						"pubts": "2022-09-19 17:09:50"
					}
				],
				"stop": 0,
				"storeLabels": [
					{
						"id": 1550278212486430727,
						"label": 1550145764303831046,
						"labelValueId": "1550145764303831047"
					}
				],
				"name": {
					"zh_CN": "zytest091901",
					"en_US": "",
					"zh_TW": ""
				},
				"customerName": {
					"0": "李",
					"1": "四",
					"zh_CN": "李四",
					"en_US": "",
					"zh_TW": ""
				},
				"supplier": 1550140344041472008,
				"channelCustomerClass": 1513054349409910791,
				"desc": "总公司直营店",
				"code": "0056",
				"city": "市辖区",
				"deliveryMethod": "circle",
				"kmradius": 5,
				"creatorId": 2351873188811008,
				"socialCreditCode": "91110000600001760P",
				"regionCode": "110101000000",
				"address": "北京市海淀区",
				"centralWarehouseDistribution": 0,
				"startTime": "10:00:00",
				"pubts": "2022-09-19 17:09:51",
				"storeArea": 100,
				"createDate": "2022-09-19 17:09:50",
				"cAppID": "yl_2JZWHjhXpivV",
				"creator": "YonSuite默认用户",
				"org": "2353294571770113",
				"shoppingMall": {
					"deliveryMethod": "",
					"latitude": 11,
					"deliveryType": "0",
					"cInventoryType": 0,
					"store": 1549440281503858700,
					"iStart": true,
					"iDeleted": false,
					"cPaytypeCodes": "weixin",
					"referenceRetailPrice": 0,
					"iHotSpot": 0,
					"name": "zytest091901",
					"iDistributionMode": 2,
					"fDistributionRadius": 0,
					"id": 1549440281503858700,
					"pubts": "2022-09-19 17:09:50",
					"isHeadQuarters": false,
					"longitude": 22
				},
				"dept": "2353525860798725",
				"circleRadius": 5000,
				"terminalCategory": 1549433598534746000,
				"chainSystem": 1550130577280598016,
				"iOnlineDelivery": 0,
				"latestFollowUpTime": "2022-09-19 17:09:50",
				"createTime": "2022-09-19 17:09:50",
				"codebianma": "zytest091901",
				"endTime": "21:00:00",
				"contactPhone": "16101440911",
				"cust": 2353513215119616
			}
		],
		"storeCustomItem": {
			"define1": "",
			"define2": ""
		},
		"failInfos": [
			{}
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

