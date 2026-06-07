---
title: "商城专区专区商品更新"
apiId: "2032601184354172935"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Marketplace Sector Management"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Marketplace Sector Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 商城专区专区商品更新

>  请求方式	POST | Marketplace Sector Management (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/zone/updateShoppingSectorProductInfo
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
data	object	否	是	请求参数
id	number
小数位数:0,最大长度:19	否	是	专区ID 示例：2044969066651189252
salesOrgId	string	否	是	销售组织ID 示例：1686482740771291145
explosiveProZoneProductInfos	object	是	否	专区商品

## 3. 请求示例

Url: /yonbip/sd/zone/updateShoppingSectorProductInfo?access_token=访问令牌
Body: {
	"data": {
		"id": 2044969066651189252,
		"salesOrgId": "1686482740771291145",
		"explosiveProZoneProductInfos": [
			{
				"id": 2048829314545221634,
				"productId": 1952358439199965187,
				"productCode": "523831",
				"stockId": 1861878776940462080,
				"stockCode": "523831",
				"batchNo": "111",
				"stockOrgId": 1686482740771291145,
				"showWeight": 5,
				"memo": "test备注",
				"startDate": "2024-05-22 00:00:00",
				"endDate": "2024-05-22 23:59:59",
				"price": "",
				"enable": "true",
				"dataStatus": "Insert"
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
code	number
小数位数:0,最大长度:10	否	调用成功时状态码 示例：200
message	string	否	调用成功时的消息 示例：操作成功
data	object	否	调用成功时返回的数据
id	string	否	专区ID 示例：2022098743773888513
name	object	否	专区名称
code	string	否	专区编码 示例：test001
salesOrgId	string	否	销售组织ID 示例：1940316562100584456
salesOrgIdName	string	否	销售组织 示例：NN旺仔集团
transType	string	否	交易类型ID 示例：1934659316950761475
transTypeName	string	否	交易类型 示例：爆品专区
orderTransType	string	否	订单交易类型ID 示例：1936855127688741531
orderTransTypeName	string	否	订单交易类型 示例：普通销售（无发货）
applyAgent	number
小数位数:0,最大长度:10	否	适用客户范围(1:全部客户;2:部分客户) 示例：2
priceRount	number
小数位数:0,最大长度:10	否	单价舍入规则 示例：1
moneyRount	number
小数位数:0,最大长度:10	否	金额舍入规则 示例：4
currencyName	string	否	币种 示例：人民币元1
currencyCode	string	否	币种编码 示例：CNY
currencyId	string	否	币种ID 示例：1936855136278675513
moneyDigit	number
小数位数:0,最大长度:10	否	金额精度 示例：2
priceDigit	number
小数位数:0,最大长度:10	否	单价精度 示例：3
visibleAgent	number
小数位数:0,最大长度:10	否	政策外客户可见性设置(1:均不可见;2:所有客户可见;3:部分客户可见) 示例：3
description	object	否	禁止下单说明
status	number
小数位数:0,最大长度:10	否	状态(0:开立;1:审核通过;2:已关闭;3:审核中;5:已驳回;) 示例：0
enable	number
小数位数:0,最大长度:10	否	是否启用(0:停用;1:启用)) 示例：0
startDate	date
格式:yyyy-MM-dd HH:mm:ss	否	专区开始时间 示例：2024-06-17 00:00:00
endDate	date
格式:yyyy-MM-dd HH:mm:ss	否	专区结束时间 示例：2026-07-05 23:59:59
creatorId	string	否	创建人ID 示例：1939767888615833602
creator	string	否	创建人 示例：昵称-高宁宁
createDate	date
格式:yyyy-MM-dd HH:mm:ss	否	创建日期 示例：2024-06-17 00:00:00
createTime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间 示例：2024-06-17 13:47:56
modifierId	string	否	修改人ID 示例：1939767888615833602
modifier	string	否	修改人 示例：昵称-高宁宁
modifyDate	date
格式:yyyy-MM-dd HH:mm:ss	否	修改日期 示例：2024-06-28 00:00:00
modifyTime	date
格式:yyyy-MM-dd HH:mm:ss	否	修改时间 示例：2024-06-28 16:27:38
isWfControlled	boolean	否	是否审批流控制 示例：false
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
vouchdate	date
格式:yyyy-MM-dd HH:mm:ss	否	单据日期 示例：2024-06-17 00:00:00
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	修改时间 示例：2024-06-28 16:27:38
masterOrgKeyField	string	否	主组织字段标识 示例：salesOrgId
transTypeKeyField	string	否	交易类型字段标识 示例：transType
explosiveProZoneProductInfos	object	是	专区商品explsiveProZoneProductInfos
explosiveProZoneApplyAgentInfos	object	是	适用客户
explosiveProZoneVisibleAgentInfos	object	是	可见客户
traceId	string	否	traceId 示例：f23a7e2feef2efa6

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2022098743773888513",
		"name": {
			"zh_CN": "复制无发货专区",
			"zh_TW": "test繁体",
			"en_US": "testyingwen"
		},
		"code": "test001",
		"salesOrgId": "1940316562100584456",
		"salesOrgIdName": "NN旺仔集团",
		"transType": "1934659316950761475",
		"transTypeName": "爆品专区",
		"orderTransType": "1936855127688741531",
		"orderTransTypeName": "普通销售（无发货）",
		"applyAgent": 2,
		"priceRount": 1,
		"moneyRount": 4,
		"currencyName": "人民币元1",
		"currencyCode": "CNY",
		"currencyId": "1936855136278675513",
		"moneyDigit": 2,
		"priceDigit": 3,
		"visibleAgent": 3,
		"description": {
			"zh_CN": "",
			"zh_TW": "",
			"en_US": ""
		},
		"status": 0,
		"enable": 0,
		"startDate": "2024-06-17 00:00:00",
		"endDate": "2026-07-05 23:59:59",
		"creatorId": "1939767888615833602",
		"creator": "昵称-高宁宁",
		"createDate": "2024-06-17 00:00:00",
		"createTime": "2024-06-17 13:47:56",
		"modifierId": "1939767888615833602",
		"modifier": "昵称-高宁宁",
		"modifyDate": "2024-06-28 00:00:00",
		"modifyTime": "2024-06-28 16:27:38",
		"isWfControlled": false,
		"verifystate": 0,
		"returncount": 0,
		"vouchdate": "2024-06-17 00:00:00",
		"pubts": "2024-06-28 16:27:38",
		"masterOrgKeyField": "salesOrgId",
		"transTypeKeyField": "transType",
		"explosiveProZoneProductInfos": [
			{
				"id": "2022098743773888514",
				"explosiveProZoneId": "2022098743773888513",
				"productId": "2002175077682511877",
				"productName": "NNJB商品3.1.1SKU-2批次",
				"productCode": "0003000040",
				"skuId": "2002176623870738435",
				"skuName": "NNJB商品3.1.1SKU-2批次大白色",
				"skuCode": "000049",
				"stockId": "1977038764389171201",
				"stockName": "NN出货仓",
				"stockCode": "000009",
				"batchId": "2002177233738268681",
				"batchNo": "批次SKU-1",
				"stockOrgId": "1940316562100584456",
				"stockOrgIdName": "NN旺仔集团",
				"showWeight": 5,
				"memo": "test备注",
				"enable": true,
				"startDate": "2024-06-17 00:00:00",
				"endDate": "2026-07-05 23:59:59",
				"price": 23,
				"creatorId": "1939767888615833602",
				"creator": "昵称-高宁宁",
				"createDate": "2024-06-17 00:00:00",
				"createTime": "2024-06-17 13:47:56",
				"modifierId": "1939767888615833602",
				"modifier": "昵称-高宁宁",
				"modifyDate": "2024-06-28 00:00:00",
				"modifyTime": "2024-06-28 16:27:38",
				"pubts": "2024-06-28 16:27:38"
			}
		],
		"explosiveProZoneApplyAgentInfos": [
			{
				"id": "2030344926359715842",
				"explosiveProZoneId": "2022098743773888513",
				"agentId": "1941101072232742920",
				"agentId_name": "NN旺仔客户",
				"agentId_code": "NNKFNQY1000001",
				"pubts": "2024-06-28 16:27:38"
			}
		],
		"explosiveProZoneVisibleAgentInfos": [
			{
				"id": "2030344926359715843",
				"explosiveProZoneId": "2022098743773888513",
				"agentId": "1941112788903526407",
				"agentId_name": "NN西红柿客户",
				"agentId_code": ".1.1SQY2000001",
				"pubts": "2024-06-28 16:27:38"
			}
		]
	},
	"traceId": "f23a7e2feef2efa6"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	错误信息	错误信息

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

