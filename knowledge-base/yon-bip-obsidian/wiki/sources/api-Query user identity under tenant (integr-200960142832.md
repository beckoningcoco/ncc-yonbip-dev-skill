---
title: "查询租户下用户身份(集成场景)"
apiId: "2009601428326187011"
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

# 查询租户下用户身份(集成场景)

>  请求方式	POST | BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/iuap-apcom-bipuser/bill/open/user
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
page	object	否	是	分页信息
pageIndex	long	否	是	起始页码 示例：1 默认值：1
pageSize	long	否	是	每页数量 示例：10 默认值：10
yhtUserId	string	否	否	用户id 示例：4c95398d-41d7-4548-869f-c4470f9eae55
userType	string	否	否	身份类型1员工,2客户管理员,3客户业务员,4商家管理员,5商家业务员,6外部参会人员,7供应商 示例：1
name	string	否	否	用户名 示例：张三
mobile	string	否	否	手机号 示例：15678961110
email	string	否	否	邮箱 示例：11111116827@testyonyou.com
stopstatus	string	否	否	状态 1停用 0 启用 示例：0
pubtsBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts开始时间(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2020-09-09 12:00:00 示例：2020-09-09 12:00:00
pubtsEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts结束时间(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-09-09 12:00:00 示例：2022-09-09 12:00:00

## 3. 请求示例

Url: /yonbip/digitalModel/iuap-apcom-bipuser/bill/open/user?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 10
	},
	"yhtUserId": "4c95398d-41d7-4548-869f-c4470f9eae55",
	"userType": "1",
	"name": "张三",
	"mobile": "15678961110",
	"email": "11111116827@testyonyou.com",
	"stopstatus": "0",
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
code	string	否	返回状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	成功返回数据
pageIndex	long	否	起始页 示例：1
pageSize	long	否	每页数量 示例：10
recordCount	long	否	总数 示例：1
recordList	object	是	返回数据列表
pageCount	long	否	总页数 示例：19
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"yhtTenantId": "0000KQHNR7XADA8EC70000",
				"code": "YHT-2286-22991586411327728",
				"yxyUserId": "6870b9d8-321f-4491-881b-a4b6a8b2c51d",
				"mobile": "15510980098",
				"userName": "张晓二99",
				"rescode": "diwork",
				"defaultorg": "2322543648494848",
				"deleted": 0,
				"name": "张晓二99",
				"userType": 1,
				"id": 2323798919024896,
				"department": "2322544320090368",
				"pubts": "2022-01-25 10:26:49",
				"email": "99@163.com",
				"yhtUserId": "1548eec1-615a-4247-996c-8a4805fd6770",
				"stopstatus": 0,
				"tenant": 2322390811791616,
				"docId": "2342038181089536"
			}
		],
		"pageCount": 19
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
000-554-110010
	上下文读取友户通租户Id失败！	

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

