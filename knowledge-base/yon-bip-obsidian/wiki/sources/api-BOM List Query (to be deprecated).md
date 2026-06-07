---
title: "物料清单列表查询（即将废弃）"
apiId: "cb66ea8565364bfc9a2060623a3faf90"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "BOM Maintenance"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BOM Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料清单列表查询（即将废弃）

> `ContentType	application/json` 请求方式	POST | 分类: BOM Maintenance (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/mfg/bom/list

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
| bomType | short | 否 | 否 | BOM类别;{"1":"主BOM","2":"替代BOM"} 示例：1 |
| status | short | 否 | 否 | 状态;{"0":"开立","1":"审核"} 示例：0 |
| pageIndex | int | 否 | 是 | 页数 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页条数 示例：10 默认值：10 |
| orgId | long | 否 | 否 | 组织id 示例：1381119564927232 |
| useType | short | 否 | 否 | 用途；{"0": "制造", "1": "委外"} 示例：0 |
| materialId | long | 否 | 否 | 母件制造物料id 示例：1393829246718208 |
| bomComponent.materialId | long | 否 | 否 | 子件制造物料id 示例：1668106330525952 |
| bomByproduct.materialId | long | 否 | 否 | 产出品制造物料id 示例：1393864405274880 |
| bomComponent.bomAlternate.materialId | long | 否 | 否 | 替代料制造物料id 示例：1530913476448512 |
| creator | string | 否 | 否 | 创建人 示例：Leekun |
| createTime | string | 否 | 否 | 创建时间 示例：2019-11-02 17:26:10 |
| modifier | string | 否 | 否 | 修改人 示例：Leekun |
| modifyTime | string | 否 | 否 | 修改时间 示例：2019-12-14 16:18:54 |
| auditor | string | 否 | 否 | 审核人 示例：19195888888 |
| auditTime | string | 否 | 否 | 审核时间 示例：2019-12-19 |

## 3. 请求示例

Url: /yonbip/mfg/bom/list?access_token=访问令牌
Body: {
	"bomType": 1,
	"status": 0,
	"pageIndex": 1,
	"pageSize": 10,
	"orgId": 1381119564927232,
	"useType": 0,
	"materialId": 1393829246718208,
	"bomComponent.materialId": 1668106330525952,
	"bomByproduct.materialId": 1393864405274880,
	"bomComponent.bomAlternate.materialId": 1530913476448512,
	"creator": "Leekun",
	"createTime": "2019-11-02 17:26:10",
	"modifier": "Leekun",
	"modifyTime": "2019-12-14 16:18:54",
	"auditor": "19195888888",
	"auditTime": "2019-12-19"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 每页条数 示例：10 |
| recordCount | long | 否 | 总条数 示例：976 |
| recordList | object | 是 | 数据集合 |
| pageCount | long | 否 | 总页数 示例：98 |
| beginPageIndex | long | 否 | 开始页码 示例：1 |
| endPageIndex | long | 否 | 结束页码 示例：10 |
| pubts | string | 否 | 时间戳 示例：2021-03-19 11:02:40 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 976,
		"recordList": [
			{
				"id": 2177805585846528,
				"productUnitPrecision": 3,
				"isWholeSend": 0,
				"isWholeReport": 0,
				"ECNControl": false,
				"orgId": "1866605942198528",
				"orgName": "L工厂1",
				"operator": "YonSuite默认用户",
				"operatorTime": "2021-03-19 11:02:40",
				"materialId": 2164196355854592,
				"materialName": "企业级物料A",
				"bomType": 1,
				"auditTime": "2021-03-19 10:58:27",
				"status": 1,
				"code": "-001000393",
				"useType": "0",
				"bomUnit": 1869676091724032,
				"bomComponent_wholeFlag": 0,
				"bomComponent_advanceDays": 0,
				"BomComponent_orgName": "L工厂1",
				"BomComponent_materialName": "企业成品料~1",
				"bomComponent_lossType": 0,
				"BomComponent_id": 2177805585846529,
				"BomComponent_fixedQuantity": 0,
				"BomComponent_orgId": "1866605942198528",
				"BomComponent_orgCode": "LGC1",
				"BomComponent_numeratorQuantity": 1,
				"BomComponent_effectiveDate": "2021-03-04 00:00:00",
				"BomComponent_expiryDate": "2099-12-31 23:59:59",
				"BomComponent_supplyType": 0,
				"bomComponent_calcCostFlag": 1,
				"bomComponent_productId": 2005411116519680,
				"BomComponent_materialId": 2005411162919168,
				"bomComponent_costScrap": 0,
				"bomComponent_usageType": 1,
				"bomComponent_truncUp": 0,
				"BomComponent_bomId": 2177805585846528,
				"BomComponent_scrap": 0,
				"BomComponent_bomUnitName": "千克",
				"BomComponent_materialCode": "-001000217",
				"bomComponent_mustLossQuantity": 0,
				"BomComponent_quantity": 1,
				"BomComponent_productId": 2005411116519680,
				"BomComponent_denominatorQuantity": 1,
				"BomComponent_productUnitPrecision": 3,
				"BomComponent_bomUnit": 1869676911841536,
				"bomComponent_isVirtual": 0,
				"bomComponent_alternateType": 0,
				"bomComponent_lineNo": 10,
				"vouchdate": "2021-03-19 00:00:00",
				"expiryDate": "2099-12-31 23:59:59",
				"effectiveDate": "2021-03-04 00:00:00",
				"scrap": 0,
				"pubts": "2021-03-19 10:58:27",
				"auditDate": "2021-03-19 10:58:27",
				"bomUnitName": "件",
				"rowno": 1,
				"creator": "18810097065",
				"bomId": 2177805585846528,
				"bomComponentId": 2177805585846529,
				"auditor": "18810097065",
				"materialCode": "-001000393",
				"versionCode": "A1",
				"createTime": "2021-03-19 10:58:24",
				"bomComponent_entrustSupplyType": 0,
				"bomComponent_ownerType": 2
			}
		],
		"pageCount": 98,
		"beginPageIndex": 1,
		"endPageIndex": 10,
		"pubts": "2021-03-19 11:02:40"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	参数数据错误	输入合适的查询参数


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-13

更新

请求说明

新增

请求参数 useType

更新

请求参数 (15)

删除

请求参数 schemeName

删除

请求参数 isDefault

删除

请求参数 substituteFlag

新增

返回参数 code

新增

返回参数 message

新增

返回参数 data

新增

错误码 999


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

