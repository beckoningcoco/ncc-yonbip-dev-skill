---
title: "开户管理批量新增"
apiId: "2024267126716497928"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Account Opening Management"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Account Opening Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 开户管理批量新增

> `ContentType	application/json` 请求方式	POST | 分类: Account Opening Management (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/bam/openAccount/batchSave

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentityName | string | 否 | 是 | 资金组织名称 示例：用友网络科技股份有限公司 |
| openOrg | string | 否 | 否 | 开户组织：非必填，开户组织名称，未填写时系统默认为资金组织名称，示例：用友网络科技股份有限公司 示例：用友网络科技股份有限公司 |
| applyDate | string | 否 | 是 | 申请日期 示例：2024-06-20 |
| openAccountType | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 开户类型：开户类型包括：银行开户(1)、结算中心开户(2)、财务公司开户(3)、其他金融机构(4)、数币钱包(6) 示例：1 |
| bankTypeName | string | 否 | 否 | 银行类别名称： 文本类型，输入银行类别名称 校验是平台的已启用银行类别档案 示例：平安银行 |
| financialCompanyAgentFlag | boolean | 否 | 否 | 是否财务公司代理户：当开户类型是银行开户时必填 枚举值包括：false-否 、 true-是 示例：false |
| bankDotCode | string | 否 | 是 | 开户网点编码，和开户网点名称至少传一个 示例：102177328395 |
| bankDotName | string | 否 | 否 | 开户网点名称 示例：平安银行股份有限公司天津新华支行 |
| associateFinanceCompanyAccountNo | string | 否 | 否 | 关联财务公司账号 示例：334343457777 |
| accountType | string | 否 | 否 | 账户性质：0-基本、1-一般、2-临时、3-专用、5-其他、6-第三方账户 示例：1 |
| acctQuality | string | 否 | 否 | 账户类型：枚举值包括：1-活期、2-定期、3-通知、4-保证金、5-贷款 示例：1 |
| applyStatus | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 申请状态：1-待提交 示例：1 |
| acctQualityNewName | string | 否 | 否 | 账户类型细分名称 示例：活期存款户 |
| accountPurposeName | string | 否 | 否 | 账户用途名称 示例：收支户 |
| revenueExpenseProperty | string | 否 | 否 | 收支属性：1-收入户 2-支出户 3-收支户 示例：3 |
| accountName | string | 否 | 否 | 账户名称 示例：企业网银新20161346 |
| openAccountDate | string | 否 | 否 | 开户日期 示例：2024-06-21 |
| isAuthAccount | string | 否 | 否 | 是否授权归集账户：0-否 1-是 示例：0 |
| isOverseasAcct | string | 否 | 否 | 是否境外账户：0-否 1-是 示例：0 |
| isExchange | string | 否 | 否 | 是否外汇管制：0-否 1-是 |
| openAgentAccountFlag | boolean | 否 | 否 | 是否开立代理户：false-否 、 true-是 示例：false |
| isEbank | string | 否 | 否 | 是否开通网银支付：0-否 1-是 示例：1 |
| passiveAccountOpeningFlag | boolean | 否 | 否 | 被动开户：false-否 、 true-是 示例：false |
| taxRegister | string | 否 | 否 | 纳税登记：0-否 1-是 示例：0 |
| isLongTerm | string | 否 | 否 | 长期有效：0-否 1-是 示例：0 |
| accountEndDate | string | 否 | 否 | 账户到期日：当长期有效为否时，必填 示例：2099-07-01 |
| reservedSealFlag | boolean | 否 | 否 | 是否预留印鉴：false-否 、 true-是 示例：true |
| associatedSealCombinationFlag | boolean | 否 | 否 | 是否关联印鉴组合：false-否 、 true-是 示例：true |
| reserveSignatureInformationFlag | boolean | 否 | 否 | 是否预留签字信息：false-否 、 true-是 示例：true |
| associatedSignatureCombinationFlag | boolean | 否 | 否 | 是否关联签字组合：false-否 、 true-是 示例：true |
| signatureCombination | string | 否 | 否 | 签字组合编码:支持录入多个，用逗号隔开，当关联签字组合为是时，必填 示例：0003 |
| associateUKeyInfoFlag | boolean | 否 | 否 | 是否关联U盾信息：false-否 、 true-是 示例：true |
| openAccountReason | string | 否 | 否 | 开户原因 示例：业务需求 |
| isCashlink | string | 否 | 否 | 是否现汇直联：0-否 1-是 示例：1 |
| directChannel | string | 否 | 否 | 直联渠道方式：1-银企直联、2-RPA直联、3-SWIFT直联 示例：1 |
| directAssortment | string | 否 | 否 | 直联分类:1-司库直联 2-非司库直联 3-非直联 示例：1 |
| intendedDirectAuth | string | 否 | 否 | 拟直联权限：1-查询、2-查询及支付 示例：2 |
| openEleReceiptFlag | boolean | 否 | 否 | 是否开通电子回单：false-否 、 true-是 示例：true |
| openEleTicketDirectConnectionFlag | boolean | 否 | 否 | 是否开通电票直联：false-否 、 true-是 示例：true |
| openBillPoolDirectConnectionFlag | boolean | 否 | 否 | 是否开通票据池直联：false-否 、 true-是 示例：true |
| agentBank | string | 否 | 否 | 电票代理行（id或者名称) |
| accountLevel | string | 否 | 否 | 账户等级(1=一类；2=二类；3=三类；4=四类) 示例：1 |
| bamOpenAccountCurrencyList | object | 是 | 是 | 账户子表（币种子表（至少填写一行）） |
| name | string | 否 | 是 | 币种名称：币种名称、币种编码必须填一个 示例：人民币 |
| code | string | 否 | 否 | 币种编码：币种名称、币种编码必须填一个 示例：CNY |
| acctBusinessTypeName | string | 否 | 否 | 账户业务类型名称 示例：1 |
| iban | string | 否 | 否 | IBAN |
| isDefault | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 是否默认：0-否 1-是 示例：0 |
| bamOpenSealInfoList | object | 是 | 否 | 印鉴信息子表 |
| sealDocCode | string | 否 | 否 | 印鉴档案编码：预留印鉴为是且关联印鉴组合为否时选填，示例：00009。如①印鉴档案编码填写有值，则校验印鉴相关字段必须与档案值一致；②如印鉴档案编码未填值，根据印鉴相关字段自动查找唯一档案，如果找到自动匹配；③如果未找到，根据印鉴相关字段自动生成一条档案 示例：00009 |
| sealAccentity | string | 否 | 否 | 印鉴资金组织：非必填，示例：1-账户所属组织、2-账户开户组织，未填值时默认为1。如印鉴档案编码填写有值，校验必须与档案值一致。 示例：1 |
| sealcode | string | 否 | 否 | 印鉴编号：预留印鉴为是且关联印鉴组合为否时必填 示例：00009 |
| sealname | string | 否 | 否 | 印鉴名称：预留印鉴为是且关联印鉴组合为否时必填 示例：公司印章 |
| sealtype | string | 否 | 否 | 印鉴类型：预留印鉴为是且关联印鉴组合为否时条件必填，示例：system01-公章、system02-财务章、system03-法人章、system04-人名章。如印鉴档案编码填写有值，校验必须与档案值一致；如印鉴档案编码未填值，则必填，填写值需在印鉴类型档案范围内 示例：system01 |
| combinationNumber | string | 否 | 否 | 印鉴组合编码或id：预留印鉴为是且关联印鉴组合为是时必填 示例：0003 |
| combinationDesc | string | 否 | 否 | 组合说明：预留印鉴为是且关联印鉴组合为是时填写，非必填 示例：公司法人印鉴组合 |
| bamOpenAccountSignatoryList | object | 是 | 否 | 签字人信息子表 |
| signatory | string | 否 | 否 | 签字人 示例：倪金彪 |
| englishName | string | 否 | 否 | 英文名 示例：tom |
| signatoryExpirationDate | string | 否 | 否 | 签字人有效期 示例：2099-09-01 |
| bamOpenAccountUkeyInfoList | object | 是 | 否 | U盾信息子表 |
| ukeyAsscType | string | 否 | 否 | U盾关联方式：1-新开立U盾 2-关联已有U盾 示例：1 |
| ukeySerialNum | string | 否 | 否 | U盾序列号 示例：4234324248 |
| ukeyAuthority | string | 否 | 否 | 操作权限：4-查询、5-复核、6-审批、2-经办、3-管理员、1-银企直联 示例：1 |
| ukeyEntityFlag | string | 否 | 否 | 是否实体U盾：0-否 1-是 示例：1 |
| holder | string | 否 | 否 | 持有人 示例：倪金彪 |
| custodian | string | 否 | 否 | 保管人 示例：倪金彪 |
| ukeyName | string | 否 | 否 | U盾助记名 |
| bamOpenaccountLinkedAccountList | object | 是 | 否 | 数币关联银行账户子表 |
| linkedBankAccountId | string | 否 | 否 | 银行账号 示例：12121212 |
| currencyId | string | 否 | 否 | 币种 示例：CNY |
| uniqueId | string | 否 | 是 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位 |

## 3. 请求示例

Url: /yonbip/ctm/bam/openAccount/batchSave?access_token=访问令牌
Body: [{
	"accentityName": "用友网络科技股份有限公司",
	"openOrg": "用友网络科技股份有限公司",
	"applyDate": "2024-06-20",
	"openAccountType": 1,
	"bankTypeName": "平安银行",
	"financialCompanyAgentFlag": false,
	"bankDotCode": "102177328395",
	"bankDotName": "平安银行股份有限公司天津新华支行",
	"associateFinanceCompanyAccountNo": "334343457777",
	"accountType": "1",
	"acctQuality": "1",
	"applyStatus": 1,
	"acctQualityNewName": "活期存款户",
	"accountPurposeName": "收支户",
	"revenueExpenseProperty": "3",
	"accountName": "企业网银新20161346",
	"openAccountDate": "2024-06-21",
	"isAuthAccount": "0",
	"isOverseasAcct": "0",
	"isExchange": "",
	"openAgentAccountFlag": false,
	"isEbank": "1",
	"passiveAccountOpeningFlag": false,
	"taxRegister": "0",
	"isLongTerm": "0",
	"accountEndDate": "2099-07-01",
	"reservedSealFlag": true,
	"associatedSealCombinationFlag": true,
	"reserveSignatureInformationFlag": true,
	"associatedSignatureCombinationFlag": true,
	"signatureCombination": "0003",
	"associateUKeyInfoFlag": true,
	"openAccountReason": "业务需求",
	"isCashlink": "1",
	"directChannel": "1",
	"directAssortment": "1",
	"intendedDirectAuth": "2",
	"openEleReceiptFlag": true,
	"openEleTicketDirectConnectionFlag": true,
	"openBillPoolDirectConnectionFlag": true,
	"agentBank": "",
	"accountLevel": "1",
	"bamOpenAccountCurrencyList": [
		{
			"name": "人民币",
			"code": "CNY",
			"acctBusinessTypeName": "1",
			"iban": "",
			"isDefault": 0
		}
	],
	"bamOpenSealInfoList": [
		{
			"sealDocCode": "00009",
			"sealAccentity": "1",
			"sealcode": "00009",
			"sealname": "公司印章",
			"sealtype": "system01",
			"combinationNumber": "0003",
			"combinationDesc": "公司法人印鉴组合"
		}
	],
	"bamOpenAccountSignatoryList": [
		{
			"signatory": "倪金彪",
			"englishName": "tom",
			"signatoryExpirationDate": "2099-09-01"
		}
	],
	"bamOpenAccountUkeyInfoList": [
		{
			"ukeyAsscType": "1",
			"ukeySerialNum": "4234324248",
			"ukeyAuthority": "1",
			"ukeyEntityFlag": "1",
			"holder": "倪金彪",
			"custodian": "倪金彪",
			"ukeyName": ""
		}
	],
	"bamOpenaccountLinkedAccountList": [
		{
			"linkedBankAccountId": "12121212",
			"currencyId": "CNY"
		}
	],
	"uniqueId": ""
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
| code | string | 否 | 接口返回码 示例：200 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| data | object | 是 | 各账号结果 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"data": [
			{
				"code": "200",
				"message": "保存成功",
				"id": "2253545445",
				"uniqueId": "435399999hhheee"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	成功

500	失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-14

新增

请求参数 openOrg

新增

请求参数 sealDocCode

新增

请求参数 sealAccentity

更新

请求参数 (15)

调整字段顺序

2	2025-09-10

更新

请求说明

更新

请求参数 bamOpenaccountLinkedAccountList

api改名

3	2025-07-03

新增

请求参数 (6)

更新

请求参数 (5)

1


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

