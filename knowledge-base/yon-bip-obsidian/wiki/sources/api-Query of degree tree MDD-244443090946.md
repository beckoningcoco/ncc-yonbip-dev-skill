---
title: "学位树查询MDD"
apiId: "2444430909469360147"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Academic Degree"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Academic Degree]
platform_version: "BIP"
source_type: community-api-docs
---

# 学位树查询MDD

>  请求方式	POST | Academic Degree (CHR)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/HCC/degree/tree
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	其他
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
ccode	string	否	否	编码
enable	string	否	否	启用状态，1启用 0停用 示例：1
cname	string	否	否	名称
country.countryId	string	是	否	国家/地区ID

## 3. 请求示例

Url: /yonbip/HCC/degree/tree?access_token=访问令牌
Body: {
	"ccode": "",
	"enable": "1",
	"cname": "",
	"country.countryId": [
		""
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
code	string	否	状态码 示例：200
message	string	否	消息 示例：操作成功
data	object	是	数据列表
country	object	是	适用国家/地区
ccode	string	否	编码 示例：010
modifier	string	否	修改人ID 示例：d3eb4588-eed1-4c07-b018-d64528d7b98c
description	object	否	描述
isEnd	boolean	否	是否结束 示例：false
modifyTime	string	否	修改时间 示例：2025-12-29 09:58:22
ispreset	boolean	否	是否预置 示例：true
children	object	是	子项列表
enable	number
小数位数:0,最大长度:10	否	启用状态 示例：1
cname	object	否	名称
id	string	否	ID 示例：HRDIWORK030000000379
sortnum	number
小数位数:0,最大长度:10	否	排序号 示例：1
modifierName	string	否	修改人姓名 示例：陈宇
pubts	string	否	时间戳 示例：2025-12-29 09:58:21

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"country": [
				{
					"country": "中国大陆",
					"id": "2437595812718444552",
					"countryId": "0040be98-735b-44c0-afe5-54d11a96037b",
					"degreefilesId": "HRDIWORK030000000379"
				}
			],
			"ccode": "010",
			"modifier": "d3eb4588-eed1-4c07-b018-d64528d7b98c",
			"description": {},
			"isEnd": false,
			"modifyTime": "2025-12-29 09:58:22",
			"ispreset": true,
			"children": [
				{
					"parent": "HRDIWORK030000000379",
					"country": [
						{
							"country": "安道尔",
							"id": "2437596087596351496",
							"countryId": "bf8fafe3-f309-11e8-817e-7cd30abea0c0",
							"degreefilesId": "HRDIWORK030000000380"
						}
					],
					"ccode": "011",
					"parentname": "高等学校教师",
					"modifier": "d3eb4588-eed1-4c07-b018-d64528d7b98c",
					"description": {},
					"isEnd": true,
					"modifyTime": "2025-12-29 09:58:54",
					"ispreset": true,
					"enable": 1,
					"cname": {
						"en_US": "Professor",
						"zh_TW": "教授",
						"zh_CN": "教授"
					},
					"id": "HRDIWORK030000000380",
					"sortnum": 2,
					"modifierName": "陈宇",
					"pubts": "2025-12-29 09:58:54"
				}
			],
			"enable": 1,
			"cname": {
				"en_US": "Teachers of higher education",
				"zh_TW": "高等學校教師",
				"zh_CN": "高等学校教师"
			},
			"id": "HRDIWORK030000000379",
			"sortnum": 1,
			"modifierName": "陈宇",
			"pubts": "2025-12-29 09:58:21"
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

