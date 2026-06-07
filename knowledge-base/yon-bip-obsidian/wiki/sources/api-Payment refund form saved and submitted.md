---
title: "付款退款单保存并提交"
apiId: "1843248059220230144"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Refund Note"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Refund Note]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款退款单保存并提交

> `ContentType	application/json` 请求方式	POST | 分类: Payment Refund Note (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/apRefund/saveandsubmit

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 付款退款单数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| extSystemCode | string | 否 | 否 | 外部系统编码（与外部系统单号联合做幂等性校验，有外部系统编码，需有外部系统单号，否则将返回提示） 示例：AB1234 |
| extVouchCode | string | 否 | 否 | 外部系统单号（与外部系统编码联合做幂等性校验，有外部系统单号，没有外部系统编码时，将不进行校验） 示例：AB1234 |
| code | string | 否 | 否 | 单据编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值) 示例：ap230317853486 |
| creator | string | 否 | 否 | 创建人id 示例：9dff758d-bfc2-4b90 |
| srcBillId | string | 否 | 否 | 来源单据id 示例：92403242421232 |
| srcBillType | string | 否 | 否 | 来源单据类型(枚举值 1:销售订单; 2:销售合同; 3:项目收款计划; 4:应收事务; 5:销售退货; 6:应付事务; 7:采购订单; 8:项目付款预测; 9:采购合同; 10:付款申请单; 11:U订货; 12:费用单; 13:采购发票; 14:销售发票; 15:出库单; 16:收款单; 17:采购入库; 18:委外订单; 19:银行到账认领单) 示例：1 |
| financeOrg | string | 否 | 否 | 付款组织id (付款组织id和付款组织编码不能同时为空，id和编码同时存在，以id为准) 示例：1515936384070713348 |
| financeOrgCode | string | 否 | 否 | 付款组织编码 (付款组织id和付款组织编码不能同时为空，id和编码同时存在，以id为准) 示例：22 |
| billDate | string | 否 | 是 | 单据日期 (格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00 |
| bustype | string | 否 | 否 | 交易类型id (交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准) 示例：1514492098255520722 |
| bustypeCode | string | 否 | 否 | 交易类型编码 (交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准) 示例：ap_refpurc |
| org | string | 否 | 否 | 业务组织id (业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准) 示例：1515936384070713348 |
| orgCode | string | 否 | 否 | 业务组织编码 (业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准) 示例：22 |
| oriCurrency | string | 否 | 否 | 币种id (币种id和币种简称不能同时为空，id和简称同时存在，以id为准) 示例：1514492081064640537 |
| oriCurrencyCode | string | 否 | 否 | 币种简称 (币种id和币种简称不能同时为空，id和简称同时存在，以id为准) 示例：CNY |
| objectType | string | 否 | 是 | 往来对象类型 (枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0 |
| funder | string | 否 | 否 | 资金业务对象id(往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：2222 |
| funder_code | string | 否 | 否 | 资金业务对象编码(往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：ZJDX230511000023 |
| supplier | string | 否 | 否 | 供应商id (往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准) 示例：1570200581335154695 |
| supplierCode | string | 否 | 否 | 供应商编码 (往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准) 示例：0011000045 |
| employee | string | 否 | 否 | 员工id (往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：1682216663884745733 |
| employeeCode | string | 否 | 否 | 员工编码 (往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：em998 |
| deptCode | string | 否 | 否 | 部门编码 示例：ss2 |
| dept | string | 否 | 否 | 部门id 示例：1551794533528764418 |
| exchangeRateType | string | 否 | 否 | 汇率类型 示例：0000L6D9B8DDEQ7W2Z0000 |
| funderBankAccount_no | string | 否 | 否 | 资金业务对象银行账号 示例：2222 |
| funderBankAccount | string | 否 | 否 | 资金业务对象银行账户id 示例：1514492081064640549 |
| supplierBankAccount | string | 否 | 否 | 供应商银行账户id 示例：1682218473884747755 |
| supplierBankAccountNo | string | 否 | 否 | 供应商银行账号 示例：678 |
| staff | string | 否 | 否 | 业务员id 示例：1677777473884745733 |
| staffCode | string | 否 | 否 | 业务员编码 示例：889 |
| exchangeRateTypeCode | string | 否 | 否 | 汇率类型编码 示例：01 |
| settleMode | string | 否 | 否 | 结算方式id 示例：1536752888049568089 |
| projectCode | string | 否 | 否 | 项目编码 示例：778 |
| project | string | 否 | 否 | 项目id 示例：1682218473884654309 |
| employeeBankAccount | string | 否 | 否 | 员工银行账户id 示例：1577744141747486723 |
| employeeBankAccountNo | string | 否 | 否 | 员工银行账号 示例：5566 |
| enterpriseCashAccount | string | 否 | 否 | 企业现金账户id 示例：1682211111184745733 |
| enterpriseCashAccountNo | string | 否 | 否 | 企业现金账号 示例：55 |
| enterpriseBankAccount | string | 否 | 否 | 企业银行账户id 示例：1552266344270397446 |
| enterpriseBankAccountNo | string | 否 | 否 | 企业银行账号 示例：146833608607635 |
| settleModeCode | string | 否 | 否 | 结算方式编码 示例：456 |
| exchangeRateDate | string | 否 | 否 | 汇率日期 (格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00 |
| exchangeRate | Decimal | 否 | 是 | 汇率 示例：1 |
| bodyItem | object | 是 | 是 | 表体数据（必输） |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert |

## 3. 请求示例

Url: /yonbip/EFI/apRefund/saveandsubmit?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"extSystemCode": "AB1234",
		"extVouchCode": "AB1234",
		"code": "ap230317853486",
		"creator": "9dff758d-bfc2-4b90",
		"srcBillId": "92403242421232",
		"srcBillType": "1",
		"financeOrg": "1515936384070713348",
		"financeOrgCode": "22",
		"billDate": "2022-10-24 00:00:00",
		"bustype": "1514492098255520722",
		"bustypeCode": "ap_refpurc",
		"org": "1515936384070713348",
		"orgCode": "22",
		"oriCurrency": "1514492081064640537",
		"oriCurrencyCode": "CNY",
		"objectType": "0",
		"funder": "2222",
		"funder_code": "ZJDX230511000023",
		"supplier": "1570200581335154695",
		"supplierCode": "0011000045",
		"employee": "1682216663884745733",
		"employeeCode": "em998",
		"deptCode": "ss2",
		"dept": "1551794533528764418",
		"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
		"funderBankAccount_no": "2222",
		"funderBankAccount": "1514492081064640549",
		"supplierBankAccount": "1682218473884747755",
		"supplierBankAccountNo": "678",
		"staff": "1677777473884745733",
		"staffCode": "889",
		"exchangeRateTypeCode": "01",
		"settleMode": "1536752888049568089",
		"projectCode": "778",
		"project": "1682218473884654309",
		"employeeBankAccount": "1577744141747486723",
		"employeeBankAccountNo": "5566",
		"enterpriseCashAccount": "1682211111184745733",
		"enterpriseCashAccountNo": "55",
		"enterpriseBankAccount": "1552266344270397446",
		"enterpriseBankAccountNo": "146833608607635",
		"settleModeCode": "456",
		"exchangeRateDate": "2022-10-24 00:00:00",
		"exchangeRate": 1,
		"bodyItem": [
			{
				"funderBankAccount_no": "2222",
				"funderBankAccount": "1514492081064640549",
				"funder_code": "ZJDX230511000023",
				"funder": "0023",
				"oriTaxAmount": 0,
				"oriTaxExcludedAmount": 55,
				"objectType": "0",
				"exchangeRate": 1,
				"_status": "Insert",
				"expireDate": "2022-10-24 00:00:00",
				"deptCode": "ss2",
				"dept": "1551794533528764418",
				"staffCode": "889",
				"staff": "1577862450987401221",
				"projectCode": "778",
				"project": "1682218555584745734",
				"exchangeRateDate": "2022-10-24 00:00:00",
				"oriCurrency": "1514492081064640537",
				"enterpriseBankAccount": "1689999993884745734",
				"enterpriseBankAccountNo": "147425233489782",
				"settleMode": "1682218473884745732",
				"settleModeCode": "se666",
				"org": "1515936384070713348",
				"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
				"employeeBankAccountNo": "5566",
				"employeeBankAccount": "1577744141747486723",
				"enterpriseCashAccount": "168273884745734",
				"orgCode": "22",
				"oriCurrencyCode": "CNY",
				"exchangeRateTypeCode": "01",
				"oriTaxIncludedAmount": 55,
				"quickType": "1514492089653002546",
				"quickTypeCode": "6",
				"supplier": "1570200581335154695",
				"supplierCode": "0011000045",
				"employee": "1471440935115030536",
				"employeeCode": "em556",
				"expenseItem": "1471440933335030536",
				"expenseItemCode": "ex006",
				"extRowNo": "AB1234",
				"material": "1597535213588054023",
				"materialCode": "dd002",
				"supplierBankAccountNo": "678",
				"supplierBankAccount": "148172830788870",
				"srcBillType": "1",
				"srcBillId": "92403242421232",
				"srcBillRowId": "92403242421231"
			}
		],
		"_status": "Insert"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 付款退款单主键 示例：1514492081064640537 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1514492081064640537"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	付款组织不允许为空!	请求参数中输入付款组织id


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

