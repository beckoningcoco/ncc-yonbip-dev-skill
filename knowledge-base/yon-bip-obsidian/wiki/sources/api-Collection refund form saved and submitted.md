---
title: "收款退款单保存并提交"
apiId: "1843242913849409545"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Refund Note"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Refund Note]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款退款单保存并提交

> `ContentType	application/json` 请求方式	POST | 分类: Collection Refund Note (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/arRefund/saveandsubmit

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
| serviceCode | string | query | 否 | 服务编码    默认值: ear_bill_refund |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 收款退款单数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| extSystemCode | string | 否 | 否 | 外部系统编码（与外部系统单号联合做幂等性校验，有外部系统编码，需有外部系统单号，否则将返回提示） 示例：AB1234 |
| extVouchCode | string | 否 | 否 | 外部系统单号（与外部系统编码联合做幂等性校验，有外部系统单号，没有外部系统编码时，将不进行校验） 示例：AB1234 |
| code | string | 否 | 否 | 单据编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值) |
| financeOrg | string | 否 | 否 | 收款组织id，收款组织id和收款组织编码不能同时为空，id和编码同时存在，以id为准 示例：1514558842038386692 |
| financeOrgCode | string | 否 | 否 | 收款组织编码，收款组织id和收款组织编码不能同时为空，id和编码同时存在，以id为准 示例：11 |
| billDate | string | 否 | 是 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00 |
| creator | string | 否 | 否 | 创建人id 示例：dff758d-bfc2-4b90 |
| bustype | string | 否 | 否 | 交易类型id，交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准 示例：1514492098255520713 |
| bustypeCode | string | 否 | 否 | 交易类型编码，交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准 示例：ar_colsale |
| org | string | 否 | 否 | 业务组织id，业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准 示例：1514558842038386692 |
| orgCode | string | 否 | 否 | 业务组织编码，业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准 示例：11 |
| oriCurrency | string | 否 | 否 | 币种id，币种id和币种编码不能同时为空，id和编码同时存在，以id为准 示例：1514492081064640537 |
| oriCurrencyCode | string | 否 | 否 | 币种编码，币种id和币种编码不能同时为空，id和编码同时存在，以id为准 示例：CNY |
| objectType | string | 否 | 是 | 往来对象类型(枚举值 1:客户; 2:员工;3:资金业务对象) 示例：1 |
| customer | string | 否 | 否 | 客户id (往来对象类型是1时客户id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1515940421356224512 |
| customerCode | string | 否 | 否 | 客户编码 (往来对象类型是1时客户id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：0805 |
| employee | string | 否 | 否 | 员工id (往来对象类型是2时员工id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) |
| employeeCode | string | 否 | 否 | 员工编码 (往来对象类型是2时员工id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) |
| funder | string | 否 | 否 | 资金业务对象id(往来对象类型是3时资金业务对象id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1732613498433699840 |
| funder_code | string | 否 | 否 | 资金业务对象编码(往来对象类型是3时资金业务对象id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：ZJDX230524000051 |
| exchangeRateType | string | 否 | 否 | 汇率类型id，汇率类型id和汇率类型编码不能同时为空，id和编码同时存在，以id为准，均不填会取默认值 示例：0000L6D9B8DDEQ7W2Z0000 |
| exchangeRateTypeCode | string | 否 | 否 | 汇率类型编码，汇率类型id和汇率类型编码不能同时为空，id和编码同时存在，以id为准，均不填会取默认值 示例：01 |
| exchangeRate | Decimal | 否 | 是 | 汇率 |
| exchangeRateDate | string | 否 | 是 | 汇率日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00 |
| settleMode | string | 否 | 否 | 结算方式id 示例：1536752888049568089 |
| settleModeCode | string | 否 | 否 | 结算方式编码 示例：system_0001 |
| enterpriseBankAccount | string | 否 | 否 | 企业银行账户id 示例：1552266344270397446 |
| enterpriseBankAccountNo | string | 否 | 否 | 企业银行账号 示例：11 |
| enterpriseCashAccount | string | 否 | 否 | 企业现金账户id 示例：1552266344270397446 |
| enterpriseCashAccountNo | string | 否 | 否 | 企业现金账户编码 示例：34 |
| customerBankAccount | string | 否 | 否 | 客户银行账户id 示例：1547303019945656322 |
| customerBankAccountNo | string | 否 | 否 | 客户银行账号 示例：789 |
| employeeBankAccount | string | 否 | 否 | 员工银行账户id 示例：1577744141747486723 |
| employeeBankAccountNo | string | 否 | 否 | 员工银行账号 示例：5566 |
| funderBankAccount | string | 否 | 否 | 资金业务对象银行账户id 示例：1732692293915246592 |
| funderBankAccount_no | string | 否 | 否 | 资金业务对象银行账号 示例：42321332423245 |
| dept | string | 否 | 否 | 部门id 示例：1551794533528764418 |
| deptCode | string | 否 | 否 | 部门编码 示例：SS2 |
| staff | string | 否 | 否 | 业务员id 示例：1577862450987401221 |
| staffCode | string | 否 | 否 | 业务员编码 示例：009 |
| project | string | 否 | 否 | 项目id 示例：1541277369785909249 |
| projectCode | string | 否 | 否 | 项目编码 示例：667 |
| srcBillType | string | 否 | 否 | 来源单据类型(枚举值 1:销售订单; 2:销售合同; 3:项目收款计划; 4:应收事务; 5:销售退货; 6:应付事务; 7:采购订单; 8:项目付款预测; 9:采购合同; 10:付款申请单; 11:U订货; 12:费用单; 13:采购发票; 14:销售发票; 15:出库单; 16:收款单; 17:采购入库; 18:委外订单; 19:银行到账认领单) 示例：1 |
| srcBillId | string | 否 | 否 | 来源单据id 示例：2056237265560535 |
| bodyItem | object | 是 | 是 | 表体数据（必输） |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert |

## 3. 请求示例

Url: /yonbip/EFI/arRefund/saveandsubmit?access_token=访问令牌&serviceCode=
Body: {
	"data": {
		"resubmitCheckKey": "",
		"extSystemCode": "AB1234",
		"extVouchCode": "AB1234",
		"code": "",
		"financeOrg": "1514558842038386692",
		"financeOrgCode": "11",
		"billDate": "2022-10-24 00:00:00",
		"creator": "dff758d-bfc2-4b90",
		"bustype": "1514492098255520713",
		"bustypeCode": "ar_colsale",
		"org": "1514558842038386692",
		"orgCode": "11",
		"oriCurrency": "1514492081064640537",
		"oriCurrencyCode": "CNY",
		"objectType": "1",
		"customer": "1515940421356224512",
		"customerCode": "0805",
		"employee": "",
		"employeeCode": "",
		"funder": "1732613498433699840",
		"funder_code": "ZJDX230524000051",
		"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
		"exchangeRateTypeCode": "01",
		"exchangeRate": 0,
		"exchangeRateDate": "2022-10-24 00:00:00",
		"settleMode": "1536752888049568089",
		"settleModeCode": "system_0001",
		"enterpriseBankAccount": "1552266344270397446",
		"enterpriseBankAccountNo": "11",
		"enterpriseCashAccount": "1552266344270397446",
		"enterpriseCashAccountNo": "34",
		"customerBankAccount": "1547303019945656322",
		"customerBankAccountNo": "789",
		"employeeBankAccount": "1577744141747486723",
		"employeeBankAccountNo": "5566",
		"funderBankAccount": "1732692293915246592",
		"funderBankAccount_no": "42321332423245",
		"dept": "1551794533528764418",
		"deptCode": "SS2",
		"staff": "1577862450987401221",
		"staffCode": "009",
		"project": "1541277369785909249",
		"projectCode": "667",
		"srcBillType": "1",
		"srcBillId": "2056237265560535",
		"bodyItem": [
			{
				"oriCurrencyCode": "CNY",
				"oriCurrency": "321312312",
				"exchangeRateType": "112333212",
				"exchangeRateTypeCode": "342",
				"exchangeRate": 1,
				"exchangeRateDate": "2022-10-24 00:00:00",
				"localTaxIncludedAmount": 30,
				"objectType": "1",
				"quickTypeCode": "6",
				"customer": "1515940421356224512",
				"customerCode": "0805",
				"employee": "",
				"employeeCode": "",
				"employeeBankAccount": "1577744141747486723",
				"employeeBankAccountNo": "5566",
				"funder": "1732613498433699840",
				"funder_code": "ZJDX230524000051",
				"funderBankAccount": "1732692293915246592",
				"funderBankAccount_no": "3223351265351441444221",
				"dept": "1551794533528764418",
				"deptCode": "SS2",
				"settleMode": "1536752888049568089",
				"settleModeCode": "567",
				"customerBankAccount": "1547303019945656322",
				"customerBankAccountNo": "456",
				"staff": "1577862450987401221",
				"staffCode": "6878",
				"enterpriseBankAccount": "1552266344270397446",
				"enterpriseBankAccountNo": "678",
				"enterpriseCashAccount": "",
				"enterpriseCashAccountNo": "788",
				"project": "1541277369785909249",
				"projectCode": "002",
				"issueNo": 1,
				"quickType": "1514492089653002546",
				"orgCode": "44",
				"expireDate": "2022-10-24 00:00:00",
				"oriTaxIncludedAmount": 30,
				"org": "1544896420846764040",
				"expenseItem": "1570324310872555520",
				"expenseItemCode": "TEST0987",
				"material": "1551616919384096777",
				"materialCode": "000156",
				"_status": "Insert",
				"extRowNo": "AB1234",
				"srcBillType": "1",
				"srcBillId": "2056237265560535",
				"srcBillRowId": "2056237265560535"
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
| id | string | 否 | 收款退款单主键 示例：1514492081064640537 |

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

999	收款组织不允许为空!	请求参数中输入收款组织id


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-26

新增

请求参数 serviceCode

9


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

