---
title: "部门保存-导入"
apiId: "0fdf4c14124046eab69531a4e63afa1c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Department"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Department]
platform_version: "BIP"
source_type: community-api-docs
---

# 部门保存-导入

> `ContentType	application/json` 请求方式	POST | 分类: Department (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/admindept/saveDto

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
| data | object | 否 | 否 | data |
| DeptOrgVO | object | 是 | 否 | DeptOrgVO |
| billnum | string | 否 | 否 | billnum 示例：bd_admindepttree |

## 3. 请求示例

Url: /yonbip/digitalModel/admindept/saveDto?access_token=访问令牌
Body: {
	"data": {
		"DeptOrgVO": [
			{
				"parent_name": "0828",
				"bizorgid_name": "0828",
				"code": "bumen01",
				"depttype_name": "1",
				"__rowNum": 6,
				"__orginSheetName": "DeptOrgVO(部门2)",
				"name": "bumen01",
				"name2": "",
				"name3": "",
				"principal_name": "",
				"branchleader_name": "",
				"objid": "objid"
			}
		]
	},
	"billnum": "bd_admindepttree"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | code 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | data |
| successCountAI | long | 否 | 成功数 示例：0 |
| failCountAI | long | 否 | 失败数 示例：0 |
| count | long | 否 | 总数 示例：2 |
| sucessCount | long | 否 | 成功数量 示例：2 |
| failCount | long | 否 | 失败数量 示例：0 |
| messages | string | 是 | 提示信息 |
| infos | string | 是 | infos |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"successCountAI": 0,
		"failCountAI": 0,
		"count": 2,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			""
		]
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-200004

没有需要导入的数据，本次导入结束

000-545-200005

开启部门编码可重复后，暂不支持部门档案导入


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

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

