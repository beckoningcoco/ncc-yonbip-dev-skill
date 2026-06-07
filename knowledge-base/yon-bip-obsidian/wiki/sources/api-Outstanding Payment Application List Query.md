---
title: "挂账付款申请单列表查询"
apiId: "1845640716782403592"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payables Payment Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payables Payment Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 挂账付款申请单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Payables Payment Request (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/paymentapply/list

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
| pageSize | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 每页行数 示例：20 |
| pageIndex | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 页号 示例：1 |
| code | string | 否 | 否 | 单据号 示例：12 |
| status | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 单据状态(0:待提交;1:审批完成;3:审批中) 示例：0 |
| vreason | string | 否 | 否 | 申请说明 示例：你好 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始时间, 格式为:yyyy-MM-dd 示例：2021-07-01 |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束时间, 格式为:yyyy-MM-dd 示例：2021-07-31 |
| pk_cusdoc | string | 否 | 否 | 供应商id 示例：2019210307506432 |
| pk_customer | string | 否 | 否 | 客户id 示例：201921030750 |
| simple | object | 否 | 否 | 根据档案code查询 |
| pk_cusdoc.code | string | 否 | 否 | 供应商编码 示例：20192103075062 |
| pk_customer.code | string | 否 | 否 | 客户编码 示例：201921030 |
| cfinaceorg | string | 否 | 否 | 费用承担组织id 示例：1837963849289957378 |
| bustype | string | 否 | 否 | 交易类型id 示例：1837319990757819631 |
| pubts | string | 否 | 否 | 时间戳开始时间|时间戳结束时间 例如：2021-05-06 23:10:00|2021-05-08 12:09:00 示例：2021-05-06 23:10:00|2021-05-08 12:09:00 |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| field | string | 否 | 否 | 字段(pubts:时间戳、creator:创建人名称) 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |
| value1 | string | 否 | 否 | 查询条件值1 示例：2021-07-01 00:00:00 |
| value2 | string | 否 | 否 | 查询条件值2 示例：2021-07-31 23:59:59 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/paymentapply/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"code": "12",
	"status": 0,
	"vreason": "你好",
	"open_vouchdate_begin": "2021-07-01",
	"open_vouchdate_end": "2021-07-31",
	"pk_cusdoc": "2019210307506432",
	"pk_customer": "201921030750",
	"simple": {
		"pk_cusdoc.code": "20192103075062",
		"pk_customer.code": "201921030"
	},
	"cfinaceorg": "1837963849289957378",
	"bustype": "1837319990757819631",
	"pubts": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2021-07-01 00:00:00",
			"value2": "2021-07-31 23:59:59"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| code | long | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| pageIndex | long | 否 | 分页编码 示例：1 |
| pageSize | long | 否 | 页大小 示例：20 |
| recordCount | long | 否 | 记录总数 示例：1 |
| recordList | object | 是 | 记录集合 |
| pageCount | long | 否 | 总页数 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"vhandledeptid": "1524154726676430853",
				"chandleorg": "1524154503347568646",
				"iauditdealstatus": 0,
				"caccountorg_name": "费控A",
				"bustype_name": "挂账付款申请单",
				"irejectstatus": 0,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币",
				"id": "1845618537589112838",
				"pk_dutyjob": "1525698982178717701",
				"vattachmentass": "0053a592bf0a4ec3a817105b86dcab59",
				"isdeferpaymentapply": false,
				"isWfControlled": false,
				"pk_dutyrank_name": "高级测试工程师",
				"caccountorg": "1524154503347568646",
				"vnatcurrency": "1523413904973627420",
				"nnatexchrate": 1,
				"pk_handlepsn": "1549357070803795972",
				"pk_billtype": "znbzbx_paymentapply",
				"status": 0,
				"returncount": 0,
				"verifystate": 0,
				"code": "FKSQ23102300001",
				"ibillmakemethod": 0,
				"vnatexchratetype_digit": 6,
				"pk_handlepsn_name": "任文君",
				"creatorId": "1549357079382196226",
				"chandleorg_name": "费控A",
				"vcurrency": "1523413904973627420",
				"vouchdate": "2023-10-23 00:00:00",
				"cfinaceorg": "1524154503347568646",
				"isettlestatus": 0,
				"vnatcurrency_name": "人民币",
				"igenmethod": 3,
				"ismulticurrency": true,
				"pubts": "2023-10-23 18:51:17",
				"vreason": "ads2",
				"createDate": "2023-10-23 00:00:00",
				"vfinacedeptid_name": "销售部",
				"creator": "昵称-任文君",
				"pk_dutyrank": "1525699480394924033",
				"iauditresult": 0,
				"vfinacedeptid": "1524154726676430853",
				"vnatcurrency_moneyDigit": 2,
				"nexpensemny": 9,
				"bustype": "1658463224516313092",
				"vnatexchratetype_name": "基准汇率",
				"cfinaceorg_name": "费控A",
				"pk_dutyjob_name": "测试职务",
				"createTime": "2023-10-23 18:51:16",
				"dnatexchratedate": "2023-10-23 00:00:00",
				"vnatexchratetype": "0000L6UFPA4E2D845F0000",
				"nnatexpensemny": 9,
				"vhandledeptid_name": "销售部"
			}
		],
		"pageCount": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000999999	服务器异常	服务器异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

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

