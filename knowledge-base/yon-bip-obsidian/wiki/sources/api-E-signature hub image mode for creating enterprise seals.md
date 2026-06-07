---
title: "电子签hub图片模式制作企业印章"
apiId: "2275285846009577478"
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

# 电子签hub图片模式制作企业印章

> `ContentType	application/json` 请求方式	POST | 分类: E-signature Configuration (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/id/seal/image/company/v1/create

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
| companyId | string | 否 | 否 | 电子签企业ID,companyId和uniqueId两者必有一个值非空，如果两个字段都有值，则以companyId为准，用于标记企业印章所属企业 示例：5276f241debdfca6a62874e5d07e6497 |
| uniqueId | string | 否 | 否 | 业务系统方绑定的唯一企业标识 示例：123123 |
| sealImageData | string | 否 | 是 | 印章图片的base64 示例：data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAABIAAAAKICAIAAACHSRZ |
| sealName | string | 否 | 是 | 企业印章名称 示例：印章名称 |
| sealNo | string | 否 | 否 | 业务系统方关联的唯一印章编号 示例：123123 |
| sealType | string | 否 | 是 | 印章类型：1.公章，2. 合同专用章，3.财务章，4：法人章，5:发票专用章 示例：1 |
| sealHandle | object | 是 | 否 | 印章授权电子签用户信息 |
| accountId | string | 否 | 否 | 电子签用户accountId, 和uniqueId有一非空，都有值时以accountId为准 示例：7f0f2514d673ce30fdf6c4627139b260 |
| uniqueId | string | 否 | 否 | 电子签用户业务系统方关联的唯一用户标识 示例：123123 |
| isDefault | string | 否 | 否 | 是否为此账号下默认印章，默认值false，企业静默签署时使用签署人账号下设置的默认印章 示例：false |
| operatorAccountId | string | 否 | 否 | 印章创建操作用户accountId 示例：6610b3d2beca32ccbef587734a9d9ab9 |

## 3. 请求示例

Url: /yonbip/id/seal/image/company/v1/create?access_token=访问令牌
Body: {
	"companyId": "5276f241debdfca6a62874e5d07e6497",
	"uniqueId": "123123",
	"sealImageData": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAABIAAAAKICAIAAACHSRZ",
	"sealName": "印章名称",
	"sealNo": "123123",
	"sealType": "1",
	"sealHandle": [
		{
			"accountId": "7f0f2514d673ce30fdf6c4627139b260",
			"uniqueId": "123123",
			"isDefault": "false"
		}
	],
	"operatorAccountId": "6610b3d2beca32ccbef587734a9d9ab9"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 响应码 示例：200 |
| message | string | 否 | 响应信息 示例：success |
| data | object | 否 | 响应数据 |
| sealId | string | 否 | 印章ID 示例：56488bd80489ee084e419d8e91b63341 |
| sealName | string | 否 | 印章名称 示例：印章名称 |
| sealNo | string | 否 | 业务系统方绑定的印章唯一标识 示例：123123 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "success",
	"data": {
		"sealId": "56488bd80489ee084e419d8e91b63341",
		"sealName": "印章名称",
		"sealNo": "123123"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-15

更新

请求说明

新增

请求参数 operatorAccountId


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

