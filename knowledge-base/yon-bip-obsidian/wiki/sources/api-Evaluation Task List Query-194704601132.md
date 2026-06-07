---
title: "评价任务列表查询"
apiId: "1947046011323023364"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Evaluation Task"
domain: "PROSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Evaluation Task]
platform_version: "BIP"
source_type: community-api-docs
---

# 评价任务列表查询

>  请求方式	POST | Evaluation Task (PROSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/api/evaluateapply/queryEvaluateApplyData
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
pageIndex	number
小数位数:0,最大长度:10	否	是	页码 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	每页显示数量 默认值：10
applyOrgId	string	否	否	申请组织id
status	string	否	否	单据状态 状态枚举【0：待发布 1：打分中 2：已废弃 3：已完成 4：取消邀请 5：审批中 6：已汇总】
businessStartDate	date
格式:yyyy-MM-dd	否	否	业务开始日期
businessEndDate	date
格式:yyyy-MM-dd	否	否	业务截止日期
evaStartDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	任务开始时间
evaEndDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	任务结束时间

## 3. 请求示例

Url: /yonbip/cpu/api/evaluateapply/queryEvaluateApplyData?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"applyOrgId": "",
	"status": "",
	"businessStartDate": "2026-06-07",
	"businessEndDate": "2026-06-07",
	"evaStartDate": "2026-06-07 13:06:10",
	"evaEndDate": "2026-06-07 13:06:10"
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
code	string	否	状态码 示例：200
message	string	否	查询状况描述 示例：查询成功
data	object	否	返回的数据
pageIndex	long	否	页码 示例：0
pageSize	long	否	pageSize 示例：1
recordCount	long	否	recordCount 示例：1
recordList	object	是	查询出的数据集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 1,
		"recordCount": 1,
		"recordList": [
			{
				"id": "",
				"parentApplyId": "",
				"rootApplyId": "",
				"applyTitle": "",
				"code": "",
				"applyPsnId_name": "",
				"applyPsnId": "",
				"applyOrgId_name": "",
				"applyOrgId": "",
				"chargeOrgId_name": "",
				"chargeOrgId": "",
				"evaAutoDuration": "",
				"evaAutoYear": "",
				"evaAutoSeason": "",
				"evaAutoMonth": "",
				"businessStartDate": "2026-06-07",
				"businessEndDate": "2026-06-07",
				"applyDate": "2026-06-07",
				"evaStartDate": "2026-06-07 13:06:10",
				"evaEndDate": "2026-06-07 13:06:10",
				"evaWeightType": "",
				"summaryRule": "",
				"supSynergy": "",
				"evaObjectType": "",
				"evaBillNum": "",
				"evaAbilityId_name": "",
				"evaAbilityId": "",
				"evaStandard": "",
				"enableIndClassWeight": "",
				"evaOrgType": "",
				"evaIndicatorType": "",
				"memo": "",
				"fileId": "",
				"status": "",
				"isRoot": "",
				"trasferName": "",
				"evaObjectRef": "",
				"materialRef": "",
				"materialClassRef": "",
				"verifystate": "",
				"returncount": "",
				"isWfControlled": "",
				"auditor": "",
				"auditTime": "2026-06-07 13:06:10",
				"isBizLeaderForMe": "",
				"chargePsnId": "",
				"isAutomaticSyn": "",
				"evaObjectList": {
					"id": "",
					"evaApplyId": "",
					"objectType": "",
					"objectBillNum": "",
					"objectBillId": "",
					"supplyDocId_code": "",
					"supplyDocId_name": "",
					"supplyDocId": "",
					"materialClass_code": "",
					"materialClass_name": "",
					"materialClass": "",
					"material_code": "",
					"material_name": "",
					"material": "",
					"vendorTenant": ""
				},
				"evaOrgList": {
					"id": "",
					"evaApplyId": "",
					"evaOrgId_name": "",
					"evaOrgId": "",
					"evaOrgPsnId_name": "",
					"evaOrgPsnId": "",
					"memo": "",
					"weight": "",
					"agentPublish": "",
					"status": "",
					"downApplyId": "",
					"sum": ""
				},
				"evaIndicatorList": {
					"id": "",
					"evaApplyId": "",
					"indicatorClassId_name": "",
					"indicatorClassId": "",
					"indicatorId_name": "",
					"indicatorId": "",
					"indicatorType": "",
					"indicatorDes": "",
					"indicatorScoreStd": "",
					"vetoItem": "",
					"vetoItemScore": "",
					"reduce": "",
					"weight": "",
					"indicatorMaxScore": "",
					"isRequired": "",
					"isPartake": "",
					"evaMemberList": "",
					"indClassWeight": "",
					"indClassWeightType": ""
				},
				"evaExtraList": {
					"id": "",
					"evaApplyId": "",
					"extraItem": "",
					"type": "",
					"memo": ""
				}
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-10	
更新
请求说明
更新
请求参数 status

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

