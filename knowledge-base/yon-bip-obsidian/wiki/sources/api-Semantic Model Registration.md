---
title: "语义模型注册"
apiId: "2288600605397090306"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Semantic Model Registration"
domain: "CPRK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Semantic Model Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 语义模型注册

> `ContentType	application/json` 请求方式	POST | 分类: Semantic Model Registration (CPRK)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/semantic/register

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| semanticName | string | 否 | 是 | 语义模型名字 示例：语义模型名称 |
| semanticCode | string | 否 | 是 | 语义模型编码 示例：semantic_code |
| semanticDomain | string | 否 | 是 | 语义模型所属领域 示例：共享服务 |
| semanticAlias | string | 否 | 否 | 语义模型别名 示例：语义模型别名 |

## 3. 请求示例

Url: /yonbip/ssc/semantic/register?access_token=访问令牌
Body: {
	"semanticName": "语义模型名称",
	"semanticCode": "semantic_code",
	"semanticDomain": "共享服务",
	"semanticAlias": "语义模型别名"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 接口返回编码 示例：200 |
| message | string | 否 | 接口返回消息 示例：请求成功！ |

## 5. 正确返回示例

{
	"code": "200",
	"message": "请求成功！"
}

## 6. 业务异常码

036-503-010223

系统异常，请稍后重试

036-503-010497

参数设置{0}为必填项,详细参数信息不能为空值

036-503-010521

语义模型目录查询失败

036-503-010522

语义模型注册表保存失败

036-503-010568

请求参数不能为空！

036-503-010569

语义模型重复注册！

036-503-010577

仅支持注册关联逻辑数据源的语义模型

036-503-010578

语义模型SQL中的表名前缺失schema


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-01

更新

请求说明

删除

请求参数 dataSourceId

删除

请求参数 semanticId

删除

错误码 036-501-000000

删除

错误码 036-503-010497

删除

错误码 036-503-010437

添加异常码


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

