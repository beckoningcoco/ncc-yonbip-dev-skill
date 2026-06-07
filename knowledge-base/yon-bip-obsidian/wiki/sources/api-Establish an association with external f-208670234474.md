---
title: "与外部固定资产建立关联"
apiId: "2086702344746041345"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset/Fixed Asset Relationship Settings"
domain: "APS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset/Fixed Asset Relationship Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 与外部固定资产建立关联

>  请求方式	POST | Asset/Fixed Asset Relationship Settings (APS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/associateoutercard/save
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
pk_org	string	否	是	资产组织 示例：199828999123
pk_fiorg	string	否	是	会计主体 示例：18898828288182
pk_fiorg__code	string	否	是	会计组织编码 示例：KKP-00001
equip_code	string	否	否	资产卡片编码 示例：EAM202409121211
pk_equip	string	否	是	资产卡片ID 示例：209988728102122
asset_code	string	否	是	固定资产卡片编码 示例：112312312312
id	string	否	是	资产卡片ID 示例：209988728102122
associate_flag	boolean	否	是	关联固定资产 示例：true

## 3. 请求示例

Url: /yonbip/am/associateoutercard/save?access_token=访问令牌
Body: [{
	"pk_org": "199828999123",
	"pk_fiorg": "18898828288182",
	"pk_fiorg__code": "KKP-00001",
	"equip_code": "EAM202409121211",
	"pk_equip": "209988728102122",
	"asset_code": "112312312312",
	"id": "209988728102122",
	"associate_flag": true
}]

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
code	string	否	返回Http状态码（200：成功，其他：失败 示例：200
message	string	否	返回信息 示例：调用成功
data	object	是	返回数据
equi_code	string	否	资产编码 示例：EAM12090239123
pk_org	string	否	资产组织 示例：120219309123
associate_flag	boolean	否	关联固定资产 示例：true
pk_fiorg	string	否	会计主体 示例：120219309123
pk_equip	string	否	资产卡片ID 示例：21387891999122
pk_card	string	否	固定资产卡片ID 示例：232312312
asset_code	string	否	固定资产编码 示例：ASSET09098321
errormsg	string	否	错误信息 示例：固定资产卡片不存在
begin_date	string	否	开始使用日期 示例：2024-09-01
service_month	string	否	使用月限 示例：12
used_month	string	否	已计提月份 示例：1
origin_value	string	否	原值 示例：100.00
accu_dep	string	否	累计折旧 示例：12
new_value	string	否	净值 示例：99.00

## 5. 正确返回示例

{
	"code": "200",
	"message": "调用成功",
	"data": [
		{
			"equi_code": "EAM12090239123",
			"pk_org": "120219309123",
			"associate_flag": true,
			"pk_fiorg": "120219309123",
			"pk_equip": "21387891999122",
			"pk_card": "232312312",
			"asset_code": "ASSET09098321",
			"errormsg": "固定资产卡片不存在",
			"begin_date": "2024-09-01",
			"service_month": "12",
			"used_month": "1",
			"origin_value": "100.00",
			"accu_dep": "12",
			"new_value": "99.00"
		}
	]
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
999	服务端逻辑异常	服务端逻辑异常

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

