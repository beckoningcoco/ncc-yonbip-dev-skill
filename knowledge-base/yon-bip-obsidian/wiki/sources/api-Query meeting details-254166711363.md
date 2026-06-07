---
title: "查询会议详情"
apiId: "2541667113632792576"
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

# 查询会议详情

>  请求方式	GET | Meeting Management (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/meeting/getMeeting
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
meetingId	string	query	否	会议

## 3. 请求示例

Url: /yonbip/SCCC/meeting/getMeeting?access_token=访问令牌&meetingId=

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
code	string	否	返回码，调用成功时返回0 示例：0
data	object	否	调用成功时的返回数据
meeting	object	否	会议详情
periodMeeting	object	否	周期会议数据
enableRole	int	否	是否启用会议角色
roleName	string	否	会议角色名称
actualAttend	int	否	实际参会人数
mustAttend	int	否	应参会人数
noAttend	int	否	未参会人数
noRead	int	否	未读人数
read	int	否	已读人数
attendMeeting	int	否	参加会议人数
noAttendMeeting	int	否	未参加会议人数
meetingRoom	object	否	会议室信息
meetingRoomApprovedId	string	否	会议室审批ID
processRateUrl	string	否	审批进度查看地址
businessKey	string	否	新审批架构业务KEY

## 5. 正确返回示例

{
	"code": "0",
	"data": {
		"meeting": {
			"id": "",
			"creator": "",
			"createTime": "",
			"modifier": "",
			"modifyTime": "",
			"pubts": "",
			"dr": 0,
			"ytenantid": "",
			"commonTenantId": "",
			"commonOwnerId": "",
			"subject": "",
			"meetingRoomId": "",
			"meetingRoomName": "",
			"meetingTime": "",
			"startTime": "",
			"endTime": "",
			"content": "",
			"approveResult": 0,
			"state": 0,
			"personAmount": 0,
			"isSendMail": 0,
			"price": 0,
			"signState": 0,
			"dynamicQRCode": 0,
			"payType": 0,
			"billId": "",
			"approvedId": "",
			"videoNumber": "",
			"meetingCode": "",
			"onlineType": 0,
			"videoMeetingType": 0,
			"ykjVideoMeetingType": 0,
			"zhumuMeetingUUID": "",
			"zhumuMeetingId": "",
			"zhumuPassword": "",
			"zhumuJoinUrl": "",
			"zhumuStartUrl": "",
			"videoSubMeetingId": "",
			"otherVideoMeetingUrl": "",
			"freeEndTime": "",
			"meetingOrigin": 0,
			"periodMeetingId": "",
			"meetingTemplateInstanceId": "",
			"fileListId": "",
			"createFrom": 0,
			"isPeriodMeeting": 0,
			"periodStartDate": "",
			"periodEndDate": "",
			"periodRule": 0,
			"number": 0,
			"calendarType": 0,
			"repeatDetail": "",
			"meetingDates": [
				""
			],
			"persons": "",
			"personList": [
				{
					"id": "",
					"creator": "",
					"createTime": "",
					"modifier": "",
					"modifyTime": "",
					"pubts": "",
					"dr": 0,
					"ytenantid": "",
					"commonTenantId": "",
					"commonUserId": "",
					"meetingId": "",
					"userName": "",
					"state": 0,
					"addIndex": 0,
					"scanCodeTime": 0,
					"updateSummaryJurisdiction": 0,
					"isParticipant": 0,
					"isJoin": 0,
					"isRole": 0,
					"deptId": "",
					"rejectReason": "",
					"videoJoinTime": 0,
					"videoExitTime": 0,
					"phone": "",
					"deptName": "",
					"avatar": ""
				}
			],
			"rolePersonJson": "",
			"rolePersonIdList": [
				""
			],
			"rolePersonList": [
				{
					"id": "",
					"creator": "",
					"createTime": "",
					"modifier": "",
					"modifyTime": "",
					"pubts": "",
					"dr": 0,
					"ytenantid": "",
					"commonTenantId": "",
					"commonUserId": "",
					"meetingId": "",
					"userName": "",
					"state": 0,
					"addIndex": 0,
					"scanCodeTime": 0,
					"updateSummaryJurisdiction": 0,
					"isParticipant": 0,
					"isJoin": 0,
					"isRole": 0,
					"deptId": "",
					"rejectReason": "",
					"videoJoinTime": 0,
					"videoExitTime": 0,
					"phone": "",
					"deptName": "",
					"avatar": ""
				}
			],
			"fieldContent": "",
			"meetingTemplateRecordId": "",
			"remindArray": [
				0
			],
			"meetingRoomLocation": "",
			"priceTotal": 0,
			"ownerName": "",
			"person": 0,
			"personState": 0,
			"readState": true,
			"conflict": true,
			"startDateTime": 0,
			"endDateTime": 0,
			"meetingDateTime": 0,
			"personIds": [
				""
			],
			"meetingRoomType": "",
			"meetingRoomCapacity": 0,
			"meetingRoomTypeTime": 0,
			"activityId": "",
			"processDefinitionKey": "",
			"charge": 0,
			"createName": "",
			"imGroupId": "",
			"source": 0,
			"templateId": "",
			"webUrl": "",
			"url": "",
			"participants": [
				{}
			],
			"appointPersons": "",
			"meetingStartDateTime": "",
			"meetingEndDateTime": "",
			"isApprove": 0,
			"isServer": 0,
			"isOwner": 0,
			"ownerDeptName": "",
			"haveSummary": true,
			"extendFlag": true,
			"summaryName": "",
			"meetingDateTimeStr": "",
			"locationAndRoomName": "",
			"isSendMsg": true,
			"scene": "",
			"deptId": "",
			"bustype": "",
			"verifyState": "",
			"approveFlag": true,
			"participantFlg": true,
			"actualAttend": 0,
			"noAttend": 0,
			"mustAttend": 0,
			"noRead": 0,
			"read": 0,
			"noAttendMeeting": 0,
			"attendMeeting": 0,
			"videoBeginTime": 0,
			"videoEndTime": 0,
			"lastJoinVideoTime": 0,
			"videoDurationTime": 0,
			"meetingRoomTypeId": "",
			"request4Video": {},
			"tencentVideoSetting": {},
			"enableDocUploadPermission": true,
			"videoHosts": [
				{
					"userid": "",
					"yhtUserId": "",
					"userName": "",
					"isAnonymous": true,
					"nickName": ""
				}
			],
			"thirdBusinessBillId": "",
			"cancelReason": "",
			"endReason": ""
		},
		"periodMeeting": {
			"id": "",
			"creator": "",
			"createTime": "",
			"modifier": "",
			"modifyTime": "",
			"pubts": "",
			"dr": 0,
			"ytenantid": "",
			"commonTenantId": "",
			"periodStartDate": "",
			"periodEndDate": "",
			"periodRule": 0,
			"number": 0,
			"calendarType": 0,
			"repeatDetail": "",
			"periodStartTimeStamp": 0,
			"periodEndTimeStamp": 0,
			"meetingStartTimes": [
				0
			]
		},
		"enableRole": 0,
		"roleName": "",
		"actualAttend": 0,
		"mustAttend": 0,
		"noAttend": 0,
		"noRead": 0,
		"read": 0,
		"attendMeeting": 0,
		"noAttendMeeting": 0,
		"meetingRoom": {
			"id": "",
			"creator": "",
			"createTime": "",
			"modifier": "",
			"modifyTime": "",
			"pubts": "",
			"dr": 0,
			"ytenantid": "",
			"commonTenantId": "",
			"name": "",
			"typeId": "",
			"capacity": 0,
			"state": 0,
			"commonBelongOrgId": "",
			"locationId": "",
			"charge": 0,
			"introduction": "",
			"range": "",
			"enableContainChild": "",
			"sortNumber": 0,
			"qrCodeKey": "",
			"fileListId": "",
			"preMeetingNoticeDetail": "",
			"useTypeCoordinatorSetting": true,
			"isPreEndingNotice": true,
			"isMeetingCancelNotice": true,
			"isStartTimeUpdateNotice": true,
			"isPreMeetingNotice": true,
			"belongOrgName": "",
			"typeName": "",
			"qrCodeUrl": "",
			"locationName": "",
			"serverIds": "",
			"serverNames": "",
			"deviceIds": [
				""
			],
			"deviceNames": [
				""
			],
			"imgs": "",
			"commonRangeOrgs": "",
			"commonRangeOrgList": [
				{}
			],
			"commonRangePersons": "",
			"commonRangePersonList": [
				{}
			],
			"serverUserList": [
				{}
			],
			"serverList": [
				{}
			],
			"timePeriods": [
				{}
			],
			"isApprove": 0,
			"approvedId": "",
			"meetingList": [
				{}
			],
			"startTimeStamp": 0,
			"endTimeStamp": 0,
			"templateId": "",
			"address": "",
			"bustype": "",
			"isEnableOldMeetingTemplate": true,
			"isOften": true,
			"conflict": 0,
			"manageOrg": "",
			"deploymentArea": "",
			"timeScope": 0
		},
		"meetingRoomApprovedId": "",
		"processRateUrl": "",
		"businessKey": ""
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

