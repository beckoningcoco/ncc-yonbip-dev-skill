---
title: "检定记录保存"
apiId: "2277439961079742473"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Record"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 检定记录保存

>  请求方式	POST | Inspection Record (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/mimverificationrecordcard/save
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
data	object	是	否	检定记录参数对象
id	string	否	否	主键ID(修改必传)
pk_org	string	否	是	资产组织id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2110350357259354114
pk_fiorg	string	否	否	会计主体ID或者编码 示例：2110350357259354114
bill_code	string	否	否	记录单号 示例：JDJL202505270001
pk_mandept	string	否	否	经办部门ID或者编码 示例：2206801192291926023
pk_recorder	string	否	否	经办人 示例：2206805238164750340
pk_recorder_date	date
格式:yyyy-MM-dd	否	否	经办日期 示例：2025-05-27
verification_org_after	string	否	否	检定机构ID或者编码
total_expenses	number
小数位数:8,最大长度:28	否	否	费用合计 示例：0
bill_type	string	否	否	单据类型 示例：4A74 默认值：4A74
pk_transitype	string	否	否	交易类型ID 示例：2112854039728750672
transi_type	string	否	否	交易类型编码 示例：4A74-01 默认值：4A74-01
billmaker	string	否	否	制单人 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	制单时间 示例：2025-05-27 15:23:27
project	string	否	否	项目
wbs	string	否	否	WBS
activity	string	否	否	活动
memo	string	否	否	备注
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳
_status	string	否	是	数据状态：1.Insert：新增；2.Update：
bodyvos	object	是	否	检定记录子表

## 3. 请求示例

Url: /yonbip/am/mimverificationrecordcard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"pk_org": "2110350357259354114",
			"pk_fiorg": "2110350357259354114",
			"bill_code": "JDJL202505270001",
			"pk_mandept": "2206801192291926023",
			"pk_recorder": "2206805238164750340",
			"pk_recorder_date": "2025-05-27",
			"verification_org_after": "",
			"total_expenses": 0,
			"bill_type": "4A74",
			"pk_transitype": "2112854039728750672",
			"transi_type": "4A74-01",
			"billmaker": "ffde1766-84ad-4059-abd4-7f1a7c451354",
			"billmaketime": "2025-05-27 15:23:27",
			"project": "",
			"wbs": "",
			"activity": "",
			"memo": "",
			"pubts": "2026-06-07 13:22:48",
			"_status": "",
			"bodyvos": [
				{
					"id": "",
					"pk_equip": "2277454074328121347",
					"pk_category": "2206801484351799302",
					"accuracy_level": "",
					"uncertainty_after": "",
					"uncertainty_before": "",
					"verification_org_before": "",
					"verification_result_before": "",
					"verification_result_after": "0",
					"verification_report_code_after": "1212",
					"verification_report_code_before": "",
					"verification_date_after": "2025-05-06",
					"verification_date_before": "2026-06-07",
					"verification_expiry_date_after": "2025-05-20",
					"verification_expiry_date_before": "2026-06-07 13:22:48",
					"pk_ownerorg_equip": "2110350357259354114",
					"pk_mandept_equip": "2206801192291926023",
					"pk_usedorg_equip": "2110350357259354114",
					"pk_manager_equip": "",
					"pk_usedept_equip": "",
					"pk_ownerunit_equip": "2110350357259354114",
					"pk_user_equip": "",
					"report_code": "",
					"check_status_before": "",
					"verification_expenses": 0,
					"pk_costcenter_use": "",
					"verification_basis": "",
					"verification_certifier": "",
					"verification_verifier": "",
					"verifier": "",
					"main_id": "",
					"_status": "Insert",
					"grandvos": [
						{
							"qualified": "0",
							"items_name": "12121",
							"id": "",
							"main_id": "",
							"standard_description": "",
							"verification_result": "",
							"memo": "",
							"_status": "Insert"
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
count	number
小数位数:0,最大长度:10	否	总数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功数量 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败数量 示例：0
messages	string	是	返回详细信息
infos	object	是	数据详细信息
failInfos	string	是	错误信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": "2278067567447769095",
				"bill_code": "JDJL202505280001",
				"pk_recorder_date": "2025-05-28 00:00:00",
				"pk_group": "",
				"pk_org": "2110350357259354114",
				"pk_transitype": "2112854039728750672",
				"bill_type": "4A74",
				"sysid": "MIM",
				"verifystate": 0,
				"bill_status": 0,
				"transi_type": "4A74-01",
				"billmaker": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"billmaketime": "2025-05-28 11:12:49",
				"billmaker__name": "默认用户",
				"pk_fiorg": "",
				"isWfControlled": false,
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creator__name": "默认用户",
				"creationtime": "2025-05-28 11:12:49",
				"tenant": "0000M28G9WYRGFC4CH0000",
				"pubts": "2025-05-28 11:13:02",
				"ytenant": "0000M28G9WYRGFC4CH0000",
				"pk_recorder": "",
				"total_expenses": 0,
				"project": "",
				"wbs": "",
				"activity": "",
				"memo": "",
				"verification_org_after": "",
				"bodyvos": [
					{
						"check_status_before": "true",
						"pk_ownerorg_equip": "2110350357259354114",
						"pk_org": "2110350357259354114",
						"verification_date_before": "2025-05-28 00:00:00",
						"pk_mandept_equip": "2206801192291926023",
						"verification_org_before": "HT001",
						"id": "2278067567447769096",
						"tenant": "0000M28G9WYRGFC4CH0000",
						"ytenant": "0000M28G9WYRGFC4CH0000",
						"verification_result_after": "0",
						"main_id": "2278067567447769095",
						"verification_result_before": "0",
						"pk_equip": "2277454074328121347",
						"pk_measure_instrument_category": "2277427720426618883",
						"pk_equip__equip_name": "测试卡片",
						"verification_date_after": "2025-05-28 00:00:00",
						"report_code": "",
						"verification_report_code_after": "",
						"verification_report_code_before": "",
						"verification_expiry_date_after": "2026-06-07 13:22:48",
						"verification_expiry_date_before": "2026-06-07 13:22:48",
						"verification_expenses": 0,
						"pk_costcenter_use": "",
						"accuracy_level": "",
						"uncertainty_after": "",
						"uncertainty_before": "",
						"verification_basis": "",
						"verification_certifier": "",
						"verification_verifier": "",
						"verifier": "",
						"pk_ownerunit_equip": "",
						"pk_manager_equip": "",
						"pk_usedorg_equip": "",
						"pk_usedept_equip": "",
						"pk_user_equip": "",
						"grandvos": [
							{
								"qualified": "0",
								"items_name": "12112",
								"ytenant": "0000M28G9WYRGFC4CH0000",
								"main_id": "2278067567447769096",
								"id": "2278067567447769097",
								"tenant": "0000M28G9WYRGFC4CH0000",
								"standard_description": "",
								"verification_result": "",
								"memo": ""
							}
						]
					}
				]
			}
		],
		"failInfos": [
			""
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
999	错具体提示信息，例如：服务端逻辑异常	查看日志找对应异常服务定位产生原

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

