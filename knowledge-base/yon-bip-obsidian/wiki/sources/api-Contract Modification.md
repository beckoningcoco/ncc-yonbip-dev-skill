---
title: "合同修改"
apiId: "1691942322799902721"
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

# 合同修改

> `ContentType	application/json` 请求方式	POST | 分类: Contract Register (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/apct/openapi/bill/update

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
| id | string | 否 | 是 | 需要更新的合同id 示例：1234567894444 |
| code | string | 否 | 否 | 合同单据号 示例：danjuhao |
| acctEntityId | string | 否 | 是 | 会计主体 （支持id或code） 示例：2536246218019840 |
| vouchdate | string | 否 | 是 | 单据日期(格式：yyyy-MM-dd) 示例：2022-07-08 |
| businessCode | string | 否 | 否 | 合同业务号 示例：yewuhao |
| contractDirection | string | 否 | 否 | 收支方向，1：收入；2：支出 |
| pushBillSystem | string | 否 | 否 | 下推单据系统，znbzbx：费控服务，EAP：应付管理，EAR：应收管理 |
| name | string | 否 | 是 | 合同名称 示例：hetongmingcheng |
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
| signOrgId | string | 否 | 是 | 签约组织(本方) （支持id或code） 示例：2536246218019840 |
| payerAccountId | string | 否 | 否 | 付款方账户（支持id或code） 示例：1325444173725903 |
| payerCardno | string | 否 | 否 | 付款方银行账号 示例：6217003810026896707 |
| supplierId | string | 否 | 否 | 供应商 （支持id或code） 示例：2551783630229760 |
| customer | string | 否 | 否 | 客户 （支持id或code） |
| payeeAccountId | long | 否 | 否 | 收款方账户id 示例：2551783630229771 |
| payeeCardno | string | 否 | 否 | 收款方银行账号 示例：6217003810026896707 |
| originalTotalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 原币付款金额 示例：100 |
| originalReceiptAmt | BigDecimal | 否 | 否 | 原币收票金额 (仅当当前合同为期初合同beginningFlag=1时，可填) 示例：0 |
| billNum | string | 否 | 否 | 当合同是生效状态新增或修改合同履约保证金的时候，传apct_margin_card；当合同是生效状态新增或修改合同大事记的时候，传apct_memorabilia_card；其他情况无需传值。 |
| plans | object | 是 | 否 | 付款计划集合 |
| receiptplans | object | 是 | 否 | 收款计划 |
| margins | object | 是 | 否 | 履约保证金集合 |
| memorabilias | object | 是 | 否 | 合同大事记 |
| materials | object | 是 | 否 | 标的物 |
| apctownersub | object | 是 | 否 | 合同所属人 |
| bustype | string | 否 | 是 | 合同类型 示例：1534519041174536742 |
| beginningFlag | string | 否 | 是 | 期初标识 示例：1 |
| apctCounterpartys | object | 是 | 否 | 合同相对方 |
| contractType | string | 否 | 否 | 合同类型 |
| contractLedgerId | string | 否 | 否 | 合同台账 |
| contractClass | string | 否 | 否 | 合同性质 |
| roriginalTotalAmt | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 原币收款金额 |

## 3. 请求示例

Url: /yonbip/znbz/apct/openapi/bill/update?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1234567894444",
		"code": "danjuhao",
		"acctEntityId": "2536246218019840",
		"vouchdate": "2022-07-08",
		"businessCode": "yewuhao",
		"contractDirection": "",
		"pushBillSystem": "",
		"name": "hetongmingcheng",
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
		"signOrgId": "2536246218019840",
		"payerAccountId": "1325444173725903",
		"payerCardno": "6217003810026896707",
		"supplierId": "2551783630229760",
		"customer": "",
		"payeeAccountId": 2551783630229771,
		"payeeCardno": "6217003810026896707",
		"originalTotalAmt": 100,
		"originalReceiptAmt": 0,
		"billNum": "",
		"plans": [
			{
				"id": "",
				"_status": "",
				"code": "FKJH202207083020",
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
				"amtTypeId": "2722781149614337"
			}
		],
		"receiptplans": [
			{
				"id": "",
				"_status": "",
				"code": "",
				"planName": "",
				"planRatio": 0,
				"planAmt": 0,
				"beginDate": "",
				"accountDays": "",
				"expenseitemId": "",
				"amtTypeId": ""
			}
		],
		"margins": [
			{
				"id": "",
				"_status": "",
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
				"id": "",
				"_status": "",
				"code": "dashijibianma",
				"content": "dashijineirong",
				"note": "dashijibeizhu"
			}
		],
		"materials": [
			{
				"id": "",
				"_status": "",
				"originalTotalAmt": 100,
				"expenseitemId": "1450866117566267401",
				"pk_projectapply": "",
				"projectId": ""
			}
		],
		"apctownersub": [
			{
				"id": "",
				"_status": "",
				"ownerId": "1448407351883202564"
			}
		],
		"bustype": "1534519041174536742",
		"beginningFlag": "1",
		"apctCounterpartys": [
			{
				"id": "",
				"_status": "",
				"supplierId": "",
				"customerId": "",
				"payAccountId": ""
			}
		],
		"contractType": "",
		"contractLedgerId": "",
		"contractClass": "",
		"roriginalTotalAmt": 0
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	未查找到付款合同	请新增后再编辑。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-09-09

新增

请求参数 billNum

删除

返回参数 displayCode

增加billNum

2	2025-07-11

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

