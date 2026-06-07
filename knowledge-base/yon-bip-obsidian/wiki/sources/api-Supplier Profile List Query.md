---
title: "供应商档案列表查询"
apiId: "6c6548336ff74ad9996dd155b75e02d8"
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

# 供应商档案列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Supplier (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/vendor/list

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
| pageIndex | int | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 示例：10 默认值：10 |
| vendororg | string | 是 | 否 | 使用组织id 示例：[666666] |
| vendorApplyRange_isCreator | boolean | 否 | 否 | 管理组织=使用组织 示例：true |
| code | string | 否 | 否 | 供应商编码 示例：03004 |
| helpcode | string | 否 | 否 | 助记码 示例：IntelZGGS |
| vendorclass | string | 否 | 否 | 所属分类id 示例：2165398870233344 |
| shipvia | string | 是 | 否 | 发运方式id 示例：[1869874060415232] |
| correspondingcust | string | 否 | 否 | 对应客户id 示例：1965830945558784 |
| stopstatus | boolean | 否 | 否 | 状态, false:启用、true:停用、 示例：false |
| person | string | 是 | 否 | 专管业务员id 示例：[1888966431069184] |
| org | string | 是 | 否 | 管理组织id 示例：[666666] |
| deliveryvendor | string | 是 | 否 | 发货供应商id 示例：[2166990446334208] |
| invoicevendor | string | 是 | 否 | 开票供应商id 示例：[2166990446334208] |
| currency | string | 是 | 否 | 交易币种id 示例：["G001ZM0000DEFAULTCURRENCT00000000006"] |
| taxrate | int | 是 | 否 | 进项税率 示例：[13] |
| parentVendor | string | 是 | 否 | 上级供应商id 示例：[2164161776636160] |
| paymentagreement | string | 是 | 否 | 付款协议id 示例：[2164161776636163] |
| queryChildrenTable | string | 否 | 否 | 是否返回子表数据，不是必要的情况下不建议传这个参数，影响查询性能 示例：false |
| cooperationLevel | string | 是 | 否 | 合作等级id 示例：[2164161776636163] |
| freezestatus | string | 否 | 否 | 风险状态:正常0/冻结1/黑名单2 示例：0 |
| department | string | 是 | 否 | 专管部门id 示例：[2164161776636163] |
| lifecycleStatus | string | 是 | 否 | 生命周期状态id 示例：[2164161776636163] |
| retailInvestors | boolean | 否 | 否 | 散户, true:是、false:否、 示例：true |
| simple | object | 否 | 否 | simple属性 |
| pubts | string | 否 | 否 | 时间戳，查询大于等于该时间的供应商档案 示例：2021-03-19 10:17:54 |

## 3. 请求示例

Url: /yonbip/digitalModel/vendor/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"vendororg": [
		666666
	],
	"vendorApplyRange_isCreator": true,
	"code": "03004",
	"helpcode": "IntelZGGS",
	"vendorclass": "2165398870233344",
	"shipvia": [
		1869874060415232
	],
	"correspondingcust": "1965830945558784",
	"stopstatus": false,
	"person": [
		1888966431069184
	],
	"org": [
		666666
	],
	"deliveryvendor": [
		2166990446334208
	],
	"invoicevendor": [
		2166990446334208
	],
	"currency": [
		"G001ZM0000DEFAULTCURRENCT00000000006"
	],
	"taxrate": [
		13
	],
	"parentVendor": [
		2164161776636160
	],
	"paymentagreement": [
		2164161776636163
	],
	"queryChildrenTable": "false",
	"cooperationLevel": [
		2164161776636163
	],
	"freezestatus": "0",
	"department": [
		2164161776636163
	],
	"lifecycleStatus": [
		2164161776636163
	],
	"retailInvestors": true,
	"simple": {
		"pubts": "2021-03-19 10:17:54"
	}
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
				"yhttenant": "d1573aae-795e-47bb-93e6-1116a932d325",
				"correspondingorg_name": "九江酷酷熊（河北）有限公司",
				"vendorzipcode": "100000",
				"contactphone": "18966776767",
				"regionCode": "110107000000",
				"correspondingorg": "2236189999895296",
				"parentVendor": "2237508814016768",
				"parentVendor_name": "北京拖拉机制造公司",
				"correspondingcust": "2376609571737856",
				"correspondingcust_name": "北京桑塔拉经销商",
				"creditcode": "JC01X00001",
				"isCreator": true,
				"vendoremail": "test@yonyou.com",
				"vendorclass_name": "供应商分类002",
				"isApplied": true,
				"datasource": "2",
				"timeZone": "4f0e92c3-3b43-44b0-a1b8-ba85a312e6bf",
				"vendorphone": "010-67861245",
				"org": "666666",
				"customItems": {
					"vendor": 1891832769614080,
					"define18": "212",
					"define17": "111",
					"define12": "供应商属性名称05",
					"define16": "供应商属性01",
					"define19": "122",
					"define13": "供应商属性名称03",
					"define14": "供应商属性名称01"
				},
				"vendorApplyRange_org_name": "企业账号级",
				"org_name": "企业账号级",
				"vendorApplyRange_org": "666666",
				"vendorApplyRangeId": 1891832769630465,
				"name": "供应商11",
				"taxPayingCategories": 0,
				"stop": false,
				"timeZone_Name": "(UTC+06:30) 缅甸标准时间",
				"internalunit": true,
				"vendorclass": 1511100333773056,
				"code": "l0020011",
				"retailInvestors": false,
				"id": 1891832769614080,
				"pubts": "2020-08-29 10:31:48",
				"vendorextends": {
					"freezestatus": "0",
					"department": "1511053754585344",
					"department_code": "dep_caigou001",
					"department_name": "采购部",
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
					"taxrate": 0,
					"taxname": "免税",
					"currencyname": "韩元",
					"remark": "这是个备注",
					"shipvia_name": "公路运输-普通",
					"person": "2155369089470720",
					"person_name": "王宝强",
					"paymentagreement": "2246061647189248",
					"paymentagreement_name": "日结",
					"accessstatus": "0"
				},
				"contactsList": [
					{
						"id": "2523450158174464",
						"vendor": "2520699190366464",
						"contactname": "王宝强",
						"contactmobile": "15701656475",
						"defaultcontact": true
					}
				],
				"supplyType": "0",
				"legalBody": "王宝强",
				"registerFund": "2000000",
				"registerCurrency": "2152588146692357",
				"registerCurrency_name": "美元",
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
				"ycnCode": "YC00000011578"
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

1	2025-06-19

新增

请求参数 (5)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

