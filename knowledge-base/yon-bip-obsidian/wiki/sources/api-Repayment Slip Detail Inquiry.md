---
title: "还款单详情查询"
apiId: "3d7d52a8f46b48a5b849421e5e470c1d"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Repayment Note"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Repayment Note]
platform_version: "BIP"
source_type: community-api-docs
---

# 还款单详情查询

> `ContentType` 请求方式	GET | 分类: Repayment Note (ZNBZ)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/znbz/rbsm/api/bill/returnbill/detail

请求方式	GET

ContentType

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 单据id（单据id和单据编号二选一必填，id和编号同时存在时以billNo为准。） |
| billNo | string | query | 否 | 单据编号(与单据id必选其一) |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/returnbill/detail?access_token=访问令牌&id=&billNo=

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
| vhandledeptid | string | 否 | 还款人部门id 示例：2184856228794624 |
| chandleorg | string | 否 | 还款人组织id 示例：2184854309114112 |
| ReturnBillBVO | object | 是 | 还款单子表 |
| caccountorg_name | string | 否 | 会计主体 引用：会计主体 FinanceOrgVO 示例：北京天元股份有限公司 |
| masterOrgKeyField | string | 否 | 主组织字段名 示例：cfinaceorg |
| bustype_name | string | 否 | 交易类型 示例：还款单 |
| irejectstatus | long | 否 | 驳回状态(0:正常;1:驳回） 示例：0 |
| vcurrency_name | string | 否 | 还款币种 示例：人民币 |
| vcurrency_moneyDigit | long | 否 | 原币币种金额精度 示例：2 |
| id | long | 否 | 单据id 示例：2400358336844032 |
| vattachmentass | string | 否 | 单据附件id 示例：2e6480dfadbe4f538e95862dd3994196 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：false |
| vcurrency_currTypeSign | string | 否 | 还款币种货币符号 示例：? |
| barCode | string | 否 | 条形码 示例：znbzbx_returnbill|2400358336844032 |
| auditorId | long | 否 | 审批人ID 示例：2185004199465216 |
| caccountorg | string | 否 | 会计主体id 示例：2184854309114112 |
| vnatcurrency | string | 否 | 组织本币id 示例：2183687327011840 |
| auditTime | string | 否 | 审批时间 示例：2021-08-23 16:10:50 |
| nnatexchrate | long | 否 | 本币汇率 示例：1 |
| pk_handlepsn | string | 否 | 还款人银行账户id 示例：2185003811393792 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_returnbill |
| status | long | 否 | 单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 示例：1 |
| returncount | long | 否 | 退回次数 示例：0 |
| verifystate | long | 否 | 审批状态审批状态, 1:已审批、2:未审批、 示例：2 |
| code | string | 否 | 单据号 示例：0067 |
| vnatexchratetype_digit | long | 否 | 汇率精度 示例：6 |
| ibillmakemethod | long | 否 | 填单方式, ０:PC新增、１:移动新增、２:EXCEL导入、 示例：0 |
| pk_handlepsn_name | string | 否 | 还款人 引用：员工(新)StaffNew 示例：王建斌 |
| nreturnmny | BigDecimal | 否 | 本次冲销借款额 示例：112 |
| creatorId | long | 否 | 创建人id 示例：2185004199465216 |
| chandleorg_name | string | 否 | 还款人组织 示例：北京天元股份有限公司 |
| vcurrency | string | 否 | 还款币种id 示例：2183687327011840 |
| vouchdate | string | 否 | 单据日期 示例：2021-08-23 00:00:00 |
| cfinaceorg | string | 否 | 费用承担组织id 示例：2184854309114112 |
| cfinacecostcenter | string | 否 | 费用承担成本中心id 示例：2184854309114112 |
| cfinacecostcenter_name | string | 否 | 费用承担成本中心 示例：北京天元股份有限公司 |
| profitcenter | string | 否 | 利润中心id 示例：2184854309114112 |
| profitcenter_name | string | 否 | 利润中心 示例：北京天元股份有限公司 |
| voucherstate | string | 否 | 凭证状态 示例：success |
| isettlestatus | long | 否 | 结算状态,0:待结算、1:结算中、2:结算成功、3:结算止付、4:结算部分成功、5:无需结算、 示例：5 |
| vnatcurrency_name | string | 否 | 组织本币 示例：人民币 |
| nnatbaseexchrate | long | 否 | 基准汇率 示例：1 |
| ismulticurrency | boolean | 否 | 是否多币种(true:是;false:不是) 示例：false |
| RetSettleInfoVO | object | 是 | 还款单结算信息 |
| pubts | string | 否 | 时间戳 示例：2021-08-23 16:39:47 |
| vreason | string | 否 | 还款说明 示例：0823还款单 |
| createDate | string | 否 | 创建日期 示例：2021-08-23 00:00:00 |
| auditDate | string | 否 | 审批日期 示例：2021-08-23 00:00:00 |
| vfinacedeptid_name | string | 否 | 费用承担部门 示例：筹资部-规划部 |
| nnatreturnmny | BigDecimal | 否 | 本次冲销借款额-本币 示例：112 |
| creator | string | 否 | 创建人 示例：王建斌 |
| vfinacedeptid | string | 否 | 费用承担部门id 示例：2184856228794624 |
| vnatcurrency_moneyDigit | long | 否 | 组织本币金额精度 示例：2 |
| auditor | string | 否 | 审批人 引用：身份信息 User 示例：王建斌 |
| transTypeKeyField | string | 否 | 交易类型字段名 示例：bustype |
| bustype | string | 否 | 交易类型id 示例：2183687370068224 |
| vnatexchratetype_name | string | 否 | 汇率类型 示例：基准汇率 |
| cfinaceorg_name | string | 否 | 费用承担组织 示例：北京天元股份有限公司 |
| createTime | string | 否 | 创建时间 示例：2021-08-23 16:10:46 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2021-08-23 00:00:00 |
| vnatexchratetype | string | 否 | 汇率类型id 示例：py7y8nze |
| vnatcurrency_currTypeSign | string | 否 | 组织本币货币符号 示例：? |
| vhandledeptid_name | string | 否 | 还款人部门 示例：筹资部-规划部 |

## 5. 正确返回示例

{
	"displayCode": "",
	"code": "200",
	"message": "操作成功",
	"data": {
		"vhandledeptid": "2184856228794624",
		"chandleorg": "2184854309114112",
		"ReturnBillBVO": [
			{
				"vhandledeptid": "2184856228794624",
				"chandleorg": "2184854309114112",
				"pk_loanbill": 2400355919991040,
				"pk_busimemo_name": "筹资招待费",
				"caccountorg_name": "北京天元股份有限公司",
				"pk_loanpsn_name": "王建斌",
				"vloancurrency_moneyDigit": 2,
				"nloanmny": 112,
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": 2,
				"nlineno": 10,
				"id": 2400358336844033,
				"vloandeptid_name": "筹资部-规划部",
				"ntotalremainmny": 112,
				"pk_loanbill_bustype": "2183687370051851",
				"vcurrency_currTypeSign": "?",
				"nexchrate": 1,
				"pk_busimemo": 2184859339739392,
				"vnatcurrency": "2183687327011840",
				"caccountorg": "2184854309114112",
				"nremainmny": 0,
				"nnatexchrate": 1,
				"vloandeptid": "2184856228794624",
				"pk_handlepsn": "2185003811393792",
				"nloanreturnmny": 112,
				"vnatexchratetype_digit": 6,
				"pk_handlepsn_name": "王建斌",
				"nreturnmny": 112,
				"pk_loanbilltype": "znbzbx_loanbill",
				"pk_loanbill_code": "0265",
				"chandleorg_name": "北京天元股份有限公司",
				"vcurrency": "2183687327011840",
				"pk_returnbill": 2400358336844032,
				"pk_loanbill_b": 2400355919991041,
				"cfinaceorg": "2184854309114112",
				"cfinacecostcenter": "2184854309114112",
				"cfinacecostcenter_name": "成本中心",
				"profitcenter": "2184854309114112",
				"profitcenter_name": "利润中心",
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"vfinacedeptid_name": "筹资部-规划部",
				"nnatreturnmny": 112,
				"vloancurrency_name": "人民币",
				"breturn": true,
				"nbaseexchrate": 1,
				"vnatcurrency_moneyDigit": 2,
				"vfinacedeptid": "2184856228794624",
				"vloancurrency_currTypeSign": "?",
				"vnatexchratetype_name": "基准汇率",
				"vloancurrency": "2183687327011840",
				"cfinaceorg_name": "北京天元股份有限公司",
				"pk_loanpsn": "2185003811393792",
				"dnatexchratedate": "2021-08-23 00:00:00",
				"vnatexchratetype": "py7y8nze",
				"vnatcurrency_currTypeSign": "?",
				"vhandledeptid_name": "筹资部-规划部"
			}
		],
		"caccountorg_name": "北京天元股份有限公司",
		"masterOrgKeyField": "cfinaceorg",
		"bustype_name": "还款单",
		"irejectstatus": 0,
		"vcurrency_name": "人民币",
		"vcurrency_moneyDigit": 2,
		"id": 2400358336844032,
		"vattachmentass": "2e6480dfadbe4f538e95862dd3994196",
		"isWfControlled": false,
		"vcurrency_currTypeSign": "?",
		"barCode": "znbzbx_returnbill|2400358336844032",
		"auditorId": 2185004199465216,
		"caccountorg": "2184854309114112",
		"vnatcurrency": "2183687327011840",
		"auditTime": "2021-08-23 16:10:50",
		"nnatexchrate": 1,
		"pk_handlepsn": "2185003811393792",
		"pk_billtype": "znbzbx_returnbill",
		"status": 1,
		"returncount": 0,
		"verifystate": 2,
		"code": "0067",
		"vnatexchratetype_digit": 6,
		"ibillmakemethod": 0,
		"pk_handlepsn_name": "王建斌",
		"nreturnmny": 112,
		"creatorId": 2185004199465216,
		"chandleorg_name": "北京天元股份有限公司",
		"vcurrency": "2183687327011840",
		"vouchdate": "2021-08-23 00:00:00",
		"cfinaceorg": "2184854309114112",
		"cfinacecostcenter": "2184854309114112",
		"cfinacecostcenter_name": "北京天元股份有限公司",
		"profitcenter": "2184854309114112",
		"profitcenter_name": "北京天元股份有限公司",
		"voucherstate": "success",
		"isettlestatus": 5,
		"vnatcurrency_name": "人民币",
		"nnatbaseexchrate": 1,
		"ismulticurrency": false,
		"RetSettleInfoVO": [
			{
				"vbankaccname": "王建斌",
				"pk_currency_opp": "2183687327011840",
				"vbanktypename": "万安洪都村镇银行",
				"pk_bankdoc": "2184878273385216",
				"vsettlecurrency": "2183687327011840",
				"nsettlebaseexchrate": 1,
				"iaraptype": 1,
				"nsettlesummny": 112,
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": 2,
				"vbankdocname": "用友银行",
				"ipaystartpoint": 1,
				"nlineno": 10,
				"bcansettlesysmodify": true,
				"vbankaccname_opp": "1",
				"vsettlecurrency_currTypeSign": "?",
				"id": 2400358336844034,
				"pk_balatype": 2183682241614081,
				"vbankaccount": "100000000",
				"pk_currency": "2183687327011840",
				"balatypesrvattr": 0,
				"nsettleexchrate": 1,
				"pk_handlepsnbank": "2185003811655937",
				"bjournalizing": true,
				"vcurrency_currTypeSign": "?",
				"accttype": "BAT00001",
				"vbanktypename_opp": "中国工商银行",
				"nnatsettlesummny": 112,
				"vsettlecurrency_moneyDigit": 2,
				"vnatcurrency": "2183687327011840",
				"pk_balatype_name": "银行转账",
				"vsettlecurrency_name": "人民币",
				"nnatexchrate": 1,
				"pk_handlepsn": "2185003811393792",
				"pk_currency_opp_name": "人民币",
				"pk_bankdoc_opp": "2186831417381637",
				"vnatexchratetype_digit": 6,
				"pk_handlepsn_name": "王建斌",
				"pk_enterprisebankacct": "2325222650122752",
				"vcurrency": "2183687327011840",
				"pk_returnbill": 2400358336844032,
				"pk_enterprisebankacct_name": "1",
				"isettlestatus": 5,
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"pk_currency_name": "人民币",
				"pubts": "2021-08-23 16:10:51",
				"vbankaccount_opp": "1",
				"pk_banktype": "2184875898393344",
				"accttype_opp": "0",
				"vdef7": "21",
				"vnatcurrency_moneyDigit": 2,
				"vnatexchratetype_name": "基准汇率",
				"igathertype": 0,
				"vbankdocname_opp": "中国工商银行股份有限公司天津中北支行",
				"pk_banktype_opp": "2186830872515336",
				"nsummny": 112,
				"dnatexchratedate": "2021-08-23 00:00:00",
				"vnatexchratetype": "py7y8nze",
				"vnatcurrency_currTypeSign": "?",
				"centerpriseorg": "2184854309114112",
				"centerpriseorg_name": "北京天元股份有限公司",
				"centerpriseorg_caccountorg": "1624924383261229061",
				"centerpriseorg_caccountorg_name": "my费控日常"
			}
		],
		"pubts": "2021-08-23 16:39:47",
		"vreason": "0823还款单",
		"createDate": "2021-08-23 00:00:00",
		"auditDate": "2021-08-23 00:00:00",
		"vfinacedeptid_name": "筹资部-规划部",
		"nnatreturnmny": 112,
		"creator": "王建斌",
		"vfinacedeptid": "2184856228794624",
		"vnatcurrency_moneyDigit": 2,
		"auditor": "王建斌",
		"transTypeKeyField": "bustype",
		"bustype": "2183687370068224",
		"vnatexchratetype_name": "基准汇率",
		"cfinaceorg_name": "北京天元股份有限公司",
		"createTime": "2021-08-23 16:10:46",
		"dnatexchratedate": "2021-08-23 00:00:00",
		"vnatexchratetype": "py7y8nze",
		"vnatcurrency_currTypeSign": "?",
		"vhandledeptid_name": "筹资部-规划部"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员

1021000100001	参数错误	传输的参数不支持接口调用

1021000100002	参数为空	根据文档中的必填项检查一下传输值是否存在


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-12

更新

请求说明

更新

返回参数 (8)

无任何变更

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

