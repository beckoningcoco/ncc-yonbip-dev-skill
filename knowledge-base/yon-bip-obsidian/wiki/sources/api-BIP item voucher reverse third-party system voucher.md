---
title: "BIP事项凭证逆向三方系统凭证"
apiId: "2173634853552521223"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Event Entry"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Event Entry]
platform_version: "BIP"
source_type: community-api-docs
---

# BIP事项凭证逆向三方系统凭证

> `ContentType	application/json` 请求方式	POST | 分类: Event Entry (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/eaai/voucher/reverse

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |

## 3. 请求示例

Url: /yonbip/AMP/eaai/voucher/reverse?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| status | int | 否 | 请求状态码 1执行中 |
| msg | string | 否 | 提示信息 |
| data | object | 否 | 集成方案的执行返回结果 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"status": 0,
		"msg": "",
		"data": {}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-27

更新

请求说明

删除

请求参数 (7)

新增

返回参数 status

新增

返回参数 msg

新增

返回参数 data

删除

返回参数 code

删除

返回参数 message

2	2025-09-25

新增

请求参数 entityRegistCode

更新

请求参数 accBookId


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

