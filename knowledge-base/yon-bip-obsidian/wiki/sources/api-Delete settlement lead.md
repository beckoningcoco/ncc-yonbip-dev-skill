---
title: "删除核销线索"
apiId: "2123274240391118852"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Settlement Relationship"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Settlement Relationship]
platform_version: "BIP"
source_type: community-api-docs
---

# 删除核销线索

> `ContentType	application/json` 请求方式	POST | 分类: Settlement Relationship (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/verify/relation/delete

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量删除

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| relationIds | string | 是 | 是 | 线索ID集合 示例：["2123246958744174593"] |

## 3. 请求示例

Url: /yonbip/EFI/verify/relation/delete?access_token=访问令牌
Body: {
	"relationIds": [
		"2123246958744174593"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| success | boolean | 否 | 是否成功 示例：true |
| failCode | string | 否 | 失败编码（400 请求错 误；500 服务器内部错 误） 示例：null |
| message | string | 否 | 返回信息 示例：null |
| successCount | string | 否 | 注册成功数量 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"success": true,
		"failCode": "null",
		"message": "null",
		"successCount": "1"
	}
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

