---
title: "船舶税源信息-删除"
apiId: "2059325621899100168"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Ship tax source information"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Ship tax source information]
platform_version: "BIP"
source_type: community-api-docs
---

# 船舶税源信息-删除

> `ContentType	application/json` 请求方式	POST | 分类: Ship tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/vessel/del

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
| records | object | 是 | 是 | 船舶税源的删除信息 |
| code | string | 否 | 是 | 船舶税源编号 示例：CBSY20240805000001 |
| vesselCode | string | 否 | 是 | 船舶识别号(只能输入大写字母和数字,且为13位) 示例：1234567890123 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/vessel/del?access_token=访问令牌
Body: {
	"records": [
		{
			"code": "CBSY20240805000001",
			"vesselCode": "1234567890123"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：成功 |
| data | string | 否 | 数据 示例：删除成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": "删除成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	错误提示信息	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

