---
title: "所有权调出审核"
apiId: "2313827817347350537"
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

# 所有权调出审核

>  请求方式	POST | Ownership Transfer-out (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/deployout/submit
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
data	object	是	否	所有权调出参数项
id	string	否	否	所有权调出主键 示例：2230709471361892359

## 3. 请求示例

Url: /yonbip/am/deployout/submit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "2230709471361892359"
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
code	string	否	返回结果编码 示例：200
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
count	number
小数位数:0,最大长度:10	否	总数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功个数 示例：1
failCount	number
小数位数:0,最大长度:10	否	错误个数 示例：0
messages	string	是	返回信息
infos	object	是	返回数据
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
				"_entityName": "aum.deploy.DeployOutHeadVO",
				"id": "2256640963481436162",
				"bodyvos": [
					{
						"associate_status_flag_before": false,
						"pk_equip": "2201037921724137476",
						"pk_category": "2097858204361818120",
						"pk_mandept_before": "2097854845709975552",
						"pk_addreducestyle": 2097839710263050282,
						"pk_org": "2097854596607115265",
						"rowno": "10",
						"pk_currency": "2097839710259380276",
						"pk_usedorg_out": "2097854596607115265",
						"id": "2256640963481436163",
						"tenant": "0000M1KDLF2WBNDBSX0000",
						"stock_in_flag": false,
						"stock_out_flag": false,
						"pk_status_before": "PRESET01_0000M1KDLF2WBNDBSX0000",
						"pk_status_after": "PRESET01_0000M1KDLF2WBNDBSX0000",
						"status_date_before": "2025-02-13",
						"status_date_after": "2025-04-29",
						"associate_flag_before": false,
						"assets_amount": 0,
						"notaxassets_amount": 0,
						"assets_amount_tax": 0,
						"invoicing_flag": false,
						"isapprove_deployin": false,
						"main_id": "2256640963481436162",
						"amount_received": 0,
						"collection_tax": 0,
						"real_opening_amount": 0,
						"invoicing_generated": 0,
						"equip_name": "视频卡片"
					}
				],
				"push_status": 0,
				"pk_org": "2097854596607115265",
				"pk_ownerorg_out": "2097854596607115265",
				"pk_ownerorg_in": "2097842201331499014",
				"bill_status": 1,
				"pk_ownerunit_in": "2097842201331499014",
				"pk_ownerunit_out": "2097854596607115265",
				"bill_date": "2025-04-29",
				"bill_code": "ZCDC202504290001",
				"pk_recorder_in": "2226947646927929347",
				"bill_type": "4A33",
				"pk_transitype": "2097839796130414665",
				"transi_type": "4A33-01",
				"postAccountStatus": 99,
				"taxpayer_id": "33",
				"taxpayer_type": "1",
				"pk_currency": "2097839710259380276",
				"total_amount": 0,
				"notaxtotal_amount": 0,
				"total_amount_tax": 0,
				"isFlowCoreBill": true,
				"bizFlow": "56bb2862-38f0-4368-866b-12f8c146d74c",
				"actual_invoice_amount": 0,
				"pubts": "2025-04-29 14:25:08",
				"tenant": "0000M1KDLF2WBNDBSX0000",
				"sysid": "AUM",
				"isWfControlled": false,
				"verifystate": 2,
				"returncount": 0,
				"billmaker": "df943d6e-074f-454a-8413-8bfd70fd0e29",
				"billmaketime": "2025-04-29 14:19:45",
				"creator": "df943d6e-074f-454a-8413-8bfd70fd0e29",
				"creationtime": "2025-04-29 14:19:45",
				"djqqlsh": "2256640963481436162",
				"auditor": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"auditor__name": "默认用户",
				"audittime": "2025-04-29 14:25:08"
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

