---
title: "物料业务信息保存V1"
apiId: "1586494029504708617"
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

# 物料业务信息保存V1

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/productApplyData/save

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
| id | string | 否 | 否 | 物料id，与物料编码必传其一，两个都传以物料id为准 示例：2001401828850794505 |
| code | string | 否 | 否 | 物料编码，与物料id必传其一，两个都传以物料id为准 示例：0012000467 |
| orgId | string | 否 | 否 | 物料管理组织id，与管理组织编码必传其一，两个都传以管理组织id为准 示例：666666 |
| orgId_Code | string | 否 | 否 | 物料管理组织编码，与物料管理组织id必传其一，两个都传以管理组织id为准 示例：global00 |
| belogOrg | string | 否 | 否 | 物料使用组织id，与使用组织编码必传其一，两个都传以使用组织id为准 示例：0612001 |
| belogOrg_Code | string | 否 | 否 | 物料使用组织编码，与使用组织id必传其一，两个都传以使用组织id为准 示例：2156216 |
| detail | object | 否 | 是 | 物料使用信息详情数据 |
| shortName | string | 否 | 否 | 物料简称 示例：物料简称 |
| fNoTaxCostPrice | BigDecimal | 否 | 否 | 参考成本 示例：21 |
| mnemonicCode | string | 否 | 否 | 助记码 示例：助记码 |
| barCode | string | 否 | 否 | 条形码 示例：条形码 |
| receiptName | string | 否 | 否 | 开票名称 示例：开票名称 |
| receiptSpec | string | 否 | 否 | 开票规格 示例：开票规格 |
| receiptModel | string | 否 | 否 | 开票型号 示例：开票型号 |
| fMarkPrice | BigDecimal | 否 | 否 | 建议零售价，只能录入大于零的数，保留两位小数 示例：15 |
| fSalePrice | BigDecimal | 否 | 否 | 线上零售价，只能录入大于零的数，保留两位小数 示例：14 |
| fMarketPrice | BigDecimal | 否 | 否 | 市场价，只能录入大于零的数，保留两位小数 示例：14 |
| fPrimeCosts | BigDecimal | 否 | 否 | 采购参考价 示例：16 |
| safetyStock | BigDecimal | 否 | 否 | 安全库存 示例：155 |
| highestStock | BigDecimal | 否 | 否 | 最高库存 示例：1550 |
| lowestStock | BigDecimal | 否 | 否 | 最低库存 示例：15 |
| arrivalAllowErrorLimit | BigDecimal | 否 | 否 | 到货入库允差上下比例% 示例：60 |
| invoiceAllowErrorLimit | BigDecimal | 否 | 否 | 开票允差上下比例% 示例：30 |
| inStoreLessLimit | BigDecimal | 否 | 否 | 入库下限比例%，只能录入大于等于零的数，保留两位小数 示例：20 |
| outStoreLessLimit | BigDecimal | 否 | 否 | 出库下限比例%，只能录入大于等于零的数，保留两位小数 示例：10 |
| storageLossRate | BigDecimal | 否 | 否 | 保管损耗率，只能录入大于零的数，保留两位小数 示例：5 |
| lInventoryCount | BigDecimal | 否 | 否 | 线上库存量 示例：80 |
| fSettleAccountsRate | BigDecimal | 否 | 否 | 结算费率，只能录入大于零的数，保留两位小数 示例：70 |
| iBaseSaleCount | int | 否 | 否 | 初始销量 示例：50 |
| frontLeadTime | int | 否 | 否 | 前段提前期，只能录入正整数。计算计划下达日期的因素。计划下达日期=需求日期-（前段提前期+固定提前期+后段提前期） 示例：10 |
| behindLeadTime | int | 否 | 否 | 后段提前期，只能录入正整数。计算计划到货日期的因素。计划到货日期=需求日期-后段提前期 示例：5 |
| leadTimeCoefficient | BigDecimal | 否 | 否 | 提前期系数 示例：30 |
| leadTimeQuantity | BigDecimal | 否 | 否 | 提前期批量 示例：8 |
| rejectRate | BigDecimal | 否 | 否 | 废品率 示例：0.1 |
| checkByRevenueManagement | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 收入管理核算（0表示不开启，1表示开启） 示例：0 |
| omsWarehouse | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 电商仓id（电商仓id和编码二选一选填，同时填入时以电商仓编码为准） 示例：1689721154595454979 |
| omsWarehouseCode | string | 否 | 否 | 电商仓编码（电商仓id和编码二选一选填，同时填入时以电商仓编码为准） 示例：000036 |
| returnWarehouse | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 退货仓库id（退货仓库id和编码二选一选填，同时填入时以退货仓库编码为准） 示例：1689721154595454979 |
| returnWarehouseCode | string | 否 | 否 | 退货仓库编码（退货仓库id和编码二选一选填，同时填入时以退货仓库编码为准） 示例：000036 |
| deliveryWarehouse | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 发货仓库id（发货仓库id和编码二选一选填，同时填入时以发货仓库编码为准） 示例：1689721154595454979 |
| deliveryWarehouseCode | string | 否 | 否 | 发货仓库编码（发货仓库id和编码二选一选填，同时填入时以发货仓库编码为准） 示例：000036 |
| receiptWarehouse | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 收货仓库id（收货仓库id和编码二选一选填，同时填入时以收货仓库编码为准） 示例：1689721154595454979 |
| receiptWarehouseCode | string | 否 | 否 | 收货仓库编码（收货仓库id和编码二选一选填，同时填入时以收货仓库编码为准） 示例：000036 |
| isBatchManage | boolean | 否 | 否 | 批次管理，true：是、false：否 示例：false |
| checkByBatch | boolean | 否 | 否 | 按批次核算，true：是、false：否 示例：false |
| planDefaultAttribute | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 计划默认属性，1：采购，3：自制，5：委外 示例：1 |
| isSerialNoManage | boolean | 否 | 否 | 序列号管理，true：是，false：否 示例：false |
| engineeringDrawingNo | string | 否 | 否 | 工程图号 示例：1234 |
| planMethod | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 计划方法，0：MRP/LRP、1：N-不计划、10：库存计划、5：MPS。 示例：0 |
| produceDepartment | string | 否 | 否 | 生产部门id(id和编码二选一选填，同时填入时以code为准) 示例：1546453681386815488 |
| produceDepartment_Code | string | 否 | 否 | 生产部门编码(id和编码二选一选填，同时填入时以code为准) 示例：00012 |
| reservation | boolean | 否 | 否 | 是否可预留：true是，false否 示例：false |
| mtoStrategy | number |
| 小数位数:0,最大长度:10 | 否 | 否 | MTO策略（1：是；0：否） 示例：0 |
| strategyComparisonRule | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 策略对比方式（0：不严格；1：严格；2：不匹配） 示例：0 |
| checkBySalesOrders | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 按销售订单核算（0表示不开启，1表示开启） 示例：0 |
| manufacturingStrategy | string | 否 | 否 | 制造策略（MTO，ATO，MTS） 示例：MTO |

## 3. 请求示例

Url: /yonbip/digitalModel/product/productApplyData/save?access_token=访问令牌
Body: {
	"id": "2001401828850794505",
	"code": "0012000467",
	"orgId": "666666",
	"orgId_Code": "global00",
	"belogOrg": "0612001",
	"belogOrg_Code": "2156216",
	"detail": {
		"shortName": "物料简称",
		"fNoTaxCostPrice": 21,
		"mnemonicCode": "助记码",
		"barCode": "条形码",
		"receiptName": "开票名称",
		"receiptSpec": "开票规格",
		"receiptModel": "开票型号",
		"fMarkPrice": 15,
		"fSalePrice": 14,
		"fMarketPrice": 14,
		"fPrimeCosts": 16,
		"safetyStock": 155,
		"highestStock": 1550,
		"lowestStock": 15,
		"arrivalAllowErrorLimit": 60,
		"invoiceAllowErrorLimit": 30,
		"inStoreLessLimit": 20,
		"outStoreLessLimit": 10,
		"storageLossRate": 5,
		"lInventoryCount": 80,
		"fSettleAccountsRate": 70,
		"iBaseSaleCount": 50,
		"frontLeadTime": 10,
		"behindLeadTime": 5,
		"leadTimeCoefficient": 30,
		"leadTimeQuantity": 8,
		"rejectRate": 0.1,
		"checkByRevenueManagement": 0,
		"omsWarehouse": 1689721154595454979,
		"omsWarehouseCode": "000036",
		"returnWarehouse": 1689721154595454979,
		"returnWarehouseCode": "000036",
		"deliveryWarehouse": 1689721154595454979,
		"deliveryWarehouseCode": "000036",
		"receiptWarehouse": 1689721154595454979,
		"receiptWarehouseCode": "000036",
		"isBatchManage": false,
		"checkByBatch": false,
		"planDefaultAttribute": 1,
		"isSerialNoManage": false,
		"engineeringDrawingNo": "1234",
		"planMethod": 0,
		"produceDepartment": "1546453681386815488",
		"produceDepartment_Code": "00012",
		"reservation": false,
		"mtoStrategy": 0,
		"strategyComparisonRule": 0,
		"checkBySalesOrders": 0,
		"manufacturingStrategy": "MTO"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 提示信息 示例：处理成功 |
| code | string | 否 | 处理完成编码 示例：200 |
| data | object | 否 | 处理完成数据 |
| id | string | 否 | 物料id 示例：2005891633021714435 |
| code | string | 否 | 物料编码 示例：0012000467 |
| orgId_Code | string | 否 | 管理组织编码 示例：global00 |
| orgId | string | 否 | 管理组织id 示例：666666 |
| belogOrg_Code | string | 否 | 使用组织编码 示例：2156216 |
| belogOrg | string | 否 | 使用组织id 示例：0612001 |

## 5. 正确返回示例

{
	"message": "处理成功",
	"code": "200",
	"data": {
		"id": "2005891633021714435",
		"code": "0012000467",
		"orgId_Code": "global00",
		"orgId": "666666",
		"belogOrg_Code": "2156216",
		"belogOrg": "0612001"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-12

更新

请求说明

新增

请求参数 (9)

部分字段缺失，统一补充


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

