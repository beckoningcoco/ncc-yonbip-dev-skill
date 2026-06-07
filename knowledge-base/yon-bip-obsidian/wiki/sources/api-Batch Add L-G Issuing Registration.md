---
title: "批量新增开函登记"
apiId: "1513024568062115844"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "L/G Issuing Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, L/G Issuing Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 批量新增开函登记

> `ContentType	application/json` 请求方式	POST | 分类: L/G Issuing Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/lgmOpenApi/addGuaranteeRegister

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
| serialNumber | string | 否 | 是 | 流水号(必传且唯一) |
| accentity | string | 否 | 是 | 会计主体名称 示例：冰露 |
| guaranteeNumber | string | 否 | 是 | 保函编号 示例：BH20210924001 |
| guaranteeOpenDate | Date | 否 | 否 | 开函日期 示例：2021-09-16 |
| guaranteeTypeName | string | 否 | 否 | 保函类型 示例：投标保函 |
| openAgencyName | string | 否 | 否 | 开立机构 示例：银行 |
| agencyNameForOther | string | 否 | 否 | 机构名称 示例：中国工商银行深泽支行 |
| issuingMethod | string | 否 | 否 | 开立方式 mail = 信开 phone = 电开 示例：mail |
| isOpen | string | 否 | 否 | 是否敞口 yes=是 no=否 示例：yes |
| currency | string | 否 | 否 | 币种 示例：美元 |
| guaranteeAmount | BigDecimal | 否 | 否 | 保函金额 示例：100000.50 |
| guaranteeBeginDate | Date | 否 | 否 | 保函开始日期 示例：2021-09-16 |
| guaranteeEndDate | Date | 否 | 否 | 保函结束日期 示例：2021-10-16 |
| isForeign | string | 否 | 否 | 是否涉外 yes=是 no=否 示例：yes |
| transForwardOrg | string | 否 | 否 | 转开转递机构 示例：中国工商银行西安含光路支行 |
| contractType | string | 否 | 是 | 合同类型 1=采购订单 2=采购合同 3=销售合同 4=销售订单 5=融资合同 6=销售信用 other=其他 示例：1 |
| contractNumber | string | 否 | 否 | 合同编号 示例：HT12312ABCFX |
| isAgent | string | 否 | 否 | 代理开函 yes=是 no=否 示例：yes |
| beAgentAccentity | string | 否 | 否 | 被代理组织 示例：冰露的子公司 |
| recipientType | string | 否 | 是 | 收函方 1=客户 2=供应商 3=资金业务对象 示例：1 |
| recipientForOhter | string | 否 | 是 | 收函人 示例：哇哈哈 |
| recipientAddress | string | 否 | 否 | 收函人地址 示例：北京市海淀区 |
| recipientPhone | string | 否 | 否 | 收函人联系电话 示例：18599999999 |
| beginperiod | string | 否 | 否 | 期初：yes=是 no=否 |
| applicantaccid | string | 否 | 否 | 申请人账号 示例：账户account：25010801 |
| project | string | 否 | 否 | 项目 示例：项目名称：00000001 |
| wbs | string | 否 | 否 | WBS 示例：WBS名称：哈哈哈 |
| department | string | 否 | 否 | 部门 示例：部门名称：开发部 |
| bustype | string | 否 | 否 | 交易类型id 示例：1997080696589385808 |
| remarks | string | 否 | 否 | 备注 示例：备注 |
| estimateBasis | string | 否 | 否 | 预估依据 示例：231231212 |
| margin | string | 否 | 否 | 是否保证金，为空默认为否：yes=是 no=否 示例：为空默认为否 默认值：no |
| marginCurrency | string | 否 | 否 | 保证金币种：保证金为是时必填，为空默认保函币种 示例：币种名称：人民币 |
| currentAccount | string | 否 | 否 | 活期账号：是否保证金为是且是否结算=是且付款结算模式=主动结算时，必填：0=主动结算，1=被动扣款模式 |
| marginaccid | string | 否 | 否 | 保证金账号：是否保证金为是必填 |
| marginRatio | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 保证金比例 |
| marginAmount | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 保证金金额 |
| ifSettlement | string | 否 | 否 | 是否结算 :为空默认为否 yes=是 no=否 默认值：no |
| settleMethod | string | 否 | 否 | 结算方式 示例：结算方式名称：票据结算 |
| paySettleMode | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 付款结算模式：是否保证金为是且是否结算=是时，必填 0= 主动结算 ,1= 被动扣款 |
| settleState | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 结算状态：是否保证金为是且是否结算=是且付款结算模式=主动结算时，为空默认未结算 。1=待结算，3=结算成功 |
| handlingFee | string | 否 | 否 | 手续费：yes=是 no=否 |
| feeCurrency | string | 否 | 否 | 手续费币种：是否手续费为是时必填，为空默认保函币种 示例：币种名称：人民币 |
| handlingFeeAmount | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 手续费金额：是否手续费为是时必填 |
| handlingFeeaccid | string | 否 | 否 | 手续费账号：是否手续费为是时必填 示例：账户account：25010801 |
| country | string | 否 | 否 | 受益人国家地区 示例：地区名称：中国 |
| guaranteeRegisterAgreements | object | 否 | 否 | 授信子表 |
| agreementNo | string | 否 | 否 | 授信协议号：根据授信协议号+授信机构+授信类别+金融产品+开函明细子表里的资金组织查找符合条件的授信协议 |
| agreement_creditOrganName | string | 否 | 否 | 授信机构 示例：工商银行 |
| agreement_creditVarieties_name | string | 否 | 否 | 授信类别 示例：保函 |
| agreement_productName | string | 否 | 否 | 金融产品 示例：保函 |
| currentAmount | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 授信占用额度（保函币种） |
| guaranteeRegisterContracts | object | 否 | 否 | 担保子表 |
| contractNo | string | 否 | 否 | 担保合同号 |
| currentGuaranteeAmount | number |
| 小数位数:8,最大长度:20 | 否 | 否 | 占用额度 |

## 3. 请求示例

Url: /yonbip/ctm/lgmOpenApi/addGuaranteeRegister?access_token=访问令牌
Body: [{
	"serialNumber": "",
	"accentity": "冰露",
	"guaranteeNumber": "BH20210924001",
	"guaranteeOpenDate": "2021-09-16",
	"guaranteeTypeName": "投标保函",
	"openAgencyName": "银行",
	"agencyNameForOther": "中国工商银行深泽支行",
	"issuingMethod": "mail",
	"isOpen": "yes",
	"currency": "美元",
	"guaranteeAmount": 100000.5,
	"guaranteeBeginDate": "2021-09-16",
	"guaranteeEndDate": "2021-10-16",
	"isForeign": "yes",
	"transForwardOrg": "中国工商银行西安含光路支行",
	"contractType": "1",
	"contractNumber": "HT12312ABCFX",
	"isAgent": "yes",
	"beAgentAccentity": "冰露的子公司",
	"recipientType": "1",
	"recipientForOhter": "哇哈哈",
	"recipientAddress": "北京市海淀区",
	"recipientPhone": "18599999999",
	"beginperiod": "",
	"applicantaccid": "账户account：25010801",
	"project": "项目名称：00000001",
	"wbs": "WBS名称：哈哈哈",
	"department": "部门名称：开发部",
	"bustype": "1997080696589385808",
	"remarks": "备注",
	"estimateBasis": "231231212",
	"margin": "为空默认为否",
	"marginCurrency": "币种名称：人民币",
	"currentAccount": "",
	"marginaccid": "",
	"marginRatio": 0,
	"marginAmount": 0,
	"ifSettlement": "",
	"settleMethod": "结算方式名称：票据结算",
	"paySettleMode": 0,
	"settleState": 0,
	"handlingFee": "",
	"feeCurrency": "币种名称：人民币\t",
	"handlingFeeAmount": 0,
	"handlingFeeaccid": "账户account：25010801\t",
	"country": "地区名称：中国",
	"guaranteeRegisterAgreements": {
		"agreementNo": "",
		"agreement_creditOrganName": "工商银行",
		"agreement_creditVarieties_name": "保函",
		"agreement_productName": "保函",
		"currentAmount": 0
	},
	"guaranteeRegisterContracts": {
		"contractNo": "",
		"currentGuaranteeAmount": 0
	}
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
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| msgs | string | 是 | 错误信息集合 |
| sucessCount | long | 否 | 执行成功条数 示例：1 |
| failCount | long | 否 | 执行失败条数 示例：0 |
| successRecords | object | 是 | 成功数据记录 |
| totalCount | long | 否 | 总条数 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"msgs": [
			""
		],
		"sucessCount": 1,
		"failCount": 0,
		"successRecords": [
			{
				"serialNumber": "",
				"accentity": "2312820403671296",
				"guaranteeNumber": "0210924002",
				"guaranteeOpenDate": "2021-09-16 00:00:00",
				"guaranteeTypeName": "投标保函",
				"agency": 2312820403671296,
				"openInstitution": 2312820403671296,
				"issuingMethod": "mail",
				"isOpen": "yes",
				"currency": "2163654411440900",
				"guaranteeAmount": 100000.5,
				"guaranteeBeginDate": "2021-09-16 00:00:00",
				"guaranteeEndDate": "2024-10-16 00:00:00",
				"isForeign": "yes",
				"transForwardOrg": "2163654411440900",
				"contractType": "1",
				"contractNumber": "HT12312ABCFX",
				"isAgent": "yes",
				"beAgentAccentity": "2320741428761600",
				"recipientType": 1,
				"recipientForOhter": "哇哈哈",
				"recipientAddress": "北京市海淀区",
				"recipientPhone": "18599999999",
				"guaranteeType": 2432541240627456,
				"customer": 2472435015831808,
				"ifUsed": "notUsed",
				"auditStatus": 1,
				"id": 1513068600055300100,
				"code": "LGKDJ220801010"
			}
		],
		"totalCount": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

10000001	传入参数为空

10000002	传入数据存在重复的保函编号,请检查数据

10000003	传入数据存在没有保函编号的记录,请检查数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-12

更新

请求参数 (18)

2	2025-09-25

更新

请求说明

新增

请求参数 (33)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

