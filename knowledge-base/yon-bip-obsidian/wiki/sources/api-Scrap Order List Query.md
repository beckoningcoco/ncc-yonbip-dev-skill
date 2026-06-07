---
title: "报废单列表查询"
apiId: "2180254317256114179"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Scrap Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Scrap Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 报废单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Scrap Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storescrapped/list

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
| pageIndex | string | 否 | 是 | 页号 默认值：1 |
| code | string | 否 | 否 | 单据编号 |
| pageSize | string | 否 | 是 | 每页行数 默认值：10 |
| warehouse_name | string | 否 | 否 | 仓库，需传入仓库名称 |
| outStockStatusDoc_name | string | 否 | 否 | 来源库存状态名称或id |
| org_id | string | 是 | 否 | 库存组织id |
| org_name | string | 否 | 否 | 库存组织名称 |
| org_code | string | 是 | 否 | 库存组织编码 |
| inStockStatusDoc_name | string | 是 | 否 | 目的库存状态名称或id |
| open_vouchdate_begin | string | 否 | 否 | 开始时间，日期格式：YYYY-MM-DD |
| open_vouchdate_end | string | 否 | 否 | 结束时间，日期格式：YYYY-MM-DD |
| isSum | boolean | 否 | 否 | 查询表头 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件传属性的名称，如仓库编码warehouse.code、时间戳pubts、物料编码purInRecords.product.cCode、表头自定义项headItem.define1、表体自定义项purInRecords.bodyItem.define1等) |
| op | string | 否 | 否 | 比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 ) |
| value1 | string | 否 | 否 | 值1(条件) |
| value2 | string | 否 | 否 | 值2(条件) |

## 3. 请求示例

Url: /yonbip/scm/storescrapped/list?access_token=访问令牌
Body: {
	"pageIndex": "",
	"code": "",
	"pageSize": "",
	"warehouse_name": "",
	"outStockStatusDoc_name": "",
	"org_id": [
		""
	],
	"org_name": "",
	"org_code": [
		""
	],
	"inStockStatusDoc_name": [
		""
	],
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"isSum": false,
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
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
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页数 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 当前页大小 示例：20 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：1 |
| recordList | object | 是 | 列表数据记录 |
| sumRecordList | string | 是 | 合计对象 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | pageCount 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | beginPageIndex 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | endPageIndex 示例：1 |
| traceId | string | 否 | traceId 示例：1fdd24b3a2b68f3f |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"stockUnit_name": "包",
				"product_cCode": "0002000002",
				"modifier": "昵称-赵建军",
				"availableSubQty": 10,
				"memo": "1",
				"currentqty": 100,
				"source": "stockanalysis_statuschange_list",
				"subQty": 0,
				"stockStatusChanges!id": "2178805195405262849",
				"modifyTime": "2025-01-14 17:18:43",
				"outStockStatusDoc_name": "合格",
				"currentSubQty": 10,
				"stockStatusChanges_memo": "3",
				"product_cName": "JS-条码管理-批次管理",
				"stockUnitId_Precision": 0,
				"id": "2178805195405262848",
				"adjustType": "0",
				"warehouse": "2033114536018968578",
				"outreserveid": 0,
				"unit": "2028829679090139148",
				"productsku": 0,
				"warehouse_name": "JS-wms仓库",
				"qty": 1,
				"unit_Precision": 2,
				"inreserveid": 0,
				"invExchRate": 10,
				"inventoryowner": 0,
				"status": 0,
				"stockUnitId": "2028829687680073737",
				"batchno": "JSPC2407020002",
				"code": "TZD20250114000001",
				"makeRuleCode": "stockanalysisTostockStatusChangeReceive",
				"vouchdate": "2025-01-14 00:00:00",
				"pubts": "2025-01-14 17:18:43",
				"org_name": "JS-全职能",
				"rowno": 1,
				"creator": "昵称-赵建军",
				"product": "2033103412053671945",
				"outStockStatusDoc": "2028823391241765013",
				"org": "2033101101360218122",
				"changeType": "statuschange",
				"unitExchangeType": 0,
				"inStockStatusDoc": "2028823391241765016",
				"lineno": 10,
				"createTime": "2025-01-14 17:18:28",
				"ownertype": 0,
				"inStockStatusDoc_name": "不合格",
				"availableqty": 100
			}
		],
		"sumRecordList": [
			""
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "1fdd24b3a2b68f3f"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	联系技术人员


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

