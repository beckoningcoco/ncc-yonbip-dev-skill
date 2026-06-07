---
title: "项目任务类型详情查询"
apiId: "2500932011702616070"
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

# 项目任务类型详情查询

>  请求方式	POST | PLM Project Management (PLMPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/openapi/prjTaskType/v1/detail
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
id	string	否	是	ID 示例：2226817689824264194

## 3. 请求示例

Url: /yonbip/RDC/openapi/prjTaskType/v1/detail?access_token=访问令牌
Body: {
	"id": "2226817689824264194"
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
taskCgrDefLinkList	object	是	自定义项
createorg	string	否	创建组织ID 示例：1985902709371305991
code	string	否	编码 示例：000024
ownedorg	string	否	所属组织ID 示例：1985902709371305991
type	string	否	任务类别 示例：1001
colorSettingList	object	是	甘特图颜色配置
lifecycleAttrpoolId	string	否	生命周期状态池ID 示例：1980667032588779557
path	string	否	路径 示例：2160177767707574275|
modifiedtime	string	否	创建时间 示例：2026-03-24 15:31:11
id	string	否	ID 示例：2160177767707574275
lifecycleUseId_name	string	否	生命周期模板使用名称 示例：项目任务-默认模板使用
state	number
小数位数:0,最大长度:10	否	启用状态 示例：1
pubts	string	否	时间戳 示例：2026-03-24 15:34:39
level	number
小数位数:0,最大长度:10	否	层级 示例：1
outputLinkList	object	是	交付物类型
sort	number
小数位数:0,最大长度:10	否	排序号 示例：10
isEnd	boolean	否	末级节点 示例：true
name	string	否	名称 示例：交付物类型测试
lifecycleUseId	string	否	生命周期模板使用ID 示例：1980667178617667749
creationtime	string	否	创建时间 示例：2024-12-20 14:56:30
lifecycleId	string	否	生命周期模板ID 示例：1980667178617667691
lifecycleAttrId	string	否	生命周期状态ID 示例：1980667178617667702
shareOrgList	object	是	共享组织
taskAuthList	object	是	WBS可见授权
modifier	string	否	修改人 示例：bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2
modifier_userName	string	否	修改时间 示例：黎一

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"taskCgrDefLinkList": [
			{
				"definecode": "prjTask1",
				"creationtime": "2026-03-24 15:31:11",
				"creator": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
				"creator_userName": "黎一",
				"id": "2500851841709375502",
				"classifyid": "2160177767707574275"
			}
		],
		"createorg": "1985902709371305991",
		"code": "000024",
		"ownedorg": "1985902709371305991",
		"type": "1001",
		"colorSettingList": [
			{
				"state": 1,
				"colorValue": "rgba(255,255,255,1)",
				"stageName": "fff",
				"prjCgr_name": "22223",
				"prjCgr": "1981476891607957507",
				"ownedorg_name": "智石开测试组织",
				"ownedorg": "2117850633073065990",
				"creationtime": "2026-03-24 15:31:11",
				"creator": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
				"creator_userName": "黎一",
				"id": "2500851841709375496",
				"typeId": "2160177767707574275"
			}
		],
		"lifecycleAttrpoolId": "1980667032588779557",
		"path": "2160177767707574275|",
		"modifiedtime": "2026-03-24 15:31:11",
		"id": "2160177767707574275",
		"lifecycleUseId_name": "项目任务-默认模板使用",
		"state": 1,
		"pubts": "2026-03-24 15:34:39",
		"level": 1,
		"outputLinkList": [
			{
				"output_name": "研发物料类型（预置）",
				"output": "1980667178594598926",
				"code": "0002",
				"creationtime": "2026-03-24 15:31:11",
				"creator": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
				"creator_userName": "黎一",
				"id": "2500851841709375497",
				"classifyid": "2160177767707574275"
			}
		],
		"sort": 10,
		"isEnd": true,
		"name": "交付物类型测试",
		"lifecycleUseId": "1980667178617667749",
		"creationtime": "2024-12-20 14:56:30",
		"lifecycleId": "1980667178617667691",
		"lifecycleAttrId": "1980667178617667702",
		"shareOrgList": [
			{
				"shareOrg": "666666",
				"shareOrg_name": "企业账号级",
				"shareOrg_fullname": "企业账号级",
				"shareOrg_code": "global00",
				"containChildren": false,
				"creationtime": "2026-03-24 15:31:11",
				"creator": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
				"creator_userName": "黎一",
				"id": "2500851841709375498",
				"typeId": "2160177767707574275"
			}
		],
		"taskAuthList": [
			{
				"name": "ggggggggggg",
				"authPoint": 1,
				"authSubject": "1980670880874233864",
				"rule": "2500851575419305984",
				"ruleExpression": "编码 等于 fff",
				"taskAuthSetList": [
					{
						"name": "ggggggggggg",
						"authSubjectList": [
							{
								"subjectId": "1980670880874233864",
								"type": 1,
								"code": "00000001",
								"name": "ycc",
								"orgName": "智石开",
								"typeSubjectId": "1_1980670880874233864",
								"creationtime": "2026-03-24 15:31:11",
								"creator": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
								"creator_userName": "黎一",
								"id": "2500851841709375501",
								"authSetId": "2500851841709375500"
							}
						],
						"id": "2500851841709375500",
						"creationtime": "2026-03-24 15:31:11",
						"creator": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
						"creator_userName": "黎一",
						"authId": "2500851841709375499"
					}
				],
				"creationtime": "2026-03-24 15:31:11",
				"creator": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
				"creator_userName": "黎一",
				"id": "2500851841709375499",
				"typeId": "2160177767707574275"
			}
		],
		"modifier": "bbdbaa4c-3d3a-4cc0-a806-81c8415c94f2",
		"modifier_userName": "黎一"
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

