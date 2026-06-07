---
title: "查看任务详情"
apiId: "2070467961092046848"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Task"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Task]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看任务详情

>  请求方式	GET | Task (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/task/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	任务主键    示例: 2331017261748480

## 3. 请求示例

Url: /yonbip/crm/task/getbyid?access_token=访问令牌&id=2331017261748480

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
code	number
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据信息
taskExecutorList	object	是	任务执行人列表
endDate	string	否	结束日期 示例：2024-06-24 23:59:59
taskTransType_associationBusinessObject	string	否	任务交易类型关联业务对象 示例：5
taskTransType_isCheckAndAccept	boolean	否	是否需要验收 示例：true
taskTransType_isExecutorDefaultMe	boolean	否	任务交易类型执行人是否默认本人 示例：true
id	string	否	id 示例：2027157029835505665
curStaff	string	否	当前人员id 示例：1689505650425987078
longitude	number
小数位数:6,最大长度:10	否	经度 示例：116.408024
ower	string	否	负责人 示例：1815673965450887175
isWfControlled	boolean	否	是否审批流控制 示例：false
saleArea	string	否	销售区域 示例：1862406568312045571
planTask	boolean	否	计划任务 示例：false
visitType	number
小数位数:0,最大长度:10	否	拜访类型 示例：1
terminal_name	string	否	终端名字 示例：测试移交终端02
isAllowAcceptAndReject	boolean	否	允许接受拒绝 示例：true
auditTime	string	否	审核时间 示例：2024-06-24 09:22:19
taskTransType	string	否	任务交易类型 示例：1737162255332016130
circleTask	boolean	否	是否周期任务 示例：false
startDate	string	否	开始日期 示例：2024-06-24 00:00:00
obsoleteStatus	number
小数位数:0,最大长度:10	否	废弃状态 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审核状态 示例：2
code	string	否	编码 示例：202406240821514
taskTransType_actionTransTypeBustypeName	string	否	任务相关业务类型 示例：终端拜访
taskTransType_name	string	否	任务类型 示例：终端任务
latitude	number
小数位数:6,最大长度:10	否	纬度 示例：39.913082
taskTransType_isAutoComplete	boolean	否	是否自动完成 示例：false
originator	string	否	发起人 示例：1815673965450887175
ower_name	string	否	负责人 示例：郝娟
originator_name	string	否	发起人 示例：郝娟
taskTransType_actionTransTypeBustype	string	否	任务相关业务类型 示例：1685227356189885919
taskTransType_autoLockVisitor	boolean	否	任务自动解锁 示例：true
pubts	string	否	时间戳 示例：2024-06-24 09:22:19
org_name	string	否	组织名称 示例：集团
partnerExecute	boolean	否	伙伴执行 示例：false
createDate	string	否	创建日期 示例：2024-06-24 00:00:00
auditDate	string	否	审核日期 示例：2024-06-24 00:00:00
taskTransType_actionTransType	string	否	任务行动交易类型 示例：1692571509745254403
creator	string	否	创建人 示例：昵称-郝娟
org	string	否	组织 示例：1686561321477734406
saleArea_name	string	否	销售区域 示例：区域11501
auditor	string	否	审核人 示例：昵称-郝娟
dept_name	string	否	部门 示例：销管二部
terminal	string	否	终端 示例：1752607559051640837
dept	string	否	部门 示例：1686611804523331586
bustype	string	否	交易类型 示例：1737161714193924100
taskTransType_bustype	string	否	任务交易类型 示例：1737161714193924100
taskTransType_isAllowRollOut	boolean	否	是否转出 示例：true
createTime	string	否	创建时间 示例：2024-06-24 09:22:18
allowInvalid	boolean	否	允许作废 示例：true
allComplete	boolean	否	全部完成 示例：true
showHistoricalDynamic	boolean	否	展示历史动态 示例：false

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"taskExecutorList": [
			{
				"endDate": "2024-06-24 23:59:59",
				"excutorDefineCharacter__id": "2027157029835505667",
				"executor_name": "郝娟",
				"executeStatus": 3,
				"acceptTime": "2024-06-24 09:27:30",
				"completeTime": "2024-06-24 09:27:15",
				"acceptStatus": 1,
				"reformStatus": 0,
				"delayStatus": false,
				"executor_userId": "1815674128661217286",
				"executor": "1815673965450887175",
				"isUnlock": true,
				"id": "2027157029835505666",
				"excutorDefineCharacter": {
					"ytenant": "0000LFHZ398A0HRH1D0000",
					"id": "2027157029835505667",
					"pubts": "2024-06-24 09:22:19"
				},
				"taskId": "2027157029835505665",
				"followRecordList": [
					""
				],
				"followRecordName": "跟进记录",
				"visitSummaryList": [
					{
						"reviewReuslt": 2,
						"terminalName": "测试移交终端02",
						"code": "20240624140149",
						"id": "2027158232433688582",
						"reformStatus": 0,
						"taskId_terminal": "1752607559051640837"
					}
				],
				"visitSummaryName": "拜访小结"
			}
		],
		"endDate": "2024-06-24 23:59:59",
		"taskTransType_associationBusinessObject": "5",
		"taskTransType_isCheckAndAccept": true,
		"taskTransType_isExecutorDefaultMe": true,
		"id": "2027157029835505665",
		"curStaff": "1689505650425987078",
		"longitude": 116.408024,
		"ower": "1815673965450887175",
		"isWfControlled": false,
		"saleArea": "1862406568312045571",
		"planTask": false,
		"visitType": 1,
		"terminal_name": "测试移交终端02",
		"isAllowAcceptAndReject": true,
		"auditTime": "2024-06-24 09:22:19",
		"taskTransType": "1737162255332016130",
		"circleTask": false,
		"startDate": "2024-06-24 00:00:00",
		"obsoleteStatus": 0,
		"verifystate": 2,
		"code": "202406240821514",
		"taskTransType_actionTransTypeBustypeName": "终端拜访",
		"taskTransType_name": "终端任务",
		"latitude": 39.913082,
		"taskTransType_isAutoComplete": false,
		"originator": "1815673965450887175",
		"ower_name": "郝娟",
		"originator_name": "郝娟",
		"taskTransType_actionTransTypeBustype": "1685227356189885919",
		"taskTransType_autoLockVisitor": true,
		"pubts": "2024-06-24 09:22:19",
		"org_name": "集团",
		"partnerExecute": false,
		"createDate": "2024-06-24 00:00:00",
		"auditDate": "2024-06-24 00:00:00",
		"taskTransType_actionTransType": "1692571509745254403",
		"creator": "昵称-郝娟",
		"org": "1686561321477734406",
		"saleArea_name": "区域11501",
		"auditor": "昵称-郝娟",
		"dept_name": "销管二部",
		"terminal": "1752607559051640837",
		"dept": "1686611804523331586",
		"bustype": "1737161714193924100",
		"taskTransType_bustype": "1737161714193924100",
		"taskTransType_isAllowRollOut": true,
		"createTime": "2024-06-24 09:22:18",
		"allowInvalid": true,
		"allComplete": true,
		"showHistoricalDynamic": false
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
	1	2025-06-25	
更新
请求参数 bustype

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

