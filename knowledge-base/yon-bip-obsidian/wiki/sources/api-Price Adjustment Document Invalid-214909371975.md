---
title: "调价单失效"
apiId: "2149093719757815808"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Adjustment"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 调价单失效

>  请求方式	POST | Price Adjustment (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/adjustprice/invalid
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
item	string	query	否	调价单id    示例: 2134228623200092169

## 3. 请求示例

Url: /yonbip/sd/uretail/adjustprice/invalid?access_token=访问令牌&item=2134228623200092169

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
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	数据集
msgCode	number
小数位数:0,最大长度:10	否	消息编码 示例：1
isCancel	boolean	否	是否取消 示例：false
isActionCancel	boolean	否	是否动作取消 示例：false
messages	string	是	消息描述
code	number
小数位数:0,最大长度:10	否	编码 示例：0
traceId	string	否	线索id 示例：e507188dcbc8d876

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"msgCode": 1,
		"isCancel": false,
		"isActionCancel": false,
		"messages": [
			""
		],
		"code": 0
	},
	"traceId": "e507188dcbc8d876"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
code	999	未知服务异常

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

