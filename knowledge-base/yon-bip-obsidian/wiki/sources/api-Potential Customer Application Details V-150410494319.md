---
title: "潜客申请详情查看"
apiId: "1504104943190016002"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Potential Customer Application"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Potential Customer Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 潜客申请详情查看

>  请求方式	GET | Potential Customer Application (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/custpotentialapply/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	潜客申请主键（单据id和单据编码二选一必填，单据id和编码同时存在以id为准。）    示例: 1498927514778075136
code	string	query	否	潜客申请编码（单据id和单据编码二选一必填。）    示例: 20220819420057

## 3. 请求示例

Url: /yonbip/crm/custpotentialapply/getbyid?access_token=访问令牌&id=1498927514778075136&code=20220819420057

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
code	string	否	返回码 示例："200"
message	string	否	返回消息 示例：操作成功
data	object	否	返回数据信息
ower	string	否	申请人ID 示例：1492104460945063943
verifystate	long	否	审批状态；0-开立，1-审核中。2-审核通过 默认：0 示例：1
creator	string	否	创建人名字 示例：李亚苹111
code	string	否	申请编码 示例：20220810120139
masterOrgKeyField	string	否	主组织key字段 示例：org
org	string	否	申请组织ID 示例：1492102983474741250
isWfControlled	boolean	否	是否受审批流控制；true-受控制，false-不受控制 示例：true
saleArea	long	否	申请区域ID 示例：2603899182158592
customerData	object	否	客户数据
dept	string	否	申请部门 示例：1492103387229454336
custName	string	否	客户名称 示例：ASSAP080800004
createTime	string	否	创建时间 示例：2022-08-10 18:58:59
id	long	否	申请ID 示例：1519809388029673472
pubts	string	否	时间戳 示例：2022-08-10 19:01:57
applyTime	string	否	申请时间 示例：2022-07-06 09:41:17

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "操作成功",
	"data": {
		"ower": "1492104460945063943",
		"verifystate": 1,
		"creator": "李亚苹111",
		"code": "20220810120139",
		"masterOrgKeyField": "org",
		"org": "1492102983474741250",
		"isWfControlled": true,
		"saleArea": 2603899182158592,
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
			"licenseType": 0,
			"createOrg_code": "BF01",
			"taxPayingCategories": 0,
			"scope": {
				"zh_CN": ""
			},
			"country_name": "中国大陆",
			"isManager": false,
			"customerAreas": [
				{
					"isDefault": true,
					"hasDefaultInit": true,
					"_id": "rowId_141"
				}
			],
			"enterpriseName": "ASSAP080800004",
			"internalOrg": false,
			"merchantRole": {
				"merchantOptions": "\"false\"",
				"businessRole": ""
			},
			"createOrg": "1492102983474741250",
			"orgName": "ASSAP080800004",
			"address": "北京市海淀区西北旺镇北清路辅路用友",
			"verfyMark": 0,
			"merchantsManager": {
				"countryCode": "86",
				"mobile": "",
				"fullName": "",
				"email": ""
			},
			"shortname": {
				"zh_CN": "ASSAP080800004"
			},
			"retailInvestors": false,
			"scopeModel": 0,
			"enterpriseNature": 0,
			"country_code": "CN",
			"transType": "1490075999453315884",
			"name": {
				"zh_CN": "客户简体中文名字"
			},
			"merchantAppliedDetail": {
				"frozenState": 0,
				"signBack": false,
				"belongOrg_Name": "中联北京分公司",
				"isPotential": true,
				"belongOrg": "1492102983474741250",
				"searchcode": "ASSAP080800004",
				"payway": 0,
				"stopstatus": false
			},
			"creatorOrgName": "中联北京分公司",
			"merchantAgentFinancialInfos": [
				{
					"bankAccount": "123456",
					"bankAccountName": "123456789",
					"country": "0040be98-735b-44c0-afe5-54d11a96037b",
					"currency_name": "港币",
					"jointLineNo": "123123456",
					"_tableDisplayOutlineAll": false,
					"openBank": "中国银行股份有限公司天津昆纬路支行",
					"accountType": "0",
					"_selected": true,
					"isDefault": "\"false\"",
					"hasDefaultInit": true,
					"bank": "0001Z010000000000367",
					"country_name": "中国",
					"bank_name": "中国银行",
					"currency": "\"1474136448078708745\"",
					"_id": "rowId_68",
					"stopstatus": "\"false\"",
					"openBank_name": "中国银行股份有限公司天津昆纬路支行",
					"remarks": "银行信息备注"
				}
			],
			"merchantAgentInvoiceInfos": [
				{
					"bdBillingType_Name": "增值税电子普通发票",
					"remarks": "edcedc",
					"_colErrorField": "bdBillingType_Name",
					"taxNo": "123456",
					"_id": "rowId_352",
					"_isColError": false,
					"bankName_Name": "中国银行股份有限公司洛阳金谷翠庭支行",
					"name": "0001Z010000000000367",
					"receievInvoiceMobile": "159uuuu8888",
					"hasDefaultInit": true,
					"isDefault": "\"true\"",
					"_selected": true,
					"title": "用友网络",
					"receievInvoiceEmail": "xxxx@777.com",
					"bankName": "1003A110000000001OM0",
					"telephone": "138xxxx1111",
					"name_Name": "中国银行",
					"_tableDisplayOutlineAll": false,
					"bdBillingType": "0",
					"bankAccount": "6217 8301 8301 8301",
					"address": {
						"zh_TW": "繁體字地址",
						"en_US": "this is english address",
						"zh_CN": "北京市海淀区北清路"
					}
				}
			],
			"merchantContacterInfos": [
				{
					"qq": "1234589",
					"gender": "1",
					"_tableDisplayOutlineAll": false,
					"mobile": "13899990000",
					"fullName": "彭销售",
					"telePhone": "010-11001100",
					"positionName": "职务",
					"_selected": true,
					"hasDefaultInit": true,
					"isDefault": "\"true\"",
					"weChat": "weichatnum",
					"_id": "rowId_64",
					"email": "sxx@xx.com",
					"remarks": "xss"
				}
			]
		},
		"dept": "1492103387229454336",
		"custName": "ASSAP080800004",
		"createTime": "2022-08-10 18:58:59",
		"id": 1519809388029673472,
		"pubts": "2022-08-10 19:01:57",
		"applyTime": "2022-07-06 09:41:17"
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

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

