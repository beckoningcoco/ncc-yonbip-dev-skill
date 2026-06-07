---
title: "供应商申请批量保存"
apiId: "1903504483297001474"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier Application"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商申请批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Supplier Application (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/vendorApply/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 供应商申请数据 |
| code | string | 否 | 否 | 申请编码，接入编码规则时，会以编码规则生成的编码为准 示例：code-00001 |
| salesman | string | 否 | 否 | 所属人员ID,与salesman_code 2选1填写即可，但不能同时为空 |
| salesman_code | string | 否 | 否 | 所属人员编码 示例：00000002 |
| applyOrgId | string | 否 | 否 | 所属组织ID，与applyOrgId_code 2选1填写即可，但不能同时为空 |
| applyOrgId_code | string | 否 | 否 | 所属组织编码 示例：1208-01 |
| applyDepartmentId | string | 否 | 否 | 所属部门ID，与applyDepartmentId_code 2选1填写即可，但不能同时为空 |
| applyDepartmentId_code | string | 否 | 否 | 所属部门编码 示例：zho |
| applyReason | string | 否 | 否 | 申请原因 |
| vendorType | string | 否 | 是 | 单据类型。0：新增申请，1：变更申请 示例：0 默认值：0 |
| memo | string | 否 | 否 | 申请备注 |
| org | string | 否 | 否 | 管理组织ID，和org_code不能同时为空 |
| org_code | string | 否 | 否 | 管理组织编码，和org不能同时为空 示例：global00 |
| usedOrg | string | 否 | 否 | 使用组织ID,新增申请时与org保持一致,与usedOrg_code不能同时为空 |
| usedOrg_code | string | 否 | 否 | 使用组织编码，新增申请时和org_code保持一致，与usedOrg不可同时为空 示例：global00 |
| transType | string | 否 | 否 | 交易类型ID，与transType_code 2选1填写即可 |
| transType_code | string | 否 | 否 | 交易类型编码 示例：GYSSQ001 |
| vendorCode | string | 否 | 否 | 供应商编码 |
| name | object | 否 | 是 | 供应商名称,支持多语 |
| vendorclass | string | 否 | 否 | 供应商分类id，与vendorclass_code不能同时为空 |
| vendorclass_code | string | 否 | 否 | 供应商分类编码，与vendorclass不能同时为空 |
| taxPayingCategories | string | 否 | 否 | 纳税类别, 0:一般纳税人、1:小规模纳税人、2:海外纳税、99:其他 |
| country | string | 否 | 否 | 国家地区ID，与country_code 2选1填写即可 |
| country_code | string | 否 | 否 | 国家地区编码,与country 2选1填写即可 示例：CN |
| language | string | 否 | 否 | 语言id，与language_code 2选1填写即可 |
| language_code | string | 否 | 否 | 语言编码，与language 2选1填写即可 示例：en_US |
| timeZone | string | 否 | 否 | 时区 示例：Asia/Shanghai |
| correspondingorg | string | 否 | 否 | 对应组织ID，有值时说明为内部供应商，与 correspondingorg_code 2选1填写即可 |
| correspondingorg_code | string | 否 | 否 | 对应组织编码，有值时说明为内部供应商，与correspondingorg 2选1填写即可 |
| correspondingcust | string | 否 | 否 | 对应客户ID，与correspondingcust_code 2选1填写即可 |
| correspondingcust_code | string | 否 | 否 | 对应客户编码，与correspondingcust 2选1填写即可 示例：0000test000005 |
| parentVendor | string | 否 | 否 | 上级供应商id，与parentVendor_code 2选1填写即可 |
| parentVendor_code | string | 否 | 否 | 上级供应商编码，与parentVendor 2选1填写即可 示例：0000001 |
| retailInvestors | boolean | 否 | 否 | 散户, true:是、false:否 示例：false |
| supplyType | string | 否 | 否 | 供应商类型(枚举)。0：企业，1：个人，2：其他 示例：0 |
| licenseType | string | 否 | 否 | 证照类型(枚举)。businessLicense:统一社会信用代码,idCard:居民身份证,idNumber:身份识别码,otherIDCard:其他身份证件,otherLicenses:其他证照,passport:护照,unifiedNumber:统一编号,uniqueIDCode:唯一标识码 示例：businessLicense |
| creditcode | string | 否 | 否 | 证照号码 |
| registerCurrency | string | 否 | 否 | 注册资本币种ID，与registerCurrency_code 2选1填写即可 |
| registerCurrency_code | string | 否 | 否 | 注册资本币种编码 示例：CNY |
| registerFund | string | 否 | 否 | 注册资本 |
| companytype | string | 否 | 否 | 企业类型，0:生产商，1:代理商，2:服务商，3:其他，4:贸易商 示例：0 |
| foundDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 成立日期 示例：2024-01-01 00:00:00 |
| legalBody | string | 否 | 否 | 法定代表人 |
| contactphone | string | 否 | 否 | 联系电话 |
| region | string | 否 | 否 | 注册地区ID，与 regionCode 保持一致 示例：110102000000 |
| regionCode | string | 否 | 否 | 注册地区编码，与 region 保持一致 示例：110102000000 |
| address | string | 否 | 否 | 注册地址 |
| serviceRange | string | 否 | 否 | 经营范围 |
| vendorphone | string | 否 | 否 | 固定电话 |
| vendoraddress | string | 否 | 否 | 通信地址 |
| vendorzipcode | string | 否 | 否 | 邮政编码 |
| vendoremail | string | 否 | 否 | 电子邮箱 |
| wechatpublicaccount | string | 否 | 否 | 微信公众号 |
| vendorfax | string | 否 | 否 | 传真 |
| vendorWebUrl | string | 否 | 否 | 网站地址 |
| trade | string | 否 | 否 | 所属行业(枚举)。1 :计算机硬件/网络设备,2 :计算机软件,3 :IT服务（系统/数据/维护）/多领域经营,4 :互联网/电子商务,5 :网络游戏,6 :通讯（设备/运营/增值服务）,7 :电子技术/半导体/集成电路,8 :仪器仪表及工业自动化,9 :金融/银行/投资/基金/证券,10:保险,11:房地产/建筑/建材/工程,12:家居/室内设计/装饰装潢,13:物业管理/商业中心,14:广告/会展/公关/市场推广,15:媒体/出版/影视/文化/艺术,16:印刷/包装/造纸,17:咨询/管理产业/法律/ 示例：10 |
| cooperationdate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 首次合作日期 示例：2024-01-01 00:00:00 |
| applySource | string | 否 | 否 | 供应商来源 |
| cust | string | 否 | 否 | 所属商家ID |
| cust_code | string | 否 | 否 | 所属商家编码 |
| erpCode | string | 否 | 否 | 外部编码 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert 默认值：Insert |
| id | string | 否 | 否 | 供应商申请id，新增时无需填写，修改时必填 |
| vendorextends | object | 否 | 是 | 供应商申请业务属性 |
| vendorQualifies | object | 是 | 否 | 供应商申请资质 |
| vendorcontactss | object | 是 | 否 | 供应商申请联系人信息 |
| vendorbanks | object | 是 | 否 | 供应商申请银行信息 |
| vendorAddresses | object | 是 | 否 | 地址信息 |
| vendorOrgs | object | 否 | 否 | 供应商申请适用范围，若适用范围不填写，默认根据基础数据分级管理范围自动分配，若适用范围填写，则以填写的为准。 |

## 3. 请求示例

Url: /yonbip/digitalModel/vendorApply/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"code": "code-00001",
			"salesman": "",
			"salesman_code": "00000002",
			"applyOrgId": "",
			"applyOrgId_code": "1208-01",
			"applyDepartmentId": "",
			"applyDepartmentId_code": "zho",
			"applyReason": "",
			"vendorType": "0",
			"memo": "",
			"org": "",
			"org_code": "global00",
			"usedOrg": "",
			"usedOrg_code": "global00",
			"transType": "",
			"transType_code": "GYSSQ001",
			"vendorCode": "",
			"name": {
				"zh_CN": "中文",
				"en_US": "英文",
				"zh_TW": "繁体"
			},
			"vendorclass": "",
			"vendorclass_code": "",
			"taxPayingCategories": "",
			"country": "",
			"country_code": "CN",
			"language": "",
			"language_code": "en_US",
			"timeZone": "Asia/Shanghai",
			"correspondingorg": "",
			"correspondingorg_code": "",
			"correspondingcust": "",
			"correspondingcust_code": "0000test000005",
			"parentVendor": "",
			"parentVendor_code": "0000001",
			"retailInvestors": false,
			"supplyType": "0",
			"licenseType": "businessLicense",
			"creditcode": "",
			"registerCurrency": "",
			"registerCurrency_code": "CNY",
			"registerFund": "",
			"companytype": "0",
			"foundDate": "2024-01-01 00:00:00",
			"legalBody": "",
			"contactphone": "",
			"region": "110102000000",
			"regionCode": "110102000000",
			"address": "",
			"serviceRange": "",
			"vendorphone": "",
			"vendoraddress": "",
			"vendorzipcode": "",
			"vendoremail": "",
			"wechatpublicaccount": "",
			"vendorfax": "",
			"vendorWebUrl": "",
			"trade": "10",
			"cooperationdate": "2024-01-01 00:00:00",
			"applySource": "",
			"cust": "",
			"cust_code": "",
			"erpCode": "",
			"_status": "Insert",
			"id": "",
			"vendorextends": {
				"id": "",
				"taxitems": "",
				"taxitems_code": "NL",
				"invoicevendor": "",
				"invoicevendor_code": "",
				"priceTag": "0",
				"settlemethod": "",
				"settlemethod_code": "",
				"currency": "",
				"currency_code": "",
				"exchangeratetype": "",
				"exchangeratetype_code": "",
				"department": "",
				"department_code": "",
				"person": "",
				"person_code": "AH00000280",
				"simplename": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"helpcode": "testcode",
				"paymentagreement": "",
				"paymentagreement_code": "1025dr3",
				"creditServiceDay": 0,
				"shipvia": "",
				"shipvia_code": "system_0001",
				"remark": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"shipregion": 0,
				"shipregion_code": "0002",
				"invoiceBizType": "",
				"stopstatus": true,
				"financialSynergy": false,
				"lifecycleStatus": "",
				"lifecycleStatus_code": "0",
				"riskStatus": "",
				"cooperationLevel": "",
				"cooperationLevel_code": "1",
				"_status": "Insert"
			},
			"vendorQualifies": [
				{
					"id": 0,
					"qualifydoc": "1",
					"qualifyGrade": "",
					"qualifyCode": "",
					"longEffective": true,
					"qualifyDate": "2024-01-01 00:00:00",
					"qualifyExpDate": "2024-11-05 00:00:00",
					"remark": "",
					"_status": "Insert"
				}
			],
			"vendorcontactss": [
				{
					"id": "",
					"contactname": "",
					"gender": "1",
					"position": {
						"zh_CN": "中文",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"mobileCountrycode": "",
					"contactmobile": "",
					"contactphone": "",
					"contactemail": "",
					"qq": "",
					"WeChat": "",
					"defaultcontact": true,
					"udhcontact": false,
					"umallcontact": false,
					"memo": {
						"zh_CN": "中文",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"_status": "Insert"
				}
			],
			"vendorbanks": [
				{
					"id": "",
					"country": "0040be98-735b-44c0-afe5-54d11a96037b",
					"country_code": "CN",
					"province": "",
					"currency": "",
					"currency_code": "CNY",
					"bank": "",
					"bank_code": "001",
					"openaccountbank": "",
					"openaccountbank_code": "001290031291",
					"account": "",
					"accountname": "",
					"correspondentcode": "",
					"accountType": "",
					"defaultbank": true,
					"region": "",
					"regionCode": "",
					"receiveAddress": "",
					"stopstatus": true,
					"memo": {
						"zh_CN": "中文",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"_status": "Insert"
				}
			],
			"vendorAddresses": [
				{
					"id": "",
					"_status": "Insert",
					"addressName": "",
					"country": "",
					"country_code": "CN",
					"region": "",
					"detailAddress": "",
					"zipcode": "072650",
					"longitude": "",
					"latitude": "",
					"contact": "",
					"isDefault": true,
					"addressType": "1",
					"memo": "",
					"shipregion": "",
					"shipregion_code": "0002"
				}
			],
			"vendorOrgs": {
				"id": "",
				"org": "",
				"org_code": "global00",
				"isCreator": true,
				"isApplied": true,
				"_status": "Insert"
			}
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| count | long | 否 | count 示例：1 |
| sucessCount | long | 否 | sucessCount 示例：1 |
| failCount | long | 否 | failCount 示例：0 |
| messages | string | 是 | messages |
| infos | object | 是 | infos |
| failInfos | string | 是 | failInfos |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"code": "000014",
				"salesman": "1530461052833103872",
				"salesman_code": "nijb",
				"applyOrgId": "1758501353729556488",
				"applyDepartmentId": "1758502530574712834",
				"vendorType": 0,
				"org": "666666",
				"org_code": "global00",
				"usedOrg": "1525652227072458756",
				"usedOrg_code": "pkm00",
				"transType": "1711032129464827912",
				"transType_code": "GYSSQ001",
				"name": {
					"zh_CN": "中文",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"vendorclass": 1701733353482354700,
				"vendorclass_code": "DDD-000",
				"country": "0040be98-735b-44c0-afe5-54d11a96037b",
				"country_code": "CN",
				"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c1",
				"language_code": "en_US",
				"timeZone": "Asia/Shanghai",
				"correspondingcust": 1529394629625512000,
				"correspondingcust_code": "0000test000005",
				"parentVendor": 1685376683498537000,
				"parentVendor_code": "0000001",
				"retailInvestors": false,
				"supplyType": 0,
				"licenseType": "businessLicense",
				"registerCurrency": "1623643074168094746",
				"registerCurrency_code": "CNY",
				"companytype": "0",
				"foundDate": "2024-01-01 00:00:00",
				"region": "110102000000",
				"regionCode": "110102000000",
				"trade": 10,
				"cooperationdate": "2024-01-01 00:00:00",
				"cust_code": "",
				"id": 1904895468396085200,
				"vendorextends": {
					"id": 1904895468396085200,
					"taxitems": "10000",
					"taxitems_code": "NL",
					"invoicevendor": 1127454191128832,
					"priceTag": "0",
					"person": "1575352171277844483",
					"person_code": "AH00000280",
					"simplename": {
						"zh_CN": "中文",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"helpcode": "testcode",
					"paymentagreement": 1866390416651190300,
					"paymentagreement_code": "1025dr3",
					"creditServiceDay": 0,
					"shipvia": 1525649083156923100,
					"shipvia_code": "system_0001",
					"remark": {
						"zh_CN": "中文",
						"en_US": "英文",
						"zh_TW": "繁体"
					},
					"shipregion": 1556642778329383000,
					"shipregion_code": "0002",
					"invoicevendor_code": "",
					"stopstatus": true,
					"financialSynergy": false,
					"lifecycleStatus": 1630350644832370700,
					"lifecycleStatus_code": "0",
					"cooperationLevel": 1758464459983028200,
					"cooperationLevel_code": "1",
					"lifecycleStatus__transferValue": true,
					"shipregion__transferValue": true,
					"shipvia__transferValue": true,
					"taxitems__transferValue": true,
					"paymentagreement__transferValue": true,
					"person__transferValue": true,
					"vendor": 1904895468396085200,
					"modifier": "默认用户",
					"modifyDate": "2024-01-11 15:43:39",
					"modifyTime": "2024-01-11 15:43:39",
					"creator": "默认用户",
					"pubts": "2024-01-11 15:43:42",
					"tenant": 2909930715861584,
					"ytenant": "0000L6YQ8AVLFUZPXD0000",
					"yTenantId": "0000L6YQ8AVLFUZPXD0000"
				},
				"vendorcontactss": [
					{
						"id": 1904895468396085200,
						"gender": 1,
						"position": {
							"zh_CN": "中文",
							"en_US": "英文",
							"zh_TW": "繁体"
						},
						"defaultcontact": true,
						"udhcontact": false,
						"umallcontact": false,
						"memo": {
							"zh_CN": "中文",
							"en_US": "英文",
							"zh_TW": "繁体"
						},
						"vendor": 1904895468396085200,
						"pubts": "2024-01-11 15:43:42",
						"tenant": 2909930715861584,
						"ytenant": "0000L6YQ8AVLFUZPXD0000",
						"yTenantId": "0000L6YQ8AVLFUZPXD0000"
					}
				],
				"vendorbanks": [
					{
						"id": 1904895468396085200,
						"country": "0040be98-735b-44c0-afe5-54d11a96037b",
						"country_code": "CN",
						"currency": "1623643074168094746",
						"currency_code": "CNY",
						"bank": "1530664118898393101",
						"bank_code": "001",
						"openaccountbank": "1845575287155195912",
						"openaccountbank_code": "ying009",
						"defaultbank": true,
						"stopstatus": false,
						"memo": {
							"zh_CN": "中文",
							"en_US": "英文",
							"zh_TW": "繁体"
						},
						"bank__transferValue": true,
						"currency__transferValue": true,
						"openaccountbank__transferValue": true,
						"country__transferValue": true,
						"vendor": 1904895468396085200,
						"pubts": "2024-01-11 15:43:42",
						"tenant": 2909930715861584,
						"ytenant": "0000L6YQ8AVLFUZPXD0000",
						"yTenantId": "0000L6YQ8AVLFUZPXD0000"
					}
				],
				"vendorOrgs": [
					{
						"id": 1904895468396085200,
						"org": "666666",
						"isCreator": false,
						"isApplied": false,
						"vendororg": 1904895468396085200,
						"isChangedOrg": 0,
						"pubts": "2024-01-11 15:43:42",
						"tenant": 2909930715861584,
						"ytenant": "0000L6YQ8AVLFUZPXD0000",
						"yTenantId": "0000L6YQ8AVLFUZPXD0000"
					}
				],
				"vendorQualifies": [
					{
						"id": 1904895468396085200,
						"qualifydoc": 1,
						"longEffective": true,
						"qualifyDate": "2024-01-01 00:00:00",
						"qualifyExpDate": "2024-11-05 00:00:00",
						"vendor": 1904895468396085200,
						"pubts": "2024-01-11 15:43:42",
						"ytenant": "0000L6YQ8AVLFUZPXD0000",
						"yTenantId": "0000L6YQ8AVLFUZPXD0000"
					}
				],
				"vendorAddresses": [
					{
						"id": 1904895468396085200,
						"country": "0040be98-735b-44c0-afe5-54d11a96037b",
						"country_code": "CN",
						"zipcode": "072650",
						"isDefault": true,
						"addressType": 1,
						"shipregion": 1556642778329383000,
						"shipregion_code": "0002",
						"country__transferValue": true,
						"vendor": 1904895468396085200,
						"pubts": "2024-01-11 15:43:42",
						"ytenant": "0000L6YQ8AVLFUZPXD0000",
						"yTenantId": "0000L6YQ8AVLFUZPXD0000"
					}
				],
				"vendorclass__transferValue": true,
				"parentVendor__transferValue": true,
				"country__transferValue": true,
				"usedOrg__transferValue": true,
				"org__transferValue": true,
				"language__transferValue": true,
				"transType__transferValue": true,
				"correspondingcust__transferValue": true,
				"registerCurrency__transferValue": true,
				"salesman__transferValue": true,
				"extSystemCode": 17,
				"status": 0,
				"isWfControlled": true,
				"verifystate": 0,
				"pubts": "2024-01-11 15:43:42",
				"tenant": 2909930715861584,
				"ytenant": "0000L6YQ8AVLFUZPXD0000",
				"yTenantId": "0000L6YQ8AVLFUZPXD0000"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	联系管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-24

更新

请求参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

