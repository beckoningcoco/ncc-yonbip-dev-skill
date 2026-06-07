---
title: "客户列表查询V1"
apiId: "2495629006986543107"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户列表查询V1

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/PFC/merchant/v1/list

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| beginTime | DateTime | 否 | 否 | 开始时间； 示例：2023-05-27 15:00:00 |
| endTime | DateTime | 否 | 否 | 结束时间； 示例：2023-05-27 15:29:34 |
| stopstatus | boolean | 否 | 否 | 停用状态, true 是已停用,false 是已启用. 不传入查询全部 示例：false |
| pageSize | number |
| 小数位数:1,最大长度:4 | 否 | 是 | 分页大小；默认为10，最大为1000； 示例：20 默认值：10 |
| pageIndex | number |
| 小数位数:1,最大长度:10 | 否 | 是 | 分页页码；默认为1； 示例：1 默认值：1 |

## 3. 请求示例

Url: /yonbip/PFC/merchant/v1/list?access_token=访问令牌
Body: {
	"beginTime": "2023-05-27 15:00:00",
	"endTime": "2023-05-27 15:29:34",
	"stopstatus": false,
	"pageSize": 20,
	"pageIndex": 1
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200； 示例：200 |
| data | object | 否 | 调用成功时的返回数据； |
| pageIndex | string | 否 | 当前页数 示例：1 |
| pageSize | string | 否 | 分页大小 示例：500 |
| pageCount | string | 否 | 总共页数 示例：5 |
| recordCount | string | 否 | 总条数 示例：5000 |
| recordList | object | 是 | 结果集 |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"pageIndex": "1",
		"pageSize": "500",
		"pageCount": "5",
		"recordCount": "5000",
		"recordList": [
			{
				"id": 0,
				"createOrg": "",
				"createOrg___code": "",
				"createOrg___name": "",
				"createMerchant": "",
				"createMerchant___code": "",
				"createMerchant___name": "",
				"transType": "",
				"transType___code": "",
				"transType___name": "",
				"code": "",
				"name": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"erpCode": "",
				"shortname": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"businessPartner": "",
				"businessPartner___code": "",
				"businessPartner___name": "",
				"country": "",
				"country___code": "",
				"country___name": "",
				"language": "",
				"language___code": "",
				"language___name": "",
				"newTimeZone": "",
				"parentCustomer": 0,
				"parentCustomer___code": "",
				"parentCustomer___name": "",
				"path": "",
				"suppliers": 0,
				"suppliers___code": "",
				"suppliers___name": "",
				"retailInvestors": true,
				"internalOrg": true,
				"internalOrgId": "",
				"internalOrgId___code": "",
				"internalOrgId___name": "",
				"taxPayingCategories": "",
				"customerIndustry": 0,
				"customerIndustry___code": "",
				"customerIndustry___name": "",
				"customerClass": 0,
				"customerClass___code": "",
				"customerClass___name": "",
				"developmentPartner": 0,
				"developmentPartner___code": "",
				"developmentPartner___name": "",
				"isFinancialSynergy": "",
				"parentManageOrg": "",
				"parentManageOrg___code": "",
				"parentManageOrg___name": "",
				"largeText1": "",
				"largeText2": "",
				"largeText3": "",
				"largeText4": "",
				"largeText5": "",
				"verfyMark": "",
				"merchantLogo": "",
				"enterpriseNature": "",
				"enterpriseName": "",
				"licenseType": "",
				"creditCode": "",
				"leaderName": "",
				"leaderNameIdNo": "",
				"businessLicenseNew": "",
				"businessLicenseNo": "",
				"orgName": "",
				"personCharge": "",
				"personChargeIdNo": "",
				"orgCertificate": "",
				"personName": "",
				"frontIdCard": "",
				"backIdCard": "",
				"businessterm": "2026-06-07 11:43:10",
				"regionCode": "",
				"address": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"longitude": 0,
				"latitude": 0,
				"contactName": "",
				"contactTel": "",
				"email": "",
				"fax": "",
				"buildTime": "2026-06-07 11:43:10",
				"enterNature": "",
				"enterNature___code": "",
				"enterNature___name": "",
				"currencyCode": "",
				"money": "",
				"peopleNum": 0,
				"scopeModel": "",
				"yearMoney": "",
				"scope": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"website": "",
				"wid": "",
				"postCode": "",
				"certificate": "",
				"socialMctype": 0,
				"socialSrcid": "",
				"socialTenantid": "",
				"customerLevel": 0,
				"customerLevel___code": "",
				"customerLevel___name": "",
				"customerArea": 0,
				"customerArea___code": "",
				"customerArea___name": "",
				"invoicingCustomers": 0,
				"invoicingCustomers___code": "",
				"invoicingCustomers___name": "",
				"merchantType": "",
				"isExistPotential": "",
				"creatorType": "",
				"channProfessSalesman": "",
				"channProfessSalesman___code": "",
				"channProfessSalesman___name": "",
				"channSpecialManagementDep": "",
				"channSpecialManagementDep___code": "",
				"channSpecialManagementDep___name": "",
				"channelCertificationStatus": "",
				"maxChannelLevel": 0,
				"miniChannelLevel": 0,
				"pubts": "2026-06-07 11:43:10",
				"createDate": "",
				"createTime": "2026-06-07 11:43:10",
				"creatorId": 0,
				"creatorId___code": "",
				"creatorId___name": "",
				"creator": "",
				"modifyDate": "",
				"modifyTime": "2026-06-07 11:43:10",
				"modifierId": 0,
				"modifierId___code": "",
				"modifierId___name": "",
				"modifier": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

