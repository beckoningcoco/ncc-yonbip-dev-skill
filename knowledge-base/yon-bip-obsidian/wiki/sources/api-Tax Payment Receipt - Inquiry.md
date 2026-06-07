---
title: "税费缴款单-查询"
apiId: "2137760254551130119"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Payment Form"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Payment Form]
platform_version: "BIP"
source_type: community-api-docs
---

# 税费缴款单-查询

> `ContentType	application/json` 请求方式	POST | 分类: Tax Payment Form (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/other-tax/api/declare/deduct/query

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
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：52370300MJE1351122 |
| declareStart | string | 否 | 是 | 税款所属期起 示例：2024-10-01 |
| declareEnd | string | 否 | 是 | 税款所属期止 示例：2024-10-31 |
| taxCategory | string | 否 | 否 | 税种 示例：增值税 |
| periodType | string | 否 | 否 | 填报周期（月-0；季-1；次-4；年-2；半年-3） 示例：1 |
| reportName | string | 否 | 否 | 申报表名称 示例：增值税—一般纳税人 |

## 3. 请求示例

Url: /yonbip/tax/other-tax/api/declare/deduct/query?access_token=访问令牌
Body: {
	"nsrsbh": "52370300MJE1351122",
	"declareStart": "2024-10-01",
	"declareEnd": "2024-10-31",
	"taxCategory": "增值税",
	"periodType": "1",
	"reportName": "增值税—一般纳税人"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 提示信息 示例：操作成功 |
| datas | object | 是 | 缴款单数据 |
| entFilingBasicId | string | 否 | 税务基础档案id |
| nsrsbh | string | 否 | 纳税人识别号 示例：91120116681888972M |
| areaCode | string | 否 | 地区编码 示例：12 |
| year | string | 否 | 年份 示例：2024 |
| periodQuarter | string | 否 | 填报周期 示例：10 |
| sbType | string | 否 | 申报类型 示例：4 |
| taxType | string | 否 | 申报内容 示例：5 |
| periodType | string | 否 | 填报周期类型 示例：4 |
| sourceType | number |
| 小数位数:0,最大长度:10 | 否 | 来源类型(0、手工新增;1、申报表-自动创建;2、申报表-手工新增) 示例：1 |
| tripAgreementNo | string | 否 | 三方协议号 |
| paymentAcc | string | 否 | 缴款账号 示例：2222222 |
| oughtPayAmount | number |
| 小数位数:2,最大长度:15 | 否 | 应缴纳金额 示例：1.5 |
| actualPayAmount | string | 否 | 实际缴纳金额 |
| actualPaymentTax | number |
| 小数位数:2,最大长度:15 | 否 | 实际缴纳增值税/消费税 示例：0 |
| actualPaymentCity | number |
| 小数位数:2,最大长度:15 | 否 | 实际缴纳城市维护建设税 示例：0 |
| actualPaymentEducation | number |
| 小数位数:2,最大长度:15 | 否 | 实际缴纳教育费附加 示例：0 |
| actualPaymentLocal | number |
| 小数位数:2,最大长度:15 | 否 | 实际缴纳地方教育附加 示例：0 |
| deductStatus | number |
| 小数位数:2,最大长度:15 | 否 | 缴款状态 示例：0 |
| deductTime | string | 否 | 缴款时间 示例：2024-11 |
| deductDate | string | 否 | 缴款成功日期 |
| declareOrderApplyId | string | 否 | 申报表id 示例：2111319937562705925 |
| declareStart | string | 否 | 申报所属期起 示例：2024-10-15 |
| declareEnd | string | 否 | 申报所属期止 示例：2024-10-15 |
| userName | string | 否 | 操作人 |
| deductWay | string | 否 | 缴款方式:0.线上缴款。1.线下缴款 |
| commitId | string | 否 | 提交人 |
| commitName | string | 否 | 提交人名称 |
| mainTaxOfficeId | string | 否 | 主管税务机关id 示例：000048b359ee4e338d9872f8d1c2c011 |
| mainTaxOfficeName | string | 否 | 主管税务机关名称 示例：国家税务总局福建福安经济开发区税务局 |
| taxCategoryId | string | 否 | 税种id 示例：10001 |
| taxCategoryCode | string | 否 | 税种编码 示例：SD |
| taxCategoryName | string | 否 | 税种名称 示例：印花税 |
| prepay | string | 否 | 是否预缴 (1是 0 否) 示例：0 |
| requestAmount | number |
| 小数位数:2,最大长度:15 | 否 | 请款金额 示例：1.5 |
| requestAmountPure | number |
| 小数位数:2,最大长度:15 | 否 | 增值税/消费税请款金额 示例：1 |
| requestAmountCity | number |
| 小数位数:2,最大长度:15 | 否 | 城市维护建设费请款金额 示例：123 |
| requestAmountLocal | number |
| 小数位数:2,最大长度:15 | 否 | 地方教育附加费请款金额 示例：1 |
| requestAmountEdu | number |
| 小数位数:2,最大长度:15 | 否 | 教育附加费请款金额 示例：10 |
| approvedAmount | string | 否 | 审批金额 |
| taxableIncome | number |
| 小数位数:2,最大长度:15 | 否 | 应税收入 示例：0 |
| reducedTax | number |
| 小数位数:2,最大长度:15 | 否 | 减免税额 示例：0 |
| entFilingTripAgreementId | string | 否 | 三方协议ID 示例：1879514934784557065 |
| paymentBankBranch | string | 否 | 营业银行网点 示例：默认银行 |
| oughtPayAmountPure | number |
| 小数位数:2,最大长度:15 | 否 | 增值税/消费税申报金额 示例：0 |
| oughtPayAmountCity | number |
| 小数位数:2,最大长度:15 | 否 | 城市维护建设税申报金额 示例：0 |
| oughtPayAmountEducation | number |
| 小数位数:2,最大长度:15 | 否 | 教育费附加申报金额 示例：0 |
| oughtPayAmountLocal | number |
| 小数位数:2,最大长度:15 | 否 | 地方教育附加申报金额 示例：0 |
| reducedTaxPure | number |
| 小数位数:2,最大长度:15 | 否 | 增值税/消费税减免税额 示例：0 |
| reducedTaxCity | number |
| 小数位数:2,最大长度:15 | 否 | 城市维护建设税减免税额 示例：0 |
| reducedTaxEducation | number |
| 小数位数:2,最大长度:15 | 否 | 教育费附加减免税额 示例：0 |
| reducedTaxLocal | number |
| 小数位数:2,最大长度:15 | 否 | 地方教育附加减免税额 示例：0 |
| certificateStatus | string | 否 | 完税凭证归档状态 示例：0 |
| taxDeclareDeductGroupId | string | 否 | 税金缴款单主表ID 示例：2111809391941386244 |
| createTime | string | 否 | 创建时间 示例：2024-10-16 10:49:31 |
| modifyTime | string | 否 | 修改时间 示例：2024-11-12 15:10:50 |
| creator | string | 否 | 创建人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| modifier | string | 否 | 修改人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| id | string | 否 | 税费缴款明细ID 示例：2111809400531320838 |
| declareDate | string | 否 | 申报成功日期 示例：2024-10-16 |
| correctStatus | string | 否 | 更正状态 示例：0 |
| correctType | string | 否 | 更正类型 |
| code | string | 否 | 单据编码 示例：SFJK1846382936871440384 |
| deductPeriod | string | 否 | 缴款期间 示例：2024-11 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"datas": [
		{
			"entFilingBasicId": "",
			"nsrsbh": "91120116681888972M",
			"areaCode": "12",
			"year": "2024",
			"periodQuarter": "10",
			"sbType": "4",
			"taxType": "5",
			"periodType": "4",
			"sourceType": 1,
			"tripAgreementNo": "",
			"paymentAcc": "2222222",
			"oughtPayAmount": 1.5,
			"actualPayAmount": "",
			"actualPaymentTax": 0,
			"actualPaymentCity": 0,
			"actualPaymentEducation": 0,
			"actualPaymentLocal": 0,
			"deductStatus": 0,
			"deductTime": "2024-11",
			"deductDate": "",
			"declareOrderApplyId": "2111319937562705925",
			"declareStart": "2024-10-15",
			"declareEnd": "2024-10-15",
			"userName": "",
			"deductWay": "",
			"commitId": "",
			"commitName": "",
			"mainTaxOfficeId": "000048b359ee4e338d9872f8d1c2c011",
			"mainTaxOfficeName": "国家税务总局福建福安经济开发区税务局",
			"taxCategoryId": "10001",
			"taxCategoryCode": "SD",
			"taxCategoryName": "印花税",
			"prepay": "0",
			"requestAmount": 1.5,
			"requestAmountPure": 1,
			"requestAmountCity": 123,
			"requestAmountLocal": 1,
			"requestAmountEdu": 10,
			"approvedAmount": "",
			"taxableIncome": 0,
			"reducedTax": 0,
			"entFilingTripAgreementId": "1879514934784557065",
			"paymentBankBranch": "默认银行",
			"oughtPayAmountPure": 0,
			"oughtPayAmountCity": 0,
			"oughtPayAmountEducation": 0,
			"oughtPayAmountLocal": 0,
			"reducedTaxPure": 0,
			"reducedTaxCity": 0,
			"reducedTaxEducation": 0,
			"reducedTaxLocal": 0,
			"certificateStatus": "0",
			"taxDeclareDeductGroupId": "2111809391941386244",
			"createTime": "2024-10-16 10:49:31",
			"modifyTime": "2024-11-12 15:10:50",
			"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"id": "2111809400531320838",
			"declareDate": "2024-10-16",
			"correctStatus": "0",
			"correctType": "",
			"code": "SFJK1846382936871440384",
			"deductPeriod": "2024-11"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	错误提示信息	错误提示信息


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

