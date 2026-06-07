---
title: "快递鸟地图轨迹查询API"
apiId: "1863123939497607170"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Online Retailer Order"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Online Retailer Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 快递鸟地图轨迹查询API

>  请求方式	POST | Online Retailer Order (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/tradeorder/queryebusiness
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
partParam	object	否	是	查询条件
cExpressCode	string	否	是	快递单号 示例：SF00001

## 3. 请求示例

Url: /yonbip/sd/dst/tradeorder/queryebusiness?access_token=访问令牌
Body: {
	"partParam": {
		"cExpressCode": "SF00001"
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
code	string	否	code
message	string	否	message
data	object	否	data
cpickrowno	string	否	波次号
EBusinessID	string	否	用户ID 示例：1237100
ShipperCode	string	否	快递公司编码 示例：YD
Success	boolean	否	成功与否(true/false) 示例：true
LogisticCode	string	否	快递单号 示例：390141793061
SenderCityLatAndLng	string	否	发件城市经纬度 示例：22.55329,113.88308
ReceiverCityLatAndLng	string	否	收件城市经纬度 示例：40.22077,116.23128
State	string	否	普通物流状态： 0-暂无轨迹信息 1-已揽收 2-在途中 3-签收 4-问题件 5-转寄 6-清关 示例：3
CityIsNull	string	否	预留备用字段 示例：True
StateEx	string	否	物流状态编码：0-暂无轨迹信息 1-已揽收 2-在途中 3-已签收 4-问题件 5-转寄 6-清关 示例：304
Location	string	否	当前城市 示例：威海市
Traces	object	是	轨迹信息
Coordinates	object	是	当前城市经纬度信息
PreCoordinates	object	是	预设路径经过城市信息
EstimatedDeliveryTime	string	否	请求时传收发双方地址，返回此值 示例：2020-09-02 12:24:36
RouteMapUrl	string	否	轨迹地图URL 示例：http://url

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"EBusinessID": "1237100",
		"ShipperCode": "YD",
		"Success": true,
		"LogisticCode": "390141793061",
		"SenderCityLatAndLng": "22.55329,113.88308",
		"ReceiverCityLatAndLng": "40.22077,116.23128",
		"State": "3",
		"CityIsNull": "True",
		"StateEx": "304",
		"Location": "威海市",
		"Traces": [
			{
				"AcceptTime": "2016-10-26 18:31:38",
				"AcceptStation": "【北京环铁站】的【互优图书】已收件",
				"Location": "北京市",
				"Action": "1"
			}
		],
		"Coordinates": [
			{
				"Location": "深圳市",
				"LatAndLng": "22.55329,113.88308"
			}
		],
		"PreCoordinates": [
			{
				"Location": "深圳市",
				"LatAndLng": "22.55329,113.88308"
			}
		],
		"EstimatedDeliveryTime": "2020-09-02 12:24:36",
		"RouteMapUrl": "http://url"
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
999	店铺编码不存在	请输入正确的店铺编码

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

