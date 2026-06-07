---
title: "员工类别详情查询"
apiId: "694b0cfb22434322bdf3258735803311"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Employee Category"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 员工类别详情查询

> `ContentType` 请求方式	GET | 分类: Employee Category (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/psnlcatg/detail

请求方式	GET

ContentType

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID |

## 3. 请求示例

Url: /yonbip/digitalModel/psnlcatg/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| code | string | 否 | 员工类别编码 |
| name | muti_lang | 否 | 员工类别名称,支持多语 |
| parent | string | 否 | 上级类别id |
| id | string | 否 | 员工类别主键 |
| parent_name | string | 否 | 上级类别名称 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| level | int | 否 | 层级 |
| sysid | string | 否 | 应用标识 |
| path | string | 否 | 路径 |
| sort | int | 否 | 排序号 |
| enable | int | 否 | 状态, 1:启用、2:停用 |
| isEnd | int | 否 | 是否末级 1:是 0:否 |
| memo | string | 否 | 备注 |
| creator_userName | string | 否 | 创建人 |
| creationtime | string | 否 | 创建时间,格式为:yyyy-MM-dd HH:mm:ss |
| modifier_userName | string | 否 | 修改人 |
| modifiedtime | string | 否 | 修改时间,格式为:yyyy-MM-dd HH:mm:ss |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"code": "",
		"name": "",
		"parent": "",
		"id": "",
		"parent_name": "",
		"pubts": "",
		"level": 0,
		"sysid": "",
		"path": "",
		"sort": 0,
		"enable": 0,
		"isEnd": 0,
		"memo": "",
		"creator_userName": "",
		"creationtime": "",
		"modifier_userName": "",
		"modifiedtime": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-13

更新

请求说明

更新

返回参数 enable

删除

返回参数 zh_CN

删除

返回参数 en_US

删除

返回参数 zh_TW


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

