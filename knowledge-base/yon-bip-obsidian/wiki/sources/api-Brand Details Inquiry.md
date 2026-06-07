---
title: "品牌详情查询"
apiId: "0ea527d7a54341dfbcc341bf694026ee"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Brand"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Brand]
platform_version: "BIP"
source_type: community-api-docs
---

# 品牌详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Brand (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/brand/detail

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | long | query | 否 | 品牌id,品牌id与编码不可以同时为空,id和编码同时存在时以id为准    示例: 2403155899044096 |
| code | string | query | 否 | 品牌编码,品牌id与编码不可以同时为空,id和编码同时存在时以id为准    示例: 20210826 |

## 3. 请求示例

Url: /yonbip/digitalModel/brand/detail?access_token=访问令牌&id=2403155899044096&code=20210826

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用完成时返回信息 示例：操作成功 |
| data | object | 否 | 调用完成时返回数据 |
| adImage | string | 否 | 广告图片地址 示例：https://ys-yxy-testres.yonyoucloud.com/45e0470a-c1d3-47b0-9aa4-6d9321f5d06e.jpg |
| code | string | 否 | 品牌编码 示例：biam123 |
| brandClass | long | 否 | 品牌分组id 示例：2412829393998080 |
| brandClass_name | string | 否 | 品牌分组名称 示例：品牌分组1 |
| brandDesc | string | 否 | 品牌描述 示例：品牌描述1 |
| brandUrl | string | 否 | 品牌网址 示例：www.baidu.com |
| ordernumber | long | 否 | 排序序号 示例：1 |
| name | string | 否 | 品牌名称 示例：名称简体 |
| productTplBrands | object | 是 | 物料模板关联数据 |
| randKeywords | string | 否 | 品牌别名 示例：品牌别名简体 |
| id | long | 否 | 品牌id 示例：2412830437249280 |
| brandLogo | string | 否 | 品牌Logo图片地址 示例：https://ys-yxy-testres.yonyoucloud.com/0b5fd617-9137-43dc-b402-968151552b02.jpg |
| stopstatus | long | 否 | 是否停用，0否，1是 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"adImage": "https://ys-yxy-testres.yonyoucloud.com/45e0470a-c1d3-47b0-9aa4-6d9321f5d06e.jpg",
		"code": "biam123",
		"brandClass": 2412829393998080,
		"brandClass_name": "品牌分组1",
		"brandDesc": "品牌描述1",
		"brandUrl": "www.baidu.com",
		"ordernumber": 1,
		"name": "名称简体",
		"productTplBrands": [
			{
				"productTplTemp": 2263236539503616,
				"productTplTemp_name": "手机机身颜色_手机运行内存_尺码",
				"id": 2412830437265664,
				"brand": 2412830437249280
			}
		],
		"randKeywords": "品牌别名简体",
		"id": 2412830437249280,
		"brandLogo": "https://ys-yxy-testres.yonyoucloud.com/0b5fd617-9137-43dc-b402-968151552b02.jpg",
		"stopstatus": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

