---
title: "物料档案分页查询V2"
apiId: "1868566238604034052"
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

# 物料档案分页查询V2

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/product/listproductbycondition

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
| pageIndex | int | 否 | 是 | 当前页索引 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 页大小 示例：10 默认值：10 |
| productCode | string | 否 | 否 | 物料编码 示例：000001 |
| productName | string | 否 | 否 | 物料名称 示例：ss01 |
| managerClassIdList | string | 是 | 否 | 物料分类Id集合 示例：["1489299787088920600"] |
| managerClassCodeList | string | 是 | 否 | 物料分类编码集合 示例：["test04"] |
| productClassIdList | string | 是 | 否 | 商品分类Id集合 示例：["1489300268111102000"] |
| productClassCodeList | string | 是 | 否 | 商品分类编码集合 示例：["test0101"] |
| purchaseClassIdList | string | 是 | 否 | 采购分类Id集合 示例：["1851479819205738505"] |
| purchaseClassCodeList | string | 是 | 否 | 采购分类编码集合 示例：["a3"] |
| productTemplate | string | 否 | 否 | 物料模板ID 示例：1697050078302699500 |
| modelDescription | string | 否 | 否 | 规格说明 示例：规格说明 |
| model | string | 否 | 否 | 型号 示例：型号 |
| beganTime | DateTime | 否 | 否 | 开始时间（时间戳对比使用） 示例：2024-03-10 10:37:59 |
| endTime | DateTime | 否 | 否 | 结束时间（时间戳对比使用） 示例：2024-04-10 10:37:59 |
| orgId | string | 否 | 否 | 使用组织id 示例：1552320168638545928 |
| productTagList | long | 是 | 否 | 标签id集合 示例：[1555904765521035287,1546434491490762753] |
| mktStatus | boolean | 否 | 否 | 商城上下架状态，true表示上架，false表示下架 示例：false |
| mktUOrderStatus | boolean | 否 | 否 | 订货上下架状态，true表示上架，false表示下架 示例：false |
| erpCodeList | string | 是 | 否 | 商家编码集合 示例：["a001","a002"] |
| shortName | string | 否 | 否 | 物料简称 示例：API001 |
| mnemonicCode | string | 否 | 否 | 助记码 示例：API001 |

## 3. 请求示例

Url: /yonbip/digitalModel/product/listproductbycondition?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"productCode": "000001",
	"productName": "ss01",
	"managerClassIdList": [
		"1489299787088920600"
	],
	"managerClassCodeList": [
		"test04"
	],
	"productClassIdList": [
		"1489300268111102000"
	],
	"productClassCodeList": [
		"test0101"
	],
	"purchaseClassIdList": [
		"1851479819205738505"
	],
	"purchaseClassCodeList": [
		"a3"
	],
	"productTemplate": "1697050078302699500",
	"modelDescription": "规格说明",
	"model": "型号",
	"beganTime": "2024-03-10 10:37:59",
	"endTime": "2024-04-10 10:37:59",
	"orgId": "1552320168638545928",
	"productTagList": [
		1555904765521035287,
		1546434491490762753
	],
	"mktStatus": false,
	"mktUOrderStatus": false,
	"erpCodeList": [
		"a001",
		"a002"
	],
	"shortName": "API001",
	"mnemonicCode": "API001"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 调用完成返回码，调用成功时返回200； 示例：200 |
| message | string | 否 | 调用完成返回信息 示例：处理成功 |
| data | object | 否 | 调用完成返回数据 |
| pageIndex | int | 否 | 当前页索引 示例：1 |
| pageSize | int | 否 | 分页大小 示例：10 |
| pageCount | int | 否 | 总页数 示例：2 |
| beginPageIndex | int | 否 | 起始页索引 示例：1 |
| endPageIndex | int | 否 | 截止页索引 示例：2 |
| recordCount | int | 否 | 总条数 示例：15 |
| recordList | object | 是 | 结果集 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"pageCount": 2,
		"beginPageIndex": 1,
		"endPageIndex": 2,
		"recordCount": 15,
		"recordList": [
			{
				"createOrgId": "666666",
				"id": 1489997762220523500,
				"name": "ss01",
				"code": "000001",
				"transType": "1489187216073687902",
				"unitId": 1489246761411674000,
				"unitCode": "GRM",
				"unitName": "克",
				"unitUseType": 2,
				"productCharacterDef": {
					"id": "1702371035974729735"
				},
				"manageClass": 1489299787088920600,
				"manageClassCode": "test04",
				"manageClassName": "test04",
				"saleProductClass": 1489300268111102000,
				"saleProductClassCode": "test0101",
				"saleProductClassName": "零食大礼包",
				"purchaseClass": 1851479819205738505,
				"purchaseClassCode": "a3",
				"purchaseClassName": "a3",
				"productTemplate": 1697050078302699500,
				"productTemplateName": "wlmb_zyx",
				"productFamily": 0,
				"salesAndOperations": 0,
				"medIsRegistrationManager": false,
				"medIsAuthorizationManager": false,
				"hasSpecs": true,
				"url": "https://apcom-file-pub-npro.obs.cn-north-4.myhuaweicloud.com/iuap-apcom-file-public/iuap-apcom-file/0000LCG87YUW9VNEGY0000/2023090711/02d73d26-e315-4e19-.png",
				"mktStatus": false,
				"mktUOrderStatus": false,
				"erpCode": "a001",
				"shortName": "API001",
				"mnemonicCode": "API001"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-17

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

