---
title: "返利计算结果列表查询"
apiId: "2318853178198589446"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Rebate Calculation Result"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Rebate Calculation Result]
platform_version: "BIP"
source_type: community-api-docs
---

# 返利计算结果列表查询

>  请求方式	POST | Rebate Calculation Result (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/rebatepolicy/result/list
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
totalCount	number
小数位数:0,最大长度:6	否	否	查询总数（填入-1可查询总计信息） 默认值：1
pageSize	number
小数位数:0,最大长度:6	否	否	每页条数 示例：10 默认值：10
pageIndex	number
小数位数:0,最大长度:6	否	否	当前页码 示例：1 默认值：1
simpleVOs	object	是	否	扩展查询条件
field	string	否	否	属性名：id返利计算结果ID、code编码、policyId返利政策ID、policyId.code返利政策编码、agentId客户ID、agentId.code客户编码、status状态（1-已确认、0-未确认、2-已关闭）、 businessPeriod 业务期间、belongYear所属年份、calculateObjectType计算对象类型（0-返利政策）、createDate创建日期 示例：code
op	string	否	否	比较符（eq:等于;it:小于;gt:大于;like:模糊匹配，between:在之间） 示例：like
value1	string	否	否	值1（条件） 示例：0000
value2	string	否	否	值2（条件)(当比较符为between时使用)

## 3. 请求示例

Url: /yonbip/MCC/rebatepolicy/result/list?access_token=访问令牌
Body: {
	"totalCount": 0,
	"pageSize": 10,
	"pageIndex": 1,
	"simpleVOs": [
		{
			"field": "code",
			"op": "like",
			"value1": "0000",
			"value2": ""
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
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	number
小数位数:0,最大长度:10	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
recordList	object	是	返利待计算单列表
sumRecordList	object	是	返利结算结果汇总信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"recordList": [
			{
				"saleOrgId": "1525652227072458756",
				"agentId": "1529267825030463489",
				"amount": "0.00",
				"creator": "u8c_vip管理员",
				"saleOrgName": "收入中台演示销售组织1",
				"code": "RPAR202507100060",
				"belongYear": "2025-01-01",
				"custConfirmStatus": 2,
				"policyId_policyType": 1,
				"policyId_name": "销售出库单0001 -- 商品返利系数",
				"subAgentId": "1529267825030463489",
				"BACOrg": "1525652227072458756",
				"policyId": "2304179997963714568",
				"id": "2310239775904235521",
				"pubts": "2025-07-10 19:35:31",
				"currencyId": "1525643705855773169",
				"agentId_name": "内部客户",
				"moneyDigit": 2,
				"status": 0,
				"createDate": "2025-07-10 00:00:00"
			}
		],
		"sumRecordList": [
			{
				"amount": 0
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
999	错误信息	请联系管理员

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

