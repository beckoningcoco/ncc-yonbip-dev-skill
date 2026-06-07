---
title: "操作日志导入"
apiId: "c5ac77f155e34cc2b4ac67d6eb32f475"
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

# 操作日志导入

>  请求方式	POST | Online Retailer Order (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/log/import
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
externalData	object	否	是	导入数据
Added	object	是	是	日志数据

## 3. 请求示例

Url: /yonbip/sd/dst/log/import?access_token=访问令牌
Body: {
	"externalData": {
		"Added": [
			{
				"actions": "insertoperationlog",
				"cuser": "testuser",
				"cmemo": "testmemo",
				"dtime": "2022-12-22 20:46:58",
				"parentid": "1513906840283381767"
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
code	string	否	返回编码 示例："200"
message	string	否	返回数据 示例：修改完成
data	object	是	data
cpickrowno	string	否	波次号
dtime	string	否	操作时间 示例：2022-12-22 20:46:58
cuser	string	否	操作人 示例：testuser
parentid	long	否	订单id 示例：1513906840283381767
action	string	否	操作类型 示例：insertoperationlog
tenant	long	否	租户 示例：2877397570672656
_status	string	否	操作状态 示例：Insert
_entityName	string	否	操作实体 示例：ec.ec_tradeorder.TradeOrderOperation
_keyName	string	否	主键 示例：id
id	long	否	id 示例：1619316203997102086

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "修改完成",
	"data": [
		{
			"dtime": "2022-12-22 20:46:58",
			"cuser": "testuser",
			"parentid": 1513906840283381767,
			"action": "insertoperationlog",
			"tenant": 2877397570672656,
			"_status": "Insert",
			"_entityName": "ec.ec_tradeorder.TradeOrderOperation",
			"_keyName": "id",
			"id": 1619316203997102086
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
999	插入日志异常，请稍后重试	稍后重试

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (7)
更新
返回参数 (12)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

