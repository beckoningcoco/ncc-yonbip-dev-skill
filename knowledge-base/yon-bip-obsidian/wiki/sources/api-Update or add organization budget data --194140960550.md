---
title: "更新or新增组织预算数据-集成"
apiId: "1941409605501321223"
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

# 更新or新增组织预算数据-集成

>  请求方式	POST | Payroll Budget (CPSM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/openApiBudget/updateYearBudgetByJC
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
bgOrgYearData	object	是	是	请求体
pubStatus	number
小数位数:2,最大长度:10	否	是	发布状态(0-未发布、1-已发布 示例：1
superiorCtrl	number
小数位数:2,最大长度:10	否	否	是否按上级控制(0-否、1-是) 示例：0
year	string	否	是	预算年度 示例：2015
orgId	string	否	是	组织id 示例：1540543411261538311
id	string	否	是	id 示例：1573170216219181073
bgOrgVersionId	string	否	是	组织预算版本id 示例：1573170216219181056
superiorOrgId	string	否	否	上级组织id
bgOrgYearAmountRpc	object	是	是	组织预算年度预算金额

## 3. 请求示例

Url: /yonbip/hrcloud/openApiBudget/updateYearBudgetByJC?access_token=访问令牌
Body: {
	"bgOrgYearData": [
		{
			"pubStatus": 1,
			"superiorCtrl": 0,
			"year": "2015",
			"orgId": "1540543411261538311",
			"id": "1573170216219181073",
			"bgOrgVersionId": "1573170216219181056",
			"superiorOrgId": "",
			"bgOrgYearAmountRpc": [
				{
					"id": "",
					"bgOrgYearId": "1573170216219181073",
					"orgId": "1540543411261538311",
					"superiorOrgId": "",
					"year": "2025",
					"levelBudget": 2,
					"execAmount": 2,
					"pubStatus": 1,
					"includeSubBudget": 2,
					"includeSubPubStatus": "0",
					"sumAmount": 2,
					"sumSubAmount": 2,
					"itemCode": "202210091006"
				}
			]
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
code	string	否	成功编码 示例：200
messge	string	否	错误信息 示例：保存成功
data	object	否	成功详细信息
count	object	否	总共条数 示例：10
successCount	object	否	成功条数 示例：5
failCount	object	否	失败条数 示例：5
messages	object	是	详细错误信息

## 5. 正确返回示例

{
	"code": "200",
	"messge": "保存成功",
	"data": {
		"count": "10",
		"successCount": "5",
		"failCount": "5",
		"messages": [
			{
				"sourceUnique": "124",
				"message": "档案编码不存在或者code不一致"
			}
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-10	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

