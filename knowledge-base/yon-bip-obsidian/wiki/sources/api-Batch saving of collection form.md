---
title: "收款单批量保存"
apiId: "1858093879954767874"
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

# 收款单批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Collection Document (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/collection/batchsave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 收款单数据 |
| extSystemCode | string | 否 | 否 | 外部系统编码（与外部系统单号联合做幂等性校验，有外部系统编码，需有外部系统单号，否则将返回提示） 示例：AB1234 |
| extVouchCode | string | 否 | 否 | 外部系统单号（与外部系统编码联合做幂等性校验，有外部系统单号，没有外部系统编码时，将不进行校验） 示例：AB1234 |
| creator | string | 否 | 否 | 创建人id 示例：9dff758d-bfc2-4b90 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 创建日期 示例：2024-08-01 00:00:00 |
| code | string | 否 | 否 | 单据编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值；更新数据时需要传值) 示例：D22023111300000058 |
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
| srcApp | string | 否 | 否 | 来源应用（传值需要实现沟通） 示例：95 |
| orderNo | string | 否 | 否 | 订单编号（销售订单生成收款单场景必传） 示例：UO-701520230518000002 |
| contractNo | string | 否 | 否 | 合同编号 示例：HTBH00001 |
| srcBillId | string | 否 | 否 | 来源单据id（销售订单生成收款单场景必传，其它场景无需填写） 示例：1728256786694144000 |
| sourceId | string | 否 | 否 | 上游单据主表id（销售订单生成收款单场景必传，其它场景无需填写） 示例：1728256786694144000 |
| bizFlowMakeBillCode | string | 否 | 否 | 转换规则编码（销售订单生成收款单场景必传，其它场景无需填写。销售订单收款：userDefine_voucher_order_764330） 示例：userDefine_voucher_order_764330 |
| remarks | string | 否 | 否 | 备注 示例：备注信息 |
| blnWriteOff | boolean | 否 | 否 | 是否冲销（true:是冲销单；false：非冲销单） 示例：false |
| retailer | string | 否 | 否 | 散户名称 示例：小散户 |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert |
| bodyItem | object | 是 | 是 | 表体数据（必输） |

## 3. 请求示例

Url: /yonbip/EFI/collection/batchsave?access_token=访问令牌
Body: {
	"data": [
		{
			"extSystemCode": "AB1234",
			"extVouchCode": "AB1234",
			"creator": "9dff758d-bfc2-4b90",
			"createTime": "2024-08-01 00:00:00",
			"code": "D22023111300000058",
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
			"srcApp": "95",
			"orderNo": "UO-701520230518000002",
			"contractNo": "HTBH00001",
			"srcBillId": "1728256786694144000",
			"sourceId": "1728256786694144000",
			"bizFlowMakeBillCode": "userDefine_voucher_order_764330",
			"remarks": "备注信息",
			"blnWriteOff": false,
			"retailer": "小散户",
			"_status": "Insert",
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
					"srcOrderRowId": "3551232906875137",
					"srcOrderType": "1856781913489410563",
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
					"invoiceNo": "1862574621797646343",
					"funderBankAccount_no": "42321332423245",
					"staff": "1577862450987401221",
					"staffCode": "6878",
					"enterpriseBankAccount": "1552266344270397446",
					"enterpriseBankAccountNo": "678",
					"enterpriseCashAccount": "1861047683601399814",
					"enterpriseCashAccountNo": "788",
					"project": "1541277369785909249",
					"projectCode": "002",
					"quickType": "1514492089653002546",
					"localTaxIncludedAmount": 20,
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
					"contractNo": "1861119641471942667",
					"srcExeDetailId": "1860988069457952777",
					"remarks": "备注信息",
					"taxSubject": "10003",
					"taxRate": 0.12,
					"oriBillId": "1570324310872555520",
					"oriBillRowId": "1570324310872555521",
					"oriBillNo": "TEST20231012001",
					"oriBillType": "1552266344270397446",
					"retailer": "小散户",
					"costCenter": "1489141053783015433",
					"supplierProCenter": "1471416754426085382",
					"demanderProCenter": "1468336086076358690",
					"noteNo": "1472203515145748480",
					"noteType": "1468336103164477459",
					"localTaxAmount": 0,
					"localTaxExcludedAmount": 10,
					"blnSettlePatch": false
				}
			]
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 数据总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 业务状态信息 |
| infos | object | 是 | 业务数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"busiObj": "collection",
				"oriCurrency": "1514492081064640537",
				"financeOrg": "1544896420846764040",
				"extSystemCode": "AB1234",
				"settleState": "0",
				"objectType": "1",
				"exchangeRate": 1,
				"extVouchCode": "AB1234",
				"creator": "\"9dff758d-bfc2-4b90-ac4c-e47fb0fc99cs",
				"customer": "1570200967882211330",
				"funder": "1732613498433699840",
				"funder_code": "ZJDX230510000012",
				"partner": "1676889166818312197",
				"orgCurrency": "1514492081064640537",
				"settleMode": "1536752888049568089",
				"enterpriseBankAccount": "1552266344270397446",
				"creatorUserName": "LRU",
				"customerBankAccount": "1547303019945656322",
				"enterpriseCashAccount": "1567923991131193348",
				"funderBankAccount": "1567923991131193348",
				"employeeBankAccount": "1577744141747486723",
				"dept": "1551794533528764418",
				"staff": "1577862450987401221",
				"project": "1541277369785909249",
				"id": "1575441987716775942",
				"localTaxIncludedAmount": 30,
				"orderNo": "UO-701520230518000002",
				"srcBillId": "1728256786694144000",
				"sourceId": "1728256786694144000",
				"srcBillType": "1",
				"bizFlowMakeBillCode": "userDefine_voucher_order_764330",
				"oriOccupyAmount": 10,
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
						"oriOccupyAmount": 10,
						"issueNo": 1,
						"objectType": "1",
						"project": "1541277369785909249",
						"staff": "1577862450987401221",
						"dept": "1551794533528764418",
						"oriCurrency": "1514492081064640537",
						"employeeBankAccount": "1577744141747486723",
						"enterpriseCashAccount": "1567923991131193348",
						"customerBankAccount": "1547303019945656322",
						"enterpriseBankAccount": "1552266344270397446",
						"funderBankAccount": "",
						"settleMode": "1536752888049568089",
						"quickTypeCode": "6",
						"settleState": "0",
						"headerId": "1575441987716775942",
						"exchangeRate": 1,
						"customer": "1570200967882211330",
						"funder": "1732613498433699840",
						"funder_code": "ZJDX230510000012",
						"partner": "1676889166818312197",
						"material": "1544997490009833473",
						"expenseItem": "1550998530002780169",
						"orgCurrency": "1514492081064640537",
						"id": "1575441987716775943",
						"localTaxIncludedAmount": 30,
						"extRowNo": "AB1234",
						"localTaxAmount": 0,
						"oriTaxExcludedAmount": 30,
						"quickType": "1514492089653002546",
						"oriTaxAmount": 0,
						"expireDate": "2022-10-24 00:00:00",
						"pubts": "2022-10-24 17:59:46",
						"oriTaxIncludedAmount": 30,
						"org": "1544896420846764040",
						"exchangeRateType": "1514492081064642674",
						"exchangeRateDate": "2022-10-24 00:00:00",
						"createTime": "2022-10-24 17:59:46",
						"localTaxExcludedAmount": 30,
						"verifyState": 0
					}
				],
				"billDate": "2022-10-24 00:00:00",
				"srcApp": "94",
				"verifyState": 0,
				"blnWriteOff": false,
				"settleSubmitType": "1",
				"srcSystem": "2",
				"status": "0",
				"code": "PAYap221024000632",
				"writeOffState": "0",
				"postStatus": "0",
				"oriTaxExcludedAmount": 30,
				"effectState": "0",
				"pubts": "2022-10-24 17:59:46",
				"oriTaxIncludedAmount": 30,
				"org": "1544896420846764040",
				"billType": "2614249315406336",
				"bustype": "1514492098255520719",
				"exchangeRateType": "1514492081064642674",
				"exchangeRateDate": "2022-10-24 00:00:00",
				"createTime": "2022-10-24 17:59:46",
				"localTaxExcludedAmount": 30,
				"businessType": "4",
				"data": {
					"sourceUnique": "1858115999048400885",
					"targetUnique": "1858115999048400905"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	收款组织不允许为空!	请求参数中输入收款组织id


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

