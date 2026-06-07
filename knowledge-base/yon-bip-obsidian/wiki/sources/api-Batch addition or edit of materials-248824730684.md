---
title: "新增编辑物料"
apiId: "2488247306843848705"
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

# 新增编辑物料

>  请求方式	POST | PLM Material Management (PLMPDM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/RDC/openapi/devpart/v1/singleSave
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
billnum	string	否	是	单据号/业务类型标识 示例：cbe4ccff-33e5-4efb-a690-220b1c202886
data	object	否	是	请求数据对象(JSON字符串)
ownedorg_name	string	否	是	所属组织名称 示例：智石开
owneddept	string	否	是	所属部门ID 示例：2220177369731170309
owneddept_name	string	否	是	所属部门名称 示例：研发部
ownedorg	string	否	是	所属组织ID
createdorg_name	string	否	是	创建组织名称 示例：智石开
createdorg	string	否	是	创建组织ID 示例：2220177129213001738
ownedby_name	string	否	是	所属人名称 示例：曾祥吉
ownedby	string	否	是	所属人ID 示例：2226090852509810689
revisionid	string	否	是	版本ID 示例：2424265307880685572
code	string	否	是	物料编码 示例：0304002
name	string	否	是	物料名称 示例：test0304002
partclassid_name	string	否	是	物料分类名称 示例：aaa
partclassid	string	否	是	物料分类ID 示例：2226091539703529472
revision	string	否	是	版本 示例：A1
path	string	否	是	路径 示例：2226091539703529472
revisionorder	number
小数位数:0,最大长度:10	否	是	版本顺序 示例：1
lifecyclestate_name	string	否	是	生命周期状态名称 示例：编制中
assistUnit_name	string	否	否	辅助单位名称
lifecycletempid_name	string	否	是	生命周期模板名称 示例：aaa研发物料-默认模板使用
assistUnitCount	number
小数位数:2,最大长度:10	否	是	辅助单位数量 示例：1 默认值：1
mainUnitCount	number
小数位数:2,最大长度:10	否	是	主单位数量 示例：1 默认值：1
lifecyclestate	string	否	是	生命周期状态ID 示例：2220176175725019151
stateid	string	否	是	状态ID 示例：2220175591609466885
lifecycletempid	string	否	是	生命周期模板ID 示例：2226088266930061314
editingstate	number
小数位数:0,最大长度:1	否	是	编辑状态(1-编辑中) 示例：1 默认值：0
isInErp	string	否	是	是否在ERP中存在(0-否) 示例：0 默认值：0
material	string	否	否	材料 示例：AA
unit_name	string	否	是	单位名称 示例：kg
selfmade_name	string	否	是	自制/采购类型名称 示例：自制
unit	string	否	是	单位ID 示例：2226089435165884421
selfmade	string	否	是	自制/采购类型ID 示例：2432610059976441880
verifystate	number
小数位数:0,最大长度:1	否	是	验证状态(0-未验证) 示例：0 默认值：0
weight	number
小数位数:2,最大长度:10	否	否	重量 示例：0 默认值：0
weightunit_name	string	否	否	重量单位名称 示例：kg
weightunit	string	否	否	重量单位ID 示例：2226089435165884421
model	string	否	否	型号 示例：PSC
figureNo	string	否	否	图号 示例：A
sourceType	number
小数位数:0,最大长度:1	否	是	来源类型(0-新建) 示例：0 默认值：0
keypart	string	否	否	关键件
estimatedCost	string	否	否	预估成本 示例：0 默认值：0
sellingCost	string	否	否	销售成本 示例：0 默认值：0
sch_id	string	否	是	方案ID 示例：2226092733696049152
classifyIdentifier	string	否	是	分类标识 示例：CL-00000001
tenant	string	否	是	租户 示例：0000M83WSZBR8XWUM90000
remark	string	否	否	备注 示例：测试
devpartDefineCharacter	object	否	否	开发件定义特性对象
versionRuleUseId	string	否	是	版本规则使用ID 示例：2424265917766041604
PartLinkLibList	object	是	否	物料关联库列表
_status	string	否	是	操作状态(Insert-新增) 示例：Insert
resubmitCheckKey	string	否	是	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
libId	string	否	否	库ID
libCatalogId	string	否	否	库目录ID
ownedProject	string	否	否	所属项目
ownedProduct	string	否	否	所属产品
ownedOrg	string	否	否	所属组织ID
id	string	否	否	ID

## 3. 请求示例

Url: /yonbip/RDC/openapi/devpart/v1/singleSave?access_token=访问令牌
Body: {
	"billnum": "cbe4ccff-33e5-4efb-a690-220b1c202886",
	"data": {
		"ownedorg_name": "智石开",
		"owneddept": "2220177369731170309",
		"owneddept_name": "研发部",
		"ownedorg": "",
		"createdorg_name": "智石开",
		"createdorg": "2220177129213001738",
		"ownedby_name": "曾祥吉",
		"ownedby": "2226090852509810689",
		"revisionid": "2424265307880685572",
		"code": "0304002",
		"name": "test0304002",
		"partclassid_name": "aaa",
		"partclassid": "2226091539703529472",
		"revision": "A1",
		"path": "2226091539703529472",
		"revisionorder": 1,
		"lifecyclestate_name": "编制中",
		"assistUnit_name": "",
		"lifecycletempid_name": "aaa研发物料-默认模板使用",
		"assistUnitCount": 1,
		"mainUnitCount": 1,
		"lifecyclestate": "2220176175725019151",
		"stateid": "2220175591609466885",
		"lifecycletempid": "2226088266930061314",
		"editingstate": 1,
		"isInErp": "0",
		"material": "AA",
		"unit_name": "kg",
		"selfmade_name": "自制",
		"unit": "2226089435165884421",
		"selfmade": "2432610059976441880",
		"verifystate": 0,
		"weight": 0,
		"weightunit_name": "kg",
		"weightunit": "2226089435165884421",
		"model": "PSC",
		"figureNo": "A",
		"sourceType": 0,
		"keypart": "",
		"estimatedCost": "0",
		"sellingCost": "0",
		"sch_id": "2226092733696049152",
		"classifyIdentifier": "CL-00000001",
		"tenant": "0000M83WSZBR8XWUM90000",
		"remark": "测试",
		"devpartDefineCharacter": {},
		"versionRuleUseId": "2424265917766041604",
		"PartLinkLibList": [
			{
				"creator": "d324f53b-b775-4626-9f24-a6b094c2e2aa",
				"libId": "2226091041478934535",
				"code": "depot-000001",
				"partId": "2485987655814742023",
				"depotType": "2220176132775346180",
				"libCatalogPath": "物料库",
				"name": "aaa",
				"libCatalogId": "2226091290587037696",
				"creator_name": "曾祥吉",
				"__isFillPathName": true,
				"creationtime": "2025-03-19 10:30:03",
				"pubts": "2025-03-19 10:30:03",
				"depotType_name": "",
				"hasDefaultInit": true,
				"_id": "rowId_96",
				"_status": "Insert",
				"ttt_id": "rowId_96",
				"id": ""
			}
		],
		"_status": "Insert",
		"resubmitCheckKey": "pbmDevPart_add_08f925ab-0ed5-447d-94fc-c63a9d15b00a",
		"libId": "",
		"libCatalogId": "",
		"ownedProject": "",
		"ownedProduct": "",
		"ownedOrg": "",
		"id": ""
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
success	boolean	否	成功标志 示例：true
code	string	否	返回码 示例：200
message	string	否	返回信息
data	string	否	物料详情数据 示例：研发物料保存成功

## 5. 正确返回示例

{
	"success": true,
	"code": "200",
	"message": "",
	"data": "研发物料保存成功"
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

