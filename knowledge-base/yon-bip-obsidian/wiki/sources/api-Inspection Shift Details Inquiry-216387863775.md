---
title: "巡检排班详情查询"
apiId: "2163878637751762947"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Routine Inspection Scheduling"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Routine Inspection Scheduling]
platform_version: "BIP"
source_type: community-api-docs
---

# 巡检排班详情查询

>  请求方式	POST | Routine Inspection Scheduling (MRO)


## 1. 支持按照编码查询巡检排班。

2. 表头查询字段包括：资产组织、编码、名称、启用状态、开始日期、结束日期、排班规则、班次、默认班组、自动顺延排班。
3. 排程详情字段包括：巡检日期、班次、班次时间、班组、巡检路线、开始时间、执行开始时段、开始时间、结束时间、执行结束时段、结束时间、巡检周期、周期单位、备注。

## 4. 支持分页查询。


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/routeinspschedulecard/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	巡检排班主键 示例：2143259367275757575
code	string	否	否	巡检排班编码 示例：XJPB202412250001

## 3. 请求示例

Url: /yonbip/am/routeinspschedulecard/detail?access_token=访问令牌
Body: {
	"id": "2143259367275757575",
	"code": "XJPB202412250001"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	number
小数位数:0,最大长度:10	否	返回http状态码(200:正常，其他：异常) 示例：200
message	string	否	返回的信息 示例：操作成功！
data	object	否	查询到的数据
pk_org	string	否	资产组织主键 示例：2143259367275757575
pk_org__name	string	否	资产组织 示例：资产组织名称
code	string	否	巡检排班编码 示例：XJPB202412250001
name	string	否	名称 示例：名称
enablestate	number
小数位数:0,最大长度:10	否	启用状态（启用状态 1-未启用 2-已启用 3-已停用） 示例：2
start_date	string	否	开始日期 示例：2024-02-29
end_date	string	否	结束日期 示例：2024-05-29
pk_schedulerule	string	否	排班规则主键 示例：1941240564054228994
pk_schedulerule__name	string	否	排班规则 示例：排班规则
pk_shift	string	否	班次主键 示例：1941240564054228994
shiftName	string	否	班次 示例：班次名称
pk_team	string	否	默认班组主键 示例：1941240564054228995
pk_team__name	string	否	默认班组 示例：默认班组名称
use_pre	number
小数位数:0,最大长度:10	否	自动顺延排班 false:否 true:是 示例：true
pc_unit	number
小数位数:0,最大长度:10	否	周期单位 1:小时 2:班次 3:天 4:周 5:月 示例：1
bodyvos	object	是	子表信息
errorDetail	string	否	errorDetail

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_org": "2143259367275757575",
		"pk_org__name": "资产组织名称",
		"code": "XJPB202412250001",
		"name": "名称",
		"enablestate": 2,
		"start_date": "2024-02-29",
		"end_date": "2024-05-29",
		"pk_schedulerule": "1941240564054228994",
		"pk_schedulerule__name": "排班规则",
		"pk_shift": "1941240564054228994",
		"shiftName": "班次名称",
		"pk_team": "1941240564054228995",
		"pk_team__name": "默认班组名称",
		"use_pre": NaN,
		"pc_unit": 1,
		"bodyvos": [
			{
				"inspect_date": "2024-03-29",
				"pk_shift": "1941240564054228994",
				"pk_shift__shiftName": "班次名称",
				"shift_block": "2024-03-29",
				"pk_team": "1941240564054228993",
				"pk_team__name": "班组名称",
				"pk_patrolroute": "1941240564054228992",
				"pk_patrolroute__name": "巡检路线名称",
				"start_time": "2024-03-29",
				"end_time": "2024-05-29",
				"pc_cycle": 1,
				"memo": "备注",
				"startDay": 1,
				"endDay": 2,
				"startTime": "13:34:45",
				"endTime": "15:34:45"
			}
		]
	},
	"errorDetail": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
999	服务端逻辑异常	服务端逻辑异常

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-17	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

