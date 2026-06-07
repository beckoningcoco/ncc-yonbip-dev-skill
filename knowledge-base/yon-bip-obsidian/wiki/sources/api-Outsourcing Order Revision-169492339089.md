---
title: "委外订单修订"
apiId: "1694923390896308233"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Subcontract Order"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Subcontract Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外订单修订

>  请求方式	POST | Subcontract Order (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/subcontractorder/coordination/datechange
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
data	object	是	是	委外订单数据集
id	long	否	否	委外订单ID，委外订单ID和委外订单编码不能同时为空，ID和编码同时存在，以ID为准 示例：2373477794877696
code	string	否	否	委外订单编码，委外订单ID和委外订单编码不能同时为空，ID和编码同时存在，以ID为准 示例：WWDD20230411000001
orderProduct	object	是	是	产品行
out_sys_id	string	否	否	外部来源Id 示例：2297527422652672
out_sys_code	string	否	否	外部来源编码 示例：SCDD20230101
out_sys_version	string	否	否	外部系统版本 示例：01
out_sys_type	string	否	否	外部来源类型 示例：u8c
exchangeStatus	number
小数位数:0,最大长度:10	否	否	交换状态 示例：0
failedInfo	string	否	否	失败信息 示例：失败信息描述

## 3. 请求示例

Url: /yonbip/mfg/subcontractorder/coordination/datechange?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2373477794877696,
			"code": "WWDD20230411000001",
			"orderProduct": [
				{
					"id": 2373477794877697,
					"startDate": "2023-04-03",
					"deliveryDate": "2023-04-03",
					"out_sys_rowno": "2241412154465523",
					"out_sys_lineid": "2224235254665695"
				}
			],
			"out_sys_id": "2297527422652672",
			"out_sys_code": "SCDD20230101",
			"out_sys_version": "01",
			"out_sys_type": "u8c",
			"exchangeStatus": 0,
			"failedInfo": "失败信息描述"
		}
	]
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
code	string	否	返回码，成功时返回200 示例：200
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
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回信息
count	long	否	数量 示例：2
successCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：1
successOrder	object	是	成功订单集合
failedOrder	object	是	失败订单集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"successOrder": [
			{
				"id": 2373477794877696,
				"code": "WWDD20230411000001",
				"orderProduct": [
					{
						"id": 2373477794877697,
						"startDate": "2023-04-03",
						"deliveryDate": "2023-04-03",
						"out_sys_rowno": "23734777977696",
						"out_sys_lineid": "23734777977689"
					}
				],
				"out_sys_id": "2373477794877696",
				"out_sys_code": "SCDD20230101",
				"out_sys_version": "01",
				"out_sys_type": "u8c",
				"exchangeStatus": 0,
				"failedInfo": "失败信息描述"
			}
		],
		"failedOrder": [
			{
				"id": 2373477794877696,
				"code": "WWDD20230411000001",
				"message": "产品行的开工日期必填，请输入开工日期",
				"orderProduct": [
					{
						"id": 2373477794877697,
						"startDate": "2023-04-03",
						"deliveryDate": "2023-04-03",
						"out_sys_rowno": "2373477794877696",
						"out_sys_lineid": "2373477794877696"
					}
				],
				"out_sys_id": "2273477794877645",
				"out_sys_code": "SCDD20230101",
				"out_sys_version": "01",
				"out_sys_type": "u8c",
				"exchangeStatus": 0,
				"failedInfo": "失败信息描述"
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

