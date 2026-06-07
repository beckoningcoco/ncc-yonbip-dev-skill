---
title: "宗教信仰批量保存MDD"
apiId: "2445179694064599042"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Religion"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Religion]
platform_version: "BIP"
source_type: community-api-docs
---

# 宗教信仰批量保存MDD

>  请求方式	POST | Religion (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/HCC/religions/batchSave
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	ID
code	string	否	否	编码 示例：yyq24123
name	object	否	否	名称
sortnum	number
小数位数:0,最大长度:10	否	否	排序号 示例：5
description	object	否	否	描述
enable	string	否	是	启用状态，1启用 0停用 示例：1 默认值：1
country	object	是	否	适用国家/地区
_status	string	否	是	数据状态（新增：Insert、更新：Update） 示例：Insert

## 3. 请求示例

Url: /yonbip/HCC/religions/batchSave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"code": "yyq24123",
		"name": {
			"zh_CN": "中文",
			"en_US": "English",
			"zh_TW": "繁体"
		},
		"sortnum": 5,
		"description": {
			"zh_CN": "中文",
			"en_US": "English",
			"zh_TW": "繁体"
		},
		"enable": "1",
		"country": [
			{
				"countryId": "0040be98-735b-44c0-afe5-54d11a96037b",
				"country": "中国大陆",
				"_status": "Insert"
			}
		],
		"_status": "Insert"
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
code	string	否	状态码 示例：200
message	string	否	消息 示例：操作成功
data	object	否	数据
count	number
小数位数:0,最大长度:10	否	总数 示例：1
successCount	number
小数位数:0,最大长度:10	否	成功数量 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功数量 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败数量 示例：0
messages	string	是	消息列表
infos	object	是	信息列表
failInfos	string	是	失败信息列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"successCount": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": "2429557953230012417",
				"code": "yyq24123",
				"name": {
					"zh_CN": "中文",
					"en_US": "English",
					"zh_TW": "繁体"
				},
				"enable": 1,
				"sortnum": 5,
				"description": {
					"zh_CN": "中文",
					"en_US": "English",
					"zh_TW": "繁体"
				},
				"ispreset": false,
				"country": [
					{
						"id": "2429557953230012418",
						"addressTypeId": "2429557953230012417",
						"countryId": "0040be98-735b-44c0-afe5-54d11a96037b",
						"country": "中国大陆"
					}
				],
				"resubmitCheckKey": "hred_marital_card_add_43ceed36-bc6b-4007-b8db-2c741168bc25",
				"creator": "e0ad2608-c5dc-48f4-8ccf-10e86e683a60",
				"createTime": "2025-12-18 14:02:51.362",
				"pubts": "2025-12-18 14:02:51",
				"ytenant": "0000MEGS59OF7UAA8C0000"
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
999	操作失败	

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

