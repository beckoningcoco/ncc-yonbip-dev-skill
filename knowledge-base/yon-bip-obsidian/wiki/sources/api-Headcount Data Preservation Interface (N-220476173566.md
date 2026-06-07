---
title: "编制数据保存接口（新）"
apiId: "2204761735667646473"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Headcount Allocation"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Headcount Allocation]
platform_version: "BIP"
source_type: community-api-docs
---

# 编制数据保存接口（新）

>  请求方式	POST | Headcount Allocation (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/staffingApi/saveAllocationData
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
schemaId	string	否	是	方案ID 示例：2201125186865987589
organizationId	string	否	是	组织/部门ID 示例：2091029850608893955
periodId	string	否	是	期间ID 示例：2201125058016968757
planNumber	number
小数位数:0,最大长度:10	否	是	计划编制数 示例：50
releaseStatus	number
小数位数:0,最大长度:10	否	否	下达/分解状态 示例：2
esoPlanNumber	number
小数位数:0,最大长度:10	否	否	计划编制本级数 示例：33
overstaffedRatio	string	否	否	超员比例
overstaffedNumber	number
小数位数:0,最大长度:10	否	否	超员数量 示例：2
understaffedRatio	string	否	否	缺员比例
understaffedNumber	number
小数位数:0,最大长度:10	否	否	缺员数量 示例：1
esoOverstaffedRatio	string	否	否	超员比例-本级
esoOverstaffedNumber	number
小数位数:0,最大长度:10	否	否	超员数量-本级 示例：1
esoUnderstaffedRatio	string	否	否	缺员比例-本级
esoUnderstaffedNumber	number
小数位数:0,最大长度:10	否	否	缺员数量-本级 示例：1
split	object	是	否	split
planNumber	number
小数位数:0,最大长度:10	否	是	计划编制数 示例：1
esoPlanNumber	number
小数位数:0,最大长度:10	否	否	计划编制本级数 示例：1
strictControlFlag	boolean	否	否	是否严控 示例：true
overstaffedRatio	string	否	否	超员比例
overstaffedNumber	string	否	否	超员数量
understaffedRatio	string	否	否	缺员比例
understaffedNumber	string	否	否	缺员数量
esoOverstaffedRatio	string	否	否	超员比例-本级
esoOverstaffedNumber	string	否	否	超员数量-本级
esoUnderstaffedRatio	string	否	否	缺员比例-本级
esoUnderstaffedNumber	string	否	否	缺员数量-本级
composizeDimension	object	是	否	composizeDimension

## 3. 请求示例

Url: /yonbip/hrcloud/staffingApi/saveAllocationData?access_token=访问令牌
Body: [{
	"schemaId": "2201125186865987589",
	"organizationId": "2091029850608893955",
	"periodId": "2201125058016968757",
	"planNumber": 50,
	"releaseStatus": 2,
	"esoPlanNumber": 33,
	"overstaffedRatio": "",
	"overstaffedNumber": 2,
	"understaffedRatio": "",
	"understaffedNumber": 1,
	"esoOverstaffedRatio": "",
	"esoOverstaffedNumber": 1,
	"esoUnderstaffedRatio": "",
	"esoUnderstaffedNumber": 1,
	"split": [
		{
			"planNumber": 1,
			"esoPlanNumber": 1,
			"strictControlFlag": true,
			"overstaffedRatio": "",
			"overstaffedNumber": "",
			"understaffedRatio": "",
			"understaffedNumber": "",
			"esoOverstaffedRatio": "",
			"esoOverstaffedNumber": "",
			"esoUnderstaffedRatio": "",
			"esoUnderstaffedNumber": "",
			"composizeDimension": [
				{
					"schemaDimensionId": "2201162175124340738",
					"schemaDimensionItemId": "2201162175124340740"
				}
			]
		}
	]
}]

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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	string	否	data 示例：保存成功
traceId	string	否	traceId 示例：5fc8b002898b2ee8
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": "保存成功",
	"traceId": "5fc8b002898b2ee8",
	"uploadable": "0"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

