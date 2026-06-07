---
title: "成本中心查询"
apiId: "1554444691485229058"
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

# 成本中心查询

> `ContentType	application/json` 请求方式	POST | 分类: Cost Center (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/bd/v1/costcenter/queryCostCenterBatch

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
| code | string | 否 | 是 | 成本中心编码 示例：1001 |

## 3. 请求示例

Url: /yonbip/AMP/bd/v1/costcenter/queryCostCenterBatch?access_token=访问令牌
Body: [{
	"code": "1001"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 编码 示例：200 |
| success | boolean | 否 | 成功标识 示例：true |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据 |
| id | string | 否 | 成本中心id 示例：5654 |
| code | string | 否 | 成本中心编码 示例：1111 |
| name | string | 否 | 成本中心名称 示例：成本中心111 |
| relations | object | 否 | 对照关系 |
| shareAccentity | boolean | 否 | 共享给其他会计主体 示例：true |
| dis | object | 否 | 利润中心 |
| parent | string | 否 | 上级成本中心id 示例：11899889 |
| parent.code | string | 否 | 上级成本中心编码 示例：11 |
| parent.name | string | 否 | 上级成本中心名称 示例：公司 |
| relatedAdminOrg | string | 否 | 行政组织id 示例：489789789 |
| relatedAdminOrg.code | string | 否 | 行政组织编码 示例：5500 |
| relatedAdminOrg.name | string | 否 | 行政组织名称 示例：组织 |
| orgUnit | string | 否 | 所属业务单元id 示例：41 |
| orgUnit.code | string | 否 | 所属业务单元编码 示例：66 |
| orgUnit.name | string | 否 | 所属业务单元名称 示例：业务单元 |
| accentity | string | 否 | 会计主体id 示例：988498 |
| accentity.code | string | 否 | 会计主体编码 示例：666 |
| accentity.name | string | 否 | 会计主体名称 示例：主体 |
| manager.name | string | 否 | 负责人名称 示例：里 |
| enableDate | date |
| 格式:yyyy-MM-dd | 否 | 生效日期 示例：2022-08-05 |
| expireDate | date |
| 格式:yyyy-MM-dd | 否 | 失效日期 示例：9999-12-31 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 时间戳 示例：2024-02-20T08:39:34.000+00:00 |
| ccClass | string | 否 | 成本中心类别id 示例：4488 |
| ccClass.code | string | 否 | 成本中心类别编码 示例：666 |
| ccClass.name | string | 否 | 成本中心类别名称 示例：类别 |
| description | string | 否 | 备注 示例：备注 |
| effect | boolean | 否 | 生效 示例：true |
| logDr | string | 否 | 操作状态 示例：删除中 |
| accentities | object | 否 | 共享会计主体 |

## 5. 正确返回示例

{
	"code": 200,
	"success": true,
	"message": "操作成功",
	"data": {
		"id": "5654",
		"code": "1111",
		"name": "成本中心111",
		"relations": {
			"header": "1534533102750138369",
			"id": "1534533102750138370",
			"dept": "1546397623584292872",
			"deptName": "车间1",
			"deptCode": "hx010101",
			"org": "1546380830262165510",
			"orgCode": "HX01",
			"orgName": "HX01",
			"workCenter": "1549218729893036039",
			"workCenterCode": "Hx0101",
			"workCenterName": "WC01"
		},
		"shareAccentity": true,
		"dis": {
			"header": "1534533102750138369",
			"id": "1806277418737467400",
			"accPurpose": "1525643714430500872",
			"accPurpose.code": "02",
			"accPurpose.name": "利润中心核算目的",
			"enableDate": "2023-08-31",
			"profitCenter": "1586549116653010949",
			"profitCenter.code": "3423",
			"profitCenter.name": "小明有限公司总部"
		},
		"parent": "11899889",
		"parent.code": "11",
		"parent.name": "公司",
		"relatedAdminOrg": "489789789",
		"relatedAdminOrg.code": "5500",
		"relatedAdminOrg.name": "组织",
		"orgUnit": "41",
		"orgUnit.code": "66",
		"orgUnit.name": "业务单元",
		"accentity": "988498",
		"accentity.code": "666",
		"accentity.name": "主体",
		"manager.name": "里",
		"enableDate": "2022-08-05",
		"expireDate": "9999-12-31",
		"pubts": "2024-02-20T08:39:34.000+00:00",
		"ccClass": "4488",
		"ccClass.code": "666",
		"ccClass.name": "类别",
		"description": "备注",
		"effect": true,
		"logDr": "删除中",
		"accentities": {
			"header": "1534533102750138369",
			"id": "1962774187374674009",
			"accentity": "2001249864307965956",
			"accentity.code": "二级会计主体1",
			"accentity.name": "二级会计主体1",
			"org": "2001249864307965956\t 30 org.code\tstring\t否\t否\t所属业务单元编码\t二级会计主体1\t 31 org.name\tstring\t否\t否\t所属业务单元名称\t二级会计主体1",
			"org.code": "二级会计主体1",
			"org.name": "二级会计主体1"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

code=0，success=false	表示查询有报错	查看message信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-27

新增

返回参数 (57)

删除

返回参数 (11)

添加共享会计主体


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

