---
title: "出差申请单列表查询"
apiId: "caee4a9ca55844a98ba3ebf31df2fe8f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Travel Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Travel Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 出差申请单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Travel Request (ZNBZ)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/znbz/rbsm/api/bill/busistrip/list

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageSize | long | 否 | 是 | 每页行数 示例：20 |
| pageIndex | long | 否 | 是 | 页号 示例：1 |
| code | string | 否 | 否 | 单据号 示例：12 |
| status | long | 否 | 否 | 单据状态(0:待提交;1:审批完成;3:审批中) 示例：0 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始时间, 格式为:yyyy-MM-dd 示例：2021-07-01 |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束时间, 格式为:yyyy-MM-dd 示例：2021-08-06 |
| vreason | string | 否 | 否 | 申请事由 示例：你好 |
| cfinaceorg | string | 否 | 否 | 费用承担组织id 示例：1837963849289957378 |
| bustype | string | 否 | 否 | 交易类型id 示例：1837319990757819631 |
| pubts | string | 否 | 否 | 时间戳开始时间|时间戳结束时间 示例：2021-05-06 23:10:00|2021-05-08 12:09:00 |
| simpleVOs | object | 是 | 否 | 简单查询条件 |
| field | string | 否 | 否 | 字段(pubts:时间戳、creator:创建人名称、dapplydate:申请日期、dbegindate：出差起始日期、denddate：出差截止日期、pk_begaddr:出发地id、pk_begaddr.name:出发地名称、pk_endaddr：目的地id、pk_endaddr.name：目的地名称) 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |
| value1 | string | 否 | 否 | 查询条件值1 示例：2021-07-01 00:00:00 |
| value2 | string | 否 | 否 | 查询条件值2 示例：2021-07-31 23:59:59 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/busistrip/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"code": "12",
	"status": 0,
	"open_vouchdate_begin": "2021-07-01",
	"open_vouchdate_end": "2021-08-06",
	"vreason": "你好",
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
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 数据 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 每页条数 示例：20 |
| recordCount | long | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 列表数据 |
| sumRecordList | object | 是 | 汇总信息 |
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
				"vhandledeptid": "1524154726676430853",
				"chandleorg": "1524154503347568646",
				"vhandlepsn_name": "刘家安",
				"pk_busimemo_name": "差旅费",
				"pk_busimemotype_name": "日常费用",
				"napplymny": 12,
				"caccountorg_name": "费控A",
				"bustype_name": "出差申请单",
				"irejectstatus": 0,
				"isloanfinished": false,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币",
				"id": 1529493757571891203,
				"vattachmentass": "ddde2697f2c04eb584e6dbfd33702439",
				"isWfControlled": true,
				"isfinished": false,
				"pk_busimemo": 1524171846429704192,
				"barCode": "znbzbx_busistrip|1529493757571891203",
				"auditorId": 0,
				"auditTime": "",
				"caccountorg": "1524154503347568646",
				"vnatcurrency": "1523413904973627420",
				"nnatexchrate": 1,
				"pk_handlepsn": "1524170867182403590",
				"pk_billtype": "znbzbx_busistrip",
				"status": 0,
				"returncount": 0,
				"verifystate": 0,
				"code": "TAPL220823000001",
				"ibillmakemethod": 1,
				"vnatexchratetype_digit": 6,
				"dapplydate": "2022-08-23 00:00:00",
				"creatorId": 1524170867167723526,
				"chandleorg_name": "费控A",
				"vcurrency": "1523413904973627420",
				"vouchdate": "2022-08-23 00:00:00",
				"isusebody": true,
				"cfinaceorg": "1524154503347568646",
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"ismulticurrency": false,
				"pubts": "2022-11-04 10:46:42",
				"vreason": "123",
				"isclose": false,
				"createDate": "2022-08-23 00:00:00",
				"auditDate": "",
				"vfinacedeptid_name": "销售部",
				"creator": "刘家安",
				"vfinacedeptid": "1524154726676430853",
				"vnatcurrency_moneyDigit": 2,
				"bustype": "1523413904950561471",
				"vapplyname": "(白山市-北京市)123",
				"vnatexchratetype_name": "基准汇率",
				"cfinaceorg_name": "费控A",
				"createTime": "2022-08-23 20:08:29",
				"dnatexchratedate": "2022-08-23 00:00:00",
				"nnatapplymny": 12,
				"vnatexchratetype": "0000L6UFPA4E2D845F0000",
				"vhandledeptid_name": "销售部"
			}
		],
		"sumRecordList": [
			{
				"napplymny": 117408.5,
				"nfinishmny": 0
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

1021000999999	服务器异常	请联系系统管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-25

更新

返回参数 verifystate

重新发布

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

