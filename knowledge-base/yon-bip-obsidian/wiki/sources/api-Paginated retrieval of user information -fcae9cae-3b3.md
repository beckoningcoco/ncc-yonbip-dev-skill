---
title: "分页获取租户下用户信息"
apiId: "fcae9cae-3b3e-432f-9bce-3c61e890f31c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contacts"
domain: "SC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contacts]
platform_version: "BIP"
source_type: community-api-docs
---

# 分页获取租户下用户信息

>  请求方式	POST | Contacts (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/users/user_page_list
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
index	int	否	是	第几页
size	int	否	是	一页大小
sortType	string	否	否	排序字段，默认按字段升序排列

## 3. 请求示例

Url: /yonbip/uspace/users/user_page_list?access_token=访问令牌
Body: {
	"index": 0,
	"size": 0,
	"sortType": ""
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
code	string	否	状态码 示例：200
message	string	否	错误信息 示例：success
data	object	否	数据
number	string	否	当前页
size	string	否	一页大小
totalPages	string	否	总页数
content	object	是	分页数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"number": "",
		"size": "",
		"totalPages": "",
		"content": [
			{
				"userId": "",
				"userCode": "",
				"userName": "",
				"userMobile": "",
				"userMobileCountrycode": "",
				"userEmail": "",
				"userActivate": "",
				"registerDate": "",
				"loginTs": "",
				"userAvatorNew": "",
				"userBigAvatorNew": "",
				"userSmallAvatorNew": "",
				"sysId": ""
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-29	
新增
返回参数 (20)
删除
返回参数 (16)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

