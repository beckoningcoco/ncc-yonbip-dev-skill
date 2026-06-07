---
title: "创建任务"
apiId: "2547561105824677896"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Task"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Task]
platform_version: "BIP"
source_type: community-api-docs
---

# 创建任务

>  请求方式	POST | Task (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/oa-project/rest/openapi/task/add
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
authId	string	query	否	授权ID    示例: auth001
Digital-Avatar-Id	string	header	否	1
Yht-Access-Token	string	header	否	2
Body参数
名称	类型	数组	必填	描述
id	string	否	否	任务ID，编辑、删除、取消时必填 示例：task001
name	string	否	是	任务名称 示例：测试任务
describe	string	否	否	任务描述 示例：任务描述内容
pid	string	否	否	父任务ID 示例：parentTask001
projectId	string	否	否	项目ID 示例：project001
startTime	number
小数位数:0,最大长度:15	否	否	开始时间 示例：2026-05-25 09:00:00
endTime	number
小数位数:0,最大长度:15	否	否	截止时间 示例：2026-05-25 18:00:00
importance	int	否	否	优先级：1普通、2重要、3紧急 示例：1
classifyId	string	否	否	任务分类ID 示例：0
chargeYhtUserId	string	否	否	负责人友互通ID 示例：user001
partYhtUserIds	string	是	否	参与人友互通ID列表 示例：["user001","user002"]
informYhtUserIds	string	是	否	知会人友互通ID列表 示例：["user003"]
focusYhtUserIds	string	是	否	关注人友互通ID列表 示例：["user004"]
creatorYhtUserId	string	否	否	创建人友互通ID 示例：user000
milestoneId	string	否	否	里程碑ID 示例：milestone001
milestoneName	string	否	否	里程碑名称 示例：第一阶段
tagIds	string	是	否	标签ID列表 示例：["tag001"]
userRole	int	否	否	用户角色 示例：2
objectName	string	否	否	产品线名称 示例：U8C
objectId	string	否	否	产品ID 示例：object001
productName	string	否	否	产品名称 示例：单据
action	int	否	否	任务动作：1编辑未修改父项目、2编辑修改父项目 示例：1
chanJetId	string	否	否	畅捷通任务ID 示例：chanjet001
images	string	否	否	流程转任务地址 示例：https://example.com/image.png
remindScheduleList	object	是	否	提醒计划列表 示例：[{"messageType":2,"remindType":2,"remindTime":30}]
remindPeriod	int	否	否	提醒周期：0按日提醒、1周期提醒 示例：0
repeatInfo	object	否	否	重复提醒信息 示例：{"repeatUnit":1,"interval":1}
taskFileStr	string	否	否	任务附件信息 示例：file001
remindType	int	否	否	提醒类型 示例：1
oldPid	string	否	否	原父任务ID 示例：oldParentTask001
epmUrl	string	否	否	企业绩效跳转地址 示例：https://example.com/epm
creatorName	string	否	否	创建者名称 示例：张三
enableNotify	boolean	否	否	是否开启提醒 示例：false 默认值：false
status	int	否	否	任务状态：0未开始、1进行中、3已取消、4已完成、5已延期 示例：0
source	int	否	否	任务来源 示例：1
sourceUrlWeb	string	否	否	任务来源跳转地址-web端 示例：https://example.com/web
sourceUrlMobile	string	否	否	任务来源跳转地址-移动端 示例：https://example.com/mobile
sourceUrlPc	string	否	否	任务来源跳转地址-PC端 示例：https://example.com/pc
sourceUrlIm	string	否	否	任务来源跳转地址-IM端 示例：https://example.com/im
sourceUrlDef	string	否	否	任务来源扩展跳转地址 示例：https://example.com
groupId	string	否	否	群ID 示例：group001
groupType	int	否	否	群类型：1项目群、2内部群 示例：1
completeTime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	完成时间 示例：2026-05-25 18:00:00
def1	string	否	否	自定义字段 示例：custom

## 3. 请求示例

Url: /yonbip/SCCC/oa-project/rest/openapi/task/add?access_token=访问令牌&authId=auth001
Header: 
	Digital-Avatar-Id : ""
	Yht-Access-Token : ""
Body: {
	"id": "task001",
	"name": "测试任务",
	"describe": "任务描述内容",
	"pid": "parentTask001",
	"projectId": "project001",
	"startTime": NaN,
	"endTime": NaN,
	"importance": 1,
	"classifyId": "0",
	"chargeYhtUserId": "user001",
	"partYhtUserIds": [
		"user001",
		"user002"
	],
	"informYhtUserIds": [
		"user003"
	],
	"focusYhtUserIds": [
		"user004"
	],
	"creatorYhtUserId": "user000",
	"milestoneId": "milestone001",
	"milestoneName": "第一阶段",
	"tagIds": [
		"tag001"
	],
	"userRole": 2,
	"objectName": "U8C",
	"objectId": "object001",
	"productName": "单据",
	"action": 1,
	"chanJetId": "chanjet001",
	"images": "https://example.com/image.png",
	"remindScheduleList": [
		{
			"messageType": 2,
			"remindType": 2,
			"remindTime": 30
		}
	],
	"remindPeriod": 0,
	"repeatInfo": {
		"repeatUnit": 1,
		"interval": 1
	},
	"taskFileStr": "file001",
	"remindType": 1,
	"oldPid": "oldParentTask001",
	"epmUrl": "https://example.com/epm",
	"creatorName": "张三",
	"enableNotify": false,
	"status": 0,
	"source": 1,
	"sourceUrlWeb": "https://example.com/web",
	"sourceUrlMobile": "https://example.com/mobile",
	"sourceUrlPc": "https://example.com/pc",
	"sourceUrlIm": "https://example.com/im",
	"sourceUrlDef": "https://example.com",
	"groupId": "group001",
	"groupType": 1,
	"completeTime": "2026-05-25 18:00:00",
	"def1": "custom"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

