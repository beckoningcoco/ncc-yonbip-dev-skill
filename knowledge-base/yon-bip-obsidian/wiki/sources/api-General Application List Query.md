---
title: "通用申请单列表查询"
apiId: "9dda9e516c664b67bb59d13085c4eb33"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "General Application"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 通用申请单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: General Application (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/memoapply/list

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
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始时间, 格式为:yyyy-MM-dd 示例：2021-07-01 |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束时间, 格式为:yyyy-MM-dd 示例：2021-07-31 |
| vreason | string | 否 | 否 | 申请事由 示例：你好 |
| isfinished | string | 否 | 否 | 是否结束(true:结束;false:未结束) 示例：true |
| open_dapplydate_begin | string | 否 | 否 | 申请日期开始时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2021-09-07 19:43:27 |
| open_dapplydate_end | string | 否 | 否 | 申请日期结束时间, 格式为:yyyy-MM-dd HH:mm:ss 示例：2021-09-07 19:43:27 |
| cfinaceorg | string | 否 | 否 | 费用承担组织id 示例：1837963849289957378 |
| bustype | string | 否 | 否 | 交易类型id 示例：1837319990757819631 |
| pubts | string | 否 | 否 | 时间戳开始时间|时间戳结束时间 例如：2021-05-06 23:10:00|2021-05-08 12:09:00 示例：2021-05-06 23:10:00|2021-05-08 12:09:00 |
| simpleVOs | object | 是 | 否 | 简单查询条件 |
| value1 | string | 否 | 否 | 查询条件值1 示例：2021-07-01 00:00:00 |
| field | string | 否 | 否 | 字段(pubts:时间戳、creator:创建人名称) 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/memoapply/list?access_token=访问令牌
Body: {
	"pageSize": 20,
	"pageIndex": 1,
	"code": "12",
	"status": 0,
	"open_vouchdate_begin": "2021-07-01",
	"open_vouchdate_end": "2021-07-31",
	"vreason": "你好",
	"isfinished": "true",
	"open_dapplydate_begin": "2021-09-07 19:43:27",
	"open_dapplydate_end": "2021-09-07 19:43:27",
	"cfinaceorg": "1837963849289957378",
	"bustype": "1837319990757819631",
	"pubts": "2021-05-06 23:10:00|2021-05-08 12:09:00",
	"simpleVOs": [
		{
			"value1": "2021-07-01 00:00:00",
			"field": "pubts",
			"op": "between"
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
| code | long | 否 | 返回编码 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 数据 |
| pageIndex | long | 否 | 页码 示例：1 |
| pageSize | long | 否 | 每页条数 示例：20 |
| recordCount | long | 否 | 总记录数 示例：0 |
| recordList | object | 是 | 列表数据 |
| sumRecordList | object | 是 | 汇总信息 |
| pageCount | long | 否 | 页面总数 示例：0 |
| beginPageIndex | long | 否 | 开始页码 示例：1 |
| pk_project_name | string | 否 | 项目名称 |
| pk_project | string | 否 | 项目id |
| vmemo | string | 否 | 备注 |
| endPageIndex | long | 否 | 结束页码 示例：0 |

## 5. 正确返回示例

{
	"displayCode": "",
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 0,
		"recordList": [
			{
				"chandleorg": "2330969530159872",
				"vhandledeptid": "2330970343559424",
				"vhandlepsn_name": "孙璐",
				"pk_busimemo_name": "通讯费",
				"pk_busimemotype_name": "日常费用",
				"napplymny": 111,
				"caccountorg_name": "重庆中烟",
				"bustype_name": "重庆-通用申请单",
				"irejectstatus": 0,
				"isloanfinished": false,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币",
				"id": 2364906102673664,
				"vattachmentass": "I9ZSVWylFchsuIU2bxOh21WJtpgd7Fkf",
				"isWfControlled": false,
				"isfinished": false,
				"pk_busimemo": 2098465821337088,
				"barCode": "znbzbx_memoapply|2364906102673664",
				"auditorId": 2165036073259264,
				"caccountorg": "2330969530159872",
				"vnatcurrency": "2095947431137547",
				"auditTime": "2021-07-29 15:07:04",
				"nnatexchrate": 1,
				"pk_handlepsn": "2165035892658688",
				"pk_billtype": "znbzbx_memoapply",
				"status": 1,
				"returncount": 0,
				"verifystate": 2,
				"code": "GAPL210729重庆-通用申请单000004",
				"ibillmakemethod": 0,
				"vnatexchratetype_digit": 4,
				"dapplydate": "2021-07-29 00:00:00",
				"creatorId": 2165036073259264,
				"chandleorg_name": "重庆中烟",
				"pk_busimemotype": 2098465629627904,
				"vcurrency": "2095947431137547",
				"vouchdate": "2021-07-29 00:00:00",
				"isusebody": true,
				"cfinaceorg": "2330969530159872",
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"ismulticurrency": false,
				"pubts": "2021-07-29 15:07:04",
				"vreason": "不是多币种",
				"isclose": false,
				"createDate": "2021-07-29 00:00:00",
				"auditDate": "2021-07-29 00:00:00",
				"vfinacedeptid_name": "重庆销售部",
				"creator": "18559328878",
				"vfinacedeptid": "2330970343559424",
				"vnatcurrency_moneyDigit": 2,
				"auditor": "18559328878",
				"bustype": "2330974204727552",
				"vapplyname": "不是多币种",
				"vnatexchratetype_name": "汇率精度4-SUNL",
				"cfinaceorg_name": "重庆中烟",
				"createTime": "2021-07-29 15:06:54",
				"dnatexchratedate": "2021-07-29 00:00:00",
				"nnatapplymny": 111,
				"vnatexchratetype": "2314050332578048",
				"vhandledeptid_name": "重庆销售部"
			}
		],
		"sumRecordList": [
			{
				"napplymny": 22964.82,
				"nfinishmny": 1510.133
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"pk_project_name": "",
		"pk_project": "",
		"vmemo": "",
		"endPageIndex": 0
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

