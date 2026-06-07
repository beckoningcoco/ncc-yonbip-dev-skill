---
title: "versionRuleUseId	string	否	版本规则使用ID 示例：1981146462608162819"
apiId: "2485317323104714757"
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

# versionRuleUseId	string	否	版本规则使用ID 示例：1981146462608162819

>  请求方式	POST | PLM Material Management (PLMPDM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/openapi/devpart/v1/detail
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
id	string	否	否	id

## 3. 请求示例

Url: /yonbip/RDC/openapi/devpart/v1/detail?access_token=访问令牌
Body: {
	"id": ""
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
data	object	否	物料详情数据
ownedorg	string	否	所属组织ID 示例：1980670408412626952
partclassid	string	否	物料分类ID 示例：1981161452045074437
devpartDefineCharacter	object	否	开发件定义特性对象
stateid	string	否	状态ID 示例：1980667032588779557
lifecyclestate_name	string	否	生命周期状态名称 示例：编制中
newest_flag	boolean	否	是否最新标志 示例：true
devpartDefineCharacter__id	string	否	开发件定义特性内部ID 示例：2454066951923695627
revisionid	string	否	版本ID 示例：1981145749643591687
path	string	否	路径 示例：1981161452045074437
lifecyclestate_code	string	否	生命周期状态编码 示例：Planning
id	string	否	物料ID 示例：2454066951923695625
ownedorg_name	string	否	所属组织名称 示例：test001
ownedby	string	否	所属人ID 示例：1980670880874233864
tenant	string	否	租户 示例：bzot2m5x
createdorg_name	string	否	创建组织名称 示例：test001
lifecycletempid	string	否	生命周期模板ID 示例：1980667075538452566
owneddept	string	否	所属部门ID 示例：1980670605981122561
isWfControlled	number
小数位数:0,最大长度:1	否	是否工作流控制(0-否) 示例：0
secretLimit_name	string	否	密级限制名称 示例：****
weight	number
小数位数:2,最大长度:10	否	重量 示例：0.00
secretLevel	string	否	密级ID 示例：2303450034061967361
revision	string	否	版本 示例：****
unit_name	string	否	单位名称 示例：kg
unit	string	否	单位ID 示例：1981178314063085575
sourceType	number
小数位数:0,最大长度:1	否	来源类型 示例：0
name	string	否	物料名称 示例：xjx中试配方3
secretLevel_secretName	string	否	密级名称 示例：****
creationtime	string	否	创建时间 示例：2026-01-20T14:36:34.000+08:00
owneddept_name	string	否	所属部门名称 示例：测试部门
revisionorder	number
小数位数:0,最大长度:10	否	版本顺序 示例：1
verifystate	number
小数位数:0,最大长度:1	否	验证状态 示例：0
code	string	否	物料编码 示例：ycc2026012000003
sch_id	string	否	方案ID 示例：1981159218661031938
edition	number
小数位数:0,最大长度:10	否	版次 示例：1
ownedby_name	string	否	所属人名称 示例：ycc
lifecyclestate	string	否	生命周期状态ID 示例：1980667075538452537
partclassid_name	string	否	物料分类名称 示例：yc物料类型-001
pubts	string	否	发布时间戳 示例：2026-01-20T14:36:34.000+08:00
editingstate	number
小数位数:0,最大长度:1	否	编辑状态 示例：0
PartLinkLibList	object	是	物料关联库列表
createdorg	string	否	创建组织ID 示例：1980670408412626952
secretLevel_secretCode	string	否	密级编码 示例：****
creator	string	否	创建人ID 示例：bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69
materialType	string	否	物料类型(dev-开发件) 示例：dev
apply_status	string	否	申请状态 示例：4
selfmade_name	string	否	自制/采购类型名称 示例：自制
partclassid_code	string	否	物料分类编码 示例：CL-00000002
selfmade	string	否	自制/采购类型ID 示例：1980667032589828471
creator_name	string	否	创建人名称 示例：ycc
lifecycletempid_name	string	否	生命周期模板名称 示例：研发物料-默认模板使用
_viewmodel	string	否	视图模型
masterOrgKeyField	string	否	主组织关键字段 示例：ownedorg
transTypeKeyField	string	否	事务类型关键字段 示例：bustype
wfId	string	否	工作流ID
materielVersionList	object	是	物料版本列表
materielLinkDocList	object	是	物料关联文档列表
materielSubPartList	object	是	物料子件列表
BaseLineTbl	object	是	基线表
defineCodeList	object	是	定义编码列表
EncryptAttrGrant	boolean	否	加密属性授权 示例：true
CatalogueEditable	boolean	否	目录是否可编辑 示例：true
Authorized	boolean	否	是否已授权 示例：true
Reusable	boolean	否	是否可重用 示例：true
Revisable	boolean	否	是否可修订 示例：true
Transition	boolean	否	是否可转换 示例：true
Viewable	boolean	否	是否可查看 示例：true
Editable	boolean	否	是否可编辑 示例：true
Published	boolean	否	是否已发布 示例：true
Deletable	boolean	否	是否可删除 示例：true
Syncable	boolean	否	是否可同步 示例：false
canUnLock	boolean	否	是否可以解锁 示例：false
canDetail	boolean	否	是否可以查看详情 示例：true
canEdit	boolean	否	是否可以编辑 示例：true
canEditLib	boolean	否	是否可以编辑库 示例：true
canChange	boolean	否	是否可以变更 示例：true
originalCanEdit	boolean	否	原始是否可编辑 示例：true
canPublish	boolean	否	是否可以发布 示例：true
canDelete	boolean	否	是否可以删除 示例：true
canLock	boolean	否	是否可以锁定 示例：true
isDevPartDup	boolean	否	是否为开发件副本 示例：true
canJumpToPartApply	boolean	否	是否可以跳转到物料申请 示例：false
canReUse	boolean	否	是否可以重用 示例：true
canJump	boolean	否	是否可以跳转 示例：true
canGive	boolean	否	是否可以给予 示例：true
docInitRevision	boolean	否	文档初始修订 示例：false
docNewRevision	boolean	否	文档新建修订 示例：true
PartLinkManList	object	是	物料关联人员列表
PartLinkFactoryCodeList	object	是	物料关联工厂编码列表
materialHistoryRecList	object	是	物料历史记录列表
partLinkProcessList	object	是	物料关联流程列表
partLinkEcoInfoList	object	是	物料关联ECO信息列表

## 5. 正确返回示例

{
	"success": true,
	"code": "",
	"message": "",
	"data": {
		"ownedorg": "1980670408412626952",
		"partclassid": "1981161452045074437",
		"devpartDefineCharacter": {
			"ytenant": "bzot2m5x",
			"id": "2454066951923695627",
			"pubts": "2026-01-20T14:38:53.000+08:00",
			"dr": 0
		},
		"stateid": "1980667032588779557",
		"lifecyclestate_name": "编制中",
		"newest_flag": true,
		"devpartDefineCharacter__id": "2454066951923695627",
		"revisionid": "1981145749643591687",
		"path": "1981161452045074437",
		"lifecyclestate_code": "Planning",
		"id": "2454066951923695625",
		"ownedorg_name": "test001",
		"ownedby": "1980670880874233864",
		"tenant": "bzot2m5x",
		"createdorg_name": "test001",
		"lifecycletempid": "1980667075538452566",
		"owneddept": "1980670605981122561",
		"isWfControlled": 0,
		"secretLimit_name": "****",
		"weight": 0,
		"secretLevel": "2303450034061967361",
		"revision": "****",
		"unit_name": "kg",
		"unit": "1981178314063085575",
		"sourceType": 0,
		"name": "xjx中试配方3",
		"secretLevel_secretName": "****",
		"creationtime": "2026-01-20T14:36:34.000+08:00",
		"owneddept_name": "测试部门",
		"revisionorder": 1,
		"verifystate": 0,
		"code": "ycc2026012000003",
		"sch_id": "1981159218661031938",
		"edition": 1,
		"ownedby_name": "ycc",
		"lifecyclestate": "1980667075538452537",
		"partclassid_name": "yc物料类型-001",
		"versionRuleUseId": "1981146462608162819",
		"pubts": "2026-01-20T14:36:34.000+08:00",
		"editingstate": 0,
		"PartLinkLibList": [
			{
				"creator": "bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69",
				"libId": "1981159725467172866",
				"code": "depot-000002",
				"partId": "2454066951923695625",
				"depotType": "1980667032588779615",
				"libCatalogPath": "物料库1",
				"name": "yctest库",
				"libCatalogId": "1981160000345079813",
				"creator_name": "ycc",
				"__isFillPathName": true,
				"id": "2454066951923695626",
				"creationtime": "2026-01-20T14:36:34.000+08:00",
				"pubts": "2026-01-20T14:38:53.000+08:00",
				"depotType_name": "组织库"
			}
		],
		"createdorg": "1980670408412626952",
		"secretLevel_secretCode": "****",
		"creator": "bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69",
		"materialType": "dev",
		"apply_status": "4",
		"selfmade_name": "自制",
		"partclassid_code": "CL-00000002",
		"selfmade": "1980667032589828471",
		"creator_name": "ycc",
		"lifecycletempid_name": "研发物料-默认模板使用",
		"_viewmodel": "",
		"masterOrgKeyField": "ownedorg",
		"transTypeKeyField": "bustype",
		"wfId": "",
		"materielVersionList": [
			{}
		],
		"materielLinkDocList": [
			{}
		],
		"materielSubPartList": [
			{}
		],
		"BaseLineTbl": [
			{}
		],
		"defineCodeList": [
			{}
		],
		"EncryptAttrGrant": true,
		"CatalogueEditable": true,
		"Authorized": true,
		"Reusable": true,
		"Revisable": true,
		"Transition": true,
		"Viewable": true,
		"Editable": true,
		"Published": true,
		"Deletable": true,
		"Syncable": false,
		"canUnLock": false,
		"canDetail": true,
		"canEdit": true,
		"canEditLib": true,
		"canChange": true,
		"originalCanEdit": true,
		"canPublish": true,
		"canDelete": true,
		"canLock": true,
		"isDevPartDup": true,
		"canJumpToPartApply": false,
		"canReUse": true,
		"canJump": true,
		"canGive": true,
		"docInitRevision": false,
		"docNewRevision": true,
		"PartLinkManList": [
			{}
		],
		"PartLinkFactoryCodeList": [
			{}
		],
		"materialHistoryRecList": [
			{
				"hisOpera": "新增",
				"hisOperaContent": "",
				"hisOperaTime": "2026-01-20T14:36:34.000+08:00",
				"hisUser": "bbbccde0-06a4-4af3-b7f0-eb5a44cdbf69"
			}
		],
		"partLinkProcessList": [
			{}
		],
		"partLinkEcoInfoList": [
			{}
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

