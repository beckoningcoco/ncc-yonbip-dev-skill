---
title: "装箱单更新"
apiId: "2227047023877554177"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Packing Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Packing Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 装箱单更新

> `ContentType	application/json` 请求方式	POST | 分类: Packing Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/updateBoxingrecord

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
| data | object | 否 | 是 | data |
| id | string | 否 | 是 | 装箱单主表ID 示例：2214930379971756040 |
| org | string | 否 | 是 | 组织ID 示例：1565685282207432710 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2025-03-19 |
| boxingRecords | object | 是 | 是 | 装箱单子表数据 |

## 3. 请求示例

Url: /yonbip/scm/updateBoxingrecord?access_token=访问令牌
Body: {
	"data": {
		"id": "2214930379971756040",
		"org": "1565685282207432710",
		"vouchdate": "2025-03-19",
		"boxingRecords": [
			{
				"curInBoxQty": 1,
				"unboxingQty": 0,
				"subQty": 1,
				"id": "2224834462902386690",
				"mainid": "",
				"boxCode": "11",
				"inBoxCode": "12345678",
				"unboxingSubQty": 0,
				"qty": 1,
				"invExchRate": 1,
				"product_cCode": "1682236839068958725",
				"productsku_cCode": "SKU001",
				"rowno": 2,
				"_status": "Delete"
			}
		]
	}
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
| infos | object | 否 | infos |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 入参条数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 更新成功条数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 更新失败条数 示例：0 |
| messages | string | 是 | messages |
| infos | object | 是 | infos |
| failInfos | string | 是 | failInfos |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"infos": {
			"count": 1,
			"sucessCount": 1,
			"failCount": 0,
			"messages": [
				""
			],
			"infos": [
				{
					"id": 2236060227595141128,
					"org": "1965735406901657610",
					"boxingRecords": [
						{
							"curInBoxQty": 1,
							"unboxingQty": 0,
							"subQty": 1,
							"mainid": 2236060227595141128,
							"boxCode": "xm01",
							"inBoxCode": "0001000001-111",
							"unboxingSubQty": 0,
							"invExchRate": 1,
							"product_cCode": "0001000001-111",
							"qty": 2,
							"rowno": 4,
							"inBoxQty": 8,
							"product": 1753668570587856905,
							"unit": 1753668373007302672,
							"productn": 1753668570587856905,
							"product_cName": "yc物料1",
							"stockUnit": 1753668373007302672,
							"id": 2236156374733029384
						}
					],
					"modifier": "门浩昵称",
					"modifyTime": "2025-04-01 23:54:25",
					"modifyDate": "2025-04-01 23:54:25",
					"code": "2345"
				}
			],
			"failInfos": [
				""
			]
		}
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

