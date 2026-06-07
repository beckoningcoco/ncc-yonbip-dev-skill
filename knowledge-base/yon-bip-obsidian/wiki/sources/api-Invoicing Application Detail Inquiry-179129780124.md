---
title: "开票申请详情查询"
apiId: "1791297801244639259"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing Request"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 开票申请详情查询

>  请求方式	POST | Invoicing Request (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/rentoutbilllist/query
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
condition	object	否	是	查询条件组
simpleVOs	object	是	否	扩展查询条件
page	object	否	是	分页
pageIndex	long	否	是	页号 示例：1
pageSize	long	否	是	页数 示例：2

## 3. 请求示例

Url: /yonbip/am/rentoutbilllist/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "bill_detail.invoiced_flag",
				"op": "in",
				"value1": [
					null,
					false,
					true
				]
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
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页条数 示例：20
recordCount	long	否	记录数 示例：1
recordList	object	是	返回数据
pubts	string	否	时间戳 示例：2023-08-11 10:44:14
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：1
pageCount	long	否	总页数 示例：1

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
				"id": "1791189086936498180",
				"bill_code": "KPSQ202308110001",
				"bill_status": 1,
				"bill_code_payment": "ZCJS202308100001",
				"settlement_amount": 110867,
				"applied_invoiced_amount": 1000,
				"current_settlement_amount": 500,
				"open_bill_status": "已开票",
				"pk_mandept__name": "租赁部",
				"pk_recorder__name": "租赁-小艳",
				"pk_recorder_date": "2023-08-11",
				"memo": "备注",
				"bill_failure_info": "1791189086936498183",
				"pk_mandept": "1549986549677948935",
				"pk_recorder": "1549987382922575876",
				"pk_org__name": "LYL",
				"pk_fiorg__name": "LYL",
				"pk_currency__name": "人民币",
				"pk_fiorg__taxpayerid": "999988885555",
				"pk_fiorg__taxpayername": "用友网络科技股份有限公司",
				"pk_fiorg__taxpayertype": 1,
				"pk_org": "1549238289085497348",
				"pk_fiorg": "1549238289085497348",
				"pk_currency": "1547236147129221140",
				"customer__name": "大客户租赁",
				"billing_type": "1",
				"customer_title": "用友网络",
				"customer_taxNo": "112569887545245",
				"pk_org_in__name": "HT-Org-0915",
				"customer": 1555915752028504070,
				"pk_org_in": "1549232937556246532",
				"pk_currency__digit": 8,
				"modifier": "31b31483-645e-4f54-a4b3-817cfb17554e",
				"modifier__name": "昵称-刘艳丽",
				"modifiedtime": "45149.4473842593",
				"billmaker": "31b31483-645e-4f54-a4b3-817cfb17554e",
				"billmaker__name": "昵称-刘艳丽",
				"billmaketime": "45149.4473842593",
				"auditor": "31b31483-645e-4f54-a4b3-817cfb17554e",
				"auditor__name": "昵称-刘艳丽",
				"audittime": "45149.4473842593",
				"sysid": "LOM",
				"bill_type": "4BLM",
				"transi_type": "4BLM-01",
				"pk_transitype": "1547236147129221385",
				"src_bill_type": "4BLM",
				"src_pk_transitype": "4BLM-01",
				"src_transitype": "4BLM-01",
				"src_pk_bill": "1790544712919154697",
				"src_pk_bill_b": "1790544712919154656",
				"pk_payment": "1790544712919154692",
				"isWfControlled": true,
				"returncount": 0,
				"expense_item": "1790544712919154633",
				"source_id": "1790544712919154611",
				"verifystate": 0,
				"isFlowCoreBill": "false",
				"contract_detail": [
					{
						"id": "1791189086936498181",
						"main_id": "1791189086936498180",
						"contract_id": "1563527490647359489",
						"contract_id__bill_code": "ZCHT202210080005",
						"contract_id__contract_name": "liuqiang_test_租出归还_交互变更",
						"contract_id__contract_code": "liuqiang_test_租出归还_交互变更",
						"pk_mandept": "1549985269801811977",
						"pk_mandept__name": "资产部",
						"pk_recorder": "1549987150994341890",
						"pk_recorder__name": "资产-小刘",
						"pk_jobmngfil": "1549987150994341434",
						"pk_jobmngfil__name": "111",
						"renewed": 0,
						"gather_money": 100000,
						"adjustment_rent": 0,
						"source_id": "1790544712919152343",
						"src_pk_bill": "1790544712919154693",
						"pubts": "2023-08-11 10:44:14",
						"sysid": "1"
					}
				],
				"bill_detail": [
					{
						"id": "1791189086936498181",
						"main_id": "1791189086936498180",
						"contract_id": "1563527490647359489",
						"contract_id__bill_code": "ZCHT202210080005",
						"contract_id__contract_name": "liuqiang_test_租出归还_交互变更",
						"contract_id__contract_code": "liuqiang_test_租出归还_交互变更",
						"pk_equip": "1563526820625645577",
						"pk_equip__equip_code": "202210080010",
						"pk_equip__equip_name": "liuqiang_test_租出归还_交互变更",
						"pk_category": "1554603716836851713",
						"pk_category__category_name": "HT租赁",
						"spec": "大",
						"model": "ht001",
						"rental_unit": "0",
						"rental_period": 1,
						"cycle_rent": 100000,
						"collection_period": 1,
						"start_date": "2022-10-08",
						"end_date": "2022-10-21",
						"gather_money": 100000,
						"pk_rent_object": "1554603716836851345",
						"expense_item__name": "HT项目",
						"expense_item__assetproduct__name": "HT物料",
						"expense_item__assetproduct__productDetail__receiptName": "用友",
						"expense_item__assetproduct__productDetail__outTaxrate__name": "OLV3",
						"open_taxbill_amount": 100,
						"invoiced_flag": true,
						"invoiced_record_code": "1554603716836851555",
						"pubts": "2023-08-11 10:44:33"
					}
				],
				"expenses_detail": [
					{
						"id": "1791189086936498183",
						"main_id": "1791189086936498180",
						"pay_cost_code": "ZCFY20221221000001",
						"pay_cost_id": "1618467939218882564",
						"pay_cost_status": 1,
						"contract_id": "1618467939218882564",
						"contract_id__bill_code": "ZCHT202212210001",
						"contract_id__contract_name": "快捷-结算历史版本",
						"contract_id__contract_code": "快捷-结算历史版本",
						"pk_jobmngfil": "1618467939218882234",
						"pk_jobmngfil__name": "ht项目",
						"pk_mandept": "1549985269801811977",
						"pk_mandept__name": "资产部",
						"pk_recorder": "1549987150994341890",
						"pk_recorder__name": "资产-小刘",
						"pk_recorder_date": "2022-12-21",
						"pk_equip": "1613099951640805377",
						"pk_equip__equip_code": "EAM-TEST-2022121400000204",
						"pk_equip__equip_name": "00002",
						"settlement_amount": 0,
						"identify_date": "2022-12-21",
						"expense_item": "1564309990738493735",
						"expense_item__name": "委外加工费",
						"src_pk_bill": "1790544712919154699",
						"expense_item__assetproduct__name": "HT物料",
						"expense_item__assetproduct__productDetail__receiptName": "用友",
						"expense_item__assetproduct__productDetail__outTaxrate__name": "OLV3",
						"open_taxbill_amount": "0",
						"source_id": "1564309990738493543",
						"tax_bill_type": "1",
						"pubts": "2023-08-11 10:44:14",
						"invoiced_flag": true,
						"invoiced_record_code": "0000L84AQ6V4GXJ0262320"
					}
				],
				"other_detail": [
					{
						"id": "1791189086936498184",
						"main_id": "1791189086936498180",
						"compensation_money": 100,
						"contract_id": "1618476168376221699",
						"contract_id__bill_code": "ZCHT202212210004",
						"pk_equip": "1576836597883600904",
						"pk_equip__equip_code": "202210260003",
						"pk_equip__equip_name": "zh资产8",
						"pk_rent_object": "1554603716836851345",
						"pk_rent_object__rent_object": "一层",
						"lease_object_description": "一层",
						"compensation_reason": "1554603716836853456",
						"compensation_reason__name": "资产损坏",
						"expense_item": "1554603716836853324",
						"expense_item__name": "HT项目",
						"expense_item__assetproduct__name": "HT物料",
						"expense_item__assetproduct__productDetail__receiptName": "用友",
						"expense_item__assetproduct__productDetail__outTaxrate__name": "OLV3",
						"open_taxbill_amount": 0,
						"source_id": "1790544712919154234",
						"tax_bill_type": "1",
						"src_pk_bill": "1790544712919154700",
						"pubts": "2023-08-11 10:44:14",
						"invoiced_flag": false,
						"invoiced_record_code": "0000L84AQ6V4G234234"
					}
				],
				"taxbill_detail": [
					{
						"id": "1791189086936498199",
						"main_id": "1791189086936498180",
						"invoice_code": "xxx",
						"invoice_number": "xxx",
						"bill_date": "2022-12-21",
						"check_code": "2255",
						"money": 500,
						"rate": 0.3,
						"tax": 150,
						"levied_total": 650,
						"red_dashed": false,
						"bill_memo": "备注",
						"tax_bill_type": 1
					}
				]
			}
		],
		"pubts": "2023-08-11 10:44:14",
		"beginPageIndex": 1,
		"endPageIndex": 1,
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

