---
title: "根据id查询销售区域-特征"
apiId: "1695128664563253252"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Sales Region"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Region]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据id查询销售区域-特征

> `ContentType	application/json` 请求方式	GET | 分类: Sales Region (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/salearea/newdetailbyid

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | long | query | 是 | ID    示例: 123456 |

## 3. 请求示例

Url: /yonbip/digitalModel/salearea/newdetailbyid?access_token=访问令牌&id=123456

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例："200" |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| id | long | 否 | ID 示例：123456 |
| code | string | 否 | 分类编码 示例：code |
| name | object | 否 | 分类名称,支持多语 |
| parent | long | 否 | 上级分类id 示例：12345678 |
| parentName | string | 否 | 上级分类名称 示例：上级分类 |
| order | int | 否 | 排序号 示例：1 |
| level | int | 否 | 层级 示例：1 |
| stopStatus | boolean | 否 | 启用状态 true：停用 false：启用 示例：true |
| remark | object | 否 | 备注,支持多语 |
| orgId | string | 否 | 管理组织id 示例：1234567 |

## 5. 正确返回示例

{
	"code": "\"200\"",
	"message": "操作成功",
	"data": {
		"id": 123456,
		"code": "code",
		"name": {
			"simplifiedName": "简体",
			"englishName": "english",
			"traditionalName": "繁体"
		},
		"parent": 12345678,
		"parentName": "上级分类",
		"order": 1,
		"level": 1,
		"stopStatus": true,
		"remark": {
			"simplifiedName": "简体",
			"englishName": "english",
			"traditionalName": "繁体"
		},
		"orgId": "1234567"
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

