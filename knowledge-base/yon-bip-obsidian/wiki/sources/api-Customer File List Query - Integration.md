---
title: "客户档案列表查询-集成"
apiId: "2051147892524056580"
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

# 客户档案列表查询-集成

> `ContentType	application/json` 请求方式	POST | 分类: Customer (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/merchant/newlistrange

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
| id | long | 否 | 否 | 客户id； 示例：1731971993608650753 |
| code | string | 否 | 否 | 客户编码； 示例：客户编码 |
| name | string | 否 | 否 | 客户名称; 示例：客户名称 |
| createOrgId | string | 否 | 否 | 管理组织id； 示例：管理组织id |
| createOrgCode | string | 否 | 否 | 管理组织编码； 示例：管理组织编码 |
| customerClassId | long | 否 | 否 | 客户分类id； 示例：1731971993608650753 |
| customerClassCode | string | 否 | 否 | 客户分类编码； 示例：客户分类编码 |
| customerIndustryId | long | 否 | 否 | 客户行业Id； 示例：1731971993608650753 |
| customerIndustryCode | string | 否 | 否 | 客户行业编码； 示例：客户行业编码 |
| internalOrg | boolean | 否 | 否 | 是否内部组织；true：是，false：否； 示例：false |
| internalOrgIdId | string | 否 | 否 | 内部组织Id； 示例：内部组织Id |
| internalOrgIdCode | string | 否 | 否 | 内部组织编码； 示例：内部组织编码 |
| suppliersId | long | 否 | 否 | 对应供应商Id； 示例：1731971993608650753 |
| filterPotential | boolean | 否 | 否 | 过滤潜客；非必填，如果值为空，或者值=false，或者不传这个参数则查询全部客户包括潜客，如果值=true，则过滤掉潜在客户。 示例：false 默认值：true |
| suppliersCode | string | 否 | 否 | 对应供应商编码； 示例：对应供应商编码 |
| creditCode | string | 否 | 否 | 证照号码 示例：code001 |
| creditCodeList | string | 是 | 否 | 证照号码列表 示例：["zzhm01"] |
| beganTime | DateTime | 否 | 否 | 开始时间； 示例：2023-05-27 15:00:00 |
| endTime | DateTime | 否 | 否 | 结束时间； 示例：2023-05-27 15:29:34 |
| pubts | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 时间戳，大于(包含)当前值 示例：2024-04-10 14:50:00 |
| pageIndex | long | 否 | 是 | 分页页码；默认为1； 示例：1 默认值：1 |
| pageSize | long | 否 | 是 | 分页大小；默认为500，最大为5000； 示例：20 默认值：500 |

## 3. 请求示例

Url: /yonbip/digitalModel/merchant/newlistrange?access_token=访问令牌
Body: {
	"id": 1731971993608650753,
	"code": "客户编码",
	"name": "客户名称",
	"createOrgId": "管理组织id",
	"createOrgCode": "管理组织编码",
	"customerClassId": 1731971993608650753,
	"customerClassCode": "客户分类编码",
	"customerIndustryId": 1731971993608650753,
	"customerIndustryCode": "客户行业编码",
	"internalOrg": false,
	"internalOrgIdId": "内部组织Id",
	"internalOrgIdCode": "内部组织编码",
	"suppliersId": 1731971993608650753,
	"filterPotential": false,
	"suppliersCode": "对应供应商编码",
	"creditCode": "code001",
	"creditCodeList": [
		"zzhm01"
	],
	"beganTime": "2023-05-27 15:00:00",
	"endTime": "2023-05-27 15:29:34",
	"pubts": "2024-04-10 14:50:00",
	"pageIndex": 1,
	"pageSize": 20
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
				"id": 1700194312096055299,
				"code": "客户编码",
				"name": {
					"simplifiedName": "简体",
					"englishName": "英文",
					"traditionalName": "繁体"
				},
				"createOrgId": "1700194312096055299",
				"createOrgCode": "管理组织编码",
				"belongOrgId": "1700194312096055299",
				"belongOrgCode": "使用组织编码",
				"transTypeId": "1700194312096055299",
				"transTypeCode": "客户类型编码",
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
				"parentManageOrgId": "1700194312096055299",
				"parentManageOrgCode": "上级发展组织编码",
				"parentCustomerId": 1700194312096055299,
				"parentCustomerCode": "上级客户编码",
				"suppliersId": 1700194312096055299,
				"suppliersCode": "对应供应商编码",
				"retailInvestors": false,
				"internalOrg": false,
				"internalOrgIdId": "1700194312096055299",
				"internalOrgIdCode": "内部组织编码",
				"taxPayingCategories": 0,
				"customerClassId": 1700194312096055299,
				"customerClassCode": "客户分类编码",
				"customerIndustryId": 1700194312096055299,
				"customerIndustryCode": "客户行业编码",
				"developmentPartnerId": 1700194312096055299,
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
				"businessterm": "2023-02-01",
				"buildTime": "2023-02-01",
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
				"enterNatureId": "1700194312096055299",
				"enterNatureCode": "企业性质编码",
				"currencyCode": "注册资金币种",
				"money": "100",
				"peopleNum": 100,
				"scopeModel": 0,
				"yearMoney": "100.02",
				"scope": {
					"simplifiedName": "简体",
					"englishName": "英文",
					"traditionalName": "繁体"
				},
				"website": "网址",
				"wid": "微信公众号",
				"postCode": "邮编",
				"stopStatus": false,
				"createTime": "2024-06-21 00:00:00",
				"modifyTime": "2024-06-21 00:00:00",
				"merchantApplyRanges": [
					{
						"id": "1981473026069757963",
						"orgId": "1981473026069757964",
						"orgIdCode": "new41005"
					}
				]
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

