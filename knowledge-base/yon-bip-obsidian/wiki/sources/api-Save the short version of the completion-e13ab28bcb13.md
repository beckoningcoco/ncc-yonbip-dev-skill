---
title: "完工报告简版保存"
apiId: "e13ab28bcb134f61a6319fec73aeda04"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Completion Report"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Completion Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 完工报告简版保存

>  请求方式	POST | Completion Report (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/finishedreport/save
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
data	object	否	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
orgId	string	否	否	工厂id，工厂id和工厂编码不能同时为空，id和编码同时存在，以id为准
orgCode	string	否	否	工厂编码，工厂id和工厂编码不能同时为空，id和编码同时存在，以id为准
transTypeId	string	否	否	交易类型id，交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准
transTypeCode	string	否	否	交易类型编码，交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准
productionDepartmentId	string	否	否	部门id，部门id和部门编码不能同时为空，id和编码同时存在，以id为准
productionDepartmentCode	string	否	否	部门编码，部门id和部门编码不能同时为空，id和编码同时存在，以id为准
code	string	否	否	单据编号，设置手工编号时必输，自动编号时输入无效
vouchdate	string	否	否	单据日期，格式“2021-04-09”，为空默认取值业务日期
finishedReportUserdefItem!*	string	否	否	表头固定自定义项，finishedReportUserdefItem!为固定值，*需要传的自定义项字段，例如finishedReportUserdefItem!define1
finishedReportDetail	object	是	否	完工报告子表数据

## 3. 请求示例

Url: /yonbip/mfg/finishedreport/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"orgId": "",
		"orgCode": "",
		"transTypeId": "",
		"transTypeCode": "",
		"productionDepartmentId": "",
		"productionDepartmentCode": "",
		"code": "",
		"vouchdate": "",
		"finishedReportUserdefItem!*": "",
		"finishedReportDetail": [
			{
				"productionType": "",
				"materialId": "",
				"materialCode": "",
				"productId": "",
				"skuId": "",
				"skuCode": "",
				"quantity": 0,
				"qualifiedQuantity": 0,
				"scrapQuantity": 0,
				"returnQuantity": 0,
				"orgId": "",
				"warehouseId": "",
				"sourceautoid": "",
				"finishedReportDetailUserdefItem!*": ""
			}
		]
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
code	long	否	接口调用返回码，成功时返回200 示例：200
message	string	否	message 示例：操作成功
message	string	否	接口调用返回信息 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
data	object	否	接口调用返回数据
count	long	否	记录总数 示例：1
sucessCount	long	否	成功数 示例：0
failCount	long	否	失败数 示例：1
messages	object	是	数据返回信息汇总
infos	object	是	返回详细信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 0,
		"failCount": 1,
		"messages": [
			{
				"rowNum": "1",
				"message": "操作成功"
			}
		],
		"infos": [
			{
				"code": "200",
				"rowNum": "1",
				"message": "操作成功",
				"data": {
					"id": 2221939870175488,
					"orgId": "1453221906682112",
					"transTypeId": "1871027594744064",
					"productionDepartmentId": "1468620950606080",
					"code": "WGBG202104090012",
					"vouchdate": "1618811946000",
					"status": 0,
					"creator": "19998888888",
					"creatorId": 1452977546072320,
					"createTime": "1618811946000",
					"createDate": "1618811946000",
					"isWfControlled": "false",
					"pubts": "1618811946000",
					"tenant": 1452977542353152,
					"finishedReportDetail": [
						{
							"id": 2221939870191872,
							"lineNo": 10,
							"productionType": "0",
							"materialId": 1466029401886976,
							"productId": 1466029713821952,
							"skuId": 1466029718950144,
							"orgId": "1453221906682112",
							"finishDate": 1618816446000,
							"quantity": 10,
							"auxiliaryQuantity": 10,
							"changeType": "0",
							"changeRate": 1,
							"productionUnitId": 1466024899006720,
							"qualifiedQuantity": 8,
							"qualifiedAuxiliaryQuantity": 8,
							"scrapQuantity": "1",
							"scrapAuxiliaryQuantity": "1",
							"returnQuantity": "1",
							"returnAuxiliaryQuantity": "1",
							"finishedReportId": 2221939870175488,
							"pubts": 1618816451463
						}
					]
				}
			}
		]
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
999	取决于错误类型，不同错误信息不同	

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

