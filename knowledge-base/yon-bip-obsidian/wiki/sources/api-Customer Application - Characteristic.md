---
title: "客户申请单新增-特征"
apiId: "1795183750218252290"
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

# 客户申请单新增-特征

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/customerapply/add

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
| applyCode | string | 否 | 是 | 客户申请单编码，编码规则设置为自动编号，则接口里传了也不生效，以系统的编码规则生成编号为准！ 示例：001 |
| effectType | string | 否 | 是 | 生效类型；0：立即生效，1：未来生效； 示例：0 |
| applicationOrgCode | string | 否 | 是 | 申请组织编码 示例：global00 |
| applicationAreaCode | string | 否 | 否 | 申请区域编码 示例：001 |
| applyReason | string | 否 | 否 | 申请原因 示例：申请原因 |
| applyDepartmentCode | string | 否 | 否 | 部门编码 示例：部门编码 |
| bizOperatorCode | string | 否 | 是 | 申请人编码 示例：申请人编码 |
| effectTime | string | 否 | 否 | 生效时间；当生效类型为未来生效时，生效时间必填！ 示例：2022-08-31 00:00:00 |
| applyDesc | string | 否 | 否 | 备注 示例：备注 |
| customerData | object | 否 | 是 | 客户信息 |
| code | string | 否 | 是 | 客户编码；必填。 示例：客户编码 |
| name | object | 否 | 是 | 客户名称；简体必传； |
| createOrgCode | string | 否 | 是 | 管理组织；必填；填写组织编码 示例：管理组织 |
| transTypeCode | string | 否 | 否 | 客户类型；填写客户类型编码； 示例：客户类型 |
| shortname | object | 否 | 否 | 客户简称 |
| countryName | string | 否 | 否 | 国家；填写国家名称 示例：国家 |
| newTimeZone | string | 否 | 否 | 时区(夏时令)；填写时区枚举编码； 示例：Africa/Abidjan |
| languageCode | string | 否 | 否 | 语言；填写语言编码； 示例：zh_CN |
| parentManageOrgCode | string | 否 | 否 | 上级发展组织；填写组织编码；业务角色为2B商家、2C商家、零售加盟商时必填； 示例：上级发展组织 |
| parentCustomerCode | string | 否 | 否 | 上级客户；填写客户编码 示例：上级客户 |
| suppliersCode | string | 否 | 否 | 对应供应商；填写供应商编码 示例：对应供应商 |
| retailInvestors | boolean | 否 | 否 | 是否散户；true：是，false：否 示例：true 默认值：false |
| internalOrg | boolean | 否 | 否 | 是否内部组织，true：是，false：否 示例：true 默认值：false |
| internalOrgIdCode | string | 否 | 否 | 内部组织；填写组织编码，是否内部组织为是时必填，为否时不需要填写 示例：内部组织 |
| taxPayingCategories | short | 否 | 否 | 纳税类别；0：一般纳税人，1：小规模纳税人，2：海外纳税，99：其他；不传时默认为一般纳税人 示例：0 |
| customerClassCode | string | 否 | 否 | 客户分类；填写客户分类编码 示例：客户分类 |
| customerIndustryCode | string | 否 | 否 | 客户行业；填写客户行业编码 示例：客户行业 |
| developmentPartnerCode | string | 否 | 否 | 发展伙伴；填写发展伙伴编码，引用的档案为客户档案 示例：发展伙伴 |
| enterpriseNature | short | 否 | 是 | 企业类型；0：企业，1：个人，2：其他 示例：0 |
| enterpriseName | string | 否 | 否 | 企业名称；企业类型为企业时填写 示例：企业名称 |
| personName | string | 否 | 否 | 姓名；企业类型为个人时填写并必填 示例：姓名 |
| orgName | string | 否 | 否 | 组织名称；企业类型为其他时填写 示例：组织名称 |
| licenseType | short | 否 | 否 | 证照类型；0：统一社会信用代码，1：营业执照，2：其他证照，3：居民身份证，4：护照，5：其他身份证件；企业类型为企业,证照类型只能输入(统一社会信用代码、其他证照)；企业类型为个人,证照类型只能输入(居民身份证、护照、其他身份证件)；企业类型为其他,证照类型只能输入(统一社会信用代码、营业执照、其他证照) 示例：0 |
| creditCode | string | 否 | 否 | 证照号码/个人证照号；企业类型为企业/其他，为证照号码；企业类型为个人，为个人证照号 示例：证照号码 |
| leaderName | string | 否 | 否 | 法人代表；企业类型为企业时填写！ 示例：法人代表 |
| leaderNameIdNo | string | 否 | 否 | 法人代表身份证号；企业类型为企业时填写！ 示例：法人代表身份证号 |
| personCharge | string | 否 | 否 | 负责人；企业类型为其他时填写！ 示例：负责人 |
| personChargeIdNo | string | 否 | 否 | 负责人身份证号；企业类型为其他时填写！ 示例：负责人身份证号 |
| businessLicenseNo | string | 否 | 否 | 经营许可证号；当企业类型为企业时，填写！否则不填！ 示例：经营许可证号 |
| businessterm | DateTime | 否 | 否 | 营业期限至；资质信息页签下；例如：YYYY-MM-DD 示例：2223-01-01 |
| buildTime | DateTime | 否 | 否 | 成立时间；资质信息页签下；例如：YYYY-MM-DD 示例：2223-01-01 |
| contactName | string | 否 | 否 | 联系人；资质信息页签下 示例：联系人 |
| contactTel | string | 否 | 否 | 联系电话；资质信息页签下 示例：联系电话 |
| address | object | 否 | 否 | 详细地址；资质信息页签下 |
| regionCode | string | 否 | 否 | 注册地区；资质信息页签下；填写地址档案编码 示例：110101000000 |
| email | string | 否 | 否 | 邮箱；资质信息页签下 示例：邮箱 |
| fax | string | 否 | 否 | 传真；资质信息页签下 示例：传真 |
| enterNatureCode | string | 否 | 否 | 企业性质；资质信息页签下，填写企业性质编码！ 示例：企业性质 |
| currencyCode | string | 否 | 否 | 注册资金币种；资质信息页签下 示例：注册资金币种 |
| money | string | 否 | 否 | 注册资金(万计)；资质信息页签下；支持小数点后2位 示例：1.23 |
| peopleNum | long | 否 | 否 | 员工人数；资质信息页签下 示例：100 |
| scopeModel | short | 否 | 否 | 经营模式；0：生产加工，1：批发经销；资质信息页签下 示例：0 |
| yearMoney | string | 否 | 否 | 年营业额(万计)；资质信息页签下；支持小数点后2位 示例：100 |
| scope | object | 否 | 否 | 经营范围；资质信息页签下 |
| website | string | 否 | 否 | 网址；资质信息页签下 示例：网址 |
| wid | string | 否 | 否 | 微信公众号；资质信息页签下 示例：微信公众号 |
| postCode | string | 否 | 否 | 邮编；资质信息页签下 示例：邮编 |
| merchantAddressInfos | object | 是 | 否 | 客户档案地址信息 |
| merchantContactInfos | object | 是 | 否 | 联系人信息 |
| merchantAgentFinancialInfos | object | 是 | 否 | 银行信息 |
| merchantAgentInvoiceInfos | object | 是 | 否 | 发票信息 |
| merchantApplyRanges | object | 是 | 否 | 客户适用范围，新增时如果不传默认按照分级管控范围处理 |
| merchantAppliedDetail | object | 否 | 否 | 客户档案业务信息 |
| merchantRole | object | 否 | 否 | 客户角色信息(营销角色) |
| merchantsManager | object | 否 | 否 | 客户管理员信息（只有业务角色存在时，才可填写！） |
| customerAreas | object | 是 | 否 | 客户档案销售区域 |
| principals | object | 是 | 否 | 客户档案负责人 |
| invoicingCustomers | object | 是 | 否 | 客户档案开票客户 |

## 3. 请求示例

Url: /yonbip/digitalModel/customerapply/add?access_token=访问令牌
Body: {
	"applyCode": "001",
	"effectType": "0",
	"applicationOrgCode": "global00",
	"applicationAreaCode": "001",
	"applyReason": "申请原因",
	"applyDepartmentCode": "部门编码",
	"bizOperatorCode": "申请人编码",
	"effectTime": "2022-08-31 00:00:00",
	"applyDesc": "备注",
	"customerData": {
		"code": "客户编码",
		"name": {
			"simplifiedName": "客户名称-简体",
			"englishName": "客户名称-英文",
			"traditionalName": "客户名称-繁体"
		},
		"createOrgCode": "管理组织",
		"transTypeCode": "客户类型",
		"shortname": {
			"simplifiedName": "客户简称-简体",
			"englishName": "客户简称-英文",
			"traditionalName": "客户简称-繁体"
		},
		"countryName": "国家",
		"newTimeZone": "Africa/Abidjan",
		"languageCode": "zh_CN",
		"parentManageOrgCode": "上级发展组织",
		"parentCustomerCode": "上级客户",
		"suppliersCode": "对应供应商",
		"retailInvestors": true,
		"internalOrg": true,
		"internalOrgIdCode": "内部组织",
		"taxPayingCategories": 0,
		"customerClassCode": "客户分类",
		"customerIndustryCode": "客户行业",
		"developmentPartnerCode": "发展伙伴",
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
		"businessterm": "2223-01-01",
		"buildTime": "2223-01-01",
		"contactName": "联系人",
		"contactTel": "联系电话",
		"address": {
			"simplifiedName": "详细地址-简体",
			"englishName": "详细地址-英文",
			"traditionalName": "详细地址-繁体"
		},
		"regionCode": "110101000000",
		"email": "邮箱",
		"fax": "传真",
		"enterNatureCode": "企业性质",
		"currencyCode": "注册资金币种",
		"money": "1.23",
		"peopleNum": 100,
		"scopeModel": 0,
		"yearMoney": "100",
		"scope": {
			"simplifiedName": "经营范围-简体",
			"englishName": "经营范围-英文",
			"traditionalName": "经营范围-繁体"
		},
		"website": "网址",
		"wid": "微信公众号",
		"postCode": "邮编",
		"merchantAddressInfos": [
			{
				"addressCode": "地址编码",
				"shipregionCode": "运输区域",
				"regionCode": "110101000000",
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
				"fullName": {
					"simplifiedName": "联系人姓名-简体",
					"englishName": "联系人姓名-英文",
					"traditionalName": "联系人姓名-繁体"
				},
				"gender": 0,
				"contactDepartment": "任职部门",
				"positionName": "职务",
				"mobile": "手机号",
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
				"countryName": "国家",
				"provinceCode": "省份",
				"currencyName": "币种",
				"accountType": "0",
				"bankName": "银行类别",
				"openBankName": "银行网点",
				"bankAccount": "银行账号",
				"bankAccountName": {
					"simplifiedName": "账户名称-简体",
					"englishName": "账户名称-英文",
					"traditionalName": "账户名称-繁体"
				},
				"jointLineNo": "联行号",
				"remarks": "备注",
				"accountOpeningAddress": {
					"simplifiedName": "开户地址-简体",
					"englishName": "开户地址-英文",
					"traditionalName": "开户地址-繁体"
				},
				"accountOpeningDate": "2023-05-19 16:52:31",
				"isDefault": true
			}
		],
		"merchantAgentInvoiceInfos": [
			{
				"bdBillingTypeName": "发票类型",
				"title": "发票抬头",
				"taxNo": "税号",
				"receievInvoiceMobile": "收票手机号",
				"receievInvoiceEmail": "收票邮箱",
				"telephone": "电话",
				"address": {
					"simplifiedName": "详细地址-简体",
					"englishName": "详细地址-英文",
					"traditionalName": "详细地址-繁体"
				},
				"bankName": "银行类别",
				"bankDotName": "银行网点",
				"bankAccount": "银行账号",
				"remarks": "备注",
				"isDefault": true
			}
		],
		"merchantApplyRanges": [
			{
				"orgIdCode": "组织"
			}
		],
		"merchantAppliedDetail": {
			"searchCode": "助记码",
			"customerLevelCode": "客户级别",
			"customerTypeCode": "销售渠道",
			"deliveryWarehouseCode": "发货仓库",
			"transactionCurrencyName": "交易币种",
			"exchangeRateTypeCode": "汇率类型",
			"taxRateNtaxRate": "销项税率",
			"payWay": 0,
			"creditServiceDay": 10,
			"collectionAgreementName": "收款协议",
			"settlementMethodName": "结算方式",
			"shipmentMethodName": "发运方式",
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
				"saleAreaIdCode": "销售区域",
				"isDefault": true
			}
		],
		"principals": [
			{
				"specialManagementDepCode": "专管部门",
				"professSalesmanCode": "专管业务员",
				"isDefault": true
			}
		],
		"invoicingCustomers": [
			{
				"isDefault": true,
				"invoicingCustomersIdCode": "开票客户"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 处理结果编码，200：成功，其他：异常 示例：200 |
| message | string | 否 | 结果提示信息，包括成功和失败的提示信息 示例：处理成功 |
| data | object | 否 | 返回的数据 |
| id | long | 否 | 数据id 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "处理成功",
	"data": {
		"id": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

118000	入参不能为空	入参不能为空

999	通用业务校验异常	通用业务校验异常


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

