---
title: "成本中心新增/编辑"
apiId: "2001956850392104969"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Center"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 成本中心新增/编辑

> `ContentType	application/json` 请求方式	POST | 分类: Cost Center (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/bd/v1/costcenter/save

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
| id | string | 否 | 否 | 成本中心主键(新增不传该值， 编辑时传成本中心id) 示例：1819690017583792130 |
| code | string | 否 | 是 | 成本中心编码 示例：1001 |
| name | string | 否 | 是 | 成本中心名称：中文 示例：行政部门成本 |
| name2 | string | 否 | 否 | 成本中心名称：英文 |
| name3 | string | 否 | 否 | 成本中心名称：繁体 |
| name4 | string | 否 | 否 | 成本中心名称预留 |
| name5 | string | 否 | 否 | 成本中心名称预留 |
| name6 | string | 否 | 否 | 成本中心名称预留 |
| relatedAdminOrg | string | 否 | 否 | 行政组织id |
| parent | string | 否 | 否 | 上级成本中心id |
| ccClass | string | 否 | 是 | 成本中心类别id 示例：1514492098242936839 |
| manager | string | 否 | 否 | 负责人id |
| enableDate | string | 否 | 是 | 生效日期 示例：2024-05-08 |
| expireDate | string | 否 | 是 | 失效日期 示例：9999-12-31 |
| effect | boolean | 否 | 是 | 是否生效 0失效 1生效 示例：true |
| shareAccentity | boolean | 否 | 是 | 共享给其他会计主体 示例：true |
| description | string | 否 | 否 | 备注：中文 |
| description2 | string | 否 | 否 | 备注：英文 |
| description3 | string | 否 | 否 | 备注：繁体 |
| description4 | string | 否 | 否 | 备注预留多语 |
| description5 | string | 否 | 否 | 备注预留多语 |
| description6 | string | 否 | 否 | 备注预留多语 |
| accentity | string | 否 | 是 | 会计主体id 示例：1819691117583792130 |
| orgUnit | string | 否 | 是 | 所属业务单元id 示例：1819692227583792130 |
| relations | object | 是 | 否 | 对照关系 |
| org | string | 否 | 否 | 业务单元id，设置”部门“时，需传入对应业务单元 |
| dept | string | 否 | 是 | 部门id， 设置”部门“时，需传入对应业务单元 |
| workCenter | string | 否 | 否 | 工作中心id |
| isDefault | boolean | 否 | 否 | 默认部门 0非默认部门 1 默认部门 示例：true |
| id | string | 否 | 否 | 对照关系id（新增不传该值，编辑时传值） |
| _status | string | 否 | 否 | 对照关系操作类（共有三种类型：Insert、Update、Delete）型，分别代表 新增、编辑、删除, Insert时，对照关系id非必填。 Update、Delete时，对照关系id必填。 示例：Insert |
| dis | object | 是 | 否 | 利润中心 |
| accPurpose | string | 否 | 否 | 核算目的id |
| enableDate | string | 否 | 是 | 生效日期，设置”生效日期“必填时，核算目的、利润中心也需要填写 示例：2024-05-08 |
| profitCenter | string | 否 | 否 | 利润中心id |
| id | string | 否 | 否 | 成本中心的利润中心id |
| _status | string | 否 | 否 | 利润中心操作类（共有三种类型：Insert、Update、Delete）型，分别代表 新增、编辑、删除, Insert时，利润中心id非必填。 Update、Delete时，利润中心id必填。 示例：Insert |
| accentities | object | 是 | 否 | 共享会计主体 |
| id | string | 否 | 否 | 成本中心共享会计主体id |
| accentity | string | 否 | 否 | 会计主体id |
| org | string | 否 | 否 | 所属业务单元id |
| _status | string | 否 | 否 | 共享会计主体操作类（共有三种类型：Insert、Update、Delete）型，分别代表 新增、编辑、删除, Insert时，共享会计主体id非必填。 Update、Delete时，共享会计主体id必填。 |
| character | object | 否 | 否 | 特征 |
| test_01 | string | 否 | 否 | 文本特征，输入文本 示例：test11221 |
| HB | string | 否 | 否 | 参照类型特征，输入主键 示例：1991609389393903617 |

## 3. 请求示例

Url: /yonbip/AMP/bd/v1/costcenter/save?access_token=访问令牌
Body: {
	"id": "1819690017583792130",
	"code": "1001",
	"name": "行政部门成本",
	"name2": "",
	"name3": "",
	"name4": "",
	"name5": "",
	"name6": "",
	"relatedAdminOrg": "",
	"parent": "",
	"ccClass": "1514492098242936839",
	"manager": "",
	"enableDate": "2024-05-08",
	"expireDate": "9999-12-31",
	"effect": true,
	"shareAccentity": true,
	"description": "",
	"description2": "",
	"description3": "",
	"description4": "",
	"description5": "",
	"description6": "",
	"accentity": "1819691117583792130",
	"orgUnit": "1819692227583792130",
	"relations": [
		{
			"org": "",
			"dept": "",
			"workCenter": "",
			"isDefault": true,
			"id": "",
			"_status": "Insert"
		}
	],
	"dis": [
		{
			"accPurpose": "",
			"enableDate": "2024-05-08",
			"profitCenter": "",
			"id": "",
			"_status": "Insert"
		}
	],
	"accentities": [
		{
			"id": "",
			"accentity": "",
			"org": "",
			"_status": ""
		}
	],
	"character": {
		"test_01": "test11221",
		"HB": "1991609389393903617"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 成本中心主键 示例：1961181221138989070 |
| code | string | 否 | 成本中心编码 示例：BM01 |
| name | object | 否 | 成本中心名称 |
| ccClass | string | 否 | 成本中心类别主键 示例：1514492098242936839 |
| parent | string | 否 | 成本中父级id 示例：1961181212549054466 |
| enableDate | string | 否 | 生效日期 示例：2024-03-27 00:00:00 |
| expireDate | string | 否 | 失效日期 示例：9999-12-31 00:00:00 |
| effect | boolean | 否 | 是否生效 示例：true |
| shareAccentity | boolean | 否 | 共享给其他会计主体 示例：true |
| description | object | 否 | 描述 |
| relatedAdminOrg | string | 否 | 关联行政组织 示例：1519739646333419527 |
| accentity | string | 否 | 会计主体主键 示例：1514558842038386692 |
| orgUnit | string | 否 | 所属业务单元主键 示例：1514558842038386692 |
| relations | object | 是 | 对照关系 |
| accentities | object | 是 | 共享会计主体 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "1961181221138989070",
		"code": "BM01",
		"name": {
			"zh_CN": "财务部"
		},
		"ccClass": "1514492098242936839",
		"parent": "1961181212549054466",
		"enableDate": "2024-03-27 00:00:00",
		"expireDate": "9999-12-31 00:00:00",
		"effect": true,
		"shareAccentity": true,
		"description": {},
		"relatedAdminOrg": "1519739646333419527",
		"accentity": "1514558842038386692",
		"orgUnit": "1514558842038386692",
		"relations": [
			{
				"isDefault": false,
				"org": "1514558842038386692",
				"effect": true,
				"header": "1961181221138989070",
				"dept": "1519739646333419527",
				"id": "1961181221138989071"
			}
		],
		"accentities": [
			{
				"id": "",
				"header": "1961181221138989070",
				"accentity": "",
				"org": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

code=0，success=false	表示新增报错	查看message信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-23

更新

请求说明

新增

请求参数 character

新增

请求参数 test_01

新增

请求参数 HB

更新

请求参数 (28)

2	2025-06-27

新增

请求参数 (6)

删除

请求参数 isDefault

新增

返回参数 (6)

删除

返回参数 isDefault

添加共享会计主体


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

