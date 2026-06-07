---
title: "业务单元/部门批量查询V2"
apiId: "2004299093608759301"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务单元/部门批量查询V2

> `ContentType	application/json` 请求方式	POST | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/OrgUnitSync/orgUnitDataSyncByDTO

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| funcTypeCode | string | 否 | 是 | 职能类型 orgunit：组织单元; adminorg：人力资源组织;factoryorg：工厂组织;inventoryorg：库存组织;salesorg：销售组织;assetsorg：资产组织; energyorg：能源组织;researchdeveloporg：研发组织;purchaseorg：采购组织;financeorg：会计主体;safetyorg：安环组织; serviceorg：服务组织;qualityorg：质检组织;taxpayerorg：纳税主体;planorg：计划组织 示例：orgunit 默认值：orgunit |
| ids | string | 是 | 否 | 组织id 示例：["1767117607713374210","1767109765124587527"] |
| codes | string | 是 | 否 | 组织编码 示例：["code1","code2"] |
| objids | string | 是 | 否 | 外部系统主键 示例：["code1","code2"] |
| name | string | 否 | 否 | 名称 |
| dr | string | 否 | 否 | 删除标识 0-未删除；1-已删除 示例：0 |
| enable | string | 否 | 否 | 启用状态：0-未启用；1-启用；2-停用 |
| pubts | string | 否 | 否 | 时间戳，查询结果大于等于时间戳数据 示例：2020-08-29 03:39:14 |
| parentId | string | 否 | 否 | 上级组织ID |
| parentCode | string | 否 | 否 | 上级组织编码 |
| orgDept | string | 否 | 否 | 查询范围，org-业务单元（组织） dept-部门 不填写的情况下查询全部 |
| sourceType | string | 否 | 否 | 数据来源 source_type 1系统默认 2.isv党建 4.会计主体 8.企业绩效 示例：1 默认值：1 |
| externalOrg | string | 否 | 否 | 外部组织 0不是外部组织；1外部组织。默认0 示例：0 默认值：0 |
| pageSize | string | 否 | 否 | 每页行数 示例：10 默认值：10 |
| pageIndex | string | 否 | 否 | 当前页数 示例：1 默认值：1 |

## 3. 请求示例

Url: /yonbip/digitalModel/OrgUnitSync/orgUnitDataSyncByDTO?access_token=访问令牌
Body: {
	"funcTypeCode": "orgunit",
	"ids": [
		"1767117607713374210",
		"1767109765124587527"
	],
	"codes": [
		"code1",
		"code2"
	],
	"objids": [
		"code1",
		"code2"
	],
	"name": "",
	"dr": "0",
	"enable": "",
	"pubts": "2020-08-29 03:39:14",
	"parentId": "",
	"parentCode": "",
	"orgDept": "",
	"sourceType": "1",
	"externalOrg": "0",
	"pageSize": "10",
	"pageIndex": "1"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码，正确返回值为200 示例：200 |
| message | string | 否 | 提示信息，当code不为200时，出示错误信息，非必选项 示例：操作成功 |
| data | object | 否 | 后端服务返回的数据部分 |
| pageIndex | long | 否 | 当前页数 示例：0 |
| pageSize | long | 否 | 每页行数 示例：0 |
| recordCount | long | 否 | 总数 示例：0 |
| recordList | object | 是 | 数据集合 |
| pageCount | long | 否 | 页数 示例：100 |
| beginPageIndex | long | 否 | 开始页 示例：1 |
| endPageIndex | long | 否 | 结束页 示例：2 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"recordList": [
			{
				"code": "20220825004",
				"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"effectivedate": "2022-08-25 11:00:51",
				"dr": 0,
				"parentid": "1530182120477556736",
				"path": "1293220592521473|",
				"modifiedtime": "2023-03-07 14:09:55",
				"enable": 1,
				"id": "1530665561984860161",
				"isdefault": 0,
				"isbizunit": 1,
				"pubts": "2023-03-07 14:10:00",
				"orgtype": 2,
				"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"level": 3,
				"isEnd": 1,
				"orgid": "1530665561984860161",
				"companytype": "45ebda24614f424abe5dfb04e00f737f",
				"shortname": "004",
				"name": "004",
				"parentorgid": "1530182120477556736",
				"creationtime": "2022-08-25 10:02:05",
				"objid": "29322059252147",
				"externalorg": 0
			}
		],
		"pageCount": 100,
		"beginPageIndex": 1,
		"endPageIndex": 2
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-500004

functypecode 不是业务单元、行政组织时无需设置组织部门标识(orgdept)


## 7. 错误返回码

999	服务端逻辑异常	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

新增

请求参数 sourceType

新增

请求参数 externalOrg

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

