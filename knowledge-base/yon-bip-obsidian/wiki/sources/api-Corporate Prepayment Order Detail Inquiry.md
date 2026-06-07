---
title: "对公预付单详情查询"
apiId: "da3251f8aff54b97ba4ee50c3d95f53d"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Prepayment Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Prepayment Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 对公预付单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Prepayment Request (ZNBZ)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/znbz/rbsm/api/bill/pubprepay/detail

请求方式	GET

ContentType	application/json

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

Url: /yonbip/znbz/rbsm/api/bill/pubprepay/detail?access_token=访问令牌&id=&billNo=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| vhandledeptid | string | 否 | 经办人部门id 示例：2184856228794624 |
| chandleorg | string | 否 | 经办人组织id 示例：2184854309114112 |
| iauditdealstatus | short | 否 | 稽核处理状态(0:未处理;1:已初核） 示例：0 |
| caccountorg_name | string | 否 | 会计主体名称 引用：会计主体 FinanceOrgVO 示例：北京天元股份有限公司 |
| masterOrgKeyField | string | 否 | 主组织字段名 示例：cfinaceorg |
| bustype_name | string | 否 | 申请交易类型名称 示例：对公预付单 |
| modifier | string | 否 | 修改人名称 示例：王建斌 |
| modifierId | long | 否 | 修改人ID 示例：2185004199465216 |
| irejectstatus | long | 否 | 驳回状态(0:正常;1:驳回） 示例：0 |
| nloanmny | BigDecimal | 否 | 借款额 示例：5000 |
| pk_apct | number |
| 小数位数:0,最大长度:20 | 否 | 合同台账id 示例：2163959280159424521 |
| pk_apct_code | string | 否 | 合同台账编码 示例：FKHT0225 |
| nnatfinalcavmny | BigDecimal | 否 | 本币已核销额（审批回写） 示例：0 |
| loansettleinfovos | object | 是 | 结算信息 |
| pk_dutyjob | string | 否 | 职务ID 示例：1661441878841622529 |
| pk_dutyrank | string | 否 | 职级ID 示例：1661434766375780353 |
| pk_cusdoc | long | 否 | 供应商银行账户 示例：2185034480177408 |
| modifyTime | string | 否 | 最后修改时间 示例：2021-08-19 18:05:55 |
| vcurrency_name | string | 否 | 预付币种 示例：人民币 |
| vcurrency_moneyDigit | long | 否 | 原币币种金额精度 示例：2 |
| bcav | boolean | 否 | 是否核销完毕(true:完毕;false:未完毕) 示例：false |
| id | long | 否 | 对公预付单id 示例：2394804078596352 |
| vattachmentass | string | 否 | 单据附件id 示例：LzJX5TLsjNRwDFR4ZBoyAB6zxzDEjpsh |
| modifyDate | string | 否 | 最后修改日期 示例：2021-08-19 00:00:00 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：true |
| vcurrency_currTypeSign | string | 否 | 预付币种货币符号 示例：¥ |
| barCode | string | 否 | 条形码 示例：znbzbx_pubprepay|2394804078596352 |
| pk_cusdoc_name | string | 否 | 供应商 示例：合法集资办公室 |
| auditorId | long | 否 | 审批人id 示例：2185004199465216 |
| caccountorg | string | 否 | 会计主体id 示例：2184854309114112 |
| vnatcurrency | string | 否 | 组织本币id 示例：2183687327011840 |
| auditTime | string | 否 | 审批时间 示例：2021-08-19 18:03:17 |
| nnatexchrate | long | 否 | 汇率 示例：1 |
| pk_handlepsn | string | 否 | 经办人银行账户id 示例：2185003811393792 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_pubprepay |
| status | long | 否 | 单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 示例：1 |
| returncount | long | 否 | 退回次数 示例：0 |
| verifystate | long | 否 | 审批状态, 1:已审批、2:未审批、 示例：2 |
| code | string | 否 | 单据编号 示例：0174 |
| vnatexchratetype_digit | long | 否 | 汇率精度 示例：6 |
| ibillmakemethod | long | 否 | 填单方式, ０:PC新增、１:移动新增、２:EXCEL导入、 示例：0 |
| pk_handlepsn_name | string | 否 | 经办人 引用：员工(新)StaffNew 示例：王建斌 |
| nreturnmny | BigDecimal | 否 | 退款额 示例：10 |
| creatorId | long | 否 | 创建人id 示例：2185004199465216 |
| nnatcavmny | BigDecimal | 否 | 核销额（含未审核）-本币 示例：0 |
| chandleorg_name | string | 否 | 经办人组织 示例：北京天元股份有限公司 |
| loanbillbvos | object | 是 | 对公预付单子表 |
| vcurrency | string | 否 | 预付币种id 示例：2183687327011840 |
| vouchdate | string | 否 | 单据日期 示例：2021-08-19 00:00:00 |
| cfinaceorg | string | 否 | 费用承担组织id 示例：2184854309114112 |
| isettlestatus | long | 否 | 结算状态,0:待结算、1:结算中、2:结算成功、3:结算止付、4:结算部分成功、5:无需结算、 示例：5 |
| vnatcurrency_name | string | 否 | 组织本币 示例：人民币 |
| nnatbaseexchrate | long | 否 | 基准汇率 示例：1 |
| ismulticurrency | boolean | 否 | 是否多币种(true:是;false:不是) 示例：false |
| pubts | string | 否 | 时间戳 示例：2021-08-19 18:05:55 |
| vreason | string | 否 | 预付原因 示例：支付 |
| createDate | string | 否 | 创建日期 示例：2021-08-19 00:00:00 |
| auditDate | string | 否 | 审批日期 示例：2021-08-19 00:00:00 |
| vfinacedeptid_name | string | 否 | 费用承担部门 示例：筹资部-规划部 |
| nnatreturnmny | BigDecimal | 否 | 退款额（含未审核）-本币 示例：10 |
| creator | string | 否 | 创建人 示例：王建斌 |
| iauditresult | short | 否 | 系统稽核结果,0:稽核待处理、1:系统稽核检测通过、2:系统稽核检测柔性不通过、3:系统稽核检测刚性不通过、4:财务稽核检测通过、5:财务稽核检测柔性不通过、6:财务稽核检测刚性不通过、7:无需稽核 示例：7 |
| ncavmny | BigDecimal | 否 | 核销额 示例：0 |
| vfinacedeptid | string | 否 | 费用承担部门id 示例：2184856228794624 |
| vnatcurrency_moneyDigit | long | 否 | 组织本币金额精度 示例：2 |
| auditor | string | 否 | 审批人 引用：身份信息 User 示例：王建斌 |
| nnatloanmny | BigDecimal | 否 | 预付额-本币 示例：5000 |
| transTypeKeyField | string | 否 | 交易类型字段名 示例：bustype |
| bustype | string | 否 | 交易类型id 示例：2183687370051852 |
| vnatexchratetype_name | string | 否 | 汇率类型 示例：基准汇率 |
| cfinaceorg_name | string | 否 | 费用承担组织 示例：北京天元股份有限公司 |
| cfinacecostcenter | string | 否 | 费用承担成本中心id 示例：2183687370058987 |
| cfinacecostcenter_name | string | 否 | 费用承担成本中心 示例：北京天元股份有限公司 |
| profitcenter | string | 否 | 利润中心id 示例：2183687370054543 |
| profitcenter_name | string | 否 | 利润中心 示例：北京天元股份有限公司 |
| nnatfinalreturnmny | BigDecimal | 否 | 退款额-本币 示例：10 |
| createTime | string | 否 | 创建时间 示例：2021-08-19 18:00:41 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2021-08-19 00:00:00 |
| vnatexchratetype | string | 否 | 汇率类型id 示例：py7y8nze |
| vhandledeptid_name | string | 否 | 经办人部门 示例：筹资部-规划部 |
| vnatcurrency_currTypeSign | string | 否 | 组织本币货币符号 示例：¥ |
| pk_dutypost | string | 否 | 岗位ID 示例：1900258913944600583 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"vhandledeptid": "2184856228794624",
		"chandleorg": "2184854309114112",
		"iauditdealstatus": 0,
		"caccountorg_name": "北京天元股份有限公司",
		"masterOrgKeyField": "cfinaceorg",
		"bustype_name": "对公预付单",
		"modifier": "王建斌",
		"modifierId": 2185004199465216,
		"irejectstatus": 0,
		"nloanmny": 5000,
		"pk_apct": 2163959280159424521,
		"pk_apct_code": "FKHT0225",
		"nnatfinalcavmny": 0,
		"loansettleinfovos": [
			{
				"vbankaccname": "合法集资办公室",
				"pk_loanbill": 2394804078596352,
				"pk_currency_opp": "2183687327011840",
				"vbanktypename": "万安洪都村镇银行",
				"pk_bankdoc": "2184878273385216",
				"vsettlecurrency": "2183687327011840",
				"pk_cusdoc": 2185034480177408,
				"nsettlebaseexchrate": 1,
				"iaraptype": 0,
				"nsettlesummny": 5000,
				"vbankdocname": "用友银行",
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": 2,
				"ipaystartpoint": 1,
				"nlineno": 10,
				"pk_cusdocbank": 2185034480177413,
				"bcansettlesysmodify": true,
				"vbankaccname_opp": "1",
				"vsettlecurrency_currTypeSign": "¥",
				"id": 2394804078596354,
				"pk_balatype": 2183682241614081,
				"vbankaccount": "999999",
				"pk_currency": "2183687327011840",
				"balatypesrvattr": 0,
				"nsettleexchrate": 1,
				"bjournalizing": true,
				"vcurrency_currTypeSign": "¥",
				"accttype": "0",
				"vbanktypename_opp": "中国工商银行",
				"nnatsettlesummny": 5000,
				"pk_cusdoc_name": "合法集资办公室",
				"vsettlecurrency_moneyDigit": 2,
				"pk_balatype_name": "银行转账",
				"vnatcurrency": "2183687327011840",
				"vsettlecurrency_name": "人民币",
				"nnatexchrate": 1,
				"pk_currency_opp_name": "人民币",
				"pk_bankdoc_opp": "2186831417381637",
				"vnatexchratetype_digit": 6,
				"pk_enterprisebankacct": "2325222650122752",
				"vcurrency": "2183687327011840",
				"pk_enterprisebankacct_name": "1",
				"isettlestatus": 5,
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"pk_currency_name": "人民币",
				"pubts": "2021-08-19 18:03:17",
				"vbankaccount_opp": "1",
				"pk_banktype": "2184875898393344",
				"accttype_opp": "0",
				"vnatcurrency_moneyDigit": 2,
				"vnatexchratetype_name": "基准汇率",
				"igathertype": 1,
				"vbankdocname_opp": "中国工商银行股份有限公司天津中北支行",
				"pk_banktype_opp": "2186830872515336",
				"nsummny": 5000,
				"dnatexchratedate": "2021-08-19 00:00:00",
				"vnatexchratetype": "py7y8nze",
				"vnatcurrency_currTypeSign": "¥",
				"centerpriseorg": "2184854309114112",
				"centerpriseorg_name": "北京天元股份有限公司",
				"centerpriseorg_caccountorg": "1624924383261229061",
				"centerpriseorg_caccountorg_name": "my费控日常"
			}
		],
		"pk_dutyjob": "1661441878841622529",
		"pk_dutyrank": "1661434766375780353",
		"pk_cusdoc": 2185034480177408,
		"modifyTime": "2021-08-19 18:05:55",
		"vcurrency_name": "人民币",
		"vcurrency_moneyDigit": 2,
		"bcav": false,
		"id": 2394804078596352,
		"vattachmentass": "LzJX5TLsjNRwDFR4ZBoyAB6zxzDEjpsh",
		"modifyDate": "2021-08-19 00:00:00",
		"isWfControlled": true,
		"vcurrency_currTypeSign": "¥",
		"barCode": "znbzbx_pubprepay|2394804078596352",
		"pk_cusdoc_name": "合法集资办公室",
		"auditorId": 2185004199465216,
		"caccountorg": "2184854309114112",
		"vnatcurrency": "2183687327011840",
		"auditTime": "2021-08-19 18:03:17",
		"nnatexchrate": 1,
		"pk_handlepsn": "2185003811393792",
		"pk_billtype": "znbzbx_pubprepay",
		"status": 1,
		"returncount": 0,
		"verifystate": 2,
		"code": "0174",
		"vnatexchratetype_digit": 6,
		"ibillmakemethod": 0,
		"pk_handlepsn_name": "王建斌",
		"nreturnmny": 10,
		"creatorId": 2185004199465216,
		"nnatcavmny": 0,
		"chandleorg_name": "北京天元股份有限公司",
		"loanbillbvos": [
			{
				"vhandledeptid": "2184856228794624",
				"chandleorg": "2184854309114112",
				"pk_loanbill": 2394804078596352,
				"pk_busimemo_name": "华侨招待费",
				"pk_busimemotype_name": "集团费用项目",
				"vnatexchratetype_digit": 6,
				"caccountorg_name": "北京天元股份有限公司",
				"pk_handlepsn_name": "王建斌",
				"nreturnmny": 10,
				"chandleorg_name": "北京天元股份有限公司",
				"nloanmny": 5000,
				"pk_busimemotype": 2184858240700672,
				"pk_cusdoc": 2185034480177408,
				"vcurrency": "2183687327011840",
				"cfinaceorg": "2184854309114112",
				"cfinacecostcenter": "2184854309113452",
				"cfinacecostcenter_name": "北京天元股份有限公司",
				"profitcenter": "2183687370054543",
				"profitcenter_name": "北京天元股份有限公司",
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": 2,
				"nlineno": 10,
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"id": 2394804078596353,
				"vfinacedeptid_name": "筹资部-规划部",
				"nnatreturnmny": 10,
				"vfinacedeptid": "2184856228794624",
				"vnatcurrency_moneyDigit": 2,
				"vcurrency_currTypeSign": "¥",
				"nnatloanmny": 5000,
				"pk_busimemo": 2184860029718784,
				"vnatexchratetype_name": "基准汇率",
				"pk_cusdoc_name": "合法集资办公室",
				"cfinaceorg_name": "北京天元股份有限公司",
				"nnatfinalreturnmny": 10,
				"caccountorg": "2184854309114112",
				"vnatcurrency": "2183687327011840",
				"dnatexchratedate": "2021-08-19 00:00:00",
				"vnatexchratetype": "py7y8nze",
				"vhandledeptid_name": "筹资部-规划部",
				"vnatcurrency_currTypeSign": "¥",
				"nnatexchrate": 1,
				"pk_handlepsn": "2185003811393792",
				"pk_dutyjob": "1661441878841622529",
				"pk_dutyrank": "1661434766375780353",
				"pk_dutypost": "1900258913944600583",
				"pk_apct": 2163959280159424521,
				"pk_apct_code": "FKHT0225",
				"pk_apct_plan": 2163959280159424522,
				"pk_apct_plan_code": "FKJH20613099"
			}
		],
		"vcurrency": "2183687327011840",
		"vouchdate": "2021-08-19 00:00:00",
		"cfinaceorg": "2184854309114112",
		"isettlestatus": 5,
		"vnatcurrency_name": "人民币",
		"nnatbaseexchrate": 1,
		"ismulticurrency": false,
		"pubts": "2021-08-19 18:05:55",
		"vreason": "支付",
		"createDate": "2021-08-19 00:00:00",
		"auditDate": "2021-08-19 00:00:00",
		"vfinacedeptid_name": "筹资部-规划部",
		"nnatreturnmny": 10,
		"creator": "王建斌",
		"iauditresult": 7,
		"ncavmny": 0,
		"vfinacedeptid": "2184856228794624",
		"vnatcurrency_moneyDigit": 2,
		"auditor": "王建斌",
		"nnatloanmny": 5000,
		"transTypeKeyField": "bustype",
		"bustype": "2183687370051852",
		"vnatexchratetype_name": "基准汇率",
		"cfinaceorg_name": "北京天元股份有限公司",
		"cfinacecostcenter": "2183687370058987",
		"cfinacecostcenter_name": "北京天元股份有限公司",
		"profitcenter": "2183687370054543",
		"profitcenter_name": "北京天元股份有限公司",
		"nnatfinalreturnmny": 10,
		"createTime": "2021-08-19 18:00:41",
		"dnatexchratedate": "2021-08-19 00:00:00",
		"vnatexchratetype": "py7y8nze",
		"vhandledeptid_name": "筹资部-规划部",
		"vnatcurrency_currTypeSign": "¥",
		"pk_dutypost": "1900258913944600583"
	},
	"displayCode": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000100002	参数为空	根据文档中的必填项检查一下传输值是否存在

1021000100001	参数错误	传输的参数不支持接口调用


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode

新增

返回参数 displayCode

2	2025-02-11

新增

返回参数 (6)

增加合同台账说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

