---
title: "客户销售回款查询（YonBIP_BIPPremium）"
apiId: "2064455470735687682"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Hybrid Cloud Integration"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Hybrid Cloud Integration]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户销售回款查询（YonBIP_BIPPremium）

>  请求方式	POST | Hybrid Cloud Integration (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bippremium/api/uapbd/custcollectiondetailBill/getQuery
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
pk_org	string	否	否	财务组织
customer	string	否	否	客户
material	string	否	否	商品
org_code	string	否	否	财务组织code
customer_name	string	否	否	客户name
billclass	string	否	否	单据大类
tallydate	string	否	否	查询日期
isSum	number
小数位数:-,最大长度:10	否	否	是否查明细
pageIndex	number
小数位数:-,最大长度:10	否	是	页码
pageSize	number
小数位数:-,最大长度:10	否	是	页大小
totalCount	number
小数位数:-,最大长度:10	否	是	总条数

## 3. 请求示例

Url: /yonbip/crm/bippremium/api/uapbd/custcollectiondetailBill/getQuery?access_token=访问令牌
Body: [{
	"pk_org": "",
	"customer": "",
	"material": "",
	"org_code": "",
	"customer_name": "",
	"billclass": "",
	"tallydate": "",
	"isSum": 0,
	"pageIndex": 0,
	"pageSize": 0,
	"totalCount": 0
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
pk_finance_org	string	否	财务组织
pk_sale_org	string	否	销售组织
pk_stock_org	string	否	库存组织
pk_custclass	string	否	客户分类
pk_customer	string	否	客户
pk_invoice_cust	string	否	开票客户
pk_marbasclass	string	否	物料分类
pk_material	string	否	物料
pk_dept	string	否	部门
pk_psndoc	string	否	人员
businessDate	string	否	业务日期
vbillcode	string	否	单据号
dbilldate	string	否	单据日期
pageIndex	number
小数位数:0,最大长度:64	否	当前页
pageSize	number
小数位数:0,最大长度:64	否	每页条数
totalCount	number
小数位数:0,最大长度:64	否	总条数
isSum	number
小数位数:0,最大长度:64	否	是否查明细
billclass	string	否	单据大类

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pk_finance_org": "",
		"pk_sale_org": "",
		"pk_stock_org": "",
		"pk_custclass": "",
		"pk_customer": "",
		"pk_invoice_cust": "",
		"pk_marbasclass": "",
		"pk_material": "",
		"pk_dept": "",
		"pk_psndoc": "",
		"businessDate": "",
		"vbillcode": "",
		"dbilldate": "",
		"pageIndex": 0,
		"pageSize": 0,
		"totalCount": 0,
		"isSum": 0,
		"billclass": ""
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
暂时没有数据哦~

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

