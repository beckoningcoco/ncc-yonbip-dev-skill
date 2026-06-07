---
title: "根据ID查询SKU详情-特征"
apiId: "1690507666288279559"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据ID查询SKU详情-特征

> `ContentType	application/json` 请求方式	GET | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/sku/detail/id

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | long | query | 是 | 主键    示例: 1918383967882444800 |

## 3. 请求示例

Url: /yonbip/digitalModel/product/sku/detail/id?access_token=访问令牌&id=1918383967882444800

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 结果提示信息，包括成功和失败的提示信息 示例：处理成功 |
| code | string | 否 | 处理结果编码，200：成功，其他：异常 示例：200 |
| data | object | 是 | 查询数据结果 |
| id | long | 否 | 主键 示例：1690430116254449700 |
| code | string | 否 | 编码 示例：000029 |
| name | string | 否 | 名称 示例：testskuapi来源3千克 |
| productId | long | 否 | 物料主键 示例：1689698958204469200 |
| shortName | string | 否 | 简称 示例：test |
| modelDescription | string | 否 | 规格说明 示例：test |
| model | string | 否 | 型号 示例：test |
| specIds | string | 否 | 特征值主键组合 示例：1670326224734388253;1690255740570697732 |
| specs | string | 否 | 特征组合 示例：spec自定义档案:来源3;spec基本档案:千克; |
| salePrice | string | 否 | 线上零售价 示例：123.00000000 |
| markPrice | long | 否 | 市场价 示例：123 |
| noTaxCostPrice | long | 否 | 参考成本 示例：123 |
| ustatus | boolean | 否 | 订货上下架状态，true：上架，false：下架 示例：false |
| stopStatus | boolean | 否 | 停用状态，true：停用，false：启用 示例：false |
| status | boolean | 否 | 商城上下架状态，true：上架，false：下架 示例：false |
| batchPrice | long | 否 | 批发价 示例：0 |
| barCode | string | 否 | 条形码 示例：test |
| mnemonicCode | string | 否 | 助记码 示例：testskuapi |
| inventoryCount | long | 否 | 线上库存量 示例：123 |
| batchDeliveryDays | long | 否 | 批发-交货周期 示例：123 |
| safetyStock | long | 否 | 安全库存 示例：123 |
| fsettleAccountsRate | long | 否 | 结算费率 示例：123 |
| idoubleSale | long | 否 | 销售倍量 示例：123 |
| flowestMarkPrice | long | 否 | 最低零售价 示例：0 |
| fmarketPrice | long | 否 | 市场价 示例：123 |
| fprimeCosts | long | 否 | 采购参考价 示例：123 |
| tagList | object | 是 | SKU标签信息 |
| batchPriceUnit | number |
| 小数位数:0,最大长度:19 | 否 | 批发计价单位id 示例：1552330897450074121 |
| batchPriceUnitCode | string | 否 | 批发计价单位编码 示例：TNE |

## 5. 正确返回示例

{
	"message": "处理成功",
	"code": "200",
	"data": [
		{
			"id": 1690430116254449700,
			"code": "000029",
			"name": "testskuapi来源3千克",
			"productId": 1689698958204469200,
			"shortName": "test",
			"modelDescription": "test",
			"model": "test",
			"specIds": "1670326224734388253;1690255740570697732",
			"specs": "spec自定义档案:来源3;spec基本档案:千克;",
			"salePrice": "123.00000000",
			"markPrice": 123,
			"noTaxCostPrice": 123,
			"ustatus": false,
			"stopStatus": false,
			"status": false,
			"batchPrice": 0,
			"barCode": "test",
			"mnemonicCode": "testskuapi",
			"inventoryCount": 123,
			"batchDeliveryDays": 123,
			"safetyStock": 123,
			"fsettleAccountsRate": 123,
			"idoubleSale": 123,
			"flowestMarkPrice": 0,
			"fmarketPrice": 123,
			"fprimeCosts": 123,
			"tagList": [
				{
					"id": 1867255002164625410,
					"name": "SKU标签",
					"tagClass": 1785426391875977221,
					"tagClassName": "标签分组",
					"tagClassCode": "00001",
					"tagAbbr": "标签备注",
					"backGroundColor": "#fff",
					"fontColor": "#007CEF",
					"scope": "3",
					"style": 1,
					"tagPosition": 1,
					"front": 1,
					"manage": 1,
					"fastSale": 1
				}
			],
			"batchPriceUnit": 1552330897450074121,
			"batchPriceUnitCode": "TNE"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	业务异常	业务异常

118001	根据条件查询结果为空	根据条件查询结果为空

118000	入参不能为空	入参不能为空


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

