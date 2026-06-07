---
title: "招聘需求详情查询"
apiId: "1676276756020985865"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Job Requisition"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 招聘需求详情查询

>  请求方式	GET | Job Requisition (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/staffing/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	招聘需求id；id、code同时存在时，都会作为筛选条件查询，其中任何一个传值错误，都会查询不到结果
code	string	query	否	招聘需求编码

## 3. 请求示例

Url: /yonbip/hrcloud/staffing/detail?access_token=访问令牌&id=&code=

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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时返回的数据
applicantDeptId	string	否	申请人部门id
applicantDeptName	string	否	申请人部门名称
applicantId	string	否	申请id
applicantIdName	string	否	申请人名称
applicantOrgId	string	否	所属组织id
applicantOrgName	string	否	所属组织名称
billstate	int	否	单据状态
canWithDraw	int	否	可以使用
code	string	否	需求编码
createDate	string	否	创建日期
createTime	string	否	创建时间
creator	string	否	创建人
creatorId	string	否	创建人id
isDeleted	boolean	否	是否删除
isWfControlled	boolean	否	控制
masterOrgKeyField	string	否	主组织
name	string	否	需求名称
pubts	string	否	时间戳
recruitNum	int	否	需求人数
recruitOrg	string	否	所属组织
recruitOrgName	string	否	所属组织名称
recruitType	string	否	招聘类型
recruitTypeChange	string	否	招聘类型变更
recruitTypeName	string	否	招聘类型名称
recruitYear	string	否	需求年度
submitdate	string	否	提交日期
transTypeKeyField	string	否	类型key
verifystate	int	否	验证状态
recruitPostVO	object	否	招聘职位数据

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"applicantDeptId": "",
		"applicantDeptName": "",
		"applicantId": "",
		"applicantIdName": "",
		"applicantOrgId": "",
		"applicantOrgName": "",
		"billstate": 0,
		"canWithDraw": 0,
		"code": "",
		"createDate": "",
		"createTime": "",
		"creator": "",
		"creatorId": "",
		"isDeleted": true,
		"isWfControlled": true,
		"masterOrgKeyField": "",
		"name": "",
		"pubts": "",
		"recruitNum": 0,
		"recruitOrg": "",
		"recruitOrgName": "",
		"recruitType": "",
		"recruitTypeChange": "",
		"recruitTypeName": "",
		"recruitYear": "",
		"submitdate": "",
		"transTypeKeyField": "",
		"verifystate": 0,
		"recruitPostVO": {
			"code": "",
			"createDate": "",
			"createTime": "",
			"creator": "",
			"creatorId": "",
			"enable": "",
			"id": "",
			"isDeleted": true,
			"name": "",
			"orgId": "",
			"orgIdName": "",
			"postSource": 0,
			"pubts": "",
			"recruitId": "",
			"recruitNum": 0,
			"recruitPostState": 0,
			"recruitType": "",
			"recruitTypeName": ""
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
500	查询失败	

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

