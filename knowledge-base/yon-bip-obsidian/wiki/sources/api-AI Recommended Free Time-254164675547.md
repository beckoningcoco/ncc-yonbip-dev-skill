---
title: "AI 推荐空闲时间"
apiId: "2541646755470508032"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Calendar"
domain: "SC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Calendar]
platform_version: "BIP"
source_type: community-api-docs
---

# AI 推荐空闲时间

>  请求方式	POST | Calendar (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/schedule/schedules/suggestTime
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
startTime	int	否	是	开始时间，单位秒 示例：1778544000
endTime	int	否	是	结束时间，单位秒 示例：1778547600
userIds	string	是	是	参与人用户 ID 列表 示例：["user001","user002"]
timezone	string	否	否	时区 示例：Asia/Shanghai
title	string	否	否	日程标题 示例：项目例会
address	string	否	否	日程地点 示例：第一会议室

## 3. 请求示例

Url: /yonbip/uspace/schedule/schedules/suggestTime?access_token=访问令牌
Body: {
	"startTime": 1778544000,
	"endTime": 1778547600,
	"userIds": [
		"user001",
		"user002"
	],
	"timezone": "Asia/Shanghai",
	"title": "项目例会",
	"address": "第一会议室"
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
code	number
小数位数:0,最大长度:10	否	返回码，200 表示成功，其他表示失败 示例：200
message	string	否	响应消息，成功为 success 示例：success
data	object	否	业务数据
startTime	number
小数位数:0,最大长度:10	否	入参开始时间，单位秒 示例：1778544000
endTime	number
小数位数:0,最大长度:10	否	入参结束时间，单位秒 示例：1778547600
title	string	否	日程标题 示例：项目例会
address	string	否	日程地点 示例：第一会议室
busyInfo	object	否	请求时间段忙碌信息
suggestInfo	object	否	推荐空闲时间信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "success",
	"data": {
		"startTime": 1778544000,
		"endTime": 1778547600,
		"title": "项目例会",
		"address": "第一会议室",
		"busyInfo": {
			"count": 1,
			"userIds": [
				"user001"
			]
		},
		"suggestInfo": {
			"count": 1,
			"freeTimes": [
				{
					"startTime": 1778551200,
					"endTime": 1778554800,
					"startTimeStr": "18:00",
					"endTimeStr": "19:00"
				}
			]
		}
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

