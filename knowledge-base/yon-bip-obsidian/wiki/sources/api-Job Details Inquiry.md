---
title: "职位详情查询"
apiId: "1493566141389340681"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Job"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Job]
platform_version: "BIP"
source_type: community-api-docs
---

# 职位详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Job (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/post/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 职位主键，职位主键与职位编码至少填写一项 |
| code | string | query | 否 | 职位编码，职位主键与职位编码至少填写一项 |

## 3. 请求示例

Url: /yonbip/digitalModel/post/detail?access_token=访问令牌&id=&code=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 响应消息 示例：操作成功 |
| data | object | 否 | 职位数据 |
| code | string | 否 | 职位编码 示例：001code |
| name | object | 否 | 职位名称 示例：{ "zh_CN": "名称", "en_US": "name", "zh_TW": "名稱" } |
| memo | object | 否 | 备注 示例：{ "zh_TW": "備註", "en_US": "memo", "zh_CN": "备注" } |
| org_id | string | 否 | 组织主键 示例：1928981698203904 |
| jobtype_id | string | 否 | 职务类别主键 示例：1924645536370944 |
| job_id | string | 否 | 职务主键 示例：80f830d1ae894748b7d0dc4e85808a0d |
| jobgrade_id | string | 否 | 职级主键 示例：3ddfb66239474cc1801b36f11b9bfac2 |
| maxrank_id | string | 否 | 最高职等主键 示例：0c970ce712814c42b4bca5f068cacf04 |
| minrank_id | string | 否 | 最低职等主键 示例：661c3cf92b284731aa4917be51016ff8 |
| enable | string | 否 | 启用状态，0初始化 1启用 2停用 示例：1 |
| id | string | 否 | 主键 示例：1964406291828992 |
| pubts | string | 否 | 更新时间 示例：2020-10-19 20:10:31 |
| sysid | string | 否 | 系统标识 示例：diwork |
| org_id_name | string | 否 | 组织名称 |
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
| defines | object | 否 | 自定义项对象按照传递的自定义项参数显示结果 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "001code",
		"name": {
			"zh_CN": "名称",
			"en_US": "name",
			"zh_TW": "名稱"
		},
		"memo": {
			"zh_TW": "備註",
			"en_US": "memo",
			"zh_CN": "备注"
		},
		"org_id": "1928981698203904",
		"jobtype_id": "1924645536370944",
		"job_id": "80f830d1ae894748b7d0dc4e85808a0d",
		"jobgrade_id": "3ddfb66239474cc1801b36f11b9bfac2",
		"maxrank_id": "0c970ce712814c42b4bca5f068cacf04",
		"minrank_id": "661c3cf92b284731aa4917be51016ff8",
		"enable": "1",
		"id": "1964406291828992",
		"pubts": "2020-10-19 20:10:31",
		"sysid": "diwork",
		"org_id_name": "",
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
		"defines": {
			"define1": "",
			"define2": "",
			"id": ""
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	查询失败	请联系开发处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2024-06-06

更新

返回参数 name

更新

返回参数 memo


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

