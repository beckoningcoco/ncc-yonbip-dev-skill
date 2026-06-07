---
title: "查询租户下角色列表"
apiId: "61be8ea14b6346fbb640dd8bb9d820d2"
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

# 查询租户下角色列表

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/role/getTenantRoles

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
| systemCode | string | 否 | 是 | 系统编码 示例：diwork |
| tenantId | string | 否 | 是 | 租户Id 示例：tte2tqx4 |

## 3. 请求示例

Url: /yonbip/digitalModel/role/getTenantRoles?access_token=访问令牌
Body: {
	"systemCode": "diwork",
	"tenantId": "tte2tqx4"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| data | object | 是 | 返回数据 |
| roleType | long | 否 | 角色类型：1-本企业，2-客户，3-商户，4-外部其他 示例：1 |
| orgId | string | 否 | 组织Id |
| createDate | string | 否 | 创建日期 示例：2020-10-09 20:26:48 |
| label | string | 否 | 标签 示例：common |
| roleName | string | 否 | 角色名称 示例：test013 |
| name | string | 否 | 名称 示例：test013 |
| ts | long | 否 | 最近操作时间 示例：1602246408000 |
| multilingualDesc3 | string | 否 | 角色描述（繁体多语） |
| groupId | string | 否 | 分组Id |
| multilingualDesc | string | 否 | 角色描述（简体） |
| roleCode | string | 否 | 角色编码 示例：test013 |
| hideRole | boolean | 否 | 是否隐藏 示例：true :是 false：否 |
| roleName2 | string | 否 | 角色名称（英文） |
| tenantId | string | 否 | 租住Id 示例：tte2tqx4 |
| yxyTenantId | long | 否 | 营销云租户Id 示例：1788738520420608 |
| systemCode | string | 否 | 系统编码 示例：diwork |
| versionNum | long | 否 | 版本号 示例：0 |
| multilingualDesc2 | string | 否 | 角色描述（英文多语） |
| roleName3 | string | 否 | 角色名称（繁体） |
| roleId | string | 否 | 角色Id 示例：eb9e97ea-65e9-467e-92f6-9935eaa93985 |
| sysRole | boolean | 否 | 是否系统角色 示例：true :是 false：否 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"roleType": 1,
			"orgId": "",
			"createDate": "2020-10-09 20:26:48",
			"label": "common",
			"roleName": "test013",
			"name": "test013",
			"ts": 1602246408000,
			"multilingualDesc3": "",
			"groupId": "",
			"multilingualDesc": "",
			"roleCode": "test013",
			"hideRole": "",
			"roleName2": "",
			"tenantId": "tte2tqx4",
			"yxyTenantId": 1788738520420608,
			"systemCode": "diwork",
			"versionNum": 0,
			"multilingualDesc2": "",
			"roleName3": "",
			"roleId": "eb9e97ea-65e9-467e-92f6-9935eaa93985",
			"sysRole": ""
		}
	],
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-554-110010

上下文读取友户通租户Id失败！


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

