---
title: "职位序列列表查询_集成_API"
apiId: "2132861028296818689"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Job Category"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 职位序列列表查询_集成_API

>  请求方式	POST | Job Category (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/postsequence/listForIntegration
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
name	string	否	否	名称 示例：名称
code	string	否	否	编码 示例：123
postFamilyId	string	否	否	所属族群 示例：234234
orgId	string	是	否	所属组织 示例：[324323,5657567]
effectiveDate	date
格式:yyyy-MM-dd	否	否	生效日期 示例：2024-11-13
enableList	number
小数位数:0,最大长度:10	是	否	启用状态 示例：[1,0]
drList	string	是	否	删除状态 示例：[0]
idList	string	是	否	主键id 示例：[1111,22222]
codeList	string	是	否	编码列表 示例：[3333,4444]
pubts	string	否	否	时间戳 示例：2024-11-13 00:00:00
pageIndex	number
小数位数:0,最大长度:10	否	是	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	是	每页大小，不超过500 示例：20
distributionSite	string	否	否	站点

## 3. 请求示例

Url: /yonbip/hrcloud/postsequence/listForIntegration?access_token=访问令牌
Body: {
	"name": "名称",
	"code": "123",
	"postFamilyId": "234234",
	"orgId": [
		324323,
		5657567
	],
	"effectiveDate": "2024-11-13",
	"enableList": [
		1,
		0
	],
	"drList": [
		0
	],
	"idList": [
		1111,
		22222
	],
	"codeList": [
		3333,
		4444
	],
	"pubts": "2024-11-13 00:00:00",
	"pageIndex": 1,
	"pageSize": 20,
	"distributionSite": ""
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
pageIndex	number
小数位数:0,最大长度:10	否	pageIndex 示例：1
pageSize	number
小数位数:0,最大长度:10	否	pageSize 示例：2
recordCount	number
小数位数:0,最大长度:10	否	recordCount 示例：3
recordList	object	是	recordList
pageCount	number
小数位数:0,最大长度:10	否	pageCount 示例：2
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：2

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 2,
		"recordCount": 3,
		"recordList": [
			{
				"creator": "8c4a75a9-41ac-4367-abbd-5692a1bee11d",
				"code": "1",
				"level": 1,
				"ytenant": "0000M358B9M63D1F5T0000",
				"modifier": "8c4a75a9-41ac-4367-abbd-5692a1bee11d",
				"isEnd": true,
				"dr": 0,
				"orgId": "666666",
				"path": "2136450968127012869|",
				"modifyTime": "2024-11-18 15:40:34",
				"postFamilyId": "2136450512860479491",
				"createTime": "2024-11-18 15:40:28",
				"enable": 1,
				"orgGroupId": "2136450968127012867",
				"name": {
					"zh_CN": "职位序列",
					"en_US": "",
					"zh_TW": ""
				},
				"orgGroupDetailList": [
					{
						"ytenant": "0000LDVLBFJI3Y0MIR0000",
						"groupId": "1940320324493508610",
						"id": "1940320324493508611",
						"orgId": "666666"
					}
				],
				"parent": "34234234",
				"id": "2136450968127012869",
				"jobType": "456456546546",
				"pubts": "2024-11-18 15:40:34",
				"tenant": "0000M358B9M63D1F5T0000",
				"effectiveDate": "2024-11-18 00:00:00",
				"distributionSite": "",
				"user_define_character": {
					"ytenant": "0000LSU86TH67MZUOG0000",
					"id": "1966344373138358281",
					"pubts": "2024-04-03 10:50:14"
				},
				"hashCode": "",
				"memo": "额鹅鹅鹅"
			}
		],
		"pageCount": 2,
		"beginPageIndex": 1,
		"endPageIndex": 2
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
500	查询失败	

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

