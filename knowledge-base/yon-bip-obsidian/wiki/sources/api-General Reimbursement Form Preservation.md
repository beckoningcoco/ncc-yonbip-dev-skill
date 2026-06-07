---
title: "通用报销单保存"
apiId: "5d153ab874f04e358117d8afa8cd5a8a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "General Expense Report"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Expense Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 通用报销单保存

> `ContentType	application/json` 请求方式	POST | 分类: General Expense Report (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/expensebill/save

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
| data | object | 否 | 是 | 数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| ismulticurrency | boolean | 否 | 否 | 是否多币种(true:是;false:不是) 示例：false |
| id | long | 否 | 否 | 单据id(_status为Update更新时必填) |
| code | string | 否 | 否 | 单据号(设置手工编号时必输，自动编号时输入无效) 示例：0298 |
| dcostdate | string | 否 | 是 | 发生日期(格式：yyyy-MM-dd) 示例：2021-09-26 |
| vouchdate | string | 否 | 是 | 单据日期(格式：yyyy-MM-dd) 示例：2021-09-26 |
| vfinacedeptid | string | 否 | 是 | 费用承担部门(支持id和code) 示例：2184856228794624 |
| cfinaceorg | string | 否 | 是 | 费用承担组织(支持id和code) 示例：2184854309114112 |
| cfinacecostcenter | string | 否 | 否 | 费用承担成本中心（支持id和code） |
| profitcenter | string | 否 | 否 | 利润中心(支持id或code；非特征租户不填，特征租户可填) |
| caccountorg | string | 否 | 是 | 会计主体(支持id和code) 示例：2184854309114112 |
| pk_project | string | 否 | 否 | 项目(支持id和code) 示例：2184864426185472 |
| pk_busimemo | long | 否 | 否 | 费用项目id 示例：2184860029718784 |
| pk_busimemo_code | string | 否 | 否 | 费用项目编码 |
| pk_busimemotype | long | 否 | 否 | 费用项目类别id 示例：2184858240700672 |
| pk_busimemotype_code | string | 否 | 否 | 费用项目类别编码 |
| bustype | string | 否 | 是 | 交易类型(支持id和code) 示例：2183687370051849 |
| vcurrency | string | 否 | 是 | 原币(支持id和code) 示例：2183687327011840 |
| vcurrency_moneyDigit | string | 否 | 否 | 原币金额精度 示例：2 |
| pk_handlepsn | string | 否 | 是 | 报销人(支持id和code) 示例：2185003811393792 |
| vhandledeptid | string | 否 | 是 | 报销人部门(支持id和code) 示例：2184856228794624 |
| chandleorg | string | 否 | 是 | 报销人组织(支持id和code) 示例：2184854309114112 |
| vnatcurrency | string | 否 | 是 | 组织本币(支持id和code) 示例：2183687327011840 |
| vnatcurrency_moneyDigit | string | 否 | 否 | 组织本币金额精度 示例：2 |
| vnatexchratetype | string | 否 | 是 | 组织本币汇率类型(支持id和code) 示例：py7y8nze |
| vnatexchratetype_digit | long | 否 | 否 | 组织本币汇率精度 示例：6 |
| dnatexchratedate | string | 否 | 是 | 组织本币汇率日期(格式：yyyy-MM-dd) 示例：2021-09-26 |
| nnatbaseexchrate | BigDecimal | 否 | 是 | 组织本币企业汇率 示例：1 |
| nnatexchrate | BigDecimal | 否 | 是 | 组织本币汇率 示例：1 |
| nexpensemny | BigDecimal | 否 | 是 | 不含税总额 示例：133.74 |
| nnatexpensemny | BigDecimal | 否 | 是 | 不含税总额-本币 示例：129.87 |
| nsummny | BigDecimal | 否 | 是 | 报销价税总额 示例：133.74 |
| nnatsummny | BigDecimal | 否 | 是 | 报销价税总额-本币 示例：133.74 |
| ntaxmny | BigDecimal | 否 | 否 | 可抵扣税额 示例：3.87 |
| nnattaxmny | BigDecimal | 否 | 否 | 可抵扣税额-本币 示例：3.87 |
| naccpaymny | BigDecimal | 否 | 否 | 累计付款额 示例：1 |
| nnataccpaymny | BigDecimal | 否 | 否 | 累计付款额-本币 示例：1 |
| nshouldpaymny | BigDecimal | 否 | 是 | 应付总额(应付总额=报销价税总额-核销总额) 示例：1 |
| nnatshouldpaymny | BigDecimal | 否 | 是 | 应付总额-本币(应付总额-本币=报销价税总额-本币 - 核销总额-本币) 示例：1 |
| npaymentmny | BigDecimal | 否 | 否 | 付款总额 示例：1 |
| nnatpaymentmny | BigDecimal | 否 | 否 | 付款总额-本币 示例：1 |
| ncavmny | BigDecimal | 否 | 否 | 核销总额 示例：1 |
| nnatcavmny | BigDecimal | 否 | 否 | 核销总额-本币 示例：1 |
| pk_cusdoc | long | 否 | 否 | 供应商id 示例：2185034480177408 |
| pk_cusdoc_code | string | 否 | 否 | 供应商编码 |
| pk_customer | long | 否 | 否 | 客户id |
| pk_customer_code | string | 否 | 否 | 客户编码 |
| vreason | string | 否 | 是 | 报销说明 示例：测试 |
| vmemo | string | 否 | 否 | 备注 |
| vattachmentass | string | 否 | 否 | 单据附件id 示例：ktX7BO41rUX1Ya1wXsSDtxSvXAq4iiia |
| isdeferexpense | string | 否 | 否 | 是否待摊(true:是;false:不是) 示例：true |
| pk_beginperiod | long | 否 | 否 | 摊销开始期间id 示例：2183687983141128 |
| vbeginperiod | string | 否 | 否 | 摊销开始期间(格式：yyyy-MM-dd) 示例：2021-09 |
| vendperiod | string | 否 | 否 | 摊销结束期间(格式：yyyy-MM-dd) 示例：2021-10 |
| ndeferexpensenum | long | 否 | 否 | 总摊销期 示例：2 |
| creatorId | long | 否 | 否 | 创建人id(不传值默认YonSuite默认用户) 示例：2185004199465216 |
| creator_code | string | 否 | 否 | 创建人编码(不传值默认YonSuite默认用户) |
| creator | string | 否 | 否 | 创建人名称 示例：王建斌 |
| isendsettletype | string | 否 | 否 | 传财资方式(0:不传；1:传财资服务) |
| isendtaxtype | string | 否 | 否 | 传税务方式(0:不传；1:传税务服务) |
| isendvouchertype | string | 否 | 否 | 传核算方式(0:不传；1:传会计平台服务) |
| isendefatype | string | 否 | 否 | 传固定资产方式(0:不传；1:传固定资产 |
| expensebillbs | object | 是 | 是 | 报销单明细 |
| loancavs | object | 是 | 否 | 报销单借款核销 |
| withholdingcavs | object | 是 | 否 | 报销单预提核销 |
| expapportions | object | 是 | 是 | 报销单费用分摊集合(商旅云通过当前API推送报销单场景为非必填，其他场景必填) |
| expsettleinfos | object | 是 | 是 | 报销单结算信息集合 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例:Insert 示例：Insert |
| ntotalmny | BigDecimal | 否 | 否 | 报销总额 |
| nnattotalmny | BigDecimal | 否 | 否 | 报销总额-本币 |
| ncpmny | BigDecimal | 否 | 否 | 本期发生总额 示例：1 |
| ncpuntaxmny | BigDecimal | 否 | 否 | 本期发生不含税总额 示例：1 |
| ndeferredmny | BigDecimal | 否 | 否 | 待摊总额 示例：1 |
| ndeferreduntaxmny | BigDecimal | 否 | 否 | 待摊不含税总额 示例：1 |
| nnatcpmny | BigDecimal | 否 | 否 | 本期发生总额-本币 示例：1 |
| nnatcpuntaxmny | BigDecimal | 否 | 否 | 本期发生不含税总额-本币 示例：1 |
| nnatdeferredmny | BigDecimal | 否 | 否 | 待摊总额-本币 示例：1 |
| nnatdeferreduntaxmny | BigDecimal | 否 | 否 | 待摊不含税总额-本币 示例：1 |
| ncavwithholdingmny | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 预提核销金额 |
| nnatcavwithholdingmny | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 预提核销-本币 |
| expinvoicedetails | object | 是 | 否 | 账单明细 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/expensebill/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"ismulticurrency": false,
		"id": 0,
		"code": "0298",
		"dcostdate": "2021-09-26",
		"vouchdate": "2021-09-26",
		"vfinacedeptid": "2184856228794624",
		"cfinaceorg": "2184854309114112",
		"cfinacecostcenter": "",
		"profitcenter": "",
		"caccountorg": "2184854309114112",
		"pk_project": "2184864426185472",
		"pk_busimemo": 2184860029718784,
		"pk_busimemo_code": "",
		"pk_busimemotype": 2184858240700672,
		"pk_busimemotype_code": "",
		"bustype": "2183687370051849",
		"vcurrency": "2183687327011840",
		"vcurrency_moneyDigit": "2",
		"pk_handlepsn": "2185003811393792",
		"vhandledeptid": "2184856228794624",
		"chandleorg": "2184854309114112",
		"vnatcurrency": "2183687327011840",
		"vnatcurrency_moneyDigit": "2",
		"vnatexchratetype": "py7y8nze",
		"vnatexchratetype_digit": 6,
		"dnatexchratedate": "2021-09-26",
		"nnatbaseexchrate": 1,
		"nnatexchrate": 1,
		"nexpensemny": 133.74,
		"nnatexpensemny": 129.87,
		"nsummny": 133.74,
		"nnatsummny": 133.74,
		"ntaxmny": 3.87,
		"nnattaxmny": 3.87,
		"naccpaymny": 1,
		"nnataccpaymny": 1,
		"nshouldpaymny": 1,
		"nnatshouldpaymny": 1,
		"npaymentmny": 1,
		"nnatpaymentmny": 1,
		"ncavmny": 1,
		"nnatcavmny": 1,
		"pk_cusdoc": 2185034480177408,
		"pk_cusdoc_code": "",
		"pk_customer": 0,
		"pk_customer_code": "",
		"vreason": "测试",
		"vmemo": "",
		"vattachmentass": "ktX7BO41rUX1Ya1wXsSDtxSvXAq4iiia",
		"isdeferexpense": "true",
		"pk_beginperiod": 2183687983141128,
		"vbeginperiod": "2021-09",
		"vendperiod": "2021-10",
		"ndeferexpensenum": 2,
		"creatorId": 2185004199465216,
		"creator_code": "",
		"creator": "王建斌",
		"isendsettletype": "",
		"isendtaxtype": "",
		"isendvouchertype": "",
		"isendefatype": "",
		"expensebillbs": [
			{
				"id": 0,
				"pk_busimemo": 2184860029718784,
				"pk_busimemo_code": "",
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": 6,
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": 2,
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"dnatexchratedate": "2021-09-26",
				"pk_handlepsn": "2185003811393792",
				"vhandledeptid": "2184856228794624",
				"chandleorg": "2184854309114112",
				"caccountorg": "2184854309114112",
				"cfinaceorg": "2184854309114112",
				"vfinacedeptid": "2184856228794624",
				"chandlecostcenter": 0,
				"chandlecostcenter_code": "",
				"cfinacecostcenter": 0,
				"cfinacecostcenter_code": "",
				"profitcenter": "",
				"pk_cusdoc": 2185034480177408,
				"pk_cusdoc_code": "",
				"pk_customer": 0,
				"pk_customer_code": "",
				"pk_busimemotype": 2184858240700672,
				"pk_busimemotype_code": "",
				"nexpensemny": 133.74,
				"nnatexpensemny": 133.74,
				"ntaxmny": 0,
				"nnattaxmny": 0,
				"nsummny": 133.74,
				"nnatsummny": 133.74,
				"ncavmny": 70,
				"nnatcavmny": 70,
				"nshouldpaymny": 1,
				"nnatshouldpaymny": 1,
				"npaymentmny": 133.74,
				"nnatpaymentmny": 1,
				"naccpaymny": 1,
				"nnataccpaymny": 1,
				"pk_project": "2184864426185472",
				"pk_memoapply": 2349147066913024,
				"vmemoapplybilltype": "znbzbx_memoapply",
				"vapplycurrency": "2183687327011840",
				"vapplycurrency_moneyDigit": 2,
				"napplymny": 10,
				"_status": "Insert",
				"ncavwithholdingmny": 0,
				"nnatcavwithholdingmny": 0,
				"pk_fixedassetsinfo": "",
				"pk_fixedassetsinfo_code": ""
			}
		],
		"loancavs": [
			{
				"id": 0,
				"bcav": true,
				"pk_loanbill": "1598409643230494726",
				"pk_loanbill_b": "1598409643230494728",
				"pk_loanbilltype": "znbzbx_loanbill",
				"loanno": "PLNS2211240003",
				"pk_memoapply": 1598397651696484358,
				"pk_project": "2184864426185472",
				"pk_loanpsn": "2185003811393792",
				"vloandeptid": "2534726016913664",
				"vloanchandleorg": "1534545738714841092",
				"pk_cusdoc": 2185034480177408,
				"pk_cusdoc_code": "",
				"pk_customer": "",
				"pk_customer_code": "",
				"loandate": "2022-11-24 00:00:00",
				"pk_busimemo": 1464090373393481736,
				"pk_busimemo_code": "",
				"pk_busimemotype": 2184858240700672,
				"pk_busimemotype_code": "",
				"nloanmny": 400,
				"nnatloanmny": 400,
				"nfinalsummnybody": "400",
				"nnatfinalsummnybody": "400",
				"nacccavmny": 0,
				"nnatacccavmny": 0,
				"naccreturnmny": 0,
				"nnataccreturnmny": 0,
				"nacctransferloanmny": "0",
				"nnatacctransferloanmny": "0",
				"ntotalcavmny": 400,
				"nnattotalcavmny": 400,
				"ncavmny": 0,
				"nnatcavmny": 0,
				"nuncavmny": 400,
				"nnatuncavmny": 400,
				"vreason": "立项红冲",
				"vloancurrency": "2533329091532288",
				"vloancurrency_moneyDigit": "3",
				"vnatcurrency": "2533329091532288",
				"vnatcurrency_moneyDigit": "3",
				"vnatexchratetype": "0000KWEKXNNQCPWIRL0000",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2022-12-12",
				"nnatexchrate": 1,
				"vloanfinacedeptid": "2534726016913664",
				"cloanfinaceorg": "2534724219212032",
				"cloancostcenter": 1549410586072186888,
				"cloancostcenter_code": "A002",
				"cloanfinacecostcenter": 1549410586072186888,
				"cloanfinacecostcenter_code": "A002",
				"profitcenter": "",
				"_status": "Insert"
			}
		],
		"withholdingcavs": [
			{
				"bcav": true,
				"pk_manualwithholding": "1982026939425095685",
				"pk_manualwithholding_b": "1982026939425095686",
				"pk_manualwithholdingtype": "znbzbx_manualwithholding",
				"pk_memoapply": "1598397651696484358",
				"pk_project": "2184864426185472",
				"pk_withholdingpsn": "1888518680973148165",
				"vwithholdingdeptid": "1888514927179071490",
				"cwithholdingfinaceorg": "1888514385988550664",
				"pk_cusdoc": "2185034480177408",
				"pk_cusdoc_code": "",
				"pk_customer": "",
				"pk_customer_code": "",
				"pk_busimemo": "1464090373393481736",
				"pk_busimemo_code": "",
				"pk_busimemotype": "",
				"pk_busimemotype_code": "",
				"ncavmny": 10,
				"nnatcavmny": 10,
				"vreason": "openapi测试",
				"vwthdcurrency": "1810016084788513227",
				"vwthdcurrency_moneyDigit": "2",
				"vnatcurrency": "1810016084788513227",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "0000LM68DHTC0MYSQV0000",
				"vnatexchratetype_digit": "6",
				"dnatexchratedate": "2024-04-24 00:00:00",
				"nnatexchrate": "1",
				"vwithholdingfinacedeptid": "1888514927179071490",
				"vwithholdingfinacedeptid_name": "费控服务自动化_非审批流",
				"vwithholdingchandleorg": "1888514385988550664",
				"cwithholdingcostcenter": "",
				"cwithholdingcostcenter_code": "",
				"cwhfinacecostcenter": "",
				"cwhfinacecostcenter_code": "",
				"profitcenter": "",
				"profitcenter_name": "",
				"_status": "",
				"id": ""
			}
		],
		"expapportions": [
			{
				"id": 0,
				"vfinacedeptid": "2184856228794624",
				"cfinaceorg": "2184854309114112",
				"cfinacecostcenter": 0,
				"cfinacecostcenter_code": "",
				"profitcenter": "",
				"pk_project": "2184864426185472",
				"caccountorg": "2184854309114112",
				"pk_busimemo": 2184860029718784,
				"pk_busimemo_code": "",
				"pk_busimemotype": 2184858240700672,
				"pk_busimemotype_code": "",
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": 2,
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": 6,
				"dnatexchratedate": "2021-09-26",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"napportmny": 133.74,
				"nnatapportmny": 133.74,
				"napporttaxmny": 3.87,
				"nnatapporttaxmny": 3.87,
				"napportnotaxmny": 129.87,
				"nnatapportnotaxmny": 129.87,
				"napportrate": 100,
				"_status": "Insert",
				"nwithholdingcavmny": 1,
				"nnatwithholdingcavmny": 1,
				"ncpmny": 1,
				"nnatcpmny": 1,
				"ndeferredmny": 1,
				"nnatdeferredmny": 1,
				"ncpuntaxmny": 1,
				"nnatcpuntaxmny": 1,
				"ndeferreduntaxmny": 1,
				"nnatdeferreduntaxmny": 1
			}
		],
		"expsettleinfos": [
			{
				"id": 0,
				"vbankaccount": "999999",
				"vbankaccname": "合法集资办公室",
				"pk_bankdoc": "2184878273385216",
				"pk_banktype": "2184875898393344",
				"pk_currency": "2183687327011840",
				"pk_handlepsn": "",
				"pk_handlepsnbank": "",
				"pk_cusdocbank": 2185034480177413,
				"pk_cusdocbank_code": "",
				"pk_cusdoc": 2185034480177408,
				"pk_cusdoc_code": "",
				"pk_customerbank": 0,
				"pk_customerbank_code": "",
				"pk_customer": 0,
				"pk_customer_code": "",
				"igathertype": "1",
				"pk_balatype": 2183682241614081,
				"pk_balatype_code": "",
				"balatypesrvattr": "0",
				"centerpriseorg": "2184854309114112",
				"pk_currency_opp": "2183687327011840",
				"vmemo_opp": "",
				"pk_enterprisebankacct": "2325222650122752",
				"vbankaccount_opp": "1",
				"accttype_opp": "0",
				"vbankaccname_opp": "1",
				"pk_banktype_opp": "2186830872515336",
				"pk_bankdoc_opp": "2186831417381637",
				"pk_enterprisecashacct": "",
				"vcurrency": "2183687327011840",
				"vcurrency_moneyDigit": 2,
				"vnatcurrency": "2183687327011840",
				"vnatcurrency_moneyDigit": "2",
				"vnatexchratetype": "py7y8nze",
				"vnatexchratetype_digit": 6,
				"dnatexchratedate": "2021-09-26",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"vsettlecurrency": "2183687327011840",
				"vsettlecurrency_moneyDigit": 2,
				"nsettlebaseexchrate": 1,
				"nsettleexchrate": 1,
				"nsummny": 1,
				"nsettlesummny": 1,
				"nnatsettlesummny": 1,
				"_status": "Insert",
				"centerpriseorg_caccountorg": "1624924383261229061",
				"centerpriseorg_caccountorg_name": "my费控日常"
			}
		],
		"_status": "Insert",
		"ntotalmny": 0,
		"nnattotalmny": 0,
		"ncpmny": 1,
		"ncpuntaxmny": 1,
		"ndeferredmny": 1,
		"ndeferreduntaxmny": 1,
		"nnatcpmny": 1,
		"nnatcpuntaxmny": 1,
		"nnatdeferredmny": 1,
		"nnatdeferreduntaxmny": 1,
		"ncavwithholdingmny": 0,
		"nnatcavwithholdingmny": 0,
		"expinvoicedetails": [
			{
				"pk_tallydata": "123322333",
				"vinvoicecode": "",
				"vinvoiceno": "",
				"pk_invoicetype": 0,
				"invstatus": 0,
				"pk_consumekind": 0,
				"dopendate": "2026-06-07 12:00:14",
				"nuntaxmny": 0,
				"ntaxmny": 0,
				"nothertaxmny": 0,
				"nmny": 0,
				"nexpmny": 0,
				"nservicemny": 0,
				"ncompanypaymny": 0,
				"bocrmodify": false,
				"vinvoicecurrency": "",
				"vnatcurrency": "",
				"vnatexchratetype": "",
				"dnatexchratedate": "2026-06-07 12:00:14",
				"nnatbaseexchrate": 0,
				"nnatexchrate": 0,
				"dcostdate": "2026-06-07 12:00:14",
				"dupdate": "2026-06-07 12:00:14",
				"pk_costaddr": "",
				"pk_costpsndoc": "",
				"seatgrade": 0,
				"pk_startaddr": "",
				"vcustname": "",
				"vcusttaxid": "",
				"isEleInvoice": 0,
				"collectionWay": 0,
				"vname": "",
				"vtrainnum": "",
				"vuserid": "",
				"vparentsourcesysid": "",
				"icarscenario": "",
				"pk_expenserecord": "",
				"buyerName": "",
				"buyerTaxId": "",
				"startAddr": "",
				"destAddr": "",
				"ndeductrate": 0,
				"ndeducttaxmny": 0,
				"pk_taxrate": 0,
				"nservicetaxrate": 0,
				"nservicetaxmny": 0,
				"isallowmannualmerge": false,
				"vtriprelatefield": "",
				"pk_expensetrip": "",
				"mergegroupid": "",
				"nnatuntaxmny": 0,
				"nnattaxmny": 0,
				"nnatmny": 0,
				"nnatservicemny": 0,
				"nnatdeducttaxmny": 0,
				"nnatservicetaxmny": 0,
				"nnatcompanypaymny": 0,
				"nnatexpmny": 0,
				"_status": "Insert"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| vhandledeptid | string | 否 | 报销人部门id 示例：2184856228794624 |
| chandleorg | string | 否 | 报销人组织id 示例：2184854309114112 |
| iauditdealstatus | long | 否 | 稽核处理状态(0:待处理;1:通过;2:不通过) 示例：0 |
| modifier | string | 否 | 修改人 示例：王建斌 |
| modifierId | long | 否 | 修改人id 示例：2185004199465216 |
| nshouldpaymny | BigDecimal | 否 | 应付额 示例：1 |
| pk_project | string | 否 | 项目id 示例：2184864426185472 |
| pk_cusdoc | long | 否 | 供应商id 示例：2185034480177408 |
| modifyTime | string | 否 | 修改时间 示例：2021-09-26 18:44:45 |
| pk_beginperiod | long | 否 | 摊销开始期间id 示例：2183687983141128 |
| vcurrency_moneyDigit | string | 否 | 报销币种金额精度 示例：2 |
| id | long | 否 | 报销单id 示例：2448510829252864 |
| tenant | long | 否 | 租户id 示例：2183682413744384 |
| isdeferexpense | boolean | 否 | 是否待摊(true:有待摊;false:没有待摊) 示例：true |
| vattachmentass | string | 否 | 单据附件id 示例：ktX7BO41rUX1Ya1wXsSDtxSvXAq4iiia |
| modifyDate | string | 否 | 修改日期 示例：2021-09-26 18:44:45 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：true |
| naccpaymny | BigDecimal | 否 | 累计付款总额 示例：1 |
| pk_busimemo | long | 否 | 费用项目id 示例：2184860029718784 |
| barCode | string | 否 | 条形码 示例：znbzbx_expensebill|2448510829252864 |
| nnataccpaymny | BigDecimal | 否 | 累计付款额-本币 示例：1 |
| caccountorg | string | 否 | 会计主体id 引用：会计主体 FinanceOrg 示例：2184854309114112 |
| vnatcurrency | string | 否 | 组织本币id 示例：2183687327011840 |
| ntaxmny | BigDecimal | 否 | 税额 示例：3.87 |
| nnattaxmny | BigDecimal | 否 | 可抵扣税额-本币 示例：3.87 |
| pk_handlepsn | string | 否 | 报销人id 引用：员工 Staff 示例：2185003811393792 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_expensebill |
| status | long | 否 | 单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：0 |
| ibillmakemethod | long | 否 | 填单方式(0:PC新增;1:移动新增;2:EXCEL导入) 示例：0 |
| code | string | 否 | 单据编号 示例：0298 |
| expensebillbs | object | 是 | 通用报销单子表 |
| loancavs | object | 是 | 报销单借款核销 |
| withholdingcavs | object | 是 | 报销单预提核销 |
| expapportions | object | 是 | 报销单费用分摊 |
| expsettleinfos | object | 是 | 报销单结算信息 |
| npaymentmny | BigDecimal | 否 | 付款额 示例：1 |
| creatorId | long | 否 | 创建人id 示例：2185004199465216 |
| nnatpaymentmny | BigDecimal | 否 | 付款额-本币 示例：1 |
| isoverstd | boolean | 否 | 是否超标(true:是;false:不是) 示例：false |
| vbankaccname_opp | string | 否 | 付款账户户名 示例：1 |
| accttype_opp | string | 否 | 付款账户类型 示例：0 |
| vendperiod | string | 否 | 摊销结束期间 示例：2021-10 |
| pk_busimemotype | long | 否 | 费用项目类别id 示例：2184858240700672 |
| vcurrency | string | 否 | 报销币种id 示例：2183687327011840 |
| pubts | string | 否 | 时间戳 示例：2021-09-26 18:44:45 |
| cfinaceorg | string | 否 | 费用承担组织id 示例：2184854309114112 |
| cfinacecostcenter | string | 否 | 费用承担成本中心id 示例：2184854309114112 |
| profitcenter | string | 否 | 利润中心 示例：2183687327011840 |
| ndeferexpensenum | long | 否 | 总摊销期 示例：2 |
| ismulticurrency | boolean | 否 | 是否多币种(true:是;false:不是) 示例：false |
| vreason | string | 否 | 报销说明 示例：测试 |
| iauditresult | long | 否 | 系统稽核结果(0:稽核待处理; 1:系统稽核检测通过,系统自动稽核规则--全部通过; 2:系统稽核检测柔性不通过,系统自动稽核规则--不通过的稽核规则全部都是柔性控制; 3:系统稽核检测刚性不通过,系统自动稽核规则--不通过的稽核规则存在刚性控制的; 4:财务稽核检测通过,财务初核时--稽核规则全部通过; 5:财务稽核检测柔性不通过,财务初核时--稽核规则不通过的稽核规则全部都是柔性控制; 6:财务稽核检测刚性不通过,财务初核时--稽核规则不通过的稽核规则存在刚性控制的; 7:无需稽核;) 示例：2 |
| vfinacedeptid | string | 否 | 费用承担部门id 示例：2184856228794624 |
| vbeginperiod | string | 否 | 摊销开始期间 示例：2021-09 |
| nexpensemny | BigDecimal | 否 | 不含税金额 示例：129.87 |
| bustype | string | 否 | 交易类型id 示例：2183687370051849 |
| nsummny | double | 否 | 价税合计 示例：133.74 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2021-09-26 00:00:00 |
| nnatshouldpaymny | BigDecimal | 否 | 应付额-本币 示例：1 |
| vnatexchratetype | string | 否 | 汇率类型id 示例：py7y8nze |
| nnatexpensemny | BigDecimal | 否 | 不含税总额-本币 示例：129.87 |
| nnatsummny | BigDecimal | 否 | 价税总额-本币 示例：133.74 |
| displayCode | string | 否 | 异常码 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"vhandledeptid": "2184856228794624",
		"chandleorg": "2184854309114112",
		"iauditdealstatus": 0,
		"modifier": "王建斌",
		"modifierId": 2185004199465216,
		"nshouldpaymny": 1,
		"pk_project": "2184864426185472",
		"pk_cusdoc": 2185034480177408,
		"modifyTime": "2021-09-26 18:44:45",
		"pk_beginperiod": 2183687983141128,
		"vcurrency_moneyDigit": "2",
		"id": 2448510829252864,
		"tenant": 2183682413744384,
		"isdeferexpense": true,
		"vattachmentass": "ktX7BO41rUX1Ya1wXsSDtxSvXAq4iiia",
		"modifyDate": "2021-09-26 18:44:45",
		"isWfControlled": true,
		"naccpaymny": 1,
		"pk_busimemo": 2184860029718784,
		"barCode": "znbzbx_expensebill|2448510829252864",
		"nnataccpaymny": 1,
		"caccountorg": "2184854309114112",
		"vnatcurrency": "2183687327011840",
		"ntaxmny": 3.87,
		"nnattaxmny": 3.87,
		"pk_handlepsn": "2185003811393792",
		"pk_billtype": "znbzbx_expensebill",
		"status": 0,
		"ibillmakemethod": 0,
		"code": "0298",
		"expensebillbs": [
			{
				"vhandledeptid": "2184856228794624",
				"chandleorg": "2184854309114112",
				"pk_project": "2184864426185472",
				"pk_busimemotype": 2184858240700672,
				"pk_cusdoc": 2185034480177408,
				"vcurrency": "2183687327011840",
				"pk_expensebill": 2448510829252864,
				"cfinaceorg": "2184854309114112",
				"cfinacecostcenter": "2184854309114112",
				"profitcenter": "2183687327011840",
				"vcurrency_moneyDigit": "2",
				"id": 2448510829252865,
				"tenant": 2183682413744384,
				"vfinacedeptid": "2184856228794624",
				"pk_busimemo": 2184860029718784,
				"vnatcurrency": "2183687327011840",
				"caccountorg": "2184854309114112",
				"nsummny": 1,
				"pk_memoapply": 2349147066913024,
				"dnatexchratedate": "2021-09-26 00:00:00",
				"vnatexchratetype": "py7y8nze",
				"nnatsummny": 1,
				"pk_handlepsn": "2185003811393792"
			}
		],
		"loancavs": [
			{
				"pk_loanbill": "1598409643230494726",
				"vmemo": "测试",
				"cloanfinacecostcenter": "",
				"loandate": "2022-11-24 00:00:00",
				"nloanmny": 400,
				"vloancurrency_moneyDigit": "3",
				"pk_project": "",
				"profitcenter": "",
				"pk_cusdoc": "",
				"pk_expensebill": "1619970336121421828",
				"bcav": true,
				"id": 0,
				"tenant": 2183682413744384,
				"loanno": "PLNS2211240003",
				"cloanfinaceorg": "2534724219212032",
				"nnatuncavmny": 400,
				"vloanfinacedeptid": "2534726016913664",
				"pk_busimemo": "1464090373393481736",
				"yTenantId": "0000KV7VR8GU3W81730000",
				"nnattotalcavmny": 400,
				"vnatcurrency": "2533329091532288",
				"caccountorg": "2643821317837312",
				"nnatexchrate": 1,
				"vloandeptid": "2534726016913664",
				"vnatexchratetype_digit": "6",
				"pk_loanbilltype": "znbzbx_loanbill",
				"nnatcavmny": 0,
				"vloanchandleorg": "1534545738714841092",
				"pk_loanbill_b": "1598409643230494728",
				"nnatbaseexchrate": 1,
				"nuncavmny": 400,
				"vreason": "立项红冲",
				"ncavmny": 0,
				"vnatcurrency_moneyDigit": "3",
				"nnatloanmny": 400,
				"vloancurrency": "2533329091532288",
				"pk_loanpsn": "2534726016913664",
				"ntotalcavmny": 400,
				"dnatexchratedate": "2022-12-12",
				"vnatexchratetype": "0000KWEKXNNQCPWIRL0000",
				"vnatcurrency_currTypeSign": "¥",
				"nnataccreturnmny": 0,
				"pk_memoapply": "1598397651696484358",
				"pk_memoapply_code": "GAPL2211240004",
				"pk_customer": "",
				"vloancurrency_currTypeSign": "¥",
				"nnatacccavmny": 0,
				"cloancostcenter": "",
				"pk_apct": "",
				"pk_apct_code": "",
				"pk_apct_plan": "",
				"pk_apct_plan_code": ""
			}
		],
		"withholdingcavs": [
			{
				"id": "1982026939425093652",
				"bcav": true,
				"pk_manualwithholding": "1982026939425095685",
				"pk_manualwithholding_b": "1982026939425095686",
				"vmemo": "openApi测试",
				"cwhfinacecostcenter": "",
				"nwithholdingmny": "",
				"pk_project": "2184864426185472",
				"profitcenter": "",
				"pk_cusdoc": "2185034480177408",
				"pk_expensebill": "2448510829252864",
				"tenant": 2183682413744384,
				"yTenantId": "0000KV7VR8GU3W81730000",
				"cwithholdingfinaceorg": "",
				"ncavmny": "10",
				"nnatcavmny": "10",
				"pk_manualwithholdingtype": "znbzbx_manualwithholding",
				"pk_busimemo": "2184858240700672",
				"pk_withholdingpsn": "1888518680973148165",
				"vwithholdingdeptid": "",
				"vwthdcurrency": "1810016084788513227",
				"vnatcurrency": "2183687327011840",
				"vnatexchratetype": "py7y8nze",
				"dnatexchratedate": "2024-04-24 00:00:00",
				"nnatexchrate": "1",
				"vwithholdingfinacedeptid": "",
				"vwithholdingchandleorg": "1888514385988550664",
				"caccountorg": "",
				"pk_memoapply": "2349147066913024",
				"pk_customer": "",
				"cwithholdingcostcenter": ""
			}
		],
		"expapportions": [
			{
				"cfinacecostcenter": "2183687327011840",
				"profitcenter": "2183687327011840",
				"vcurrency": "2183687327011840",
				"pk_expensebill": 2448510829252864,
				"vnatcurrency": "2183687327011840",
				"caccountorg": "2184854309114112",
				"vcurrency_moneyDigit": "2",
				"dnatexchratedate": "2021-09-26 00:00:00",
				"vnatexchratetype": "py7y8nze",
				"id": 2448510829252870,
				"tenant": 2183682413744384
			}
		],
		"expsettleinfos": [
			{
				"bjournalizing": true,
				"vcurrency": "2183687327011840",
				"pk_expensebill": 2448510829252864,
				"vnatcurrency": "2183687327011840",
				"vcurrency_moneyDigit": "2",
				"bcansettlesysmodify": true,
				"dnatexchratedate": "2021-09-26 00:00:00",
				"vnatexchratetype": "py7y8nze",
				"id": 2448510829252871,
				"tenant": 2183682413744384
			}
		],
		"npaymentmny": 1,
		"creatorId": 2185004199465216,
		"nnatpaymentmny": 1,
		"isoverstd": false,
		"vbankaccname_opp": "1",
		"accttype_opp": "0",
		"vendperiod": "2021-10",
		"pk_busimemotype": 2184858240700672,
		"vcurrency": "2183687327011840",
		"pubts": "2021-09-26 18:44:45",
		"cfinaceorg": "2184854309114112",
		"cfinacecostcenter": "2184854309114112",
		"profitcenter": "2183687327011840",
		"ndeferexpensenum": 2,
		"ismulticurrency": false,
		"vreason": "测试",
		"iauditresult": 2,
		"vfinacedeptid": "2184856228794624",
		"vbeginperiod": "2021-09",
		"nexpensemny": 129.87,
		"bustype": "2183687370051849",
		"nsummny": 133.74,
		"dnatexchratedate": "2021-09-26 00:00:00",
		"nnatshouldpaymny": 1,
		"vnatexchratetype": "py7y8nze",
		"nnatexpensemny": 129.87,
		"nnatsummny": 133.74
	},
	"displayCode": ""
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

