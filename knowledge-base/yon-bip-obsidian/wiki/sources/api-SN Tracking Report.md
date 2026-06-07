---
title: "序列号跟踪报表"
apiId: "e00e1f1e668443798671f9c66f28ed51"
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

# 序列号跟踪报表

> `ContentType	application/json` 请求方式	POST | 分类: Sequence Number (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/snflowdirection/list

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
| pageSize | long | 否 | 是 | 每页行数 示例：10 |
| pageIndex | long | 否 | 是 | 当前页数 示例：1 |
| open_vouchdate_begin | string | 否 | 否 | 开始时间（时间戳） 示例：2021-02-23 00:00:00.000 |
| open_vouchdate_end | string | 否 | 否 | 结束时间（时间戳） 示例：2021-02-23 23:59:59.999 |
| org | string | 是 | 否 | 组织id 示例：["1620041647149568"] |
| store | long | 是 | 否 | 门店id 示例：[1620139372769888] |
| warehouse | long | 是 | 否 | 仓库id 示例：[1620139372761344] |
| productClass | long | 是 | 否 | 物料分类 示例：[1613185527927040] |
| product | long | 是 | 否 | 物料id 示例：[1613334295384320] |
| productsku | long | 是 | 否 | 物料sku 示例：[1613347223376128] |
| batchno | string | 否 | 否 | 批次号id 示例：1620139372769888 |
| csn | string | 否 | 否 | 序列号 示例：sn001 |
| goodsposition | long | 是 | 否 | 货位 示例：[1613347223376128] |
| stockStatusDoc | long | 是 | 否 | 库存状态id 示例：[1613334295384320] |

## 3. 请求示例

Url: /yonbip/scm/snflowdirection/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"open_vouchdate_begin": "2021-02-23 00:00:00.000",
	"open_vouchdate_end": "2021-02-23 23:59:59.999",
	"org": [
		"1620041647149568"
	],
	"store": [
		1620139372769888
	],
	"warehouse": [
		1620139372761344
	],
	"productClass": [
		1613185527927040
	],
	"product": [
		1613334295384320
	],
	"productsku": [
		1613347223376128
	],
	"batchno": "1620139372769888",
	"csn": "sn001",
	"goodsposition": [
		1613347223376128
	],
	"stockStatusDoc": [
		1613334295384320
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
| pageIndex | long | 否 | 当前页 示例：1 |
| pageSize | long | 否 | 分页大小 示例：10 |
| recordCount | long | 否 | 页数 示例：8011 |
| recordList | object | 是 | 返回结果对象 |
| pageCount | long | 否 | 页数 示例：802 |
| beginPageIndex | long | 否 | 查询开始页码 示例：1 |
| endPageIndex | long | 否 | 查询结束页 示例：10 |
| tablename | string | 否 | 临时表名称 示例：temp_a7f88e09bdf049b59e735364c57a5557_1110424801 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 8011,
		"recordList": [
			{
				"warehouse_org_name": "guanlong_001",
				"warehouse_org": "1850753290490112",
				"batchno": "QTRK0803A1500",
				"code": "QTCK20200803000001",
				"product_cCode": "0731A001",
				"bustype_name": "其他出库",
				"product_unitName": "Kg",
				"stockStatusDoc": 2006555827382257,
				"stockStatusDoc_name": "合格",
				"productsku_cName": "0731_001",
				"vouchdate": "2020-08-03 00:00:00",
				"product_cName": "0731_001",
				"receipttype_name": "其他出库",
				"product_ProductClass_code": "guanlong_001",
				"product_ProductClass": 1850763115401472,
				"product": 1850795106062592,
				"batchnoid": 765211459015861,
				"product_oUnitId": 1850769497837824,
				"warehouse": 1850797131927808,
				"productsku": 1850795122479360,
				"productsku_cCode": "0731A001",
				"warehouse_name": "fgl_序列号仓",
				"createTime": "2020-08-03 14:22:48",
				"csn": "QTRK0803A0001",
				"product_ProductClass_name": "guanlong_001"
			}
		],
		"pageCount": 802,
		"beginPageIndex": 1,
		"endPageIndex": 10,
		"tablename": "temp_a7f88e09bdf049b59e735364c57a5557_1110424801"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

310008	参数校验失败，参数[pageSize]是必填的。	检查分页必填项


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-08-20

更新

请求说明

删除

请求参数 (6)

删除

返回参数 auditDate

删除

返回参数 auditTime

删除

返回参数 isReturn

生产错误回退


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

