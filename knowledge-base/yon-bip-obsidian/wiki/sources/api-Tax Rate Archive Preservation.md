---
title: "税率档案保存"
apiId: "1588747899498921991"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Rate Archive"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Rate Archive]
platform_version: "BIP"
source_type: community-api-docs
---

# 税率档案保存

> `ContentType	application/json` 请求方式	POST | 分类: Tax Rate Archive (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxpubdoc/openapi/taxRate/save

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
| data | object | 否 | 是 | 数据对象 |
| taxBureauArchiveId | string | 否 | 否 | 税务局id（税务局档案id） 示例：10000 |
| taxCategoryArchiveId | string | 否 | 否 | 税种id（税种档案id） 示例：10000 |
| id | string | 否 | 否 | 主键（更新需要添加该字段） 示例：10000 |
| taxRateType | string | 否 | 否 | 税率类型(1-定额，2-比例) 示例：1 |
| code | string | 否 | 是 | 税率编码 示例：001-21 |
| name | object | 否 | 是 | 税率名称/描述 |
| ntaxrate | number |
| 小数位数:8,最大长度:27 | 否 | 是 | 税率值 示例：0.01 |
| scope | int | 否 | 否 | 适用范围(1-全部，2-采购，3-销售) 示例：2 |
| taxfree | boolean | 否 | 否 | 免税 示例：true |
| notaxation | boolean | 否 | 否 | 不征税 示例：false |
| currency | string | 否 | 否 | 币种 示例：10000 |
| unit | string | 否 | 否 | 单位 示例：10000 |
| effectiveDate | Date | 否 | 否 | 生效日期（yyyy-MM-dd） 示例：2022-10-26 |
| invalidationDate | Date | 否 | 否 | 失效日期（yyyy-MM-dd） 示例：2022-10-26 |
| enable | int | 否 | 否 | 档案状态（1-启用，0停用） 示例：1 |
| sysid | string | 否 | 否 | 应用标识-默认为diwork 示例：diwork |
| _status | string | 否 | 否 | 新增Insert，更新Update（需要传id） 示例：Insert |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxpubdoc/openapi/taxRate/save?access_token=访问令牌
Body: {
	"data": {
		"taxBureauArchiveId": "10000",
		"taxCategoryArchiveId": "10000",
		"id": "10000",
		"taxRateType": "1",
		"code": "001-21",
		"name": {
			"zh_CN": "增值税",
			"en_US": "VAT",
			"zh_TW": "增值稅"
		},
		"ntaxrate": 0.01,
		"scope": 2,
		"taxfree": true,
		"notaxation": false,
		"currency": "10000",
		"unit": "10000",
		"effectiveDate": "2022-10-26",
		"invalidationDate": "2022-10-26",
		"enable": 1,
		"sysid": "diwork",
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 接口返回状态 示例：200 |
| message | string | 否 | 操作结果 示例：操作成功 |
| data | object | 否 | 保存的对象 |
| taxBureauArchiveId | string | 否 | 对应税务局档案id 示例：10000 |
| taxCategoryArchiveId | string | 否 | 对应税种档案id 示例：10000 |
| taxRateType | string | 否 | 税率类型(1-定额，2-比例) 示例：2 |
| code | string | 否 | 税率编码 示例：001-21 |
| ntaxrate | number |
| 小数位数:8,最大长度:27 | 否 | 税率 示例：0.03 |
| currency | string | 否 | 币种 示例：10000 |
| unit | string | 否 | 单位 示例：10000 |
| name | object | 否 | 税率名称（描述） |
| effectiveDate | Date | 否 | 生效日期（yyyy-MM-dd） 示例：2022-10-26 |
| invalidationDate | Date | 否 | 失效日期（yyyy-MM-dd） 示例：2022-10-26 |
| taxfree | boolean | 否 | 免税 示例：2 |
| notaxation | boolean | 否 | 不征税 示例：2 |
| scope | int | 否 | 适用范围（应用场景）(1-全部，2-采购，3-销售) 示例：2 |
| dr | string | 否 | 删除 示例：0 |
| ytenantId | string | 否 | 租户id 示例：mdhpm1a4 |
| createTime | string | 否 | 创建时间（yyyy-MM-dd HH:mm:ss） 示例：2022-11-21 19:27:26 |
| modifyTime | string | 否 | 修改时间（yyyy-MM-dd HH:mm:ss） 示例：2022-11-21 19:27:26 |
| creator | string | 否 | 创建人 示例：530a978f-802e-4721-bef0-a6697d7f5afe |
| modifier | string | 否 | 修改人 示例：530a978f-802e-4721-bef0-a6697d7f5afe |
| id | string | 否 | 主键 示例：1591847173480251399 |
| pubts | DateTime | 否 | 更新时间（yyyy-MM-dd HH:mm:ss） 示例：2022-11-21 19:27:26 |
| enable | int | 否 | 启用状态（1-启用，0停用） 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"taxBureauArchiveId": "10000",
		"taxCategoryArchiveId": "10000",
		"taxRateType": "2",
		"code": "001-21",
		"ntaxrate": 0.03,
		"currency": "10000",
		"unit": "10000",
		"name": {
			"zh_CN": "增值税",
			"en_US": "VAT",
			"zh_TW": "增值稅"
		},
		"effectiveDate": "2022-10-26",
		"invalidationDate": "2022-10-26",
		"taxfree": "",
		"notaxation": "",
		"scope": 2,
		"dr": "0",
		"ytenantId": "mdhpm1a4",
		"createTime": "2022-11-21 19:27:26",
		"modifyTime": "2022-11-21 19:27:26",
		"creator": "530a978f-802e-4721-bef0-a6697d7f5afe",
		"modifier": "530a978f-802e-4721-bef0-a6697d7f5afe",
		"id": "1591847173480251399",
		"pubts": "2022-11-21 19:27:26",
		"enable": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	未知错误	入参不正确或服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-15

更新

请求参数 taxfree

更新

请求参数 notaxation

更新

返回参数 taxfree

更新

返回参数 notaxation


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

