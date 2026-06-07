---
title: "客户级别详情查询"
apiId: "ca53bcfea29b4e0eba0a3bd6272e06f1"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Customer Grade"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Grade]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户级别详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Customer Grade (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/cuslevel/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 客户级别ID    示例: 1511107254505728 |

## 3. 请求示例

Url: /yonbip/digitalModel/cuslevel/detail?access_token=访问令牌&id=1511107254505728

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：处理成功 |
| data | object | 否 | 调用成功时的返回数据 |
| name | muti_lang | 否 | 客户级别名称,支持多语 |
| code | string | 否 | 客户级别编码 示例：code |
| isEnabled | string | 否 | 启用状态, true:启用、false:停用、 示例：true |
| createDate | string | 否 | 创建日期 示例：2019-12-04 00:00:00 |
| modifier | string | 否 | 修改人 示例：修改人 |
| modifyTime | string | 否 | 修改时间 示例：2019-12-04 00:00:00 |
| modifyDate | string | 否 | 修改日期 示例：2019-12-04 00:00:00 |
| order | int | 否 | 排序号 示例：1 |
| id | string | 否 | 客户级别ID 示例：123456 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：2019-12-04 00:00:00 |
| comment | muti_lang | 否 | 备注,支持多语 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"code": "code",
		"isEnabled": "true",
		"createDate": "2019-12-04 00:00:00",
		"modifier": "修改人",
		"modifyTime": "2019-12-04 00:00:00",
		"modifyDate": "2019-12-04 00:00:00",
		"order": 1,
		"id": "123456",
		"pubts": "2019-12-04 00:00:00",
		"comment": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

