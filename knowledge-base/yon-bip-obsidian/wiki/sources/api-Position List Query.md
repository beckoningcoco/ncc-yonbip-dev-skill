---
title: "岗位列表查询"
apiId: "4995cdcfc1904eeca76e1629c3a6cffe"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Position"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Position]
platform_version: "BIP"
source_type: community-api-docs
---

# 岗位列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Position (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/position/list

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
| name,code | string | 否 | 否 | 名称或编码 |
| org_id | string | 否 | 否 | 组织主键 |
| pubts | string | 否 | 否 | 时间戳 |
| pageIndex | long | 否 | 是 | 页码 |
| pageSize | long | 否 | 是 | 每页大小 |
| freeze | string | 是 | 否 | 是否冻结 0未冻结 1冻结 |

## 3. 请求示例

Url: /yonbip/digitalModel/position/list?access_token=访问令牌
Body: {
	"name,code": "",
	"org_id": "",
	"pubts": "",
	"pageIndex": 0,
	"pageSize": 0,
	"freeze": [
		""
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | int | 否 | 状态码 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | data |
| pageIndex | int | 否 | 页码 |
| pageSize | int | 否 | 每页大小 |
| recordCount | int | 否 | 列表数量 |
| recordList | object | 是 | 列表数据 |
| pageCount | int | 否 | 页码总数 |
| beginPageIndex | int | 否 | 开始页码 |
| endPageIndex | int | 否 | 结束页码 |

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
				"code": "",
				"name": {},
				"org_id": "",
				"org_id_code": "",
				"org_id_name": "",
				"dept_id": "",
				"dept_id_code": "",
				"dept_id_name": "",
				"jobtype_id": "",
				"jobtype_id_code": "",
				"jobtype_id_name": "",
				"job_id": "",
				"job_id_code": "",
				"job_id_name": "",
				"parentid": "",
				"parentid_name": "",
				"jobgrade_id": "",
				"jobgrade_id_code": "",
				"jobgrade_id_name": "",
				"maxrank_id": "",
				"maxrank_id_code": "",
				"maxrank_id_name": "",
				"minrank_id": "",
				"minrank_id_code": "",
				"minrank_id_name": "",
				"duties": "",
				"os_base_post_id_job_title": "",
				"os_base_post_id_job_title_name": "",
				"os_base_post_id_degree": "",
				"os_base_post_id_degree_name": "",
				"os_base_post_id_education": "",
				"os_base_post_id_education_name": "",
				"os_base_post_id_work_experience": "",
				"os_base_post_id_name": "",
				"os_base_post_id": "",
				"os_base_post_id_other": "",
				"os_base_post_id_major_id_name": "",
				"os_base_post_id_major_id": "",
				"os_base_post_id_workyear": "",
				"os_base_post_id_post_sequence_id": "",
				"os_base_post_id_post_sequence_id_name": "",
				"os_base_post_id_age": "",
				"defines": "",
				"memo": "",
				"enable": 0,
				"id": "",
				"pubts": "",
				"sysid": "",
				"positionStaff": ""
			}
		],
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

