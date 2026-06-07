---
title: "场外期权期货成交明细生单"
apiId: "2154345141911420930"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Futures Transaction Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Futures Transaction Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 场外期权期货成交明细生单

>  请求方式	POST | Futures Transaction Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/fm/futuressaleregister/openapi/create
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
accentity_name	string	否	是	资金组织
tradeAccount_account	string	否	是	交易账户(请输入银行账号）
financialProduct_name	string	否	是	金融产品
tradePlace_name	string	否	是	交易所
contractCode	string	否	是	合约代码
futuresRegisterCode	string	否	是	合约号
financingOrgForBank_name	string	否	是	交易机构
isInit	string	否	是	是否初始化 1：是；0：否 示例：1
reportDate	date
格式:yyyy-MM-dd	否	是	报告日期 示例：2024-08-13
futuresSaleTradeDetail	object	是	是	期货成交交易明细集合
saleCode	string	否	是	成交序号
openClosePosition	number
小数位数:0,最大长度:10	否	是	开平（1 开仓 2平仓）
tradeDirection	number
小数位数:0,最大长度:10	否	是	买卖(0买入1卖出)
num	number
小数位数:6,最大长度:10	否	是	数量
transactionPrice	number
小数位数:6,最大长度:10	否	是	成交价
saleDate	date
格式:yyyy-MM-dd HH:mm:ss	否	是	成交日期
originalFeeAmount	number
小数位数:6,最大长度:10	否	否	手续费
tradeProfitLoss	number
小数位数:6,最大长度:10	否	否	交易盈亏
transactionPurpose	number
小数位数:0,最大长度:10	否	否	交易目的（1套期保值2投机3套利）

## 3. 请求示例

Url: /yonbip/ctm/fm/futuressaleregister/openapi/create?access_token=访问令牌
Body: [{
	"accentity_name": "",
	"tradeAccount_account": "",
	"financialProduct_name": "",
	"tradePlace_name": "",
	"contractCode": "",
	"futuresRegisterCode": "",
	"financingOrgForBank_name": "",
	"isInit": "1",
	"reportDate": "2024-08-13",
	"futuresSaleTradeDetail": [
		{
			"saleCode": "",
			"openClosePosition": 0,
			"tradeDirection": 0,
			"num": 0,
			"transactionPrice": 0,
			"saleDate": "2026-06-07 12:55:53",
			"originalFeeAmount": 0,
			"tradeProfitLoss": 0,
			"transactionPurpose": 0
		}
	]
}]

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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
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

