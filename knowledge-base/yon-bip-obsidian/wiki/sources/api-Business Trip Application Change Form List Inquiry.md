---
title: "出差申请变更单列表查询"
apiId: "1976135850586538057"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Travel Change Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Travel Change Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 出差申请变更单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Travel Change Request (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/busistripalter/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页行数 示例：20 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页号 示例：1 |
| code | string | 否 | 否 | 单据编号code 示例：TAPL240426000001 |
| id | string | 否 | 否 | 单据id 示例：1900464857632210944 |
| pk_memoapply | string | 否 | 否 | 出差申请单id 示例：1900464857632210944 |
| pk_memoapply_code | string | 否 | 否 | 出差申请单code 示例：TAPL240426000001 |
| vouchdate | string | 否 | 否 | 单据开始时间|单据结束时间 格式：yyyy-MM-dd|yyyy-MM-dd 示例：2021-05-06|2021-05-08 |
| cfinaceorg | string | 否 | 否 | 费用承担组织id 示例：1900464857632210944 |
| bustype | string | 否 | 否 | 交易类型id 示例：1900464857632210944 |
| status | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 单据状态(0:待提交;1:审批完成;3:审批中) 示例：0 |
| pubts | string | 否 | 否 | 时间戳开始时间|时间戳结束时间 例如：2021-05-06 23:10:00|2021-05-08 12:09:00 示例：2021-05-06 23:10:00|2021-05-08 12:09:00 |
| vreason | string | 否 | 否 | vreason 示例：你好 |
| simpleVOs | object | 是 | 否 | 简单查询条件 |
| field | string | 否 | 否 | 字段(pubts:时间戳、creator:创建人名称、dapplydate:申请日期、dbegindate：出差起始日期、denddate：出差截止日期、pk_begaddr:出发地id、pk_begaddr.name:出发地名称、pk_endaddr：目的地id、pk_endaddr.name：目的地名称) 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |
| value1 | string | 否 | 否 | 查询条件值1 示例：2021-07-01 00:00:00 |
| value2 | string | 否 | 否 | 查询条件值2 示例：2021-07-31 23:59:59 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/busistripalter/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"code": "TAPL240426000001",
	"id": "1900464857632210944",
	"pk_memoapply": "1900464857632210944",
	"pk_memoapply_code": "TAPL240426000001",
	"vouchdate": "2021-05-06|2021-05-08",
	"cfinaceorg": "1900464857632210944",
	"bustype": "1900464857632210944",
	"status": 0,
	"pubts": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"vreason": "你好",
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
| displayCode | string | 否 | 异常码 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页条数 示例：20 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 列表数据 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 页面总数 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 开始页码 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 结束页码 示例：1 |
| traceId | string | 否 | traceId 示例：e407b9afe411602d |

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
				"chandleorg": "1837963849289957378",
				"vhandledeptid": "1837964373260763139",
				"vreason_before": "415简强架构",
				"caccountorg_name": "用友网络科技股份有限公司",
				"bustype_name": "出差申请变更单",
				"pk_busimemo_before_name": "办公费",
				"previewPrintCount": 0,
				"irejectstatus": 0,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币",
				"vreason_after": "415简强架构",
				"id": "1971560430520238085",
				"vattachmentass": "0b868bca0c46461a803942311c00158c",
				"nnatapplymny_after": 66,
				"isWfControlled": false,
				"nnatapplymny_before": 66,
				"dcostdate": "2024-04-10 00:00:00",
				"barCode": "znbzbx_busistripalter|1971560430520238085",
				"pk_busimemo_after": "1837985289764601871",
				"caccountorg": "1837963849289957378",
				"vnatcurrency": "1837319999347752994",
				"pk_memoapply": "1970055963617525769",
				"nnatexchrate": 1,
				"pk_handlepsn": "1845360968373633025",
				"pk_billtype": "znbzbx_busistripalter",
				"status": 0,
				"returncount": 0,
				"verifystate": 0,
				"code": "TAPLC240410000002",
				"ibillmakemethod": 0,
				"vnatexchratetype_digit": 6,
				"pk_busimemo_before": "1837985289764601871",
				"pk_handlepsn_name": "李旭",
				"creatorId": "1845360968389361668",
				"imakebilltype": 0,
				"chandleorg_name": "用友网络科技股份有限公司",
				"vcurrency": "1837319999347752994",
				"vouchdate": "2024-04-10 00:00:00",
				"isusebody": true,
				"cfinaceorg": "1837963849289957378",
				"printCount": 0,
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"ismulticurrency": false,
				"pubts": "2024-04-10 11:30:43",
				"napplymny_before": 66,
				"createDate": "2024-04-10 00:00:00",
				"vfinacedeptid_name": "用友股份",
				"creator": "李旭",
				"directPrintCount": 0,
				"vfinacedeptid": "1837964373260763139",
				"vnatcurrency_moneyDigit": 2,
				"pk_busimemo_after_name": "办公费",
				"bustype": "1837319990757819634",
				"vnatexchratetype_name": "基准汇率",
				"cfinaceorg_name": "用友网络科技股份有限公司",
				"pk_memoapply_code": "TAPL240408000003",
				"createTime": "2024-04-10 11:30:43",
				"dnatexchratedate": "2024-04-08 00:00:00",
				"vnatexchratetype": "0000LNMSTNR5E7BNR70000",
				"vhandledeptid_name": "用友股份",
				"napplymny_after": 66
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	},
	"traceId": "e407b9afe411602d"
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

