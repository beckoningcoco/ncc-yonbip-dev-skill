---
title: "职能共享删除"
apiId: "2126998105866895362"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Function Sharing Settings"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Function Sharing Settings]
platform_version: "BIP"
source_type: community-api-docs
---

# 职能共享删除

> `ContentType	application/json` 请求方式	POST | 分类: Function Sharing Settings (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/funcshare/delete

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
| shareOrgId | string | 否 | 否 | 共享组织主键。当共享组织编码为空时，必输。若本次删除完成后，该组织的服务范围为空，则同时会删除该共享记录。 示例：2002799548625321990 |
| shareOrgCode | string | 否 | 否 | 共享组织编码。当共享组织主键为空时，必输。若本次删除完成后，该组织的服务范围为空，则同时会删除该共享记录。 示例：testCode |
| shareDeptId | string | 否 | 否 | 共享部门主键 示例：32146783265925 |
| shareDeptCode | string | 否 | 否 | 共享部门编码 示例：testDeptCode |
| serviceOrgList | object | 是 | 否 | 待删除服务组织列表。 |
| serviceOrgId | string | 否 | 否 | 待删除服务组织主键 示例：197301244719215412 |
| serviceOrgCode | string | 否 | 否 | 待删除服务组织编码 示例：testCode |

## 3. 请求示例

Url: /yonbip/digitalModel/funcshare/delete?access_token=访问令牌
Body: {
	"shareOrgId": "2002799548625321990",
	"shareOrgCode": "testCode",
	"shareDeptId": "32146783265925",
	"shareDeptCode": "testDeptCode",
	"serviceOrgList": [
		{
			"serviceOrgId": "197301244719215412",
			"serviceOrgCode": "testCode"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：删除成功 |
| traceId | string | 否 | traceId 示例：2b335cf60f5e2eb5 |
| uploadable | string | 否 | uploadable 示例：0 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "删除成功",
	"traceId": "2b335cf60f5e2eb5",
	"uploadable": "0",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000514

根据id未查询到任何数据,请输入正确的id


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-20

更新

请求说明

更新

请求参数 shareOrgId

更新

请求参数 shareOrgCode

2	2025-07-02

新增

返回参数 displayCode

新增

返回参数 level


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

