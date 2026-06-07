---
title: "作业类型查询"
apiId: "2342834566169362438"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Resource"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Resource]
platform_version: "BIP"
source_type: community-api-docs
---

# 作业类型查询

> `ContentType	application/json` 请求方式	POST | 分类: Resource (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/activity/bill/list

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
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | pageSize 示例：20 默认值：20 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | pageIndex 示例：1 默认值：1 |
| simple | object | 否 | 否 | simpleVOs |
| code | string | 否 | 否 | 资源编码 示例：code1 |
| name | string | 否 | 否 | 资源名称 |
| orgUnit | string | 否 | 否 | 业务单元 |
| activityClass | string | 否 | 否 | 资源类别,0:人工、1:设备、2:委外、3:空闲、4:其它、5:能源、6:辅料、7:环保 |
| measureBase | string | 否 | 否 | 计量基础,0:物料、1:批次 |
| declareOccasion | string | 否 | 否 | 申报时机,Manual_Declare:手工申报、Operation_Finish:工序完工、Order_Finish:订单完工、Undeclared:不申报、 |
| activityStatus | string | 否 | 否 | 状态,0:已停用、1:已启用 |

## 3. 请求示例

Url: /yonbip/FCC/activity/bill/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"simple": {
		"code": "code1",
		"name": "",
		"orgUnit": "",
		"activityClass": "",
		"measureBase": "",
		"declareOccasion": "",
		"activityStatus": ""
	}
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | pageIndex 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | pageSize 示例：20 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | recordCount 示例：1 |
| recordList | object | 是 | recordList |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | pageCount 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | beginPageIndex 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | endPageIndex 示例：1 |
| traceId | string | 否 | traceId 示例：1493e8f16027aea9 |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"declareOccasion": "Operation_Finish",
				"activityClass_name": "人工",
				"code": "purple1",
				"activityClass": "2334638540207423508",
				"conversionFactor": 1,
				"num": 1,
				"creatorId": "1525641755939569667",
				"remark": {},
				"priceMultiple": 1,
				"measureBase": 0,
				"orgUnit_name": "收入中台演示销售组织1",
				"numUnit_precision": 4,
				"numUnit": "1554602256549019654",
				"logDr": 0,
				"activityClass_code": "0",
				"activityStatus": 1,
				"calCost": true,
				"id": "2177404048109993987",
				"pubts": "2025-08-14 19:16:26",
				"createDate": "2025-01-12 00:00:00",
				"orgUnit": "1525652227072458756",
				"numUnit_name": "吨1",
				"orgUnit_code": "pkm00",
				"creatorId_name": "u8c_vip管理员",
				"unit_name": "小时",
				"unit": "1525645209096421378",
				"createTime": "2025-01-12 20:00:04",
				"name": {
					"zh_CN": "紫1"
				}
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "1493e8f16027aea9",
	"uploadable": "0"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

