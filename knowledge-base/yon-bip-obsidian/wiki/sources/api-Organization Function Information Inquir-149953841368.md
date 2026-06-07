---
title: "组织职能信息查询"
apiId: "1499538413680328707"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 组织职能信息查询

>  请求方式	POST | Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/queryOrgFuncList
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
includeDisabled	boolean	否	是	是否包含停用 true-包含；false-不包含。 默认false 示例：true 默认值：false
id	string	是	否	组织主键，为避免性能问题，code+id要小于100条，id与code至少输入一条 示例：["aa","bb"]
code	string	是	否	组织编码，为避免性能问题，code+id要小于100条，id与code至少输入一条 示例：["333414","dd"]

## 3. 请求示例

Url: /yonbip/digitalModel/queryOrgFuncList?access_token=访问令牌
Body: {
	"includeDisabled": true,
	"id": [
		"aa",
		"bb"
	],
	"code": [
		"333414",
		"dd"
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
code	long	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	是	后端服务返回的数据部分
orgFuncTypeCodes	string	是	返回的职能类型 adminorg-人力职能；financeorg-会计主体；salesorg-销售组织；assetsorg-资产组织；factoryorg-工厂组织；inventoryorg-库存组织；logisticsorg-物流组织；maintainorg-维修组织；purchaseorg-采购组织；qualityorg-质检组织；sharingsorg-共享中心；taxpayerorg-纳税主体;settlementorg-结算中心；safetyorg-安环组织；planorg-计划组织；serviceorg-服务组织；researchdeveloporg-研发组织；energyorg-能源组织 示例：["inventoryorg","assetsorg","adminorg","factoryorg","salesorg","purchaseorg"]
orgId	string	否	组织id 示例：1489880372085784580
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"orgFuncTypeCodes": [
				"inventoryorg",
				"assetsorg",
				"adminorg",
				"factoryorg",
				"salesorg",
				"purchaseorg"
			],
			"orgId": "1489880372085784580"
		}
	],
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
000-545-100010
	需要查询的组织id为空,请确认输入的id/code	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端异常	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-02	
新增
返回参数 displayCode
新增
返回参数 level

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

