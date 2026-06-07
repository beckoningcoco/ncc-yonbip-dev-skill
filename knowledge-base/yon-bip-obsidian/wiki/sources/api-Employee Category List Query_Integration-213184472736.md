---
title: "员工类别列表查询_集成_API"
apiId: "2131844727361241090"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 员工类别列表查询_集成_API

>  请求方式	POST | Employee Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/psnlcatg/listForIntegration
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
pubts	string	否	否	时间戳 示例：2020-11-23 16:11:09
codeList	string	是	否	编码 示例：["001"]
enableList	number
小数位数:0,最大长度:10	是	否	启用状态，1启用 2停用 示例：[1]
drList	number
小数位数:0,最大长度:10	是	否	删除状态，0未删除，1删除 示例：[0]
idList	string	是	否	id列表 示例：["111"]
codeOrName	string	否	否	编码或者名称 示例："1111"
pageIndex	number
小数位数:0,最大长度:10	否	是	页码 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	页数,不超过500 示例：12 默认值：10
distributionSite	string	否	否	站点 示例：3232

## 3. 请求示例

Url: /yonbip/digitalModel/psnlcatg/listForIntegration?access_token=访问令牌
Body: {
	"pubts": "2020-11-23 16:11:09",
	"codeList": [
		"001"
	],
	"enableList": [
		1
	],
	"drList": [
		0
	],
	"idList": [
		"111"
	],
	"codeOrName": "\"1111\"",
	"pageIndex": 1,
	"pageSize": 12,
	"distributionSite": "3232"
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
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
pageIndex	number
小数位数:0,最大长度:10	否	pageIndex 示例：1
pageSize	number
小数位数:0,最大长度:10	否	pageSize 示例：5
recordCount	number
小数位数:0,最大长度:10	否	recordCount 示例：1
recordList	object	是	recordList
pageCount	number
小数位数:0,最大长度:10	否	pageCount 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 5,
		"recordCount": 1,
		"recordList": [
			{
				"creator": "81ee321b-8c73-49ee-9335-3e53c795f66a",
				"code": "3",
				"sysid": "diwork",
				"dr": 0,
				"user_define_character": {
					"ytenant": "0000LSU86TH67MZUOG0000",
					"id": "1966344373138358281",
					"pubts": "2024-04-03 10:50:14",
					"level": 1
				},
				"creationtime": "2024-04-03 10:50:13",
				"enable": 1,
				"tenantid": "0000LSU86TH67MZUOG0000",
				"name": {
					"zh_TW": "繁体",
					"zh_CN": "中文",
					"en_US": "英文"
				},
				"id": "1966344373138358280",
				"tenant": "0000LSU86TH67MZUOG0000",
				"modifier": "81ee321b-8c73-49ee-9335-3e53c795f66a",
				"modifiedtime": "2024-04-03 10:50:13",
				"cltype": "",
				"country": "",
				"distributionSite": "",
				"parent": "parent",
				"memo": "memo",
				"isEnd": true,
				"parentid": "232",
				"path": "path",
				"pubts": "2026-06-07 12:44:56"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	后端错误,联系开发人员	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-13	
更新
请求参数 enableList
更新
返回参数 (5)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

