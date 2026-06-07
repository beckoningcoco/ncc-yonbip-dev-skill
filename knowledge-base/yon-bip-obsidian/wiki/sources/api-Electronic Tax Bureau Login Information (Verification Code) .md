---
title: "电子税局登录信息（验证码）获取"
apiId: "1761583447992696833"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子税局登录信息（验证码）获取

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/vat/send-etax-smscode

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
| username | string | 否 | 否 | 电子税局-用户名 示例：111 |
| phone | string | 否 | 是 | 电子税局-手机号 示例：111111111 |
| password | string | 否 | 是 | 电子税局-密码 示例：123456 |
| userType | string | 否 | 否 | 电子税局-用户类型(税局返回，没有填空) 示例：0 |
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：91110000600001760P |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/vat/send-etax-smscode?access_token=访问令牌
Body: {
	"username": "111",
	"phone": "111111111",
	"password": "123456",
	"userType": "0",
	"nsrsbh": "91110000600001760P"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| data | long | 否 | 返回结果 0-短信已发送成功；1-登录信息未过期，无须登录，不发短信，可直接业务操作. 示例：0 |
| message | string | 否 | 消息 示例：验证码已发送成功，请查收! |

## 5. 正确返回示例

{
	"code": "200",
	"data": 0,
	"message": "验证码已发送成功，请查收!"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-07

删除

请求参数 orgcode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

