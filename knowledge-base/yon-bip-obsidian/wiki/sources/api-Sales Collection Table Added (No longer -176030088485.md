---
title: "销售情况收款表新增（不再更新，不建议使用）"
apiId: "1760300884858765316"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Consumption Tax Sales Data Sheet"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Consumption Tax Sales Data Sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售情况收款表新增（不再更新，不建议使用）

>  请求方式	POST | Consumption Tax Sales Data Sheet (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/yonbip-fi-taxoth/api/excise/tax/sale/collection/add
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
orgid	long	否	是	会计主体ID 示例：1551632948250804231
period	string	否	是	税款所属期 示例："2022-08"
exciseTaxBasicId	long	否	是	应税消费品基础id 示例：24
goodsTaxCode	string	否	是	应税消费品编码 示例："TAXCG202203140024"
goodsTaxName	string	否	是	应税消费品名称 示例：润滑油
taxCalculationMethod	string	否	是	计税方式,枚举,5:从量定额,6:从价定率,7:复合计税 示例：5
tax	string	否	是	征免税,（1:征税，2:免税） 示例：1
ratioRate	BigDecimal	否	否	比例税率 示例：0
quotaRate	BigDecimal	否	否	定额税率 示例：0
calcCode	string	否	否	标准计量单位编号 示例：CALC202203140005
calcName	string	否	否	标准计量单位名称 示例：吨
sales	BigDecimal	否	否	销售金额 示例：0
endSales	BigDecimal	否	否	调整后销售金额 示例：0
accountCode	string	否	是	科目编码 示例：101203
accountName	string	否	是	科目名称 示例：银行汇票
accountSales	BigDecimal	否	是	账面金额 示例：0.00
completePolicy	string	否	否	完整减免税政策 示例：0001041509|SXA031901148 小微企业、个体工商户融资担保、再担保免征增值税优惠《财政部税务总局关于延续实施普惠金融有关税收优惠政策的公告》税务总局公告2020年第22号
completePolicyId	string	否	否	减免性质代码ID 示例：1679114080126238720
reliefProductName	string	否	否	减免项目名称 示例：gsgg
exciseProductId	string	否	否	产品id 示例：1686715983246393346
productCode	string	否	否	产品编码 示例：maotai
productName	string	否	否	产品名称 示例：茅台

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/excise/tax/sale/collection/add?access_token=访问令牌
Body: [{
	"orgid": 1551632948250804231,
	"period": "\"2022-08\"",
	"exciseTaxBasicId": 24,
	"goodsTaxCode": "\"TAXCG202203140024\"",
	"goodsTaxName": "润滑油",
	"taxCalculationMethod": "5",
	"tax": "1",
	"ratioRate": 0,
	"quotaRate": 0,
	"calcCode": "CALC202203140005",
	"calcName": "吨",
	"sales": 0,
	"endSales": 0,
	"accountCode": "101203",
	"accountName": "银行汇票",
	"accountSales": 0,
	"completePolicy": "0001041509|SXA031901148 小微企业、个体工商户融资担保、再担保免征增值税优惠《财政部税务总局关于延续实施普惠金融有关税收优惠政策的公告》税务总局公告2020年第22号",
	"completePolicyId": "1679114080126238720",
	"reliefProductName": "gsgg",
	"exciseProductId": "1686715983246393346",
	"productCode": "maotai",
	"productName": "茅台"
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
code	string	否	状态码 示例：0000
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	返回信息 示例：操作成功

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
9999	系统异常	根据具体返回信息调整数据

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-03	
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

