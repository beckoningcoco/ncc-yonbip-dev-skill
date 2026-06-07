---
title: "现存量查询V2"
apiId: "9fbf66dccf6245528b695d5e283ba318"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Quantity-on-hand Table"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Quantity-on-hand Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 现存量查询V2

> `ContentType	application/json` 请求方式	POST | 分类: Quantity-on-hand Table (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/stock/QueryCurrentStocksByCondition

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
| bNeedSubQty | boolean | 否 | 否 | 是否返回件数，等于true时，查询结果返回现存件数(currentSubQty)、结存件数(currentStockSubQty)。 |
| org | string | 否 | 否 | 组织id 示例：1891127153005312。支持批量，示例：['1891127153005312', '1891127153005313'] 示例：1891127153005312 |
| warehouse.code | string | 否 | 否 | 仓库编码 示例 code11，支持批量查询['code1', 'code2']' 示例：code11 |
| warehouse | string | 否 | 否 | 仓库id 示例：1875184118731008。支持批量，示例：[1875184118731008, 1875184118731009] 示例：1875184118731008 |
| productsku | string | 否 | 否 | 商品SKU id 示例：1921567767616256。支持批量，示例：[1921567767616256, 1921567767616257] 示例：1921567767616256 |
| batchno | string | 否 | 否 | 批次号 示例：batchno0。支持批量，示例：['batchno1', 'batchno2'] 示例：batchno0 |
| productn.code | string | 否 | 否 | 物料编码 示例 code11，支持批量查询['code1', 'code2']' 示例：code11 |
| product | string | 否 | 否 | 物料id 示例：1921567765125888。支持批量，示例：[1921567765125889, 1921567765125889] 示例：1921567765125888 |
| product.oUnitId | long | 否 | 否 | 主计量 示例：1921567765125888 示例：1921567765125888 |
| stockUnitId | string | 否 | 否 | 结存单位 示例：1875184118731008。支持批量，示例：[1875184118731008, 1875184118731009] 示例：1875184118731008 |
| stockStatusDoc | string | 否 | 否 | 库存状态 示例：2006555827382257。支持批量，示例：[2006555827382257, 2006555827382258] 示例：2006555827382257 |
| store | string | 否 | 否 | 门店id 示例：1861030949130496。支持批量，示例：[1861030949130496, 1861030949130497] |
| bStockStatusDocNotNull | boolean | 否 | 否 | 是否库存状态非空，等于true时，查询结果里stockStatusDoc 值都是大于0，等于false或者不添加此过滤条件时，返回所有stockStatusDoc值的结果。 |
| billnum | string | 否 | 否 | 可用量规则分配中的单据类型，根据单据类型分配的可用量计算规则进行可用量计算。销售订单：voucher_order、销售发货：voucher_delivery、电商订单：ec_tradeorder_add、调拨订单：st_transferapply、采购订单：st_purchaseorder、出库申请单：po_picking_requisition、出库单：st_othoutrecord 示例：st_othoutrecord |
| bIncludeTransitQty | boolean | 否 | 否 | 是否包含在途库存，等于true时包含在途库存，否则包含。 示例：true |

## 3. 请求示例

Url: /yonbip/scm/stock/QueryCurrentStocksByCondition?access_token=访问令牌
Body: {
	"bNeedSubQty": true,
	"org": "1891127153005312",
	"warehouse.code": "code11",
	"warehouse": "1875184118731008",
	"productsku": "1921567767616256",
	"batchno": "batchno0",
	"productn.code": "code11",
	"product": "1921567765125888",
	"product.oUnitId": 1921567765125888,
	"stockUnitId": "1875184118731008",
	"stockStatusDoc": "2006555827382257",
	"store": "",
	"bStockStatusDocNotNull": true,
	"billnum": "st_othoutrecord",
	"bIncludeTransitQty": true
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 是 | 返回数据参数 |
| org | string | 否 | 组织id 示例：1891127153005312 |
| warehouse | string | 否 | 仓库id 示例：1875184118731008 |
| product | string | 否 | 物料id 示例：1921567765125888 |
| product_name | string | 否 | 物料name 示例：Z-普通物料子件 |
| product_code | string | 否 | 物料编码 示例：HWD20200919202009000012 |
| productsku | string | 否 | 物料skuid 示例：1921567767616256 |
| productsku_name | string | 否 | 物料sku名字 示例：Z-普通物料子件 |
| productsku_code | string | 否 | 物料sku编码 示例：HWD20200919202009000012 |
| manageClass | string | 否 | 物料分类id 示例：2000100011111111 |
| manageClass_code | string | 否 | 物料分类编码 示例：YCL_001 |
| manageClass_name | string | 否 | 物料分类名称 示例：原材料类 |
| unit | string | 否 | 主计量 示例：1921568854316953 |
| currentqty | BigDecimal | 否 | 现存量 示例：12.0 |
| innoticeqty | BigDecimal | 否 | 收货预计入库数量 示例：0.0 |
| planavailableqty | BigDecimal | 否 | 计划可用量 示例：12.0 |
| availableqty | BigDecimal | 否 | 可用量 示例：12.0 |
| preretailqty | BigDecimal | 否 | 订单预计出库数量 示例：0.0 |
| stockStatusDoc | long | 否 | 库存状态 示例：2006555827382257 |
| stockUnitId | string | 否 | 结存单位id 示例：1921567765125888 |
| stockUnitId_code | string | 否 | 结存单位编码 示例：WL00001 |
| stockUnitId_name | string | 否 | 结存单位名称 示例：WL00001 |
| invStockExchRate | string | 否 | 结存换算率 示例：1 |
| currentStockSubQty | string | 否 | 结存件数 示例：12 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"org": "1891127153005312",
			"warehouse": "1875184118731008",
			"product": "1921567765125888",
			"product_name": "Z-普通物料子件",
			"product_code": "HWD20200919202009000012",
			"productsku": "1921567767616256",
			"productsku_name": "Z-普通物料子件",
			"productsku_code": "HWD20200919202009000012",
			"manageClass": "2000100011111111",
			"manageClass_code": "YCL_001",
			"manageClass_name": "原材料类",
			"unit": "1921568854316953",
			"currentqty": 12,
			"innoticeqty": 0,
			"planavailableqty": 12,
			"availableqty": 12,
			"preretailqty": 0,
			"stockStatusDoc": 2006555827382257,
			"stockUnitId": "1921567765125888",
			"stockUnitId_code": "WL00001",
			"stockUnitId_name": "WL00001",
			"invStockExchRate": "1",
			"currentStockSubQty": "12"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-13

新增

请求参数 bIncludeTransitQty

更新

请求参数 bNeedSubQty

更新

请求参数 store

更新

请求参数 bStockStatusDocNotNull

2	2025-11-20

更新

请求说明

新增

请求参数 bNeedSubQty

新增

请求参数 stockUnitId

新增

返回参数 (5)

增加【bNeedSubQty】是否返回件数过滤项。


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

