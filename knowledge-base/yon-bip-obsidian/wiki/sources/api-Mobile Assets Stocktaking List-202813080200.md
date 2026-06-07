---
title: "移动资产盘点单列表"
apiId: "2028130802001772547"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Stocktaking Sheet"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Stocktaking Sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 移动资产盘点单列表

>  请求方式	POST | Stocktaking Sheet (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/auminventorymobilecard/query
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
userid	string	query	是	用户id
isDetail	string	query	是	是否获取列表详情数据 true 获取 false 不获取    示例: true    默认值: true
Body参数
名称	类型	数组	必填	描述
condition	object	否	否	查询条件
simpleVOs	object	是	否	扩展查询条件
page	object	否	否	page
pageSize	number
小数位数:0,最大长度:10	否	否	pageSize 示例：20
pageIndex	number
小数位数:0,最大长度:10	否	否	pageIndex 示例：1
totalCount	number
小数位数:0,最大长度:10	否	否	totalCount 示例：-1

## 3. 请求示例

Url: /yonbip/am/auminventorymobilecard/query?access_token=访问令牌&userid=&isDetail=true
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "属性名 组织:pk_org 子表: 盘点人 bodyvos.pk_inventory_person",
				"op": "eq",
				"value1": "1795733282705375232"
			}
		]
	},
	"page": {
		"pageSize": 20,
		"pageIndex": 1,
		"totalCount": -1
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功！
data	object	否	data
pageIndex	number
小数位数:0,最大长度:10	否	pageIndex 示例：1
pageSize	number
小数位数:0,最大长度:10	否	pageSize 示例：1000
recordCount	number
小数位数:0,最大长度:10	否	recordCount 示例：3
recordList	object	是	recordList
sumRecordList	string	否	sumRecordList
data	object	否	data
viewmodel	string	否	viewmodel
viewApplication	string	否	viewApplication
querySchema	string	否	querySchema
name	string	否	name
staticReportName	string	否	staticReportName
groupSchemaId	string	否	groupSchemaId
pageCount	number
小数位数:0,最大长度:10	否	pageCount 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：1
pubts	string	否	pubts
tablename	string	否	tablename
errorDetail	string	否	errorDetail

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 1000,
		"recordCount": 3,
		"recordList": [
			{
				"pk_group": "666666",
				"returncount": 0,
				"verifystate": 0,
				"inventory_standard": 1,
				"bill_code": "ZCPD202404240001",
				"modifier": "707f7ad7-bdb5-4b4d-88a6-77663ac387aa",
				"send_msg_flag": false,
				"userDefines__LIKUNTEST003": false,
				"dr": 0,
				"pk_org": "1795612044357009415",
				"pk_transitype": "1785361014001239588",
				"modifiedtime": "2024-04-24 15:57:01",
				"userDefines": {
					"LIKUNTEST003": false,
					"ytenant": "0000LKUKLMA0B7RHFL0000",
					"id": "1982044608920554806",
					"dr": 0
				},
				"inventory_way": 8,
				"orgvos": [
					{
						"inventory_org": "1795612044357009415",
						"inventory_org_name": "likun-OrgName-All\u200d",
						"main_id": "1982044608920551429"
					}
				],
				"bill_type": "4A35",
				"id": "1982044608920551429",
				"pubts": "2024-04-24 15:57:10",
				"creator__name": "李坤",
				"tenant": "0000LKUKLMA0B7RHFL0000",
				"start_date": "2024-04-24",
				"userDefines__id": "1982044608920554806",
				"creator": "707f7ad7-bdb5-4b4d-88a6-77663ac387aa",
				"billmaketime": "2024-04-24 14:32:41",
				"sysid": "AUM",
				"isWfControlled": false,
				"inventory_mode": 1,
				"pk_org__name": "likun-OrgName-All",
				"pk_transitype__name": "资产盘点",
				"pk_planer": "1795729735062388736",
				"org_type": "0",
				"billmaker__name": "李坤",
				"bill_status": 0,
				"swab_flag": false,
				"pk_planer__name": "李坤-员工-01[Myself]",
				"modifier__name": "李坤",
				"billmaker": "707f7ad7-bdb5-4b4d-88a6-77663ac387aa",
				"send_msg_flag_m": false,
				"categoryvos": "",
				"transi_type": "4A35-01",
				"publish_flag": true,
				"inventory_type": 1,
				"creationtime": "2024-04-24 14:32:41",
				"inventory_range": "资产组织:likun-OrgName-All \n盘点开始日期:2024-04-24 \n盘点组织范围:likun-OrgName-All\u200d,\u200dhxx-组织\u200d,\u200dWUHF资产组织\u200d,\u200dWUHF库存组织 \n盘点组织类型:资产管理组织",
				"bodyvos": [
					{
						"pk_group": "666666",
						"snap_flag": false,
						"pk_ownerunit__name": "WUHF纳税主体",
						"send_msg_flag": false,
						"userDefines__LIKUNTEST003": false,
						"inventory_person": "李坤-员工-01[Myself]",
						"dr": 0,
						"pk_org": "1785995191672897543",
						"pk_used_status_before__status_name": "在用",
						"equip_code": "EAM-DAILY20240123000419",
						"inventory_way": "0",
						"verfi_flag": 0,
						"epc": "450001913653963448123409",
						"inventory_result": 0,
						"id": "1982044608920551434",
						"tenant": "0000LKUKLMA0B7RHFL0000",
						"pk_equip__pk_ownerorg": "1785995191672897543",
						"userDefines__id": "1982044608920551435",
						"entry_time": "2024-04-24 15:57:10",
						"pk_mandept_after": "1786013548383567874",
						"pk_org__name": "WUHF资产组织",
						"equip_name": {
							"zh_TW": "",
							"en_US": "",
							"zh_CN": "2646266"
						},
						"pk_used_status_after": "PRESET01_0000LKUKLMA0B7RHFL0000",
						"pk_mandept_before": "1786013548383567874",
						"send_msg_flag_m": false,
						"pk_inventory_person__code": "李坤-员工-01[Myself]",
						"pk_equip_innercode": "00W6CZ1F",
						"pk_inventory_person": "1795729735062388736",
						"pk_usedorg": "1785995191672897543",
						"settled_flag": true,
						"inventory_date": "2024-04-24",
						"pk_ownerorg": "1785995191672897543",
						"userDefines": {
							"LIKUNTEST003": false,
							"ytenant": "0000LKUKLMA0B7RHFL0000",
							"id": "1982044608920551435",
							"dr": 0
						},
						"pk_used_status_after__status_name": "在用",
						"pk_equip__pk_org": "1785995191672897543",
						"pk_used_status_before": "PRESET01_0000LKUKLMA0B7RHFL0000",
						"pk_mandept_before__name": "WUHF资产管理部门A",
						"pubts": "2024-04-24 15:57:10",
						"pk_ownerunit": "1785998034941247491",
						"pk_category__category_name": "2342342",
						"rowno": "1",
						"pk_mandept_after__name": "WUHF资产管理部门A",
						"pk_usedorg__name": "WUHF资产组织",
						"pk_equip__pk_usedorg": "1785995191672897543",
						"pk_equip__status_date": "2024-01-23",
						"inventory_verfiresult": 0,
						"main_id": "1982044608920551429",
						"pk_category": "1788195597936754694",
						"pk_ownerorg__name": "WUHF资产组织",
						"inventory_flag": true,
						"entry_method": "4",
						"pk_equip": "1913653963448123410",
						"pk_equip__equip_name": "2646266"
					}
				]
			}
		],
		"sumRecordList": "",
		"data": {
			"1122-4": {
				"split_type": "{@}",
				"code": "equip_code{@}bar_code"
			},
			"011": {
				"split_type": "{@}",
				"code": "equip_code{@}bar_code{@}pk_used_status__status_name"
			},
			"1122-3": {
				"split_type": "{@}",
				"code": "equip_name{@}equip_code"
			},
			"01": {
				"split_type": "{@}",
				"code": "equip_code"
			},
			"1122-2": {
				"split_type": "{@}",
				"code": "equip_code{@}equip_name"
			},
			"1122-1": {
				"split_type": "{@}",
				"code": "bar_code"
			},
			"LIKUNTEST20231122001": {
				"split_type": "{@}",
				"code": "equip_code{@}bar_code{@}equip_name"
			},
			"0-001": {
				"split_type": "{@}",
				"code": "bar_code{@}equip_code"
			},
			"TEST001": {
				"split_type": "{@}",
				"code": "equip_code{@}bar_code{@}pk_org__name"
			}
		},
		"viewmodel": "",
		"viewApplication": "",
		"querySchema": "",
		"name": "",
		"staticReportName": "",
		"groupSchemaId": "",
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"pubts": "",
		"tablename": ""
	},
	"errorDetail": ""
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
999	输入的长度不能超过40位	

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

