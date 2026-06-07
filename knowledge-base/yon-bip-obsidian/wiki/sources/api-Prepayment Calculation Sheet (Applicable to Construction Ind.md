---
title: "预缴计算表（建筑业适用）-不征税发票取消核销"
apiId: "2303439396135770146"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Advance payment calculation table(Applicable to construction industry)"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Advance payment calculation table(Applicable to construction industry)]
platform_version: "BIP"
source_type: community-api-docs
---

# 预缴计算表（建筑业适用）-不征税发票取消核销

> `ContentType	application/json` 请求方式	POST | 分类: Advance payment calculation table(Applicable to construction industry) (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbuilding/api/prepayment/cancel-write-off

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
| orgCode | string | 否 | 是 | 会计主体编码 示例：1895096569401704449 |
| fpDm | string | 否 | 否 | 发票代码 示例：111 |
| fpHm | string | 否 | 是 | 发票号码 示例：2222 |
| dtoList | object | 是 | 是 | 发票集合 |
| fpDm | string | 否 | 否 | 发票代码 示例：202321143045 |
| fpHm | string | 否 | 是 | 发票号码 示例：62313235 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbuilding/api/prepayment/cancel-write-off?access_token=访问令牌
Body: {
	"orgCode": "1895096569401704449",
	"fpDm": "111",
	"fpHm": "2222",
	"dtoList": [
		{
			"fpDm": "202321143045",
			"fpHm": "62313235"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 操作码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 操作描述 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统错误	根据具体返回信息调整数据

1001	校验错误	根据具体返回信息调整数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-12

更新

请求参数 orgCode

降板

2	2025-07-10

更新

请求参数 fpDm


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

