---
title: "应付结算清单删除"
apiId: "1632575755840913416"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "AP Invoices"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, AP Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 应付结算清单删除

> `ContentType	application/json` 请求方式	POST | 分类: AP Invoices (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/payable/delete

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条删除

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 否 | 业务数据 |
| id | string | 否 | 否 | 单据id 示例：1484061404544630789 |

## 3. 请求示例

Url: /yonbip/EFI/payable/delete?access_token=访问令牌
Body: {
	"data": {
		"id": "1484061404544630789"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 应付结算清单表头主键 示例：1513626559312822275 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1513626559312822275"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	数据库查询异常!	输入有效的id


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

更新

请求说明

更新

返回参数 id


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

