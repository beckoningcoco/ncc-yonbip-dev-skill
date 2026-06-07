---
title: "请购单单个保存V2"
apiId: "0d0c4b299b4644b4916f12a86744147d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Requisition"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Requisition]
platform_version: "BIP"
source_type: community-api-docs
---

# 请购单单个保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Requisition (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/applyorder/singleSave_v1

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 请购单[pu.applyorder.ApplyOrder] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 否 | 请购单id，新增时无需填写，修改时必填 示例：1539323335545203 |
| doFieldCheck | boolean | 否 | 否 | 是否支持重算能力，默认false 示例：true |
| checkFieldKeys | string | 否 | 否 | 根据哪些字段重算，如果不传走UI模板的默认配置，传了以传入的字段为准 示例：applyOrders.oriTaxUnitPrice |
| code | string | 否 | 否 | 以系统编码规则配置为准，系统设置为手工编号时必输，系统设置为自动编号时非必输 示例：QG210520000002 |
| bustype | string | 否 | 是 | 交易类型编码或交易类型id 示例：A5002 |
| org_code | string | 否 | 是 | 需求组织编码 示例：001 |
| vouchdate | string | 否 | 是 | 单据日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-03-04 00:00:00 |
| warehouseId_code | string | 否 | 否 | 要货仓库 示例：wjl001 |
| currency_code | string | 否 | 否 | 币种简称 示例：2345432343234 |
| operator | string | 否 | 否 | 请购人id或请购人名称 示例：460502202102260001 / wjl001 |
| applyDept | string | 否 | 否 | 请购部门id或请购部门名称 示例：460502202102260001/ wjl001 |
| memo | string | 否 | 否 | 备注 示例：虚拟物料请购单 |
| headItem | object | 是 | 否 | 表头自定义项 |
| headFreeItem | object | 否 | 否 | 表头自由自定义项 |
| applyOrders | object | 是 | 是 | 请购单子表[pu.applyorder.ApplyOrders] |
| _status | string | 否 | 是 | 操作标识：Insert：新增、Update：更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/scm/applyorder/singleSave_v1?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 1539323335545203,
		"doFieldCheck": true,
		"checkFieldKeys": "applyOrders.oriTaxUnitPrice",
		"code": "QG210520000002",
		"bustype": "A5002",
		"org_code": "001",
		"vouchdate": "2021-03-04 00:00:00",
		"warehouseId_code": "wjl001",
		"currency_code": "2345432343234",
		"operator": "460502202102260001 / wjl001",
		"applyDept": "460502202102260001/ wjl001",
		"memo": "虚拟物料请购单",
		"headItem": [
			{
				"id": "2345432344323",
				"define1": "YH460502202102260001",
				"define2": "4BC877D89A0E0E58000163E30C124000"
			}
		],
		"headFreeItem": {
			"id": "2345432344323",
			"define1": "YH460502202102260",
			"define2": "4BC877D89A0E0E58000163E30C124000"
		},
		"applyOrders": [
			{
				"id": 1538217310966017,
				"rowno": 10,
				"bodyItem": [
					{
						"id": "23454323454345",
						"define1": "YH460502202102260001",
						"define2": "4BC877D8AA0E0E58000163E30C124000",
						"define3": "4BC877D89A0E0E58000163E30C124000"
					}
				],
				"bodyFreeItem": {
					"id": "23454323454345",
					"define1": "4BC877D89A0E0E58000163E30C124000",
					"define2": "YH460502202102260001"
				},
				"product_cCode": "00000002",
				"receiver": "小红",
				"receiveTelePhone": "13988766678",
				"receiveAddress": "红星街3号楼",
				"demandDep": "460502202102260001/ 需求部门",
				"subQty": 11,
				"purUOM_Code": "001",
				"expenseItemId_code": "460502202102260001",
				"priceUOM_Code": "001",
				"unit_code": "001",
				"qty": 220,
				"taxitems_code": "VAT3",
				"project_code": "460502202102260001",
				"discountTaxType": "0",
				"adviseSupplier_code": "0000000001",
				"receiveOrg_code": "10011001",
				"requirementDate": "2021-03-04 00:00:00",
				"oriTaxUnitPrice": 33,
				"invPriceExchRate": 20,
				"priceQty": 20,
				"oriUnitPrice": 31.43,
				"purchaseOrg_code": "10011001",
				"oriMoney": 33,
				"oriTax": 627,
				"oriSum": 660,
				"unitExchangeTypePrice": 0,
				"unitExchangeType": 0,
				"invExchRate": 1,
				"_status": "Insert",
				"sourceid": 1533690286444802,
				"sourceautoid": 1538461957165315,
				"upLineno": "10",
				"upcode": "UO-7296201912230001",
				"source": "po_production_order",
				"firstupcode": "YH460502202102260001",
				"firstsourceautoid": 1533690286444802,
				"firstsourceid": 1538461957165315,
				"firstsource": "po_production_order",
				"sourceUpLineno": "10",
				"wbsCode": "0021"
			}
		],
		"_status": "Insert"
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
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 单据信息 |
| code | string | 否 | 单据编码 示例：QGD20210830000189 |
| memo | string | 否 | 备注 示例：qg472866 |
| vouchdate | string | 否 | 单据日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-08-21 00:00:00 |
| warehouseId_code | string | 否 | 要货仓库编码 示例：auto仓库12530 |
| id | long | 否 | 请购单id 示例：2410435531100672 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| org | string | 否 | 需求组织 示例：2393734441259520 |
| bustype | string | 否 | 交易类型 示例：2393738856190208 |
| operator | long | 否 | 请购人id 示例：2393734441259520 |
| operator_name | string | 否 | 请购人 示例：请购人 |
| applyDept | long | 否 | 请购部门id 示例：2410435531100672 |
| applyDept_name | string | 否 | 请购部门 示例：请购部门 |
| warehouseId | long | 否 | 要货仓库 示例：2393734541760512 |
| applyOrders | object | 是 | 请购单表体 |
| org_code | string | 否 | 需求组织编码 示例：autobf12530 |
| pubts | string | 否 | 时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-08-30 19:01:51 |
| status | long | 否 | 状态：0：开立、1：已审核、2：已关闭、3：审核中 示例：0 |
| creator | string | 否 | 制单人 示例：YonSuite默认用户 |
| creatorId | long | 否 | 创建人id 示例：2155538209116416 |
| createTime | string | 否 | 制单时间，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-08-30 19:01:50 |
| createDate | string | 否 | 制单日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2021-08-30 19:01:50 |
| isWfControlled | boolean | 否 | 是否审批流：true or false 示例：false |
| tenant | long | 否 | 租户id 示例：2155538208313600 |
| totalQuantity | number |
| 小数位数:8,最大长度:28 | 否 | 整单数量 示例：220 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "QGD20210830000189",
		"memo": "qg472866",
		"vouchdate": "2021-08-21 00:00:00",
		"warehouseId_code": "auto仓库12530",
		"id": 2410435531100672,
		"resubmitCheckKey": "OPENAPI_0d0c4b299b4644b4916f12a86744147d_csrka3z7_eb6cf9229d8a6c5bf937c20884ea7c21",
		"org": "2393734441259520",
		"bustype": "2393738856190208",
		"operator": 2393734441259520,
		"operator_name": "请购人",
		"applyDept": 2410435531100672,
		"applyDept_name": "请购部门",
		"warehouseId": 2393734541760512,
		"applyOrders": [
			{
				"purchaseOrg_code": "autobf12530",
				"vendor_code": "autotenant12530",
				"purUOM": "2393734489822464",
				"product_cCode": "wl472866",
				"subQty": 11,
				"proDescFlag": "0",
				"priceUOM_Code": "autotest12530",
				"unit_code": "autotest12530",
				"receiver": "客户",
				"receiveTelePhone": "13888876567",
				"receiveAddress": "红星街10号楼",
				"demandDep": "2410435531100673",
				"demandDep_name": "客户部门",
				"id": 2410435531100673,
				"mainid": 2410435531100672,
				"purchaseOrg": "2393734441259520",
				"receiveOrg_code": "autobf12530",
				"oriUnitPrice": 31.43,
				"taxRate": 5,
				"unit": 2393734489822464,
				"qty": 220,
				"requirementDate": "2021-03-04 00:00:00",
				"oriTaxUnitPrice": 33,
				"expenseItemId": "2393734441259520",
				"expenseItemId_code": "2393734441259520",
				"oriMoney": 33,
				"unitExchangeTypePrice": 0,
				"product_code": "wl472866",
				"invExchRate": 1,
				"purUOM_Code": "autotest12530",
				"adviseSupplier": 2393734560780544,
				"priceUOM": 2393734489822464,
				"invPriceExchRate": 20,
				"vendor": 2393734560780544,
				"rowno": 10,
				"adviseSupplier_code": "autotenant12530",
				"product": 2396622433392640,
				"oriSum": 660,
				"unitExchangeType": 0,
				"priceQty": 20,
				"receiveOrg": "2393734441259520",
				"isPostDemand": false,
				"pubts": "2021-08-30 19:01:50",
				"sourceid": 123456789,
				"sourceautoid": 12345678,
				"upLineno": "10",
				"upcode": "CG20230905",
				"source": "po_production_order",
				"firstupcode": "YH460502202102260001",
				"firstsourceautoid": 12343354,
				"firstsourceid": 1243543,
				"firstsource": "po_production_order",
				"sourceUpLineno": "10"
			}
		],
		"org_code": "autobf12530",
		"pubts": "2021-08-30 19:01:51",
		"status": 0,
		"creator": "YonSuite默认用户",
		"creatorId": 2155538209116416,
		"createTime": "2021-08-30 19:01:50",
		"createDate": "2021-08-30 19:01:50",
		"isWfControlled": false,
		"tenant": 2155538208313600,
		"totalQuantity": 220
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

更新

请求说明

新增

请求参数 doFieldCheck

新增

请求参数 checkFieldKeys

更新

请求参数 (9)

更新

返回参数 resubmitCheckKey

勾选用户级

2	2024-12-10

新增

请求参数 wbsCode

更新

请求参数 oriMoney

更新

请求参数 oriTax

更新

请求参数 oriSum

CG-112403 请购单的保存API接口录入WBS编码和项目编码后，支持跟踪线索和需求跟踪方式的自动生成（12月14号先给韩通出补丁解决）


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

