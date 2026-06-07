---
title: "商品分类批量保存"
apiId: "86f0e6f8df2946cb9ec6a12b2e75310b"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 商品分类批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Product Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/batch/presentationclass/save

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
| data | object | 是 | 是 | 商品分类 |
| stopstatus | string | 否 | 是 | 0：启用，1：停用 示例：0 |
| remark | string | 否 | 否 | 备注 |
| isRecommend | string | 否 | 是 | 商城推荐分类 示例：false |
| iUOrderStatus | string | 否 | 是 | U订货前端显示，true：是，false：否 示例：true |
| id | string | 否 | 否 | 商品分类id，修改时必填 |
| showInTouchpad | string | 否 | 是 | 是否触屏端显示，true：是，false：否 示例：true |
| name | object | 否 | 是 | 商品分类名称（多语） |
| code | string | 否 | 是 | 商品分类编码 示例：lytest0000 |
| showInFront | string | 否 | 是 | 是否前端显示，true：是，false：否 示例：true |
| isURecommend | string | 否 | 是 | 订货推荐分类，true：是，false：否 示例：false |
| _status | string | 否 | 是 | Insert：新增，Update：修改 示例：Insert |
| parent | string | 否 | 否 | 上级商品分类id |
| parent_code | string | 否 | 否 | 上级商品分类编码 |
| seoDescription | object | 否 | 否 | SEO描述 |
| seoKeyword | object | 否 | 否 | SEO关键字 |
| adImage | string | 否 | 否 | 广告图片 |
| image | string | 否 | 否 | 分类图片 |
| shareDescription | object | 否 | 否 | 分享说明 |
| pageTitle | string | 否 | 否 | 页面标题 |
| order | string | 否 | 否 | 排序 |
| manageClass_code | string | 否 | 否 | 物料分类编码 |
| template_name | string | 否 | 否 | 物料模板名称 |

## 3. 请求示例

Url: /yonbip/digitalModel/batch/presentationclass/save?access_token=访问令牌
Body: {
	"data": [
		{
			"stopstatus": "0",
			"remark": "",
			"isRecommend": "false",
			"iUOrderStatus": "true",
			"id": "",
			"showInTouchpad": "true",
			"name": {
				"zh_CN": "lytest0000",
				"en_US": "",
				"zh_TW": ""
			},
			"code": "lytest0000",
			"showInFront": "true",
			"isURecommend": "false",
			"_status": "Insert",
			"parent": "",
			"parent_code": "",
			"seoDescription": {
				"zh_CN": "",
				"en_US": "",
				"zh_TW": ""
			},
			"seoKeyword": {
				"zh_CN": "",
				"en_US": "",
				"zh_TW": ""
			},
			"adImage": "",
			"image": "",
			"shareDescription": {
				"zh_CN": "",
				"en_US": "",
				"zh_TW": ""
			},
			"pageTitle": "",
			"order": "",
			"manageClass_code": "",
			"template_name": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 200：成功 示例：200 |
| message | string | 否 | 调用结果 示例：操作成功 |
| data | object | 否 | 返回数据 |
| successCountAI | long | 否 | 默认0 示例：0 |
| failCountAI | long | 否 | 默认0 示例：0 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 商品分类 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"successCountAI": 0,
		"failCountAI": 0,
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"isRecommend": true,
				"showInFront": true,
				"isURecommend": true,
				"code": "0777554",
				"iUOrderStatus": true,
				"name": {
					"zh_CN": "裤子",
					"en_US": "",
					"zh_TW": ""
				},
				"showInTouchpad": true,
				"stopstatus": false,
				"id": 2257304240279808,
				"isEnabled": true,
				"isEnd": true,
				"pubts": "2021-05-14 14:48:37",
				"tenant": 2053468229931264,
				"yTenantId": "injj8z7q"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

