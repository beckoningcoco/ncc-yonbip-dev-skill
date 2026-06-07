---
title: "资金付款单详情查询"
apiId: "0e1d11a7c2f3498dbe1ca2cd107e1b9a"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Payment Document"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 资金付款单详情查询

> `ContentType` 请求方式	GET | 分类: Payment Document (ctm)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/fi/fundpayment/detail

请求方式	GET

ContentType

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| code | string | query | 否 | 单据编码code（单据id或单据编码不能同时传递）    示例: FDP20220507000869 |
| id | long | query | 否 | 资金付款单id（单据id或单据编码不能同时传递）    示例: 2763855623180544 |
| fundBillSubPubtsBegin | DateTime | query | 否 | 资金付款单子表时间戳pubts开始时间    示例: 2022-11-01 00:00:00 |
| fundBillSubPubtsEnd | DateTime | query | 否 | 资金付款单子表时间戳pubts截止时间    示例: 2022-11-30 00:00:00 |
| settleStatus | short | query | 否 | 资金付款单子表结算状态(1："待结算", 2："结算中", 3："结算成功", 4："结算止付", 5："部分成功", 6："退票", 7："已结算补单")    示例: 7 |

## 3. 请求示例

Url: /yonbip/fi/fundpayment/detail?access_token=访问令牌&code=FDP20220507000869&id=2763855623180544&fundBillSubPubtsBegin=2022-11-01%2000%3A00%3A00&fundBillSubPubtsEnd=2022-11-30%2000%3A00%3A00&settleStatus=7

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| verifystate | string | 否 | 审批状态， 0:"初始开立", 1:"审批中", 2:"审批完成", 3:"不通过流程终止", 4:"驳回到制单" 示例：0 |
| enterprisebankaccount | string | 否 | 付款银行账户id 示例：2719941813391872 |
| code | string | 否 | 资金付款单号 示例：FDP20220524000246 |
| enterprisebankaccount_bankNumber_name | string | 否 | 付款银行账户开户行名称，示例：A银行网点 示例：A银行网点 |
| enterprisebankaccount_name | string | 否 | 付款银行账户名称，示例：A公司银行账户 示例：A公司银行账户 |
| settlemode | long | 否 | 结算方式ID 示例：2591099436552463 |
| accentity_name | string | 否 | 资金组织 示例：资金组织A |
| creatorId | long | 否 | 创建人id 示例：2591579673162752 |
| project | string | 否 | 项目id 示例：2591605862453504 |
| description | string | 否 | 备注 示例：备注 |
| exchRate | double | 否 | 汇率 示例：1 |
| caobject | long | 否 | 付款对象(1：客户，2：供应商，3：员工，4：其他) 示例：2 |
| accentity | string | 否 | 资金组织id 示例：2591580914225408 |
| operator | string | 否 | 业务员id 示例：2687914564882944 |
| vouchdate | string | 否 | 单据日期 示例：2022-05-24 00:00:00 |
| accentityRaw | string | 否 | 会计主体id 示例：3434 |
| natCurrency | string | 否 | 本币币种id 示例：2591342867010560 |
| billtype | long | 否 | 单据类型，0："现金期初日记账未达", 1："销售发票", 2："其它应收事项", 5："订单日报", 6："内部交易结算单", 7："收款单", 8："其它应付事项", 9："客户退款单", 10："付款单", 11："供应商退款单", 12："转账单", 13："汇率损益单", 14："外币兑换单", 15："薪资支付单", 16："银行对账单", 17："资金收款单", 18："资金付款单", 50："应收票据期初", 51："收票登记", 52："银行托收", 53："到期兑付", 54："应付票据期初", 55："票据签发", 56："付票登记", 57："票据贴现", 58："票据背书", 59："付款申请单", 60："资金结算明细", 70："销售费用", 71："供应链费用", 72："销售费用", 73："供应链费用", 72："内部交易待结算单", 74："内部交易待结算单" 示例：18 |
| printCount | long | 否 | 单据打印次数 示例：0 |
| currency | string | 否 | 币种id 示例：2591342867010560 |
| id | long | 否 | 资金付款单主表ID 示例：2788485821747968 |
| pubts | string | 否 | 时间戳 示例：2022-05-24 20:34:29 |
| tenant | long | 否 | 租户主键 示例：2591339872260352 |
| createDate | string | 否 | 创建日期 示例：2022-05-24 00:00:00 |
| creator | string | 否 | 创建人 示例：曾刚 |
| oriSum | double | 否 | 付款金额 示例：100 |
| org | string | 否 | 业务组织id 示例：2591580914225408 |
| isWfControlled | boolean | 否 | 是否审批流控制（true：是，false：否） 示例：false |
| dept | string | 否 | 部门id 示例：2663265966461184 |
| natSum | double | 否 | 本币金额 示例：100 |
| srcitem | long | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方 示例：8 |
| voucherstatus | long | 否 | 凭证状态(1：已生成， 2：未生成， 3：已接收未生成， 4：不生成) 示例：2 |
| tradetype | string | 否 | 交易类型id 示例：2553204791808512 |
| exchangeRateType | string | 否 | 汇率类型id 示例：0000KY14MIJC0SDERP0000 |
| expenseitem | long | 否 | 费用项目id 示例：2699198821978624 |
| createTime | string | 否 | 创建时间 示例：2022-05-24 20:34:28 |
| isEnabledBsd | boolean | 否 | 是否启用商业汇票 示例：true |
| status | long | 否 | 审核状态1:已审核0未审核 示例：0 |
| FundPayment_b | object | 是 | 资金付款单明细 |
| defines | object | 是 | 表头自由自定义项 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"verifystate": "0",
		"enterprisebankaccount": "2719941813391872",
		"code": "FDP20220524000246",
		"enterprisebankaccount_bankNumber_name": "A银行网点",
		"enterprisebankaccount_name": "A公司银行账户",
		"settlemode": 2591099436552463,
		"accentity_name": "资金组织A",
		"creatorId": 2591579673162752,
		"project": "2591605862453504",
		"description": "备注",
		"exchRate": 1,
		"caobject": 2,
		"accentity": "2591580914225408",
		"operator": "2687914564882944",
		"vouchdate": "2022-05-24 00:00:00",
		"accentityRaw": "3434",
		"natCurrency": "2591342867010560",
		"billtype": 18,
		"printCount": 0,
		"currency": "2591342867010560",
		"id": 2788485821747968,
		"pubts": "2022-05-24 20:34:29",
		"tenant": 2591339872260352,
		"createDate": "2022-05-24 00:00:00",
		"creator": "曾刚",
		"oriSum": 100,
		"org": "2591580914225408",
		"isWfControlled": false,
		"dept": "2663265966461184",
		"natSum": 100,
		"srcitem": 8,
		"voucherstatus": 2,
		"tradetype": "2553204791808512",
		"exchangeRateType": "0000KY14MIJC0SDERP0000",
		"expenseitem": 2699198821978624,
		"createTime": "2022-05-24 20:34:28",
		"isEnabledBsd": true,
		"status": 0,
		"FundPayment_b": [
			{
				"enterprisebankaccount": "2719941813391872",
				"signature": "MIIGwgYJKoZIhvcNAQcCoIIGszCCBq8CAQExCzAJBgUrDgMCGgUAMAsGCSqGSIb3\nDQEHAaCCBP8wggT7MIID46ADAgECAggzAAADmIkDhzANBgkqhkiG9w0BAQsFADBY\nMQswCQYDVQQGEwJDTjEwMC4GA1UECgwnQ2hpbmEgRmluYW5jaWFsIENlcnRpZmlj\nYXRpb24gQXV0aG9yaXR5MRcwFQYDVQQDDA5DRkNBIEFDUyBPQ0EzMzAeFw0yMTA4\nMTYwMTUzMTFaFw0yMzA4MTYwMTUzMTFaMIGBMQswCQYDVQQGEwJDTjEXMBUGA1UE\nCgwOQ0ZDQSBBQ1MgT0NBMzMxFTATBgNVBAsMDGNoYW5namlldG9uZzEZMBcGA1UE\nCwwQT3JnYW5pemF0aW9uYWwtMTEnMCUGA1UEAwweMDUxQEMwMTBATjkxMTEwMDAw\nNjAwMDAxNzYwUEAxMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA1fF9\nUJJ0H19ahl+1QdYxRIvEC1bcykPCl0nu6z+OFB8KRkZaJsb115x76LR9+g2p5SK1\njS+kVIalLhIEs2TVIQC8W3ROZ7S5Yovnwq2aQw1oEGHoonG3SluQuLgZssWTqhEA\nBr21qALKtGoek0HYEZ5hFZps1o6tPOvIeTVBPNxtCjLznVV8OSNkfqUzXIhLGh+M\nJUsSaSFlTgn0m2Oso7D/jFeVVANhM4Y/tiVKCEev/z9RHgaEf20kZSAZ1somnhkd\n70oxiDlKf2ie1+xvQZSbZMNJ4q8G444XAy4Lq0vmUPOjmKvJnQlry6/RhzmTx0ph\nrA61SSeofRLYg4FOrQIDAQABo4IBnTCCAZkwIgYHYIEchu8qBwQXDBVbTl05MTEx\nMDAwMDYwMDAwMTc2MFAwDAYDVR0TAQH/BAIwADBsBggrBgEFBQcBAQRgMF4wKAYI\nKwYBBQUHMAGGHGh0dHA6Ly9vY3NwLmNmY2EuY29tLmNuL29jc3AwMgYIKwYBBQUH\nMAKGJmh0dHA6Ly9jcmwuY2ZjYS5jb20uY24vb2NhMzMvb2NhMzMuY2VyMA4GA1Ud\nDwEB/wQEAwIGwDAdBgNVHQ4EFgQUZ54CgmbGON6Vw7BzRZ+jxCwVS+0wHQYDVR0l\nBBYwFAYIKwYBBQUHAwIGCCsGAQUFBwMEMB8GA1UdIwQYMBaAFE2pV/3fbKktmkYh\nDhg/rWnu577oMEgGA1UdIARBMD8wPQYIYIEchu8qAQQwMTAvBggrBgEFBQcCARYj\naHR0cDovL3d3dy5jZmNhLmNvbS5jbi91cy91cy0xNC5odG0wPgYDVR0fBDcwNTAz\noDGgL4YtaHR0cDovL2NybC5jZmNhLmNvbS5jbi9vY2EzMy9SU0EvY3JsNDA2OTIu\nY3JsMA0GCSqGSIb3DQEBCwUAA4IBAQAoO2o0b2aeuc0jTzUKjmDF8Et2j8gsf3zY\nJndP1xXm47KagR5xiv4D87jg05ujZLyJ71nNxZdjL1KFoUxvnYuOMQQ8WfDTOEaW\nNhSOyQ3q8reZPfaFzyeFC9QBqtKpDcH+SoZSBYqjhqS4K9i/n6IBi5dgUZIXH2Fn\noMwI6pAOAUTTCQXheXB4AJAGojZs2jYgFRZXrrpYHBz2qTu6dXqqBxrEpAbdvb9b\nsqh0h5q+FSUxNa5gLkYBhUrAq2vEVEYW9mqTcuOTkNiP+yrKeJbRBWRo/DaByjOW\nfKOZocITUoUSn9GgeqNIKmh09B2jUyyWKARYqamtq/9rmeTLvQ4TMYIBizCCAYcC\nAQEwZDBYMQswCQYDVQQGEwJDTjEwMC4GA1UECgwnQ2hpbmEgRmluYW5jaWFsIENl\ncnRpZmljYXRpb24gQXV0aG9yaXR5MRcwFQYDVQQDDA5DRkNBIEFDUyBPQ0EzMwII\nMwAAA5iJA4cwCQYFKw4DAhoFADANBgkqhkiG9w0BAQEFAASCAQAMrJpnrr4nPPct\nh/Cv04cC0UgYnwF6H4aFzGjDagacDQH183AYc6OtlEoJuABnHffA5dFWOR5nGVK4\nnvbhtiWRTvc5D76ubeZisaPsYDu9aa1IrSxuZTzfvUz69gmxpzUeUoNKxkB6aB7n\nrmOtJjolFmnB0RaqaHxmCUQJZE/H3OgJYcyc6cdzwNtaksNx6AGXOBkJMIe6uRJR\ny8+nMmwmVle0DKjlPNH1sVZB/7dHM5AT3EQVzCLkIlcrwmF8VrMZ8hJOqZ/2IQDf\nvfp6eKbqjHeYFZbDCODpVcc2Y2UaBO/e1Si7rpo/XKNnKOmkVKImkRjXQ8JXIzee\ncIFErULA",
				"settlemode": 2591099436552463,
				"project": "2591605862453504",
				"description": "摘要",
				"exchRate": 1,
				"caobject": 2,
				"settlestatus": 1,
				"operator": "2687914564882944",
				"quickType": 2590051481424516,
				"oppositeaccountid": "2591604030640387",
				"currency": "2591342867010560",
				"id": 2788485821747969,
				"mainid": 2788485821747968,
				"oppositeaccountname": "伊利1",
				"pubts": "2022-05-24 20:34:28",
				"oppositeobjectid": "2591604030640384",
				"tenant": 2591339872260352,
				"taxSum": 6,
				"oriSum": 100,
				"oppositeaccountno": "445566",
				"natSum": 100,
				"dept": "2663265966461184",
				"taxCategory": "2591342869926917",
				"oppositeobjectname": "伊利",
				"exchangeRateType": "0000KY14MIJC0SDERP0000",
				"expenseitem": 2699198821978624,
				"taxRate": 6,
				"oppositebankaddr": "中国建设银行股份有限公司高安八景支行",
				"associationStatus": 0,
				"smartcheckno": "",
				"enterprisebankaccount_bankNumber_name": "A银行网点",
				"enterprisebankaccount_name": "A公司银行账户"
			}
		],
		"defines": [
			{
				"define1": "表头",
				"id": 2788485821747968
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	单据id或单据编码不能同时传递	参照返回信息修改请求数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-20

新增

返回参数 (5)

更新

返回参数 (5)

2	2025-04-23

更新

请求说明

新增

返回参数 smartcheckno


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

