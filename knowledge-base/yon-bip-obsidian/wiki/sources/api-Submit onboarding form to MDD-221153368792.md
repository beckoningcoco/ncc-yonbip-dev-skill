---
title: "入职单提交MDD"
apiId: "2211533687921049609"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "On-boarding Service Center"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, On-boarding Service Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 入职单提交MDD

>  请求方式	POST | On-boarding Service Center (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/bill/hrentrysubmit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
serviceCode	string	query	否	入职单据的serviceCode    默认值: HRRZMD120
Body参数
名称	类型	数组	必填	描述
data	object	否	是	数据结构体
billId	string	否	是	入职单据id 示例：2211529221243142155 默认值：2211529221243142155

## 3. 请求示例

Url: /yonbip/hrcloud/bill/hrentrysubmit?access_token=访问令牌&serviceCode=
Body: {
	"data": {
		"billId": "2211529221243142155"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：1
deptName	string	否	部门名称 示例：BM01
bizFlowId	string	否	业务流ID 示例：-1
creatorId	string	否	制单人 示例：2199534743395500035
creatorName	string	否	creatorName 示例：宋心宜
orgId	string	否	组织 示例：2157786647661903882
lackFileFlag	boolean	否	缺少入职材料标记 示例：true
handleStatus	number
小数位数:0,最大长度:10	否	入职办理状态 示例：0
id	string	否	id 示例：2211529221243142155
bizFlowName	string	否	业务流名称 示例：--
transtypeId	string	否	入职类型id 示例：2157784482984230975
pubts	string	否	时间戳 示例：2025-02-27 19:31:39
email	string	否	邮箱 示例：gaoang202502271930@163.com
fastAudit	boolean	否	是否一键入职 示例：false
orgName	string	否	组织 示例：ZY一级组织
transtypeId_name	string	否	入职类型 示例：正式员工入职
isWfControlled	boolean	否	是否审批流控制 示例：true
deptId	string	否	部门Id 示例：2157786759331053573
mobile	string	否	手机号 示例：+86-15094054567
beginDate	string	否	预计入职日期 示例：2025-03-06 00:00:00
processOrder	string	否	入职采集顺序 示例：2
certNo	string	否	证件号 示例：gaoang202502271930
candidateName	string	否	候选人名称 示例：高昂先入职后采集202502271930
createTime	string	否	创建时间 示例：2025-02-27 19:31:27
candidateIdEntrySchemeId	string	否	入职方案id 示例：2157784852378681402
singleMode	number
小数位数:0,最大长度:10	否	转单模式 示例：2
psnclIdName	string	否	员工类别 示例：自有员工
candidateId	string	否	候选人Id 示例：2211529221252055046
processOpen	boolean	否	processOpen 示例：true
siginTcFlag	boolean	否	是否签署电子合同 示例：true
source	number
小数位数:0,最大长度:10	否	来源渠道 示例：4
dr	number
小数位数:0,最大长度:10	否	是否删除标记 0 未删除 1 已删除 示例：0
creator	string	否	创建人 示例：46604c87-7f90-4482-9b31-3e93bf51e6ad
ytenant	string	否	租户id 示例：0000M4RSE1KWA6CXS30000
enableCollection	boolean	否	是否采集信息 示例：true
submitdate	string	否	submitdate 示例：2025-02-27 00:00:00
mobileBillNo	string	否	移动端BillNo 示例：hr_entry_edit_cardMobileArchive
mobileBillType	string	否	mobileBillType 示例：yyarchive
status	number
小数位数:0,最大长度:10	否	status 示例：3
code	string	否	单据编号 示例：RZD250227001
submitResponse	object	否	submitResponse
traceId	string	否	traceId 示例：240bf3e98ff2ddc7
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"returncount": 0,
		"verifystate": 1,
		"deptName": "BM01",
		"bizFlowId": "-1",
		"creatorId": "2199534743395500035",
		"creatorName": "宋心宜",
		"orgId": "2157786647661903882",
		"lackFileFlag": true,
		"handleStatus": 0,
		"id": "2211529221243142155",
		"bizFlowName": "--",
		"transtypeId": "2157784482984230975",
		"pubts": "2025-02-27 19:31:39",
		"email": "gaoang202502271930@163.com",
		"fastAudit": false,
		"orgName": "ZY一级组织",
		"transtypeId_name": "正式员工入职",
		"isWfControlled": true,
		"deptId": "2157786759331053573",
		"mobile": "+86-15094054567",
		"beginDate": "2025-03-06 00:00:00",
		"processOrder": "2",
		"certNo": "gaoang202502271930",
		"candidateName": "高昂先入职后采集202502271930",
		"createTime": "2025-02-27 19:31:27",
		"candidateIdEntrySchemeId": "2157784852378681402",
		"singleMode": 2,
		"psnclIdName": "自有员工",
		"candidateId": "2211529221252055046",
		"processOpen": true,
		"siginTcFlag": true,
		"source": 4,
		"dr": 0,
		"creator": "46604c87-7f90-4482-9b31-3e93bf51e6ad",
		"ytenant": "0000M4RSE1KWA6CXS30000",
		"enableCollection": true,
		"submitdate": "2025-02-27 00:00:00",
		"mobileBillNo": "hr_entry_edit_cardMobileArchive",
		"mobileBillType": "yyarchive",
		"status": 3,
		"code": "RZD250227001",
		"submitResponse": {
			"id": "689154c0-f4fe-11ef-aa1b-86078e4704fb",
			"businessKey": "hr_entry_edit_card_2211529221243142155",
			"processDefinitionId": "processcenter_9e508d72:16:79d35b3e-f420-11ef-b9c7-9a13c8e017d3",
			"startTime": "2025-02-27 19:31:38",
			"startUserId": "46604c87-7f90-4482-9b31-3e93bf51e6ad",
			"variables": [
				""
			],
			"tenantId": "0000M4RSE1KWA6CXS30000_HREM",
			"name": "入职办理RZD250227001",
			"hasTaskFinished": false,
			"withdrawAll": false,
			"source": "HREM",
			"bpmCallbackRequestTs": 1740655898915
		}
	},
	"traceId": "240bf3e98ff2ddc7",
	"uploadable": "0"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	未找到流程定义,请检查单据对应交易类型、单据类型和组织下是否存在对应的流程模型	

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

