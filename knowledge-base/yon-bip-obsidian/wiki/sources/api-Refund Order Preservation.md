---
title: "退款单保存"
apiId: "93531281d6d24bbe8a4fb95eb94534a6"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Refund Note"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Refund Note]
platform_version: "BIP"
source_type: community-api-docs
---

# 退款单保存

> `ContentType	application/json` 请求方式	POST | 分类: Refund Note (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/refundbill/save

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
| data | object | 否 | 是 | 单据数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| ismulticurrency | string | 否 | 否 | 是否多币种(true:是;false:不是) 示例：false |
| id | long | 否 | 否 | 单据id(_status为Update更新时必填) |
| code | string | 否 | 否 | 单据号(设置手工编号时必输，自动编号时输入无效) 示例：0048 |
| vouchdate | string | 否 | 是 | 单据日期(格式：yyyy-MM-dd) 示例：2021-09-07 00:00:00 |
| dcostdate | string | 否 | 是 | 发生日期(格式：yyyy-MM-dd) |
| cfinaceorg | string | 否 | 是 | 费用承担组织(支持id和code) 示例：2184854309114112 |
| cfinacecostcenter | string | 否 | 否 | 费用承担成本中心（支持id和code） |
| profitcenter | string | 否 | 否 | 利润中心(支持id或code；非特征租户不填，特征租户可填) |
| vfinacedeptid | string | 否 | 是 | 费用承担部门(支持id和code) 示例：2184856228794624 |
| caccountorg | string | 否 | 是 | 会计主体(支持id和code) 示例：2184854309114112 |
| vcurrency | string | 否 | 是 | 退款币种(支持id和code) 示例：2183687327011840 |
| vnatcurrency | string | 否 | 是 | 组织本币(支持id和code) 示例：2183687327011840 |
| vnatexchratetype | string | 否 | 是 | 汇率类型(支持id和code) 示例：py7y8nze |
| vnatexchratetype_digit | long | 否 | 否 | 汇率精度 示例：6 |
| dnatexchratedate | string | 否 | 是 | 汇率日期(格式：yyyy-MM-dd) 示例：2021-09-07 |
| nnatbaseexchrate | BigDecimal | 否 | 是 | 基准汇率 示例：1 |
| nnatexchrate | BigDecimal | 否 | 是 | 汇率 示例：1 |
| vcurrency_moneyDigit | long | 否 | 否 | 原币币种金额精度 示例：2 |
| vnatcurrency_moneyDigit | long | 否 | 否 | 组织本币金额精度 示例：2 |
| nnatreturnmny | BigDecimal | 否 | 是 | 退款总额-本币 示例：123 |
| bustype | string | 否 | 是 | 交易类型(支持id和code) 示例：2183687370068229 |
| pk_handlepsn | string | 否 | 是 | 经办人(支持id和code) 示例：2185003811393792 |
| vhandledeptid | string | 否 | 是 | 经办人部门(支持id和code) 示例：2184856228794624 |
| chandleorg | string | 否 | 是 | 经办人组织(支持id和code) 示例：2184854309114112 |
| vreason | string | 否 | 是 | 退款说明 示例：退款单测试 |
| nreturnmny | long | 否 | 是 | 退款总额 示例：123 |
| vattachmentass | string | 否 | 否 | 单据附件id 示例：e09b418bff724a57a1f8ab3341bc8845 |
| creator | string | 否 | 否 | 创建人 示例：王建斌 |
| creator_code | string | 否 | 否 | 创建人编码(不传值默认YonSuite默认用户) |
| creatorId | long | 否 | 否 | 创建人id(不传值默认YonSuite默认用户) 示例：2185004199465216 |
| pk_dutyjob | string | 否 | 否 | 职务ID 示例：1661441878841622529 |
| pk_dutyrank | string | 否 | 否 | 职级ID 示例：1661434766375780353 |
| pk_dutypost | string | 否 | 否 | 岗位ID 示例：1900258913944600583 |
| ReturnBillBVO | object | 是 | 是 | 退款单明细 |
| RetSettleInfoVO | object | 是 | 是 | 退款单结算信息 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/refundbill/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"ismulticurrency": "false",
		"id": 0,
		"code": "0048",
		"vouchdate": "2021-09-07 00:00:00",
		"dcostdate": "",
		"cfinaceorg": "2184854309114112",
		"cfinacecostcenter": "",
		"profitcenter": "",
		"vfinacedeptid": "2184856228794624",
		"caccountorg": "2184854309114112",
		"vcurrency": "2183687327011840",
		"vnatcurrency": "2183687327011840",
		"vnatexchratetype": "py7y8nze",
		"vnatexchratetype_digit": 6,
		"dnatexchratedate": "2021-09-07",
		"nnatbaseexchrate": 1,
		"nnatexchrate": 1,
		"vcurrency_moneyDigit": 2,
		"vnatcurrency_moneyDigit": 2,
		"nnatreturnmny": 123,
		"bustype": "2183687370068229",
		"pk_handlepsn": "2185003811393792",
		"vhandledeptid": "2184856228794624",
		"chandleorg": "2184854309114112",
		"vreason": "退款单测试",
		"nreturnmny": 123,
		"vattachmentass": "e09b418bff724a57a1f8ab3341bc8845",
		"creator": "王建斌",
		"creator_code": "",
		"creatorId": 2185004199465216,
		"pk_dutyjob": "1661441878841622529",
		"pk_dutyrank": "1661434766375780353",
		"pk_dutypost": "1900258913944600583",
		"ReturnBillBVO": [
			{
				"id": 0,
				"pk_handlepsn": "2185003811393792",
				"vhandledeptid": "2184856228794624",
				"chandleorg": "2184854309114112",
				"vfinacedeptid": "2184856228794624",
				"cfinaceorg": "2184854309114112",
				"cfinacecostcenter": "",
				"profitcenter": "",
				"caccountorg": "2184854309114112",
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": "2",
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": 6,
				"dnatexchratedate": "2021-09-07",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"nremainmny": 0,
				"nreturnmny": 123,
				"nnatreturnmny": 123,
				"nloanreturnmny": 123,
				"pk_loanbill": 2345134943654144,
				"pk_loanbill_b": 2345134943670528,
				"vloandeptid": "2184856228794624",
				"pk_loanpsn": "2185003811393792",
				"pk_cusdoc": 2185034480177408,
				"pk_cusdoc_code": "",
				"pk_customer": 0,
				"pk_customer_code": "",
				"pk_busimemo": 2184860029718784,
				"pk_busimemo_code": "",
				"pk_project": "",
				"nloanmny": 123,
				"nhistoryreturnmny": 0,
				"ncavmny": 0,
				"ntotalremainmny": 123,
				"vloancurrency": "2183687327011840",
				"vloancurrency_moneyDigit": "2",
				"nbaseexchrate": 1,
				"nexchrate": 1,
				"_status": "Insert",
				"pk_dutyjob": "1661441878841622529",
				"pk_dutyrank": "1661434766375780353",
				"pk_dutypost": "1900258913944600583"
			}
		],
		"RetSettleInfoVO": [
			{
				"id": 0,
				"vbankaccount": "999999",
				"vbankaccname": "合法集资办公室",
				"pk_bankdoc": "2184878273385216",
				"pk_banktype": "2184875898393344",
				"pk_currency": "2183687327011840",
				"pk_cusdocbank": 2185034480177413,
				"pk_cusdocbank_code": "",
				"pk_cusdoc": 2185034480177408,
				"pk_cusdoc_code": "",
				"pk_customer": 0,
				"pk_customer_code": "",
				"pk_customerbank": 0,
				"pk_customerbank_code": "",
				"igathertype": "1",
				"pk_balatype": 2183682241614081,
				"pk_balatype_code": "",
				"balatypesrvattr": "0",
				"centerpriseorg": "2184854309114112",
				"pk_currency_opp": "2183687327011840",
				"vmemo_opp": "",
				"pk_enterprisebankacct": "2325222650122752",
				"vbankaccount_opp": "1",
				"vbankaccname_opp": "1",
				"pk_banktype_opp": "2186830872515336",
				"pk_bankdoc_opp": "2186831417381637",
				"pk_enterprisecashacct": "",
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": "2",
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": 6,
				"dnatexchratedate": "2021-09-07",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"vsettlecurrency": "2183687327011840",
				"vsettlecurrency_moneyDigit": "2",
				"nsettlebaseexchrate": 1,
				"nsettleexchrate": 1,
				"nsummny": 123,
				"nsettlesummny": 123,
				"nnatsettlesummny": 123,
				"_status": "Insert",
				"centerpriseorg_caccountorg": "1624924383261229061",
				"centerpriseorg_caccountorg_name": "my费控日常"
			}
		],
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| code | long | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| ismulticurrency | boolean | 否 | 是否多币种(true:是;false:不是) 示例：false |
| code | string | 否 | 单据号 示例：0048 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_refundbill |
| vouchdate | string | 否 | 单据日期 示例：2021-09-07 00:00:00 |
| cfinaceorg | string | 否 | 费用承担组织id 示例：2184854309114112 |
| cfinacecostcenter | string | 否 | 费用承担成本中心id 示例：2184854309114112 |
| profitcenter | string | 否 | 利润中心 示例：2184854309114112 |
| vfinacedeptid | string | 否 | 费用承担部门id 示例：2184856228794624 |
| caccountorg | string | 否 | 会计主体id 引用：会计主体 FinanceOrgVO 示例：2184854309114112 |
| vcurrency | string | 否 | 退款币种id 示例：2183687327011840 |
| vnatcurrency | string | 否 | 组织本币id 示例：2183687327011840 |
| vnatexchratetype | string | 否 | 汇率类型id 示例：py7y8nze |
| vnatexchratetype_digit | string | 否 | 汇率精度 示例：6 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2021-09-07 00:00:00 |
| nnatbaseexchrate | long | 否 | 基准汇率 示例：1 |
| nnatexchrate | long | 否 | 汇率 示例：1 |
| vcurrency_moneyDigit | string | 否 | 原币币种金额精度 示例：2 |
| vnatcurrency_moneyDigit | string | 否 | 组织本币金额精度 示例：2 |
| nnatreturnmny | BigDecimal | 否 | 退款总额-本币 示例：123 |
| bustype | string | 否 | 交易类型id 示例：2183687370068229 |
| pk_handlepsn | string | 否 | 经办人id 引用：员工(新)StaffNew 示例：2185003811393792 |
| vhandledeptid | string | 否 | 经办人部门id 示例：2184856228794624 |
| chandleorg | string | 否 | 经办人组织id 示例：2184854309114112 |
| vreason | string | 否 | 退款说明 示例：退款单测试 |
| nreturnmny | BigDecimal | 否 | 退款总额 示例：123 |
| status | long | 否 | 单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：0 |
| isettlestatus | long | 否 | 结算状态,0:待结算、1:结算中、2:结算成功、3:结算止付、4:结算部分成功、5:无需结算、 示例：0 |
| irejectstatus | long | 否 | 驳回状态(0:正常;1:驳回) 示例：0 |
| ibillmakemethod | long | 否 | 填单方式(0:PC新增;1:移动新增;2:EXCEL导入;3:openAPI保存) 示例：3 |
| vattachmentass | string | 否 | 单据附件id 示例：e09b418bff724a57a1f8ab3341bc8845 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：false |
| verifystate | long | 否 | 审批状态(0:待提交;1:审批完成;3:审批中) 示例：0 |
| returncount | long | 否 | 退回次数 示例：0 |
| creator | string | 否 | 创建人 示例：王建斌 |
| createDate | string | 否 | 创建日期 示例：2021-09-07 15:43:06 |
| createTime | string | 否 | 创建时间 示例：2021-09-07 15:43:06 |
| creatorId | long | 否 | 创建人id 示例：2185004199465216 |
| ReturnBillBVO | object | 是 | 退款单子表 |
| RetSettleInfoVO | object | 是 | 退款单结算信息 |
| id | long | 否 | 单据id 示例：2421564801650944 |
| barCode | string | 否 | 条形码 示例：znbzbx_refundbill|2421564801650944 |
| pubts | string | 否 | 时间戳 示例：2021-09-07 15:43:07 |
| tenant | long | 否 | 租户id 示例：2183682413744384 |
| yTenantId | string | 否 | 租户 示例：py7y8nze |

## 5. 正确返回示例

{
	"code": 200,
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"ismulticurrency": false,
		"code": "0048",
		"pk_billtype": "znbzbx_refundbill",
		"vouchdate": "2021-09-07 00:00:00",
		"cfinaceorg": "2184854309114112",
		"cfinacecostcenter": "2184854309114112",
		"profitcenter": "2184854309114112",
		"vfinacedeptid": "2184856228794624",
		"caccountorg": "2184854309114112",
		"vcurrency": "2183687327011840",
		"vnatcurrency": "2183687327011840",
		"vnatexchratetype": "py7y8nze",
		"vnatexchratetype_digit": "6",
		"dnatexchratedate": "2021-09-07 00:00:00",
		"nnatbaseexchrate": 1,
		"nnatexchrate": 1,
		"vcurrency_moneyDigit": "2",
		"vnatcurrency_moneyDigit": "2",
		"nnatreturnmny": 123,
		"bustype": "2183687370068229",
		"pk_handlepsn": "2185003811393792",
		"vhandledeptid": "2184856228794624",
		"chandleorg": "2184854309114112",
		"vreason": "退款单测试",
		"nreturnmny": 123,
		"status": 0,
		"isettlestatus": 0,
		"irejectstatus": 0,
		"ibillmakemethod": 3,
		"vattachmentass": "e09b418bff724a57a1f8ab3341bc8845",
		"isWfControlled": false,
		"verifystate": 0,
		"returncount": 0,
		"creator": "王建斌",
		"createDate": "2021-09-07 15:43:06",
		"createTime": "2021-09-07 15:43:06",
		"creatorId": 2185004199465216,
		"ReturnBillBVO": [
			{
				"breturn": true,
				"hasDefaultInit": true,
				"pk_handlepsn": "2185003811393792",
				"vhandledeptid": "2184856228794624",
				"chandleorg": "2184854309114112",
				"vfinacedeptid": "2184856228794624",
				"cfinaceorg": "2184854309114112",
				"cfinacecostcenter": "2184854309114112",
				"profitcenter": "2184854309114112",
				"caccountorg": "2184854309114112",
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": "2",
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2021-09-07 00:00:00",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"nremainmny": 0,
				"nreturnmny": 123,
				"nnatreturnmny": 123,
				"nlineno": 10,
				"nloanreturnmny": 123,
				"pk_loanbill_code": "0171",
				"pk_loanbill": 2345134943654144,
				"pk_loanbill_b": 2345134943670528,
				"pk_loanbilltype": "znbzbx_pubprepay",
				"vloandeptid": "2184856228794624",
				"pk_loanpsn": "2185003811393792",
				"pk_cusdoc": 2185034480177408,
				"pk_busimemo": 2184860029718784,
				"nloanmny": 123,
				"ntotalremainmny": 123,
				"vloancurrency": "2183687327011840",
				"vloancurrency_moneyDigit": "2",
				"nbaseexchrate": 1,
				"nexchrate": 1,
				"id": 2421564801650945,
				"pk_returnbill": 2421564801650944,
				"pubts": "2021-09-07 15:43:07",
				"tenant": 2183682413744384,
				"yTenantId": "py7y8nze"
			}
		],
		"RetSettleInfoVO": [
			{
				"ipaystartpoint": 1,
				"bcansettlesysmodify": true,
				"bjournalizing": true,
				"iaraptype": 1,
				"hasDefaultInit": true,
				"vbankaccount": "999999",
				"pk_bankdoc": "2184878273385216",
				"pk_banktype": "2184875898393344",
				"pk_currency": "2183687327011840",
				"accttype": "0",
				"pk_cusdocbank": 2185034480177413,
				"pk_cusdoc": 2185034480177408,
				"igathertype": 1,
				"pk_balatype": 2183682241614081,
				"balatypesrvattr": 0,
				"centerpriseorg": "2184854309114112",
				"pk_currency_opp": "2183687327011840",
				"pk_enterprisebankacct": "2325222650122752",
				"pk_enterprisebankacct_name": "1",
				"vbankaccount_opp": "1",
				"pk_banktype_opp": "2186830872515336",
				"pk_bankdoc_opp": "2186831417381637",
				"accttype_opp": "0",
				"isettlestatus": 0,
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": "2",
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2021-09-07 00:00:00",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"vsettlecurrency": "2183687327011840",
				"vsettlecurrency_moneyDigit": "2",
				"nsettlebaseexchrate": 1,
				"nsettleexchrate": 1,
				"nlineno": 10,
				"nsummny": 123,
				"nsettlesummny": 123,
				"nnatsettlesummny": 123,
				"id": 2421564801650946,
				"pk_returnbill": 2421564801650944,
				"pubts": "2021-09-07 15:43:07",
				"tenant": 2183682413744384,
				"yTenantId": "py7y8nze"
			}
		],
		"id": 2421564801650944,
		"barCode": "znbzbx_refundbill|2421564801650944",
		"pubts": "2021-09-07 15:43:07",
		"tenant": 2183682413744384,
		"yTenantId": "py7y8nze"
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

