---
title: "业务伙伴详情查询-特征"
apiId: "1843161378190262273"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Partner"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Partner]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务伙伴详情查询-特征

> `ContentType	application/json` 请求方式	POST | 分类: Business Partner (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/businesspartner/querybusinesspartner

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
| id | long | 否 | 否 | 业务伙伴id； 示例：1731971993608650753 |
| code | string | 否 | 否 | 业务伙伴编码； 示例：业务伙伴 |
| name | string | 否 | 否 | 业务伙伴名称; 示例：业务伙伴名称 |
| pageSize | long | 否 | 是 | 分页大小；默认为500，最大为5000； 示例：20 默认值：500 |
| pageIndex | long | 否 | 是 | 分页页码；默认为1； 示例：1 默认值：1 |

## 3. 请求示例

Url: /yonbip/digitalModel/businesspartner/querybusinesspartner?access_token=访问令牌
Body: {
	"id": 1731971993608650753,
	"code": "业务伙伴",
	"name": "业务伙伴名称",
	"pageSize": 20,
	"pageIndex": 1
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 调用失败时的错误信息； 示例：处理成功 |
| code | string | 否 | 返回码，调用成功时返回200； 示例：200 |
| data | object | 否 | 调用成功时的返回数据； |
| recordList | object | 是 | 调用成功时的返回数据； |

## 5. 正确返回示例

{
	"message": "处理成功",
	"code": "200",
	"data": {
		"recordList": [
			{
				"code": "lctest0407",
				"nameMultilingual": {
					"simplifiedName": "业务伙伴",
					"englishName": "partner",
					"traditionalName": "業務伙伴"
				},
				"shortName": {
					"simplifiedName": "业务伙伴",
					"englishName": "partner",
					"traditionalName": "業務伙伴"
				},
				"searchcode": "lcCS0407",
				"partnerType": 0,
				"superiorBusinessPartnerId": "1823415394860269577",
				"superiorBusinessPartnerCode": "lc测试0406",
				"country": "1001Z01000000005J1WB",
				"countryCode": "AF",
				"timeZone": "008e7ba7-7829-401c-9f5a-3b1014e3a4d8",
				"newTimeZone": "Africa/Abidjan",
				"language": "d3a95d36-0ce4-11ea",
				"status": 1,
				"licenseType": 0,
				"creditCode": "lctest0407",
				"legalPerson": "lctest0407",
				"legalPersonIdNo": "230108456515551215",
				"money": "5",
				"currency": "1525696886140829722",
				"buildDate": "2022-04-08",
				"operatingTermTo": "2022-04-08",
				"regionId": "bfad109f-5cf3-11e9-817e-7cd30abea0c0",
				"regAddress": "黑龙江省哈尔滨市香坊区旭升南街23号",
				"contactName": "张三",
				"contactTel": "13526541598",
				"fax": "15626",
				"email": "2051685455@qq.com",
				"postalCode": "150040",
				"website": "www.baidu.com",
				"scope": {
					"simplifiedName": "经营范围",
					"englishName": "BusinessScope",
					"traditionalName": "經營範圍"
				},
				"mobile": "13112341891",
				"internalOrgId": "666666",
				"partnerRoleClasses": {
					"id": "1841064119709466632",
					"partnerId": "1841064119709466631",
					"check": true
				},
				"partnerMerchantComparisons": {
					"id": "1842667886346240009",
					"partnerId": "1841064119709466631",
					"isDefault": true,
					"merchantId": 1841071738981449730
				},
				"partnerVendorComparisons": {
					"id": "1842667886346240009",
					"partnerId": "1841064119709466631",
					"isDefault": true,
					"vendorId": "1840382877848043523"
				},
				"partnerCapitalComparisons": {
					"id": "1842667886346240010",
					"partnerId": "1841064119709466631",
					"isDefault": true,
					"capitalId": "1841064119709466632"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

0	系统错误


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-16

更新

请求说明

删除

返回参数 roleClassName


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

