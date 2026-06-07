---
title: "岗位详情查询"
apiId: "4e2591bc89b4402d89f2a17052445738"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Position"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Position]
platform_version: "BIP"
source_type: community-api-docs
---

# 岗位详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Position (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/position/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 职位主键 |

## 3. 请求示例

Url: /yonbip/digitalModel/position/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 返回状态 示例：操作成功 |
| data | object | 否 | data |
| code | string | 否 | 编码 示例：001code |
| name | object | 否 | 名称 |
| memo | object | 否 | 备注 |
| org_id | string | 否 | 组织主键 示例：1928981698203904 |
| org_id_code | string | 否 | 组织编码 示例：0001code |
| dept_id | string | 否 | 部门主键 示例：1928983988146432 |
| dept_id_code | string | 否 | 部门编码 示例：0001code |
| jobtype_id | string | 否 | 职务类别主键 示例：1924645536370944 |
| jobtype_id_code | string | 否 | 职务类别编码 示例：0001code |
| job_id | string | 否 | 职务主键 示例：80f830d1ae894748b7d0dc4e85808a0d |
| job_id_code | string | 否 | 职务编码 示例：001code |
| jobgrade_id | string | 否 | 职级主键 示例：3ddfb66239474cc1801b36f11b9bfac2 |
| jobgrade_id_code | string | 否 | 职级编码 示例：001code |
| maxrank_id | string | 否 | 最高职等主键 示例：0c970ce712814c42b4bca5f068cacf04 |
| maxrank_id_code | string | 否 | 最高职等编码 示例：001code |
| minrank_id | string | 否 | 最低职等主键 示例：661c3cf92b284731aa4917be51016ff8 |
| minrank_id_code | string | 否 | 最低职等编码 示例：001code |
| enable | string | 否 | 启用状态，0初始化 1启用 2停用 示例：1 |
| id | string | 否 | 主键 示例：1964406291828992 |
| pubts | string | 否 | 时间戳 示例：2020-10-19 20:10:31 |
| sysid | string | 否 | 系统标识 示例：diwork |
| org_id_name | string | 否 | 组织名称 |
| dept_id_name | string | 否 | 部门名称 |
| jobtype_id_name | string | 否 | 职务类别名称 |
| job_id_name | string | 否 | 职务名称 |
| jobgrade_id_name | string | 否 | 职级名称 |
| maxrank_id_name | string | 否 | 最高职等名称 |
| minrank_id_name | string | 否 | 最低职等名称 |
| duties | string | 否 | 基准职位工作职责 |
| os_base_post_id_job_title | string | 否 | 最低职称要求主键 |
| os_base_post_id_degree_name | string | 否 | 最低学位要求 |
| os_base_post_id_work_experience | string | 否 | 工作经验要求 |
| os_base_post_id_education | string | 否 | 最低学历要求主键 |
| os_base_post_id | string | 否 | 基准职位名称主键 |
| os_base_post_id_other | string | 否 | 其他要求 |
| os_base_post_id_name | string | 否 | 基准职位名称 |
| os_base_post_id_major_id_name | string | 否 | 专业类别要求 |
| os_base_post_id_workyear | string | 否 | 最低工作年限 |
| os_base_post_id_major_id | string | 否 | 专业类别要求主键 |
| os_base_post_id_degree | string | 否 | 最低学位要求 |
| os_base_post_id_education_name | string | 否 | 最低学历要求 |
| os_base_post_id_post_sequence_id | string | 否 | 职位序列名称主键 |
| os_base_post_id_age | string | 否 | 年龄要求 |
| os_base_post_id_post_sequence_id_name | string | 否 | 职位序列名称 |
| os_base_post_id_job_title_name | string | 否 | 最低职称要求 |
| define | string | 否 | 自定义项 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"code": "001code",
		"name": {
			"en_US": "英文",
			"zh_TW": "繁体",
			"zh_CN": "中文"
		},
		"memo": {},
		"org_id": "1928981698203904",
		"org_id_code": "0001code",
		"dept_id": "1928983988146432",
		"dept_id_code": "0001code",
		"jobtype_id": "1924645536370944",
		"jobtype_id_code": "0001code",
		"job_id": "80f830d1ae894748b7d0dc4e85808a0d",
		"job_id_code": "001code",
		"jobgrade_id": "3ddfb66239474cc1801b36f11b9bfac2",
		"jobgrade_id_code": "001code",
		"maxrank_id": "0c970ce712814c42b4bca5f068cacf04",
		"maxrank_id_code": "001code",
		"minrank_id": "661c3cf92b284731aa4917be51016ff8",
		"minrank_id_code": "001code",
		"enable": "1",
		"id": "1964406291828992",
		"pubts": "2020-10-19 20:10:31",
		"sysid": "diwork",
		"org_id_name": "",
		"dept_id_name": "",
		"jobtype_id_name": "",
		"job_id_name": "",
		"jobgrade_id_name": "",
		"maxrank_id_name": "",
		"minrank_id_name": "",
		"duties": "",
		"os_base_post_id_job_title": "",
		"os_base_post_id_degree_name": "",
		"os_base_post_id_work_experience": "",
		"os_base_post_id_education": "",
		"os_base_post_id": "",
		"os_base_post_id_other": "",
		"os_base_post_id_name": "",
		"os_base_post_id_major_id_name": "",
		"os_base_post_id_workyear": "",
		"os_base_post_id_major_id": "",
		"os_base_post_id_degree": "",
		"os_base_post_id_education_name": "",
		"os_base_post_id_post_sequence_id": "",
		"os_base_post_id_age": "",
		"os_base_post_id_post_sequence_id_name": "",
		"os_base_post_id_job_title_name": "",
		"define": ""
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

