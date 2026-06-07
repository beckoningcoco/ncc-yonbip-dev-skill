---
title: "点检计划列表查询"
apiId: "2152736745378545672"
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

# 点检计划列表查询

>  请求方式	POST | Shift Schedule Policy (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/simpcplanlist/query
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
condition	object	否	否	查询条件组
simpleVOs	object	是	否	扩展查询条件
isSum	boolean	否	否	表头:true，表头+明细:false 默认值：true
page	object	否	是	分页
pageIndex	number
小数位数:0,最大长度:10	否	是	当前页码，数据范围：正整数 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:3	否	是	每页大小，不允许超过最大阈值（默认500），数据范围：1-500 示例：20 默认值：20
queryOrders	object	是	否	排序参数
field	string	否	否	排序字段 示例：bill_code
order	string	否	否	排序顺序：正序ASC，倒序：DESC 示例：DESC

## 3. 请求示例

Url: /yonbip/am/simpcplanlist/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "bill_code",
				"op": "eq",
				"value1": [
					1985761782828367878
				]
			}
		]
	},
	"isSum": true,
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"queryOrders": [
		{
			"field": "bill_code",
			"order": "DESC"
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
code	string	否	返回http状态码（200：正常，其他：异常） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页码下标 示例：1
pageSize	number
小数位数:0,最大长度:10	否	页码大小 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录计数 示例：1
pageCount	number
小数位数:0,最大长度:10	否	页码计数 示例：1
recordList	object	是	记录列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"pageCount": 1,
		"recordList": [
			{
				"bill_code": "DJJH202412050001",
				"pk_org": "2099319085960527881",
				"pk_org__name": "全职能组织",
				"plan_name": "X计划",
				"pk_editor": "",
				"pk_editor__name": "",
				"pk_edit_dept": "",
				"pk_edit_dept__name": "",
				"edit_time": "2026-06-07 13:23:41",
				"bill_status": 1,
				"memo": "备注备注备注备注备注",
				"modifier": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
				"modifier__name": "刘龙",
				"modifiedtime": "2024-12-1115:18:28",
				"billmaker": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
				"billmaker__name": "刘龙",
				"billmaketime": "2024-12-1115:18:24",
				"auditor": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
				"auditor__name": "刘龙",
				"audittime": "2024-12-1115:18:28",
				"verifystate": 2,
				"childbodyvos__pk_pcstd__code": "DJBZ202409130001",
				"childbodyvos__pcobject": "",
				"childbodyvos__pk_equip": "2143288366975156236",
				"childbodyvos__pk_equip__equip_code": "202411270008",
				"childbodyvos__pk_equip__equip_name": "父资产",
				"childbodyvos__pk_location": "",
				"childbodyvos__pk_location__location_code": "",
				"childbodyvos__pk_location_location_name": "",
				"childbodyvos__pk_plan_pcer": "2117175472615325696",
				"childbodyvos__pk_plan_pcer__name": "刘龙",
				"childbodyvos__pk_plan_team": "",
				"childbodyvos__pk_plan_team__name": "",
				"childbodyvos__pk_plan_dept": "",
				"childbodyvos__pk_plan_dept__name": "",
				"childbodyvos__close_flag": true,
				"childbodyvos__pc_oncalendar": true,
				"childbodyvos__pc_calendar": "",
				"childbodyvos__calendarrule": "",
				"childbodyvos__adjust_day": 0,
				"childbodyvos__cycle_flag": true,
				"childbodyvos__next_pcdate": "2026-06-07 13:23:41",
				"childbodyvos__memo": "",
				"childbodyvos__pk_closer": "",
				"childbodyvos__pk_closer__name": "",
				"childbodyvos__close_time": "2026-06-07 13:23:41"
			}
		]
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
0	未传入优惠券档案id	coupon_id值填写有误
999	报错具体提示信息	结合报错提示信息查找原因

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

