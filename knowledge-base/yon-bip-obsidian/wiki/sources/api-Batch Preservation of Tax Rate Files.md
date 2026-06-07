---
title: "税率档案批量保存"
apiId: "1596891750189236224"
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

# 税率档案批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Tax Rate Archive (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxpubdoc/openapi/taxRate/batchSave

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
| data | object | 是 | 否 | 要保存的数据 |
| code | string | 否 | 是 | 税率编码 示例：001-qazwssxeeddqazwssxeeddqazwssxeeddqazwssxeedd |
| name | object | 否 | 是 | 名称 |
| ntaxrate | number |
| 小数位数:8,最大长度:27 | 否 | 是 | 税率 示例：0.01 |
| scope | int | 否 | 否 | 适用范围(1-全部，2-采购，3-销售) 示例：2 |
| id | string | 否 | 否 | 主键id（更新需要添加该字段） 示例：10000 |
| taxfree | boolean | 否 | 否 | 免税 示例：true |
| notaxation | boolean | 否 | 否 | 不征税 示例：false |
| taxBureauArchiveId | string | 否 | 否 | 对应税务局档案id 示例：10000 |
| taxCategoryArchiveId | long | 否 | 否 | 对应税种档案id（税率档案新增的） 示例：10000 |
| taxRateType | string | 否 | 否 | 税率类型(1-定额，2-比例) 示例：1 |
| currency | string | 否 | 否 | 币种 示例：10000 |
| unit | string | 否 | 否 | 单位 示例：10000 |
| enable | int | 否 | 否 | 启用状态（1-启用，0-停用） 示例：1 |
| sysid | string | 否 | 否 | 应用标识 示例：diwork |
| effectiveDate | Date | 否 | 否 | 生效日期（yyyy-MM-dd） 示例：2022-10-26 |
| invalidationDate | Date | 否 | 否 | 失效日期（yyyy-MM-dd） 示例：2022-10-26 |
| _status | string | 否 | 否 | 新增-Insert，更新-Update 示例：Update |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxpubdoc/openapi/taxRate/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "001-qazwssxeeddqazwssxeeddqazwssxeeddqazwssxeedd",
			"name": {
				"zh_CN": "增值税",
				"en_US": "VAT",
				"zh_TW": "增值稅"
			},
			"ntaxrate": 0.01,
			"scope": 2,
			"id": "10000",
			"taxfree": true,
			"notaxation": false,
			"taxBureauArchiveId": "10000",
			"taxCategoryArchiveId": 10000,
			"taxRateType": "1",
			"currency": "10000",
			"unit": "10000",
			"enable": 1,
			"sysid": "diwork",
			"effectiveDate": "2022-10-26",
			"invalidationDate": "2022-10-26",
			"_status": "Update"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 接口状态码 示例：200 |
| message | string | 否 | 结果提示 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 批量记录数 示例：6 |
| successCount | long | 否 | 成功记录数 示例：2 |
| failCount | long | 否 | 失败记录数 示例：4 |
| messages | object | 否 | 返回提示语 示例：操作成功 |
| infos | object | 是 | 保存成功的对象列表 |
| failInfos | object | 是 | 失败对象 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 6,
		"successCount": 2,
		"failCount": 4,
		"messages": "操作成功",
		"infos": [
			{
				"taxBureauArchiveId": "10000",
				"taxCategoryArchiveId": "10000",
				"taxRateType": "2",
				"code": "001-222",
				"ntaxrate": 0.01,
				"currency": "10000",
				"unit": "10000",
				"name": {
					"zh_CN": "增值税",
					"en_US": "VAT",
					"zh_TW": "增值稅"
				},
				"effectiveDate": "2022-11-26",
				"invalidationDate": "2022-10-26",
				"taxfree": "",
				"notaxation": "",
				"ytenantId": "mdhpm1a4",
				"isGlobal": "N",
				"tenantid": "mdhpm1a4",
				"sysid": "diwork",
				"objid": "100000",
				"businessid": "10000",
				"synchts": "2022-11-22 15:19:53",
				"ts": "2022-11-22 15:19:53",
				"log": "操作日志",
				"scope": 2,
				"dr": 0,
				"createTime": "2022-11-22 15:19:53",
				"modifyTime": "2022-11-22 15:19:53",
				"creator": "9c793400-8ab2-49d9-9063-94bb8add9316",
				"modifier": "9c793400-8ab2-49d9-9063-94bb8add9316",
				"id": "1596882524589522952",
				"pubts": "2022-11-22 15:19:53",
				"enable": 1,
				"yhtTenant": "10000",
				"tenant": "10000",
				"categoryName": "增值税"
			}
		],
		"failInfos": [
			{
				"code": "VAT11",
				"message": "字段[税率档案.税率编码]输入的长度不能超过32位",
				"codes": [
					"001-qazwssxeeddqazwssxeeddqazwssxeeddqazwssxeedd"
				],
				"ids": "[\"100000\",\"100001\"]",
				"names": "[\"契税\",\"其他税\"]"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	入参不正确或服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-15

更新

请求参数 (4)

更新

返回参数 (10)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

