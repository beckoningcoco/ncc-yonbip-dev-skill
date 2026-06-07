---
title: "装箱单列表查询"
apiId: "2435406573298778112"
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

# 装箱单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Packing Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/SCC/st_boxingrecord/list

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
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页行数 示例：10 默认值：10 |
| isSum | boolean | 否 | 否 | 查询表头 示例：false |
| open_vouchdate_begin | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 开始日期 示例：2025-11-27 00:00:00 |
| open_vouchdate_end | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 结束日期 示例：2025-12-26 23:59:59 |
| code | string | 否 | 否 | 单据编号 |
| boxCode | string | 否 | 否 | 箱码 |
| inBoxCode | string | 否 | 否 | 箱内条码 |
| org | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 库存组织ID |
| org_name | string | 否 | 否 | 库存组织名称 |
| product | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 物料ID |
| product_cCode | string | 否 | 否 | 物料编码 |
| productsku | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 物料SKUID |
| productsku_cCode | string | 否 | 否 | 物料SKU编码 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| op | string | 否 | 否 | 比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 ) |
| field | string | 否 | 否 | 属性名(条件传属性的名称，如库存组织编码org.code、时间戳pubts、物料名称boxingRecords.productn.name、物料SKU名称boxingRecords.productskun.name等) |
| value1 | string | 否 | 否 | 值1（条件） |
| value2 | string | 否 | 否 | 值2（条件） |

## 3. 请求示例

Url: /yonbip/SCC/st_boxingrecord/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"isSum": false,
	"open_vouchdate_begin": "2025-11-27 00:00:00",
	"open_vouchdate_end": "2025-12-26 23:59:59",
	"code": "",
	"boxCode": "",
	"inBoxCode": "",
	"org": 0,
	"org_name": "",
	"product": 0,
	"product_cCode": "",
	"productsku": 0,
	"productsku_cCode": "",
	"simpleVOs": [
		{
			"op": "",
			"field": "",
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
| message | string | 否 | 调用返回的信息，调用失败时是错误信息。 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 分页大小 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总记录数 示例：8 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 总页数 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 开始页 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 结束页 示例：1 |
| recordList | object | 是 | 返回结果对象 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 8,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordList": [
			{
				"code": "ZXD000012",
				"stockUnit_name": "头",
				"product_cCode": "新物料编码存货编码",
				"unboxingQty": 0,
				"inBoxQty": 2,
				"productsku_cName": "条码01",
				"subQty": 1,
				"vouchdate": "2025-12-25 00: 00: 00",
				"modifyTime": "2025-12-26 14: 54: 50",
				"product_cName": "条码01",
				"id": 1565574171405582341,
				"pubts": "2025-12-26 15: 05: 35",
				"mainid": 1565574171405582341,
				"org_name": "组织A",
				"createDate": "2025-12-26 00: 00: 00",
				"boxCode": "0001",
				"inBoxCode": "0001000012",
				"rowno": 1,
				"boxCapacity": 2,
				"product": 1565570237241229319,
				"unit_precision": 2,
				"modifyDate": "2025-12-26 00: 00: 00",
				"org": "1565015069766451203",
				"stockUnit_precision": 2,
				"stockUnit": 1565049214734434309,
				"unit_name": "头",
				"unit": 1565049214734434309,
				"productsku": 1565570245831163914,
				"productsku_cCode": "0001000012",
				"createTime": "2025-12-26 14: 53: 24",
				"qty": 1,
				"boxingRecords_id": 1565574171405582342,
				"invExchRate": 1,
				"contactsPieces": 1,
				"contactsQuantity": 1
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	列表查询失败


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

