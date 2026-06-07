---
title: "电商收付款导入"
apiId: "044330e4be1b46b6869bb021021fc9fc"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-commerce Collection/Payment"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-commerce Collection/Payment]
platform_version: "BIP"
source_type: community-api-docs
---

# 电商收付款导入

>  请求方式	POST | E-commerce Collection/Payment (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/a/dst/collectionbill/import
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
externalData	object	是	是	导入数据
billCode	string	否	是	单据编号 示例：liu13
ec_billType	string	否	否	单据类型,sk为收款，fk为付款 示例：sk 默认值：sk
billDate	string	否	是	单据日期 示例：2021-07-12 00:00:00
currencyCode	string	否	是	币种编码 示例：CNY
tid	string	否	是	交易编号 示例：ggtest202106300032
shopCode	string	否	是	店铺编码 示例：聪聪测试店铺
fee	Decimal	否	是	金额 示例：166.778
accountFee	Decimal	否	是	应收款 示例：166.778
prepaymentFee	Decimal	否	是	预收款 示例：166.778
otherFee	Decimal	否	是	其他费用 示例：166.778
inputPerson	string	否	否	录入人 示例：六六
customerCode	string	否	否	客户编码 示例：f0010000000156
vendorCode	string	否	否	供应商编码，付款类型电商收付款必填 示例：0001
departmentCode	string	否	否	部门编码 示例：开发
salesmanCode	string	否	否	业务员编码 示例：A00015
settleMethodCode	string	否	否	结算方式编码 示例：NNJS1
daliyNum	string	否	否	收款日报号 示例：8889
collectionBillCustomItem	object	否	否	收款单主表自定义项，自定义项范围 define1--define60
collectionBillDetail	object	是	是	收款单子表

## 3. 请求示例

Url: /yonbip/sd/a/dst/collectionbill/import?access_token=访问令牌
Body: {
	"externalData": [
		{
			"billCode": "liu13",
			"ec_billType": "sk",
			"billDate": "2021-07-12 00:00:00",
			"currencyCode": "CNY",
			"tid": "ggtest202106300032",
			"shopCode": "聪聪测试店铺",
			"fee": 166.778,
			"accountFee": 166.778,
			"prepaymentFee": 166.778,
			"otherFee": 166.778,
			"inputPerson": "六六",
			"customerCode": "f0010000000156",
			"vendorCode": "0001",
			"departmentCode": "开发",
			"salesmanCode": "A00015",
			"settleMethodCode": "NNJS1",
			"daliyNum": "8889",
			"collectionBillCustomItem": {
				"define1": "HH1",
				"define2": "HH2"
			},
			"collectionBillDetail": [
				{
					"fundproperties": 0,
					"fee": 22.22,
					"platCostItem": "佣金",
					"collectionBillDetailCustomItem": {
						"define1": "BB1",
						"define2": "BB2"
					}
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
code	int	否	返回状态码，200操作成功
message	string	否	返回提示信息
data	object	否	返回操作数据
successList	object	是	成功返回数据

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"data": {
		"successList": [
			{
				"id": 0,
				"tenant": 0,
				"org": 0,
				"inputPerson": "",
				"billCode": "",
				"billDate": "",
				"currency": "",
				"tid": "",
				"daliyNum": "",
				"accountFee": 0,
				"prepaymentFee": 0,
				"fee": 0,
				"otherFee": 0,
				"settlemode": "",
				"bankAccountId": "",
				"cashAccountId": "",
				"shop_id": 0,
				"bdaliy": 0,
				"ys_customer": "",
				"ys_department": "",
				"ys_salesman": "",
				"collectionBillCustomItem": {
					"define1": "",
					"define2": "",
					"tenant": 0,
					"id": ""
				},
				"_convert_collectionBillCustomItem": "",
				"collectionBillDetail": [
					{
						"costitem": 0,
						"fundproperties": 0,
						"fee": 0,
						"id": 0,
						"parentid": 0,
						"tenant": 0,
						"org": 0,
						"collectionBillDetailCustomItem": {
							"define1": "",
							"define2": "",
							"id": 0,
							"tenant": 0
						},
						"_convert_collectionBillDetailCustomItem": ""
					}
				]
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
999	导入收款单失败	检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-11	
更新
请求说明
新增
请求参数 ec_billType
新增
请求参数 vendorCode
调整名称，补充API字段
	2	2025-06-25	
更新
请求参数 (26)
更新
返回参数 (45)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

