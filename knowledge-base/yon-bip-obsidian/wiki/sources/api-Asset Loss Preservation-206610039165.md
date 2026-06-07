---
title: "资产盘亏详情查询"
apiId: "2066100391658389506"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inventory Loss Document"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inventory Loss Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产盘亏详情查询

>  请求方式	POST | Inventory Loss Document (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/inventoryLoss/detail
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
id	string	否	是	资产盘亏主表主键 示例：1842543452654927878

## 3. 请求示例

Url: /yonbip/am/inventoryLoss/detail?access_token=访问令牌
Body: {
	"id": "1842543452654927878"
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
auditor__name	string	否	审核人
auditor	string	否	审核人
pk_group	string	否	pk_group 示例：666666
src_pk_bill	string	否	src_pk_bill 示例：1842531787523751943
returncount	number
小数位数:0,最大长度:10	否	returncount 示例：0
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
src_bill_type	string	否	src_bill_type 示例：4A35
bill_code	string	否	bill_code 示例：ZCPK202310190003
src_bill_code	string	否	src_bill_code 示例：ZCPD202310190003
inventory_date	string	否	inventory_date 示例：2023-10-19
dr	number
小数位数:0,最大长度:10	否	dr 示例：0
pk_org	string	否	pk_org 示例：1790648616943091720
pk_transitype	string	否	pk_transitype 示例：1785361014001239582
bill_type	string	否	bill_type 示例：4A21
id	string	否	id 示例：1842543452654927878
pubts	string	否	pubts 示例：2023-10-19 15:24:49
creator__name	string	否	creator__name 示例：昵称-LYL
tenant	string	否	tenant 示例：0000LKUKLMA0B7RHFL0000
creator	string	否	creator 示例：7f680f0e-f409-49aa-8b84-dc7e2587313f
billmaketime	string	否	billmaketime 示例：2023-10-19 15:24:49
push_status	number
小数位数:0,最大长度:10	否	push_status 示例：0
isWfControlled	boolean	否	isWfControlled 示例：false
sysid	string	否	sysid 示例：AUM
pk_org__name	string	否	pk_org__name 示例：LYL
pk_transitype__name	string	否	pk_transitype__name 示例：资产盘亏
billmaker__name	string	否	billmaker__name 示例：昵称-LYL
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：0
src_transitype	string	否	src_transitype 示例：4A35-01
billmaker	string	否	billmaker 示例：7f680f0e-f409-49aa-8b84-dc7e2587313f
transi_type	string	否	transi_type 示例：4A21-01
creationtime	string	否	creationtime 示例：2023-10-19 15:24:49
bodyvos	object	是	bodyvos
id	string	否	id 示例：1842543452654927879
dr	number
小数位数:0,最大长度:10	否	dr 示例：0
pk_group	string	否	pk_group 示例：666666
pk_org	string	否	pk_org 示例：1790648616943091720
pk_org__name	string	否	pk_org__name 示例：LYL
main_id	string	否	main_id 示例：1842543452654927878
stock_out_flag	boolean	否	出库标记 示例：false
pk_equip	string	否	pk_equip 示例：1822359064887689234
pk_equip__equip_code	string	否	pk_equip__equip_code 示例：EAM-DAILY-202309220033
pk_equip__equip_name	string	否	pk_equip__equip_name 示例：323234
pubts	string	否	pubts 示例：2023-10-19 15:24:49
tenant	string	否	tenant 示例：0000LKUKLMA0B7RHFL0000
pk_addreducestyle	string	否	盘亏方式 示例：1981377497401393497
pk_addreducestyle__name	string	否	盘亏方式 示例：出售
pk_reason	string	否	盘亏原因 示例：1991561217042808832
pk_reason__name	string	否	盘亏原因 示例：报废原因
deal_result	string	否	处理结果
inventory_person	string	否	盘点人 示例：武慧峰
inventory_date	string	否	盘点日期 示例：2024-07-25
pk_used_status_before	string	否	盘亏前状态 示例：PRESET01_0000LVC5JT8VH0ZQBU0000
pk_used_status_before__status_name	string	否	盘亏前状态 示例：在用
pk_used_status_after	string	否	盘亏后状态 示例：PRESET05_0000LVC5JT8VH0ZQBU0000
pk_used_status_after__status_name	string	否	盘亏后状态 示例：处置
status_date_before	string	否	盘亏前状态日期 示例：2024-07-24
status_date_after	string	否	盘亏后状态日期 示例：2024-07-24
pk_warehouse_out	string	否	出库仓库
pk_icorg_out	string	否	库存组织
pk_location_before	string	否	盘亏前位置
_status	string	否	_status
memo	string	否	备注 示例：备注
_viewmodel	string	否	_viewmodel
masterOrgKeyField	string	否	masterOrgKeyField 示例：pk_org
transTypeKeyField	string	否	transTypeKeyField 示例：pk_transitype
_mddFormulaExecuteFlag	string	否	_mddFormulaExecuteFlag 示例：true

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"auditor__name": "",
		"auditor": "",
		"pk_group": "666666",
		"src_pk_bill": "1842531787523751943",
		"returncount": 0,
		"verifystate": 0,
		"src_bill_type": "4A35",
		"bill_code": "ZCPK202310190003",
		"src_bill_code": "ZCPD202310190003",
		"inventory_date": "2023-10-19",
		"dr": 0,
		"pk_org": "1790648616943091720",
		"pk_transitype": "1785361014001239582",
		"bill_type": "4A21",
		"id": "1842543452654927878",
		"pubts": "2023-10-19 15:24:49",
		"creator__name": "昵称-LYL",
		"tenant": "0000LKUKLMA0B7RHFL0000",
		"creator": "7f680f0e-f409-49aa-8b84-dc7e2587313f",
		"billmaketime": "2023-10-19 15:24:49",
		"push_status": 0,
		"isWfControlled": false,
		"sysid": "AUM",
		"pk_org__name": "LYL",
		"pk_transitype__name": "资产盘亏",
		"billmaker__name": "昵称-LYL",
		"bill_status": 0,
		"src_transitype": "4A35-01",
		"billmaker": "7f680f0e-f409-49aa-8b84-dc7e2587313f",
		"transi_type": "4A21-01",
		"creationtime": "2023-10-19 15:24:49",
		"bodyvos": [
			{
				"id": "1842543452654927879",
				"dr": 0,
				"pk_group": "666666",
				"pk_org": "1790648616943091720",
				"pk_org__name": "LYL",
				"main_id": "1842543452654927878",
				"stock_out_flag": false,
				"pk_equip": "1822359064887689234",
				"pk_equip__equip_code": "EAM-DAILY-202309220033",
				"pk_equip__equip_name": "323234",
				"pubts": "2023-10-19 15:24:49",
				"tenant": "0000LKUKLMA0B7RHFL0000",
				"pk_addreducestyle": "1981377497401393497",
				"pk_addreducestyle__name": "出售",
				"pk_reason": "1991561217042808832",
				"pk_reason__name": "报废原因",
				"deal_result": "",
				"inventory_person": "武慧峰",
				"inventory_date": "2024-07-25",
				"pk_used_status_before": "PRESET01_0000LVC5JT8VH0ZQBU0000",
				"pk_used_status_before__status_name": "在用",
				"pk_used_status_after": "PRESET05_0000LVC5JT8VH0ZQBU0000",
				"pk_used_status_after__status_name": "处置",
				"status_date_before": "2024-07-24",
				"status_date_after": "2024-07-24",
				"pk_warehouse_out": "",
				"pk_icorg_out": "",
				"pk_location_before": "",
				"_status": "",
				"memo": "备注"
			}
		],
		"_viewmodel": "",
		"masterOrgKeyField": "pk_org",
		"transTypeKeyField": "pk_transitype",
		"_mddFormulaExecuteFlag": "true"
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

