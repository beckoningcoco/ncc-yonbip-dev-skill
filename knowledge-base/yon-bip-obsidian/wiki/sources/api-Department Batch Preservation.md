---
title: "部门批量保存"
apiId: "5e9f24018b3b477fbc2b8005e3f92309"
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

# 部门批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Department (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/admindept/batchSave

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
| data | object | 是 | 否 | data |
| code | string | 否 | 是 | 编码 示例：code001 |
| name | muti_lang | 否 | 是 | 名称 |
| parentorgid | string | 否 | 否 | 所属组织id，所属组织和所属上级不能同时为空，id和编码同时存在，以编码为准 |
| parentorgid_code | string | 否 | 否 | 所属组织编码，所属组织和所属上级不能同时为空，id和编码同时存在，以编码为准 示例：dept001 |
| parent | string | 否 | 否 | 所属上级id（组织或部门）,parent和parent_code都为空时，系统默认取所属组织id |
| parent_code | string | 否 | 否 | 所属上级编码（组织或部门）,parent和parent_code都为空时，系统默认取所属组织id |
| id | string | 否 | 否 | 主键，新增时不填，修改时填写 |
| branchleader | string | 否 | 否 | 部门分管领导主键，非必输项，与branchleader_code都填写时，以branchleader_code为准 |
| branchleader_code | string | 否 | 否 | 部门分管领导编码，非必输项，与branchleader都填写时，以branchleader_code为准 |
| _status | string | 否 | 是 | 操作标识，Insert新增 Update更新 示例：Insert |
| enable | int | 否 | 否 | 启用状态，0初始化 1启用,默认未启用。不支持更新操作，更新状态请使用停用启用功能 示例：1 |
| depttype | string | 否 | 否 | 部门性质主键，与depttype_code都填写时以depttype_code为准 |
| depttype_code | string | 否 | 否 | 部门性质编码，输入助记码，与depttype都填写时以depttype_code为准 |
| principal | string | 否 | 否 | 部门负责人主键，非必输项，与principal_code都填写时，以principal_code为准 |
| principal_code | string | 否 | 否 | 部门负责人编码，非必输项，与principal都填写时，以principal_code为准 |
| deptOrgExt | object | 否 | 否 | 部门人力信息集 |

## 3. 请求示例

Url: /yonbip/digitalModel/admindept/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "code001",
			"name": {
				"zh_TW": "繁体",
				"en_US": "英文",
				"zh_CN": "中文"
			},
			"parentorgid": "",
			"parentorgid_code": "dept001",
			"parent": "",
			"parent_code": "",
			"id": "",
			"branchleader": "",
			"branchleader_code": "",
			"_status": "Insert",
			"enable": 1,
			"depttype": "",
			"depttype_code": "",
			"principal": "",
			"principal_code": "",
			"deptOrgExt": {
				"otherPrincipal": "",
				"deptLevel": "",
				"deptRank": "",
				"deptCategory": "",
				"hrbp": "",
				"establishmentDate": "",
				"approvalOrg": "",
				"approvalCode": "",
				"authorizedStrength": "",
				"id": ""
			}
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 操作返回信息 示例：操作成功 |
| data | object | 否 | 返回数据集合 |
| count | long | 否 | 总数 示例：2 |
| sucessCount | long | 否 | 成功数量 示例：2 |
| failCount | long | 否 | 失败数量 示例：0 |
| messages | object | 是 | 返回信息详情 |
| infos | object | 是 | 数据集合 |
| failInfos | object | 是 | 错误信息 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 2,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"orgtype": 2,
				"principal": "1770567669056012295",
				"parentorgid_code": "45345",
				"principal_code": "00000001",
				"branchleader": "1770567669056012295",
				"branchleader_code": "00000001",
				"code": "code777",
				"enable": 1,
				"parentorgid": "1746778884591321088",
				"is_biz_unit": 0,
				"deptdefinefeature": {
					"tz01": "ww",
					"qwewq": "xxx",
					"id": "1770590217552527368",
					"pubts": "2023-07-14 16:37:11",
					"ytenant": "0000LHRGETVCAKTP1G0000"
				},
				"dr": 0,
				"id": "1770590217552527367",
				"parent": "1746778884591321088",
				"orgid": "1770590217552527367",
				"isEnd": true,
				"name": {
					"zh_TW": "xxx",
					"en_US": "xxx",
					"zh_CN": "xxx"
				},
				"sysid": "diwork",
				"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"creator_userName": "测试环境管理员111",
				"creationtime": "2023-07-14 16:37:10",
				"level": 2,
				"bizorgid": "1746778884591321088",
				"innercode": "SVO1SV6J",
				"sort": 999999,
				"yhtTenant": "0000LHRGETVCAKTP1G0000",
				"tenant": "0000LHRGETVCAKTP1G0000",
				"yhtTenantId": "0000LHRGETVCAKTP1G0000",
				"yTenantId": "0000LHRGETVCAKTP1G0000",
				"pubts": "2023-07-14 16:37:12",
				"isbizunit": 0,
				"multiLangName": "xxx"
			}
		],
		"failInfos": [
			{}
		]
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-100001

所属组织不存在

000-545-000003

上级非启用状态，请先启用上级

000-545-000001

编码已存在


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-04

新增

请求参数 (11)

增加信息集

2	2025-07-02

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

