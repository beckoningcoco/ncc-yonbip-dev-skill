---
title: "租入交接保存"
apiId: "1658512075478007814"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-in Handover"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-in Handover]
platform_version: "BIP"
source_type: community-api-docs
---

# 租入交接保存

>  请求方式	POST | Lease-in Handover (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/limrentindivertcard/save
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
data	object	是	否	租入交接主表
pk_transitype	string	否	否	交易类型id或编码 示例：1547236147129223653
pk_org	string	否	是	承租组织id或编码 示例：1549232937556246532
pk_dept	string	否	否	经办部门id或编码 示例：1550100744281522179
pk_recorder	string	否	否	经办人id或编码 示例：1550101208145854470
pk_record_date	Date	否	否	经办日期 示例：2023-02-13
currrate	Number	否	否	汇率 若不填写，则由汇率类型和汇率日期带出，若填写汇率类型需为自定义汇率类型 示例：6
currrate_type	string	否	是	汇率类型id或编码 示例：0000L84AQ6V4GXJ0260000
currrate_date	Date	否	是	汇率日期 示例：2023-02-13
memo	string	否	否	备注 示例：备注
bodyvos	object	是	否	租入交接表体

## 3. 请求示例

Url: /yonbip/am/limrentindivertcard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_transitype": "1547236147129223653",
			"pk_org": "1549232937556246532",
			"pk_dept": "1550100744281522179",
			"pk_recorder": "1550101208145854470",
			"pk_record_date": "2023-02-13",
			"currrate": 6,
			"currrate_type": "0000L84AQ6V4GXJ0260000",
			"currrate_date": "2023-02-13",
			"memo": "备注",
			"bodyvos": [
				{
					"src_pk_bill": "1656678897432395776",
					"src_pk_bill_b": "1656678897432395777",
					"equip_code": "LIM20230213000002",
					"equip_name": "AA",
					"pk_category": "1550298475974361097",
					"spec": "规格",
					"model": "型号",
					"pk_material": "1710409187580182535",
					"payment_period": 0,
					"payment_date_type": 0,
					"first_payment_date": "2023-02-13",
					"lease_in_date": "2023-02-13",
					"planned_return_date": "2023-03-11",
					"start_date": "2023-02-13",
					"rent_holiday": 0,
					"pk_usedept": "1549232937556246532",
					"pk_user": "1549232937556246532",
					"pk_location": "1549232937556246532",
					"pk_icorg": "1549232937556246532",
					"pk_warehouse": "1549232937556246532",
					"serial_num": "序列号",
					"ofuse_price_rate": 0.1,
					"buy_money": 3000,
					"renewed_duration": 0,
					"renewed_duration_unit": 0,
					"renewed_price": 300,
					"ofuse_flag": false,
					"pk_jobmngfil": "1656678897432395776",
					"memo": "备注",
					"src_transi_type": "4A3A-01"
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
code	long	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	数据
count	long	否	数量 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
messages	object	是	返回信息
infos	object	是	保存成功信息
failInfos	object	是	保存失败信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"switchCode": "1",
				"bill_type": "4A3Z",
				"transi_type": "4A3Z-01",
				"pk_org": "1587835313430986760",
				"bill_status": 0,
				"contract_way": 0,
				"synergy": false,
				"be_synergy": false,
				"currrate_type": "0000L6VWE12DH6JBPJ0000",
				"currrate_date": "2023-03-07 00:00:00",
				"verifystate": 0,
				"bodyvos": [
					{
						"contract_bill_code": "ZRHT202303010001",
						"contract_code": "OpenAPI-交接",
						"contract_name": "OpenAPI-交接",
						"equip_code": "LIM20230301000003",
						"planned_return_date": "2023-03-25 00:00:00",
						"start_date": "2023-03-07 00:00:00",
						"ofuse_flag": true,
						"src_bill_type": "4A3A",
						"src_transi_type": "4A3A-01",
						"id": "1674854297208619010",
						"main_id": "1674854297208619009",
						"pk_org": "1587835313430986760"
					}
				],
				"id": "1674854297208619009",
				"sysid": "LIM",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creator__name": "默认用户",
				"creationtime": "2023-03-07 16:45:02",
				"billmaker": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"billmaker__name": "默认用户",
				"billmaketime": "2023-03-07 16:45:02",
				"pk_transitype": "1524173469928391564",
				"isWfControlled": false,
				"bill_code": "ZRJJ202303070004",
				"pubts": "2023-03-07 16:45:04"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

