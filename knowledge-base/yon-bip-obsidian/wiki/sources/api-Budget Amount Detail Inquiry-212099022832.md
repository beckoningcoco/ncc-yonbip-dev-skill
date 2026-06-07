---
title: "预算金额明细查询"
apiId: "2120990228324286468"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payroll Budget"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payroll Budget]
platform_version: "BIP"
source_type: community-api-docs
---

# 预算金额明细查询

>  请求方式	POST | Payroll Budget (CPSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/openApi/bg/bgAmountsQuery
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
year	string	否	是	预算年度 示例：2024
bizType	string	否	是	业务类型：bizType=1 -> 组织、bizType=2 -> 部门 示例：1
queryType	string	否	是	查询类型：queryType=1 -> 年度、queryType=2 -> 月度 示例：1
queryIds	string	是	是	查询-Ids：orgIds -> 组织-ids、deptIds -> 部门-ids 示例：["1956016926696144907","1956016969645817870"]
bgItemIds	string	是	是	预算项目-Ids：bgItemIds -> 预算项目-ids 示例：["2118446482401525764","2118446482401525765"]

## 3. 请求示例

Url: /yonbip/hrcloud/openApi/bg/bgAmountsQuery?access_token=访问令牌
Body: {
	"year": "2024",
	"bizType": "1",
	"queryType": "1",
	"queryIds": [
		"1956016926696144907",
		"1956016969645817870"
	],
	"bgItemIds": [
		"2118446482401525764",
		"2118446482401525765"
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
code	string	否	请求返回编码 示例：200
message	string	否	请求返回信息 示例：查询成功
data	object	是	请求返回数据
year	string	否	预算年度 示例：2024
month	string	否	预算月度 示例：10
id	string	否	id：orgId -> 组织-id、deptId -> 部门-id 示例：1956016926696144907
parentId	string	否	parentId：parentOrgId -> 上级组织-id、parentDeptId -> 上级部门-id 示例：1956016969645817870
pubStatus	string	否	发布状态：0-未发布、1-已发布 示例：1
superiorCtrl	string	否	是否按上级控制： 0-否、1-是 示例：1
bgItemId	string	否	预算项目-id 示例：2118446482401525765
levelBudget	number
小数位数:8,最大长度:36	否	本级预算 示例：10000.00
execAmount	number
小数位数:8,最大长度:36	否	执行金额 示例：2000.00
surplusAmount	number
小数位数:8,最大长度:36	否	剩余额度 示例：8000.00
subBudget	number
小数位数:8,最大长度:36	否	包含下级预算 示例：20000.00
subExecAmount	number
小数位数:8,最大长度:36	否	包含下级执行金额 示例：15000.00
subSurplusAmount	number
小数位数:8,最大长度:36	否	包含下级剩余额度 示例：5000.00
traceId	string	否	分布式链路追踪Id 示例：4be0e5103cf0070d

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": [
		{
			"year": "2024",
			"month": "10",
			"id": "1956016926696144907",
			"parentId": "1956016969645817870",
			"pubStatus": "1",
			"superiorCtrl": "1",
			"bgItemId": "2118446482401525765",
			"levelBudget": 10000,
			"execAmount": 2000,
			"surplusAmount": 8000,
			"subBudget": 20000,
			"subExecAmount": 15000,
			"subSurplusAmount": 5000
		}
	],
	"traceId": "4be0e5103cf0070d"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
code	999	异常编码

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

