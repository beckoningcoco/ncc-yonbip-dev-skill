---
title: "校准记录列表查询"
apiId: "2335332503870504969"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Calibration Record"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Calibration Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 校准记录列表查询

>  请求方式	POST | Calibration Record (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/calibration/query
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
page	object	否	是	分页
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	每页条数 示例：10 默认值：10
isSum	boolean	否	否	表头:true，表头+明细:false 示例：false 默认值：false

## 3. 请求示例

Url: /yonbip/ACC/calibration/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "id",
				"op": "in",
				"value1": "2142414272408846338或者[\"2142414272408846338\"]",
				"value2": "2142414272408846338"
			}
		]
	},
	"page": {
		"pageIndex": 1,
		"pageSize": 10
	},
	"isSum": false
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
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页条数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
recordList	object	是	返回数据
pageCount	number
小数位数:0,最大长度:10	否	总页数
beginPageIndex	number
小数位数:0,最大长度:10	否	起始页
endPageIndex	number
小数位数:0,最大长度:10	否	结束页

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"bodyvos__pk_equip__precoding": "CCBM18612187801",
				"bodyvos__pk_equip__equip_extend__pk_measure_instrument_category__catalog": "轨道衡",
				"pk_org": "2111226814158340106",
				"pk_transitype": "2107554909184851993",
				"bodyvos__pk_equip__model": "Model-2025",
				"bodyvos__pk_equip__pk_ownerorg": "2111226814158340106",
				"bill_type": "4A76",
				"handling_date": "2025-06-05",
				"id": "2284081921940520965",
				"creator__name": "LIKUN",
				"tenant": "0000M232Z6A20YFPC30000",
				"bodyvos__pk_equip__pk_used_status__status_name": "在用",
				"userDefines__id": "2284081921940520969",
				"pk_currency": "2107554866232033332",
				"sysid": "MIM",
				"isWfControlled": 0,
				"pk_org__name": "likun-OrgName-资产组织",
				"pk_transitype__name": "校准记录",
				"bodyvos__next_calibration_date": "2025-06-14",
				"creationtime": "2025-06-05 13:42:12",
				"pk_fiorg__name": "likun-OrgName-All",
				"bodyvos__pk_equip__pk_used_status": "PRESET01_0000M232Z6A20YFPC30000",
				"verifystate": 0,
				"bodyvos__calibration_date": "2025-06-05",
				"bodyvos__pk_equip__pk_usedorg": "2111225611567497225",
				"bill_code": "JZJL202506050001",
				"bodyvos__pk_equip__equip_extend__calibration_cycle_unit": 0,
				"bodyvos__pk_equip__equip_extend__pk_measure_instrument_category": "2111289031077658672",
				"bodyvos__calibration_results": "0",
				"pk_fiorg": "2111225611567497225",
				"pk_currency__digit": 2,
				"bodyvos__pk_equip__equip_extend__accuracy_level": "A级别",
				"bodyvos__userDefines__id": "2284081921940520968",
				"bodyvos__pk_equip__pk_category": "2111279272918253571",
				"pubts": "2025-06-05 13:42:12",
				"bodyvos__pk_equip__equip_extend__calibration_cycle": 10,
				"bodyvos__pk_equip__pk_ownerorg_name": "likun-OrgName-资产组织",
				"bodyvos__calibration_level": "A级别",
				"bodyvos__pk_equip__pk_category__category_name": "LIKUNTEST-东风系列导弹",
				"creator": "707f7ad7-bdb5-4b4d-88a6-77663ac387aa",
				"bodyvosid": "2284081921940520966",
				"main_id": "2284081921940520965",
				"bodyvos__pk_equip__pk_usedorg_name": "likun-OrgName-All",
				"bodyvos__calibration_uncertainty": "2.5",
				"bodyvos__pk_equip__equip_name": "TEST2025-预警验证",
				"bill_status": 0,
				"bodyvos__pk_equip__equip_code": "EAM-2025042200000009",
				"bodyvos__pk_equip__equip_extend__uncertainty": "2.5",
				"transi_type": "4A76-01",
				"bodyvos__pk_equip": "2251315272824127493",
				"bodyvos__pk_equip__spec": "Spec-2025",
				"handling_dept__name": "",
				"handling_dept": "",
				"pk_recorder__name": "",
				"pk_recorder": "",
				"total_costs": "",
				"calibration_organization": "",
				"calibration_organization__name": "",
				"calibration_organization_before": "",
				"calibration_organization_before__name": "",
				"memo": "",
				"src_pk_bill": "",
				"src_bill_type": "",
				"check_opinion": "",
				"bodyvos__pk_equip__facturer_name": "",
				"bodyvos__certificate_no": "",
				"calibration_uncertainty_before": "",
				"certificate_no_before": "",
				"bodyvos__calibration_fees": "",
				"calibration_date_before": "",
				"bodyvos__calibration_basis": ""
			}
		],
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0
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
999	报错具体提示信息，例如：服务端逻辑异常	查看日志找对应异常服务定位产生原因

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

