---
title: "会议预定"
apiId: "2152139727744532487"
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

# 会议预定

>  请求方式	POST | Meeting Management (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/external/access/book
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
tenantId	string	query	是	租户ID, 必传
Body参数
名称	类型	数组	必填	描述
subject	string	否	是	会议主题，必填 示例：会议主题
meetingRoomId	string	否	是	会议室ID（0代表自定义会议室） 示例：2113404757743239175
meetingRoomName	string	否	否	会议室名称（必须是会议室ID对应的会议室名称，当会议室ID为0时，此字段标志自定义会议地点名称） 示例：老模板-普通会议
meetingDateTimeStamp	number
小数位数:0,最大长度:13	否	是	会议日期13位时间戳（可以与开始时间戳相同），必填 示例：1733748300000
startDateTimeStamp	number
小数位数:0,最大长度:13	否	是	会议开始时间13位时间戳，必填 示例：1733748300000
endDateTimeStamp	number
小数位数:0,最大长度:13	否	是	会议结束时间13位时间戳，必填 示例：1733749200000
meetingPersonYhtUserIds	string	是	是	参会人yhtUserId，必填 示例：["11d6dd77-dde4-445b-bf33-927e452bdc3e","a9eeca8b-9eb6-4ea2-a602-9c5bb86673d8"]
meetingPersonAmount	number
小数位数:0,最大长度:10	否	否	参会人数 示例：10
remindArray	number
小数位数:0,最大长度:10	是	否	提醒时间-分钟级（枚举值仅有：5，15，20，30，60，1440，4320） 示例：[15,20]
content	string	否	否	会议内容 示例：内容
isSendMail	boolean	否	否	是否发送邮件提醒 示例：false 默认值：false
isSendMsg	boolean	否	否	是否发送消息提醒 示例：false 默认值：false
onlineType	number
小数位数:2,最大长度:10	否	否	线下会议 0 线上会议1
videoMeetingType	string	否	否	视频会议类型，0：无视频会议，1：友空间视频会议，2：其他视频会议
ykjVideoMeetingType	string	否	否	友空间视频会议类型 0-瞩目会议，1-腾讯会议
videoPsw	string	否	否	视频会议密码

## 3. 请求示例

Url: /yonbip/uspace/external/access/book?access_token=访问令牌&tenantId=
Body: {
	"subject": "会议主题",
	"meetingRoomId": "2113404757743239175",
	"meetingRoomName": "老模板-普通会议",
	"meetingDateTimeStamp": 1733748300000,
	"startDateTimeStamp": 1733748300000,
	"endDateTimeStamp": 1733749200000,
	"meetingPersonYhtUserIds": [
		"11d6dd77-dde4-445b-bf33-927e452bdc3e",
		"a9eeca8b-9eb6-4ea2-a602-9c5bb86673d8"
	],
	"meetingPersonAmount": 10,
	"remindArray": [
		15,
		20
	],
	"content": "内容",
	"isSendMail": false,
	"isSendMsg": false,
	"onlineType": 0,
	"videoMeetingType": "",
	"ykjVideoMeetingType": "",
	"videoPsw": ""
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
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
	1	2026-05-18	
新增
请求参数 (4)
更新
请求参数 tenantId
	2	2025-06-29	
更新
请求说明
更新
请求参数 (9)
相关参数设置了必填

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

