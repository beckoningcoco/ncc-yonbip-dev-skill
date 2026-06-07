---
title: "物料档案分页查询-集成V2"
apiId: "1952241478647939081"
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

# 物料档案分页查询-集成V2

> `ContentType	application/json` 请求方式	POST | 分类: Material (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/product/integration/querylist

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
| pageIndex | int | 否 | 是 | 当前页索引 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 页大小 示例：10 默认值：10 |
| productCodeList | string | 是 | 否 | 物料编码集合（物料id和编码同时传值时，以物料id为准，精确匹配） 示例：["WL052801"] |
| productNameList | string | 是 | 否 | 物料名称集合（模糊匹配） 示例：["测试物料"] |
| managerClassIdList | string | 是 | 否 | 物料分类Id集合 示例：["1979147318348742658"] |
| managerClassCodeList | string | 是 | 否 | 物料分类编码集合 示例：["000160"] |
| productClassIdList | string | 是 | 否 | 商品分类Id集合 示例：["1604214059445518300"] |
| productClassCodeList | string | 是 | 否 | 商品分类编码集合 示例：["000023"] |
| purchaseClassIdList | string | 是 | 否 | 采购分类Id集合 示例：["1546426425542180900"] |
| purchaseClassCodeList | string | 是 | 否 | 采购分类编码集合 示例：["PTO001"] |
| productTemplate | string | 否 | 否 | 物料模板ID 示例：1707277039562129400 |
| modelDescription | string | 否 | 否 | 规格说明 示例：规格说明 |
| model | string | 否 | 否 | 型号 示例：型号 |
| beginTime | DateTime | 否 | 否 | 开始时间（时间戳对比使用） 示例：2024-03-10 10:37:59 |
| endTime | DateTime | 否 | 否 | 结束时间（时间戳对比使用） 示例：2024-04-10 10:37:59 |
| custom_queryDetailData | boolean | 否 | 否 | 是否需要查询详情数据，true：需要查询详情，false：不需要查询详情，默认false 示例：false 默认值：false |
| stopStatus | boolean | 否 | 否 | 物料停用状态（false：启用；true：停用） 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/digitalModel/product/integration/querylist?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"productCodeList": [
		"WL052801"
	],
	"productNameList": [
		"测试物料"
	],
	"managerClassIdList": [
		"1979147318348742658"
	],
	"managerClassCodeList": [
		"000160"
	],
	"productClassIdList": [
		"1604214059445518300"
	],
	"productClassCodeList": [
		"000023"
	],
	"purchaseClassIdList": [
		"1546426425542180900"
	],
	"purchaseClassCodeList": [
		"PTO001"
	],
	"productTemplate": "1707277039562129400",
	"modelDescription": "规格说明",
	"model": "型号",
	"beginTime": "2024-03-10 10:37:59",
	"endTime": "2024-04-10 10:37:59",
	"custom_queryDetailData": false,
	"stopStatus": false
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
| haveNextPage | boolean | 否 | 是否有下一页 示例：true |
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
		"haveNextPage": true,
		"recordList": [
			{
				"createOrgId": "666666",
				"id": 2006712890913456134,
				"name": "测试物料",
				"code": "WL052801",
				"transType": "1489187216073687902",
				"unitId": 1489246761411674000,
				"unitCode": "GRM",
				"unitName": "克",
				"unitUseType": 2,
				"productCharacterDef": {
					"id": "1702371035974729735"
				},
				"manageClass": 1979147318348742658,
				"manageClassCode": "000160",
				"manageClassName": "test04",
				"saleProductClass": 1604214059445518300,
				"saleProductClassCode": "000023",
				"saleProductClassName": "零食大礼包",
				"purchaseClass": 1546426425542180900,
				"purchaseClassCode": "PTO001",
				"purchaseClassName": "a3",
				"productTemplate": 1707277039562129400,
				"productTemplateName": "wlmb_zyx",
				"productFamily": 0,
				"salesAndOperations": 0,
				"medIsRegistrationManager": false,
				"medIsAuthorizationManager": false,
				"hasSpecs": true,
				"url": "https://www.myhuaweicloud.com/iuap-apcom-file-public/iuap-apcom-file/0000L7PIX0Z2ARJ3MD0000/2024011710/76e75a72-a76e-4cb0-ad44-3031dfbbe7a6.jpg",
				"stopStatus": false,
				"realProductAttribute": "1:实物物料、2:虚拟物料、",
				"realProductAttributeType": "1：普通物料，2：实体卡券，20：描述性物料，3：实体储值卡，4：设备",
				"virtualProductAttribute": "1：储值卡，10：折扣，11：套件，16：PTO，2：礼品卡，3：卡券，4：其它，7：服务，9：套餐"
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

1	2025-11-12

更新

请求说明

2	2025-07-17

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

