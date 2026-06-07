---
title: "账单费用项目新增"
apiId: "1484899481528827912"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bill Expense Item"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bill Expense Item]
platform_version: "BIP"
source_type: community-api-docs
---

# 账单费用项目新增

>  请求方式	POST | Bill Expense Item (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/costitem/add
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
data	object	是	是	账单费用项目对象
platcostitem	string	否	是	平台费用项目名称
matchkeyword	string	否	否	匹配关键字
level	int	否	否	优先级
isCnTaxCost	short	否	否	菜鸟保税费用
erpcode	string	否	否	费用项目名称
source	int	否	是	来源。0：系统预制；1：手工
memo	string	否	否	备注
erpId	long	否	否	费用项目ID
expenseItem	string	否	否	费用项目ID
_status	string	否	是	状态，新增:Insert

## 3. 请求示例

Url: /yonbip/sd/dst/costitem/add?access_token=访问令牌
Body: {
	"data": [
		{
			"platcostitem": "",
			"matchkeyword": "",
			"level": 0,
			"isCnTaxCost": 0,
			"erpcode": "",
			"source": 0,
			"memo": "",
			"erpId": 0,
			"expenseItem": "",
			"_status": ""
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	返回信息 操作成功 示例：操作成功
data	object	否	返回数据
count	long	否	请求数据数量 示例：1
sucessCount	long	否	成功的数量 示例：1
failCount	long	否	失败的数量 示例：0
messages	string	是	返回的信息清单
infos	object	是	成功的数据体
failInfos	object	是	失败的数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"platcostitem": "12",
				"matchkeyword": "1231111",
				"level": 1,
				"isCnTaxCost": 0,
				"erpcode": "12",
				"source": 1,
				"memo": "1",
				"erpId": 2382012666941696,
				"expenseItem": 2382012666941696,
				"id": 1498249829021646800,
				"pubts": "2022-07-12 17:47:17",
				"tenant": 1857881280057600,
				"yTenantId": "h6q8321v"
			}
		],
		"failInfos": [
			{}
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
999	服务端逻辑异常	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (22)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

