---
title: "资金收款单单个保存"
apiId: "1437917426841812992"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Document"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金收款单单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Collection Document (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/fi/fundcollection/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 资金收款单请求入参 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 否 | 资金收款单id 新增时无需填写，修改时必填 示例：2770034399891712 |
| accentity_code | string | 否 | 是 | 资金组织id，或资金组织code 示例：110 |
| accentityRaw_code | string | 否 | 否 | 核算会计主体id，或核算会计主体code 示例：220 |
| code | string | 否 | 否 | 单据编号(以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输) 示例：CTM00210708000001 |
| userId | string | 否 | 否 | 创建人id |
| vouchdate | string | 否 | 是 | 单据日期 示例：2022-04-20 |
| org_code | string | 否 | 否 | 业务组织id或业务组织code，默认为空，可选择委托核算的组织 示例：110 |
| tradetype_code | string | 否 | 是 | 交易类型id，或交易类型code 示例：cmp_fundcollection_other |
| settlemode_code | string | 否 | 否 | 结算方式ID，或结算方式编码 示例：system_0001 |
| exchangeRateType_code | string | 否 | 是 | 汇率类型id，或汇率类型编码 示例：01 |
| exchRate | double | 否 | 是 | 汇率 示例：1 |
| currency_code | string | 否 | 是 | 收款币种id，或收款币种code 示例：CNY |
| enterprisebankaccount_code | string | 否 | 否 | 收款银行账户ID，或收款银行账号，或收款银行账户编码；结算方式的业务属性为银行业务时必填，可选择当前会计主体下的银行账户。 示例：4000021119201298365 |
| cashaccount_code | string | 否 | 否 | 收款现金账户ID，或收款现金账户编码；结算方式的业务属性为现金业务时必填，可选择当前会计主体下的现金账户。 示例：2412846184550912 |
| caobject | int | 否 | 否 | 收款对象(1：客户，2：供应商，3：员工，4：其他) 示例：1 |
| notetype_billtypeno | string | 否 | 否 | 票据类型id,或票据类型编码；结算方式的业务属性为票据业务时，并且启用商业汇票的情况下必填 示例：2738625800311040 |
| expenseitem_code | string | 否 | 否 | 费用项目id，或费用项目code 示例：1201 |
| dept_code | string | 否 | 否 | 部门id，或部门code 示例：334 |
| operator_code | string | 否 | 否 | 业务员id，或业务员code 示例：ocode |
| project_code | string | 否 | 否 | 项目id，或项目编码 示例：glo00000059 |
| description | string | 否 | 否 | 备注 示例：这是一段描述信息 |
| defines | object | 否 | 否 | 表头自由自定义项 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、 Update:更新 示例：Update |
| FundCollection_b | object | 是 | 是 | 资金收款单子表 |

## 3. 请求示例

Url: /yonbip/fi/fundcollection/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2770034399891712,
		"accentity_code": "110",
		"accentityRaw_code": "220",
		"code": "CTM00210708000001",
		"userId": "",
		"vouchdate": "2022-04-20",
		"org_code": "110",
		"tradetype_code": "cmp_fundcollection_other",
		"settlemode_code": "system_0001",
		"exchangeRateType_code": "01",
		"exchRate": 1,
		"currency_code": "CNY",
		"enterprisebankaccount_code": "4000021119201298365",
		"cashaccount_code": "2412846184550912",
		"caobject": 1,
		"notetype_billtypeno": "2738625800311040",
		"expenseitem_code": "1201",
		"dept_code": "334",
		"operator_code": "ocode",
		"project_code": "glo00000059",
		"description": "这是一段描述信息",
		"defines": {
			"id": "2770034399891712",
			"define1": "445",
			"define2": "778"
		},
		"_status": "Update",
		"FundCollection_b": [
			{
				"id": 2770034399891713,
				"quickType_code": "9",
				"description": "这是一段备注信息",
				"settlemode_code": "system_0001",
				"settlestatus": "1",
				"enterprisebankaccount_code": "4000021119201298365",
				"cashaccount_code": "2412846184550912",
				"notetype_billtypeno": "4555",
				"noteno_noteno": "54745746367",
				"noteDirection": 1,
				"notetextno": "43543252345",
				"noteSum": 120,
				"oriSum": 1200,
				"caobject": 1,
				"oppositeobjectname": "杨三",
				"oppositeaccountname": "杨三",
				"oppositeaccountno": "123321",
				"oppositebankaddr": "中国银行",
				"project_code": "glo00000059",
				"expenseitem_code": "1201",
				"dept_code": "xx001",
				"operator_code": "12121",
				"taxCategory_code": "6687",
				"defines": {
					"id": 2770034399891713,
					"define1": "example01",
					"define2": "example02"
				},
				"_status": "Update"
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
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| accentity_code | string | 否 | 资金组织 示例：2591580914225408 |
| code | string | 否 | 单据编码 示例：FDR20220524000116 |
| vouchdate | string | 否 | 单据日期 示例：2022-05-24 00:00:00 |
| accentityRaw_code | string | 否 | 核算会计主体 示例：2591580914225409 |
| org_code | string | 否 | 业务组织 示例：2591580914225408 |
| tradetype_code | string | 否 | 交易类型 示例：cmp_fundcollection_other |
| settlemode_code | string | 否 | 结算方式 示例：system_0001 |
| exchangeRateType_code | string | 否 | 汇率类型 示例：01 |
| exchRate | double | 否 | 汇率 示例：1 |
| currency_code | string | 否 | 币种 示例：CNY |
| enterprisebankaccount_code | string | 否 | 收款银行账户 示例：2719941813391872 |
| caobject | long | 否 | 收款对象(1：客户，2：供应商，3：员工，4：其他) 示例：1 |
| expenseitem_code | string | 否 | 费用项目 示例：2699198821978624 |
| dept_code | string | 否 | 部门 示例：测试部 |
| operator_code | string | 否 | 业务员 示例：00000036 |
| project_code | string | 否 | 项目 示例：项目一 |
| description | string | 否 | 备注 示例：备注 |
| FundCollection_b | object | 是 | 资金收款单子表 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| enterprisebankaccount | string | 否 | 收款银行账户ID 示例：2719941813391872 |
| exchangeRateType | string | 否 | 汇率类型id 示例：0000KY14MIJC0SDERP0000 |
| operator | string | 否 | 业务员id 示例：2687914564882944 |
| currency | string | 否 | 收款币种id 示例：2591342867010560 |
| accentity | string | 否 | 核算会计主体id 示例：2591580914225408 |
| settlemode | long | 否 | 结算方式ID 示例：2591099436552463 |
| project | string | 否 | 项目id 示例：2591605862453504 |
| org | string | 否 | 业务组织id 示例：2591580914225408 |
| dept | string | 否 | 部门id 示例：2663265966461184 |
| tradetype | string | 否 | 交易类型id 示例：2571644308067072 |
| expenseitem | long | 否 | 费用项目id 示例：2699198821978624 |
| isEnabledBsd | boolean | 否 | 是否启用商业汇票 示例：true |
| natCurrency | string | 否 | 本币币种id 示例：2591342867010560 |
| natCurrency_name | string | 否 | 本币币种 示例：人民币 |
| natCurrency_priceDigit | long | 否 | 本币币种单价精度 示例：2 |
| natCurrency_moneyDigit | long | 否 | 本币币种金额精度 示例：2 |
| currency_name | string | 否 | 币种 示例：人民币 |
| currency_priceDigit | long | 否 | 币种单价精度 示例：2 |
| currency_moneyDigit | long | 否 | 币种金额精度 示例：2 |
| auditstatus | short | 否 | 审批状态，1：已审批，2：未审批 示例：2 |
| verifystate | long | 否 | 审批状态， 0:"初始开立", 1:"审批中", 2:"审批完成", 3:"不通过流程终止", 4:"驳回到制单" 示例：0 |
| voucherstatus | long | 否 | 凭证状态 (1：已生成， 2：未生成， 3：已接收未生成， 4：不生成) 示例：2 |
| srcitem | long | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方 示例：9 |
| billtype | long | 否 | 单据类型，0："现金期初日记账未达", 1："销售发票", 2："其它应收事项", 5："订单日报", 6："内部交易结算单", 7："收款单", 8："其它应付事项", 9："客户退款单", 10："付款单", 11："供应商退款单", 12："转账单", 13："汇率损益单", 14："外币兑换单", 15："薪资支付单", 16："银行对账单", 17："资金收款单", 18："资金付款单", 50："应收票据期初", 51："收票登记", 52："银行托收", 53："到期兑付", 54："应付票据期初", 55："票据签发", 56："付票登记", 57："票据贴现", 58："票据背书", 59："付款申请单", 60："资金结算明细", 70："销售费用", 71："供应链费用", 72："销售费用", 73："供应链费用", 72："内部交易待结算单", 74："内部交易待结算单" 示例：17 |
| exchangeRateType_digit | long | 否 | 汇率精度 示例：6 |
| exchangeRateType_name | string | 否 | 汇率类型名称 示例：基准汇率 |
| oriSum | double | 否 | 收款金额合计 示例：100 |
| natSum | double | 否 | 本币金额合计 示例：100 |
| id | long | 否 | 资金收款单主表ID 示例：2788242631660032 |
| creator | string | 否 | 创建人 示例：YonSuite默认用户 |
| creatorId | long | 否 | 创建人id 示例：2591339873333504 |
| createTime | string | 否 | 创建时间 示例：2022-05-24 16:27:04 |
| createDate | string | 否 | 创建日期 示例：2022-05-24 16:27:04 |
| status | long | 否 | 审核状态；0 未审核， 1已审核 示例：0 |
| isWfControlled | boolean | 否 | 是否审批流控制（true：是，false：否） 示例：false |
| pubts | string | 否 | 时间戳 示例：2022-05-24 16:27:05 |
| tenant | long | 否 | 租户id 示例：2591339872260352 |
| defines | object | 否 | 表头自由自定义项 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"accentity_code": "2591580914225408",
		"code": "FDR20220524000116",
		"vouchdate": "2022-05-24 00:00:00",
		"accentityRaw_code": "2591580914225409",
		"org_code": "2591580914225408",
		"tradetype_code": "cmp_fundcollection_other",
		"settlemode_code": "system_0001",
		"exchangeRateType_code": "01",
		"exchRate": 1,
		"currency_code": "CNY",
		"enterprisebankaccount_code": "2719941813391872",
		"caobject": 1,
		"expenseitem_code": "2699198821978624",
		"dept_code": "测试部",
		"operator_code": "00000036",
		"project_code": "项目一",
		"description": "备注",
		"FundCollection_b": [
			{
				"quickType_code": "9",
				"description": "摘要",
				"settlemode_code": "system_0001",
				"settlestatus": 1,
				"enterprisebankaccount_code": "MSZS",
				"oriSum": 100,
				"caobject": 4,
				"oppositeobjectname": "00010000000001",
				"oppositeaccountname": "名声",
				"project_code": "项目二",
				"expenseitem_code": "X102",
				"dept_code": "开发总部",
				"operator_code": "00000036",
				"taxCategory_code": "VAT6",
				"taxCategory": "2591342869926917",
				"operator": "2687914564882944",
				"enterprisebankaccount": "2719941813391872",
				"dept": "2647722949316864",
				"expenseitem": 2699208047448576,
				"quickType": 2590051481424516,
				"project": "2591606240563456",
				"settlemode": 2591099436552463,
				"accentity": "2591580914225408",
				"currency": "2591342867010560",
				"exchangeRateType": "0000KY14MIJC0SDERP0000",
				"exchRate": 1,
				"natSum": 100,
				"taxRate": 6,
				"taxSum": 6,
				"id": 2788242631660033,
				"mainid": 2788242631660032,
				"pubts": "2022-05-24 16:27:04",
				"tenant": 2591339872260352,
				"defines": {
					"yTenantId": "0000KY14MIJC0SDERP0000",
					"poiExcelRowNum": "3",
					"poiExcelSheetName": "FundCollectionDefine(3)",
					"id": 2788242631660033,
					"define1": "表体",
					"pubts": "2022-05-24 16:27:04"
				}
			}
		],
		"resubmitCheckKey": "OPENAPI_1437917426841812992_0000KY14MIJC0SDERP0000_liu05240019998",
		"enterprisebankaccount": "2719941813391872",
		"exchangeRateType": "0000KY14MIJC0SDERP0000",
		"operator": "2687914564882944",
		"currency": "2591342867010560",
		"accentity": "2591580914225408",
		"settlemode": 2591099436552463,
		"project": "2591605862453504",
		"org": "2591580914225408",
		"dept": "2663265966461184",
		"tradetype": "2571644308067072",
		"expenseitem": 2699198821978624,
		"isEnabledBsd": true,
		"natCurrency": "2591342867010560",
		"natCurrency_name": "人民币",
		"natCurrency_priceDigit": 2,
		"natCurrency_moneyDigit": 2,
		"currency_name": "人民币",
		"currency_priceDigit": 2,
		"currency_moneyDigit": 2,
		"auditstatus": 2,
		"verifystate": 0,
		"voucherstatus": 2,
		"srcitem": 9,
		"billtype": 17,
		"exchangeRateType_digit": 6,
		"exchangeRateType_name": "基准汇率",
		"oriSum": 100,
		"natSum": 100,
		"id": 2788242631660032,
		"creator": "YonSuite默认用户",
		"creatorId": 2591339873333504,
		"createTime": "2022-05-24 16:27:04",
		"createDate": "2022-05-24 16:27:04",
		"status": 0,
		"isWfControlled": false,
		"pubts": "2022-05-24 16:27:05",
		"tenant": 2591339872260352,
		"defines": {
			"yTenantId": "0000KY14MIJC0SDERP0000",
			"poiExcelRowNum": "1",
			"poiExcelSheetName": "FundCollectionDefine(1)",
			"id": 2788242631660032,
			"define1": "表头",
			"pubts": "2022-05-24 16:27:04"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	结算方式业务属性为银行业务，请录入银行账户	根据提示修改请求JSON


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-04-23

更新

请求说明

2	2025-04-07

新增

请求参数 userId

更新

请求参数 accentityRaw_code

更新

返回参数 accentityRaw_code

更新

返回参数 accentity

更新

返回参数 accentity


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

