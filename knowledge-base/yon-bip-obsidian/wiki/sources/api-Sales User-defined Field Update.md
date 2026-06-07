---
title: "销售自定义项更新"
apiId: "10a8633f98db42579bd83e121fe451d3"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Order"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售自定义项更新

> `ContentType	application/json` 请求方式	POST | 分类: Sales Order (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/api/updateDefinesInfo

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
| billnum | string | 否 | 是 | 来源单据,销售订单：voucher_order 示例：voucher_order |
| datas | object | 是 | 是 | 自定义项更新数组 |
| id | string | 否 | 是 | 销售订单id 示例：2503323413025280 示例：2503323413025280 |
| code | string | 否 | 是 | 销售订单code 示例：33 示例：33 |
| definesInfo | object | 是 | 是 | 自定义数组(1-60)) |

## 3. 请求示例

Url: /yonbip/sd/api/updateDefinesInfo?access_token=访问令牌
Body: {
	"billnum": "voucher_order",
	"datas": [
		{
			"id": "2503323413025280",
			"code": "33",
			"definesInfo": [
				{
					"define12": "33",
					"isHead": true,
					"isFree": false,
					"detailIds": "5555"
				}
			]
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
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回状态 示例：200 |
| message | string | 否 | 返回操作 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

code	999


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

