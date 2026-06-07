---
title: "销售合同列表查询"
apiId: "38505e481a4a4bf384842629ab252d1e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Contract"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售合同列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Sales Contract (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/sd/sact/list

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
| open_confirmDate_begin | string | 否 | 否 | 审核开始时间 示例：2020-03-02 |
| open_confirmDate_end | string | 否 | 否 | 审核结束时间 示例：2020-03-02 23:59:59 |
| open_hopeReceiveDate_begin | string | 否 | 否 | 期望收货开始时间 示例：2020-03-02 |
| open_hopeReceiveDate_end | string | 否 | 否 | 期望收货截止时间 示例：2020-03-02 23:59:59 |
| open_vouchdate_begin | string | 否 | 否 | 单据开始时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2020-03-02 |
| open_vouchdate_end | string | 否 | 否 | 单据截止时间,格式为:yyyy-MM-dd HH:mm:ss 示例：2020-03-02 23:59:59 |
| pageIndex | long | 否 | 是 | 页号 默认值:1 示例：1 默认值：1 |
| pageSize | long | 否 | 是 | 每页行数 默认值:10 示例：10 默认值：10 |
| isSum | boolean | 否 | 否 | 查询表头 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 查询条件 |
| value1 | string | 否 | 否 | 查询条件值1 示例：eflong-库存 |
| value2 | string | 否 | 否 | 查询条件值2 |
| op | string | 否 | 否 | 条件比较符(如like,=) 示例：like |
| field | string | 否 | 否 | 查询条件字段名 示例：salesOrgId_name |

## 3. 请求示例

Url: /sd/sact/list?access_token=访问令牌
Body: {
	"open_confirmDate_begin": "2020-03-02",
	"open_confirmDate_end": "2020-03-02 23:59:59",
	"open_hopeReceiveDate_begin": "2020-03-02",
	"open_hopeReceiveDate_end": "2020-03-02 23:59:59",
	"open_vouchdate_begin": "2020-03-02",
	"open_vouchdate_end": "2020-03-02 23:59:59",
	"pageIndex": 1,
	"pageSize": 10,
	"isSum": false,
	"simpleVOs": [
		{
			"value1": "eflong-库存",
			"value2": "",
			"op": "like",
			"field": "salesOrgId_name"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | long | 否 | 页号 默认值:1 示例：1 |
| pageSize | long | 否 | 每页行数 默认值:10 示例：10 |
| recordCount | long | 否 | 记录条数 示例：0 |
| recordList | object | 是 | 记录列表 |
| pageCount | long | 否 | 记录条数 示例：0 |
| beginPageIndex | long | 否 | 开始页数 示例：1 |
| endPageIndex | long | 否 | 结束页数 示例：0 |
| pubts | string | 否 | 时间戳 示例：2021-02-02 16:50:44 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 0,
		"recordList": [
			{
				"transactionTypeId_name": "lcy标准合同",
				"currency_moneyDigit": 6,
				"agentId": 1906217436975360,
				"currency_priceDigit": 6,
				"code": "SACT20210202000003",
				"receiveContacter": "刘德华",
				"creatorId": 1838303819272448,
				"exchRate": 1,
				"exchRateOps": 1,
				"totalOriReceipts": 0,
				"totalTax": 1.610619,
				"vouchdate": "2021-02-02 00:00:00",
				"natCurrency_name": "人民币",
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"receiveContacterPhone": "17899992222",
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"id": 2114410125906176,
				"pubts": "2021-02-02 16:09:13",
				"payMoneyOrigTaxfree": 12.389381,
				"agentId_name": "lcy客户0507",
				"isFlowCoreBill": false,
				"bussinessTelephone": "123123",
				"salesmanId_name": "刘德华",
				"salesmanId": "1908809846018304",
				"contractStatus": 0,
				"agreement": 2027785920599296,
				"currency_name": "人民币",
				"transactionTypeId": "2019269036986624",
				"isWfControlled": false,
				"totalPriceTax": 14,
				"bussinessAddress": "12312",
				"defines!id": 2114410125906176,
				"creatorId_name": "lcy",
				"saleDepartmentId_name": "444",
				"changestatus": 0,
				"natCurrency_moneyDigit": 6,
				"createTime": "2021-02-02 16:09:12",
				"natCurrency_priceDigit": 6,
				"saleDepartmentId": "1904571799147008",
				"name": "1231",
				"planEffectiveDate": "2021-02-02 00:00:00",
				"salesOrgId_name": "lcy销售",
				"natCurrency_code": "CNY",
				"salesOrgId": "1839391506075904",
				"status": 0,
				"out_sys_id": "1839391506075904",
				"out_sys_code": "aaa",
				"out_sys_version": "3",
				"out_sys_type": "SALE",
				"out_sys_rowno": "10",
				"out_sys_lineid": "1839391506075901",
				"childs_variantconfigctsCode": "",
				"childs_variantconfigctsVersion": "",
				"childs_optionalQuotationId": "",
				"childs_optionalQuotationI_code": "",
				"childs_productId_optionalType": "",
				"childs_variantconfigctsId": "",
				"childs_variantConfiguration": ""
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0,
		"pubts": "2021-02-02 16:50:44"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	非法的时间


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-15

新增

返回参数 exchRateOps


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

