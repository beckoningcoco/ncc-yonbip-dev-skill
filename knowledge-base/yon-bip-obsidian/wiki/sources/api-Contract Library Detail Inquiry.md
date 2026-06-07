---
title: "合同库详情查询"
apiId: "2031941236856717315"
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

# 合同库详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Contract Center (CLMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CLMS/v1.0/contractLib/detailById

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 合同库ID    示例: 1858682436506353673 |
| datasource | string | query | 否 | 数据源    示例: mainEntity    默认值: mainEntity |

## 3. 请求示例

Url: /yonbip/CLMS/v1.0/contractLib/detailById?access_token=访问令牌&id=1858682436506353673&datasource=mainEntity

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码 示例：200 默认值：true |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | data |
| _status | string | 否 | 单据状态 目前仅支持Insert 示例：Insert 默认值：Insert |
| sourceSys | string | 否 | 合同来源 1-CLM合同 2-旗舰版-采购 3-旗舰版-销售 4-高级版-采购 5-高级版-销售 6-第三方 示例：1 |
| title | string | 否 | 合同名称 示例：我的open-api12-405 |
| type | string | 否 | 合同类型ID，合同类型编码和合同类型ID同时存在时，以ID为准 示例：1862442766275444739 |
| type___code | string | 否 | 合同类型编码 示例：zuzhi2 |
| ctClass | string | 否 | 合同性质 1-普通合同 2-框架协议 示例：1 |
| version | string | 否 | 版本号 示例：0 |
| status | string | 否 | 状态 3-已审核 8-生效 默认已审核 示例：3 |
| ctPeriod | string | 否 | 合同期限 0-固定期限 1-无固定期限 示例：0 |
| signDate | Date | 否 | 合同签订日期(格式:YYYY-MM-DD) 示例：2023-12-04 |
| planValidate | Date | 否 | 计划生效日期(格式:YYYY-MM-DD) 示例：2023-12-03 |
| planInvallidate | Date | 否 | 计划失效日期(格式:YYYY-MM-DD) 示例：2024-12-03 |
| valiDate | Date | 否 | 合同生效日期(格式:YYYY-MM-DD) 示例：2023-11-30 |
| invaliDate | Date | 否 | 合同终止日期(格式:YYYY-MM-DD) 示例：2024-11-12 |
| signAddress | string | 否 | 签订地点 示例：北京 |
| performAddress | string | 否 | 履约地点 示例：用友 |
| ctSummary | string | 否 | 合同概要 示例：概要 |
| appendix | string | 否 | 合同附件 |
| memo | string | 否 | 备注 示例：备注1 |
| currencyId | string | 否 | 币种ID(本币)，币种编码(本币)和币种ID(本币)同时存在时，以ID为准 示例：1817179643556921384 |
| currencyId___code | string | 否 | 币种编码(本币) 示例：EUR |
| mny | BigDecimal | 否 | 本币合同金额 示例：100 |
| oriCurrencyId | string | 否 | 原币 示例：14141341431 |
| oriCurrencyId___code | string | 否 | 原币编码 |
| oriHaveTaxMny | BigDecimal | 否 | 原币含税金额 示例：1431 |
| oriNoTaxMny | BigDecimal | 否 | 原币无税金额 示例：1431 |
| oriTaxAmount | BigDecimal | 否 | 原币合同税额 示例：1431 |
| exchangeRate | BigDecimal | 否 | 汇率 示例：100 |
| rateDate | Date | 否 | 汇率日期 示例：100 |
| rateType | string | 否 | 汇率类型ID 示例：134234289 |
| rateType___code | string | 否 | 汇率类型编码 |
| beginningFlag | string | 否 | 期初标记 0-否 1-是 示例：134234289 |
| urgentLevel | string | 否 | 紧急程度 1-一般 2-紧急 3-特急 示例：2 |
| signOrgid | string | 否 | 签约组织ID，签约组织编码和签约组织ID至少录入一项，签约组织编码和签约组织ID同时存在时，以ID为准 示例：1817417739359748103 |
| signOrgid___code | string | 否 | 签约组织编码 示例：qwert |
| clmContractFileId | string | 否 | 合同文本对象Id 示例：1817417739359748103 |
| clmContractFileId___code | string | 否 | 合同文本对象编码 |
| orgId | string | 否 | 承办组织ID，承办组织编码和承办组织ID同时存在时，以ID为准 示例：1817417739359748103 |
| orgId___code | string | 否 | 承办组织编码 示例：qwert |
| isHaveTax | string | 否 | 合同金额是否含税 0-否 1是 示例：1 |
| billtypeId | string | 否 | 单据类型ID 示例：1862442766275544737 |
| billtypeId___code | string | 否 | 单据类型编码 |
| billtypeCode | string | 否 | 单据类型编码 示例：clmContract 默认值：clmContract |
| bustype | string | 否 | 交易类型ID，交易类型编码和交易类型ID同时存在时，以ID为准 示例：1818179305792864264 |
| bustype___code | string | 否 | 交易类型编码 示例：WZLCGHT |
| signSubjectId | string | 否 | 承办组织ID 示例：1818179305792864264 |
| signSubjectId___code | string | 否 | 承办组织编码 |
| origcurrencyId | string | 否 | 币种ID，币种编码和币种ID同时存在时，以ID为准 示例：1817179643556921384 |
| origcurrencyId___code | string | 否 | 币种编码 示例：EUR |
| econtractTempCode | string | 否 | 合同模板编码 示例：1853639388987654150 |
| econtractVersion | string | 否 | 合同模板版本号 示例：000001 |
| econtractTempId | string | 否 | 合同模板ID |
| econtractTempId___code | string | 否 | 合同模板编码 |
| offStandardFile | string | 否 | 非标准合同文本 示例：djgldsjg |
| offStandardCause | string | 否 | 选择非标准合同的原因 示例：djgldsdsfjg |
| invaliCause | string | 否 | 合同终止原因 示例：djgldsdsfjg |
| finishFile | string | 否 | 定稿文件/送签文件 示例：定稿文件 |
| isEcontract | string | 否 | 是否为电子合同 0-否 1-是 示例：1 |
| label | string | 否 | 合同标签 示例：sdfsf |
| taxAmount | BigDecimal | 否 | 本币税额 示例：100 |
| noTaxMny | BigDecimal | 否 | 本币无税金额 示例：100 |
| haveTaxMny | BigDecimal | 否 | 本币含税金额 示例：100 |
| changeTimes | int | 否 | 变更次数 示例：100 |
| changeCreator | string | 否 | 变更申请人 示例：13413414 |
| changeCreator___code | string | 否 | 变更申请人编码 |
| finalizeStatus | string | 否 | 定稿状态 0-未定稿 1-已定稿 示例：1 |
| signEcontractFile | string | 否 | 签署电子版 示例：定稿文件 |
| changeStatus | string | 否 | 变更状态 1-未提交 2-变更中 3-变更不通过 4-变更完成 0-未变更 示例：1 |
| signPaperFile | string | 否 | 签署纸质回传版 示例：定稿文件 |
| repleFile | string | 否 | 补充协议文件 示例：定稿文件 |
| contractJournalId | string | 否 | 合同台账ID 示例：定稿文件 |
| contractFileStatus | string | 否 | 合同归档状态 0-未归档 1-已归档 示例：1 |
| bWatermark | string | 否 | 是否无水印 0-无 1-有 示例：1 |
| changeContractId | string | 否 | 变更合同id 示例：13413414 |
| changeContractId___code | string | 否 | 变更合同编码 |
| signProcessId | string | 否 | 签署流程id 示例：13413414 |
| businessFileId | string | 否 | 合同文本附件 id 示例：13413414 |
| settleOrgid | string | 否 | 结算组织ID，结算组织编码和结算组织ID同时存在时，以ID为准 示例：1817417739359748103 |
| settleOrgid___code | string | 否 | 结算组织编码 示例：qwert |
| deptId | string | 否 | 部门ID，部门编码和部门ID同时存在时，以ID为准 示例：1817417979877916676 |
| deptId___code | string | 否 | 部门编码 示例：assddfg |
| personId | string | 否 | 承办人ID，承办人编码和承办人ID同时存在时，以ID为准 示例：1873882695134609417 |
| personId___code | string | 否 | 承办人编码(即员工编码) 示例：00000001 |
| projectId | string | 否 | 关联项目ID，关联项目编码和关联项目ID同时存在时，以ID为准 示例：1817417739359748103 |
| projectId___code | string | 否 | 关联项目编码 示例：001 |
| contractId | string | 否 | 关联合同ID，关联合同编码和关联合同ID同时存在时，以ID为准 示例：1815417739359748122 |
| contractId___code | string | 否 | 关联合同编码 示例：2023000046 |
| groupId | string | 否 | 合同分组ID 示例：1815417739359748122 |
| groupId___code | string | 否 | 合同分组编码 |
| settleAccountType | string | 否 | 结算方式ID，结算方式编码和结算方式ID同时存在时，以ID为准 示例：1817180167541359459 |
| settleAccountType___code | string | 否 | 结算方式编码 示例：system_0004 |
| physicalStamp | string | 否 | 物理印章ID，物理印章编码和物理印章ID同时存在时，以ID为准 示例：1817180167541359459 |
| physicalStamp___code | string | 否 | 物理印章编码 示例：system_0004 |
| stampStatus | string | 否 | 用印状态 示例：1 |
| lawType | string | 否 | 法律类别ID，法律类别编码和法律类别ID同时存在时，以ID为准 示例：1835351993791021059 |
| lawType___code | string | 否 | 法律类别编码 示例：L0001 |
| reDirection | string | 否 | 收支方向 0-无 1-收款 2-付款 示例：1 |
| secretLevel | string | 否 | 密级 1-公开 2-限制 3-秘密 4-机密 5-绝密 示例：0 |
| importantLevel | string | 否 | 重要程度 1-一般 2-普通 3-重大 示例：2 |
| isOpenContract | string | 否 | 是否开口合同 1-是 0-否 示例：0 |
| isMaterial | string | 否 | 物料分类合同 0-否 1-是 示例：0 |
| isBackDate | string | 否 | 是否倒签 1-是 0-否 示例：0 |
| signPriority | string | 否 | 签署优先级 示例：1 |
| backDateCause | string | 否 | 倒签原因 |
| createMethod | string | 否 | 合同生成方式 0-非标准合同1-标准合同 示例：1 |
| concludeType | string | 否 | 签订类型 1-新签 2-续签 3-变更 4-其他 示例：1 |
| signType | string | 否 | 签署方式 0-不签署 1-电子签署 2-线下签署 示例：1 |
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
| econtractFile | string | 否 | 合同文本信息 |
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
| srcContractId___code | string | 否 | 来源合同编码 示例：2023000046 |
| settlementBasis | string | 否 | 结算依据 示例：依据物料明细进行结算 |
| paidOrigMny | BigDecimal | 否 | 已付款金额 |
| sourceId | string | 否 | 合同来源id 示例：1873853918878892035 |
| code | string | 否 | 合同编码 示例：2023000048 |
| sourceBusiObj | string | 否 | 来源单据业务对象编码 |
| sourceCode | string | 否 | 来源单据编码 |
| bizFlowMakeBillCode | string | 否 | 单据转换规则编码 示例：clmContract2ContractJournal |
| firstId | string | 否 | 来源主表id |
| firstChildId | string | 否 | 来源单据子表id |
| firstBusiObj | string | 否 | 来源业务对象 |
| firstCode | string | 否 | 来源单据号 |
| retentionMny | BigDecimal | 否 | 质保金(本币) |
| archivedStatus | string | 否 | 归档状态 0-未归档 1-已归档 示例：0 |
| contractLibCounterpartList | object | 是 | 合同库相对方 |
| contractLibChangeList | object | 是 | 合同库变更信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"_status": "Insert",
		"sourceSys": "1",
		"title": "我的open-api12-405",
		"type": "1862442766275444739",
		"type___code": "zuzhi2",
		"ctClass": "1",
		"version": "0",
		"status": "3",
		"ctPeriod": "0",
		"signDate": "2023-12-04",
		"planValidate": "2023-12-03",
		"planInvallidate": "2024-12-03",
		"valiDate": "2023-11-30",
		"invaliDate": "2024-11-12",
		"signAddress": "北京",
		"performAddress": "用友",
		"ctSummary": "概要",
		"appendix": "",
		"memo": "备注1",
		"currencyId": "1817179643556921384",
		"currencyId___code": "EUR",
		"mny": 100,
		"oriCurrencyId": "14141341431",
		"oriCurrencyId___code": "",
		"oriHaveTaxMny": 1431,
		"oriNoTaxMny": 1431,
		"oriTaxAmount": 1431,
		"exchangeRate": 100,
		"rateDate": "100",
		"rateType": "134234289",
		"rateType___code": "",
		"beginningFlag": "134234289",
		"urgentLevel": "2",
		"signOrgid": "1817417739359748103",
		"signOrgid___code": "qwert",
		"clmContractFileId": "1817417739359748103",
		"clmContractFileId___code": "",
		"orgId": "1817417739359748103",
		"orgId___code": "qwert",
		"isHaveTax": "1",
		"billtypeId": "1862442766275544737",
		"billtypeId___code": "",
		"billtypeCode": "clmContract",
		"bustype": "1818179305792864264",
		"bustype___code": "WZLCGHT",
		"signSubjectId": "1818179305792864264",
		"signSubjectId___code": "",
		"origcurrencyId": "1817179643556921384",
		"origcurrencyId___code": "EUR",
		"econtractTempCode": "1853639388987654150",
		"econtractVersion": "000001",
		"econtractTempId": "",
		"econtractTempId___code": "",
		"offStandardFile": "djgldsjg",
		"offStandardCause": "djgldsdsfjg",
		"invaliCause": "djgldsdsfjg",
		"finishFile": "定稿文件",
		"isEcontract": "1",
		"label": "sdfsf",
		"taxAmount": 100,
		"noTaxMny": 100,
		"haveTaxMny": 100,
		"changeTimes": 100,
		"changeCreator": "13413414",
		"changeCreator___code": "",
		"finalizeStatus": "1",
		"signEcontractFile": "定稿文件",
		"changeStatus": "1",
		"signPaperFile": "定稿文件",
		"repleFile": "定稿文件",
		"contractJournalId": "定稿文件",
		"contractFileStatus": "1",
		"bWatermark": "1",
		"changeContractId": "13413414",
		"changeContractId___code": "",
		"signProcessId": "13413414",
		"businessFileId": "13413414",
		"settleOrgid": "1817417739359748103",
		"settleOrgid___code": "qwert",
		"deptId": "1817417979877916676",
		"deptId___code": "assddfg",
		"personId": "1873882695134609417",
		"personId___code": "00000001",
		"projectId": "1817417739359748103",
		"projectId___code": "001",
		"contractId": "1815417739359748122",
		"contractId___code": "2023000046",
		"groupId": "1815417739359748122",
		"groupId___code": "",
		"settleAccountType": "1817180167541359459",
		"settleAccountType___code": "system_0004",
		"physicalStamp": "1817180167541359459",
		"physicalStamp___code": "system_0004",
		"stampStatus": "1",
		"lawType": "1835351993791021059",
		"lawType___code": "L0001",
		"reDirection": "1",
		"secretLevel": "0",
		"importantLevel": "2",
		"isOpenContract": "0",
		"isMaterial": "0",
		"isBackDate": "0",
		"signPriority": "1",
		"backDateCause": "",
		"createMethod": "1",
		"concludeType": "1",
		"signType": "1",
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
		"econtractFile": "",
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
		"srcContractId___code": "2023000046",
		"settlementBasis": "依据物料明细进行结算",
		"paidOrigMny": 0,
		"sourceId": "1873853918878892035",
		"code": "2023000048",
		"sourceBusiObj": "",
		"sourceCode": "",
		"bizFlowMakeBillCode": "clmContract2ContractJournal",
		"firstId": "",
		"firstChildId": "",
		"firstBusiObj": "",
		"firstCode": "",
		"retentionMny": 0,
		"archivedStatus": "0",
		"contractLibCounterpartList": [
			{
				"_status": "Insert",
				"merchantType": "1",
				"clmCounterpartId": "1321341341",
				"signSort": 1,
				"participant": "1",
				"tbFilterType": 1,
				"contractId": "1",
				"customerId": "1836012980662697984",
				"customerId___code": "00000000000001",
				"supplierId": "1824945133389348867",
				"supplierId___code": "0001000001"
			}
		],
		"contractLibChangeList": [
			{
				"_status": "Insert",
				"changeCreator": "12312312313",
				"changeCreateTime": "12312312313",
				"contractLib_id": "12312312313"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	服务异常	异常信息

999	接口调用错误	异常信息，请联系管理员

1001001000003	参数错误	异常信息，请检查数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-21

更新

请求说明

重新发布


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

