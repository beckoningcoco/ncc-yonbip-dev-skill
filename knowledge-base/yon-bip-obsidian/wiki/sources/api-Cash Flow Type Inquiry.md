---
title: "现金流量类型查询"
apiId: "1530841664336166921"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cash Flow Type"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cash Flow Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 现金流量类型查询

> `ContentType	application/json` 请求方式	POST | 分类: Cash Flow Type (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/fipub/basedoc/querybd/getCashflowtypeList

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
| accentity | string | 否 | 否 | 会计主体id或者会计主体编码 示例：666666 |
| code | string | 否 | 否 | 现金流量类型编码 示例：1 |
| name | string | 否 | 否 | 现金流量类型名称 示例：测试现金流量类型 |
| pubts_start | string | 否 | 否 | 时间戳，开始时间 示例：2022-08-03 15:01:56 |
| pubts_end | string | 否 | 否 | 时间戳，结束时间 示例：2022-09-20 16:10:20 |

## 3. 请求示例

Url: /yonbip/AMP/fipub/basedoc/querybd/getCashflowtypeList?access_token=访问令牌
Body: {
	"accentity": "666666",
	"code": "1",
	"name": "测试现金流量类型",
	"pubts_start": "2022-08-03 15:01:56",
	"pubts_end": "2022-09-20 16:10:20"
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
| code | string | 否 | 接口调用返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功。 |
| data | object | 是 | 业务数据 |
| code | string | 否 | 现金流量类型编码 示例：7897 |
| name | string | 否 | 现金流量类型名称 示例：项目类型 |
| accstandard | string | 否 | 会计准则id 示例：33334545545555 |
| description | string | 否 | 描述 示例：现金流量类型描述 |
| accentity | string | 否 | 会计主体 示例：测试会计主体 |
| pubts | string | 否 | 时间戳 示例：时间戳 |
| id | string | 否 | 现金流量类型id 示例：1530831657091203076 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功。",
	"data": [
		{
			"code": "7897",
			"name": "项目类型",
			"accstandard": "33334545545555",
			"description": "现金流量类型描述",
			"accentity": "测试会计主体",
			"pubts": "时间戳",
			"id": "1530831657091203076"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	查询异常


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

