---
title: "查询已借用资产的预计归还日期"
apiId: "2546964139733417990"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Renewal Application"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Renewal Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询已借用资产的预计归还日期

>  请求方式	POST | Renewal Application (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/renewapply/context
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
id	string	否	否	资产卡片主键 示例：2076285983804358657

## 3. 请求示例

Url: /yonbip/ACC/renewapply/context?access_token=访问令牌
Body: {
	"id": "2076285983804358657"
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
data	object	否	返回数据
message	string	否	返回信息
isCancel	string	否	是否作废 示例：false
isActionCancel	string	否	是否操作作废 示例：false
messages	string	否	返回信息
code	string	否	状态码 示例：0
msgCode	string	否	状态码 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"data": {
			"alter_flag": "false",
			"appoint_flag": "0",
			"busi_status": "1",
			"expect_end_date": "2026-04-02",
			"id": "2507523309120782340",
			"main_id": "2507523309120782339",
			"pk_category": "2117157416680292360",
			"pk_equip": "2362077737758752777",
			"pk_org": "2142222364797566982",
			"pk_status_after": "PRESET01_0000M232Z6A20YFPC30000",
			"pk_status_before": "PRESET01_0000M232Z6A20YFPC30000",
			"pk_unit_used_before": "2142222364797566982",
			"pk_usedept_after": "2142222725580062729",
			"pk_usedorg": "2142222364797566982",
			"pk_user_after": "2361902915413606406",
			"pubts": "2026-04-02 15:26:56",
			"return_flag": "false",
			"status_date_after": "2025-09-18",
			"status_date_before": "2025-09-18",
			"stock_in_flag": "false",
			"stock_out_flag": "false",
			"wait_ia_flag_before": "0",
			"dr": 0,
			"audittime": "2026-04-02 15:26:56"
		},
		"message": "",
		"isCancel": "false",
		"isActionCancel": "false",
		"messages": "",
		"code": "0"
	},
	"msgCode": "0"
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
999	系统异常	

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

