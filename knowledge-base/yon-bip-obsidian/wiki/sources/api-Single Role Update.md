---
title: "单个角色更新"
apiId: "888a9eb66079406bbe310c3a063eff57"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "BIP Role"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, BIP Role]
platform_version: "BIP"
source_type: community-api-docs
---

# 单个角色更新

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/open/funcpermission/updateRole

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| roleId | string | 否 | 是 | 角色id 示例：043b58e7-39bd-42ba-8f4e-214d863b7b4b |
| name | string | 否 | 是 | 角色名称 示例：dhcs1 |
| systemCode | string | 否 | 是 | 系统编码,BIP系统请传diwork 示例：diwork |
| roleCode | string | 否 | 是 | 角色编码 示例：dhcs |
| yxyTenantId | string | 否 | 否 | 营销云值Id 示例：1788738520420608 |
| orgId | string | 否 | 否 | 组织id（支持组织id和组织编码，同时填入时以id为准） 示例：666666 |
| orgCode | string | 否 | 否 | 组织编码（支持组织id和组织编码，同时填入时以id为准） 示例：01 |

## 3. 请求示例

Url: /yonbip/digitalModel/open/funcpermission/updateRole?access_token=访问令牌
Body: {
	"roleId": "043b58e7-39bd-42ba-8f4e-214d863b7b4b",
	"name": "dhcs1",
	"systemCode": "diwork",
	"roleCode": "dhcs",
	"yxyTenantId": "1788738520420608",
	"orgId": "666666",
	"orgCode": "01"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回状态码 示例：200 |
| data | object | 否 | 业务数据 |
| sysRole | string | 否 | 是否系统角色 示例：false |
| TENANTID | string | 否 | 租户Id参数 示例：tenantId |
| versionNum | string | 否 | 角色版本号 示例：2 |
| isactive | string | 否 | 是否有效 1 有效 0 无效 示例：1 |
| ORGNAME | string | 否 | 组织名称参数 示例：orgName |
| ROLENAME | string | 否 | 角色名称参数 示例：roleName |
| roleType | string | 否 | 角色类型 1-管理类，2-业务类，3-通用类 示例：2 |
| orgId | string | 否 | 组织Id 示例：2492018974185472 |
| roleCode | string | 否 | 角色编码 示例：liutest01 |
| LABEL | string | 否 | 角色标签参数 示例：label |
| hideRole | string | 否 | 是否隐藏 示例：false |
| VERSIONNUM | string | 否 | 角色版本号参数 示例：versionNum |
| SYSTEMCODE | string | 否 | 系统编码参数 示例：systemCode |
| createDate | string | 否 | 创建日期 示例：2022-06-08 20:11:29 |
| ORGID | string | 否 | 组织Id参数 示例：orgId |
| threeMemberType | string | 否 | 三员类型。0-非三员;1-管理员;2-保密员;3-审计员 示例：0 |
| roleId | string | 否 | 角色id 示例：ba8399c1-d46f-4614-bd4a-b95b177a7e3c |
| CREATEDATE | string | 否 | 创建日期 示例：createDate |
| yxyTenantId | string | 否 | 营销云租户Id 示例：2491026088726784 |
| ROLECODE | string | 否 | 角色编码参数 示例：roleCode |
| label | string | 否 | 标签 示例：common |
| ytenantId | string | 否 | 友互通租户Id 示例：0000KV7VR8GU3W81730000 |
| systemCode | string | 否 | 系统编码 示例：diwork |
| editMode | string | 否 | 0:只读；1：可编辑；2：权限可编辑 示例：1 |
| roleName | string | 否 | 角色名称 示例：liutest02-01 |
| name | string | 否 | 角色名称 示例：liutest02-01 |
| tenantId | string | 否 | 租户Id 示例：0000KV7VR8GU3W81730000 |
| ROLEID | string | 否 | 角色Id参数 示例：roleId |
| ts | string | 否 | 最近操作时间 示例：2022-06-08 20:11:30.0 |
| snowflakeId | string | 否 | 雪花ID 示例：2809696904089856 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"sysRole": "false",
		"TENANTID": "tenantId",
		"versionNum": "2",
		"isactive": "1",
		"ORGNAME": "orgName",
		"ROLENAME": "roleName",
		"roleType": "2",
		"orgId": "2492018974185472",
		"roleCode": "liutest01",
		"LABEL": "label",
		"hideRole": "false",
		"VERSIONNUM": "versionNum",
		"SYSTEMCODE": "systemCode",
		"createDate": "2022-06-08 20:11:29",
		"ORGID": "orgId",
		"threeMemberType": "0",
		"roleId": "ba8399c1-d46f-4614-bd4a-b95b177a7e3c",
		"CREATEDATE": "createDate",
		"yxyTenantId": "2491026088726784",
		"ROLECODE": "roleCode",
		"label": "common",
		"ytenantId": "0000KV7VR8GU3W81730000",
		"systemCode": "diwork",
		"editMode": "1",
		"roleName": "liutest02-01",
		"name": "liutest02-01",
		"tenantId": "0000KV7VR8GU3W81730000",
		"ROLEID": "roleId",
		"ts": "2022-06-08 20:11:30.0",
		"snowflakeId": "2809696904089856"
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-554-110211

参数异常


## 7. 错误返回码

999	角色不存在	参照提示检查请求数据


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

