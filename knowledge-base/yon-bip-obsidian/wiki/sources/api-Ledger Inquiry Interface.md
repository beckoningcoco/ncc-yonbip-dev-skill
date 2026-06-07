---
title: "账簿查询接口"
apiId: "4dd35a37ce13410e8fc1f6f7e328ff60"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Account Book"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Account Book]
platform_version: "BIP"
source_type: community-api-docs
---

# 账簿查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Account Book (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fipub/basedoc/querybd/accbook

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
| fields | string | 是 | 否 | 需要查询的数据列，默认为id、code、name三列（取值枚举 id：唯一标识，code：账簿编码，name：账簿名称，ts：创建时间） 示例：["id","code","name"] |
| pageIndex | long | 否 | 否 | 查询页码，默认为1 示例：1 |
| pageSize | long | 否 | 否 | 查询数量，默认1000 示例：3 |
| conditions | object | 是 | 否 | 查询条件数组 |
| field | string | 否 | 否 | 查询条件中的字段名称（取值枚举 id：唯一标识，code：账簿编码，name：账簿名称，ts：创建时间） 示例：ts |
| value | string | 否 | 否 | 查询条件中字段的值 示例：2019-10-23 14:00:37 |
| operator | string | 否 | 否 | 查询条件中字段的比对方式，默认是“=”（取值 "<"，"="，">"，"<="，">="，"<>"） 示例：>= |

## 3. 请求示例

Url: /yonbip/fi/fipub/basedoc/querybd/accbook?access_token=访问令牌
Body: {
	"fields": [
		"id",
		"code",
		"name"
	],
	"pageIndex": 1,
	"pageSize": 3,
	"conditions": [
		{
			"field": "ts",
			"value": "2019-10-23 14:00:37",
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
| success | boolean | 否 | 请求标识（true：成功，false：失败） 示例：true |
| code | int | 否 | 响应码（200：正常，0：异常） 示例：200 |
| total | int | 否 | 查询的数据量（data的数组长度） 示例：1 |
| data | object | 是 | 查询数据，会根据请求参数中设置的fields进行取值（假如 fields=["id","code","name","ts"]） |
| id | string | 否 | 账簿ID 示例：00D6AE84-05E3-40DF-BD2C-690381CD8C85 |
| code | string | 否 | 账簿code 示例：0506 |
| name | string | 否 | 账簿名称 示例：0506肯德基国际准则账簿 |
| ts | string | 否 | 账簿创建时间 示例：2020-10-23 14:00:37 |

## 5. 正确返回示例

{
	"success": true,
	"code": 200,
	"total": 1,
	"data": [
		{
			"id": "00D6AE84-05E3-40DF-BD2C-690381CD8C85",
			"code": "0506",
			"name": "0506肯德基国际准则账簿",
			"ts": "2020-10-23 14:00:37"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

0	查询失败	按照message提示修改


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

