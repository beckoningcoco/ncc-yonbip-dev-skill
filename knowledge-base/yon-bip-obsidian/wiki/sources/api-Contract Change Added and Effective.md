---
title: "合同变更新增并生效"
apiId: "1982155436235685894"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Change"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同变更新增并生效

> `ContentType	application/json` 请求方式	POST | 分类: Contract Change (CLMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CLMS/v1.0/contract/createChangeAndForce

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 合同数据 |
| _status | string | 否 | 否 | 单据状态 目前仅支持Insert 示例：Insert 默认值：Insert |
| orgId | string | 否 | 否 | 签约组织ID，签约组织编码和签约组织ID至少录入一项，签约组织编码和签约组织ID同时存在时，以ID为准，varchar(36)，来源档案：ucf-org-center.org_pure_tree_ref 示例：1982645139839909898 |
| orgId___code | string | 否 | 否 | 签约组织编码 示例：A1 |
| type | string | 否 | 否 | 合同类型ID，合同类型编码和合同类型ID同时存在时，以ID为准，varchar(22)，来源档案：iuap-apcom-contract.contractTypeTreeRef 示例：1982640149071659013 |
| type___code | string | 否 | 否 | 合同类型编码 示例：C1 |
| bustype | string | 否 | 否 | 交易类型ID，交易类型编码和交易类型ID同时存在时，以ID为准，varchar(36)，来源档案：bd.bill.TransType 示例：1982639161226036408 |
| bustype___code | string | 否 | 否 | 交易类型编码 示例：CLM0201 |
| code | string | 否 | 否 | 合同流水号，varchar(200) 示例：000003 |
| serialNumber | string | 否 | 否 | 合同编号，varchar(200) 示例：000011 |
| supplierId | string | 否 | 否 | 供应商ID，供应商编码和供应商ID同时存在时，以ID为准;客商类型为供应商时，供应商编码和供应商ID至少录入一项，为必填。bigint(22) 示例：1741736730431586306 |
| supplierId___code | string | 否 | 否 | 供应商编码 示例：0001000023 |
| customerId | string | 否 | 否 | 客户编码客户ID，客户编码和客户ID同时存在时，以ID为准;客商类型为客户时，客户编码和客户ID至少录入一项，为必填。bigint(22) 示例：1665135353044926467 |
| customerId___code | string | 否 | 否 | 客户编码 示例：hfl10000000001 |
| econtractTempId | string | 否 | 否 | 合同模板ID，合同模板编码和合同模板ID同时存在时，以ID为准，varchar(22)，来源档案：DZHTFW.econtract.econtractTemplate 示例：1985052245661057028 |
| econtractTempId___code | string | 否 | 否 | 合同模板编码 示例：000002 |
| econtractVersion | string | 否 | 否 | 合同模板版本ID(即历史版本ID)，合同模板版本编号和合同模板版本ID同时存在时，以ID为准，varchar(200) 示例：1985052245661057029 |
| econtractVersion___versionNo | string | 否 | 否 | 合同模板版本编号 示例：v1 |
| currencyId | string | 否 | 否 | 币种ID，币种编码和币种ID同时存在时，以ID为准，varchar(36)，来源档案：bd.currencytenant.CurrencyTenantVO 示例：1982639152636100659 |
| currencyId___code | string | 否 | 否 | 币种编码 示例：CNY |
| signSubjectId | string | 否 | 否 | 承办组织ID，承办组织编码和承办组织ID同时存在时，以ID为准，varchar(36)，来源档案：aa.baseorg.OrgMV 示例：1982645139839909898 |
| signSubjectId___code | string | 否 | 否 | 承办组织编码 示例：A1 |
| settleOrgid | string | 否 | 否 | 结算组织ID，结算组织编码和结算组织ID同时存在时，以ID为准，varchar(36)，来源档案：org.func.FinanceOrg 示例：1982645139839909898 |
| settleOrgid___code | string | 否 | 否 | 结算组织编码 示例：A1 |
| deptId | string | 否 | 否 | 承办部门ID，承办部门编码和承办部门ID同时存在时，以ID为准，varchar(36)，来源档案：bd.adminOrg.AdminOrgVO 示例：1737913178750189568 |
| deptId___code | string | 否 | 否 | 承办部门编码 示例：01 |
| personId | string | 否 | 否 | 承办人ID，承办人编码和承办人ID同时存在时，以ID为准，varchar(64)，来源档案：bd.staff.StaffNew 示例：1982648343867686915 |
| personId___code | string | 否 | 否 | 承办人编码(即员工编码) 示例：01 |
| status | string | 否 | 是 | 合同状态 8-生效 示例：8 默认值：8 |
| signDate | Date | 否 | 否 | 合同签订日期(格式:YYYY-MM-DD) 示例：2023-11-09 |
| createMethod | string | 否 | 否 | 合同生成方式 1-标准合同 0-非标准合同 目前仅支持标准合同 示例：1 默认值：1 |
| maintenanceType | string | 否 | 否 | 维护类型 1-新合同 2-历史合同 目前仅支持新合同 示例：1 默认值：1 |
| title | string | 否 | 否 | 合同名称，varchar(200) 示例：合同变更专用勿动 |
| mny | BigDecimal | 否 | 否 | 合同金额，decimal(32,8) 示例：345 |
| physicalStamp | string | 否 | 否 | 物理印章ID，物理印章编码和物理印章ID同时存在时，以ID为准，varchar(22)，来源档案：DZHTFW.econtract.physicalStamp 示例：1976339506535350776 |
| physicalStamp___code | string | 否 | 否 | 物理印章编码 示例：01 |
| settleAccountType | string | 否 | 否 | 结算方式ID，结算方式编码和结算方式ID同时存在时，以ID为准，bigint(20)，来源档案：aa.settlemethod.SettleMethod 示例：1665039506535350776 |
| settleAccountType___code | string | 否 | 否 | 结算方式编码 示例：system_0003 |
| lawType | string | 否 | 否 | 法律类别ID，法律类别编码和法律类别ID同时存在时，以ID为准，varchar(22)，来源档案：DZHTFW.econtract.contractLegalType 示例：L0001 |
| lawType___code | string | 否 | 否 | 法律类别编码 示例：L0001 |
| ctClass | string | 否 | 否 | 合同性质 1-普通合同 2-框架协议 示例：1 默认值：1 |
| isMaterial | string | 否 | 否 | 物料分类合同 1-是 0-否 示例：0 默认值：0 |
| concludeType | string | 否 | 否 | 签订类型 1-新签 2-续签 3-变更 4-其他 示例：1 默认值：1 |
| contractFileStatus | string | 否 | 否 | 合同归档状态 0-未归档 1-已归档 目前仅支持未归档 示例：0 默认值：0 |
| ctPeriod | string | 否 | 否 | 合同期限 0-固定期限 1-无固定期限 示例：1 默认值：1 |
| reDirection | string | 否 | 否 | 收支方向 0-无 1-收款 2-付款 示例：0 默认值：0 |
| isHaveTax | string | 否 | 否 | 合同金额是否含税 1-是 0-否 示例：1 默认值：1 |
| importantLevel | string | 否 | 否 | 重要程度 1-一般 2-普通 3-重大 示例：2 默认值：2 |
| secretLevel | string | 否 | 否 | 密级 1-公开 2-限制 3-秘密 4-机密 5-绝密 示例：0 默认值：0 |
| urgentLevel | string | 否 | 否 | 紧急程度 1-一般 2-紧急 3-特急 示例：1 默认值：1 |
| isOpenContract | string | 否 | 否 | 是否开口合同 1-是 0-否 示例：0 默认值：0 |
| isBackDate | string | 否 | 否 | 是否倒签 1-是 0-否 示例：0 默认值：0 |
| signType | string | 否 | 否 | 签署方式 0-不签署 1-电子签署 2-线下签署 示例：0 默认值：0 |
| bWatermark | string | 否 | 否 | 是否无水印 1-是 0-否 示例：0 默认值：0 |
| valiDate | Date | 否 | 否 | 合同生效日期(格式:YYYY-MM-DD)，char(10) 示例：2023-11-09 |
| planValidate | Date | 否 | 否 | 计划生效日期(格式:YYYY-MM-DD)，char(10) 示例：2023-11-16 |
| planInvallidate | Date | 否 | 否 | 计划失效日期(格式:YYYY-MM-DD)，char(10) 示例：2023-11-16 |
| invaliDate | Date | 否 | 否 | 合同终止日期(格式:YYYY-MM-DD)，char(10) 示例：2023-11-16 |
| signAddress | string | 否 | 否 | 签订地点，varchar(200) 示例：北京 |
| ctSummary | string | 否 | 否 | 合同概要，varchar(520) 示例：合同概要 |
| performAddress | string | 否 | 否 | 履约地点，varchar(200) 示例：用友 |
| memo | string | 否 | 否 | 备注，varchar(200) 示例：合同备注 |
| submitCsFile | string | 否 | 是 | 送审文件，varchar(200) 示例：1713170640408_api_submitCsFile |
| finishFile | string | 否 | 否 | 定稿文件，varchar(200) 示例：ecc6f68f-51b7-45be-89b7-d32e2d8fca5b_finishFile |
| signEcontractFile | string | 否 | 否 | 签署电子版文件（签署方式为电子签署时必传），varchar(200) 示例：1713170640408_api_signEcontractFile |
| signPaperFile | string | 否 | 否 | 签署纸质回传文件（签署方式为线下签时必传），varchar(200) 示例：1713170640408_api_signPaperFile |
| sourceContractId | string | 否 | 是 | 上游单据 id，varchar(22) 示例：1985793892013309952 |
| cause | string | 否 | 是 | 变更事由，varchar(200) 示例：变更物料 |
| content | string | 否 | 是 | 变更内容，varchar(200) 示例：变更物料数量 |
| remark | string | 否 | 否 | 说明，varchar(200) 示例：变更说明 |
| way | string | 否 | 是 | 变更方式（1：原合同；2：新签合同；3：补充协议） 示例：1 默认值：1 |
| oldBusType | string | 否 | 否 | 原合同交易类型，varchar(36) 示例：1982639161226036003 |
| changeCreator | string | 否 | 是 | 变更申请人，varchar(64) 示例：1982648343867686915 |
| bizFlowMakeBillCode | string | 否 | 是 | 单据转换值，varchar(200) 示例：contractInfo2ContractChange 默认值：contractInfo2ContractChange |
| changeCreateDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 变更申请时间 示例：2024-04-29 |
| sourceId | string | 否 | 否 | 原合同 id（和sourceContractId保持一致），varchar(36) 示例：1985793892013309952 |
| appendix | string | 否 | 否 | 附件，longtext 示例：3e1222233750-0603-11ef-8740-bd6d5b7a6fb2 |
| projectId | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 关联项目 ID，关联项目 ID 和关联项目编码同时存在时，以ID 为准，bigint(22)，来源档案：bd.project.ProjectVO 示例：1920464175161671683 |
| projectId___code | string | 否 | 否 | 关联项目编码 示例：1920464175161671682 |
| contractId | string | 否 | 否 | 关联合同 ID，关联合同 ID 和关联合同编码同时存在时，以ID 为准，varchar(22)，来源档案：CLM.clmContract.clm_contract 示例：1811241181165649927 |
| contractId___code | string | 否 | 否 | 关联合同编码 示例：8333890 |
| wbs | string | 否 | 否 | WBS ID，WBS ID 和WBS编码同时存在时，以ID 为准，varchar(36)，来源档案：yonbip-pm-commonbd.wbs_doc_ref 示例：1920464175173206017 |
| wbs___code | string | 否 | 否 | WBS编码 示例：1920464175161671682 |
| changeFeature | string | 否 | 否 | 合同表头特征，varchar(200) 示例：表头特征 |
| clm_contract_change_counterpartList | object | 是 | 否 | 合同相对方 |
| clm_contract_change_rectermList | object | 是 | 否 | 收款协议 |
| clm_contract_change_appointmentList | object | 是 | 否 | 履约计划（不支持新增删除同步到原单据） |
| clm_contract_change_paytermList | object | 是 | 否 | 付款协议 |
| clm_contract_change_itemList | object | 是 | 否 | 标的物明细 |
| clmContractChangeEventsList | object | 是 | 否 | 合同大事记（只能修改，不支持新增删除同步到原单据） |
| clmContractChange_changeTypeIdList | object | 是 | 是 | 变更类别 |
| taxAmount | string | 否 | 否 | 税额（标的物填写时，必填） 示例：200 |
| exchangeRate | string | 否 | 是 | 汇率,decimal(32,8) 示例：1 |

## 3. 请求示例

Url: /yonbip/CLMS/v1.0/contract/createChangeAndForce?access_token=访问令牌
Body: {
	"data": {
		"_status": "Insert",
		"orgId": "1982645139839909898",
		"orgId___code": "A1",
		"type": "1982640149071659013",
		"type___code": "C1",
		"bustype": "1982639161226036408",
		"bustype___code": "CLM0201",
		"code": "000003",
		"serialNumber": "000011",
		"supplierId": "1741736730431586306",
		"supplierId___code": "0001000023",
		"customerId": "1665135353044926467",
		"customerId___code": "hfl10000000001",
		"econtractTempId": "1985052245661057028",
		"econtractTempId___code": "000002",
		"econtractVersion": "1985052245661057029",
		"econtractVersion___versionNo": "v1",
		"currencyId": "1982639152636100659",
		"currencyId___code": "CNY",
		"signSubjectId": "1982645139839909898",
		"signSubjectId___code": "A1",
		"settleOrgid": "1982645139839909898",
		"settleOrgid___code": "A1",
		"deptId": "1737913178750189568",
		"deptId___code": "01",
		"personId": "1982648343867686915",
		"personId___code": "01",
		"status": "8",
		"signDate": "2023-11-09",
		"createMethod": "1",
		"maintenanceType": "1",
		"title": "合同变更专用勿动",
		"mny": 345,
		"physicalStamp": "1976339506535350776",
		"physicalStamp___code": "01",
		"settleAccountType": "1665039506535350776",
		"settleAccountType___code": "system_0003",
		"lawType": "L0001",
		"lawType___code": "L0001",
		"ctClass": "1",
		"isMaterial": "0",
		"concludeType": "1",
		"contractFileStatus": "0",
		"ctPeriod": "1",
		"reDirection": "0",
		"isHaveTax": "1",
		"importantLevel": "2",
		"secretLevel": "0",
		"urgentLevel": "1",
		"isOpenContract": "0",
		"isBackDate": "0",
		"signType": "0",
		"bWatermark": "0",
		"valiDate": "2023-11-09",
		"planValidate": "2023-11-16",
		"planInvallidate": "2023-11-16",
		"invaliDate": "2023-11-16",
		"signAddress": "北京",
		"ctSummary": "合同概要",
		"performAddress": "用友",
		"memo": "合同备注",
		"submitCsFile": "1713170640408_api_submitCsFile",
		"finishFile": "ecc6f68f-51b7-45be-89b7-d32e2d8fca5b_finishFile",
		"signEcontractFile": "1713170640408_api_signEcontractFile",
		"signPaperFile": "1713170640408_api_signPaperFile",
		"sourceContractId": "1985793892013309952",
		"cause": "变更物料",
		"content": "变更物料数量",
		"remark": "变更说明",
		"way": "1",
		"oldBusType": "1982639161226036003",
		"changeCreator": "1982648343867686915",
		"bizFlowMakeBillCode": "contractInfo2ContractChange",
		"changeCreateDate": "2024-04-29",
		"sourceId": "1985793892013309952",
		"appendix": "3e1222233750-0603-11ef-8740-bd6d5b7a6fb2",
		"projectId": 1920464175161671683,
		"projectId___code": "1920464175161671682",
		"contractId": "1811241181165649927",
		"contractId___code": "8333890",
		"wbs": "1920464175173206017",
		"wbs___code": "1920464175161671682",
		"changeFeature": "表头特征",
		"clm_contract_change_counterpartList": [
			{
				"_status": "Insert",
				"merchantType": "1",
				"customerId": "1665135353044926467",
				"customerId___code": "hfl10000000001",
				"supplierId": "1741736730431586306",
				"supplierId___code": "0001000023",
				"sourceId": "1985793892013309952",
				"sourceChildId": "1985793892013309953",
				"changeFeature": "相对方特征",
				"isMainCounterpart": "0"
			}
		],
		"clm_contract_change_rectermList": [
			{
				"_status": "Insert",
				"type": "1665039497967436059",
				"type___code": "3",
				"condition": "32",
				"paymentScale": 90,
				"planPaymentMny": 1304.52,
				"planPaymentDate": "2023-03-01",
				"upToDate": "2023-03-01",
				"mny": 1304.52,
				"memo": "收款协议备注",
				"sourceId": "1976339506535350776",
				"sourceChildId": "1987639506535350776",
				"changeFeature": "收款特征"
			}
		],
		"clm_contract_change_appointmentList": [
			{
				"_status": "Insert",
				"name": "名称",
				"planEndDate": "2024-05-01",
				"accomState": "true",
				"endDate": "2024-05-01",
				"accomRemark": "完成情况说明",
				"sourceId": "1976339506535350776",
				"sourceChildId": "18473643506535350776",
				"changeFeature": "履约特征"
			}
		],
		"clm_contract_change_paytermList": [
			{
				"_status": "Insert",
				"type": "1665039497967436059",
				"type___code": "02",
				"payCondition": "付款条件",
				"payRatio": 90,
				"planPayDate": "2024-06-01",
				"payDate": "2024-06-01",
				"planPayMoney": 1304.52,
				"payMoney": 1304.52,
				"memo": "付款协议备注",
				"sourceId": "1985793892013309952",
				"sourceChildId": "1937593892013309952",
				"changeFeature": "付款特征"
			}
		],
		"clm_contract_change_itemList": [
			{
				"_status": "Insert",
				"materialId": "1665134399562186754",
				"materialId___code": "01",
				"unitId": "1665133566338531335",
				"unitId___code": "TNE",
				"num": {},
				"taxRate": "10001",
				"taxRate___code": "TE",
				"taxprice": 116.47,
				"taxmny": 116.47,
				"price": 116.41,
				"tax": 0.06,
				"mny": 116.47,
				"sourceId": "1976339506535350776",
				"sourceChildId": "1372857306535350776",
				"changeFeature": "明细特征"
			}
		],
		"clmContractChangeEventsList": [
			{
				"_status": "Insert",
				"code": "123",
				"name": "ccc",
				"remark": "备注",
				"sourceId": "1372857306535350776",
				"sourceChildId": "1574857306535350776",
				"changeFeature": "大事记特征"
			}
		],
		"clmContractChange_changeTypeIdList": [
			{
				"changeTypeId": "1982640149071659027",
				"_status": "Insert"
			}
		],
		"taxAmount": "200",
		"exchangeRate": "1"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 状态信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| busiObj | string | 否 | 业务对象 示例：clmContract |
| memo | string | 否 | 备注 示例：合同备注 |
| ctSummary | string | 否 | 合同概要 示例：合同概要 |
| feature | string | 否 | 合同表头特征 |
| type | string | 否 | 合同类型id，来源档案：iuap-apcom-contract.contractTypeTreeRef 示例：1852916168056635392 |
| serialNumber | string | 否 | 合同编号 |
| valiDate | string | 否 | 合同生效日期 示例：2023-11-09 |
| signSubjectId | string | 否 | 签约组织id，来源档案：aa.baseorg.OrgMV 示例：1809173068584583170 |
| planInvallidate | string | 否 | 计划失效日期 示例：2023-11-16 |
| urgentLevel | string | 否 | 紧急程度 1-一般 2-紧急 3-特急 示例：1 |
| signType | string | 否 | 签署方式 0-不签署 1-电子签署 2-线下签署 示例：0 |
| id | string | 否 | 合同id 示例：1858893345170391047 |
| clm_contract_change_counterpartList | object | 是 | 合同相对方 |
| clm_contract_change_rectermList | object | 是 | 收款协议 |
| clm_contract_change_paytermList | object | 是 | 付款协议 |
| deptId | string | 否 | 部门id，来源档案：bd.adminOrg.AdminOrgVO 示例：1809173334883565572 |
| version | string | 否 | 合同版本号 示例：0 |
| secretLevel | string | 否 | 密级 1-公开 2-限制 3-秘密 4-机密 5-绝密 示例：0 |
| concludeType | string | 否 | 签订类型 1-新签 2-续签 3-变更 4-其他 示例：1 |
| personId | string | 否 | 承办人id，来源档案：bd.staff.StaffNew 示例：1857970073239552010 |
| ctPeriod | string | 否 | 合同期限 0-固定期限 1-无固定期限 示例：0 |
| clm_contract_change_itemList | object | 是 | 标的物明细 |
| orgId | string | 否 | 主组织id 示例：1809173068584583170 |
| contractFileStatus | string | 否 | 合同归档状态 0-未归档 1-已归档 示例：0 |
| econtractTempId | string | 否 | 合同模板id，来源档案：DZHTFW.econtract.econtractTemplate 示例：1810748342340681731 |
| ctClass | string | 否 | 合同性质 1-普通合同 2-框架协议 示例：1 |
| creator | string | 否 | 创建人id 示例：00001951-7ca3-47ac-a462-d5a66e3e6724 |
| isBackDate | string | 否 | 是否倒签（0：是；1：否） 示例：0 |
| businessFileId | string | 否 | 合同文本附件id |
| importantLevel | string | 否 | 重要程度 1-一般 2-普通 3-重大 示例：2 |
| reDirection | string | 否 | 收支方向 0-无 1-收款 2-付款 示例：0 |
| clm_contract_change_appointmentList | object | 是 | 履约计划 |
| signAddress | string | 否 | 签订地点 示例：北京 |
| createMethod | string | 否 | 合同生成方式（0：标准合同；1：非标准合同） 示例：1 |
| signDate | string | 否 | 合同签订日期 示例：2023-11-09 |
| settleAccountType | string | 否 | 结算方式id，来源档案：aa.settlemethod.SettleMethod 示例：1809147754069360760 |
| invaliDate | string | 否 | 合同终止日期 示例：2023-11-16 |
| maintenanceType | string | 否 | 维护类型（1：新合同；2：历史合同） 示例：1 |
| lawType | string | 否 | 法律类别id，来源档案：DZHTFW.econtract.contractLegalType 示例：1846082600192442376 |
| performAddress | string | 否 | 履约地点 示例：用友 |
| ytenantId | string | 否 | 租户id 示例：0000LM4K5NIS40WWEG0000 |
| isHaveTax | string | 否 | 合同金额是否含税 1-是 0-否 示例：1 |
| settleOrgid | string | 否 | 结算组织id，来源档案：org.func.FinanceOrg 示例：1810592246039314440 |
| code | string | 否 | 合同编码 示例：005468 |
| title | string | 否 | 合同名称 示例：我的组织翻1译2334 |
| planValidate | string | 否 | 计划生效日期 示例：2023-11-16 |
| isOpenContract | string | 否 | 是否开口合同（0：否；1：是） 示例：0 |
| bustype | string | 否 | 交易类型id，来源档案：bd.bill.TransType 示例：1810505376027639818 |
| bWatermark | string | 否 | 是否无水印（0：否；1：是） 示例：0 |
| mny | BigDecimal | 否 | 合同金额 示例：10 |
| isMaterial | string | 否 | 物料分类合同 1-是 0-否 示例：0 |
| clmContractChange_changeTypeIdList | object | 是 | 变更类型 |
| appendix | string | 否 | 附件 示例：3e1222233750-0603-11ef-8740-bd6d5b7a6fb2 |
| projectId | string | 否 | 关联项目 ID，来源档案：bd.project.ProjectVO |
| contractId | string | 否 | 关联合同 ID，来源档案：CLM.clmContract.clm_contract |
| wbs | string | 否 | 项目WBS，来源档案：yonbip-pm-commonbd.wbs_doc_ref |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"busiObj": "clmContract",
		"memo": "合同备注",
		"ctSummary": "合同概要",
		"feature": "",
		"type": "1852916168056635392",
		"serialNumber": "",
		"valiDate": "2023-11-09",
		"signSubjectId": "1809173068584583170",
		"planInvallidate": "2023-11-16",
		"urgentLevel": "1",
		"signType": "0",
		"id": "1858893345170391047",
		"clm_contract_change_counterpartList": [
			{
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"supplierId": "1815801431496065031",
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"dr": 0,
				"contractId": "1858893345170391047",
				"merchantType": "2"
			}
		],
		"clm_contract_change_rectermList": [
			{
				"memo": "收款协议备注",
				"type": "1809147204306731326",
				"planPaymentMny": 2,
				"paymentScale": 0.2,
				"id": "1858893345170391049",
				"pubts": "2023-11-10 16:07:47",
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"planPaymentDate": "2023-11-09 00:00:00",
				"condition": "收款",
				"upToDate": "2023-11-09 00:00:00",
				"contractId": "1858893345170391047",
				"mny": 200
			}
		],
		"clm_contract_change_paytermList": [
			{
				"memo": "付款协议备注",
				"type": "1809147204306731328",
				"payMoney": 100,
				"id": "1858893345170391050",
				"payCondition": "付款",
				"payRatio": 0.1,
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"planPayMoney": 1,
				"planPayDate": "2023-11-09",
				"contractId": "1858893345170391047",
				"payDate": "2023-11-09"
			}
		],
		"deptId": "1809173334883565572",
		"version": "0",
		"secretLevel": "0",
		"concludeType": "1",
		"personId": "1857970073239552010",
		"ctPeriod": "0",
		"clm_contract_change_itemList": [
			{
				"num": 1,
				"taxprice": 10,
				"price": 9.85,
				"unitId": "1835815764334477318",
				"id": "1858893345170391053",
				"tax": 0.15,
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"materialId": "1835816348468903942",
				"taxmny": 10,
				"mny": 9.85,
				"contractId": "1858893345170391047",
				"materialId___code": "0001000001",
				"unitId___code": "A001",
				"taxRate.ntaxrate": "1.5",
				"taxRate___code": "VATR6"
			}
		],
		"orgId": "1809173068584583170",
		"contractFileStatus": "0",
		"econtractTempId": "1810748342340681731",
		"ctClass": "1",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"isBackDate": "0",
		"businessFileId": "",
		"importantLevel": "2",
		"reDirection": "0",
		"clm_contract_change_appointmentList": [
			{
				"accomRemark": "计划备注",
				"endDate": "2023-11-10",
				"accomState": true,
				"ytenantId": "0000LM4K5NIS40WWEG0000",
				"contractId": "1858893345170391047",
				"name": "我的计划",
				"id": "1858893345170391051",
				"planEndDate": "2023-11-10"
			}
		],
		"signAddress": "北京",
		"createMethod": "1",
		"signDate": "2023-11-09",
		"settleAccountType": "1809147754069360760",
		"invaliDate": "2023-11-16",
		"maintenanceType": "1",
		"lawType": "1846082600192442376",
		"performAddress": "用友",
		"ytenantId": "0000LM4K5NIS40WWEG0000",
		"isHaveTax": "1",
		"settleOrgid": "1810592246039314440",
		"code": "005468",
		"title": "我的组织翻1译2334",
		"planValidate": "2023-11-16",
		"isOpenContract": "0",
		"bustype": "1810505376027639818",
		"bWatermark": "0",
		"mny": 10,
		"isMaterial": "0",
		"clmContractChange_changeTypeIdList": [
			{
				"fkid_id": "1992304263590051850",
				"creator": "59cd9d72-38dd-456e-be27-e347bf9aa88b",
				"changeTypeId": "1982640149071659027",
				"id": "1992304263590051851",
				"changeTypeId_name": "标的物变更"
			}
		],
		"appendix": "3e1222233750-0603-11ef-8740-bd6d5b7a6fb2",
		"projectId": "",
		"contractId": "",
		"wbs": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	服务错误	异常信息

999	接口调用错误	异常信息,请联系管理员

1001001000003	参数错误	异常信息,请检查数据

310008	参数错误	参数结构错误

2401	参照查询错误	参照未按照 code 查询到信息

500063	合同信息不存在	sourceContractId字段不能为空


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-10-14

更新

请求说明

新增

请求参数 (5)

主表新增客户、供应商字段，子表新增是否是主相对方字段

2	2025-05-09

新增

请求参数 (7)

更新

请求参数 (6)

修改特征字段属性


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

