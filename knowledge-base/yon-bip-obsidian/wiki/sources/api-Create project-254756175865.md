---
title: "创建项目"
apiId: "2547561758659706889"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project]
platform_version: "BIP"
source_type: community-api-docs
---

# 创建项目

>  请求方式	POST | Project (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/oa-project/rest/openapi/project/add
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
businessId	string	否	否	业务ID 示例：business001
name	string	否	是	项目名称 示例：测试项目
describe	string	否	否	项目描述 示例：项目描述内容
projectCode	string	否	否	项目编码 示例：PRJ001
isPublic	int	否	是	是否公开：0私密、1公开 示例：1
startTime	number
小数位数:0,最大长度:15	否	是	开始时间 示例：1779670800000
endTime	number
小数位数:0,最大长度:15	否	是	结束时间 示例：1779703200000
status	int	否	否	项目状态：1进行中、2暂停中、3完成、4未开始、5已延期 示例：1
completeTime	number
小数位数:0,最大长度:15	否	否	实际完成时间 示例：1779703200000
completeDesc	string	否	否	结项内容 示例：项目总结
source	int	否	是	来源：0项目应用、1研发在线、2项目模板 示例：0
userRoleFlag	int	否	否	角色开关 示例：1
projectCodeFlag	boolean	否	否	项目编码开关 示例：false
enableNotify	boolean	否	否	是否开启提醒 示例：false
groupId	string	否	否	项目群ID 示例：group001
createGroup	boolean	否	是	是否创建群 示例：false
draggableFlag	boolean	否	否	参与人项目里程碑是否可编辑 示例：true
chargeYhtUserId	string	否	否	负责人友互通ID 示例：user001
partYhtUserIds	string	是	否	参与人友互通ID列表 示例：["user002"]
executiveYhtUserIds	string	是	否	执行人友互通ID列表 示例：["user003"]
classifyId	string	否	否	项目分类ID 示例：classify001
archive	string	否	否	档案ID 示例：archive001
archiveType	string	否	否	档案类型 示例：default
remindScheduleList	object	是	否	提醒计划列表 示例：[{"messageType":2,"remindType":2,"remindTime":30}]
progress	number
小数位数:2,最大长度:10	否	否	项目进展 示例：50

## 3. 请求示例

Url: /yonbip/SCCC/oa-project/rest/openapi/project/add?access_token=访问令牌
Body: {
	"businessId": "business001",
	"name": "测试项目",
	"describe": "项目描述内容",
	"projectCode": "PRJ001",
	"isPublic": 1,
	"startTime": 1779670800000,
	"endTime": 1779703200000,
	"status": 1,
	"completeTime": 1779703200000,
	"completeDesc": "项目总结",
	"source": 0,
	"userRoleFlag": 1,
	"projectCodeFlag": false,
	"enableNotify": false,
	"groupId": "group001",
	"createGroup": false,
	"draggableFlag": true,
	"chargeYhtUserId": "user001",
	"partYhtUserIds": [
		"user002"
	],
	"executiveYhtUserIds": [
		"user003"
	],
	"classifyId": "classify001",
	"archive": "archive001",
	"archiveType": "default",
	"remindScheduleList": [
		{
			"messageType": 2,
			"remindType": 2,
			"remindTime": 30
		}
	],
	"progress": 50
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

