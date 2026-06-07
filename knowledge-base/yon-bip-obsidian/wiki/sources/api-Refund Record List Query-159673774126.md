---
title: "退款记录列表查询"
apiId: "1596737741266616322"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Refund Record"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Refund Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 退款记录列表查询

>  请求方式	POST | Refund Record (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/api/upayment/refund/list
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
page	object	否	是	页面参数
pageSize	long	否	是	分页条数 示例：20
pageIndex	long	否	是	当前页数 示例：1
condition	object	否	否	查询条件
commonVOs	object	是	否	过滤方案

## 3. 请求示例

Url: /yonbip/sd/api/upayment/refund/list?access_token=访问令牌
Body: {
	"page": {
		"pageSize": 20,
		"pageIndex": 1
	},
	"condition": {
		"commonVOs": [
			{
				"itemName": "code",
				"value1": "CREFar202311220001",
				"value2": "2025-11-11 23:59:59"
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
code	string	否	响应状态码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	否	响应数据
pageIndex	long	否	当前页数 示例：1
pageSize	long	否	分页条数 示例：2
recordCount	long	否	总数 示例：577
recordList	object	是	响应数据集合
pageCount	long	否	总页数 示例：289
beginPageIndex	long	否	开始页 示例：1
endPageIndex	long	否	结束页 示例：2

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 2,
		"recordCount": 577,
		"recordList": [
			{
				"payFinishDate": "2022-11-22 11:53:13",
				"agentId": 2611173634412800,
				"code": "CREFar2022100900001",
				"payCompleteDate": "2022-11-22 11:53:26",
				"source": 0,
				"settlementOrgId_name": "夏目公司",
				"payType": 1,
				"modifyTime": "2022-11-22 11:53:25",
				"usedMoney": 0.01,
				"id": 1596776112493953000,
				"originalPk": "2592566621722880",
				"pubts": "2022-11-22 11:53:35",
				"agentId_name": "夏目客户",
				"originalPk_name": "人民币",
				"notUsedMoney": 0,
				"amount": 0.01,
				"voucherType": "NORMAL",
				"payCreateDate": "2022-10-09 17:27:08",
				"createTime": "2022-10-09 17:27:08",
				"settlementOrgId_code": "test",
				"originalPk_code": "CNY",
				"settlementOrgId": 2611170238403328,
				"payVoucherType": "REFUND",
				"payMentStatusCode": 2,
				"agentId_code": "QQQQQ1-000011",
				"salesOrgId_name": "夏目公司",
				"salesOrgId": 2611170238403328
			}
		],
		"pageCount": 289,
		"beginPageIndex": 1,
		"endPageIndex": 2
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-13	
更新
请求说明
更新
请求参数 value1
更新
请求参数 value2

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

