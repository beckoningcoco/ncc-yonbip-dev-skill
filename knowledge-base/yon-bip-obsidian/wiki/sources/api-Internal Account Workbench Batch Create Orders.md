---
title: "内部账户工作台批量生单"
apiId: "2174150095009742855"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Internal Account Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Internal Account Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 内部账户工作台批量生单

> `ContentType	application/json` 请求方式	POST | 分类: Internal Account Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/stct/openapi/createBatchInternalAccount

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| requestSeqNo | string | 否 | 是 | 请求流水号（保证唯一性） 示例：226720909137490739225 |
| settlementCenter | string | 否 | 是 | 结算中心（支持名称或者编码，平台已启用的资金组织档案，带有结算中心属性） 示例：pkm00 |
| accentity | string | 否 | 是 | 开户资金组织（支持名称或者编码，平台已启用的资金组织档案。且与结算中心建立了资金结算委托关系。） 示例：收入中台演示销售组织1 |
| code | string | 否 | 否 | 内部账号（未填写则系统调用编码规则自动生成） 示例：TEST0011 |
| currency | string | 否 | 是 | 币种（支持名称或者编码，平台已启用的币种档案） 示例：人民币 |
| accountName | string | 否 | 是 | 开户名 示例：TEST0011 |
| accountAlias | string | 否 | 否 | 账户别名（未填写则系统自动生成，默认与开户名一致） 示例：TEST0011 |
| accountNature | string | 否 | 是 | 账户类型（枚举类型，只支持编码：0:活期、1:定期、4:贷款 示例：0 |
| accountPurpose | string | 否 | 是 | 账户用途（支持名称或者编码，平台已启用的账户用途参照） 示例：04 |
| accountStatus | string | 否 | 是 | 账户状态（枚举类型，只支持编码：approved:正常 closed:销户 frozen:冻结 pending:待受理 review:待复核），目前只支持review 示例：review |
| openDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 开户日期（不能晚于系统当前日期，即小于等于系统当前日期） 示例：2025-05-21 |
| initBalance | string | 否 | 是 | 初始余额（初始余额必须为正数） 示例：1000.00000000 |
| businessType | string | 否 | 是 | 业务类型（枚举类型，只支持编码：change:变更 close:销户 freeze:冻结 open:开户 unfreeze:解冻） 示例：open |
| interestBearingFlag | string | 否 | 是 | 是否计息（枚举类型，只支持编码：0:否 1:是） 示例：1 |
| einterestCalDays | string | 否 | 否 | 计息天数（是否计息=是时必填），枚举类型，只支持编码：1: 360 2:365 示例：2 |
| interestBearingAccountType | string | 否 | 否 | 计息账户类型（枚举类型，只支持编码：other:其他账户、self:本账户，是否计息=是时必填） 示例：other |
| interestSettlementVoucherGenerateType | string | 否 | 否 | 结息凭证生成方式（枚举类型，只支持编码：punch:冲预提、supply:补预提，是否计息=是时必填） 示例：supply |
| interestBearingAccount | string | 否 | 否 | 计息账户（支持账号和名称，是否计息=是时必填 1、校验是平台的已启用企业银行账户档案，且开户类型=银行开户、财务公司、结算中心账户 2、校验必须是开户资金组织的使用权账户。 3、校验账户币种与上述币种一致。） 示例：INT000657 |
| overdraftFlag | string | 否 | 是 | 是否透支（枚举类型，只支持编码：0:否 1:是） 示例：1 |
| overdraftPattern | string | 否 | 否 | 透支方式（枚举类型，只支持编码：1:固定透支金额、 2:虚拟资金池透支额度，是否透支=是时必填） 示例：1 |
| overdraftLimit | number |
| 小数位数:6,最大长度:32 | 否 | 否 | 透支额度（透支方式=固定透支金额时必填 金额，校验大于0） 示例：100 |
| overdraftRate | number |
| 小数位数:6,最大长度:11 | 否 | 否 | 透支利率（是否透支=是时非必填，其他场景无需填写 金额、6位小数） 示例：1.000000 |
| openAccountInterestRate | number |
| 小数位数:6,最大长度:11 | 否 | 否 | 开户利率（是否计息=是时非必填，其他场景无需填写 金额、6位小数） 示例：2.000000 |
| depositAgreementSigned | string | 否 | 否 | 签约协定存款（枚举类型，只支持编码：0:未签约、 1:已签约，未填写则系统自动生成，默认未签约） 示例：0 |
| defaultAccountFlag | string | 否 | 是 | 是否默认（枚举类型，只支持编码：0:否 1:是） 示例：0 |

## 3. 请求示例

Url: /yonbip/ctm/stct/openapi/createBatchInternalAccount?access_token=访问令牌
Body: [{
	"requestSeqNo": "226720909137490739225",
	"settlementCenter": "pkm00",
	"accentity": "收入中台演示销售组织1",
	"code": "TEST0011",
	"currency": "人民币",
	"accountName": "TEST0011",
	"accountAlias": "TEST0011",
	"accountNature": "0",
	"accountPurpose": "04",
	"accountStatus": "review",
	"openDate": "2025-05-21",
	"initBalance": "1000.00000000",
	"businessType": "open",
	"interestBearingFlag": "1",
	"einterestCalDays": "2",
	"interestBearingAccountType": "other",
	"interestSettlementVoucherGenerateType": "supply",
	"interestBearingAccount": "INT000657",
	"overdraftFlag": "1",
	"overdraftPattern": "1",
	"overdraftLimit": 100,
	"overdraftRate": 1,
	"openAccountInterestRate": 2,
	"depositAgreementSigned": "0",
	"defaultAccountFlag": "0"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或联系技术支持。 |
| data | object | 否 | data 示例：{ status: FAIL-全部失败；SUCCESS-全部成功；PARTSUCCESS-部分成功, total: 1, errorNum: 1, successNum: 0, resultDataVOs: [ { requestSeqNo: 1, code: 999, message: "保存失败：根据结算中心名称或编码未查询到启用的档案数据！" } ] } |

## 5. 正确返回示例

{
	"code": "200",
	"message": "抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或联系技术支持。",
	"data": {
		"status": "FAIL-全部失败；SUCCESS-全部成功；PARTSUCCESS-部分成功",
		"total": 1,
		"errorNum": 1,
		"successNum": 0,
		"resultDataVOs": [
			{
				"requestSeqNo": 1,
				"code": 999,
				"message": "保存失败：根据结算中心名称或编码未查询到启用的档案数据！"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或者联系技术支持！


## 9. 接口变更日志

序号	修改时间	变更内容概要

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

