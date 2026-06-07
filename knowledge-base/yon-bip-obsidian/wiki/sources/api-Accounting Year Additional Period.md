---
title: "会计年度新增期间"
apiId: "2305689739079974920"
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

# 会计年度新增期间

> `ContentType	application/json` 请求方式	POST | 分类: Fiscal Period (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/finbd.bd_periodlist/finbd.bd_periodlist/fipub/period/api/saveOrUpdate/year

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
| data | object | 是 | 否 | 参数集合 |
| code | string | 否 | 否 | 代码 示例：2024 |
| name | string | 否 | 否 | 名称 示例：2024 |
| schemeCode | string | 否 | 否 | 期间方案编码 示例：zh11 |
| objid | string | 否 | 否 | 友企连ID 示例：111aa |

## 3. 请求示例

Url: /finbd.bd_periodlist/finbd.bd_periodlist/fipub/period/api/saveOrUpdate/year?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "2024",
			"name": "2024",
			"schemeCode": "zh11",
			"objid": "111aa"
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功！ |
| data | object | 否 | data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | count 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | sucessCount 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：0 |
| messages | string | 是 | messages |
| infos | object | 是 | infos |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"data": {
					"code": "2024",
					"name": "2024",
					"schemeCode": "zh11",
					"objid": "111aa",
					"objId": "111aa",
					"accperiodscheme": 2045158861081411588,
					"tenant_id": 2936477793932352,
					"ytenant_id": "0000L7PIX0Z2ARJ3MD0000",
					"num": 12,
					"begindate": "2023-12-31T16:00:00.000+00:00",
					"enddate": "2024-12-30T16:00:00.000+00:00",
					"id": 2045165294942421000,
					"_status": "Update",
					"_key": "id",
					"pubts": "2025-07-04T08:21:19.875+00:00"
				},
				"key": "111aa"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

