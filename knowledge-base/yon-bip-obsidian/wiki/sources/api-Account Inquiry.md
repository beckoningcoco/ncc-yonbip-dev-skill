---
title: "科目查询"
apiId: "fdd8143df4164ae7ab4a03f042b163cb"
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

# 科目查询

> `ContentType	application/json` 请求方式	POST | 分类: Accounts (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fipub/basedoc/querybd

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
| fields | string | 是 | 否 | 档案属性:主键、编码、名称、辅助核算 示例：["id","code","name","multidimension"] |
| pageIndex | long | 否 | 否 | 页号 示例：1 |
| pageSize | long | 否 | 否 | 每页行数 示例：20 |
| conditions | object | 是 | 否 | 自定义查询条件 |
| value | string | 否 | 否 | 值 示例：2019-10-23 14:00:37 |
| field | string | 否 | 否 | 作为查询条件的字段，ts:日期,accsubjectchart:科目表,pk_org：组织机构等，pk_org -是通过组织机构查询已启用总账主账簿下的科目表，然后将科目表作为查询条件进行过滤。 示例：ts，pk_org |
| operator | string | 否 | 否 | 操作符,>=,=,<= 示例：>= |

## 3. 请求示例

Url: /yonbip/fi/fipub/basedoc/querybd?access_token=访问令牌
Body: {
	"fields": [
		"id",
		"code",
		"name",
		"multidimension"
	],
	"pageIndex": 1,
	"pageSize": 20,
	"conditions": [
		{
			"value": "2019-10-23 14:00:37",
			"field": "ts，pk_org",
			"operator": ">="
		}
	]
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
| code | string | 否 | code 示例：200 |
| data | object | 是 | 调用成功时的返回数据 |
| name | string | 否 | 名称 示例：xx |
| code | string | 否 | 编码 示例：xx |
| id | string | 否 | 主键 示例：xx |
| message | string | 否 | 调用失败时的错误信息 |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"name": "xx",
			"code": "xx",
			"id": "xx"
		}
	],
	"message": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

code	0


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

