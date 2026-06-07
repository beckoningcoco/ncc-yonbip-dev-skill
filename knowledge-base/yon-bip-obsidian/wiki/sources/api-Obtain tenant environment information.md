---
title: "获取租户环境信息"
apiId: "1758565314336391172"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Tax Common Settings"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Common Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取租户环境信息

> `ContentType	application/json` 请求方式	GET | 分类: Tax Common Settings (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/env/corp-env

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/env/corp-env?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应编码 示例：200 |
| data | object | 否 | 租户信息 |
| corpId | string | 否 | 租户id 示例：0000LEC83AYQD8S8W60000 |
| env | string | 否 | 所属环境 示例：ys |
| url | string | 否 | 税务云地址 示例：https://bip-daily.yonyoucloud.com/yonbip-fi-taxgateway |
| message | string | 否 | 响应信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"corpId": "0000LEC83AYQD8S8W60000",
		"env": "ys",
		"url": "https://bip-daily.yonyoucloud.com/yonbip-fi-taxgateway"
	},
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统错误	系统错误，根据返回信息修改


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

