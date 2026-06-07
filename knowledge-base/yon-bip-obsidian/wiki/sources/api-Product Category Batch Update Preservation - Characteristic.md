---
title: "商品分类批量更新保存-特征"
apiId: "1909386922041016328"
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

# 商品分类批量更新保存-特征

> `ContentType	application/json` 请求方式	POST | 分类: Product Category (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/presentationclass/batchupdate

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
| id | long | 否 | 否 | id，id与code至少填写一个 示例：123456 |
| code | string | 否 | 否 | 编码，id与code至少填写一个 示例：code |
| name | object | 否 | 否 | 名称 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| parentCode | string | 否 | 否 | 上级分类编码 示例：code2 |
| templateName | string | 否 | 否 | 物料模板名称 示例：物料模板 |
| manageClassCode | string | 否 | 否 | 物料分类编码 示例：code3 |
| order | int | 否 | 否 | 排序号 示例：1 |
| stopStatus | boolean | 否 | 否 | 启用状态 true：停用 false：启用 示例：true |
| isRecommend | boolean | 否 | 否 | 商城推荐分类 true：是 false：否 示例：true |
| isURecommend | boolean | 否 | 否 | U订货推荐分类 true：是 false：否 示例：true |
| showInFront | boolean | 否 | 否 | 商城前端显示 true：是 false：否 示例：true |
| showInTouchpad | boolean | 否 | 否 | 触屏端开单显示 true：是 false：否 示例：true |
| orderStatus | boolean | 否 | 否 | U订货前端显示 true：是 false：否 示例：true |
| shareDescription | object | 否 | 否 | 分享说明 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| pageTitle | object | 否 | 否 | 页面标题 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| seoDescription | object | 否 | 否 | SEO描述 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| seoKeyword | object | 否 | 否 | SEO关键字 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| adImage | string | 否 | 否 | 广告图片 示例：广告图片 |
| image | string | 否 | 否 | 分类图片 示例：分类图片 |

## 3. 请求示例

Url: /yonbip/digitalModel/presentationclass/batchupdate?access_token=访问令牌
Body: [{
	"id": 123456,
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
	},
	"adImage": "广告图片",
	"image": "分类图片"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 提示信息 示例：处理成功 |
| data | object | 否 | 返回结果,id |
| count | number |
| 小数位数:-,最大长度:- | 否 | 总数 示例：10 |
| successCount | number |
| 小数位数:0,最大长度:2 | 否 | 成功数量 示例：10 |
| failCount | number |
| 小数位数:-,最大长度:- | 否 | 失败数量 示例：0 |
| messages | string | 是 | 失败信息 示例：["编码已经存在"] |
| infos | object | 是 | 返回信息 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "处理成功",
	"data": {
		"count": 10,
		"successCount": 10,
		"failCount": 0,
		"messages": [
			"编码已经存在"
		],
		"infos": [
			{
				"id": 123456,
				"code": "code"
			}
		]
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

