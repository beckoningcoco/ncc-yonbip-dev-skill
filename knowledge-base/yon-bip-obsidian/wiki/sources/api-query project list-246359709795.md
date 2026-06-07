---
title: "项目任务列表查询"
apiId: "2463597097953263625"
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

# 项目任务列表查询

>  请求方式	POST | PLM Project Management (PLMPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/openapi/prjTask/v1/list
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
pageIndex	number
小数位数:0,最大长度:10	否	是	分页 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:4	否	是	分页大小 示例：20 默认值：10
simpleVOs	object	是	否	自定义查询条件 示例：[{"field":"name","op":"like", "value1":"测试项目"}]
field	string	否	否	查询字段
op	string	否	否	查询条件操作符
value1	string	否	否	查询条件值
queryOrders	object	是	否	自定义排序
field	string	否	否	业务元数据属性名 示例：creationtime
order	string	否	否	排序方式 示例：asc

## 3. 请求示例

Url: /yonbip/RDC/openapi/prjTask/v1/list?access_token=访问令牌
Body: {
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
pageIndex	number
小数位数:0,最大长度:10	否	当前页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	分页大小 示例：20
recordCount	number
小数位数:0,最大长度:10	否	数据总数 示例：395
recordList	object	是	接口返回数据
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：20

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 395,
		"recordList": [
			{
				"parent_name": "00000028",
				"parent": "2398247074757345292",
				"WBSEdit": true,
				"ownedorg": "1980670408412626952",
				"classifyId": "1980667178594598916",
				"submitPerson": "1981140234900340744",
				"creator_userName": "黎一",
				"planEndtime": "2025-12-05 23:59:59",
				"warnLight": 2,
				"Terminate": true,
				"SuperMgtAuth": false,
				"lifecycleAttrpoolId": "1980667178617667683",
				"path": "2398247074757345292|92785684334323|",
				"userDefine": {
					"id": "2398247349635252234"
				},
				"statusLight": "执行中延期",
				"CombineEdit": true,
				"TypeAuthVisible": true,
				"planStarttime": "2025-11-06 00:00:00",
				"principalDeptName": "测试部门",
				"parent_code": "task92705346",
				"realStarttime": "2025-11-06 00:00:00",
				"projectId_name": "00000028",
				"id": "92785684334323",
				"lifecycleUseId_name": "项目任务-默认模板使用",
				"bpmAsyncAuditStatus": 2,
				"ownedorg_name": "智石开",
				"typeId_type": "1002",
				"publishTime": "2025-11-06 09:33:10",
				"publishDept": "1980670605981122561",
				"specialTask": "false",
				"publishDept_name": "测试部门",
				"owner_name": "黎一",
				"typeId_code": "1002",
				"level": 2,
				"sort": 1,
				"secretLevel": "2303450034061967361",
				"isEnd": false,
				"classifyId_name": "执行中",
				"childAllFinish": "no",
				"projectId_lifecycleAttrpoolId_name": "执行中",
				"name": "名称",
				"Viewable": true,
				"publisher": "1981140234900340744",
				"typeId": "1980667178594598922",
				"lifecycleUseId": "1980667178617667749",
				"secretLevel_secretName": "公开",
				"Deletable": true,
				"projectId_lifecycleAttrpoolId": "1980667178617667683",
				"creationtime": "2025-11-06 09:32:18",
				"wfstate": 0,
				"lifecycleAttrId": "1980667178617667703",
				"RollOut": true,
				"projectId": "2398247074757345285",
				"verifystate": 2,
				"createorg": "1980670408412626952",
				"code": "task84773176",
				"lifecycleAttrpoolId_name": "执行中",
				"Execute": true,
				"Suspend": true,
				"typeId_name": "阶段类型",
				"classifyId_code": "PROGRESS",
				"principal": "1981140234900340744",
				"submitPerson_name": "黎一",
				"taskType": "TASK",
				"modifiedtime": "2026-03-23 10:12:37",
				"planDuration": 22,
				"lifecycleAttrId_name": "执行中",
				"grpMember_name": "黎一",
				"Editable": true,
				"pubts": "2025-11-06 09:32:18",
				"lifecycleId_name": "项目任务-默认模板",
				"startState": 1,
				"Finish": true,
				"hasOutputPackage": "N",
				"Publish": true,
				"severity": "GENERAL_TASK",
				"owner": "1981140234900340744",
				"creator": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
				"planType": "2398247074757345288",
				"publisher_name": "黎一",
				"projectId_wfstate": 0,
				"deliverables_status": "20",
				"grpMember": "2398247074757345286",
				"principalYht": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
				"lifecycleId": "1980667178617667691",
				"wfId": "1980667178617667731",
				"projectId_code": "00000028",
				"createorg_name": "智石开"
			}
		],
		"pageCount": 20
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

