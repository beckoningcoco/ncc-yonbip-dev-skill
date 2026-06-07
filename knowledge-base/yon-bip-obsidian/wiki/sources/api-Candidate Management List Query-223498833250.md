---
title: "候选人管理列表查询"
apiId: "2234988332507463687"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Candidate Information"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Candidate Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 候选人管理列表查询

>  请求方式	POST | Candidate Information (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/hrcandidate/list
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	number
小数位数:0,最大长度:10	否	是	页码 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	页数,不超过500 示例：12 默认值：10
name	string	否	否	姓名
beginDate	date
格式:yyyy-MM-dd	否	否	预入职日期-时间段开始日期 示例：2024-01-01
endDate	date
格式:yyyy-MM-dd	否	否	预入职日期-时间段结束日期 示例：2024-02-01
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳 示例：2020-11-23 16:11:09
status	number
小数位数:2,最大长度:3	否	否	候选人状态 待入职 0 ，已入职 1，终止入职 2，待发offer 3 ，已发offer 4，已接收offer 5，已拒绝offer 6，录用终止 7，面试通过 8 示例：1
idList	string	是	否	id列表 示例：["111"]
codeList	string	是	否	候选人编码 示例：["001"]
orgIdList	string	是	否	组织集合 示例：["2342"]
deptIdList	string	是	否	部门集合 示例：["1233"]
extend	object	否	否	扩展参数 示例：{"name":"x"}

## 3. 请求示例

Url: /yonbip/hrcloud/hrcandidate/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 12,
	"name": "",
	"beginDate": "2024-01-01",
	"endDate": "2024-02-01",
	"pubts": "2020-11-23 16:11:09",
	"status": 1,
	"idList": [
		"111"
	],
	"codeList": [
		"001"
	],
	"orgIdList": [
		"2342"
	],
	"deptIdList": [
		"1233"
	],
	"extend": {
		"name": "x"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
pageIndex	number
小数位数:0,最大长度:10	否	pageIndex 当前页 示例：1
pageSize	number
小数位数:0,最大长度:10	否	pageSize 每页显示条数 示例：5
recordCount	number
小数位数:0,最大长度:10	否	recordCount 总记录数 示例：323
recordList	object	是	recordList 数据
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：65
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：5
traceId	string	否	traceId 示例：11ee7c538c12c16e
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 5,
		"recordCount": 323,
		"recordList": [
			{
				"code": "011600231",
				"orgId": "1881903443495878664",
				"id": "3643463657148673",
				"pubts": "2024-01-18 20:03:01",
				"deptId": "1881903443495878664",
				"mobile": "18745809078",
				"name": "0116员工1",
				"deptName": "部门01",
				"orgName": "组织名称"
			}
		],
		"pageCount": 65,
		"beginPageIndex": 1,
		"endPageIndex": 5
	},
	"traceId": "11ee7c538c12c16e",
	"uploadable": "0"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	后端错误,联系开发人员	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-14	
更新
请求说明
更新
请求参数 id
更新
请求参数 code
更新
请求参数 loadDataEntityKeys
新增
返回参数 (10)
更新
返回参数 (74)
	2	2025-06-20	
新增
返回参数 (10)
新增是否独生子女、培训渠道、培训类型、培训地

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

