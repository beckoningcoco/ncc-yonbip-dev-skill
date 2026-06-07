---
title: "查询会议室某日占用情况"
apiId: "2541666632596455429"
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

# 查询会议室某日占用情况

>  请求方式	GET | Meeting Management (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/meeting/checkMeetingInformation
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
pageSize	int	query	是	分页大小    示例: 200
pageNum	int	query	是	分页页码    示例: 1
date	long	query	是	当天时间戳
startTimeStamp	long	query	否	开始时间戳
endTimeStamp	long	query	否	结束时间戳
typeIds	string	query	否	会议室类型ID列表
locationIds	string	query	否	会议室地点ID列表
capacity	int	query	否	会议室容纳人数
meetingRoomName	string	query	否	会议室名称
isNeedFilter	boolean	query	否	是否按时间过滤    示例: false    默认值: false

## 3. 请求示例

Url: /yonbip/SCCC/meeting/checkMeetingInformation?access_token=访问令牌&pageSize=200&pageNum=1&date=&startTimeStamp=&endTimeStamp=&typeIds=&locationIds=&capacity=&meetingRoomName=&isNeedFilter=false

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
code	int	否	返回码，调用成功时返回0 示例：0
data	object	否	调用成功时的返回数据
list	object	是	会议室列表
count	int	否	会议室总数

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"list": [
			{
				"id": "",
				"name": "",
				"typeId": "",
				"typeName": "",
				"capacity": 0,
				"state": 0,
				"commonBelongOrgId": "",
				"belongOrgName": "",
				"locationId": "",
				"locationName": "",
				"address": "",
				"charge": 0,
				"introduction": "",
				"range": "",
				"enableContainChild": "",
				"sortNumber": 0,
				"qrCodeKey": "",
				"qrCodeUrl": "",
				"fileListId": "",
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
					{
						"commonOrgId": "",
						"orgName": ""
					}
				],
				"commonRangePersons": "",
				"commonRangePersonList": [
					{
						"commonUserId": "",
						"userName": ""
					}
				],
				"serverUserList": [
					{
						"commonUserId": "",
						"userName": ""
					}
				],
				"serverList": [
					{
						"meetingRoomId": "",
						"commonUserId": "",
						"userName": ""
					}
				],
				"timePeriods": [
					{
						"beginTime": "",
						"endTime": "",
						"beginTimeLong": 0,
						"endTimeLong": 0,
						"indexAdd": 0,
						"meetingId": "",
						"meetingSubject": "",
						"widthstate": 0,
						"flag": 0,
						"ownerId": "",
						"ownerName": "",
						"ownerDeptName": "",
						"user": {},
						"attendPerson": true,
						"approveResult": 0
					}
				],
				"isApprove": 0,
				"approvedId": "",
				"meetingList": [
					{}
				],
				"startTimeStamp": 0,
				"endTimeStamp": 0,
				"templateId": "",
				"bustype": "",
				"isEnableOldMeetingTemplate": true,
				"isOften": true,
				"conflict": 0,
				"manageOrg": "",
				"deploymentArea": "",
				"timeScope": 0,
				"commonTenantId": "",
				"creator": "",
				"createTime": "",
				"modifier": "",
				"modifyTime": "",
				"pubts": "",
				"dr": 0,
				"ytenantid": "",
				"preMeetingNoticeDetail": "",
				"useTypeCoordinatorSetting": true,
				"isPreEndingNotice": true,
				"isMeetingCancelNotice": true,
				"isStartTimeUpdateNotice": true,
				"isPreMeetingNotice": true
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

