---
title: "成本特征默认值查询"
apiId: "2343570105114820611"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Component"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Component]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本特征默认值查询

> `ContentType	application/json` 请求方式	POST | 分类: Cost Component (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/yonbip-fi-epub/sensitivedefault/bill/list

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
| orgId | string | 否 | 否 | 组织 |
| material | string | 是 | 否 | 物料,参考物料参照 |
| characteristicId | string | 是 | 否 | 成本特征,参考成本特征参照 |

## 3. 请求示例

Url: /yonbip/FCC/yonbip-fi-epub/sensitivedefault/bill/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"simple": {
		"orgId": "",
		"material": [
			""
		],
		"characteristicId": [
			""
		]
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
| traceId | string | 否 | traceId 示例：b8bd54f3a05295f1 |
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
				"orgId": "1811332586637623306",
				"orgId_code": "*ASAP",
				"orgIdName": "*ASAP",
				"defaultValue": "2313811728421355523",
				"creatorId": "1525641755939569667",
				"orderNum": 0,
				"creatorId_name": "u8c_vip管理员",
				"cellConfig": "{\"cExtProps\":\"{\\\"isNewRefer\\\":true,\\\"displayname\\\":\\\"name\\\"}\",\"cControlType\":\"refer\",\"refReturn\":\"id\",\"cRefType\":\"ucfbasedoc.LZC_DN\"}",
				"material": "2313814829361004545",
				"defaultValueName": "台式机",
				"createTime": "2025-08-24 15:41:19",
				"id": "2343516941997572096",
				"pubts": "2025-08-24 15:41:19",
				"characteristicId": "2313812759196729353",
				"characteristicName": "电脑主机类型",
				"characteristicCode": "LZC_DN",
				"material_name": "LZC-主产品",
				"createDate": "2025-08-24 00:00:00",
				"material_code": "0000234221"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "b8bd54f3a05295f1",
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

