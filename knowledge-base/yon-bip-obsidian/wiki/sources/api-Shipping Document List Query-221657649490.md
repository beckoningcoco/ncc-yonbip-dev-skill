---
title: "发货单列表查询"
apiId: "2216576494903230472"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Shipment Mgmt"
domain: "SS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Shipment Mgmt]
platform_version: "BIP"
source_type: community-api-docs
---

# 发货单列表查询

>  请求方式	POST | Shipment Mgmt (SS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/deliveryOrderApi/queryDeliveryList
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	string	否	是	页码 默认值：1
pageSize	string	否	是	每页数量，最大50 默认值：10
supplierDocId	string	否	否	供应商档案的主键，如果id和编码同时存在，以id为主;主键和编码不能同时为空。可多选 示例：1582032460335022086,158203246033502209
supplierDocCode	string	否	否	供应商档案的编码，如果id和编码同时存在，以id为主 可多选 示例："SUP001","SUP002"
deliveryDateStart	date
格式:yyyy-MM-dd HH:mm:ss	否	是	发货日期（开始时间） 示例：2022-05-13 00:00:00
deliveryDateEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	是	发货日期（结束时间） 示例：2022-05-15 00:00:00
purchaseOrg	string	否	否	采购组织编码，可多选 示例："OcIvUKZo","LLJM01"
receiveOrg	string	否	否	收货组织编码，可多选 示例："OcIvUKZo","LLJM01"
ts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳，发货单的更新时间。查询大于此时间的发货单 示例：2022-05-15 00:00:00

## 3. 请求示例

Url: /yonbip/cpu/deliveryOrderApi/queryDeliveryList?access_token=访问令牌
Body: {
	"pageIndex": "",
	"pageSize": "",
	"supplierDocId": "1582032460335022086,158203246033502209",
	"supplierDocCode": "\"SUP001\",\"SUP002\"",
	"deliveryDateStart": "2022-05-13 00:00:00",
	"deliveryDateEnd": "2022-05-15 00:00:00",
	"purchaseOrg": "\"OcIvUKZo\",\"LLJM01\"",
	"receiveOrg": "\"OcIvUKZo\",\"LLJM01\"",
	"ts": "2022-05-15 00:00:00"
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
code	string	否	code 示例：200
data	object	否	data
pageIndex	string	否	当前页索引
pageSize	string	否	每页数量
recordCount	string	否	总数量
recordList	object	否	结果集
message	string	否	返回提示信息

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": "",
		"pageSize": "",
		"recordCount": "",
		"recordList": {
			"id": "1963474939844493320",
			"status": "1",
			"code": "FHD202503010001",
			"deliveryOrderType": "0",
			"purchaseOrgName": "采购组组织A",
			"purchaseOrgCode": "OcIvUKZo",
			"receiveOrgName": "收货组织A",
			"receiveOrgCode": "OcIvUKZo",
			"deliveryDate": "2024-12-30 00:00:00",
			"transportType": "0",
			"logisticalComp": "",
			"logisticalCode": "",
			"transportCode": "",
			"trainCode": "",
			"receivePersonName": "",
			"receivePersonTel": "",
			"receiveAddress": "",
			"deliveryOrderDefineCharacter": {
				"id": "",
				"ytenant": ""
			}
		}
	},
	"message": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	发货单列表查询失败	查询失败原因

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

