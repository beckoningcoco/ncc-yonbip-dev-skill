---
title: "基于id或code撤回服务确认"
apiId: "2032367933278126086"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Schedule"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Schedule]
platform_version: "BIP"
source_type: community-api-docs
---

# 基于id或code撤回服务确认

>  请求方式	POST | Schedule (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/supplierSettlement/unAudit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	服务交付id，该参数与服务交付code必须填一个，两个参数都存在时，以服务交付id为准    示例: 1947967135775457286
code	string	query	否	服务交付code，该参数与服务交付id必须填一个，两个参数都存在时，以服务交付id为准    示例: 50003

## 3. 请求示例

Url: /yonbip/pm/supplierSettlement/unAudit?access_token=访问令牌&id=1947967135775457286&code=50003

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
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	number
小数位数:0,最大长度:10	否	请求响应编码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	否	返回数据
supplierSettlementId	string	否	服务确认id 示例：2058370043044954116
supplierSettlementCode	string	否	服务确认code 示例：0JSD20240805000002
status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
orderId	string	否	订单id 示例：3049470043044954555
itemList	object	是	返回子表数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"supplierSettlementId": "2058370043044954116",
		"supplierSettlementCode": "0JSD20240805000002",
		"status": 0,
		"orderId": "3049470043044954555",
		"itemList": [
			{
				"itemId": "2058370043044954117",
				"orderDetailId": "3049470043044954556"
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
0	未传入优惠券档案id	coupon_id值填写有误
1032001990021	服务确认id和code不能同时为空	服务确认id和code必须填一个，两个都填时，以服务确认id为准
1032001990022	服务确认不存在，请检查服务确认id或code!	服务确认不存在，请检查服务确认id或code!
1032001990099	其他异常	请联系开发人员
1032001990024	不是已审核或者审核中的单据，不能撤回	不是已审核或者审核中的单据，不能撤回
1032001990025	已审核的有审批流单据需要先在审批中心撤回后才能回退	已审核的有审批流单据需要先在审批中心撤回后才能回退
1032001990026	过账中不能弃审	过账中不能弃审

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-26	
更新
请求说明
新增
错误码 1032001990025
新增
错误码 1032001990026
更新
错误码 1032001990024

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

