---
title: "标准物料清单列表查询"
apiId: "287bf09d46ff46e2b21c7bfa6fcc8d5c"
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

# 标准物料清单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: BOM Maintenance (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/v1.0/bom/list

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| bomType | short | 否 | 否 | BOM类别;{"1":"主BOM","2":"替代BOM"} 示例：1 |
| status | short | 否 | 否 | 状态;{"0":"开立","1":"审核"} 示例：0 |
| pageIndex | int | 否 | 是 | 当前页，默认当前页为1 示例1 示例：1 |
| pageSize | int | 否 | 是 | 每页数目，默认每页10条数据，示例10 示例：10 |
| orgId | string | 否 | 否 | 组织id 示例：1696518894981376 |
| useTypeId | long | 否 | 否 | 用途Id;用途Id和用途编码同时存在，以用途Id为准 示例：1515194093452657000 |
| useType | string | 否 | 否 | 用途编码;用途Id和用途编码同时存在，以用途Id为准 示例：0 |
| materialId | string | 否 | 否 | 母件制造物料id 示例：1719732013814016 |
| bomComponent.materialId | string | 否 | 否 | 子件制造物料id 示例：1719732247367936 |
| bomByproduct.materialId | string | 否 | 否 | 产出品制造物料id 示例：1719734454309120 |
| bomComponent.bomAlternate.materialId | string | 否 | 否 | 替代料制造物料id 示例：1719732501188864 |
| creator | string | 否 | 否 | 创建人 示例：shixj3 |
| createTime | string | 否 | 否 | 创建时间 示例：2020-12-09 16:17:22 |
| modifier | string | 否 | 否 | 修改人 示例：shixj3 |
| modifyTime | string | 否 | 否 | 修改时间 示例：2020-12-19 16:17:22 |
| auditor | string | 否 | 否 | 审核人 示例：shixj33 |
| auditTime | string | 否 | 否 | 审核时间 示例：2020-12-20 16:17:22 |
| versionScope | int | 否 | 否 | 是否为最新版本：1:最新版本，0：全部版本 |
| productId | string | 否 | 否 | 母件物料Id;母件物料Id和母件物料编码不要同事传，同时存在时需要是同一个物料，不然不生效 示例：1719732013814016 |
| productCode | string | 否 | 否 | 母件物料编码;母件物料Id和母件物料编码同时存在，同时存在时需要是同一个物料，不然不生效 示例：TYWL-01 |
| productCodes | string | 是 | 否 | 母件物料编码，不要和productId、productCode同时传,和productId同时传以productId为准，和productCode同时传时以productCode为准示例: ["000123","000124"]。 示例：["000123","000124"] 最大请求量：50 |
| versionCode | string | 否 | 否 | 版本号 |
| bomByproduct.productId | string | 否 | 否 | 产出品物料ID |
| bomComponent.bomAlternate.productId | string | 否 | 否 | 替代料物料ID |
| bomComponent.productId | string | 否 | 否 | 子件物料ID |
| simple | object | 否 | 否 | 扩展查询条件 |
| materialId.productId | long | 是 | 否 | 物料Id 示例：[1869775818379520] |
| open_pubts_begin | string | 否 | 否 | 时间戳，开始时间 示例：2022-04-01 00:00:00 |
| open_pubts_end | string | 否 | 否 | 时间戳，结束时间 示例：2022-05-01 00:00:00 |
| isSum | boolean | 否 | 否 | 默认false 查表头+表体，为true时只查表头 示例：false 默认值：false |
| pubts | string | 否 | 否 | 时间戳 示例：2024-05-06 23:10:00|2024-05-08 12:09:00 |
| billNumType | string | 否 | 否 | 默认查询物料清单列表，当值为：ed_order_bom时查询订单BOM列表 |
| sourceCode | string | 否 | 否 | 来源单据编码，订单BOM列表查询时有效 |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件) |
| op | string | 否 | 否 | 比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 ) |
| value1 | string | 否 | 否 | 查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt) |
| value2 | string | 否 | 否 | 查询条件值2 |
| logicOp | string | 否 | 否 | 逻辑连接符(and：且；or：或) 注 示例：and |
| conditions | object | 是 | 否 | 下级查询条件 |

## 3. 请求示例

Url: /yonbip/mfg/v1.0/bom/list?access_token=访问令牌
Body: {
	"bomType": 1,
	"status": 0,
	"pageIndex": 1,
	"pageSize": 10,
	"orgId": "1696518894981376",
	"useTypeId": 1515194093452657000,
	"useType": "0",
	"materialId": "1719732013814016",
	"bomComponent.materialId": "1719732247367936",
	"bomByproduct.materialId": "1719734454309120",
	"bomComponent.bomAlternate.materialId": "1719732501188864",
	"creator": "shixj3",
	"createTime": "2020-12-09 16:17:22",
	"modifier": "shixj3",
	"modifyTime": "2020-12-19 16:17:22",
	"auditor": "shixj33",
	"auditTime": "2020-12-20 16:17:22",
	"versionScope": 0,
	"productId": "1719732013814016",
	"productCode": "TYWL-01",
	"productCodes": [
		"000123",
		"000124"
	],
	"versionCode": "",
	"bomByproduct.productId": "",
	"bomComponent.bomAlternate.productId": "",
	"bomComponent.productId": "",
	"simple": {
		"materialId.productId": [
			1869775818379520
		],
		"open_pubts_begin": "2022-04-01 00:00:00",
		"open_pubts_end": "2022-05-01 00:00:00"
	},
	"isSum": false,
	"pubts": "2024-05-06 23:10:00|2024-05-08 12:09:00",
	"billNumType": "",
	"sourceCode": "",
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": "",
			"logicOp": "and",
			"conditions": [
				{
					"field": "",
					"op": "",
					"value1": "",
					"value2": ""
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| pageIndex | long | 否 | 当前页数 示例：1 |
| pageSize | long | 否 | 每页条数 示例：5 |
| returncount | long | 否 | 回退次数 示例：0 |
| verifystate | long | 否 | 审批状态：0-开立，1-已提交，2-已审批，-1驳回 示例：0 |
| recordCount | long | 否 | 总条数 示例：7 |
| recordList | object | 是 | 数据集合 |
| pageCount | long | 否 | 总页数 示例：2 |
| beginPageIndex | long | 否 | 分页查询起始数 示例：1 |
| endPageIndex | long | 否 | 分页查询结束数 示例：2 |
| pubts | string | 否 | 时间戳 示例：2021-05-12 18:00:19 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 5,
		"returncount": 0,
		"verifystate": 0,
		"recordCount": 7,
		"recordList": [
			{
				"id": 2248961262375936,
				"skuId": 1870906715738521,
				"materialId": 1870906715738368,
				"materialCode": "-001000004",
				"materialName": "企业物料",
				"productId": 1870906766738521,
				"modelDescription": "物料",
				"model": "企业",
				"bomUnitName": "舍位 6",
				"scrap": 20,
				"orgName": "L工厂1",
				"orgId": "",
				"bomType": 1,
				"remark": "备注",
				"status": 1,
				"fromQuantity": 0,
				"toQuantity": 0,
				"quantityControl": 0,
				"subcontractVendorId": "15810437080",
				"subcontractVendorIdName": "委外商",
				"substituteFlag": "",
				"substituteDescription": "",
				"creator": "15810437080",
				"createTime": "2021-05-08 17:21:42",
				"modifier": "张汉卿",
				"modifyTime": "2021-05-08 17:22:08",
				"auditor": "张汉卿",
				"auditTime": "2021-05-08 17:21:42",
				"auditDate": "2021-05-08 17:21:42",
				"engineeringDrawNumber": "工程图号",
				"manufacturingSpecification": "qi-颜色:白;qi-形状:圆",
				"BomComponent_materialCode": "L批号",
				"BomComponent_materialName": "L批号",
				"BomComponent_modelDescription": "规格说明",
				"BomComponent_model": "物料型号",
				"BomComponent_bomUnitName": "件",
				"BomComponent_scrap": 0,
				"BomComponent_numeratorQuantity": 1,
				"BomComponent_denominatorQuantity": 2,
				"BomComponent_quantity": 0.625,
				"BomComponent_supplyType": 2,
				"BomComponent_remark": "备注",
				"BomComponent_fixedQuantity": 0,
				"BomComponent_effectiveDate": "2021-05-08 17:21:41",
				"BomComponent_expiryDate": "2099-12-31 23:59:59",
				"BomComponent_warehouseName": "厂库1",
				"bomComponent_designator": "r1",
				"BomComponent_manufacturingSpecification": "物料规格",
				"BomComponent_engineeringDrawNumber": "工程图号",
				"bomComponent_isVirtual": 0,
				"bomComponent_usageType": 1,
				"bomComponent_lossType": 0,
				"bomComponent_mustLossQuantity": 0,
				"bomComponent_truncUp": 0,
				"bomComponent_partakeSimulation": 1,
				"bomComponent_calcCostFlag": 1,
				"bomComponent_entrustType": 1,
				"bomComponent_wholeFlag": 0,
				"bomComponent_wholePoint": "",
				"bomComponent_alternateType": 0,
				"bomComponent_advanceDays": 0,
				"bomComponent_stockOrgName": "",
				"bomComponent_costScrap": 0,
				"bomComponent_lineNo": 10,
				"bomComponent_bomUnit": 1,
				"bomComponent_changeRate": 0,
				"bomComponent_changeType": "1",
				"bomComponent_stockUnit": 1,
				"bomComponent_stockUnitName": "箱",
				"bomComponent_stockUnitPrecision": 1,
				"bomComponent_stockNumeratorQuantity": "1",
				"bomComponent_stockQuantity": "1",
				"printCount": 0,
				"operator": "YonSuite默认用户",
				"operatorTime": "2021-05-12 18:00:20",
				"vouchdate": "2021-05-08 00:00:00",
				"bomComponentOrgCode": "LGC1",
				"bomComponentProductId": 1909005230985472,
				"bomComponentSkuCode": "",
				"bomComponentSkuIdName": "",
				"bomId": 2254575453901056,
				"bomComponentId": 2254575453917440,
				"rowno": 1,
				"useTypeId": 1515194093452657000,
				"useType": "0",
				"useTypeName": "自制",
				"effectiveDate": "2021-05-08 17:21:41",
				"expiryDate": "2099-12-31 23:59:59",
				"isWholeSend": 0,
				"versionCode": "1.01",
				"batch": 1,
				"rollup": 1,
				"bomUnit": 1,
				"produceUnit": 1,
				"produceUnitName": "千克",
				"produceUnitPrecision": "1",
				"changeRate": 0,
				"changeType": "1",
				"produceBatch": 0,
				"bomComponent_alternateDenominator": 0,
				"bomComponent_alternateRatio": 0,
				"bomComponent_componentType": 0,
				"bomComponent_keyMaterialGroup": 0,
				"bomComponent_mainMaterial": 0,
				"bomComponent_materialGroupNo": "",
				"bomComponent_sequence": 0,
				"bomComponent_excessTendType": 0,
				"bomComponent_excessSendScrap": 0,
				"bomComponent_excessSendFlag": 0,
				"bomComponent_excessSendConstant": 0,
				"bomComponent_replaceType": 0,
				"bomComponent_standard": 0,
				"productUnitPrecision": 0,
				"componentProductUnitPrecision": 0,
				"isWholeReport": 0,
				"ECNControl": true,
				"isWfControlled": true,
				"productCode": "",
				"productName": "",
				"isOptionalMaterial": 0,
				"isChange": 0,
				"adminOrgId": "",
				"adminOrgName": "",
				"bomComponent_entrustSupplyType": 0,
				"bomComponent_ownerType": 2
			}
		],
		"pageCount": 2,
		"beginPageIndex": 1,
		"endPageIndex": 2,
		"pubts": "2021-05-12 18:00:19"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-13

新增

返回参数 bomComponent_entrustSupplyType

新增

返回参数 bomComponent_ownerType

更新

返回参数 (43)

2	2025-10-13

更新

请求说明

更新

请求参数 productId

更新

请求参数 productCode

更新

请求参数 productCodes

更新

返回参数 bomComponent_isVirtual

3	2025-08-28

更新

请求参数 productId

更新

请求参数 productCode

更新

请求参数 productCodes

4	2025-08-06

新增

请求参数 productCodes

5	2025-07-16

新增

请求参数 (11)

6	2025-06-24

新增

请求参数 billNumType

新增

请求参数 sourceCode

新增

请求参数 bomDefineCharacter


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

