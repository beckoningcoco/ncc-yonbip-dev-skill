---
title: "查询视频会议录制信息"
apiId: "2541667251071746056"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Meeting Management"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Meeting Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询视频会议录制信息

>  请求方式	GET | Meeting Management (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/meeting/video/record/info
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
videoMeetingId	string	query	是	视频会议录制文件ID    示例: video1
tenant	string	query	否	目标租户ID    示例: tenant1

## 3. 请求示例

Url: /yonbip/SCCC/meeting/video/record/info?access_token=访问令牌&videoMeetingId=video1&tenant=tenant1

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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	接口返回消息 示例：操作成功
data	object	否	调用成功时的返回数据
meetingInfo	object	否	视频会议信息
recordFileInfo	object	否	录制文件信息
fileUrl	string	否	录制文件访问地址
status	int	否	录制文件权限状态
canRequestPower	boolean	否	是否可以请求权限

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"meetingInfo": {
			"meetingId": "",
			"subMeetingId": "",
			"meetingCode": "",
			"creator": "",
			"creatorName": ""
		},
		"recordFileInfo": {
			"id": "",
			"meetingRecordId": "",
			"status": 0,
			"recordFileId": "",
			"recordFileName": "",
			"recordType": 0,
			"recordStartTime": "",
			"recordEndTime": "",
			"recordSize": 0,
			"fileId": "",
			"smartFullSummary": "",
			"smartTopics": "",
			"smartMinuteChapter": "",
			"smartMinuteSubject": "",
			"smartMinuteSpeaker": "",
			"smartTodo": [
				""
			],
			"smartSpeaker": "",
			"smartChapter": "",
			"smartTranscript": ""
		},
		"fileUrl": "",
		"status": 0,
		"canRequestPower": true
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

