---
title: "客户档案批量保存V2"
apiId: "2f00a0e0165148da9bcb694ea7f85614"
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

# 客户档案批量保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/digitalModel/batch/merchant/save

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
| data | object | 是 | 是 | 客户档案 |
| merchantApplyRanges | object | 是 | 否 | 客户适用范围，修改客户时，该参数不填 |
| createOrg_name | string | 否 | 否 | 管理组织名称 示例：企业账号级 |
| enterpriseNature | long | 否 | 否 | 企业类型，0:企业、1:个人，2：非盈利组织 示例：0 |
| principals | object | 是 | 否 | 负责人 |
| merchantContacterInfos | object | 是 | 否 | 联系人信息（修改联系人时传入已存在的联系人姓名视作修改该联系人） |
| scopeModel | long | 否 | 否 | 经营模式，0：生产加工，1：批发经销 示例：0 |
| merchantAgentInvoiceInfos | object | 是 | 否 | 发票信息（修改发票信息，传入已存在的开票类型的发票抬头，视作修改该开票信息） |
| idNo | string | 否 | 否 | 身份证号 |
| orgName | string | 否 | 否 | 组织名称 示例：lytest102302 |
| customerClassErpCode | string | 否 | 否 | 客户分类外部编码，该参数和客户分类编码只能填一个 示例：客户分类-企业账号级 |
| customerAreas | object | 是 | 否 | 销售区域 |
| createOrg | string | 否 | 否 | 管理组织id 示例：666666 |
| merchantAddressInfos | object | 是 | 否 | 地址信息（修改地址信息传入已存在地址编码视作修改该地址信息） |
| internalOrg | boolean | 否 | 否 | 是否内部组织，true：是，false：否 示例：false |
| invoicingCustomers_Name | string | 否 | 否 | 开票客户名称 示例：lytest102302 |
| internalOrgId_Name | string | 否 | 否 | 内部组织名称 |
| customerClass | long | 否 | 否 | 客户分类id 示例：1842560147116288 |
| personName | string | 否 | 否 | 姓名 |
| orgIdNo | string | 否 | 否 | 组织证件 |
| org_code | string | 否 | 是 | 管理组织编码 示例：global00 |
| code | string | 否 | 是 | 客户编码 示例：al00-000048 |
| internalOrgId | string | 否 | 否 | 内部组织id |
| retailInvestors | boolean | 否 | 否 | 是否散户，true：是，false：否 示例：false |
| shortname | object | 否 | 否 | 客户简称（多语） |
| merchantAgentFinancialInfos | object | 是 | 否 | 银行信息（修改银行信息时传入已存在银行账号视作修改该银行信息） |
| personCharge | string | 否 | 否 | 负责人，当企业类型选择非营利组织时，才需要填写该参数 |
| personChargeIdNo | string | 否 | 否 | 负责人身份证号，当企业类型选择非营利组织时，才需要填写该参数 |
| taxPayingCategories | long | 否 | 否 | 纳税类别, 0:一般纳税人、1:小规模纳税人、2:海外纳税、99:其他 示例：0 |
| invoicingCustomerss | object | 是 | 否 | 开票客户 |
| enterpriseName | string | 否 | 否 | 企业名称 示例：lytest102302 |
| name | object | 否 | 是 | 客户名称（多语） |
| _status | string | 否 | 是 | Insert：新增客户档案，Update：修改客户档案 示例：Insert |
| customerClass_code | string | 否 | 是 | 客户分类编码 示例：客户分类-企业账号级 |
| transType_Code | string | 否 | 否 | 交易类型编码,商家登录时，不需要输 |
| merchantAppliedDetail | object | 否 | 是 | 客户适用范围详情 |
| merchantRole | object | 否 | 否 | 客户角色信息 |
| merchantsManager | object | 否 | 否 | 客户管理员，当选择了业务角色时，才需要填写该参数 |
| erpCode | string | 否 | 否 | 客户档案外部编码 |
| merchantApplyRangeId | string | 否 | 否 | 客户适用范围id，修改创建组织独有的数据时不用填写 |
| country_name | string | 否 | 否 | 国家；填写国家名称；与国家编码只填写其中一个即可； |
| country_code | string | 否 | 否 | 国家；填写国家编码；与国家名称只填写其中一个即可； |

## 3. 请求示例

Url: /yonbip/digitalModel/batch/merchant/save?access_token=访问令牌
Body: {
	"data": [
		{
			"merchantApplyRanges": [
				{
					"isCreator": true,
					"_status": "Insert",
					"rangeType": 1,
					"orgId": "666666",
					"isApplied": true,
					"orgCode": "global00"
				}
			],
			"createOrg_name": "企业账号级",
			"enterpriseNature": 0,
			"principals": [
				{
					"professSalesman_Code": "456code",
					"specialManagementDep_Code": "456code",
					"_status": "Insert",
					"isDefault": "true",
					"merchantApplyRangeId": ""
				}
			],
			"merchantContacterInfos": [
				{
					"fullName": {
						"zh_CN": "lichi0507",
						"en_US": "",
						"zh_TW": ""
					},
					"gender": "1",
					"positionName": "程序员",
					"mobile": "18846081495",
					"telePhone": "18846081495",
					"email": "2050761966@qq.com",
					"qq": "2050761966",
					"_status": "Insert",
					"isDefault": "true",
					"fullNameExt": "",
					"id": ""
				}
			],
			"scopeModel": 0,
			"merchantAgentInvoiceInfos": [
				{
					"title": "test",
					"billingType": "6",
					"bdBillingType_name": "",
					"isDefault": "true",
					"_status": "Insert",
					"taxNo": "",
					"telephone": "",
					"name": "",
					"bankName": "",
					"bankAccount": "",
					"address": "",
					"remarks": "",
					"receievInvoiceMobile": "",
					"receievInvoiceEmail": "",
					"id": ""
				}
			],
			"idNo": "",
			"orgName": "lytest102302",
			"customerClassErpCode": "客户分类-企业账号级",
			"customerAreas": [
				{
					"saleAreaId": "",
					"saleAreaId_code": "",
					"saleAreaId_name": "",
					"_status": "Insert",
					"merchantApplyRangeId": "",
					"isDefault": "true"
				}
			],
			"createOrg": "666666",
			"merchantAddressInfos": [
				{
					"addressCode": "",
					"address": "",
					"zipCode": "",
					"receiver": "",
					"mobile": "",
					"telePhone": "",
					"email": "",
					"qq": "",
					"_status": "Insert",
					"id": "",
					"stopStatus": ""
				}
			],
			"internalOrg": false,
			"invoicingCustomers_Name": "lytest102302",
			"internalOrgId_Name": "",
			"customerClass": 1842560147116288,
			"personName": "",
			"orgIdNo": "",
			"org_code": "global00",
			"code": "al00-000048",
			"internalOrgId": "",
			"retailInvestors": false,
			"shortname": {
				"zh_CN": "lytest102302",
				"en_US": "",
				"zh_TW": ""
			},
			"merchantAgentFinancialInfos": [
				{
					"accountType": "0",
					"isDefault": "true",
					"country": "",
					"country_name": "",
					"province": "",
					"currency": "",
					"bank": "",
					"openBank": "",
					"jointLineNo": "",
					"swiftCode": "",
					"bankAccount": "",
					"_status": "",
					"bankAccountName": "",
					"id": "",
					"accountOpeningAddress": ""
				}
			],
			"personCharge": "",
			"personChargeIdNo": "",
			"taxPayingCategories": 0,
			"invoicingCustomerss": [
				{
					"isDefault": "true",
					"invoicingCustomersId": "",
					"invoicingCustomersId_code": "",
					"_status": "Insert"
				}
			],
			"enterpriseName": "lytest102302",
			"name": {
				"zh_CN": "lytest102302",
				"en_US": "",
				"zh_TW": ""
			},
			"_status": "Insert",
			"customerClass_code": "客户分类-企业账号级",
			"transType_Code": "",
			"merchantAppliedDetail": {
				"merchantApplyRangeId": "",
				"customerLevel_Code": "666code",
				"settlementMethod": "444",
				"stopstatus": false,
				"frozenState": 0,
				"settlementMethod_Code": "444code",
				"shipmentMethod": "555",
				"shipmentMethod_Code": "555code",
				"deliveryWarehouse_Code": "123code",
				"deliveryWarehouse": "123123",
				"transactionCurrency_Code": "456code",
				"payway": 99,
				"transactionCurrency": "456456",
				"signBack": false,
				"taxRate_Code": "456code",
				"searchcode": "lytest102302",
				"taxRate": "456456",
				"_status": "Insert",
				"customerLevel": "666"
			},
			"merchantRole": {
				"businessRole": "",
				"merchantOptions": "false",
				"_status": "Insert",
				"toBImmigrationMode": "0",
				"cardType": "0"
			},
			"merchantsManager": {
				"_status": "Insert",
				"userName": "",
				"mobile": "",
				"fullName": "",
				"email": "",
				"qq": "",
				"expireDate": ""
			},
			"erpCode": "",
			"merchantApplyRangeId": "",
			"country_name": "",
			"country_code": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | long | 否 | 200：API调用成功，其它：失败 示例：200 |
| message | string | 否 | 调用结果 示例：操作成功 |
| data | object | 否 | 返回数据 |
| createOrg | string | 否 | 管理组织id 示例：666666 |
| createOrg_name | string | 否 | 管理组织名称 示例：企业账号级 |
| createOrg_code | string | 否 | 管理组织编码 示例：global00 |
| code | string | 否 | 客户编码 示例：al00-000048 |
| name | object | 否 | 客户名称（多语） |
| shortname | object | 否 | 客户简称（多语） |
| invoicingCustomers_Name | string | 否 | 开票客户名称 示例：lytest102302 |
| retailInvestors | boolean | 否 | 散户, true:是、false:否、 示例：false |
| internalOrg | boolean | 否 | 组织id 示例：false |
| internalOrgId_Name | string | 否 | 内部组织 |
| taxPayingCategories | long | 否 | 纳税类别, 0:一般纳税人、1:小规模纳税人、2:海外纳税、99:其他 示例：0 |
| customerClass | long | 否 | 客户分类id 示例：1842560147116288 |
| customerClassErpCode | string | 否 | 客户分类外部编码 示例：客户分类-企业账号级 |
| customerClass_path | string | 否 | 客户分类路径 示例：1842560147116288| |
| customerClass_code | string | 否 | 客户分类编码 示例：客户分类-企业账号级 |
| merchantRole | object | 否 | 客户角色 |
| enterpriseNature | long | 否 | 企业类型, 0:企业、1:个人、2:非营利组织、 示例：0 |
| enterpriseName | string | 否 | 企业名称 示例：lytest102302 |
| orgName | string | 否 | 组织名称 示例：lytest102302 |
| scopeModel | long | 否 | 经营模式, 0:生产加工、1:批发经销、 示例：0 |
| createTime | string | 否 | 创建时间 示例：2020-10-23 16:37:17 |
| verfyMark | long | 否 | 核实状态, 0:未核实、1:已核实、 示例：0 |
| merchantAgentInvoiceInfos | object | 是 | 发票信息 |
| customerAreas | object | 是 | 销售区域 |
| principals | object | 是 | 负责人 |
| invoicingCustomerss | object | 是 | 开票客户 |
| merchantAddressInfos | object | 是 | 地址信息 |
| merchantContacterInfos | object | 是 | 联系人信息 |
| merchantAgentFinancialInfos | object | 是 | 银行信息 |
| merchantApplyRanges | object | 是 | 客户适用范围 |
| id | long | 否 | 客户档案id 示例：1970048813469952 |
| isEnabled | boolean | 否 | 停用状态, false:启用、true:停用、 示例：true |
| invoicingCustomers | long | 否 | 开票客户id 示例：1970048813469952 |
| entityStatus | string | 否 | 实体状态 示例：Insert |
| businessRole | string | 否 | 业务角色, 1:客户、2:零售加盟商、3:零售终端客户、4:商城入驻商家、6:订货入驻商家、 示例：1 |
| creatorType | long | 否 | 创建者类型，0:租户、1:组织、2:加盟商（客户）、3:入驻商家 默认值为0 示例：0 |
| isStop | boolean | 否 | true：已停用，false：已启用 示例：false |
| isCreator | boolean | 否 | 是否创建者, true:是、false:否、 示例：true |
| merchantApplyRangeId | long | 否 | 客户适用范围id 示例：0 |
| creator | string | 否 | 创建者 示例：19908688888 |
| creatorId | long | 否 | 创建者id 示例：1838010623856896 |
| createDate | string | 否 | 创建日期 示例：2020-10-23 16:37:17 |
| tenant | long | 否 | 租户id 示例：1838010622546176 |
| pubts | string | 否 | 时间戳 示例：2020-10-23 16:37:18 |
| merchantsManager | object | 否 | 客户管理员 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"createOrg": "666666",
		"createOrg_name": "企业账号级",
		"createOrg_code": "global00",
		"code": "al00-000048",
		"name": {
			"zh_CN": "lytest102302",
			"en_US": "",
			"zh_TW": ""
		},
		"shortname": {
			"zh_CN": "lytest102302",
			"en_US": "",
			"zh_TW": ""
		},
		"invoicingCustomers_Name": "lytest102302",
		"retailInvestors": false,
		"internalOrg": false,
		"internalOrgId_Name": "",
		"taxPayingCategories": 0,
		"customerClass": 1842560147116288,
		"customerClassErpCode": "客户分类-企业账号级",
		"customerClass_path": "1842560147116288|",
		"customerClass_code": "客户分类-企业账号级",
		"merchantRole": {
			"businessRole": "1",
			"toBImmigrationMode": 0,
			"settlementMethod": 0,
			"cardType": 0,
			"id": 1970048813486348,
			"merchantId": 1970048813469952,
			"tenant": 1838010622546176,
			"merchantOptions": "",
			"_status": ""
		},
		"enterpriseNature": 0,
		"enterpriseName": "lytest102302",
		"orgName": "lytest102302",
		"scopeModel": 0,
		"createTime": "2020-10-23 16:37:17",
		"verfyMark": 0,
		"merchantAgentInvoiceInfos": [
			{
				"title": "",
				"billingType": "",
				"isDefault": "",
				"_status": "Insert",
				"taxNo": "",
				"telephone": "",
				"name": "",
				"bankName": "",
				"bankAccount": "",
				"address": "",
				"remarks": "",
				"receievInvoiceMobile": "",
				"receievInvoiceEmail": ""
			}
		],
		"customerAreas": [
			{
				"isDefault": "true",
				"saleAreaId": "",
				"saleAreaId_code": "",
				"saleAreaId_name": "",
				"_status": ""
			}
		],
		"principals": [
			{
				"professSalesman_Code": "",
				"specialManagementDep_Code": "",
				"_status": "Insert",
				"isDefault": "true"
			}
		],
		"invoicingCustomerss": [
			{
				"isDefault": "",
				"invoicingCustomersId": "",
				"_status": ""
			}
		],
		"merchantAddressInfos": [
			{
				"isDefault": "",
				"addressCode": "",
				"address": "",
				"zipCode": "",
				"receiver": "",
				"mobile": "",
				"telePhone": "",
				"email": "",
				"qq": "",
				"_status": "",
				"stopStatus": ""
			}
		],
		"merchantContacterInfos": [
			{
				"fullName": {
					"zh_CN": "",
					"en_US": "",
					"zh_TW": ""
				},
				"gender": "1",
				"positionName": "",
				"mobile": "",
				"telePhone": "",
				"email": "",
				"qq": "",
				"_status": "",
				"isDefault": "true"
			}
		],
		"merchantAgentFinancialInfos": [
			{
				"accountType": "",
				"isDefault": "",
				"country": "",
				"province": "",
				"currency": "",
				"bank": "",
				"openBank": "",
				"jointLineNo": "",
				"swiftCode": "",
				"bankAccount": "",
				"_status": "",
				"bankAccountName": "",
				"accountOpeningAddress": ""
			}
		],
		"merchantApplyRanges": [
			{
				"rangeType": 1,
				"isCreator": true,
				"isApplied": true,
				"hasDefaultInit": true,
				"orgId": "666666",
				"tenant": 1838010622546176,
				"orgCode": "global00",
				"orgName": "企业账号级",
				"id": 1970048814158080,
				"merchantId": 1970048813469952,
				"merchantAppliedDetail": {
					"searchcode": "",
					"payway": 99,
					"signBack": false,
					"stopstatus": false,
					"frozenState": 0,
					"id": 123456789,
					"modifyTime": "2020-10-23 16:37:17",
					"modifier": 123456789,
					"createTime": "2020-10-23 16:37:17",
					"creator": 123456789,
					"merchantApplyRangeId": 123456789,
					"tenant": 123456789
				}
			}
		],
		"id": 1970048813469952,
		"isEnabled": true,
		"invoicingCustomers": 1970048813469952,
		"entityStatus": "Insert",
		"businessRole": "1",
		"creatorType": 0,
		"isStop": false,
		"isCreator": true,
		"merchantApplyRangeId": 0,
		"creator": "19908688888",
		"creatorId": 1838010623856896,
		"createDate": "2020-10-23 16:37:17",
		"tenant": 1838010622546176,
		"pubts": "2020-10-23 16:37:18",
		"merchantsManager": {
			"_status": "",
			"countryCode": "",
			"userName": "",
			"mobile": "",
			"fullName": "",
			"email": "",
			"qq": "",
			"expireDate": ""
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	检查入参是否填写正确，参数值是否真实存在，仍提示该信息请联系开发人员。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-15

更新

请求说明

新增

请求参数 isDefault

删除

请求参数 (6)

删除

返回参数 (6)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

