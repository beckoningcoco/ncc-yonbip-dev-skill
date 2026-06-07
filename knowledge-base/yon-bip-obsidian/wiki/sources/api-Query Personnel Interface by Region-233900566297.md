---
title: "根据区域查询人员接口"
apiId: "2339005662975492099"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Personnel Business Relationship"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Personnel Business Relationship]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据区域查询人员接口

>  请求方式	POST | Personnel Business Relationship (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/personSet/getPersonByArea
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
areaIds	string	是	否	区域编号集合 示例：[1]

## 3. 请求示例

Url: /yonbip/MCC/personSet/getPersonByArea?access_token=访问令牌
Body: {
	"areaIds": [
		1
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
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
areaId	object	否	区域编号

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"areaId": {
			"relationPerson": [
				{
					"person": "1711049472553254915",
					"saleArea": 1737067946360438791,
					"areaResponsible": false,
					"person_name": "白汉淇",
					"id": 2014583968243384328,
					"isdefault": true,
					"person_code": "00000034"
				}
			],
			"ownerPerson": [
				{
					"person": "689404d7cfcf11edae1008c0ebd50df6",
					"saleArea": 1737067946360438791,
					"areaResponsible": true,
					"person_name": "集团_1",
					"id": 2167610328685215753,
					"isdefault": true,
					"person_code": "68940565cfcf11edae1008c0ebd50df6"
				}
			]
		}
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
	1	2025-10-20	
更新
请求说明
更新
请求参数 areaIds
删除
请求参数 areaCodes

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

