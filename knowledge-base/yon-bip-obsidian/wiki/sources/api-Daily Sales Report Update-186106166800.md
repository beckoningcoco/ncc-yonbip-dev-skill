---
title: "销售日报更新"
apiId: "1861061668009148425"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Daily Sales Report"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Sales Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售日报更新

>  请求方式	POST | Daily Sales Report (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/tradeorder/updatesalesdailyrpt
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
partParam	object	否	是	表单参数
id	long	否	否	销售日报id 示例：6589441127555
cCode	string	否	否	单据编号 示例：SR155420231113000001
docstatus	string	否	否	交换状态(枚举值：0:处理中,1:处理失败,2:处理成功,3:未处理) 示例：1
memo	string	否	否	备注 示例：补发
SalesDailyRptDetail	object	是	否	销售日报表体

## 3. 请求示例

Url: /yonbip/sd/dst/tradeorder/updatesalesdailyrpt?access_token=访问令牌
Body: {
	"partParam": {
		"id": 6589441127555,
		"cCode": "SR155420231113000001",
		"docstatus": "1",
		"memo": "补发",
		"SalesDailyRptDetail": [
			{
				"id": "345345324324"
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
code	int	否	code为200，表示操作成功
message	string	否	更新成功
data	string	否	更新成功

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"data": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	当前单据不是最新状态，请刷新重试	获取当前单据最新的时间戳再调用api

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

