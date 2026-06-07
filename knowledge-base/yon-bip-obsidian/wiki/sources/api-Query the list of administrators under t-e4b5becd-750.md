---
title: "查询当前租户下管理员列表"
apiId: "e4b5becd-750c-4574-9490-3550eb7b7a97"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Contacts"
domain: "SC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contacts]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询当前租户下管理员列表

>  请求方式	GET | Contacts (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/users/admin_list
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token

## 3. 请求示例

Url: /yonbip/uspace/users/admin_list?access_token=访问令牌

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
data	object	是	数据
userId	string	否	用户id
userCode	string	否	用户编码
userName	string	否	用户名
userMobile	string	否	手机号
userMobileCountrycode	string	否	手机号所属国家编码
userEmail	string	否	邮箱
userActivate	string	否	用户是否激活
registerDate	string	否	注册日期
loginTs	string	否	登录时间
userAvatorNew	string	否	头像
userBigAvatorNew	string	否	大头像
userSmallAvatorNew	string	否	小头像
sysId	string	否	系统编码

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": [
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
更新
请求说明
新增
返回参数 (16)
删除
返回参数 (13)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

