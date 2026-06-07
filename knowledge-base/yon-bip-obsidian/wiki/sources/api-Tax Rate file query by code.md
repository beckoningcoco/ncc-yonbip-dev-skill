---
title: "税率档案根据code查询"
apiId: "1588737857865383944"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Tax Rate Archive"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Rate Archive]
platform_version: "BIP"
source_type: community-api-docs
---

# 税率档案根据code查询

> `ContentType	application/json` 请求方式	GET | 分类: Tax Rate Archive (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxpubdoc/openapi/taxRate/findByCode

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| code | string | query | 是 | 税率编码    示例: VAT17 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxpubdoc/openapi/taxRate/findByCode?access_token=访问令牌&code=VAT17

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 接口返回状态 示例：200 |
| message | string | 否 | 操作结果 示例：操作成功 |
| data | object | 否 | 查询返回对象 |
| taxBureauArchiveId | string | 否 | 对应税务局档案id 示例：1530239458409971719 |
| taxCategoryArchiveId | string | 否 | 对应税种档案id 示例：1530241777692311552 |
| taxRateType | string | 否 | 税率类型(1-定额，2-比例) 示例：2 |
| code | string | 否 | 税率编码 示例：12345678 |
| ntaxrate | number |
| 小数位数:8,最大长度:27 | 否 | 税率 示例：0.03 |
| currency | string | 否 | 币种 示例：2663390398518533 |
| unit | string | 否 | 单位 示例：1557560466917031952 |
| name | object | 否 | 税率名称（描述） |
| effectiveDate | Date | 否 | 生效日期（yyyy-MM-dd） 示例：2022-10-26 |
| invalidationDate | Date | 否 | 失效日期（yyyy-MM-dd） 示例：2022-10-26 |
| taxfree | boolean | 否 | 免税 示例：1 |
| notaxation | boolean | 否 | 不征税 示例：1 |
| scope | int | 否 | 适用范围（应用场景）(1-全部，2-采购，3-销售) 示例：1 |
| dr | long | 否 | 删除 示例：0 |
| ytenantId | string | 否 | 租户id 示例：mdhpm1a4 |
| createTime | string | 否 | 创建时间（yyyy-MM-dd HH:mm:ss） 示例：2022-10-27 14:01:07 |
| modifyTime | string | 否 | 修改时间（yyyy-MM-dd HH:mm:ss） 示例：2022-10-27 14:01:07 |
| creator | string | 否 | 创建人 示例：704e25cc-e08e-4c84-95f0-9b714397bd54 |
| modifier | string | 否 | 修改人 示例：9a996f31-4315-4b93-b33f-f3e0fb0f39d2 |
| id | string | 否 | 主键 示例：1577546212470947847 |
| pubts | string | 否 | 更新时间（yyyy-MM-dd HH:mm:ss） 示例：2022-11-12 09:55:41 |
| enable | int | 否 | 启用状态（0-停用，1-启用） 示例：0 |
| sysid | string | 否 | 应用标识 示例：diwork |
| isGlobal | string | 否 | 是否预置（Y-预置，N-非预置） 示例：N |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"taxBureauArchiveId": "1530239458409971719",
		"taxCategoryArchiveId": "1530241777692311552",
		"taxRateType": "2",
		"code": "12345678",
		"ntaxrate": 0.03,
		"currency": "2663390398518533",
		"unit": "1557560466917031952",
		"name": {
			"zh_CN": "增值税",
			"en_US": "VAT",
			"zh_TW": "增值稅"
		},
		"effectiveDate": "2022-10-26",
		"invalidationDate": "2022-10-26",
		"taxfree": "",
		"notaxation": "",
		"scope": 1,
		"dr": 0,
		"ytenantId": "mdhpm1a4",
		"createTime": "2022-10-27 14:01:07",
		"modifyTime": "2022-10-27 14:01:07",
		"creator": "704e25cc-e08e-4c84-95f0-9b714397bd54",
		"modifier": "9a996f31-4315-4b93-b33f-f3e0fb0f39d2",
		"id": "1577546212470947847",
		"pubts": "2022-11-12 09:55:41",
		"enable": 0,
		"sysid": "diwork",
		"isGlobal": "N"
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

