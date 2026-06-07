---
title: "相关人员新增"
apiId: "1566297925042569221"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Related Personnel"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Related Personnel]
platform_version: "BIP"
source_type: community-api-docs
---

# 相关人员新增

>  请求方式	POST | Related Personnel (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/relationperson/bill/save
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
data	object	是	否	相关人员数据
personType	string	否	是	相关人员类型；1-参与人，0-负责人 示例：1
person	string	否	是	相关人员ID 示例：1539575789486342160
dept	string	否	否	相关人员部门ID 示例：1539574853184520196
org	string	否	是	相关人员组织ID 示例：1529916339311345671
person_mobile	string	否	否	相关人员手机号 示例：+86-15901270211
relateObjectId	string	否	是	添加相关人员的单据ID 示例：1539585410224095241
_status	string	否	是	状态，Insert-新增 示例：Insert
relateObjectType	string	否	是	添加相关人员单据编码，正式客户-cust_customerCard，商机-sfa_opptcard，线索-sfa_cluecard 示例：cust_customerCard
systemSource	string	否	是	接口标识，用来区分通过openapi接口还是通过页面新增，通过openapi新增时该值不可以为空，必须有值，值可以按照领域自定义。 示例：systemSource

## 3. 请求示例

Url: /yonbip/crm/relationperson/bill/save?access_token=访问令牌
Body: {
	"data": [
		{
			"personType": "1",
			"person": "1539575789486342160",
			"dept": "1539574853184520196",
			"org": "1529916339311345671",
			"person_mobile": "+86-15901270211",
			"relateObjectId": "1539585410224095241",
			"_status": "Insert",
			"relateObjectType": "cust_customerCard",
			"systemSource": "systemSource"
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
personType	long	否	相关人员类型 ，1-参与人，0-负责人 示例：1
person	string	否	相关人员ID 示例：2663646366732544
org	string	否	相关人员所属组织ID 示例：2603872696799488
relateObjectId	long	否	添加相关人员单据ID 示例：2612665345561344
relateObjectType	string	否	添加相关人员单据类型，正式客户-cust_customerCard，商机-sfa_opptcard，线索-sfa_cluecard 示例：cust_customerCard
systemSource	string	否	openapi标识 示例：123
id	long	否	数据ID 示例：1567367002536280000
creatorId	long	否	创建者ID 示例：2601058885911552
creator	string	否	创建者名字 示例：YonSuite默认用户
createTime	string	否	创建时间 示例：2022-10-13 20:52:14
createDate	string	否	创建时间 示例：2022-10-13 20:52:14
pubts	string	否	时间戳 示例：2022-10-13 20:52:14
tenant	long	否	租户ID 示例：2601058755186944
yTenantId	string	否	租户ID 示例：0000KYAY7F959CQUBP0000

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"personType": 1,
		"person": "2663646366732544",
		"org": "2603872696799488",
		"relateObjectId": 2612665345561344,
		"relateObjectType": "cust_customerCard",
		"systemSource": "123",
		"id": 1567367002536280000,
		"creatorId": 2601058885911552,
		"creator": "YonSuite默认用户",
		"createTime": "2022-10-13 20:52:14",
		"createDate": "2022-10-13 20:52:14",
		"pubts": "2022-10-13 20:52:14",
		"tenant": 2601058755186944,
		"yTenantId": "0000KYAY7F959CQUBP0000"
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
999	只有当前单据的创建人或负责人可以添加或移除参与人	使用负责人账号进行添加负责人或者参与人;检查systemSource参数是不是有值。

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (17)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

