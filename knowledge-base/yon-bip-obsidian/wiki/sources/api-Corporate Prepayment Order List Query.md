---
title: "对公预付单列表查询"
apiId: "435a3ae4b02541abb8effeec5d8e8c78"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Prepayment Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Prepayment Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 对公预付单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Prepayment Request (ZNBZ)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/znbz/rbsm/api/bill/pubprepay/list

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
| pageSize | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 每页行数 示例：20 |
| pageIndex | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 页号 示例：1 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始时间, 格式为:yyyy-MM-dd 示例：2021-07-01 |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束时间, 格式为:yyyy-MM-dd 示例：2021-07-31 |
| code | string | 否 | 否 | 单据号 示例：0047 |
| status | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 单据状态(0:待提交;1:审批完成;3:审批中) 示例：1 |
| bcav | string | 否 | 否 | 是否核销完毕(true:完毕;false:未完毕) 示例：true |
| vreason | string | 否 | 否 | 预付原因 示例：对公预付单 |
| cfinaceorg | string | 否 | 否 | 费用承担组织id 示例：1837963849289957378 |
| bustype | string | 否 | 否 | 交易类型id 示例：1837319990757819631 |
| pubts | string | 否 | 否 | 时间戳开始时间|时间戳结束时间 例如：2021-05-06 23:10:00|2021-05-08 12:09:00 示例：2021-05-06 23:10:00|2021-05-08 12:09:00 |
| simpleVOs | object | 是 | 否 | 简单查询条件 |
| field | string | 否 | 否 | 字段(pubts:时间戳;creator:创建人名称;pk_cusdoc.code:供应商编码;pk_customer.code:客户编码;pk_handlepsn.code:经办人编码;vhandlepsnid.code:费用承担部门编码;cfinaceorg.code:经办人部门编码;chandleorg.code:费用承担业务单元编码;vfinacedeptid.code:经办人组织编码) 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |
| value1 | string | 否 | 否 | 查询条件值1 示例：2021-07-01 00:00:00 |
| value2 | string | 否 | 否 | 查询条件值2 示例：2021-07-31 23:59:59 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/pubprepay/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"open_vouchdate_begin": "2021-07-01",
	"open_vouchdate_end": "2021-07-31",
	"code": "0047",
	"status": 1,
	"bcav": "true",
	"vreason": "对公预付单",
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
| displayCode | string | 否 | 异常码 |

## 5. 正确返回示例

{
	"displayCode": "",
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"chandleorg": "1961970750984448",
				"vhandledeptid": "1961983500620032",
				"vhandlepsn_name": "联调人员",
				"caccountorg_name": "福建中烟工业有限责任公司",
				"bustype_name": "对公预付单",
				"irejectstatus": 0,
				"nloanmny": 5000,
				"pk_cusdoc": 2374536152158464,
				"vcurrency_moneyDigit": 4,
				"vcurrency_name": "人民币",
				"bcav": false,
				"id": 2400120004825344,
				"vattachmentass": "c3d2455192f74182a2e4cb12d4fc2960",
				"isWfControlled": true,
				"barCode": "znbzbx_pubprepay|2400120004825344",
				"pk_cusdoc_name": "测试1",
				"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"caccountorg": "1961970750984448",
				"nnatexchrate": 1,
				"pk_handlepsn": "1999400394723584",
				"pk_billtype": "znbzbx_pubprepay",
				"status": 3,
				"returncount": 0,
				"verifystate": 1,
				"code": "PPAY210823000001",
				"ibillmakemethod": 0,
				"vnatexchratetype_digit": 5,
				"ibudgetexectype": 9,
				"creatorId": 1999400401211648,
				"chandleorg_name": "福建中烟工业有限责任公司",
				"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"vouchdate": "2021-08-23 00:00:00",
				"cfinaceorg": "1961970750984448",
				"isettlestatus": 0,
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"ismulticurrency": false,
				"pubts": "2021-08-23 12:08:50",
				"vreason": "FKHT",
				"createDate": "2021-08-23 00:00:00",
				"vfinacedeptid_name": "烟叶二科-福建中烟",
				"creator": "zdn",
				"vfinacedeptid": "1961983500620032",
				"vnatcurrency_moneyDigit": 4,
				"nnatloanmny": 5000,
				"bustype": "2084944931246336",
				"vnatexchratetype_name": "SUNL汇率类型-精度5",
				"cfinaceorg_name": "福建中烟工业有限责任公司",
				"createTime": "2021-08-23 12:08:20",
				"dnatexchratedate": "2021-08-23 00:00:00",
				"vnatexchratetype": "2227642332419328",
				"vhandledeptid_name": "烟叶二科-福建中烟",
				"pk_apct": 2227642332419329,
				"pk_apct_code": "FKHT2024008"
			}
		],
		"sumRecordList": {
			"ncavmny": 0,
			"nreturnmny": 10,
			"nloanmny": 5000
		},
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"displayCode": ""
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

新增

返回参数 displayCode

2	2025-02-11

新增

返回参数 pk_apct

新增

返回参数 pk_apct_code

增加合同台账说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

