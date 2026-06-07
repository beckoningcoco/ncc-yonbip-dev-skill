---
title: "资产报废申请详情查询"
apiId: "2286576370133237765"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Scrap Application"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Scrap Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产报废申请详情查询

>  请求方式	POST | Asset Scrap Application (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/scrapapplycard/detail
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
id	string	否	是	资产报废申请主表主键 示例：2286573509772050436

## 3. 请求示例

Url: /yonbip/am/scrapapplycard/detail?access_token=访问令牌
Body: {
	"id": "2286573509772050436"
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
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pk_recorder	string	否	申请人主键 示例：1976254408781463557
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	string	否	审批状态 示例：0
bill_date	date
格式:yyyy-MM-dd HH:mm:ss	否	拟报废日期 示例：2025-01-09
bill_code	string	否	申请单号 示例：BFSQ202501090001
bizFlow	string	否	流程Id 示例：5df4a2b2-e4f8-49fe-a37c-9940b1f3bef1
pk_org	string	否	资产组织主键 示例：1969341280960380937
apply_date	date
格式:yyyy-MM-dd HH:mm:ss	否	申请日期 示例：2025-01-09
pk_transitype	string	否	交易类型 示例：1969308072258045588
pk_applydept__name	string	否	申请部门 示例：HT租赁一部
bizFlow_version	string	否	版本信息 示例：V1.0
bill_type	string	否	单据类型 示例：4A12
id	string	否	主键 示例：2174902805201420292
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳 示例：2025-04-16 17:28:39
creator__name	string	否	创建人名称 示例：G.tao
isFlowCoreBill	boolean	否	是否流程核心单据 示例：true
tenant	string	否	租户 示例：0000LUOWYQE74EIUBN0000
creator	string	否	创建人主键 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
billmaketime	string	否	制单时间 示例：2025-01-09 11:06:51
sysid	string	否	系统标识 示例：AUM
isWfControlled	boolean	否	是否审批流控制 示例：false
pk_org__name	string	否	资产组织 示例：HT资产组织
pk_transitype__name	string	否	交易类型 示例：资产报废申请
billmaker__name	string	否	制单人 示例：G.tao
bill_status	number
小数位数:0,最大长度:10	否	单据状态：0：开立；1：已审核；2：已关闭；3：审核中 示例：0
pk_applydept	string	否	申请部门主键 示例：1976253781712568326
pk_recorder__name	string	否	申请人 示例：HTRENT
billmaker	string	否	制单人主键 示例：ffde1766-84ad-4059-abd4-7f1a7c451354
transi_type	string	否	交易类型编码 示例：4A12-01
creationtime	string	否	创建时间 示例：2025-01-09 11:06:51
bizFlow_name	string	否	流程名称 示例：资产报废拉取资产报废申请
bodyvos	object	是	子表详细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pk_recorder": "1976254408781463557",
		"returncount": 0,
		"verifystate": "0",
		"bill_date": "2025-01-09",
		"bill_code": "BFSQ202501090001",
		"bizFlow": "5df4a2b2-e4f8-49fe-a37c-9940b1f3bef1",
		"pk_org": "1969341280960380937",
		"apply_date": "2025-01-09",
		"pk_transitype": "1969308072258045588",
		"pk_applydept__name": "HT租赁一部",
		"bizFlow_version": "V1.0",
		"bill_type": "4A12",
		"id": "2174902805201420292",
		"pubts": "2025-04-16 17:28:39",
		"creator__name": "G.tao",
		"isFlowCoreBill": true,
		"tenant": "0000LUOWYQE74EIUBN0000",
		"creator": "ffde1766-84ad-4059-abd4-7f1a7c451354",
		"billmaketime": "2025-01-09 11:06:51",
		"sysid": "AUM",
		"isWfControlled": false,
		"pk_org__name": "HT资产组织",
		"pk_transitype__name": "资产报废申请",
		"billmaker__name": "G.tao",
		"bill_status": 0,
		"pk_applydept": "1976253781712568326",
		"pk_recorder__name": "HTRENT",
		"billmaker": "ffde1766-84ad-4059-abd4-7f1a7c451354",
		"transi_type": "4A12-01",
		"creationtime": "2025-01-09 11:06:51",
		"bizFlow_name": "资产报废拉取资产报废申请",
		"bodyvos": [
			{
				"pk_addreducestyle__name": "出售",
				"pk_currency_fi": "1969308072258043953",
				"pk_ownerorg_equip": "1969341280960380937",
				"pk_ownerorg_equip__name": "HT资产组织",
				"status_date_after": "2025-01-07",
				"pk_ownerunit_equip__name": "HT资产组织",
				"pk_mandept_equip__name": "HT租赁一部",
				"pk_equip__pk_currency_fi__moneyDigit": 2,
				"pk_org": "1969341280960380937",
				"pk_equip__equip_code": "2025010700003",
				"pk_scrap": "2178896343095836677",
				"pk_equip__pk_currency_fi__name": "人民币",
				"pk_ownerunit_equip": "1969341280960380937",
				"pk_mandept_equip": "1976253781712568326",
				"pk_manager_equip": "1976254408781463557",
				"pk_usedorg_equip": "1969341280960380937",
				"pk_currency_fi__name": "人民币",
				"id": "2174902805201420293",
				"pk_status_after": "PRESET01_0000LUOWYQE74EIUBN0000",
				"pubts": "2025-01-14 20:15:20",
				"pk_status_before": "PRESET01_0000LUOWYQE74EIUBN0000",
				"tenant": "0000LUOWYQE74EIUBN0000",
				"pk_usedorg_equip__name": "HT资产组织",
				"status_date_before": "2025-01-07",
				"pk_manager_equip__name": "HTRENT",
				"main_id": "2174902805201420292",
				"pk_equip__pk_currency_fi": "1969308072258043953",
				"pk_user_equip__name": "HTRENT",
				"pk_equip": "2173708391983087621",
				"pk_equip__equip_name": "新交易类型卡片",
				"progress_status": 2,
				"pk_addreducestyle": "1969308072282685829",
				"pk_user_equip": "1976254408781463557",
				"pk_equip__spec": "",
				"pk_equip__model": "",
				"pk_reason__name": "",
				"pk_location_after__location_name": "",
				"scrap_flag": "",
				"pk_scrap__bill_code": "",
				"pk_equip__pk_location__location_name": "",
				"pk_icorg__name": "",
				"pk_warehouse_in__name": "",
				"origin_value": "",
				"accu_dep": "",
				"new_value": "",
				"begin_date": "2026-06-07 13:21:50",
				"service_month": "",
				"pk_usedept_equip__name": "",
				"memo": "",
				"pk_equip__pk_location": "",
				"pk_reason": "",
				"pk_location_after": "",
				"pk_icorg": "",
				"pk_warehouse_in": ""
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
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
999	报错具体提示信息，例如：服务端逻辑异常	查看日志找对应异常服务定位产生原因

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

