---
title: "采购订单更新"
apiId: "1744462668969803778"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购订单更新

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purchaseorder/update

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
| data | object | 否 | 是 | 采购订单[pu.purchaseorder.PurchaseOrder] |
| id | string | 否 | 是 | 采购订单主表id：新增时无需填写，修改时必填 示例：1234321234322332 |
| _status | string | 否 | 是 | 操作标识，Update:更新 示例：Update 默认值：Update |
| memo | string | 否 | 否 | 备注 示例：采购订单 |
| operator | string | 否 | 否 | 采购员：录入采购员id或code 示例：1451464415082708997 |
| department | string | 否 | 否 | 采购部门：录入部门id和code 示例：1451464415082708997 |
| headItem | object | 否 | 否 | 表头自定义项 |
| headFreeItem | object | 否 | 否 | 表头自由自定义项 |
| purchaseOrders | object | 是 | 否 | 采购订单子表[pu.purchaseorder.PurchaseOrders] |

## 3. 请求示例

Url: /yonbip/scm/purchaseorder/update?access_token=访问令牌
Body: {
	"data": {
		"id": "1234321234322332",
		"_status": "Update",
		"memo": "采购订单",
		"operator": "1451464415082708997",
		"department": "1451464415082708997",
		"headItem": {
			"id": "2343232343234",
			"_status": "Update",
			"define1": "define1",
			"define2": "define2"
		},
		"headFreeItem": {
			"id": "34543454324",
			"_status": "Update",
			"define1": "define1",
			"define2": "define2"
		},
		"purchaseOrders": [
			{
				"id": 1234321234322332,
				"_status": "Update",
				"recieveDate": "2023-06-28 00:00:00",
				"memo": "采购订单",
				"bodyParallel": {
					"id": "23432343234323",
					"_status": "Update",
					"reqDept": "1451464415082708997",
					"reqPsn": "1451464415082708997"
				},
				"bodyItem": {
					"id": "23432343234323",
					"_status": "Update",
					"define1": "23432343234323",
					"define2": "23432343234322"
				},
				"bodyFreeItem": {
					"id": "34543234543234",
					"_status": "Update",
					"define1": "define1",
					"define2": "define2"
				}
			}
		]
	}
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
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 单据信息 |
| id | long | 否 | 采购订单主表id 示例：2410387773493760 |
| isFromApiUpdate | boolean | 否 | 是否来自Api更新：true or false 示例：true |
| memo | string | 否 | 备注 示例：采购订单备注 |
| operator | string | 否 | 采购员id 示例：1451464415082708997 |
| department | string | 否 | 采购部门id 示例：2262688837571584 |
| purchaseOrders | object | 是 | 采购订单子表 |
| headItem | object | 否 | 表头自定义项 |
| headFreeItem | object | 否 | 表头自由自定义项 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2410387773493760,
		"isFromApiUpdate": true,
		"memo": "采购订单备注",
		"operator": "1451464415082708997",
		"department": "2262688837571584",
		"purchaseOrders": [
			{
				"id": 2410387773526528,
				"memo": "采购订单更新",
				"recieveDate": "2021-08-30 18:13:15",
				"bodyItem": {
					"define1": "表体1",
					"id": 2410387773526528
				},
				"bodyFreeItem": {
					"id": "2410387773526528",
					"define1": "define1"
				},
				"bodyParallel": {
					"id": 2410387773526528,
					"reqDept": "2410387773526528",
					"reqPsn": "2410387773526528"
				}
			}
		],
		"headItem": {
			"define1": "测试1",
			"id": 2410387773493760
		},
		"headFreeItem": {
			"id": 2410387773493760,
			"define1": "自由自定义"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


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

