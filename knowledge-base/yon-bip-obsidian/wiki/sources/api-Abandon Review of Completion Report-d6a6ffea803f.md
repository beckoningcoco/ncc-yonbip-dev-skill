---
title: "完工报告弃审"
apiId: "d6a6ffea803f416ea429be8b28d63ebb"
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

# 完工报告弃审

>  请求方式	POST | Completion Report (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/finishedreport/batchunaudit
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	完工报告数据集
id	long	否	否	单据id，id和code同时传入时，以id为准，无论id是否正确。优先级：id > code 示例：2196982544175360
code	string	否	否	单据code，id和code同时传入时，以id为准，无论id是否正确。优先级：id > code 示例：WGBG20210707000001

## 3. 请求示例

Url: /yonbip/mfg/finishedreport/batchunaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2196982544175360,
			"code": "WGBG20210707000001"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	message 示例：操作成功
message	string	否	接口返回信息 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
data	object	否	接口返回数据
successCountAI	long	否	操作成功计数 示例：1
failCountAI	long	否	操作失败计数 示例：1
count	long	否	操作单据总计数 示例：2
sucessCount	long	否	成功计数 示例：1
failCount	long	否	失败计数 示例：1
messages	string	是	操作失败提示信息 示例：["WGBG20210322000005已经入库处理，无法进行弃审操作"]
infos	object	是	操作成功单据信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"successCountAI": 1,
		"failCountAI": 1,
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			"WGBG20210322000005已经入库处理，无法进行弃审操作"
		],
		"infos": [
			{
				"id": 2182292988842240,
				"code": "WGBG20210428000003",
				"status": 0,
				"transTypeId": "1871027594744064",
				"isWfControlled": "false",
				"verifystate": 0,
				"tenant": 1861077976273152,
				"pubts": "2021-04-09 11:24:09"
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

