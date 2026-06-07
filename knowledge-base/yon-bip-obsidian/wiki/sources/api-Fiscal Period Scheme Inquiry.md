---
title: "会计期间方案查询"
apiId: "2668c9364ada40a8bfd4dfc0a1472ad1"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fiscal Period Scheme"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fiscal Period Scheme]
platform_version: "BIP"
source_type: community-api-docs
---

# 会计期间方案查询

> `ContentType	application/json` 请求方式	POST | 分类: Fiscal Period Scheme (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/bill/list

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
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |

## 3. 请求示例

Url: /yonbip/digitalModel/bill/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| code | string | 否 | 编码 |
| name | string | 否 | 名称 |
| periodClass | string | 否 | 期间类型, 1:月、 |
| startdate | Date | 否 | 起始日期 |
| startyear | string | 否 | 起始年度 |
| description | string | 否 | 描述 |
| stopstatus | string | 否 | 状态, false:启用、true:停用、 |
| stoptime | Date | 否 | 停用时间 |
| id | string | 否 | 会计期间方案ID |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"code": "",
		"name": "",
		"periodClass": "",
		"startdate": "",
		"startyear": "",
		"description": "",
		"stopstatus": "",
		"stoptime": "",
		"id": "",
		"pubts": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	请求成功

999	请求错误


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

