---
title: "差旅费报销单审核"
apiId: "c4b4bba0c80e420187ae849c4196b655"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Travel Expense Report"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Travel Expense Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 差旅费报销单审核

> `ContentType	application/json` 请求方式	POST | 分类: Travel Expense Report (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/travelexpbill/audit

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 请求数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 是 | 单据id 示例：2365029317071104 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/travelexpbill/audit?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2365029317071104
	}
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
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 单据id 示例：2481018845958400 |
| verifystate | long | 否 | 审批状态(0:初始开立;1:审批中;2:审批完成;3:不通过流程终止;4:驳回到制单) 示例：2 |
| auditor | string | 否 | 审批人 示例：YonSuite默认用户 |
| auditorId | long | 否 | 审批人ID 示例：1951632934146304 |
| auditTime | string | 否 | 审批时间 示例：2021-11-01 15:49:41 |
| auditDate | string | 否 | 审批日期 示例：2021-11-01 00:00:00 |
| status | long | 否 | 单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：1 |
| expsettleinfos | object | 是 | 报销单结算信息 |
| pubts | string | 否 | 时间戳 示例：2021-11-01 10:25:20 |
| isettlestatus | long | 否 | 结算状态,0:待结算、1:结算中、2:结算成功、3:结算止付、4:结算部分成功、5:无需结算、 示例：5 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"resubmitCheckKey": "OPENAPI_c4b4bba0c80e420187ae849c4196b655_xtikzjvp_1",
		"id": 2481018845958400,
		"verifystate": 2,
		"auditor": "YonSuite默认用户",
		"auditorId": 1951632934146304,
		"auditTime": "2021-11-01 15:49:41",
		"auditDate": "2021-11-01 00:00:00",
		"status": 1,
		"expsettleinfos": [
			{
				"vbankaccname": "黄东发",
				"pk_currency_opp": "G001ZM0000DEFAULTCURRENCT00000000001",
				"vbanktypename": "MC银行",
				"pk_enterprisebankacct": "2066500686730496",
				"pk_bankdoc": "ff5a879aa02f4ffcbc4f00f3071aced2",
				"vsettlecurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"nsettlebaseexchrate": 1,
				"iaraptype": 0,
				"pk_expensebill": 2481018845958400,
				"nsettlesummny": 1000,
				"vbankdocname": "MC银行网点",
				"ipaystartpoint": 1,
				"nlineno": 10,
				"isettlestatus": 5,
				"bcansettlesysmodify": true,
				"nnatbaseexchrate": 1,
				"vbankaccname_opp": "厦门开户名1",
				"id": 2481018845958403,
				"pk_balatype": 1951599879852298,
				"vbankaccount_opp": "xm1234568789",
				"pk_banktype": "7b35ad8d263a488a86816775ae33234e",
				"tenant": 1951632932835584,
				"vbankaccount": "888888",
				"accttype_opp": "0",
				"balatypesrvattr": 0,
				"pk_currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"nsettleexchrate": 1,
				"pk_handlepsnbank": "2480936072941824",
				"bjournalizing": true,
				"accttype": "BAT00001",
				"vbanktypename_opp": "中国工商银行22222",
				"nnatsettlesummny": 1000,
				"igathertype": 0,
				"vbankdocname_opp": "中国工商银行股份有限公司天津中北支行22222",
				"pk_banktype_opp": "2028068410757632",
				"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"nsummny": 1000,
				"dnatexchratedate": "2021-10-19 00:00:00",
				"vnatexchratetype": "xtikzjvp",
				"centerpriseorg": "1961973740130560",
				"nnatexchrate": 1,
				"pk_handlepsn": "1987089356869888",
				"pk_bankdoc_opp": "2028068467397888",
				"_status": "Update"
			}
		],
		"pubts": "2021-11-01 10:25:20",
		"isettlestatus": 5
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

