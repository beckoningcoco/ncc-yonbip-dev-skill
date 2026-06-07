---
title: "客户行业详情查询"
apiId: "3693f12056ae471d81acc7c1430cfcf0"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Customer's Industry"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer's Industry]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户行业详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Customer's Industry (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/customertrade/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 客户行业id    示例: 1511105059508480 |

## 3. 请求示例

Url: /yonbip/digitalModel/customertrade/detail?access_token=访问令牌&id=1511105059508480

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：处理成功 |
| data | object | 否 | 调用成功时的返回数据 |
| code | string | 否 | 行业编码 示例：编码 |
| name | muti_lang | 否 | 行业名称,支持多语 |
| order | int | 否 | 排序号 示例：1 |
| parent | string | 否 | 上级客户行业id 示例：123456 |
| id | string | 否 | 客户行业id 示例：123456789 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-01 00:00:00 |
| parent_name | string | 否 | 上级行业名称 示例：上级行业名称 |
| level | int | 否 | 层级 示例：1 |
| isEnd | boolean | 否 | 是否末级，true：是，false：否 示例：true |
| stopstatus | string | 否 | 停用状态, 0:启用、1:停用、 示例：0 |
| creator | string | 否 | 创建人 示例：创建人 |
| createTime | string | 否 | 创建时间 示例：2024-05-01 00:00:00 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"code": "编码",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"order": 1,
		"parent": "123456",
		"id": "123456789",
		"pubts": "2024-05-01 00:00:00",
		"parent_name": "上级行业名称",
		"level": 1,
		"isEnd": true,
		"stopstatus": "0",
		"creator": "创建人",
		"createTime": "2024-05-01 00:00:00"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


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

