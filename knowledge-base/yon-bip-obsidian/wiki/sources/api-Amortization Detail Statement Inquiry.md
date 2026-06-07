---
title: "摊销明细单详情查询"
apiId: "95f3a58410374c4094655001597bd0d8"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Amortization Details"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Amortization Details]
platform_version: "BIP"
source_type: community-api-docs
---

# 摊销明细单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Amortization Details (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/deferexpensedetail/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 单据id（单据id和单据编号二选一必填，id和编号同时存在时以billNo为准。） |
| billNo | string | query | 否 | 单据编号(与单据id必选其一) |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/deferexpensedetail/detail?access_token=访问令牌&id=&billNo=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| vhandledeptid | string | 否 | 经办人部门id 示例：2184856228794624 |
| chandleorg | string | 否 | 经办人组织id 示例：2184854309114112 |
| caccountorg_name | string | 否 | 会计主体 引用：会计主体 FinanceOrgVO 示例：北京天元股份有限公司 |
| masterOrgKeyField | string | 否 | 主组织字段 示例：cfinaceorg |
| bustype_name | string | 否 | 交易类型 示例：摊销明细单 |
| nsumnum | long | 否 | 总摊销期 示例：2 |
| nnatmny | BigDecimal | 否 | 本币金额 示例：30 |
| vlastbillcode | string | 否 | 上游单据号 示例：0047 |
| vsrcbillid | long | 否 | 来源单据id 示例：2404287412539648 |
| ntotalnum | long | 否 | 累计摊销期 示例：1 |
| vcurrency_name | string | 否 | 摊销币种 示例：人民币 |
| vcurrency_moneyDigit | long | 否 | 原币币种金额精度 示例：2 |
| id | long | 否 | 单据id 示例：2404293107716352 |
| ntotalmny | BigDecimal | 否 | 已摊销金额 示例：30 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：false |
| barCode | string | 否 | 条形码 示例：znbzbx_expensebill|2404287412539648 |
| vsrcbilltype | string | 否 | 来源单据类型 示例：znbzbx_expensebill |
| auditorId | long | 否 | 审批人ID 示例：2185004199465216 |
| caccountorg | string | 否 | 会计主体id 示例：2184854309114112 |
| vperiod | string | 否 | 摊销期间 示例：2021-08 |
| vnatcurrency | string | 否 | 组织本币id 示例：2183687327011840 |
| auditTime | string | 否 | 审批时间 示例：2021-08-26 10:53:26 |
| nnatexchrate | long | 否 | 汇率 示例：1 |
| pk_handlepsn | string | 否 | 经办人id 示例：2185003811393792 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_deferexpensedetail |
| status | long | 否 | 单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：1 |
| verifystate | long | 否 | 审批状态(0:待提交;1:审批完成;3:审批中) 示例：2 |
| code | string | 否 | 单据号 示例：0038 |
| vnatexchratetype_digit | long | 否 | 汇率精度 示例：6 |
| pk_handlepsn_name | string | 否 | 经办人 引用：员工(新)StaffNew 示例：王建斌 |
| vlastbillbustype | string | 否 | 上游单据交易类型id 示例：2315111214616832 |
| creatorId | long | 否 | 创建人id 示例：2185004199465216 |
| chandleorg_name | string | 否 | 经办人组织 示例：北京天元股份有限公司 |
| vsrcbillbustype | string | 否 | 来源单据交易类型id 示例：2183687370051849 |
| vsrcbillbustype_name | string | 否 | 来源单据交易类型 示例：通用报销单 |
| vcurrency | string | 否 | 摊销币种id 示例：2183687327011840 |
| vouchdate | string | 否 | 单据日期 示例：2021-08-26 00:00:00 |
| DeferExpenseDetailBVO | object | 是 | 摊销明细单子表 |
| cfinaceorg | string | 否 | 费用承担组织id 示例：2184854309114112 |
| voucherstate | string | 否 | 凭证状态 示例：success |
| vnatcurrency_name | string | 否 | 组织本币 示例：人民币 |
| nnatbaseexchrate | long | 否 | 基准汇率 示例：1 |
| ismulticurrency | boolean | 否 | 是否多币种(true:是;false:不是) 示例：false |
| pubts | string | 否 | 时间戳 示例：2021-08-26 10:53:28 |
| vreason | string | 否 | 报销说明 示例：0826通用报销单操作手册 |
| nnatlavemny | BigDecimal | 否 | 剩余摊销金额-本币 示例：30 |
| vlastbilltype | string | 否 | 上游单据类型 示例：znbzbx_deferexpense |
| createDate | string | 否 | 创建日期 示例：2021-08-26 00:00:00 |
| auditDate | string | 否 | 审批日期 示例：2021-08-26 00:00:00 |
| vfinacedeptid_name | string | 否 | 费用承担部门 示例：筹资部-规划部 |
| nnattotalmny | BigDecimal | 否 | 已摊销金额-本币 示例：30 |
| nlavenum | long | 否 | 剩余摊销期 示例：1 |
| creator | string | 否 | 创建人 示例：王建斌 |
| vfinacedeptid | string | 否 | 费用承担部门id 示例：2184856228794624 |
| vnatcurrency_moneyDigit | long | 否 | 组织本币金额精度 示例：2 |
| auditor | string | 否 | 审批人ID 引用：身份信息 User 示例：王建斌 |
| vlastbillid | long | 否 | 上游单据id 示例：2404287506878720 |
| transTypeKeyField | string | 否 | 交易类型字段 示例：bustype |
| bustype | string | 否 | 交易类型id 示例：2315112453034240 |
| vnatexchratetype_name | string | 否 | 汇率类型 示例：基准汇率 |
| nlavemny | BigDecimal | 否 | 剩余摊销金额 示例：30 |
| cfinaceorg_name | string | 否 | 费用承担组织 示例：北京天元股份有限公司 |
| vsrcbillcode | string | 否 | 来源单据号 示例：0281 |
| nsummny | BigDecimal | 否 | 总摊销金额 示例：60 |
| createTime | string | 否 | 创建时间 示例：2021-08-26 10:53:25 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2021-08-26 00:00:00 |
| vnatexchratetype | string | 否 | 汇率类型id 示例：py7y8nze |
| nmny | BigDecimal | 否 | 本期摊销金额 示例：30 |
| vhandledeptid_name | string | 否 | 经办人部门 示例：筹资部-规划部 |
| nnatsummny | BigDecimal | 否 | 总摊销金额-本币 示例：60 |
| vlastbillbustype_name | string | 否 | 上游单据交易类型 示例：待摊费用单 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"vhandledeptid": "2184856228794624",
		"chandleorg": "2184854309114112",
		"caccountorg_name": "北京天元股份有限公司",
		"masterOrgKeyField": "cfinaceorg",
		"bustype_name": "摊销明细单",
		"nsumnum": 2,
		"nnatmny": 30,
		"vlastbillcode": "0047",
		"vsrcbillid": 2404287412539648,
		"ntotalnum": 1,
		"vcurrency_name": "人民币",
		"vcurrency_moneyDigit": 2,
		"id": 2404293107716352,
		"ntotalmny": 30,
		"isWfControlled": false,
		"barCode": "znbzbx_expensebill|2404287412539648",
		"vsrcbilltype": "znbzbx_expensebill",
		"auditorId": 2185004199465216,
		"caccountorg": "2184854309114112",
		"vperiod": "2021-08",
		"vnatcurrency": "2183687327011840",
		"auditTime": "2021-08-26 10:53:26",
		"nnatexchrate": 1,
		"pk_handlepsn": "2185003811393792",
		"pk_billtype": "znbzbx_deferexpensedetail",
		"status": 1,
		"verifystate": 2,
		"code": "0038",
		"vnatexchratetype_digit": 6,
		"pk_handlepsn_name": "王建斌",
		"vlastbillbustype": "2315111214616832",
		"creatorId": 2185004199465216,
		"chandleorg_name": "北京天元股份有限公司",
		"vsrcbillbustype": "2183687370051849",
		"vsrcbillbustype_name": "通用报销单",
		"vcurrency": "2183687327011840",
		"vouchdate": "2021-08-26 00:00:00",
		"DeferExpenseDetailBVO": [
			{
				"vhandledeptid": "2184856228794624",
				"pk_busimemo_name": "华侨招待费",
				"vnatexchratetype_digit": 6,
				"caccountorg_name": "北京天元股份有限公司",
				"nnatmny": 60,
				"vlastbillrowid": 2404287506895104,
				"vcurrency": "2183687327011840",
				"cfinaceorg": "2184854309114112",
				"nnatthismny": 30,
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": 2,
				"nlineno": 10,
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"id": 2404293107716353,
				"pubts": "2021-08-26 10:47:40",
				"ntotalmny": 30,
				"vfinacedeptid_name": "筹资部-规划部",
				"nnattotalmny": 30,
				"nthismny": 30,
				"vfinacedeptid": "2184856228794624",
				"vnatcurrency_moneyDigit": 2,
				"pk_busimemo": 2184860029718784,
				"vnatexchratetype_name": "基准汇率",
				"pk_deferexpensedetail": 2404293107716352,
				"cfinaceorg_name": "北京天元股份有限公司",
				"caccountorg": "2184854309114112",
				"vnatcurrency": "2183687327011840",
				"dnatexchratedate": "2021-08-26 00:00:00",
				"vnatexchratetype": "py7y8nze",
				"nmny": 60,
				"vhandledeptid_name": "筹资部-规划部",
				"nnatexchrate": 1
			}
		],
		"cfinaceorg": "2184854309114112",
		"voucherstate": "success",
		"vnatcurrency_name": "人民币",
		"nnatbaseexchrate": 1,
		"ismulticurrency": false,
		"pubts": "2021-08-26 10:53:28",
		"vreason": "0826通用报销单操作手册",
		"nnatlavemny": 30,
		"vlastbilltype": "znbzbx_deferexpense",
		"createDate": "2021-08-26 00:00:00",
		"auditDate": "2021-08-26 00:00:00",
		"vfinacedeptid_name": "筹资部-规划部",
		"nnattotalmny": 30,
		"nlavenum": 1,
		"creator": "王建斌",
		"vfinacedeptid": "2184856228794624",
		"vnatcurrency_moneyDigit": 2,
		"auditor": "王建斌",
		"vlastbillid": 2404287506878720,
		"transTypeKeyField": "bustype",
		"bustype": "2315112453034240",
		"vnatexchratetype_name": "基准汇率",
		"nlavemny": 30,
		"cfinaceorg_name": "北京天元股份有限公司",
		"vsrcbillcode": "0281",
		"nsummny": 60,
		"createTime": "2021-08-26 10:53:25",
		"dnatexchratedate": "2021-08-26 00:00:00",
		"vnatexchratetype": "py7y8nze",
		"nmny": 30,
		"vhandledeptid_name": "筹资部-规划部",
		"nnatsummny": 60,
		"vlastbillbustype_name": "待摊费用单"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000100002	参数为空	根据文档中的必填项检查一下传输值是否存在

1021000999999	服务器异常	请联系系统管理员

1021000100001	参数错误	传输的参数不支持接口调用


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

