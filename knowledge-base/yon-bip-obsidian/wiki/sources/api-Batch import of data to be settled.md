---
title: "待结算数据批量导入"
apiId: "1483919790890811397"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Data Pending Settlement"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Data Pending Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 待结算数据批量导入

> `ContentType	application/json` 请求方式	POST | 分类: Data Pending Settlement (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/datasettled/recdatasettledBatch

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 数据 |
| wdataOrigin | string | 否 | 是 | 数据来源，目前仅支持第三方导入 示例：20 默认值：20 |
| billRangeStart | string | 否 | 否 | 子票开始区间 |
| billRangeEnd | string | 否 | 否 | 子票结束区间 |
| isSubcontract | short | 否 | 否 | 是否分包流转：0：否，1：是(当子票区间开始和子票区间结束同时不为空时，此字段必填) |
| isOpenNote | short | 否 | 否 | 是否票号可修改：0：否，1：是(当票证号不为空时，此字段不可为是) |
| bankTicket | short | 否 | 否 | 银企连电票：0：否，1：是(当子票区间开始和子票区间结束同时不为空时，此字段必填) |
| publicPrivate | short | 否 | 否 | 对公对私：2：对公，1：对私当对方类型为其他，上游传递此值为空时，默认为对公。当对方类型为客户、供应商、员工、资金业务对象时，不接入此值 |
| oribilldate | string | 否 | 是 | 原单据日期 示例：2022-05-02 |
| recpaytype | string | 否 | 是 | 收付类型 收款1 付款 2 示例：1 |
| expectPayDate | string | 否 | 否 | 期望日期 示例：2022-06-02 |
| oricurrency_code | string | 否 | 否 | 原币币种编码（原币币种id和编码二选一必填，同时填入时以id为准） 示例：USD |
| oricurrency | string | 否 | 否 | 原币币种id（原币币种id和编码二选一必填，同时填入时以id为准） 示例：2163654411440900 |
| oriCurrencyAmount | BigDecimal | 否 | 是 | 原币金额 示例：123.23 |
| natcurrency_code | string | 否 | 否 | 本币币种编码（本币币种id和编码二选一必填，同时填入时以id为准） 示例：CNY |
| natcurrency | string | 否 | 否 | 本币币种id（本币币种id和编码二选一必填，同时填入时以id为准） 示例：2163654411424512 |
| tradeType_code | string | 否 | 否 | 交易类型编码（交易类型id和编码同时输入时以id为准） 示例：cmp_fundcollection_general |
| tradeType | string | 否 | 否 | 交易类型id（交易类型id和编码同时输入时以id为准） 示例：2571646385967872 |
| businessBillType | string | 否 | 是 | 业务单据类型；转账付款单 0,转账收款单 1,通用报销单 2,退款单 3,其他收款单 6,收款单 7,其他单笔付款单 8,其他批量付款单 9,付款单 10,差旅费报销单 11,对公预付单 12,还款单 13,个人借款单 14,薪资支付单 15,代理付款单 16,代理收款单 17, 融入单 18, 还本单19,付息单 20,申购单21,赎回单22,收息单 23,资金收款单25,资金付款单26,收款退款单27,付款退款单 28,项目付款单29,资金调度归集付款单 101,资金调度归集收款单 102,资金调度下拨付款单 106,资金调度下拨收款单 107,资金调度调拨付款单 109,资金调度调拨收款单 110 示例：25 |
| businessBillNum | string | 否 | 是 | 第三方业务单据编号 示例：test01 |
| businessId | string | 否 | 是 | 第三方业务单据id 示例：996 |
| businessdetailsid | string | 否 | 是 | 第三方业务单据明细id+来源系统+单据类型需要唯一 示例：test01 |
| issettlementcanmodified | string | 否 | 是 | 是否结算方式可修改 是 1 否 0 示例：0 |
| issplit | string | 否 | 是 | 是否可拆分结算 否 0 是 1 示例：0 |
| ismerge | string | 否 | 是 | 是否可合并结算 否 0 是 1 示例：0 |
| isjournalregistered | string | 否 | 是 | 是否登记日记账 是1 否 0 示例：1 |
| expectsettlemethod_code | string | 否 | 否 | 期望结算方式编码（期望结算方式id和编码二选一必填，同时填入时以id为准） 示例：0001 |
| expectsettlemethod | string | 否 | 否 | 期望结算方式id（期望结算方式id和编码二选一必填，同时填入时以id为准） 示例：2197839981252864 |
| noteno | string | 否 | 否 | 票据号：票据号：期望结算方式为银行转账/现金/支票时：非必填期望结算方式的业务属性为“票据业务”：必填 |
| notenoid | string | 否 | 否 | 票据号id 示例：2197839981252864 |
| receiptDirect | string | 否 | 否 | 票证方向：1：收，2：付。票据号或票据号id不为空时必填 |
| notenoAmount | BigDecimal | 否 | 否 | 票据金额 |
| issinglebatch | string | 否 | 是 | 单笔/批量 只支持单笔 0 示例：0 |
| remark | string | 否 | 否 | 备注 示例：待结算备注 |
| toAccntType | string | 否 | 是 | 对方类型 客户 1 供应商 2 员工 3 其他 4 资金业务对象 5 内部单位 6 示例：4 |
| counterpartyid | string | 否 | 否 | 对方类型为1,2,3,5,6时，对应客户档案，供应商档案，人员档案，资金业务对象档案,资金组织档案的id,与counterpartyid_code二选一必填 |
| counterpartyid_code | string | 否 | 否 | 对方类型为1,2,3,5,6时，对应客户档案，供应商档案，人员档案，资金业务对象档案,资金组织档案的编码,与counterpartyid二选一必填 |
| accountNo | string | 否 | 否 | 对方银行账号，对方类型为1,2,3,5,6时必填，对应客户，供应商，人员,资金业务对象,内部单位的银行账号 |
| accountName | string | 否 | 否 | 对方银行账户名，填入时会根据对方银行账号+对方银行账户名的组合来确定对方银行信息 |
| showtoaccntname | string | 否 | 否 | 对方名称 |
| enterpriseBankAccount_code | string | 否 | 否 | 本方银行账号编码（结算方式是银行属性时，本方银行账号id和编码二选一必填，同时填入时以id为准） 示例：02280001 |
| enterpriseBankAccount | string | 否 | 否 | 本方银行账号id（结算方式是银行属性时，本方银行账号id和编码二选一必填，同时填入时以id为准） 示例：2667829984367616 |
| cashaccount_code | string | 否 | 否 | 本方现金账号编码（结算方式是现金属性时，本方现金账号id和编码二选一必填，同时填入时以id为准） |
| cashaccount | string | 否 | 否 | 本方现金账号id（结算方式是现金属性时，本方现金账号id和编码二选一必填，同时填入时以id为准） |
| showoppositebankaccount | string | 否 | 否 | 对方银行账号：对方类型为4时必填 示例：2667829984367616 |
| showoppositebankaccountname | string | 否 | 否 | 对方账户名称：对方类型为4时必填 |
| showoppositebankname | string | 否 | 否 | 对方开户行：对方类型为4时必填 |
| showoppositebanklineno | string | 否 | 否 | 对方开户行联行号：对方类型为4时必填 |
| oppositeBankTypeName | string | 否 | 否 | 对方银行类别：对方类型为4时必填 |
| openwsettlestatus | string | 否 | 是 | 来源数据结算状态 一般结算 0 自动结算 1 已结算补单 2 说明：0一般结算，用户需要手工新增资金结算单并引用带结算数据，并进行后续结算流程；1 自动结算，系统自动生成资金结算单，并完成后续的结算处理流程；2 已结算补单，系统自动生成已结算状态的资金结算单 示例：2 |
| isRelateCheckBill | string | 否 | 否 | 是否关联对账单 是 1 否 0 示例：0 |
| linkpayment | string | 否 | 否 | 是否联动支付 是 1 否 0 示例：0 |
| isGenerateVoucher | string | 否 | 否 | 是否生成结算凭证 是 1 否 0 示例：0 |
| externaloutdefine1 | string | 否 | 是 | 外部系统自定义字段 填1才会插入数据，传其他值只会校验 示例：1 |
| csplBizCode | string | 否 | 否 | 资金计划业务对照编码 示例：CZ0071 |
| csplProject | string | 否 | 否 | 资金计划项目ID（计划编制子表ID） 示例：2489422280233216 |
| csplSummaryDetail | string | 否 | 否 | 资金计划明细主键ID 示例：17578458575545435 |
| capBizObjType | string | 否 | 否 | 资金业务对象类型ID（资金业务对象子表ID） 对方类型为资金业务对象时，且不是已结算补单时必填 示例：2768748778754586 |
| relateBankCheckBillId | string | 否 | 否 | 关联银行对账单id 当是否关联对账单为“是”时，它和关联认领单id有且只有一个必填 示例：2788541416116736 |
| relateClaimBillId | string | 否 | 否 | 关联认领单id 当是否关联对账单为“是”时，它和关联银行对账单id有且只有一个必填 示例：2791341820678400 |
| serialNumber | string | 否 | 否 | 流水号 示例：1483943928598102022seri |
| paySettlementMode | string | 否 | 否 | 付款结算模式 主动结算1 对方付款2 示例：1 |
| oppAccType | string | 否 | 否 | 对方账户类型（现金=2，银行=3，虚拟=4） 为空时取银行） 示例：2 |
| checkIdentificationCode | string | 否 | 否 | 财资统一对账码 示例：2791355757138176 |
| accentity_code | string | 否 | 否 | 资金组织编码（资金组织id和编码二选一必填，同时填入时以id为准） 示例：20010 |
| accentity | string | 否 | 否 | 资金组织id（资金组织id和编码二选一必填，同时填入时以id为准） 示例：2185325490639872 |
| isdirectacc | boolean | 否 | 否 | 是否直连支付 示例：false |
| innerNoteAccount_code | string | 否 | 否 | 内部票据账户 示例：02280001 |
| dataSettledCrossBorder | object | 否 | 否 | 待结算数据跨境信息 |
| dept_code | string | 否 | 否 | 部门编码 |
| dept | string | 否 | 否 | 部门id |

## 3. 请求示例

Url: /yonbip/ctm/api/datasettled/recdatasettledBatch?access_token=访问令牌
Body: {
	"data": [
		{
			"wdataOrigin": "20",
			"billRangeStart": "",
			"billRangeEnd": "",
			"isSubcontract": 0,
			"isOpenNote": 0,
			"bankTicket": 0,
			"publicPrivate": 0,
			"oribilldate": "2022-05-02",
			"recpaytype": "1",
			"expectPayDate": "2022-06-02",
			"oricurrency_code": "USD",
			"oricurrency": "2163654411440900",
			"oriCurrencyAmount": 123.23,
			"natcurrency_code": "CNY",
			"natcurrency": "2163654411424512",
			"tradeType_code": "cmp_fundcollection_general",
			"tradeType": "2571646385967872",
			"businessBillType": "25",
			"businessBillNum": "test01",
			"businessId": "996",
			"businessdetailsid": "test01",
			"issettlementcanmodified": "0",
			"issplit": "0",
			"ismerge": "0",
			"isjournalregistered": "1",
			"expectsettlemethod_code": "0001",
			"expectsettlemethod": "2197839981252864",
			"noteno": "",
			"notenoid": "2197839981252864",
			"receiptDirect": "",
			"notenoAmount": 0,
			"issinglebatch": "0",
			"remark": "待结算备注",
			"toAccntType": "4",
			"counterpartyid": "",
			"counterpartyid_code": "",
			"accountNo": "",
			"accountName": "",
			"showtoaccntname": "",
			"enterpriseBankAccount_code": "02280001",
			"enterpriseBankAccount": "2667829984367616",
			"cashaccount_code": "",
			"cashaccount": "",
			"showoppositebankaccount": "2667829984367616",
			"showoppositebankaccountname": "",
			"showoppositebankname": "",
			"showoppositebanklineno": "",
			"oppositeBankTypeName": "",
			"openwsettlestatus": "2",
			"isRelateCheckBill": "0",
			"linkpayment": "0",
			"isGenerateVoucher": "0",
			"externaloutdefine1": "1",
			"csplBizCode": "CZ0071",
			"csplProject": "2489422280233216",
			"csplSummaryDetail": "17578458575545435",
			"capBizObjType": "2768748778754586",
			"relateBankCheckBillId": "2788541416116736",
			"relateClaimBillId": "2791341820678400",
			"serialNumber": "1483943928598102022seri",
			"paySettlementMode": "1",
			"oppAccType": "2",
			"checkIdentificationCode": "2791355757138176",
			"accentity_code": "20010",
			"accentity": "2185325490639872",
			"isdirectacc": false,
			"innerNoteAccount_code": "02280001",
			"dataSettledCrossBorder": {
				"recbankswift": "字符串类型",
				"paybankcountry": "",
				"recbankcountry": "对应国家档案的主键",
				"reccity": "对应城市档案的主键",
				"recaddress": "字符串类型",
				"recaccountnamenoncn": "",
				"recbanknamenoncn": "",
				"recbankaddressnoncn": "",
				"receivercountry": "对应国家档案的主键",
				"urgentFlag": "H\tHigh(快),L\tLow(慢),N\tNormal(正常)",
				"paymenttype": "A\t预付货款 C\t信用卡支付 F\t资金转移 H\t分期付款 L\t贷款支付 O\t其他 P\t货到付款 R\t退款 S\t信贷资金支付 T\t非信贷资金支付",
				"paymentnature": "保税区\tA, 出口加工区\tB, 钻石交易所\tC, 其他特殊经济区域\tD, 深加工结转\tE, 经常项目贸易\tF, 经常项目非贸易\tG, 资本项目\tH, 代理进口\tI, 其他(默认)\tJ, 保税监管区域\tK, 离岸账户\tL",
				"remittancepurpose": "货物运输费\tC0, 货款\tC1    , 货物运输费\tC2, 运营服务租赁费\tC3, 旅费(个人/商务)\tC4, 通讯服务\tC5, 电子设备的建设及安装\tC6, 保险类服务\tC7, 金融类服务\tC8, 电脑资讯服务\tC9, 特许费(涉及版权、专利权等)\tCA, 进出口贸易\tCB, 行政管理费\tCC, 研发费(研究及发展)\tCD, 建筑设计、工程和其他技术方面的服务费\tCE, 农业、采矿业、实地加工业服务费\tCF, 商务服务费\tCG, 律师费\tCH    , 会计费\tCI    , 管理咨询服务费\tCJ,",
				"isagencybank": NaN,
				"agencybankaccount": "",
				"agencybankname": "",
				"agencybankaddress": "",
				"agencybankcountry": "对应国家档案的主键",
				"agencybankswift": "",
				"bankexpense": "",
				"chargingmethod": "BEN\t收款人,OUR\t汇款人,SHA\t共同",
				"chargingbankaccount": "对应企业银行账户档案主键",
				"foreignchargingbankaccount": "对应企业银行账户档案主键",
				"isbondedgoodspay": NaN,
				"contractnumber": "",
				"invoicenumber": "",
				"exchangeratecontract": "",
				"extendscript": "",
				"usercomment": "",
				"fileinfo": "",
				"appliername": "",
				"appliercontactinfo": "",
				"transactioncodeA": "",
				"transactioncurrencyA": "对应币种档案主键",
				"transactionamountA": "",
				"tradepostscriptA": "",
				"transactioncodeB": "",
				"transactioncurrencyB": "",
				"transactionamountB": "",
				"tradepostscriptB": "",
				"organizationCode": "",
				"recPerCountryCode": "",
				"OriDeclarationNum": "",
				"remitAddress": "",
				"capitalSource": "",
				"ncPayBankAccName": "",
				"regionNo": ""
			},
			"dept_code": "",
			"dept": ""
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 是 | 数据 |
| wdataOrigin | string | 否 | 数据来源 示例：20 |
| accentity | string | 否 | 资金组织id 示例：2185325490639872 |
| businessbilltype | string | 否 | 业务单据类型；转账付款单 0,转账收款单 1,通用报销单 2,退款单 3,其他收款单 6,收款单 7,其他单笔付款单 8,其他批量付款单 9,付款单 10,差旅费报销单 11,对公预付单 12,还款单 13,个人借款单 14,薪资支付单 15,代理付款单 16,代理收款单 17, 融入单 18, 还本单19,付息单 20,申购单21,赎回单22,收息单 23,资金收款单25,资金付款单26,收款退款单27,付款退款单 28,项目付款单29,资金调度归集付款单 101,资金调度归集收款单 102,资金调度下拨付款单 106,资金调度下拨收款单 107,资金调度调拨付款单 109,资金调度调拨收款单 110 示例：25 |
| businessbillnum | string | 否 | 业务单据编号 示例：test01 |
| businessId | string | 否 | 业务单据id 示例：996 |
| businessdetailsid | string | 否 | 业务单据明细id 示例：test01 |
| tradetype | string | 否 | 交易类型id 示例：2571646385967872 |
| recpaytype | string | 否 | 收付类型 收款1 付款 2 示例：1 |
| oribilldate | string | 否 | 原单据日期 示例：2022-05-02 00:00:00 |
| oricurrency | string | 否 | 原币币种 示例：2163654411440900 |
| oricurrencyamount | double | 否 | 原币金额 示例：123.23 |
| natcurrency | string | 否 | 本币币种 示例：2163654411440900 |
| exchangerate | double | 否 | 汇率 示例：1 |
| natSum | double | 否 | 本币金额 示例：123.23 |
| issinglebatch | string | 否 | 单笔/批量 单笔 0 批量 1 示例：0 |
| expectpaydate | string | 否 | 期望日期 示例：2022-06-02 00:00:00 |
| toaccnttype | string | 否 | 对方类型 客户 1 供应商 2 人员 3 其他 4 示例：4 |
| showtoaccntname | string | 否 | 对方名称 示例：企业网银新20161097 |
| counterpartybankaccount | string | 否 | 对方银行账号 示例：2667829984367616 |
| showoppositebankaccount | string | 否 | 对方银行账户 示例：755915680910511 |
| showoppositebankaccountname | string | 否 | 对方账户名称 示例：企业网银新20161097 |
| showoppositebankname | string | 否 | 对方账户开户行名称 示例：招商银行深圳分行 |
| showoppositebanklineno | string | 否 | 对方账户开户行 示例：308584001016 |
| expectsettlemethod | long | 否 | 期望结算方式id 示例：2197839981252864 |
| enterpriseBankAccount | string | 否 | 本方银行账号id 示例：2667829984367616 |
| openwsettlestatus | string | 否 | 来源数据结算状态 一般结算 0 自动结算 1 已结算补单 2 示例：2 |
| issettlementcanmodified | string | 否 | 是否结算方式可修改 是 1 否 0 示例：0 |
| isjournalregistered | string | 否 | 是否登记日记账 是1 否 0 示例：1 |
| externaloutdefine1 | string | 否 | 外部系统自定义字段 示例：1111 |
| issplit | string | 否 | 是否可拆分结算 否 0 是 1 示例：0 |
| ismerge | string | 否 | 是否可合并结算 否 0 是 1 示例：0 |
| isGenerateVoucher | string | 否 | 是否生成结算凭证 否 0 是 1 示例：1 |
| _status | string | 否 | 操作标识 示例：Insert |
| oppositeBankType | string | 否 | 对方银行类别 示例：2282578752966912 |
| index | long | 否 | 顺序 示例：1 |
| serviceAttr | long | 否 | 结算方式 银行业务 0 现金业务 1 票据业务 2 支票 8 示例：0 |
| linkpayment | string | 否 | 联动支付 是 1 否 0 示例：0 |
| isIncomeAndExpenditure | boolean | 否 | 是否统收统支 是 true 否 false 示例：false |
| successsettlementamount | double | 否 | 结算成功金额 示例：123.23 |
| isRelateCheckBill | string | 否 | 是否关联对账单 否 0 是 1 示例：0 |
| receivedate | string | 否 | 接收日期 示例：2022-06-21 17:24:38 |
| id | long | 否 | 生成待结算单据ID 示例：1482732979742572553 |
| createDate | string | 否 | 创建日期 示例：2022-06-21 20:07:36 |
| createTime | string | 否 | 创建时间 示例：2022-06-21 20:07:36 |
| creator | string | 否 | 创建人 示例：YonSuite默认用户 |
| modifyDate | string | 否 | 修改日期 示例：2022-06-21 20:07:36 |
| modifyTime | string | 否 | 修改时间 示例：2022-06-21 20:07:36 |
| modifier | string | 否 | 修改人 示例：YonSuite默认用户 |
| wsettlestatus | string | 否 | 待结算数据状态 一般结算0 自动结算1 已结算补单2 示例：0 |
| wsettlementresult | string | 否 | 待结算数据结果 全部成功0 部分成功1 全部失败2 空3 示例：3 |
| pendingmode | string | 否 | 待处理方式 待处理0 待重新生单1 待业务处理2 成功3 示例：0 |
| vouchdate | string | 否 | 单据日期 示例：2022-06-21 20:07:36 |
| code | string | 否 | 待结算单据编码 示例：SD122062100000022 |
| tenant | long | 否 | 租户ID 示例：2163654053351680 |
| ytenant | string | 否 | 友互通租户ID 示例：jrig9o3z |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"wdataOrigin": "20",
			"accentity": "2185325490639872",
			"businessbilltype": "25",
			"businessbillnum": "test01",
			"businessId": "996",
			"businessdetailsid": "test01",
			"tradetype": "2571646385967872",
			"recpaytype": "1",
			"oribilldate": "2022-05-02 00:00:00",
			"oricurrency": "2163654411440900",
			"oricurrencyamount": 123.23,
			"natcurrency": "2163654411440900",
			"exchangerate": 1,
			"natSum": 123.23,
			"issinglebatch": "0",
			"expectpaydate": "2022-06-02 00:00:00",
			"toaccnttype": "4",
			"showtoaccntname": "企业网银新20161097",
			"counterpartybankaccount": "2667829984367616",
			"showoppositebankaccount": "755915680910511",
			"showoppositebankaccountname": "企业网银新20161097",
			"showoppositebankname": "招商银行深圳分行",
			"showoppositebanklineno": "308584001016",
			"expectsettlemethod": 2197839981252864,
			"enterpriseBankAccount": "2667829984367616",
			"openwsettlestatus": "2",
			"issettlementcanmodified": "0",
			"isjournalregistered": "1",
			"externaloutdefine1": "1111",
			"issplit": "0",
			"ismerge": "0",
			"isGenerateVoucher": "1",
			"_status": "Insert",
			"oppositeBankType": "2282578752966912",
			"index": 1,
			"serviceAttr": 0,
			"linkpayment": "0",
			"isIncomeAndExpenditure": false,
			"successsettlementamount": 123.23,
			"isRelateCheckBill": "0",
			"receivedate": "2022-06-21 17:24:38",
			"id": 1482732979742572553,
			"createDate": "2022-06-21 20:07:36",
			"createTime": "2022-06-21 20:07:36",
			"creator": "YonSuite默认用户",
			"modifyDate": "2022-06-21 20:07:36",
			"modifyTime": "2022-06-21 20:07:36",
			"modifier": "YonSuite默认用户",
			"wsettlestatus": "0",
			"wsettlementresult": "3",
			"pendingmode": "0",
			"vouchdate": "2022-06-21 20:07:36",
			"code": "SD122062100000022",
			"tenant": 2163654053351680,
			"ytenant": "jrig9o3z"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

500	参考message提示	根据message提示修改请求数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-21

新增

请求参数 dept_code

新增

请求参数 dept

2	2025-06-28

新增

请求参数 (48)

更新

请求参数 tradeType_code

更新

请求参数 tradeType

删除

请求参数 fundPurposeId

删除

请求参数 fundPurposeCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

