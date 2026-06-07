---
title: "潜客申请新增"
apiId: "1493550834125897731"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Potential Customer Application"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Potential Customer Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 潜客申请新增

>  请求方式	POST | Potential Customer Application (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/save/
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
data	object	否	是	数据
systemSource	string	否	是	openapi标识 示例：mt
code	string	否	否	申请编码：自动生成；支持手动修改编码规则 示例：TE20220706KS001928
org	string	否	是	申请人所在申请组织ID 示例：2603872696799488
saleArea	long	否	否	申请人所在销售区域ID 示例：2603899182158592
dept	string	否	否	申请人所在申请部门ID 示例：2603874896122112
ower	string	否	是	申请人员ID 示例：2603881034092800
verifystate	long	否	否	审批状态；0-开立 默认：0 示例：0
_status	string	否	是	单据状态 示例：Insert
applyDesc	string	否	否	申请备注 示例：因xx备注
applyReason	string	否	否	申请原因 示例：因XX原因申请
applyTime	string	否	是	申请日期 示例：2022-08-17
customerData	object	否	是	客户数据

## 3. 请求示例

Url: /yonbip/crm/bill/save/?access_token=访问令牌
Body: {
	"data": {
		"systemSource": "mt",
		"code": "TE20220706KS001928",
		"org": "2603872696799488",
		"saleArea": 2603899182158592,
		"dept": "2603874896122112",
		"ower": "2603881034092800",
		"verifystate": 0,
		"_status": "Insert",
		"applyDesc": "因xx备注",
		"applyReason": "因XX原因申请",
		"applyTime": "2022-08-17",
		"customerData": {
			"merchantAppliedDetail": {
				"belongOrg": "2610934924382464",
				"belongOrg_Name": "集团",
				"searchcode": "KHMC0729",
				"isPotential": true,
				"payway": "99",
				"frozenState": "0",
				"signBack": "false",
				"stopstatus": "false"
			},
			"creatorId": 2610938200532224,
			"transType": "2602714139169033",
			"createOrg": "2610934924382464",
			"transType_Name": "通用客户",
			"verfyMark": 0,
			"creatorOrgName": "集团",
			"createOrg_code": "JT01",
			"code": "000258",
			"name": {
				"zh_CN": "客户名称0729",
				"en_US": "EnglishName",
				"zh_TW": "傳媒"
			},
			"shortname": {
				"zh_CN": "客户名称0729",
				"en_US": "EnglishName",
				"zh_TW": "傳媒"
			},
			"country": "0040be98-735b-44c0-afe5-54d11a96037b",
			"country_name": "中国",
			"retailInvestors": "false",
			"internalOrg": "false",
			"country_code": "CN",
			"taxPayingCategories": "0",
			"enterpriseNature": "0",
			"enterpriseName": "客户名称0729",
			"licenseType": 0,
			"orgName": "客户名称0729",
			"address": {
				"zh_CN": ""
			},
			"scopeModel": "0",
			"scope": {
				"zh_CN": ""
			},
			"merchantRole": {
				"merchantOptions": "false",
				"businessRole": ""
			},
			"merchantsManager": {
				"countryCode": "86",
				"mobile": "18811119999",
				"fullName": "name",
				"email": "xxx@163.com"
			},
			"customerAreas": [
				{
					"isDefault": "\"true\"",
					"hasDefaultInit": true,
					"saleAreaId": "2610946152780032",
					"saleAreaId_name": "北京区",
					"saleAreaId_code": "01",
					"_id": "rowId_267"
				}
			],
			"principals": [
				{
					"isDefault": "true",
					"hasDefaultInit": true,
					"professSalesman": "2610938191843840",
					"professSalesman_Name": "李亚苹",
					"specialManagementDep": "2610936128327936",
					"specialManagementDep_Name": "销管一部",
					"_id": "rowId_266"
				}
			],
			"invoicingCustomerss": [
				{
					"isDefault": "true",
					"hasDefaultInit": true,
					"_id": "rowId_268",
					"_selected": true
				}
			]
		}
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
code	string	否	申请编码 示例：20220817320052
org	string	否	申请组织ID 示例：1492102983474741250
saleArea	long	否	申请区域ID 示例：1449107380019658800
dept	string	否	申请部门ID 示例：1492103387229454336
ower	string	否	申请人员ID 示例：1492104460945063943
verifystate	long	否	审批状态 示例：0
creator	string	否	创建者名字 示例：李亚苹111
createTime	string	否	创建时间 示例：2022-08-17 15:34:03
isWfControlled	boolean	否	是否接受审批流控制 示例：false
applyTime	string	否	申请时间 示例：2022-07-06 09:41:17
systemSource	string	否	openapi标识 示例：huoha
customerData	object	否	客户数据
id	long	否	数据ID 示例：1524899302233079808
custName	string	否	客户姓名 示例：CSSP08080909
custOrganize	string	否	客户所属组织 示例：1440257307824881672
creatorId	long	否	创建者ID 示例：1430789069603340288
createDate	string	否	创建日期 示例：2022-08-17 15:34:03
pubts	string	否	时间戳 示例：2022-08-17 15:34:04
tenant	long	否	租户ID 示例：2699035401424992
yTenantId	string	否	租户ID 示例：0000L11UKCLB3IAEYE0000

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "20220817320052",
		"org": "1492102983474741250",
		"saleArea": 1449107380019658800,
		"dept": "1492103387229454336",
		"ower": "1492104460945063943",
		"verifystate": 0,
		"creator": "李亚苹111",
		"createTime": "2022-08-17 15:34:03",
		"isWfControlled": false,
		"applyTime": "2022-07-06 09:41:17",
		"systemSource": "huoha",
		"customerData": {
			"country": "0040be98-735b-44c0-afe5-54d11a96037b",
			"invoicingCustomerss": [
				{
					"_selected": true,
					"isDefault": "\"true\"",
					"hasDefaultInit": true,
					"_id": "rowId_143"
				}
			],
			"code": "20220830-00021",
			"creatorId": 1492105465985761283,
			"transType_Name": "通用客户",
			"principals": [
				{
					"isDefault": "\"true\"",
					"hasDefaultInit": true,
					"professSalesman": "1492104460945063943",
					"specialManagementDep": "1492103387229454336",
					"professSalesman_Name": "李亚苹",
					"_id": "rowId_142",
					"specialManagementDep_Name": "集团运营部"
				}
			],
			"licenseType": "0",
			"createOrg_code": "BF01",
			"taxPayingCategories": "0",
			"scope": {
				"zh_CN": ""
			},
			"country_name": "中国大陆",
			"customerAreas": [
				{
					"isDefault": "true",
					"hasDefaultInit": true,
					"_id": "rowId_141"
				}
			],
			"enterpriseName": "CSSP08080909",
			"internalOrg": "\"false\"",
			"merchantRole": {
				"merchantOptions": "\"false\"",
				"businessRole": ""
			},
			"createOrg": "1492102983474741250",
			"orgName": "CSSP08080909",
			"address": {
				"zh_CN": ""
			},
			"verfyMark": "0",
			"merchantsManager": {
				"countryCode": "86",
				"mobile": "",
				"fullName": "",
				"email": ""
			},
			"shortname": {
				"zh_CN": "CSSP08080909"
			},
			"retailInvestors": "\"false\"",
			"scopeModel": "0",
			"enterpriseNature": "0",
			"country_code": "CN",
			"transType": "1490075999453315884",
			"name": "CSSP08080909",
			"merchantAppliedDetail": {
				"frozenState": "0",
				"signBack": "\"false\"",
				"belongOrg_Name": "D组织",
				"isPotential": true,
				"belongOrg": "1440257307824881672",
				"searchcode": "CSSP08080909",
				"payway": "99",
				"stopstatus": "\"false\""
			},
			"creatorOrgName": "中联北京分公司"
		},
		"id": 1524899302233079808,
		"custName": "CSSP08080909",
		"custOrganize": "1440257307824881672",
		"creatorId": 1430789069603340288,
		"createDate": "2022-08-17 15:34:03",
		"pubts": "2022-08-17 15:34:04",
		"tenant": 2699035401424992,
		"yTenantId": "0000L11UKCLB3IAEYE0000"
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
999	客户名称【CSSP08080909】已存在,请联系管理人员	更换客户姓名

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 payway
更新
返回参数 (83)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

