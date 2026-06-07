---
title: "所有权调入详情查询"
apiId: "1791216136736473093"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Ownership Transfer-in"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Ownership Transfer-in]
platform_version: "BIP"
source_type: community-api-docs
---

# 所有权调入详情查询

>  请求方式	POST | Ownership Transfer-in (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/deployIn/detail
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
id	string	否	否	所有权调入主表主键 示例：2074711466078371850

## 3. 请求示例

Url: /yonbip/am/deployIn/detail?access_token=访问令牌
Body: {
	"id": "2074711466078371850"
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
notaxtotal_amount_currency	number
小数位数:0,最大长度:10	否	本币无税金额合计 示例：0
pk_ownerunit_out	string	否	调出所有权主键 示例：2108852349979590665
pk_currency__moneyRount	number
小数位数:0,最大长度:10	否	金额舍入原则 示例：4
currrate_type__digit	number
小数位数:0,最大长度:10	否	汇率精度 示例：6
pk_ownerorg_out	string	否	调出资产管理组织主键 示例：2108852349979590665
total_amount_currency	number
小数位数:0,最大长度:10	否	本币含税金额合计 示例：0
pk_org	string	否	资产组织主键 示例：2111064627513655299
pk_transitype	string	否	交易类型主键 示例：2107565491904053409
pk_ownerunit_in	string	否	调入所有权主键 示例：2111064627513655299
currrate_type	string	否	汇率类型主键 示例：0000M233OB73BD9ERM0000
pk_currency_in__name	string	否	本币币种 示例：人民币
bill_type	string	否	单据类型 示例：4A34
id	string	否	主键 示例：2163021052970532869
pk_ownerunit_in__name	string	否	调入所有权 示例：likun-OrgName-All
creator__name	string	否	创建人 示例：刘龙
tenant	string	否	租户 示例：0000M233OB73BD9ERM0000
pk_currency__name	string	否	币种 示例：人民币
pk_currency	string	否	币种主键 示例：2107565354457759845
pk_ownerorg_in	string	否	调入资产管理组织主键 示例：2111064627513655299
sysid	string	否	系统标识 示例：AUM
isWfControlled	boolean	否	是否审核流控制（true ：是 false：否） 示例：false
pk_org__name	string	否	资产组织 示例：likun-OrgName-All
pk_transitype__name	string	否	交易类型 示例：所有权调入
pk_ownerunit_out__name	string	否	调出所有权 示例：全职能组织
pk_ownerorg_out__name	string	否	调出资产管理组织 示例：全职能组织
billmaker__name	string	否	制单人 示例：刘龙
total_amount	number
小数位数:0,最大长度:10	否	含税金额合计 示例：0
billmaker	string	否	制单人 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
creationtime	string	否	创建时间 示例：2024-12-24 10:53:12
bodyvos	object	是	子表数据
src_pk_bill	string	否	来源单据主键 示例：2163020717963083781
src_bill_type	string	否	来源单据类型 示例：4A33
real_opening_amount	number
小数位数:0,最大长度:10	否	实开发票金额 示例：0
pk_status_after__status_name	string	否	调入后状态 示例：在用
real_opening_amount_currency	number
小数位数:0,最大长度:10	否	本币实开发票金额 示例：0
src_pk_bill_b	string	否	来源单据表体主键 示例：2163020717963083782
pk_equip__pk_category	string	否	资产类别主键 示例：2111082949847285764
notaxassets_amount	number
小数位数:0,最大长度:10	否	无税金额 示例：0
pk_org	string	否	资产组织主键 示例：2111064627513655299
pk_equip__equip_code	string	否	资产编码 示例：EAM-TEST-202410160004
notaxassets_amount_currency	number
小数位数:0,最大长度:10	否	本币无税金额 示例：0
assets_amount_tax	number
小数位数:0,最大长度:10	否	税额 示例：0
pk_mandept_before__name	string	否	调拨前管理部门 示例：营销部门
pk_usedorg_out__name	string	否	调入使用单位主键 示例：全职能组织
id	string	否	主键 示例：2163021052970532870
pk_status_after	string	否	调入后状态主键 示例：PRESET01_0000M233OB73BD9ERM0000
pubts	string	否	主键 示例：2024-12-24 10:53:13
tenant	string	否	租户 示例：0000M233OB73BD9ERM0000
bill_code_src	string	否	来源单据编码 示例：ZCDC202412240001
rowno	string	否	行号 示例：10
pk_currency__name	string	否	币种 示例：人民币
pk_equip__equip_num	number
小数位数:0,最大长度:10	否	数量 示例：1
pk_currency	string	否	币种主键 示例：2107565354457759845
assets_amount_tax_currency	number
小数位数:0,最大长度:10	否	本币税额 示例：0
pk_equip__special_flag	boolean	否	是否为特种设备 示例：true
assets_amount	number
小数位数:0,最大长度:10	否	含税金额 示例：0
main_id	string	否	主表id 示例：2163021052970532869
pk_currency__moneyDigit	number
小数位数:0,最大长度:10	否	币种精度 示例：2
src_transitype	string	否	来源交易类型 示例：4A33-01
pk_mandept_before	string	否	调拨前管理部门主键 示例：2108853114483769346
pk_equip	string	否	资产 示例：2111959080223899656
assets_amount_currency	number
小数位数:0,最大长度:10	否	本币含税金额 示例：0
pk_usedorg_out	string	否	调入使用单位 示例：2108852349979590665
pk_equip__pk_category__category_name	string	否	资产类别 示例：LIKUNTEST-国防军事
pk_equip__equip_name	string	否	资产名称 示例：特种设备注册
invoicing_flag	boolean	否	是否开票（true ：是 false：否） 示例：false
stock_in_flag	boolean	否	入库标志（true ：是 false：否） 示例：false
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审批状态 （0：开立，1：审批中，2：审批通过，3：流程终止，4：退回制单） 示例：0
currrate	number
小数位数:0,最大长度:10	否	汇率 示例：1
total_amount_tax_currency	number
小数位数:0,最大长度:10	否	本币税额合计 示例：0
bill_code	string	否	调出单号 示例：ZCDR202412240001
pk_currency__priceRount	number
小数位数:0,最大长度:10	否	单价舍入原则 示例：4
currrate_type__name	string	否	汇率类型 示例：基准汇率
postAccountStatus	number
小数位数:0,最大长度:10	否	过账状态 示例：99
pk_currency__digit	number
小数位数:0,最大长度:10	否	币种精度 示例：2
total_amount_tax	number
小数位数:0,最大长度:10	否	税额合计 示例：0
notaxtotal_amount	number
小数位数:0,最大长度:10	否	无税金额合计 示例：0
pk_ownerorg_in__name	string	否	调入资产管理组织 示例：likun-OrgName-All
pubts	string	否	时间戳 示例：2024-12-24 10:53:16
actual_invoice_amount	number
小数位数:0,最大长度:10	否	实开发票总额 示例：0
pk_currency_in	string	否	本币币种主键 示例：2107565354457759845
creator	string	否	创建人主键 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
billmaketime	string	否	制单时间 示例：2024-12-24 10:53:12
bill_status	number
小数位数:0,最大长度:10	否	单据状态（0:开立 1:已审核 2:已关闭 3:审核中） 示例：0
pk_currency_in__priceRount	number
小数位数:0,最大长度:10	否	单价舍入原则 示例：4
currrate_date	string	否	汇率日期 示例：2024-12-24
pk_currency_in__digit	number
小数位数:0,最大长度:10	否	本币币种精度 示例：2
actual_invoice_amount_currency	number
小数位数:0,最大长度:10	否	本币实开发票总额 示例：0
transi_type	string	否	交易类型编码 示例：4A34-01
pk_currency_in__moneyRount	number
小数位数:0,最大长度:10	否	金额舍入原则 示例：4

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"notaxtotal_amount_currency": 0,
		"pk_ownerunit_out": "2108852349979590665",
		"pk_currency__moneyRount": 4,
		"currrate_type__digit": 6,
		"pk_ownerorg_out": "2108852349979590665",
		"total_amount_currency": 0,
		"pk_org": "2111064627513655299",
		"pk_transitype": "2107565491904053409",
		"pk_ownerunit_in": "2111064627513655299",
		"currrate_type": "0000M233OB73BD9ERM0000",
		"pk_currency_in__name": "人民币",
		"bill_type": "4A34",
		"id": "2163021052970532869",
		"pk_ownerunit_in__name": "likun-OrgName-All",
		"creator__name": "刘龙",
		"tenant": "0000M233OB73BD9ERM0000",
		"pk_currency__name": "人民币",
		"pk_currency": "2107565354457759845",
		"pk_ownerorg_in": "2111064627513655299",
		"sysid": "AUM",
		"isWfControlled": false,
		"pk_org__name": "likun-OrgName-All",
		"pk_transitype__name": "所有权调入",
		"pk_ownerunit_out__name": "全职能组织",
		"pk_ownerorg_out__name": "全职能组织",
		"billmaker__name": "刘龙",
		"total_amount": 0,
		"billmaker": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"creationtime": "2024-12-24 10:53:12",
		"bodyvos": [
			{
				"src_pk_bill": "2163020717963083781",
				"src_bill_type": "4A33",
				"real_opening_amount": 0,
				"pk_status_after__status_name": "在用",
				"real_opening_amount_currency": 0,
				"src_pk_bill_b": "2163020717963083782",
				"pk_equip__pk_category": "2111082949847285764",
				"notaxassets_amount": 0,
				"pk_org": "2111064627513655299",
				"pk_equip__equip_code": "EAM-TEST-202410160004",
				"notaxassets_amount_currency": 0,
				"assets_amount_tax": 0,
				"pk_mandept_before__name": "营销部门",
				"pk_usedorg_out__name": "全职能组织",
				"id": "2163021052970532870",
				"pk_status_after": "PRESET01_0000M233OB73BD9ERM0000",
				"pubts": "2024-12-24 10:53:13",
				"tenant": "0000M233OB73BD9ERM0000",
				"bill_code_src": "ZCDC202412240001",
				"rowno": "10",
				"pk_currency__name": "人民币",
				"pk_equip__equip_num": 1,
				"pk_currency": "2107565354457759845",
				"assets_amount_tax_currency": 0,
				"pk_equip__special_flag": true,
				"assets_amount": 0,
				"main_id": "2163021052970532869",
				"pk_currency__moneyDigit": 2,
				"src_transitype": "4A33-01",
				"pk_mandept_before": "2108853114483769346",
				"pk_equip": "2111959080223899656",
				"assets_amount_currency": 0,
				"pk_usedorg_out": "2108852349979590665",
				"pk_equip__pk_category__category_name": "LIKUNTEST-国防军事",
				"pk_equip__equip_name": "特种设备注册",
				"invoicing_flag": false,
				"stock_in_flag": false
			}
		],
		"returncount": 0,
		"verifystate": 0,
		"currrate": 1,
		"total_amount_tax_currency": 0,
		"bill_code": "ZCDR202412240001",
		"pk_currency__priceRount": 4,
		"currrate_type__name": "基准汇率",
		"postAccountStatus": 99,
		"pk_currency__digit": 2,
		"total_amount_tax": 0,
		"notaxtotal_amount": 0,
		"pk_ownerorg_in__name": "likun-OrgName-All",
		"pubts": "2024-12-24 10:53:16",
		"actual_invoice_amount": 0,
		"pk_currency_in": "2107565354457759845",
		"creator": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"billmaketime": "2024-12-24 10:53:12",
		"bill_status": 0,
		"pk_currency_in__priceRount": 4,
		"currrate_date": "2024-12-24",
		"pk_currency_in__digit": 2,
		"actual_invoice_amount_currency": 0,
		"transi_type": "4A34-01",
		"pk_currency_in__moneyRount": 4
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

