---
title: "成本组件删除"
apiId: "2279077357221838853"
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

# 成本组件删除

> `ContentType	application/json` 请求方式	POST | 分类: Cost Component (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/yonbip-fi-epub/component/bill/batchdelete

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| billnum | string | 否 | 否 | 单据编码 示例：epub_component_treelist |
| data | object | 是 | 否 | 数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 否 | 编码 示例：005 |
| name | string | 否 | 否 | 名称 示例：005 |
| header | string | 否 | 否 | 组件分类ID 示例：1525643774565286108 |
| header_name | string | 否 | 否 | 组件分类 示例：采购成本 |
| itemDetailRestore | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 分项明细还原 示例：0 |
| dataSource | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 数据来源 示例：2 |
| purpose | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 核算目的 示例：6 |
| tenant | number |
| 小数位数:0,最大长度:16 | 否 | 否 | tenant 示例：2909930715861584 |
| pubts | string | 否 | 否 | 时间戳 示例：2025-05-29 19:10:19 |
| id | string | 否 | 否 | id 示例：2279055830832119815 |

## 3. 请求示例

Url: /yonbip/AMP/yonbip-fi-epub/component/bill/batchdelete?access_token=访问令牌
Body: {
	"billnum": "epub_component_treelist",
	"data": [
		{
			"resubmitCheckKey": "",
			"code": "005",
			"name": "005",
			"header": "1525643774565286108",
			"header_name": "采购成本",
			"itemDetailRestore": 0,
			"dataSource": 2,
			"purpose": 6,
			"tenant": 2909930715861584,
			"pubts": "2025-05-29 19:10:19",
			"id": "2279055830832119815"
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据 |
| count | number |
| 小数位数:0,最大长度:10 | 否 | 总数 示例：1 |
| sucessCount | number |
| 小数位数:0,最大长度:10 | 否 | 成功数 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | 失败数 示例：0 |
| messages | string | 是 | 返回消息 |
| infos | string | 是 | infos |
| failInfos | string | 是 | 失败数量 |
| traceId | string | 否 | traceId 示例：94abfa46e5eebc97 |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			""
		],
		"failInfos": [
			""
		]
	},
	"traceId": "94abfa46e5eebc97",
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

