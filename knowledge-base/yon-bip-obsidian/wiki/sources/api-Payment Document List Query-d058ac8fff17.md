---
title: "资金付款单列表查询"
apiId: "d058ac8fff174a14b726f763f23a9dd1"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Document"
domain: "ctm"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 资金付款单列表查询

>  请求方式	POST | Payment Document (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/fi/fundpayment/list
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
pageIndex	int	否	是	页号 默认值：1
pageSize	int	否	是	每页行数 默认值：10
accentity	string	否	否	资金组织id 示例：2591580914225408
accentity_code	string	否	否	资金组织编码 示例：ZSZB
open_vouchdate_begin	string	否	否	单据日期开始日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-23
open_vouchdate_end	string	否	否	单据日期结束日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2022-05-23
code	string	否	否	单据编码 示例：FDP20220524000246
simpleVOs	object	是	否	扩展条件查询
field	string	否	否	属性名(条件) ，1：defines.define4(表头自由自定义项4) ，2：pubts(时间戳) 示例：pubts
op	string	否	否	比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between
value1	string	否	否	值1 示例：2022-05-24 20:34:29
value2	string	否	否	值2 示例：2022-05-25 20:34:29

## 3. 请求示例

Url: /yonbip/fi/fundpayment/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"accentity": "2591580914225408",
	"accentity_code": "ZSZB",
	"open_vouchdate_begin": "2022-05-23",
	"open_vouchdate_end": "2022-05-23",
	"code": "FDP20220524000246",
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2022-05-24 20:34:29",
			"value2": "2022-05-25 20:34:29"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
pageIndex	long	否	页号 示例：1
pageSize	long	否	每页数量 示例：10
recordCount	long	否	总记录数 示例：1
recordList	object	是	返回数据
pageCount	long	否	总页数 示例：1
beginPageIndex	long	否	开始页号 示例：1
endPageIndex	long	否	终止页号 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"currency_priceDigit": 2,
				"enterprisebankaccount": "2719941813391872",
				"settlemode": 2591099436552463,
				"project": "2591605862453504",
				"tradetype_code": "cmp_fund_payment_other",
				"project_name": "项目一",
				"accentity_name": "曾氏总部",
				"accentity": "2591580914225408",
				"operator": "2687914564882944",
				"natCurrency": "2591342867010560",
				"id": 2788485821747968,
				"exchangeRateType_digit": 6,
				"accentityRaw": "34",
				"isWfControlled": false,
				"enterprisebankaccount_name": "北京畅捷通支付技术有限公司",
				"natSum": 100,
				"expenseitem": 2699198821978624,
				"natCurrency_moneyDigit": 2,
				"natCurrency_priceDigit": 2,
				"accentityRaw_name": "用友网络",
				"verifystate": "0",
				"currency_moneyDigit": 2,
				"code": "FDP20220524000246",
				"description": "备注",
				"exchRate": 1,
				"vouchdate": "2022-05-24 00:00:00",
				"natCurrency_name": "人民币",
				"billtype": 18,
				"enterprisebankaccount_account": "699973566",
				"expenseitem_name": "差旅补助",
				"printCount": 0,
				"currency": "2591342867010560",
				"pubts": "2022-05-24 20:34:29",
				"settlemode_name": "银行转账",
				"org_name": "曾氏总部",
				"createDate": "2022-05-24 00:00:00",
				"creator": "曾刚",
				"currency_name": "人民币",
				"oriSum": 100,
				"org": "2591580914225408",
				"tradetype_name": "其他付款",
				"dept_name": "测试部",
				"dept": "2663265966461184",
				"accentity_code": "ZSZB",
				"srcitem": 8,
				"voucherstatus": 2,
				"tradetype": "2553204791808512",
				"exchangeRateType": "0000KY14MIJC0SDERP0000",
				"operator_name": "曾刚",
				"createTime": "2022-05-24 20:34:28",
				"exchangeRateType_name": "基准汇率",
				"defines": {
					"id": 2788485821747968,
					"define1": "表头"
				}
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-04-23	
更新
请求说明
更新
请求参数 accentity
更新
请求参数 accentity_code
新增
返回参数 accentityRaw
新增
返回参数 accentityRaw_name
更新
返回参数 accentity_name
更新
返回参数 accentity

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

