---
title: "查询有权限的关键岗位列表"
apiId: "2540183992710201350"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Succession"
domain: "TLNT"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Succession]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询有权限的关键岗位列表

>  请求方式	GET | Succession (TLNT)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/otd/openApi/kp/match
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token

## 3. 请求示例

Url: /yonbip/HCC/otd/openApi/kp/match?access_token=访问令牌

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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	是	data
sourceId	string	否	sourceId 示例：2428243701815836675
deptName	string	否	deptName 示例：ligj总公司
code	string	否	code 示例：123123
description	string	否	description 示例：描述A
ksTalentStandardId	string	否	ksTalentStandardId 示例：2491226167411474441
successorTalentStandardId	string	否	successorTalentStandardId 示例：2491226167411474441
responsibility	string	否	responsibility 示例：职责1
id	string	否	id 示例：2521589679227666442
deptId	string	否	deptId 示例：2330006787465412618
version	string	否	version 示例：2521589679227666441
size	number
小数位数:0,最大长度:10	否	size 示例：3
successorTalentStandardName	string	否	successorTalentStandardName 示例：2603人才标准
name	string	否	name 示例：2604修改名称岗位
ksTalentStandardName	string	否	ksTalentStandardName 示例：2603人才标准

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"sourceId": "2428243701815836675",
			"deptName": "ligj总公司",
			"code": "123123",
			"description": "描述A",
			"ksTalentStandardId": "2491226167411474441",
			"successorTalentStandardId": "2491226167411474441",
			"responsibility": "职责1",
			"id": "2521589679227666442",
			"deptId": "2330006787465412618",
			"version": "2521589679227666441",
			"size": 3,
			"successorTalentStandardName": "2603人才标准",
			"name": "2604修改名称岗位",
			"ksTalentStandardName": "2603人才标准"
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

