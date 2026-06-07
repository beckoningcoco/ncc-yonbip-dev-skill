---
title: "工时数据新增"
apiId: "2484509448327921669"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Working Hour Data"
domain: "CO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Working Hour Data]
platform_version: "BIP"
source_type: community-api-docs
---

# 工时数据新增

> `ContentType	application/json` 请求方式	POST | 分类: Working Hour Data (CO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/epcm/realWkTime/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| realWkTimeDataList | object | 是 | 是 | 工时数据 最大请求量：100 |
| _id | string | 否 | 否 | 行号 示例：1 |
| accpurpose | string | 否 | 是 | 核算目的id 示例：2137158598423216412 |
| accentity | string | 否 | 是 | 会计主体id 示例：2137197656834834442 |
| accbook | string | 否 | 是 | 账簿id 示例：2137197768523907074 |
| periodCode | string | 否 | 是 | 会计期间编码 示例：2025-01 |
| realco | string | 否 | 是 | 成本对象id 示例：2212106696838348811 |
| realcoCode | string | 否 | 否 | 成本对象code 示例：SCDD20250101000001-10-000001 |
| factory | string | 否 | 否 | 工厂 示例：2137197656834834442 |
| wkttype | string | 否 | 是 | 工时类型 示例：Labor/Machine/Other |
| beginwktimequa | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 期初在产工时 示例：1.1 |
| wktimequa | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 本期投入工时 示例：2.2 |
| finwktimequa | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 本期完工工时 示例：1.1 |
| endwktimequa | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 期末在产工时 示例：2.2 |

## 3. 请求示例

Url: /yonbip/FCC/epcm/realWkTime/batchSave?access_token=访问令牌
Body: {
	"realWkTimeDataList": [
		{
			"_id": "1",
			"accpurpose": "2137158598423216412",
			"accentity": "2137197656834834442",
			"accbook": "2137197768523907074",
			"periodCode": "2025-01",
			"realco": "2212106696838348811",
			"realcoCode": "SCDD20250101000001-10-000001",
			"factory": "2137197656834834442",
			"wkttype": "Labor/Machine/Other",
			"beginwktimequa": 1.1,
			"wktimequa": 2.2,
			"finwktimequa": 1.1,
			"endwktimequa": 2.2
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：操作成功 |
| data | object | 是 | 详细信息 |
| realco | string | 否 | 核算对象 示例：2106893544250671108 |
| wkttype | string | 否 | 工时类型 示例：Labor |
| beginwktimequa | number |
| 小数位数:0,最大长度:10 | 否 | 期初在产工时 示例：3600 |
| wktimequa | number |
| 小数位数:0,最大长度:10 | 否 | 期末在产工时 示例：10800 |
| finwktimequa | number |
| 小数位数:0,最大长度:10 | 否 | 本期完工工时 示例：10800 |
| endwktimequa | number |
| 小数位数:0,最大长度:10 | 否 | 期末在产工时 示例：3600 |
| totalqua | string | 否 | 累计量 示例：2107633395317080067 |
| accpurpose | string | 否 | 核算目的 示例：1525643714430500871 |
| accbook | string | 否 | 账簿 示例：2105868043502485509 |
| accentity | string | 否 | 会计主体 示例：2105847367530971145 |
| period | string | 否 | 期间 示例：1550375020881510412 |
| periodCode | string | 否 | 期间编码 示例：2024-10 |
| id | string | 否 | id 示例：2515832533165801478 |
| dr | number |
| 小数位数:0,最大长度:10 | 否 | dr 示例：0 |
| ytenantId | string | 否 | ytenantId 示例：0000L6YQ8AVLFUZPXD0000 |
| createTime | string | 否 | 创建时间 示例：2026-04-13 19:57:34 |
| creator | string | 否 | 创建人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"realco": "2106893544250671108",
			"wkttype": "Labor",
			"beginwktimequa": 3600,
			"wktimequa": 10800,
			"finwktimequa": 10800,
			"endwktimequa": 3600,
			"totalqua": "2107633395317080067",
			"accpurpose": "1525643714430500871",
			"accbook": "2105868043502485509",
			"accentity": "2105847367530971145",
			"period": "1550375020881510412",
			"periodCode": "2024-10",
			"id": "2515832533165801478",
			"dr": 0,
			"ytenantId": "0000L6YQ8AVLFUZPXD0000",
			"createTime": "2026-04-13 19:57:34",
			"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

