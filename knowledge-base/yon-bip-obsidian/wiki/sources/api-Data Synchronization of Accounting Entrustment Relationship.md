---
title: "核算委托关系数据同步"
apiId: "47d824750eff48a68fe83e54ed3dfbc2"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 核算委托关系数据同步

> `ContentType	application/json` 请求方式	GET | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/accountdelegate/qrydelegate

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| admin_org | string | query | 否 | 业务单元    示例: 1293432671916288 |
| fin_org | string | query | 否 | 会计主体    示例: 1293256121766144 |
| isDefault | int | query | 否 | 是否默认 0非默认；1：默认 |
| enable | int | query | 否 | 状态 0:未启用、1:启用、2:停用    示例: 1 |
| pubts | string | query | 否 | 时间戳(返回大于等于当前值的数据)    示例: 2019-07-23 23:00:35 |
| pageSize | string | query | 否 | 当前页大小    示例: 10 |
| pageIndex | string | query | 否 | 当前页数    示例: 1 |

## 3. 请求示例

Url: /yonbip/digitalModel/accountdelegate/qrydelegate?access_token=访问令牌&admin_org=1293432671916288&fin_org=1293256121766144&isDefault=&enable=1&pubts=2019-07-23%2023%3A00%3A35&pageSize=10&pageIndex=1

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | int | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据集合 |
| pageIndex | int | 否 | 当前页数 示例：0 |
| pageSize | int | 否 | 每页行数 示例：0 |
| recordCount | int | 否 | 总数 示例：7 |
| recordList | object | 是 | 数据列表 |
| pageCount | int | 否 | 总页数 示例：0 |
| beginPageIndex | int | 否 | 开始页码（第一页） 示例：1 |
| endPageIndex | int | 否 | 结束页码（有多少页） 示例：1 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 7,
		"recordList": [
			{
				"finOrg": "0548746360f64217bf34f6940a4247a5",
				"adminOrg_name": "云创采购组织",
				"enable": 1,
				"adminOrg": "1000001",
				"finOrg_name": "盖天力公司",
				"creationtime": "2019-07-04 20:34:24",
				"isDefault": 0,
				"id": "1295051391357184",
				"dr": 1,
				"pubts": "2019-07-04 20:36:17"
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000512

查询数据为空


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

