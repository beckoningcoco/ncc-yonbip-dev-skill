---
title: "固定资产卡片维护详情查询"
apiId: "6f49bc8809b04dfeba2d8a084621a513"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Assets"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Assets]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产卡片维护详情查询

>  请求方式	GET | Fixed Assets (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/fi/fixedassetsinfo/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	固定资产ID

## 3. 请求示例

Url: /yonbip/fi/fixedassetsinfo/detail?access_token=访问令牌&id=

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
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
data	object	否	调用成功时的返回固定资产数据
accentity	string	否	会计主体id
accpurpose	string	否	核算目的id
creator	string	否	创建人
createTime	string	否	创建时间
modifier	string	否	修改人
modifyTime	string	否	修改时间
usagestate_stateDepre	string	否	资产状态折旧状态
accpurpose_name	string	否	核算目的名称
id	string	否	卡片主表关联标识
accentity_code	string	否	会计主体编码
accentity_name	string	否	会计主体名称
code	string	否	固定资产编码
assetcode	string	否	卡片编码
name	muti_lang	否	固定资产名称,支持多语
specification	muti_lang	否	规格型号,支持多语
category	string	否	固定资产类别id
category_code	string	否	固定资产类别编码
category_name	string	否	固定资产类别名称
category_isEnd	string	否	固定资产类别是否末级
addway	string	否	增加方式id
addway_name	string	否	增加方式名称
usagestate	string	否	使用状态id
usagestate_name	string	否	使用状态名称
usedepredept	string	否	使用部门id
moredepartment	string	否	是否多部门使用, true:是、false:否、
usedepredept_code	string	否	使用部门编码
usedepredept_name	string	否	使用部门名称
managedepredept	string	否	管理部门id
managedepredept_code	string	否	管理部门编码
managedepredept_name	string	否	管理部门名称
project	string	否	项目id
project_code	string	否	项目编码
project_name	string	否	项目名称
location	muti_lang	否	存放地点,支持多语
begintime	string	否	开始使用时间
pubts	string	否	时间戳
fixedstatus	string	否	卡片状态, 1:正常、2:处置、
custodian	string	否	保管人id
custodian_code	string	否	保管人编码
custodian_name	string	否	保管人名称
user	string	否	使用人id
user_code	string	否	使用人编码
user_name	string	否	使用人名称
createassetdate	string	否	建卡日期
status	string	否	单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、
amount	int	否	数量
categoryParentId	string	否	资产类别一级节点id
creator	string	否	创建人
isWfControlled	string	否	是否审批流控制, true:是、false:否、
verifystate	string	否	审批状态, 0:未审核、1:已审核、2:已关闭、3:审核中、
returncount	int	否	退回次数
tradetype	string	否	交易类型
calid	string	否	固定资产ID
bodies	object	是	核算信息
devices	object	是	附属设备
costrecords	object	是	费用记录
departments	object	是	多部门使用
disposalbills	object	是	处置记录
depreciationrecords	object	是	折旧记录
impairmentrecords	object	是	减值记录
changebillrecords	object	是	变动记录

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"accentity": "",
		"accpurpose": "",
		"creator": "",
		"createTime": "",
		"modifier": "",
		"modifyTime": "",
		"usagestate_stateDepre": "",
		"accpurpose_name": "",
		"id": "",
		"accentity_code": "",
		"accentity_name": "",
		"code": "",
		"assetcode": "",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"specification": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"category": "",
		"category_code": "",
		"category_name": "",
		"category_isEnd": "",
		"addway": "",
		"addway_name": "",
		"usagestate": "",
		"usagestate_name": "",
		"usedepredept": "",
		"moredepartment": "",
		"usedepredept_code": "",
		"usedepredept_name": "",
		"managedepredept": "",
		"managedepredept_code": "",
		"managedepredept_name": "",
		"project": "",
		"project_code": "",
		"project_name": "",
		"location": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"begintime": "",
		"pubts": "",
		"fixedstatus": "",
		"custodian": "",
		"custodian_code": "",
		"custodian_name": "",
		"user": "",
		"user_code": "",
		"user_name": "",
		"createassetdate": "",
		"status": "",
		"amount": 0,
		"categoryParentId": "",
		"isWfControlled": "",
		"verifystate": "",
		"returncount": 0,
		"tradetype": "",
		"calid": "",
		"bodies": [
			{
				"method_isDepreciation": "",
				"period": "",
				"fixedassetsinfo": "",
				"fcoriginalvalue": 0,
				"scrapvalue": 0,
				"scrapvaluerate": 0,
				"netamount": 0,
				"netvalue": 0,
				"depreciationmethod": "",
				"depreciationmethod_name": "",
				"depreciationMethodPath": "",
				"lifemonth": 0,
				"extractedperiod": 0,
				"currency": "",
				"currency_name": "",
				"natCurrency": "",
				"natCurrency_name": "",
				"natCurrency_priceDigit": "",
				"exchangeRateType": "",
				"exchangeRateType_name": "",
				"exchangeRateType_code": "",
				"exchangeRateType_digit": "",
				"natCurrency_moneyDigit": "",
				"exchangerate": 0,
				"accruedoriginalvalue": 0,
				"depreciation": 0,
				"monthdepreciationrate": 0,
				"monthdepreciationvalue": 0,
				"sumyeardeprevalue": "",
				"id": "",
				"pubts": "",
				"impairment": 0,
				"addedtax": 0,
				"taxrate": 0,
				"currency_moneyDigit": "",
				"totalworkload": 0,
				"existingworkload": 0,
				"monthworkload": 0,
				"residualworkload": 0,
				"unitdepreciation": 0,
				"workloadunit": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"initflag": "",
				"voucherstatus": "",
				"auditstatus": "",
				"auditor": "",
				"auditTime": "",
				"depreciationstatus": "",
				"monthdepreciation": "",
				"busiaccbook": "",
				"busiaccbook_code": "",
				"busiaccbook_name": ""
			}
		],
		"devices": [
			{
				"fixedassetsinfo": "",
				"deivcecode": "",
				"name": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"model": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"measuringunit": "",
				"measuringunit_code": "",
				"measuringunit_name": "",
				"amount": 0,
				"value": 0,
				"usedate": "",
				"usage": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"changedate": "",
				"comment": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"changereason": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"id": ""
			}
		],
		"costrecords": [
			{
				"fixedassetsinfo": "",
				"occurdate": "",
				"balanceproject": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"digest": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"money": 0,
				"remark": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"id": ""
			}
		],
		"departments": [
			{
				"id": "",
				"fixedassetsinfo": "",
				"department": "",
				"department_code": "",
				"department_name": "",
				"proportion": 0,
				"departmentname": "",
				"remark": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				}
			}
		],
		"disposalbills": [
			{
				"code": "",
				"period": "",
				"pubts": "",
				"id": "",
				"reduceway": "",
				"cleanreason": "",
				"createTime": "",
				"modifyTime": "",
				"creator": "",
				"currency_priceDigit": "",
				"currency_moneyDigit": "",
				"currency_name": "",
				"modifier": "",
				"cleanincome": 0,
				"valueaddedtax": 0,
				"cleancost": 0,
				"auditstatus": "",
				"reducedate": "",
				"audit_date": "",
				"description": ""
			}
		],
		"depreciationrecords": [
			{
				"periodcode": "",
				"id": "",
				"accruedoriginalvalue": 0,
				"monthdepreciationvalue": 0,
				"monthdepreciationrate": 0,
				"unitdepreciation": 0,
				"depreciation": 0,
				"yeardepreciation": 0,
				"natCurrency": "",
				"natCurrency_name": "",
				"natCurrency_priceDigit": "",
				"natCurrency_moneyDigit": "",
				"fixedassetsinfo": ""
			}
		],
		"impairmentrecords": [
			{
				"code": "",
				"totalaccrued": 0,
				"currency_priceDigit": "",
				"currency_moneyDigit": "",
				"currency_name": ""
			}
		],
		"changebillrecords": [
			{
				"changebillno": "",
				"changetype": "",
				"changetype_name": "",
				"befchange": "",
				"aftchange": "",
				"changedate": "",
				"changereason": "",
				"reffullname": "",
				"refdomain": "",
				"changetypecode": "",
				"fixedassetsinfo": "",
				"id": ""
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
200	操作成功	固定资产卡片维护详情查询无错误码，只会出现查询时data为空。

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 id
更新
返回参数 (195)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

