---
title: "租出运营数据弃审"
apiId: "2329439224603344897"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-out Operation Data"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-out Operation Data]
platform_version: "BIP"
source_type: community-api-docs
---

# 租出运营数据弃审

>  请求方式	POST | Lease-out Operation Data (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/rentoutoperadata/unsubmit
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
data	object	是	否	租出运营数据参数项
id	string	否	是	租出运营数据主键 示例：2318999095537565701
fromApi	boolean	否	否	是否来源于OpenApi

## 3. 请求示例

Url: /yonbip/ACC/rentoutoperadata/unsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2318999095537565701",
			"fromApi": true
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
code	string	否	状态码 示例：200
message	string	否	状态值 示例：操作成功！
data	object	否	租出运营数据
count	number
小数位数:0,最大长度:10	否	总数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功数 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败数 示例：0
messages	object	否	返回消息
infos	object	是	详情
failInfos	object	否	错误信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": {},
		"infos": [
			{
				"pk_org__name": "HT资产组织",
				"bill_code": "ZCYY202507220001",
				"pk_record_date": "2025-07-22 00:00:00",
				"contract__bill_code": "ZCHT202507220002",
				"contract__contract_code": "20250722-2020",
				"contract__contract_name": "20250722-2028",
				"customer__name": "测试开票客户",
				"pk_org_in__name": "",
				"pk_transitype__name": "租出运营数据",
				"contract_way": 0,
				"pk_recorder__name": "HTRENT",
				"pk_record_dept__name": "技术部",
				"bill_status": 0,
				"verifystate": 0,
				"contract__pk_jobmngfil__name": "",
				"synergy": false,
				"confirmed": false,
				"pk_identify_user__name": "",
				"id": "2318999095537565701",
				"pubts": "2025-08-05 16:02:21",
				"sysid": "LOM",
				"pk_org": "2113470926006779909",
				"contract": "2318994242204598276",
				"pk_jobmngfil__name": "",
				"customer": "2141468615207026691",
				"pk_psndoc__name": "",
				"customer_way": 1,
				"pk_recorder": "2126008562609029120",
				"pk_record_dept": "2116509108564656132",
				"transi_type": "4BLG-01",
				"pk_transitype": "2107554909184851977",
				"bill_type": "4BLG",
				"billmaker": "2f847281-6e57-4d90-85b7-0cc149d37667",
				"billmaker__name": "HTRENT",
				"billmaketime": "2025-07-22 14:50:27",
				"modifier": "2f847281-6e57-4d90-85b7-0cc149d37667",
				"modifier__name": "HTRENT",
				"modifiedtime": "2025-07-23 16:34:24",
				"auditor": "",
				"auditor__name": "",
				"audittime": "",
				"creator": "2f847281-6e57-4d90-85b7-0cc149d37667",
				"creator__name": "HTRENT",
				"creationtime": "2025-07-22 14:50:27",
				"isWfControlled": false,
				"returncount": 0,
				"src_pk_bill": "2318994242204598276",
				"origcurrtypeid": "2107554866232033332",
				"origcurrtypeid__name": "人民币",
				"origcurrtypeid__moneyDigit": "2",
				"origcurrtypeid__priceDigit": "3",
				"pk_currency": "2107554866232033332",
				"pk_currency__name": "人民币",
				"pk_currency__moneyDigit": "2",
				"pk_currency__priceDigit": "3",
				"bodyvos": [
					{
						"src_pk_bill": "2318994242204598276",
						"rent_detail_equippack": [
							{
								"pk_priority__priority_name": "重点资产",
								"pk_equip__spec": "11-001",
								"pk_priority": "PRESET02_0000M232Z6A20YFPC30000",
								"sub_flag": false,
								"spec": "11-001",
								"pk_equip__pk_priority__priority_name": "重点资产",
								"lease_out_details": "2318999095537565702",
								"equip_code": "EAM-2025072200000003",
								"pk_equip__equip_code": "EAM-2025072200000003",
								"pk_equip__pk_used_status__status_name": "在用",
								"model": "22-002",
								"id": "2318999095537565703",
								"pk_equip__model": "22-002",
								"pk_used_status": "PRESET01_0000M232Z6A20YFPC30000",
								"pk_category__category_name": "HTzu",
								"pk_equip__pk_priority": "PRESET02_0000M232Z6A20YFPC30000",
								"pk_equip__pk_used_status": "PRESET01_0000M232Z6A20YFPC30000",
								"main_id": "2318999095537565701",
								"equip_name": "HT共享资产0722-2",
								"pk_category": "2167631382723428357",
								"pk_equip": "2318864422538838017",
								"pk_equip__equip_name": "HT共享资产0722-2"
							}
						],
						"expense_item": "2123999668964163589",
						"settled": false,
						"pk_project__name": "111",
						"num": 77,
						"pk_recorder_date": "2025-07-22 00:00:00",
						"main_id": "2318999095537565701",
						"contract_detail": "2318995298758688774",
						"pk_project": "2252262931588186119",
						"src_pk_bill_b": "2318995298758688774",
						"pk_equip__pk_category": "2167631382723428357",
						"expense_item__name": "装卸费",
						"pk_equip__equip_code": "EAM-2025072100000006",
						"pk_equip": "2318261177199624204",
						"pk_equip__pk_category__category_name": "HTzu",
						"pk_equip__equip_name": "共享卡片0721",
						"id": "2318999095537565702",
						"pk_project__data_accuracy": "0"
					}
				],
				"check_opinion": ""
			}
		],
		"failInfos": {}
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

