---
title: "部门停用"
apiId: "861e63add5b341ecaf8ca9bcab4e9590"
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

# 部门停用

> `ContentType	application/json` 请求方式	POST | 分类: Department (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/admindept/stop

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	单条保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 部门数据 |
| id | string | 否 | 是 | 部门id 示例：1878342166270464 |

## 3. 请求示例

Url: /yonbip/digitalModel/admindept/stop?access_token=访问令牌
Body: {
	"data": {
		"id": "1878342166270464"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 内容 |
| _entityName | string | 否 | 实体名称 |
| _keyName | string | 否 | 主键名称 |
| orgtype | long | 否 | 是否部门 1非部门 2部门 示例：2 |
| parent_name | string | 否 | 上级名称 示例：cc1234 |
| code | string | 否 | 编码 示例：bb |
| sort | long | 否 | 排序 示例：999999 |
| effectivedate | string | 否 | 生效时间 示例：2021-07-21 08:00:00 |
| expirationdate | string | 否 | 失效时间 示例：9999-12-31 00:00:00 |
| dr | long | 否 | 删除标识 0未删 1已删除 示例：0 |
| orgid | string | 否 | 组织id 示例：2353900631789824 |
| parentorgid | string | 否 | 上级组织id 示例：2166975486939648 |
| name | string | 否 | 名称 示例：bb123 |
| parent_code | string | 否 | 上级编码 示例：cc1234 |
| id | string | 否 | 主键id 示例：2353900631789824 |
| isbizunit | long | 否 | 是否业务单元 0否 1是 示例：0 |
| parentorgid_name | string | 否 | 上级组织名称 示例：cc1234 |
| _status | string | 否 | 操作信息 |
| parent | string | 否 | 上级id 示例：2166975486939648 |
| enable | long | 否 | 状态 0未启用 1启用 2停用 示例：2 |
| sysid | string | 否 | 系统标识 示例：diwork |
| isEnd | boolean | 否 | 是否末级 true是 false否 示例：true |
| yhtTenant | string | 否 | 友互通租户 示例：0000KM326ZLK32VJ0L0000 |
| tenant | string | 否 | 租户标识 示例：0000KM326ZLK32VJ0L0000 |
| yhtTenantId | string | 否 | 友互通租户id 示例：0000KM326ZLK32VJ0L0000 |
| multiLangName | object | 否 | 多语 |
| pubts | string | 否 | 时间戳 示例：2021-07-28 11:15:03 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"_entityName": "",
		"_keyName": "",
		"orgtype": 2,
		"parent_name": "cc1234",
		"code": "bb",
		"sort": 999999,
		"effectivedate": "2021-07-21 08:00:00",
		"expirationdate": "9999-12-31 00:00:00",
		"dr": 0,
		"orgid": "2353900631789824",
		"parentorgid": "2166975486939648",
		"name": "bb123",
		"parent_code": "cc1234",
		"id": "2353900631789824",
		"isbizunit": 0,
		"parentorgid_name": "cc1234",
		"_status": "",
		"parent": "2166975486939648",
		"enable": 2,
		"sysid": "diwork",
		"isEnd": true,
		"yhtTenant": "0000KM326ZLK32VJ0L0000",
		"tenant": "0000KM326ZLK32VJ0L0000",
		"yhtTenantId": "0000KM326ZLK32VJ0L0000",
		"multiLangName": {
			"zh_TW": "",
			"en_US": "",
			"zh_CN": "bb123"
		},
		"pubts": "2021-07-28 11:15:03"
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000002

部门下还有未离职员工或有效岗位,不能停用


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

