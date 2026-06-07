---
title: "合同变更更新"
apiId: "1477224898959507463"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Change"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同变更更新

> `ContentType	application/json` 请求方式	POST | 分类: Contract Change (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/apct/openapi/bill/changeupdate

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
| data | object | 否 | 是 | 请求数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 是 | 更新的变更单id 示例：1498960749176291334 |
| code | string | 否 | 否 | 变更单code 示例：1498960749176291334 |
| acctEntityId | string | 否 | 否 | 会计主体 （支持id或code） 示例：2536246218019840 |
| businessCode | string | 否 | 否 | 合同业务号 示例：yewuhao |
| name | string | 否 | 否 | 合同名称 示例：hetongmingcheng |
| signDate | string | 否 | 否 | 签字盖章日期(格式：yyyy-MM-dd ，盖章日期 <= 计划生效日期 <= 计划终止日期) 示例：2022-07-08 |
| valDate | string | 否 | 否 | 计划生效日期(格式：yyyy-MM-dd ，盖章日期 <= 计划生效日期 <= 计划终止日期) 示例：2022-07-08 |
| invalDate | string | 否 | 否 | 计划终止日期(格式：yyyy-MM-dd， 盖章日期 <= 计划生效日期 <= 计划终止日期) 示例：2022-07-08 |
| orgId | string | 否 | 否 | 承办组织 （支持id或code） 示例：2536246218019840 |
| deptId | string | 否 | 否 | 承办部门 （支持id或code） 示例：2728562935255296 |
| personnelId | string | 否 | 否 | 承办人员 （支持id或code） 示例：1448577887859376133 |
| currencyId | string | 否 | 否 | 币种 （支持id或code，合同关联申请时,不可修改） 示例：2533086218409221 |
| rateTypeId | string | 否 | 否 | 汇率类型 （支持id或code，合同关联申请时,不可修改） 示例：0000KWEB7NON92GMJ40000 |
| rateDate | string | 否 | 否 | 汇率日期(格式：yyyy-MM-dd，合同关联申请时,不可修改) 示例：2022-07-08 |
| nexchangeRate | double | 否 | 否 | 折本汇率（，合同关联申请时,不可修改） 示例：6.3623 |
| settleTypeId | string | 否 | 否 | 结算方式 （支持id或code） 示例：2529163284271689 |
| exceedRatio | BigDecimal | 否 | 否 | 超合同付款比例 示例：10 |
| projectId | string | 否 | 否 | 项目 （支持id或code） 示例：1487658611453198336 |
| payerAccountId | string | 否 | 否 | 付款方账户（支持id或code） 示例：1325444173725903 |
| payerCardno | string | 否 | 否 | 付款方银行账号 示例：6217003810026896707 |
| supplierId | string | 否 | 否 | 供应商 （支持id或code） 示例：2551783630229760 |
| payeeAccountId | long | 否 | 否 | 收款方账户id 示例：2551783630229771 |
| payeeCardno | string | 否 | 否 | 收款方银行账号 示例：6217003810026896707 |
| originalTotalAmt | BigDecimal | 否 | 否 | 原币价税合计【收支方向为支出时必填】 示例：100 |
| roriginalTotalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 原币收款金额【收支方向为收入时必传】 |
| customer | string | 否 | 否 | 客户id（支持id或code） |
| beginningFlag | string | 否 | 否 | 期初标志 示例：1 |
| openFlag | string | 否 | 否 | 是否敞口合同（1：是 ,0：否） 示例：0 |
| populateMode | string | 否 | 否 | 计划金额计算方式1：按比例计算；2：手工填写金额；3：按协议分摊；4：来源上游单据 示例：1 |
| applyBillId | string | 否 | 否 | 申请单号id（仅当合同合同为非期初beginningFlag=0 可填） 示例：2533086218605645 |
| reason | string | 否 | 否 | 变更原因 |
| plans | object | 是 | 否 | 付款计划集合 |
| receiptplans | object | 否 | 否 | 收款计划计划 |
| materials | object | 是 | 否 | 标的物 |
| apctChangeCounterpartys | object | 是 | 否 | 合同变更单相对方 |

## 3. 请求示例

Url: /yonbip/znbz/apct/openapi/bill/changeupdate?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1498960749176291334",
		"code": "1498960749176291334",
		"acctEntityId": "2536246218019840",
		"businessCode": "yewuhao",
		"name": "hetongmingcheng",
		"signDate": "2022-07-08",
		"valDate": "2022-07-08",
		"invalDate": "2022-07-08",
		"orgId": "2536246218019840",
		"deptId": "2728562935255296",
		"personnelId": "1448577887859376133",
		"currencyId": "2533086218409221",
		"rateTypeId": "0000KWEB7NON92GMJ40000",
		"rateDate": "2022-07-08",
		"nexchangeRate": 6.3623,
		"settleTypeId": "2529163284271689",
		"exceedRatio": 10,
		"projectId": "1487658611453198336",
		"payerAccountId": "1325444173725903",
		"payerCardno": "6217003810026896707",
		"supplierId": "2551783630229760",
		"payeeAccountId": 2551783630229771,
		"payeeCardno": "6217003810026896707",
		"originalTotalAmt": 100,
		"roriginalTotalAmt": 0,
		"customer": "",
		"beginningFlag": "1",
		"openFlag": "0",
		"populateMode": "1",
		"applyBillId": "2533086218605645",
		"reason": "",
		"plans": [
			{
				"_status": "Update",
				"id": "",
				"planName": "",
				"code": "FKJH202207083020",
				"planAmt": 100,
				"marginFlag": "0",
				"advanceFlag": "0",
				"planRatio": 100,
				"condition": "this is a condition",
				"beginDate": "2022-07-08",
				"accountDays": 1,
				"payEndDate": "2022-07-08",
				"expenseitemId": "1450866117566267401",
				"amtTypeId": "2722781149614337",
				"customer": "",
				"supplierId": "",
				"issueNo": "",
				"rowNo": ""
			}
		],
		"receiptplans": {
			"_status": "",
			"id": "",
			"issueNo": "",
			"planName": "",
			"planRatio": 0,
			"planAmt": 0,
			"amtTypeId": "",
			"condition": "",
			"expenseitemId": "",
			"advanceFlag": "0",
			"marginFlag": "0",
			"beginDate": "2026-06-07 12:01:23",
			"payEndDate": "2026-06-07 12:01:23",
			"accountDays": 0,
			"supplierId": "",
			"customer": ""
		},
		"materials": [
			{
				"_status": "Update",
				"id": "",
				"originalTotalAmt": 100,
				"expenseitemId": "1450866117566267401",
				"materialTypeId": "",
				"profitCenter": "",
				"quantity": "",
				"unit_name": "",
				"taxSubject": "",
				"originalPrice": 0,
				"noTaxOriginalPrice": 0,
				"localPrice": 0,
				"noTaxLocalPrice": 0,
				"localMoney": 0
			}
		],
		"apctChangeCounterpartys": [
			{
				"supplierId": "",
				"customerId": "",
				"payAccountId": ""
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
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 请求数据 |
| ctId | long | 否 | 合同id 示例：1498960749176291334 |
| reason | string | 否 | 变更原因 示例：123 |
| bustype | string | 否 | 变更单类型 示例：2533086218605645 |
| code | string | 否 | 变更单单据号 示例：BGD202207130034 |
| acctEntityId | string | 否 | 会计主体 示例：2536246218019840 |
| businessCode | string | 否 | 合同业务号 示例：yewuhao |
| name | string | 否 | 合同名称 示例：hetongmingcheng |
| signDate | string | 否 | 签字盖章日期 示例：2022-07-08 |
| valDate | string | 否 | 计划生效日期 示例：2022-07-08 |
| invalDate | string | 否 | 计划终止日期 示例：2022-07-08 |
| orgId | string | 否 | 承办组织 示例：2536246218019840 |
| deptId | string | 否 | 承办部门 示例：2728562935255296 |
| personnelId | string | 否 | 承办人员 示例：1448577887859376133 |
| currencyId | string | 否 | 币种 示例：2533086218409221 |
| rateTypeId | string | 否 | 汇率类型 示例：0000KWEB7NON92GMJ40000 |
| rateDate | string | 否 | 汇率日期 示例：2022-07-08 |
| nexchangeRate | BigDecimal | 否 | 折本汇率 示例：6.3623 |
| settleTypeId | long | 否 | 结算方式 示例：2529163284271689 |
| exceedRatio | BigDecimal | 否 | 超合同付款比例 示例：10 |
| projectId | string | 否 | 项目 示例：1487658611453198336 |
| payerAccountId | string | 否 | 付款方账户 示例：1325444173725903 |
| payerCardno | string | 否 | 付款方银行账号 示例：6217003810026896707 |
| supplierId | long | 否 | 供应商 示例：2551783630229760 |
| payeeAccountId | long | 否 | 收款方账户id 示例：2551783630229771 |
| payeeCardno | string | 否 | 收款方银行账号 示例：6217003810026896707 |
| originalTotalAmt | BigDecimal | 否 | 原币价税合计 示例：100 |
| plans | object | 是 | 付款计划集合 |
| materials | object | 是 | 标的物 |
| apctChangeCounterpartys | object | 是 | 合同变更单相对方 |

## 5. 正确返回示例

{
	"displayCode": "",
	"code": "200",
	"message": "操作成功",
	"data": {
		"ctId": 1498960749176291334,
		"reason": "123",
		"bustype": "2533086218605645",
		"code": "BGD202207130034",
		"acctEntityId": "2536246218019840",
		"businessCode": "yewuhao",
		"name": "hetongmingcheng",
		"signDate": "2022-07-08",
		"valDate": "2022-07-08",
		"invalDate": "2022-07-08",
		"orgId": "2536246218019840",
		"deptId": "2728562935255296",
		"personnelId": "1448577887859376133",
		"currencyId": "2533086218409221",
		"rateTypeId": "0000KWEB7NON92GMJ40000",
		"rateDate": "2022-07-08",
		"nexchangeRate": 6.3623,
		"settleTypeId": 2529163284271689,
		"exceedRatio": 10,
		"projectId": "1487658611453198336",
		"payerAccountId": "1325444173725903",
		"payerCardno": "6217003810026896707",
		"supplierId": 2551783630229760,
		"payeeAccountId": 2551783630229771,
		"payeeCardno": "6217003810026896707",
		"originalTotalAmt": 100,
		"plans": [
			{
				"planName": "",
				"code": "FKJH202207083020",
				"planAmt": 100,
				"advanceFlag": 0,
				"marginFlag": 0,
				"planRatio": 100,
				"condition": "this is a condition",
				"beginDate": "2022-07-08",
				"accountDays": 1,
				"payEndDate": "2022-07-08",
				"expenseitemId": 1450866117566267401,
				"amtTypeId": 2722781149614337
			}
		],
		"materials": [
			{
				"originalTotalAmt": 100,
				"expenseitemId": 1450866117566267401
			}
		],
		"apctChangeCounterpartys": [
			{
				"supplierId": "",
				"customerId": "",
				"payAccountId": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	请求失败，未查找到变更单。	变更单不存在，请新增后重试


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

