---
title: "modifierUserName	string	否	修改人名称 示例：曾祥吉"
apiId: "2500911035077099526"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "PLM Project Management"
domain: "PLMPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, PLM Project Management]
platform_version: "BIP"
source_type: community-api-docs
---

# modifierUserName	string	否	修改人名称 示例：曾祥吉

>  请求方式	POST | PLM Project Management (PLMPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/rdpmOpenapi/project/v1/list
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
code	string	否	否	编码 示例：20251222_000025
pageIndex	number
小数位数:0,最大长度:10	否	是	分页 示例：1
pageSize	number
小数位数:0,最大长度:4	否	是	分页大小 示例：20
simpleVOs	object	否	否	自定义查询条件 示例：[{"field":"name","op":"like", "value1":"测试项目"}]
queryOrders	object	是	否	自定义排序
field	string	否	是	业务元数据属性名 示例：creationtime
order	string	否	是	排序方式 示例：asc

## 3. 请求示例

Url: /yonbip/RDC/rdpmOpenapi/project/v1/list?access_token=访问令牌
Body: {
	"code": "20251222_000025",
	"pageIndex": 1,
	"pageSize": 20,
	"simpleVOs": [
		{
			"field": "name",
			"op": "like",
			"value1": "测试项目"
		}
	],
	"queryOrders": [
		{
			"field": "creationtime",
			"order": "asc"
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
code	number
小数位数:0,最大长度:10	否	接口返回状态 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
		否	
		否	
id	string	否	ID 示例：2432428039251951616
name	string	否	名称 示例：zzz
code	string	否	编码 示例：20251222_000025
state	number
小数位数:0,最大长度:10	否	状态 示例：1
ownedorgId	string	否	所属组织ID 示例：2220177129213001738
ownedorgName	string	否	所属组织名称 示例：智石开
classifyId	string	否	项目类型ID 示例：2226817689824264194
classifyName	string	否	项目类型名称 示例：项目类型1111
classifyIdCollectMember	string	否	汇总团队成员 示例：true
submitPerson	string	否	提交人 示例：d324f53b-b775-4626-9f24-a6b094c2e2aa
planStarttime	string	否	计划开始时间 示例：2025-12-22 00:00:00
planEndtime	string	否	计划结束时间 示例：2025-12-31 23:59:59
planDuration	number
小数位数:0,最大长度:10	否	计划工期 示例：8
principalId	string	否	责任人 示例：2226090852509810689
principalUserId	string	否	责任人用户ID 示例：d324f53b-b775-4626-9f24-a6b094c2e2aa
principalName	string	否	责任人名称 示例：曾祥吉
lifecycleUseId	string	否	生命周期模板使用ID 示例：2329463431064715272
lifecycleUseIdName	string	否	生命周期使用名称 示例：333
lifecycleAttrpoolId	string	否	生命周期状态池ID 示例：2220176098415607810
lifecycleAttrpoolIdName	string	否	生命周期状态池名称 示例：执行中
lifecycleAttrId	string	否	生命周期状态ID 示例：2220176141365280854
lifecycleAttrIdName	string	否	生命周期状态名称 示例：执行中
lifecycleId	string	否	生命周期模板ID 示例：2220176141365280852
lifecycleIdName	string	否	生命周期模板名称 示例：项目-默认模板
ownerDept	string	否	所属部门ID 示例：2220177369731170309
ownerDeptName	string	否	所属部门名称 示例：研发部
creatorId	string	否	创建人 示例：d324f53b-b775-4626-9f24-a6b094c2e2aa
creatorUserName	string	否	创建人名称 示例：曾祥吉
modifierId	string	否	修改人 示例：d324f53b-b775-4626-9f24-a6b094c2e2aa
publishTime	string	否	发布时间 示例：2025-12-22 10:52:07
isWfControlled	boolean	否	是否审批中 示例：true
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：2
wfstate	number
小数位数:0,最大长度:10	否	生命周期跃迁状态 示例：0
wfId	string	否	生命周期跃迁ID 示例：2220176141365280858
taskCanSubmit	string	否	任务能否提交 示例：true
createorgId	string	否	创建组织ID 示例：2220177129213001738
createorgName	string	否	创建组织名称 示例：智石开
itemizeId	string	否	项目分类ID 示例：2419077829202280450
itemizeName	string	否	项目分类名称 示例：ww
ownerId	string	否	所有者ID 示例：2226090852509810689
ownerName	string	否	所有者名称 示例：曾祥吉
finishPercent	number
小数位数:0,最大长度:10	否	完成百分比 示例：0
WBSEdit	boolean	否	WBS 编辑权限 示例：true
CombineEdit	boolean	否	协同编辑 示例：true
Viewable	boolean	否	可浏览 示例：true
canWithDraw	number
小数位数:0,最大长度:10	否	审批流可撤回 示例：1
Editable	boolean	否	可編輯 示例：true
Deletable	boolean	否	可刪除 示例：true
SuperMgtAuth	boolean	否	超级管理员权限 示例：false

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2432428039251951616",
		"name": "zzz",
		"code": "20251222_000025",
		"state": 1,
		"ownedorgId": "2220177129213001738",
		"ownedorgName": "智石开",
		"classifyId": "2226817689824264194",
		"classifyName": "项目类型1111",
		"classifyIdCollectMember": "true",
		"submitPerson": "d324f53b-b775-4626-9f24-a6b094c2e2aa",
		"planStarttime": "2025-12-22 00:00:00",
		"planEndtime": "2025-12-31 23:59:59",
		"planDuration": 8,
		"principalId": "2226090852509810689",
		"principalUserId": "d324f53b-b775-4626-9f24-a6b094c2e2aa",
		"principalName": "曾祥吉",
		"lifecycleUseId": "2329463431064715272",
		"lifecycleUseIdName": "333",
		"lifecycleAttrpoolId": "2220176098415607810",
		"lifecycleAttrpoolIdName": "执行中",
		"lifecycleAttrId": "2220176141365280854",
		"lifecycleAttrIdName": "执行中",
		"lifecycleId": "2220176141365280852",
		"lifecycleIdName": "项目-默认模板",
		"ownerDept": "2220177369731170309",
		"ownerDeptName": "研发部",
		"creatorId": "d324f53b-b775-4626-9f24-a6b094c2e2aa",
		"creatorUserName": "曾祥吉",
		"modifierId": "d324f53b-b775-4626-9f24-a6b094c2e2aa",
		"modifierUserName": "曾祥吉",
		"publishTime": "2025-12-22 10:52:07",
		"isWfControlled": true,
		"verifystate": 2,
		"wfstate": 0,
		"wfId": "2220176141365280858",
		"taskCanSubmit": "true",
		"createorgId": "2220177129213001738",
		"createorgName": "智石开",
		"itemizeId": "2419077829202280450",
		"itemizeName": "ww",
		"ownerId": "2226090852509810689",
		"ownerName": "曾祥吉",
		"finishPercent": 0,
		"WBSEdit": true,
		"CombineEdit": true,
		"Viewable": true,
		"canWithDraw": 1,
		"Editable": true,
		"Deletable": true,
		"SuperMgtAuth": false
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

