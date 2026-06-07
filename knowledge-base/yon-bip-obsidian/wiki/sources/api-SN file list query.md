---
title: "序列号档案列表查询"
apiId: "7883d8603ad24a5fa9d98c2cf1638f81"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sequence Number"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sequence Number]
platform_version: "BIP"
source_type: community-api-docs
---

# 序列号档案列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Sequence Number (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/snQuerysnstate/list

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
| pageSize | long | 否 | 是 | 每页行数 示例：10 |
| pageIndex | long | 否 | 是 | 当前页数 示例：1 |
| totalCount | int | 否 | 是 | 1表示不查询总条数，如需查询请设置为0 示例：1 默认值：1 |
| org | string | 是 | 否 | 组织id 示例：["1620041647149568"] |
| store | long | 是 | 否 | 门店id 示例：[1620139372769888] |
| warehouse | long | 是 | 否 | 仓库id 示例：[1620139372761344] |
| ManageClass | long | 是 | 否 | 物料分类id 示例：[1613185527927040] |
| Product | long | 是 | 否 | 物料id 示例：[1613334295384320] |
| ProductSKU | long | 是 | 否 | 物料SKUid 示例：[1613347223376128] |
| batchno | string | 否 | 否 | 批次号 示例：批次号 |
| sn | string | 否 | 否 | 序列号 示例：xlh0001 |
| snstate | long | 否 | 否 | 序列号状态（1表示在库，2表示已出库） 示例：1 |
| location | long | 是 | 否 | 货位 示例：[1620139372769888,1620139372769821] |
| stockStatusDoc | long | 是 | 否 | 库存状态 示例：[1620139372769888,1620139372769882] |
| simpleVOs | object | 是 | 否 | 条件过滤 |
| field | string | 否 | 否 | 过滤字段（如组织过滤org.code;单据时间过滤pubts等），单据增量查询，只需要在simpleVOs中填写pubts的过滤条件，根据条件判断即可。 示例：pubts |
| op | string | 否 | 否 | 判断条件，gt表示大于，egt表示大于等于，lt表示小于，elt表示小于等于，eq表示等于，between介于两个条件之间 示例：gt |
| value1 | string | 否 | 否 | 比较值1 示例：2021-12-01 00:00:00 |
| value2 | string | 否 | 否 | 比较值2 示例：2021-12-09 00:00:00 |

## 3. 请求示例

Url: /yonbip/scm/snQuerysnstate/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"totalCount": 1,
	"org": [
		"1620041647149568"
	],
	"store": [
		1620139372769888
	],
	"warehouse": [
		1620139372761344
	],
	"ManageClass": [
		1613185527927040
	],
	"Product": [
		1613334295384320
	],
	"ProductSKU": [
		1613347223376128
	],
	"batchno": "批次号",
	"sn": "xlh0001",
	"snstate": 1,
	"location": [
		1620139372769888,
		1620139372769821
	],
	"stockStatusDoc": [
		1620139372769888,
		1620139372769882
	],
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "gt",
			"value1": "2021-12-01 00:00:00",
			"value2": "2021-12-09 00:00:00"
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | string | 否 | 当前页数 示例：1 |
| pageSize | string | 否 | 每页数 示例：1 |
| recordCount | string | 否 | 总条数 示例：7800 |
| recordList | object | 是 | 序列号档案 |
| pageCount | string | 否 | 总条数 示例：7880 |
| beginPageIndex | string | 否 | 开始页数 示例：1 |
| endPageIndex | string | 否 | 截至页数 示例：2 |
| pubts | string | 否 | 时间戳 示例：2021-02-22 14:39:34 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": "1",
		"pageSize": "1",
		"recordCount": "7800",
		"recordList": [
			{
				"product": "1850795106062592",
				"batchno": "PDSL0731A055",
				"org": "1850753290490112",
				"product_cCode": "0731A001",
				"stockStatusDoc": "2006555827382257",
				"stockStatusDoc_name": "合格",
				"warehouse": "1850797131927808",
				"product_ManageClass_code": "guanlong_001",
				"productsku_cName": "0731_001",
				"product_ManageClass_name": "guanlong_001",
				"updatecount": "1",
				"warehouse_name": "fgl_序列号仓",
				"product_ManageClass": "1850763115401472",
				"productsku": "1850795122479360",
				"productsku_cCode": "0731A001",
				"product_cName": "0731_001",
				"snstate": "1",
				"id": "1856421403644160",
				"sn": "PDSL0731A011",
				"pubts": "2020-12-22 11:12:54",
				"org_name": "guanlong_001"
			}
		],
		"pageCount": "7880",
		"beginPageIndex": "1",
		"endPageIndex": "2",
		"pubts": "2021-02-22 14:39:34"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

310061	"执行业务扩展插件[com.yonyou.ucg.auth.businessextend.yonsuite.YonsuitBusinessExtendPlugin]的时候报错：pageIndex is null"	检查分页查询必填项


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

