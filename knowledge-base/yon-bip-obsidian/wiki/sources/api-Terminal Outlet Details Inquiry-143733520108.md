---
title: "终端网点详情查询"
apiId: "1437335201082507264"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Terminal Outlets"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Terminal Outlets]
platform_version: "BIP"
source_type: community-api-docs
---

# 终端网点详情查询

>  请求方式	GET | Terminal Outlets (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/store/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	终端网点id(id和code 二选一必填 ；id，code同时输入以id为准)
code	string	query	否	终端网点代码(id和code 二选一必填 ；id，code同时输入以id为准)

## 3. 请求示例

Url: /yonbip/sd/uretail/store/detail?access_token=访问令牌&id=&code=

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
code	string	否	响应码 示例：200
message	string	否	响应消息 示例：操作成功
data	object	否	返回结果集
masterOrgKeyField	string	否	主组织字段 示例：org
channelCustomer	long	否	渠道客户id 示例：0
modifier	string	否	修改人 示例：15915922222
operatorStore	object	是	店员定义
modifyTime	DateTime	否	修改时间 示例：2022-03-14 15:50:08
mnemonic	string	否	助记码 示例：CSMD2
platformType	string	否	线上渠道(1淘宝2京东3苏宁4自建商城5亚马逊6小红书7有赞8 1688 9拼多多10工行融E购11淘宝供销平台12门店) 示例：12
terminalCategory	long	否	终端类型ID 示例：1477340227421864000
areaClass	long	否	地区id 示例：2424778187168256
id	long	否	终端网点id 示例：2508100390506752
merchantStore	long	否	是否商家门店(1是0否) 示例：1
welcome	object	否	扫码欢迎词
warehouse	long	否	仓库id 示例：2508099736998144
customerName	string	否	客户名称
terminalType	string	否	终端类型(1零售门店2自建商城3电商平台4营销网点，多个逗号分隔) 示例：1
warehouse_name	string	否	仓库名称 示例：测试仓库2
stop	long	否	停用标识0未停用1停用 示例：0
name	object	否	终端名称
custShippingAddress	long	否	客户收货地址id 示例：2508098140820480
paymentMethodStore	object	是	收款方式定义
code	string	否	门店代码 示例：0177
deliveryMethod	string	否	配送范围(circle按半径配送polygon按电子围栏配送) 示例：circle
kmradius	long	否	配送半径 示例：5
iOnlineDelivery	long	否	线上订单发货(1是0否) 示例：1
centralWarehouseDistribution	long	否	是否中心仓配送(1是0否) 示例：0
startTime	DateTime	否	开始时间 示例：10:00:00
cust_name	string	否	客户名称 示例：测试二级客户
pubts	DateTime	否	时间戳 示例：2022-03-14 15:50:08
org_name	string	否	组织名称 示例：苍南老中医化妆品有限公司
AdjacentStores	object	是	周边门店集合
cAppID	string	否	会员体系ID 示例：yl_2zZYAHGE4eQ5
storeType	long	否	门店类型1直营店2直营专柜3加盟店 示例：3
creator	string	否	创建人id 示例：15915922222
custShippingAddress_cAddress	string	否	客户收货地址 示例：广州万菱汇
org	string	否	组织id 示例：2424238578686720
warehouses	object	是	周边仓库定义
iQRCode	object	否	二维码类型定义
shoppingMall	object	否	商城终端定义
Stores	object	是	班次设置
electronicCommerce	object	是	电商设置
shareRes	long	否	资源共享 示例：2
latestFollowUpTime	DateTime	否	最近跟进时间 示例：2021-11-07 06:51:37
circleRadius	long	否	半径(米) 示例：5000
createTime	DateTime	否	创建时间 示例：2021-11-07 18:51:39
codebianma	string	否	终端编码 示例：002
endTime	DateTime	否	截止时间 示例：21:00:00
cust	long	否	客户id 示例：2442833944893952
areaClass_name	string	否	销售区域名称 示例：华南地区

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"masterOrgKeyField": "org",
		"channelCustomer": 0,
		"modifier": "15915922222",
		"operatorStore": [
			{
				"operator_name": "测试店员",
				"operatorId_merchantStaff": 2714331301533440,
				"store_operator_id": 2714331300073730,
				"operatorId": "2714331301533440"
			}
		],
		"modifyTime": "2022-03-14 15:50:08",
		"mnemonic": "CSMD2",
		"platformType": "12",
		"terminalCategory": 1477340227421864000,
		"areaClass": 2424778187168256,
		"id": 2508100390506752,
		"merchantStore": 1,
		"welcome": {
			"zh_CN": "欢迎"
		},
		"warehouse": 2508099736998144,
		"customerName": "",
		"terminalType": "1",
		"warehouse_name": "测试仓库2",
		"stop": 0,
		"name": {
			"zh_CN": "测试门店2"
		},
		"custShippingAddress": 2508098140820480,
		"paymentMethodStore": [
			{
				"paymentMethodId": 2288807709858057,
				"payment_name": "现金",
				"store_payment_id": 2508100395241728
			}
		],
		"code": "0177",
		"deliveryMethod": "circle",
		"kmradius": 5,
		"iOnlineDelivery": 1,
		"centralWarehouseDistribution": 0,
		"startTime": "10:00:00",
		"cust_name": "测试二级客户",
		"pubts": "2022-03-14 15:50:08",
		"org_name": "苍南老中医化妆品有限公司",
		"AdjacentStores": [
			{
				"adjacentStoreGroup": 2508109208195328,
				"adjstore_child_id": 2508109208195331,
				"adjstore_name": "测试门店组"
			}
		],
		"cAppID": "yl_2zZYAHGE4eQ5",
		"storeType": 3,
		"creator": "15915922222",
		"custShippingAddress_cAddress": "广州万菱汇",
		"org": "2424238578686720",
		"warehouses": [
			{
				"isDefaultRequire": 1,
				"isDefault": 1,
				"warehouse_name": "测试仓库2",
				"warehouse_eStore": true,
				"store": 2508100390506752,
				"id": 2508100390506753,
				"warehouse": 2508099736998144,
				"isDefaultMaterial": 1,
				"warehouse_wStore": true
			}
		],
		"iQRCode": {
			"iBizId": 2508100390506752,
			"id": 2508100390506754,
			"iQRCodeType": 2
		},
		"shoppingMall": {
			"store": 2508100390506752,
			"iStart": 1,
			"isHeadQuarters": 0,
			"iDeleted": 0,
			"iHotSpot": 0,
			"id": 2508100390506755,
			"pcTemplateId": 0,
			"templateId": 0,
			"deliveryType": "0",
			"referenceRetailPrice": 0,
			"cInventoryType": 0,
			"pubts": "2021-11-07 18:51:39",
			"iDistributionMode": 2,
			"orderTakeTemplateId": 0
		},
		"Stores": [
			{
				"belongGroup": "1477343663392030729",
				"pubts": "2022-06-21 16:58:37",
				"store": 1482639169068990500,
				"id": 1482639177658925000
			}
		],
		"electronicCommerce": [
			{
				"autoMatchExpressByWeight": false,
				"memo": "电商备注",
				"isModifySku": false,
				"invoiceType": "EnterpriseDeliver",
				"id": 1482639169068990500,
				"autoMatchRefund": false,
				"isSplitRefund": false,
				"autoMatchWarehouse": true,
				"refund_transtype": "1417998485159936432",
				"autoDeliveryWarning": true,
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
				"isDouYinModifyAdress": false,
				"shopCode": "ZYD01_2",
				"store": 1482639169068990500,
				"isProviderShop": false,
				"accordingTo": "1",
				"taxPayer": "0",
				"trade_receivable_transtype": "1417998485159936431",
				"returnWarehouse": 2721870765069056,
				"ys_customer": 2728468940313602
			}
		],
		"shareRes": 2,
		"latestFollowUpTime": "2021-11-07 06:51:37",
		"circleRadius": 5000,
		"createTime": "2021-11-07 18:51:39",
		"codebianma": "002",
		"endTime": "21:00:00",
		"cust": 2442833944893952,
		"areaClass_name": "华南地区"
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

