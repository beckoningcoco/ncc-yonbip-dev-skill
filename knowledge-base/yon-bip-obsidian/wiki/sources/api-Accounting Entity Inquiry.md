---
title: "会计主体查询"
apiId: "1676417570818752515"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounting Entity"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounting Entity]
platform_version: "BIP"
source_type: community-api-docs
---

# 会计主体查询

> `ContentType	application/json` 请求方式	POST | 分类: Accounting Entity (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/virtualaccbody/getAccBodyByConditions

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
| status | short | 否 | 否 | 会计主体状态，不传取全部：0，未启用；1，启用；2，停用 |
| pubts | DateTime | 否 | 否 | 时间戳，不传参取全部，有传参则取会计主体时间戳大于等于传参的数据 |
| isexternal | boolean | 否 | 否 | 是否是对外核算属性的会计主体，true：对外核算会计主体；false：非对外核算会计主体 |
| isinner | boolean | 否 | 否 | 是否是对内核算属性的会计主体，true：对内核算会计主体；false：非对内核算会计主体 |
| ids | string | 是 | 否 | 会计主体主键id集合，List类型集合 |
| parentIds | string | 是 | 否 | 上级会计主体id集合，List类型集合 |
| code | string | 否 | 否 | 会计主体编码，按编码模糊查询 |
| name | string | 否 | 否 | 会计主体名称，按名称模糊查询 |

## 3. 请求示例

Url: /yonbip/AMP/virtualaccbody/getAccBodyByConditions?access_token=访问令牌
Body: {
	"status": 0,
	"pubts": "",
	"isexternal": true,
	"isinner": true,
	"ids": [
		""
	],
	"parentIds": [
		""
	],
	"code": "",
	"name": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | Number | 否 | 状态码 示例：200 |
| message | string | 否 | 提示信息 示例：操作成功 |
| data | object | 是 | 返回数据结果 |
| id | string | 否 | 会计主体主键id 示例：1684453841062330375 |
| code | string | 否 | 会计主体编码 示例：testFullParam |
| name | string | 否 | 会计主体名称 示例：测试 |
| shortname | string | 否 | 会计主体简称 示例：全量设参 |
| description | string | 否 | 描述 示例：test |
| parent | string | 否 | 上级会计主体id 示例：1530661876902920193 |
| currency | string | 否 | 币种id |
| orgtype | string | 否 | 会计主体组织形态枚举值，1，产品；2，产品线；3，项目；4，区域；5，事业群；6，其他 示例：1 |
| orgform | string | 否 | 业务单元组织形态id |
| isexternal | boolean | 否 | 是否是对外核算属性会计主体，true，对外核算会计主体；false，非对外核算会计主体 示例：false |
| isinner | boolean | 否 | 是否是对内核算属性会计主体，true，对内核算会计主体；false，非对内核算会计主体 示例：true |
| accperiodscheme | long | 否 | 会计期间方案id |
| liableperson | string | 否 | 负责人id 示例：1563526193564614661 |
| branchleader | string | 否 | 分管领导id 示例：1563526193564614661 |
| locationid | string | 否 | 工作地点 示例：北京 |
| country | string | 否 | 国家id 示例：0040be98-735b-44c0-afe5-54d11a96037b |
| language | string | 否 | 语言id 示例：d3a95d36-0ce4-11ea-817e-7cd30abea0c0 |
| timezone | string | 否 | 时区id 示例：cc4ee641-7d33-4133-8857-30468220cde8 |
| status | short | 否 | 状态，0，未启用；1，启用；2，停用 示例：1 |
| source | short | 否 | 来源，1，组织单元；2，会计主体 示例：2 |
| enabledate | DateTime | 否 | 启用时间 示例：2023-03-20 15:16:44 |
| pubts | DateTime | 否 | 时间戳 示例：2023-03-20 15:16:44 |
| tenant | long | 否 | 租户id 示例：2910033146761808 |
| stopstatus | boolean | 否 | 停用状态，true，停用；false，未停用 示例：false |
| stoptime | DateTime | 否 | 停用时间 |
| exchangerate | string | 否 | 汇率类型id |
| is_virtualaccbody | boolean | 否 | 是否虚拟会计主体（是否是会计主体系节点创建的数据），true，是虚拟会计主体；false，非虚拟会计主体 示例：true |
| isorg | boolean | 否 | 是否组织数据（是否是业务单元节点创建的数据），true，是组织数据；false，非组织数据 示例：false |
| level | int | 否 | 层级 示例：3 |
| path | string | 否 | 上级id路径 示例：1530661361518379016|1530661876902920193|1684453841062330375| |
| orgpubts | DateTime | 否 | 组织数据时间戳 |
| ytenantId | string | 否 | 友互通租户id 示例：0000L6YTYEY5FUZPXE0000 |
| displayOrder | int | 否 | 排序码 示例：1000000000 |
| dr | short | 否 | 逻辑删除标识，1，已删除；0，未删除 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"id": "1684453841062330375",
			"code": "testFullParam",
			"name": "测试",
			"shortname": "全量设参",
			"description": "test",
			"parent": "1530661876902920193",
			"currency": "",
			"orgtype": "1",
			"orgform": "",
			"isexternal": false,
			"isinner": true,
			"accperiodscheme": 0,
			"liableperson": "1563526193564614661",
			"branchleader": "1563526193564614661",
			"locationid": "北京",
			"country": "0040be98-735b-44c0-afe5-54d11a96037b",
			"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
			"timezone": "cc4ee641-7d33-4133-8857-30468220cde8",
			"status": 1,
			"source": 2,
			"enabledate": "2023-03-20 15:16:44",
			"pubts": "2023-03-20 15:16:44",
			"tenant": 2910033146761808,
			"stopstatus": false,
			"stoptime": "",
			"exchangerate": "",
			"is_virtualaccbody": true,
			"isorg": false,
			"level": 3,
			"path": "1530661361518379016|1530661876902920193|1684453841062330375|",
			"orgpubts": "",
			"ytenantId": "0000L6YTYEY5FUZPXE0000",
			"displayOrder": 1000000000,
			"dr": 0
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	根据条件查询会计主体信息结果异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-26

更新

返回参数 (37)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

