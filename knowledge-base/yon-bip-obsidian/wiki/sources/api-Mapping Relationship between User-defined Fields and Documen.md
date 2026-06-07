---
title: "自定义项与单据映射关系"
apiId: "d19a20eefbb54da389eaec790f6fa768"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Characteristic"
domain: "BMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Characteristic]
platform_version: "BIP"
source_type: community-api-docs
---

# 自定义项与单据映射关系

> `ContentType	application/json` 请求方式	POST | 分类: Characteristic (BMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/attrext/defmappingbillno

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
| userdefId | string | 否 | 是 | 自定义项主键 示例：2431175004557568 |
| billno | string | 否 | 是 | 接入自定义项的单据编码 示例：单据类型(pu_applyorder:请购单;st_purchaseorder:采购订单; pu_arrivalorder:到货单) 示例:pu_arrivalorder |

## 3. 请求示例

Url: /yonbip/digitalModel/attrext/defmappingbillno?access_token=访问令牌
Body: {
	"userdefId": "2431175004557568",
	"billno": "单据类型(pu_applyorder:请购单;st_purchaseorder:采购订单; pu_arrivalorder:到货单)    示例:pu_arrivalorder"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回结果编码 示例：200 |
| message | string | 否 | 返回结果信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| attrextid | long | 否 | 自定义项主键 示例：2343611348914432 |
| defineId | string | 否 | 自定义项标识 示例：bodyDefine3 |
| showitem | object | 否 | 自定义项名称 |
| billNO | string | 否 | 单据编码 示例：po_production_order_change |
| defines | string | 否 | 分配到节点的标识 示例：define3 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"attrextid": 2343611348914432,
		"defineId": "bodyDefine3",
		"showitem": {
			"zh_TW": "",
			"en_US": "",
			"zh_CN": "学区号"
		},
		"billNO": "po_production_order_change",
		"defines": "define3"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	系统异常!异常信息:参数不存在	按照要求正确输入参数


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

