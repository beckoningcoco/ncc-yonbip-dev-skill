---
title: "产品线更新-特征"
apiId: "1706554677710028804"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Product Line"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Line]
platform_version: "BIP"
source_type: community-api-docs
---

# 产品线更新-特征

> `ContentType	application/json` 请求方式	POST | 分类: Product Line (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/batch/productline/update

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
| id | string | 否 | 否 | 产品线主键id;编码与ID不能同时为空，同时填入以ID为准 示例：123456 |
| code | string | 否 | 否 | 编码；编码与ID不能同时为空，同时填入以ID为准 示例：code |
| name | object | 否 | 是 | 名称 |
| simplifiedName | string | 否 | 是 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |
| stopStatus | boolean | 否 | 否 | 启用状态 true：停用 false：启用 示例：true |
| remark | object | 否 | 否 | 备注 |
| simplifiedName | string | 否 | 否 | 简体 示例：简体 |
| englishName | string | 否 | 否 | 英文 示例：英文 |
| traditionalName | string | 否 | 否 | 繁体 示例：繁体 |

## 3. 请求示例

Url: /yonbip/digitalModel/batch/productline/update?access_token=访问令牌
Body: {
	"id": "123456",
	"code": "code",
	"name": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	},
	"stopStatus": true,
	"remark": {
		"simplifiedName": "简体",
		"englishName": "英文",
		"traditionalName": "繁体"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 调用完成时的返回数据 |
| id | long | 否 | 保存成功后的产品线id 示例：123456 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "操作成功",
	"data": {
		"id": 123456
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

-1	系统异常，请稍后再试	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员


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

