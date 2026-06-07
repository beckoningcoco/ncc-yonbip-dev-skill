---
title: "查询角色关联的用户身份"
apiId: "8fb527188ddf45febf1f84635fbbe0fd"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "BIP Role"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BIP Role]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询角色关联的用户身份

>  请求方式	POST | BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/role/auth/usersByRole
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
roleId	string	否	是	角色Id 示例：01d43c26-654c-44e9-97ac-fb1f50067525
pageNumber	long	否	是	页码 示例：1
pageSize	long	否	是	每页条数 示例：10
pubtsBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts开始时间(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2020-09-09 12:00:00 示例：2020-09-09 12:00:00
pubtsEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts结束时间(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-09-09 12:00:00 示例：2022-09-09 12:00:00

## 3. 请求示例

Url: /yonbip/digitalModel/role/auth/usersByRole?access_token=访问令牌
Body: {
	"roleId": "01d43c26-654c-44e9-97ac-fb1f50067525",
	"pageNumber": 1,
	"pageSize": 10,
	"pubtsBegin": "2020-09-09 12:00:00",
	"pubtsEnd": "2022-09-09 12:00:00"
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
code	long	否	状态码 示例：200
data	object	否	返回数据
pageSize	long	否	每页条数 示例：10
pageNum	long	否	当前页码 示例：1
total	long	否	总条数 示例：6
pages	long	否	总页数 示例：1
list	object	是	用户list
pubts	string	否	最近操作时间 示例：2019-12-18 10:25:40
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"pageSize": 10,
		"pageNum": 1,
		"total": 6,
		"pages": 1,
		"list": [
			{
				"id": 1959752072810752,
				"code": "YHT-633-7131571882571201",
				"name": "19998888888",
				"email": "",
				"mobile": "199****8888",
				"tenant": 1292161350684928,
				"userType": 1,
				"yhtUserId": "3450d384-47a6-4e98-826c-ba1bd8edfcb2",
				"beginDate": "2024-10-22",
				"endDate": "9999-12-31"
			}
		]
	},
	"pubts": "2019-12-18 10:25:40",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
000-554-110211
	参数异常	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	查看具体返回信息或咨询支持人员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-02	
新增
返回参数 displayCode
新增
返回参数 level

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

