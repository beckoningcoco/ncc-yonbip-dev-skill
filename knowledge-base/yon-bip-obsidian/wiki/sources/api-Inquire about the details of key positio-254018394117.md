---
title: "查询关键岗位详情"
apiId: "2540183941170593801"
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

# 查询关键岗位详情

>  请求方式	GET | Succession (TLNT)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/otd/openApi/kp/detail
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
positionId	string	query	是	关键岗位标识

## 3. 请求示例

Url: /yonbip/HCC/otd/openApi/kp/detail?access_token=访问令牌&positionId=

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
data	object	否	data
code	string	否	code 示例：123123
PositionTagRelationList	object	是	PositionTagRelationList
talentStandardName	string	否	talentStandardName 示例：2603人才标准
deptId	string	否	deptId 示例：2330006787465412618
description	object	否	description
successorTalentStandardId	string	否	successorTalentStandardId 示例：2491226167411474441
talentStandardId	string	否	talentStandardId 示例：2491226167411474441
size	number
小数位数:0,最大长度:10	否	size 示例：3
responsibility	object	否	responsibility
enable	string	否	enable 示例：1
KeyStaffVOList	object	是	KeyStaffVOList
successorTalentStandardName	string	否	successorTalentStandardName 示例：2603人才标准
name	object	否	name
id	string	否	id 示例：2521589679227666442
SuccessorVOList	object	是	SuccessorVOList

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "123123",
		"PositionTagRelationList": [
			{
				"positionName": "2604修改名称岗位",
				"positionId": "2521589679227666442",
				"tagId": "2434096694283468808",
				"id": "2526805728028000270",
				"tagName": "123123"
			}
		],
		"talentStandardName": "2603人才标准",
		"deptId": "2330006787465412618",
		"description": {
			"zh_CN": "描述A"
		},
		"successorTalentStandardId": "2491226167411474441",
		"talentStandardId": "2491226167411474441",
		"size": 3,
		"responsibility": {
			"zh_CN": "职责1"
		},
		"enable": "1",
		"KeyStaffVOList": [
			{
				"assgId": "2419064154126549002",
				"deptName": "部门A",
				"keyPostId": "2521589679227666442",
				"staffCode": "00000005",
				"isMainJob": false,
				"staffName": "贾雷",
				"id": "2526805728028000267",
				"source": "KP",
				"staffId": "2419064154126549001",
				"assgType": 1,
				"name": "贾雷",
				"code": "00000005",
				"sex": 1,
				"age": 39,
				"divisionAge": 1.4,
				"deptId": "2330007045169741828",
				"OrgName": "ligj总公司",
				"OrgId": "2330006787465412618",
				"ifCompetent": false,
				"matchDegree": "11%",
				"matchLevel": "低",
				"cptScore": 11
			}
		],
		"successorTalentStandardName": "2603人才标准",
		"name": {
			"zh_CN": "2604修改名称岗位"
		},
		"id": "2521589679227666442",
		"SuccessorVOList": [
			{
				"standard": 0,
				"source": "SUCCESSOR_MANAGE",
				"joinDate": "2026-03-11",
				"readinessName": "一级准备",
				"readinessId": "2329995165280239690",
				"bizId": "2521589679227666442",
				"id": "2521589679227666473",
				"readinessLevel": 3,
				"staffId": "2482252108128059392",
				"photo": "",
				"name": "张敬",
				"code": "00000007",
				"sex": 2,
				"age": 35,
				"divisionAge": 0.2,
				"deptName": "部门名称-多语",
				"deptId": "2479309711926099974",
				"OrgName": "公司名称-多语",
				"OrgId": "2479309230889762826"
			}
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

