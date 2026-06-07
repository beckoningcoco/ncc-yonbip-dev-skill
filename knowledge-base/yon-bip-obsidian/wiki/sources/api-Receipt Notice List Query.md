---
title: "入库通知单列表查询"
apiId: "1674068876521373705"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Receipt Notice"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Receipt Notice]
platform_version: "BIP"
source_type: community-api-docs
---

# 入库通知单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Receipt Notice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/stock/storenotice/list

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
| pageSize | int | 否 | 是 | 分页尺寸 示例：100 默认值：100 |
| pageIndex | int | 否 | 是 | 分页码 示例：1 默认值：1 |
| status | string | 否 | 否 | 单据状态(0待入库1已完成2已关闭) 示例：1 |
| code | string | 否 | 否 | 单据号 示例：RKTZ001320230302000003 |
| srcBillNO | string | 否 | 否 | 来源单据号 示例：DC2023030200011279 |

## 3. 请求示例

Url: /yonbip/sd/stock/storenotice/list?access_token=访问令牌
Body: {
	"pageSize": 100,
	"pageIndex": 1,
	"status": "1",
	"code": "RKTZ001320230302000003",
	"srcBillNO": "DC2023030200011279"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 状态消息 示例：操作成功 |
| data | object | 否 | 结果集 |
| pageIndex | long | 否 | 分页码 示例：1 |
| pageSize | long | 否 | 分页尺寸 示例：20 |
| recordCount | long | 否 | 记录数 示例：1 |
| recordList | object | 是 | 记录集合 |
| pageCount | long | 否 | 分页数 示例：1 |
| beginPageIndex | long | 否 | 开始分页索引 示例：1 |
| endPageIndex | long | 否 | 截止分页索引 示例：1 |

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
				"code": "RKTZ001320230302000003",
				"srctop": "1669700868972740608",
				"stockUnit_name": "套",
				"details_stockUnitId": 2214821695774464,
				"product_cCode": "401020040008",
				"srctopno": "YHSQ001320230228000001",
				"bustype_name": "补货通知",
				"details_productsku": 1529210478673788945,
				"logistics": "RKTZ001320230302000003",
				"memo": "YHSQ001320230302000001_2023-03-02 11:47:23_来自福州金源店",
				"inqty": 4,
				"inStore_name": "福州金源店",
				"productsku_cName": "山海2013白毫银针",
				"subQty": 4,
				"vouchdate": "2023-03-02 00:00:00",
				"product_cName": "山海2013白毫银针",
				"bizstatus": 0,
				"inStore": 2214978517425152,
				"stockUnitId_Precision": 2,
				"inWarehouse_name": "福州金源店仓库",
				"id": 1671135997942300711,
				"pubts": "2023-03-04 17:49:13",
				"tplid": 0,
				"bustype_extend_attrs_json": "{\"storeNoticeType\":\"1\"}",
				"closeqty": 0,
				"createDate": "2023-03-02 00:00:00",
				"creator": "默认用户",
				"inWarehouse": 2284683049308928,
				"unitName": "套",
				"outwarehouse_name": "包装成品仓",
				"store": 2214978517425152,
				"bustype": "2084417272566038",
				"srcbillno": "DC2023030200011279",
				"details_id": 1671135997942300712,
				"productsku_cCode": "401020040008",
				"createTime": "2023-03-02 16:30:36",
				"outwarehouse": 2216271173079296,
				"qty": 4,
				"unit_Precision": 2,
				"details_product": 1529210470083854351,
				"srcbill": "1001A1100000002FDOO9",
				"status": 1
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	错误信息	请联系管理员


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

