---
title: "挂账付款申请单提交"
apiId: "1846101120099287046"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payables Payment Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payables Payment Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 挂账付款申请单提交

> `ContentType	application/json` 请求方式	POST | 分类: Payables Payment Request (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/paymentapply/submit

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
| id | long | 否 | 是 | 单据ID 示例：1513587578118340610 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/paymentapply/submit?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 1513587578118340610
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
| message | string | 否 | 调用信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| code | string | 否 | 单据编码 示例：FKSQ23102300001 |
| vouchdate | string | 否 | 单据日期 示例：2023-10-23 00:00:00 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_paymentapply |
| bustype | string | 否 | 交易类型 示例：1658463224516313092 |
| bustype_name | string | 否 | 交易类型名称 示例：挂账付款申请单 |
| igenmethod | long | 否 | 单据生成方式（3：手工创建、4：下推生成；5、自动生成） 示例：3 |
| isdeferpaymentapply | boolean | 否 | 是否分摊（false:否；true:是） 示例：false |
| pk_handlepsn | string | 否 | 申请人id 示例：1549357070803795972 |
| pk_handlepsn_name | string | 否 | 申请人名称 示例：任文君 |
| pk_dutyjob | string | 否 | 职务id 示例：1525698982178717701 |
| pk_dutyjob_name | string | 否 | 职务名称 示例：测试职务 |
| pk_dutyrank | string | 否 | 职级id 示例：1525699480394924033 |
| pk_dutyrank_name | string | 否 | 职级名称 示例：高级测试工程师 |
| vhandledeptid | string | 否 | 申请人部门id 示例：1524154726676430853 |
| vhandledeptid_name | string | 否 | 申请人部门名称 示例：销售部 |
| chandleorg | string | 否 | 申请人组织id 示例：1524154503347568646 |
| chandleorg_name | string | 否 | 申请人组织名称 示例：费控A |
| vcurrency_currTypeSign | string | 否 | 申请币种币种符合 示例：¥ |
| vnatcurrency_moneyDigit | string | 否 | 申请币种币种精度 示例：2 |
| vnatcurrency_currTypeSign | string | 否 | 组织本币币种符合 示例：¥ |
| nnatbaseexchrate | BigDecimal | 否 | 组织本币企业汇率 示例：1 |
| vfinacedeptid | string | 否 | 费用承担部门id 示例：1524154726676430853 |
| cfinaceorg | string | 否 | 费用承担组织id 示例：1524154503347568646 |
| vfinacedeptid_name | string | 否 | 费用承担部门名称 示例：销售部 |
| cfinaceorg_name | string | 否 | 费用承担组织名称 示例：费控A |
| caccountorg | string | 否 | 会计主体id 示例：1524154503347568646 |
| caccountorg_name | string | 否 | 会计主体名称 示例：费控A |
| irejectstatus | short | 否 | 驳回状态(0:正常;1:驳回） 示例：0 |
| status | short | 否 | 单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 示例：0 |
| vreason | string | 否 | 申请原因 示例：ads2 |
| ismulticurrency | boolean | 否 | 是否多币种(true:是;false:不是) 示例：true |
| vnatcurrency | string | 否 | 组织本币id 示例：1523413904973627420 |
| vnatcurrency_name | string | 否 | 组织本币名称 示例：人民币 |
| vcurrency | string | 否 | 币种id 示例：1523413904973627420 |
| vcurrency_name | string | 否 | 币种名称 示例：人民币 |
| vcurrency_moneyDigit | string | 否 | 原币币种金额精度 示例：2 |
| vnatexchratetype | string | 否 | 汇率类型id 示例：0000L6UFPA4E2D845F0000 |
| vnatexchratetype_name | string | 否 | 汇率类型名称 示例：基准汇率 |
| vnatexchratetype_digit | string | 否 | 汇率精度 示例：6 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2023-10-23 00:00:00 |
| nnatexchrate | BigDecimal | 否 | 本币汇率 示例：1 |
| nexpensemny | BigDecimal | 否 | 申请总额 示例：9 |
| nnatexpensemny | BigDecimal | 否 | 申请总额-本币 示例：9 |
| vattachmentass | string | 否 | 单据附件id 示例：0053a592bf0a4ec3a817105b86dcab59 |
| isettlestatus | long | 否 | 结算状态,0:待结算、1:结算中、2:结算成功、3:结算止付、4:结算部分成功、5:无需结算、 示例：0 |
| ibillmakemethod | long | 否 | 填单方式(0:PC新增;1:移动新增;2:EXCEL导入) 示例：0 |
| creatorId | string | 否 | 创建人id 示例：1549357079382196226 |
| creator | string | 否 | 创建人 示例：昵称-任文君 |
| createDate | string | 否 | 创建日期 示例：2023-10-23 18:51:16 |
| createTime | string | 否 | 创建时间 示例：2023-10-23 18:51:16 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：false |
| verifystate | short | 否 | 审批状态(0:未提交；1：已提交；2：已审批) 示例：0 |
| returncount | int | 否 | 退回次数 示例：0 |
| paymentapplysettleinfos | object | 是 | 挂账付款申请单结算信息 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 单据主键id 示例：1845618537589112838 |
| barCode | string | 否 | 条形码 示例：znbzbx_paymentapply|1845618537589112838 |
| pubts | string | 否 | 时间戳 示例：2023-10-23 18:51:17 |
| tenant | long | 否 | 租户id 示例：2905678041437536 |
| yTenantId | string | 否 | 友户通租户id 示例：0000L6UFPA4E2D845F0000 |
| isoverstd | boolean | 否 | 是否超标（true:是；false:否） 示例：false |
| iauditresult | long | 否 | 系统稽核结果,0:稽核待处理、1:系统稽核检测通过、2:系统稽核检测柔性不通过、3:系统稽核检测刚性不通过、4:财务稽核检测通过、5:财务稽核检测柔性不通过、6:财务稽核检测刚性不通过、7:无需稽核 示例：0 |
| iauditdealstatus | long | 否 | 稽核处理状态(0:未处理；1：已初核) 示例：0 |

## 5. 正确返回示例

{
	"code": 200,
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"code": "FKSQ23102300001",
		"vouchdate": "2023-10-23 00:00:00",
		"pk_billtype": "znbzbx_paymentapply",
		"bustype": "1658463224516313092",
		"bustype_name": "挂账付款申请单",
		"igenmethod": 3,
		"isdeferpaymentapply": false,
		"pk_handlepsn": "1549357070803795972",
		"pk_handlepsn_name": "任文君",
		"pk_dutyjob": "1525698982178717701",
		"pk_dutyjob_name": "测试职务",
		"pk_dutyrank": "1525699480394924033",
		"pk_dutyrank_name": "高级测试工程师",
		"vhandledeptid": "1524154726676430853",
		"vhandledeptid_name": "销售部",
		"chandleorg": "1524154503347568646",
		"chandleorg_name": "费控A",
		"vcurrency_currTypeSign": "¥",
		"vnatcurrency_moneyDigit": "2",
		"vnatcurrency_currTypeSign": "¥",
		"nnatbaseexchrate": 1,
		"vfinacedeptid": "1524154726676430853",
		"cfinaceorg": "1524154503347568646",
		"vfinacedeptid_name": "销售部",
		"cfinaceorg_name": "费控A",
		"caccountorg": "1524154503347568646",
		"caccountorg_name": "费控A",
		"irejectstatus": 0,
		"status": 0,
		"vreason": "ads2",
		"ismulticurrency": true,
		"vnatcurrency": "1523413904973627420",
		"vnatcurrency_name": "人民币",
		"vcurrency": "1523413904973627420",
		"vcurrency_name": "人民币",
		"vcurrency_moneyDigit": "2",
		"vnatexchratetype": "0000L6UFPA4E2D845F0000",
		"vnatexchratetype_name": "基准汇率",
		"vnatexchratetype_digit": "6",
		"dnatexchratedate": "2023-10-23 00:00:00",
		"nnatexchrate": 1,
		"nexpensemny": 9,
		"nnatexpensemny": 9,
		"vattachmentass": "0053a592bf0a4ec3a817105b86dcab59",
		"isettlestatus": 0,
		"ibillmakemethod": 0,
		"creatorId": "1549357079382196226",
		"creator": "昵称-任文君",
		"createDate": "2023-10-23 18:51:16",
		"createTime": "2023-10-23 18:51:16",
		"isWfControlled": false,
		"verifystate": 0,
		"returncount": 0,
		"paymentapplysettleinfos": [
			{
				"isettlestatus": 0,
				"hasDefaultInit": true,
				"accttype": "0",
				"accttype_opp": "0",
				"bcansettlesysmodify": true,
				"bjournalizing": true,
				"centerpriseorg": "1524154503347568646",
				"dnatexchratedate": "2023-03-22 00:00:00",
				"iaraptype": 0,
				"igathertype": 1,
				"ipaystartpoint": 1,
				"napplypaymny": 9,
				"nlineno": 10,
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"pk_balatype": "1523414420340867121",
				"pk_bankdoc": "1528541683599802377",
				"pk_bankdoc_opp": "1524170102660399106",
				"pk_banktype": "1524169827796123657",
				"pk_banktype_opp": "1524170102660399104",
				"pk_currency": "1523413904973627422",
				"pk_currency_opp": "1523413904973627420",
				"pk_cusdoc": "1526258513250615297",
				"pk_cusdocbank": "1617516466523340807",
				"pk_enterprisebankacct": "1524172868632969223",
				"pk_expensebill": "1686102215248838661",
				"pubts": "2023-09-14 13:51:08",
				"settleform": 0,
				"vbankaccname": "账户英镑",
				"vbankaccname_opp": "工商银行",
				"vbankaccount": "2342424354645",
				"vbankaccount_opp": "21121212",
				"vbankdocname": "中国工商银行上海市武进路支行",
				"vbankdocname_opp": "中国银行股份有限公司马鞍山佳山路支行",
				"vbanktypename": "中国工商银行",
				"vbanktypename_opp": "中国银行",
				"vcurrency": "1523413904973627420",
				"vnatcurrency": "1523413904973627420",
				"vnatexchratetype": "0000L6UFPA4E2D845F0000",
				"nnatapplypaymny": 9,
				"expbill_code": "GRRD230322000005",
				"pk_expsettleinfo": "1686102215248838676",
				"centerpriseorg_name": "费控A",
				"vnatexchratetype_digit": "6",
				"balatypesrvattr": 0,
				"vcurrency_moneyDigit": "2",
				"vnatcurrency_moneyDigit": "2",
				"pk_balatype_name": "银行转账",
				"pk_cusdoc_name": "供应商1",
				"pk_currency_name": "英镑",
				"pk_enterprisebankacct_name": "付款账户费控",
				"pk_currency_opp_name": "人民币",
				"vcurrency_name": "人民币",
				"vnatcurrency_name": "人民币",
				"vnatexchratetype_name": "基准汇率",
				"id": "1845618537589112839",
				"pk_paymentapply": "1845618537589112838",
				"yTenantId": "0000L6UFPA4E2D845F0000"
			}
		],
		"resubmitCheckKey": "znbzbx_paymentapply_add_66c4f0ac-6c48-4137-9628-44b6a0d61aca",
		"id": "1845618537589112838",
		"barCode": "znbzbx_paymentapply|1845618537589112838",
		"pubts": "2023-10-23 18:51:17",
		"tenant": 2905678041437536,
		"yTenantId": "0000L6UFPA4E2D845F0000",
		"isoverstd": false,
		"iauditresult": 0,
		"iauditdealstatus": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-22

更新

请求说明

更新

返回参数 displayCode

更新

返回参数 data

更新

返回参数 paymentapplysettleinfos

添加幂等

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

