---
title: "智能大搜查询-openapi"
apiId: "2008018818782724097"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "YonKnow"
domain: "YYZDX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, YonKnow]
platform_version: "BIP"
source_type: community-api-docs
---

# 智能大搜查询-openapi

>  请求方式	POST | YonKnow (YYZDX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/aipaas/iuap-aip-ps/intellis/entire/search/querySearch
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
searchType	string	否	是	通道类型 示例："4"
searchTerm	string	否	是	搜索项 示例："测试"
termFilters	object	是	否	搜索过滤项 示例：[{"column":"ytenant_id","values":["0000L1EFNJZ96PVMDL0000"]},{"column":"ai_data_group","values":["1858913445684445186"]}]
rangeFilters	object	是	否	搜索范围 示例：[{"column":"ts","columnType":"Long","start":1646306710106,"end":1677842710107}]
pageIndex	number
小数位数:1,最大长度:10	否	否	页码 示例：1
pageSize	number
小数位数:1,最大长度:10	否	否	分页大小 示例：20
descSort	string	否	否	倒序排序字段 示例："ts"
filterDsl	string	否	否	过滤条件dsl片断 示例：{"bool":{"filter":[]}}

## 3. 请求示例

Url: /yonbip/aipaas/iuap-aip-ps/intellis/entire/search/querySearch?access_token=访问令牌
Body: {
	"searchType": "\"4\"",
	"searchTerm": "\"测试\"",
	"termFilters": [
		{
			"column": "ytenant_id",
			"values": [
				"0000L1EFNJZ96PVMDL0000"
			]
		},
		{
			"column": "ai_data_group",
			"values": [
				"1858913445684445186"
			]
		}
	],
	"rangeFilters": [
		{
			"column": "ts",
			"columnType": "Long",
			"start": 1646306710106,
			"end": 1677842710107
		}
	],
	"pageIndex": 1,
	"pageSize": 20,
	"descSort": "\"ts\"",
	"filterDsl": "{\"bool\":{\"filter\":[]}}"
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
status	number
小数位数:1,最大长度:10	否	响应状态 示例：1
data	object	否	响应对象
data	object	是	查询数据
total	string	否	总条数
pageViewTotal	string	否	当前页总条数
traceId	string	否	traceId记录
search_extend	object	否	查询扩充
explains	object	否	释义
sign	string	否	标记
msg	string	否	响应信息
ext	string	否	成功标记

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"status": 1,
		"data": {
			"data": [
				{}
			],
			"total": "",
			"pageViewTotal": "",
			"traceId": "",
			"search_extend": {},
			"explains": {},
			"sign": ""
		},
		"msg": "",
		"ext": ""
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-19	
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

