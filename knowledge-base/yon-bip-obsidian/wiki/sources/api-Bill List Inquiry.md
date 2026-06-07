---
title: "账单列表查询"
apiId: "1676255221054963715"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Personal Invoices"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Personal Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 账单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Personal Invoices (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/billcommon/queryInvoices

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
| pageIndex | int | 否 | 是 | 页码 示例：1 |
| pageSize | int | 否 | 是 | 数量 示例：10 |
| pk_memoapply_code | string | 是 | 否 | 申请单编号 示例：["TAPL230302000002"] |
| createDateFrom | string | 否 | 否 | 起始创建日期(yyyy-MM-dd) 示例：2023-03-03 |
| createDateTo | string | 否 | 否 | 截至创建日期(yyyy-MM-dd) 示例：2023-03-05 |
| ibusistatus | string | 是 | 否 | 报销状态(0:待报销;1:报销中;2:已报销) 示例：["0"] |
| vinvoiceno | string | 是 | 否 | 发票/订单号 示例：["95480077"] |
| vinvoicecode | string | 是 | 否 | 发票代码 示例：["011002200811"] |
| pk_invoicetype | long | 是 | 否 | 账单类型id 示例：[9980,9985] |
| dopendateFrom | string | 否 | 否 | 起始开票日期(yyyy-MM-dd) 示例：2023-02-23 |
| dopendateTo | string | 否 | 否 | 截至开票日期(yyyy-MM-dd) 示例：2023-03-23 |
| pubtsFrom | string | 否 | 否 | 起始时间戳(格式：yyyy-MM-dd HH:mm:ss) 示例：2023-02-23 16:30:09 |
| pubtsTo | string | 否 | 否 | 截至时间戳(格式：yyyy-MM-dd HH:mm:ss) 示例：2023-03-23 16:30:09 |
| simpleVOs | object | 是 | 否 | 简单查询条件 |
| field | string | 否 | 否 | 字段名 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |
| value1 | string | 否 | 否 | 查询条件值1 示例：2023-02-23 16:30:09 |
| value2 | string | 否 | 否 | 查询条件值2 示例：2023-03-23 16:30:09 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/billcommon/queryInvoices?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"pk_memoapply_code": [
		"TAPL230302000002"
	],
	"createDateFrom": "2023-03-03",
	"createDateTo": "2023-03-05",
	"ibusistatus": [
		"0"
	],
	"vinvoiceno": [
		"95480077"
	],
	"vinvoicecode": [
		"011002200811"
	],
	"pk_invoicetype": [
		9980,
		9985
	],
	"dopendateFrom": "2023-02-23",
	"dopendateTo": "2023-03-23",
	"pubtsFrom": "2023-02-23 16:30:09",
	"pubtsTo": "2023-03-23 16:30:09",
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2023-02-23 16:30:09",
			"value2": "2023-03-23 16:30:09"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 每页条数 示例：1 |
| recordCount | long | 否 | 总记录数 示例：1445 |
| recordList | object | 是 | 数据 |
| pageCount | long | 否 | 页面总数 示例：1445 |
| beginPageIndex | long | 否 | 开始页码 示例：2 |
| endPageIndex | long | 否 | 结束页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 1,
		"recordCount": 1445,
		"recordList": [
			{
				"id": 1679849876742471700,
				"pk_invoicetype": 9977,
				"vinvoicetypename": "用车订单",
				"vinvoicetypecode": "car",
				"vstartcity": "北京市",
				"vdestcity": "北京市",
				"vstartaddr": "昌艺园小区",
				"vdestaddr": "北京环球度假区",
				"vseatlevel": "",
				"dcostdate": "2023-03-14 00:00:00",
				"nmny": 10,
				"ntaxmny": 0,
				"nuntaxmny": 10,
				"ibusistatus": 1,
				"vinvoiceno": "3204058669994240",
				"dopendate": "2023-03-14 00:00:00",
				"dupdate": "2023-03-14 00:00:00",
				"vinvoiceplace": "北京市",
				"isourcesystem": 14,
				"duploadtime": "2023-03-14 10:08:09",
				"vgetontime": "10:07",
				"vgetofftime": "10:10",
				"vattachmentass": "a0ba9d26404e4c65820da35bc9dc0e1c",
				"ibuytype": 0,
				"pk_startaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"pk_costaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"pk_expensebill": 1679982831733309400,
				"billno": "TERD230314000A000014000002",
				"pk_billtype": "znbzbx_travelexpbill",
				"pk_consumekind": 9998,
				"vconsumekindname": "交通",
				"pubts": "2023-03-14 14:35:42",
				"dopentime": "2023-03-14 10:07:10",
				"status": 20,
				"vcurrency": "2533086218409216",
				"vname": "刘家安",
				"bocrmodify": false,
				"expbillbustype": "1674815264529055752",
				"vbitisordertype": "car_N",
				"vparentsourcesysid": "3204058669994240",
				"pk_costpsndoc": "41730146301177856",
				"vbitischanneltype": "yyg",
				"pk_memoapply": 1679839921008279600,
				"pk_memoapply_code": "TAPL230314000001",
				"creatorId": 2533060013838592,
				"creator": "默认用户",
				"ncompanypayprice": 10,
				"itraffictype": 0,
				"voperatorid": 2608134158180096,
				"voperatorname": "昵称-刘家安",
				"pk_startaddr_name": "北京市",
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币",
				"vcurrency_currTypeSign": "?",
				"vcostaddrname": "北京市",
				"pk_costpsndoc_name": "刘家安",
				"itraffictype_name": "市内交通费",
				"tspz": "通行费"
			}
		],
		"pageCount": 1445,
		"beginPageIndex": 2,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-08

新增

返回参数 tspz

更新

返回参数 vcurrency_currTypeSign

2	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

