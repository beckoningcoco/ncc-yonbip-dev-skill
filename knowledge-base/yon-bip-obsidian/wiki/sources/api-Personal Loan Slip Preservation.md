---
title: "个人借款单保存"
apiId: "79df4ed70e3e42d7b8cd01520b05f0ae"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Advance Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Advance Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 个人借款单保存

> `ContentType	application/json` 请求方式	POST | 分类: Advance Request (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/loanbill/save

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
| ismulticurrency | boolean | 否 | 否 | 是否多币种(true:是;false:不是) 示例：false |
| isendvouchertype | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 传核算方式(0:不传；1:传会计平台服务) 示例：0 |
| isendsettletype | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 传财资方式(0:不传；1:传财资服务) 示例：0 |
| id | long | 否 | 否 | 单据id(_status为Update更新单据时必填) |
| code | string | 否 | 否 | 单据号(设置手工编号时必输，自动编号时输入无效) 示例：0301 |
| dcostdate | string | 否 | 是 | 发生日期(格式：yyyy-MM-dd) 示例：2021-09-06 |
| vouchdate | string | 否 | 是 | 单据日期(格式：yyyy-MM-dd) 示例：2021-09-06 |
| cfinaceorg | string | 否 | 是 | 费用承担组织(支持id和code) 示例：2184854309114112 |
| vfinacedeptid | string | 否 | 是 | 费用承担部门(支持id和code) 示例：2184856228794624 |
| cfinacecostcenter | string | 否 | 否 | 费用承担成本中心（支持id和code） |
| profitcenter | string | 否 | 否 | 利润中心(支持id或code；非特征租户不填，特征租户可填) |
| caccountorg | string | 否 | 是 | 会计主体(支持id和code) 示例：2184854309114112 |
| bustype | string | 否 | 是 | 交易类型(支持id和code) 示例：2183687370051851 |
| pk_project | string | 否 | 否 | 项目(支持id和code) |
| pk_handlepsn | string | 否 | 是 | 借款人(支持id和code) 示例：2185003811393792 |
| vcurrency | string | 否 | 是 | 借款币种(支持id和code) 示例：2183687327011840 |
| vnatcurrency | string | 否 | 是 | 组织本币(支持id和code) 示例：2183687327011840 |
| vnatexchratetype | string | 否 | 是 | 汇率类型(支持id和code) 示例：py7y8nze |
| vnatexchratetype_digit | string | 否 | 否 | 汇率精度 示例：6 |
| dnatexchratedate | string | 否 | 是 | 汇率日期(格式：yyyy-MM-dd) 示例：2021-09-06 |
| nnatbaseexchrate | BigDecimal | 否 | 是 | 基准汇率 示例：1 |
| nnatexchrate | BigDecimal | 否 | 是 | 汇率 示例：1 |
| vcurrency_moneyDigit | string | 否 | 否 | 原币币种金额精度 示例：2 |
| vnatcurrency_moneyDigit | string | 否 | 否 | 组织本币金额精度 示例：2 |
| nnatloanmny | BigDecimal | 否 | 是 | 借款金额-本币 示例：10 |
| vhandledeptid | string | 否 | 是 | 借款人部门(支持id和code) 示例：2184856228794624 |
| chandleorg | string | 否 | 是 | 借款人组织(支持id和code) 示例：2184854309114112 |
| nloanmny | BigDecimal | 否 | 是 | 借款金额 示例：10 |
| vreason | string | 否 | 是 | 借款原因 示例：0906测试 |
| vmemo | string | 否 | 否 | 备注 示例：0906测试 |
| vattachmentass | string | 否 | 否 | 单据附件id 示例：wzaagrkefeMD2DdnTyKrlWE6WiKsXAth |
| creator | string | 否 | 否 | 创建人 示例：王建斌 |
| creatorId | long | 否 | 否 | 创建人id(不传值默认YonSuite默认用户) 示例：2185004199465216 |
| creator_code | string | 否 | 否 | 创建人编码(不传值默认YonSuite默认用户) |
| loanbillbvos | object | 是 | 是 | 借款信息 |
| loansettleinfovos | object | 是 | 是 | 结算信息 |
| pk_handlepsnbank | string | 否 | 否 | 借款人银行账户(支持id和code) |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/loanbill/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"ismulticurrency": false,
		"isendvouchertype": 0,
		"isendsettletype": 0,
		"id": 0,
		"code": "0301",
		"dcostdate": "2021-09-06",
		"vouchdate": "2021-09-06",
		"cfinaceorg": "2184854309114112",
		"vfinacedeptid": "2184856228794624",
		"cfinacecostcenter": "",
		"profitcenter": "",
		"caccountorg": "2184854309114112",
		"bustype": "2183687370051851",
		"pk_project": "",
		"pk_handlepsn": "2185003811393792",
		"vcurrency": "2183687327011840",
		"vnatcurrency": "2183687327011840",
		"vnatexchratetype": "py7y8nze",
		"vnatexchratetype_digit": "6",
		"dnatexchratedate": "2021-09-06",
		"nnatbaseexchrate": 1,
		"nnatexchrate": 1,
		"vcurrency_moneyDigit": "2",
		"vnatcurrency_moneyDigit": "2",
		"nnatloanmny": 10,
		"vhandledeptid": "2184856228794624",
		"chandleorg": "2184854309114112",
		"nloanmny": 10,
		"vreason": "0906测试",
		"vmemo": "0906测试",
		"vattachmentass": "wzaagrkefeMD2DdnTyKrlWE6WiKsXAth",
		"creator": "王建斌",
		"creatorId": 2185004199465216,
		"creator_code": "",
		"loanbillbvos": [
			{
				"id": "",
				"pk_project": "",
				"pk_busimemo": 2184860029718784,
				"pk_busimemo_code": "",
				"pk_busimemotype": 2184858240700672,
				"pk_busimemotype_code": "",
				"pk_handlepsn": "2185003811393792",
				"vhandledeptid": "2184856228794624",
				"chandleorg": "2184854309114112",
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2021-09-06",
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": "2",
				"caccountorg": "2184854309114112",
				"cfinaceorg": "2184854309114112",
				"vfinacedeptid": "2184856228794624",
				"cfinacecostcenter": "",
				"profitcenter": "",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"nnatloanmny": 10,
				"_status": "Insert",
				"nloanmny": 10,
				"pk_memoapply": 2349367323463936,
				"pk_memoapply_type": "znbzbx_memoapply",
				"vapplycurrency": "2183687327011840",
				"vapplycurrency_moneyDigit": "2",
				"napplymny": 10
			}
		],
		"loansettleinfovos": [
			{
				"id": "",
				"vbankaccount": "100000000",
				"vbankaccname": "王建斌",
				"pk_bankdoc": "2184878273385216",
				"pk_banktype": "2184875898393344",
				"pk_currency": "2183687327011840",
				"pk_handlepsnbank": "2185003811655937",
				"pk_handlepsn": "2185003811393792",
				"pk_balatype": 2183682241614081,
				"pk_balatype_code": "",
				"balatypesrvattr": 0,
				"centerpriseorg": "2184854309114112",
				"pk_currency_opp": "2183687327011840",
				"vmemo_opp": "",
				"pk_enterprisebankacct": "2325222650122752",
				"vbankaccount_opp": "1",
				"pk_banktype_opp": "2186830872515336",
				"pk_bankdoc_opp": "2186831417381637",
				"pk_enterprisecashacct": "",
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": "2",
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2021-09-06",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"vsettlecurrency": "2183687327011840",
				"vsettlecurrency_moneyDigit": "2",
				"nsettlebaseexchrate": 1,
				"nsettleexchrate": 1,
				"nsummny": 10,
				"nsettlesummny": 10,
				"nnatsettlesummny": 10,
				"_status": "Insert",
				"centerpriseorg_caccountorg": "1624924383261229061",
				"centerpriseorg_caccountorg_name": "my费控日常"
			}
		],
		"pk_handlepsnbank": "",
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
| displayCode | string | 否 | 异常码 |
| code | long | 否 | 返回编码 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| ismulticurrency | boolean | 否 | 是否多币种(true:是;false:不是) 示例：false |
| code | string | 否 | 单据号 示例：0301 |
| vouchdate | string | 否 | 单据日期 示例：2021-09-06 00:00:00 |
| isendsettletype | number |
| 小数位数:2,最大长度:10 | 否 | 传财资方式 示例：0 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_loanbill |
| isendvouchertype | number |
| 小数位数:2,最大长度:10 | 否 | 传核算方式 示例：0 |
| cfinaceorg | string | 否 | 费用承担组织id 示例：2184854309114112 |
| cfinaceorg_name | string | 否 | 费用承担组织 示例：北京天元股份有限公司 |
| cfinacecostcenter | string | 否 | 费用承担成本中心id 示例：2184854309114112 |
| profitcenter | string | 否 | 利润中心 示例：2184854309114112 |
| vfinacedeptid | string | 否 | 费用承担部门id 示例：2184856228794624 |
| vfinacedeptid_name | string | 否 | 费用承担部门 示例：筹资部-规划部 |
| caccountorg | string | 否 | 会计主体id 示例：2184854309114112 |
| caccountorg_name | string | 否 | 会计主体 引用：会计主体 FinanceOrgVO 示例：北京天元股份有限公司 |
| bustype | string | 否 | 交易类型id 示例：2183687370051851 |
| bustype_name | string | 否 | 交易类型 示例：个人借款单 |
| pk_project | string | 否 | 项目id 示例：1568590905194577980 |
| pk_handlepsn | string | 否 | 借款人id 示例：2185003811393792 |
| vcurrency | string | 否 | 借款币种id 示例：2183687327011840 |
| vcurrency_name | string | 否 | 借款币种 示例：人民币 |
| vnatcurrency | string | 否 | 组织本币id 示例：2183687327011840 |
| vnatcurrency_name | string | 否 | 组织本币 示例：人民币 |
| vnatexchratetype | string | 否 | 汇率类型id 示例：py7y8nze |
| vnatexchratetype_name | string | 否 | 汇率类型 示例：基准汇率 |
| vnatexchratetype_digit | string | 否 | 汇率精度 示例：6 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2021-09-06 00:00:00 |
| nnatbaseexchrate | long | 否 | 基准汇率 示例：1 |
| nnatexchrate | long | 否 | 汇率 示例：1 |
| vcurrency_moneyDigit | string | 否 | 原币币种金额精度 示例：2 |
| vnatcurrency_moneyDigit | string | 否 | 组织本币金额精度 示例：2 |
| nnatloanmny | long | 否 | 借款金额-本币 示例：10 |
| pk_handlepsn_name | string | 否 | 借款人 引用：员工(新)StaffNew 示例：王建斌 |
| vhandledeptid | string | 否 | 借款人部门id 示例：2184856228794624 |
| vhandledeptid_name | string | 否 | 借款人部门 示例：筹资部-规划部 |
| chandleorg | string | 否 | 借款人组织id 示例：2184854309114112 |
| chandleorg_name | string | 否 | 借款人组织 示例：北京天元股份有限公司 |
| nloanmny | long | 否 | 借款金额 示例：10 |
| vreason | string | 否 | 借款原因 示例：0906测试 |
| bcav | boolean | 否 | 是否核销完毕(true:完毕;false:未完毕) 示例：false |
| bfinalcav | boolean | 否 | 是否核销完毕(true:完毕;false:未完毕) 示例：false |
| status | long | 否 | 单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：0 |
| isettlestatus | long | 否 | 结算状态,0:待结算、1:结算中、2:结算成功、3:结算止付、4:结算部分成功、5:无需结算、 示例：0 |
| vmemo | string | 否 | 备注 示例：0906测试 |
| irejectstatus | long | 否 | 驳回状态(0:正常;1:驳回) 示例：0 |
| ibillmakemethod | long | 否 | 填单方式(0:PC新增;1:移动新增;2:EXCEL导入) 示例：0 |
| vattachmentass | string | 否 | 单据附件id 示例：c2ah1of3G6shdhaqBj6GYQPcXVfRNLpW |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：true |
| verifystate | long | 否 | 审批状态(0:待提交;1:审批完成;3:审批中) 示例：0 |
| returncount | long | 否 | 退回次数 示例：0 |
| creator | string | 否 | 创建人 示例：王建斌 |
| createTime | string | 否 | 创建时间 示例：2021-09-06 16:53:16 |
| createDate | string | 否 | 创建日期 示例：2021-09-06 16:53:16 |
| creatorId | long | 否 | 创建人id 示例：2185004199465216 |
| loanbillbvos | object | 是 | 借款信息 |
| loansettleinfovos | object | 是 | 结算信息 |
| id | long | 否 | id 示例：2420218191859968 |
| barCode | string | 否 | 条形码 示例：znbzbx_loanbill|2420218191859968 |
| pubts | string | 否 | 时间戳 示例：2021-09-06 16:53:16 |
| tenant | long | 否 | 租户 示例：2183682413744384 |
| yTenantId | string | 否 | 租户id 示例：py7y8nze |
| isoverstd | boolean | 否 | 是否超标(true:是;false:不是) 示例：false |
| iauditresult | long | 否 | 系统稽核结果(0:稽核待处理; 1:系统稽核检测通过,系统自动稽核规则--全部通过; 2:系统稽核检测柔性不通过,系统自动稽核规则--不通过的稽核规则全部都是柔性控制; 3:系统稽核检测刚性不通过,系统自动稽核规则--不通过的稽核规则存在刚性控制的; 4:财务稽核检测通过,财务初核时--稽核规则全部通过; 5:财务稽核检测柔性不通过,财务初核时--稽核规则不通过的稽核规则全部都是柔性控制; 6:财务稽核检测刚性不通过,财务初核时--稽核规则不通过的稽核规则存在刚性控制的; 7:无需稽核;) 示例：7 |
| iauditdealstatus | long | 否 | 稽核处理状态(0:未处理;1:已初核） 示例：0 |

## 5. 正确返回示例

{
	"displayCode": "",
	"code": 200,
	"message": "操作成功",
	"data": {
		"ismulticurrency": false,
		"code": "0301",
		"vouchdate": "2021-09-06 00:00:00",
		"isendsettletype": 0,
		"pk_billtype": "znbzbx_loanbill",
		"isendvouchertype": 0,
		"cfinaceorg": "2184854309114112",
		"cfinaceorg_name": "北京天元股份有限公司",
		"cfinacecostcenter": "2184854309114112",
		"profitcenter": "2184854309114112",
		"vfinacedeptid": "2184856228794624",
		"vfinacedeptid_name": "筹资部-规划部",
		"caccountorg": "2184854309114112",
		"caccountorg_name": "北京天元股份有限公司",
		"bustype": "2183687370051851",
		"bustype_name": "个人借款单",
		"pk_project": "1568590905194577980",
		"pk_handlepsn": "2185003811393792",
		"vcurrency": "2183687327011840",
		"vcurrency_name": "人民币",
		"vnatcurrency": "2183687327011840",
		"vnatcurrency_name": "人民币",
		"vnatexchratetype": "py7y8nze",
		"vnatexchratetype_name": "基准汇率",
		"vnatexchratetype_digit": "6",
		"dnatexchratedate": "2021-09-06 00:00:00",
		"nnatbaseexchrate": 1,
		"nnatexchrate": 1,
		"vcurrency_moneyDigit": "2",
		"vnatcurrency_moneyDigit": "2",
		"nnatloanmny": 10,
		"pk_handlepsn_name": "王建斌",
		"vhandledeptid": "2184856228794624",
		"vhandledeptid_name": "筹资部-规划部",
		"chandleorg": "2184854309114112",
		"chandleorg_name": "北京天元股份有限公司",
		"nloanmny": 10,
		"vreason": "0906测试",
		"bcav": false,
		"bfinalcav": false,
		"status": 0,
		"isettlestatus": 0,
		"vmemo": "0906测试",
		"irejectstatus": 0,
		"ibillmakemethod": 0,
		"vattachmentass": "c2ah1of3G6shdhaqBj6GYQPcXVfRNLpW",
		"isWfControlled": true,
		"verifystate": 0,
		"returncount": 0,
		"creator": "王建斌",
		"createTime": "2021-09-06 16:53:16",
		"createDate": "2021-09-06 16:53:16",
		"creatorId": 2185004199465216,
		"loanbillbvos": [
			{
				"hasDefaultInit": true,
				"pk_project": "1568590905194577980",
				"pk_handlepsn": "2185003811393792",
				"pk_handlepsn_name": "王建斌",
				"vhandledeptid": "2184856228794624",
				"vhandledeptid_name": "筹资部-规划部",
				"chandleorg": "2184854309114112",
				"chandleorg_name": "北京天元股份有限公司",
				"pk_busimemo": 2184859339739392,
				"pk_busimemo_name": "筹资招待费",
				"pk_busimemotype": 2184858240700672,
				"pk_memoapply": 2349367323463936,
				"vmemoapplybilltype": "znbzbx_memoapply",
				"pk_memoapply_ismulticurrency": false,
				"pk_memoapply_code": "0121",
				"pk_memoapply_b": 2349367323463937,
				"pk_memoapply_b_code": "0121",
				"vcurrency": "2183687327011840",
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": "2",
				"vcurrency_currTypeSign": "¥",
				"vapplycurrency": "2183687327011840",
				"vapplycurrency_name": "人民币",
				"vapplycurrency_moneyDigit": "2",
				"napplymny": 10,
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_name": "人民币",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_name": "基准汇率",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2021-09-06 00:00:00",
				"caccountorg": "2184854309114112",
				"caccountorg_name": "北京天元股份有限公司",
				"cfinaceorg": "2184854309114112",
				"cfinaceorg_name": "北京天元股份有限公司",
				"cfinacecostcenter": "2184854309114112",
				"profitcenter": "2184854309114112",
				"vfinacedeptid": "2184856228794624",
				"vfinacedeptid_name": "筹资部-规划部",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"nnatloanmny": 10,
				"nlineno": 10,
				"nloanmny": 10,
				"id": 2420218191859969,
				"pk_loanbill": 2420218191859968,
				"pubts": "2021-09-06 16:53:16",
				"tenant": 2183682413744384,
				"yTenantId": "py7y8nze"
			}
		],
		"loansettleinfovos": [
			{
				"ipaystartpoint": 1,
				"bcansettlesysmodify": true,
				"bjournalizing": true,
				"iaraptype": 0,
				"hasDefaultInit": true,
				"vbankaccount": "100000000",
				"vbankaccname": "王建斌",
				"pk_bankdoc": "2184878273385216",
				"vbankdocname": "用友银行",
				"pk_banktype": "2184875898393344",
				"vbanktypename": "万安洪都村镇银行",
				"pk_currency": "2183687327011840",
				"pk_currency_name": "人民币",
				"accttype": "BAT00001",
				"pk_handlepsnbank": "2185003811655937",
				"pk_handlepsn": "2185003811393792",
				"pk_handlepsn_name": "王建斌",
				"igathertype": 0,
				"pk_balatype": 2183682241614081,
				"pk_balatype_name": "银行转账",
				"balatypesrvattr": 0,
				"centerpriseorg": "2184854309114112",
				"centerpriseorg_name": "北京天元股份有限公司",
				"pk_currency_opp": "2183687327011840",
				"pk_currency_opp_name": "人民币",
				"pk_enterprisebankacct": "2325222650122752",
				"pk_enterprisebankacct_name": "1",
				"vbankaccount_opp": "1",
				"vbankaccname_opp": "1",
				"pk_banktype_opp": "2186830872515336",
				"vbanktypename_opp": "中国工商银行",
				"pk_bankdoc_opp": "2186831417381637",
				"vbankdocname_opp": "中国工商银行股份有限公司天津中北支行",
				"accttype_opp": "0",
				"isettlestatus": 0,
				"vcurrency": "2183687327011840",
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": "2",
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_name": "人民币",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_name": "基准汇率",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2021-09-06 00:00:00",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"vsettlecurrency": "2183687327011840",
				"vsettlecurrency_name": "人民币",
				"vsettlecurrency_moneyDigit": "2",
				"nsettlebaseexchrate": 1,
				"nsettleexchrate": 1,
				"nlineno": 10,
				"nsummny": 10,
				"nsettlesummny": 10,
				"nnatsettlesummny": 10,
				"id": 2420218191859970,
				"pk_loanbill": 2420218191859968,
				"pubts": "2021-09-06 16:53:16",
				"tenant": 2183682413744384,
				"yTenantId": "py7y8nze"
			}
		],
		"id": 2420218191859968,
		"barCode": "znbzbx_loanbill|2420218191859968",
		"pubts": "2021-09-06 16:53:16",
		"tenant": 2183682413744384,
		"yTenantId": "py7y8nze",
		"isoverstd": false,
		"iauditresult": 7,
		"iauditdealstatus": 0
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

