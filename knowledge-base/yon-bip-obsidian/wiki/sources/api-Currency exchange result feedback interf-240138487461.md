---
title: "货币兑换结果回传接口"
apiId: "2401384874613145608"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Currency Exchange"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Currency Exchange]
platform_version: "BIP"
source_type: community-api-docs
---

# 货币兑换结果回传接口

>  请求方式	POST | Currency Exchange (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/ctm/commonapi/updateCurrDataAndGeneratorVoucher
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	其他
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	货币兑换数据
id	string	否	是	货币兑换id 示例：1905863330859843588
contractNo	string	否	否	外汇交易合约编号 示例：30859843588
settlestatus	number
小数位数:0,最大长度:1	否	是	交割状态；3：处理中，5：已交割，6：逾期，7：交割失败（已经交割完成的单据，不允许更新结果信息） 示例：3
purchaseamount	number
小数位数:8,最大长度:28	否	否	买入金额（必须大于0） 示例：10.01
sellamount	number
小数位数:8,最大长度:28	否	否	卖出金额（必须大于0） 示例：10.01
exchangerate	number
小数位数:8,最大长度:28	否	否	成交汇率 示例：1.3
settledate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	交割日期 示例：2023-01-24 12:12:12

## 3. 请求示例

Url: /yonbip/ctm/commonapi/updateCurrDataAndGeneratorVoucher?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1905863330859843588",
			"contractNo": "30859843588",
			"settlestatus": 3,
			"purchaseamount": 10.01,
			"sellamount": 10.01,
			"exchangerate": 1.3,
			"settledate": "2023-01-24 12:12:12"
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
code	string	否	返回码，调用成功时返回200 示例：200
data	string	否	入参
message	string	否	调用失败时的错误信息 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"data": "",
	"message": "操作成功"
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
	1	2026-04-01	
更新
请求参数 data
更新
请求参数 settledate
更新
请求参数 characterDef
回传交割状态为已交割时，必传交割日期；其他状态，非必填

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

