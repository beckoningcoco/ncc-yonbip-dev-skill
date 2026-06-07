---
title: "凭证类型查询接口"
apiId: "ceb698348d5745e4bfd681ab88bc8d00"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Voucher Type"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Voucher Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 凭证类型查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Voucher Type (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fipub/basedoc/querybd/vouchertype

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
| fields | string | 是 | 否 | 需要查询的数据列，默认为id、code、name三列（取值枚举 id：唯一标识，code：凭证编码，name：凭证名称，voucherstr：凭证字，ts：创建时间） 示例：["id","code","name"] |
| pageIndex | long | 否 | 否 | 查询页码，默认为1 示例：1 |
| pageSize | long | 否 | 否 | 查询数量，默认1000 示例：1000 |
| conditions | object | 是 | 否 | 查询条件数组 |
| field | string | 否 | 否 | 查询条件中的字段名称（取值枚举 id：唯一标识，code：凭证编码，name：凭证名称，voucherstr：凭证字，ts：创建时间） 示例：ts |
| value | string | 否 | 否 | 查询条件中字段的值 示例：2019-10-23 14:00:37 |
| operator | string | 否 | 否 | 查询条件中字段的比对方式，默认是“=”（取值 "<"，"="，">"，"<="，">="，"<>"） 示例：>= |

## 3. 请求示例

Url: /yonbip/fi/fipub/basedoc/querybd/vouchertype?access_token=访问令牌
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
| data | object | 是 | 查询数据，会根据请求参数中设置的fields进行取值（假如 fields=["id","code","name","voucherstr"]） |
| id | string | 否 | 凭证类型ID 示例：022CB294-4013-4003-97E0-77B976CDE624 |
| code | string | 否 | 凭证类型code 示例：1234 |
| name | string | 否 | 凭证类型名称 示例：1234 |
| voucherstr | string | 否 | 凭证字 示例：1234 |

## 5. 正确返回示例

{
	"success": true,
	"code": 200,
	"total": 1,
	"data": [
		{
			"id": "022CB294-4013-4003-97E0-77B976CDE624",
			"code": "1234",
			"name": "1234",
			"voucherstr": "1234"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

code	0	根据message提示查找原因


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-28

更新

请求说明

修改透传


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

