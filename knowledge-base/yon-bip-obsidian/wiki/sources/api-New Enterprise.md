---
title: "企业新增"
apiId: "1793566763776999432"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "E-signature Configuration"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, E-signature Configuration]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业新增

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/v1/company/common/create

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
| name | string | 否 | 是 | 企业名称 示例：测试技术有限公司 |
| registerNo | string | 否 | 是 | 统一社会信用代码 示例：91110108**3516 |
| uniqueId | string | 否 | 否 | 用于关联业务系统的唯一标识 示例：1111 |
| companyId | string | 否 | 否 | 企业ID 示例：1800000000000004770 |
| accountId | string | 否 | 否 | 操作者账号 示例：acc1111 |
| accountUniqueId | string | 否 | 否 | 业务系统关联的唯一用户ID 示例：au1111 |
| companyAuth | object | 否 | 是 | 应用授权信息 |
| sourceId | string | 否 | 是 | 外部企业ID 示例：9000111111 |
| sourceType | string | 否 | 是 | 外部类型（1 组织 2 客户 3 供应商 4 友户通企业 5 企业账号/租户 ） 示例：1 |
| publicMeteringId | string | 否 | 是 | 公有云计量租户ID 示例：11222222 |
| thirdId | string | 否 | 是 | 业务租户id 示例：222222 |
| applicationDefcode | string | 否 | 是 | 企业应用定义编码 示例：yb |
| envType | string | 否 | 是 | 是否公有云（0 公有云 1 私有云） 示例：0 |

## 3. 请求示例

Url: /yonbip/uspace/rest/v1/company/common/create?access_token=访问令牌
Body: {
	"name": "测试技术有限公司",
	"registerNo": "91110108**3516",
	"uniqueId": "1111",
	"companyId": "1800000000000004770",
	"accountId": "acc1111",
	"accountUniqueId": "au1111",
	"companyAuth": {
		"sourceId": "9000111111",
		"sourceType": "1",
		"publicMeteringId": "11222222",
		"thirdId": "222222",
		"applicationDefcode": "yb",
		"envType": "0"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据 示例：{"companyId":"2111111111","companyAppAuthId":"2111111111"} |
| companyId | string | 否 | 企业id 示例：2111111111 |
| companyAppAuthId | string | 否 | 授权id 示例：2111111111 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"companyId": "2111111111",
		"companyAppAuthId": "2111111111"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	后端系统异常信息	后端系统异常导致业务执行失败


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

