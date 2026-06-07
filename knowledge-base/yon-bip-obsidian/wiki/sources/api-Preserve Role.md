---
title: "保存角色"
apiId: "1e1c983c203b4eee934c07ed2547e506"
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

# 保存角色

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/role/save

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
| role | object | 否 | 是 | 角色 |
| roleName | string | 否 | 是 | 角色名称 示例：测试名称 |
| hideRole | boolean | 否 | 否 | 是否隐藏 示例：false |
| name | string | 否 | 是 | 角色名称 示例：测试名称 |
| label | string | 否 | 否 | 标签 示例：common |
| systemCode | string | 否 | 是 | 系统编码 示例：diwork |
| sysRole | boolean | 否 | 否 | 是否系统角色 示例：false |
| yxyTenantId | string | 否 | 否 | 营销云值Id 示例：1788738520420608 |
| roleType | int | 否 | 否 | 角色类型 示例：1 |
| versionNum | string | 否 | 否 | 版本号 示例：0 |
| roleCode | string | 否 | 是 | 角色编码 示例：test012 |
| tenantId | string | 否 | 是 | 租户Id 示例：tte2tqx4 |
| orgId | string | 否 | 否 | 组织id 示例：666666 |

## 3. 请求示例

Url: /yonbip/digitalModel/role/save?access_token=访问令牌
Body: {
	"role": {
		"roleName": "测试名称",
		"hideRole": false,
		"name": "测试名称",
		"label": "common",
		"systemCode": "diwork",
		"sysRole": false,
		"yxyTenantId": "1788738520420608",
		"roleType": 1,
		"versionNum": "0",
		"roleCode": "test012",
		"tenantId": "tte2tqx4",
		"orgId": "666666"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回状态码 示例：200 |
| data | object | 否 | 业务数据 |
| tenantId | string | 否 | 租户Id 示例：tte2tqx4 |
| sysRole | boolean | 否 | 是否系统角色 示例：false |
| roleId | string | 否 | 角色Id 示例：eb9e97ea-65e9-467e-92f6-9935eaa93985 |
| multilingualDesc2 | string | 否 | 角色描述（英文多语） |
| roleName3 | string | 否 | 角色名称（繁体多语） |
| roleName2 | string | 否 | 角色名称（英文） |
| multilingualDesc3 | string | 否 | 角色描述（繁体） |
| versionNum | long | 否 | 角色版本号 示例：0 |
| createDate | string | 否 | 创建日期 示例：2020-10-09 20:26:48 |
| hideRole | boolean | 否 | 是否隐藏 示例：false |
| roleType | long | 否 | 角色类型 1-管理类，2-业务类，3-通用类 示例：1 |
| ts | long | 否 | 最近操作时间 示例：1602246408376 |
| label | string | 否 | 标签 示例：common |
| roleCode | string | 否 | 角色编码 示例：test013 |
| roleName | string | 否 | 角色名称 示例：test013 |
| multilingualDesc | string | 否 | 角色描述 |
| orgId | string | 否 | 组织Id |
| systemCode | string | 否 | 系统编码 示例：diwork |
| yxyTenantId | long | 否 | 营销云租户Id 示例：1788738520420608 |
| name | string | 否 | 名称 示例：test013 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"tenantId": "tte2tqx4",
		"sysRole": false,
		"roleId": "eb9e97ea-65e9-467e-92f6-9935eaa93985",
		"multilingualDesc2": "",
		"roleName3": "",
		"roleName2": "",
		"multilingualDesc3": "",
		"versionNum": 0,
		"createDate": "2020-10-09 20:26:48",
		"hideRole": false,
		"roleType": 1,
		"ts": 1602246408376,
		"label": "common",
		"roleCode": "test013",
		"roleName": "test013",
		"multilingualDesc": "",
		"orgId": "",
		"systemCode": "diwork",
		"yxyTenantId": 1788738520420608,
		"name": "test013"
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-554-110017

存在停用角色，不允许绑定授权关系，角色编码为：


## 7. 错误返回码

999	服务端逻辑异常	查看具体返回信息或咨询支持人员


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

