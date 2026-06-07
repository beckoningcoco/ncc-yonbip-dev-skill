---
title: "ERP入库单删除"
apiId: "e719d130755f447db3d06d2a9ee5b070"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procure-to-Pay"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procure-to-Pay]
platform_version: "BIP"
source_type: community-api-docs
---

# ERP入库单删除

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/godownentry/delGodownEntry
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
billHead	object	否	否	billHead
erpGodownId	string	否	否	erp入库单id
erpGodownNo	string	否	否	erp入库单号

## 3. 请求示例

Url: /yonbip/cpu/godownentry/delGodownEntry?access_token=访问令牌
Body: {
	"billHead": {
		"erpGodownId": "",
		"erpGodownNo": ""
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
result	string	否	返回结果 示例：success
code	string	否	返回状态 示例：1
msg	string	否	提示信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"result": "success",
		"code": "1",
		"msg": ""
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
002	删除ERP入库单失败，入库对账单数据为空!	检查请求data是否为空
001	删除ERP入库单失败，根据tenantId未查询到租户信息	咨询api和业务提供提供方检查调用上下文
003	云采删除ERP补货数据失败：数据已对账，无法删除	业务逻辑控制。如有疑问咨询服务提供方

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
新增
请求参数 billHead
新增
请求参数 erpGodownId
新增
请求参数 erpGodownNo
删除
请求参数 data
删除
请求参数 erpGodownId
删除
请求参数 erpGodownNo
更新
返回参数 result
更新
返回参数 code
更新
返回参数 msg

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

