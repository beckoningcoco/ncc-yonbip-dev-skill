---
title: "用户移除组织权限"
apiId: "2079301480450883587"
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

# 用户移除组织权限

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/bipauth/open/orgpermission/deluserorgpermission

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
| yhtUserId | string | 否 | 是 | 友互通用户id 示例：ee939ce4-e3d9-4c6e-bffd-562c82a16aaf |
| userType | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 身份类型（身份类型与身份Id二选一必填）枚举列举：1:普通员工,2:客户管理员,3:客户业务员,4:商家管理员,5:商家业务员,6:外部参会人,7:供应商,11:开发者,30:其他外部人员 示例：1 默认值：1 |
| yxyUserId | string | 否 | 否 | 身份id（身份类型与身份id二选一必填） 示例：1622811912190820353 |
| resourceId | string | 是 | 否 | 组织资源Id（组织资源Id与组织资源编码二选一必填，二者同时存在，以Id为准） 示例：["2451586070583040"] |
| resourceCode | string | 是 | 否 | 组织资源编码（组织资源Id与组织资源编码二选一必填，二者同时存在，以Id为准） 示例：["zz01"] |
| roleId | string | 否 | 否 | 角色Id（角色Id与角色编码二选一必填，二者同时存在，以Id为准） 示例：b1a7d9d6-0a7b-4032-985d-365ddc5f1061 |
| roleCode | string | 否 | 否 | 角色编码（角色Id与角色编码二选一必填，二者同时存在，以Id为准） 示例：ARP01 |
| resourceType | string | 否 | 否 | 资源类型("orgdept", "组织部门","billPoint", "开票点") 其他根据现场具体情况 示例：orgdept 默认值：orgdept |
| resourceFunction | string | 否 | 否 | 资源功能类型 例：orgunit :业务单元 示例：orgunit |
| systemCode | string | 否 | 否 | 系统编码 示例：diwork |

## 3. 请求示例

Url: /yonbip/digitalModel/bipauth/open/orgpermission/deluserorgpermission?access_token=访问令牌
Body: {
	"yhtUserId": "ee939ce4-e3d9-4c6e-bffd-562c82a16aaf",
	"userType": 1,
	"yxyUserId": "1622811912190820353",
	"resourceId": [
		"2451586070583040"
	],
	"resourceCode": [
		"zz01"
	],
	"roleId": "b1a7d9d6-0a7b-4032-985d-365ddc5f1061",
	"roleCode": "ARP01",
	"resourceType": "orgdept",
	"resourceFunction": "orgunit",
	"systemCode": "diwork"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 返回信息 示例：授权成功 |
| code | string | 否 | 状态码 示例：200 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"message": "授权成功",
	"code": "200",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	参照message提示	参照提示信息修改请求数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

新增

返回参数 displayCode

新增

返回参数 level

修改返回值


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

