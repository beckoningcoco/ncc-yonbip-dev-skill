---
title: "销售日报查询"
apiId: "5a672bc2a3254caa9ccc2f0b5acd2a20"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Daily Sales Report"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Sales Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售日报查询

>  请求方式	POST | Daily Sales Report (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/salesdaily/query
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
partParam	object	否	是	查询条件
startDShipTime	DateTime	否	否	起始发货时间，格式"2019-06-28 11:04:22"
tid	string	否	否	交易编号
headdefineselectfields	string	否	否	需要返回的订单头自定义字段
pageIndex	int	否	是	页码
startDDate	DateTime	否	否	起始单据日期，格式"2019-06-28 11:04:22"
bodydefineselectfields	string	否	否	需要返回的订单头自定义字段，参照：https://www.showdoc.com.cn/265424688438926?page_id=4578930966406853
startCreateDate	DateTime	否	否	起始交易时间，格式"2019-06-28 11:04:22"
endDShipTime	DateTime	否	否	结束发货时间，格式"2019-06-28 11:04:22"
endDDate	DateTime	否	否	结束单据日期，格式"2019-06-28 11:04:22"
customerErp	string	否	否	客户ERP编号
pageSize	int	否	是	每页数据行数
shopCode	string	否	是	店铺编码
bodyselectfields	string	否	否	需要返回的订单体字段，参照：https://www.showdoc.com.cn/265424688438926?page_id=4578930966406853
endCreateDate	DateTime	否	否	结束交易时间，格式"2019-06-28 11:04:22"
headselectfields	string	否	否	需要返回的订单头字段，参照：https://www.showdoc.com.cn/265424688438926?page_id=4578930966406853
docstatus	string	否	否	交换状态（多个状态可用英文逗号隔开)(枚举值:0:处理中,1:处理失败,2:处理成功,3:未处理） 示例：0,1

## 3. 请求示例

Url: /yonbip/sd/dst/salesdaily/query?access_token=访问令牌
Body: {
	"partParam": {
		"startDShipTime": "",
		"tid": "",
		"headdefineselectfields": "",
		"pageIndex": 0,
		"startDDate": "",
		"bodydefineselectfields": "",
		"startCreateDate": "",
		"endDShipTime": "",
		"endDDate": "",
		"customerErp": "",
		"pageSize": 0,
		"shopCode": "",
		"bodyselectfields": "",
		"endCreateDate": "",
		"headselectfields": "",
		"docstatus": "0,1"
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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
org_name	string	否	销售组织名称
cCode	string	否	日报编号
dDate	string	否	单据日期
cShopID	string	否	店铺ID
Shop_Name	string	否	店铺
Shop_Code	string	否	店铺编码
customerErp	string	否	客户
dShipTime	string	否	发货时间
num	string	否	商品数量
payment	string	否	实收金额
tid	string	否	交易编号
cExpressCoID	string	否	快递公司ID
cExpressCoName	string	否	快递公司
cExpressCode	string	否	快递单号
receiver_name	string	否	收货人姓名
receiver_address	string	否	收货人地址
cTradeCode	string	否	电商订单号
docstatus	string	否	交换状态，枚举值参考：https://www.showdoc.com.cn/265424688438926?page_id=1999778270293645
salesDailyRptCustomItem_define1	string	否	表头自定义项1
salesDailyRptCustomItem_define60	string	否	表头自定义项60
salesdailyRptDetail	object	否	表体信息

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"org_name": "",
		"cCode": "",
		"dDate": "",
		"cShopID": "",
		"Shop_Name": "",
		"Shop_Code": "",
		"customerErp": "",
		"dShipTime": "",
		"num": "",
		"payment": "",
		"tid": "",
		"cExpressCoID": "",
		"cExpressCoName": "",
		"cExpressCode": "",
		"receiver_name": "",
		"receiver_address": "",
		"cTradeCode": "",
		"docstatus": "",
		"salesDailyRptCustomItem_define1": "",
		"salesDailyRptCustomItem_define60": "",
		"salesdailyRptDetail": {
			"tid": "",
			"product_code": "",
			"num": "",
			"cardpayment": 0,
			"stored_card_pay": 0,
			"SKUID": 0,
			"UPCID": 0,
			"parentid": "",
			"stored_card_discount": "",
			"cWh": 0,
			"isGift": "",
			"tenant": 0,
			"salesDailyRptCustomItem_define1": "",
			"salesDailyRptCustomItem_define60": ""
		}
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
999	店铺编码不存在	请输入正确的店铺编码

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

