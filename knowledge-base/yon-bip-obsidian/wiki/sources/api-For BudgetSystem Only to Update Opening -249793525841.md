---
title: "预算系统更新期初预占和期初执行"
apiId: "2497935258413432833"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Budget Execution Control"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Execution Control]
platform_version: "BIP"
source_type: community-api-docs
---

# 预算系统更新期初预占和期初执行

>  请求方式	POST | Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/yonbip-fi-sepmbcdc/execdata/updateBudgetActual
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
cubeCode	string	否	是	预算系统的模型编码（必填） 示例：cube2S
sysCode	string	否	是	预算系统编码（必填） 示例：EBDG
requestUniqueId	string	否	否	请求唯一标识requestUniqueId：请求唯一标识，同一标识数据幂等处理，防止重复提交数据。同时 数据处理完之后返回消息中会携带返回此标识，可明确成功数据。非必传，为空则不处理幂等，接口排队响应。（非必填，后端可获取） 示例：2454689756700213251
data	object	是	是	维度数据
cfinaceorg	string	否	否	费用承担组织 示例：pkm00
cfinaceorg_id	string	否	否	费用承担组织id 示例：1525652227072458756
month_id	string	否	否	月 示例：1563488784423059463
StartDate	string	否	否	开始时间 示例：2026-01-01
EndDate	string	否	否	结束时间 示例：2026-01-30
budgetDetailId	string	否	是	预算数唯一标识 示例：2454689490405425158
month	string	否	否	月编码 示例：2026-01
actual	number
小数位数:8,最大长度:35	否	否	期初执行 示例：10
beforeActual	number
小数位数:8,最大长度:35	否	否	期初预占 示例：10

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-sepmbcdc/execdata/updateBudgetActual?access_token=访问令牌
Body: {
	"cubeCode": "cube2S",
	"sysCode": "EBDG",
	"requestUniqueId": "2454689756700213251",
	"data": [
		{
			"cfinaceorg": "pkm00",
			"cfinaceorg_id": "1525652227072458756",
			"month_id": "1563488784423059463",
			"StartDate": "2026-01-01",
			"EndDate": "2026-01-30",
			"budgetDetailId": "2454689490405425158",
			"month": "2026-01",
			"actual": 10,
			"beforeActual": 10
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
message	string	否	接口信息（成功 : 无 失败 : 提示信息）
code	string	否	响应码 示例：200
data	string	否	返回数据 示例：null

## 5. 正确返回示例

{
	"message": "",
	"code": "200",
	"data": "null"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
500	{ "code": "500", "message": "存在维度向量未找到",data:["2454689490405425158"] }	

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

