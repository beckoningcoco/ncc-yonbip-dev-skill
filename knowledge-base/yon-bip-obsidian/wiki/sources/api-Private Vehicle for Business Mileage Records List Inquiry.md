---
title: "私车公用里程记事列表查询"
apiId: "2147562555338391558"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Expense Journal Entry"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Expense Journal Entry]
platform_version: "BIP"
source_type: community-api-docs
---

# 私车公用里程记事列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Expense Journal Entry (ZNBZ)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/znbz/rbsm/api/bill/expenserecord/list

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
| 小数位数:0,最大长度:10 | 否 | 是 | 每页行数 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页号 |
| code | string | 否 | 否 | 单据号 |
| status | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 单据状态(0:待提交;1审批完成;3审批中 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始时间, 格式为:yyyy-MM-dd |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束时间, 格式为:yyyy-MM-dd |
| simple | object | 否 | 否 | 根据档案code查询 |
| cfinaceorg | string | 否 | 否 | 费用承担组织id |
| bustype | string | 否 | 否 | 交易类型id |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| field | string | 否 | 否 | 字段(pubts:时间戳、creator:创建人名称) |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) |
| value1 | string | 否 | 否 | 查询条件值1 |
| value2 | string | 否 | 否 | 查询条件值1 |
| pubts | string | 否 | 否 | 时间戳开始时间|时间戳结束时间 例如：2021-05-06 23:10:00|2021-05-08 12:09:00 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/expenserecord/list?access_token=访问令牌
Body: {
	"pageSize": 0,
	"pageIndex": 0,
	"code": "",
	"status": 0,
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"simple": {},
	"cfinaceorg": "",
	"bustype": "",
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
		}
	],
	"pubts": ""
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 调用信息 示例：操作成功 |
| data | object | 否 | 数据 |
| recordList | object | 否 | 当前页记录 |
| sumRecordList | object | 否 | 合计值 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 总页数 示例：105 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 起始页数 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 结束页数 示例：10 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页号 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页行数 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总记录数 示例：1042 |

## 5. 正确返回示例

{
	"displayCode": "",
	"code": "200",
	"message": "操作成功",
	"data": {
		"recordList": {
			"chandleorg": "1624924383261229061",
			"vhandledeptid": "1624924632369332227",
			"bustype_name": "里程记事",
			"modifier": "毛月",
			"modifierId": "1625038302969593856",
			"nmileage": 0.9,
			"pk_endaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
			"pk_expensebill_code": "TERD241129000001",
			"pk_begaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
			"imileageunit": 0,
			"modifyTime": "2024-03-11 15:38:44",
			"denddate": "2024-01-26 00:00:00",
			"travelalgorithmgranularity": "record",
			"vcurrency_name": "人民币",
			"vcurrency_moneyDigit": 2,
			"id": 1916101682489982976,
			"pk_endlocatin_modify_name": "北京市海淀区西北旺镇北清路永丰产业园",
			"pk_dutyjob": "1661441801532211203",
			"pk_costpsndoc_name": "毛月",
			"modifyDate": "2024-03-11 00:00:00",
			"nnatrecordsubsidymny": 9,
			"vcurrency_currTypeSign": "¥",
			"pk_dutyrank_name": "职级1",
			"vnatcurrency": "1624347938534197663",
			"expenserecordbs": [
				{
					"chandleorg": "1624924383261229061",
					"vhandledeptid": "1624924632369332227",
					"nmileage": 0.9,
					"pk_endaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
					"nsubsidymodifymny": 9,
					"pk_begaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
					"imileageunit": 0,
					"vcurrency_name": "人民币",
					"vcurrency_moneyDigit": 2,
					"nnatsubsidymodifymny": 9,
					"pk_expenserecord": 1916101682489982976,
					"id": 1916101682489982977,
					"pk_endlocatin_modify_name": "北京市海淀区西北旺镇北清路永丰产业园",
					"pk_dutyjob": "1661441801532211203",
					"vcurrency_currTypeSign": "¥",
					"pk_dutyrank_name": "职级1",
					"dcostdate": "2024-01-26 00:00:00",
					"vnatcurrency": "1624347938534197663",
					"nmileagetotaltime": 0,
					"nnatexchrate": 1,
					"pk_handlepsn": "1625038285800734721",
					"islocationmodified": 0,
					"itraffictype": 0,
					"pk_mileagerecord": 1916099251547930636,
					"nmileagemodify": 0.9,
					"vcurrency": "1624347938534197663",
					"nsubsidymny": 9,
					"pk_beglocation_modify_name": "北京市海淀区西北旺镇用友产业园西区",
					"dbegintime": "2024-01-26 18:01:52",
					"vreason": "测试",
					"pk_dutyrank": "1661434732016041991",
					"dendtime": "2024-01-26 18:02:42",
					"nnatsubsidymny": 9
				}
			],
			"dbegindate": "2024-01-26 00:00:00",
			"nrecordsubsidymny": 9,
			"pk_handlepsn": "1625038285800734721",
			"pk_billtype": "znbzbx_expenserecord",
			"status": 0,
			"code": "F24012600001",
			"nmileagemodify": 0.9,
			"creatorId": 1625038302969593856,
			"vcurrency": "1624347938534197663",
			"ibusistatus": 1,
			"vouchdate": "2024-01-26 00:00:00",
			"joblistid": "1625038285800734722",
			"cfinaceorg": "1624924383261229061",
			"pk_beglocation_modify_name": "北京市海淀区西北旺镇用友产业园西区",
			"dbegintime": "18:01:52",
			"blongdistance": true,
			"createDate": "2024-01-26 00:00:00",
			"pk_dutyrank": "1661434732016041991",
			"vfinacedeptid": "1624924632369332227",
			"nexpensemny": 9,
			"bustype": "1624347904155583108",
			"dendtime": "18:02:42",
			"createTime": "2024-01-26 18:06:34",
			"dnatexchratedate": "2024-01-26 00:00:00",
			"vnatexchratetype": "0000LC8RFCMT7S3IFX0000",
			"nnatexpensemny": 9,
			"pk_costpsndoc": "1625038285800734721"
		},
		"sumRecordList": {
			"nexpensemny": 0,
			"ntaxmny": 0,
			"nrecordsubsidymny": 0,
			"ninvsummny": 0,
			"ninvtaxmny": 0,
			"ninvuntaxmny": 0,
			"nnatexpensemny": 0,
			"nnattaxmny": 0,
			"nnatrecordsubsidymny": 0,
			"nnatinvsummny": 0,
			"nnatinvtaxmny": 0,
			"nnatinvuntaxmny": 0
		},
		"pageCount": 105,
		"beginPageIndex": 1,
		"endPageIndex": 10,
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1042
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

