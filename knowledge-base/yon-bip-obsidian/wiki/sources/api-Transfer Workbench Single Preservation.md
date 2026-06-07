---
title: "转账工作台单个保存"
apiId: "bb9cf9f194a64042a997399d05847dbe"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Same-name Account Transfer"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Same-name Account Transfer]
platform_version: "BIP"
source_type: community-api-docs
---

# 转账工作台单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Same-name Account Transfer (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/cmtransferaccount/save

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
| data | object | 否 | 是 | 转账单信息 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 转账单ID 新增时无需填写，修改时必填 示例：2670440860701696 |
| accentity_code | string | 否 | 是 | 资金组织ID,或资金组织code 示例：快乐柠檬 |
| accentityRaw_code | string | 否 | 否 | 核算会计主体ID,或核算会计主体code |
| code | string | 否 | 否 | 单据编号,自动编码时不必填，手动编码时必填 示例：CMR00210506000001 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2021-05-06 |
| tradetype_code | string | 否 | 是 | 交易类型id，或交易类型code 示例：BT |
| settlemode_code | string | 否 | 是 | 付款结算方式id，付款结算方式code 示例：2400018511451248 |
| collectsettlemode_code | string | 否 | 否 | 收款结算方式id，收款结算方式code 示例：2400018511451249 |
| exchangeRateType_code | string | 否 | 是 | 汇率类型id，或汇率类型code 示例：基准汇率 |
| exchRate | double | 否 | 是 | 汇率 示例：1 |
| currency_code | string | 否 | 是 | 币种id，或币种code 示例：CNY |
| payBankAccount_account | string | 否 | 否 | 付款银行账户id或编码 示例：DBZ002 |
| payCashAccount_code | string | 否 | 否 | 付款现金账户ID或编码 |
| recBankAccount_account | string | 否 | 否 | 收款银行账户ID或编码 示例：recBankAccount |
| recCashAccount_code | string | 否 | 否 | 收款现金账户ID或编码 |
| oriSum | double | 否 | 是 | 转账金额 示例：3600 |
| noteno | string | 否 | 否 | 票据号 示例：546452436265 |
| inBrokerage | double | 否 | 否 | 转入手续费 示例：200 |
| outBrokerage | double | 否 | 否 | 转出手续费 示例：200 |
| natSum | double | 否 | 是 | 本币金额（根据本币币种金额精度保留小数点位数，不足补零） 示例：3600 |
| description | string | 否 | 否 | 备注 示例：采购工程款 |
| purpose | string | 否 | 否 | 用途 示例：采购款 |
| project_code | string | 否 | 否 | 项目id，项目编码 示例：Zp002 |
| dept_code | string | 否 | 否 | 部门id，部门编码 示例：dp001 |
| pubts | string | 否 | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss，修改时必填 示例：2020-07-23 19:42:58 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Update |
| headItem | object | 否 | 否 | 固定自定义项 |
| defines | object | 否 | 否 | 自由自定义项 |

## 3. 请求示例

Url: /yonbip/fi/cmtransferaccount/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "2670440860701696",
		"accentity_code": "快乐柠檬",
		"accentityRaw_code": "",
		"code": "CMR00210506000001",
		"vouchdate": "2021-05-06",
		"tradetype_code": "BT",
		"settlemode_code": "2400018511451248",
		"collectsettlemode_code": "2400018511451249",
		"exchangeRateType_code": "基准汇率",
		"exchRate": 1,
		"currency_code": "CNY",
		"payBankAccount_account": "DBZ002",
		"payCashAccount_code": "",
		"recBankAccount_account": "recBankAccount",
		"recCashAccount_code": "",
		"oriSum": 3600,
		"noteno": "546452436265",
		"inBrokerage": 200,
		"outBrokerage": 200,
		"natSum": 3600,
		"description": "采购工程款",
		"purpose": "采购款",
		"project_code": "Zp002",
		"dept_code": "dp001",
		"pubts": "2020-07-23 19:42:58",
		"_status": "Update",
		"headItem": {
			"id": "2345432344323",
			"define1": "YH460502202102260001"
		},
		"defines": {
			"id": "2345432344323",
			"define1": "YH460502202102260001"
		}
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
| accentity_code | string | 否 | 资金组织 示例：ZSZB |
| vouchdate | string | 否 | 单据日期 示例：2022-05-26 00:00:00 |
| tradetype_code | string | 否 | 交易类型 示例：BT2 |
| settlemode_code | string | 否 | 结算方式 示例：system_0001 |
| exchangeRateType_code | string | 否 | 汇率类型 示例：01 |
| exchRate | double | 否 | 汇率 示例：1 |
| currency_code | string | 否 | 币种 示例：CNY |
| payBankAccount_account | string | 否 | 付款银行账户 示例：699973566 |
| recBankAccount_account | string | 否 | 收款银行账户 示例：9889101 |
| oriSum | double | 否 | 转账金额 示例：100.23 |
| noteno | string | 否 | 票据号 示例：546452436265 |
| inBrokerage | double | 否 | 转入手续费 示例：11.11 |
| outBrokerage | double | 否 | 转出手续费 示例：12.22 |
| paystatus | short | 否 | 支付状态；0待支付，1预下单成功，2预下单失败，3支付成功，4支付失败，5支付中，6支付不明，7线下支付成功，8部分成功 示例：0 |
| settlestatus | short | 否 | 结算状态, 1:未结算、2:已结算 示例：1 |
| natSum | double | 否 | 本币金额 示例：100.23 |
| description | string | 否 | 备注 示例：备注 |
| purpose | string | 否 | 用途 示例：用途 |
| project_code | string | 否 | 项目 示例：项目二 |
| auditstatus | short | 否 | 审批状态，1：已审批，2：未审批 示例：2 |
| voucherstatus | short | 否 | 凭证状态 (1：已生成， 2：未生成， 3：已接收未生成， 4：不生成) 示例：2 |
| srcitem | long | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方 示例：8 |
| billtype | long | 否 | 单据类型，0："现金期初日记账未达", 1："销售发票", 2："其它应收事项", 5："订单日报", 6："内部交易结算单", 7："收款单", 8："其它应付事项", 9："客户退款单", 10："付款单", 11："供应商退款单", 12："转账单", 13："汇率损益单", 14："外币兑换单", 15："薪资支付单", 16："银行对账单", 17："资金收款单", 18："资金付款单", 50："应收票据期初", 51："收票登记", 52："银行托收", 53："到期兑付", 54："应付票据期初", 55："票据签发", 56："付票登记", 57："票据贴现", 58："票据背书", 59："付款申请单", 60："资金结算明细", 70："销售费用", 71："供应链费用", 72："销售费用", 73："供应链费用", 72："内部交易待结算单", 74："内部交易待结算单" 示例：12 |
| signaturestr | string | 否 | 验签密文 示例：AUTOTEST_SIGNATURE_Constant |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| currency | string | 否 | 币种id 示例：2591342867010560 |
| payBankAccount | string | 否 | 付款银行账户id 示例：2719941813391872 |
| recBankAccount | string | 否 | 收款银行账户id 示例：2647947972089600 |
| settlemode | long | 否 | 结算方式id 示例：2591099436552463 |
| tradetype | string | 否 | 交易类型id 示例：1463200172700860420 |
| exchangeRateType | string | 否 | 汇率类型id 示例：0000KY14MIJC0SDERP0000 |
| project | string | 否 | 项目id 示例：2591606240563456 |
| accentity | string | 否 | 资金组织id 示例：2591580914225408 |
| inBrokerageNatSum | double | 否 | 转入手续费本币 示例：11.11 |
| outBrokerageNatSum | double | 否 | 转出手续费本币 示例：12.22 |
| natCurrency | string | 否 | 本币币种id 示例：2591342867010560 |
| id | long | 否 | 单据id 示例：2790892052484352 |
| code | string | 否 | 单据编号 示例：0TA14220526000005 |
| creator | string | 否 | 创建人 示例：YonSuite默认用户 |
| creatorId | long | 否 | 创建人id 示例：2591339873333504 |
| createTime | string | 否 | 创建时间 示例：2022-05-26 13:22:12 |
| createDate | string | 否 | 创建日期 示例：2022-05-26 13:22:12 |
| status | short | 否 | 审核状态；0 未审核， 1已审核 示例：0 |
| isWfControlled | boolean | 否 | 是否审批流控制（true：是，false：否） 示例：false |
| pubts | string | 否 | 时间戳 示例：2022-05-26 13:22:13 |
| tenant | long | 否 | 租户主键 示例：2591339872260352 |
| yTenantId | string | 否 | 友互通租户id 示例：0000KY14MIJC0SDERP0000 |
| headItem | object | 否 | 表头固定自定义项 |
| defines | object | 否 | 自由自定义项 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"accentity_code": "ZSZB",
		"vouchdate": "2022-05-26 00:00:00",
		"tradetype_code": "BT2",
		"settlemode_code": "system_0001",
		"exchangeRateType_code": "01",
		"exchRate": 1,
		"currency_code": "CNY",
		"payBankAccount_account": "699973566",
		"recBankAccount_account": "9889101",
		"oriSum": 100.23,
		"noteno": "546452436265",
		"inBrokerage": 11.11,
		"outBrokerage": 12.22,
		"paystatus": 0,
		"settlestatus": 1,
		"natSum": 100.23,
		"description": "备注",
		"purpose": "用途",
		"project_code": "项目二",
		"auditstatus": 2,
		"voucherstatus": 2,
		"srcitem": 8,
		"billtype": 12,
		"signaturestr": "AUTOTEST_SIGNATURE_Constant",
		"resubmitCheckKey": "OPENAPI_bb9cf9f194a64042a997399d05847dbe_0000KY14MIJC0SDERP0000_liu05260006",
		"currency": "2591342867010560",
		"payBankAccount": "2719941813391872",
		"recBankAccount": "2647947972089600",
		"settlemode": 2591099436552463,
		"tradetype": "1463200172700860420",
		"exchangeRateType": "0000KY14MIJC0SDERP0000",
		"project": "2591606240563456",
		"accentity": "2591580914225408",
		"inBrokerageNatSum": 11.11,
		"outBrokerageNatSum": 12.22,
		"natCurrency": "2591342867010560",
		"id": 2790892052484352,
		"code": "0TA14220526000005",
		"creator": "YonSuite默认用户",
		"creatorId": 2591339873333504,
		"createTime": "2022-05-26 13:22:12",
		"createDate": "2022-05-26 13:22:12",
		"status": 0,
		"isWfControlled": false,
		"pubts": "2022-05-26 13:22:13",
		"tenant": 2591339872260352,
		"yTenantId": "0000KY14MIJC0SDERP0000",
		"headItem": {
			"poiExcelSheetName": "TransferAccountCustomItem(1)",
			"poiExcelRowNum": "1",
			"define1": "固定自定义项",
			"id": 2790892052484352,
			"pubts": "2022-05-26 13:22:12",
			"yTenantId": "0000KY14MIJC0SDERP0000"
		},
		"defines": {
			"yTenantId": "0000KY14MIJC0SDERP0000",
			"poiExcelRowNum": "1",
			"poiExcelSheetName": "TransferAccountDefine(1)",
			"id": 2790892052484352,
			"define1": "自由自定义项",
			"pubts": "2022-05-26 13:22:12"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	录入的转账金额、与本币金额和汇率不匹配（转账金额*汇率=本币金额	根据返回信息修改请求数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-03-21

新增

请求参数 dept_code


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

