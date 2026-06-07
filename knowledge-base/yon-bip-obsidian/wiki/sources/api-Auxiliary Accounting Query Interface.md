---
title: "辅助核算查询接口"
apiId: "bf0cd6867e5f41ada2190aa7dc981caa"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Auxiliary Accounting Item"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Auxiliary Accounting Item]
platform_version: "BIP"
source_type: community-api-docs
---

# 辅助核算查询接口

> `ContentType	application/json` 请求方式	POST | 分类: Auxiliary Accounting Item (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fipub/basedoc/querybd/multidimext

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| fields | string | 是 | 否 | 列表展示列 示例：["id","code","name","vrs","doctype","datatype"] |
| pageIndex | long | 否 | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 否 | 每页数量 示例：1000 |
| startPubts | string | 否 | 否 | 起始时间戳，格式yyyy-MM-dd HH:mm:ss，查询pubts大于等于此时间的数据 示例：2022-01-01 00:00:00 |
| endPubts | string | 否 | 否 | 结束时间戳，格式yyyy-MM-dd HH:mm:ss，查询pubts小于此时间的数据 示例：2024-12-30 00:00:00 |

## 3. 请求示例

Url: /yonbip/fi/fipub/basedoc/querybd/multidimext?access_token=访问令牌
Body: {
	"fields": [
		"id",
		"code",
		"name",
		"vrs",
		"doctype",
		"datatype"
	],
	"pageIndex": 1,
	"pageSize": 1000,
	"startPubts": "2022-01-01 00:00:00",
	"endPubts": "2024-12-30 00:00:00"
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
| success | boolean | 否 | 成功标志 示例：成功：true 失败：false |
| data | object | 是 | 业务数据 |
| code | string | 否 | 辅助核算项编码 示例：7897 |
| name | string | 否 | 辅助核算项名称 示例：项目类型 |
| id | string | 否 | 辅助核算项id 示例：018AF72B-04FC-46A2-8536-63776C3BA759 |
| code | long | 否 | 接口调用返回状态码 示例：200 |
| total | long | 否 | 结果总共条数 示例：44 |

## 5. 正确返回示例

{
	"success": "",
	"data": [
		{
			"code": "7897",
			"name": "项目类型",
			"id": "018AF72B-04FC-46A2-8536-63776C3BA759"
		}
	],
	"code": 200,
	"total": 44
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决


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

