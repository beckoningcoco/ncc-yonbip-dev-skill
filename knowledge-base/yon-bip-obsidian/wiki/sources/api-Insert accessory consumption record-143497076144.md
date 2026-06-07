---
title: "插入配件消耗记录"
apiId: "1434970761446555648"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Service Work Order"
domain: "EQP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Service Work Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 插入配件消耗记录

>  请求方式	POST | Service Work Order (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pes/soItem/v1/insert
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
soId	string	否	否	工单id 示例：2720154847990016
code	string	否	否	工单编号，id和ciode不可同时为空 示例：0000162164
soEquipmentId	string	否	是	设备子表ID 示例：1599625514051436550
soItemlines	object	是	是	配件信息
itemId	string	否	否	配件id 示例：2235833520558336
itemCode	string	否	否	配件编号，id和code不可同时为空
brandId	string	否	否	品牌id 示例：2521785500061953
brandCode	string	否	否	品牌编号
batch	string	否	否	批号 示例：1
qty	string	否	是	数量 示例：100

## 3. 请求示例

Url: /yonbip/pes/soItem/v1/insert?access_token=访问令牌
Body: {
	"soId": "2720154847990016",
	"code": "0000162164",
	"soEquipmentId": "1599625514051436550",
	"soItemlines": [
		{
			"itemId": "2235833520558336",
			"itemCode": "",
			"brandId": "2521785500061953",
			"brandCode": "",
			"batch": "1",
			"qty": "100"
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
code	string	否	code 示例：200
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
message	string	否	message
data	object	否	data
successMap	object	是	成功插入的数据集

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"successMap": [
			{
				"id": "2733146930155776",
				"soId": "2720154847990016",
				"soEquipmentId": "1599625514051436550",
				"itemId": "2235833520558336",
				"brandId": "2521785500061953",
				"batch": "1",
				"qty": "100"
			}
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
999	取决于错误类型，不同错误信息不同	
1001001000003	操作错误，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 (7)
更新
返回参数 (11)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

