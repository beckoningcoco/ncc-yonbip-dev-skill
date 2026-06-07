---
title: "合同冻结"
apiId: "1477226625536360449"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Register"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Register]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同冻结

> `ContentType	application/json` 请求方式	POST | 分类: Contract Register (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/apct/openapi/bill/freeze

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
| custMap | object | 否 | 否 | 自定义项 |
| reason | string | 否 | 否 | 原因 示例：因为XXX，该合同暂时冻结。 |
| data | object | 否 | 是 | 请求数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 是 | id 示例：1468595502081638406 |

## 3. 请求示例

Url: /yonbip/znbz/apct/openapi/bill/freeze?access_token=访问令牌
Body: {
	"custMap": {
		"reason": "因为XXX，该合同暂时冻结。"
	},
	"data": {
		"resubmitCheckKey": "",
		"id": "1468595502081638406"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 响应信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功"
}

## 6. 业务异常码

035-504-000221

未找到对应的付款合同


## 7. 错误返回码

999	付款合同查询失败，未找到对应的付款合同	合同不存在，新增后重试


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

