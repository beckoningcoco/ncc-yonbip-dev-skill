---
title: "开红票-全额(原发票红冲请求)(废弃)"
apiId: "adaa38b17fa84943becf9fe702bce674"
apiPath: "请求方式	POST"
method: "ContentType	application/x-www-form-urlencoded"
category: "Invoicing"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing]
platform_version: "BIP"
source_type: community-api-docs
---

# 开红票-全额(原发票红冲请求)(废弃)

> `ContentType	application/x-www-form-urlencoded` 请求方式	POST | 分类: Invoicing (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/invoiceclient-web/api/invoiceApply/red

请求方式	POST

ContentType	application/x-www-form-urlencoded

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| requestdatas | string | 否 | 是 | 发票红冲参数； 示例：请求参数详情见开放平台接口信息补充描述-销项发票管理-发票红冲请求：https://fapiao.yonyoucloud.com/apidoc/appendix/ |
| email | string | 否 | 否 | 邮件推送配置（可选） 示例：[ { "fpqqlsh":"12522222", "address": "x1@yonyou.com,x2@yonyou.com" } ] |
| sms | string | 否 | 否 | 短信推送配置（可选） 示例：[{ "fpqqlsh":"12522222", "address": "13511111111,13511111112" }] |
| url | string | 否 | 否 | 回调服务配置；返回结果详情见开放平台接口信息补充描述-销项发票管理-常规回调数据样例：https://fapiao.yonyoucloud.com/apidoc/appendix/ 示例：[{ "fpqqlsh":"12522222", "url": "http://url.com/msg" }] |
| autoAudit | string | 否 | 否 | 是否自动审核（可选）：true:自动审核，false:不自动审核。 如果不传，代表false 示例：true |
| nc6x-ubl | string | 否 | 否 | ncc友企联回调参数；返回结果详情见开放平台接口信息补充描述-销项发票管理-NCC友企联回调数据样例：https://fapiao.yonyoucloud.com/apidoc/appendix/ 示例：[{ "fpqqlsh":"12522222", "url": "http://url.com/msg" }] |
| delurl | string | 否 | 否 | 退回业务系统回调服务配置；返回结果详情见开放平台接口信息补充描述-销项发票管理-常规回调数据样例：https://fapiao.yonyoucloud.com/apidoc/appendix/ 示例：[{ "fpqqlsh":"12522222", "method":"queryUserPermAppPksOrCodes", "intf":"nccloud.pubitf.baseapp.apprbac.IAppAndOrgPermQueryPubService" }] |

## 3. 请求示例

Url: /yonbip/tax/invoiceclient-web/api/invoiceApply/red?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| message | string | 否 | 信息说明 示例：success |
| data | string | 否 | 响应信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	未知错误	系统错误，联系管理员

1002	数据不存在	红冲的发票在税务云不存在

1001	数据不合法。传入参数	数据传入格式不合法，可能不是json格式。


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

