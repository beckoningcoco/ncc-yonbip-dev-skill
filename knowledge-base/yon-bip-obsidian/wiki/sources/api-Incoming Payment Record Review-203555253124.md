---
title: "来款记录保存"
apiId: "2035552531249102849"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Incoming Payment Record"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Incoming Payment Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 来款记录保存

>  请求方式	POST | Incoming Payment Record (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/api/upayment/batchSave
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
amount	number
小数位数:4,最大长度:16	否	是	金额 示例：200
originalPk	string	否	是	币种id或编码 示例：CNY
agentId	string	否	是	客户id或编码 示例：25435
settlementOrgId	string	否	是	会计组织id或编码 示例：905113
notetype	string	否	否	票据类型id或编码 示例：D001
exchangeRateType	string	否	否	汇率类型id或编码 示例：01
corpFinancialId	string	否	否	收款现金账户id或编码 示例：121e
transactionTypeId	string	否	否	交易类型id或编码 示例：general_collection
payFinishDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据日期 示例：2024-07-24
settlementId	string	否	否	结算方式id或者code 示例：银行转账
salesOrgId	string	否	否	销售组织ID或编码 示例：905113
projectId	string	否	否	项目id或编码 示例：00000001
dept	string	否	否	部门id或编码 示例：5252
staff	string	否	否	业务员id或编码 示例：000000000000000000000080
code	string	否	否	来款记录单号 示例：RECar202408010004
source	number
小数位数:0,最大长度:10	否	否	来源，来源[("UDH", 0), ("U8ERP", 1), ("优普商务系统", 2), ("企业空间", 3), ("钛合系统", 4), ("点睛系统", 5), ("OPENAPI", 6), ("开通系统专用", 7), ("超客营销", 8), ("NCERP", 9), ("U9ERP", 10), ("U8cloud", 11), ("UHT", 12), ("畅捷通T+", 13), ("U8C", 14), ("费用", 15), ("销售退货", 16), UNKNOWN("其他" 默认值：0
sourceNo	string	否	否	来源单号，来源不为UDH时，需要填来源单号
sourceId	string	否	否	来源id，来源不为UDH时，需要填来源id 示例：213214324324
paymentDetails	object	是	否	来款记录表体行，可以有多行
amount	number
小数位数:4,最大长度:16	否	否	表体金额，表体金额之和需要和表头相等 示例：200
staff	string	否	否	表体业务员id或编码 示例：5252
dept	string	否	否	表体部门id或编码 示例：000000000000000000000080
projectId	string	否	否	表体项目id或编码 示例：00000001
salesOrgId	string	否	否	表体销售组织ID或编码 示例：905113
expenseItemId	string	否	否	表体费用项目id或编码 示例：2642379089416960
capitalAccountId	string	否	否	表体资金账户id或编码 示例：2004351054148796425
notetype	string	否	否	表体票据类型id或编码 示例：D001
paymentType	number
小数位数:0,最大长度:10	否	否	表体款项类型编码

## 3. 请求示例

Url: /yonbip/sd/api/upayment/batchSave?access_token=访问令牌
Body: [{
	"amount": 200,
	"originalPk": "CNY",
	"agentId": "25435",
	"settlementOrgId": "905113",
	"notetype": "D001",
	"exchangeRateType": "01",
	"corpFinancialId": "121e",
	"transactionTypeId": "general_collection",
	"payFinishDate": "2024-07-24",
	"settlementId": "银行转账",
	"salesOrgId": "905113",
	"projectId": "00000001",
	"dept": "5252",
	"staff": "000000000000000000000080",
	"code": "RECar202408010004",
	"source": 0,
	"sourceNo": "",
	"sourceId": "213214324324",
	"paymentDetails": [
		{
			"amount": 200,
			"staff": "5252",
			"dept": "000000000000000000000080",
			"projectId": "00000001",
			"salesOrgId": "905113",
			"expenseItemId": "2642379089416960",
			"capitalAccountId": "2004351054148796425",
			"notetype": "D001",
			"paymentType": 0
		}
	]
}]

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
code	string	否	返回码 示例：200
message	string	否	信息 示例：操作成功
data	object	否	数据
count	number
小数位数:0,最大长度:10	否	发起请求的单据数量 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功数量 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败数量 示例：0
messages	string	是	详细信息
infos	object	是	成功信息
failInfos	string	是	失败信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"amount": 2,
				"originalPk": "1710319285284896802",
				"agentId": 1959652942940209200,
				"settlementOrgId": "1874295819467751430",
				"exchangeRateType": "0000LGUA62MHBEVKNC0000",
				"transactionTypeId": "1710319285284897440",
				"payFinishDate": "2024-07-14 00:00:00",
				"settlementId": 1710319293868015600,
				"paymentDetails": [
					{
						"amount": 2,
						"paymentTypeId": 1710319293843374000,
						"_status": "Update",
						"id": 2049657298353651700,
						"paymentVoucher": 2049657298353651700,
						"settlementId": 1710319293868015600,
						"transactionTypeId": "1710319285284897440",
						"corpId": 3262169550886176,
						"bizId": 3262169550886176,
						"agentId": 1959652942940209200,
						"settlementOrgId": "1874295819467751430",
						"originalPk": "1710319285284896802",
						"usedMoney": 0,
						"notUsedMoney": 2,
						"paymentType": 1,
						"exchangeRateType": "0000LGUA62MHBEVKNC0000",
						"exchangeRate": 0,
						"uordercorp": 3262169550886176,
						"ytenant": "0000LGUA62MHBEVKNC0000",
						"yTenantId": "0000LGUA62MHBEVKNC0000",
						"payNo": "RECar202407240007"
					}
				],
				"billnum": "payment_voucher_list_receipt",
				"payCreateDate": "2024-07-24 16:58:33",
				"agentId_code": "25435",
				"agentId__transferValue": true,
				"originalPk_code": "CNY",
				"originalPk__transferValue": true,
				"settlementOrgId_code": "905113",
				"settlementOrgId__transferValue": true,
				"exchangeRateType_code": "01",
				"exchangeRateType__transferValue": true,
				"settlementId_name": "银行转账",
				"settlementId_name2": "Bank Transfer",
				"settlementId_name3": "銀行轉賬",
				"settlementId__transferValue": true,
				"transactionTypeId_code": "general_collection",
				"transactionTypeId__transferValue": true,
				"source": 0,
				"payVoucherType": "PAYMENT",
				"payMentStatusCode": 4,
				"voucherType": "NORMAL",
				"bizId": 3262169550886176,
				"creator": "默认用户",
				"payBusinessCode": "RECHARGE",
				"createTime": "2024-07-24 16:58:34",
				"payType": 2,
				"corpId": 3262169550886176,
				"settlementWayErpCode": "system_0001",
				"settlementWayName": "银行转账",
				"id": 2049657298353651700,
				"notUsedMoney": 2,
				"paymentStatus": [
					{
						"code": 4,
						"corpId": 3262169550886176,
						"created": "2024-07-24 16:58:34",
						"paymentVoucher": 2049657298353651700,
						"name": "开立",
						"id": 2049657298353651700,
						"createrId": 1710316622391541800,
						"pubts": "2024-07-24 16:58:34",
						"uordercorp": 3262169550886176,
						"ytenant": "0000LGUA62MHBEVKNC0000",
						"yTenantId": "0000LGUA62MHBEVKNC0000"
					}
				],
				"code": "RECar202407240007",
				"isWfControlled": false,
				"pubts": "2024-07-24 16:58:34",
				"uordercorp": 3262169550886176,
				"ytenant": "0000LGUA62MHBEVKNC0000",
				"yTenantId": "0000LGUA62MHBEVKNC0000",
				"_convert_paymentDetails": "ok"
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
200	{ "code": "200", "message": "操作成功", "data": { "count": 1, "sucessCount": 0, "failCount": 1, "messages": [ "会计主体ID:3未找到", "客户id:3未找到", "币种:3未找到" ], "infos": [], "failInfos": [] } }	接口调用成功，保存失败信息在messages展示
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 amount
更新
请求参数 amount

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

