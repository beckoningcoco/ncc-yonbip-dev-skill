---
title: "管理部门变动详情查询"
apiId: "2063700578679652360"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Change"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 管理部门变动详情查询

>  请求方式	POST | Asset Change (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/mandeptAlter/batchdetail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	管理部门变动主表主键 示例：2063751164805513223

## 3. 请求示例

Url: /yonbip/am/mandeptAlter/batchdetail?access_token=访问令牌
Body: {
	"id": "2063751164805513223"
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
_realtype	string	否	_realtype
_entityName	string	否	_entityName
_keyName	string	否	_keyName
pk_recorder	string	否	pk_recorder 示例：1795744148972634112
returncount	number
小数位数:0,最大长度:10	否	returncount 示例：0
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
bill_date	string	否	bill_date 示例：2024-08-12
bill_code	string	否	bill_code 示例：ZCBD202408120003
pk_org	string	否	pk_org 示例：1795743032269602824
pk_transitype	string	否	pk_transitype 示例：1785361014001239567
userDefines	object	否	userDefines
_entityName	string	否	_entityName
_keyName	string	否	_keyName
ytenant	string	否	ytenant 示例：0000LKUKLMA0B7RHFL0000
id	string	否	id 示例：2063751164805513230
dr	number
小数位数:0,最大长度:10	否	dr 示例：0
_status	string	否	_status
alterinfo	string	否	alterinfo 示例：pk_mandept,pk_manager,pk_costcenter_manage,pk_profitcenter_manage,pk_location
bill_type	string	否	bill_type 示例：4A07
id	string	否	id 示例：2063751164805513223
pubts	string	否	pubts 示例：2024-08-12 16:44:17
creator__name	string	否	creator__name 示例：昵称-白璇
tenant	string	否	tenant 示例：0000LKUKLMA0B7RHFL0000
userDefines__id	string	否	userDefines__id 示例：2063751164805513230
creator	string	否	creator 示例：d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44
push_status	number
小数位数:0,最大长度:10	否	push_status 示例：0
billmaketime	string	否	billmaketime 示例：2024-08-12 16:44:16
sysid	string	否	sysid 示例：AUM
isWfControlled	boolean	否	isWfControlled 示例：false
pk_org__name	string	否	pk_org__name 示例：bx-维修组织
pk_transitype__name	string	否	pk_transitype__name 示例：管理部门变动
billmaker__name	string	否	billmaker__name 示例：昵称-白璇
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：0
pk_recorder__name	string	否	pk_recorder__name 示例：白璇
billmaker	string	否	billmaker 示例：d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44
transi_type	string	否	transi_type 示例：4A07-01
creationtime	string	否	creationtime 示例：2024-08-12 16:44:16
bodyvos	object	是	bodyvos
_realtype	string	否	_realtype
_entityName	string	否	_entityName
_keyName	string	否	_keyName
rowno	string	否	rowno 示例：10
pk_equip__pk_usedorg	string	否	pk_equip__pk_usedorg 示例：1795743032269602824
pk_equip__pk_usedorg__name	string	否	pk_equip__pk_usedorg__name 示例：bx-维修组织
main_id	string	否	main_id 示例：2063751164805513223
pk_org	string	否	pk_org 示例：1795743032269602824
pk_equip__equip_code	string	否	pk_equip__equip_code 示例：EAM-DAILY20240612000006
pk_equip	string	否	pk_equip 示例：2018441871184363561
pk_equip__equip_name	string	否	pk_equip__equip_name 示例：独立柜机空调
id	string	否	id 示例：2063751164805513224
pubts	string	否	pubts 示例：2024-08-12 16:44:17
tenant	string	否	tenant 示例：0000LKUKLMA0B7RHFL0000
pk_equip__pk_ownerorg	string	否	pk_equip__pk_ownerorg 示例：1795743032269602824
pk_equip__pk_ownerorg__name	string	否	pk_equip__pk_ownerorg__name 示例：bx-维修组织
_status	string	否	_status
pk_mandept_before	string	否	pk_mandept_before 示例：1795733798091489285
pk_mandept_after	string	否	pk_mandept_after 示例：1795743238428033032
pk_manager_before	string	否	pk_manager_before
pk_manager_after	string	否	pk_manager_after
pk_location_before	string	否	pk_location_before
pk_location_after	string	否	pk_location_after
pk_mandept_after__name	string	否	pk_mandept_after__name 示例：移动部门
pk_equip__materialFree	object	否	pk_equip__materialFree
pk_equip__used_dept_follow_user	boolean	否	pk_equip__used_dept_follow_user 示例：false
pk_equip__bill_type	string	否	pk_equip__bill_type 示例：4A00
pk_equip__pk_transitype	string	否	pk_equip__pk_transitype 示例：1785361014001238106
pk_mandept_before__name	string	否	pk_mandept_before__name 示例：营销部门
_convert_bodyvos	string	否	_convert_bodyvos
masterOrgKeyField	string	否	masterOrgKeyField 示例：pk_org
transTypeKeyField	string	否	transTypeKeyField 示例：pk_transitype
_status	string	否	_status
alterinfo__name	string	否	alterinfo__name 示例：管理部门,管理人,位置
alterinfo_name	string	否	alterinfo_name 示例：管理部门,管理人,位置
alterinfo__name_pivotal	string	否	alterinfo__name_pivotal 示例：管理部门,管理人,位置
pk_recorder__dept_id	string	否	pk_recorder__dept_id 示例：1795743410228297734
pk_org__finorgid	string	否	pk_org__finorgid 示例：1795743032269602824

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"_realtype": "",
		"_entityName": "",
		"_keyName": "",
		"pk_recorder": "1795744148972634112",
		"returncount": 0,
		"verifystate": 0,
		"bill_date": "2024-08-12",
		"bill_code": "ZCBD202408120003",
		"pk_org": "1795743032269602824",
		"pk_transitype": "1785361014001239567",
		"userDefines": {
			"_entityName": "",
			"_keyName": "",
			"ytenant": "0000LKUKLMA0B7RHFL0000",
			"id": "2063751164805513230",
			"dr": 0,
			"_status": ""
		},
		"alterinfo": "pk_mandept,pk_manager,pk_costcenter_manage,pk_profitcenter_manage,pk_location",
		"bill_type": "4A07",
		"id": "2063751164805513223",
		"pubts": "2024-08-12 16:44:17",
		"creator__name": "昵称-白璇",
		"tenant": "0000LKUKLMA0B7RHFL0000",
		"userDefines__id": "2063751164805513230",
		"creator": "d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44",
		"push_status": 0,
		"billmaketime": "2024-08-12 16:44:16",
		"sysid": "AUM",
		"isWfControlled": false,
		"pk_org__name": "bx-维修组织",
		"pk_transitype__name": "管理部门变动",
		"billmaker__name": "昵称-白璇",
		"bill_status": 0,
		"pk_recorder__name": "白璇",
		"billmaker": "d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44",
		"transi_type": "4A07-01",
		"creationtime": "2024-08-12 16:44:16",
		"bodyvos": [
			{
				"_realtype": "",
				"_entityName": "",
				"_keyName": "",
				"rowno": "10",
				"pk_equip__pk_usedorg": "1795743032269602824",
				"pk_equip__pk_usedorg__name": "bx-维修组织",
				"main_id": "2063751164805513223",
				"pk_org": "1795743032269602824",
				"pk_equip__equip_code": "EAM-DAILY20240612000006",
				"pk_equip": "2018441871184363561",
				"pk_equip__equip_name": "独立柜机空调",
				"id": "2063751164805513224",
				"pubts": "2024-08-12 16:44:17",
				"tenant": "0000LKUKLMA0B7RHFL0000",
				"pk_equip__pk_ownerorg": "1795743032269602824",
				"pk_equip__pk_ownerorg__name": "bx-维修组织",
				"_status": "",
				"pk_mandept_before": "1795733798091489285",
				"pk_mandept_after": "1795743238428033032",
				"pk_manager_before": "",
				"pk_manager_after": "",
				"pk_location_before": "",
				"pk_location_after": "",
				"pk_mandept_after__name": "移动部门",
				"pk_equip__materialFree": {
					"ytenant": "0000LKUKLMA0B7RHFL0000",
					"id": "2018441871184363563",
					"dr": 0
				},
				"pk_equip__used_dept_follow_user": false,
				"pk_equip__bill_type": "4A00",
				"pk_equip__pk_transitype": "1785361014001238106",
				"pk_mandept_before__name": "营销部门"
			}
		],
		"_convert_bodyvos": "",
		"masterOrgKeyField": "pk_org",
		"transTypeKeyField": "pk_transitype",
		"_status": "",
		"alterinfo__name": "管理部门,管理人,位置",
		"alterinfo_name": "管理部门,管理人,位置",
		"alterinfo__name_pivotal": "管理部门,管理人,位置",
		"pk_recorder__dept_id": "1795743410228297734",
		"pk_org__finorgid": "1795743032269602824"
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
	1	2025-07-01	
更新
请求说明
新增
请求参数 id
删除
请求参数 data
删除
请求参数 id
修改发布地址

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

