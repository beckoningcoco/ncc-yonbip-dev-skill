---
title: "集成插件-工单管理计划物料请购生成NCC请购单"
apiId: "2266879126112567302"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Work Order Management"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Order Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 集成插件-工单管理计划物料请购生成NCC请购单

>  请求方式	POST | Work Order Management (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/workorder/pushsavepray
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
id	string	否	否	主键
bill_code	string	否	否	单据编码
transi_type	string	否	否	交易类型编码
pk_transitype	string	否	否	交易类型
bill_type	string	否	否	单据类型
pk_org	string	否	否	资产组织主键
bill_status	number
小数位数:0,最大长度:10	否	否	单据状态
pk_recorder	string	否	否	经办人
bill_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据日期
memo	string	否	否	备注
creator	string	否	否	创建人
creationtime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建时间
modifier	string	否	否	最后修改人
auditor	string	否	否	审批人
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审批时间
billmaker	string	否	否	制单人
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	制单时间
ts	string	否	否	ts
bodyvos	object	是	否	表体明细
id	string	否	否	表体主键
pk_equip	string	否	否	资产卡片
memo	string	否	否	表体备注
pk_icorg	string	否	否	库存组织
pk_warehouse	string	否	否	仓库
pk_material	string	否	否	物料
pk_serialno	string	否	否	序列号主键
serial_num	string	否	否	序列号
pk_material_batchno	string	否	否	批次号
pk_material_sku	string	否	否	物料sku
pk_main_unit	string	否	否	主计量单位
ts	string	否	否	ts

## 3. 请求示例

Url: /yonbip/am/workorder/pushsavepray?access_token=访问令牌
Body: {
	"id": "",
	"bill_code": "",
	"transi_type": "",
	"pk_transitype": "",
	"bill_type": "",
	"pk_org": "",
	"bill_status": 0,
	"pk_recorder": "",
	"bill_date": "2026-06-07 13:24:43",
	"memo": "",
	"creator": "",
	"creationtime": "2026-06-07 13:24:43",
	"modifier": "",
	"auditor": "",
	"audittime": "2026-06-07 13:24:43",
	"billmaker": "",
	"billmaketime": "2026-06-07 13:24:43",
	"ts": "",
	"bodyvos": [
		{
			"id": "",
			"pk_equip": "",
			"memo": "",
			"pk_icorg": "",
			"pk_warehouse": "",
			"pk_material": "",
			"pk_serialno": "",
			"serial_num": "",
			"pk_material_batchno": "",
			"pk_material_sku": "",
			"pk_main_unit": "",
			"ts": ""
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
id	string	否	主键
bill_code	string	否	单据编码
transi_type	string	否	交易类型编码
pk_transitype	string	否	交易类型
bill_type	string	否	单据类型
pk_org	string	否	资产组织主键
bill_status	number
小数位数:0,最大长度:10	否	单据状态
pk_recorder	string	否	经办人
bill_date	date
格式:yyyy-MM-dd HH:mm:ss	否	单据日期
memo	string	否	备注
creator	string	否	创建人
creationtime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间
modifier	string	否	最后修改人
auditor	string	否	审批人
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	审批时间
billmaker	string	否	制单人
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	制单时间
ts	string	否	ts
bodyvos	object	是	表体明细
id	string	否	表体主键
pk_equip	string	否	资产卡片
memo	string	否	表体备注
pk_icorg	string	否	库存组织
pk_warehouse	string	否	仓库
pk_material	string	否	物料
pk_serialno	string	否	序列号主键
serial_num	string	否	序列号
pk_material_batchno	string	否	批次号
pk_material_sku	string	否	物料sku
pk_main_unit	string	否	主计量单位
ts	string	否	ts

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "",
		"bill_code": "",
		"transi_type": "",
		"pk_transitype": "",
		"bill_type": "",
		"pk_org": "",
		"bill_status": 0,
		"pk_recorder": "",
		"bill_date": "2026-06-07 13:24:43",
		"memo": "",
		"creator": "",
		"creationtime": "2026-06-07 13:24:43",
		"modifier": "",
		"auditor": "",
		"audittime": "2026-06-07 13:24:43",
		"billmaker": "",
		"billmaketime": "2026-06-07 13:24:43",
		"ts": "",
		"bodyvos": [
			{
				"id": "",
				"pk_equip": "",
				"memo": "",
				"pk_icorg": "",
				"pk_warehouse": "",
				"pk_material": "",
				"pk_serialno": "",
				"serial_num": "",
				"pk_material_batchno": "",
				"pk_material_sku": "",
				"pk_main_unit": "",
				"ts": ""
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

