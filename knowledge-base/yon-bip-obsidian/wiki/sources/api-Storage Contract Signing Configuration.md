---
title: "存储合同签署配置"
apiId: "1857230239366643721"
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

# 存储合同签署配置

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/uspace/rest/contract/config/upsert

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
| contractProcessId | string | 否 | 是 | 业务方签署配置ID，由此判断是否存在来处理新增和更新 示例：185666611111667521 |
| processCode | string | 否 | 是 | 签署配置编码 示例：code001 |
| processName | string | 否 | 是 | 签署配置名称 示例：名称001 |
| status | int | 否 | 是 | 启停状态 1 启用 0 停用 示例：1 |
| orderFlag | int | 否 | 是 | 是否默认 1 是 0 否 示例：1 |
| orderFlag | int | 否 | 是 | 是否顺序签 1 是 0 否 示例：1 |
| processExplain | string | 否 | 否 | 签署配置说明 示例：采购合同签署配置 |
| businessObjectCode | string | 否 | 是 | 业务对象编码 示例：clmContract |
| mainstayId | string | 否 | 否 | 签署主体ID 示例：18566666666667521 |
| orgId | string | 否 | 否 | 所属组织ID 示例：18562222222667521 |
| companyAuthId | string | 否 | 否 | 企业应用授权ID 示例：185633333367521 |
| tenantId | string | 否 | 否 | 租户ID 示例：qy222222 |
| signers | object | 是 | 是 | 签署方配置列表 |
| mainstayType | int | 否 | 是 | 签署方类型 0 企业 1 个人 示例：1 |
| signOrder | int | 否 | 是 | 签署顺序 示例：1 |
| mainstayId | string | 否 | 否 | 签署主体ID 示例：18566666666667521 |
| orgId | string | 否 | 否 | 所属组织ID 示例：18562222222667521 |
| sourceId | string | 否 | 否 | 来源数据ID 示例：18562211122667521 |
| sourceType | int | 否 | 否 | 签署方类型 1 组织 2 客户 3 供应商 4 友户通企业 示例：1 |
| tenantId | string | 否 | 否 | 租户ID 示例：qy222222 |
| companyId | string | 否 | 否 | 业务方自身企业ID 示例：18566444444667521 |
| providerCompanyId | string | 否 | 否 | 服务商企业ID 示例：185665555556667521 |
| companyAuthId | string | 否 | 否 | 企业应用授权ID 示例：185633333367521 |
| mainstayName | string | 否 | 否 | 签署企业名称 示例：测试公司 |
| transactorId | string | 否 | 是 | 签署用户ID 示例：1856388883367521 |
| providerUserId | string | 否 | 否 | 服务商用户ID 示例：18563822222367521 |
| transactorName | string | 否 | 是 | 签署用户名称 示例：张三 |

## 3. 请求示例

Url: /yonbip/uspace/rest/contract/config/upsert?access_token=访问令牌
Body: {
	"contractProcessId": "185666611111667521",
	"processCode": "code001",
	"processName": "名称001",
	"status": 1,
	"orderFlag": 1,
	"processExplain": "采购合同签署配置",
	"businessObjectCode": "clmContract",
	"mainstayId": "18566666666667521",
	"orgId": "18562222222667521",
	"companyAuthId": "185633333367521",
	"tenantId": "qy222222",
	"signers": [
		{
			"mainstayType": 1,
			"signOrder": 1,
			"mainstayId": "18566666666667521",
			"orgId": "18562222222667521",
			"sourceId": "18562211122667521",
			"sourceType": 1,
			"tenantId": "qy222222",
			"companyId": "18566444444667521",
			"providerCompanyId": "185665555556667521",
			"companyAuthId": "185633333367521",
			"mainstayName": "测试公司",
			"transactorId": "1856388883367521",
			"providerUserId": "18563822222367521",
			"transactorName": "张三"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	接口调用错误	接口调用错误


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

