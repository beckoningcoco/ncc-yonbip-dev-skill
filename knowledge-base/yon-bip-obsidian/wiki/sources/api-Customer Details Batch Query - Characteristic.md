---
title: "客户详情批量查询-特征"
apiId: "1778589044561674249"
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

# 客户详情批量查询-特征

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/merchant/newBatchDetail

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
| id | long | 否 | 否 | 客户id；客户id和客户编码同时传值以客户id为准！ 示例：1706047321704235000 |
| code | string | 否 | 否 | 客户编码；客户id和客户编码同时传值以客户id为准！ 示例：客户编码 |
| belongOrgId | string | 否 | 否 | 使用组织id；使用组织id和使用组织编码同时传值以使用组织d为准！使用组织id和使用组织编码不传时，以该客户的管理组织为准！ 示例：666666 |
| belongOrgCode | string | 否 | 否 | 使用组织编码；使用组织id和使用组织编码同时传值以使用组织d为准！使用组织id和使用组织编码不传时，以该客户的管理组织为准！ 示例：global00 |

## 3. 请求示例

Url: /yonbip/digitalModel/merchant/newBatchDetail?access_token=访问令牌
Body: [{
	"id": 1706047321704235000,
	"code": "客户编码",
	"belongOrgId": "666666",
	"belongOrgCode": "global00"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200； 示例：200 |
| data | object | 是 | 调用成功时的返回数据； |
| id | long | 否 | 客户id； 示例：1733407568979558408 |
| code | string | 否 | 客户编码； 示例：客户编码 |
| name | object | 否 | 客户名称； |
| createOrgId | string | 否 | 管理组织id； 示例：管理组织id |
| createOrgCode | string | 否 | 管理组织编码； 示例：管理组织编码 |
| belongOrgId | string | 否 | 使用组织id； 示例：使用组织id |
| belongOrgCode | string | 否 | 使用组织编码； 示例：使用组织编码 |
| transTypeId | string | 否 | 客户类型id； 示例：客户类型id |
| transTypeCode | string | 否 | 客户类型编码； 示例：SYCSR001 |
| shortname | object | 否 | 客户简称 |
| countryId | string | 否 | 国家id； 示例：国家id |
| countryName | string | 否 | 国家名称； 示例：国家名称 |
| newTimeZone | string | 否 | 时区(夏时令)； 示例：Africa/Abidjan |
| languageId | string | 否 | 语言id;； 示例：d3a95d36-0ce4-11ea-817e-7cd30abea0c0 |
| languageCode | string | 否 | 语言编码； 示例：zh_CN |
| parentManageOrgId | string | 否 | 上级发展组织id； 示例：上级发展组织id |
| parentManageOrgCode | string | 否 | 上级发展组织编码； 示例：上级发展组织编码 |
| parentCustomerId | long | 否 | 上级客户id； 示例：1733407568979558408 |
| parentCustomerCode | string | 否 | 上级客户编码； 示例：上级客户编码 |
| suppliersId | long | 否 | 对应供应商id； 示例：1733407568979558408 |
| suppliersCode | string | 否 | 对应供应商编码； 示例：对应供应商编码 |
| retailInvestors | boolean | 否 | 是否散户；true：是，false：否 示例：false |
| internalOrg | boolean | 否 | 是否内部组织，true：是，false：否 示例：false |
| internalOrgIdId | string | 否 | 内部组织id； 示例：内部组织id |
| internalOrgIdCode | string | 否 | 内部组织编码； 示例：内部组织编码 |
| taxPayingCategories | short | 否 | 纳税类别；0：一般纳税人，1：小规模纳税人，2：海外纳税，99：其他； 示例：0 |
| customerClassId | long | 否 | 客户分类id； 示例：1733407568979558408 |
| customerClassCode | string | 否 | 客户分类编码； 示例：客户分类编码 |
| customerIndustryId | long | 否 | 客户行业id； 示例：1733407568979558408 |
| customerIndustryCode | string | 否 | 客户行业编码； 示例：客户行业编码 |
| developmentPartnerId | long | 否 | 发展伙伴id 示例：1733407568979558408 |
| developmentPartnerCode | string | 否 | 发展伙伴编码； 示例：发展伙伴编码 |
| enterpriseNature | short | 否 | 企业类型；0：企业，1：个人，2：其他 示例：0 |
| enterpriseName | string | 否 | 企业名称； 示例：企业名称 |
| personName | string | 否 | 姓名； 示例：姓名 |
| orgName | string | 否 | 组织名称； 示例：组织名称 |
| licenseType | short | 否 | 证照类型；0：统一社会信用代码，1：营业执照，2：其他证照，3：居民身份证，4：护照，5：其他身份证件； 示例：0 |
| creditCode | string | 否 | 证照号码/个人证照号； 示例：证照号码 |
| leaderName | string | 否 | 法人代表； 示例：法人代表 |
| leaderNameIdNo | string | 否 | 法人代表身份证号； 示例：法人代表身份证号 |
| personCharge | string | 否 | 负责人； 示例：负责人 |
| personChargeIdNo | string | 否 | 负责人身份证号； 示例：负责人身份证号 |
| businessLicenseNo | string | 否 | 经营许可证号； 示例：经营许可证号 |
| businessterm | DateTime | 否 | 营业期限至；资质信息页签下 示例：2023-05-27 |
| buildTime | DateTime | 否 | 成立时间；资质信息页签下 示例：2023-05-27 |
| contactName | string | 否 | 联系人；资质信息页签下 示例：联系人 |
| contactTel | string | 否 | 联系电话；资质信息页签下 示例：联系电话 |
| address | object | 否 | 详细地址；资质信息页签下 |
| regionCode | string | 否 | 注册地区；资质信息页签下； 示例：注册地区 |
| email | string | 否 | 邮箱；资质信息页签下 示例：邮箱 |
| fax | string | 否 | 传真；资质信息页签下 示例：传真 |
| enterNatureId | string | 否 | 企业性质id；资质信息页签下； 示例：企业性质id |
| enterNatureCode | string | 否 | 企业性质编码；资质信息页签下； 示例：企业性质编码 |
| currencyCode | string | 否 | 注册资金币种；资质信息页签下 示例：注册资金币种 |
| money | string | 否 | 注册资金(万计)；资质信息页签下 示例：100 |
| peopleNum | long | 否 | 员工人数；资质信息页签下 示例：100 |
| scopeModel | short | 否 | 经营模式；0：生产加工，1：批发经销；资质信息页签下 示例：0 |
| yearMoney | string | 否 | 年营业额(万计)；资质信息页签下 示例：100 |
| scope | object | 否 | 经营范围；资质信息页签下 |
| website | string | 否 | 网址；资质信息页签下 示例：网址 |
| wid | string | 否 | 微信公众号；资质信息页签下 示例：微信公众号 |
| postCode | string | 否 | 邮编；资质信息页签下 示例：邮编 |
| merchantAddressInfos | object | 是 | 客户档案地址信息 |
| merchantContactInfos | object | 是 | 联系人信息 |
| merchantAgentFinancialInfos | object | 是 | 银行信息 |
| merchantAgentInvoiceInfos | object | 是 | 发票信息 |
| merchantApplyRanges | object | 是 | 客户适用范围；使用组织不返回； |
| merchantAppliedDetail | object | 否 | 客户档案业务信息(客户适用范围详情) |
| merchantRole | object | 否 | 客户角色信息(营销角色) |
| merchantsManager | object | 否 | 客户管理员信息 |
| customerAreas | object | 是 | 客户档案销售区域 |
| principals | object | 是 | 客户档案负责人 |
| invoicingCustomers | object | 是 | 客户档案开票客户 |

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"id": 1733407568979558408,
			"code": "客户编码",
			"name": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"createOrgId": "管理组织id",
			"createOrgCode": "管理组织编码",
			"belongOrgId": "使用组织id",
			"belongOrgCode": "使用组织编码",
			"transTypeId": "客户类型id",
			"transTypeCode": "SYCSR001",
			"shortname": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"countryId": "国家id",
			"countryName": "国家名称",
			"newTimeZone": "Africa/Abidjan",
			"languageId": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
			"languageCode": "zh_CN",
			"parentManageOrgId": "上级发展组织id",
			"parentManageOrgCode": "上级发展组织编码",
			"parentCustomerId": 1733407568979558408,
			"parentCustomerCode": "上级客户编码",
			"suppliersId": 1733407568979558408,
			"suppliersCode": "对应供应商编码",
			"retailInvestors": false,
			"internalOrg": false,
			"internalOrgIdId": "内部组织id",
			"internalOrgIdCode": "内部组织编码",
			"taxPayingCategories": 0,
			"customerClassId": 1733407568979558408,
			"customerClassCode": "客户分类编码",
			"customerIndustryId": 1733407568979558408,
			"customerIndustryCode": "客户行业编码",
			"developmentPartnerId": 1733407568979558408,
			"developmentPartnerCode": "发展伙伴编码",
			"enterpriseNature": 0,
			"enterpriseName": "企业名称",
			"personName": "姓名",
			"orgName": "组织名称",
			"licenseType": 0,
			"creditCode": "证照号码",
			"leaderName": "法人代表",
			"leaderNameIdNo": "法人代表身份证号",
			"personCharge": "负责人",
			"personChargeIdNo": "负责人身份证号",
			"businessLicenseNo": "经营许可证号",
			"businessterm": "2023-05-27",
			"buildTime": "2023-05-27",
			"contactName": "联系人",
			"contactTel": "联系电话",
			"address": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"regionCode": "注册地区",
			"email": "邮箱",
			"fax": "传真",
			"enterNatureId": "企业性质id",
			"enterNatureCode": "企业性质编码",
			"currencyCode": "注册资金币种",
			"money": "100",
			"peopleNum": 100,
			"scopeModel": 0,
			"yearMoney": "100",
			"scope": {
				"simplifiedName": "简体",
				"englishName": "英文",
				"traditionalName": "繁体"
			},
			"website": "网址",
			"wid": "微信公众号",
			"postCode": "邮编",
			"merchantAddressInfos": [
				{
					"id": 1733407568979558408,
					"addressCode": "地址编码",
					"shipregionId": 1733407568979558408,
					"shipregionCode": "运输区域编码",
					"regionCode": "行政区划",
					"address": "详细地址",
					"zipCode": "邮政编码",
					"receiver": "联系人姓名",
					"mobile": "联系人手机",
					"telePhone": "固定电话",
					"email": "邮箱",
					"qq": "QQ",
					"weChat": "微信",
					"remarks": "备注",
					"stopStatus": "\"0\"",
					"isDefault": true
				}
			],
			"merchantContactInfos": [
				{
					"id": 1733407568979558408,
					"fullName": {
						"simplifiedName": "简体",
						"englishName": "英文",
						"traditionalName": "繁体"
					},
					"gender": 0,
					"positionName": "职务",
					"areaCodeMobile": "区号手机号",
					"mobile": "备用手机号",
					"telePhone": "固定电话",
					"email": "邮箱",
					"qq": "QQ",
					"weChat": "微信",
					"remarks": "备注",
					"isDefault": true
				}
			],
			"merchantAgentFinancialInfos": [
				{
					"id": 1733407568979558408,
					"countryId": "国家Id",
					"countryName": "国家名称",
					"provinceId": 1733407568979558408,
					"provinceCode": "省份编码",
					"currencyId": "币种Id",
					"currencyName": "币种名称",
					"accountType": "“0”",
					"bankId": "银行类别Id",
					"bankName": "银行类别名称",
					"openBankId": "银行网点id",
					"openBankName": "银行网点名称",
					"bankAccount": "银行账号",
					"bankAccountName": {
						"simplifiedName": "简体",
						"englishName": "英文",
						"traditionalName": "繁体"
					},
					"jointLineNo": "联行号",
					"remarks": "备注",
					"accountOpeningAddress": {
						"simplifiedName": "简体",
						"englishName": "英文",
						"traditionalName": "繁体"
					},
					"accountOpeningDate": "2023-05-27",
					"stopStatus": false,
					"isDefault": true
				}
			],
			"merchantAgentInvoiceInfos": [
				{
					"id": 1733407568979558408,
					"bdBillingTypeId": "发票类型Id",
					"bdBillingTypeName": "发票类型名称",
					"title": "发票抬头",
					"taxNo": "税号",
					"receievInvoiceMobile": "收票手机号",
					"receievInvoiceEmail": "收票邮箱",
					"telephone": "电话",
					"address": {
						"simplifiedName": "简体",
						"englishName": "英文",
						"traditionalName": "繁体"
					},
					"bankId": "银行类别Id",
					"bankName": "银行类别名称",
					"bankDotId": "银行网点Id",
					"bankDotName": "银行网点名称",
					"bankAccount": "银行账号",
					"remarks": "备注",
					"isDefault": true
				}
			],
			"merchantApplyRanges": [
				{
					"orgId": "组织id",
					"orgIdCode": "组织编码",
					"id": 123456
				}
			],
			"merchantAppliedDetail": {
				"searchCode": "助记码",
				"customerLevelId": 1733407568979558408,
				"customerLevelCode": "客户级别编码",
				"customerTypeId": 1733407568979558408,
				"customerTypeCode": "销售渠道编码",
				"deliveryWarehouseId": 1733407568979558408,
				"deliveryWarehouseCode": "发货仓库编码",
				"transactionCurrencyId": "交易币种id",
				"transactionCurrencyName": "交易币种名称",
				"exchangeRateTypeId": "汇率类型id",
				"exchangeRateTypeCode": "汇率类型编码",
				"taxRateNtaxId": 1733407568979558408,
				"taxRateNtaxRate": "税率档案编码",
				"payWay": 0,
				"creditServiceDay": 120,
				"collectionAgreementId": 1733407568979558408,
				"collectionAgreementName": "收款协议名称",
				"settlementMethodId": 1733407568979558408,
				"settlementMethodName": "结算方式名称",
				"shipmentMethodId": 1733407568979558408,
				"shipmentMethodName": "发运方式名称",
				"signBack": true,
				"isTradeCustomers": "\"0\"",
				"stopStatus": false
			},
			"merchantRole": {
				"merchantOptions": false,
				"businessRole": "\"1\""
			},
			"merchantsManager": {
				"countryCode": "\"86\"",
				"mobile": "手机号",
				"fullName": "姓名",
				"email": "邮箱"
			},
			"customerAreas": [
				{
					"id": 1733407568979558408,
					"saleAreaId": 1733407568979558408,
					"saleAreaIdCode": "销售区域编码",
					"isDefault": true
				}
			],
			"principals": [
				{
					"id": 1733407568979558408,
					"specialManagementDepId": "专管部门id",
					"specialManagementDepCode": "专管部门编码",
					"professSalesmanId": "专管业务员id",
					"professSalesmanCode": "专管业务员编码",
					"isDefault": true
				}
			],
			"invoicingCustomers": [
				{
					"id": 1733407568979558408,
					"invoicingCustomersId": 1733407568979558408,
					"invoicingCustomersIdCode": "开票客户编码",
					"isDefault": true
				}
			]
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-20

更新

返回参数 (26)

删除

返回参数 message

2	2026-01-07

更新

请求说明

新增

返回参数 id

更新

返回参数 creditServiceDay


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

