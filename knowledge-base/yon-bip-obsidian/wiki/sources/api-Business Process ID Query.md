---
title: "业务流id查询"
apiId: "bd6d1428e290433793115184e47a84fc"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Business Process"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Process]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务流id查询

> `ContentType	application/json` 请求方式	GET | 分类: Business Process (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/businessFlow/getFlowByBillNumAndTransTypeId

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| billNum | string | query | 是 | 单据类型，适用以下单据类型：采购订单（st_purchaseorder）、采购发票（st_purinvoice）、采购入库单（st_purinrecord）、其他出库单（st_othoutrecord）、其他入库单（st_othinrecord）、出库申请单（po_picking_requisition）、调拨订单（st_transferapply）、调入申请（aum_deploy_apply_card）、销售订单（voucher_order）、销售报价（quote_salesquotation）、销售合同（sact_salescontract）、销售退货（voucher_salereturn） |
| transTypeId | string | query | 是 | 交易类型id或code |

## 3. 请求示例

Url: /yonbip/digitalModel/businessFlow/getFlowByBillNumAndTransTypeId?access_token=访问令牌&billNum=&transTypeId=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码 示例：200 |
| message | string | 否 | 请求结果信息 示例：OK |
| data | object | 是 | 请求结果数据 |
| describe | string | 否 | 流程描述 示例：采购订单、采购入库单、采购发票 |
| id | string | 否 | 业务流id 示例：b2ffed6e-79a4-11ea-8d5f-0624d60000dc |
| name | string | 否 | 业务流名称 示例：无源单采购退货 |
| transactionTypeId | string | 否 | 交易类型id 示例：1567661173543168 |
| transactionTypeName | string | 否 | 交易类型名称 示例：采购退货 |
| version | string | 否 | 版本 示例：V1.0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "OK",
	"data": [
		{
			"describe": "采购订单、采购入库单、采购发票",
			"id": "b2ffed6e-79a4-11ea-8d5f-0624d60000dc",
			"name": "无源单采购退货",
			"transactionTypeId": "1567661173543168",
			"transactionTypeName": "采购退货",
			"version": "V1.0"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-26

删除

错误码 20001

补充应用编码


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

