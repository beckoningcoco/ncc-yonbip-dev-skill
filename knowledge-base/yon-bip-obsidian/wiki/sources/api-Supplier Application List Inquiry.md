---
title: "供应商申请列表查询"
apiId: "2003641190525173765"
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

# 供应商申请列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Supplier Application (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/digitalModel/vendorApply/list

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
| page | object | 否 | 是 | 分页 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页行数 示例：10 默认值：10 |
| mapCondition | object | 否 | 否 | 查询条件 |
| lastUpdateTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 起始时间 示例：2024-01-01 00:00:00 |
| thisSyncTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 结束时间 示例：2024-05-01 00:00:00 |
| changeType | string | 否 | 否 | 变更类型 0:通用信息 1:业务信息 2:银行信息 示例：0 |
| vendorType | string | 否 | 否 | 单据类型 0:新增申请 1:变更申请 示例：0 |
| code | string | 否 | 否 | 申请编码 示例：00001 |
| salesman | string | 否 | 否 | 所属人员ID 示例：1936058428431532040 |
| applyDepartmentId | string | 否 | 否 | 所属部门ID 示例：1917648102663127044 |
| applyOrgId | string | 否 | 否 | 所属组织ID 示例：1917641204945649665 |
| org | string | 否 | 否 | 管理组织ID 示例：666666 |
| usedOrg | string | 否 | 否 | 使用组织ID 示例：666666 |
| name | string | 否 | 否 | 供应商名称 示例：与光同尘 |
| vendorCode | string | 否 | 否 | 供应商编码 示例：YGSH-001 |
| helpcode | string | 否 | 否 | 助记码 示例：ygtc |
| vendorclass | string | 否 | 否 | 供应商分类编码 示例：gc001 |
| department | string | 否 | 否 | 专管部门ID |
| person | string | 否 | 否 | 专管业务员ID |
| parentVendor | string | 否 | 否 | 上级供应商ID |
| deliveryvendor | string | 否 | 否 | 发货供应商ID |
| invoicevendor | string | 否 | 否 | 开票供应商ID |
| currency | string | 否 | 否 | 交易币种ID |
| taxrate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 进项税率ID 示例：9 |
| settlemethod | string | 否 | 否 | 结算方式ID |
| stopstatus | boolean | 否 | 否 | 状态。true:停用；false:启用 示例：false 默认值：false |
| accessstatus | string | 否 | 否 | 合作状态 |
| updateStatus | string | 否 | 否 | 更新状态 |
| status | string | 否 | 否 | 单据状态 |
| companytype | string | 否 | 否 | 企业类型 |
| creator | string | 否 | 否 | 创建人 |

## 3. 请求示例

Url: /yonbip/digitalModel/vendorApply/list?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 10
	},
	"mapCondition": {
		"lastUpdateTime": "2024-01-01 00:00:00",
		"thisSyncTime": "2024-05-01 00:00:00",
		"changeType": "0",
		"vendorType": "0",
		"code": "00001",
		"salesman": "1936058428431532040",
		"applyDepartmentId": "1917648102663127044",
		"applyOrgId": "1917641204945649665",
		"org": "666666",
		"usedOrg": "666666",
		"name": "与光同尘",
		"vendorCode": "YGSH-001",
		"helpcode": "ygtc",
		"vendorclass": "gc001",
		"department": "",
		"person": "",
		"parentVendor": "",
		"deliveryvendor": "",
		"invoicevendor": "",
		"currency": "",
		"taxrate": 9,
		"settlemethod": "",
		"stopstatus": false,
		"accessstatus": "",
		"updateStatus": "",
		"status": "",
		"companytype": "",
		"creator": ""
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageCount | long | 否 | 分页数 示例：1 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 分页数 示例：10 |
| endPageIndex | long | 否 | 结束页码 示例：1 |
| beginPageIndex | long | 否 | 起始页码 示例：1 |
| recordCount | long | 否 | 记录数 示例：1 |
| recordList | object | 是 | 供应商数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageCount": 1,
		"pageIndex": 1,
		"pageSize": 10,
		"endPageIndex": 1,
		"beginPageIndex": 1,
		"recordCount": 1,
		"recordList": [
			{
				"yhttenant": "d1573aae-795e-47bb-93e6-1116a932d325",
				"contactphone": "18966776767",
				"regionCode": "110107000000",
				"correspondingorg": "2236189999895296",
				"parentVendor": "2237508814016768",
				"parentVendor_name": "北京拖拉机制造公司",
				"correspondingcust": "2376609571737856",
				"correspondingcust_name": "北京桑塔拉经销商",
				"creditcode": "JC01X00001",
				"vendoremail": "test@yonyou.com",
				"auditor": "张三",
				"auditorId": "1920494454778101765",
				"applyReason": "",
				"failureReason": "",
				"updateStatus": "0",
				"auditTime": "2024-05-31 00:00:00",
				"auditDate": "2024-05-31 00:00:00",
				"isWfControlled": true,
				"verifystate": 0,
				"returncount": 0,
				"vendorType": 0,
				"effectiveDate": "2024-05-31 00:00:00",
				"applyDate": "2024-05-27 18:10:04",
				"salesman": "1920494454778101765",
				"salesman_name": "张三",
				"applyDepartmentId": "1917649107667124229",
				"applyDepartmentId_name": "库存组织的部门",
				"applyOrgId": "1917647252241252359",
				"applyOrgId_name": "纯库存组织",
				"vendorclass_name": "供应商分类002",
				"datasource": "2",
				"timeZone": "Asia/Shanghai",
				"vendorphone": "010-67861245",
				"org": "666666",
				"org_name": "企业账号级",
				"usedOrg": "666666",
				"usedOrg_name": "企业账号级",
				"name": "供应商11",
				"taxPayingCategories": 0,
				"stop": false,
				"internalunit": true,
				"vendorclass": 1511100333773056,
				"code": "l0020011",
				"vendorCode": "gz00215",
				"retailInvestors": false,
				"id": 1891832769614080,
				"pubts": "2020-08-29 10:31:48",
				"supplyType": "0",
				"legalBody": "王宝强",
				"registerFund": "2000000",
				"registerCurrency": "2152588146692357",
				"registerCurrency_name": "美元",
				"relationEnterpriseId": "2556920",
				"relationEnterpriseId_name": "东方红拖拉机制造厂",
				"companytype": "1,2",
				"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c1",
				"language_name": "英语",
				"country": "6cefdb2b-180f-4ba5-8710-fa5a27a108bb",
				"language_Name": "阿联酋",
				"foundDate": "2021-11-01 00:00:00",
				"serviceRange": "钢精，老铁",
				"remark": "其他说明信息",
				"vendoraddress": "北京市海淀区",
				"address": "北京市海淀区",
				"trade": "1",
				"ycnCode": "YC00000011578",
				"status": 0,
				"bEntVerify": 0,
				"transType": "1916745652704379685",
				"transTypeName": "通用供应商",
				"vendorextends": {
					"riskStatus": "0",
					"department": "1511053754585344",
					"department_name": "采购部",
					"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
					"currencyname": "韩元",
					"creditServiceDay": 1,
					"simplename": "供应商11",
					"id": 1891832769614081,
					"deliveryvendor": 1891832769614080,
					"deliveryvendor_name": "供应商11",
					"exchangeratetype": "41a219073e1e4b78ba9f63adabc1b224",
					"exchangeratetype_Name": "用户自定义汇率",
					"modifier": "YS测试1",
					"modifyTime": "2020-08-29 15:00:24",
					"creator": "YonSuite默认用户",
					"createTime": "2020-08-29 10:31:49",
					"invoicevendor": 1890752469471488,
					"invoicevendor_name": "供应商档案01",
					"settlemethod": 1511070801350912,
					"settlemethod_name": "现金收付款",
					"helpcode": "GYS02",
					"vendor": 1891832769614080,
					"taxitems": "2152588149248262",
					"taxrate": 0,
					"remark": "这是个备注",
					"shipvia": 1511117517148416,
					"shipvia_name": "公路运输-普通",
					"person": "2155369089470720",
					"person_name": "王宝强",
					"paymentagreement": "2246061647189248",
					"paymentagreement_name": "日结",
					"accessstatus": "0"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	服务端逻辑异常	联系管理员


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

