---
title: "合同新增"
apiId: "1476511453352034309"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Register"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Register]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同新增

> `ContentType	application/json` 请求方式	POST | 分类: Contract Register (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/apct/openapi/bill/add

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
| code | string | 否 | 否 | 合同单据号（手工编码时必填，自动编码时非必填） 示例：danjuhao |
| contractDirection | string | 否 | 否 | 收支方向，1：收入；2：支出 示例：2 |
| pushBillSystem | string | 否 | 否 | 下推单据系统，znbzbx：费控服务，EAP：应付管理，EAR：应收管理 示例：znbzbx |
| acctEntityId | string | 否 | 是 | 会计主体 （支持id或code） 示例：2536246218019840 |
| vouchdate | string | 否 | 是 | 单据日期(格式：yyyy-MM-dd) 示例：2022-07-08 |
| businessCode | string | 否 | 否 | 合同业务号 示例：yewuhao |
| name | string | 否 | 是 | 合同名称 示例：hetongmingcheng |
| bustype | string | 否 | 是 | 合同类型 （支持id或code） 示例：2533086218605645 |
| isprojectapply | string | 否 | 否 | 引用申请单是否为立项申请 （ 1：是，0：否 ;合同为期初合同beginningFlag=1时 不可引用申请单该值默认为0） 示例：2533086218605645 默认值：0 |
| signDate | string | 否 | 否 | 签字盖章日期(格式：yyyy-MM-dd ，盖章日期 <= 计划生效日期 <= 计划终止日期) 示例：2022-07-08 |
| valDate | string | 否 | 否 | 计划生效日期(格式：yyyy-MM-dd ，盖章日期 <= 计划生效日期 <= 计划终止日期) 示例：2022-07-08 |
| invalDate | string | 否 | 否 | 计划终止日期(格式：yyyy-MM-dd， 盖章日期 <= 计划生效日期 <= 计划终止日期) 示例：2022-07-08 |
| applyBillId | string | 否 | 否 | 申请单id （仅当合同合同为非期初beginningFlag=0 可填） 示例：2533086218605645 |
| orgId | string | 否 | 否 | 承办组织 （支持id或code） 示例：2536246218019840 |
| deptId | string | 否 | 否 | 承办部门 （支持id或code） 示例：2728562935255296 |
| personnelId | string | 否 | 否 | 承办人员 （支持id或code） 示例：1448577887859376133 |
| currencyId | string | 否 | 是 | 币种 （支持id或code） 示例：2533086218409221 |
| currencyId_priceDigit | long | 否 | 否 | 币种单价精度 示例：2 |
| currencyId_moneyDigit | long | 否 | 否 | 币种金额精度 示例：4 |
| rateTypeId | string | 否 | 否 | 汇率类型 （支持id或code） 示例：0000KWEB7NON92GMJ40000 |
| rateTypeId_digit | long | 否 | 否 | 汇率精度 示例：6 |
| rateDate | string | 否 | 否 | 汇率日期(格式：yyyy-MM-dd) 示例：2022-07-08 |
| nexchangeRate | double | 否 | 是 | 折本汇率 示例：6.3623 |
| settleTypeId | string | 否 | 否 | 结算方式 （支持id或code） 示例：2529163284271689 |
| populateMode | long | 否 | 是 | 计划金额计算方式，1：按比例计算；2：手工填写金额；3：按协议分摊；4：来源上游单据 示例：1 |
| exceedRatio | BigDecimal | 否 | 是 | 超合同付款比例 示例：10 |
| openFlag | long | 否 | 是 | 是否敞口合同 （1：是 ,0：否） 示例：0 |
| projectId | string | 否 | 否 | 项目 （支持id或code） 示例：1487658611453198336 |
| beginningFlag | long | 否 | 是 | 期初标识（1：是,0:否） 示例：0 |
| signOrgId | string | 否 | 是 | 签约组织(本方) （支持id或code） 示例：2536246218019840 |
| payerAccountId | string | 否 | 否 | 付款方账户（支持id或code） 示例：1325444173725903 |
| payerCardno | string | 否 | 否 | 付款方银行账号 示例：6217003810026896707 |
| supplierId | string | 否 | 否 | 供应商 （支持id或code） 示例：2551783630229760 |
| customer | string | 否 | 否 | 客户 示例：1986373197203767300 |
| payeeAccountId | long | 否 | 否 | 收款方账户id 示例：2551783630229771 |
| payeeCardno | string | 否 | 否 | 收款方银行账号 示例：6217003810026896707 |
| originalTotalAmt | BigDecimal | 否 | 是 | 原币付款金额 示例：100 默认值：0 |
| roriginalTotalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 原币收款金额 示例：99 默认值：0 |
| originalReceiptAmt | BigDecimal | 否 | 否 | 原币收票金额 (仅当当前合同为期初合同beginningFlag=1时，可填) 示例：0 |
| creatorId | long | 否 | 是 | 制单人id |
| creator | string | 否 | 是 | 制单人姓名 |
| plans | object | 是 | 否 | 付款计划集合 |
| receiptplans | object | 是 | 否 | 收款计划集合 |
| margins | object | 是 | 否 | 履约保证金集合 |
| memorabilias | object | 是 | 否 | 合同大事记 |
| materials | object | 是 | 否 | 标的物 |
| apctownersub | object | 是 | 是 | 合同所属人 |
| apctCounterpartys | object | 是 | 否 | 合同相对方 |

## 3. 请求示例

Url: /yonbip/znbz/apct/openapi/bill/add?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "danjuhao",
		"contractDirection": "2",
		"pushBillSystem": "znbzbx",
		"acctEntityId": "2536246218019840",
		"vouchdate": "2022-07-08",
		"businessCode": "yewuhao",
		"name": "hetongmingcheng",
		"bustype": "2533086218605645",
		"isprojectapply": "2533086218605645",
		"signDate": "2022-07-08",
		"valDate": "2022-07-08",
		"invalDate": "2022-07-08",
		"applyBillId": "2533086218605645",
		"orgId": "2536246218019840",
		"deptId": "2728562935255296",
		"personnelId": "1448577887859376133",
		"currencyId": "2533086218409221",
		"currencyId_priceDigit": 2,
		"currencyId_moneyDigit": 4,
		"rateTypeId": "0000KWEB7NON92GMJ40000",
		"rateTypeId_digit": 6,
		"rateDate": "2022-07-08",
		"nexchangeRate": 6.3623,
		"settleTypeId": "2529163284271689",
		"populateMode": 1,
		"exceedRatio": 10,
		"openFlag": 0,
		"projectId": "1487658611453198336",
		"beginningFlag": 0,
		"signOrgId": "2536246218019840",
		"payerAccountId": "1325444173725903",
		"payerCardno": "6217003810026896707",
		"supplierId": "2551783630229760",
		"customer": "1986373197203767300",
		"payeeAccountId": 2551783630229771,
		"payeeCardno": "6217003810026896707",
		"originalTotalAmt": 100,
		"roriginalTotalAmt": 99,
		"originalReceiptAmt": 0,
		"creatorId": 0,
		"creator": "",
		"plans": [
			{
				"code": "FKJH202207083020",
				"planName": "如：第一期，第二期",
				"planAmt": 100,
				"advanceFlag": "0",
				"marginFlag": "0",
				"unapprAmt": 0,
				"apprAmt": 0,
				"paidAmt": 0,
				"apprPlanRefundAmt": 0,
				"planRatio": 100,
				"condition": "this is a condition",
				"beginDate": "2022-07-08",
				"accountDays": 1,
				"payEndDate": "2022-07-08",
				"expenseitemId": "1450866117566267401",
				"amtTypeId": "2722781149614337",
				"supplierId": "2551783630229760",
				"customer": "",
				"settleModeId": ""
			}
		],
		"receiptplans": [
			{
				"code": "",
				"planAmt": 0,
				"advanceFlag": "",
				"marginFlag": "",
				"planRatio": 0,
				"amtTypeId": "",
				"planName": "如：第一期，第二期",
				"supplierId": "2551783630229760",
				"customer": "",
				"settleModeId": ""
			}
		],
		"margins": [
			{
				"code": "LYBZJ20220708486",
				"acctAmt": 1,
				"unapprRefundAmt": 0,
				"apprRefundAmt": 0,
				"refundedAmt": 0,
				"acctDate": "2022-07-09",
				"receiptNum": "shoukuandanhao"
			}
		],
		"memorabilias": [
			{
				"code": "dashijibianma",
				"content": "dashijineirong",
				"note": "dashijibeizhu"
			}
		],
		"materials": [
			{
				"originalTotalAmt": 100,
				"expenseitemId": "1450866117566267401",
				"projectId": "",
				"material": "",
				"takerOrg": "",
				"rowNo": 0,
				"contractDirection": "",
				"payTermId": "",
				"quantity": "",
				"unit": "",
				"taxSubject": "",
				"taxRateId": "",
				"originalPrice": 0,
				"noTaxOriginalPrice": 0,
				"originalTax": 0,
				"noTaxOriginalMoney": 0,
				"pk_projectapply": ""
			}
		],
		"apctownersub": [
			{
				"ownerId": "1448407351883202564"
			}
		],
		"apctCounterpartys": [
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
| code | string | 否 | 合同单据号 示例：200 |
| message | string | 否 | 响应信息 示例：操作成功 |
| data | object | 否 | 请求数据 |
| apprMarginAmt | BigDecimal | 否 | 已审批原币退保证金金额 示例：0 |
| marginAmt | BigDecimal | 否 | 原币已收保证金金额 示例：0 |
| populateMode | long | 否 | 计划金额计算方式，1：按比例计算；2：手工填写金额；3：按协议分摊；4：来源上游单据 示例：1 |
| availableAmt | BigDecimal | 否 | 合同可用金额 示例：1 |
| ctVersion | string | 否 | 合同版本号 示例：1.0 |
| unapprAdvanceAmt | BigDecimal | 否 | 未审批原币预付款金额 示例：0 |
| nexchangeRate | long | 否 | 折本汇率 示例：1 |
| beginningFlag | long | 否 | 期初标识（1：是,0:否） 示例：0 |
| exceedRatio | long | 否 | 超合同付款比例 示例：0 |
| id | long | 否 | id 示例：1492830035549618177 |
| currencyId | string | 否 | 币种 示例：1456643114872078364 |
| signOrgId | string | 否 | 签约组织(本方) 示例：1460943090114101250 |
| pushBillSystem | string | 否 | 下推单据系统，znbzbx：费控服务，EAP：应付管理，EAR：应收管理 |
| isprojectapply | string | 否 | 引用申请单是否为立项申请 （1：是，0：否） 示例：2533086218605645 默认值：0 |
| applyBillId | string | 否 | 申请单id 示例：2533086218605645 |
| contractDirection | string | 否 | 收支方向，1：收入；2：支出 |
| unapprAmt | BigDecimal | 否 | 未审批原币付款金额 示例：0 |
| apprAdvanceAmt | BigDecimal | 否 | 已审批原币预付款金额 示例：0 |
| rateTypeId_digit | BigDecimal | 否 | 汇率精度 示例：6 |
| isWfControlled | boolean | 否 | 是否流程控制 示例：true |
| paidRetentionAmt | BigDecimal | 否 | 原币已付质保金金额 示例：0 |
| marginRefundAmt | BigDecimal | 否 | 原币已退保证金金额 示例：0 |
| acctEntityId | string | 否 | 会计主体 示例：1460943090114101250 |
| originalReceiptAmt | BigDecimal | 否 | 原币收票金额 示例：0 |
| apprAmt | BigDecimal | 否 | 已审批原币付款金额 示例：0 |
| version | string | 否 | 锁版本号 示例：2 |
| unapprMarginAmt | BigDecimal | 否 | 未审批原币退保证金金额 示例：0 |
| openFlag | long | 否 | 敞口合同 示例：0 |
| unapprRetentionAmt | BigDecimal | 否 | 未审批原币质保金金额 示例：0 |
| financeOrgCurrencyId | string | 否 | 财务组织币种 示例：1456643114872078364 |
| name | string | 否 | 合同名称 示例：test |
| status | long | 否 | 合同状态 （自由：0, 审批通过:1, 审批不通过:2, 审批中:3, 生效:6665, 冻结: 6666, 终止:6667, 变更中:6668） 示例：0 |
| apprSubjectAmt | BigDecimal | 否 | 已审批原币应付金额 示例：0 |
| code | string | 否 | 合同单据号 示例：FKHT202207050131 |
| supplierId | long | 否 | 供应商 示例：1473642878930518025 |
| apprRetentionAmt | BigDecimal | 否 | 未审批原币质保金金额 示例：0 |
| settledcount | long | 否 | 已审批原币付款次数 示例：0 |
| customer | string | 否 | 客户 |
| creatorId | long | 否 | 创建人 示例：1461040774853427205 |
| paidAdvanceAmt | BigDecimal | 否 | 原币已付预付款金额 示例：0 |
| orgId | string | 否 | 承办组织 示例：1460943090114101250 |
| vouchdate | string | 否 | 单据日期 示例：2022-07-05 00:00:00 |
| unapprSubjectAmt | BigDecimal | 否 | 未审批原币应付金额 示例：0 |
| pubts | string | 否 | 时间戳 示例：2022-07-05 10:31:30 |
| createDate | string | 否 | 制单日期 示例：2022-07-05 10:31:29 |
| creator | string | 否 | 制单人 示例：李书俊 |
| verfitySubjectAmt | BigDecimal | 否 | 已核销原币应付金额 示例：0 |
| paidAmt | BigDecimal | 否 | 原币已付款金额 示例：0 |
| bustype | string | 否 | 合同类型 示例：1456643114872079031 |
| createTime | string | 否 | 创建单据时间 示例：2022-07-05 10:31:29 |
| apprPlanRefundAmt | BigDecimal | 否 | 已审批原币退款金额 示例：0 |
| originalTotalAmt | BigDecimal | 否 | 原币付款金额 示例：1 |
| usedAmt | BigDecimal | 否 | 合同已用金额 示例：0 |
| plans | object | 是 | 付款计划集合 |
| roriginalTotalAmt | string | 否 | 原币收款金额 |
| margins | object | 是 | 履约保证金集合 |
| memorabilias | object | 是 | 合同大事记 |
| receiptplans | object | 是 | 收款计划集合 |
| materials | object | 是 | 标的物 |
| apctownersub | object | 是 | 合同所属人 |
| apctCounterpartys | object | 是 | 合同相对方 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"apprMarginAmt": 0,
		"marginAmt": 0,
		"populateMode": 1,
		"availableAmt": 1,
		"ctVersion": "1.0",
		"unapprAdvanceAmt": 0,
		"nexchangeRate": 1,
		"beginningFlag": 0,
		"exceedRatio": 0,
		"id": 1492830035549618177,
		"currencyId": "1456643114872078364",
		"signOrgId": "1460943090114101250",
		"pushBillSystem": "",
		"isprojectapply": "2533086218605645",
		"applyBillId": "2533086218605645",
		"contractDirection": "",
		"unapprAmt": 0,
		"apprAdvanceAmt": 0,
		"rateTypeId_digit": 6,
		"isWfControlled": true,
		"paidRetentionAmt": 0,
		"marginRefundAmt": 0,
		"acctEntityId": "1460943090114101250",
		"originalReceiptAmt": 0,
		"apprAmt": 0,
		"version": "2",
		"unapprMarginAmt": 0,
		"openFlag": 0,
		"unapprRetentionAmt": 0,
		"financeOrgCurrencyId": "1456643114872078364",
		"name": "test",
		"status": 0,
		"apprSubjectAmt": 0,
		"code": "FKHT202207050131",
		"supplierId": 1473642878930518025,
		"apprRetentionAmt": 0,
		"settledcount": 0,
		"customer": "",
		"creatorId": 1461040774853427205,
		"paidAdvanceAmt": 0,
		"orgId": "1460943090114101250",
		"vouchdate": "2022-07-05 00:00:00",
		"unapprSubjectAmt": 0,
		"pubts": "2022-07-05 10:31:30",
		"createDate": "2022-07-05 10:31:29",
		"creator": "李书俊",
		"verfitySubjectAmt": 0,
		"paidAmt": 0,
		"bustype": "1456643114872079031",
		"createTime": "2022-07-05 10:31:29",
		"apprPlanRefundAmt": 0,
		"originalTotalAmt": 1,
		"usedAmt": 0,
		"plans": [
			{
				"apprSubjectAmt": 0,
				"ctId": 1492830035549618177,
				"code": "FKJH202207058429",
				"verfitySubjectAmt": 0,
				"paidAmt": 0,
				"advanceFlag": 0,
				"marginFlag": 0,
				"apprAmt": 0,
				"planAmt": 1,
				"planRatio": 100,
				"unapprSubjectAmt": 0,
				"apprPlanRefundAmt": 0,
				"id": 1492830035549618178,
				"unapprAmt": 0,
				"pubts": "2022-07-05 10:31:29",
				"accountDays": 0,
				"planName": "如：第一期，第二期"
			}
		],
		"roriginalTotalAmt": "",
		"margins": [
			{
				"code": "LYBZJ20220708486",
				"acctAmt": 1,
				"unapprRefundAmt": 0,
				"apprRefundAmt": 0,
				"refundedAmt": 0,
				"acctDate": "2022-07-09",
				"receiptNum": "shoukuandanhao"
			}
		],
		"memorabilias": [
			{
				"code": "dashijibianma",
				"content": "dashijineirong",
				"note": "dashijibeizhu"
			}
		],
		"receiptplans": [
			{
				"code": "",
				"planAmt": 0,
				"advanceFlag": "",
				"marginFlag": "",
				"planRatio": 0,
				"amtTypeId": "",
				"planName": "如：第一期，第二期"
			}
		],
		"materials": [
			{
				"originalTotalAmt": 100,
				"expenseitemId": 1450866117566267401
			}
		],
		"apctownersub": [
			{
				"ownerId": "1448407351883202564"
			}
		],
		"apctCounterpartys": [
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

999	未查询到币种精度	使用启用的币种


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-08-25

新增

请求参数 (6)

更新

请求参数 originalTotalAmt

删除

返回参数 displayCode

合同付款计划，收款计划增加供应商等字段说明

2	2025-07-11

更新

请求参数 originalTotalAmt

新增

返回参数 displayCode

3	2025-06-19

新增

请求参数 (15)

修改标的物


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

