---
title: "项目档案分配组织"
apiId: "1871545863557349376"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目档案分配组织

> `ContentType	application/json` 请求方式	POST | 分类: Project (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/project/projectAllocateOrg

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
| projectId | string | 否 | 是 | 项目id(projectCode和projectId填一个) 示例：1111 |
| projectCode | string | 否 | 否 | 项目code(projectCode和projectId填一个) 示例：code001 |
| orgIds | string | 是 | 否 | 分配的组织id,范围必须在分级管控共享的范围内 (orgCodes和orgIds填一个) 示例：["111","222"] |
| orgCodes | string | 是 | 否 | 分配的组织code,范围必须在分级管控共享的范围内 (orgCodes和orgIds填一个) 示例：["111","222"] |
| type | string | 否 | 否 | 参数orgIds覆盖数据库中的还是在原有基础上增加/取消,"1":增加;"2":取消,3":覆盖. 当orgIds为空,且type="3"时置空所有共享,不共享(共享范围只有当前主组织) 示例：1 默认值：1 |

## 3. 请求示例

Url: /yonbip/digitalModel/project/projectAllocateOrg?access_token=访问令牌
Body: [{
	"projectId": "1111",
	"projectCode": "code001",
	"orgIds": [
		"111",
		"222"
	],
	"orgCodes": [
		"111",
		"222"
	],
	"type": "1"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


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

