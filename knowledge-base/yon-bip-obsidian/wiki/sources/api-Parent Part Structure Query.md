---
title: "母件结构查询"
apiId: "1628124760967741448"
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

# 母件结构查询

> `ContentType	application/json` 请求方式	POST | 分类: BOM Maintenance (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/v1.0/bom/struct/list

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
| orgId | string | 否 | 否 | 组织ID,组织ID和组织编码不能同时为空，同时存在的时候以组织ID为准 示例：1550945092058480643 |
| orgCode | string | 否 | 否 | 组织编码，组织ID和组织编码不能同时为空，同时存在的时候以组织ID为准,当只有orgCode编码时，需要开启当前身份验证 示例：ZZY-01 |
| bomId | string | 否 | 是 | BomId 示例：1575224782727151622 |
| extendParam | int | 否 | 是 | 展开参数,0：匹配规则，1：母件用途 示例：0 |
| expandWay | int | 否 | 是 | 展开方式，1：全阶，2：阶列式 示例：1 |
| expiryDate | Date | 否 | 是 | 子件有效日期 示例：2023-01-03 |
| substituteFlag | int | 否 | 否 | 是否显示替代料，0：否，1：是 示例：0 |
| byproductFlag | int | 否 | 否 | 是否显示联副产品，0：否，1：是 示例：0 默认值：0 |
| showEffectiveChild | string | 否 | 否 | 只显示有效子件,0:否，1:是 示例：0 默认值：0 |
| commissionedQuantity | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 投产量 默认值：1.00 |

## 3. 请求示例

Url: /yonbip/mfg/v1.0/bom/struct/list?access_token=访问令牌
Body: {
	"orgId": "1550945092058480643",
	"orgCode": "ZZY-01",
	"bomId": "1575224782727151622",
	"extendParam": 0,
	"expandWay": 1,
	"expiryDate": "2023-01-03",
	"substituteFlag": 0,
	"byproductFlag": 0,
	"showEffectiveChild": "0",
	"commissionedQuantity": 0
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 编码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 是 | 数据结构 |
| bomLevel | long | 否 | BOM层级 示例：0 |
| materialCode | string | 否 | 制造物料编码 示例：ZZ01000002 |
| materialName | string | 否 | 制造物料名称 示例：西柚物料A |
| produceBatch | long | 否 | 批量 示例：1 |
| produceUnitName | string | 否 | 计量单位 示例：克 |
| orgId | string | 否 | 组织ID |
| versionCode | string | 否 | 版本号 示例：1.00 |
| effectiveDate | string | 否 | 生效时间 示例：2022-11-02 00:00:00 |
| expiryDate | string | 否 | 失效时间 示例：2099-12-31 23:59:59 |
| useType | string | 否 | 用途编码 |
| useTypeId | long | 否 | 用途ID 示例：1550119272925626378 |
| useTypeName | string | 否 | 用途 示例：自制 |
| id | long | 否 | 主键ID 示例：1 |
| productId | long | 否 | 物料ID |
| bomId | long | 否 | 母件ID 示例：1582037090473345028 |
| children | object | 是 | 子层级 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"bomLevel": 0,
			"materialCode": "ZZ01000002",
			"materialName": "西柚物料A",
			"produceBatch": 1,
			"produceUnitName": "克",
			"orgId": "",
			"versionCode": "1.00",
			"effectiveDate": "2022-11-02 00:00:00",
			"expiryDate": "2099-12-31 23:59:59",
			"useType": "",
			"useTypeId": 1550119272925626378,
			"useTypeName": "自制",
			"id": 1,
			"productId": 0,
			"bomId": 1582037090473345028,
			"children": [
				{
					"productId": 0,
					"materialCode": "",
					"materialName": "",
					"useTypeName": "",
					"useTypeId": 0,
					"useType": "",
					"expiryDate": "",
					"effectiveDate": "",
					"versionCode": "",
					"orgName": "",
					"orgId": "",
					"assistNumeratorQuantity": 0,
					"produceBatch": 0,
					"produceUnitName": "",
					"model": "",
					"denominatorQuantity": 0,
					"bomComponentUnitName": "",
					"usageType": 0,
					"lossType": 0,
					"childScrap": 0,
					"truncUp": 0,
					"scrap": 0,
					"assistQuantity": 0,
					"quantity": 0,
					"supplyType": 0,
					"isVirtua": 0,
					"alternateRatio": 0,
					"mainMaterial": 0,
					"modelDescription": "",
					"bomMaterialType": 0,
					"bomLevel": 1,
					"children": {}
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	非法的时间： 11111


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-07-23

新增

请求参数 commissionedQuantity

母件结构查询增加投产量


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

