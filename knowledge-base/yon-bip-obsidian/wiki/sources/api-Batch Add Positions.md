---
title: "岗位批量新增"
apiId: "5273bb2dedbb4ec78a56637b0445a1a0"
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

# 岗位批量新增

> `ContentType	application/json` 请求方式	POST | 分类: Position (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/position/batchSave

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
| data | object | 是 | 否 | data |
| name | muti_lang | 否 | 是 | 名称 |
| _status | string | 否 | 是 | 操作标识，Insert新增 Update更新 |
| org_id | string | 否 | 是 | 所属组织主键 |
| code | string | 否 | 是 | 编码 |
| enable | int | 否 | 是 | 启用状态，0初始化 1启用 2停用 |
| os_base_post_id | string | 否 | 否 | 基准职位 |
| os_base_post_id_post_sequence_id | string | 否 | 否 | 职位序列 |
| dept_id | string | 否 | 是 | 所属部门主键 |
| jobgrade_id | string | 否 | 否 | 职级id |
| maxrank_id | string | 否 | 否 | 最高职等id |
| minrank_id | string | 否 | 否 | 最低职等id |
| job_id | string | 否 | 否 | 所属职务id |
| jobtype_id | string | 否 | 否 | 职务类别id |
| professional | string | 否 | 否 | 专业类别，基准职位有值时，以基准职位中专业类别为准 示例：432141324321 |
| reqedu | string | 否 | 否 | 最低学历要求，基准职位有值时，以基准职位中最低学历要求为准 示例：341412341234 |
| degree | string | 否 | 否 | 最低学位要求，基准职位有值时，以基准职位中最低学位要求为准 示例：234321432141 |
| reqtitle | string | 否 | 否 | 最低职称要求，基准职位有值时，以基准职位中最低职称要求为准 示例：324321341342 |
| reqexp | string | 否 | 否 | 工作经验要求，基准职位有值时，以基准职位中工作经验要求为准 示例：3-5年 |
| reqworkyear | string | 否 | 否 | 最低工作年限，基准职位有值时，以基准职位中最低工作年限为准 示例：3年 |
| age | string | 否 | 否 | 年龄要求，基准职位有值时，以基准职位中年龄要求为准 示例：30-40岁 |
| reqother | string | 否 | 否 | 其他要求，基准职位有值时，以基准职位中其他要求为准 示例：有责任心 |

## 3. 请求示例

Url: /yonbip/digitalModel/position/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"name": "",
			"_status": "",
			"org_id": "",
			"code": "",
			"enable": 0,
			"os_base_post_id": "",
			"os_base_post_id_post_sequence_id": "",
			"dept_id": "",
			"jobgrade_id": "",
			"maxrank_id": "",
			"minrank_id": "",
			"job_id": "",
			"jobtype_id": "",
			"professional": "432141324321",
			"reqedu": "341412341234",
			"degree": "234321432141",
			"reqtitle": "324321341342",
			"reqexp": "3-5年",
			"reqworkyear": "3年",
			"age": "30-40岁",
			"reqother": "有责任心"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-10

更新

请求说明

更新

请求参数 enable

删除

请求参数 zh_CN

删除

请求参数 en_US

删除

请求参数 zh_TW

商开、海外支持


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

