---
title: "获取部门路径"
apiId: "1950746340402659331"
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

# 获取部门路径

> `ContentType	application/json` 请求方式	POST | 分类: Department (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/admindept/getDeptPath

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
| ids | string | 是 | 否 | 部门主键集合（一次查询数量限制在300下） |
| includeCurrentNode | boolean | 否 | 否 | 是否包含当前节点 true是 false否 默认值：false |
| fromRoot | boolean | 否 | 否 | 是否从根开始 --true 从根开始 ，false 从所属组织开始 默认值：false |
| level | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 路径的级次-- 全路径-1 ，>=1时是所属路径的级次 |

## 3. 请求示例

Url: /yonbip/digitalModel/admindept/getDeptPath?access_token=访问令牌
Body: {
	"ids": [
		""
	],
	"includeCurrentNode": true,
	"fromRoot": true,
	"level": 0
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {},
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000521

字段不在查询范围内

000-545-000522

需要查询的主键为空,请确认传入的ids

000-545-000523

最多支持300个主键


## 7. 错误返回码

999	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

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

