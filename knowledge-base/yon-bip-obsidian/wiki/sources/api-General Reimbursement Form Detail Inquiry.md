---
title: "通用报销单详情查询"
apiId: "df90f020322b486796717820e24625af"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "General Expense Report"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Expense Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 通用报销单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: General Expense Report (ZNBZ)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/znbz/rbsm/api/bill/expensebill/detail

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
| id | string | query | 否 | 单据id（单据id和单据编号二选一必填，id和编号同时存在时以billNo为准。）    示例: 2465725413724672 |
| billNo | string | query | 否 | 单据编号(单据id和单据编号二选一必填)    示例: GRRD211008000001 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/expensebill/detail?access_token=访问令牌&id=2465725413724672&billNo=GRRD211008000001

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
| vhandledeptid | string | 否 | 报销人部门id 示例：1961982461595904 |
| chandleorg | string | 否 | 报销人组织id 示例：1961970750984448 |
| pk_busimemo_name | string | 否 | 费用项目名称 示例：办公用品购置无申请 |
| pk_busimemotype_name | string | 否 | 费用项目类型 示例：办公类 |
| caccountorg_name | string | 否 | 会计主体名称 引用：会计主体 FinanceOrg 示例：厦门烟草工业有限责任任公司 |
| masterOrgKeyField | string | 否 | 主组织字段名 示例：cfinaceorg |
| bustype_name | string | 否 | 报销交易类型名称 示例：通用报销单 |
| chandlecostcenter_name | string | 否 | 成本中心名称 示例：fj行政部厦烟 |
| modifier | string | 否 | 修改人名称 示例：黄东发 |
| expsettleinfos | object | 是 | 报销单结算信息 |
| modifierId | long | 否 | 修改人id 示例：1987089360785664 |
| irejectstatus | short | 否 | 驳回状态(0:正常;1:驳回） 示例：0 |
| nshouldpaymny | BigDecimal | 否 | 应付金额 示例：1 |
| pk_cusdoc | long | 否 | 供应商id 示例：1996833735758080 |
| chandlecostcenter | long | 否 | 经办人成本中心id 示例：2434690750747136 |
| modifyTime | string | 否 | 修改时间 示例：2021-10-09 10:12:15 |
| vcurrency_moneyDigit | int | 否 | 币种精度 示例：2 |
| vcurrency_name | string | 否 | 报销币种 示例：人民币-1 |
| id | long | 否 | 报销单id 示例：2465725413724672 |
| ishaveloanbill | boolean | 否 | 是否有借款(true:有借款;false:没有借款) 示例：false |
| isdeferexpense | boolean | 否 | 是否待摊(true:有待摊;false:没有待摊) 示例：false |
| vattachmentass | string | 否 | 单据附件id 示例：T3YGphdXzA9WKcBhyqLxB3neJu9546WE |
| modifyDate | string | 否 | 修改日期 示例：2021-10-09 00:00:00 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：true |
| vcurrency_currTypeSign | string | 否 | 报销币种货币符号 示例：￥ |
| isfinished | boolean | 否 | 是否结束(true:结束;false:未结束) 示例：false |
| naccpaymny | BigDecimal | 否 | 累计付款额 示例：1 |
| dcostdate | string | 否 | 发生日期 示例：2021-10-08 00:00:00 |
| pk_busimemo | long | 否 | 费用项目id 示例：1989860593196544 |
| barCode | string | 否 | 条形码 示例：znbzbx_expensebill|2465725413724672 |
| auditorId | long | 否 | 审批人id 示例：1987089360785664 |
| cfinacecostcenter | long | 否 | 费用承担成本中心id 示例：2434690750747136 |
| profitcenter | string | 否 | 利润中心id 示例：2434690750747136 |
| profitcenter_name | string | 否 | 利润中心 示例：福建利润 |
| pk_cusdoc_name | string | 否 | 供应商名称 示例：福建供应商A |
| nnataccpaymny | BigDecimal | 否 | 累计付款额-本币 示例：1 |
| caccountorg | long | 否 | 会计主体id 示例：1961973740130560 |
| vnatcurrency | string | 否 | 组织本币id 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| auditTime | string | 否 | 审批时间 示例：2022-08-25 15:28:30 |
| nnatexchrate | BigDecimal | 否 | 汇率 示例：1 |
| pk_handlepsn | long | 否 | 报销人id 示例：1987089356869888 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_expensebill |
| status | short | 否 | 单据状态, 0:未审核、1:已审核、2:已关闭、3:审核中、 示例：0 |
| returncount | int | 否 | 退回次数 示例：0 |
| verifystate | short | 否 | 审批状态, 1:已审批、2:未审批、 示例：0 |
| code | string | 否 | 单据号 示例：GRRD211008000001 |
| ibillmakemethod | short | 否 | 填单方式(0:PC新增;1:移动新增;2:EXCEL导入) 示例：0 |
| vnatexchratetype_digit | int | 否 | 汇率精度 示例：7 |
| pk_handlepsn_name | string | 否 | 报销人 引用：员工 Staff 示例：黄东发 |
| expapportions | object | 是 | 报销单费用分摊集合 |
| npaymentmny | BigDecimal | 否 | 付款总额 示例：1 |
| isoverstd | boolean | 否 | 是否超标(true:是;false:不是) 示例：false |
| nnatpaymentmny | BigDecimal | 否 | 付款总额-本币 示例：1 |
| ibudgetexectype | short | 否 | 占用类型(0:预占;1:执行;9:不传预算) 示例：1 |
| creatorId | long | 否 | 创建人id 示例：1987089360785664 |
| chandleorg_name | string | 否 | 报销人组织 示例：福建中烟工业有限责任公司 |
| pk_busimemotype | long | 否 | 费用项目类别id 示例：1989856226205184 |
| vcurrency | string | 否 | 借款币种id 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| vouchdate | string | 否 | 单据日期 示例：2021-10-08 00:00:00 |
| cfinaceorg | long | 否 | 费用承担组织id 示例：1961970750984448 |
| isettlestatus | short | 否 | 结算状态,0:待结算、1:结算中、2:结算成功、3:结算止付、4:结算部分成功、5:无需结算、 示例：0 |
| vnatcurrency_name | string | 否 | 组织本币 示例：人民币-1 |
| nnatbaseexchrate | BigDecimal | 否 | 基准汇率 示例：1 |
| ismulticurrency | boolean | 否 | 是否多币种(true:是;false:不是) 示例：false |
| iswithholdingcav | boolean | 否 | 是否手工预提冲销(true:是手工;false:不是手工) 示例：false |
| pubts | string | 否 | 时间戳 示例：2021-10-09 10:12:15 |
| vreason | string | 否 | 报销原因 示例：0722这是一个默认值 |
| createDate | string | 否 | 创建日期 示例：2021-10-08 00:00:00 |
| auditDate | string | 否 | 审批日期 示例：2022-08-25 00:00:00 |
| vfinacedeptid_name | string | 否 | 费用承担部门 示例：行政部-福建中烟 |
| creator | string | 否 | 创建人 示例：黄东发 |
| iauditresult | short | 否 | 系统稽核结果,0:稽核待处理、1:系统稽核检测通过、2:系统稽核检测柔性不通过、3:系统稽核检测刚性不通过、4:财务稽核检测通过、5:财务稽核检测柔性不通过、6:财务稽核检测刚性不通过、7:无需稽核 示例：0 |
| vfinacedeptid | long | 否 | 费用承担部门id 示例：1961982461595904 |
| vnatcurrency_moneyDigit | int | 否 | 组织本币金额精度 示例：2 |
| cfinacecostcenter_name | string | 否 | 费用承担成本中心名称 示例：fj行政部厦烟 |
| auditor | string | 否 | 审批人 引用：身份信息 User 示例：黄东发 |
| expensebillbs | object | 是 | 报销单明细信息 |
| nexpensemny | BigDecimal | 否 | 报销总额 示例：1 |
| transTypeKeyField | string | 否 | 交易类型字段名 示例：bustype |
| bustype | long | 否 | 交易类型id 示例：2084943198900480 |
| vnatexchratetype_name | string | 否 | 汇率类型 示例：基准汇率 |
| cfinaceorg_name | string | 否 | 费用承担组织 示例：福建中烟工业有限责任公司 |
| nsummny | BigDecimal | 否 | 报销价税总额 示例：1 |
| createTime | string | 否 | 创建时间 示例：2021-10-08 20:25:36 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2021-10-08 00:00:00 |
| nnatshouldpaymny | BigDecimal | 否 | 应付总额-本币 示例：1 |
| vnatexchratetype | string | 否 | 汇率类型id 示例：xtikzjvp |
| nnatexpensemny | BigDecimal | 否 | 报销总额-本币 示例：1 |
| vnatcurrency_currTypeSign | string | 否 | 组织本币货币符号 示例：￥ |
| vhandledeptid_name | string | 否 | 报销人部门 示例：行政部-福建中烟 |
| nnatsummny | BigDecimal | 否 | 报销价税合计-本币 示例：1 |

## 5. 正确返回示例

{
	"displayCode": "",
	"code": "200",
	"message": "操作成功",
	"data": {
		"vhandledeptid": "1961982461595904",
		"chandleorg": "1961970750984448",
		"pk_busimemo_name": "办公用品购置无申请",
		"pk_busimemotype_name": "办公类",
		"caccountorg_name": "厦门烟草工业有限责任任公司",
		"masterOrgKeyField": "cfinaceorg",
		"bustype_name": "通用报销单",
		"chandlecostcenter_name": "fj行政部厦烟",
		"modifier": "黄东发",
		"expsettleinfos": [
			{
				"vbankaccname": "11223344",
				"pk_currency_opp": "G001ZM0000DEFAULTCURRENCT00000000001",
				"vbanktypename": "MC银行",
				"pk_bankdoc": "ff5a879aa02f4ffcbc4f00f3071aced2",
				"vsettlecurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"pk_cusdoc": 1996833735758080,
				"nsettlebaseexchrate": 1,
				"iaraptype": 0,
				"pk_expensebill": 2465725413724672,
				"nsettlesummny": 1,
				"vbankdocname": "MC银行网点",
				"ipaystartpoint": 1,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币-1",
				"nlineno": 10,
				"pk_cusdocbank": 2003619217314048,
				"bcansettlesysmodify": true,
				"vbankaccname_opp": "厦门开户名1",
				"id": 2465725413724675,
				"vsettlecurrency_currTypeSign": "￥",
				"pk_balatype": 1951599879852298,
				"vbankaccount": "供应商A默认-招商银行账号",
				"pk_currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"balatypesrvattr": 0,
				"nsettleexchrate": 1,
				"bjournalizing": true,
				"vcurrency_currTypeSign": "￥",
				"accttype": 0,
				"vbanktypename_opp": "中国工商银行22222",
				"nnatsettlesummny": 1,
				"pk_cusdoc_name": "福建供应商A",
				"vsettlecurrency_moneyDigit": 2,
				"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"pk_balatype_name": "银行转账",
				"vsettlecurrency_name": "人民币-1",
				"nnatexchrate": 1,
				"pk_currency_opp_name": "人民币-1",
				"pk_bankdoc_opp": "2028068467397888",
				"vnatexchratetype_digit": 7,
				"pk_enterprisebankacct": 2066500686730496,
				"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"isettlestatus": 0,
				"vnatcurrency_name": "人民币-1",
				"nnatbaseexchrate": 1,
				"pk_currency_name": "人民币-1",
				"pubts": "2021-10-08 20:25:37",
				"vbankaccount_opp": "xm1234568789",
				"pk_banktype": "7b35ad8d263a488a86816775ae33234e",
				"accttype_opp": 0,
				"vnatcurrency_moneyDigit": 2,
				"settleform": 0,
				"vnatexchratetype_name": "基准汇率",
				"igathertype": 1,
				"vbankdocname_opp": "中国工商银行股份有限公司天津中北支行22222",
				"pk_banktype_opp": "2028068410757632",
				"nsummny": 1,
				"dnatexchratedate": "2021-10-08 00:00:00",
				"vnatexchratetype": "xtikzjvp",
				"centerpriseorg": 1961973740130560,
				"vnatcurrency_currTypeSign": "￥",
				"centerpriseorg_name": "厦门烟草工业有限责任任公司",
				"centerpriseorg_caccountorg": "1624924383261229061",
				"centerpriseorg_caccountorg_name": "my费控日常"
			}
		],
		"modifierId": 1987089360785664,
		"irejectstatus": 0,
		"nshouldpaymny": 1,
		"pk_cusdoc": 1996833735758080,
		"chandlecostcenter": 2434690750747136,
		"modifyTime": "2021-10-09 10:12:15",
		"vcurrency_moneyDigit": 2,
		"vcurrency_name": "人民币-1",
		"id": 2465725413724672,
		"ishaveloanbill": false,
		"isdeferexpense": false,
		"vattachmentass": "T3YGphdXzA9WKcBhyqLxB3neJu9546WE",
		"modifyDate": "2021-10-09 00:00:00",
		"isWfControlled": true,
		"vcurrency_currTypeSign": "￥",
		"isfinished": false,
		"naccpaymny": 1,
		"dcostdate": "2021-10-08 00:00:00",
		"pk_busimemo": 1989860593196544,
		"barCode": "znbzbx_expensebill|2465725413724672",
		"auditorId": 1987089360785664,
		"cfinacecostcenter": 2434690750747136,
		"profitcenter": "2434690750747136",
		"profitcenter_name": "福建利润",
		"pk_cusdoc_name": "福建供应商A",
		"nnataccpaymny": 1,
		"caccountorg": 1961973740130560,
		"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"auditTime": "2022-08-25 15:28:30",
		"nnatexchrate": 1,
		"pk_handlepsn": 1987089356869888,
		"pk_billtype": "znbzbx_expensebill",
		"status": 0,
		"returncount": 0,
		"verifystate": 0,
		"code": "GRRD211008000001",
		"ibillmakemethod": 0,
		"vnatexchratetype_digit": 7,
		"pk_handlepsn_name": "黄东发",
		"expapportions": [
			{
				"pk_busimemo_name": "办公用品购置无申请",
				"pk_busimemotype_name": "办公类",
				"vnatexchratetype_digit": 7,
				"caccountorg_name": "厦门烟草工业有限责任任公司",
				"pk_busimemotype": 1989856226205184,
				"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"pk_expensebill": 2465725413724672,
				"cfinaceorg": 1961970750984448,
				"nnatapportmny": 1,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币-1",
				"nlineno": 10,
				"vnatcurrency_name": "人民币-1",
				"napporttaxmny": 0,
				"nnatbaseexchrate": 1,
				"id": 2465725413724674,
				"pubts": "2021-10-08 20:25:37",
				"napportnotaxmny": 1,
				"vfinacedeptid_name": "行政部-福建中烟",
				"vfinacedeptid": 1961982461595904,
				"vnatcurrency_moneyDigit": 2,
				"cfinacecostcenter_name": "fj行政部厦烟",
				"vcurrency_currTypeSign": "￥",
				"pk_busimemo": 1989860593196544,
				"vnatexchratetype_name": "基准汇率",
				"cfinacecostcenter": 2434690750747136,
				"profitcenter": "2434690750747136",
				"profitcenter_name": "福建中烟工业有限责任公司",
				"nnatapporttaxmny": 0,
				"cfinaceorg_name": "福建中烟工业有限责任公司",
				"caccountorg": 1961973740130560,
				"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"dnatexchratedate": "2021-10-08 00:00:00",
				"vnatexchratetype": "xtikzjvp",
				"nnatapportnotaxmny": 1,
				"napportmny": 1,
				"nnatexchrate": 1,
				"vnatcurrency_currTypeSign": "￥",
				"napportrate": 100
			}
		],
		"npaymentmny": 1,
		"isoverstd": false,
		"nnatpaymentmny": 1,
		"ibudgetexectype": 1,
		"creatorId": 1987089360785664,
		"chandleorg_name": "福建中烟工业有限责任公司",
		"pk_busimemotype": 1989856226205184,
		"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"vouchdate": "2021-10-08 00:00:00",
		"cfinaceorg": 1961970750984448,
		"isettlestatus": 0,
		"vnatcurrency_name": "人民币-1",
		"nnatbaseexchrate": 1,
		"ismulticurrency": false,
		"iswithholdingcav": false,
		"pubts": "2021-10-09 10:12:15",
		"vreason": "0722这是一个默认值",
		"createDate": "2021-10-08 00:00:00",
		"auditDate": "2022-08-25 00:00:00",
		"vfinacedeptid_name": "行政部-福建中烟",
		"creator": "黄东发",
		"iauditresult": 0,
		"vfinacedeptid": 1961982461595904,
		"vnatcurrency_moneyDigit": 2,
		"cfinacecostcenter_name": "fj行政部厦烟",
		"auditor": "黄东发",
		"expensebillbs": [
			{
				"vhandledeptid": 1961982461595904,
				"chandleorg": 1961970750984448,
				"vmemo": "这是默认值",
				"pk_busimemo_name": "办公用品购置无申请",
				"pk_busimemotype_name": "办公类",
				"caccountorg_name": "厦门烟草工业有限责任任公司",
				"chandlecostcenter_name": "fj行政部厦烟",
				"nshouldpaymny": 1,
				"pk_cusdoc": 1996833735758080,
				"chandlecostcenter": 2434690750747136,
				"pk_expensebill": 2465725413724672,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币-1",
				"nlineno": 10,
				"id": 2465725413724673,
				"vcurrency_currTypeSign": "￥",
				"isfinished": false,
				"naccpaymny": 1,
				"pk_busimemo": 1989860593196544,
				"cfinacecostcenter": 2434690750747136,
				"profitcenter": "2434690750747136",
				"profitcenter_name": "福建利润中心",
				"pk_cusdoc_name": "福建供应商A",
				"nnataccpaymny": 1,
				"caccountorg": 1961973740130560,
				"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"nnatexchrate": 1,
				"pk_handlepsn": 1987089356869888,
				"vnatexchratetype_digit": 7,
				"pk_handlepsn_name": "黄东发",
				"npaymentmny": 1,
				"nnatpaymentmny": 1,
				"chandleorg_name": "福建中烟工业有限责任公司",
				"pk_busimemotype": 1989856226205184,
				"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"cfinaceorg": 1961970750984448,
				"vnatcurrency_name": "人民币-1",
				"nnatbaseexchrate": 1,
				"pubts": "2021-10-08 20:25:37",
				"vfinacedeptid_name": "行政部-福建中烟",
				"vfinacedeptid": 1961982461595904,
				"vnatcurrency_moneyDigit": 2,
				"cfinacecostcenter_name": "fj行政部厦烟",
				"nexpensemny": 1,
				"vnatexchratetype_name": "基准汇率",
				"cfinaceorg_name": "福建中烟工业有限责任公司",
				"nsummny": 1,
				"dnatexchratedate": "2021-10-08 00:00:00",
				"nnatshouldpaymny": 1,
				"vnatexchratetype": "xtikzjvp",
				"nnatexpensemny": 1,
				"vnatcurrency_currTypeSign": "￥",
				"vhandledeptid_name": "行政部-福建中烟",
				"nnatsummny": 1
			}
		],
		"nexpensemny": 1,
		"transTypeKeyField": "bustype",
		"bustype": 2084943198900480,
		"vnatexchratetype_name": "基准汇率",
		"cfinaceorg_name": "福建中烟工业有限责任公司",
		"nsummny": 1,
		"createTime": "2021-10-08 20:25:36",
		"dnatexchratedate": "2021-10-08 00:00:00",
		"nnatshouldpaymny": 1,
		"vnatexchratetype": "xtikzjvp",
		"nnatexpensemny": 1,
		"vnatcurrency_currTypeSign": "￥",
		"vhandledeptid_name": "行政部-福建中烟",
		"nnatsummny": 1
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

