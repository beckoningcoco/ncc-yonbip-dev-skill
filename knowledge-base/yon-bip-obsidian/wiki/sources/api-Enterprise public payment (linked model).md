---
title: "企业对公打款（联动模式）"
apiId: "1814338479737274374"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业对公打款（联动模式）

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/v1/identity/publicMoney/send

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
| flowId | string | 否 | 是 | 实名认证流程ID 示例：73577c969f9e4c488eb |
| accountNo | string | 否 | 是 | 对公账号 示例：6226220138102 |
| accountBank | string | 否 | 是 | 账号开户行银联号 示例：北京银行股份有限公司天津科创支行 |
| accountProv | string | 否 | 是 | 开户行所在省 示例：天津 |
| accountCity | string | 否 | 是 | 开户行所在市 示例：天津市 |
| companyAppAuthId | string | 否 | 是 | 待认证的企业授权ID 示例：1806237724627173 |

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/identity/publicMoney/send?access_token=访问令牌
Body: {
	"flowId": "73577c969f9e4c488eb",
	"accountNo": "6226220138102",
	"accountBank": "北京银行股份有限公司天津科创支行",
	"accountProv": "天津",
	"accountCity": "天津市",
	"companyAppAuthId": "1806237724627173"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据 示例：{ "verifyId": "验证流水号", "orderId": "验证流水号", "orderDate": "验证订单日期" } |
| verifyId | string | 否 | 验证流水号 示例：39ffd99392e94805974f94cad86b5a44 |
| orderId | string | 否 | 验证流水号 示例：ac1a54c5e47e4c83938b14976eb2ab30 |
| orderDate | string | 否 | 验证订单日期 示例：20231008 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"verifyId": "39ffd99392e94805974f94cad86b5a44",
		"orderId": "ac1a54c5e47e4c83938b14976eb2ab30",
		"orderDate": "20231008"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	后端系统异常信息	后端系统异常导致业务执行失败


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

