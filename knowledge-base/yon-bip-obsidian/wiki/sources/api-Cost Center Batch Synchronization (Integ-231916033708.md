---
title: "成本中心批量同步（集成流）"
apiId: "2319160337081303042"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Center"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本中心批量同步（集成流）

>  请求方式	POST | Cost Center (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/FCC/costcenter/bill/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
key	string	否	否	来源系统的唯一主键 默认值：objid
billnum	string	否	否	billnum 示例：bd_costcenter_new 默认值：bd_costcenter_new
data	object	是	否	data
id	string	否	否	id 示例：1942720343614423041
code	string	否	否	code 示例：JCCSCBZX1
name	object	否	否	name
relatedAdminOrg_name	string	否	否	relatedAdminOrg_name
ccClass	string	否	否	ccClass 示例：1939062405859377516
parent	string	否	否	parent
parent_code	string	否	否	parent_code
parent_name	string	否	否	parent_name
ccClass_code	string	否	否	ccClass_code 示例：1
ccClass_name	string	否	否	ccClass_name 示例：基本生产
manager_code	string	否	否	manager_code
manager_name	string	否	否	manager_name
enableDate	string	否	否	enableDate 示例：2022-01-01 00:00:00
expireDate	string	否	否	expireDate 示例：9999-12-31 00:00:00
effect	boolean	否	否	effect 示例：true
isDefault	boolean	否	否	isDefault 示例：true
shareAccentity	boolean	否	否	shareAccentity 示例：false
description	object	否	否	description
accentity	string	否	否	accentity 示例：2023628911757754375
accentity_code	string	否	否	accentity_code 示例：ZXCF
accentity_name	string	否	否	accentity_name 示例：专项拆分
orgUnit	string	否	否	orgUnit 示例：2023628911757754375
orgUnit_code	string	否	否	orgUnit_code 示例：ZXCF
orgUnit_name	string	否	否	orgUnit_name 示例：专项拆分
pubts	string	否	否	pubts 示例：2025-07-04 15:45:02
creatorId_name	string	否	否	creatorId_name 示例：史丁云
createTime	string	否	否	createTime 示例：2024-03-02 14:53:34
createDate	string	否	否	createDate 示例：2024-03-02 00:00:00
modifierId_name	string	否	否	modifierId_name 示例：王武武武
modifyTime	string	否	否	modifyTime 示例：2025-07-04 15:45:02
modifyDate	string	否	否	modifyDate 示例：2025-07-04 00:00:00
relations	object	是	否	relations
dis	object	是	否	dis
_status	string	否	否	_status 示例：Update
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
objid	string	否	否	来源系统的唯一主键 默认值：111111

## 3. 请求示例

Url: /yonbip/FCC/costcenter/bill/save?access_token=访问令牌
Body: {
	"key": "",
	"billnum": "bd_costcenter_new",
	"data": [
		{
			"id": "1942720343614423041",
			"code": "JCCSCBZX1",
			"name": {
				"zh_CN": "JCCSCBZX1"
			},
			"relatedAdminOrg_name": "",
			"ccClass": "1939062405859377516",
			"parent": "",
			"parent_code": "",
			"parent_name": "",
			"ccClass_code": "1",
			"ccClass_name": "基本生产",
			"manager_code": "",
			"manager_name": "",
			"enableDate": "2022-01-01 00:00:00",
			"expireDate": "9999-12-31 00:00:00",
			"effect": true,
			"isDefault": true,
			"shareAccentity": false,
			"description": {},
			"accentity": "2023628911757754375",
			"accentity_code": "ZXCF",
			"accentity_name": "专项拆分",
			"orgUnit": "2023628911757754375",
			"orgUnit_code": "ZXCF",
			"orgUnit_name": "专项拆分",
			"pubts": "2025-07-04 15:45:02",
			"creatorId_name": "史丁云",
			"createTime": "2024-03-02 14:53:34",
			"createDate": "2024-03-02 00:00:00",
			"modifierId_name": "王武武武",
			"modifyTime": "2025-07-04 15:45:02",
			"modifyDate": "2025-07-04 00:00:00",
			"relations": [
				{
					"defaultCostcenter": false,
					"dept_code": "ZX-011",
					"org": "1977455273141338122",
					"dept_name": "车间1",
					"dept": "1977455831493378048",
					"isDefault": "true",
					"effect": true,
					"header": "1978195338946150408",
					"id": "1978195338946150409",
					"pubts": "2025-06-14 13:39:16",
					"org_name": "专项成本专用（勿动！！)",
					"org_code": "ZX-01",
					"_id": "rowId_53",
					"workCenter_code": "053001",
					"workCenter": "2008672349572825088",
					"workCenter_name": "能源工作中心",
					"_tableDisplayOutlineAll": false,
					"_status": "Update",
					"objid": ""
				}
			],
			"dis": [
				{
					"enableDate": "2024-10-01 00:00:00",
					"accPurpose_name": "利润中心核算目的",
					"profitCenter_name": "对内01",
					"header": "1942720343614423041",
					"profitCenter": "2037567283226214406",
					"id": "2305668169871130627",
					"accPurpose_code": "02",
					"profitCenter_code": "DN01",
					"accPurpose": "1939062405859377461",
					"_id": "rowId_21",
					"_status": "Unchanged",
					"objid": ""
				}
			],
			"_status": "Update",
			"resubmitCheckKey": "bd_costcenter_new_edit_6ff4103b-7199-4899-8843-0b8eea77487b",
			"objid": ""
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	是	data
id	string	否	id 示例：1942720343614423041
code	string	否	code 示例：JCCSCBZX1
name	object	否	name
ccClass	string	否	ccClass 示例：1939062405859377516
ccClass_code	string	否	ccClass_code 示例：1
ccClass_name	string	否	ccClass_name 示例：基本生产
enableDate	string	否	enableDate 示例：2022-01-01 00:00:00
expireDate	string	否	expireDate 示例：9999-12-31 00:00:00
effect	boolean	否	effect 示例：true
isDefault	boolean	否	isDefault 示例：true
shareAccentity	boolean	否	shareAccentity 示例：false
description	object	否	description
accentity	string	否	accentity 示例：2023628911757754375
accentity_code	string	否	accentity_code 示例：ZXCF
accentity_name	string	否	accentity_name 示例：专项拆分
orgUnit	string	否	orgUnit 示例：2023628911757754375
orgUnit_code	string	否	orgUnit_code 示例：ZXCF
orgUnit_name	string	否	orgUnit_name 示例：专项拆分
pubts	string	否	pubts 示例：2025-07-22 20:00:23
character	object	否	character
character__id	string	否	character__id 示例：2305668169871130629
dis	object	是	dis
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
modifier	string	否	modifier 示例：王武武武
modifierId	string	否	modifierId 示例：1939601484397150212
modifyTime	string	否	modifyTime 示例：2025-07-22 20:00:23
modifyDate	string	否	modifyDate 示例：2025-07-22 20:00:23
tenant	number
小数位数:0,最大长度:16	否	tenant 示例：3698466162301312
ytenant	string	否	ytenant 示例：0000LT2ON7R546TLHP0000
tenantId	string	否	tenantId 示例：0000LT2ON7R546TLHP0000
userId	string	否	userId 示例：dec03755-9565-4474-a1b4-099401a767ac
creatorId	string	否	creatorId 示例：1942700337666719745
modifierId_name	string	否	modifierId_name 示例：王武武武
creatorId_name	string	否	creatorId_name 示例：史丁云
traceId	string	否	traceId 示例：e44a39ccd48b3398
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"id": "1942720343614423041",
			"code": "JCCSCBZX1",
			"name": {
				"zh_CN": "JCCSCBZX1"
			},
			"ccClass": "1939062405859377516",
			"ccClass_code": "1",
			"ccClass_name": "基本生产",
			"enableDate": "2022-01-01 00:00:00",
			"expireDate": "9999-12-31 00:00:00",
			"effect": true,
			"isDefault": true,
			"shareAccentity": false,
			"description": {},
			"accentity": "2023628911757754375",
			"accentity_code": "ZXCF",
			"accentity_name": "专项拆分",
			"orgUnit": "2023628911757754375",
			"orgUnit_code": "ZXCF",
			"orgUnit_name": "专项拆分",
			"pubts": "2025-07-22 20:00:23",
			"character": {
				"id": "2305668169871130629",
				"tenant": 3698466162301312,
				"ytenant": "0000LT2ON7R546TLHP0000"
			},
			"character__id": "2305668169871130629",
			"dis": [
				{
					"enableDate": "2024-10-01 00:00:00",
					"accPurpose_name": "利润中心核算目的",
					"profitCenter_name": "对内01",
					"header": "1942720343614423041",
					"profitCenter": "2037567283226214406",
					"id": "2305668169871130627",
					"accPurpose_code": "02",
					"profitCenter_code": "DN01",
					"accPurpose": "1939062405859377461",
					"modifyTime": "2025-07-22 20:00:23",
					"modifyDate": "2025-07-22 00:00:00",
					"modifier": "王武武武",
					"tenant": 3698466162301312,
					"ytenant": "0000LT2ON7R546TLHP0000"
				}
			],
			"resubmitCheckKey": "bd_costcenter_new_edit_6ff4103b-7199-4899-8843-0b8eea77487b",
			"modifier": "王武武武",
			"modifierId": "1939601484397150212",
			"modifyTime": "2025-07-22 20:00:23",
			"modifyDate": "2025-07-22 20:00:23",
			"tenant": 3698466162301312,
			"ytenant": "0000LT2ON7R546TLHP0000",
			"tenantId": "0000LT2ON7R546TLHP0000",
			"userId": "dec03755-9565-4474-a1b4-099401a767ac",
			"creatorId": "1942700337666719745",
			"modifierId_name": "王武武武",
			"creatorId_name": "史丁云"
		}
	],
	"traceId": "e44a39ccd48b3398",
	"uploadable": "0"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
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

