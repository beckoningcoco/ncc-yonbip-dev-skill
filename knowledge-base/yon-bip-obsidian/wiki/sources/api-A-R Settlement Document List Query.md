---
title: "应收核销单列表查询"
apiId: "1606534140749938694"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Settlement Document"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收核销单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Settlement Document (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/arverify/list

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
| pageIndex | string | 否 | 是 | 页数 示例：1 |
| pageSize | string | 否 | 是 | 显示条数 示例：10 |
| accentity | string | 否 | 否 | 会计主体id 示例：243546667777789 |
| accentity_code | string | 否 | 否 | 会计主体编码 示例：01 |
| open_vouchdate_begin | string | 否 | 否 | 核销日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-01 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 核销日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2022-11-30 00:00:00 |
| open_pubts_begin | string | 否 | 否 | 时间戳 示例：2022-11-01 00:00:00 |
| open_pubts_end | string | 否 | 否 | 时间戳 示例：2022-11-20 00:00:00 |
| code | string | 否 | 否 | 核销单号 示例：HX2022110200000004 |
| orderno | string | 否 | 否 | 订单编号 示例：DD2022110200000004 |
| billno | string | 否 | 否 | 单据编号 示例：FP110200000004 |
| customer | string | 否 | 否 | 客户id 示例：243546667777789 |
| customer_code | string | 否 | 否 | 客户编码 示例：55 |
| dept | string | 否 | 否 | 部门id 示例：243555656777689 |
| dept_code | string | 否 | 否 | 部门编码 示例：88 |
| period | string | 否 | 否 | 会计期间id 示例：678955656777689 |
| period_code | string | 否 | 否 | 会计期间编码 示例：2022-11 |
| project | string | 否 | 否 | 项目id 示例：6789556890777689 |
| project_code | string | 否 | 否 | 项目编码 示例：908 |
| operator | string | 否 | 否 | 业务员id 示例：6789554567777689 |
| operator_code | string | 否 | 否 | 业务员编码 示例：yy |
| currency | string | 否 | 否 | 币种id 示例：678934509899908 |
| currency_code | string | 否 | 否 | 币种简称 示例：CNY |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| logicOp | string | 否 | 否 | 逻辑连接符(and:且，or:或) 示例：and |
| conditions | object | 是 | 否 | 查询条件 |

## 3. 请求示例

Url: /yonbip/fi/arverify/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "10",
	"accentity": "243546667777789",
	"accentity_code": "01",
	"open_vouchdate_begin": "2022-11-01 00:00:00",
	"open_vouchdate_end": "2022-11-30 00:00:00",
	"open_pubts_begin": "2022-11-01 00:00:00",
	"open_pubts_end": "2022-11-20 00:00:00",
	"code": "HX2022110200000004",
	"orderno": "DD2022110200000004",
	"billno": "FP110200000004",
	"customer": "243546667777789",
	"customer_code": "55",
	"dept": "243555656777689",
	"dept_code": "88",
	"period": "678955656777689",
	"period_code": "2022-11",
	"project": "6789556890777689",
	"project_code": "908",
	"operator": "6789554567777689",
	"operator_code": "yy",
	"currency": "678934509899908",
	"currency_code": "CNY",
	"simpleVOs": [
		{
			"logicOp": "and",
			"conditions": [
				{
					"field": "verifyType",
					"op": "neq",
					"value1": "2",
					"value2": ""
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回结果状态信息 示例：操作成功 |
| data | object | 否 | 业务数据 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| pageIndex | long | 否 | 页号 示例：1 |
| pageSize | long | 否 | 每页行数 示例：10 |
| recordCount | long | 否 | 查询总数 示例：2 |
| recordList | object | 是 | 返回数据 |
| pageCount | long | 否 | 总页数 示例：1 |
| beginPageIndex | long | 否 | 起始页码 示例：1 |
| endPageIndex | long | 否 | 每页条数 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 2,
		"recordList": [
			{
				"currency_moneyDigit": 6,
				"currency_priceDigit": 6,
				"code": "HX2022110200000004",
				"caobject": 1,
				"accentity_name": "收付组织",
				"accentity": "1456672569727909890",
				"quickType": 1456465268854227000,
				"vouchdate": "2022-11-02 00:00:00",
				"natCurrency_name": "人民币",
				"natCurrency": "2777987038319104",
				"billtype": 7,
				"verifyDetail_cr_basebilltype": "FICA1",
				"period_code": "2022-11",
				"billamount": 11,
				"billid": 1526251022980219000,
				"currency": "2777987038319104",
				"bill_localamount": 11,
				"id": 1582159368178106400,
				"pubts": "2022-11-02 19:13:13",
				"period": 1456465268854227000,
				"creator": "栗丹",
				"currency_name": "人民币",
				"cr_basebilltype_name": "收款单",
				"srcitem": 75,
				"_mdd-data_rowindex": "0",
				"voucherstatus": 2,
				"currency1": "2777987038319104",
				"initflag": false,
				"natCurrency_moneyDigit": 6,
				"natCurrency_priceDigit": 6,
				"billdate": "2022-08-19 00:00:00",
				"customer_name": "通用客户1",
				"billno": "FA-9890202208190001",
				"customer": 1457511136333136000,
				"de_basebilltype_name": "销售发票",
				"verifyDetail_de_basebilltype": "SCMSA8"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	No enum constant org.imeta.core.base.ConditionOperator.1111	比较符op只能输入以下固定枚举值：(eq:等于;neq:不等于;lt:小于;gt:大于;like:模糊匹配;between:介于;is_null:为空;is_not_null:非空)


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

