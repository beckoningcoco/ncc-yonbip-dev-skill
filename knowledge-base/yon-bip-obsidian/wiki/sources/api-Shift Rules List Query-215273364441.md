---
title: "排班规则详情查询"
apiId: "2152733644412157960"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Shift Schedule Policy"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Shift Schedule Policy]
platform_version: "BIP"
source_type: community-api-docs
---

# 排班规则详情查询

>  请求方式	POST | Shift Schedule Policy (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/schedulerulecard/detail
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
id	string	否	否	主键 示例：1993903529019310088
code	string	否	否	编码 示例：GZSQ2308240001

## 3. 请求示例

Url: /yonbip/am/schedulerulecard/detail?access_token=访问令牌
Body: {
	"id": "1993903529019310088",
	"code": "GZSQ2308240001"
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
小数位数:0,最大长度:10	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pk_team	string	是	班主键 示例：["2127508674429583363","2152740241486118918","2152740473414352905","2152740619441668097","2152740756882194439"]
enablestate	number
小数位数:0,最大长度:10	否	启用状态(未启用 1 已启用 2 已停用 3 ) 示例：2
creator	string	否	创建人主键 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
code	string	否	编码 示例：PBGZ202412100001
pk_operation_duty_category	string	否	运行值班类别主键 示例：2137881604552916993
pk_org__name	string	否	业务单元 示例：东新科技股份优先公司
pk_scheduleplan	string	否	排班方案主键 示例：PRESET01_0000M232Z6A20YFPC30000
pk_org	string	否	业务单元主键 示例：2112522880685178882
min_rotation_day	number
小数位数:0,最大长度:10	否	最小轮转周期天数 示例：10
pk_operation_duty_category__name	string	否	运行值班类别 示例：1
pk_scheduleplan__shift_num	number
小数位数:0,最大长度:10	否	排班方案 示例：3
name	object	否	名称
id	string	否	排班规则主键 示例：2152741787676442625
application_scope	string	否	应用范围 示例：1,2
creationtime	string	否	创建时间 示例：2024-12-10 14:28:48
creator__name	string	否	创建人 示例：API
pk_scheduleplan__name	string	否	排班方案 示例：五班三倒
pk_scheduleplan__team_num	number
小数位数:0,最大长度:10	否	班组数量 示例：5
pk_shift	string	是	班次主键 示例：["2152741212141387776","2152741358170275841","2152741615857827841"]
bodyvos	object	是	详细信息
pk_shift__shiftName	string	是	班次 示例：["班次2","班次3","班次1"]
shifts	object	是	班次信息
pk_team__name	string	是	班组 示例：["班组1","班组11","班组22","班组33","班组55"]
teams	object	是	班组信息
errorDetail	string	否	错误详情

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_team": [
			"2127508674429583363",
			"2152740241486118918",
			"2152740473414352905",
			"2152740619441668097",
			"2152740756882194439"
		],
		"enablestate": 2,
		"creator": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"code": "PBGZ202412100001",
		"pk_operation_duty_category": "2137881604552916993",
		"pk_org__name": "东新科技股份优先公司",
		"pk_scheduleplan": "PRESET01_0000M232Z6A20YFPC30000",
		"pk_org": "2112522880685178882",
		"min_rotation_day": 10,
		"pk_operation_duty_category__name": "1",
		"pk_scheduleplan__shift_num": 3,
		"name": {
			"zh_TW": "",
			"zh_CN": "巡检排班",
			"en_US": ""
		},
		"id": "2152741787676442625",
		"application_scope": "1,2",
		"creationtime": "2024-12-10 14:28:48",
		"creator__name": "API",
		"pk_scheduleplan__name": "五班三倒",
		"pk_scheduleplan__team_num": 5,
		"pk_shift": [
			"2152741212141387776",
			"2152741358170275841",
			"2152741615857827841"
		],
		"bodyvos": [
			{
				"pk_team": "2127508674429583363",
				"pk_team__pk_leader": "2117122782081843200",
				"main_id": "2152741787676442625",
				"pk_team__pk_leader__name": "刘龙",
				"pk_team__name": "班组1",
				"pk_shift__shiftName": "班次2",
				"shift_block": "00:00~04:00",
				"pk_team__code": "01",
				"id": "2152741787676442626",
				"xday": 1,
				"pk_shift": "2152741212141387776"
			}
		],
		"pk_shift__shiftName": [
			"班次2",
			"班次3",
			"班次1"
		],
		"shifts": [
			{
				"id": "2152741212141387776",
				"beginTime": "00:00:00",
				"beginDay": 1,
				"endTime": "04:00:00",
				"endDay": 1,
				"shiftName": "班次2"
			}
		],
		"pk_team__name": [
			"班组1",
			"班组11",
			"班组22",
			"班组33",
			"班组55"
		],
		"teams": [
			{
				"id": "2127508674429583363",
				"code": "01",
				"pk_leader": "2117122782081843200",
				"pk_leader__code": "ll",
				"pk_leader__name": "刘龙",
				"name": "班组1"
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
999	报错具体提示信息	报错具体提示信息

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

