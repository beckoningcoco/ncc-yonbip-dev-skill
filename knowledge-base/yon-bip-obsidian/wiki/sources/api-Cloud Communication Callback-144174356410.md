---
title: "云通信回调"
apiId: "1441743564106629120"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "History"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, History]
platform_version: "BIP"
source_type: community-api-docs
---

# 云通信回调

>  请求方式	POST | History (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/gscm/csp/api/call/record
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
telA	string	否	是	真实号码 示例：13716035819
telX	string	否	是	小号号码X 示例：13086645426
telB	string	否	是	对端号码 示例：18479716081
callType	long	否	否	呼叫类型（针对A号码）0：通话主叫 1：通话被叫 示例：0
startTime	string	否	是	发起呼叫时间 格式: yyyy-MM-dd HH:mm:ss 示例：2022-08-03 17:35:44
ringingTime	string	否	否	振铃时间 格式: yyyy-MM-dd HH:mm:ss 示例：2022-08-03 17:35:45
talkingTime	string	否	否	通话时间 格式: yyyy-MM-dd HH:mm:ss 示例：2022-08-03 17:35:50
hangupTime	string	否	是	通话结束时间 格式: yyyy-MM-dd HH:mm:ss 示例：2022-08-03 17:35:59
callId	string	否	是	通话id 示例：CHB2208031735440A21184203358991
hangupCause	string	否	否	释放方向 1表示主叫， 2表示被叫， 0 表示平台释放 示例：2
releaseCause	string	否	否	释放原因 示例：正常呼叫拆线
ringingRecordUrl	string	否	否	振铃录音地址 示例：http://yonyou-yytx-cloud.oss-cn-beijing.aliyuncs.com/xnum/20220803/ringing/CHB2208031735440A21184203358990.mp3
recordUrl	string	否	否	接通录音地址 示例：http://yonyou-yytx-cloud.oss-cn-beijing.aliyuncs.com/xnum/20220803/CHB2208031735440A21184203358990.mp3
outId	string	否	否	设置被叫号码接口客户传过来的ID 示例：clue|1529217548229279751|2603881046206976

## 3. 请求示例

Url: /yonbip/crm/gscm/csp/api/call/record?access_token=访问令牌
Body: {
	"telA": "13716035819",
	"telX": "13086645426",
	"telB": "18479716081",
	"callType": 0,
	"startTime": "2022-08-03 17:35:44",
	"ringingTime": "2022-08-03 17:35:45",
	"talkingTime": "2022-08-03 17:35:50",
	"hangupTime": "2022-08-03 17:35:59",
	"callId": "CHB2208031735440A21184203358991",
	"hangupCause": "2",
	"releaseCause": "正常呼叫拆线",
	"ringingRecordUrl": "http://yonyou-yytx-cloud.oss-cn-beijing.aliyuncs.com/xnum/20220803/ringing/CHB2208031735440A21184203358990.mp3",
	"recordUrl": "http://yonyou-yytx-cloud.oss-cn-beijing.aliyuncs.com/xnum/20220803/CHB2208031735440A21184203358990.mp3",
	"outId": "clue|1529217548229279751|2603881046206976"
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
code	string	否	code 示例：200
message	string	否	message
data	object	否	data
retCode	long	否	retCode 示例：200
retMsg	string	否	retMsg 示例：CHB2208031735440A21184203358991
data	string	否	data

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"retCode": 200,
		"retMsg": "CHB2208031735440A21184203358991",
		"data": ""
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
999	虚拟电话未绑定	绑定虚拟电话

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
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

