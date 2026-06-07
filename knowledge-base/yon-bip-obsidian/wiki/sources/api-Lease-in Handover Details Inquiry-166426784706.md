---
title: "租入申请保存"
apiId: "1664267847067500545"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-in Handover"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-in Handover]
platform_version: "BIP"
source_type: community-api-docs
---

# 租入申请保存

>  请求方式	POST | Lease-in Handover (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/limrentinapplycard/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	租入申请主表
pk_org	string	否	是	承租组织id或编码 示例：1710477846884909056
transi_type	string	否	否	交易类型编码 示例：4A3L-01 默认值：4A3L-01
pk_transitype	string	否	是	交易类型id或编码 示例：1706009534684726516
pk_applier	string	否	是	申请人id或编码 示例：1710478241997783050
pk_applydept	string	否	是	申请部门id或编码 示例：1710478035863470086
pk_calandar	date
格式:yyyy-MM-dd	否	否	申请日期 示例：2024-11-25
rent_use	string	否	否	租赁用途 示例：我是租赁用途嗯呢
memo	string	否	否	备注 示例：我是备注嗯呢
pk_fiorg	string	否	是	会计主体id或编码 示例：1710477846884909056
pk_currency	string	否	否	币种id或编码 示例：1706009534709369343
bodyvos	object	是	否	租入申请表体
_status	string	否	否	主表状态 默认值：Insert

## 3. 请求示例

Url: /yonbip/am/limrentinapplycard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_org": "1710477846884909056",
			"transi_type": "4A3L-01",
			"pk_transitype": "1706009534684726516",
			"pk_applier": "1710478241997783050",
			"pk_applydept": "1710478035863470086",
			"pk_calandar": "2024-11-25",
			"rent_use": "我是租赁用途嗯呢",
			"memo": "我是备注嗯呢",
			"pk_fiorg": "1710477846884909056",
			"pk_currency": "1706009534709369343",
			"bodyvos": [
				{
					"pk_category": "172606973779850035",
					"rent_type": "2",
					"rental_period": 1,
					"equip_name": "资产的名称",
					"expect_start_date": "2024-11-25",
					"pk_supplier": "1726069737798500355",
					"rent_cycle_scheme": "0",
					"rent_unit_price": 5,
					"memo": "",
					"expect_end_date": "2024-12-21",
					"rent_quantity": 4,
					"_status": "Insert"
				}
			],
			"_status": ""
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
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	数据
id	string	否	租入申请主表id 示例：2141508386591080454
pubts	string	否	时间戳 示例：2024-11-25 11:16:31
sysid	string	否	系统标识 示例：LIM
isWfControlled	boolean	否	受审批流控制 示例：false
pk_org	string	否	承租组织主键 示例：1710477846884909056
pk_org__name	string	否	承租组织 示例：wml集团
bill_code	string	否	单据编码 示例：ZRSQ202411250001
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
bill_type	string	否	单据类型 示例：4A3L
transi_type	string	否	交易类型 示例：4A3L-01
pk_transitype	string	否	交易类型主键 示例：1706009534684726516
pk_transitype__name	string	否	交易类型名称 示例：租入申请
billmaker	string	否	制单人主键 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
billmaker__name	string	否	制单人 示例：昵称-API集团员工
billmaketime	string	否	制单时间 示例：2024-11-25 11:13:08
modifier	string	否	修改人主键 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
modifier__name	string	否	修改人 示例：昵称-API集团员工
modifiedtime	string	否	修改时间 示例：2024-11-25 11:16:31
auditor__name	string	否	审核人
creator	string	否	创建人 示例：f639d810-37d3-40d7-b74e-0e73bc2127b1
creator__name	string	否	创建人 示例：昵称-API集团员工
creationtime	string	否	创建时间 示例：2024-11-25 11:13:08
pk_applier	string	否	申请人主键 示例：1710478241997783050
pk_applydept	string	否	申请部门主键 示例：1710478035863470086
pk_applier__name	string	否	申请人 示例：王美丽
pk_applydept__name	string	否	申请部门 示例：维修部门
pk_calandar	string	否	申请时间 示例：2024-11-25 00:00:00
rent_use	string	否	租赁用途 示例：我是租赁用途嗯呢
memo	string	否	备注 示例：我是备注嗯呢
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
pk_fiorg	string	否	会计主体主键 示例：1710477846884909056
pk_fiorg__name	string	否	会计主体 示例：wml集团
pk_currency	string	否	币种主键 示例：1706009534709369343
pk_currency__name	string	否	币种 示例：人民币
pk_currency__priceDigit	string	否	币种单价精度 示例：2
pk_currency__moneyDigit	string	否	币种金额精度 示例：2
bodyvos	object	是	子表数据
bizFlow	string	否	业务流id
isFlowCoreBill	string	否	是否业务流
bizFlow_name	string	否	业务流名称
bizFlow_version	string	否	业务流版本
errorDetail	string	否	错误明细

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"id": "2141508386591080454",
		"pubts": "2024-11-25 11:16:31",
		"sysid": "LIM",
		"isWfControlled": false,
		"pk_org": "1710477846884909056",
		"pk_org__name": "wml集团",
		"bill_code": "ZRSQ202411250001",
		"bill_status": 0,
		"bill_type": "4A3L",
		"transi_type": "4A3L-01",
		"pk_transitype": "1706009534684726516",
		"pk_transitype__name": "租入申请",
		"billmaker": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"billmaker__name": "昵称-API集团员工",
		"billmaketime": "2024-11-25 11:13:08",
		"modifier": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"modifier__name": "昵称-API集团员工",
		"modifiedtime": "2024-11-25 11:16:31",
		"auditor__name": "",
		"creator": "f639d810-37d3-40d7-b74e-0e73bc2127b1",
		"creator__name": "昵称-API集团员工",
		"creationtime": "2024-11-25 11:13:08",
		"pk_applier": "1710478241997783050",
		"pk_applydept": "1710478035863470086",
		"pk_applier__name": "王美丽",
		"pk_applydept__name": "维修部门",
		"pk_calandar": "2024-11-25 00:00:00",
		"rent_use": "我是租赁用途嗯呢",
		"memo": "我是备注嗯呢",
		"verifystate": 0,
		"pk_fiorg": "1710477846884909056",
		"pk_fiorg__name": "wml集团",
		"pk_currency": "1706009534709369343",
		"pk_currency__name": "人民币",
		"pk_currency__priceDigit": "2",
		"pk_currency__moneyDigit": "2",
		"bodyvos": [
			{
				"rent_total_price": 540,
				"pk_category__category_name": "20230718导入136",
				"rowno": "10",
				"rent_type": "2",
				"rental_period": 1,
				"main_id": "2141508386591080454",
				"equip_name": "资产的名称",
				"generate_contract_flag": false,
				"pk_supplier__name": "0418维修合同供应商",
				"expect_start_date": "2024-11-25 00:00:00",
				"pk_supplier": "1726069737798500355",
				"rent_cycle_scheme": "0",
				"rent_unit_price": 5,
				"expect_end_date": "2024-12-21 00:00:00",
				"rent_quantity": 4,
				"id": "2141508386591080455",
				"pk_org": "1710477846884909056"
			}
		],
		"bizFlow": "",
		"isFlowCoreBill": "",
		"bizFlow_name": "",
		"bizFlow_version": ""
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
999	服务端逻辑异常	查看日志找对应异常服务定位产生原因

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

