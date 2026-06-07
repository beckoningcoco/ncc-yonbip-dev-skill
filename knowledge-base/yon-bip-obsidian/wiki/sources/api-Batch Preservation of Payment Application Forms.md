---
title: "付款申请单批量保存"
apiId: "2138725771785011203"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Application"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款申请单批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Payment Application (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/paymentApply/batchsave

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
| data | object | 是 | 是 | 业务数据 |
| extSystemCode | string | 否 | 否 | 外部系统编码（与外部系统单号联合做幂等性校验，有外部系统编码，需有外部系统单号，否则将返回提示） 示例：AB1234 |
| extVouchCode | string | 否 | 否 | 外部系统单号（与外部系统编码联合做幂等性校验，有外部系统单号，没有外部系统编码时，将不进行校验） 示例：AB1234 |
| code | string | 否 | 否 | 申请单编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值；更新数据时需要传值) 示例：xx157611823880 |
| creator | string | 否 | 否 | 创建人id 示例：9dff758d-bfc2-4b90-sda231 |
| srcBillType | string | 否 | 否 | 来源单据类型(枚举值 1:销售订单; 2:销售合同; 3:项目收款计划; 4:应收事务; 5:销售退货; 6:应付事务; 7:采购订单; 8:项目付款预测; 9:采购合同; 10:付款申请单; 11:U订货; 12:费用单; 13:采购发票; 14:销售发票; 15:出库单; 16:收款单; 17:采购入库; 18:委外订单; 19:银行到账认领单) 示例：1 |
| srcBillId | string | 否 | 否 | 来源单据id 示例：20562372655605350 |
| funderBankAccount_no | string | 否 | 否 | 资金业务对象银行账号 示例：222 |
| funderBankAccount | string | 否 | 否 | 资金业务对象银行账户id 示例：1576118239423876 |
| employeeBankAccount | string | 否 | 否 | 员工银行账户id 示例：1576118239423876 |
| supplierBankAccount | string | 否 | 否 | 供应商银行账户id 示例：1576118238809423876 |
| financeOrg | string | 否 | 否 | 付款组织id (付款组织id和付款组织编码不能同时为空，id和编码同时存在，以id为准) 示例：1515936384070713348 |
| financeOrgCode | string | 否 | 否 | 付款组织编码 (付款组织id和付款组织编码不能同时为空，id和编码同时存在，以id为准) 示例：22 |
| billDate | string | 否 | 是 | 单据日期 (格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-25 00:00:00 |
| bustype | string | 否 | 否 | 交易类型id (交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准) 示例：1530950378571956232 |
| bustypeCode | string | 否 | 否 | 交易类型编码 (交易类型id和交易类型编码不能同时为空，id和编码同时存在，以id为准) 示例：ap_paypurc |
| org | string | 否 | 否 | 业务组织id (业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准) 示例：1515936384070713348 |
| orgCode | string | 否 | 否 | 业务组织编码 (业务组织id和业务组织编码不能同时为空，id和编码同时存在，以id为准) 示例：22 |
| settleModeCode | string | 否 | 否 | 结算方式编码 示例：02 |
| settleMode | string | 否 | 否 | 结算方式id 示例：1514492098231927563 |
| oriCurrency | string | 否 | 否 | 币种id (币种id和币种简称不能同时为空，id和简称同时存在，以id为准) 示例：1514492081064640537 |
| oriCurrencyCode | string | 否 | 否 | 原币编码 (币种id和币种简称不能同时为空，id和简称同时存在，以id为准) 示例：CNY |
| objectType | string | 否 | 是 | 往来对象类型 (枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0 |
| funder | string | 否 | 否 | 资金业务对象id((往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：0023 |
| funder_code | string | 否 | 否 | 资金业务对象编码（往来对象类型是3时必输：资金业务对象id和资金业务对象编码不能同时为空) 示例：ZJDX230511000023 |
| supplier | string | 否 | 否 | 供应商id (往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准) 示例：1570200967882211330 |
| supplierCode | string | 否 | 否 | 供应商编码 (往来对象类型是0时必输：供应商id和供应商编码不能同时为空，id和编码同时存在，以id为准) 示例：0001000111 |
| employeeCode | string | 否 | 否 | 员工编码 (往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) 示例：EMPLOYEE |
| employee | string | 否 | 否 | 员工id (往来对象类型是2时必输：员工id和员工编码不能同时为空，id和编码同时存在，以id为准) |
| dept | string | 否 | 否 | 部门id 示例：1541188017240670209 |
| deptCode | string | 否 | 否 | 部门编码 示例：iewr88893 |
| staff | string | 否 | 否 | 业务员id 示例：1541190095987539977 |
| staffCode | string | 否 | 否 | 业务员编码 示例：000000000000000000000056 |
| project | string | 否 | 否 | 项目id 示例：1524726988144640008 |
| projectCode | string | 否 | 否 | 项目编码 示例：00000001 |
| remarks | string | 否 | 否 | 备注 示例：备注 |
| hopePayDate | string | 否 | 否 | 期望付款日期 (格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-25 00:00:00 |
| bodyItem | object | 是 | 是 | 表体数据（必输） |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert |

## 3. 请求示例

Url: /yonbip/EFI/paymentApply/batchsave?access_token=访问令牌
Body: {
	"data": [
		{
			"extSystemCode": "AB1234",
			"extVouchCode": "AB1234",
			"code": "xx157611823880",
			"creator": "9dff758d-bfc2-4b90-sda231",
			"srcBillType": "1",
			"srcBillId": "20562372655605350",
			"funderBankAccount_no": "222",
			"funderBankAccount": "1576118239423876",
			"employeeBankAccount": "1576118239423876",
			"supplierBankAccount": "1576118238809423876",
			"financeOrg": "1515936384070713348",
			"financeOrgCode": "22",
			"billDate": "2022-10-25 00:00:00",
			"bustype": "1530950378571956232",
			"bustypeCode": "ap_paypurc",
			"org": "1515936384070713348",
			"orgCode": "22",
			"settleModeCode": "02",
			"settleMode": "1514492098231927563",
			"oriCurrency": "1514492081064640537",
			"oriCurrencyCode": "CNY",
			"objectType": "0",
			"funder": "0023",
			"funder_code": "ZJDX230511000023",
			"supplier": "1570200967882211330",
			"supplierCode": "0001000111",
			"employeeCode": "EMPLOYEE",
			"employee": "",
			"dept": "1541188017240670209",
			"deptCode": "iewr88893",
			"staff": "1541190095987539977",
			"staffCode": "000000000000000000000056",
			"project": "1524726988144640008",
			"projectCode": "00000001",
			"remarks": "备注",
			"hopePayDate": "2022-10-25 00:00:00",
			"bodyItem": [
				{
					"issueNo": "1234",
					"funderBankAccount_no": "222",
					"funderBankAccount": "1723003165501554689",
					"employeeBankAccount": "157611829423876",
					"supplierBankAccount": "1576118238809423876",
					"expireDate": "2022-10-25 00:00:00",
					"quickTypeCode": "03",
					"projectCode": "XMCODE",
					"project": "1524726988144640008",
					"demanderProCenterCode": "code",
					"demanderProCenter": "1514561161320726531",
					"oriAmount": 100,
					"costCenter": "1571463619664674825",
					"expenseItem": "1563517234381848580",
					"rowNo": 10,
					"expenseItemCode": "FEIYONGCODE",
					"costCenterCode": "COSTCODE",
					"quickType": "1514492089653002551",
					"supplierProCenterCode": "CODE",
					"supplierProCenter": "1541185843986694146",
					"settleModeCode": "SETTLE",
					"settleMode": "1514492098231927563",
					"orgCode": "ORGCODE",
					"org": "1515936384070713348",
					"staffCode": "STAFF",
					"staff": "1541190095987539977",
					"deptCode": "DEPT",
					"dept": "1541188017240670209",
					"material": "1519733495946543105",
					"remarks": "备注",
					"material_code": "000001",
					"_status": "Insert",
					"extRowNo": "",
					"orderNo": "456",
					"invoiceNo": "456",
					"contractNo": "456",
					"srcBillType": "1",
					"srcBillId": "20562372655605350",
					"srcBillRowId": "20562372655605350"
				}
			],
			"_status": "Insert"
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
| extSystemCode | string | 否 | 外部系统编码 示例：AB1234 |
| extVouchCode | string | 否 | 外部系统单号 示例：AB1234 |
| partner | string | 否 | 业务伙伴id 示例：1664394763341660162 |
| partner_name | string | 否 | 业务伙伴名称 示例：业务伙伴-北京 |
| funderBankAccount | string | 否 | 资金业务对象银行账户id 示例：1723022054772441095 |
| srcBillId | string | 否 | 来源单据id 示例：1728256786694144000 |
| funder | string | 否 | 资金业务对象id 示例：1723023935968116743 |
| funder_code | string | 否 | 资金业务对象编码 示例：ZJDX230511000025 |
| srcBillType | string | 否 | 来源单据类型(枚举值 1:销售订单; 2:销售合同; 3:项目收款计划; 4:应收事务; 5:销售退货; 6:应付事务; 7:采购订单; 8:项目付款预测; 9:采购合同; 10:付款申请单; 11:U订货; 12:费用单; 13:采购发票; 14:销售发票; 15:出库单; 16:收款单; 17:采购入库; 18:委外订单; 19:银行到账认领单) 示例：1 |
| bustype | string | 否 | 交易类型id 示例：1525626900144640003 |
| dept | string | 否 | 部门id 示例：1524726900144640004 |
| project | string | 否 | 项目id 示例：1524726988144640008 |
| code | string | 否 | 申请单编号 示例：000067 |
| busiObj | string | 否 | 业务对象 示例：paymentApply |
| oriCurrency | string | 否 | 币种id 示例：1514492081064640537 |
| financeOrg | string | 否 | 付款组织id 示例：1514635936684048389 |
| oriOccupyAmount | number |
| 小数位数:8,最大长度:28 | 否 | 预占用金额 示例：0 |
| dr | number |
| 小数位数:0,最大长度:6 | 否 | 删除标识 示例：0 |
| objectType | string | 否 | (枚举值 0:供应商；2:员工；3:资金业务对象) 示例：0 |
| supplier | string | 否 | 供应商id 示例：1570032716829687812 |
| id | string | 否 | 付款申请单表头id 示例：1574097405271343112 |
| bodyItem | object | 是 | 表体数据 |
| billDate | string | 否 | 单据日期(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-22 00:00:00 |
| _status | number |
| 小数位数:0,最大长度:6 | 否 | 持久化层标识(枚举值 0:不变; 1:更新; 2:新增; 3:删除) 示例：0 |
| verifyState | number |
| 小数位数:0,最大长度:6 | 否 | 审批流状态(枚举值 0:待提交; 1:审批中; 2:已审批; 3:终止; 4:已驳回) 示例：0 |
| cBillNo | string | 否 | 单据编码 示例：paymentApply |
| pubts | string | 否 | 时间戳(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-22 22:30:57 |
| creator | string | 否 | 创建人 示例：cc4f9a8e-aad9-46b8-9ecb-fd61d738754a |
| org | string | 否 | 业务组织id 示例：1514635936684048389 |
| billType | string | 否 | 单据类型id 示例：1530935895942234114 |
| createTime | string | 否 | 创建时间(格式为:yyyy-MM-dd HH:mm:ss) 示例：2022-10-22 22:30:56 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"extSystemCode": "AB1234",
		"extVouchCode": "AB1234",
		"partner": "1664394763341660162",
		"partner_name": "业务伙伴-北京",
		"funderBankAccount": "1723022054772441095",
		"srcBillId": "1728256786694144000",
		"funder": "1723023935968116743",
		"funder_code": "ZJDX230511000025",
		"srcBillType": "1",
		"bustype": "1525626900144640003",
		"dept": "1524726900144640004",
		"project": "1524726988144640008",
		"code": "000067",
		"busiObj": "paymentApply",
		"oriCurrency": "1514492081064640537",
		"financeOrg": "1514635936684048389",
		"oriOccupyAmount": 0,
		"dr": 0,
		"objectType": "0",
		"supplier": "1570032716829687812",
		"id": "1574097405271343112",
		"bodyItem": [
			{
				"funderBankAccount": "1723022054772441095",
				"quickTypeCode": "12",
				"oriOccupyAmount": 0,
				"headerId": "1574097405271343112",
				"dr": 0,
				"id": "1574097413861277701",
				"oriAmount": 99,
				"_status": 0,
				"rowNo": 10,
				"quickType": "1514492089653002550",
				"pubts": "2022-10-22 22:30:57",
				"creator": "cc4f9a8e-aad9-46b8-9ecb-fd61d738754a",
				"org": "1514635936684048389",
				"createTime": "2022-10-22 22:30:57",
				"verifyState": 0,
				"extRowNo": "AB1234",
				"srcBillType": "1",
				"srcBillId": "1728256786694144000",
				"srcBillRowId": "20562372655605350"
			}
		],
		"billDate": "2022-10-22 00:00:00",
		"_status": 0,
		"verifyState": 0,
		"cBillNo": "paymentApply",
		"pubts": "2022-10-22 22:30:57",
		"creator": "cc4f9a8e-aad9-46b8-9ecb-fd61d738754a",
		"org": "1514635936684048389",
		"billType": "1530935895942234114",
		"createTime": "2022-10-22 22:30:56"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

