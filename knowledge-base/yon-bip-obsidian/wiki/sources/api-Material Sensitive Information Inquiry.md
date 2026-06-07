---
title: "物料敏感信息查询"
apiId: "1672638927310159874"
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

# 物料敏感信息查询

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/CheckFree/getproductcheckfreedata

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
| productIdList | long | 是 | 否 | 物料id集合,与物料编码同时传参时，两者是且关联 示例：[20220620001] |
| productCodeList | string | 是 | 否 | 物料编码集合,与物料id同时传参时，两者是且关联 示例：["20220620001"] |

## 3. 请求示例

Url: /yonbip/digitalModel/product/CheckFree/getproductcheckfreedata?access_token=访问令牌
Body: {
	"productIdList": [
		20220620001
	],
	"productCodeList": [
		"20220620001"
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成时的返回信息 示例：操作成功 |
| data | object | 是 | 调用完成时的返回数据 |
| productId | long | 否 | 物料id 示例：1672571891461128200 |
| productDetailId | long | 否 | 物料详情id（只在老架构返回） 示例：1672571891461128202 |
| productApplyRangeId | long | 否 | 物料分配范围id（只在老架构返回） 示例：1672571891461128201 |
| template | long | 否 | 物料模板id（只在新架构返回） 示例：1661465518343192600 |
| characteristicsType | long | 否 | 特征组类型（只在新架构返回） 示例：3 |
| characteristics | long | 否 | 特征组id（只在新架构返回） 示例：1661465088834404400 |
| character | long | 否 | 特征id 示例：1661464728057151500 |
| characterCode | string | 否 | 特征编码（只在新架构返回） 示例：testcust001 |
| skuSens | long | 否 | 是否SKU敏感，1是，0否（只在新架构返回） 示例：1 |
| batchSens | long | 否 | 是否批次敏感，1是，0否（只在新架构返回） 示例：0 |
| SNSens | long | 否 | 是否序列号敏感，1是，0否（只在新架构返回） 示例：0 |
| stockSens | long | 否 | 是否存量敏感，1是，0否（只在新架构返回） 示例：1 |
| costAffec | long | 否 | 是否成本敏感，1是，0否（只在新架构返回） 示例：0 |
| BOMAffec | long | 否 | 是否BOM敏感，1是，0否（只在新架构返回） 示例：0 |
| manuAffec | long | 否 | 是否工艺敏感，1是，0否（只在新架构返回） 示例：0 |
| edAffec | long | 否 | 是否销售/采购制造敏感，1是，0否（只在老架构返回） 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"productId": 1672571891461128200,
			"productDetailId": 1672571891461128202,
			"productApplyRangeId": 1672571891461128201,
			"template": 1661465518343192600,
			"characteristicsType": 3,
			"characteristics": 1661465088834404400,
			"character": 1661464728057151500,
			"characterCode": "testcust001",
			"skuSens": 1,
			"batchSens": 0,
			"SNSens": 0,
			"stockSens": 1,
			"costAffec": 0,
			"BOMAffec": 0,
			"manuAffec": 0,
			"edAffec": 0
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

