---
title: "查询我预定的会议"
apiId: "2552186811399536640"
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

# 查询我预定的会议

>  请求方式	GET | Meeting Management (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/meeting/myOrderMeeting
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
pageNum	int	query	是	页码    示例: 1
pageSize	int	query	是	每页数量    示例: 20
startDate	long	query	否	开始时间戳    示例: 1767225600000
endDate	long	query	否	结束时间戳    示例: 1767311999000
isOnlineType	int	query	否	是否视频会议，0-全部，1-包含，2-不包含    示例: 0    默认值: 0
state	int	query	否	会议状态，0-未开始，1-进行中，2-已结束，3-已取消，4-待审批，5-全部    示例: 5    默认值: 5

## 3. 请求示例

Url: /yonbip/SCCC/meeting/myOrderMeeting?access_token=访问令牌&pageNum=1&pageSize=20&startDate=1767225600000&endDate=1767311999000&isOnlineType=0&state=5

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
list	object	是	会议列表
count	long	否	会议总数

## 5. 正确返回示例

{
	"code": "0",
	"data": {
		"list": [
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
				"rolePersonJson": "",
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
				"thirdBusinessBillId": "",
				"cancelReason": "",
				"endReason": ""
			}
		],
		"count": 0
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

