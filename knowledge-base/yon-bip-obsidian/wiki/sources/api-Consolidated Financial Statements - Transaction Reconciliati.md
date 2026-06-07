---
title: "合并报表-查询交易对账报告"
apiId: "2365789285181292545"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-查询交易对账报告

> `ContentType	application/json` 请求方式	POST | 分类: Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/open/balaccount/querytradecontrast

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
| pkCube | string | 否 | 是 | 应用模型主键（来自于【合并报表获取租户模型接口】接口返回值 cubeId） |
| sysAppCode | string | 否 | 是 | 节点编码，固定值 使用默认值就可以 默认值：BCS11002 |
| templateName | string | 否 | 是 | 对账模板名称 |
| balanceType | string | 否 | 否 | 筛选平衡笔数， 1 平衡 2 不平衡，为空则是查全部的值 |
| codeYear | string | 否 | 是 | 年 |
| codePeriod | string | 否 | 是 | 期间 |
| scenario | string | 否 | 否 | 业务方案可以为空，空值就会按照模板里设置的值执行查询；不为空，就会按照所填的值进行查询 |
| version | string | 否 | 否 | 版本可以为空，空值默认为 v0；不为空，就会按照所填的值进行查询 |
| entity | string | 否 | 否 | 组织/层级组织，可以为空，空值就会按照模板里设置的值执行查询；不为空，就会按照所填的值进行查询 示例：= |
| icp | string | 否 | 否 | 对方组织/范围组织，可以为空，空值就会按照模板里设置的值执行查询；不为空，就会按照所填的值进行查询 |

## 3. 请求示例

Url: /yonbip/FCC/open/balaccount/querytradecontrast?access_token=访问令牌
Body: {
	"pkCube": "",
	"sysAppCode": "",
	"templateName": "",
	"balanceType": "",
	"codeYear": "",
	"codePeriod": "",
	"scenario": "",
	"version": "",
	"entity": "=",
	"icp": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回编码 示例：200 |
| data | object | 是 | 返回数据 |
| templateName | string | 否 | 对账模板名称 示例：111 |
| result | object | 否 | 对账结果 |
| success | string | 否 | 是否成功 示例：true |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"templateName": "111",
			"result": {
				"rows": [
					{
						"values": {
							"version": {
								"name": "默认版本",
								"value": "v0",
								"display": ""
							},
							"unikeyList": {
								"value": "1k9.1nc.1kqs.79.32.e.cm1g.jap.s7.2je.1r.tap.hs7.",
								"display": "1k9.1nc.1kqs.79.32.e.cm1g.jap.s7.2je.1r.tap.hs7."
							},
							"diffFlag": {
								"value": "true",
								"display": "true"
							},
							"properties": {},
							"entity": {
								"name": "A11",
								"value": "A1.A11",
								"display": "A11"
							},
							"icp": {
								"name": "A2",
								"value": "A2",
								"display": "A2"
							},
							"account": {
								"name": "Acc",
								"value": "Acc",
								"display": "Acc"
							},
							"selfentity": {
								"value": "44.00",
								"display": "44.00"
							},
							"oppentity": {
								"value": "",
								"display": ""
							},
							"diff": {
								"value": "",
								"display": ""
							},
							"c1": {
								"value": "[None]",
								"display": "[None]"
							},
							"c2": {
								"value": "[None]",
								"display": "[None]"
							},
							"plugaccount": {
								"value": "plug",
								"display": "plug"
							},
							"unikey": {
								"value": "1k9.1nc.1kqs.79.32.e.cm1g.jap.s7.2je.1r.tap.hs7.",
								"display": "1k9.1nc.1kqs.79.32.e.cm1g.jap.s7.2je.1r.tap.hs7."
							},
							"diffreason": {
								"value": "",
								"display": ""
							},
							"balance": {
								"value": "false",
								"display": "false"
							},
							"c3": {
								"value": "",
								"display": ""
							},
							"c4": {
								"value": "",
								"display": ""
							},
							"c5": {
								"value": "",
								"display": ""
							},
							"c6": {
								"value": "",
								"display": ""
							},
							"c7": {
								"value": "",
								"display": ""
							},
							"c8": {
								"value": "",
								"display": ""
							},
							"c9": {
								"value": "",
								"display": ""
							},
							"c10": {
								"value": "",
								"display": ""
							}
						}
					}
				]
			}
		}
	],
	"success": "true"
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

