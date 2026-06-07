---
title: "投资赎回生单"
apiId: "2169830878320525318"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Investment Redemption"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Investment Redemption]
platform_version: "BIP"
source_type: community-api-docs
---

# 投资赎回生单

> `ContentType	application/json` 请求方式	POST | 分类: Investment Redemption (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/investredem/openapi/create

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
| accentity | string | 否 | 是 | 资金组织 示例：1526180336229679105 |
| createMethod | string | 否 | 否 | 生成方式 示例：openapi |
| protocolNumber | string | 否 | 是 | 协议号 示例：1961236222407344134 |
| purchaseregister | string | 否 | 是 | 申购单号 示例：1961290167179804679 |
| beforeredemflag | string | 否 | 是 | 是否计划赎回（含逾期）no:不按计划赎回/yes:按计划赎回 示例：yes |
| shuhuicashflowplan | string | 否 | 否 | 赎回现金流 最大请求量：500 |
| investredemdate | string | 否 | 否 | 赎回日期 示例：2025-01-02 |
| investredemamount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 赎回金额（协议币种） 示例：1000 |
| afterinvestredemamount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 本次赎回后余额（协议币种） 示例：500 |
| shouxijiexiflag | string | 否 | 是 | 是否同时结息收息 示例：yes:同时收息/no:不同时收息 |
| mergeSttleFlag | string | 否 | 否 | 是否合并结算 示例：yes:轧差结算/no:不轧差结算 |
| shouxicashflowplan | string | 否 | 否 | 收息现金流 最大请求量：500 |
| shouxibeginDate | string | 否 | 否 | 收息起息日 示例：2024-12-01 |
| shouxiendDate | string | 否 | 否 | 收息止息日 示例：2025-01-01 |
| interesBase | string | 否 | 否 | 计息基数 示例：repayment_amount:还本金额 financein_balance:借据余额 |
| baseRateType | string | 否 | 否 | 提前赎回利率类型 示例：1546425291657707529 |
| baserate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 基准利率（%） 示例：1 |
| floatType | string | 否 | 否 | 浮动方式 |
| floatValue | number |
| 小数位数:8,最大长度:16 | 否 | 否 | 浮动值 示例：0.5 |
| debtRate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 提前赎回利率（%） 示例：4.5 |
| shouxixieyiamount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 收息金额（协议币种） 示例：200 |
| shouxiAdjustAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 调整后收息金额（协议币种） 示例：180 |
| taxTotalAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 代扣代缴税费合计（协议币种） 示例：20 |
| taxInterestProtocolAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 代扣代缴税费后收息金额（协议币种） 示例：160 |
| deductFlag | string | 否 | 否 | 是否减免 示例：yes:减免/no:不减免 |
| iRDeductPrincipalAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 减免本金（协议币种） 示例：50 |
| iRDeductInterestAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 减免利息（协议币种） 示例：10 |
| debtOffset | string | 否 | 否 | 是否收益抵销 示例：yes/no |
| debtOffsetPrincipalAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 抵销本金（本金币种） 示例：30 |
| debtOffsetInterestAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 抵销利息（计息币种） 示例：5 |
| nextInvestredemPlan | string | 否 | 否 | 下次赎回计划 示例：normal正常/delaye延后 |
| nextInterCollPlan | string | 否 | 否 | 下次收息计划 示例：normal正常/delaye延后 |
| cashFlowReCalcMethod | string | 否 | 否 | 现金流重算方式 示例：expire_once:到期一次/average_capital:等额本金/average_interest:等额本息/custom:自定义 |
| sholdcurrency | string | 否 | 否 | 本币币种 示例：1525696886140829722 |
| shuhuiexchangerateType | string | 否 | 否 | 本币币种汇率类型 |
| shuhuiexchangerate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 本币币种汇率 示例：1 |
| shuhuisettlementStatus | string | 否 | 是 | 结算状态 示例：2:结算成功 0 待结算 |
| shuhuisettlementMethod | string | 否 | 否 | 结算方式 示例：1525698921952182428 |
| shuihuBankAccount | string | 否 | 否 | 本方银行账户 示例：1814956954916749318 |
| shOtherBankAccount | string | 否 | 否 | 对方银行账户 |
| sxoldcurrency | string | 否 | 否 | 本币币种 示例：1525696886140829722 |
| shouxiexchangerateType | string | 否 | 否 | 本币币种汇率类型 |
| shouxiexchangerate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 本币币种汇率 示例：1 |
| shouxisettlementStatus | string | 否 | 否 | 结算状态 示例：2:结算成功 0 待结算 |
| shouxisettlementMethod | string | 否 | 否 | 结算方式 示例：1525698921952182428 |
| shouxiBankAccount | string | 否 | 否 | 本方银行账户 示例：1814956954916749318 |
| sxOtherBankAccount | string | 否 | 否 | 对方银行账户 |
| name | string | 否 | 否 | 税种名称 |
| taxAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 金额（协议币种） |
| settledAddition | string | 否 | 否 | 赎回已结算补单 示例：yes:是 no:否 |
| sxsettledAddition | string | 否 | 否 | 收息已结算补单 示例：yes:是 no:否 |

## 3. 请求示例

Url: /yonbip/ctm/fm/investredem/openapi/create?access_token=访问令牌
Body: {
	"accentity": "1526180336229679105",
	"createMethod": "openapi",
	"protocolNumber": "1961236222407344134",
	"purchaseregister": "1961290167179804679",
	"beforeredemflag": "yes",
	"shuhuicashflowplan": "",
	"investredemdate": "2025-01-02",
	"investredemamount": 1000,
	"afterinvestredemamount": 500,
	"shouxijiexiflag": "yes:同时收息/no:不同时收息",
	"mergeSttleFlag": "yes:轧差结算/no:不轧差结算",
	"shouxicashflowplan": "",
	"shouxibeginDate": "2024-12-01",
	"shouxiendDate": "2025-01-01",
	"interesBase": "repayment_amount:还本金额 financein_balance:借据余额",
	"baseRateType": "1546425291657707529",
	"baserate": 1,
	"floatType": "",
	"floatValue": 0.5,
	"debtRate": 4.5,
	"shouxixieyiamount": 200,
	"shouxiAdjustAmount": 180,
	"taxTotalAmount": 20,
	"taxInterestProtocolAmount": 160,
	"deductFlag": "yes:减免/no:不减免",
	"iRDeductPrincipalAmount": 50,
	"iRDeductInterestAmount": 10,
	"debtOffset": "yes/no",
	"debtOffsetPrincipalAmount": 30,
	"debtOffsetInterestAmount": 5,
	"nextInvestredemPlan": "normal正常/delaye延后",
	"nextInterCollPlan": "normal正常/delaye延后",
	"cashFlowReCalcMethod": "expire_once:到期一次/average_capital:等额本金/average_interest:等额本息/custom:自定义",
	"sholdcurrency": "1525696886140829722",
	"shuhuiexchangerateType": "",
	"shuhuiexchangerate": 1,
	"shuhuisettlementStatus": "2:结算成功 0 待结算",
	"shuhuisettlementMethod": "1525698921952182428",
	"shuihuBankAccount": "1814956954916749318",
	"shOtherBankAccount": "",
	"sxoldcurrency": "1525696886140829722",
	"shouxiexchangerateType": "",
	"shouxiexchangerate": 1,
	"shouxisettlementStatus": "2:结算成功 0 待结算",
	"shouxisettlementMethod": "1525698921952182428",
	"shouxiBankAccount": "1814956954916749318",
	"sxOtherBankAccount": "",
	"name": "",
	"taxAmount": 0,
	"settledAddition": "yes:是 no:否",
	"sxsettledAddition": "yes:是 no:否"
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
| data | object | 否 | data |
| code | string | 否 | code 示例：SH2412310001 |
| statusMsg | string | 否 | statusMsg 示例：提交成功 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：0 |
| message | string | 否 | message |
| timestamp | string | 否 | timestamp 示例：1735611415146 |

## 5. 正确返回示例

{
	"data": {
		"code": "SH2412310001",
		"statusMsg": "提交成功"
	},
	"code": 0,
	"message": "",
	"timestamp": "1735611415146"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-10

新增

请求参数 settledAddition

新增

请求参数 sxsettledAddition

更新

请求参数 shuhuisettlementStatus

更新

请求参数 shouxisettlementStatus

2	2025-06-17

更新

请求参数 shuhuisettlementMethod

更新

请求参数 shuihuBankAccount


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

