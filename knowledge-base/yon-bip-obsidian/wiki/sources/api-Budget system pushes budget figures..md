---
title: "预算系统推预算数"
apiId: "b482e02e71d34b7ea135067195cb483e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Budget Execution Control"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Execution Control]
platform_version: "BIP"
source_type: community-api-docs
---

# 预算系统推预算数

> `ContentType	application/json` 请求方式	POST | 分类: Budget Execution Control (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/pushDataOpen

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
| cubeCode | string | 否 | 是 | 预算系统的模型编码（必填） 示例：wxy0802 |
| sysCode | string | 否 | 是 | 预算系统编码（必填） 示例：EBDG |
| requestUniqueId | string | 否 | 否 | 请求唯一标识requestUniqueId：请求唯一标识，同一标识数据幂等处理，防止重复提交数据。同时 数据处理完之后返回消息中会携带返回此标识，可明确成功数据。非必传，为空则不处理幂等，接口排队响应。（非必填，后端可获取） |
| data | object | 是 | 是 | 维度数据 |
| CURRENCY | string | 否 | 否 | 币种(编码形式如:yhltest002)（示例维度）（来自模型维度参照） 示例：CNY |
| ENTITY | string | 否 | 否 | 主体（模型维度）（来自模型维度参照） 示例：yhltest002 |
| budget | BigDecimal | 否 | 否 | 预算数（示例维度） 示例：10000 |
| actual | BigDecimal | 否 | 否 | 期初执行数 示例：100 |
| beforeActual | BigDecimal | 否 | 否 | 期初预占数 示例：100 |
| SCENARIO | string | 否 | 否 | 业务方案（模型维度） 示例：Budget |
| VERSION | string | 否 | 否 | 版本 示例：v0 |
| type | string | 否 | 否 | 数据标识 (删除：3， 其他可不传） 示例：3 |

## 3. 请求示例

Url: /yonbip/qyjx/yonbip-fi-sepmbcdc/execdata/pushDataOpen?access_token=访问令牌
Body: {
	"cubeCode": "wxy0802",
	"sysCode": "EBDG",
	"requestUniqueId": "",
	"data": [
		{
			"CURRENCY": "CNY",
			"ENTITY": "yhltest002",
			"budget": 10000,
			"actual": 100,
			"beforeActual": 100,
			"SCENARIO": "Budget",
			"VERSION": "v0",
			"type": "3"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| message | string | 否 | 接口信息（成功 : 无 失败 : 提示信息） |
| code | string | 否 | 响应码 示例：200 |
| data | string | 否 | 返回数据 示例：null |

## 5. 正确返回示例

{
	"message": "",
	"code": "200",
	"data": "null"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	{ "code": "500", "message": "重复请求,requestUniqueId：07025" }	校验请求参数是否符合规范


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-04-27

更新

请求参数 cubeCode

更新

请求参数 sysCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

