---
title: "租入发票保存"
apiId: "1665105966968340481"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-in Invoice"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-in Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 租入发票保存

>  请求方式	POST | Lease-in Invoice (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/limrentinbillcard/save
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
data	object	是	否	租入发票主表
pk_org	string	否	是	承租组织id或编码 示例：1520504537049202694
pk_fiorg	string	否	是	承租会计主体 示例：1520504537049202694
contract_id	string	否	否	合同编码 示例：1647340307199557637
customer_out	string	否	否	出租方id或编码 示例：1524008448596901892
pk_org_out	string	否	否	出租组织id或编码 示例：1520504537049202694
pk_fiorg_out	string	否	否	出租会计主体id或编码 示例：1520504537049202694
taxpayer_code_out	string	否	否	纳税识别号 示例：NS.No1
rent_address_out	string	否	否	地址 示例：beiqing
rent_phone_out	string	否	否	电话 示例：15901107561
pk_mandept	string	否	否	经办部门id或编码 示例：1523987643874410497
pk_recorder	string	否	否	经办人id或编码 示例：1523988279527473153
pk_recorder_date	Date	否	是	经办日期 示例：2023-02-22 00:00:00
memo	string	否	否	备注 示例：备注
pk_transitype	string	否	否	交易类型 示例：4ALM 默认值：4ALM-01
bill_type	string	否	否	单据类型 示例：4ALM 默认值：4ALM
origcurrtypeid	string	否	否	原币币种id或编码 示例：CNY
bodyvos	object	是	否	租入发票子表

## 3. 请求示例

Url: /yonbip/am/limrentinbillcard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_org": "1520504537049202694",
			"pk_fiorg": "1520504537049202694",
			"contract_id": "1647340307199557637",
			"customer_out": "1524008448596901892",
			"pk_org_out": "1520504537049202694",
			"pk_fiorg_out": "1520504537049202694",
			"taxpayer_code_out": "NS.No1",
			"rent_address_out": "beiqing",
			"rent_phone_out": "15901107561",
			"pk_mandept": "1523987643874410497",
			"pk_recorder": "1523988279527473153",
			"pk_recorder_date": "2023-02-22 00:00:00",
			"memo": "备注",
			"pk_transitype": "4ALM",
			"bill_type": "4ALM",
			"origcurrtypeid": "CNY",
			"bodyvos": [
				{
					"invoice_type": "1",
					"bill_code": "11111",
					"bill_num": "222222",
					"bill_date": "2023-02-22",
					"check_code": "1111",
					"pk_payee": "收款人",
					"confirmed": "复核人",
					"pk_drawer": "开票人",
					"memo": "子表备注",
					"billdetailed": [
						{
							"bill_num": "222222",
							"num": "2.00",
							"pk_expense_item": "1525485324723552263",
							"bill_name": "开票名称",
							"rent_style": "1515941099961057281",
							"rental_unit": 1,
							"tax_id": "1515209314829074476"
						}
					]
				}
			]
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
data	object	否	数据
count	long	否	数量 示例：3
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：2
messages	object	是	返回信息
infos	object	是	保存成功信息
failInfos	object	是	保存失败信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 3,
		"sucessCount": 1,
		"failCount": 2,
		"messages": [
			{}
		],
		"infos": [
			{
				"pk_org": "1549232937556246532",
				"bill_status": 0,
				"pk_fiorg": "1549232937556246532",
				"contract_id": "1674035143741800450",
				"customer_out": 1670973768365244400,
				"pk_org_out": "1549238289085497348",
				"pk_fiorg_out": "1549238289085497348",
				"taxpayer_code_out": "1155225544",
				"rent_address_out": "北清路用友网络",
				"rent_phone_out": "15901107561",
				"pk_mandept": "1550100744281522179",
				"pk_recorder": "1550101208145854470",
				"pk_recorder_date": "2023-03-01 00:00:00",
				"transi_type": "4ALM-01",
				"bill_type": "4ALM",
				"verifystate": 0,
				"billmaker": "ffde1766-84ad-4059-abd4-7f1a7c451354",
				"bodyvos": [
					{
						"invoice_type": "1",
						"bill_code": "111111",
						"bill_num": "1111",
						"billdetailed": [
							{
								"bill_num": "1111",
								"num": "1.00",
								"pk_expense_item": 1566290443122507800,
								"bill_name": "开票名称",
								"rent_style": 1549243906908487700,
								"rental_unit": 100,
								"tax_id": "10004",
								"tax_id__tax_rate": 0.03,
								"rent_cost": 100,
								"rent_tax": 0.03,
								"merge_tax": 100.03,
								"id": "1674181980087910408",
								"main_id": "1674181980087910407"
							}
						],
						"bill_date": "2023-03-01 00:00:00",
						"check_code": "11111",
						"pk_payee": "收款人",
						"confirmed": "复核",
						"pk_drawer": "开票人",
						"memo": "备注",
						"rent_cost": 2600,
						"rent_tax": 0.78,
						"merge_tax": 2600.78,
						"id": "1674181980087910407",
						"main_id": "1674181980087910406"
					}
				],
				"origcurrtypeid": "1547236147129221152",
				"src_pk_bill": "1674035143741800450",
				"origcurrtypeid__moneyDigit": 2,
				"origcurrtypeid__priceDigit": 2,
				"total_cost": 2600,
				"total_tax": 0.78,
				"merge_tax": 2600.78,
				"id": "1674181980087910406",
				"sysid": "LIM",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creator__name": "默认用户",
				"creationtime": "2023-03-06 19:00:34",
				"billmaketime": "2023-03-06 19:00:34",
				"pk_transitype": "1547236147129221389",
				"isWfControlled": false,
				"bill_code_rent_in": "ZRFP202303060003",
				"pubts": "2023-03-06 19:00:34",
				"billmaker__name": "制单人",
				"memo": "备注信息"
			}
		],
		"failInfos": [
			{}
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
999	报错具体提示信息，例如：服务端逻辑异常	查看日志找对应异常服务定位产生原因

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
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

