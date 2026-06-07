---
title: "预提单保存"
apiId: "b3ec167e8e304de3a0c60ad287ae5796"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accrual Document"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accrual Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 预提单保存

> `ContentType	application/json` 请求方式	POST | 分类: Accrual Document (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/manualwithholding/save

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
| id | long | 否 | 否 | 单据id(_status为Update时必填) |
| code | string | 否 | 否 | 单据号(设置手工编号时必输，自动编号时输入无效) 示例：0082 |
| vouchdate | string | 否 | 是 | 单据日期(格式：yyyy-MM-dd) 示例：2021-09-08 |
| dcostdate | string | 否 | 是 | 发生日期(格式：yyyy-MM-dd) 示例：2021-09-08 |
| cfinaceorg | string | 否 | 是 | 费用承担组织(支持id和code) 示例：2184854309114112 |
| cfinacecostcenter | string | 否 | 否 | 费用承担成本中心（支持id和code） |
| profitcenter | string | 否 | 否 | 利润中心(支持id或code；非特征租户不填，特征租户可填) |
| vfinacedeptid | string | 否 | 是 | 费用承担部门(支持id和code) 示例：2184856228794624 |
| caccountorg | string | 否 | 是 | 会计主体(支持id和code) 示例：2184854309114112 |
| bustype | string | 否 | 是 | 交易类型(支持id和code) 示例：2183687370068230 |
| pk_project | string | 否 | 否 | 项目(支持id和code) |
| pk_busimemo | long | 否 | 否 | 费用项目id |
| pk_busimemo_code | string | 否 | 否 | 费用项目编码 |
| pk_busimemotype | long | 否 | 否 | 费用项目类别id |
| pk_busimemotype_code | string | 否 | 否 | 费用项目类别编码 |
| pk_cusdoc | long | 否 | 否 | 供应商id |
| pk_cusdoc_code | string | 否 | 否 | 供应商编码 |
| pk_customer | long | 否 | 否 | 客户id |
| pk_customer_code | string | 否 | 否 | 客户编码 |
| pk_handlepsn | string | 否 | 是 | 经办人(支持id和code) 示例：2185003811393792 |
| vhandledeptid | string | 否 | 是 | 经办人部门(支持id和code) 示例：2184856228794624 |
| chandleorg | string | 否 | 是 | 经办人组织(支持id和code) 示例：2184854309114112 |
| vcurrency | string | 否 | 是 | 预提币种(支持id和code) 示例：2183687327011840 |
| vnatcurrency | string | 否 | 是 | 组织本币(支持id和code) 示例：2183687327011840 |
| vnatexchratetype | string | 否 | 是 | 汇率类型(支持id和code) 示例：py7y8nze |
| vnatexchratetype_digit | long | 否 | 否 | 汇率精度 示例：6 |
| dnatexchratedate | string | 否 | 是 | 汇率日期 示例：2021-09-08 00:00:00 |
| nnatbaseexchrate | BigDecimal | 否 | 是 | 基准汇率 示例：1 |
| nnatexchrate | BigDecimal | 否 | 是 | 汇率 示例：1 |
| vcurrency_moneyDigit | long | 否 | 否 | 原币币种金额精度 示例：2 |
| vnatcurrency_moneyDigit | long | 否 | 否 | 组织本币金额精度 示例：2 |
| nnatwithholdingmny | BigDecimal | 否 | 是 | 预提金额-本币 示例：10 |
| vreason | string | 否 | 是 | 预提事由 示例：预提单测试 |
| vmemo | string | 否 | 否 | 备注 |
| nwithholdingmny | BigDecimal | 否 | 是 | 预提金额 示例：10 |
| iredbluestatus | string | 否 | 否 | 红蓝单状态(0:蓝单;1:红单，默认蓝单，红单此参数必填，且金额为负数) 示例：0 |
| vattachmentass | string | 否 | 否 | 单据附件id 示例：HKFmJhMK2tgqEgfxSR8DNxwn3R92J9x9 |
| creator | string | 否 | 否 | 创建人 示例：王建斌 |
| creator_code | string | 否 | 否 | 创建人编码(不传值默认YonSuite默认用户) |
| creatorId | long | 否 | 否 | 创建人id(不传值默认YonSuite默认用户) 示例：2185004199465216 |
| pk_dutyjob | string | 否 | 否 | 职务ID 示例：1661441878841622529 |
| pk_dutyrank | string | 否 | 否 | 职级ID 示例：1661434766375780353 |
| pk_dutypost | string | 否 | 否 | 岗位ID 示例：1900258913944600583 |
| ManualWithholdingBVO | object | 是 | 是 | 预提单子表 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/manualwithholding/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"ismulticurrency": "false",
		"id": 0,
		"code": "0082",
		"vouchdate": "2021-09-08",
		"dcostdate": "2021-09-08",
		"cfinaceorg": "2184854309114112",
		"cfinacecostcenter": "",
		"profitcenter": "",
		"vfinacedeptid": "2184856228794624",
		"caccountorg": "2184854309114112",
		"bustype": "2183687370068230",
		"pk_project": "",
		"pk_busimemo": 0,
		"pk_busimemo_code": "",
		"pk_busimemotype": 0,
		"pk_busimemotype_code": "",
		"pk_cusdoc": 0,
		"pk_cusdoc_code": "",
		"pk_customer": 0,
		"pk_customer_code": "",
		"pk_handlepsn": "2185003811393792",
		"vhandledeptid": "2184856228794624",
		"chandleorg": "2184854309114112",
		"vcurrency": "2183687327011840",
		"vnatcurrency": "2183687327011840",
		"vnatexchratetype": "py7y8nze",
		"vnatexchratetype_digit": 6,
		"dnatexchratedate": "2021-09-08 00:00:00",
		"nnatbaseexchrate": 1,
		"nnatexchrate": 1,
		"vcurrency_moneyDigit": 2,
		"vnatcurrency_moneyDigit": 2,
		"nnatwithholdingmny": 10,
		"vreason": "预提单测试",
		"vmemo": "",
		"nwithholdingmny": 10,
		"iredbluestatus": "0",
		"vattachmentass": "HKFmJhMK2tgqEgfxSR8DNxwn3R92J9x9",
		"creator": "王建斌",
		"creator_code": "",
		"creatorId": 2185004199465216,
		"pk_dutyjob": "1661441878841622529",
		"pk_dutyrank": "1661434766375780353",
		"pk_dutypost": "1900258913944600583",
		"ManualWithholdingBVO": [
			{
				"id": "",
				"voriginbillid": "",
				"voriginbillrowid": "",
				"voriginbilltype": "",
				"pk_project": "",
				"pk_cusdoc": 0,
				"pk_cusdoc_code": "",
				"pk_customer": 0,
				"pk_customer_code": "",
				"pk_busimemo": 2184859339739392,
				"pk_busimemo_code": "",
				"pk_busimemotype": 2184858240700672,
				"pk_busimemotype_code": "",
				"cfinaceorg": "2184854309114112",
				"pk_handlepsn": "2185003811393792",
				"vhandledeptid": "2184856228794624",
				"chandleorg": "2184854309114112",
				"vfinacedeptid": "2184856228794624",
				"caccountorg": "2184854309114112",
				"chandlecostcenter": 0,
				"chandlecostcenter_code": "",
				"cfinacecostcenter": 0,
				"cfinacecostcenter_code": "",
				"profitcenter": "",
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": 2,
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": 2,
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": 6,
				"dnatexchratedate": "2021-09-08 00:00:00",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"nwithholdingmny": 10,
				"nnatwithholdingmny": 10,
				"vmemo": "",
				"_status": "Insert",
				"pk_dutyjob": "1661441878841622529",
				"pk_dutyrank": "1661434766375780353",
				"pk_dutypost": "1900258913944600583"
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
| displayCode | string | 否 | 异常码 |
| code | long | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| ismulticurrency | boolean | 否 | 是否多币种(true:是;false:不是) 示例：false |
| code | string | 否 | 单据号 示例：0082 |
| vouchdate | string | 否 | 单据日期 示例：2021-09-08 00:00:00 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_manualwithholding |
| cfinaceorg | string | 否 | 费用承担组织id 示例：2184854309114112 |
| cfinacecostcenter | string | 否 | 费用承担成本中心id 示例：2184854309114112 |
| profitcenter | string | 否 | 利润中心 示例：1848562287946242 |
| vfinacedeptid | string | 否 | 费用承担部门id 示例：2184856228794624 |
| caccountorg | string | 否 | 会计主体id 引用：会计主体 FinanceOrgVO 示例：2184854309114112 |
| bustype | string | 否 | 交易类型id 示例：2183687370068230 |
| pk_handlepsn | string | 否 | 经办人id 引用：员工(新)StaffNew 示例：2185003811393792 |
| vhandledeptid | string | 否 | 经办人部门id 示例：2184856228794624 |
| chandleorg | string | 否 | 经办人组织id 示例：2184854309114112 |
| vcurrency | string | 否 | 预提币种id 示例：2183687327011840 |
| vnatcurrency | string | 否 | 组织本币id 示例：2183687327011840 |
| vnatexchratetype | string | 否 | 汇率类型id 示例：py7y8nze |
| vnatexchratetype_digit | string | 否 | 汇率精度 示例：6 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2021-09-08 00:00:00 |
| nnatbaseexchrate | long | 否 | 基准汇率 示例：1 |
| nnatexchrate | long | 否 | 汇率 示例：1 |
| vcurrency_moneyDigit | string | 否 | 原币币种金额精度 示例：2 |
| vnatcurrency_moneyDigit | string | 否 | 组织本币金额精度 示例：2 |
| nnatwithholdingmny | BigDecimal | 否 | 预提金额-本币 示例：10 |
| vreason | string | 否 | 预提事由 示例：预提单测试 |
| nwithholdingmny | BigDecimal | 否 | 预提金额 示例：10 |
| iredbluestatus | long | 否 | 红蓝单状态(0:蓝单;1:红单) 示例：0 |
| bredbacked | boolean | 否 | 是否被红冲(true:是;false:不是) 示例：false |
| bfinished | boolean | 否 | 是否冲销完成(true:已完成;false:未完成) 示例：false |
| status | long | 否 | 单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：0 |
| irejectstatus | long | 否 | 驳回状态(0:正常;1:驳回) 示例：0 |
| ibillmakemethod | long | 否 | 填单方式(0:PC新增;1:移动新增;2:EXCEL导入) 示例：0 |
| vattachmentass | string | 否 | 单据附件id 示例：HKFmJhMK2tgqEgfxSR8DNxwn3R92J9x9 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：false |
| verifystate | long | 否 | 审批状态(0:待提交;1:审批完成;3:审批中) 示例：0 |
| returncount | long | 否 | 退回次数 示例：0 |
| creator | string | 否 | 创建人 示例：王建斌 |
| createTime | string | 否 | 创建时间 示例：2021-09-08 14:45:56 |
| createDate | string | 否 | 创建日期 示例：2021-09-08 14:45:56 |
| creatorId | long | 否 | 创建人id 示例：2185004199465216 |
| ManualWithholdingBVO | object | 是 | 预提单子表 |
| id | long | 否 | 单据id 示例：2422924184408320 |
| barCode | string | 否 | 条形码 示例：znbzbx_manualwithholding|2422924184408320 |
| pubts | string | 否 | 时间戳 示例：2021-09-08 14:45:57 |
| tenant | long | 否 | 租户id 示例：2183682413744384 |
| yTenantId | string | 否 | 租户 示例：py7y8nze |

## 5. 正确返回示例

{
	"code": 200,
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"ismulticurrency": false,
		"code": "0082",
		"vouchdate": "2021-09-08 00:00:00",
		"pk_billtype": "znbzbx_manualwithholding",
		"cfinaceorg": "2184854309114112",
		"cfinacecostcenter": "2184854309114112",
		"profitcenter": "1848562287946242",
		"vfinacedeptid": "2184856228794624",
		"caccountorg": "2184854309114112",
		"bustype": "2183687370068230",
		"pk_handlepsn": "2185003811393792",
		"vhandledeptid": "2184856228794624",
		"chandleorg": "2184854309114112",
		"vcurrency": "2183687327011840",
		"vnatcurrency": "2183687327011840",
		"vnatexchratetype": "py7y8nze",
		"vnatexchratetype_digit": "6",
		"dnatexchratedate": "2021-09-08 00:00:00",
		"nnatbaseexchrate": 1,
		"nnatexchrate": 1,
		"vcurrency_moneyDigit": "2",
		"vnatcurrency_moneyDigit": "2",
		"nnatwithholdingmny": 10,
		"vreason": "预提单测试",
		"nwithholdingmny": 10,
		"iredbluestatus": 0,
		"bredbacked": false,
		"bfinished": false,
		"status": 0,
		"irejectstatus": 0,
		"ibillmakemethod": 0,
		"vattachmentass": "HKFmJhMK2tgqEgfxSR8DNxwn3R92J9x9",
		"isWfControlled": false,
		"verifystate": 0,
		"returncount": 0,
		"creator": "王建斌",
		"createTime": "2021-09-08 14:45:56",
		"createDate": "2021-09-08 14:45:56",
		"creatorId": 2185004199465216,
		"ManualWithholdingBVO": [
			{
				"bfinished": false,
				"hasDefaultInit": true,
				"pk_busimemo": 2184859339739392,
				"pk_busimemotype": 2184858240700672,
				"cfinaceorg": "2184854309114112",
				"nlineno": 10,
				"pk_handlepsn": "2185003811393792",
				"vhandledeptid": "2184856228794624",
				"chandleorg": "2184854309114112",
				"vfinacedeptid": "2184856228794624",
				"cfinacecostcenter": "2184856228794624",
				"profitcenter": "2184854309114112",
				"caccountorg": "2184854309114112",
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": "2",
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2021-09-08 00:00:00",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"nwithholdingmny": 10,
				"nnatwithholdingmny": 10,
				"id": 2422924184408321,
				"pk_manualwithholding": 2422924184408320,
				"pubts": "2021-09-08 14:45:56",
				"tenant": 2183682413744384,
				"yTenantId": "py7y8nze"
			}
		],
		"id": 2422924184408320,
		"barCode": "znbzbx_manualwithholding|2422924184408320",
		"pubts": "2021-09-08 14:45:57",
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

