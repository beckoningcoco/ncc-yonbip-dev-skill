---
title: "pubStartDate	string	否	否	开始发布时间 示例：2025-11-08"
apiId: "2418415124320092166"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Enterprise Portrait"
domain: "YYZDX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Enterprise Portrait]
platform_version: "BIP"
source_type: community-api-docs
---

# pubStartDate	string	否	否	开始发布时间 示例：2025-11-08

>  请求方式	POST | Enterprise Portrait (YYZDX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/CPC/intellid/api/bids/Ai/search
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
searchType	string	否	是	类型（BID_AI） 示例：BID_AI 默认值：BID_AI
bidTypeList	string	是	否	招标类型 示例：[ "BID", "WINN_BID", "OTHER" ] 默认值：[ "BID", "WINN_BID", "OTHER" ]
areaList	string	是	否	省市地区（编码） 示例：["0"] 默认值：["0"]
amountLow	number
小数位数:0,最大长度:10	否	否	最低项目金额 示例：0
amountHight	number
小数位数:0,最大长度:10	否	否	最高项目金额 示例：1000000
text	string	否	否	内容搜索关键字 示例：公告
pubEndDate	string	否	否	结束发布时间 示例：2025-12-03
order	string	否	否	order 示例：DESC 默认值：DESC
sort	string	否	否	sort 示例：BID_PUB_DATE 默认值：BID_PUB_DATE
pageNum	number
小数位数:0,最大长度:10	否	否	页码 示例：1 默认值：1
size	number
小数位数:0,最大长度:10	否	否	每页数量（最大500） 示例：20 默认值：20
enterType	string	否	否	入口参数（默认BIP, 如果是CRM端设置的输入CRM） 示例：BIP 默认值：BIP
retType	string	否	否	返回结构（默认default,当前列表数据，clue 返回线索结果，字段完全不同） 示例：default 默认值：default

## 3. 请求示例

Url: /yonbip/CPC/intellid/api/bids/Ai/search?access_token=访问令牌
Body: {
	"searchType": "BID_AI",
	"bidTypeList": [
		"BID",
		"WINN_BID",
		"OTHER"
	],
	"areaList": [
		"0"
	],
	"amountLow": 0,
	"amountHight": 1000000,
	"text": "公告",
	"pubStartDate": "2025-11-08",
	"pubEndDate": "2025-12-03",
	"order": "DESC",
	"sort": "BID_PUB_DATE",
	"pageNum": 1,
	"size": 20,
	"enterType": "BIP",
	"retType": "default"
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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
data	object	否	返回数据
result	object	是	具体结果集
total	number
小数位数:0,最大长度:10	否	总数 示例：1000
msg	string	否	提示信息 示例：执行成功
traceId	string	否	请求记录标识 示例：bbbd5c8cabc2bf3b

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"result": [
			{
				"subId": "1155368487868039168",
				"dataId": "157803250",
				"content": "江西省机电设备招标有限公司关于武宁县妇幼保健院彩色多普勒超声仪采购项目（项目编号：JXTC2025040725）电子化公开招标公告              项目概况",
				"pubDate": "2025-11-29",
				"title": "[武宁县]江西省机电设备招标有限公司关于武宁县妇幼保健院彩色多普勒超声仪采购项目（项目编号：JXTC2025040725）电子化公开招标公告",
				"area": "江西",
				"operaType": "[                     \"DETAIL\",                     \"EXPORT\" ]",
				"scores": 85,
				"configId": "1155368487868039168",
				"cityName": "九江市",
				"countryName": "",
				"projectNo": "",
				"bidStartTime": "",
				"bidEndTime": "",
				"aiMar": "彩色多普勒超声仪",
				"bidInviter": "武宁县妇幼保健院",
				"bidOrgan": "江西省机电设备招标有限公司",
				"contactPerson": "",
				"contactPhone": "0791-86214279",
				"subType": "招标"
			}
		],
		"total": 1000
	},
	"msg": "执行成功",
	"traceId": "bbbd5c8cabc2bf3b"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

