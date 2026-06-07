---
title: "凭证删除"
apiId: "fd3bcd26f74540e7a7476a79c69493fe"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Voucher"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Voucher]
platform_version: "BIP"
source_type: community-api-docs
---

# 凭证删除

> `ContentType	application/json` 请求方式	POST | 分类: Voucher (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/voucher/del

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
| ids | string | 是 | 否 | 凭证id，目前只支持单个id删除 示例：["E5919010-0035-4996-A492-EB53F73CE6BA"] |

## 3. 请求示例

Url: /yonbip/fi/voucher/del?access_token=访问令牌
Body: {
	"ids": [
		"E5919010-0035-4996-A492-EB53F73CE6BA"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态编码（code等于200成功，code不等于200失败） 示例：200 |
| message | string | 否 | 返回信息 示例：OK |
| data | object | 否 | 返回数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "OK",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

404	删除失败	根据message信息提示，查找原因


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

