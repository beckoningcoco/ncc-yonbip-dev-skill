---
title: "母件结构查询批量"
apiId: "2154407985872896001"
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

# 母件结构查询批量

> `ContentType	application/json` 请求方式	POST | 分类: BOM Maintenance (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/mfg/v1.0/bom/struct/batch/list

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
| tiled | string | 否 | 是 | 是否平铺展开：1：是，0：否 默认值：1 |
| orgId | string | 否 | 否 | 组织ID,组织ID和组织编码不能同时为空，同时存在的时候以组织ID为准 示例：1550945092058480643 |
| orgCode | string | 否 | 否 | 组织编码，组织ID和组织编码不能同时为空，同时存在的时候以组织ID为准,当只有orgCode编码时，需要开启当前身份验证 示例：ZZY-01 |
| bomId | number |
| 小数位数:0,最大长度:19 | 是 | 否 | bomId，不能与productId同时存在，按照BOM查询数据并展开 |
| productId | number |
| 小数位数:0,最大长度:19 | 是 | 否 | 物料ID，不能与bomId同时存在，按照物料进行查询数据并展开 |
| extendParam | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 展开参数,0：匹配规则，1：母件用途 示例：0 |
| expandWay | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 展开方式，1：全阶，2：阶列式 示例：1 |
| expiryDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 子件有效日期 示例：2023-01-03 |
| substituteFlag | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 是否显示替代料，0：否，1：是 示例：0 |
| byproductFlag | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 是否显示联副产品，0：否，1：是 示例：0 默认值：0 |
| showEffectiveChild | string | 否 | 否 | 只显示有效子件,0:否，1:是 示例：0 默认值：0 |
| commissionedQuantity | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 投产量 默认值：1.00 |

## 3. 请求示例

Url: /yonbip/mfg/v1.0/bom/struct/batch/list?access_token=访问令牌
Body: {
	"tiled": "",
	"orgId": "1550945092058480643",
	"orgCode": "ZZY-01",
	"bomId": [
		0
	],
	"productId": [
		0
	],
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
| materialCode | string | 否 | 物料编码 示例：ZZ01000002 |
| materialName | string | 否 | 物料名称 示例：西柚物料A |
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
| children | object | 是 | 当查询结构为平铺时此字段无用 |

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
				{}
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

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

