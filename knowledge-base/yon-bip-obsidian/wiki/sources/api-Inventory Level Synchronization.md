---
title: "货位存量同步"
apiId: "f325811b52eb481f8c3cf78b17ababbe"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Storage Bin Stock Table"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Storage Bin Stock Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 货位存量同步

> `ContentType	application/json` 请求方式	POST | 分类: Storage Bin Stock Table (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/stocklocation/forcesave

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
| data | object | 是 | 否 | 数据 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| org | string | 否 | 是 | 组织id或者组织编码 示例：guanlong_001 |
| warehouse | string | 否 | 是 | 仓库id或者仓库编码 示例：1850797131927808 |
| product | string | 否 | 是 | 商品id或者商品编码 示例：1856401441444096 |
| productsku | string | 否 | 是 | sku ID或编码 示例：1856401447457024 |
| batchno | string | 否 | 否 | 批次号 示例：b00114 |
| inventoryowner | string | 否 | 否 | 货主档案id |
| currentqty | double | 否 | 否 | 现存量 示例：3 |
| id__pk | string | 否 | 否 | 主键 |
| locationInfo | object | 是 | 是 | 货位信息 |
| key | string | 否 | 否 | 主键字段 示例：id__pk |

## 3. 请求示例

Url: /yonbip/scm/stocklocation/forcesave?access_token=访问令牌
Body: {
	"data": [
		{
			"_status": "Insert",
			"org": "guanlong_001",
			"warehouse": "1850797131927808",
			"product": "1856401441444096",
			"productsku": "1856401447457024",
			"batchno": "b00114",
			"inventoryowner": "",
			"currentqty": 3,
			"id__pk": "",
			"locationInfo": [
				{
					"_status": "Insert",
					"org": "guanlong_001",
					"warehouse": "1850797131927808",
					"product": "1856401441444096",
					"productsku": "1850795122479360",
					"batchno": "b00116",
					"inventoryowner": "",
					"currentqty": 3,
					"id__pk": "2271195834405645",
					"location": "1969746835722496",
					"isGoodsPositionStock": true
				}
			]
		}
	],
	"key": "id__pk"
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 是 | 返回信息描述 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | object | 是 | 错误数据信息 |
| infos | object | 是 | 成功数据信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": [
		"操作成功"
	],
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"data": {
					"org": "guanlong_001",
					"warehouse": "1850797131927808",
					"product": "1856401441444096",
					"productsku": "1856401447457024",
					"batchno": "b00116",
					"inventoryowner": "",
					"currentqty": 3,
					"id__pk": "2271195834405645",
					"locationInfo": [
						{
							"org": "guanlong_001",
							"warehouse": "1850797131927808",
							"product": "1856401441444096",
							"productsku": "1856401447457024",
							"batchno": "b00116",
							"inventoryowner": "",
							"currentqty": 3,
							"id__pk": "2271195834405644",
							"location": "1969746832675072",
							"isGoodsPositionStock": true,
							"parentid": "2283999309648640"
						}
					],
					"id": "2283999309648640"
				},
				"key": "id__pk"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	登录失败	检查token是正确。


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

