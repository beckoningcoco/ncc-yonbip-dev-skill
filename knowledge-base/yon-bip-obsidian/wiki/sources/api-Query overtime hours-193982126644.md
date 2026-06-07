---
title: "查询加班时长"
apiId: "1939821266449989641"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "O/T Application"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, O/T Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询加班时长

>  请求方式	POST | O/T Application (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/overtime/instead/queryLength
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
staffInfoDetail	object	是	是	人员详细信息
staffId	string	否	否	员工id（员工id和用户id必填其一），可以在假勤档案节点找到 示例：1737740314994540546
userId	string	否	否	用户id（员工id和用户id必填其一），可以在员工信息节点接口找到 示例：18b1ffca-b45c-453d-94c7-220aca807b5d
overTimeBeginTime	date
格式:yyyy-MM-dd HH:mm:ss	否	是	加班开始时间 示例：2024-02-06 01:30:00
overTimeEndTime	date
格式:yyyy-MM-dd HH:mm:ss	否	是	加班结束时间 示例：2024-02-07 00:30:00
isAllNight	string	否	是	是否通宵加班 0:非通宵加班 1:通宵加班，只有这两个值 示例：0
restSwitch	boolean	否	是	休息时段开关，true+restScopes适配restScopes；true适配默认休息时段；false不处理休息时段; 示例：true
restScopes	object	是	否	休息时段

## 3. 请求示例

Url: /yonbip/hrcloud/time/overtime/instead/queryLength?access_token=访问令牌
Body: {
	"staffInfoDetail": [
		{
			"staffId": "1737740314994540546",
			"userId": "18b1ffca-b45c-453d-94c7-220aca807b5d",
			"overTimeBeginTime": "2024-02-06 01:30:00",
			"overTimeEndTime": "2024-02-07 00:30:00",
			"isAllNight": "0",
			"restSwitch": true,
			"restScopes": [
				{
					"restBeginTime": "2024-02-06 09:30:00",
					"restEndTime": "2024-02-06 10:30:00"
				}
			]
		}
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
code	string	否	状态码，响应编码 200：成功，500：失败 示例：200
message	string	否	返回信息，如果成功，message会返回加班主表id
data	object	是	响应数据
staffInfoResultDetailDtoList	object	是	返回信息集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": [
		{
			"staffInfoResultDetailDtoList": [
				{
					"staffId": "1737740314994540546",
					"length": 32.75,
					"restTimeCanModify": "1",
					"lengthDetailDtoList": {
						"staffId": "1737740314994540546",
						"date": "1708704000000",
						"length": 23.75,
						"shiftBegin": 34200000,
						"shiftEnd": 34200000,
						"shiftName": "休息",
						"workHours": 9.5,
						"dateType": 2
					},
					"rangList": [
						0
					],
					"defaultRestTimeScopes": [
						{
							"restBeginTime": "2024-02-24 01:05:00",
							"restEndTime": "2024-02-24 01:10:00",
							"restDuration": 0.08
						}
					]
				}
			]
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
500	系统异常	

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

