---
title: "查询用户未完成环节的前加签已办"
apiId: "2024227527131660293"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Process Instance"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Process Instance]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询用户未完成环节的前加签已办

>  请求方式	POST | Process Instance (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/openapi/query/ext/sigin/tasks
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
assignee	string	否	是	待查询的人员id 示例：49f47a52-37d3-42c4-9b85-16cdc20a3009
tenantId	string	否	否	租户iD

## 3. 请求示例

Url: /yonbip/digitalModel/openapi/query/ext/sigin/tasks?access_token=访问令牌
Body: {
	"assignee": "49f47a52-37d3-42c4-9b85-16cdc20a3009",
	"tenantId": ""
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：查询成功
data	object	否	返回数据
data	object	是	任务基本数据
size	long	否	默认返回长度 示例：1
start	long	否	分页起始任务数 示例：0
errmsg	string	否	code 示例：ok
displayCode	string	否	业务异常码 示例：000-530-000001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": {
		"data": [
			{
				"processDefinitionId": "processcenter_43616623:19:cf3cedf4-e54a-11ec-9b55-de3969bc08a8",
				"processInstanceId": "dfaf97ce-e54a-11ec-9b55-de3969bc08a8",
				"deleteReason": "COUNTERSIGN_CREATE",
				"processFinished": false,
				"executionId": "e37333d2-e568-11ec-940a-ca054978de9d",
				"taskDefinitionKey": "approveUserTask_41dcaa33304dc811732fe851a9972af4",
				"processName": "用户名称-ws2提交的前加签测试表单0628",
				"name": "5",
				"startTime": 1654499920000,
				"assignee": "aaf776ea-2d60-4855-8234-daa913f6d3eb",
				"endTime": 1654499920000,
				"category": "developplatform.567aa7a5",
				"mUrl": "https://bip-test.yonyoucloud.com/yonbip-ec-iform/esn/sso/redirect?code=${esncode}&qzId=18637&processDefinitionId=iform_adbdd8fadc:3:15917871-1f29-11ef-8236-62d6025fc923&processInstanceId=37531ece-2171-11ef-b3f9-f236dde446c6&formId=0731c4791d5849afae4f0425",
				"webUrl": "https://bip-test.yonyoucloud.com/yonbip-ec-iform/esn/sso/redirect?code=${esncode}&qzId=18637&processDefinitionId=iform_adbdd8fadc:3:15917871-1f29-11ef-8236-62d6025fc923&processInstanceId=37531ece-2171-11ef-b3f9-f236dde446c6&formId=0731c4791d5849afae4f0425"
			}
		],
		"size": 1,
		"start": 0,
		"errmsg": "ok",
		"displayCode": "000-530-000001",
		"level": 0
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
000-530-000001
	租户信息不能为空	
000-530-000003
	参数不能全部为空	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
30009	出现严重错误，流程无法继续流转	请检查入参是否正确
310071	接口调用失败，任务查询失败	请检查入参是否正确
30000	获取的参数为空	请检查入参是否正确

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-03	
新增
返回参数 displayCode
新增
返回参数 level

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

