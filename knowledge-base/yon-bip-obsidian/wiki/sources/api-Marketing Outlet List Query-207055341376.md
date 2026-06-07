---
title: "营销网点列表查询"
apiId: "2070553413761368072"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Terminal Outlets"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Terminal Outlets]
platform_version: "BIP"
source_type: community-api-docs
---

# 营销网点列表查询

>  请求方式	POST | Terminal Outlets (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/MarketingTerminal/list
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
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:4	否	是	每页行数 示例：10 默认值：10
storeKey	string	否	否	终端 示例：00001-1
stop	string	否	否	启用状态 示例：0
labelMatchMethod	string	否	否	标签匹配方式 示例：0
simpleVOs	object	是	否	查询条件
field	string	否	否	可作为查询条件的参数如：1:createTime(创建时间),2:modifyTime(修改时间) 示例：terminalType
op	string	否	否	逻辑符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空） 示例：like
value1	string	否	否	查询条件值1 示例：4

## 3. 请求示例

Url: /yonbip/crm/MarketingTerminal/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"storeKey": "00001-1",
	"stop": "0",
	"labelMatchMethod": "0",
	"simpleVOs": [
		{
			"field": "terminalType",
			"op": "like",
			"value1": "4"
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
code	number
小数位数:0,最大长度:10	否	返回编码(200:成功，其他：失败) 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据信息
recordList	object	是	记录集合

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"recordList": [
			{
				"channelCustomer": 0,
				"modifier": "昵称-郝娟",
				"relatedPerson_person": "1687250053844434954",
				"terminalCategory_name": "B分类",
				"modifyTime": "2024-05-29 16:44:44",
				"chainSystem_name": "日常连锁",
				"relatedPerson_saleOrg_rp_name": "集团",
				"storeDefineCharacter__CRM6801": "1690392784486793216",
				"contact": "意义",
				"mnemonic": "WD010",
				"id": "1686614012135997448",
				"relatedPerson_store": "1686614012135997448",
				"longitude": 113.074332,
				"storeDefineCharacter__CRM009": "81b52a98-6fba-438e-8385-7e07cf58b380",
				"storeDefineCharacter__id": "1795628133314985988",
				"relatedPerson_id": "1899822519496998912",
				"relatedPerson_pubts": "2024-01-04 19:40:50",
				"crmContactPhone": "13512341234",
				"storeDefineCharacter__CRM004": false,
				"relatedPerson_saleOrg": "1686561321477734406",
				"storeDefineCharacter": {
					"CRM009": "81b52a98-6fba-438e-8385-7e07cf58b380",
					"CRM6801": "1690392784486793216",
					"ytenant": "0000LFHZ398A0HRH1D0000",
					"crm0014": "0",
					"crm02": 200,
					"crm03": "1685227373350879266",
					"crm03_name": "未说明的婚姻状况",
					"CRM010": "1d96e79f-dd76-403d-9a73-25af5ccd422f",
					"CRM005": "2024-01-12 00:00:00",
					"CRM004": false,
					"CRM6801_name": "IT",
					"crm0011": 10,
					"id": "1795628133314985988"
				},
				"storeDefineCharacter__CRM005": "2024-01-12 00:00:00",
				"storeDefineCharacter__crmshiq": "1685227373350879266",
				"terminalType": "4",
				"chainSystem": "1707319808959709189",
				"stop": 0,
				"storeDefineCharacter__CRM010": "1d96e79f-dd76-403d-9a73-25af5ccd422f",
				"name": "网点010",
				"code": "2024052710000048",
				"relatedPerson_person_name": "张大龙",
				"deliveryMethod": "circle",
				"storeDefineCharacter__crm03_name": "未说明的婚姻状况",
				"latitude": 23.166909,
				"kmradius": 5,
				"socialCreditCode": "广东中成化工有限公司（档案于03年12月24日迁移到省工商局）",
				"regionCode": "440605000000",
				"crmContact": "刘思思",
				"relatedPerson_ower": false,
				"storeDefineCharacter__CRM6801_name": "IT",
				"startTime": "10:00:00",
				"cust_name": "伙伴52901",
				"pubts": "2024-08-06 12:10:18",
				"org_name": "集团",
				"storeArea": 10,
				"creator": "营销测试管理员",
				"address": "佛山市-南海区-科技西路恒大翡翠华庭10座20号铺派多格宠物(狮山店)",
				"org": "1686561321477734406",
				"storeDefineCharacter__crm03": "1685227373350879266",
				"storeDefineCharacter__crm02": 200,
				"latestFollowUpTime": "2024-06-21 10:24:51",
				"storeDefineCharacter__crm0014": "0",
				"terminalCategory": "1882564078195441670",
				"createTime": "2023-03-23 13:01:54",
				"storeDefineCharacter__crm0011": 10,
				"doorPhoto": "313952e1-b620-48bd-890f-6360bc370a85",
				"certificateOfBusiness": "41581dd1-e09b-4b7d-a9da-c5ec58690b49",
				"codebianma": "00001-1",
				"contactPhone": "17788990011",
				"cust": "1736440314277134338"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

