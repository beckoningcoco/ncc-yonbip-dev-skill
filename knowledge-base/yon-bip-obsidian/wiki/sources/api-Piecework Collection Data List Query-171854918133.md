---
title: "计件采集数据列表查询"
apiId: "1718549181332193283"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Piecework data collection"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Piecework data collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 计件采集数据列表查询

>  请求方式	POST | Piecework data collection (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/sfc/pieceworkcollect/list
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	int	否	否	页号 示例：1 默认值：1
pageSize	int	否	否	每页行数 示例：20 默认值：20
orgId	long	是	否	组织ID 示例：[1718547815527088140]
deviceId	long	是	否	设备ID 示例：[1718547815527088141]
open_collectTime_begin	DateTime	否	是	采集时间起始 示例：2022-04-18 00:00:00
open_collectTime_end	DateTime	否	是	采集时间范围结束 示例：2022-04-19 00:00:00
bCanReport	int	否	否	是否可报工，0，否；1，是 示例：1
simple	object	否	否	simple
orgId.code	string	是	否	组织编码。当组织ID和组织编码同时存在时，取交集 示例：["ZZY-01"]
deviceCode	string	是	否	设备编码。当设备编码和设备ID同时存在时取交集 示例：["ZZY-01"]
open_pubts_begin	DateTime	否	否	时间戳，开始时间 示例：2022-04-01 00:00:00
open_pubts_end	DateTime	否	否	时间戳，结束时间 示例：2022-04-20 00:00:00

## 3. 请求示例

Url: /yonbip/mfg/sfc/pieceworkcollect/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 20,
	"orgId": [
		1718547815527088140
	],
	"deviceId": [
		1718547815527088141
	],
	"open_collectTime_begin": "2022-04-18 00:00:00",
	"open_collectTime_end": "2022-04-19 00:00:00",
	"bCanReport": 1,
	"simple": {
		"orgId.code": [
			"ZZY-01"
		],
		"deviceCode": [
			"ZZY-01"
		],
		"open_pubts_begin": "2022-04-01 00:00:00",
		"open_pubts_end": "2022-04-20 00:00:00"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	string	否	服务端状态码 示例：200
message	string	否	服务端信息 示例：操作成功
data	object	否	服务端返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页数据量 示例：20
recordCount	long	否	返回记录数量 示例：4
recordList	object	是	记录列表
pageCount	long	否	页数 示例：1
beginPageIndex	long	否	起始页码 示例：1
endPageIndex	long	否	结束页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 4,
		"recordList": [
			{
				"collectTime": "2023-05-01 12:00:00",
				"attrCode": "JSQ01",
				"orgName": "制造云工厂",
				"deviceId": "1551681532860039173",
				"orgId": "1551681292353929221",
				"unit": "kg/千克",
				"orgCode": "ZZY-01",
				"collectQty": 100,
				"startTime": "2023-04-01 12:00:00",
				"endTime": "2023-05-01 12:00:00",
				"id": 1718649374353391600,
				"pubts": "2023-05-05 16:58:40",
				"attrName": "计数器1"
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
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
999	异常错误	

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

