---
title: "客户商品对照详情查询"
apiId: "1707463123433160707"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Customer Product Mapping"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Product Mapping]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户商品对照详情查询

>  请求方式	GET | Customer Product Mapping (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/saagentproduct/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	业务数据ID

## 3. 请求示例

Url: /yonbip/digitalModel/saagentproduct/detail?access_token=访问令牌&id=

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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回数据
agentId	long	否	客户Id
productClassId	long	否	商品分类ID
code	long	否	与id取值相同
productId	long	否	商品ID
unitName	string	否	计量单位
agentRelationId	long	否	客户交易关系ID
productName	string	否	商品
skuName	string	否	sku名称
productCode	string	否	商品编码
id	long	否	主表id
detail	object	否	客户商品对照子表数据
pubts	string	否	时间戳,格式为:yyyy-MM-dd HH:mm:ss
agentId_name	string	否	客户名称
productClassId_name	string	否	商品分类名称
salesOrgId_name	string	否	销售组织名称
skuId	long	否	skuId
agentId_code	string	否	客户编码
skuCode	string	否	sku编码
salesOrgId	string	否	销售组织id

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"agentId": 0,
		"productClassId": 0,
		"code": 0,
		"productId": 0,
		"unitName": "",
		"agentRelationId": 0,
		"productName": "",
		"skuName": "",
		"productCode": "",
		"id": 0,
		"detail": {
			"agentProductName": "",
			"agentProductCode": "",
			"agentProductId": 0,
			"agentSkuCode": "",
			"agentSkuName": "",
			"id": 0
		},
		"pubts": "",
		"agentId_name": "",
		"productClassId_name": "",
		"salesOrgId_name": "",
		"skuId": 0,
		"agentId_code": "",
		"skuCode": "",
		"salesOrgId": ""
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
999	未获取到当前客户商品对照信息	请检查传入参数正确性

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

