---
title: "生命周期模板应用配置详情查询"
apiId: "2354634284441010185"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "PLM Modeling Service"
domain: "PLMMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, PLM Modeling Service]
platform_version: "BIP"
source_type: community-api-docs
---

# 生命周期模板应用配置详情查询

>  请求方式	POST | PLM Modeling Service (PLMMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/baseOpenApi/lifeTplUse/v1/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	ID 示例：2278025614514978824
code	string	否	否	编码 示例：textmodel

## 3. 请求示例

Url: /yonbip/RDC/baseOpenApi/lifeTplUse/v1/detail?access_token=访问令牌
Body: {
	"id": "2278025614514978824",
	"code": "textmodel"
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
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	string	否	接口返回状态 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
id	string	否	ID 示例：2305668066986426368
code	string	否	编码 示例：zskecEcr_Template_Use2
name	string	否	名称 示例：zsk变更申请-对象任务源
createOrgId	string	否	创建组织ID 示例：1980670408412626952
createOrgName	string	否	创建组织名称 示例：test001
createTime	string	否	创建时间 示例：2025-07-04 15:44:50.0
creatorId	string	否	创建人ID 示例：6ebd7c9c-b3ac-4785-b105-d1a168050e7d
creatorName	string	否	创建人名称 示例：gxr01
lcTemplateId	string	否	生命周期模板ID 示例：1991724958457790540
lcTemplateName	string	否	生命周期模板名称 示例：zsk变更申
objectTypeId	string	否	对象类型ID 示例：101990
objectTypeName	string	否	对象类型名称 示例：智石开变更申请
ownOrgId	string	否	所属组织ID 示例：1980670408412626952
ownOrgName	string	否	所属组织名称 示例：test001
publishStateId	string	否	发布状态ID 示例：1991724958457790543
publishStateName	string	否	发布状态名称 示例：实施中
revokeStateId	string	否	废弃状态ID 示例：1991724958457790542
revokeStateName	string	否	废弃状态名称 示例：已废弃
authList	object	是	授权列表
transitionList	object	是	状态变化关系交易类型配置列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "2305668066986426368",
		"code": "zskecEcr_Template_Use2",
		"name": "zsk变更申请-对象任务源",
		"createOrgId": "1980670408412626952",
		"createOrgName": "test001",
		"createTime": "2025-07-04 15:44:50.0",
		"creatorId": "6ebd7c9c-b3ac-4785-b105-d1a168050e7d",
		"creatorName": "gxr01",
		"lcTemplateId": "1991724958457790540",
		"lcTemplateName": "zsk变更申",
		"objectTypeId": "101990",
		"objectTypeName": "智石开变更申请",
		"ownOrgId": "1980670408412626952",
		"ownOrgName": "test001",
		"publishStateId": "1991724958457790543",
		"publishStateName": "实施中",
		"revokeStateId": "1991724958457790542",
		"revokeStateName": "已废弃",
		"authList": [
			{
				"id": "2305668066986426369",
				"useId": "2305668066986426368",
				"stateCode": "Designing",
				"stateId": "1991724958457790544",
				"stateName": "设计中",
				"operateCode": "Deletable,Transition,Editable",
				"operateName": "可删除,可跃迁,可编辑",
				"authSubjectId": "6ebd7c9c-b3ac-4785-b105-d1a168050e7d,f3258b7a-c3de-479e-b073-f388fd4202e6,48a97b26-b727-4d44-b7d4-ff5bb69bafa5",
				"authSubjectName": "gxr01,gxr,业务all01"
			}
		],
		"transitionList": [
			{
				"id": "2305668066986426373",
				"useId": "2305668066986426368",
				"transitionId": "1991724958457790550",
				"transitionName": "设计中->已废弃",
				"busTypeId": "2305463325770121223",
				"busTypeName": "对象任务源01"
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
0	未传入优惠券档案id	coupon_id值填写有误
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-28	
更新
返回参数 (6)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

