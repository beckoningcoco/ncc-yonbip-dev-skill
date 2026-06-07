---
title: "所有权调入列表查询"
apiId: "2308584177693884420"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Ownership Transfer-in"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Ownership Transfer-in]
platform_version: "BIP"
source_type: community-api-docs
---

# 所有权调入列表查询

>  请求方式	POST | Ownership Transfer-in (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/deployinlist/query
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
condition	object	否	是	查询条件组
simpleVOs	object	是	否	扩展查询条件
page	object	否	是	分页
pageIndex	long	否	是	页号 示例：1 默认值：1
pageSize	long	否	是	页数 示例：2 默认值：10

## 3. 请求示例

Url: /yonbip/am/deployinlist/query?access_token=访问令牌
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
		"pageSize": 2
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页条数 示例：10
recordCount	long	否	记录数 示例：1
recordList	object	是	返回数据
pageCount	long	否	总页数 示例：1
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"notaxtotal_amount_currency": 0,
				"pk_ownerunit_out": "1727506601827893258",
				"pk_currency__moneyRount": 4,
				"bill_date": "2023-06-13",
				"currrate_type__digit": 6,
				"pk_ownerorg_out": "1727506936843206661",
				"total_amount_currency": 0,
				"pk_costcenter_manage_in": "1695743643650359328",
				"pk_recorder": "1727506936843206661",
				"pk_supplier": "1695743643650359328",
				"pk_costcenter_manage_in__name": "调入成本中心",
				"memo": "备注",
				"pk_recorder__name": "昵称-15727377404",
				"pk_org": "1717719299076915209",
				"pk_transitype": "1695743652219848120",
				"pk_supplier__name": "内部供应商",
				"pk_ownerunit_in": "1717719299076915209",
				"currrate_type": "0000LG25MNTF769SSI0000",
				"pk_currency_in__name": "人民币",
				"bill_type": "4A34",
				"id": "1747525281183694851",
				"pk_ownerunit_in__name": "WUHF固定资产组织",
				"creator__name": "昵称-15727377404",
				"pk_currency__name": "人民币",
				"pk_currency": "1695743643650359328",
				"audittime": "2023-06-13 14:45:19",
				"pk_ownerorg_in": "1717719299076915209",
				"sysid": "AUM",
				"isWfControlled": false,
				"pk_org__name": "WUHF固定资产组织",
				"pk_transitype__name": "所有权调入",
				"pk_ownerunit_out__name": "W会计主体",
				"pk_ownerorg_out__name": "WUHF调出固定资产组织",
				"billmaker__name": "昵称-15727377404",
				"total_amount": 0,
				"billmaker": "018532e9-5aff-43e3-8157-c583afb6db67",
				"creationtime": "2023-06-13 14:45:18",
				"bodyvos": [
					{
						"src_pk_bill": "1747497930817798149",
						"pk_addreducestyle__name": "出售",
						"src_bill_type": "4A33",
						"real_opening_amount": 0,
						"pk_costcenter_manage_out": "1729013216235749385",
						"pk_status_after__status_name": "在用",
						"src_pk_bill_b": "1747497930817798150",
						"real_opening_amount_currency": 0,
						"pk_equip__pk_category": "1697069139265323008",
						"notaxassets_amount": 0,
						"pk_org": "1717719299076915209",
						"pk_equip__equip_code": "202306130004",
						"notaxassets_amount_currency": 0,
						"pk_profitcenter_manage_out": "1727509187402399748",
						"assets_amount_tax": 0,
						"pk_costcenter_manage_out__name": "Y成本中心",
						"pk_profitcenter_manage_out__name": "W利润中心",
						"pk_mandept_before__name": "WUHF调出部门",
						"pk_usedorg_out__name": "WUHF调出固定资产组织",
						"id": "1747525281183694852",
						"pk_status_after": "PRESET01_0000LG25MNTF769SSI0000",
						"pubts": "2023-06-13 14:45:19",
						"bill_code_src": "ZCDC202306130002",
						"rowno": "10",
						"pk_mandept_after__name": "WUHF变动固定资产",
						"pk_mandept_after": "1726102920598913024",
						"assets_amount_tax_currency": 0,
						"assets_amount": 0,
						"main_id": "1747525281183694851",
						"src_transitype": "4A33-01",
						"pk_mandept_before": "1727513095826309125",
						"pk_equip": "1747497552882171914",
						"assets_amount_currency": 0,
						"pk_usedorg_out": "1727506936843206661",
						"material_tax": "0",
						"pk_equip__pk_category__category_name": "wml资产类别",
						"pk_equip__equip_name": "所有权不同，调出推应收，调入推应付",
						"pk_addreducestyle": "1695743652234527017",
						"invoicing_flag": false,
						"stock_in_flag": false,
						"memo": "备注",
						"origin_value": 0.1,
						"accu_dep": 0.1,
						"new_value": 0.1,
						"begin_date": "",
						"service_month": 2,
						"salvage": 0.2,
						"salvage_rate": 0.2,
						"dep_amount": 0.1,
						"pre_devaluate": 0.1,
						"net_money": 0.1,
						"used_month": 1,
						"material_name": "开票名称",
						"payment_tax_currency": 0.1,
						"pk_reason": "344555666",
						"pk_reason__name": "调拨原因",
						"pk_equip__spec": "规格",
						"pk_equip__model": "型号",
						"payment_amount": 20.3,
						"payment_amount_currency": 200.1
					}
				],
				"bodyvos_tax": [
					{
						"invoice_code": "716576674551",
						"levied_total": 10000,
						"money": 9174.31,
						"red_dashed": "0",
						"bill_date": "2023-07-27",
						"rate": 0.09,
						"main_id": "1780226767131246596",
						"tax": 825.69,
						"id": "1780237994190962693",
						"pubts": "2023-07-27 16:36:19",
						"invoice_number": "05680779",
						"bill_memo": "发票备注",
						"check_code": "45657"
					}
				],
				"returncount": 0,
				"verifystate": 2,
				"currrate": 1,
				"total_amount_tax_currency": 0,
				"bill_code": "ZCDR202306130003",
				"pk_currency__priceRount": 4,
				"currrate_type__name": "基准汇率",
				"postAccountStatus": 3,
				"pk_currency__digit": 2,
				"postAccountVersion": 1,
				"total_amount_tax": 0,
				"notaxtotal_amount": 0,
				"pk_ownerorg_in__name": "WUHF固定资产组织",
				"pubts": "2023-06-13 14:45:19",
				"actual_invoice_amount": 0,
				"pk_currency_in": "1695743643650359328",
				"creator": "018532e9-5aff-43e3-8157-c583afb6db67",
				"billmaketime": "2023-06-13 14:45:18",
				"auditor": "018532e9-5aff-43e3-8157-c583afb6db67",
				"auditor__name": "昵称-15727377404",
				"bill_status": 1,
				"pk_currency_in__priceRount": 4,
				"currrate_date": "2023-06-13",
				"pk_currency_in__digit": 2,
				"actual_invoice_amount_currency": 0,
				"transi_type": "4A34-01",
				"pk_currency_in__moneyRount": 4,
				"modifier__name": "最后修改人",
				"modifiedtime": "2023-06-13 14:45:18"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
请求参数 condition

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

