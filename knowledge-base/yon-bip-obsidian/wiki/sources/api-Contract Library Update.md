---
title: "合同库更新"
apiId: "1997066969987678214"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Center"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同库更新

> `ContentType	application/json` 请求方式	POST | 分类: Contract Center (CLMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CLMS/v1.0/contractlib/update

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | data |
| _status | string | 否 | 是 | 单据状态 目前仅支持Update 示例：Update 默认值：Update |
| sourceSys | string | 否 | 否 | 合同来源 1-CLM合同 2-旗舰版-采购 3-旗舰版-销售 4-高级版-采购 5-高级版-销售 6-第三方 示例：1 |
| id | string | 否 | 是 | 单据ID 示例：1262442766275123456 |
| isHaveTax | string | 否 | 否 | 合同金额是否含税 0-否 1是 示例：1 |
| type | string | 否 | 否 | 合同类型ID，合同类型编码和合同类型ID同时存在时，以ID为准 示例：1862442766275444739 |
| type___code | string | 否 | 否 | 合同类型编码 示例：zuzhi2 |
| deptId | string | 否 | 否 | 部门ID，部门编码和部门ID同时存在时，以ID为准 示例：1817417979877916676 |
| deptId___code | string | 否 | 否 | 部门编码 示例：assddfg |
| personId | string | 否 | 否 | 承办人ID，承办人编码和承办人ID同时存在时，以ID为准 示例：1873882695134609417 |
| personId___code | string | 否 | 否 | 承办人编码(即员工编码) 示例：00000001 |
| projectId | string | 否 | 否 | 关联项目ID，关联项目编码和关联项目ID同时存在时，以ID为准 示例：1817417739359748103 |
| projectId___code | string | 否 | 否 | 关联项目编码 示例：001 |
| contractId | string | 否 | 否 | 关联合同ID，关联合同编码和关联合同ID同时存在时，以ID为准 示例：1815417739359748122 |
| contractId___code | string | 否 | 否 | 关联合同编码 示例：2023000046 |
| settleAccountType | string | 否 | 否 | 结算方式ID，结算方式编码和结算方式ID同时存在时，以ID为准 示例：1817180167541359459 |
| settleAccountType___code | string | 否 | 否 | 结算方式编码 示例：system_0004 |
| lawType | string | 否 | 否 | 法律类别ID，法律类别编码和法律类别ID同时存在时，以ID为准 示例：1835351993791021059 |
| lawType___code | string | 否 | 否 | 法律类别编码 示例：L0001 |
| reDirection | string | 否 | 否 | 收支方向 0-无 1-收款 2-付款 示例：1 |
| status | string | 否 | 是 | 状态 3-已审核 8-生效 9-冻结 10-办结 11-终止 示例：3 默认值：8 |
| signDate | Date | 否 | 否 | 合同签订日期(格式:YYYY-MM-DD) 示例：2023-12-04 |
| planValidate | Date | 否 | 否 | 计划生效日期(格式:YYYY-MM-DD) 示例：2023-12-03 |
| planInvallidate | Date | 否 | 否 | 计划失效日期(格式:YYYY-MM-DD) 示例：2024-12-03 |
| valiDate | Date | 否 | 否 | 合同生效日期(格式:YYYY-MM-DD) 示例：2023-11-30 |
| invaliDate | Date | 否 | 否 | 合同终止日期(格式:YYYY-MM-DD) 示例：2024-11-12 |
| isOpenContract | string | 否 | 否 | 是否开口合同 1-是 0-否 示例：0 |
| isMaterial | string | 否 | 否 | 物料分类合同 0-否 1-是 示例：0 |
| signType | string | 否 | 否 | 签署方式 0-不签署 1-电子签署 2-线下签署 示例：1 |
| memo | string | 否 | 否 | 备注 示例：备注1 |
| totalOrigmny | BigDecimal | 否 | 否 | 无税总金额 |
| totalOrigtaxmny | BigDecimal | 否 | 否 | 合同总金额(价税合计) |
| totalOrigtax | BigDecimal | 否 | 否 | 税额 |
| warrantyPeriod | string | 否 | 否 | 质保期 示例：1 |
| marginOrigmny | BigDecimal | 否 | 否 | 履约保证金 |
| totalMny | BigDecimal | 否 | 否 | 无税总金额(本币) |
| totalTaxmny | BigDecimal | 否 | 否 | 合同总金额(价税合计本币) |
| totalTax | BigDecimal | 否 | 否 | 税额(本币) |
| prepayMny | BigDecimal | 否 | 否 | 预付款(本币) |
| marginMny | BigDecimal | 否 | 否 | 履约保证金(本币) |
| srvConfirorigmny | BigDecimal | 否 | 否 | 服务确认金额 |
| apOrigmny | BigDecimal | 否 | 否 | 应付金额 |
| invoiceOrigmny | BigDecimal | 否 | 否 | 收票金额 |
| paidMny | BigDecimal | 否 | 否 | 已付款金额(本币) |
| prepayOrigmny | BigDecimal | 否 | 否 | 预付款 |
| prepayPaidorigmny | BigDecimal | 否 | 否 | 已付预付款金额 |
| retentionOrigmny | BigDecimal | 否 | 否 | 质保金 |
| retentionPaidorigmny | BigDecimal | 否 | 否 | 已付质保金金额 |
| receivedBondorigmny | BigDecimal | 否 | 否 | 已收保证金金额 |
| returnBondorigmny | BigDecimal | 否 | 否 | 已退保证金金额 |
| srvConfirmny | BigDecimal | 否 | 否 | 服务确认金额(本币) |
| apMny | BigDecimal | 否 | 否 | 应付金额(本币) |
| invoiceMny | BigDecimal | 否 | 否 | 收票金额(本币) |
| prepayPaidmny | BigDecimal | 否 | 否 | 已付预付款金额(本币) |
| retentionPaidmny | BigDecimal | 否 | 否 | 已付质保金金额(本币) |
| receivedBondmny | BigDecimal | 否 | 否 | 已收保证金金额(本币) |
| returnBondmny | BigDecimal | 否 | 否 | 已退保证金金额(本币) |
| srcContractId | string | 否 | 否 | 来源合同ID 示例：1815417739359748122 |
| srcContractId___code | string | 否 | 否 | 来源合同编码 示例：000001 |
| paidOrigMny | BigDecimal | 否 | 否 | 已付款金额 |
| retentionMny | BigDecimal | 否 | 否 | 质保金(本币) |
| contractFileStatus | string | 否 | 否 | 归档状态 0-未归档 1-已归档 示例：0 |
| title | string | 否 | 否 | 合同名称 示例：合同 |
| signOrgid | string | 否 | 否 | 签约组织ID，签约组织编码和签约组织ID至少录入一项，签约组织编码和签约组织ID同时存在时，以ID为准 示例：1815417739359748122 |
| signOrgid___code | string | 否 | 否 | 签约组织编码 示例：000001 |
| orgId | string | 否 | 否 | 承办组织ID，承办组织编码和承办组织ID同时存在时，以ID为准 示例：1815417739359748122 |
| orgId___code | string | 否 | 否 | 承办组织编码 示例：000001 |
| billtypeId | string | 否 | 否 | 单据类型ID，单据类型编码和单据类型ID同时存在时，以ID为准 示例：1815417739359748122 |
| billtypeId___code | string | 否 | 否 | 单据类型编码 示例：clmContract |
| bustype | string | 否 | 否 | 交易类型ID，交易类型编码和交易类型ID同时存在时，以ID为准 示例：1815417739359748122 |
| bustype___code | string | 否 | 否 | 交易类型编码 示例：000001 |
| currencyId | string | 否 | 否 | 币种ID(本币)，币种编码(本币)和币种ID(本币)同时存在时，以ID为准 示例：1815417739359748122 |
| currencyId___code | string | 否 | 否 | 币种编码(本币) 示例：000001 |
| origcurrencyId | string | 否 | 否 | 币种ID，币种编码和币种ID同时存在时，以ID为准 示例：1815417739359748122 |
| origcurrencyId___code | string | 否 | 否 | 币种编码 示例：EUR |
| econtractTempId | string | 否 | 否 | 合同模板ID，合同模板编码和合同模板ID同时存在时，以ID为准 示例：1815417739359748122 |
| econtractTempId___code | string | 否 | 否 | 合同模板编码 示例：0000001 |
| settleOrgid | string | 否 | 否 | 结算组织ID，结算组织编码和结算组织ID同时存在时，以ID为准 示例：1815417739359748122 |
| settleOrgid___code | string | 否 | 否 | 结算组织编码 示例：000001 |
| ctClass | string | 否 | 否 | 合同性质 1-普通合同 2-框架协议 示例：1 |
| version | string | 否 | 否 | 版本号 示例：0 |
| signAddress | string | 否 | 否 | 签订地点 示例：BJ |
| performAddress | string | 否 | 否 | 履约地点 示例：BJ |
| ctSummary | string | 否 | 否 | 合同概要 示例：HT |
| secretLevel | string | 否 | 否 | 密级 1-公开 2-限制 3-秘密 4-机密 5-绝密 示例：1 |
| importantLevel | string | 否 | 否 | 重要程度 1-一般 2-普通 3-重大 示例：1 |
| isBackDate | string | 否 | 否 | 是否倒签 1-是 0-否 示例：0 |
| backDateCause | string | 否 | 否 | 倒签原因 |
| createMethod | string | 否 | 否 | 合同生成方式 0-非标准合同1-标准合同 示例：0 |
| concludeType | string | 否 | 否 | 签订类型 1-新签 2-续签 3-变更 4-其他 示例：1 |
| appendix | string | 否 | 否 | 合同附件信息 |
| settlementBasis | string | 否 | 否 | 结算依据 |
| sourceId | string | 否 | 否 | 合同来源id |
| code | string | 否 | 否 | 合同编码 |
| sourceBusiObj | string | 否 | 否 | 来源单据业务对象编码 |
| sourceCode | string | 否 | 否 | 来源单据编码 |
| bizFlowMakeBillCode | string | 否 | 否 | 单据转换规则编码 |
| firstId | string | 否 | 否 | 来源主表id |
| firstChildId | string | 否 | 否 | 来源单据子表id |
| firstBusiObj | string | 否 | 否 | 来源业务对象 |
| firstCode | string | 否 | 否 | 来源单据号 |
| contractLibCounterpartList | object | 是 | 否 | 相对方 |

## 3. 请求示例

Url: /yonbip/CLMS/v1.0/contractlib/update?access_token=访问令牌
Body: {
	"data": {
		"_status": "Update",
		"sourceSys": "1",
		"id": "1262442766275123456",
		"isHaveTax": "1",
		"type": "1862442766275444739",
		"type___code": "zuzhi2",
		"deptId": "1817417979877916676",
		"deptId___code": "assddfg",
		"personId": "1873882695134609417",
		"personId___code": "00000001",
		"projectId": "1817417739359748103",
		"projectId___code": "001",
		"contractId": "1815417739359748122",
		"contractId___code": "2023000046",
		"settleAccountType": "1817180167541359459",
		"settleAccountType___code": "system_0004",
		"lawType": "1835351993791021059",
		"lawType___code": "L0001",
		"reDirection": "1",
		"status": "3",
		"signDate": "2023-12-04",
		"planValidate": "2023-12-03",
		"planInvallidate": "2024-12-03",
		"valiDate": "2023-11-30",
		"invaliDate": "2024-11-12",
		"isOpenContract": "0",
		"isMaterial": "0",
		"signType": "1",
		"memo": "备注1",
		"totalOrigmny": 0,
		"totalOrigtaxmny": 0,
		"totalOrigtax": 0,
		"warrantyPeriod": "1",
		"marginOrigmny": 0,
		"totalMny": 0,
		"totalTaxmny": 0,
		"totalTax": 0,
		"prepayMny": 0,
		"marginMny": 0,
		"srvConfirorigmny": 0,
		"apOrigmny": 0,
		"invoiceOrigmny": 0,
		"paidMny": 0,
		"prepayOrigmny": 0,
		"prepayPaidorigmny": 0,
		"retentionOrigmny": 0,
		"retentionPaidorigmny": 0,
		"receivedBondorigmny": 0,
		"returnBondorigmny": 0,
		"srvConfirmny": 0,
		"apMny": 0,
		"invoiceMny": 0,
		"prepayPaidmny": 0,
		"retentionPaidmny": 0,
		"receivedBondmny": 0,
		"returnBondmny": 0,
		"srcContractId": "1815417739359748122",
		"srcContractId___code": "000001",
		"paidOrigMny": 0,
		"retentionMny": 0,
		"contractFileStatus": "0",
		"title": "合同",
		"signOrgid": "1815417739359748122",
		"signOrgid___code": "000001",
		"orgId": "1815417739359748122",
		"orgId___code": "000001",
		"billtypeId": "1815417739359748122",
		"billtypeId___code": "clmContract",
		"bustype": "1815417739359748122",
		"bustype___code": "000001",
		"currencyId": "1815417739359748122",
		"currencyId___code": "000001",
		"origcurrencyId": "1815417739359748122",
		"origcurrencyId___code": "EUR",
		"econtractTempId": "1815417739359748122",
		"econtractTempId___code": "0000001",
		"settleOrgid": "1815417739359748122",
		"settleOrgid___code": "000001",
		"ctClass": "1",
		"version": "0",
		"signAddress": "BJ",
		"performAddress": "BJ",
		"ctSummary": "HT",
		"secretLevel": "1",
		"importantLevel": "1",
		"isBackDate": "0",
		"backDateCause": "",
		"createMethod": "0",
		"concludeType": "1",
		"appendix": "",
		"settlementBasis": "",
		"sourceId": "",
		"code": "",
		"sourceBusiObj": "",
		"sourceCode": "",
		"bizFlowMakeBillCode": "",
		"firstId": "",
		"firstChildId": "",
		"firstBusiObj": "",
		"firstCode": "",
		"contractLibCounterpartList": [
			{
				"_status": "Insert：新增、Update：更新，Delete：删除，Unchanged：未变更",
				"id": "1815417739359748100",
				"merchantType": "1:客户，2:供应商",
				"customerId": "1815417739359748100",
				"customerId___code": "000001",
				"supplierId": "1815417739359748100",
				"supplierId___code": "000001"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| fromApi | string | 否 | open-api标识 示例：true 默认值：true |
| data | object | 否 | data |
| sourceSysid | string | 否 | 合同来源 1-CLM合同 2-旗舰版-采购 3-旗舰版-销售 4-高级版-采购 5-高级版-销售 6-第三方 示例：1 |
| id | string | 否 | 单据ID 示例：1262442766275123456 |
| contractTitle | string | 否 | 合同名称 示例：我的open-api12-405 |
| isTax | string | 否 | 合同金额是否含税 0-否 1是 示例：1 |
| contractType | string | 否 | 合同类型ID，合同类型编码和合同类型ID同时存在时，以ID为准 示例：1862442766275444739 |
| deptId | string | 否 | 部门ID，部门编码和部门ID同时存在时，以ID为准 示例：1817417979877916676 |
| personId | string | 否 | 承办人ID，承办人编码和承办人ID同时存在时，以ID为准 示例：1873882695134609417 |
| refprojectId | string | 否 | 关联项目ID，关联项目编码和关联项目ID同时存在时，以ID为准 示例：1817417739359748103 |
| refcontractId | string | 否 | 关联合同ID，关联合同编码和关联合同ID同时存在时，以ID为准 示例：1815417739359748122 |
| settleType | string | 否 | 结算方式ID，结算方式编码和结算方式ID同时存在时，以ID为准 示例：1817180167541359459 |
| lawType | string | 否 | 法律类别ID，法律类别编码和法律类别ID同时存在时，以ID为准 示例：1835351993791021059 |
| reDirection | string | 否 | 收支方向 0-无 1-收款 2-付款 示例：1 |
| status | string | 否 | 状态 3-已审核 8-生效 默认已审核 示例：3 |
| signDate | Date | 否 | 合同签订日期(格式:YYYY-MM-DD) 示例：2023-12-04 |
| planValidate | Date | 否 | 计划生效日期(格式:YYYY-MM-DD) 示例：2023-12-03 |
| planInvallidate | Date | 否 | 计划失效日期(格式:YYYY-MM-DD) 示例：2024-12-03 |
| valiDate | Date | 否 | 合同生效日期(格式:YYYY-MM-DD) 示例：2023-11-30 |
| invaliDate | Date | 否 | 合同终止日期(格式:YYYY-MM-DD) 示例：2024-11-12 |
| isOpenContract | string | 否 | 是否开口合同 1-是 0-否 示例：0 |
| isMatclsCt | string | 否 | 物料分类合同 0-否 1-是 示例：0 |
| signType | string | 否 | 签署方式 0-不签署 1-电子签署 2-线下签署 示例：1 |
| memo | string | 否 | 备注 示例：备注1 |
| totalOrigmny | BigDecimal | 否 | 无税总金额 |
| totalOrigtaxmny | BigDecimal | 否 | 合同总金额(价税合计) |
| totalOrigtax | BigDecimal | 否 | 税额 |
| warrantyPeriod | string | 否 | 质保期 示例：1 |
| marginOrigmny | BigDecimal | 否 | 履约保证金 |
| totalMny | BigDecimal | 否 | 无税总金额(本币) |
| totalTaxmny | BigDecimal | 否 | 合同总金额(价税合计本币) |
| totalTax | BigDecimal | 否 | 税额(本币) |
| prepayMny | BigDecimal | 否 | 预付款(本币) |
| marginMny | BigDecimal | 否 | 履约保证金(本币) |
| srvConfirorigmny | BigDecimal | 否 | 服务确认金额 |
| apOrigmny | BigDecimal | 否 | 应付金额 |
| invoiceOrigmny | BigDecimal | 否 | 收票金额 |
| paidMny | BigDecimal | 否 | 已付款金额(本币) |
| prepayOrigmny | BigDecimal | 否 | 预付款 |
| prepayPaidorigmny | BigDecimal | 否 | 已付预付款金额 |
| retentionOrigmny | BigDecimal | 否 | 质保金 |
| retentionPaidorigmny | BigDecimal | 否 | 已付质保金金额 |
| receivedBondorigmny | BigDecimal | 否 | 已收保证金金额 |
| returnBondorigmny | BigDecimal | 否 | 已退保证金金额 |
| srvConfirmny | BigDecimal | 否 | 服务确认金额(本币) |
| apMny | BigDecimal | 否 | 应付金额(本币) |
| invoiceMny | BigDecimal | 否 | 收票金额(本币) |
| prepayPaidmny | BigDecimal | 否 | 已付预付款金额(本币) |
| retentionPaidmny | BigDecimal | 否 | 已付质保金金额(本币) |
| receivedBondmny | BigDecimal | 否 | 已收保证金金额(本币) |
| returnBondmny | BigDecimal | 否 | 已退保证金金额(本币) |
| srcContractId | string | 否 | 来源合同ID，来源合同编码和来源合同ID同时存在时，以ID为准 示例：1815417739359748122 |
| settlementBasis | string | 否 | 结算依据 示例：依据物料明细进行结算 |
| paidOrigMny | BigDecimal | 否 | 已付款金额 |
| retentionMny | BigDecimal | 否 | 质保金(本币) |
| archivedStatus | string | 否 | 归档状态 0-未归档 1-已归档 示例：0 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"fromApi": "true",
		"data": {
			"sourceSysid": "1",
			"id": "1262442766275123456",
			"contractTitle": "我的open-api12-405",
			"isTax": "1",
			"contractType": "1862442766275444739",
			"deptId": "1817417979877916676",
			"personId": "1873882695134609417",
			"refprojectId": "1817417739359748103",
			"refcontractId": "1815417739359748122",
			"settleType": "1817180167541359459",
			"lawType": "1835351993791021059",
			"reDirection": "1",
			"status": "3",
			"signDate": "2023-12-04",
			"planValidate": "2023-12-03",
			"planInvallidate": "2024-12-03",
			"valiDate": "2023-11-30",
			"invaliDate": "2024-11-12",
			"isOpenContract": "0",
			"isMatclsCt": "0",
			"signType": "1",
			"memo": "备注1",
			"totalOrigmny": 0,
			"totalOrigtaxmny": 0,
			"totalOrigtax": 0,
			"warrantyPeriod": "1",
			"marginOrigmny": 0,
			"totalMny": 0,
			"totalTaxmny": 0,
			"totalTax": 0,
			"prepayMny": 0,
			"marginMny": 0,
			"srvConfirorigmny": 0,
			"apOrigmny": 0,
			"invoiceOrigmny": 0,
			"paidMny": 0,
			"prepayOrigmny": 0,
			"prepayPaidorigmny": 0,
			"retentionOrigmny": 0,
			"retentionPaidorigmny": 0,
			"receivedBondorigmny": 0,
			"returnBondorigmny": 0,
			"srvConfirmny": 0,
			"apMny": 0,
			"invoiceMny": 0,
			"prepayPaidmny": 0,
			"retentionPaidmny": 0,
			"receivedBondmny": 0,
			"returnBondmny": 0,
			"srcContractId": "1815417739359748122",
			"settlementBasis": "依据物料明细进行结算",
			"paidOrigMny": 0,
			"retentionMny": 0,
			"archivedStatus": "0"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-02

更新

请求说明

更新

请求参数 (43)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

