---
title: "营销用户保存"
apiId: "1939632622914240519"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Personnel Management"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Personnel Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 营销用户保存

>  请求方式	POST | Personnel Management (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/channel/user/save
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
data	object	是	是	营销用户信息
cust_name	string	否	是	所属客户(所属客户编码/客户名) 示例：所属客户
cust	string	否	否	所属客户id（与所属客户二选一必填）
name	string	否	是	用户名称 示例：用户名称
mobilepreno	string	否	是	手机号所属地 示例：86 默认值：86
mobile	string	否	否	手机号（手机号国内非空，手机号和邮箱二选一必填） 示例：15845745411
email	string	否	否	邮箱
userTypeNew	string	否	是	身份类型（2-客户管理员;3-客户业务员;4-商家管理员;5-商家业务员)（可多选，逗号分隔） 示例：2,3,4

## 3. 请求示例

Url: /yonbip/sd/channel/user/save?access_token=访问令牌
Body: {
	"data": [
		{
			"cust_name": "所属客户",
			"cust": "",
			"name": "用户名称",
			"mobilepreno": "86",
			"mobile": "15845745411",
			"email": "",
			"userTypeNew": "2,3,4"
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
code	string	否	请求返回码 示例：200
message	string	否	调用返回信息 示例：操作成功
data	object	否	调用返回详情
count	number
小数位数:0,最大长度:10	否	新增总数量
sucessCount	number
小数位数:0,最大长度:10	否	成功条数
failCount	number
小数位数:0,最大长度:10	否	失败条数
messages	string	否	返回信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 0,
		"sucessCount": 0,
		"failCount": 0,
		"messages": ""
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

