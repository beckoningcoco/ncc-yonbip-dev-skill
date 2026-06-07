---
title: "查询日程详情"
apiId: "2539409567137660928"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Calendar"
domain: "SC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Calendar]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询日程详情

>  请求方式	GET | Calendar (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/schedules/detail/{sid}
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
sid	string	path	是	日程 ID    示例: schedule001
yhtUserId	string	query	否	用户友互通 ID    示例: user001
currentDay	string	query	否	重复日程查询日期    示例: 2026-05-12
currentStartTime	long	query	否	重复日程当天开始时间戳    示例: 1778544000000
requestSource	string	query	否	请求来源    示例: openapi

## 3. 请求示例

Url: /yonbip/uspace/schedules/detail/schedule001?access_token=访问令牌&yhtUserId=user001&currentDay=2026-05-12&currentStartTime=1778544000000&requestSource=openapi

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
小数位数:0,最大长度:10	否	返回码，200 表示成功，其他表示失败 示例：200
message	string	否	响应消息，成功为 success 示例：success
data	object	否	业务数据
sid	string	否	日程 ID 示例：schedule001
title	string	否	日程标题 示例：项目例会
address	string	否	日程地点 示例：第一会议室
startTime	number
小数位数:0,最大长度:10	否	开始时间戳 示例：1778544000000
endTime	number
小数位数:0,最大长度:10	否	结束时间戳 示例：1778547600000
allDayRemindTime	number
小数位数:0,最大长度:10	否	全天日程提醒时间
upperTime	string	否	提前时间
unitType	number
小数位数:0,最大长度:10	否	提前时间单位类型
allDay	boolean	否	是否全天
content	string	否	日程内容
cate	number
小数位数:0,最大长度:10	否	分类 ID
remindType	number
小数位数:0,最大长度:10	否	提醒类型
important	boolean	否	是否重要
state	number
小数位数:0,最大长度:10	否	行状态
isPublic	boolean	否	是否公开
currentDay	string	否	当前日期
repeat	boolean	否	是否重复日程 示例：false
currentStartTime	number
小数位数:0,最大长度:10	否	当前日期开始时间戳
parentId	string	否	来源日程 ID
timezone	string	否	时区 示例：Asia/Shanghai
timezoneInfo	object	否	时区信息
repeatEndTime	number
小数位数:0,最大长度:10	否	重复结束时间
createSource	number
小数位数:0,最大长度:10	否	创建来源
other	string	否	扩展操作字段
url	string	否	关联地址
yhtUserId	string	否	创建人友互通 ID
yTenantId	string	否	租户 ID
dr	number
小数位数:0,最大长度:10	否	删除标识
fIds	string	否	附件 ID，逗号分割
fileIds	string	否	文件服务 ID，逗号分割
memberId	string	否	兼容 v1 版成员 ID
qzId	number
小数位数:0,最大长度:10	否	兼容 v1 版群组 ID
belongGroupId	string	否	日程所属内部群 ID
initiator	object	否	发起人信息
color	string	否	日程颜色
repeatCron	string	否	重复规则表达式
repeatDay	number
小数位数:0,最大长度:10	否	重复日
repeatMonth	number
小数位数:0,最大长度:10	否	重复月
repeatWeek	number
小数位数:0,最大长度:10	否	重复周
repeatYear	number
小数位数:0,最大长度:10	否	重复年
objectType	number
小数位数:0,最大长度:10	否	对象类型
type	string	否	类型
objectTypeId	string	否	对象类型 ID
objectTypeName	string	否	对象类型名称
queryYhtUserId	string	否	查询用户友互通 ID
isShareMe	boolean	否	是否分享给我
isOtherObjectType	boolean	否	是否其他对象类型
isCheck	boolean	否	是否本人日程
relation	number
小数位数:0,最大长度:10	否	关系类型
showStartTime	string	否	展示开始时间
showEndTime	string	否	展示结束时间
crossDay	boolean	否	是否跨天
role	number
小数位数:0,最大长度:10	否	当前人在日程中的角色
userStatus	number
小数位数:0,最大长度:10	否	当前人接受状态
partIds	string	否	参与人名称列表
fromTime	number
小数位数:0,最大长度:10	否	来源时间
fromStartTime	number
小数位数:0,最大长度:10	否	重复日程定位开始时间
created	number
小数位数:0,最大长度:10	否	日程创建时间
authFlag	number
小数位数:0,最大长度:10	否	权限标识
editFlag	number
小数位数:0,最大长度:10	否	编辑标识
inviteFlag	number
小数位数:0,最大长度:10	否	邀请标识
createYhtUserId	string	否	创建人友互通 ID
createMemberName	string	否	创建人成员名称
ownerYhtUserId	string	否	所有人友互通 ID
mulRemindTimes	string	否	多次提醒时间，逗号分割
mulNoticeTimes	string	否	多次通知时间
teamId	string	否	日历 ID
teamNotify	number
小数位数:0,最大长度:10	否	日历是否开启通知
teamName	string	否	日历名称
selectUserStatus	number
小数位数:0,最大长度:10	否	选中视图用户接受状态
scheduleType	string	否	日程类型
viewUrl	string	否	三方日程跳转地址
viewCode	number
小数位数:0,最大长度:10	否	是否需要拼接 code
isTaskSchedule	string	否	是否任务类日程
taskInfo	object	否	任务类日程扩展信息
matchDates	string	是	重复表达式命中日期列表
matchStartTimes	number
小数位数:0,最大长度:10	是	重复日程匹配时间戳列表
repeatInfo	object	否	重复规则信息
labels	object	是	标签列表
isShare	number
小数位数:0,最大长度:10	否	是否支持分享
ownerMemberId	string	否	兼容 v1 版所有人成员 ID
createMemberId	string	否	兼容 v1 版创建人成员 ID
queryMemberId	string	否	兼容 v1 版查询成员 ID
part	object	否	参与人分组
viewTitle	string	否	展示标题
cateTitle	string	否	分类标题
cateColor	string	否	分类颜色
showTime	string	否	展示时间
files	object	否	附件分组
fileDocumentId	string	否	文件单据 ID，用于查询会议附件列表
isSendEmail	number
小数位数:0,最大长度:10	否	是否发邮件

## 5. 正确返回示例

{
	"code": 200,
	"message": "success",
	"data": {
		"sid": "schedule001",
		"title": "项目例会",
		"address": "第一会议室",
		"startTime": 1778544000000,
		"endTime": 1778547600000,
		"allDayRemindTime": 0,
		"upperTime": "",
		"unitType": 0,
		"allDay": true,
		"content": "",
		"cate": 0,
		"remindType": 0,
		"important": true,
		"state": 0,
		"isPublic": true,
		"currentDay": "",
		"repeat": false,
		"currentStartTime": 0,
		"parentId": "",
		"timezone": "Asia/Shanghai",
		"timezoneInfo": {
			"code": "",
			"city": "",
			"name": "",
			"offset": ""
		},
		"repeatEndTime": 0,
		"createSource": 0,
		"other": "",
		"url": "",
		"yhtUserId": "",
		"yTenantId": "",
		"dr": 0,
		"fIds": "",
		"fileIds": "",
		"memberId": "",
		"qzId": 0,
		"belongGroupId": "",
		"initiator": {},
		"color": "",
		"repeatCron": "",
		"repeatDay": 0,
		"repeatMonth": 0,
		"repeatWeek": 0,
		"repeatYear": 0,
		"objectType": 0,
		"type": "",
		"objectTypeId": "",
		"objectTypeName": "",
		"queryYhtUserId": "",
		"isShareMe": true,
		"isOtherObjectType": true,
		"isCheck": true,
		"relation": 0,
		"showStartTime": "",
		"showEndTime": "",
		"crossDay": true,
		"role": 0,
		"userStatus": 0,
		"partIds": "",
		"fromTime": 0,
		"fromStartTime": 0,
		"created": 0,
		"authFlag": 0,
		"editFlag": 0,
		"inviteFlag": 0,
		"createYhtUserId": "",
		"createMemberName": "",
		"ownerYhtUserId": "",
		"mulRemindTimes": "",
		"mulNoticeTimes": "",
		"teamId": "",
		"teamNotify": 0,
		"teamName": "",
		"selectUserStatus": 0,
		"scheduleType": "",
		"viewUrl": "",
		"viewCode": 0,
		"isTaskSchedule": "",
		"taskInfo": {},
		"matchDates": [
			""
		],
		"matchStartTimes": [
			0
		],
		"repeatInfo": {},
		"labels": [
			{}
		],
		"isShare": 0,
		"ownerMemberId": "",
		"createMemberId": "",
		"queryMemberId": "",
		"part": {},
		"viewTitle": "",
		"cateTitle": "",
		"cateColor": "",
		"showTime": "",
		"files": {},
		"fileDocumentId": "",
		"isSendEmail": 0
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

