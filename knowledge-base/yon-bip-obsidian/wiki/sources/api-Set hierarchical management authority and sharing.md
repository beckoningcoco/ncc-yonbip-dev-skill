---
title: "设置分级管理管理权和共享"
apiId: "1976834349707821060"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Master Data Graded Management"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Master Data Graded Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 设置分级管理管理权和共享

> `ContentType	application/json` 请求方式	POST | 分类: Master Data Graded Management (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/basedoc-mc/openApi/mc/mcManager

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
| orgids | string | 是 | 否 | 组织id(和组织code二选一,优先组织id) |
| orgCodes | string | 是 | 否 | 组织code(和组织id二选一,优先组织id) |
| docTypeCode | string | 否 | 是 | 档案类型code 示例：bd.project.ProjectVO |
| mcFlag | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 是否打开档案管理权 1:是;0:否 |
| shareFlag | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 是否开启 共享 1:是;0:否 |
| shareAllFlag | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 是否开启 共享下级 1:是;0:否 |
| autoShare | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 是否自动共享 1:是 ,0:否 注意:只有支持适用范围的档案才可以打开比如:项目,物料,供应商 |

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc-mc/openApi/mc/mcManager?access_token=访问令牌
Body: {
	"orgids": [
		""
	],
	"orgCodes": [
		""
	],
	"docTypeCode": "bd.project.ProjectVO",
	"mcFlag": 0,
	"shareFlag": 0,
	"shareAllFlag": 0,
	"autoShare": 0
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 标识 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
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

