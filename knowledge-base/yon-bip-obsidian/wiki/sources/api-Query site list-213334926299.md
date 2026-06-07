---
title: "查询站点列表"
apiId: "2133349262998634502"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Site"
domain: "HRCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Site]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询站点列表

>  请求方式	POST | Site (HRCS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/distributionSite/openApi/list
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
toDistributionSiteCode	string	否	是	目标站点编码 示例：HT00001
pageIndex	number
小数位数:0,最大长度:10	否	否	页码
pageSize	number
小数位数:2,最大长度:10	否	否	分页大小

## 3. 请求示例

Url: /yonbip/hrcloud/distributionSite/openApi/list?access_token=访问令牌
Body: {
	"toDistributionSiteCode": "HT00001",
	"pageIndex": 0,
	"pageSize": 0
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
小数位数:0,最大长度:10	否	pageIndex 示例：1
pageSize	number
小数位数:0,最大长度:10	否	pageSize 示例：20
recordCount	number
小数位数:0,最大长度:10	否	recordCount 示例：9
recordList	object	是	recordList
pageCount	number
小数位数:0,最大长度:10	否	pageCount 示例：0
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：0
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：0
traceId	string	否	traceId 示例：9c4ab36677c7201b
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 9,
		"recordList": [
			{
				"isThis": 0,
				"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"code": "YG00001",
				"enablets": "2024-11-08 16:31:00",
				"ytenant": "0000L6YQ8AVLFUZPXD0000",
				"disablets": "2024-11-07 16:13:09",
				"isMain": 1,
				"description": {
					"zh_CN": "中文简体",
					"zh_TW": "繁体",
					"en_US": "英文"
				},
				"dr": 0,
				"createTime": "2024-11-07 16:12:37",
				"enable": "1",
				"name": {
					"zh_CN": "大陆总部",
					"zh_TW": "繁体",
					"en_US": "China"
				},
				"id": "2128303672759156737",
				"pubts": "2024-11-08 16:31:00",
				"tenant": "0000L6YQ8AVLFUZPXD0000",
				"distributionSite": "2128303672759156737",
				"toDistributionSiteId": "2128303861737717766"
			}
		],
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0
	},
	"traceId": "9c4ab36677c7201b",
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

