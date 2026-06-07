---
title: "发运单运输计划确认"
apiId: "9a0a319189f64906accd9030e96eb830"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Shipping Document Card"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Shipping Document Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 发运单运输计划确认

>  请求方式	POST | Shipping Document Card (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/scm/despatch/transplan/backWriter
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
despatchCode	string	否	否	单据编码，发运单id和发运单编码不能同时为空，id和编码同时存在，以id为准
despatchId	long	否	否	发运单id，发运单id和发运单编码不能同时为空，id和编码同时存在，以id为准
tpStatus	short	否	是	运输计划状态 0:未完成 1：已完成
transQueryNo	string	否	否	运输查询号
tpEndDate	string	否	否	运输计划完成日期

## 3. 请求示例

Url: /yonbip/scm/despatch/transplan/backWriter?access_token=访问令牌
Body: [{
	"despatchCode": "",
	"despatchId": 0,
	"tpStatus": 0,
	"transQueryNo": "",
	"tpEndDate": ""
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
code	string	否	状态码
message	string	否	返回提示信息
data	string	否	返回数据

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	服务器错误	

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

