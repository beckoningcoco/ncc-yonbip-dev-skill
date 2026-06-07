---
title: "产品线新增保存V3"
apiId: "1965695042786426882"
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

# 产品线新增保存V3

> `ContentType	application/json` 请求方式	POST | 分类: Product Line (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/productline/idempotent/insert

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
| stopStatus | boolean | 否 | 否 | 启用状态 true：停用 false：启用 示例：true |
| remark | object | 否 | 否 | 备注 |

## 3. 请求示例

Url: /yonbip/digitalModel/productline/idempotent/insert?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
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

