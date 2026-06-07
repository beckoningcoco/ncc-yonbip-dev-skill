---
title: "序列号跟踪列表查询"
apiId: "1770408102544801801"
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

# 序列号跟踪列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Sequence Number (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/sn/querySnFlowByCondition

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
| csn | string | 否 | 否 | 序列号 示例：sn001 |
| open_pubts_begin | string | 否 | 否 | 序列号发生开始时间 示例：2021-02-23 00:00:00 |
| open_pubts_end | string | 否 | 否 | 序列号发生结束时间 示例：2021-02-23 23:59:59 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始时间 示例：2021-02-23 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束时间 示例：2021-02-23 23:59:59 |
| org | string | 是 | 否 | 组织id 示例：["1620041647149568"] |
| store | string | 是 | 否 | 门店id 示例：["1620139372769888"] |
| warehouse | string | 是 | 否 | 仓库id 示例：["1620139372761344"] |
| product | string | 是 | 否 | 物料id 示例：["1613334295384320"] |
| productsku | string | 是 | 否 | 物料sku 示例：["1613347223376128"] |
| batchno | string | 否 | 否 | 批次号id 示例：1620139372769888 |
| goodsposition | string | 是 | 否 | 货位id 示例：["1613347223376128"] |
| open_auditDate_begin | string | 否 | 否 | 审核开始日期 示例：2021-02-23 00:00:00 |
| open_auditDate_end | string | 否 | 否 | 审核结束日期 示例：2021-02-23 23:59:59 |
| isReturn | string | 否 | 否 | 退货标识，true表示是退货，false表示不是退货 示例：true |
| receipttype | string | 是 | 否 | 单据类型 示例：["st_othinrecord"] |
| bustype | string | 是 | 否 | 交易类型 示例：["1583525116168375205"] |
| preciseSn | string | 是 | 否 | 序列号精确查询 示例：["001","002"] |
| stockStatusDoc | string | 是 | 否 | 库存状态id 示例：["1613334295384320"] |

## 3. 请求示例

Url: /yonbip/scm/sn/querySnFlowByCondition?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"csn": "sn001",
	"open_pubts_begin": "2021-02-23 00:00:00",
	"open_pubts_end": "2021-02-23 23:59:59",
	"open_vouchdate_begin": "2021-02-23 00:00:00",
	"open_vouchdate_end": "2021-02-23 23:59:59",
	"org": [
		"1620041647149568"
	],
	"store": [
		"1620139372769888"
	],
	"warehouse": [
		"1620139372761344"
	],
	"product": [
		"1613334295384320"
	],
	"productsku": [
		"1613347223376128"
	],
	"batchno": "1620139372769888",
	"goodsposition": [
		"1613347223376128"
	],
	"open_auditDate_begin": "2021-02-23 00:00:00",
	"open_auditDate_end": "2021-02-23 23:59:59",
	"isReturn": "true",
	"receipttype": [
		"st_othinrecord"
	],
	"bustype": [
		"1583525116168375205"
	],
	"preciseSn": [
		"001",
		"002"
	],
	"stockStatusDoc": [
		"1613334295384320"
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
| recordList | object | 是 | 调用成功时的返回数据 |
| pageIndex | long | 否 | 当前页 示例：1 |
| pageSize | long | 否 | 分页大小 示例：1 |
| recordCount | long | 否 | 总条数，只有查询第一页的时候返回总数，查询其他页返回-1 示例：51 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"recordList": [
			{
				"id": 1665166491644854272,
				"csn": "aaasss",
				"product_ProductClass": 1586526834473828358,
				"product_ProductClass_code": "000001",
				"product_ProductClass_name": "ZYJ-制造物料",
				"product": 1593204331803312137,
				"product_cCode": "000038",
				"product_cName": "CSE序列1",
				"productsku": 0,
				"productsku_cCode": "",
				"productsku_cName": "",
				"product_modelDescription": "",
				"product_oUnitId": 1586527985525063683,
				"product_unitName": "克",
				"code": "QTRK20230222000001",
				"vouchdate": "2023-02-22 00:00:00",
				"bustype_name": "其他入库",
				"auditDate": "2023-02-22 00:00:00",
				"auditTime": "2023-02-22 15:28:14",
				"isReturn": "1",
				"receipttype_name": "st_othinrecord",
				"org": "1587183706775748618",
				"iStoreID": 0,
				"warehouse": 1654619409174495233,
				"warehouse_name": "CSE非序列仓",
				"batchno": "",
				"batchnoid": 0,
				"tenant_id": 3020325083289168,
				"create_time": "2023-02-22 15:28:14",
				"sourceStockStatusDoc": 0,
				"sourceGoodsposition": 0,
				"sourceReserveid": 0,
				"stockStatusDoc": 1706584020936556576,
				"goodsposition": 0,
				"reserveid": 0,
				"iCustomId": 0,
				"iVendorId": 0,
				"adverseWarehouseId": 0,
				"cMemo": "",
				"pubts": "2023-02-22 15:28:14"
			}
		],
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 51
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

310008	参数校验失败，参数[pageSize]是必填的。	检查分页必填项


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

