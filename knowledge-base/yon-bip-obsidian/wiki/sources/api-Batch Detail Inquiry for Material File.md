---
title: "物料档案批量详情查询V3"
apiId: "1847241897789620228"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料档案批量详情查询V3

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/batchdetailnew

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
| id | long | 否 | 否 | 物料档案id 示例：1530976715290968000 |
| productCode | string | 否 | 否 | 物料编码(物料id和编码二选一，同时填入以id为准) 示例：code1 |
| orgId | string | 否 | 否 | 组织id(组织id和编码二选一必填，同时填入时以id为准) 示例：666666" 示例：2538984869630976 |
| orgCode | string | 否 | 否 | 组织编码(组织id和编码二选一必填，同时填入时以id为准) 示例：666666 示例：XMGS |

## 3. 请求示例

Url: /yonbip/digitalModel/product/batchdetailnew?access_token=访问令牌
Body: [{
	"id": 1530976715290968000,
	"productCode": "code1",
	"orgId": "2538984869630976",
	"orgCode": "XMGS"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 是 | 调用成功时的返回数据 |
| detail | object | 否 | 物料详情 |
| productOrges | object | 是 | 物料分配的组织。 |
| realProductAttribute | long | 否 | 物料性质，1：实物物料，2：虚拟物料 示例：1 |
| code | string | 否 | 物料编码 示例：code1 |
| name | object | 否 | 物料名称 |
| model | object | 否 | 型号 |
| keywords | object | 否 | 关键字 |
| productClass | long | 否 | 商品分类id 示例：2541495026652160 |
| productClassCode | string | 否 | 商品分类编码 示例：000002 |
| productClassName | string | 否 | 商品分类名称 示例：黄金 |
| manageClass | long | 否 | 物料分类id 示例：2541494503052544 |
| manageClassCode | string | 否 | 物料分类编码 示例：000002 |
| manageClassName | string | 否 | 物料分类名称 示例：黄金 |
| purchaseClass | long | 否 | 采购分类ID 示例：1546426425542180900 |
| purchaseClassCode | string | 否 | 采购分类编码 示例：PTO001 |
| purchaseClassName | string | 否 | 采购分类名称 示例：PTO商品 |
| productTemplate | long | 否 | 物料模板id 示例：2541493655655424 |
| brand | long | 否 | 品牌id 示例：2570445127045635 |
| brandCode | string | 否 | 品牌编码 示例：品牌2 |
| brandName | string | 否 | 品牌名称 示例：品牌2 |
| placeOfOrigin | string | 否 | 产地 示例：产地 |
| manufacturer | string | 否 | 生产厂商 示例：生产厂商 |
| productLine | long | 否 | 产品线ID 示例：2570288159150336 |
| shareDescription | object | 否 | 分享说明 |
| unit | long | 否 | 主计量单位ID 示例：2571526867440640 |
| unitCode | string | 否 | 主计量单位编码 示例：KGM |
| unitName | string | 否 | 主计量单位名称 示例：千克 |
| taxClass | string | 否 | 税收分类码id 示例：1010105000000000000 |
| orgId | string | 否 | 组织ID 示例：2538984869630976 |
| defaultSKUId | long | 否 | 默认SKUID 示例：1530976723880902700 |
| id | long | 否 | 物料id 示例：1530976715290968000 |
| tenant | long | 否 | 租户id 示例：2538773095354624 |
| erpCode | string | 否 | 外部编码 示例：外部编码 |
| deleted | boolean | 否 | 是否删除，1：是，0：否。 示例：false |
| createTime | string | 否 | 创建时间 示例：2022-08-25 20:05:48 |
| createDate | string | 否 | 创建日期 示例：2022-08-25 00:00:00 |
| creator | string | 否 | 创建人 示例：YonSuite默认用户 |
| realProductAttributeType | long | 否 | 实物物料属性，1：普通物料，2：实体卡券，3：实体储值卡，20：描述性物料，4：设备 示例：1 |
| weight | double | 否 | 毛重 示例：1 |
| weightUnit | long | 否 | 毛重单位id 示例：2571526867440640 |
| weightUnitCode | string | 否 | 毛重单位编码 示例：KGM |
| weightUnitName | string | 否 | 毛重单位名称 示例：千克 |
| volume | double | 否 | 体积 示例：2 |
| volumeUnit | long | 否 | 体积单位id 示例：2571526900585472 |
| unitUseType | long | 否 | 设置规则, 1:使用物料模板的计量单位、2:使用物料自己的计量单位 示例：2 |
| enableAssistUnit | boolean | 否 | 启用辅计量, true:启用 示例：false |
| creatorId | long | 否 | 创建人 示例：2538773096593408 |
| registrationManager | boolean | 否 | 注册证管理, true:是、false:否 示例：false |
| authorizationManager | boolean | 否 | 授权书管理, true:是、false:否 示例：false |
| planClass | long | 否 | 计划分类id 示例：2570383093256707 |
| planClassCode | string | 否 | 计划分类编码 示例：wxt0009 |
| planClassName | string | 否 | 计划分类名称 示例：计划分类9 |
| ytenantId | string | 否 | 友互通id 示例：0000KWJZLURO8TQU4Y0000 |
| transType | string | 否 | 物料类型ID 示例：2538775354987782 |
| transTypeCode | string | 否 | 物料类型编码 示例：SYCSR002 |
| transTypeName | string | 否 | 物料类型名称 示例：通用物料 |
| productFamily | long | 否 | 产品族，1：是，0：否。 示例：0 |
| salesAndOperations | long | 否 | 参与SOP，1：是，0：否。 示例：0 |
| productBarCodes | object | 是 | 物料多条码 |
| productAssistUnitExchanges | object | 是 | 物料辅计量换算对照 |
| productAttachments | object | 是 | 物料附件 |
| productAlbums | object | 是 | 物料图片 |
| imgBusinessId | string | 否 | 物料图片业务id 示例：df6a101d-d11f-4971-95d4-1a9db4df9e1e |
| videoBusinessId | string | 否 | 物料视频业务id 示例：e78c2cd4-7685-65a5-c396-bc1354de7c25 |
| homepageBusinessId | string | 否 | 物料首页图片业务id 示例：c16b0bf4-2941-43a4-b382-ab1167de5b17 |
| productTags | object | 是 | 物料标签 |
| optionalType | number |
| 小数位数:0,最大长度:10 | 否 | 选配方式（0表示特征选配，1表示组件选配） 示例：0 |
| length | number |
| 小数位数:8,最大长度:10 | 否 | 长 示例：10.5 |
| width | number |
| 小数位数:8,最大长度:10 | 否 | 宽 示例：10.5 |
| height | number |
| 小数位数:8,最大长度:10 | 否 | 高 示例：10.5 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"detail": {
				"id": 1530976723880902700,
				"productId": 1530976715290968000,
				"productApplyRangeId": 1530976723880902700,
				"purchaseUnit": 2571526867440640,
				"purchaseUnitCode": "KGM",
				"purchaseUnitName": "千克",
				"purchasePriceUnit": 2571526867440640,
				"purchasePriceUnitCode": "KGM",
				"purchasePriceUnitName": "千克",
				"stockUnit": 2571526867440640,
				"stockUnitCode": "KGM",
				"stockUnitName": "千克",
				"batchUnit": 2571526867440640,
				"batchUnitCode": "KGM",
				"batchUnitName": "千克",
				"onlineUnit": 2571526867440640,
				"onlineUnitCode": "KGM",
				"onlineUnitName": "千克",
				"offlineUnit": 2571526867440640,
				"offlineUnitCode": "KGM",
				"offlineUnitName": "千克",
				"requireUnit": 2571526867440640,
				"requireUnitCode": "KGM",
				"requireUnitName": "千克",
				"batchPriceUnit": 2571526867440640,
				"batchPriceUnitCode": "KGM",
				"batchPriceUnitName": "千克",
				"inspectionUnit": 2571526867440640,
				"inspectionUnitCode": "KGM",
				"inspectionUnitName": "千克",
				"batchPrice": 0,
				"markPrice": 100,
				"lowestMarkPrice": 0,
				"salePrice": 100,
				"marketPrice": 100,
				"primeCosts": 100,
				"settleAccountsRate": 10,
				"displayPrice": true,
				"batchManage": true,
				"expiryDateManage": false,
				"serialNoManage": false,
				"safetyStock": 100,
				"highestStock": 100,
				"lowestStock": 100,
				"ropStock": 100,
				"canSale": true,
				"minOrderQuantity": 100,
				"deliveryDays": 1,
				"enableCyclePurchase": false,
				"enableDeposit": false,
				"depositDealPayType": 0,
				"enableModifyDeposit": false,
				"depositPayType": 0,
				"metaDescription": {
					"simplifiedName": "搜索简介"
				},
				"baseSaleCount": 100,
				"enableContractManagement": false,
				"allowStorePurchase": true,
				"priceChangeAllowed": false,
				"saleInOfflineStore": true,
				"offlineStoreOrder": true,
				"offlineStoreReturn": true,
				"weighingOrNot": false,
				"process": false,
				"material": false,
				"retailPriceDimension": 1,
				"deliverQuantityChange": 1,
				"noTaxCostPrice": 100,
				"checkByBatch": false,
				"accountingByItem": false,
				"storeOffAndOffState": false,
				"orderLoadAndUnloadStatus": false,
				"mallUpCount": 0,
				"mallDownCount": 1,
				"orderUpCount": 0,
				"orderDownCount": 1,
				"tenant": 2538773095354624,
				"saleChannel": "1,2",
				"barCode": "条形码",
				"stopStatus": false,
				"checkFree": 0,
				"canOrder": false,
				"onlyOrder": false,
				"orderAdvanceTime": 0,
				"valueManageType": 0,
				"costValuation": 0,
				"checkByCost": false,
				"materialCost": false,
				"planDefaultAttribute": 1,
				"planMethod": 0,
				"keySubPart": false,
				"supplyDemandPolicy": 0,
				"fixedLeadTime": 10,
				"supplyType": 0,
				"produceDepartment": "2539023636943104",
				"produceDepartmentCode": "0002",
				"produceDepartmentName": "销售部门",
				"manufacturePlanner": "40624432569938944",
				"manufacturePlannerCode": "A000001",
				"manufacturePlannerName": "甘甘",
				"engineeringDrawingNo": "123",
				"planProduceLimit": 1,
				"utility": false,
				"weigh": false,
				"productVendor": 2584060529692928,
				"productVendorCode": "1847000023",
				"productVendorName": "供应商测试",
				"productBuyer": "40624432569938944",
				"productBuyerCode": "A000001",
				"productBuyerName": "甘甘",
				"maxPrimeCosts": 100,
				"requestOrderLimit": 100,
				"enableSubscribe": false,
				"recommend": false,
				"erpOuterCode": "商家商品外部编码",
				"saleStyle": "1",
				"shortName": "物料简称",
				"mnemonicCode": "助记码",
				"receiptName": {
					"simplifiedName": "开票名称"
				},
				"incomeTaxRates": "2538775356445954",
				"outputTaxRate": "2538775356445954",
				"produceUnit": 2571526867440640,
				"produceUnitCode": "KGM",
				"produceUnitName": "千克",
				"warehouseManager": "40624432569938944",
				"warehouseManagerCode": "A000001",
				"warehouseManagerName": "甘甘",
				"deliveryWarehouse": 1519760519882866700,
				"deliveryWarehouseCode": "000133",
				"deliveryWarehouseName": "rewrw",
				"returnWarehouse": 1519760519882866700,
				"returnWarehouseCode": "000133",
				"returnWarehouseName": "rewrw",
				"inStoreExcessLimit": 10,
				"outStoreExcessLimit": 10,
				"storageLossRate": 10,
				"allowNegativeInventory": true,
				"scanCountUnit": 0,
				"exemption": false,
				"warehousingByResult": false,
				"salesReturnsExemption": false,
				"returnsWarehousingByResult": false,
				"periodicalInspection": false,
				"displayName": {},
				"titleMemo": {},
				"barcodeManage": true,
				"receiptWarehouse": 1519760519882866700,
				"receiptWarehouseCode": "000133",
				"receiptWarehouseName": "rewrw",
				"BOMType": 0,
				"batchRule": 0,
				"fixedQuantity": 100,
				"prepareFeed": false,
				"specialMaterials": false,
				"virtualPart": false,
				"demandConsolidation": 0,
				"demandConsolidationType": 0,
				"demandConsolidationUnit": 0,
				"demandConsolidationNumber": 1,
				"demandConsolidationDateType": 0,
				"reservation": false,
				"lossType": 0,
				"ECNControl": false,
				"ytenantId": "0000KWJZLURO8TQU4Y0000",
				"inspectionType": 0,
				"logisticsRelated": false,
				"weighingMode": 0,
				"reviewGrossWeight": false,
				"specialCarTransport": false,
				"orgId": "2538984869630976",
				"businessAttribute": "1,7",
				"businessAttributePurchase": 1,
				"businessAttributeSale": 1,
				"businessAttributeSelfCreate": 0,
				"businessAttributeOutSourcing": 0,
				"testRule": 1,
				"enableStockPeriodRecheck": 0,
				"enableStockExpireCheck": 0,
				"enableSparePartsManagement": 0,
				"fullSetInspection": 0,
				"directProduction": 0,
				"costItems": "1978437901431078916",
				"costItemsCode": "ZDH_FYXM",
				"costItemsName": "自动化_费用项目",
				"manageByInventory": 0,
				"checkByProject": 0,
				"checkBySalesOrders": 0,
				"checkByClient": 0,
				"checkByOutsourcing": 0,
				"atpInspection": 0,
				"doublePick": 10,
				"deliveryMethod": "1,2,3"
			},
			"productOrges": [
				{
					"orgId": "2538984869630976",
					"orgType": 1
				}
			],
			"realProductAttribute": 1,
			"code": "code1",
			"name": {
				"simplifiedName": "simplifiedName1"
			},
			"model": {},
			"keywords": {},
			"productClass": 2541495026652160,
			"productClassCode": "000002",
			"productClassName": "黄金",
			"manageClass": 2541494503052544,
			"manageClassCode": "000002",
			"manageClassName": "黄金",
			"purchaseClass": 1546426425542180900,
			"purchaseClassCode": "PTO001",
			"purchaseClassName": "PTO商品",
			"productTemplate": 2541493655655424,
			"brand": 2570445127045635,
			"brandCode": "品牌2",
			"brandName": "品牌2",
			"placeOfOrigin": "产地",
			"manufacturer": "生产厂商",
			"productLine": 2570288159150336,
			"shareDescription": {},
			"unit": 2571526867440640,
			"unitCode": "KGM",
			"unitName": "千克",
			"taxClass": "1010105000000000000",
			"orgId": "2538984869630976",
			"defaultSKUId": 1530976723880902700,
			"id": 1530976715290968000,
			"tenant": 2538773095354624,
			"erpCode": "外部编码",
			"deleted": false,
			"createTime": "2022-08-25 20:05:48",
			"createDate": "2022-08-25 00:00:00",
			"creator": "YonSuite默认用户",
			"realProductAttributeType": 1,
			"weight": 1,
			"weightUnit": 2571526867440640,
			"weightUnitCode": "KGM",
			"weightUnitName": "千克",
			"volume": 2,
			"volumeUnit": 2571526900585472,
			"unitUseType": 2,
			"enableAssistUnit": false,
			"creatorId": 2538773096593408,
			"registrationManager": false,
			"authorizationManager": false,
			"planClass": 2570383093256707,
			"planClassCode": "wxt0009",
			"planClassName": "计划分类9",
			"ytenantId": "0000KWJZLURO8TQU4Y0000",
			"transType": "2538775354987782",
			"transTypeCode": "SYCSR002",
			"transTypeName": "通用物料",
			"productFamily": 0,
			"salesAndOperations": 0,
			"productBarCodes": [
				{
					"id": 1680013386205102085,
					"barCode": "\"123\""
				}
			],
			"productAssistUnitExchanges": [
				{
					"id": 1680014013270327299,
					"productId": 1679287639833313282,
					"unitExchangeType": 0,
					"assistUnitCount": 1,
					"assistUnit": 1476511169941864456,
					"mainUnitCount": 23
				}
			],
			"productAttachments": [
				{
					"productId": 1530976715290968000,
					"folder": "https://apcom-file-pub-npro.obs.cn-north-4.myhuaweicloud.com/iuap-apcom-file-public/iuap-apcom-file/0000L7PIX0Z2ARJ3MD0000/2024052219/78b79e63-39b2-4a7c-a15c-0a25ec2cd109.jpg",
					"fileName": "鲜花10.jpg"
				}
			],
			"productAlbums": [
				{
					"productId": 1530976715290968000,
					"folder": "https://apcom-file-pub-npro.obs.cn-north-4.myhuaweicloud.com/iuap-apcom-file-public/iuap-apcom-file/0000L7PIX0Z2ARJ3MD0000/2024052219/dbb52e2b-8afb-48fb-8b8e-ef062a536b27.jpeg",
					"imgName": "鲜花1.jpeg"
				}
			],
			"imgBusinessId": "df6a101d-d11f-4971-95d4-1a9db4df9e1e",
			"videoBusinessId": "e78c2cd4-7685-65a5-c396-bc1354de7c25",
			"homepageBusinessId": "c16b0bf4-2941-43a4-b382-ab1167de5b17",
			"productTags": [
				{
					"id": 1913058646531506185,
					"tagId": 1837964897149255683
				}
			],
			"optionalType": 0,
			"length": 10.5,
			"width": 10.5,
			"height": 10.5
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-12

新增

返回参数 deliveryMethod

增加商城配送方式字段

2	2025-07-17

更新

请求说明

3	2025-05-15

新增

返回参数 length

新增

返回参数 width

新增

返回参数 height

增加长宽高字段


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

