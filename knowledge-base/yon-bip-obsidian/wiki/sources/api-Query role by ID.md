---
title: "根据ID查角色"
apiId: "747618c6e19440fb9de040ac56a86ffa"
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

# 根据ID查角色

> `ContentType	application/json` 请求方式	POST | 分类: BIP Role (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/role/query

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
| roleId | string | 否 | 是 | 角色Id 示例：01d43c26-654c-44e9-97ac-fb1f50067525 |

## 3. 请求示例

Url: /yonbip/digitalModel/role/query?access_token=访问令牌
Body: {
	"roleId": "01d43c26-654c-44e9-97ac-fb1f50067525"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| data | object | 否 | 返回数据 |
| name | string | 否 | 名称 示例：协同领域－项目管理员 |
| label | string | 否 | 标签 示例：common |
| roleCode | string | 否 | 角色编码 示例：xt_role_PM |
| hideRole | boolean | 否 | 是否隐藏 示例：true :是 false：否 |
| orgId | string | 否 | 组织Id |
| roleName3 | string | 否 | 角色名称（繁体多语） 示例：協同領域－專案管理員 |
| createDate | string | 否 | 创建日期 示例：2020-03-04 10:46:24 |
| multilingualDesc2 | string | 否 | 角色描述（英文多语） |
| versionNum | long | 否 | 版本号 示例：0 |
| tenantId | string | 否 | 租户id 示例：vkne5dw7 |
| roleType | long | 否 | 角色类型：1-本企业，2-客户，3-商户，4-外部其他 示例：1 |
| ts | long | 否 | 更新时间 示例：1583289984000 |
| systemCode | string | 否 | 系统编码 示例：diwork |
| yxyTenantId | long | 否 | 营销云值id 示例：1638448506360064 |
| multilingualDesc | string | 否 | 角色描述 示例：协同领域－项目管理员 |
| multilingualDesc3 | string | 否 | 角色描述（繁体多语） |
| createTime | long | 否 | 创建时间 示例：1562621418000 |
| roleName | string | 否 | 角色名称 示例：协同领域－项目管理员 |
| sysRole | boolean | 否 | 是否系统角色 示例：true :是 false：否 |
| roleId | string | 否 | 角色Id 示例：00016fee-210f-4eb2-9552-5f9e2dde44a4 |
| roleName2 | string | 否 | 角色名称（英文多语） 示例：Collaboration Field - Project Manager |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"name": "协同领域－项目管理员",
		"label": "common",
		"roleCode": "xt_role_PM",
		"hideRole": "",
		"orgId": "",
		"roleName3": "協同領域－專案管理員",
		"createDate": "2020-03-04 10:46:24",
		"multilingualDesc2": "",
		"versionNum": 0,
		"tenantId": "vkne5dw7",
		"roleType": 1,
		"ts": 1583289984000,
		"systemCode": "diwork",
		"yxyTenantId": 1638448506360064,
		"multilingualDesc": "协同领域－项目管理员",
		"multilingualDesc3": "",
		"createTime": 1562621418000,
		"roleName": "协同领域－项目管理员",
		"sysRole": "",
		"roleId": "00016fee-210f-4eb2-9552-5f9e2dde44a4",
		"roleName2": "Collaboration Field - Project Manager"
	},
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

