---
title: "查询冲突日程明细"
apiId: "2541645466980319232"
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

# 查询冲突日程明细

>  请求方式	POST | Calendar (SC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/schedule/schedules/conflict/list
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
startTimestamp	long	否	是	开始时间戳，毫秒 示例：1778544000000
endTimestamp	long	否	是	结束时间戳，毫秒 示例：1778547600000
yhtUserIds	string	是	是	批量查询的个人友互通 ID 集合 示例：["user001","user002"]
excludedScheduleIds	string	是	否	要排除的日程 ID 列表 示例：["schedule003"]
timezone	string	否	否	时区 示例：Asia/Shanghai
page	int	否	否	页码，默认 1 示例：1
pageSize	int	否	否	页大小，默认 1000 示例：1000
selfOnly	boolean	否	否	是否只查自己 示例：false
teamIds	string	是	否	批量查询的团队 ID 集合 示例：["team001"]
timezoneCodes	string	是	否	时区 code 集合 示例：["Asia/Shanghai"]

## 3. 请求示例

Url: /yonbip/uspace/schedule/schedules/conflict/list?access_token=访问令牌
Body: {
	"startTimestamp": 1778544000000,
	"endTimestamp": 1778547600000,
	"yhtUserIds": [
		"user001",
		"user002"
	],
	"excludedScheduleIds": [
		"schedule003"
	],
	"timezone": "Asia/Shanghai",
	"page": 1,
	"pageSize": 1000,
	"selfOnly": false,
	"teamIds": [
		"team001"
	],
	"timezoneCodes": [
		"Asia/Shanghai"
	]
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
userIds	string	是	冲突用户 ID 列表 示例：user001
userConflictSchedules	object	否	用户冲突日程映射，key 为用户 ID

## 5. 正确返回示例

{
	"code": 200,
	"message": "success",
	"data": {
		"userIds": [
			"user001"
		],
		"userConflictSchedules": {
			"{userId}": [
				"user001"
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

