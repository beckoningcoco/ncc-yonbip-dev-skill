---
title: "资产处置列表查询"
apiId: "b449bc9cb28b402283bc921dc483217f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Disposal Document"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Disposal Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产处置列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Disposal Document (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fixedassetshandle/list

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
| accentity | string | 否 | 否 | 会计主体 示例：2148237326782720 |
| periodid | long | 否 | 否 | 会计期间 |
| code | string | 否 | 否 | 处置单编码 |
| reducedate | DateTime | 否 | 否 | 处置日期 |
| reduceway.name | long | 否 | 否 | 减少方式 |
| auditTime | DateTime | 否 | 否 | 审核日期 |
| pageIndex | int | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 示例：10 默认值：10 |

## 3. 请求示例

Url: /yonbip/fi/fixedassetshandle/list?access_token=访问令牌
Body: {
	"accentity": "2148237326782720",
	"periodid": 0,
	"code": "",
	"reducedate": "",
	"reduceway.name": 0,
	"auditTime": "",
	"pageIndex": 1,
	"pageSize": 10
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 每页行数 示例：10 |
| recordCount | long | 否 | 总数 示例：0 |
| recordList | object | 是 | 资产处置列表数据 |
| sumRecordList | object | 是 | 资产处置卡片列表 |
| pageCount | long | 否 | 总页数 示例：0 |
| beginPageIndex | long | 否 | 开始页码（第一页） 示例：1 |
| endPageIndex | long | 否 | 结束页码（有多少页） 示例：0 |
| pubts | string | 否 | 时间戳 示例：2021-02-24 10:51:56 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 0,
		"recordList": [
			{
				"reduceway": 1781323795157656,
				"periodid": 1798621565473033,
				"currency_moneyDigit": 8,
				"currency_priceDigit": 6,
				"code": "DP000023",
				"reducedate": "2019-09-09 00:00:00",
				"accpurpose": 0,
				"accentity_name": "固定资产 数据升级",
				"accentity": "1799954919330048",
				"periodid_code": "2019-09",
				"reduceway_name": "投资转出",
				"cleancost": 1,
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"id": 1988727201378560,
				"pubts": "2020-12-04 09:52:28",
				"busiaccbook": 1799955179016448,
				"creator": "李伟",
				"auditstatus": 1,
				"isWfControlled": false,
				"cleanincome": 1,
				"voucherstatus": "2",
				"createTime": "2020-11-05 21:17:56",
				"auditTime": "2020-12-04 09:52:28",
				"valueaddedtax": 1,
				"busiaccbook_name": "固定资产 数据升级_默认业务账簿",
				"cleanreason": "1",
				"status": 1
			}
		],
		"sumRecordList": [
			{
				"cleanincome": 109,
				"valueaddedtax": 109,
				"cleancost": 109
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0,
		"pubts": "2021-02-24 10:51:56"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	操作成功	查询时不会出现错误码，只会出现查询出来的data为空。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

返回参数 (42)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

