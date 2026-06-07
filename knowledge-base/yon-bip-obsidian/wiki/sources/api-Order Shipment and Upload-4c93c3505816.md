---
title: "订单发货并上传"
apiId: "4c93c350581649af8cda329003409934"
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

# 订单发货并上传

>  请求方式	POST | Online Retailer Order (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/tradeorder/shipandupload
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
ids	string	否	是	需要发货订单id，多张用“,”分隔
externalData	object	否	否	订单支持修改的部分内容
Modify	object	是	否	修改的数据
expresslists	object	是	否	实际发货的快递明细,传入数据会覆盖原快递明细 不需要修改则不传
shipdetails	object	是	否	实际发货的发货明细，保存后将把原发货明细替换成此发货明细，不需要修改发货明细则不传
partParam	object	否	是	订单id-时间戳键值对
path	string	否	否	调用类型 固定值2 默认值：2

## 3. 请求示例

Url: /yonbip/sd/dst/tradeorder/shipandupload?access_token=访问令牌
Body: {
	"ids": "",
	"externalData": {
		"Modify": [
			{
				"iweight": 0,
				"cuser": "",
				"cshipper": "user1",
				"dShipTime": "",
				"cExpressCorp": "",
				"id": 0,
				"cExpressCode": "",
				"cuploader": "user1"
			}
		],
		"expresslists": [
			{
				"parentid": 0,
				"cshipcode": "",
				"iweight": 0,
				"tid": "",
				"dweighttime": "",
				"dshiptime": "",
				"cexpresscode": "",
				"cweighter": "",
				"deliverstatus": ""
			}
		],
		"shipdetails": [
			{
				"iWarehouseId": 0,
				"bodyid": 0,
				"warehouseCode": "",
				"product": 0,
				"itemid": 0,
				"iquantity": 0,
				"parentid": 0,
				"cshipcode": "",
				"sBatchNo": "",
				"skuCode": 0,
				"sn": "",
				"location": 0,
				"locationCode": ""
			}
		]
	},
	"partParam": {},
	"path": ""
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
code	long	否	code 示例：200
cpickrowno	string	否	波次号
data	object	是	返回数据
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
exceptionMsg	string	否	异常信息 示例：没有需要操作的单据
code	string	否	返回类型 示例：1
isShowMsg	boolean	否	是否在客户端显示消息 示例：true
failCount	string	否	失败数 示例：1
successCount	string	否	成功数 示例：0
isExcuteAction	boolean	否	是否执行了action 示例：true
actionName	string	否	操作类型 示例：订单发货

## 5. 正确返回示例

{
	"code": 200,
	"data": [
		{
			"exceptionMsg": "没有需要操作的单据",
			"code": "1",
			"isShowMsg": true,
			"failCount": "1",
			"successCount": "0",
			"isExcuteAction": true,
			"actionName": "订单发货"
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
999	订单发货上传异常	请检查入参数据

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-16	
新增
请求参数 cshipper
新增
请求参数 cuploader
	2	2025-06-25	
更新
请求参数 (27)
更新
返回参数 (9)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

