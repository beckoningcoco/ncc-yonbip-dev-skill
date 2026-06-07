---
title: "品牌列表查询V2"
apiId: "1695109577728589827"
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

# 品牌列表查询V2

> `ContentType	application/json` 请求方式	POST | 分类: Brand (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/brand/newlist

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
| pageIndex | int | 否 | 是 | 页码 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 分页大小 示例：100 默认值：100 |
| code | string | 否 | 否 | 品牌编码 示例：code |
| name | string | 否 | 否 | 品牌名称 示例：名称 |
| randKeywords | string | 否 | 否 | 别名 示例：别名 |
| brandClass | long | 否 | 否 | 分组id 示例：162494 |
| brandClassCode | string | 否 | 否 | 分组编码 示例：code02 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | pubts,大于等于当前时间 示例：2023-04-18 19:00:00 |
| beganTime | DateTime | 否 | 否 | 开始时间戳，包含 示例：2023-04-18 19:00 |
| endTime | DateTime | 否 | 否 | 结束时间戳，不包含 示例：2023-04-18 19:10 |

## 3. 请求示例

Url: /yonbip/digitalModel/brand/newlist?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"code": "code",
	"name": "名称",
	"randKeywords": "别名",
	"brandClass": 162494,
	"brandClassCode": "code02",
	"pubts": "2023-04-18 19:00:00",
	"beganTime": "2023-04-18 19:00",
	"endTime": "2023-04-18 19:10"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 是 | 数据 |
| id | long | 否 | id 示例：123456 |
| code | string | 否 | 编码 示例：code |
| name | object | 否 | 名称 |
| brandClass | long | 否 | 品牌分组id 示例：16657632 |
| brandClassCode | string | 否 | 品牌分组编码 示例：code01 |
| orderNumber | int | 否 | 排序号 示例：1 |
| stopStatus | boolean | 否 | 启用状态 true：停用 false：启用 示例：true |
| randKeywords | object | 否 | 品牌别名 |
| brandDesc | object | 否 | 品牌描述 |
| brandUrl | object | 否 | 品牌网址 |
| adImage | string | 否 | 广告图片 示例：www.aa9461231.com |
| brandLogo | string | 否 | logo 示例：www.cc4894.com |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "操作成功",
	"data": [
		{
			"id": 123456,
			"code": "code",
			"name": {
				"simplifiedName": "简体",
				"englishName": "english",
				"traditionalName": "繁体"
			},
			"brandClass": 16657632,
			"brandClassCode": "code01",
			"orderNumber": 1,
			"stopStatus": true,
			"randKeywords": {
				"simplifiedName": "简体",
				"englishName": "english",
				"traditionalName": "繁体"
			},
			"brandDesc": {
				"simplifiedName": "简体",
				"englishName": "english",
				"traditionalName": "繁体"
			},
			"brandUrl": {
				"simplifiedName": "简体",
				"englishName": "english",
				"traditionalName": "繁体"
			},
			"adImage": "www.aa9461231.com",
			"brandLogo": "www.cc4894.com"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

