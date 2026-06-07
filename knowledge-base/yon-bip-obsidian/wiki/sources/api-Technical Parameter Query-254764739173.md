---
title: "技术参数查询"
apiId: "2547647391730761733"
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

# 技术参数查询

>  请求方式	POST | Asset Card (APS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/equip/queryparams
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
data	object	是	是	技术参数
id	string	否	是	资产类别主键
cardId	string	否	是	资产卡片主键

## 3. 请求示例

Url: /yonbip/ACC/equip/queryparams?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "",
			"cardId": ""
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
code	string	否	编码 示例：200
message	string	否	提示信息 示例：操作成功！
data	object	否	数据
msgCode	number
小数位数:0,最大长度:10	否	消息编码 示例：1
isCancel	boolean	否	是否取消 示例：false
isActionCancel	boolean	否	是否执行取消 示例：false
data	object	否	数据
messages	string	是	消息集合 示例：[]
code	string	否	编码 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"msgCode": 1,
		"isCancel": false,
		"isActionCancel": false,
		"data": {
			"techvos": [
				{
					"dr": "0",
					"id": "2547563871792529418",
					"pk_equip": "2547563863202594819",
					"pubts": "2026-05-26 14:04:28",
					"tech_id": "2344284392532213761",
					"tech_index": "1",
					"tech_showname": "字符串1"
				}
			],
			"catetech": [
				{
					"dr": "0",
					"pubts": "2025-08-25 16:30:23",
					"id": "2344284392532213761",
					"param_index": 1,
					"classid": "PRESET01_0000MEIF5RL46GI70J0000",
					"input_length": 11,
					"nullflag": false,
					"pk_category": "2344284392532213760",
					"show_name": "字符串1",
					"param_name": "字符串1",
					"dataType": "Input",
					"controlType": "String",
					"entity_name": "字符串"
				}
			]
		},
		"messages": [],
		"code": "0"
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

