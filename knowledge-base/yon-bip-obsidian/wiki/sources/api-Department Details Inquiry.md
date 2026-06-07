---
title: "部门详情查询"
apiId: "b357528574fa41d982ed6c0d95850937"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Department"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Department]
platform_version: "BIP"
source_type: community-api-docs
---

# 部门详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Department (PF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/admindept/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID |

## 3. 请求示例

Url: /yonbip/digitalModel/admindept/detail?access_token=访问令牌&id=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| principal | string | 否 | 负责人id |
| parent | string | 否 | 所属上级id |
| parentorgid_name | string | 否 | 所属上级组织 |
| id | string | 否 | 部门ID |
| parent_name | string | 否 | 所属上级名称 |
| depttype | string | 否 | 部门类型id |
| branchleader | string | 否 | 分管领导id |
| sysid | string | 否 | 系统id |
| principal_name | string | 否 | 负责人名称 |
| orgid | string | 否 | 部门组织 |
| depttype_name | string | 否 | 部门性质名称 |
| name | muti_lang | 否 | 多语 |
| innercode | string | 否 | 内部编码 |
| dr | string | 否 | 删除标识 |
| sort | string | 否 | 排序 |
| parent_code | string | 否 | 所属上级 |
| code | string | 否 | 部门编码 |
| branchleader_name | string | 否 | 分管领导名称 |
| pageIndex | int | 否 | 当前页数 |
| pageSize | int | 否 | 每页行数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码（第一页） |
| endPageIndex | int | 否 | 结束页码（有多少页） |
| recordCount | int | 否 | 总数 |
| path | string | 否 | 父级路径 |
| effectivedate | string | 否 | 生效时间,格式为:yyyy-MM-dd HH:mm:ss |
| enable | int | 否 | 状态 0未启用 1.启用 2.停用 |
| is_biz_unit | int | 否 | 是否业务单元 0否 1.是 |
| orgtype | int | 否 | 组织部门 1组织 2.部门 |
| isEnd | string | 否 | 是否末级节点 0是 1.否 |
| bizorgid | string | 否 | 上级组织 |
| bizorgid_name | string | 否 | 上级组织名称 |
| parentorgid | string | 否 | 上级组织 |
| creationtime | string | 否 | 创建时间,格式为:yyyy-MM-dd HH:mm:ss |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"principal": "",
		"parent": "",
		"parentorgid_name": "",
		"id": "",
		"parent_name": "",
		"depttype": "",
		"branchleader": "",
		"sysid": "",
		"principal_name": "",
		"orgid": "",
		"depttype_name": "",
		"name": {
			"zh_CN": "中文",
			"en_US": "英文",
			"zh_TW": "繁体"
		},
		"innercode": "",
		"dr": "",
		"sort": "",
		"parent_code": "",
		"code": "",
		"branchleader_name": "",
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"path": "",
		"effectivedate": "",
		"enable": 0,
		"is_biz_unit": 0,
		"orgtype": 0,
		"isEnd": "",
		"bizorgid": "",
		"bizorgid_name": "",
		"parentorgid": "",
		"creationtime": "",
		"pubts": ""
	},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000516

权限接口服务异常，无法获取用户组织权限


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

更新

请求参数 id

新增

返回参数 displayCode

新增

返回参数 level

更新

返回参数 (38)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

