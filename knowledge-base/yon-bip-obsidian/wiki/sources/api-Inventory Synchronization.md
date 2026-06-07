---
title: "存量同步"
apiId: "da6150cb4f8d4fbe9e9a5caacdf4b583"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Quantity-on-hand Table"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Quantity-on-hand Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 存量同步

> `ContentType	application/json` 请求方式	POST | 分类: Quantity-on-hand Table (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/stockanalysis/forcesave

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
| _status | string | 否 | 是 | _status 示例：Insert |
| org | string | 否 | 是 | 组织id或者组织编码 示例：guanlong_001 |
| warehouse | string | 否 | 是 | 仓库id或在仓库编码 示例：fgl_003 |
| product | string | 否 | 是 | 商品id或者商品编码 示例：001000046 |
| productsku | string | 否 | 是 | sku ID或编码 示例：001000046 |
| batchno | string | 否 | 否 | 批次号 |
| inventoryowner | string | 否 | 否 | 货主档案id |
| currentqty | double | 否 | 否 | 现存量 |
| id__pk | string | 否 | 否 | 主键 示例：00001 |
| key | string | 否 | 否 | 主键字段 示例：id__pk 默认值：id__pk |

## 3. 请求示例

Url: /yonbip/scm/stockanalysis/forcesave?access_token=访问令牌
Body: {
	"data": [
		{
			"_status": "Insert",
			"org": "guanlong_001",
			"warehouse": "fgl_003",
			"product": "001000046",
			"productsku": "001000046",
			"batchno": "",
			"inventoryowner": "",
			"currentqty": 0,
			"id__pk": "00001"
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 是 | 返回信息描述 |
| data | object | 否 | 返回数据 |
| successCountAI | long | 否 | 成功条数 |
| failCountAI | long | 否 | 失败条数 |
| count | long | 否 | 总条数 |
| sucessCount | long | 否 | 成功条数 |
| failCount | long | 否 | 失败条数 |
| messages | object | 否 | 错误数据信息 |
| infos | object | 是 | 成功数据信息 |

## 5. 正确返回示例

{
	"code": "",
	"message": [
		""
	],
	"data": {},
	"successCountAI": 0,
	"failCountAI": 0,
	"count": 0,
	"sucessCount": 0,
	"failCount": 0,
	"messages": {},
	"infos": [
		{}
	]
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

