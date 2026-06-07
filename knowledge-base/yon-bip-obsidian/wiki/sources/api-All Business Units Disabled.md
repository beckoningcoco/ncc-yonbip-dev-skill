---
title: "业务单元全部停用"
apiId: "97fe1ba30ac342898f4b4464421471c8"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务单元全部停用

> `ContentType	application/json` 请求方式	GET | 分类: Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/stopAll

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| funcType | string | query | 否 | 职能类型    示例: orgunit    默认值: orgunit |

## 3. 请求示例

Url: /yonbip/digitalModel/stopAll?access_token=访问令牌&funcType=orgunit

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| displayCode | string | 否 | 业务异常码 示例：000-545-100001 |
| level | number |
| 小数位数:0,最大长度:1 | 否 | 异常级别，0：错误，1：警告 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

000-545-000002

部门下还有未离职员工或有效岗位,不能停用


## 7. 错误返回码

999	服务端逻辑错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-02

更新

请求说明

新增

返回参数 displayCode

新增

返回参数 level

新增

错误码 999


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

