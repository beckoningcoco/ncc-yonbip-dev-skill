---
title: "计划委托关系详情查询"
apiId: "dfe56edde2c846d6ac5a9a3da457707b"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Plan Delegation"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Plan Delegation]
platform_version: "BIP"
source_type: community-api-docs
---

# 计划委托关系详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Plan Delegation (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/planDelegate/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 主键    示例: 1297742410125568 |

## 3. 请求示例

Url: /yonbip/digitalModel/planDelegate/detail?access_token=访问令牌&id=1297742410125568

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 否 | 后端服务返回的数据部分 |
| creator | string | 否 | 创建人 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| creator_userName | string | 否 | 创建人名称 示例：YonSuite默认用户 |
| inventory_org_name | string | 否 | 库存组织名称 示例：tlw验随单参数 |
| planClass | string | 否 | 物料计划分类 示例：2166992254750976 |
| planOrg_name | string | 否 | 计划组织名称 示例：组织0329-1 |
| planClass_Code | string | 否 | 物料计划分类code 示例：计划分类1 |
| planClass_Name | string | 否 | 物流计划分类名称 示例：计划分类1 |
| planOrg | string | 否 | 计划组织 示例：2295283457397760 |
| enable | long | 否 | 启用状态 0-未启用；1-启用；2-停用 示例：0 |
| inventory_org | string | 否 | 库存组织 示例：2025381771088128 |
| id | string | 否 | 主键 示例：2353277539733760 |
| creationtime | string | 否 | 创建时间 示例：2021-07-21 09:57:42 |
| pubts | string | 否 | 时间戳 示例：2021-07-21 09:57:43 |
| displayCode | string | 否 | 业务异常码 示例：level |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"creator_userName": "YonSuite默认用户",
		"inventory_org_name": "tlw验随单参数",
		"planClass": "2166992254750976",
		"planOrg_name": "组织0329-1",
		"planClass_Code": "计划分类1",
		"planClass_Name": "计划分类1",
		"planOrg": "2295283457397760",
		"enable": 0,
		"inventory_org": "2025381771088128",
		"id": "2353277539733760",
		"creationtime": "2021-07-21 09:57:42",
		"pubts": "2021-07-21 09:57:43"
	},
	"displayCode": "level",
	"level": 0
}

## 6. 业务异常码

000-545-000514

根据id未查询到任何数据,请输入正确的id


## 7. 错误返回码

999	服务端逻辑异常


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

