---
title: "客户分类保存V2"
apiId: "309288c7284e42689658a2b040cd27b1"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户分类保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Customer Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/custcategory/save/mdd

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 客户分类 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| name | object | 否 | 是 | 客户分类名称（多语） |
| code | string | 否 | 是 | 客户分类编码 示例：fenlei1 |
| parent | string | 否 | 否 | 上级客户分类id 示例：123456 |
| parent_code | string | 否 | 否 | 上级分类编码 示例：上级分类编码 |
| order | int | 否 | 否 | 排序号 示例：1 |
| id | string | 否 | 否 | 客户分类id（新增不填，修改必填） 示例：123456789 |
| comment | object | 否 | 否 | 备注,支持多语 |
| isEnabled | boolean | 否 | 否 | 启用状态, true:启用、false:停用，不填写时默认为启用 示例：true |
| orgId | string | 否 | 否 | 管理组织id，当管理组织id与编码都不输入或者输入错误时，系统会自动分配默认组织，多组织用户默认分配企业账号级，单组织用户默认分配单组织 示例：666666 |
| orgIdCode | string | 否 | 否 | 管理组织编码,当管理组织id与编码都不输入时，系统会自动分配默认组织，多组织用户默认分配企业账号级，单组织用户默认分配单组织 示例：global00 |
| _status | string | 否 | 是 | Insert：新增客户分类，Update：编辑客户分类 示例：Insert |

## 3. 请求示例

Url: /yonbip/digitalModel/custcategory/save/mdd?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"name": {
			"zh_CN": "客户分类1",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"code": "fenlei1",
		"parent": "123456",
		"parent_code": "上级分类编码",
		"order": 1,
		"id": "123456789",
		"comment": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"isEnabled": true,
		"orgId": "666666",
		"orgIdCode": "global00",
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成时返回信息 示例：操作成功 |
| data | object | 否 | 调用完成时返回数据 |
| name | object | 否 | 客户分类名称 |
| code | string | 否 | 客户分类编码 示例：20211230 |
| orgId | string | 否 | 管理组织id 示例：666666 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 客户分类id 示例：2582635491512576 |
| parent | string | 否 | 上级分类id 示例：123456 |
| parent_code | string | 否 | 上级分类编码 示例：上级分类编码 |
| isEnabled | boolean | 否 | 启用状态, true:启用、false:停用、 示例：true |
| custCategoryApplyRanges | object | 是 | 客户分类适用范围 |
| comment | object | 否 | 备注 |
| creator | string | 否 | 创建人名称 示例：YonSuite默认用户 |
| creatorId | long | 否 | 创建人id 示例：2302391788867840 |
| createTime | string | 否 | 创建时间 示例：2021-12-30 10:32:41 |
| createDate | string | 否 | 创建日期 示例：2021-12-30 10:32:41 |
| pubts | string | 否 | 时间戳 示例：2021-12-30 10:32:42 |
| tenant | long | 否 | 租户id 示例：2302391788065024 |
| yTenantId | string | 否 | 租户id简写 示例：0000KPXH1DUADA8E8O0000 |
| path | string | 否 | 下级分类id组合 示例：2582635491512576| |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"name": {
			"zh_CN": "20211230",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"code": "20211230",
		"orgId": "666666",
		"resubmitCheckKey": "OPENAPI_309288c7284e42689658a2b040cd27b1_0000KPXH1DUADA8E8O0000_202112230",
		"id": 2582635491512576,
		"parent": "123456",
		"parent_code": "上级分类编码",
		"isEnabled": true,
		"custCategoryApplyRanges": [
			{
				"id": 2582635507683584,
				"clsId": 2582635491512576,
				"orgId": "666666",
				"isCreator": true,
				"isApplied": true,
				"isEnd": true,
				"tenant": 2302391788065024,
				"pubts": "2021-12-30 10:32:41",
				"yTenantId": "0000KPXH1DUADA8E8O0000"
			}
		],
		"comment": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"creator": "YonSuite默认用户",
		"creatorId": 2302391788867840,
		"createTime": "2021-12-30 10:32:41",
		"createDate": "2021-12-30 10:32:41",
		"pubts": "2021-12-30 10:32:42",
		"tenant": 2302391788065024,
		"yTenantId": "0000KPXH1DUADA8E8O0000",
		"path": "2582635491512576|"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

