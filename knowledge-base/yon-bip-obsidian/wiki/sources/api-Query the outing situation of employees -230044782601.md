---
title: "查询员工一段时间内的外出情况(多人)"
apiId: "2300447826014896133"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Out-of-Office Application Document"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Out-of-Office Application Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询员工一段时间内的外出情况(多人)

>  请求方式	POST | Out-of-Office Application Document (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/time/out/queryallout
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
staffCodes	string	是	否	员工编码(staffIds、staffCodes二选一必填，有staffIds时优先使用staffIds，没有staffIds时优先使用staffCodes) 示例：["code1","code2"]
staffIds	string	是	否	员工staffid(staffIds、staffCodes二选一必填，有staffIds时优先使用staffIds，没有staffIds时优先使用staffCodes) 示例：["2122","334"]
beginDate	string	否	是	开始时间 示例：2023-09-01
endDate	string	否	是	结束时间 示例：2023-09-30
approveStatus	string	否	否	单据审批状态（0表示仅展示审批通过的外出单，传1或者不传时，展示审批中以及审批通过的外出单） 示例：0
adjusting	string	否	否	是否过滤调整中的单据，传0时调整中的单据不返回 示例：0
pageNum	number
小数位数:0,最大长度:5	否	否	分页页码 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	否	分页大小 示例：100 默认值：100

## 3. 请求示例

Url: /yonbip/HCC/time/out/queryallout?access_token=访问令牌
Body: {
	"staffCodes": [
		"code1",
		"code2"
	],
	"staffIds": [
		"2122",
		"334"
	],
	"beginDate": "2023-09-01",
	"endDate": "2023-09-30",
	"approveStatus": "0",
	"adjusting": "0",
	"pageNum": 1,
	"pageSize": 100
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
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
content	object	是	content
pageable	object	否	分页参数
totalPages	number
小数位数:0,最大长度:10	否	总页数 示例：1
last	boolean	否	last 示例：false
totalElements	number
小数位数:0,最大长度:10	否	totalElements 示例：2
first	boolean	否	first 示例：false
numberOfElements	number
小数位数:0,最大长度:10	否	numberOfElements 示例：2
size	number
小数位数:0,最大长度:10	否	分页大小 示例：100
number	number
小数位数:0,最大长度:10	否	分页数 示例：1
empty	boolean	否	是否为空 示例：false

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"content": [
			{
				"id": "2299790163525500933",
				"staffid": "2087336015636725763",
				"outtype": "本地外出",
				"outdays": "0.50天",
				"destination": "",
				"remark": "",
				"outbegintime": "2025-06-26 09:00:00",
				"outendtime": "2025-06-26 12:00:00",
				"startDayType": 1,
				"endDayType": 1,
				"showbegindate": "2025-06-26 上午",
				"showenddate": "2025-06-26 上午",
				"approveStatus": "4",
				"revokeApproveStatus": "",
				"outTripApplyDefine": {}
			}
		],
		"pageable": {
			"paged": true,
			"pageNumber": 1,
			"offset": 100,
			"pageSize": 100,
			"unpaged": false
		},
		"totalPages": 1,
		"last": false,
		"totalElements": 2,
		"first": false,
		"numberOfElements": 2,
		"size": 100,
		"number": 1,
		"empty": false
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
401	参数JSON中缺少beginDate！	需要传递外出开始时间

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-20	
新增
请求参数 staffCodes
更新
请求参数 staffIds
更新
请求参数 approveStatus

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

