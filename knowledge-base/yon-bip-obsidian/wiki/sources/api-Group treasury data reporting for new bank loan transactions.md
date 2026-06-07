---
title: "集团司库数据上报银行贷款整单新增"
apiId: "2183236725387034626"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Regulatory Reporting"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Regulatory Reporting]
platform_version: "BIP"
source_type: community-api-docs
---

# 集团司库数据上报银行贷款整单新增

> `ContentType	application/json` 请求方式	POST | 分类: Regulatory Reporting (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/submit/api/group/bank/bill/insert

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
| dataDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 数据日期 示例：2025-01-01 |
| submitType | string | 否 | 是 | 报送业务名称 传BANK 示例：BANK |
| detailList | object | 是 | 是 | 明细数据 |
| submitGroupCreditCode | string | 否 | 是 | 所属集团编码 |
| submitGroupName | string | 否 | 是 | 所属集团名称 |
| dataSource | string | 否 | 是 | 报送数据来源 FINANCE_MANG手工录入 FINANCE_MANG 融资管理 FINANCE_MANG_REVIS 融资管理修订 示例：FINANCE_MANG |
| loanType | string | 否 | 是 | 贷款类型 F01:流动资金贷款； F02:项目融资； F03:固定资产贷款； F04:其他； 示例：F01 |
| loanContract | string | 否 | 是 | 贷款合同号 |
| isInnerLoan | string | 否 | 是 | 是否内部贷款 01：内部贷款； 02：外部贷款； |
| loanUnitCode | string | 否 | 是 | 贷款单位编码 |
| loanUnitName | string | 否 | 是 | 贷款单位 |
| lendUnitCode | string | 否 | 否 | 放款单位编码 |
| lendUnitName | string | 否 | 是 | 放款单位 |
| guaranteeType | string | 否 | 是 | 担保方式 1：质押贷款； 2：抵押贷款； 3：保证贷款； 4：信用/免担保贷款； 5：组合担保； 6：其他 |
| currency | string | 否 | 是 | 币种id |
| loanMoney | number |
| 小数位数:2,最大长度:32 | 否 | 是 | 贷款金额 |
| loanDay | string | 否 | 是 | 放款日 yyyy-MM-dd 示例：2025-01-11 |
| loanTerm | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 贷款期限 |
| rateLevel | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 利率水平 |
| loanBalance | number |
| 小数位数:2,最大长度:32 | 否 | 是 | 贷款余额 |
| financeArea | string | 否 | 是 | 国家地区 示例：中国 |
| sourceId | string | 否 | 是 | 外部数据来源id |

## 3. 请求示例

Url: /yonbip/ctm/submit/api/group/bank/bill/insert?access_token=访问令牌
Body: {
	"dataDate": "2025-01-01",
	"submitType": "BANK",
	"detailList": [
		{
			"submitGroupCreditCode": "",
			"submitGroupName": "",
			"dataSource": "FINANCE_MANG",
			"loanType": "F01",
			"loanContract": "",
			"isInnerLoan": "",
			"loanUnitCode": "",
			"loanUnitName": "",
			"lendUnitCode": "",
			"lendUnitName": "",
			"guaranteeType": "",
			"currency": "",
			"loanMoney": 0,
			"loanDay": "2025-01-11",
			"loanTerm": 0,
			"rateLevel": 0,
			"loanBalance": 0,
			"financeArea": "中国",
			"sourceId": ""
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


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

