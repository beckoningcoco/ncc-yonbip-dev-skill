---
title: "部门保存"
apiId: "bafdbde5165c45ef8706f192ca2507e7"
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

# 部门保存

> `ContentType	application/json` 请求方式	POST | 分类: Department (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/admindept/save

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
| data | object | 否 | 是 | 部门[bd.adminOrg.DeptOrgVO] |
| parent | string | 否 | 否 | 所属上级id（组织或部门）,parent和parent_code都为空时，系统默认取上级组织id |
| parent_code | string | 否 | 否 | 所属上级编码（组织或部门） |
| sort | int | 否 | 否 | 排序号 |
| id | string | 否 | 否 | 主键ID，部门ID 新增时无需填写，修改时必填 |
| code | string | 否 | 否 | 部门编码 |
| name | muti_lang | 否 | 是 | 部门名称,支持多语 |
| parent_name | string | 否 | 否 | 所属上级名称 |
| depttype | string | 否 | 否 | 部门性质id |
| depttype_name | string | 否 | 否 | 部门性质名称 |
| principal | string | 否 | 否 | 负责人id |
| principal_name | string | 否 | 否 | 负责人名称 |
| branchleader | string | 否 | 否 | 分管领导id |
| branchleader_name | string | 否 | 否 | 分管领导名称 |
| objid | string | 否 | 否 | 外部系统主键 |
| parentorgid | string | 否 | 否 | 上级组织id，上级组织id和上级组织编码不能同时为空，id和编码同时存在，以id为准 |
| parentorgCode | string | 否 | 否 | 上级组织编码，上级组织id和上级组织编码不能同时为空，id和编码同时存在，以id为准 |
| parentorgid_name | string | 否 | 否 | 上级组织名称 |
| enable | int | 否 | 否 | 状态, 0:未启用、1:启用、2:停用、 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 |
| deptOrgExt | object | 否 | 否 | 部门人力信息集 |

## 3. 请求示例

Url: /yonbip/digitalModel/admindept/save?access_token=访问令牌
Body: {
	"data": {
		"parent": "",
		"parent_code": "",
		"sort": 0,
		"id": "",
		"code": "",
		"name": {
			"zh_TW": "繁体",
			"en_US": "英文",
			"zh_CN": "中文"
		},
		"parent_name": "",
		"depttype": "",
		"depttype_name": "",
		"principal": "",
		"principal_name": "",
		"branchleader": "",
		"branchleader_name": "",
		"objid": "",
		"parentorgid": "",
		"parentorgCode": "",
		"parentorgid_name": "",
		"enable": 0,
		"_status": "",
		"deptOrgExt": {
			"otherPrincipal": "",
			"deptLevel": "",
			"deptRank": "",
			"deptCategory": "",
			"hrbp": "",
			"establishmentDate": "",
			"approvalOrg": "",
			"approvalCode": "",
			"authorizedStrength": "",
			"id": ""
		}
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| parent | string | 否 | 上级id |
| parent_code | string | 否 | 上级编码 |
| level | int | 否 | 层级 |
| sort | int | 否 | 排序号 |
| isEnd | int | 否 | 是否末级 1是 0否 |
| orgid | int | 否 | 基本组织主键 |
| code | string | 否 | 部门编码 |
| name | muti_lang | 否 | 部门名称,支持多语 |
| parent_name | string | 否 | 所属上级名称 |
| depttype | string | 否 | 部门性质id |
| depttype_name | string | 否 | 部门性质名称 |
| principal | string | 否 | 负责人id |
| principal_name | string | 否 | 负责人名称 |
| branchleader | string | 否 | 分管领导id |
| branchleader_name | string | 否 | 分管领导名称 |
| id | string | 否 | 部门ID |
| objid | string | 否 | 外部系统主键 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| dr | string | 否 | 删除标识 0未删除 1已删除 |
| parentorgid | string | 否 | 上级组织id |
| parentorgCode | string | 否 | 上级组织编码 |
| parentorgid_name | string | 否 | 组织单元名称 |
| orgtype | string | 否 | 组织类型 1组织 2部门 |
| enable | int | 否 | 状态, 0:未启用、1:启用、2:停用、 |
| innercode | string | 否 | 内部码 |
| sysid | string | 否 | 应用主键 |
| effectivedate | string | 否 | 启用日期,格式为yyyy-MM-dd HHmmss |
| expirationdate | string | 否 | 失效日期,格式为yyyy-MM-dd HHmmss |
| is_biz_unit | string | 否 | 是否组织单元 1是 0否 |
| creator | string | 否 | 创建人 |
| creationtime | string | 否 | 创建时间 |
| isbizunit | int | 否 | 是否业务单元 0 否 1 是 默认否 |
| tenant | string | 否 | 租户 |
| yhtTenant | string | 否 | 友互通租户标识 |
| yhtTenantId | string | 否 | 友互通租户id |
| yTenantId | string | 否 | 租户标识 |
| multiLangName | string | 否 | 部门名称 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | string | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"parent": "",
		"parent_code": "",
		"level": 0,
		"sort": 0,
		"isEnd": 0,
		"orgid": 0,
		"code": "",
		"name": {
			"zh_TW": "繁体",
			"en_US": "英文",
			"zh_CN": "中文"
		},
		"parent_name": "",
		"depttype": "",
		"depttype_name": "",
		"principal": "",
		"principal_name": "",
		"branchleader": "",
		"branchleader_name": "",
		"id": "",
		"objid": "",
		"pubts": "",
		"dr": "",
		"parentorgid": "",
		"parentorgCode": "",
		"parentorgid_name": "",
		"orgtype": "",
		"enable": 0,
		"innercode": "",
		"sysid": "",
		"effectivedate": "",
		"expirationdate": "",
		"is_biz_unit": "",
		"creator": "",
		"creationtime": "",
		"isbizunit": 0,
		"tenant": "",
		"yhtTenant": "",
		"yhtTenantId": "",
		"yTenantId": "",
		"multiLangName": ""
	},
	"displayCode": "000-545-100001",
	"level": "0"
}

## 6. 业务异常码

000-545-000001

编码已存在

000-545-000003

上级非启用状态，请先启用上级

000-545-100001

所属组织不存在


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-04

新增

请求参数 (11)

增加信息集

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

