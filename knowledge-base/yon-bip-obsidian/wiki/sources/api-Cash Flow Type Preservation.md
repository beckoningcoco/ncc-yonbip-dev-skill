---
title: "现金流量类型保存"
apiId: "2227069031289978884"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cash Flow Type"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cash Flow Type]
platform_version: "BIP"
source_type: community-api-docs
---

# 现金流量类型保存

> `ContentType	application/json` 请求方式	POST | 分类: Cash Flow Type (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/yonbip-fi-epub/cashflowtype/bill/save

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
| billnum | string | 否 | 是 | 单据编码，固定为fiepub_cashflowtypecard 示例：fiepub_cashflowtypecard 默认值：fiepub_cashflowtypecard |
| data | object | 否 | 是 | 保存的实体 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| accentity | string | 否 | 是 | 会计主体id 示例：1525652227072458756 |
| code | string | 否 | 是 | 编码 示例：002 |
| name | object | 否 | 是 | 名称，支持多语 |
| accstandard | string | 否 | 是 | 会计准则id 示例：1525643757385416704 |
| _status | string | 否 | 是 | 保存的状态,Insert:新增，Update:更新 示例：Insert |
| id | string | 否 | 否 | 现金流量类型id，如果为新增，该字段不必传，如果是更新需要传 |

## 3. 请求示例

Url: /yonbip/AMP/yonbip-fi-epub/cashflowtype/bill/save?access_token=访问令牌
Body: {
	"billnum": "fiepub_cashflowtypecard",
	"data": {
		"resubmitCheckKey": "",
		"accentity": "1525652227072458756",
		"code": "002",
		"name": {
			"zh_CN": "现金流量类型002",
			"en_US": "",
			"zh_TW": "",
			"id_ID": "",
			"ja_JP": ""
		},
		"accstandard": "1525643757385416704",
		"_status": "Insert",
		"id": ""
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
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 响应的主要实体 |
| accentity | string | 否 | 会计主体id 示例：1525652227072458756 |
| code | string | 否 | 名称 示例：003 |
| name | object | 否 | 名称 |
| accstandard | string | 否 | 会计准则id 示例：1525643757385416704 |
| system | number |
| 小数位数:0,最大长度:10 | 否 | 是否预置,1:是，0：否 示例：0 |
| id | string | 否 | id 示例：2227050958092238851 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"accentity": "1525652227072458756",
		"code": "003",
		"name": {
			"zh_CN": "现金流量类型003"
		},
		"accstandard": "1525643757385416704",
		"system": 0,
		"id": "2227050958092238851"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决


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

