---
title: "组织单职能基本信息通用查询"
apiId: "1508720967857733632"
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

# 组织单职能基本信息通用查询

> `ContentType	application/json` 请求方式	POST | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/querySingleOrgFuncInfo

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
| funcType | string | 否 | 是 | 职能类型，adminorg-人力职能；financeorg-会计主体；salesorg-销售组织；orgunit-业务单元;assetsorg-资产组织；factoryorg-工厂组织；inventoryorg-库存组织；logisticsorg-物流组织；maintainorg-维修组织；purchaseorg-采购组织；qualityorg-质检组织；sharingsorg-共享中心；taxpayerorg-纳税主体。 示例：adminorg |
| queryConditions | object | 否 | 否 | 查询条件集合 |
| ids | string | 是 | 否 | 主键，数量小于1000 示例：["id1","id2"] |
| codes | string | 是 | 否 | 编码，数量小于1000 示例：["id1","id2"] |
| names | string | 是 | 否 | 名称，数量小于1000 示例：["id1","id2"] |
| principals | string | 是 | 否 | 负责人，数量小于1000 示例：["id1","id2"] |
| branchLeaders | string | 是 | 否 | 分管领导，数量小于1000 示例：["id1","id2"] |
| enable | string | 是 | 否 | 启用状态 0-查询未启用；1-查询启用；2-查询停用 示例：["id1","id2"] |
| includeDefine | string | 否 | 否 | 是否包含自定义项，true-包含；false-不包含。默认不包含 示例：66666 默认值：false |
| orderBy | string | 否 | 否 | 排序，1-按照parentId排序；2-和参照排序一致；3-按照id排序 示例：02 |
| nameLike | string | 否 | 否 | 名称模糊查询 示例：02 |
| codeLike | string | 否 | 否 | 编码模糊查询 |
| addressLike | string | 否 | 否 | 地址模糊查询 示例：66666 |
| nameOrCodeLike | string | 否 | 否 | 兼容名称或者编码模糊查询 示例：02 |

## 3. 请求示例

Url: /yonbip/digitalModel/querySingleOrgFuncInfo?access_token=访问令牌
Body: {
	"funcType": "adminorg",
	"queryConditions": {
		"ids": [
			"id1",
			"id2"
		],
		"codes": [
			"id1",
			"id2"
		],
		"names": [
			"id1",
			"id2"
		],
		"principals": [
			"id1",
			"id2"
		],
		"branchLeaders": [
			"id1",
			"id2"
		],
		"enable": [
			"id1",
			"id2"
		],
		"includeDefine": "66666",
		"orderBy": "02",
		"nameLike": "02",
		"codeLike": "",
		"addressLike": "66666",
		"nameOrCodeLike": "02"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 是 | 后端服务返回的数据部分 |
| is_biz_unit | long | 否 | 是否是组织，1 是组织，0 不是组织 示例：1 |
| id | string | 否 | 主键 示例：1484122848166412295 |
| code | string | 否 | 编码 示例：zuzhifuzhi002 |
| name | string | 否 | 名称 示例：zuzhifuzhi002 |
| orgtype | long | 否 | 是否是部门，2 是部门，1 不是部门 示例：1 |
| enable | long | 否 | 启用状态 0-未启用；1-启用；2-停用 示例：1 |
| effectivedate | string | 否 | 生效日期 示例：2022-06-23 08:00:00 |
| expirationdate | string | 否 | 失效日期 示例：9999-12-31 00:00:00 |
| parentid | string | 否 | 父节点id |
| creator | string | 否 | 创建人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| creationtime | string | 否 | 创建时间 示例：2022-06-23 16:57:20 |
| modifier | string | 否 | 修改人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| modifiedtime | string | 否 | 修改时间 示例：2022-06-23 17:23:04 |
| companytype | string | 否 | 公司类型id 示例：45ebda24614f424abe5dfb04e00f737c |
| displayorder | long | 否 | 排序 示例：0 |
| exchangerate | string | 否 | 汇率类型id 示例：zeyheghg |
| principal | string | 否 | 负责人 示例：2251394751729920 |
| branchleader | string | 否 | 分管领导 示例：2251396079145216 |
| address | string | 否 | 地址 示例：address |
| define | object | 否 | 自定义项集合 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"is_biz_unit": 1,
			"id": "1484122848166412295",
			"code": "zuzhifuzhi002",
			"name": "zuzhifuzhi002",
			"orgtype": 1,
			"enable": 1,
			"effectivedate": "2022-06-23 08:00:00",
			"expirationdate": "9999-12-31 00:00:00",
			"parentid": "",
			"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"creationtime": "2022-06-23 16:57:20",
			"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"modifiedtime": "2022-06-23 17:23:04",
			"companytype": "45ebda24614f424abe5dfb04e00f737c",
			"displayorder": 0,
			"exchangerate": "zeyheghg",
			"principal": "2251394751729920",
			"branchleader": "2251396079145216",
			"address": "address",
			"define": {
				"define1": "11"
			}
		}
	],
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000512

查询数据为空


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

