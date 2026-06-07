---
title: "科目详情查询"
apiId: "fc93b73638cd435da29109fc5b85e728"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts]
platform_version: "BIP"
source_type: community-api-docs
---

# 科目详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Accounts (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fipub/accsubject/querysubjectapi

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accsubjectchart | string | 否 | 是 | 科目表主键 示例：34B3EAA4-B3A3-4E7B-8F50-6B79A2355327 |
| pk_org | string | 否 | 是 | 会计主体 示例：globalorg |
| codes | string | 否 | 否 | 编码 示例：1001 |
| names | string | 否 | 否 | 名称 示例：库存现金 |
| leaf | string | 否 | 否 | 是否叶子节点 示例：1 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳 示例：2026-03-23 11:11:11 |

## 3. 请求示例

Url: /yonbip/fi/fipub/accsubject/querysubjectapi?access_token=访问令牌
Body: {
	"accsubjectchart": "34B3EAA4-B3A3-4E7B-8F50-6B79A2355327",
	"pk_org": "globalorg",
	"codes": "1001",
	"names": "库存现金",
	"leaf": "1",
	"pubts": "2026-03-23 11:11:11"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| success | boolean | 否 | 成功标识 示例：true |
| message | string | 否 | 返回信息 示例：操作成功。 |
| data | object | 否 | 数据 |
| multidimension | object | 否 | 辅助核算 |
| accSubjects | object | 否 | 科目信息 |
| isEdits | object | 否 | 是否可修改 |
| code | long | 否 | 编码 示例：1 |
| total | long | 否 | 总计 示例：0 |

## 5. 正确返回示例

{
	"success": true,
	"message": "操作成功。",
	"data": {
		"multidimension": {
			"vr3": {
				"code": "0001",
				"name": "客户",
				"id": "4BC75559-C690-447B-8E70-26BB11716ADF"
			},
			"vr1": {
				"code": "0002",
				"name": "aaa",
				"id": "6AAE456E-A066-4B26-8F07-BACD2C2C9BD2"
			}
		},
		"accSubjects": {
			"503f7344-0eb1-11eb-bc66-0646ec0005a6": [
				{
					"accproperty": {
						"code": "0101",
						"name": "流动资产",
						"id": "503f750a-0eb1-11eb-bc66-0646ec0005a6"
					},
					"id": "293F8DA1-ACE9-47B7-9365-17EE97DA891B",
					"strongctrl": false,
					"varArray": [
						{
							"vr7": true
						}
					],
					"name3": "现金",
					"name2": "Cash on Hand",
					"displayname": "显示名称",
					"enabled": true,
					"dr": 1,
					"leaf": true,
					"subjectlevel": 1,
					"subjecttype": "资产",
					"deficitcheckstrategy": "Error",
					"name": "库存现金",
					"code": "1001",
					"numcheck": false,
					"direction": "Debit",
					"vr1": false,
					"vr3": false,
					"vr2": false,
					"parentid": {
						"id": "1731260429112967175",
						"code": "10",
						"name": "交易性金融资产"
					},
					"accsubjectchart": {
						"code": "PY0301基准科目表",
						"name": "基准科目表",
						"id": "ACC15EEA-4CC2-437E-9416-9309F0F6F484"
					},
					"mnemoniccode": "KCXJ",
					"create_time": "2026-03-23 11:11:11",
					"modify_time": "2026-03-23 11:11:11",
					"pubts": "2026-03-23 11:11:11"
				}
			]
		},
		"isEdits": {
			"97CA4D24-65D5-4743-90C5-872951F523E9": {
				"isEdit": true,
				"isAdd": true
			},
			"69457B7B-90DA-42AF-9B02-358040B72CB0": {
				"isEdit": true,
				"isAdd": true
			}
		}
	},
	"code": 1,
	"total": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

code	0


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-23

新增

请求参数 pubts

新增

返回参数 create_time

新增

返回参数 modify_time

新增

返回参数 pubts

更新

返回参数 (13)

科目详情查询-OpenApi接口入参增加pubts时间戳、出参增加pubts时间戳、create_time、modify_time

2	2025-12-03

更新

请求说明

新增

返回参数 mnemoniccode

更新

返回参数 subjectlevel

添加助记码查询字段

3	2025-06-26

新增

返回参数 (4)

更新

返回参数 displayname

更新

返回参数 enabled

更新

返回参数 leaf


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

