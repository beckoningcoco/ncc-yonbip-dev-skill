---
title: "营销用户查询"
apiId: "1939606715671511042"
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

# 营销用户查询

>  请求方式	POST | Personnel Management (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/channel/user/list
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
pageIndex	long	否	是	当前页码 示例：1 默认值：1
pageSize	long	否	是	每页条数 示例：10 默认值：10
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	账号code、用户名称name、手机号mobile、邮箱email 示例：code
op	string	否	否	比较符（eq:等于;it:小于;gt:大于;like:模糊匹配） 示例：like
value1	string	否	否	值1（条件）（属性名补充：上游单据号upCode） 示例：0000

## 3. 请求示例

Url: /yonbip/sd/channel/user/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"simpleVOs": [
		{
			"field": "code",
			"op": "like",
			"value1": "0000"
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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
pageIndex	int	否	当前页
pageSize	int	否	每页数量
recordCount	int	否	记录数量
recordList	object	是	营销用户列表

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"recordList": [
			{
				"id": 0,
				"code": "YHT-140-2541667269499939",
				"name": "用户名",
				"mobile": "13710109999",
				"email": "123@163.com",
				"userType": "2",
				"customer": "1705990473639788551",
				"customer_name": "营销用户所属客户",
				"pubts": "2024-02-20 10:21:27",
				"yhtUserId": "b9cb0f52-e502-4e3e-8205-313a71dd9b0a"
			}
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

