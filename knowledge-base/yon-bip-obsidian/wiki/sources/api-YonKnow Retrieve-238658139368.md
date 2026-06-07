---
title: "友智库召回"
apiId: "2386581393681940486"
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

# 友智库召回

>  请求方式	POST | YonKnow (YYZDX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/CPC/iuap-aip-ps/intellis/common/retrieve
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
query	string	否	否	query 示例：通用报销单没有事项分录是什么原因？
searchType	string	否	否	searchType
config	object	否	否	config
retrieveType	number
小数位数:0,最大长度:10	否	否	retrieveType 示例：0
topN	number
小数位数:0,最大长度:10	否	否	topN 示例：5
scoreThreshold	number
小数位数:1,最大长度:10	否	否	scoreThreshold 示例：0.2
scopes	object	是	否	scopes
dsId	string	否	否	dsId 示例：3
catIds	string	是	否	catIds 示例：["1876730404685742083"]
permissionControl	boolean	否	否	permissionControl 示例：false
searchDomainUrl	string	否	否	searchDomainUrl
dynamicFilters	object	是	否	dynamicFilters
rangeFilters	object	是	否	rangeFilters
searchInfo	object	否	否	searchInfo

## 3. 请求示例

Url: /yonbip/CPC/iuap-aip-ps/intellis/common/retrieve?access_token=访问令牌
Body: {
	"query": "通用报销单没有事项分录是什么原因？",
	"searchType": "",
	"config": {
		"retrieveType": 0,
		"topN": 5,
		"scoreThreshold": 0.2
	},
	"scopes": [
		{
			"dsId": "3",
			"catIds": [
				"1876730404685742083"
			],
			"permissionControl": false,
			"searchDomainUrl": "",
			"dynamicFilters": [
				{
					"column": "ytenant_id",
					"values": [
						"0"
					]
				}
			],
			"rangeFilters": [
				{
					"column": "ts",
					"start": 1751356833320,
					"end": 1751356833320,
					"includeStart": true,
					"includeEnd": true
				}
			]
		}
	],
	"searchInfo": {}
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
小数位数:0,最大长度:10	否	status 示例：1
data	object	否	data
chunkList	object	是	chunkList
msg	string	否	msg 示例：执行成功
ext	string	否	ext
errorCode	string	否	errorCode
message	string	否	message
traceId	string	否	traceId
displayCode	string	否	displayCode
level	number
小数位数:0,最大长度:10	否	level 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"status": 1,
		"data": {
			"chunkList": [
				{
					"filedId": "2227760340635746310",
					"limitFlag": true,
					"chunkInfo": "YonBIP V3.0(R5_2312_1)旗舰版全球化篇(增量版)用友网络科技股份有限公司2024年1月用友BIP11|用友商业创新平台[empty]2/14版权◎2024用友集团版权所有。未经用友集团的书面许可,本发版说明任何整体或部分的内容不得被复制、复印、翻译或缩减以用于任何目的。本发版说明的内容在未经通知的情形下可能会发生改变, 敬请留意。请注意:本发版说明的内容并不代表用友网络所做的承诺。用友网络科技股份有限公司用友BIP11|用友商业创新平台[empty]3/14目录第一章概述..4第二章领域分述。42.1云平台...42.1.1数字化建模...42.1.2数据中台...62.1.3低代码开发平台72.1.4连接集成服务...8S2.1.55技术平台..82.2财务云...8...11.7...2.1.11事项会计...82.1.2企业绩效服务...92.1.3费控服务...92.1.4共享服务...102.1.55税务服务...112.1.6全球司库..112.3人力云...112.4协同云...122.5营销云...122."
				}
			]
		},
		"msg": "执行成功",
		"ext": "",
		"errorCode": "",
		"message": "",
		"traceId": "",
		"displayCode": "",
		"level": 0
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

