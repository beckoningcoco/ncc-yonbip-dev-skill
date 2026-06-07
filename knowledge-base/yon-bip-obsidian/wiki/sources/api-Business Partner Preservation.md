---
title: "业务伙伴保存V2"
apiId: "1982046395605975042"
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

# 业务伙伴保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Business Partner (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/businesspartner/savebusinesspartnerfromidempotent

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
| data | object | 否 | 否 | data |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| code | string | 否 | 否 | 编码，编码规则中设置为自动编号时不填，编码规则中设置为手工编号时必填。 示例：lctest0407 |
| nameMultilingual | object | 否 | 否 | 名称 |
| shortName | object | 否 | 否 | 简称 |
| searchCode | string | 否 | 否 | 助记码 示例：lcCS0407 |
| partnerType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 伙伴类型（0：企业，1：个人，2：其他），默认为：0。 示例：0 |
| superiorBusinessPartnerId | string | 否 | 否 | 上级业务伙伴id（上级业务伙伴id和上级业务伙伴编码选填一个即可，同时填入时以id为准） 示例：1823415394860269577 |
| superiorBusinessPartnerCode | string | 否 | 否 | 上级业务伙伴编码（上级业务伙伴id和上级业务伙伴编码选填一个即可，同时填入时以id为准） 示例：lc测试0406 |
| country | string | 否 | 否 | 国家/地区id（国家/地区id和国家/地区编码选填一个即可，同时填入时以id为准） 示例：1001Z01000000005J1WB |
| countryCode | string | 否 | 否 | 国家/地区编码（国家/地区id和国家/地区编码选填一个即可，同时填入时以id为准） 示例：AF |
| timeZone | string | 否 | 否 | 时区id（时区id和时区名称选填一个即可，同时填入时以id为准） 示例：008e7ba7-7829-401c-9f5a-3b1014e3a4d8 |
| timeZoneName | string | 否 | 否 | 时区名称（时区id和时区名称选填一个即可，同时填入时以id为准） 示例：(UTC+08:00) 中国标准时间 |
| language | string | 否 | 否 | 语言id（语言id和语言编码选填一个即可，同时填入时以id为准） 示例：d3a95d36-0ce4-11ea-817e-7cd30abea0c0 |
| languageCode | string | 否 | 否 | 语言编码（语言id和语言编码选填一个即可，同时填入时以id为准） 示例：zh_CN |
| status | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 启用状态（0：未启用，1：启用，2：停用），默认为：1 示例：1 |
| licenseType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 证照类型（0：统一社会信用代码，1：营业执照，2：其他证照，3：居民身份证，4：护照，5：其他身份证件）。当伙伴类型是企业时，传0或2，默认为0；伙伴类型是个人时，传3,4或者5，默认为3；当伙伴类型是其他时，传0，1或者2，默认为0。 示例：0 |
| creditCode | string | 否 | 否 | 证照号码 示例：lctest0407 |
| legalPerson | string | 否 | 否 | 伙伴类型=企业时填写法人，伙伴类型=个人时不填，伙伴类型=其他时填写负责人 示例：lctest0407 |
| legalPersonIdNo | string | 否 | 否 | 伙伴类型=企业时填写法人身份证号，伙伴类型=个人时不填，伙伴类型=其他时填写负责人身份证号 示例：230108456515551215 |
| money | string | 否 | 否 | 注册资金（单位：万元，只能填写数字）,输入的整数长度不能大于15位，小数保留6位 示例：5 |
| currency | string | 否 | 否 | 注册资金币种id（注册资金币种id和注册资金币种简称选填一个即可，同时填入时以id为准） 示例：1525696886140829722 |
| currencyCode | string | 否 | 否 | 注册资金币种简称（注册资金币种id和注册资金币种简称选填一个即可，同时填入时以id为准） 示例：CNY |
| buildDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 成立日期 示例：2022-04-08 |
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
| mobile | string | 否 | 否 | mobile 示例：13112341891 |
| businessPartnerCharacterDef | object | 否 | 否 | 业务伙伴特征自定义 |
| partnerRoleClasses | object | 是 | 否 | 业务伙伴角色信息；最多输入4种不同的角色类型且不能重复;若业务伙伴存在和对应档案的对照，是否已勾选自动为true; |
| partnerMerchantComparisons | object | 是 | 否 | 业务伙伴与客户对照；只能传一条，多条只有第一条生效； |
| partnerVendorComparisons | object | 是 | 否 | 业务伙伴与供应商对照;只能传一条，多条只有第一条生效； |
| internalOrgId | string | 否 | 否 | 内部组织ID；内部组织需要具有会计主体职能 示例：666666 |

## 3. 请求示例

Url: /yonbip/digitalModel/businesspartner/savebusinesspartnerfromidempotent?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
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
		"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
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
		"businessPartnerCharacterDef": {},
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
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 提示信息 示例：成功 |
| data | object | 否 | 返回结果 |
| id | string | 否 | 业务伙伴id 示例：123456789 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": {
		"id": "123456789"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-16

更新

请求说明

更新

请求参数 roleClassName

2	2025-07-17

更新

请求说明

3	2025-03-10

更新

请求参数 buildDate


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

