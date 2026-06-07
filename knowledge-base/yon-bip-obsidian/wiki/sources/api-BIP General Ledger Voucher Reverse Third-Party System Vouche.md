---
title: "BIP总账凭证逆向三方系统凭证"
apiId: "2207716759060348936"
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

# BIP总账凭证逆向三方系统凭证

> `ContentType	application/json` 请求方式	POST | 分类: Voucher (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/openapi/voucher/integrationReverse

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
| externalMainMarking | string | 否 | 否 | 三方凭证主要标识（一般就是主键） 示例：111111 |
| ysVoucherId | string | 否 | 否 | YS凭证ID 示例：1674785921224933381 |
| externalSecondaryMarking | string | 否 | 否 | 三方凭证次要标识（一般就是凭证号） 示例：code111111 |

## 3. 请求示例

Url: /yonbip/EFI/openapi/voucher/integrationReverse?access_token=访问令牌
Body: [{
	"externalMainMarking": "111111",
	"ysVoucherId": "1674785921224933381",
	"externalSecondaryMarking": "code111111"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| data | object | 否 | 响应详情 |
| code | string | 否 | 响应编码 |
| mesage | string | 否 | 响应详情 |
| code | number |
| 小数位数:2,最大长度:10 | 否 | 响应编码 示例：200 |
| message | string | 否 | 响应信息 示例：成功 |

## 5. 正确返回示例

{
	"data": {
		"code": "",
		"mesage": ""
	},
	"code": 200,
	"message": "成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

