---
title: "通过友户通用户Id获取下级员工信息"
apiId: "639b5b79-70b8-4bae-9049-c256407efb9a"
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

# 通过友户通用户Id获取下级员工信息

>  请求方式	POST | Contacts (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/staff/child_by_user_ids
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
userIdList	object	否	是	友户通用户ID集合(list)

## 3. 请求示例

Url: /yonbip/uspace/staff/child_by_user_ids?access_token=访问令牌
Body: {
	"userIdList": {}
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
id	string	否	主键 ，员工ID
code	string	否	编码
user_id	string	否	用户id
name	string	否	名称
shortname	string	否	姓名简拼
modifiedtime	object	否	修改时间
enable	int	否	启用状态，0 未启用 1 已启用 2 已停用
photo	string	否	头像
sex	int	否	性别，1 男 2 女 0 不限
birthdate	string	否	生日
email	string	否	邮箱
mobile	string	否	手机号
joinworkdate	object	否	参加工作时间
officetel	string	否	办公电话
linkaddr	string	否	通讯地址
mainjobinfo	Mainjobinfo	否	任职信息
id	string	否	主键
modifiedtime	string	否	修改时间
staff_id	string	否	所属人员
org_id	string	否	所属组织
dept_id	string	否	所属部门
job_id	string	否	职务
post_id	string	否	职位
jobgrade_id	string	否	职级
begindate	string	否	任职开始时间
enddate	string	否	任职结束时间
director	string	否	上级主管
psncl_id	string	否	人员类别

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "",
		"code": "",
		"user_id": "",
		"name": "",
		"shortname": "",
		"modifiedtime": {},
		"enable": 0,
		"photo": "",
		"sex": 0,
		"birthdate": "",
		"email": "",
		"mobile": "",
		"joinworkdate": {},
		"officetel": "",
		"linkaddr": "",
		"mainjobinfo": {
			"id": "",
			"modifiedtime": "",
			"staff_id": "",
			"org_id": "",
			"dept_id": "",
			"job_id": "",
			"post_id": "",
			"jobgrade_id": "",
			"begindate": "",
			"enddate": "",
			"director": "",
			"psncl_id": ""
		}
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

