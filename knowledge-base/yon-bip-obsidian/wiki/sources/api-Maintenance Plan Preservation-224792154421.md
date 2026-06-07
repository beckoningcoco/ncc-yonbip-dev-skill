---
title: "维修计划列表查询"
apiId: "2247921544215396359"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Repair Plan"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Repair Plan]
platform_version: "BIP"
source_type: community-api-docs
---

# 维修计划列表查询

>  请求方式	POST | Repair Plan (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/apmrepairplanlist/query
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

Url: /yonbip/am/apmrepairplanlist/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "bill_code",
				"op": "eq",
				"value1": "WXJH2412180001"
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	第几页 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页数量 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1
recordList	object	是	维修计划数据

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
				"id": "2167445814272589827",
				"bill_code": "WXJH2412300001",
				"plan_make_date": "2024-12-30",
				"pk_org": "2099319085960527881",
				"pk_org__name": "全职能组织",
				"pk_plan_dept": "2099319352248500228",
				"pk_plan_dept__name": "营销部门",
				"pk_planner": "2117175472615325696",
				"pk_planner__name": "刘龙",
				"bill_status": 1,
				"plan_totalcost_org": 1661,
				"bill_name": "计划名称信息",
				"nversion": 1,
				"plan_type__name": "保养计划",
				"pk_planlevel__name": "周计划",
				"year": 2025,
				"month": 1,
				"week": 1,
				"valid_start_date": "2025-01-06",
				"valid_end_date": "2025-01-12",
				"last_version": true,
				"updator": "",
				"updator__name": "",
				"update_time": "2026-06-07 13:24:32",
				"close_flag": false,
				"pk_closer": "",
				"pk_closer__name": "",
				"close_date": "2026-06-07 13:24:32",
				"modifier": "",
				"modifier_name": "",
				"modifiedtime": "2026-06-07 13:24:32",
				"auditor": "",
				"auditor_name": "",
				"audittime": "2026-06-07 13:24:32",
				"billmaker": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
				"billmaker_name": "张三",
				"billmaketime": "2024-12-30 09:58:25",
				"memo": "备注信息",
				"verifystate": 2,
				"pubts": "2024-12-30 13:30:55",
				"bodyvos__id": "2167445814272589828",
				"bodyvos__pk_equip": "2160147926076620801",
				"bodyvos__pk_equip__equip_code": "20-202412200021",
				"bodyvos__pk_equip__equip_name": "打印机",
				"bodyvos__pk_location": "",
				"bodyvos__pk_location__location_code": "",
				"bodyvos__pk_location__location_name": "",
				"bodyvos__repair_obj_name": "打印机",
				"bodyvos__overhaul_part": "打印机",
				"bodyvos__repair_content": "打印机噪音",
				"bodyvos__pk_std_job": "2129811275001102342",
				"bodyvos__pk_std_job__name": "工具包",
				"bodyvos__workload": "",
				"bodyvos__start_date": "2024-12-01",
				"bodyvos__finish_date": "2024-12-31",
				"bodyvos__remind_date": "2024-12-01",
				"bodyvos__plan_cost_mny_org": 1661,
				"bodyvos__actual_performance": "",
				"bodyvos__actual_mny_org": 0,
				"bodyvos__actual_mny_org_calctime": "",
				"bodyvos__consign_flag": true,
				"bodyvos__consign_reason": "委外原因",
				"bodyvos__pk_provider": 2125950786606202887,
				"bodyvos__pk_provider__name": "青岛贝源上资产管理有限公司",
				"bodyvos__principal_dept": "2099319352248500228",
				"bodyvos__principal_dept__name": "营销部门",
				"bodyvos__pk_principal": "2117175472615325696",
				"bodyvos__pk_principal__name": "刘龙",
				"bodyvos__pk_project": "2139443074182938633",
				"bodyvos__pk_project__name": "项目1",
				"bodyvos__pk_wbs_task": "2144465067764613127",
				"bodyvos__pk_wbs_task__code": "测试生成wbs",
				"bodyvos__pk_wbs_task__name": "测试生成wbs",
				"bodyvos__pk_activity": 2163881111651876872,
				"bodyvos__pk_activity__code": "RWXZ202412250001",
				"bodyvos__pk_activity__taskName": "HT001",
				"bodyvos__close_flag": false,
				"bodyvos__pk_closer": "",
				"bodyvos__pk_closer__name": "",
				"bodyvos__close_date": "2026-06-07 13:24:32",
				"bodyvos__executable_flag": true,
				"bodyvos__memo": "维修计划行备注",
				"bodyvos__wo_flag": false,
				"bodyvos__pubts": "2024-12-30 09:58:35"
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
	1	2025-06-25	
更新
返回参数 pk_wbs_task__name
更新
返回参数 pk_stordoc
更新
返回参数 pk_psndoc__code

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

