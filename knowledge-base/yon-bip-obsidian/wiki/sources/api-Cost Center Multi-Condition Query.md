---
title: "成本中心多条件查询"
apiId: "1596936297590030343"
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

# 成本中心多条件查询

> `ContentType	application/json` 请求方式	POST | 分类: Cost Center (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/bd/v1/costcenter/getCostCenterInnerByCondition

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
| code | string | 否 | 否 | 成本中心编码 示例：1111 |
| accentity | string | 否 | 否 | 会计主体id 示例：1533635343018360838 |
| accentityCode | string | 否 | 否 | 会计主体编码 示例：121 |
| dept | string | 否 | 否 | 部门id 示例：1530794711754735624 |
| deptCode | string | 否 | 否 | 部门编码 示例：13 |
| orgCode | string | 否 | 否 | 业务单元编码 示例：123 |
| businessDate | string | 否 | 否 | 业务日期 示例：2022-10-11 |
| org | string | 否 | 否 | 业务单元id 示例：1533635343018360838 |
| pubts_start | string | 否 | 否 | 时间戳，开始时间 示例：2022-08-03 15:01:56 |
| pubts_end | string | 否 | 否 | 时间戳，结束时间 示例：2022-09-20 16:10:20 |

## 3. 请求示例

Url: /yonbip/AMP/bd/v1/costcenter/getCostCenterInnerByCondition?access_token=访问令牌
Body: [{
	"code": "1111",
	"accentity": "1533635343018360838",
	"accentityCode": "121",
	"dept": "1530794711754735624",
	"deptCode": "13",
	"orgCode": "123",
	"businessDate": "2022-10-11",
	"org": "1533635343018360838",
	"pubts_start": "2022-08-03 15:01:56",
	"pubts_end": "2022-09-20 16:10:20"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 请求状态 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 是 | 数据 |
| id | long | 否 | 成本中心ID 示例：2013821429326080 |
| code | string | 否 | 成本中心编码 示例：111 |
| name | string | 否 | 成本中心名称 示例：222 |
| parent | string | 否 | 父成本中心ID 示例：2013821429326080 |
| relatedAdminOrg | string | 否 | 关联行政组织 示例：1525795438452015104 |
| description | string | 否 | 描述 示例：成本中心123 |
| pubts | string | 否 | 时间戳 示例：2024-04-08 13:16:16 |
| ccClass | string | 否 | 成本中心类别 示例：1525643714430500900 |
| orgUnit | string | 否 | 所属业务单元 示例：1525795438452015104 |
| accentity | string | 否 | 会计主体id 示例：2005374455124224 |
| effect | boolean | 否 | 生效状态 示例：true |
| enableDate | string | 否 | 生效日期 示例：2022-10-11 |
| expireDate | string | 否 | 失效日期 示例：2999-10-11 |
| ts | long | 否 | 时间戳 示例：1669108686 |
| costCenterGroupIds | object | 是 | 组信息 示例：["1669108686"] |
| accentityCode | string | 否 | 会计主体编码 示例：123 |
| relations | object | 是 | 对照关系 |
| dis | object | 否 | 利润中心 |
| shareAccentity | string | 否 | 共享会计主体 示例：true |
| log | string | 否 | 引用校验失败日志 示例：1 删除失败 2 删除中 处于删除中 |
| logDr | string | 否 | 删除操作状态 示例：0表示删除失败， 1表示删除成功 |
| logDetail | string | 否 | 引用详情 示例：远程查询领域iuap-iom-idmbiz的实体iom.subcontractorder.OrderProcess数据失败 |
| accentities | object | 否 | 共享会计主体 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": 2013821429326080,
			"code": "111",
			"name": "222",
			"parent": "2013821429326080",
			"relatedAdminOrg": "1525795438452015104",
			"description": "成本中心123",
			"pubts": "2024-04-08 13:16:16",
			"ccClass": "1525643714430500900",
			"orgUnit": "1525795438452015104",
			"accentity": "2005374455124224",
			"effect": true,
			"enableDate": "2022-10-11",
			"expireDate": "2999-10-11",
			"ts": 1669108686,
			"costCenterGroupIds": [
				"1669108686"
			],
			"accentityCode": "123",
			"relations": [
				{
					"org": "1525795438452015104",
					"effect": true,
					"header": "1528677481759899600",
					"id": "1970130481114513400",
					"dept": "1793677659712520201",
					"pubts": "2024-04-08",
					"deptCode": "123",
					"orgCode": "123"
				}
			],
			"dis": {
				"enableDate": "2022-08-01",
				"header": "1528677481759899600",
				"profitCenter": "1581279114459349001",
				"id": "1581279269078171600",
				"pubts": "2024-04-08"
			},
			"shareAccentity": "true",
			"log": "1 删除失败  2 删除中  处于删除中",
			"logDr": "0表示删除失败， 1表示删除成功",
			"logDetail": "远程查询领域iuap-iom-idmbiz的实体iom.subcontractorder.OrderProcess数据失败",
			"accentities": {
				"header": "1534533102750138369",
				"id": "1962774187374674009",
				"accentity": "2001249864307965956",
				"accentity.code": "二级会计主体1",
				"accentity.name": "二级会计主体1",
				"org": "2001249864307965956 30 org.code string 否 否 所属业务单元编码 二级会计主体1 31 org.name string 否 否 所属业务单元名称 二级会计主体1",
				"org.code": "二级会计主体1",
				"org.name": "二级会计主体1"
			}
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	表示查询有报错	查看message信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-27

新增

请求参数 code

新增

返回参数 (10)

添加共享会计主体


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

