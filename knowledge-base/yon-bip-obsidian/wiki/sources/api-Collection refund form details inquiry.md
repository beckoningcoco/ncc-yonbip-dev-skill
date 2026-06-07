---
title: "收款退款单详情查询"
apiId: "1487171192805130244"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Collection Refund Note"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection Refund Note]
platform_version: "BIP"
source_type: community-api-docs
---

# 收款退款单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Collection Refund Note (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/arRefund/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 收款退款单id    示例: 1485837184534052873 |

## 3. 请求示例

Url: /yonbip/EFI/arRefund/detail?access_token=访问令牌&id=1485837184534052873

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回收款单数据 |
| id | string | 否 | 表头主键 示例：1485837184534052873 |
| deptName | string | 否 | 部门名称 示例：调入组织B部门 |
| oriCurrency | string | 否 | 原币币种id 示例：1441827152751231005 |
| financeOrg | string | 否 | 收款组织id 示例：1447840081185341449 |
| extSystemCode | string | 否 | 外部系统编码 示例：AB1234 |
| settleState | string | 否 | 结算状态(枚举值 0:不结算; 1:待结算; 3:全部成功; 4:部分成功; 5:全部止付) 示例：0 |
| oriOccupyAmount | long | 否 | 预占用金额 示例：0 |
| modifier | string | 否 | 修改人 示例：5a54e5ff-f12d-4349-94c0-6a20d8c62811 |
| extVouchCode | string | 否 | 外部系统单号 示例：AB1234 |
| project | string | 否 | 项目id 示例：1449167483799339013 |
| orgCurrencyMoneyDigit | int | 否 | 本币金额精度 示例：2 |
| customerRetailInvestors | boolean | 否 | 是否散户(true:是; false:否) 示例：false |
| objectType | string | 否 | 往来对象类型(枚举值 1:客户; 2:员工; 3:资金业务对象) 示例：1 |
| financeOrgName | string | 否 | 收款组织名称 示例：收付新架构 |
| orgCurrencyName | string | 否 | 本币币种 示例：人民币 |
| modifyTime | string | 否 | 修改时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-06-27 19:26:29 |
| exchangeRate | Decimal | 否 | 汇率 示例：9 |
| orgCurrency | string | 否 | 组织本币id 示例：1441827152751231004 |
| oriCurrencyName | string | 否 | 组织本币名称 示例：欧元 |
| localTaxIncludedAmount | BigDecimal | 否 | 本币含税金额 示例：3996 |
| bodyItem | object | 是 | 表体对象 |
| orgName | string | 否 | 业务组织名称 示例：收付新架构 |
| staffCode | string | 否 | 业务员编码 示例：000000000000000000000024 |
| billDate | string | 否 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-06-24 00:00:00 |
| settleModeServiceAttr | int | 否 | 结算方式业务属性 示例：1 |
| srcApp | string | 否 | 源应用 示例：~ |
| verifyState | int | 否 | 单据状态(枚举值 0:开立; 1:审批中; 2:已审批; 3:终止; 4:已驳回) 示例：0 |
| customerName | string | 否 | 客户名称 示例：收付客户 |
| funder_name | string | 否 | 资金业务对象名称 |
| blnWriteOff | int | 否 | 冲销状态(枚举值 0:未冲销; 1:已冲销；2：部分冲销) 示例：0 |
| billTypeName | string | 否 | 单据类型名称 示例：收款退款单 |
| projectName | string | 否 | 项目名称 示例：企业级项目1 |
| srcSystem | string | 否 | 来源系统(枚举值 0:应收管理; 1:应付管理; 2:模板导入; 3:外部系统导入; 4:销售管理; 5:采购管理; 6:项目管理; 7:库存管理) 示例：0 |
| deptCode | string | 否 | 部门编码 示例：1001012 |
| billTypeCode | string | 否 | 单据类型编码 示例：arRefund |
| code | string | 否 | 单据编号 示例：CREF00220624000003 |
| bustypeCode | string | 否 | 交易类型编码 示例：ar_refsale |
| creatorUserName | string | 否 | 创建人 示例：财务测试管理员 |
| contractNo | string | 否 | 合同编号 示例：*2 |
| writeOffState | string | 否 | 冲销状态(枚举值 0:未冲销; 1:已冲销；2：部分冲销) 示例：0 |
| exchangeRateTypeDigit | int | 否 | 汇率类型精度 示例：6 |
| postStatus | string | 否 | 过账状态(0:未过账 1:已过账 2:过账中 3:过账失败) 示例：0 |
| oriTaxExcludedAmount | BigDecimal | 否 | 原币无税金额 示例：444 |
| customerCode | string | 否 | 客户编码 示例：SF00001 |
| funder_code | string | 否 | 资金业务对象编码 |
| settleModeCode | string | 否 | 结算方式编码 示例：system_0002 |
| exchangeRateTypeName | string | 否 | 汇率类型名称 示例：基准汇率 |
| projectCode | string | 否 | 项目编码 示例：00000001 |
| settleMode | string | 否 | 结算方式 示例：1441827152748609671 |
| orgCode | string | 否 | 业务组织编码 示例：EARAP0001 |
| staffName | string | 否 | 业务员名称 示例：调入组织B部门的人员 |
| oriCurrencyMoneyDigit | int | 否 | 原币币种金额精度 示例：3 |
| effectState | string | 否 | 生效状态(枚举值 0:未生效; 1:已生效) 示例：0 |
| pubts | string | 否 | 时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-06-27 19:26:29 |
| oriTaxIncludedAmount | BigDecimal | 否 | 表体收款金额 示例：444 |
| creator | string | 否 | 创建人 示例：edb903fc-43e8-4069-81fa-5690f911e499 |
| financeOrgCode | string | 否 | 收款组织编码 示例：EARAP0001 |
| org | string | 否 | 业务组织 示例：1447840081185341449 |
| billType | string | 否 | 单据类型 示例：2614243574141696 |
| staff | string | 否 | 业务员 示例：1456470379894669321 |
| dept | string | 否 | 部门 示例：1456464117834448903 |
| settleModeName | string | 否 | 结算方式名称 示例：现金收付款 |
| bustypeName | string | 否 | 交易类型名称 示例：销售退款 |
| bustype | string | 否 | 交易类型 示例：1441827144161299178 |
| orgCurrencyCode | string | 否 | 原币币种编码 示例：CNY |
| exchangeRateType | string | 否 | 汇率类型 示例：0000L2HCW91M32DB8V0000 |
| modifierUserName | string | 否 | 修改人名称 示例：万蓉蓉 |
| exchangeRateDate | string | 否 | 汇率日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-06-24 00:00:00 |
| createTime | string | 否 | 创建时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-06-26 00:23:34 |
| oriCurrencyCode | string | 否 | 原币币种编码 示例：EUR |
| localTaxExcludedAmount | BigDecimal | 否 | 本币无税金额 示例：3996 |
| businessType | string | 否 | 业务类型(枚举值 0:应收发票; 1:收款单; 2:收款退款; 3:应付发票; 4:付款单; 5:付款退款) 示例：2 |
| exchangeRateTypeCode | string | 否 | 汇率类型编码 示例：01 |
| funder | string | 否 | 资金业务对象id |
| partner | string | 否 | 业务伙伴id |
| remarks | string | 否 | 备注 示例：*2 |
| customer | string | 否 | 客户id 示例：1447840888653873158 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1485837184534052873",
		"deptName": "调入组织B部门",
		"oriCurrency": "1441827152751231005",
		"financeOrg": "1447840081185341449",
		"extSystemCode": "AB1234",
		"settleState": "0",
		"oriOccupyAmount": 0,
		"modifier": "5a54e5ff-f12d-4349-94c0-6a20d8c62811",
		"extVouchCode": "AB1234",
		"project": "1449167483799339013",
		"orgCurrencyMoneyDigit": 2,
		"customerRetailInvestors": false,
		"objectType": "1",
		"financeOrgName": "收付新架构",
		"orgCurrencyName": "人民币",
		"modifyTime": "2022-06-27 19:26:29",
		"exchangeRate": 9,
		"orgCurrency": "1441827152751231004",
		"oriCurrencyName": "欧元",
		"localTaxIncludedAmount": 3996,
		"bodyItem": [
			{
				"deptName": "调入组织B部门",
				"oriCurrency": "1441827152751231005",
				"quickTypeCode": "1",
				"settleState": "0",
				"supplierProCenterName": "事项中台自动化专用-888",
				"oriOccupyAmount": 0,
				"project": "1449167483799339013",
				"orgCurrencyMoneyDigit": 2,
				"customerRetailInvestors": false,
				"headerId": "1485837184534052873",
				"objectType": "1",
				"expenseItemName": "孙小妞的费用项目",
				"orgCurrencyName": "人民币",
				"exchangeRate": 9,
				"orgCurrency": "1441827152751231004",
				"oriCurrencyName": "欧元",
				"id": "1485837184534052874",
				"demanderProCenter": "1447840081185341449",
				"invoiceNo": "*2",
				"localTaxIncludedAmount": 3996,
				"supplierProCenterCode": "SXZT-ZDH-888",
				"orderNo": "*2",
				"orgName": "收付新架构",
				"extRowNo": "AB1234",
				"staffCode": "000000000000000000000024",
				"taxSubject": "1441827152751231025",
				"settleModeServiceAttr": 1,
				"expenseItemCode": "1001011",
				"quickTypeName": "预收款",
				"customerName": "收付客户",
				"funder_name": "",
				"localTaxAmount": 0,
				"taxRate": 0,
				"demanderProCenterName": "收付新架构",
				"projectName": "企业级项目1",
				"deptCode": "1001012",
				"expenseItem": "1455777532936716294",
				"rowNo": 10,
				"contractNo": "*2",
				"exchangeRateTypeDigit": 6,
				"oriTaxExcludedAmount": 444,
				"customerCode": "SF00001",
				"funder_code": "",
				"settleModeCode": "system_0002",
				"quickType": "1441827161349554193",
				"supplierProCenter": "1450757377590558723",
				"oriTaxAmount": 0,
				"exchangeRateTypeName": "基准汇率",
				"projectCode": "00000001",
				"settleMode": "1441827152748609671",
				"taxSubjectCode": "VAT0",
				"orgCode": "EARAP0001",
				"staffName": "调入组织B部门的人员",
				"oriCurrencyMoneyDigit": 3,
				"expireDate": "2022-06-24 00:00:00",
				"pubts": "2022-06-26 00:23:34",
				"oriTaxIncludedAmount": 444,
				"enterpriseCashAccountNo": "xjtest02",
				"org": "1447840081185341449",
				"staff": "1456470379894669321",
				"dept": "1456464117834448903",
				"demanderProCenterCode": "EARAP0001",
				"settleModeName": "现金收付款",
				"orgCurrencyCode": "CNY",
				"taxSubjectName": "0%",
				"exchangeRateType": "0000L2HCW91M32DB8V0000",
				"enterpriseCashAccountName": "现金测试-欧元",
				"exchangeRateDate": "2022-06-24 00:00:00",
				"enterpriseCashAccount": "1451250525741252608",
				"oriCurrencyCode": "EUR",
				"localTaxExcludedAmount": 3996,
				"exchangeRateTypeCode": "01",
				"funder": "",
				"partner": "",
				"remarks": "*2",
				"customer": "1447840888653873158"
			}
		],
		"orgName": "收付新架构",
		"staffCode": "000000000000000000000024",
		"billDate": "2022-06-24 00:00:00",
		"settleModeServiceAttr": 1,
		"srcApp": "~",
		"verifyState": 0,
		"customerName": "收付客户",
		"funder_name": "",
		"blnWriteOff": 0,
		"billTypeName": "收款退款单",
		"projectName": "企业级项目1",
		"srcSystem": "0",
		"deptCode": "1001012",
		"billTypeCode": "arRefund",
		"code": "CREF00220624000003",
		"bustypeCode": "ar_refsale",
		"creatorUserName": "财务测试管理员",
		"contractNo": "*2",
		"writeOffState": "0",
		"exchangeRateTypeDigit": 6,
		"postStatus": "0",
		"oriTaxExcludedAmount": 444,
		"customerCode": "SF00001",
		"funder_code": "",
		"settleModeCode": "system_0002",
		"exchangeRateTypeName": "基准汇率",
		"projectCode": "00000001",
		"settleMode": "1441827152748609671",
		"orgCode": "EARAP0001",
		"staffName": "调入组织B部门的人员",
		"oriCurrencyMoneyDigit": 3,
		"effectState": "0",
		"pubts": "2022-06-27 19:26:29",
		"oriTaxIncludedAmount": 444,
		"creator": "edb903fc-43e8-4069-81fa-5690f911e499",
		"financeOrgCode": "EARAP0001",
		"org": "1447840081185341449",
		"billType": "2614243574141696",
		"staff": "1456470379894669321",
		"dept": "1456464117834448903",
		"settleModeName": "现金收付款",
		"bustypeName": "销售退款",
		"bustype": "1441827144161299178",
		"orgCurrencyCode": "CNY",
		"exchangeRateType": "0000L2HCW91M32DB8V0000",
		"modifierUserName": "万蓉蓉",
		"exchangeRateDate": "2022-06-24 00:00:00",
		"createTime": "2022-06-26 00:23:34",
		"oriCurrencyCode": "EUR",
		"localTaxExcludedAmount": 3996,
		"businessType": "2",
		"exchangeRateTypeCode": "01",
		"funder": "",
		"partner": "",
		"remarks": "*2",
		"customer": "1447840888653873158"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据被删除或没有权限	请检查请求数据正确性


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

