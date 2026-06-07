---
title: "还款单列表查询"
apiId: "7894ac3592144010a0e1f3d1f932eb0e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Repayment Note"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Repayment Note]
platform_version: "BIP"
source_type: community-api-docs
---

# 还款单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Repayment Note (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/returnbill/list

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
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始时间, 格式为:yyyy-MM-dd 示例：2021-07-01 |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束时间, 格式为:yyyy-MM-dd 示例：2021-07-31 |
| code | string | 否 | 否 | 单据号 示例：0069 |
| status | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 单据状态(0:待提交;1:审批完成;3:审批中) 示例：1 |
| vreason | string | 否 | 否 | 还款说明 示例：还款 |
| cfinaceorg | string | 否 | 否 | 费用承担组织id 示例：1837963849289957378 |
| bustype | string | 否 | 否 | 交易类型id 示例：1837319990757819631 |
| pubts | string | 否 | 否 | 时间戳开始时间|时间戳结束时间 例如：2021-05-06 23:10:00|2021-05-08 12:09:00 示例：2021-05-06 23:10:00|2021-05-08 12:09:00 |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| field | string | 否 | 否 | 字段(pubts:时间戳、creator:创建人名称) 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |
| value1 | string | 否 | 否 | 查询条件值1 示例：2021-07-01 00:00:00 |
| value2 | string | 否 | 否 | 查询条件值2 示例：2021-07-31 23:59:59 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/returnbill/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"open_vouchdate_begin": "2021-07-01",
	"open_vouchdate_end": "2021-07-31",
	"code": "0069",
	"status": 1,
	"vreason": "还款",
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
| code | string | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 数据 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 每页条数 示例：20 |
| recordCount | long | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 列表数据 |
| sumRecordList | object | 否 | 汇总 |
| pageCount | long | 否 | 页面总数 示例：1 |
| beginPageIndex | long | 否 | 开始页码 示例：1 |
| endPageIndex | long | 否 | 结束页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"chandleorg": "2184854309114112",
				"vhandledeptid": "2184856228794624",
				"caccountorg_name": "北京天元股份有限公司",
				"bustype_name": "还款单",
				"irejectstatus": 0,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币",
				"id": 2404266552283392,
				"vattachmentass": "4d036f869e4c471bbc77508b63cdd120",
				"isWfControlled": false,
				"barCode": "znbzbx_returnbill|2404266552283392",
				"auditorId": 2185004199465216,
				"vnatcurrency": "2183687327011840",
				"caccountorg": "2184854309114112",
				"auditTime": "2021-08-26 10:27:47",
				"nnatexchrate": 1,
				"pk_handlepsn": "2185003811393792",
				"pk_billtype": "znbzbx_returnbill",
				"status": 1,
				"returncount": 0,
				"verifystate": 2,
				"code": "0069",
				"ibillmakemethod": 0,
				"vnatexchratetype_digit": 6,
				"pk_handlepsn_name": "王建斌",
				"nreturnmny": 100,
				"creatorId": 2185004199465216,
				"chandleorg_name": "北京天元股份有限公司",
				"vcurrency": "2183687327011840",
				"vouchdate": "2021-08-26 00:00:00",
				"voucherstate": "success",
				"cfinaceorg": "2184854309114112",
				"isettlestatus": 5,
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"ismulticurrency": false,
				"pubts": "2021-08-26 10:27:50",
				"vreason": "0826个人借款单",
				"createDate": "2021-08-26 00:00:00",
				"auditDate": "2021-08-26 00:00:00",
				"vfinacedeptid_name": "筹资部-规划部",
				"nnatreturnmny": 100,
				"creator": "王建斌",
				"vfinacedeptid": "2184856228794624",
				"vnatcurrency_moneyDigit": 2,
				"auditor": "王建斌",
				"bustype": "2183687370068224",
				"vnatexchratetype_name": "基准汇率",
				"cfinaceorg_name": "北京天元股份有限公司",
				"createTime": "2021-08-26 10:26:27",
				"dnatexchratedate": "2021-08-26 00:00:00",
				"vnatexchratetype": "py7y8nze",
				"vhandledeptid_name": "筹资部-规划部"
			}
		],
		"sumRecordList": {
			"nreturnmny": 100
		},
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员


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

