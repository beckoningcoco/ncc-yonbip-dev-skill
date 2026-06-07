---
title: "问题整改单删除"
apiId: "1581253404894167048"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Problem Remediation"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Problem Remediation]
platform_version: "BIP"
source_type: community-api-docs
---

# 问题整改单删除

>  请求方式	POST | Problem Remediation (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/synergy/rectificationDelete
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
data	object	是	否	业务数据
id	long	否	是	问题整改单主键 示例：3024317562900736

## 3. 请求示例

Url: /yonbip/cpu/synergy/rectificationDelete?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 3024317562900736
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
code	string	否	响应状态码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	否	响应数据
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
count	long	否	删除总数量 示例：2
sucessCount	long	否	删除成功数量 示例：2
failCount	long	否	删除失败数量 示例：0
messages	object	是	业务提示信息 示例：["没有查到数据，请检查id"]
infos	object	是	删除成功提示信息 示例：["成功删除id为：3041683895095552的数据。"]
failInfos	object	是	删除失败提示信息 示例：["id为:3041683895095552的数据的协同状态为空，不可删除"]

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			"没有查到数据，请检查id"
		],
		"infos": [
			"成功删除id为：3041683895095552的数据。"
		],
		"failInfos": [
			"id为:3041683895095552的数据的协同状态为空，不可删除"
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
999	服务端逻辑异常	联系相关开发人员

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

