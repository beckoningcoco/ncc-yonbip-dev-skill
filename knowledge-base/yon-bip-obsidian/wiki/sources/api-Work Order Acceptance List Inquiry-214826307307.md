---
title: "工单验收列表查询"
apiId: "2148263073075953667"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Work Order Acceptance"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Order Acceptance]
platform_version: "BIP"
source_type: community-api-docs
---

# 工单验收列表查询

>  请求方式	POST | Work Order Acceptance (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/wochecklist/query
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
page	object	否	否	分页
pageIndex	number
小数位数:0,最大长度:10	否	否	页号 示例：1
pageSize	number
小数位数:0,最大长度:10	否	否	页数 示例：2
condition	object	否	否	查询条件
simpleVOs	object	是	否	扩展查询条件
commonVOs	object	是	否	查询区查询条件

## 3. 请求示例

Url: /yonbip/am/wochecklist/query?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 2
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "pk_org",
				"op": "eq",
				"value1": "1653986425502695431"
			}
		],
		"commonVOs": [
			{
				"itemName": "",
				"value1": ""
			}
		]
	}
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
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	页数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数据 示例：1
recordList	object	是	返回记录
sumRecordList	string	否	合并记录
beginPageIndex	number
小数位数:0,最大长度:10	否	开始分页 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束分页 示例：1
errorDetail	string	否	错误详情

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"pk_handle_dept__name": "营销部门",
				"bodyvos__pk_specialty__special_name": "呱呱呱呱呱呱呱呱呱",
				"memo": "表头备注",
				"bodyvos__pk_provider__name": "22",
				"bodyvos__check_opinion": "验收通过",
				"bodyvos__plan_end_time": "2024-12-06 00:00:00",
				"pk_handle_dept": "2099319352248500228",
				"bodyvos__pk_wo": "2148258236835823623",
				"pk_org": "2099319085960527881",
				"bodyvos__pk_director": "2117175472615325696",
				"pk_transitype": "2086855417276137514",
				"handle_date": "2024-12-04",
				"bodyvos__main_id": "2148260401499340808",
				"bill_type": "4C07",
				"id": "2148260401499340808",
				"pk_handle__name": "刘龙",
				"creator__name": "刘龙",
				"bodyvos__targ_start_time": "2024-12-03 00:00:00",
				"bodyvos__pk_wo_dept__name": "营销部门",
				"isWfControlled": 0,
				"pk_org__name": "全职能组织",
				"pk_transitype__name": "委外工单验收",
				"bodyvos__check_content": "验收内容",
				"bodyvos__status_time": "2024-12-04 13:33:12",
				"bodyvos__pk_location__location_code": "LOC24110004",
				"bodyvos__pk_provider": "2125950786606202887",
				"bodyvos__pk_executor": "2117175472615325696",
				"billmaker__name": "刘龙",
				"bodyvos__targ_end_time": "2024-12-06 00:00:00",
				"bodyvos__actu_start_time": "2024-12-04 13:30:53",
				"billmaker": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
				"creationtime": "2024-12-04 13:33:46",
				"bodyvos__wo_content": "工单验收",
				"bodyvos__pk_location": "2129788777973415936",
				"bodyvos__pk_wo_dept": "2099319352248500228",
				"returncount": 0,
				"verifystate": 0,
				"bodyvos__pk_specialty": "2139229640053489671",
				"bill_code": "GDYS202412040002",
				"bodyvos__actu_end_time": "2024-12-04 13:30:53",
				"bodyvos__check_conclusion": "0",
				"bodyvos__pk_psn_group": "2128204029523132417",
				"bodyvos__pk_wo_status": "PRESET04_0000M0Z8652LF1ZI810000",
				"bodyvos__pk_contract__contract_name": "WXHT202411040001",
				"bodyvos__pk_executor__name": "刘龙",
				"bodyvos__memo": "表体备注",
				"bodyvos__pk_director__name": "刘龙",
				"bodyvos__pk_psn_group__name": "验证班组",
				"creator": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
				"billmaketime": "2024-12-04 13:33:46",
				"bodyvos__pk_wo__bill_code": "WO2412040003",
				"bodyvos__id": "2148260401499340809",
				"bodyvos__pk_equip__equip_name": "使用人",
				"pk_handle": "2117175472615325696",
				"bill_status": 0,
				"bodyvos__pk_contract__contract_code": "GDYS",
				"bodyvos__pk_contract__bill_code": "WXHT202412030001",
				"bodyvos__pk_wo_status__name": "完成",
				"bodyvos__pk_equip__equip_code": "202411210004",
				"bodyvos__pk_location__location_name": "企业账号级位置",
				"transi_type": "4C07-01",
				"bodyvos__pk_equip": "2138672806151323650",
				"bodyvos__plan_start_time": "2024-12-05 00:00:00",
				"bodyvos__pk_contract": "2147547634521866243"
			}
		],
		"sumRecordList": "",
		"beginPageIndex": 1,
		"endPageIndex": 1
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
999	报错具体提示信息	结合报错提示信息查找原因

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (75)
删除
返回参数 (15)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

