---
title: "待结算数据批量退回"
apiId: "2252255930720714754"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Data Pending Settlement"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Data Pending Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 待结算数据批量退回

> `ContentType	application/json` 请求方式	POST | 分类: Data Pending Settlement (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/datasettled/batchBack

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
| id | number |
| 小数位数:0,最大长度:20 | 否 | 是 | 待结算数据ID 示例：123456789 |
| backReason | string | 否 | 是 | 退回原因 示例：退回 |

## 3. 请求示例

Url: /yonbip/ctm/api/datasettled/batchBack?access_token=访问令牌
Body: [{
	"id": 123456789,
	"backReason": "退回"
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
| code | string | 否 | 200 示例：编码 |
| message | string | 否 | 操作成功 示例：操作成功 |
| data | object | 是 | 返回数据 |
| id | number |
| 小数位数:0,最大长度:20 | 否 | 待结算ID 示例：123456 |
| code | string | 否 | 退回结果code 成功是200 失败是999 示例：200 |
| message | string | 否 | 退回结果信息 示例：退回成功 |

## 5. 正确返回示例

{
	"code": "编码",
	"message": "操作成功",
	"data": [
		{
			"id": 123456,
			"code": "200",
			"message": "退回成功"
		}
	]
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

