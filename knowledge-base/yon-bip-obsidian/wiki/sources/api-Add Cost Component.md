---
title: "成本组件新增"
apiId: "2279070682842660872"
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

# 成本组件新增

> `ContentType	application/json` 请求方式	POST | 分类: Cost Component (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/yonbip-fi-epub/component/bill/save

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
| billnum | string | 否 | 否 | 单据编码 示例：epub_component |
| data | object | 否 | 否 | 数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 否 | 编码 示例：005 |
| name | object | 否 | 否 | 名称 |
| purpose | string | 否 | 否 | 核算目的 示例：6 |
| header | string | 否 | 否 | 组件分类ID 示例：1525643774565286108 |
| header_name | string | 否 | 否 | 组件分类 示例：采购成本 |
| itemDetailRestore | string | 否 | 否 | 分项明细还原 示例：0 |
| dataSource | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 数据来源 示例：2 |
| createTime | string | 否 | 否 | 创建时间 示例：2025-05-29 17:37:22 |
| is_buy | number |
| 小数位数:0,最大长度:10 | 否 | 否 | is_buy 示例：1 |
| _status | string | 否 | 否 | _status 示例：Insert |

## 3. 请求示例

Url: /yonbip/AMP/yonbip-fi-epub/component/bill/save?access_token=访问令牌
Body: {
	"billnum": "epub_component",
	"data": {
		"resubmitCheckKey": "",
		"code": "005",
		"name": {
			"zh_CN": "005",
			"en_US": "",
			"zh_TW": ""
		},
		"purpose": "6",
		"header": "1525643774565286108",
		"header_name": "采购成本",
		"itemDetailRestore": "0",
		"dataSource": 2,
		"createTime": "2025-05-29 17:37:22",
		"is_buy": 1,
		"_status": "Insert"
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
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据 |
| _realtype | string | 否 | _realtype 示例：true |
| _entityName | string | 否 | _entityName 示例：epub.component.CostComponentDTO |
| _keyName | string | 否 | _keyName 示例：id |
| code | string | 否 | 编码 示例：006 |
| name | object | 否 | 名称 |
| purpose | number |
| 小数位数:0,最大长度:10 | 否 | 核算目的 示例：6 |
| header | string | 否 | 组件分类ID 示例：1525643774565286108 |
| header_name | string | 否 | 组件分类 示例：采购成本 |
| itemDetailRestore | number |
| 小数位数:0,最大长度:10 | 否 | 分项明细还原 示例：0 |
| dataSource | number |
| 小数位数:0,最大长度:10 | 否 | 数据来源 示例：2 |
| createTime | string | 否 | 创建时间 示例：2025-05-29 17:37:22 |
| is_buy | number |
| 小数位数:0,最大长度:10 | 否 | is_buy 示例：1 |
| _status | string | 否 | _status 示例：Insert |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | id 示例：2279055830832119815 |
| traceId | string | 否 | traceId 示例：ec5b2552995e808f |
| uploadable | string | 否 | uploadable 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"_realtype": "true",
		"_entityName": "epub.component.CostComponentDTO",
		"_keyName": "id",
		"code": "006",
		"name": {
			"zh_CN": "006"
		},
		"purpose": 6,
		"header": "1525643774565286108",
		"header_name": "采购成本",
		"itemDetailRestore": 0,
		"dataSource": 2,
		"createTime": "2025-05-29 17:37:22",
		"is_buy": 1,
		"_status": "Insert",
		"resubmitCheckKey": "epub_component_add_28aaa19e-857f-4c4d-a7ba-d3eab9b54f5f",
		"id": "2279055830832119815"
	},
	"traceId": "ec5b2552995e808f",
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

