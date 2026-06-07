---
title: "收款单详情查询"
apiId: "1482015101754540036"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Collection Document"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Collection Document (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/collection/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 收款单id    示例: 2326431654121728 |

## 3. 请求示例

Url: /yonbip/EFI/collection/detail?access_token=访问令牌&id=2326431654121728

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回收款单数据 |
| extSystemCode | string | 否 | 外部系统编码 示例：AB1234 |
| extVouchCode | string | 否 | 外部系统单号 示例：AB1234 |
| deptName | string | 否 | 部门名称 示例：同福客栈 |
| oriCurrency | string | 否 | 原币币种id 示例：1509428082750521370 |
| financeOrg | string | 否 | 收款组织id 示例：1509911532865585159 |
| modifier | string | 否 | 修改人 示例：9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3 |
| modifyTime | string | 否 | 修改时间 示例：2024-08-12 14:18:55 |
| settleState | string | 否 | 结算状态(枚举值 0:不结算; 1:待结算; 3:全部成功; 4:部分成功; 5:全部止付) 示例：0 |
| oriOccupyAmount | double | 否 | 原币预占用金额 示例：0 |
| project | string | 否 | 项目id 示例：1509916557971030019 |
| orgCurrencyMoneyDigit | long | 否 | 本币金额精度 示例：2 |
| customerRetailInvestors | boolean | 否 | 是否散户(true:是; false:否) 示例：false |
| objectType | string | 否 | 往来对象类型(枚举值 1:客户; 2:员工;3:资金业务对象) 示例：1 |
| financeOrgName | string | 否 | 收款组织名称 示例：收款组织名称 |
| orgCurrencyName | string | 否 | 组织本币名称 示例：人民币 |
| exchangeRate | double | 否 | 汇率 示例：1 |
| enterpriseBankAccountNo | string | 否 | 企业银行账户编码 示例：1234 |
| orgCurrency | string | 否 | 组织本币id 示例：1509428082750521370 |
| oriCurrencyName | string | 否 | 组织本币名称 示例：人民币 |
| id | string | 否 | 单据id 示例：1513642038374957065 |
| localTaxIncludedAmount | double | 否 | 本币含税金额 示例：1200.34 |
| bodyItem | object | 是 | 表体对象 |
| orderNo | string | 否 | 订单编号 示例：ORD234 |
| staffCode | string | 否 | 员工编码 示例：00000014 |
| orgName | string | 否 | 业务组织名称 示例：应付组织 |
| enterpriseBankAccount | string | 否 | 企业银行账号ID 示例：1510060276165640198 |
| billDate | string | 否 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-08-02 00:00:00 |
| verifyState | long | 否 | 审批流状态(枚举值 0:开立; 1:审批中; 2:已审批; 3:终止; 4:已驳回) 示例：0 |
| customerName | string | 否 | 客户名称 示例：贸易合同项目客户001 |
| partner_name | string | 否 | 业务伙伴名称 |
| funder_name | string | 否 | 资金业务对象名称 |
| blnWriteOff | long | 否 | 是否冲销单(0:否; 1:是) 示例：0 |
| projectName | string | 否 | 项目名称 示例：AP模块 |
| billTypeName | string | 否 | 单据类型名称 示例：收款单 |
| srcSystem | string | 否 | 来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理) 示例：0 |
| deptCode | string | 否 | 部门编码 示例：BM001 |
| billTypeCode | string | 否 | 单据类型编码 示例：collection |
| code | string | 否 | 单据编号 示例：RECar220802000502 |
| creatorUserName | string | 否 | 创建人 示例：万蓉蓉 |
| bustypeCode | string | 否 | 交易类型编码 示例：ar_colsale |
| writeOffState | string | 否 | 冲销状态(枚举值 0:未冲销; 1:已冲销) 示例：0 |
| exchangeRateTypeDigit | long | 否 | 汇率类型精度 示例：6 |
| postStatus | string | 否 | 过账状态(枚举值 0:未过账; 1:过账中; 2:过账成功; 3:过账失败) 示例：0 |
| oriTaxExcludedAmount | double | 否 | 原币无税金额 示例：1200.34 |
| customerCode | string | 否 | 客户编码 示例：00000000000002 |
| funder_code | string | 否 | 资金业务对象编码 |
| partner_code | string | 否 | 业务伙伴编码 |
| settleModeCode | string | 否 | 结算方式编码 示例：system_0001 |
| exchangeRateTypeName | string | 否 | 汇率类型名称 示例：基准汇率 |
| projectCode | string | 否 | 项目编码 示例：1509916557971030016 |
| settleMode | string | 否 | 结算方式ID 示例：1509428091361427590 |
| orgCode | string | 否 | 业务组织编码 示例：AP01 |
| staffName | string | 否 | 员工姓名 示例：阿忠 |
| oriCurrencyMoneyDigit | long | 否 | 原币币种金额精度 示例：2 |
| effectState | string | 否 | 生效状态(枚举值 0:未生效; 1:已生效) 示例：0 |
| pubts | string | 否 | 时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-08-02 11:32:06 |
| oriTaxIncludedAmount | double | 否 | 收款金额 示例：1200.34 |
| creator | string | 否 | 创建人id 示例：c0dbef04-a816-4211-ae91-40b04ce8020f |
| financeOrgCode | string | 否 | 收款组织编码 示例：AP01 |
| org | string | 否 | 业务组织id 示例：1509911532865585159 |
| billType | string | 否 | 单据类型id 示例：2614241203376640 |
| staff | string | 否 | 员工ID 示例：1510075944232026112 |
| dept | string | 否 | 部门ID 示例：1509914504982953992 |
| settleModeName | string | 否 | 结算方式名称 示例：银行转账 |
| bustypeName | string | 否 | 交易类型名称 示例：销售收款 |
| bustype | string | 否 | 交易类型id 示例：1509428082756289190 |
| orgCurrencyCode | string | 否 | 组织本币编码 示例：CNY |
| exchangeRateType | string | 否 | 汇率类型 示例：0000L63IE0K8GSISCH0000 |
| exchangeRateDate | string | 否 | 汇率日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-08-02 00:00:00 |
| createTime | string | 否 | 创建时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-08-02 11:27:22 |
| oriCurrencyCode | string | 否 | 原币币种编码 示例：CNY |
| localTaxExcludedAmount | double | 否 | 本币无税金额 示例：1200.34 |
| enterpriseBankAccountName | string | 否 | 企业银行账户名称 示例：账户1 |
| businessType | string | 否 | 业务类型(枚举值 0:应收发票; 1:收款单; 2:收款退款; 3:应付发票; 4:付款单; 5:付款退款) 示例：1 |
| exchangeRateTypeCode | string | 否 | 汇率类型编码 示例：01 |
| remarks | string | 否 | 备注 示例：备注 |
| funder | string | 否 | 资金业务对象id |
| partner | string | 否 | 业务伙伴id |
| customer | string | 否 | 客户id 示例：1509926599615053827 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"extSystemCode": "AB1234",
		"extVouchCode": "AB1234",
		"deptName": "同福客栈",
		"oriCurrency": "1509428082750521370",
		"financeOrg": "1509911532865585159",
		"modifier": "9dff758d-bfc2-4b90-ac4c-e47fb0fc9bf3",
		"modifyTime": "2024-08-12 14:18:55",
		"settleState": "0",
		"oriOccupyAmount": 0,
		"project": "1509916557971030019",
		"orgCurrencyMoneyDigit": 2,
		"customerRetailInvestors": false,
		"objectType": "1",
		"financeOrgName": "收款组织名称",
		"orgCurrencyName": "人民币",
		"exchangeRate": 1,
		"enterpriseBankAccountNo": "1234",
		"orgCurrency": "1509428082750521370",
		"oriCurrencyName": "人民币",
		"id": "1513642038374957065",
		"localTaxIncludedAmount": 1200.34,
		"bodyItem": [
			{
				"deptName": "同福客栈",
				"oriCurrency": "1509428082750521370",
				"quickTypeCode": "1",
				"settleState": "0",
				"oriOccupyAmount": 0,
				"headerId": "1513642038374957065",
				"orgCurrencyName": "人民币",
				"enterpriseBankAccountNo": "1234",
				"oriCurrencyName": "人民币",
				"id": "1513642038374957067",
				"staffCode": "00000014",
				"enterpriseBankAccount": "1510060276165640198",
				"settleModeServiceAttr": 0,
				"expenseItemCode": "FYXM1",
				"customerName": "贸易合同项目客户001",
				"funder_name": "",
				"partner_name": "",
				"localTaxAmount": 0,
				"rowNo": 10,
				"exchangeRateTypeDigit": 6,
				"oriTaxExcludedAmount": 1200.34,
				"customerCode": "00000000000002",
				"extRowNo": "AB1234",
				"funder_code": "",
				"partner_code": "",
				"quickType": "1509428082758385942",
				"oriTaxAmount": 0,
				"exchangeRateTypeName": "基准汇率",
				"projectCode": "1509916557971030016",
				"staffName": "阿忠",
				"expireDate": "2022-08-02 00:00:00",
				"pubts": "2022-08-02 11:32:06",
				"staff": "1510075944232026112",
				"dept": "1509914504982953992",
				"settleModeName": "银行转账",
				"exchangeRateDate": "2022-08-02 00:00:00",
				"project": "1509916557971030019",
				"orgCurrencyMoneyDigit": 2,
				"customerRetailInvestors": false,
				"objectType": "1",
				"expenseItemName": "费用项目1",
				"exchangeRate": 1,
				"orgCurrency": "1509428082750521370",
				"localTaxIncludedAmount": 1200.34,
				"orderNo": "ORD234",
				"orgName": "应付组织",
				"taxSubject": "1509428082750521392",
				"quickTypeName": "预收款",
				"taxRate": 0,
				"projectName": "AP模块",
				"deptCode": "BM001",
				"expenseItem": "1513024130045181956",
				"settleModeCode": "system_0001",
				"settleMode": "1509428091361427590",
				"orgCode": "AP01",
				"oriCurrencyMoneyDigit": 2,
				"oriTaxIncludedAmount": 1200.34,
				"org": "1509911532865585159",
				"orgCurrencyCode": "CNY",
				"taxSubjectName": "0%",
				"exchangeRateType": "0000L63IE0K8GSISCH0000",
				"oriCurrencyCode": "CNY",
				"localTaxExcludedAmount": 1200.34,
				"exchangeRateTypeCode": "01",
				"remarks": "备注",
				"funder": "",
				"partner": "",
				"customer": "1509926599615053827"
			}
		],
		"orderNo": "ORD234",
		"staffCode": "00000014",
		"orgName": "应付组织",
		"enterpriseBankAccount": "1510060276165640198",
		"billDate": "2022-08-02 00:00:00",
		"verifyState": 0,
		"customerName": "贸易合同项目客户001",
		"partner_name": "",
		"funder_name": "",
		"blnWriteOff": 0,
		"projectName": "AP模块",
		"billTypeName": "收款单",
		"srcSystem": "0",
		"deptCode": "BM001",
		"billTypeCode": "collection",
		"code": "RECar220802000502",
		"creatorUserName": "万蓉蓉",
		"bustypeCode": "ar_colsale",
		"writeOffState": "0",
		"exchangeRateTypeDigit": 6,
		"postStatus": "0",
		"oriTaxExcludedAmount": 1200.34,
		"customerCode": "00000000000002",
		"funder_code": "",
		"partner_code": "",
		"settleModeCode": "system_0001",
		"exchangeRateTypeName": "基准汇率",
		"projectCode": "1509916557971030016",
		"settleMode": "1509428091361427590",
		"orgCode": "AP01",
		"staffName": "阿忠",
		"oriCurrencyMoneyDigit": 2,
		"effectState": "0",
		"pubts": "2022-08-02 11:32:06",
		"oriTaxIncludedAmount": 1200.34,
		"creator": "c0dbef04-a816-4211-ae91-40b04ce8020f",
		"financeOrgCode": "AP01",
		"org": "1509911532865585159",
		"billType": "2614241203376640",
		"staff": "1510075944232026112",
		"dept": "1509914504982953992",
		"settleModeName": "银行转账",
		"bustypeName": "销售收款",
		"bustype": "1509428082756289190",
		"orgCurrencyCode": "CNY",
		"exchangeRateType": "0000L63IE0K8GSISCH0000",
		"exchangeRateDate": "2022-08-02 00:00:00",
		"createTime": "2022-08-02 11:27:22",
		"oriCurrencyCode": "CNY",
		"localTaxExcludedAmount": 1200.34,
		"enterpriseBankAccountName": "账户1",
		"businessType": "1",
		"exchangeRateTypeCode": "01",
		"remarks": "备注",
		"funder": "",
		"partner": "",
		"customer": "1509926599615053827"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据被删除或没有权限	查看请求数据是否正确


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

