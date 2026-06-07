---
title: "根据会计主体和会计期间查询固定资产是否结账"
apiId: "a69b54155d1b47b2a739d750c3f52402"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Change Request"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Change Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据会计主体和会计期间查询固定资产是否结账

>  请求方式	POST | Fixed Asset Change Request (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/fi/fixedAssetFinalProcess/getAccountFlag
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
org	string	否	否	会计主体ID（会计主体ID和会计主体编码如果同时填写，以会计主体ID为主） 示例：2262043212649472
code	string	否	否	会计主体编码（会计主体ID和会计主体编码如果同时填写，以会计主体ID为主） 示例：mailian
accPeriod	string	否	是	会计期间编码 示例：2021-05

## 3. 请求示例

Url: /yonbip/fi/fixedAssetFinalProcess/getAccountFlag?access_token=访问令牌
Body: {
	"org": "2262043212649472",
	"code": "mailian",
	"accPeriod": "2021-05"
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
code	long	否	返回码，调用成功时返回200 示例：200
message	string	否	调用完成后的提示信息 示例：查询成功
data	boolean	否	调用后的是否结账信息，true已结账，false未结账 示例：false

## 5. 正确返回示例

{
	"code": 200,
	"message": "查询成功",
	"data": false
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
0	查询失败	

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

