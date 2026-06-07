---
title: "折旧清单列表查询"
apiId: "65f6c4bf2e9e42898c3d0f3934f0da5e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Depreciation List"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Depreciation List]
platform_version: "BIP"
source_type: community-api-docs
---

# 折旧清单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Depreciation List (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/depreciationlist/list

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
| pageIndex | string | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | string | 否 | 是 | 每页行数 示例：10 默认值：10 |
| accentity | string | 否 | 是 | 会计主体 示例：2148237326782720 |
| periodcode | string | 否 | 是 | 会计期间 示例：2021-1 |
| category | string | 否 | 否 | 资产类别 |
| usedepredept | string | 否 | 否 | 使用部门 |
| managedepredept | string | 否 | 否 | 管理部门 |
| project | string | 否 | 否 | 项目 |

## 3. 请求示例

Url: /yonbip/fi/depreciationlist/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "10",
	"accentity": "2148237326782720",
	"periodcode": "2021-1",
	"category": "",
	"usedepredept": "",
	"managedepredept": "",
	"project": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| code | long | 否 | 返回码 示例：200 |
| message | string | 否 | 调用失败的返回信息 示例：操作成功 |
| data | object | 否 | 调用成功的返回信息 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 每页行数 示例：10 |
| recordCount | long | 否 | 总数 示例：0 |
| recordList | object | 是 | 折旧清单列表数据 |
| sumRecordList | object | 是 | 折旧清单列表 |
| pageCount | long | 否 | 总页数 示例：0 |
| beginPageIndex | long | 否 | 开始页码（第一页） 示例：1 |
| endPageIndex | long | 否 | 结束页码（有多少页） 示例：0 |
| pubts | string | 否 | 时间戳 示例：2021-03-01 15:36:06 |

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
				"periodcode": "2021-01",
				"netvalue": 9984.17,
				"category_name": "土地",
				"monthdepreciationvalue": 15.83,
				"moredepartment": false,
				"accpurpose": 0,
				"calculateinfo": 2148248202318337,
				"isinherited": false,
				"project": "2146982582637056",
				"accentity_name": "固定资产",
				"project_name": "导入项目1",
				"accentity": "2148237326782720",
				"unitdepreciation": 0,
				"usedepredept_name": "采购",
				"natCurrency_name": "人民币",
				"usedepredeptandmore": "采购",
				"accruedoriginalvalue": 10000,
				"natCurrency": "2145519866484224",
				"usedepredept": "2148245505003776",
				"id": 2152598000144896,
				"pubts": "2021-03-01 15:35:55",
				"depreciation": 15.83,
				"fixedassetsinfo_name": "豪宅",
				"managedepredept": "2148245505003776",
				"busiaccbook": 2148237766856960,
				"fixedassetsinfo": 2148248202318336,
				"managedepredept_name": "采购",
				"monthdepreciationrate": 0.001583,
				"fixedassetsinfo_code": "0001210126000002",
				"yeardepreciation": 15.83,
				"natCurrency_moneyDigit": 2,
				"impairment": 0,
				"usagestate_name": "在用",
				"natCurrency_priceDigit": 2,
				"usagestate": 2112934987388602,
				"busiaccbook_name": "固定资产_默认业务账簿",
				"category": 2142662516806416
			}
		],
		"sumRecordList": [
			{
				"netvalue": 9984.17,
				"accruedoriginalvalue": 10000,
				"yeardepreciation": 15.83,
				"monthdepreciationvalue": 15.83,
				"impairment": 0,
				"depreciation": 15.83
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0,
		"pubts": "2021-03-01 15:36:06"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

200	操作成功	查询时不会出现错误信息，但是查出来的data为空。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-25

更新

返回参数 (55)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

