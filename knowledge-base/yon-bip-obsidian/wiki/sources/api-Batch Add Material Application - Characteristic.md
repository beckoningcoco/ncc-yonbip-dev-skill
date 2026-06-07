---
title: "物料申请单批量新增-特征"
apiId: "1921180180687618051"
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

# 物料申请单批量新增-特征

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/productapply/batchadd

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| applyCode | string | 否 | 否 | 物料申请单编码，设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值。 示例：WLXZ000045 |
| effectType | string | 否 | 是 | 生效类型，0为立即处理，1为定时处理 示例：0 |
| applyReason | string | 否 | 否 | 申请原因 示例：申请原因 |
| applyOrg | string | 否 | 否 | 申请组织id(id和编码二选一选填，同时填入时以code为准) 示例：666666 |
| applyOrgCode | string | 否 | 否 | 申请组织编码(id和编码二选一选填，同时填入时以code为准） 示例：000002 |
| applyDepartment | string | 否 | 否 | 部门id(id和编码二选一选填，同时填入时以code为准) 示例：1504752976446095363 |
| applyDepartmentCode | string | 否 | 否 | 部门编码(id和编码二选一选填，同时填入时以code为准）) 示例：000001 |
| bizOperator | string | 否 | 否 | 申请人id(id和编码二选一选填，同时填入时以code为准) 示例：1748882585331695616 |
| bizOperatorCode | string | 否 | 否 | 申请人编码(id和编码二选一选填，同时填入时以code为准) 示例：024006 |
| effectTime | string | 否 | 否 | 生效时间，当生效类型为定时处理时，生效时间不允许为空！ 示例：2022-08-31 |
| applyDesc | string | 否 | 否 | 备注 示例：备注 |
| productData | object | 否 | 是 | 物料信息 |
| orgCode | string | 否 | 否 | 管理组织编码(组织id和编码二选一必填，同时填入时以code为准) 示例：666666 示例：global00 |
| orgId | string | 否 | 否 | 管理组织id(组织id和编码二选一必填，同时填入时以code为准) 示例：666666 示例：666666 |
| code | string | 否 | 是 | 物料编码 示例：0012000372 |
| name | object | 否 | 是 | 物料名称,支持多语 |
| modelDescription | object | 否 | 否 | 规格说明,支持多语 |
| model | object | 否 | 否 | 型号,支持多语 |
| erpCode | string | 否 | 否 | 外部编码 示例：12345 |
| transType | string | 否 | 否 | 物料交易类型id(物料交易类型单位id和物料交易类型编码二选一选填，同时填入时以code为准) |
| transTypeCode | string | 否 | 否 | 物料交易类型编码(物料交易类型单位id和物料交易类型编码二选一选填，同时填入时以code为准) |
| materialStatusId | string | 否 | 否 | 物料状态id(物料状态单位id和物料状态编码二选一选填，同时填入时以code为准) |
| materialStatusCode | string | 否 | 否 | 物料状态编码((物料状态单位id和物料状态编码二选一选填，同时填入时以code为准)) |
| optionalMaterial | int | 否 | 否 | 特征-是否可选配,0代表否，1代表是。只有特征租户才有用，当是否可选配为是时，是否派生物料默认为否无需传参，并且选配物料只能为空。当是否可选配为否时，是否派生物料可以为是也可以为否，当是否派生物料为是时，选配物料必填。 示例：0 默认值：0 |
| optionalType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 选配方式（0表示特征选配，1表示组件选配。是否选配为是且选配方式不传时，默认为特征选配！选配方式为特征选配时，物料模板只能选择是否选配模板为是的模板！选配方式为组件选配时，物料模板可以不传或者选择是否选配模板为否的模板！） 示例：0 |
| derivedMaterial | int | 否 | 否 | 特征-是否派生物料，0代表否，1代表是。只有特征租户才有用，当是否可选配为是时，是否派生物料默认为否无需传参，并且选配物料只能为空。当是否可选配为否时，是否派生物料可以为是也可以为否，当是否派生物料为是时，选配物料必填。 示例：0 默认值：0 |
| optionalMaterialCode | string | 否 | 否 | 特征-选配物料编码(id和编码二选一选填，同时填入时以code为准)。只有特征租户才有用，当是否可选配为是时，是否派生物料默认为否无需传参，并且选配物料只能为空。当是否可选配为否时，是否派生物料可以为是也可以为否，当是否派生物料为是时，选配物料必填。 示例：0012000490 |
| optionalMaterialId | long | 否 | 否 | 特征-选配物料ID。只有特征租户才有用，当是否可选配为是时，是否派生物料默认为否无需传参，并且选配物料只能为空。当是否可选配为否时，是否派生物料可以为是也可以为否，当是否派生物料为是时，选配物料必填。 示例：2005891633021714400 |
| detail | object | 否 | 是 | 物料详情 |
| manageClass | string | 否 | 否 | 物料分类id(id和编码二选一必填，同时填入时以code为准) 示例：1979147318348742658 |
| manageClassCode | string | 否 | 否 | 物料分类编码(id和编码二选一必填，同时填入时以code为准) 示例：000160 |
| productClass | long | 否 | 否 | 商品分类id(id和编码二选一必填，同时填入时以code为准) 示例：1604214059445518300 |
| productClassCode | string | 否 | 否 | 商品分类编码(id和编码二选一必填，同时填入时以code为准) 示例：000023 |
| purchaseClass | long | 否 | 否 | 采购分类ID（ID、编码、名称同时填写时，优先级ID>编码>名称） 示例：1546426425542180900 |
| purchaseClassCode | string | 否 | 否 | 采购分类编码（ID、编码、名称同时填写时，优先级ID>编码>名称） 示例：PTO001 |
| purchaseClassName | string | 否 | 否 | 采购分类名称（ID、编码、名称同时填写时，优先级ID>编码>名称） 示例：PTO商品 |
| registrationManager | boolean | 否 | 否 | 注册证管理, true:是、false:否、 示例：false 默认值：false |
| authorizationManager | boolean | 否 | 否 | 授权书管理, true:是、false:否、 示例：false 默认值：false |
| sunshinePurchaseNo | string | 否 | 否 | 阳光采购号 示例：12345 |
| registrationNo | string | 否 | 否 | 注册证号 示例：12345 |
| autoGenerateRangeData | boolean | 否 | 否 | true：自动生成组织数据，false：不自动生成组织数据。不填默认是：false。 示例：false 默认值：false |
| productTemplate | long | 否 | 否 | 物料模板id(物料模板id和物料模板名称二选一，同时填入时以名称为准) 示例：1707277039562129400 |
| productTemplateName | string | 否 | 否 | 物料模板名称(物料模板id和物料模板名称二选一，同时填入时以名称为准) 示例：二维 |
| productLine | long | 否 | 否 | 产品线id(产品线id和产品线code二选一，同时填入以code为准) 示例：1978437085392011300 |
| productLineCode | string | 否 | 否 | 产品线编码(产品线id和产品线code二选一，同时填入以code为准) 示例：zdhcpx |
| brand | long | 否 | 否 | 品牌id(id和编码二选一选填，同时填入时以code为准) 示例：1748988559366291500 |
| brandCode | string | 否 | 否 | 品牌编码(id和编码二选一选填，同时填入时以code为准) 示例：00001 |
| placeOfOrigin | string | 否 | 否 | 产地 示例：产地 |
| manufacturer | string | 否 | 否 | 生产厂商 示例：生产厂商 |
| description | object | 否 | 否 | 物料详情描述 |
| realProductAttribute | int | 否 | 是 | 物料性质，1：实物物料，2：虚拟物料 示例：1 |
| realProductAttributeType | int | 否 | 否 | 实物物料属性，1：普通物料，2：实体卡券，3：实体储值卡，20：描述性物料，4：设备 示例：1 |
| virtualProductAttribute | long | 否 | 否 | 虚拟物料属性，7：服务，10：折扣，3：卡券，2：礼品卡，1：储值卡，4：其它，9：套餐，11：套件 示例：7 |
| giftCardId | string | 否 | 否 | 礼品卡id 示例：1978442600116912138 |
| couponId | string | 否 | 否 | 卡券id 示例：1978445340306046985 |
| unitUseType | long | 否 | 是 | 设置规则, 1:使用物料模板的计量单位、2:使用物料自己的计量单位、 示例：2 |
| unit | long | 否 | 否 | 主计量单位id(id和编码二选一必填，同时填入时以code为准) 示例：1955228568170528800 |
| unitCode | string | 否 | 否 | 主计量单位编码(id和编码二选一必填，同时填入时以code为准) 示例：KGM |
| enableAssistUnit | boolean | 否 | 否 | 启用辅计量, true:启用、 示例：false 默认值：false |
| weight | Decimal | 否 | 否 | 毛重 示例：1.1 |
| weightUnit | long | 否 | 否 | 毛重单位id(id和编码二选一选填，同时填入时以code为准) 示例：1955228568170528800 |
| weightUnitCode | string | 否 | 否 | 毛重单位编码(id和编码二选一选填，同时填入时以code为准) 示例：KGM |
| netWeight | number |
| 小数位数:8,最大长度:19 | 否 | 否 | 净重 示例：10 |
| netWeightUnit | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 净重单位id(id和编码二选一选填，同时填入时以code为准) 示例：1955228568170528800 |
| netWeightUnitCode | string | 否 | 否 | 净重单位编码(id和编码二选一选填，同时填入时以code为准) 示例：KGM |
| volume | Decimal | 否 | 否 | 体积 示例：1.1 |
| volumeUnit | long | 否 | 否 | 体积单位id(id和编码二选一选填，同时填入时以code为准) 示例：1978432859144192000 |
| volumeUnitCode | string | 否 | 否 | 体积单位编码(id和编码二选一选填，同时填入时以code为准) 示例：MTQ |
| taxClass | string | 否 | 否 | 税收分类码id(id和编码二选一选填，同时填入时以code为准) 示例：3040602990000000000 |
| taxClassCode | string | 否 | 否 | 税收分类码编码(id和编码二选一选填，同时填入时以code为准) 示例：3040602990000000000 |
| planClassCode | string | 否 | 否 | 计划分类编码(id和编码二选一选填，同时填入时以code为准) 示例：PLAN01 |
| planClass | long | 否 | 否 | 计划分类id(id和编码二选一选填，同时填入时以code为准) 示例：1954632478273568800 |
| shareDescription | object | 否 | 否 | 分享说明,支持多语 |
| keywords | object | 否 | 否 | 关键字,支持多语 |
| productAssistClasses | object | 是 | 否 | 物料辅助分类 |
| productOrges | object | 是 | 否 | 物料分配的组织。只能新增不能修改和删除。 |
| productAssistUnitExchanges | object | 是 | 否 | 物料辅计量换算对照 |
| productBarCodes | object | 是 | 否 | 物料多条码。修改时会全量替换旧的数据，即以当前条码数据为准。 |

## 3. 请求示例

Url: /yonbip/digitalModel/productapply/batchadd?access_token=访问令牌
Body: [{
	"applyCode": "WLXZ000045",
	"effectType": "0",
	"applyReason": "申请原因",
	"applyOrg": "666666",
	"applyOrgCode": "000002",
	"applyDepartment": "1504752976446095363",
	"applyDepartmentCode": "000001",
	"bizOperator": "1748882585331695616",
	"bizOperatorCode": "024006",
	"effectTime": "2022-08-31",
	"applyDesc": "备注",
	"productData": {
		"orgCode": "global00",
		"orgId": "666666",
		"code": "0012000372",
		"name": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"modelDescription": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"model": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"erpCode": "12345",
		"transType": "",
		"transTypeCode": "",
		"materialStatusId": "",
		"materialStatusCode": "",
		"optionalMaterial": 0,
		"optionalType": 0,
		"derivedMaterial": 0,
		"optionalMaterialCode": "0012000490",
		"optionalMaterialId": 2005891633021714400,
		"detail": {
			"shortName": "物料01",
			"mnemonicCode": "WL01",
			"erpOuterCode": "12345",
			"barCode": "12345",
			"inspectionType": 0,
			"warehousingByResult": false,
			"testRule": 1,
			"businessAttribute": "1,7",
			"saleChannel": "1,2,3",
			"purchaseUnit": 1955228568170528800,
			"purchaseUnitCode": "KGM",
			"inspectionUnit": 1955228568170528800,
			"inspectionUnitCode": "KGM",
			"purchasePriceUnit": 1955228568170528800,
			"purchasePriceUnitCode": "KGM",
			"stockUnit": 1955228568170528800,
			"stockUnitCode": "KGM",
			"produceUnit": 1955228568170528800,
			"produceUnitCode": "KGM",
			"batchPriceUnit": 1955228568170528800,
			"batchPriceUnitCode": "KGM",
			"batchUnit": 1955228568170528800,
			"batchUnitCode": "KGM",
			"onlineUnit": 1955228568170528800,
			"onlineUnitCode": "KGM",
			"offlineUnit": 1955228568170528800,
			"offlineUnitCode": "KGM",
			"requireUnit": 1955228568170528800,
			"requireUnitCode": "KGM",
			"markPrice": 1.1,
			"salePrice": 1.1,
			"marketPrice": 1.1,
			"displayPrice": true,
			"priceAreaMessage": "价格提示",
			"receiptName": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"incomeTaxRates": "10003",
			"incomeTaxRatesCode": "VATR6",
			"outputTaxRate": "10003",
			"outTaxRateCode": "VATR6",
			"order": 0,
			"stopstatus": true,
			"storeOffAndOffState": false,
			"orderLoadAndUnloadStatus": false,
			"productVendor": 1841189919393316900,
			"productVendorCode": "0001000102",
			"productBuyer": "6280fa4ccfcf11edae1008c0ebd50df6",
			"productBuyerCode": "6280fa4ccfcf11edae1008c0ebd50df6",
			"primeCosts": 0,
			"maxPrimeCosts": 0,
			"requestOrderLimit": 0,
			"canSale": true,
			"minOrderQuantity": 1.1,
			"deliveryDays": 0,
			"batchManage": true,
			"expiryDateManage": false,
			"expiryDateCalculationMethod": 0,
			"expireDateNo": 0,
			"expireDateUnit": "1",
			"daysBeforeValidityReject": 0,
			"validityWarningDays": 0,
			"serialNoManage": false,
			"barcodeManage": true,
			"safetyStock": 1.1,
			"highestStock": 1.1,
			"lowestStock": 1.1,
			"ropStock": 1.1,
			"warehouseManager": "6280fa4ccfcf11edae1008c0ebd50df6",
			"warehouseManagerCode": "6280fa4ccfcf11edae1008c0ebd50df6",
			"receiptWarehouse": 1689721154595455000,
			"receiptWarehouseCode": "000036",
			"deliveryWarehouse": 1689721154595455000,
			"deliveryWarehouseCode": "000036",
			"returnWarehouse": 1689721154595455000,
			"returnWarehouseCode": "000036",
			"inStoreExcessLimit": 1.1,
			"outStoreExcessLimit": 1.1,
			"storageLossRate": 1.1,
			"planDefaultAttribute": 1,
			"allowNegativeInventory": true,
			"planMethod": 0,
			"keySubPart": false,
			"fixedLeadTime": 0,
			"supplyType": 0,
			"produceDepartment": "1546453681386815488",
			"produceDepartmentCode": "00012",
			"manufacturePlanner": "6280ab18cfcf11edae1008c0ebd50df6",
			"manufacturePlannerCode": "6280ab18cfcf11edae1008c0ebd50df6",
			"engineeringDrawingNo": "12345",
			"planProduceLimit": 0,
			"valueManageType": "0",
			"batchRule": 0,
			"fixedQuantity": 10,
			"costValuation": "",
			"noTaxCostPrice": 1.1,
			"checkByBatch": false,
			"saleStyle": "1",
			"salePoints": 0,
			"inventoryCount": 2.2,
			"baseSaleCount": 0,
			"metaDescription": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"settleAccountsRate": 6.6,
			"recommend": false,
			"displayName": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"titleMemo": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"allowStorePurchase": true,
			"saleInOfflineStore": true,
			"priceChangeAllowed": false,
			"offlineStoreOrder": true,
			"offlineStoreReturn": true,
			"retailPriceDimension": 1,
			"deliverQuantityChange": 1,
			"process": false,
			"processType": "",
			"material": false,
			"weighingOrNot": false,
			"inventoryPlanStrategy": "0",
			"costItems": "1978437901431078916",
			"costItemsCode": "ZDH_FYXM",
			"costItemsName": "自动化_费用项目",
			"singleInspection": 0,
			"manageByInventory": 0,
			"checkByProject": 0,
			"checkBySalesOrders": 0,
			"checkByClient": 0,
			"checkByOutsourcing": 0,
			"atpInspection": 0,
			"doublePick": 10,
			"materialStatusId": "",
			"materialStatusCode": ""
		},
		"manageClass": "1979147318348742658",
		"manageClassCode": "000160",
		"productClass": 1604214059445518300,
		"productClassCode": "000023",
		"purchaseClass": 1546426425542180900,
		"purchaseClassCode": "PTO001",
		"purchaseClassName": "PTO商品",
		"registrationManager": false,
		"authorizationManager": false,
		"sunshinePurchaseNo": "12345",
		"registrationNo": "12345",
		"autoGenerateRangeData": false,
		"productTemplate": 1707277039562129400,
		"productTemplateName": "二维",
		"productLine": 1978437085392011300,
		"productLineCode": "zdhcpx",
		"brand": 1748988559366291500,
		"brandCode": "00001",
		"placeOfOrigin": "产地",
		"manufacturer": "生产厂商",
		"description": {
			"description": "物料电脑端描述",
			"mobileDescription": "物料手机端描述"
		},
		"realProductAttribute": 1,
		"realProductAttributeType": 1,
		"virtualProductAttribute": 7,
		"giftCardId": "1978442600116912138",
		"couponId": "1978445340306046985",
		"unitUseType": 2,
		"unit": 1955228568170528800,
		"unitCode": "KGM",
		"enableAssistUnit": false,
		"weight": 1.1,
		"weightUnit": 1955228568170528800,
		"weightUnitCode": "KGM",
		"netWeight": 10,
		"netWeightUnit": 1955228568170528800,
		"netWeightUnitCode": "KGM",
		"volume": 1.1,
		"volumeUnit": 1978432859144192000,
		"volumeUnitCode": "MTQ",
		"taxClass": "3040602990000000000",
		"taxClassCode": "3040602990000000000",
		"planClassCode": "PLAN01",
		"planClass": 1954632478273568800,
		"shareDescription": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"keywords": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"productAssistClasses": [
			{
				"status": "Insert",
				"productClassId": 1546426425542180900,
				"productClassCode": "001"
			}
		],
		"productOrges": [
			{
				"orgCode": "XMGS",
				"orgId": "1552320168638545928"
			}
		],
		"productAssistUnitExchanges": [
			{
				"unitExchangeType": 0,
				"assistUnitCount": 1,
				"assistUnit": 1748882585331695616,
				"assistUnitCode": "TNE",
				"mainUnitCount": 1000,
				"status": "Insert",
				"order": 0
			}
		],
		"productBarCodes": [
			{
				"barCode": "12345"
			}
		]
	}
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 处理结果编码，200：成功，其他：异常 示例：200 |
| message | string | 否 | 结果提示信息，包括成功和失败的提示信息 示例：处理成功 |
| data | object | 否 | 返回的数据 |
| count | number |
| 小数位数:0,最大长度:19 | 否 | 数量 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:19 | 否 | 成功数量 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:19 | 否 | 失败数量 示例：1 |
| messages | object | 是 | 失败详细信息 示例：["物料申请[SQD24012903]与已存在物料申请[SQD24012903]，名称+规格说明+型号重复"] |
| infos | object | 是 | 成功详细信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"messages": [
			"物料申请[SQD24012903]与已存在物料申请[SQD24012903]，名称+规格说明+型号重复"
		],
		"infos": [
			{
				"id": 1918383967882444807,
				"applyCode": "SQD24012902"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	通用业务校验异常	通用业务校验异常

118000	入参不能为空	入参不能为空

118003	请求数量超过最大限制数量	请求数量超过最大限制数量


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

