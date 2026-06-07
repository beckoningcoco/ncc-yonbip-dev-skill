---
title: "modifyTime	string	否	修改时间 示例：2026-05-14 10:30:00"
apiId: "2541666701315932165"
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

# modifyTime	string	否	修改时间 示例：2026-05-14 10:30:00

>  请求方式	GET | Meeting Management (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/audio/meeting/detail
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	音频会议ID    示例: audio-1

## 3. 请求示例

Url: /yonbip/SCCC/audio/meeting/detail?access_token=访问令牌&id=audio-1

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
data	object	否	调用成功时的返回数据
id	string	否	音频会议ID 示例：audio-1
creator	string	否	创建人
createTime	string	否	创建时间 示例：2026-05-14 10:00:00
modifier	string	否	修改人
pubts	string	否	发布时间戳 示例：2026-05-14 10:30:00
ytenantid	string	否	租户ID
name	string	否	会议名称 示例：项目沟通会
meetingType	int	否	会议类型，0-实时会议，1-离线会议 示例：0
status	int	否	会议状态 示例：1
startTime	string	否	开始时间 示例：2026-05-14 10:00:00
endTime	string	否	结束时间 示例：2026-05-14 11:00:00
read	boolean	否	是否已读 示例：true
source	int	否	来源渠道 示例：1
sourceId	string	否	来源ID
keyword	string	否	关键词
meetingJoinUrl	string	否	websocket地址 示例：wss://example.com/audio
audioDuration	long	否	音频时长 示例：3600
audioSize	long	否	音频大小KB 示例：1024
recycle	boolean	否	是否在回收站 示例：false
syncTask	boolean	否	是否同步任务 示例：false
autoArchive	boolean	否	是否自动归档 示例：false
archiveResult	boolean	否	归档结果 示例：true
archiveConfigId	string	否	归档配置ID
expireTime	string	否	过期时间 示例：2026-06-14 10:00:00
audioFileUrl	string	否	会议录音文件地址 示例：https://example.com/audio.mp3
videoFileUrl	string	否	会议录像文件地址 示例：https://example.com/video.mp4
meetingAssistance	string	否	会议辅助内容
textPolish	string	否	文本润色内容
autoChapters	string	否	自动章节内容
summarization	string	否	纪要总结内容
transcription	string	否	转写内容
download	boolean	否	是否可下载 示例：true

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "audio-1",
		"creator": "",
		"createTime": "2026-05-14 10:00:00",
		"modifier": "",
		"modifyTime": "2026-05-14 10:30:00",
		"pubts": "2026-05-14 10:30:00",
		"ytenantid": "",
		"name": "项目沟通会",
		"meetingType": 0,
		"status": 1,
		"startTime": "2026-05-14 10:00:00",
		"endTime": "2026-05-14 11:00:00",
		"read": true,
		"source": 1,
		"sourceId": "",
		"keyword": "",
		"meetingJoinUrl": "wss://example.com/audio",
		"audioDuration": 3600,
		"audioSize": 1024,
		"recycle": false,
		"syncTask": false,
		"autoArchive": false,
		"archiveResult": true,
		"archiveConfigId": "",
		"expireTime": "2026-06-14 10:00:00",
		"audioFileUrl": "https://example.com/audio.mp3",
		"videoFileUrl": "https://example.com/video.mp4",
		"meetingAssistance": "",
		"textPolish": "",
		"autoChapters": "",
		"summarization": "",
		"transcription": "",
		"download": true
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

