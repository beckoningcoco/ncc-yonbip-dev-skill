---
title: "接收方查询并更新"
apiId: "1758098992553000964"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Red Letter Application Form"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Red Letter Application Form]
platform_version: "BIP"
source_type: community-api-docs
---

# 接收方查询并更新

> `ContentType	application/json` 请求方式	POST | 分类: Red Letter Application Form (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/etax/redinfo-apply/receiveF-refresh

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
| nsrsbh | string | 否 | 是 | 接收方税号 示例：1234566544 |
| orgCode | string | 否 | 否 | 开票点编码。orgCode和orgId不能同时为空 示例：code123 |
| orgId | long | 否 | 否 | 组织id。orgCode和orgId不能同时为空 示例：56655 |
| applyTime | string | 否 | 是 | 申请日期范围，例：yyyy-MM-dd~yyyy-MM-dd 示例：2023-06-17~2023-06-27 |

## 3. 请求示例

Url: /yonbip/tax/api/etax/redinfo-apply/receiveF-refresh?access_token=访问令牌
Body: {
	"nsrsbh": "1234566544",
	"orgCode": "code123",
	"orgId": 56655,
	"applyTime": "2023-06-17~2023-06-27"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：0000 |
| message | string | 否 | 信息说明 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	参数不能为空	返回错误信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

