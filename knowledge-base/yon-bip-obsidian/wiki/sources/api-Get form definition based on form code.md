---
title: "根据表单编码获取表单定义"
apiId: "2331734798721613830"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planning, Budgeting& Forecasting"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planning, Budgeting& Forecasting]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据表单编码获取表单定义

> `ContentType	application/json` 请求方式	POST | 分类: Planning, Budgeting& Forecasting (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/bp/form/getFormDefine

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| formCode | string | 否 | 否 | 表单编码 |

## 3. 请求示例

Url: /yonbip/FCC/bp/form/getFormDefine?access_token=访问令牌
Body: {
	"formCode": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| data | object | 否 | data |
| formPk | string | 否 | formPk 示例：2310255744593690628 |
| formCode | string | 否 | formCode 示例：hjpf1_7RQhYpDWdgKFVQ |
| formName | string | 否 | formName 示例：hjpf1_copy_4ezaq |
| pkWorkbook | string | 否 | 文件夹PK 示例：2287648522725490693 |
| cubeCode | string | 否 | cubeCode 示例：hjpCube |
| cubeName | string | 否 | cubeName 示例：hjpCube |
| dimCodeNameMap | object | 否 | dimCodeNameMap |
| dimHierCodeMap | object | 否 | dimHierCodeMap |
| fixDims | object | 是 | 固定维 |
| paramDims | object | 是 | 参数维 |
| areas | object | 是 | 数据区 |
| success | boolean | 否 | success 示例：true |

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"formPk": "2310255744593690628",
		"formCode": "hjpf1_7RQhYpDWdgKFVQ",
		"formName": "hjpf1_copy_4ezaq",
		"pkWorkbook": "2287648522725490693",
		"cubeCode": "hjpCube",
		"cubeName": "hjpCube",
		"dimCodeNameMap": {
			"ENTITY": "组织",
			"YEARS": "年（期间）",
			"PERIOD": "期间",
			"ACCOUNT": "科目",
			"SCENARIO": "业务方案",
			"CURRENCY": "币种",
			"VERSION": "版本"
		},
		"dimHierCodeMap": {
			"ENTITY": "hjpEntity",
			"YEARS": "YQM",
			"PERIOD": "YQM",
			"ACCOUNT": "hjpAccount",
			"SCENARIO": "SCENARIO",
			"CURRENCY": "CURRENCY",
			"VERSION": "VERSION"
		},
		"fixDims": [
			{
				"dimCode": "CURRENCY",
				"memberExpressions": [
					"CNY"
				]
			}
		],
		"paramDims": [
			{
				"dimCode": "ENTITY",
				"memberExpressions": [
					"gxtest1",
					"gxtest2"
				]
			}
		],
		"areas": [
			{
				"rowGroups": [
					{
						"type": "row",
						"dimExpressions": [
							{
								"dimCode": "ACCOUNT",
								"memberExpressions": [
									"&TASKPROP&",
									"062501",
									"hjpAcc1enum"
								]
							}
						]
					}
				],
				"colGroups": [
					{
						"type": "col",
						"dimExpressions": [
							{
								"dimCode": "YEARS",
								"memberExpressions": [
									"2022"
								]
							}
						]
					}
				]
			}
		]
	},
	"success": true
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

