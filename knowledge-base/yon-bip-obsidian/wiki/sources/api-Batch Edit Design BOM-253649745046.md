---
title: "ytenant	string	否	租户标识 示例：bzot2m5x"
apiId: "2536497450464575489"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Structure Management"
domain: "PLMPDM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Structure Management]
platform_version: "BIP"
source_type: community-api-docs
---

# ytenant	string	否	租户标识 示例：bzot2m5x

>  请求方式	POST | Product Structure Management (PLMPDM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/current_yonbip_default_sys/RDC/openapi/ebom/v1/editBom
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
billnum	string	否	否	单据编号 示例：bomStructure
data	object	否	否	BOM数据列表
supportConfigBom	number
小数位数:0,最大长度:1	否	否	是否支持配置BOM 示例：0
code	string	否	否	编码 示例：ycc2024090300289
bomType_name	string	否	否	BOM类型名称 示例：EBOM
ownedorg	string	否	否	所属组织ID 示例：1980670408412626952
partId	string	否	否	物料ID 示例：2079988477708468228
lifecycleTemplateId_name	string	否	否	生命周期模板名称 示例：EBOM-默认模板使用
ownedby_name	string	否	否	所属人名称 示例：gxr01
partCode	string	否	否	物料编码 示例：ycc2024090300289
partRevision	string	否	否	物料版本 示例：A
lockedtime	string	否	否	锁定时间 示例：2026-01-29 15:54:25
revisionid	string	否	否	版本ID 示例：1981145749643591687
fromType	number
小数位数:0,最大长度:10	否	否	来源类型 示例：0
versionRuleUseId	string	否	否	版本规则使用ID 示例：2247046204392734728
id	string	否	否	BOM ID 示例：2313909447689240580
ownedorg_name	string	否	否	所属组织名称 示例：test001
ownedby	string	否	否	所属人 示例：1991778301956849668
isConfigBom	number
小数位数:0,最大长度:1	否	否	是否为配置BOM 示例：0
tenant	string	否	否	租户 示例：bzot2m5x
createdorg	string	否	否	创建组织 示例：1980670408412626952
secretLevel_secretCode	string	否	否	密级代码 示例：MM
lifecycleState	string	否	否	生命周期状态 示例：1980667075538452540
createdorg_name	string	否	否	创建组织名称 示例：test001
creator	string	否	否	创建人 示例：6ebd7c9c-b3ac-4785-b105-d1a168050e7d
batchApprovalType	number
小数位数:0,最大长度:10	否	否	批量审批类型 示例：0
secretLevel	string	否	否	密级 示例：2303471036452044803
bomType	string	否	否	BOM类型 示例：1980667032589828457
revision	string	否	否	版本 示例：A
lockedby	string	否	否	锁定人 示例：6ebd7c9c-b3ac-4785-b105-d1a168050e7d
lifecycleState_name	string	否	否	生命周期状态名称 示例：编辑中
name	string	否	否	名称 示例：G20240527A1.1(copy)
editingState	string	否	否	编辑状态 示例：1
secretLevel_secretName	string	否	否	密级名称 示例：秘密
creator_name	string	否	否	创建人名称 示例：gxr01
creationtime	string	否	否	创建时间 示例：2025-07-15 18:15:12
lifecycleTemplateId	string	否	否	生命周期模板ID 示例：1980667075538452567
bomType_code	string	否	否	BOM类型代码 示例：EBOM
batchFlowType	number
小数位数:0,最大长度:10	否	否	批量流程类型 示例：0
revisionorder	number
小数位数:0,最大长度:10	否	否	版本序号 示例：1
masterOrgKeyField	string	否	否	主组织关键字段 示例：ownedorg
transTypeKeyField	string	否	否	事务类型关键字段 示例：bustype
Authorized	boolean	否	否	是否授权 示例：true
Reusable	boolean	否	否	是否可复用 示例：true
Viewable	boolean	否	否	是否可查看 示例：true
Transition	boolean	否	否	是否可流转 示例：true
Editable	boolean	否	否	是否可编辑 示例：true
Deletable	boolean	否	否	是否可删除 示例：true
Published	boolean	否	否	是否已发布 示例：false
bomRevision	string	否	否	BOM版本 示例：A
bomEditingState	string	否	否	BOM编辑状态 示例：1
userDefineChrstc	object	否	否	用户自定义特征
userDefineChrstc__id	string	否	否	用户自定义特征ID 示例：2313909447689240580
_status	string	否	否	状态 示例：Update
ebomDocList	object	是	否	EBOM文档列表

## 3. 请求示例

Url: /current_yonbip_default_sys/RDC/openapi/ebom/v1/editBom?access_token=访问令牌
Body: {
	"billnum": "bomStructure",
	"data": {
		"supportConfigBom": 0,
		"code": "ycc2024090300289",
		"bomType_name": "EBOM",
		"ownedorg": "1980670408412626952",
		"partId": "2079988477708468228",
		"lifecycleTemplateId_name": "EBOM-默认模板使用",
		"ownedby_name": "gxr01",
		"partCode": "ycc2024090300289",
		"partRevision": "A",
		"lockedtime": "2026-01-29 15:54:25",
		"revisionid": "1981145749643591687",
		"fromType": 0,
		"versionRuleUseId": "2247046204392734728",
		"id": "2313909447689240580",
		"ownedorg_name": "test001",
		"ownedby": "1991778301956849668",
		"isConfigBom": 0,
		"tenant": "bzot2m5x",
		"createdorg": "1980670408412626952",
		"secretLevel_secretCode": "MM",
		"lifecycleState": "1980667075538452540",
		"createdorg_name": "test001",
		"creator": "6ebd7c9c-b3ac-4785-b105-d1a168050e7d",
		"batchApprovalType": 0,
		"secretLevel": "2303471036452044803",
		"bomType": "1980667032589828457",
		"revision": "A",
		"lockedby": "6ebd7c9c-b3ac-4785-b105-d1a168050e7d",
		"lifecycleState_name": "编辑中",
		"name": "G20240527A1.1(copy)",
		"editingState": "1",
		"secretLevel_secretName": "秘密",
		"creator_name": "gxr01",
		"creationtime": "2025-07-15 18:15:12",
		"lifecycleTemplateId": "1980667075538452567",
		"bomType_code": "EBOM",
		"batchFlowType": 0,
		"revisionorder": 1,
		"masterOrgKeyField": "ownedorg",
		"transTypeKeyField": "bustype",
		"Authorized": true,
		"Reusable": true,
		"Viewable": true,
		"Transition": true,
		"Editable": true,
		"Deletable": true,
		"Published": false,
		"bomRevision": "A",
		"bomEditingState": "1",
		"userDefineChrstc": {
			"id": "2313909447689240580"
		},
		"userDefineChrstc__id": "2313909447689240580",
		"_status": "Update",
		"ebomDocList": [
			{}
		]
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	number
小数位数:2,最大长度:10	否	返回码，调用成功时返回200 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	否	BOM数据列表
		否	
		否	
success	boolean	否	操作是否成功 示例：true
ownedorg	string	否	所属组织ID 示例：1980670408412626952
masterOrgKeyField	string	否	主组织关键字段 示例：ownedorg
modifier	string	否	修改人 示例：6ebd7c9c-b3ac-4785-b105-d1a168050e7d
partRevision	string	否	物料版本 示例：A
BomLinkList	object	是	BOM关联列表
revisionid	string	否	版本ID 示例：1981145749643591687
Reusable	boolean	否	是否可复用 示例：true
id	string	否	BOM ID 示例：2313909447689240580
ownedorg_name	string	否	所属组织名称 示例：test001
ownedby	string	否	所属人 示例：1991778301956849668
tenant	string	否	租户ID 示例：bzot2m5x
lifecycleState	string	否	生命周期状态 示例：1980667075538452540
createdorg_name	string	否	创建组织名称 示例：test001
bomEditingState	string	否	BOM编辑状态 示例：1
batchApprovalType	number
小数位数:0,最大长度:10	否	批量审批类型 示例：0
secretLevel	string	否	密级 示例：2303471036452044803
bomType	string	否	BOM类型 示例：1980667032589828457
revision	string	否	版本号 示例：A
userDefineChrstc__id	string	否	用户自定义特性ID 示例：2313909447689240580
lockedby	string	否	锁定人 示例：6ebd7c9c-b3ac-4785-b105-d1a168050e7d
lifecycleState_name	string	否	生命周期状态名称 示例：编辑中
ebomDocList	object	是	EBOM文档列表
name	string	否	BOM名称 示例：G20240527A1.1(copy)
editingState	string	否	编辑状态 示例：1
Viewable	boolean	否	是否可查看 示例：true
secretLevel_secretName	string	否	密级名称 示例：秘密
Deletable	boolean	否	是否可删除 示例：true
creationtime	string	否	创建时间 示例：2025-07-15 18:15:12
lifecycleTemplateId	string	否	生命周期模板ID 示例：1980667075538452567
bomType_code	string	否	BOM类型编码 示例：EBOM
revisionorder	number
小数位数:0,最大长度:10	否	版本顺序 示例：1
supportConfigBom	number
小数位数:0,最大长度:10	否	是否支持配置BOM 示例：0
code	string	否	BOM编码 示例：ycc2024090300289
bomType_name	string	否	BOM类型名称 示例：EBOM
partId	string	否	物料ID 示例：2079988477708468228
lifecycleTemplateId_name	string	否	生命周期模板名称 示例：EBOM-默认模板使用
ownedby_name	string	否	所属人名称 示例：gxr01
partCode	string	否	物料编码 示例：ycc2024090300289
lockedtime	string	否	锁定时间 示例：2026-01-29 15:54:25
modifiedtime	string	否	修改时间 示例：2026-01-29 15:54:53
fromType	number
小数位数:0,最大长度:10	否	来源类型 示例：0
Editable	boolean	否	是否可编辑 示例：true
versionRuleUseId	string	否	版本规则使用ID 示例：2247046204392734728
isConfigBom	number
小数位数:0,最大长度:10	否	是否为配置BOM 示例：0
createdorg	string	否	创建组织 示例：1980670408412626952
secretLevel_secretCode	string	否	密级编码 示例：MM
creator	string	否	创建人 示例：6ebd7c9c-b3ac-4785-b105-d1a168050e7d
Authorized	boolean	否	是否已授权 示例：true
transTypeKeyField	string	否	事务类型关键字段 示例：bustype
bomRevision	string	否	BOM版本 示例：A
userDefineChrstc	object	否	用户自定义特性
Transition	boolean	否	是否可流转 示例：true
Published	boolean	否	是否已发布 示例：false
creator_name	string	否	创建人名称 示例：gxr01
batchFlowType	number
小数位数:0,最大长度:10	否	批量流程类型 示例：0
pubts	string	否	发布时间戳 示例：2026-01-29 15:57:23
traceId	string	否	追踪ID 示例：0266f395aa8963b2
uploadable	string	否	是否可上传 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"success": true,
		"ownedorg": "1980670408412626952",
		"masterOrgKeyField": "ownedorg",
		"modifier": "6ebd7c9c-b3ac-4785-b105-d1a168050e7d",
		"partRevision": "A",
		"BomLinkList": [
			{}
		],
		"revisionid": "1981145749643591687",
		"Reusable": true,
		"id": "2313909447689240580",
		"ownedorg_name": "test001",
		"ownedby": "1991778301956849668",
		"tenant": "bzot2m5x",
		"lifecycleState": "1980667075538452540",
		"createdorg_name": "test001",
		"bomEditingState": "1",
		"batchApprovalType": 0,
		"secretLevel": "2303471036452044803",
		"bomType": "1980667032589828457",
		"revision": "A",
		"userDefineChrstc__id": "2313909447689240580",
		"lockedby": "6ebd7c9c-b3ac-4785-b105-d1a168050e7d",
		"lifecycleState_name": "编辑中",
		"ebomDocList": [
			{}
		],
		"name": "G20240527A1.1(copy)",
		"editingState": "1",
		"Viewable": true,
		"secretLevel_secretName": "秘密",
		"Deletable": true,
		"creationtime": "2025-07-15 18:15:12",
		"lifecycleTemplateId": "1980667075538452567",
		"bomType_code": "EBOM",
		"revisionorder": 1,
		"supportConfigBom": 0,
		"code": "ycc2024090300289",
		"bomType_name": "EBOM",
		"partId": "2079988477708468228",
		"lifecycleTemplateId_name": "EBOM-默认模板使用",
		"ownedby_name": "gxr01",
		"partCode": "ycc2024090300289",
		"lockedtime": "2026-01-29 15:54:25",
		"modifiedtime": "2026-01-29 15:54:53",
		"fromType": 0,
		"Editable": true,
		"versionRuleUseId": "2247046204392734728",
		"isConfigBom": 0,
		"createdorg": "1980670408412626952",
		"secretLevel_secretCode": "MM",
		"creator": "6ebd7c9c-b3ac-4785-b105-d1a168050e7d",
		"Authorized": true,
		"transTypeKeyField": "bustype",
		"bomRevision": "A",
		"userDefineChrstc": {
			"id": "2313909447689240580",
			"ytenant": "bzot2m5x"
		},
		"Transition": true,
		"Published": false,
		"creator_name": "gxr01",
		"batchFlowType": 0,
		"ytenant": "bzot2m5x",
		"pubts": "2026-01-29 15:57:23"
	},
	"traceId": "0266f395aa8963b2",
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
0	未传入优惠券档案id	coupon_id值填写有误
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

