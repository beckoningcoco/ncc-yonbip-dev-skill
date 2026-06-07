---
title: "业务伙伴更新"
apiId: "1700225038372306945"
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

# 业务伙伴更新

> `ContentType	application/json` 请求方式	POST | 分类: Business Partner (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/businesspartner/updatebusinesspartner

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
| id | string | 否 | 否 | id，id和编码不能同时为空，都传时以id为准！ |
| code | string | 否 | 否 | 编码，id和编码不能同时为空，都传时以id为准！ 示例：lctest0407 |
| nameMultilingual | object | 否 | 否 | 名称 |
| simplifiedName | string | 否 | 否 | 简体 示例：业务伙伴 |
| englishName | string | 否 | 否 | 英文 示例：partner |
| traditionalName | string | 否 | 否 | 繁体 示例：業務伙伴 |
| shortName | object | 否 | 否 | 简称 |
| simplifiedName | string | 否 | 否 | 简体 示例：业务伙伴 |
| englishName | string | 否 | 否 | 英文 示例：partner |
| traditionalName | string | 否 | 否 | 繁体 示例：業務伙伴 |
| searchCode | string | 否 | 否 | 助记码 示例：lcCS0407 |
| partnerType | int | 否 | 否 | 伙伴类型（0：企业，1：个人，2：其他）。传入0时，会将手机号置空；传入1时，将法人和法人身份证号置空。 示例：0 |
| superiorBusinessPartnerId | string | 否 | 否 | 上级业务伙伴id（上级业务伙伴id和上级业务伙伴编码选填一个即可，同时填入时以id为准） 示例：1823415394860269577 |
| superiorBusinessPartnerCode | string | 否 | 否 | 上级业务伙伴编码（上级业务伙伴id和上级业务伙伴编码选填一个即可，同时填入时以id为准） 示例：lc测试0406 |
| country | string | 否 | 否 | 国家/地区id（国家/地区id和国家/地区编码选填一个即可，同时填入时以id为准） 示例：1001Z01000000005J1WB |
| countryCode | string | 否 | 否 | 国家/地区编码（国家/地区id和国家/地区编码选填一个即可，同时填入时以id为准） 示例：AF |
| timeZone | string | 否 | 否 | 时区id（时区id和时区名称选填一个即可，同时填入时以id为准）；废弃，已经替换为新时区(夏令时) newTimeZone 示例：008e7ba7-7829-401c-9f5a-3b1014e3a4d8 |
| timeZoneName | string | 否 | 否 | 时区名称（时区id和时区名称选填一个即可，同时填入时以id为准）；废弃，已经替换为新时区(夏令时) newTimeZone 示例：(UTC+08:00) 中国标准时间 |
| newTimeZone | string | 否 | 否 | 时区(夏令时)；输入编码 示例：Africa/Abidjan |
| language | string | 否 | 否 | 语言id（语言id和语言编码选填一个即可，同时填入时以id为准） 示例：d3a95d36-0ce4-11ea |
| languageCode | string | 否 | 否 | 语言编码（语言id和语言编码选填一个即可，同时填入时以id为准） 示例：zh_CN |
| status | short | 否 | 否 | 启用状态（0：未启用，1：启用，2：停用），默认为：1 示例：1 |
| licenseType | short | 否 | 否 | 证照类型（0：统一社会信用代码，1：营业执照，2：其他证照，3：居民身份证，4：护照，5：其他身份证件）。当伙伴类型是企业时，传0或2；伙伴类型是个人时，传3,4或者5；当伙伴类型是其他时，传0，1或者2。 示例：0 |
| creditCode | string | 否 | 否 | 证照号码 示例：lctest0407 |
| legalPerson | string | 否 | 否 | 伙伴类型=企业时填写法人，伙伴类型=个人时不填，伙伴类型=其他时填写负责人 示例：lctest0407 |
| legalPersonIdNo | string | 否 | 否 | 伙伴类型=企业时填写法人身份证号，伙伴类型=个人时不填，伙伴类型=其他时填写负责人身份证号 示例：230108456515551215 |
| money | string | 否 | 否 | 注册资金（单位：万元，只能填写数字） 示例：5 |
| currency | string | 否 | 否 | 注册资金币种id（注册资金币种id和注册资金币种简称选填一个即可，同时填入时以id为准） 示例：1525696886140829722 |
| currencyCode | string | 否 | 否 | 注册资金币种简称（注册资金币种id和注册资金币种简称选填一个即可，同时填入时以id为准） 示例：CNY |
| buildDate | string | 否 | 否 | 成立日期 示例：2022-04-08 |
| operatingTermTo | string | 否 | 否 | 营业期限至 示例：2022-04-08 |
| regionId | string | 否 | 否 | 注册地区 示例：黑龙江省#哈尔滨市#香坊区 |
| regAddress | string | 否 | 否 | 注册地址 示例：黑龙江省哈尔滨市香坊区旭升南街23号 |
| contactName | string | 否 | 否 | 联系人 示例：张三 |
| contactTel | string | 否 | 否 | 联系人电话 示例：13526541598 |
| fax | string | 否 | 否 | 传真 示例：15626 |
| email | string | 否 | 否 | 邮箱 示例：2051685455@qq.com |
| postalCode | string | 否 | 否 | 邮编 示例：150040 |
| website | string | 否 | 否 | 网址 示例：www.baidu.com |
| scope | object | 否 | 否 | 经营范围 |
| simplifiedName | string | 否 | 否 | 简体 示例：经营范围 |
| englishName | string | 否 | 否 | 英文 示例：BusinessScope |
| traditionalName | string | 否 | 否 | 繁体 示例：經營範圍 |
| mobile | string | 否 | 否 | 手机号，业务伙伴的伙伴类型为个人时，可以输入手机号！ 示例：13112341891 |
| partnerRoleClasses | object | 是 | 否 | 业务伙伴角色信息；最多输入4种不同的角色类型且不能重复;若业务伙伴存在和对应档案的对照，是否已勾选自动为true; |
| roleClassName | int | 否 | 是 | 角色类别；0：客户 1：供应商 2：资金业务伙伴 3：组织 示例：0 |
| check | boolean | 否 | 否 | 是否已勾选；false：未勾选；true：勾选 示例：true |
| partnerMerchantComparisons | object | 是 | 否 | 业务伙伴与客户对照；只能传一条，多条只有第一条生效；若业务伙伴已经存在与客户的对照则无法创建客户 |
| code | string | 否 | 否 | 客户编码；不传默认取业务伙伴的编码；优先根据客户的编码规则来编码；业务伙伴编码和客户编码不能同时为空； 示例：1123 |
| createOrgId | string | 否 | 否 | 管理组织id；createOrgId和createOrgCode二选一必填，同时传以createOrgId为准 示例：666666 |
| createOrgCode | string | 否 | 否 | 管理组织编码；createOrgId和createOrgCode二选一必填，同时传以createOrgId为准 示例：JS001 |
| transType | string | 否 | 否 | 客户类型id; transType和transTypeCode二选一选填，同时传以transType为准 示例：1525583395935486517 |
| transTypeCode | string | 否 | 否 | 客户类型编码;transType和transTypeCode二选一选填，同时传以transType为准 示例：SYCSR001 |
| customerClass | long | 否 | 否 | 客户分类id;customerClass和customerClassCode二选一选填，同时传以customerClass为准 示例：1525583395935486517 |
| customerClassCode | string | 否 | 否 | 客户分类编码;customerClass和customerClassCode二选一选填，同时传以customerClass为准 示例：code |
| partnerVendorComparisons | object | 是 | 否 | 业务伙伴与供应商对照;只能传一条，多条只有第一条生效；若业务伙伴已经存在与供应商的对照则无法创建供应商 |
| code | string | 否 | 否 | 供应商编码；不传默认取业务伙伴的编码；业务伙伴编码和供应商编码不能同时为空； 示例：code |
| createOrgId | string | 否 | 否 | 管理组织id；createOrgId和createOrgCode二选一传必传，同时传以createOrgId为准 示例：666666 |
| createOrgCode | string | 否 | 否 | 管理组织编码；createOrgId和createOrgCode二选一传必传，同时传以createOrgId为准 示例：global00 |
| vendorClass | long | 否 | 否 | 供应商分类id；vendorClass和vendorClassCode二选一传一个，同时传以vendorClass为准 示例：1525583395935486517 |
| vendorClassCode | string | 否 | 否 | 供应商分类名称；vendorClass和vendorClassCode二选一传一个，同时传以vendorClass为准 示例：code |
| internalOrgId | string | 否 | 否 | 内部组织ID；内部组织需具有会计主体职能 示例：666666 |

## 3. 请求示例

Url: /yonbip/digitalModel/businesspartner/updatebusinesspartner?access_token=访问令牌
Body: {
	"id": "",
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
	"searchCode": "lcCS0407",
	"partnerType": 0,
	"superiorBusinessPartnerId": "1823415394860269577",
	"superiorBusinessPartnerCode": "lc测试0406",
	"country": "1001Z01000000005J1WB",
	"countryCode": "AF",
	"timeZone": "008e7ba7-7829-401c-9f5a-3b1014e3a4d8",
	"timeZoneName": "(UTC+08:00) 中国标准时间",
	"newTimeZone": "Africa/Abidjan",
	"language": "d3a95d36-0ce4-11ea",
	"languageCode": "zh_CN",
	"status": 1,
	"licenseType": 0,
	"creditCode": "lctest0407",
	"legalPerson": "lctest0407",
	"legalPersonIdNo": "230108456515551215",
	"money": "5",
	"currency": "1525696886140829722",
	"currencyCode": "CNY",
	"buildDate": "2022-04-08",
	"operatingTermTo": "2022-04-08",
	"regionId": "黑龙江省#哈尔滨市#香坊区",
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
	"partnerRoleClasses": [
		{
			"roleClassName": 0,
			"check": true
		}
	],
	"partnerMerchantComparisons": [
		{
			"code": "1123",
			"createOrgId": "666666",
			"createOrgCode": "JS001",
			"transType": "1525583395935486517",
			"transTypeCode": "SYCSR001",
			"customerClass": 1525583395935486517,
			"customerClassCode": "code"
		}
	],
	"partnerVendorComparisons": [
		{
			"code": "code",
			"createOrgId": "666666",
			"createOrgCode": "global00",
			"vendorClass": 1525583395935486517,
			"vendorClassCode": "code"
		}
	],
	"internalOrgId": "666666"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 提示信息 示例：成功 |
| data | object | 否 | 返回结果,更新操作不返回内容固定为null 示例：null |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": "null"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-16

更新

请求说明

更新

请求参数 roleClassName


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

