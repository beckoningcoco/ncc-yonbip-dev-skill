---
title: "供应商档案批量详情查询"
apiId: "2151560680253685764"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商档案批量详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Supplier (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/vendor/listV3

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 否 | 页号 示例：1 默认值：1 |
| pageSize | int | 否 | 否 | 每页行数 示例：10 默认值：10 |
| pubts | string | 否 | 否 | 增量字段pubts 示例：2024-12-08 00:00:00 |
| ids | string | 否 | 否 | 供应商id条件，多个id逗号隔开 示例：2151531886779826177,2151531886779826178 |
| code | string | 否 | 否 | 供应商编码,模糊查询 示例：03004 |
| name | string | 否 | 否 | 供应商名称，模糊查询 示例：用友 |
| i18ndoc | boolean | 否 | 否 | 是否查询多语，是的话，多语字段返回map结构 示例：false |
| vendorcontactssNeedQuery | boolean | 否 | 否 | 是否查询联系人子表 示例：false |
| vendorbanksNeedQuery | boolean | 否 | 否 | 是否查询银行子表 示例：false |
| vendorAddressesNeedQuery | boolean | 否 | 否 | 是否查询地址子表 示例：false |
| vendorQualifiesNeedQuery | boolean | 否 | 否 | 是否查询资质子表 示例：false |
| vendorextendNeedQueryAll | boolean | 否 | 否 | 是否需要查询所有的业务信息 示例：false |
| vendorextendNeedQueryRead | boolean | 否 | 否 | 对于使用组织读取管理组织的业务信息，是否需要查询. 需要同时开启vendorextendNeedQueryAll和vendorOrgsNeedQuery参数 示例：false |
| vendorOrgsNeedQuery | boolean | 否 | 否 | 是否查询适用范围子表 示例：false |
| vendorCondition | string | 否 | 否 | 供应商额外查询条件 示例：[{"field":"name","op":"eq","value1":"用友股份有限公司"}] |
| vendorFields | string | 否 | 否 | 供应商额外查询字段，多个字段逗号隔开 示例：country.code,country.name |
| vendorextendsField | string | 否 | 否 | 业务信息额外字段 示例：taxitems.code,taxitems.ntaxrate,currency.code |
| vendorcontactssField | string | 否 | 否 | 供应商联系人额外字段 示例：contactname |
| vendorbanksField | string | 否 | 否 | 供应商银行额外查询字段 示例：country.code,bank.code |
| vendorAddressesField | string | 否 | 否 | 供应商地址额外查询字段 示例：country.code |
| vendorQualifiesField | string | 否 | 否 | 供应商资质额外查询字段 示例：qualifydoc.code |
| childDefineParam | string | 否 | 否 | 自定义子表的查询参数，其中fields可以传*,childDefineParamList是孙表 示例：[{"compositionName":"vendorSonTableList","fields":"id,name","childDefineParamList":{"compositionName":"vendorGrandchildTableList","fields":"id,name"}}] |
| externalParam | string | 否 | 否 | 额外参数 示例：{"key":"value"} |

## 3. 请求示例

Url: /yonbip/digitalModel/vendor/listV3?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"pubts": "2024-12-08 00:00:00",
	"ids": "2151531886779826177,2151531886779826178",
	"code": "03004",
	"name": "用友",
	"i18ndoc": false,
	"vendorcontactssNeedQuery": false,
	"vendorbanksNeedQuery": false,
	"vendorAddressesNeedQuery": false,
	"vendorQualifiesNeedQuery": false,
	"vendorextendNeedQueryAll": false,
	"vendorextendNeedQueryRead": false,
	"vendorOrgsNeedQuery": false,
	"vendorCondition": "[{\"field\":\"name\",\"op\":\"eq\",\"value1\":\"用友股份有限公司\"}]",
	"vendorFields": "country.code,country.name",
	"vendorextendsField": "taxitems.code,taxitems.ntaxrate,currency.code",
	"vendorcontactssField": "contactname",
	"vendorbanksField": "country.code,bank.code",
	"vendorAddressesField": "country.code",
	"vendorQualifiesField": "qualifydoc.code",
	"childDefineParam": "[{\"compositionName\":\"vendorSonTableList\",\"fields\":\"id,name\",\"childDefineParamList\":{\"compositionName\":\"vendorGrandchildTableList\",\"fields\":\"id,name\"}}]",
	"externalParam": "{\"key\":\"value\"}"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageCount | long | 否 | 分页数 示例：1 |
| recordCount | long | 否 | 记录数 示例：1 |
| pageSize | long | 否 | 分页数 示例：10 |
| recordList | object | 是 | 供应商数据 |
| pageIndex | long | 否 | 页码 示例：1 |
| endPageIndex | long | 否 | 结束页码 示例：1 |
| beginPageIndex | long | 否 | 起始页码 示例：1 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss 示例：2020-08-29 15:33:04 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageCount": 1,
		"recordCount": 1,
		"pageSize": 10,
		"recordList": [
			{
				"relationTenantId": "i8qmweum",
				"correspondingorg_code": "DQ98",
				"vendorzipcode": "100000",
				"contactphone": "18966776767",
				"regionCode": "110107000000",
				"correspondingorg": "2236189999895296",
				"parentVendor": "2237508814016768",
				"correspondingcust": "2376609571737856",
				"correspondingcust_name": "北京桑塔拉经销商",
				"creditcode": "JC01X00001",
				"vendoremail": "test@yonyou.com",
				"vendorclass_name": "供应商分类002",
				"isApplied": true,
				"datasource": "2",
				"timeZone": "4f0e92c3-3b43-44b0-a1b8-ba85a312e6bf",
				"vendorphone": "010-67861245",
				"org": "666666",
				"org_code": "global00",
				"name": "供应商11",
				"taxPayingCategories": 0,
				"internalunit": true,
				"vendorclass": 1511100333773056,
				"code": "l0020011",
				"retailInvestors": false,
				"id": 1891832769614080,
				"pubts": "2020-08-29 10:31:48",
				"supplyType": "0",
				"legalBody": "王宝强",
				"registerFund": "2000000",
				"registerCurrency": "2152588146692357",
				"registerCurrency_code": "CNY",
				"relationEnterpriseId": "2556920",
				"relationEnterpriseId_name": "东方红拖拉机制造厂",
				"companytype": "1,2",
				"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c3",
				"country": "6cefdb2b-180f-4ba5-8710-fa5a27a108bb",
				"country_name": "阿联酋",
				"foundDate": "2021-11-01 00:00:00",
				"serviceRange": "钢精，老铁",
				"remark": "其他说明信息",
				"vendoraddress": "北京市海淀区",
				"address": "北京市海淀区",
				"trade": "1",
				"ycnCode": "YC00000011578",
				"vendorextendList": [
					{
						"freezestatus": "0",
						"department": "1511053754585344",
						"department_code": "dep_caigou001",
						"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
						"creditServiceDay": 1,
						"simplename": "供应商11",
						"shipvia": 1511117517148416,
						"id": 1891832769614081,
						"deliveryvendor": 1891832769614080,
						"exchangeratetype_Name": "用户自定义汇率",
						"modifier": "YS测试1",
						"modifyTime": "2020-08-29 15:00:24",
						"invoicevendor_name": "供应商档案01",
						"settlemethod": 1511070801350912,
						"creator": "YonSuite默认用户",
						"deliveryvendor_name": "供应商11",
						"createTime": "2020-08-29 10:31:49",
						"invoicevendor": 1890752469471488,
						"helpcode": "GYS02",
						"vendor": 1891832769614080,
						"exchangeratetype": "41a219073e1e4b78ba9f63adabc1b224",
						"settlemethod_name": "现金收付款",
						"taxitems": "2152588149248262",
						"currencyname": "韩元",
						"remark": "这是个备注",
						"shipvia_name": "公路运输-普通",
						"person": "2155369089470720",
						"person_name": "王宝强",
						"paymentagreement": "2246061647189248",
						"paymentagreement_name": "日结",
						"accessstatus": "0"
					}
				],
				"vendorcontactss": [
					{
						"vendor": "2520699190366464",
						"contactname": "王宝强",
						"contactmobile": "15701656475",
						"id": "2523450158174464",
						"defaultcontact": true
					}
				],
				"vendorbanks": [
					{
						"id": "2152588146692358",
						"country": "2152588146692359",
						"province": "2152588146692360",
						"currency": "2152588146692361",
						"bank": "2152588146692362",
						"openaccountbank": "2152588146692363",
						"correspondentcode": "102110008087",
						"account": "6222300631491653",
						"defaultbank": true,
						"elecBillBankNode": "6222300631491659"
					}
				],
				"vendorAddresses": [
					{
						"id": "2152588146692364",
						"country": "2152588146692365",
						"region": "120101000000",
						"detailAddress": "北京市海淀区北清路68号",
						"longitude": "1111.0021",
						"latitude": "1122.0022"
					}
				],
				"vendorQualifies": [
					{
						"id": "2152588146692366",
						"qualifydoc": "1",
						"qualifyDate": "2024-12-09 00:00:00",
						"qualifyExpDate": "2024-12-09 00:00:00",
						"qualifyGrade": "2152588146692366",
						"filePath": "1ab88484-b400-47c2-bdf5-19e64a1c13d2"
					}
				],
				"vendorOrgs": [
					{
						"org": "2152588146692367",
						"org_code": "global00"
					}
				]
			}
		],
		"pageIndex": 1,
		"endPageIndex": 1,
		"beginPageIndex": 1,
		"pubts": "2020-08-29 15:33:04"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	联系管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-09

更新

请求说明

新增

请求参数 childDefineParam

更新

请求参数 externalParam

更新

返回参数 (14)

2	2025-03-13

新增

请求参数 externalParam

返回值增加null值配置


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

