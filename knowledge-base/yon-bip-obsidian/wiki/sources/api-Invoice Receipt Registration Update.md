---
title: "收票登记更新"
apiId: "2043722254828175368"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Bill Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Bill Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 收票登记更新

> `ContentType	application/json` 请求方式	POST | 分类: Bill Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/register/modify

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| id | string | 否 | 是 | 收票登记主键 示例：123455 |
| signRefuse | number |
| 小数位数:-1,最大长度:1 | 否 | 否 | 签收：1 拒收：2 示例：1 |
| ticketCollectionEnd | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 收票完成：1：是 0： 否 |
| hasused | boolean | 否 | 否 | true：占用， false：不占用 |

## 3. 请求示例

Url: /yonbip/ctm/api/register/modify?access_token=访问令牌
Body: [{
	"id": "123455",
	"signRefuse": 1,
	"ticketCollectionEnd": 0,
	"hasused": true
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| id | string | 否 | 收票登记主键 示例：12345 |
| success | boolean | 否 | 是否成功 示例：true |
| message | string | 否 | 失败表述 示例：单据不存在 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "12345",
		"success": true,
		"message": "单据不存在"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1022020403001	参数错误

1022020403500	服务器异常

1022020403004	日期格式错误

1022020403002	参数为空


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

