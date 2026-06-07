---
title: "资产卡片弃审删除生成固定资产卡片业务消息_混合云集成"
apiId: "2460066841003294728"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Card"
domain: "APS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产卡片弃审删除生成固定资产卡片业务消息_混合云集成

>  请求方式	POST | Asset Card (APS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/equipIntegrate/unapprove
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
routingkey	string	否	否	路由键 默认值：aic
equip_name	string	否	是	资产名称
equip_code	string	否	是	资产编码
pk_org	string	否	否	资产组织
pk_location	string	否	否	位置
spec	string	否	否	规格
model	string	否	否	型号
pk_category	string	否	否	资产类别
techvalue	string	否	否	技术参数
pk_used_status	string	否	否	资产使用状态
pk_priority	string	否	否	关键程度
start_used_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	投用日期
pk_mandept	string	否	否	管理部门
pk_usedept	string	否	否	使用部门
pk_user	string	否	否	责任人
transi_type_src	string	否	否	来源交易类型编码
bill_code_src	string	否	否	来源单据编码
parent_code	string	否	否	资产组织编码
id	string	否	否	主键

## 3. 请求示例

Url: /yonbip/ACC/equipIntegrate/unapprove?access_token=访问令牌
Body: {
	"routingkey": "",
	"equip_name": "",
	"equip_code": "",
	"pk_org": "",
	"pk_location": "",
	"spec": "",
	"model": "",
	"pk_category": "",
	"techvalue": "",
	"pk_used_status": "",
	"pk_priority": "",
	"start_used_date": "2026-06-07 13:20:24",
	"pk_mandept": "",
	"pk_usedept": "",
	"pk_user": "",
	"transi_type_src": "",
	"bill_code_src": "",
	"parent_code": "",
	"id": ""
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
routingkey	string	否	路由键 默认值：aic
equip_name	string	否	资产名称
equip_code	string	否	资产编码
pk_org	string	否	资产组织
pk_location	string	否	位置
spec	string	否	规格
model	string	否	型号
pk_category	string	否	资产类别
techvalue	string	否	技术参数
pk_used_status	string	否	资产使用状态
pk_priority	string	否	关键程度
start_used_date	date
格式:yyyy-MM-dd HH:mm:ss	否	投用日期
pk_mandept	string	否	管理部门
pk_usedept	string	否	使用部门
pk_user	string	否	责任人
transi_type_src	string	否	来源交易类型编码
bill_code_src	string	否	来源单据编码
parent_code	string	否	资产组织编码
id	string	否	主键

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"routingkey": "",
		"equip_name": "",
		"equip_code": "",
		"pk_org": "",
		"pk_location": "",
		"spec": "",
		"model": "",
		"pk_category": "",
		"techvalue": "",
		"pk_used_status": "",
		"pk_priority": "",
		"start_used_date": "2026-06-07 13:20:24",
		"pk_mandept": "",
		"pk_usedept": "",
		"pk_user": "",
		"transi_type_src": "",
		"bill_code_src": "",
		"parent_code": "",
		"id": ""
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

