---
title: "所有权调出列表查询"
apiId: "1872075802404192262"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Ownership Transfer-out"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Ownership Transfer-out]
platform_version: "BIP"
source_type: community-api-docs
---

# 所有权调出列表查询

>  请求方式	POST | Ownership Transfer-out (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/deployoutlist/query
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
condition	object	否	否	查询条件
simpleVOs	object	是	否	扩展查询条件
page	object	否	否	分页信息
pageIndex	string	否	否	页码 默认值：1
pageSize	string	否	否	每页展示数量 默认值：10

## 3. 请求示例

Url: /yonbip/am/deployoutlist/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "bill_code",
				"op": "eq",
				"value1": "001"
			}
		]
	},
	"page": {
		"pageIndex": "",
		"pageSize": ""
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 2,
		"recordCount": 5,
		"recordList": [
			{
				"pk_ownerunit_out": "1741698153109258247",
				"real_opening_amount": 0,
				"bill_date": "2023-08-11",
				"pk_ownerorg_out": "1741698153109258247",
				"pk_org": "1741698153109258247",
				"notaxassets_amount": 0,
				"pk_equip__equip_code": "202306190005",
				"pk_transitype": "1741657050284298043",
				"pk_ownerunit_in": "1741698153109258247",
				"assets_amount_tax": 0,
				"bill_type": "4A33",
				"id": "1791227707393048580",
				"pk_ownerunit_in__name": "全职能组织",
				"creator__name": "昵称-武慧峰",
				"pk_currency__name": "人民币",
				"push_status": 0,
				"pk_currency": "1741657050275905566",
				"pk_ownerorg_in": "1744402848665829385",
				"sysid": "AUM",
				"isWfControlled": false,
				"pk_org__name": "全职能组织",
				"pk_transitype__name": "所有权调出",
				"pk_ownerunit_out__name": "全职能组织",
				"pk_ownerorg_out__name": "全职能组织",
				"equip_name": "计量器具-资产卡片",
				"billmaker__name": "昵称-武慧峰",
				"pk_mandept_before": "1741698720044941313",
				"total_amount": 0,
				"billmaker": "1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b",
				"creationtime": "2023-08-11 11:59:10",
				"invoicing_flag": false,
				"verifystate": 0,
				"bodyvosId": "1791227707393048581",
				"bill_code": "ZCDC202308110001",
				"bizFlow": "bdb87163-df79-4f10-8976-99e8f098eca7",
				"pk_currency__digit": 2,
				"total_amount_tax": 0,
				"notaxtotal_amount": 0,
				"pk_mandept_before__name": "营销部门",
				"pk_ownerorg_in__name": "0605测试集团",
				"pubts": "2023-08-11 11:59:11",
				"actual_invoice_amount": 0,
				"isFlowCoreBill": true,
				"pk_category__category_name": "计量器具",
				"creator": "1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b",
				"billmaketime": "2023-08-11 11:59:10",
				"assets_amount": 0,
				"pk_category": "1742328843290017801",
				"bill_status": 0,
				"pk_equip": "1752225762206810121",
				"transi_type": "4A33-01",
				"material_tax": "0",
				"pk_group": "",
				"pk_org_v": "",
				"pk_ownerorg_out_v": "",
				"pk_ownerunit_out_v": "",
				"pk_ownerorg_in_v": "",
				"pk_ownerunit_in_v": "",
				"pk_usedorg_in": "",
				"pk_usedorg_in__name": "",
				"pk_usedorg_in_v": "",
				"pk_usedorg_out": "",
				"pk_usedorg_out__name": "",
				"pk_usedorg_out_v": "",
				"pk_recorder": "",
				"pk_recorder__name": "",
				"workflow_status": 0,
				"memo": "",
				"busi_type": "",
				"modifier": "",
				"modifier__name": "",
				"modifiedtime": "",
				"auditor": "",
				"auditor__name": "",
				"audittime": "",
				"check_opinion": "",
				"pk_mandept_after": "",
				"pk_mandept_after__name": "",
				"pk_profitcenter_manage": "",
				"pk_profitcenter_manage__name": "",
				"pk_costcenter_manage": "",
				"taxpayer_id": "",
				"pk_costcenter_manage__name": "",
				"taxpayer_name": "",
				"taxpayer_type": "",
				"pk_costcenter_manage_in": "",
				"pk_costcenter_manage_in__name": "",
				"tax_bill_type": "",
				"deploy_in_title": "",
				"deploy_in_taxNo": "",
				"equip_spec": "",
				"equip_model": "",
				"pk_addreducestyle": "",
				"pk_addreducestyle__name": "",
				"pk_reason": "",
				"pk_reason__name": "",
				"pk_jobmngfil": "",
				"pk_jobmngfil__name": "",
				"pk_faorg_out": "",
				"pk_faorg_out__name": "",
				"pk_faorg_in": "",
				"pk_faorg_in__name": "",
				"pk_currency__moneyDigit": 0,
				"pk_manager_before": "",
				"pk_manager_before__name": "",
				"pk_manager_after__name": "",
				"pk_manager_after": "",
				"pk_usedept_before": "",
				"pk_usedept_before__name": "",
				"pk_user_before": "",
				"pk_user_before__name": "",
				"pk_usedept_after": "",
				"pk_usedept_after__name": "",
				"pk_user_after": "",
				"pk_user_after__name": "",
				"pk_location_before": "",
				"pk_location_before__name": "",
				"pk_location_after": "",
				"pk_location_after__name": "",
				"pk_warehouse_out": "",
				"pk_warehouse_out__name": "",
				"pk_icorg_out": "",
				"pk_icorg_out__name": "",
				"pk_warehouse_in": "",
				"pk_warehouse_in__name": "",
				"pk_icorg_in": "",
				"pk_icorg_in__name": "",
				"origin_value": 0,
				"accu_dep": 0,
				"new_value": 0,
				"service_month": 0,
				"dep_amount": 0,
				"used_month": 0,
				"net_money": 0,
				"salvage": 0,
				"salvage_rate": 0,
				"pre_devaluate": 0,
				"expense_item": "",
				"expense_item__name": "",
				"material_name": "",
				"bodyvos__memo": "",
				"error_msg": {}
			}
		],
		"beginPageIndex": 1,
		"endPageIndex": 2,
		"pageCount": 1
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
999	报错具体提示信息，例如：条件项错误，请输入条件项；条件值错误，条件值类型为数组；条件项错误，条件项允许值：id(员工主键)、code(员工编码)、email(员工邮箱)、mobile(员工手机号)；条件项错误，无合法的条件，请核对；	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-04	
更新
请求参数 (8)
删除
请求参数 (4)
更新
返回参数 (90)
	2	2025-07-03	
更新
返回参数 (90)
	3	2025-07-02	
更新
返回参数 (90)
适配平台修改 增加默认参数

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

