---
title: "根据用户ID查询分配给此用户的角色"
apiId: "1811989639437746176"
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

# 根据用户ID查询分配给此用户的角色

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/tenantroleuser/findrolesbyuserid

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
| yhtUserId | string | 否 | 是 | 友户通用户ID 示例：59204f91-c606-49b8-9ffd-3a443ec72459 |

## 3. 请求示例

Url: /yonbip/digitalModel/tenantroleuser/findrolesbyuserid?access_token=访问令牌
Body: {
	"yhtUserId": "59204f91-c606-49b8-9ffd-3a443ec72459"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 成功：200 失败：999 示例：200 |
| data | object | 是 | 返回数据 |
| roleId | string | 否 | 角色ID 示例：010b6217-e457-412e- |
| roleCode | string | 否 | 角色编码 示例：test6666 |
| name | string | 否 | 角色名称 示例：test6666 |
| isactive | long | 否 | 是否激活 1-激活 2-非激活 示例：1 |
| createDate | string | 否 | 创建日期 示例：2023-06-30 10:17:48 |
| systemCode | string | 否 | 系统编码 示例：diwork |
| versionNum | long | 否 | 版本号 示例：4 |
| orgId | string | 否 | 组织ID 示例：666666 |
| sysRole | boolean | 否 | 系统角色 false：非系统角色 true：系统角色 示例：false |
| hideRole | boolean | 否 | 隐藏角色 false：非隐藏角色 true：隐藏角色 示例：false |
| roleName | string | 否 | 角色名称 示例：test6666 |
| snowflakeId | string | 否 | 雪花ID 示例：1760004308671135744 |
| roleType | long | 否 | 角色类型 1：管理类 2：业务类 3：通用类 示例：2 |
| threeMemberType | long | 否 | 三员标识 0：普通管理员 91：初始-系统管理员 92：初始-安全保密管理员 93：初始-安全审计员 94：系统管理员 95：安全保密管理员 96：安全审计员 示例：0 |
| message | string | 否 | 提示语 示例：success |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"roleId": "010b6217-e457-412e-",
			"roleCode": "test6666",
			"name": "test6666",
			"isactive": 1,
			"createDate": "2023-06-30 10:17:48",
			"systemCode": "diwork",
			"versionNum": 4,
			"orgId": "666666",
			"sysRole": false,
			"hideRole": false,
			"roleName": "test6666",
			"snowflakeId": "1760004308671135744",
			"roleType": 2,
			"threeMemberType": 0
		}
	],
	"message": "success",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-554-110010

上下文读取友户通租户Id失败！


## 7. 错误返回码

"999"	服务端逻辑异常	查看具体返回信息或咨询支持人员


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

