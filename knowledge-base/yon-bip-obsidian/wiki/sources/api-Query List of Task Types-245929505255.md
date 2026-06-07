---
title: "工作任务类型列表查询"
apiId: "2459295052555878402"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Task Management"
domain: "PLMPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Task Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 工作任务类型列表查询

>  请求方式	GET | Task Management (PLMPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/openapi/tempTaskCgr/v1/querytree
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
sortMeta	string	query	否	指定用于排序的物料属性元数据
code	string	query	否	编码
name	string	query	否	名称
status	string	query	否	启用状态
desc	string	query	否	描述
lctId	string	query	否	生命周期模板

## 3. 请求示例

Url: /yonbip/RDC/openapi/tempTaskCgr/v1/querytree?access_token=访问令牌&sortMeta=&code=&name=&status=&desc=&lctId=

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
id	string	否	id
code	string	否	编码
		否	
		否	
name	string	否	名称
creationtime	string	否	创建时间
creator	string	否	创建人用户ID
creator_userName	string	否	创建人名称
isEnd	boolean	否	是否末级
lctId	string	否	生命周期模板ID
lctId_name	string	否	生命周期模板
level	string	否	层级
modifiedtime	string	否	修改时间
modifier	string	否	修改人
modifier_userName	string	否	修改人名称
ownedorg	string	否	所属组织ID
ownedorg_name	string	否	所属组织
path	string	否	路径
pubts	string	否	时间戳
sort	string	否	排序
status	string	否	启用状态
children	string	否	工作任务类型子类型

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "",
		"code": "",
		"name": "",
		"creationtime": "",
		"creator": "",
		"creator_userName": "",
		"isEnd": true,
		"lctId": "",
		"lctId_name": "",
		"level": "",
		"modifiedtime": "",
		"modifier": "",
		"modifier_userName": "",
		"ownedorg": "",
		"ownedorg_name": "",
		"path": "",
		"pubts": "",
		"sort": "",
		"status": "",
		"children": ""
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

