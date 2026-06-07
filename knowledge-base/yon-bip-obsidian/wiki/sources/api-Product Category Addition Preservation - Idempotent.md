---
title: "商品分类新增保存-幂等"
apiId: "1970224429417365510"
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

# 商品分类新增保存-幂等

> `ContentType	application/json` 请求方式	POST | 分类: Product Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/presentationclass/idempotent/insert

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 是 | 编码 示例：code |
| name | object | 否 | 是 | 名称 |
| parentCode | string | 否 | 否 | 上级分类编码 示例：code2 |
| templateName | string | 否 | 否 | 物料模板名称 示例：物料模板 |
| manageClassCode | string | 否 | 否 | 物料分类编码 示例：code3 |
| order | int | 否 | 否 | 排序号 示例：1 |
| stopStatus | boolean | 否 | 否 | 启用状态 true：停用 false：启用 默认：false 示例：true |
| isRecommend | boolean | 否 | 否 | 商城推荐分类 true：是 false：否 默认：false 示例：true |
| isURecommend | boolean | 否 | 否 | U订货推荐分类 true：是 false：否 默认：false 示例：true |
| showInFront | boolean | 否 | 否 | 商城前端显示 true：是 false：否 默认：false 示例：true |
| showInTouchpad | boolean | 否 | 否 | 触屏端开单显示 true：是 false：否 默认：false 示例：true |
| orderStatus | boolean | 否 | 否 | U订货前端显示 true：是 false：否 默认：false 示例：true |
| shareDescription | object | 否 | 否 | 分享说明 |
| pageTitle | object | 否 | 否 | 页面标题 |
| seoDescription | object | 否 | 否 | SEO描述 |
| seoKeyword | object | 否 | 否 | SEO关键字 |

## 3. 请求示例

Url: /yonbip/digitalModel/presentationclass/idempotent/insert?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "code",
		"name": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"parentCode": "code2",
		"templateName": "物料模板",
		"manageClassCode": "code3",
		"order": 1,
		"stopStatus": true,
		"isRecommend": true,
		"isURecommend": true,
		"showInFront": true,
		"showInTouchpad": true,
		"orderStatus": true,
		"shareDescription": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"pageTitle": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"seoDescription": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		},
		"seoKeyword": {
			"simplifiedName": "简体",
			"englishName": "英文",
			"traditionalName": "繁体"
		}
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 提示信息 示例：成功 |
| data | object | 否 | 返回结果,id |
| id | long | 否 | id 示例：123456 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "成功",
	"data": {
		"id": 123456
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


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

