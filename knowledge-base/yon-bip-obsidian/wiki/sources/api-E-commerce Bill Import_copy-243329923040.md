---
title: "业务调整单新增"
apiId: "2433299230409883657"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Online Retailer Statement"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Online Retailer Statement]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务调整单新增

>  请求方式	POST | Online Retailer Statement (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/adjustBill/add
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
partParam	object	否	是	扩展数据
shop_id	string	否	否	店铺id 示例：1765455927937859593
shop_code	string	否	否	店铺编码(店铺id和编码不可同时为空，存在店铺id时以id为准) 示例：1008
billDate	date
格式:yyyy-MM-dd HH:mm:ss	否	是	单据日期 示例：2025-12-01 00:00:00
billCode	string	否	否	单据编号 示例：TZ2025120100000001
tid	string	否	是	交易编号 示例：DD20210719
ys_customer	string	否	否	客户ID 示例：1902318610239744
ys_customer_code	string	否	否	客户编码 示例：cus001
ys_department	string	否	否	部门ID 示例：2106981030269184
ys_department_code	string	否	否	部门编码 示例：dep001
ys_salesman	string	否	否	业务员ID 示例：1974594216202496
ys_salesman_code	string	否	否	业务员编码 示例：sale001
currency	string	否	否	币种ID 示例：2365646434744139785
currency_code	string	否	否	币种编码 示例：CNY
transType	string	否	否	交易类型ID 示例：1731209671101382664
transTypeCode	string	否	否	交易类型编码 示例：trans001
inputPerson	string	否	否	录入人 示例：用户
adjustReason	string	否	否	调整原因 示例：原因
bizAdjustBillDetail	object	是	否	表体

## 3. 请求示例

Url: /yonbip/MCC/adjustBill/add?access_token=访问令牌
Body: {
	"partParam": {
		"shop_id": "1765455927937859593",
		"shop_code": "1008",
		"billDate": "2025-12-01 00:00:00",
		"billCode": "TZ2025120100000001",
		"tid": "DD20210719",
		"ys_customer": "1902318610239744",
		"ys_customer_code": "cus001",
		"ys_department": "2106981030269184",
		"ys_department_code": "dep001",
		"ys_salesman": "1974594216202496",
		"ys_salesman_code": "sale001",
		"currency": "2365646434744139785",
		"currency_code": "CNY",
		"transType": "1731209671101382664",
		"transTypeCode": "trans001",
		"inputPerson": "用户",
		"adjustReason": "原因",
		"bizAdjustBillDetail": [
			{
				"skuID": "1912939822138785875",
				"sku_code": "sku001",
				"adjustFee": 10
			}
		]
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
code	int	否	返回状态码 示例：200
message	string	否	返回提示信息 示例：操作成功

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
092-504-100535
	传入数据转换失败	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	业务逻辑异常	请检查入参

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

