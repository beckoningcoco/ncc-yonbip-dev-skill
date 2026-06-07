---
title: "结算明细批量退回"
apiId: "2235877399351263235"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Settlement Document"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 结算明细批量退回

> `ContentType	application/json` 请求方式	POST | 分类: Settlement Document (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/settlement/batchBack

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
| settleBenchDetailId | number |
| 小数位数:0,最大长度:20 | 否 | 是 | 结算明细ID 示例：1741573848087134216 |
| backReason | string | 否 | 是 | 退回原因 示例：退回原因 |
| linkedOp | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 联动操作 0 仅退回待结算 1 退回待结算 + 待结算退回 示例：1 |

## 3. 请求示例

Url: /yonbip/ctm/api/settlement/batchBack?access_token=访问令牌
Body: [{
	"settleBenchDetailId": 1741573848087134216,
	"backReason": "退回原因",
	"linkedOp": 1
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
| code | string | 否 | 返回编码 示例：200 |
| data | object | 是 | 返回数据 |
| settleBenchDetailId | number |
| 小数位数:1,最大长度:10 | 否 | 结算明细ID 示例：123456 |
| code | string | 否 | 结算明细退回状态code 成功是200 失败是999 示例：200 |
| message | string | 否 | 结算明细退回操作信息 示例：退回成功 |
| message | string | 否 | 返回信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"settleBenchDetailId": 123456,
			"code": "200",
			"message": "退回成功"
		}
	],
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

