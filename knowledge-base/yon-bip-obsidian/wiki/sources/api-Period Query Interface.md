---
title: "期间查询接口"
apiId: "ca0fd6f572ce49d8aee8f42b32b3eabc"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Voucher"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Voucher]
platform_version: "BIP"
source_type: community-api-docs
---

# 期间查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Voucher (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fipub/basedoc/querybd/accperiod

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
| fields | string | 是 | 否 | 要查询的字段集合 示例：["id","code","name"] |
| pageIndex | long | 否 | 否 | 翻页索引 示例：1 |
| pageSize | long | 否 | 否 | 每页显示数量 示例：1000 |
| conditions | object | 是 | 否 | 查询where条件 |
| operator | string | 否 | 否 | 比较符号，如=，<等等 示例：= |
| value | string | 否 | 否 | field要比较的值，如1362439873777924 示例：1362439873777924 |
| field | string | 否 | 否 | 要查询的字段，如accperiodscheme 示例：accperiodscheme |
| disableshow | boolean | 否 | 否 | true：不显示，false：显示 示例：false |

## 3. 请求示例

Url: /yonbip/fi/fipub/basedoc/querybd/accperiod?access_token=访问令牌
Body: {
	"fields": [
		"id",
		"code",
		"name"
	],
	"pageIndex": 1,
	"pageSize": 1000,
	"conditions": [
		{
			"operator": "=",
			"value": "1362439873777924",
			"field": "accperiodscheme"
		}
	],
	"disableshow": false
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| success | string | 否 | 调用成功与否 示例：true |
| data | object | 否 | 返回数据 |
| id | string | 否 | id号 示例：2110181413671168 |
| code | string | 否 | 编码 示例：2020-04 |
| name | string | 否 | 名称 示例：2020-04 |
| total | string | 否 | 返回总条数 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"success": "true",
	"data": {
		"id": "2110181413671168",
		"code": "2020-04",
		"name": "2020-04"
	},
	"total": "1"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

code=0，success=false	表示查询有报错	查看message信息


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

