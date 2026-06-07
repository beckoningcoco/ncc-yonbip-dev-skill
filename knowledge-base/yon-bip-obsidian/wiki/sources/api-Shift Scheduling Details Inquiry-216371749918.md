---
title: "排班方案详情查询"
apiId: "2163717499188150277"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Shift Scheduling Scheme"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Shift Scheduling Scheme]
platform_version: "BIP"
source_type: community-api-docs
---

# 排班方案详情查询

>  请求方式	POST | Shift Scheduling Scheme (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/simscheduleplancard/detail
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
id	string	否	否	主键 示例：1892323231613321217
code	string	否	否	编码 示例：PBFA002

## 3. 请求示例

Url: /yonbip/am/simscheduleplancard/detail?access_token=访问令牌
Body: {
	"id": "1892323231613321217",
	"code": "PBFA002"
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
code	string	否	编码 示例：PBGZ202412100001
pk_org	string	否	业务单元主键 示例：2112522880685178882
pk_org__name	string	否	业务单元 示例：东新科技股份优先公司
name	object	否	方案名称
scheme_description	string	否	方案说明 示例：排班方案排班方案
team_num	number
小数位数:0,最大长度:11	否	班组数量 示例：5
shift_num	number
小数位数:0,最大长度:11	否	班次数量 示例：3
rotationcycle_day	number
小数位数:0,最大长度:11	否	轮换周期天数 示例：3
enablestate	number
小数位数:0,最大长度:10	否	启用状态（1未启用，2已启用，3已停用） 示例：2
memo	string	否	备注 示例：备注备注这是备注
creator	string	否	创建人主键 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
creator__name	string	否	创建人 示例：API
creationtime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间 示例：2024-12-10 14:28:48
modifier	string	否	最后修改人主键 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
modifier__name	string	否	最后修改人 示例：API
modifiedtime	date
格式:yyyy-MM-dd HH:mm:ss	否	最后修改时间 示例：2024-12-10 14:28:48
id	string	否	排班规则主键 示例：2152741787676442625
bodyvos	object	是	详细信息
errorDetail	string	否	错误详情

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"code": "PBGZ202412100001",
		"pk_org": "2112522880685178882",
		"pk_org__name": "东新科技股份优先公司",
		"name": {},
		"scheme_description": "排班方案排班方案",
		"team_num": 5,
		"shift_num": 3,
		"rotationcycle_day": 3,
		"enablestate": 2,
		"memo": "备注备注这是备注",
		"creator": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"creator__name": "API",
		"creationtime": "2024-12-10 14:28:48",
		"modifier": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"modifier__name": "API",
		"modifiedtime": "2024-12-10 14:28:48",
		"id": "2152741787676442625",
		"bodyvos": [
			{
				"rowno": "1",
				"day_num": 1,
				"shift": "2152741212141387776",
				"team": "2127508674429583363",
				"memo": "备注备注这是子表备注",
				"main_id": "2152741787676442625",
				"id": "2152741787676442626",
				"shift__shiftName": "班次2",
				"team__name": "班组1",
				"team__code": "01"
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
999	服务端逻辑异常	报错具体提示信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 enablestate

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

