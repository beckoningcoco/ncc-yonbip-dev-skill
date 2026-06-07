---
title: "所有权调入保存"
apiId: "2063755159132438535"
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

# 所有权调入保存

>  请求方式	POST | Asset Change (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/deployincard/save
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
data	object	否	是	所有权调入数据
bill_code	string	否	是	单据编号 示例：ZCDR202506240001
bill_date	string	否	是	单据日期 示例：2025-06-24
bill_status	number
小数位数:0,最大长度:10	否	否	单据状态 示例：0
verifystate	number
小数位数:0,最大长度:10	否	否	审核状态 示例：0
pk_ownerorg_out	string	否	否	调出资产管理组织 示例：2206074174684790791
pk_ownerorg_in	string	否	否	调入资产管理组织 示例：2206074174684790791
pk_ownerunit_in	string	否	否	调入所有权 示例：2246357514780147713
pk_org	string	否	是	资产组织 示例：2246357514780147713
postAccountStatus	number
小数位数:0,最大长度:10	否	否	过账状态 示例：99
bill_type	string	否	是	单据类型 示例：4A34
pk_transitype	string	否	否	交易类型 示例：AM_4A34-01
transi_type	string	否	是	交易类型 示例：4A34-01
pk_ownerunit_out	string	否	否	调出所有权 示例：2206074174684790791
pk_org_v	string	否	否	资产组织版本 示例：2206074174684790791
pk_currency	string	否	否	币种主键 示例：2048140315882684706
total_amount	number
小数位数:0,最大长度:10	否	否	含税金额合计 示例：0
pk_ownerorg_out_v	string	否	否	调出资产管理组织版本 示例：2206074174684790791
pk_ownerorg_in_v	string	否	否	调入资产管理组织版本 示例：2206074174684790791
pk_ownerunit_out_v	string	否	否	调出所有权版本 示例：2206074174684790791
pk_currency_in	string	否	否	本币币种主键 示例：2048140315882684706
pk_ownerunit_in_v	string	否	否	调入所有权版本 示例：2206074174684790791
pk_usedorg_out_v	string	否	否	调出使用单位版本 示例：2206074174684790791
currrate	number
小数位数:0,最大长度:10	否	否	汇率 示例：1
currrate_type	string	否	否	汇率类型 示例：0000LYWFBS37G85RUT0000
pk_usedorg_in_v	string	否	否	调入使用单位版本 示例：2206074174684790791
currrate_date	string	否	否	汇率日期 示例：2025-06-24
total_amount_currency	number
小数位数:0,最大长度:10	否	否	本币含税金额合计 示例：0
notaxtotal_amount	number
小数位数:0,最大长度:10	否	否	无税金额合计 示例：0
notaxtotal_amount_currency	number
小数位数:0,最大长度:10	否	否	本币无税金额合计 示例：0
total_amount_tax	number
小数位数:0,最大长度:10	否	否	税额合计 示例：0
total_amount_tax_currency	number
小数位数:0,最大长度:10	否	否	本币税额合计 示例：0
actual_invoice_amount	number
小数位数:0,最大长度:10	否	否	实开发票总额 示例：0
actual_invoice_amount_currency	number
小数位数:0,最大长度:10	否	否	本币实开发票总额 示例：0
id	string	否	否	主表主键 示例：2298384128676986880
pubts	string	否	否	时间戳 示例：2025-06-24 20:12:09
tenant	string	否	否	租户 示例：0000LYWFBS37G85RUT0000
sysid	string	否	否	系统标识 示例：AUM
isWfControlled	boolean	否	否	是否审核流控制 示例：false
returncount	number
小数位数:0,最大长度:10	否	否	退回次数 示例：0
billmaker	string	否	否	制单人 示例：50be6c73-f51f-46b2-9c5b-5482df45f32d
billmaketime	string	否	否	制单时间 示例：2025-06-24 20:12:08
creator	string	否	否	创建人 示例：50be6c73-f51f-46b2-9c5b-5482df45f32d
creationtime	string	否	否	创建时间 示例：2025-06-24 20:12:08
bodyvos	object	是	否	表体数据
_status	string	否	否	操作 示例：Update 默认值：Update

## 3. 请求示例

Url: /yonbip/ACC/deployincard/save?access_token=访问令牌
Body: {
	"data": {
		"bill_code": "ZCDR202506240001",
		"bill_date": "2025-06-24",
		"bill_status": 0,
		"verifystate": 0,
		"pk_ownerorg_out": "2206074174684790791",
		"pk_ownerorg_in": "2206074174684790791",
		"pk_ownerunit_in": "2246357514780147713",
		"pk_org": "2246357514780147713",
		"postAccountStatus": 99,
		"bill_type": "4A34",
		"pk_transitype": "AM_4A34-01",
		"transi_type": "4A34-01",
		"pk_ownerunit_out": "2206074174684790791",
		"pk_org_v": "2206074174684790791",
		"pk_currency": "2048140315882684706",
		"total_amount": 0,
		"pk_ownerorg_out_v": "2206074174684790791",
		"pk_ownerorg_in_v": "2206074174684790791",
		"pk_ownerunit_out_v": "2206074174684790791",
		"pk_currency_in": "2048140315882684706",
		"pk_ownerunit_in_v": "2206074174684790791",
		"pk_usedorg_out_v": "2206074174684790791",
		"currrate": 1,
		"currrate_type": "0000LYWFBS37G85RUT0000",
		"pk_usedorg_in_v": "2206074174684790791",
		"currrate_date": "2025-06-24",
		"total_amount_currency": 0,
		"notaxtotal_amount": 0,
		"notaxtotal_amount_currency": 0,
		"total_amount_tax": 0,
		"total_amount_tax_currency": 0,
		"actual_invoice_amount": 0,
		"actual_invoice_amount_currency": 0,
		"id": "2298384128676986880",
		"pubts": "2025-06-24 20:12:09",
		"tenant": "0000LYWFBS37G85RUT0000",
		"sysid": "AUM",
		"isWfControlled": false,
		"returncount": 0,
		"billmaker": "50be6c73-f51f-46b2-9c5b-5482df45f32d",
		"billmaketime": "2025-06-24 20:12:08",
		"creator": "50be6c73-f51f-46b2-9c5b-5482df45f32d",
		"creationtime": "2025-06-24 20:12:08",
		"bodyvos": [
			{
				"origin_value": 90000,
				"real_opening_amount": 0,
				"accu_dep": 0,
				"real_opening_amount_currency": 0,
				"src_pk_bill_b": "2298384034187706377",
				"notaxassets_amount": 90000,
				"pk_org": "2246357514780147713",
				"assets_amount_tax": 0,
				"pk_manager_before": "2068760986472415233",
				"service_month": 3000,
				"used_month": 0,
				"id": "2298384128676986881",
				"pk_status_after": "PRESET01_0000LYWFBS37G85RUT0000",
				"new_value": 90000,
				"tenant": "0000LYWFBS37G85RUT0000",
				"pk_usedept_before": "2230069486951596034",
				"pk_mandept_after": "2246894265430966272",
				"pk_currency": "2048140315882684706",
				"assets_amount_tax_currency": 0,
				"pre_devaluate": 0,
				"pk_mandept_before": "2230069486951596034",
				"pk_usedorg_out": "2206074174684790791",
				"pk_addreducestyle": "2048140324497260604",
				"salvage": 900,
				"invoicing_flag": false,
				"stock_in_flag": false,
				"src_pk_bill": "2298384034187706376",
				"salvage_rate": 1,
				"src_bill_type": "4A33",
				"pk_user_before": "2230021039745138697",
				"begin_date": "2024-09-29",
				"pk_location_before": "2230525724171698179",
				"notaxassets_amount_currency": 90000,
				"dep_amount": 0,
				"pubts": "2025-06-24 20:12:08",
				"bill_code_src": "ZCDC202506240002",
				"rowno": "10",
				"assets_amount": 90000,
				"main_id": "2298384128676986880",
				"src_transitype": "4A33-01",
				"pk_equip": "2278925521650188301",
				"assets_amount_currency": 90000,
				"net_money": 90000,
				"pk_usedorg_in": "2246357514780147713",
				"_status": "Update"
			}
		],
		"_status": "Update"
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
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	所有权调入数据
bill_code	string	否	单据编号 示例：ZCDR202506240001
bill_date	string	否	单据日期 示例：2025-06-24
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审核状态 示例：0
pk_ownerorg_out	string	否	调出资产管理组织 示例：2206074174684790791
pk_ownerorg_in	string	否	调入资产管理组织
pk_ownerunit_in	string	否	调入所有权 示例：2246357514780147713
pk_org	string	否	资产组织 示例：2246357514780147713
busi_type	string	否	业务类型
postAccountStatus	number
小数位数:0,最大长度:10	否	过账状态 示例：99
bill_type	string	否	单据类型 示例：4A34
pk_transitype	string	否	交易类型 示例：AM_4A34-01
transi_type	string	否	交易类型 示例：4A34-01
pk_ownerunit_out	string	否	调出所有权 示例：2206074174684790791
pk_org_v	string	否	资产组织版本
pk_currency	string	否	币种主键 示例：2048140315882684706
total_amount	number
小数位数:0,最大长度:10	否	含税金额合计 示例：0
pk_ownerorg_out_v	string	否	调出资产管理组织版本
pk_ownerorg_in_v	string	否	调入资产管理组织版本
pk_ownerunit_out_v	string	否	调出所有权版本
pk_currency_in	string	否	本币币种主键 示例：2048140315882684706
pk_ownerunit_in_v	string	否	调入所有权版本
pk_usedorg_out_v	string	否	调出使用单位版本
currrate	number
小数位数:0,最大长度:10	否	汇率 示例：1
currrate_type	string	否	汇率类型 示例：0000LYWFBS37G85RUT0000
pk_usedorg_in_v	string	否	调入使用单位版本
currrate_date	string	否	汇率日期 示例：2025-06-24
total_amount_currency	number
小数位数:0,最大长度:10	否	本币含税金额合计 示例：0
notaxtotal_amount	number
小数位数:0,最大长度:10	否	无税金额合计 示例：0
notaxtotal_amount_currency	number
小数位数:0,最大长度:10	否	本币无税金额合计 示例：0
total_amount_tax	number
小数位数:0,最大长度:10	否	税额合计 示例：0
total_amount_tax_currency	number
小数位数:0,最大长度:10	否	本币税额合计 示例：0
actual_invoice_amount	number
小数位数:0,最大长度:10	否	实开发票总额 示例：0
actual_invoice_amount_currency	number
小数位数:0,最大长度:10	否	本币实开发票总额 示例：0
id	string	否	主表主键 示例：2298384128676986880
pubts	string	否	时间戳 示例：2025-06-24 20:12:09
tenant	string	否	租户 示例：0000LYWFBS37G85RUT0000
sysid	string	否	系统标识 示例：AUM
isWfControlled	boolean	否	是否审核流控制 示例：false
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
billmaker	string	否	制单人 示例：50be6c73-f51f-46b2-9c5b-5482df45f32d
billmaketime	string	否	制单时间 示例：2025-06-24 20:12:08
creator	string	否	创建人 示例：50be6c73-f51f-46b2-9c5b-5482df45f32d
creationtime	string	否	创建时间 示例：2025-06-24 20:12:08
bodyvos	object	是	表体数据
_status	string	否	操作状态 示例：Update
errorDetail	string	否	errorDetail

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"bill_code": "ZCDR202506240001",
		"bill_date": "2025-06-24",
		"bill_status": 0,
		"verifystate": 0,
		"pk_ownerorg_out": "2206074174684790791",
		"pk_ownerorg_in": "",
		"pk_ownerunit_in": "2246357514780147713",
		"pk_org": "2246357514780147713",
		"busi_type": "",
		"postAccountStatus": 99,
		"bill_type": "4A34",
		"pk_transitype": "AM_4A34-01",
		"transi_type": "4A34-01",
		"pk_ownerunit_out": "2206074174684790791",
		"pk_org_v": "",
		"pk_currency": "2048140315882684706",
		"total_amount": 0,
		"pk_ownerorg_out_v": "",
		"pk_ownerorg_in_v": "",
		"pk_ownerunit_out_v": "",
		"pk_currency_in": "2048140315882684706",
		"pk_ownerunit_in_v": "",
		"pk_usedorg_out_v": "",
		"currrate": 1,
		"currrate_type": "0000LYWFBS37G85RUT0000",
		"pk_usedorg_in_v": "",
		"currrate_date": "2025-06-24",
		"total_amount_currency": 0,
		"notaxtotal_amount": 0,
		"notaxtotal_amount_currency": 0,
		"total_amount_tax": 0,
		"total_amount_tax_currency": 0,
		"actual_invoice_amount": 0,
		"actual_invoice_amount_currency": 0,
		"id": "2298384128676986880",
		"pubts": "2025-06-24 20:12:09",
		"tenant": "0000LYWFBS37G85RUT0000",
		"sysid": "AUM",
		"isWfControlled": false,
		"returncount": 0,
		"billmaker": "50be6c73-f51f-46b2-9c5b-5482df45f32d",
		"billmaketime": "2025-06-24 20:12:08",
		"creator": "50be6c73-f51f-46b2-9c5b-5482df45f32d",
		"creationtime": "2025-06-24 20:12:08",
		"bodyvos": [
			{
				"origin_value": 90000,
				"real_opening_amount": 0,
				"accu_dep": 0,
				"real_opening_amount_currency": 0,
				"src_pk_bill_b": "2298384034187706377",
				"notaxassets_amount": 90000,
				"pk_org": "2246357514780147713",
				"assets_amount_tax": 0,
				"pk_manager_before": "2068760986472415233",
				"service_month": 3000,
				"used_month": 0,
				"id": "2298384128676986881",
				"pk_status_after": "PRESET01_0000LYWFBS37G85RUT0000",
				"new_value": 90000,
				"tenant": "0000LYWFBS37G85RUT0000",
				"pk_usedept_before": "2230069486951596034",
				"pk_mandept_after": "2246894265430966272",
				"pk_currency": "2048140315882684706",
				"assets_amount_tax_currency": 0,
				"pre_devaluate": 0,
				"pk_mandept_before": "2230069486951596034",
				"pk_usedorg_out": "2206074174684790791",
				"pk_addreducestyle": "2048140324497260604",
				"salvage": 900,
				"invoicing_flag": false,
				"stock_in_flag": false,
				"src_pk_bill": "2298384034187706376",
				"salvage_rate": 1,
				"src_bill_type": "4A33",
				"pk_user_before": "2230021039745138697",
				"begin_date": "2024-09-29",
				"pk_location_before": "2230525724171698179",
				"notaxassets_amount_currency": 90000,
				"dep_amount": 0,
				"pubts": "2025-06-24 20:12:08",
				"bill_code_src": "ZCDC202506240002",
				"rowno": "10",
				"assets_amount": 90000,
				"main_id": "2298384128676986880",
				"src_transitype": "4A33-01",
				"pk_equip": "2278925521650188301",
				"assets_amount_currency": 90000,
				"net_money": 90000,
				"pk_usedorg_in": "2246357514780147713",
				"_status": "Update"
			}
		],
		"_status": "Update"
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

