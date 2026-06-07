---
title: "定价策略详情查询"
apiId: "1803982592044171268"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Pricing Policy"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Pricing Policy]
platform_version: "BIP"
source_type: community-api-docs
---

# 定价策略详情查询

>  请求方式	GET | Pricing Policy (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/pricing/strategy/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	定价策略id

## 3. 请求示例

Url: /yonbip/sd/pricing/strategy/detail?access_token=访问令牌&id=

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
code	long	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
priceStrategyRules	object	是	priceStrategyRules
code	string	否	code 示例：1231312311
pricePreDimensionId	string	是	pricePreDimensionId 示例：["43"]
canEnable	boolean	否	canEnable 示例：true
isTaxIncluded	boolean	否	isTaxIncluded 示例：true
masterOrgKeyField	string	否	masterOrgKeyField 示例：creationOrgId
canEdit	boolean	否	canEdit 示例：true
creatorId	string	否	creatorId 示例：1539560069918621702
creationOrgId	string	否	creationOrgId 示例：1719296393883942920
fieldValues	string	否	fieldValues 示例：[{"fieldName":"currentOrg","id":"43","fieldType":"LONG"}]
modifyTime	string	否	modifyTime 示例：2023-08-28 10:42:35
enable	long	否	enable 示例：0
creationOrgId_name	string	否	creationOrgId_name 示例：cwd的组织
bizId	long	否	bizId 示例：2936477793932352
id	string	否	id 示例：1803805123888021513
createDate	string	否	createDate 示例：2023-08-28 00:00:00
creator	string	否	creator 示例：测试管理员111
priceStrategySteps	object	是	priceStrategySteps
isWfControlled	boolean	否	isWfControlled 示例：false
priority	long	否	priority 示例：1
pricePreDimensionId_name	string	是	pricePreDimensionId_name 示例：["当前组织"]
createTime	string	否	createTime 示例：2023-08-28 10:42:34
priceStrategyScopes	object	是	priceStrategyScopes
name	object	否	name
status	long	否	status 示例：0
traceId	string	否	traceId 示例：0199b5d70aaf00bb

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"priceStrategyRules": [
			{
				"ruleIds": "{\"currentOrg\":\"1803805123888021518\"}",
				"currentOrgDescription": "当前组织",
				"priceStrategyId": "1803805123888021513",
				"id": 0,
				"currentOrg": "1719296393883942920",
				"groupKey": "1803805123888021513_1693190554_0"
			}
		],
		"code": "1231312311",
		"pricePreDimensionId": [
			"43"
		],
		"canEnable": true,
		"isTaxIncluded": true,
		"masterOrgKeyField": "creationOrgId",
		"canEdit": true,
		"creatorId": "1539560069918621702",
		"creationOrgId": "1719296393883942920",
		"fieldValues": "[{\"fieldName\":\"currentOrg\",\"id\":\"43\",\"fieldType\":\"LONG\"}]",
		"modifyTime": "2023-08-28 10:42:35",
		"enable": 0,
		"creationOrgId_name": "cwd的组织",
		"bizId": 2936477793932352,
		"id": "1803805123888021513",
		"createDate": "2023-08-28 00:00:00",
		"creator": "测试管理员111",
		"priceStrategySteps": [
			{
				"priceStrategyId": "1803805123888021513",
				"noParticipate": false,
				"pricingTypeId_name": "商品价格2",
				"priceItemId_itemText": "无",
				"pricingTypeId_calculationType": "PRODUCT",
				"pricingTypeId": "1722993931242700809",
				"pricingTypeId_code": "productPrice2",
				"bShowOnly": false,
				"priceTypeId_isTaxIncluded": true,
				"priceItemId": [
					1
				],
				"bizId": 2936477793932352,
				"bSubtotal": false,
				"step": 10,
				"id": "1803805123888021514"
			}
		],
		"isWfControlled": false,
		"priority": 1,
		"pricePreDimensionId_name": [
			"当前组织"
		],
		"createTime": "2023-08-28 10:42:34",
		"priceStrategyScopes": [
			{
				"saleOrgId": "1719296393883942920",
				"bizType": 1,
				"priceStrategyId": "1803805123888021513",
				"canEdit": true,
				"bizId": 2936477793932352,
				"distributed": false,
				"id": "1803805123888021517",
				"saleOrgId_name": "cwd的组织"
			}
		],
		"name": {
			"zh_CN": "KF定价策略-副本"
		},
		"status": 0
	},
	"traceId": "0199b5d70aaf00bb"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	查询定价策略详情失败	

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

