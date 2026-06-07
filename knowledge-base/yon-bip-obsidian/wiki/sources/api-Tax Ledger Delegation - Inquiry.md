---
title: "税务台账委托关系-查询"
apiId: "1935451807245926404"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Common Settings"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Common Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 税务台账委托关系-查询

> `ContentType	application/json` 请求方式	POST | 分类: Tax Common Settings (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/delegation/query

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
| baseOrgId | string | 否 | 否 | 业务单元的id 示例：123456 |
| projectId | string | 否 | 否 | 项目的id 示例：112233445566 |
| enable | string | 否 | 否 | 档案启用状态（0-停用，1-启用） 示例：1 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间（yyyy-MM-dd HH:mm:ss） 示例：2023-05-21 00:00:00 |
| puts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳（yyyy-MM-dd HH:mm:ss） 示例：2023-05-21 00:00:00 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/delegation/query?access_token=访问令牌
Body: [{
	"baseOrgId": "123456",
	"projectId": "112233445566",
	"enable": "1",
	"createTime": "2023-05-21 00:00:00",
	"puts": "2023-05-21 00:00:00"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 描述信息 示例：success |
| datas | object | 是 | 响应数据 |
| id | string | 否 | 税务委托关系的主键 示例：12345678 |
| baseOrgId | string | 否 | 业务单元的id 示例：123456 |
| projectId | string | 否 | 项目的id 示例：112233445566 |
| taxPayerId | string | 否 | 纳税主体的id 示例：13609494720 |
| financeOrgId | string | 否 | 会计主体的id 示例：13609494720 |
| taxCategoryId | string | 否 | 税种档案的id 示例：1360953054810368 |
| enable | string | 否 | 档案启用状态（0-停用，1-启用） 示例：1 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 创建时间（yyyy-MM-dd HH:mm:ss） 示例：2023-05-21 00:00:00 |
| puts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 时间戳（yyyy-MM-dd HH:mm:ss） 示例：2023-05-21 00:00:00 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"datas": [
		{
			"id": "12345678",
			"baseOrgId": "123456",
			"projectId": "112233445566",
			"taxPayerId": "13609494720",
			"financeOrgId": "13609494720",
			"taxCategoryId": "1360953054810368",
			"enable": "1",
			"createTime": "2023-05-21 00:00:00",
			"puts": "2023-05-21 00:00:00"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统异常	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-18

更新

请求参数 baseOrgId

业务单元修改成非必输


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

