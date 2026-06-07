---
title: "增值税发票附件下载--即将废弃"
apiId: "1758643147733729287"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 增值税发票附件下载--即将废弃

>  请求方式	POST | Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/tax/input-tax/api/purchase-collection/file-download
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
nsrsbh	string	否	否	纳税人识别号（纳税人识别号和会计主体编码至少传入一项） 示例：test
orgcode	string	否	否	会计主体编码（纳税人识别号和会计主体编码至少传入一项） 示例：test
invoices	object	是	是	发票信息(一次最多下载5张)
fpDm	string	否	是	发票代码 示例：051531463416
fpHm	string	否	是	发票号码 示例：57342869

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/purchase-collection/file-download?access_token=访问令牌
Body: {
	"nsrsbh": "test",
	"orgcode": "test",
	"invoices": [
		{
			"fpDm": "051531463416",
			"fpHm": "57342869"
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
code	string	否	状态码 示例：200
message	string	否	信息 示例：操作成功
data	string	否	响应信息
message	string	否	返回信息 示例：操作成功
data	object	是	数据
billType	string	否	发票类型 invoice 增值税发票,tolls 过路费,train 火车票,quota 定额发票,machine 机打发票,taxi 出租车发票,passenger 客运发票,air 航空电子行程单,other 其他发票,nontax 财政非税票据 示例：invoice
invoiceCode	string	否	发票代码 示例：123
invoiceNum	string	否	发票号码 示例：123456
content	string	否	base64编码 示例：xxx
contentType	string	否	文件类型 示例：pdf
msg	string	否	明细信息说明 示例：111

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"billType": "invoice",
			"invoiceCode": "123",
			"invoiceNum": "123456",
			"content": "xxx",
			"contentType": "pdf",
			"msg": "111"
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
9999	未知错误	按返回消息处理

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-15	
更新
请求说明
修改微服务

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

