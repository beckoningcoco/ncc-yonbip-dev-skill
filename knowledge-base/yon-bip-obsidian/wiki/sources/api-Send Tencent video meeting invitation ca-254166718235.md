---
title: "发送腾讯视频会议邀请卡片"
apiId: "2541667182352269321"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Meeting Management"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Meeting Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 发送腾讯视频会议邀请卡片

>  请求方式	POST | Meeting Management (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/meeting/video/sendCard
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
meetingCode	string	否	否	会议 App 的呼入号码 示例：123456789
meetingId	string	否	否	腾讯会议 ID 示例：meeting-001
isPersonMeeting	boolean	否	否	是否为个人会议 示例：false 默认值：false
joinUrl	string	否	否	加入会议 URL（单击链接直接加入会议） 示例：https://meeting.tencent.com/join/example
imGroups	object	是	否	多个群聊
imGroupId	string	否	否	IM 群 ID 示例：im-group-001
imGroupName	string	否	否	群名称 示例：项目会议群
invitees	string	是	否	被邀请者，传递友户通 ID
tenantId	string	否	否	租户 ID 示例：tenant001
userId	string	否	否	邀请发起人用户 ID 示例：user001
inviteMessage	string	否	否	邀请时的留言 示例：请参加视频会议

## 3. 请求示例

Url: /yonbip/SCCC/meeting/video/sendCard?access_token=访问令牌
Body: {
	"meetingCode": "123456789",
	"meetingId": "meeting-001",
	"isPersonMeeting": false,
	"joinUrl": "https://meeting.tencent.com/join/example",
	"imGroups": [
		{
			"imGroupId": "im-group-001",
			"imGroupName": "项目会议群",
			"invitees": [
				""
			]
		}
	],
	"tenantId": "tenant001",
	"userId": "user001",
	"inviteMessage": "请参加视频会议"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据，本接口成功时无业务数据 示例：{}

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
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

