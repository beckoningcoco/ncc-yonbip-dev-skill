---
title: "集团成员监控拉取增量数据"
apiId: "2418334859971264518"
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

# 集团成员监控拉取增量数据

>  请求方式	POST | Enterprise Portrait (YYZDX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/aipaas/intellid/api/monitoring/seed/update/graphData
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
size	string	否	否	每页数量（<=10000） 示例：10000
page	number
小数位数:0,最大长度:10	否	否	页码(目前分页不准，一次返回当前所有的) 示例：1 默认值：1
recordTime	number
小数位数:0,最大长度:10	否	否	查询日期（yyyyMMdd）（不在起作用, 默认从上一次记录往后开始）
socialCreditCode	string	否	否	统计社会信用代码
name	string	否	否	企业全称
companyId	string	否	否	企业id
toTime	string	否	否	过滤日期结束日期（yyyy-MM-dd） 示例：2025-01-01
fromTime	string	否	否	过滤数据开始日期（yyyy-MM-dd） 示例：2024-10-01
seedId	string	否	否	种子id(建议使用) 示例：2162383929002164230

## 3. 请求示例

Url: /yonbip/aipaas/intellid/api/monitoring/seed/update/graphData?access_token=访问令牌
Body: {
	"size": "10000",
	"page": 1,
	"recordTime": 0,
	"socialCreditCode": "",
	"name": "",
	"companyId": "",
	"toTime": "2025-01-01",
	"fromTime": "2024-10-01",
	"seedId": "2162383929002164230"
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
小数位数:0,最大长度:10	否	状态码 示例：1
data	object	否	结果集
totalNum	number
小数位数:0,最大长度:10	否	总数 示例：2
pageSize	number
小数位数:0,最大长度:10	否	每页数量，默认5000，实际数量根据具体结果确认，可能大于5000 示例：5000
pageNum	number
小数位数:0,最大长度:10	否	当前页码，只返回1，禁用 示例：1
pages	number
小数位数:0,最大长度:10	否	总页数，禁用 示例：1
contents	object	是	具体数据
msg	string	否	提示信息 示例：执行成功

## 5. 正确返回示例

{
	"code": 1,
	"data": {
		"totalNum": 2,
		"pageSize": 5000,
		"pageNum": 1,
		"pages": 1,
		"contents": [
			{
				"id": "2080568959712624648",
				"name": "常州天合光能有限公司成都分公司",
				"company_id": "68fcf41d994072cca4df18806e4a5a65",
				"seed_id": "2080032269200785413",
				"holder_id": "0d7ba2a3e60d33f6f7ae46d558dd612c",
				"change_type": "1",
				"change_type_name": "企业状态变更",
				"change_before_share": 0,
				"change_after_share": 0,
				"change_before_amount": 0,
				"change_after_amount": 0,
				"change_before_state": 0,
				"change_after_state": 7,
				"change_before_name": "",
				"change_after_name": "",
				"other_change_text": "{\\\"id\\\":\\\"11221300\\\",\\\"parentid\\\":\\\"0d7ba2a3e60d33f6f7ae46d558dd612c\\\",\\\"branchId\\\":\\\"68fcf41d994072cca4df18806e4a5a65\\\",\\\"name\\\":\\\"常州天合光能有限公司成都分公司\\\",\\\"branch_code\\\":\\\"企合川蓉分字第001073号\\\",\\\"establish_date\\\":\\\"2002-05-23\\\",\\\"company_status\\\":\\\"吊销，未注销\\\",\\\"n_co",
				"create_time": 1725410103000
			}
		]
	},
	"msg": "执行成功"
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
	1	2025-09-24	
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

