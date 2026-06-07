---
title: "拜访小结保存"
apiId: "2293037675957977091"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Visit Summary"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Visit Summary]
platform_version: "BIP"
source_type: community-api-docs
---

# 拜访小结保存

>  请求方式	POST | Visit Summary (CRM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/MCC/visitsummary/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
org	string	否	是	销售组织 示例：2230865567759204354
id	string	否	否	拜访小结id 示例：14234234354354
bustype	string	否	是	交易类型 示例：2271533109819736071
code	string	否	否	小结单号 示例：20250522000004
taskId	string	否	否	任务id 示例：2273778870932996103
actionId	string	否	否	行动id 示例：42348678678634556
summary	string	否	否	拜访总结 示例：拜访总结
ower	string	否	是	执行人 示例：2247628369844240386
dept	string	否	是	所属部门 示例：2232042543417131010
saleArea	string	否	否	销售区域 示例：224354465465546
auditor	string	否	否	审批人 示例：钦丽萍
auditTime	string	否	否	审批时间 示例：2025-06-17 15:02:35
reviewReuslt	string	否	否	检核状态 示例：2（0不合格 1合格 2待检核）
checkDate	string	否	否	最近检核日期 示例：2025-06-17 15:02:35
reviewScore	string	否	否	检核评分 示例：10
reviewScoreDesc	string	否	否	评分说明 示例：评分说明
reviewScorer	string	否	否	评分人 示例：1884702611124256781
reviewScoreTime	string	否	否	评分时间 示例：2025-06-17 15:02:35
unqualifiedReason	string	否	否	不合格原因 示例：不合格原因
unqualifiedDescription	string	否	否	检核结果 示例：检核结果说明
reformStatus	string	否	否	整改状态 示例：0（0不需整改 1待整改 2已整改）
rectifyMethod	string	否	否	整改方式 示例：0（0原单整改 1现场整改）
reformSummaryCode	string	否	否	整改小结单号 示例：20240506088
srcSummaryCode	string	否	否	整改来源 示例：2024050609990
srcUnqualifiedDescription	string	否	否	整改原因 示例：整改原因
nextTaskDate	string	否	否	下次拜访日期 示例：2025-06-17 15:02:35
reformDesc	string	否	否	整改要求 示例：整改要求
visitSummaryDisplay	object	是	否	visitSummaryDisplay
_status	string	否	是	保存类型 Insert:新增 Update:更新 示例：Insert

## 3. 请求示例

Url: /yonbip/MCC/visitsummary/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"org": "2230865567759204354",
		"id": "14234234354354",
		"bustype": "2271533109819736071",
		"code": "20250522000004",
		"taskId": "2273778870932996103",
		"actionId": "42348678678634556",
		"summary": "拜访总结",
		"ower": "2247628369844240386",
		"dept": "2232042543417131010",
		"saleArea": "224354465465546",
		"auditor": "钦丽萍",
		"auditTime": "2025-06-17 15:02:35",
		"reviewReuslt": "2（0不合格 1合格 2待检核）",
		"checkDate": "2025-06-17 15:02:35",
		"reviewScore": "10",
		"reviewScoreDesc": "评分说明",
		"reviewScorer": "1884702611124256781",
		"reviewScoreTime": "2025-06-17 15:02:35",
		"unqualifiedReason": "不合格原因",
		"unqualifiedDescription": "检核结果说明",
		"reformStatus": "0（0不需整改 1待整改 2已整改）",
		"rectifyMethod": "0（0原单整改 1现场整改）",
		"reformSummaryCode": "20240506088",
		"srcSummaryCode": "2024050609990",
		"srcUnqualifiedDescription": "整改原因",
		"nextTaskDate": "2025-06-17 15:02:35",
		"reformDesc": "整改要求",
		"visitSummaryDisplay": [
			{
				"id": "",
				"displayId": "2273760230758154241",
				"reviewResult": "2（0 不合格 1合格 2待检核）",
				"reviewScore": "10",
				"_status": "Insert"
			}
		],
		"_status": "Insert"
	}
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
reviewReuslt	number
小数位数:0,最大长度:10	否	检核结果 示例：2
displayPicture	string	否	陈列照片id 示例：3548fd12-9ee8-46fd-8fbc-28d00a696f9c
dept_code	string	否	部门编码 示例：XG01
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
code	string	否	小结编码 示例：20241017000036
bustype_name	string	否	交易类型名称 示例：拜访小结
modifier	string	否	修改人 示例：昵称-王天驰
taskId_code	string	否	任务编码 示例：2024101700353
reformStatus	number
小数位数:0,最大长度:10	否	整改状态 示例：0
visitsummaryDefineCharacter	object	否	拜访小结特征
ower_name	string	否	负责人名称 示例：王天驰
modifyTime	string	否	修改时间 示例：2024-11-01 14:33:52
id	string	否	小结id 示例：2112613461453176841
pubts	string	否	时间戳 示例：2024-11-21 09:52:22
org_name	string	否	组织名称 示例：集团
bustype_code	string	否	交易类型编码 示例：00003
ower	string	否	负责人 示例：1997633141071151107
creator	string	否	创建人 示例：昵称-李亚苹
org	string	否	组织id 示例：1731890672499687429
isWfControlled	boolean	否	是否审批流空值 示例：false
visitsummaryDefineCharacter__id	string	否	小结特征id 示例：2112613461453176843
visitsummaryDefineCharacter__CRM_RE_name	string	否	小结特征名称 示例：保密协议
dept_name	string	否	部门名称 示例：销管一部
dept	string	否	部门id 示例：1731890870066610181
bustype	string	否	交易类型 示例：2096947516686204938
visitSummaryDisplay	object	是	visitSummaryDisplay
createTime	string	否	创建时间 示例：2024-10-17 12:49:36
actionId	string	否	行动id 示例：2112612301812006919
customer_name	string	否	客户名称 示例：iutiut-1
org_code	string	否	组织编码 示例：JT01
taskId	string	否	任务id 示例：2112611923854884872
customer	string	否	客户id 示例：1809230509376012289

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"reviewReuslt": 2,
		"displayPicture": "3548fd12-9ee8-46fd-8fbc-28d00a696f9c",
		"dept_code": "XG01",
		"verifystate": 0,
		"code": "20241017000036",
		"bustype_name": "拜访小结",
		"modifier": "昵称-王天驰",
		"taskId_code": "2024101700353",
		"reformStatus": 0,
		"visitsummaryDefineCharacter": {
			"ytenant": "0000LHR4YIYV6I9O1T0000",
			"id": "2112613461453176843"
		},
		"ower_name": "王天驰",
		"modifyTime": "2024-11-01 14:33:52",
		"id": "2112613461453176841",
		"pubts": "2024-11-21 09:52:22",
		"org_name": "集团",
		"bustype_code": "00003",
		"ower": "1997633141071151107",
		"creator": "昵称-李亚苹",
		"org": "1731890672499687429",
		"isWfControlled": false,
		"visitsummaryDefineCharacter__id": "2112613461453176843",
		"visitsummaryDefineCharacter__CRM_RE_name": "保密协议",
		"dept_name": "销管一部",
		"dept": "1731890870066610181",
		"bustype": "2096947516686204938",
		"visitSummaryDisplay": [
			{
				"visitSummaryId": "2112613461453176841",
				"display_code": "CL0002",
				"display_standard": "10",
				"reviewResult": 2,
				"id": "2112613461453176842",
				"displayId": "2018571003561508869",
				"display_name": "213213"
			}
		],
		"createTime": "2024-10-17 12:49:36",
		"actionId": "2112612301812006919",
		"customer_name": "iutiut-1",
		"org_code": "JT01",
		"taskId": "2112611923854884872",
		"customer": "1809230509376012289"
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-14	
更新
请求说明
新增
请求参数 id

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

