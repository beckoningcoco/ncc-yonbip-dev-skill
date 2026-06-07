---
title: "待建卡资产保存"
apiId: "1894444644929372161"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Card-to-Create Assets"
domain: "APS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Card-to-Create Assets]
platform_version: "BIP"
source_type: community-api-docs
---

# 待建卡资产保存

>  请求方式	POST | Card-to-Create Assets (APS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/preCreateEquip/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	待建卡资产数据集
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
pk_org_code	string	否	是	资产组织编码 示例：001
pk_org	string	否	否	资产组织ID 示例：123456789
pk_icorg_code	string	否	否	库存组织编码 示例：001
pk_icorg	string	否	否	库存组织ID 示例：987654321
pk_icorg_name	string	否	否	库存组织名称 示例：库存组织
pk_material_code	string	否	否	物料编码 示例：BJWL
pk_material	string	否	否	物料ID 示例：111111111
pk_material_name	string	否	否	物料名称 示例：备件物料
num	int	否	是	数量 示例：2
pk_currency_purc_str	string	否	否	采购币种（名称或编码） 示例：CNY
pk_currency_purc	string	否	否	采购币种ID 示例：9999999999
purc_price_tax	number
小数位数:8,最大长度:28	否	否	含税单价 示例：20.695
purc_price	number
小数位数:8,最大长度:28	否	否	无税单价 示例：19.762
tax	number
小数位数:-1,最大长度:28	否	否	税金 示例：0.933
pk_material_sku_code	string	否	否	物料sku编码 示例：物料A
pk_material_sku_name	string	否	否	物料sku名称 示例：设备物料A
pk_material_batchno	string	否	否	批次号 示例：9999
serial_num	string	否	否	序列号 示例：123,456
origin_system	string	否	是	来源系统 示例：外系统
origin_system_bill_type	string	否	是	来源单据类型 示例：采购
bill_code	string	否	是	来源单据编号 示例：CG9991
bill_date	Date	否	否	来源单据日期 示例：2023-12-29
equip_name	string	否	否	资产名称 示例：待建卡资产
pk_used_status_str	string	否	否	资产状态（名称或编码） 示例：在用
start_used_date	Date	否	否	投用日期 示例：2023-12-29
spec	string	否	否	规格 示例：规格
model	string	否	否	型号 示例：型号
pk_category_str	string	否	否	资产类别（名称或编码） 示例：202304280001
pk_priority_str	string	否	否	关键程度（名称或编码） 示例：01
pk_supplier_str	string	否	否	供应商（名称或编码） 示例：0011000061
pk_supplier	string	否	否	供应商ID 示例：66666666
facturer_name	string	否	否	生产厂商 示例：HUAWEI
precoding	string	否	否	出厂编码 示例：99999
fa_flag	boolean	否	否	固定资产核算 示例：true
special_flag	boolean	否	否	特种设备 示例：true
measure_instrument	boolean	否	否	计量器具 示例：true
memo	string	否	否	备注 示例：这是一条待建卡数据

## 3. 请求示例

Url: /yonbip/am/preCreateEquip/save?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"pk_org_code": "001",
			"pk_org": "123456789",
			"pk_icorg_code": "001",
			"pk_icorg": "987654321",
			"pk_icorg_name": "库存组织",
			"pk_material_code": "BJWL",
			"pk_material": "111111111",
			"pk_material_name": "备件物料",
			"num": 2,
			"pk_currency_purc_str": "CNY",
			"pk_currency_purc": "9999999999",
			"purc_price_tax": 20.695,
			"purc_price": 19.762,
			"tax": 0.933,
			"pk_material_sku_code": "物料A",
			"pk_material_sku_name": "设备物料A",
			"pk_material_batchno": "9999",
			"serial_num": "123,456",
			"origin_system": "外系统",
			"origin_system_bill_type": "采购",
			"bill_code": "CG9991",
			"bill_date": "2023-12-29",
			"equip_name": "待建卡资产",
			"pk_used_status_str": "在用",
			"start_used_date": "2023-12-29",
			"spec": "规格",
			"model": "型号",
			"pk_category_str": "202304280001",
			"pk_priority_str": "01",
			"pk_supplier_str": "0011000061",
			"pk_supplier": "66666666",
			"facturer_name": "HUAWEI",
			"precoding": "99999",
			"fa_flag": true,
			"special_flag": true,
			"measure_instrument": true,
			"memo": "这是一条待建卡数据"
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
code	string	否	状态码 示例：200
message	string	否	消息 示例：操作成功！
data	object	否	返回数据
count	long	否	总数 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
messages	string	是	消息
infos	object	是	详细信息
failInfos	string	是	错误信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"pk_org_code": "001",
				"pk_icorg_code": "001",
				"pk_icorg_name": "库存组织",
				"pk_material_code": "001",
				"pk_material_name": "待建卡物料",
				"pk_currency_purc_str": "RMB",
				"purc_price_tax": 10,
				"purc_price": 5,
				"tax": 5,
				"pk_material_sku_code": "001",
				"pk_material_sku_name": "待建卡物料SKU",
				"pk_material_batchno": "999",
				"serial_num": "123,456",
				"origin_system": "外系统",
				"origin_system_bill_type": "采购",
				"bill_code": "001",
				"bill_date": "2023-12-29",
				"equip_name": "待建卡资产",
				"pk_used_status_str": "01",
				"start_used_date": "2023-12-29",
				"spec": "规格",
				"model": "型号",
				"pk_category_str": "001",
				"pk_priority_str": "001",
				"pk_supplier_str": "001",
				"facturer_name": "华为",
				"precoding": "0001",
				"fa_flag": true,
				"special_flag": true,
				"measure_instrument": true,
				"memo": ""
			}
		],
		"failInfos": [
			""
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
999	系统异常，请稍后再试	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-18	
更新
请求说明
修改api描述

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

