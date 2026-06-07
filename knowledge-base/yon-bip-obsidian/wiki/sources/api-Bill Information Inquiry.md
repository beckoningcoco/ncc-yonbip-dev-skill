---
title: "票据信息查询"
apiId: "1759401029063933961"
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

# 票据信息查询

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/tax/input-tax/api/bill/vat/query

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| fpDm | string | 否 | 否 | 发票代码（若有则必填） 示例：011002200111 |
| fpHm | string | 否 | 是 | 发票号码 示例：02695329 |
| billType | string | 否 | 是 | 票据类型 目前仅支持（invoice增值税，custbook海关缴款书） 示例：invoice |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/bill/vat/query?access_token=访问令牌
Body: [{
	"fpDm": "011002200111",
	"fpHm": "02695329",
	"billType": "invoice"
}]

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
| data | object | 是 | 发票信息 见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/ 示例：[{"发票信息":"见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/"}] |
| message | string | 否 | 提示信息 示例：查询成功 |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"发票信息": "见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/"
		}
	],
	"message": "查询成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


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

