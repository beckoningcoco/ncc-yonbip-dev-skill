---
title: "收款单保存并提交"
apiId: "1843239056968777732"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Collection Document"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款单保存并提交

> `ContentType	application/json` 请求方式	POST | 分类: Collection Document (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/collection/saveandsubmit

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
| data | object | 否 | 是 | 收款单数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| extSystemCode | string | 否 | 否 | 外部系统编码（与外部系统单号联合做幂等性校验，有外部系统编码，需有外部系统单号，否则将返回提示） 示例：AB1234 |
| extVouchCode | string | 否 | 否 | 外部系统单号（与外部系统编码联合做幂等性校验，有外部系统单号，没有外部系统编码时，将不进行校验） 示例：AB1234 |
| creator | string | 否 | 否 | 创建人id 示例：9dff758d-bfc2-4b90 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建时间 示例：2024-08-01 00:00:00 |
| code | string | 否 | 否 | 单据编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值) 示例：D2202311130000005 |
| financeOrg | string | 否 | 否 | 收款组织id，收款组织id和收款组织编码不能同时为空，id和编码同时存在，以id为准 示例：1514558842038386692 |
| financeOrgCode | string | 否 | 否 | 收款组织编码，收款组织id和收款组织编码不能同时为空，id和编码同时存在，以id为准 示例：11 |
| billDate | string | 否 | 是 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-24 00:00:00 |
| bustype | string | 否 | 否 | 交易类型id，交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准 示例：1514492098255520713 |
| bustypeCode | string | 否 | 否 | 交易类型编码，交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准 示例：ar_colsale |
| org | string | 否 | 否 | 业务组织id，业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准 示例：1514558842038386692 |
| orgCode | string | 否 | 否 | 业务组织编码，业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准 示例：11 |
| oriCurrency | string | 否 | 否 | 币种id，币种id和币种编码不能同时为空，id和编码同时存在，以id为准 示例：1514492081064640537 |
| oriCurrencyCode | string | 否 | 否 | 币种编码，币种id和币种编码不能同时为空，id和编码同时存在，以id为准 示例：CNY |
| objectType | string | 否 | 是 | 往来对象类型(枚举值 1:客户; 2:员工;3:资金业务对象) 示例：1 |
| customer | string | 否 | 否 | 客户id (往来对象类型是1时客户id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1515940421356224512 |
| customerCode | string | 否 | 否 | 客户编码 (往来对象类型是1时客户id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：0805 |
| employee | string | 否 | 否 | 员工id (往来对象类型是2时员工id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1232132121211 |
| employeeCode | string | 否 | 否 | 员工编码 (往来对象类型是2时员工id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：22 |
| funder | string | 否 | 否 | 资金业务对象id(往来对象类型是3时资金业务对象id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：1732613498433699840 |
| funder_code | string | 否 | 否 | 资金业务对象编码(往来对象类型是3时资金业务对象id，编码二选一必输，id和编码同时存在，以id为准, 客户、员工和资金业务对象三者的id和编码信息只可填写其一) 示例：ZJDX230524000051 |
| exchangeRateType | string | 否 | 否 | 汇率类型id，汇率类型id和汇率类型编码不能同时为空，id和编码同时存在，以id为准，均不填会取默认值 示例：0000L6D9B8DDEQ7W2Z0000 |
| exchangeRateTypeCode | string | 否 | 否 | 汇率类型编码，汇率类型id和汇率类型编码不能同时为空，id和编码同时存在，以id为准，均不填会取默认值 示例：01 |
| exchangeRate | Decimal | 否 | 是 | 汇率 示例：1 |
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
| srcBillType | string | 否 | 否 | 来源单据类型(枚举值 1:销售订单。销售订单生成收款单场景必传) 示例：1 |
| srcApp | string | 否 | 否 | 来源应用（传值需要实现沟通） |
| orderNo | string | 否 | 否 | 订单编号（销售订单生成收款单场景必传） 示例：UO-701520230518000002 |
| contractNo | string | 否 | 否 | 合同编号 示例：HTBH00001 |
| srcBillId | string | 否 | 否 | 来源单据id（销售订单生成收款单场景必传，其它场景无需填写） 示例：1728256786694144000 |
| sourceId | string | 否 | 否 | 上游单据主表id（销售订单生成收款单场景必传，其它场景无需填写） 示例：1728256786694144000 |
| bizFlowMakeBillCode | string | 否 | 否 | 转换规则编码（销售订单生成收款单场景必传，其它场景无需填写。销售订单收款：userDefine_voucher_order_764330） 示例：userDefine_voucher_order_764330 |
| remarks | string | 否 | 否 | 备注 示例：备注信息 |
| blnWriteOff | boolean | 否 | 否 | 是否冲销（true:是冲销单；false：非冲销单） 示例：false |
| bodyItem | object | 是 | 是 | 表体数据（必输） |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert |

## 3. 请求示例

Url: /yonbip/EFI/collection/saveandsubmit?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"extSystemCode": "AB1234",
		"extVouchCode": "AB1234",
		"creator": "9dff758d-bfc2-4b90",
		"createTime": "2024-08-01 00:00:00",
		"code": "D2202311130000005",
		"financeOrg": "1514558842038386692",
		"financeOrgCode": "11",
		"billDate": "2022-10-24 00:00:00",
		"bustype": "1514492098255520713",
		"bustypeCode": "ar_colsale",
		"org": "1514558842038386692",
		"orgCode": "11",
		"oriCurrency": "1514492081064640537",
		"oriCurrencyCode": "CNY",
		"objectType": "1",
		"customer": "1515940421356224512",
		"customerCode": "0805",
		"employee": "1232132121211",
		"employeeCode": "22",
		"funder": "1732613498433699840",
		"funder_code": "ZJDX230524000051",
		"exchangeRateType": "0000L6D9B8DDEQ7W2Z0000",
		"exchangeRateTypeCode": "01",
		"exchangeRate": 1,
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
		"srcApp": "",
		"orderNo": "UO-701520230518000002",
		"contractNo": "HTBH00001",
		"srcBillId": "1728256786694144000",
		"sourceId": "1728256786694144000",
		"bizFlowMakeBillCode": "userDefine_voucher_order_764330",
		"remarks": "备注信息",
		"blnWriteOff": false,
		"bodyItem": [
			{
				"srcBillId": "1728256786694144000",
				"srcBillRowId": "1728256786694144003",
				"sourceId": "1728256786694144000",
				"sourceChildId": "1728256786694144003",
				"srcBillNo": "UO-701520230518000002",
				"orderNo": "UO-701520230518000002",
				"srcBillType": "1",
				"srcOrderId": "1728256786694144000",
				"srcOrderRowId": "",
				"srcOrderType": "",
				"oriOccupyAmount": 10,
				"issueNo": 1,
				"oriCurrency": "232132313",
				"oriCurrencyCode": "CNY",
				"exchangeRateType": "112333212",
				"exchangeRateDate": "2022-10-24 00:00:00",
				"exchangeRate": 1,
				"exchangeRateTypeCode": "343",
				"objectType": "1",
				"quickTypeCode": "6",
				"customer": "1515940421356224512",
				"customerCode": "0805",
				"employee": "188869766555",
				"employeeCode": "9098",
				"funder": "1732613498433699840",
				"funder_code": "ZJDX230524000051",
				"employeeBankAccount": "1577744141747486723",
				"employeeBankAccountNo": "5566",
				"dept": "1551794533528764418",
				"deptCode": "SS2",
				"settleMode": "1536752888049568089",
				"settleModeCode": "567",
				"customerBankAccount": "1547303019945656322",
				"customerBankAccountNo": "456",
				"funderBankAccount": "1732692293915246592",
				"invoiceNo": "",
				"funderBankAccount_no": "42321332423245",
				"staff": "1577862450987401221",
				"staffCode": "6878",
				"enterpriseBankAccount": "1552266344270397446",
				"enterpriseBankAccountNo": "678",
				"enterpriseCashAccount": "",
				"enterpriseCashAccountNo": "788",
				"project": "1541277369785909249",
				"projectCode": "002",
				"quickType": "1514492089653002546",
				"localTaxIncludedAmount": 0,
				"orgCode": "44",
				"expireDate": "2022-10-24 00:00:00",
				"oriTaxIncludedAmount": 30,
				"org": "1544896420846764040",
				"extRowNo": "AB1234",
				"expenseItem": "1570324310872555520",
				"expenseItemCode": "TEST0987",
				"material": "1551616919384096777",
				"materialCode": "000156",
				"_status": "Insert",
				"contractNo": "",
				"srcExeDetailId": "",
				"remarks": "备注信息",
				"taxSubject": "10003",
				"taxRate": 0.12,
				"oriBillId": "1570324310872555520",
				"oriBillRowId": "1570324310872555521",
				"oriBillNo": "TEST20231012001",
				"oriBillType": "1552266344270397446"
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
| id | string | 否 | 收款单主键 示例：1577744141747486723 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1577744141747486723"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	收款组织不允许为空!	请求参数中输入收款组织id


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-06

删除

请求参数 billTargetStatus

2	2025-12-11

更新

请求说明

新增

请求参数 billTargetStatus


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

