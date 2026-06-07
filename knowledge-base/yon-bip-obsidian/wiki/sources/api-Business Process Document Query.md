---
title: "业务流单据查询"
apiId: "a6fcd21e9914456692e50acdfc96fbe1"
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

# 业务流单据查询

> `ContentType	application/json` 请求方式	GET | 分类: Business Process (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/businessFlow/getTransTypeByFlowIdAndBillNum

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| flowId | string | query | 是 | 业务流id |
| billNum | string | query | 是 | 单据类型，适用以下单据类型：材料出库单(st_materialout)、采购订单(st_purchaseorder)、采购发票(st_purinvoice)、采购入库单(st_purinrecord)、产品入库单(st_storeprorecord)、出库申请单(po_picking_requisition)、到货单(pu_arrivalorder)、盘点差异单(st_storecheckdifference)、其他出库单(st_othoutrecord)、其他入库单(st_othinrecord)、请购单(pu_applyorder)、调拨订单(st_transferapply)、调拨申请(st_transferreq)、调出单(st_storeou)、调入单(st_storein)、委外入库单(st_osminrecord)、销售报价(quote_salesquotation)、销售出库单(st_salesout)、销售订单(voucher_order)、销售发货(voucher_delivery)、销售发票(voucher_saleinvoice)、销售合同(sact_salescontract)、销售退货(voucher_salereturn)、形态转换单(st_morphologyconversion)、转库单(st_storetransfer)、 |

## 3. 请求示例

Url: /yonbip/digitalModel/businessFlow/getTransTypeByFlowIdAndBillNum?access_token=访问令牌&flowId=&billNum=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求结果状态码 示例：200 |
| data | object | 否 | 请求结果数据 |
| billDes | string | 否 | 单据名称 示例：采购发票 |
| billDomain | string | 否 | 单据所属领域 示例：upu |
| billSubId | string | 否 | 单据所属应用 示例：PU |
| billType | string | 否 | 单据类型 示例：st_purinvoice |
| businessFlowId | string | 否 | 业务流id 示例：ffc8f89b-3250-11ec-9f55-b8599feb8d54 |
| businessFlowName | string | 否 | 业务流名称 示例：普通订货（有到货） |
| createTime | string | 否 | 创建时间 示例：2021-10-21 17:26:41 |
| formId | string | 否 | 单据全名 示例：PU.st_purinvoice |
| fullName | string | 否 | 实体uri 示例：pu.purinvoice.PurInvoice |
| id | string | 否 | 流程单据id 示例：000032af-3251-11ec-9f55-b8599feb8d54 |
| isCoreBill | boolean | 否 | 是否核心单据 示例：是：true, 否：false |
| nodeId | string | 否 | 节点id 示例：ruleItemNode_8db27a34107b3003e99e4853981a6f31 |
| showFieldStr | string | 否 | 流程字段显示值 |
| tenantId | string | 否 | 租户id 示例：0000KUYUNZ089IQ9EW0000 |
| transTypes | object | 是 | 可用交易类型数据 |
| transactionTypeId | string | 否 | 流程单据中配置的交易类型id |
| transactionTypeName | string | 否 | 流程单据中配置的交易类型名称 |
| message | string | 否 | 请求结果信息 示例：OK |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"billDes": "采购发票",
		"billDomain": "upu",
		"billSubId": "PU",
		"billType": "st_purinvoice",
		"businessFlowId": "ffc8f89b-3250-11ec-9f55-b8599feb8d54",
		"businessFlowName": "普通订货（有到货）",
		"createTime": "2021-10-21 17:26:41",
		"formId": "PU.st_purinvoice",
		"fullName": "pu.purinvoice.PurInvoice",
		"id": "000032af-3251-11ec-9f55-b8599feb8d54",
		"isCoreBill": "",
		"nodeId": "ruleItemNode_8db27a34107b3003e99e4853981a6f31",
		"showFieldStr": "",
		"tenantId": "0000KUYUNZ089IQ9EW0000",
		"transTypes": [
			{
				"code": "A50001",
				"id": "2019511782445329",
				"name": "通用采购发票",
				"order": 0
			}
		],
		"transactionTypeId": "",
		"transactionTypeName": ""
	},
	"message": "OK"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


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

