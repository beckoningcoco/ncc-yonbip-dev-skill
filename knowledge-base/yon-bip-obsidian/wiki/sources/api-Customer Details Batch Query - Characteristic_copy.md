---
title: "客户明细查询(管理组织/使用组织)V1"
apiId: "2499962208089800713"
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

# 客户明细查询(管理组织/使用组织)V1

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/PFC/merchant/v1/batchDetail

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	详情批量查询

事务和幂等性	无

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

Url: /yonbip/PFC/merchant/v1/batchDetail?access_token=访问令牌
Body: [{
	"id": 1706047321704235000,
	"code": "客户编码",
	"belongOrgId": "666666",
	"belongOrgCode": "global00"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| message | string | 否 | 调用时的信息； 示例：处理成功 |
| code | string | 否 | 返回码，调用成功时返回200； 示例：200 |
| data | object | 是 | 调用成功时的返回数据； |
| id | number |
| 小数位数:0,最大长度:20 | 否 | ID |
| createOrg | string | 否 | 管理组织 |
| createOrg___code | string | 否 | 管理组织编码 |
| createOrg___name | string | 否 | 管理组织名称 |
| belongOrg | string | 否 | 使用组织 |
| belongOrg___code | string | 否 | 使用组织编码 |
| belongOrg___name | string | 否 | 使用组织名称 |
| createMerchant | string | 否 | 创建商家 |
| createMerchant___code | string | 否 | 创建商家编码 |
| createMerchant___name | string | 否 | 创建商家名称 |
| transType | string | 否 | 客户类型 |
| transType___code | string | 否 | 客户类型编码 |
| transType___name | string | 否 | 客户类型名称 |
| code | string | 否 | 客户编码 |
| name | object | 否 | 客户名称 |
| erpCode | string | 否 | 外部编码 |
| shortname | object | 否 | 客户简称 |
| businessPartner | string | 否 | 业务伙伴 |
| businessPartner___code | string | 否 | 业务伙伴编码 |
| businessPartner___name | string | 否 | 业务伙伴名称 |
| country | string | 否 | 国家/地区 |
| country___code | string | 否 | 国家/地区编码 |
| country___name | string | 否 | 国家/地区名称 |
| language | string | 否 | 语言 |
| language___code | string | 否 | 语言编码 |
| language___name | string | 否 | 语言名称 |
| newTimeZone | string | 否 | 时区 |
| parentCustomer | number |
| 小数位数:0,最大长度:20 | 否 | 上级客户 |
| parentCustomer___code | string | 否 | 上级客户编码 |
| parentCustomer___name | string | 否 | 上级客户名称 |
| path | string | 否 | 上级客户路径 |
| suppliers | number |
| 小数位数:0,最大长度:20 | 否 | 对应供应商 |
| suppliers___code | string | 否 | 对应供应商编码 |
| suppliers___name | string | 否 | 对应供应商名称 |
| retailInvestors | boolean | 否 | 是否散户 |
| internalOrg | boolean | 否 | 是否内部组织 |
| internalOrgId | string | 否 | 内部组织 |
| internalOrgId___code | string | 否 | 内部组织编码 |
| internalOrgId___name | string | 否 | 内部组织名称 |
| taxPayingCategories | string | 否 | 纳税类别 |
| customerIndustry | number |
| 小数位数:0,最大长度:20 | 否 | 客户行业 |
| customerIndustry___code | string | 否 | 客户行业编码 |
| customerIndustry___name | string | 否 | 客户行业名称 |
| customerClass | number |
| 小数位数:0,最大长度:20 | 否 | 客户分类 |
| customerClass___code | string | 否 | 客户分类编码 |
| customerClass___name | string | 否 | 客户分类名称 |
| developmentPartner | number |
| 小数位数:0,最大长度:20 | 否 | 发展伙伴 |
| developmentPartner___code | string | 否 | 发展伙伴编码 |
| developmentPartner___name | string | 否 | 发展伙伴名称 |
| isFinancialSynergy | string | 否 | 是否财务协同 |
| parentManageOrg | string | 否 | 上级发展组织 |
| parentManageOrg___code | string | 否 | 上级发展组织编码 |
| parentManageOrg___name | string | 否 | 上级发展组织名称 |
| largeText1 | string | 否 | 大文本域1 |
| largeText2 | string | 否 | 大文本域2 |
| largeText3 | string | 否 | 大文本域3 |
| largeText4 | string | 否 | 大文本域4 |
| largeText5 | string | 否 | 大文本域5 |
| verfyMark | string | 否 | 核实状态 |
| merchantLogo | string | 否 | LOGO |
| enterpriseNature | string | 否 | 企业类型 |
| enterpriseName | string | 否 | 企业名称 |
| licenseType | string | 否 | 证照类型 |
| creditCode | string | 否 | 证照号码 |
| leaderName | string | 否 | 法人代表 |
| leaderNameIdNo | string | 否 | 法人代表身份证号 |
| businessLicenseNew | string | 否 | 营业执照 |
| businessLicenseNo | string | 否 | 经营许可证号 |
| orgName | string | 否 | 组织名称 |
| personCharge | string | 否 | 负责人 |
| personChargeIdNo | string | 否 | 负责人身份证号 |
| orgCertificate | string | 否 | 组织相关证件 |
| personName | string | 否 | 姓名 |
| frontIdCard | string | 否 | 身份证件正面 |
| backIdCard | string | 否 | 身份证件反面 |
| businessterm | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 营业期限至 |
| regionCode | string | 否 | 注册地区编码 |
| address | object | 否 | 详细地址 |
| longitude | number |
| 小数位数:0,最大长度:20 | 否 | 经度 |
| latitude | number |
| 小数位数:0,最大长度:20 | 否 | 纬度 |
| contactName | string | 否 | 联系人 |
| contactTel | string | 否 | 联系电话 |
| email | string | 否 | 邮箱 |
| fax | string | 否 | 传真 |
| buildTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 成立时间 |
| enterNature | string | 否 | 企业性质 |
| enterNature___code | string | 否 | 企业性质编码 |
| enterNature___name | string | 否 | 企业性质名称 |
| currencyCode | string | 否 | 注册资金币种 |
| money | string | 否 | 注册资金 |
| peopleNum | number |
| 小数位数:0,最大长度:20 | 否 | 员工人数 |
| scopeModel | string | 否 | 经营模式 |
| yearMoney | string | 否 | 年营业额 |
| scope | object | 否 | 经营范围 |
| website | string | 否 | 网址 |
| wid | string | 否 | 微信公众号 |
| postCode | string | 否 | 邮编 |
| certificate | string | 否 | 证照证书 |
| socialMctype | number |
| 小数位数:0,最大长度:20 | 否 | 社会化管控类型 |
| socialSrcid | string | 否 | 社会化来源 |
| socialTenantid | string | 否 | 社会化来源租户 |
| customerLevel | number |
| 小数位数:0,最大长度:20 | 否 | 客户级别 |
| customerLevel___code | string | 否 | 客户级别编码 |
| customerLevel___name | string | 否 | 客户级别名称 |
| customerArea | number |
| 小数位数:0,最大长度:20 | 否 | 客户区域 |
| customerArea___code | string | 否 | 客户区域编码 |
| customerArea___name | string | 否 | 客户区域名称 |
| invoicingCustomers | number |
| 小数位数:0,最大长度:20 | 否 | 开票客户 |
| invoicingCustomers___code | string | 否 | 开票客户编码 |
| invoicingCustomers___name | string | 否 | 开票客户名称 |
| merchantType | string | 否 | 客户类别 |
| isExistPotential | string | 否 | 是否存在潜客 |
| creatorType | string | 否 | 创建者类型 |
| channProfessSalesman | string | 否 | 渠道专管业务员 |
| channProfessSalesman___code | string | 否 | 渠道专管业务员编码 |
| channProfessSalesman___name | string | 否 | 渠道专管业务员名称 |
| channSpecialManagementDep | string | 否 | 渠道专管部门 |
| channSpecialManagementDep___code | string | 否 | 渠道专管部门编码 |
| channSpecialManagementDep___name | string | 否 | 渠道专管部门名称 |
| channelCertificationStatus | string | 否 | 渠道认证状态 |
| maxChannelLevel | number |
| 小数位数:0,最大长度:20 | 否 | 最高渠道层级 |
| miniChannelLevel | number |
| 小数位数:0,最大长度:20 | 否 | 最低渠道层级 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 时间戳 |
| createDate | string | 否 | 创建日期 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 创建时间 |
| creatorId | number |
| 小数位数:0,最大长度:20 | 否 | 创建人 |
| creatorId___code | string | 否 | 创建人编码 |
| creatorId___name | string | 否 | 创建人名称 |
| creator | string | 否 | 创建人 |
| modifyDate | string | 否 | 修改日期 |
| modifyTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 修改时间 |
| modifierId | number |
| 小数位数:0,最大长度:20 | 否 | 修改人 |
| modifierId___code | string | 否 | 修改人编码 |
| modifierId___name | string | 否 | 修改人名称 |
| modifier | string | 否 | 修改人 |
| merchantRole | object | 是 | 客户角色信息 |
| invoicingCustomerss | object | 是 | 开票客户 |
| merchantsManager | object | 是 | 客户管理员 |
| principals | object | 是 | 负责人 |
| merchantAgentFinancialInfos | object | 是 | 银行信息 |
| merchantAgentInvoiceInfos | object | 是 | 发票信息 |
| merchantAppliedDetail | object | 否 | 客户适用范围组详情 |
| merchantApplyRanges | object | 是 | 客户适用范围 |
| merchantContacterInfos | object | 是 | 联系人信息 |
| merchantAddressInfos | object | 是 | 地址信息 |
| customerAreas | object | 是 | 销售区域 |

## 5. 正确返回示例

{
	"message": "处理成功",
	"code": "200",
	"data": [
		{
			"id": 0,
			"createOrg": "",
			"createOrg___code": "",
			"createOrg___name": "",
			"belongOrg": "",
			"belongOrg___code": "",
			"belongOrg___name": "",
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
			"businessterm": "2026-06-07 11:43:21",
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
			"buildTime": "2026-06-07 11:43:21",
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
			"pubts": "2026-06-07 11:43:21",
			"createDate": "",
			"createTime": "2026-06-07 11:43:21",
			"creatorId": 0,
			"creatorId___code": "",
			"creatorId___name": "",
			"creator": "",
			"modifyDate": "",
			"modifyTime": "2026-06-07 11:43:21",
			"modifierId": 0,
			"modifierId___code": "",
			"modifierId___name": "",
			"modifier": "",
			"merchantRole": [
				{
					"id": 0,
					"merchantId": 0,
					"merchantId___code": "",
					"merchantId___name": "",
					"merchantOptions": true,
					"businessRole": "",
					"pubts": "2026-06-07 11:43:21"
				}
			],
			"invoicingCustomerss": [
				{
					"id": 0,
					"merchantId": 0,
					"merchantId___code": "",
					"merchantId___name": "",
					"merchantApplyRangeId": 0,
					"merchantApplyRangeId___code": "",
					"merchantApplyRangeId___name": "",
					"invoicingCustomersId": 0,
					"invoicingCustomersId___code": "",
					"invoicingCustomersId___name": "",
					"isDefault": true,
					"pubts": "2026-06-07 11:43:21"
				}
			],
			"merchantsManager": [
				{
					"id": 0,
					"merchantId": 0,
					"merchantId___code": "",
					"merchantId___name": "",
					"countryCode": "",
					"mobile": "",
					"fullName": "",
					"email": "",
					"yhtUserId": "",
					"pubts": "2026-06-07 11:43:21"
				}
			],
			"principals": [
				{
					"id": 0,
					"merchantId": 0,
					"merchantId___code": "",
					"merchantId___name": "",
					"merchantApplyRangeId": 0,
					"merchantApplyRangeId___code": "",
					"merchantApplyRangeId___name": "",
					"professSalesman": "",
					"professSalesman___code": "",
					"professSalesman___name": "",
					"specialManagementDep": "",
					"specialManagementDep___code": "",
					"specialManagementDep___name": "",
					"isDefault": true,
					"pubts": "2026-06-07 11:43:21"
				}
			],
			"merchantAgentFinancialInfos": [
				{
					"id": 0,
					"merchantId": 0,
					"merchantId___code": "",
					"merchantId___name": "",
					"erpCode": "",
					"country": "",
					"country___code": "",
					"country___name": "",
					"province": 0,
					"province___code": "",
					"province___name": "",
					"orgFinBankAcct": "",
					"orgFinBankAcct___code": "",
					"orgFinBankAcct___name": "",
					"currency": "",
					"currency___code": "",
					"currency___name": "",
					"accountType": 0,
					"bank": "",
					"bank___code": "",
					"bank___name": "",
					"openBank": "",
					"openBank___code": "",
					"openBank___name": "",
					"bankAccount": "",
					"bankAccountName": {
						"zh_CN": "简体",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"jointLineNo": "",
					"isDefault": true,
					"agentBankForElectronic": "",
					"agentBankForElectronic___code": "",
					"agentBankForElectronic___name": "",
					"remarks": "",
					"accountOpeningDate": "",
					"swiftCode": "",
					"accountOpeningAddress": {
						"zh_CN": "简体",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"stopstatus": true,
					"stoptime": "2026-06-07 11:43:21",
					"pubts": "2026-06-07 11:43:21"
				}
			],
			"merchantAgentInvoiceInfos": [
				{
					"id": 0,
					"merchantId": 0,
					"merchantId___code": "",
					"merchantId___name": "",
					"erpCode": "",
					"bdBillingType": "",
					"bdBillingType___code": "",
					"bdBillingType___name": "",
					"title": "",
					"receievInvoiceEmail": "",
					"receievInvoiceMobile": "",
					"taxNo": "",
					"telephone": "",
					"address": {
						"zh_CN": "简体",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"name": "",
					"name___code": "",
					"name___name": "",
					"bankName": "",
					"bankName___code": "",
					"bankName___name": "",
					"bankAccount": "",
					"isDefault": true,
					"remarks": "",
					"pubts": "2026-06-07 11:43:21",
					"billingType": ""
				}
			],
			"merchantAppliedDetail": {
				"id": "",
				"merchantId": 0,
				"merchantId___code": "",
				"merchantId___name": "",
				"belongOrgId": "",
				"belongOrgId___code": "",
				"belongOrgId___name": "",
				"belongMerchantId": "",
				"belongMerchantId___code": "",
				"belongMerchantId___name": "",
				"erpCode": "",
				"searchCode": "",
				"merchantLevelId": 0,
				"merchantLevelId___code": "",
				"merchantLevelId___name": "",
				"merchantTypeId": 0,
				"merchantTypeId___code": "",
				"merchantTypeId___name": "",
				"deliveryWarehouseId": 0,
				"deliveryWarehouseId___code": "",
				"deliveryWarehouseId___name": "",
				"transactionCurrencyId": "",
				"transactionCurrencyId___code": "",
				"transactionCurrencyId___name": "",
				"exchangeRateTypeId": "",
				"exchangeRateTypeId___code": "",
				"exchangeRateTypeId___name": "",
				"taxRateId": "",
				"taxRateId___code": "",
				"taxRateId___name": "",
				"payWay": "",
				"creditServiceDayId": 0,
				"collectionAgreementId": 0,
				"collectionAgreementId___code": "",
				"collectionAgreementId___name": "",
				"settlementMethodId": 0,
				"settlementMethodId___code": "",
				"settlementMethodId___name": "",
				"shipmentMethodId": 0,
				"shipmentMethodId___code": "",
				"shipmentMethodId___name": "",
				"priceMarking": 0,
				"signBack": 0,
				"isTradeCustomers": "",
				"orgDefaultAddress": "",
				"stopstatus": true,
				"layoffId": 0,
				"layoffId___code": "",
				"layoffId___name": "",
				"stoptime": "2026-06-07 11:43:21",
				"frozenState": "",
				"freezeLink": "",
				"lockDate": "",
				"lockTime": "2026-06-07 11:43:21",
				"locker": "",
				"isCreator": true,
				"pubts": "2026-06-07 11:43:21",
				"createDate": "",
				"createTime": "2026-06-07 11:43:21",
				"creator": "",
				"creatorId": 0,
				"creatorId___code": "",
				"creatorId___name": "",
				"modifyDate": "",
				"modifyTime": "2026-06-07 11:43:21",
				"modifier": "",
				"modifierId": 0,
				"modifierId___code": "",
				"modifierId___name": "",
				"merchantDetailForCrm": [
					{}
				]
			},
			"merchantApplyRanges": [
				{
					"id": 0,
					"merchantId": 0,
					"merchantId___code": "",
					"merchantId___name": "",
					"merchantDetailId": "",
					"merchantDetailId___code": "",
					"merchantDetailId___name": "",
					"orgId": "",
					"orgId___code": "",
					"orgId___name": "",
					"allocatorId": 0,
					"allocatorId___code": "",
					"allocatorId___name": "",
					"allocatorName": "",
					"allocateTime": "2026-06-07 11:43:21",
					"shopId": 0,
					"shopId___code": "",
					"shopId___name": "",
					"allocateSource": "",
					"rangeType": 0,
					"isCreator": true,
					"isApplied": true,
					"isSalesOrg": true,
					"isPotential": true,
					"noFollowTime": "",
					"recentlyFollowTime": "2026-06-07 11:43:21",
					"positivePeople": "",
					"positiveTime": "2026-06-07 11:43:21",
					"pubts": "2026-06-07 11:43:21",
					"controlRuleVersion": 0,
					"invoicingCustomerss": [
						{
							"id": 0,
							"merchantId": 0,
							"merchantId___code": "",
							"merchantId___name": "",
							"merchantApplyRangeId": 0,
							"merchantApplyRangeId___code": "",
							"merchantApplyRangeId___name": "",
							"invoicingCustomersId": 0,
							"invoicingCustomersId___code": "",
							"invoicingCustomersId___name": "",
							"isDefault": true,
							"pubts": "2026-06-07 11:43:21"
						}
					],
					"merchantDetailForCrm": [
						{}
					],
					"principals": [
						{
							"id": 0,
							"merchantId": 0,
							"merchantId___code": "",
							"merchantId___name": "",
							"merchantApplyRangeId": 0,
							"merchantApplyRangeId___code": "",
							"merchantApplyRangeId___name": "",
							"professSalesman": "",
							"professSalesman___code": "",
							"professSalesman___name": "",
							"specialManagementDep": "",
							"specialManagementDep___code": "",
							"specialManagementDep___name": "",
							"isDefault": true,
							"pubts": "2026-06-07 11:43:21"
						}
					],
					"customerAreas": [
						{
							"id": 0,
							"merchantId": 0,
							"merchantId___code": "",
							"merchantId___name": "",
							"merchantApplyRangeId": 0,
							"merchantApplyRangeId___code": "",
							"merchantApplyRangeId___name": "",
							"saleAreaId": 0,
							"saleAreaId___code": "",
							"saleAreaId___name": "",
							"isDefault": true,
							"pubts": "2026-06-07 11:43:21"
						}
					]
				}
			],
			"merchantContacterInfos": [
				{
					"id": 0,
					"merchantId": 0,
					"merchantId___code": "",
					"merchantId___name": "",
					"erpCode": "",
					"gender": "",
					"contactDepartment": "",
					"positionName": "",
					"areaCodeMobile": "",
					"mobile": "",
					"telePhone": "",
					"email": "",
					"qq": "",
					"weChat": "",
					"isDefault": true,
					"stopStatus": "",
					"remarks": "",
					"orderContact": true,
					"mallContact": true,
					"custContact": true,
					"crmContact": "",
					"yhtUserId": "",
					"isCreatorYhtUserType": "",
					"pubts": "2026-06-07 11:43:21"
				}
			],
			"merchantAddressInfos": [
				{
					"id": 0,
					"merchantId": 0,
					"merchantId___code": "",
					"merchantId___name": "",
					"erpCode": "",
					"addressCode": "",
					"shipregion": 0,
					"shipregion___code": "",
					"shipregion___name": "",
					"regionCode": "",
					"address": "",
					"longitude": 0,
					"latitude": 0,
					"zipCode": "",
					"receiver": "",
					"mobile": "",
					"telePhone": "",
					"email": "",
					"qq": "",
					"weChat": "",
					"isDefault": true,
					"receivingWarehouse": 0,
					"receivingWarehouse___code": "",
					"receivingWarehouse___name": "",
					"remarks": "",
					"stopStatus": "",
					"deliveryAddressErpCode": "",
					"shippingAddressErpCode": "",
					"mergerName": "",
					"pubts": "2026-06-07 11:43:21"
				}
			],
			"customerAreas": [
				{
					"id": 0,
					"merchantId": 0,
					"merchantId___code": "",
					"merchantId___name": "",
					"merchantApplyRangeId": 0,
					"merchantApplyRangeId___code": "",
					"merchantApplyRangeId___name": "",
					"saleAreaId": 0,
					"saleAreaId___code": "",
					"saleAreaId___name": "",
					"isDefault": true,
					"pubts": "2026-06-07 11:43:21"
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

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

