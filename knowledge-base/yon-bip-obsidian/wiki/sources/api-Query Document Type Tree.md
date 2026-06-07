---
title: "查询单据类型树"
apiId: "02013ac5a2bd4087a6526e6809b3953d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transaction Type"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transaction Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询单据类型树

> `ContentType	application/json` 请求方式	POST | 分类: Transaction Type (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/transtype/tree

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |

## 3. 请求示例

Url: /yonbip/digitalModel/transtype/tree?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 是 | 单据类型树结构 |
| id | string | 否 | 主键 示例：7f147398-d4bf-4697-97a7-c858edcc01e5 |
| code | string | 否 | 领域编码 示例：SD |
| name | string | 否 | 领域名称 示例：营销服务 |
| level | string | 否 | 层级 示例：1 |
| children | object | 是 | 领域下的应用列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "7f147398-d4bf-4697-97a7-c858edcc01e5",
			"code": "SD",
			"name": "营销服务",
			"level": "1",
			"children": [
				{
					"id": "65d6edfa-7517-4556-9485-585c52146c51",
					"code": "SCMSA",
					"name": "销售管理",
					"level": "2 ",
					"parent": "7f147398-d4bf-4697-97a7-c858edcc01e5",
					"children": [
						{
							"id": "SCMSA1",
							"code": "SCMSA.voucher_order",
							"name": "服务合同",
							"parent": "65d6edfa-7517-4556-9485-585c52146c51",
							"level": "3",
							"path": "SCMSA1",
							"isCoreBill": "1",
							"formId": "SCMSA.voucher_order"
						}
					]
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-30

更新

返回参数 (22)

新增

错误码 999


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

