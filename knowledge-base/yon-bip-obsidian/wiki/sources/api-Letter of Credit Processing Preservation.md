---
title: "开证办理保存"
apiId: "1867908490116726790"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "L/C Issuing"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, L/C Issuing]
platform_version: "BIP"
source_type: community-api-docs
---

# 开证办理保存

> `ContentType	application/json` 请求方式	POST | 分类: L/C Issuing (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/issueRegisterOpenApi/saveData

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
| accentity | string | 否 | 是 | 资金组织id 示例：1524864006176636931 |
| initFlag | boolean | 否 | 是 | 期初 示例：false |
| letterCreditCode | string | 否 | 是 | 信用证编号 示例：yxqdsb004 |
| dept | string | 否 | 否 | 部门 |
| employee | string | 否 | 否 | 业务员 |
| auditStatus | short | 否 | 是 | 审批状态：0已保存；1审批中；2已驳回；3审批通过；4已终止 示例：0 |
| lettercreditStatus | short | 否 | 是 | 信用证状态：1在登记；2已生效；3已闭卷；4已撤证；5改正中；6闭卷中；7撤证中 示例：1 |
| singleStatus | short | 否 | 是 | 到单状态：1未到单；2部分到单；3全部到单 示例：1 |
| totalArrivebillAmt | string | 否 | 否 | 累计到单承付金额(含在途) 示例：1.2 |
| cumPaidAmt | string | 否 | 否 | 累计已付金额(含在途) 示例：1.3 |
| issuiingBank | string | 否 | 否 | 开证行 示例：1529957029950521606 |
| issuingMethod | short | 否 | 否 | 开证方式：1SWIFT；2信开；3其他电开 示例：1 |
| vouchdate | Date | 否 | 是 | 开证日期 示例：2023-10-09 |
| lcmType | string | 否 | 否 | 信用证种类(参照) 示例：1577428556138414080 |
| interOrDomestic | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 信用证类型：1：国际信用证，2：国内信用证 示例：1 |
| timeLimit | short | 否 | 否 | 信用证期限：0即期信用证，1远期信用证 示例：1 |
| isBackout | short | 否 | 是 | 是否可撤销: 0-否；1-是 示例：0 |
| isTransfer | boolean | 否 | 否 | 是否可转让 示例：false |
| lcmCurrency | string | 否 | 是 | 信用证币种 示例：1524777565678469141 |
| lcmSum | BigDecimal | 否 | 是 | 信用证金额 示例：11.33 |
| amtFloatMethod | short | 否 | 是 | 金额浮动方式：0无；1溢短装；2最大金额 示例：1 |
| maxSum | BigDecimal | 否 | 否 | 最大金额：金额浮动方式=“最大金额”时，为必填项 |
| upFloatingRatio | BigDecimal | 否 | 否 | 上浮比例%：金额浮动方式=“溢短装”时,为必填项 示例：11 |
| downFloatingRatio | BigDecimal | 否 | 否 | 下浮比例% ：金额浮动方式=“溢短装”时,为必填项 示例：15 |
| beneficiaryType | short | 否 | 是 | 受益人类型：1客户；2供应商 示例：2 |
| beneficiaryAccount | string | 否 | 否 | 受益人账号（客户）:受益人类型为1时必填 |
| custBeneficiary | string | 否 | 否 | 受益人(客户):受益人类型为1时必填 |
| vendorBeneficiary | string | 否 | 否 | 受益人（供应商）：受益人类型为2时必填 示例：1857965915713830919 |
| beneficiaryAccountSup | string | 否 | 否 | 受益人账号（供应商）：受益人类型为2时必填 示例：1857965915713830921 |
| countryBeneficiary | string | 否 | 否 | 受益人国家地区 示例：0040be98-735b-44c0-afe5-54d11a96037b |
| beneficiaryAdd | string | 否 | 否 | 受益人地址 示例：你猜 |
| isNegotiation | boolean | 否 | 是 | 是否议付 示例：false |
| negotiationDate | Date | 否 | 否 | 议付日期 |
| advisingBank | string | 否 | 否 | 通知行 |
| cashingMethod | short | 否 | 否 | 兑付方式：1即期付款；2承兑；3议付；4延期付款；5混合付款 示例：1 |
| longtermDays | int | 否 | 否 | 远期天数 |
| cashbankType | short | 否 | 否 | 兑用银行类型：1任何银行；2开证行；3通知行；4其他银行 示例：1 |
| underbondBank | string | 否 | 否 | 保兑行 |
| isAppoint | boolean | 否 | 否 | 保兑行是否由受益人指定 |
| reimbursingBank | string | 否 | 否 | 偿付行 |
| isBatches | string | 否 | 是 | 是否分批 示例：true |
| isTransport | boolean | 否 | 是 | 是否可转运 |
| transportMode | string | 否 | 否 | 运输方式 |
| pointOrigin | string | 否 | 否 | 起运地 |
| destination | string | 否 | 否 | 目的地 |
| latestDateShipment | Date | 否 | 否 | 最迟装运 示例：2024-01-19 00:00:00 |
| goodDescription | string | 否 | 否 | 货物/服务描述 示例：you are stupid |
| otherRemark | string | 否 | 否 | 其他备注 |
| isOccupyCredit | boolean | 否 | 否 | 是否占授信 |
| isBond | boolean | 否 | 否 | 是否保证金 |
| isGuarantee | boolean | 否 | 否 | 是否占担保 |
| swfitCode | string | 否 | 否 | 通知行SWFIT码 |
| periodOfValidity | Date | 否 | 是 | 到期日期 |
| applicantBankAcc | string | 否 | 否 | 开证人账号 示例：1873669656183046151 |
| negotiationBank | string | 否 | 否 | 兑用银行 |
| isUnderbond | short | 否 | 否 | 保兑指示：1保兑；2可加保兑；3不保兑 示例：1 |
| presentationDateBegin | Date | 否 | 否 | 预计交单开始日 示例：2024-01-17 00:00:00 |
| presentationDateEnd | Date | 否 | 否 | 预计交单结束日 示例：2024-11-01 00:00:00 |
| bondRatio | BigDecimal | 否 | 否 | 保证金比例 |
| bondCurrency | string | 否 | 否 | 保证金币种 |
| marginAccount | string | 否 | 否 | 保证金账号 |
| currentAccount | string | 否 | 否 | 活期账号 |
| issueregisterRequired_b | object | 是 | 否 | 单据要求-子表 |
| billType | short | 否 | 否 | 单据类型：0-商业发票;;1-海运提单;2-空运单据;3-装箱单;4-保险单;5-原产地证;6-数量/重量证明;7-质量证明;8-检疫证明;9-受益人证明;10-寄送通知;11-样品报告;12-河运提单;13-铁路运单;14-公路运单;15-邮政收据;16-货物收据;17-其他; |
| billRequired | string | 否 | 否 | 单据要求 |
| clauseDescription | string | 否 | 否 | 条款说明 |
| issueregisterAdditional_b | object | 是 | 否 | 附加条款-子表 |
| termDescription | string | 否 | 否 | 条款描述 |
| termNotes | string | 否 | 否 | 条款说明 |
| issueregister_b | object | 是 | 否 | 合同信息-子表 |
| contractNum | string | 否 | 否 | 合同号 |
| contractCurrency | string | 否 | 否 | 合同币种 |
| material | string | 否 | 否 | 物料 |
| orderNum | string | 否 | 否 | 订单号 |
| orderGoodsNum | BigDecimal | 否 | 否 | 订货数量 |
| unitPrice | BigDecimal | 否 | 否 | 含税单价 |
| inclusiveSum | BigDecimal | 否 | 否 | 含税总金额 |
| agreement_b | object | 是 | 否 | 授信信息-子表 |
| creditAgreementText | string | 否 | 否 | 授信协议号 |
| occupyCreditSum | Decimal | 否 | 否 | 授信占用金额 |
| creditBeginDate | Date | 否 | 否 | 授信开始日 |
| creditEndDate | Date | 否 | 否 | 授信到期日 |
| creditType | short | 否 | 否 | 授信类型：1企业授信；2集团授信 |
| creditVariety | short | 否 | 否 | 授信类别：1综合授信；2专项授信 |
| financeProductEnume | short | 否 | 否 | 金融产品 |
| creditEmployMode | short | 否 | 否 | 授信占用方式：0一次性；1可循环 |
| guarantee_b | object | 是 | 否 | 担保信息-子表 |
| guaranteeContract_contractCode | string | 否 | 否 | 担保合同号 |
| guaranteeAmount | string | 否 | 否 | 担保占用金额 |
| guaranteeCurrency | string | 否 | 否 | 担保币种 |
| guaranteeMethod | short | 否 | 否 | 担保方式：1抵押担保；2质押担保；3第三方保证担保； |
| guaranteeBeginDate | Date | 否 | 否 | 担保开始日 |
| guaranteeEndDate | Date | 否 | 否 | 担保结束日 |

## 3. 请求示例

Url: /yonbip/ctm/issueRegisterOpenApi/saveData?access_token=访问令牌
Body: {
	"accentity": "1524864006176636931",
	"initFlag": false,
	"letterCreditCode": "yxqdsb004",
	"dept": "",
	"employee": "",
	"auditStatus": 0,
	"lettercreditStatus": 1,
	"singleStatus": 1,
	"totalArrivebillAmt": "1.2",
	"cumPaidAmt": "1.3",
	"issuiingBank": "1529957029950521606",
	"issuingMethod": 1,
	"vouchdate": "2023-10-09",
	"lcmType": "1577428556138414080",
	"interOrDomestic": 1,
	"timeLimit": 1,
	"isBackout": 0,
	"isTransfer": false,
	"lcmCurrency": "1524777565678469141",
	"lcmSum": 11.33,
	"amtFloatMethod": 1,
	"maxSum": 0,
	"upFloatingRatio": 11,
	"downFloatingRatio": 15,
	"beneficiaryType": 2,
	"beneficiaryAccount": "",
	"custBeneficiary": "",
	"vendorBeneficiary": "1857965915713830919",
	"beneficiaryAccountSup": "1857965915713830921",
	"countryBeneficiary": "0040be98-735b-44c0-afe5-54d11a96037b",
	"beneficiaryAdd": "你猜",
	"isNegotiation": false,
	"negotiationDate": "",
	"advisingBank": "",
	"cashingMethod": 1,
	"longtermDays": 0,
	"cashbankType": 1,
	"underbondBank": "",
	"isAppoint": true,
	"reimbursingBank": "",
	"isBatches": "true",
	"isTransport": true,
	"transportMode": "",
	"pointOrigin": "",
	"destination": "",
	"latestDateShipment": "2024-01-19 00:00:00",
	"goodDescription": "you are stupid",
	"otherRemark": "",
	"isOccupyCredit": true,
	"isBond": true,
	"isGuarantee": true,
	"swfitCode": "",
	"periodOfValidity": "",
	"applicantBankAcc": "1873669656183046151",
	"negotiationBank": "",
	"isUnderbond": 1,
	"presentationDateBegin": "2024-01-17 00:00:00",
	"presentationDateEnd": "2024-11-01 00:00:00",
	"bondRatio": 0,
	"bondCurrency": "",
	"marginAccount": "",
	"currentAccount": "",
	"issueregisterRequired_b": [
		{
			"billType": 0,
			"billRequired": "",
			"clauseDescription": ""
		}
	],
	"issueregisterAdditional_b": [
		{
			"termDescription": "",
			"termNotes": ""
		}
	],
	"issueregister_b": [
		{
			"contractNum": "",
			"contractCurrency": "",
			"material": "",
			"orderNum": "",
			"orderGoodsNum": 0,
			"unitPrice": 0,
			"inclusiveSum": 0
		}
	],
	"agreement_b": [
		{
			"creditAgreementText": "",
			"occupyCreditSum": 0,
			"creditBeginDate": "",
			"creditEndDate": "",
			"creditType": 0,
			"creditVariety": 0,
			"financeProductEnume": 0,
			"creditEmployMode": 0
		}
	],
	"guarantee_b": [
		{
			"guaranteeContract_contractCode": "",
			"guaranteeAmount": "",
			"guaranteeCurrency": "",
			"guaranteeMethod": 0,
			"guaranteeBeginDate": "",
			"guaranteeEndDate": ""
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
| code | string | 否 | 状态码 |
| message | string | 否 | 描述信息 |
| data | object | 否 | 返回数据 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-23

更新

请求参数 (16)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

