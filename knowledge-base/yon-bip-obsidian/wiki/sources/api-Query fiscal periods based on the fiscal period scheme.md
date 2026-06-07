---
title: "根据会计期间方案查询会计期间"
apiId: "1450654289788665856"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fiscal Period"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fiscal Period]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据会计期间方案查询会计期间

> `ContentType	application/json` 请求方式	POST | 分类: Fiscal Period (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/bd/period/queryPeriodsBySchemaInfo

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
| schemaIds | string | 否 | 否 | 期间方案id（请求参数schemaIds和schemaCodes只能任选其一，多个以,分割） 示例：2215226974277888,2247266990788864 |
| schemaCodes | string | 否 | 否 | 期间方案编码(请求参数schemaIds和schemaCodes只能任选其一，多个以,分割) 示例：0001 |

## 3. 请求示例

Url: /yonbip/fi/bd/period/queryPeriodsBySchemaInfo?access_token=访问令牌
Body: {
	"schemaIds": "2215226974277888,2247266990788864",
	"schemaCodes": "0001"
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
| code | long | 否 | 响应码 示例：200 |
| message | string | 否 | 响应消息 示例：操作成功 |
| data | object | 否 | 响应数据 |
| 2215226974277888 | object | 是 | 会计期间方案id |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"2215226974277888": [
			{
				"code": "2020-01",
				"begindate": "2020-01-01",
				"enddate": "2020-01-31",
				"accperiodyear2": "2020",
				"periodyear": 2326975182000384,
				"name": "2020-01",
				"accperiodscheme": 2215226974277888,
				"periodtree": 2326975182000384,
				"id": 2326975182016768
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

998	会计期间方案id和编码只能传一个	会计期间方案id和编码只能传一个

997	会计期间方案id和编码不能都为空	会计期间方案id和编码只能传一个


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

