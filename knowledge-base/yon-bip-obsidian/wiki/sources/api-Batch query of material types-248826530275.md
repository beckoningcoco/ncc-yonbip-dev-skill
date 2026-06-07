---
title: "id	string	否	物料分类ID 示例：1981167499359027204"
apiId: "2488265302756818951"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "PLM Material Management"
domain: "PLMPDM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, PLM Material Management]
platform_version: "BIP"
source_type: community-api-docs
---

# id	string	否	物料分类ID 示例：1981167499359027204

>  请求方式	POST | PLM Material Management (PLMPDM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/materialClassify/api/v1/detail
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
id	string	否	否	id 示例：2485987655814742023

## 3. 请求示例

Url: /yonbip/RDC/materialClassify/api/v1/detail?access_token=访问令牌
Body: {
	"id": "2485987655814742023"
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
success	boolean	否	成功标志 示例：true
code	string	否	返回码
message	string	否	返回信息
data	object	否	物料分类详情数据
		否	
		否	
cOwnOrgId	string	否	所属组织ID 示例：1980670408412626952
modifier_name	string	否	修改人名称 示例：ycc
code	string	否	物料分类编码 示例：CL-000000014
extend_rule	boolean	否	是否扩展规则 示例：false
modifier	string	否	修改人ID 示例：bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69
defineList	object	是	定义特性列表
lct_id	string	否	生命周期模板ID 示例：1980667075538452566
classifyIdentifier	string	否	分类标识 示例：ycc1
path	string	否	路径 示例：1981167499359027204
modifiedtime	string	否	修改时间 示例：2026-02-25T16:07:19.000+08:00
tRemark	string	否	备注 示例：asd
isInErp	number
小数位数:0,最大长度:1	否	是否在ERP中存在(0-否) 示例：0
cState	string	否	状态 示例：0
cgrRoleAuthList	string	是	角色授权列表
pubts	string	否	发布时间戳 示例：2026-02-25T16:10:17.000+08:00
tenant	string	否	租户 示例：bzot2m5x
creator	string	否	创建人ID 示例：bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69
cCreateOrgId_name	string	否	创建组织名称 示例：test001
defaultValueList	object	是	默认值列表
level	number
小数位数:0,最大长度:10	否	层级 示例：1
bCodeByClassify	string	否	是否按分类编码(0-否) 示例：0
sort	number
小数位数:0,最大长度:10	否	排序号 示例：1
cOwnOrgId_name	string	否	所属组织名称 示例：test001
isEnd	boolean	否	是否末级 示例：true
cCreateOrgId	string	否	创建组织ID 示例：1980670408412626952
supportDisplaySet	boolean	否	是否支持显示设置 示例：true
name	string	否	物料分类名称 示例：yc物料类型-002
lct_id_name	string	否	生命周期模板名称 示例：研发物料-默认模板使用
creator_name	string	否	创建人名称 示例：ycc
creationtime	string	否	创建时间 示例：2024-04-23T10:10:53.000+08:00
_viewmodel	string	否	视图模型
masterOrgKeyField	string	否	主组织关键字段 示例：cOwnOrgId
transTypeKeyField	string	否	事务类型关键字段
canExtendRules	boolean	否	是否可以扩展规则 示例：false
hasDevPart	boolean	否	是否有开发件 示例：true
parent_name	string	否	父节点名称 示例：root

## 5. 正确返回示例

{
	"success": true,
	"code": "",
	"message": "",
	"data": {
		"cOwnOrgId": "1980670408412626952",
		"modifier_name": "ycc",
		"code": "CL-000000014",
		"extend_rule": false,
		"modifier": "bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69",
		"defineList": [
			{
				"cClassifyId_path": "1981167499359027204",
				"name": "aa0429",
				"cClassifyId_name": "yc物料类型-002",
				"id": "2019774934612443143",
				"cClassifyId": "1981167499359027204",
				"cDefine": "devpartDefineCharacter__aa0429",
				"canDelete": true
			}
		],
		"lct_id": "1980667075538452566",
		"classifyIdentifier": "ycc1",
		"path": "1981167499359027204",
		"modifiedtime": "2026-02-25T16:07:19.000+08:00",
		"tRemark": "asd",
		"isInErp": 0,
		"cState": "0",
		"cgrRoleAuthList": [
			""
		],
		"id": "1981167499359027204",
		"pubts": "2026-02-25T16:10:17.000+08:00",
		"tenant": "bzot2m5x",
		"creator": "bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69",
		"cCreateOrgId_name": "test001",
		"defaultValueList": [
			{
				"cgrId": "1981167499359027204",
				"id": "2017636186930544641",
				"filedCode": "selfmade",
				"cgrId_name": "yc物料类型-002",
				"filedValue": "1980667032589828471",
				"filedCode_name": "业务属性",
				"filedValue_name": "自制",
				"filedType": "refer",
				"selfmade_name": "自制",
				"selfmade_name_name": "自制",
				"filedItemName": "selfmade_name",
				"depotId": "1981159725467172866",
				"libCatalogId_name": "物料库1"
			}
		],
		"level": 1,
		"bCodeByClassify": "0",
		"sort": 1,
		"cOwnOrgId_name": "test001",
		"isEnd": true,
		"cCreateOrgId": "1980670408412626952",
		"supportDisplaySet": true,
		"name": "yc物料类型-002",
		"lct_id_name": "研发物料-默认模板使用",
		"creator_name": "ycc",
		"creationtime": "2024-04-23T10:10:53.000+08:00",
		"_viewmodel": "",
		"masterOrgKeyField": "cOwnOrgId",
		"transTypeKeyField": "",
		"canExtendRules": false,
		"hasDevPart": true,
		"parent_name": "root"
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

