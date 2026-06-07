---
title: "特征选配列表查询"
apiId: "1743723685479972865"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Characteristic selection sheet"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Characteristic selection sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 特征选配列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Characteristic selection sheet (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/cts/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| pageIndex | int | 否 | 否 | 当前页，默认当前页为1 示例：1 默认值：1 |
| pageSize | int | 否 | 否 | 每页数目，默认每页10条数据 示例：10 默认值：10 |
| createDate | string | 否 | 是 | 选配日期（区间，格式2021-03-02|2099-03-02） 示例：2023-05-15|2099-05-15 默认值：2023-05-15|2099-05-15 |
| sourceSrcDocId | long | 否 | 否 | 来源单据行id 示例：6266254694386302986 |
| sourceCode | string | 否 | 否 | 来源单据号 示例：UO-561820230527000007 |
| sourceLineNo | string | 否 | 否 | 来源单据行号 示例：10 |
| orgId | long | 否 | 否 | 库存组织id，库存组织id和库存组织编码都有时，以库存组织id为准 示例：1680015336056815618 |
| orgCode | string | 否 | 否 | 库存组织编码，库存组织id和库存组织编码都有时，以库存组织id为准 示例：xzm |
| productId | long | 否 | 否 | 物料id，物料id和编码都有时，以物料id为准 示例：1728935898338295812 |
| productCode | string | 否 | 否 | 物料编码，物料id和编码都有时，以物料id为准 示例：001068 |
| startTime | string | 否 | 否 | 时间戳起始时间。要求：起始时间<结束时间。格式：yyyy-MM-dd HH:mm:ss 示例：2023-05-15 14:42:27 |
| endTime | string | 否 | 否 | 时间戳结束时间。要求：起始时间<结束时间。格式：yyyy-MM-dd HH:mm:ss 示例：2099-05-15 14:42:27 |

## 3. 请求示例

Url: /yonbip/digitalModel/cts/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"createDate": "2023-05-15|2099-05-15",
	"sourceSrcDocId": 6266254694386302986,
	"sourceCode": "UO-561820230527000007",
	"sourceLineNo": "10",
	"orgId": 1680015336056815618,
	"orgCode": "xzm",
	"productId": 1728935898338295812,
	"productCode": "001068",
	"startTime": "2023-05-15 14:42:27",
	"endTime": "2099-05-15 14:42:27"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 接口返回信息 示例：操作成功 |
| data | object | 否 | 接口返回数据 |
| pageIndex | int | 否 | 当前页码 示例：1 |
| pageSize | int | 否 | 每页条数 示例：10 |
| recordCount | long | 否 | 总条数 示例：100 |
| pageCount | int | 否 | 总页数 示例：10 |
| beginPageIndex | int | 否 | 分页查询起始数 示例：1 |
| endPageIndex | int | 否 | 分页查询结束数 示例：1 |
| recordList | object | 是 | 数据集合 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 100,
		"pageCount": 10,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordList": [
			{
				"id": 1743679344232366085,
				"productId": 1738467246807187465,
				"productCode": "001212",
				"productName": "0601-选配1",
				"orgId": 1680015336056815618,
				"orgCode": "xzm",
				"orgName": "xzm组织",
				"srcOrgId": 1680015336056815618,
				"srcOrgCode": "xzm",
				"srcOrgName": "xzm组织",
				"sourceSrcDocType": 2,
				"sourceSrcDocId": 1743679464489877510,
				"sourceCode": "UO-561820230608000001",
				"sourceLineNo": "10",
				"reserveidName": "UO-561820230608000001_10",
				"orderBomFlag": 0,
				"derivedMaterialFlag": 0,
				"creator": "写中美",
				"createTime": "2023-06-08 10:23:13",
				"createDate": "2023-06-08 00:00:00",
				"pubts": "2023-06-08 10:23:13",
				"vcBomDetail": [
					{
						"id": 1743679344232366086,
						"vcConfigId": 1738468861716987906,
						"vcConfigCode": "VC202306150001",
						"isDerived": false,
						"superBomId": "1738468861716987906",
						"superBomVersion": "1.0",
						"productId": 1738467246807187465,
						"productCode": "001212",
						"productName": "0601-选配1",
						"pubts": "2023-06-08 10:23:13"
					}
				]
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-28

更新

返回参数 sourceSrcDocType


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

