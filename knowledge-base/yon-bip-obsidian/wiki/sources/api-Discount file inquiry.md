---
title: "折扣档案查询"
apiId: "2197338219690328073"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Discount File"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Discount File]
platform_version: "BIP"
source_type: community-api-docs
---

# 折扣档案查询

> `ContentType	application/json` 请求方式	POST | 分类: Discount File (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/revenue/discount/query

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 分页大小 示例：100 默认值：100 |
| code | string | 否 | 否 | 折扣编码 |
| name | string | 否 | 否 | 折扣名称 |
| enable | string | 否 | 否 | 档案状态，1：启用；0：停用 |
| pubts | string | 否 | 否 | pubts 示例：时间戳，按大于等于输入的时间进行查询，例如2024-12-30 00:15:17 |

## 3. 请求示例

Url: /yonbip/EFI/revenue/discount/query?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"code": "",
	"name": "",
	"enable": "",
	"pubts": "时间戳，按大于等于输入的时间进行查询，例如2024-12-30 00:15:17"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200；调用失败时返回999 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功！ |
| data | object | 否 | data |
| recordList | object | 是 | recordList |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页数 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页行数 示例：100 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：1 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 总页数 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 开始页码（第一页） 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 结束页码（有多少页） 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"recordList": [
			{
				"id": "1971487914177069064",
				"code": "ZK-001",
				"name": "折扣0001",
				"isOrNot": "1",
				"outer_code": "0000001",
				"enable": "1",
				"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"pubts": "2025-02-17 10:40:48"
			}
		],
		"pageIndex": 1,
		"pageSize": 100,
		"recordCount": 1,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

20000000	接口请求异常


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

