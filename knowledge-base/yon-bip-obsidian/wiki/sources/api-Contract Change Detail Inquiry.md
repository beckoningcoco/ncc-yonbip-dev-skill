---
title: "合同变更详情查询"
apiId: "2481638168220139527"
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

# 合同变更详情查询

> `ContentType	application/json` 请求方式	POST | 分类: Contract Change (CLMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/CLMS/CLM/clmContractChange/v1.0/contract/detail/detailbyId

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | id    示例: 2481600501354332167 |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |

## 3. 请求示例

Url: /yonbip/FCC/CLMS/CLM/clmContractChange/v1.0/contract/detail/detailbyId?access_token=访问令牌&id=2481600501354332167

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| message | string | 否 | 狀態資訊 示例：操作成功 |
| errorDetail | string | 否 | 错误详情 |
| data | object | 否 | 返回数据 |
| oldBusType_name | string | 否 | 旧业务类型名称 示例：通用交易 |
| oriCurrencyId | string | 否 | 原币 示例：2354483582747541857 |
| wbs | string | 否 | 工作分解结构 示例：2358323738765688844 |
| bizFlowMakeBillCode | string | 否 | 单据转换规则编码 示例：contractInfo2ContractChange |
| sourceContractId_title | string | 否 | 合同名称 示例：生效合同 |
| type | string | 否 | 合同类型 示例：2357434543118483456 |
| valiDate | string | 否 | 合同生效日期 示例：2026-01-30 |
| signSubjectId | string | 否 | 承办组织 示例：2354490368778043399 |
| orgId_name | string | 否 | 组织名称 示例：用友网络 |
| econtractStatus | string | 否 | 合同模板状态 示例：0 |
| rateType | string | 否 | 汇率类型 示例：0000MFAHQVPJ8RS4D80000 |
| bizFlowInstanceId | string | 否 | 业务流实例id 示例：szUgfYLdvu |
| urgentLevel | string | 否 | 紧急程度 示例：1 |
| noTaxMny | number |
| 小数位数:0,最大长度:10 | 否 | 本币无税金额 示例：1 |
| wbs_name | string | 否 | wbs名称 示例：工程项目的活动控制 |
| signType | string | 否 | 签署方式 示例：0 |
| state | string | 否 | 变更状态 示例：4 |
| id | string | 否 | 主键 示例：2481612475811758083 |
| sourceContractId | string | 否 | 源合同id 示例：2481610680515428357 |
| currencyId | string | 否 | 本币 示例：2354483582747541857 |
| isEcontract | string | 否 | 是否为电子合同 示例：0 |
| billtypeCode | string | 否 | 单据类型编码 示例：clmContractChange |
| sysEffectiveDate | string | 否 | 系统生效日期 示例：2026-02-26 |
| oriCurrencyId_priceRount | number |
| 小数位数:0,最大长度:10 | 否 | 原币精度 示例：4 |
| deptId | string | 否 | 承办部门 示例：2354490755325100041 |
| deptId_name | string | 否 | 承办部门名称 示例：项目云 |
| settleOrgid_name | string | 否 | 结算组织 示例：用友网络 |
| version | string | 否 | 版本号 示例：0 |
| concludeType | string | 否 | 签订类型 示例：1 |
| oriNoTaxMny | number |
| 小数位数:0,最大长度:10 | 否 | 原币无税金额 示例：1 |
| auditTime | string | 否 | 审核时间 示例：2026-02-26 17:23:07 |
| personId | string | 否 | 承办人 示例：2357430033404395530 |
| ctPeriod | string | 否 | 合同期限 示例：0 |
| status | string | 否 | 合同状态 示例：8 |
| auditor_name | string | 否 | 审核人名称 示例：陈小诺 |
| orgId | string | 否 | 主组织 示例：2354490368778043399 |
| oriTaxAmount | number |
| 小数位数:2,最大长度:10 | 否 | 原币合同税额 示例：0.02 |
| rateType_digit | number |
| 小数位数:0,最大长度:10 | 否 | 汇率类型精度 示例：6 |
| contractFileStatus | string | 否 | 合同归档状态 示例：0 |
| customerId | string | 否 | 客户 示例：2357553771388076035 |
| ctClass | string | 否 | 合同性质 示例：1 |
| pubts | string | 否 | 时间戳 示例：2026-02-26 17:23:11 |
| signSubjectId_name | string | 否 | 承办组织 示例：用友网络 |
| contractId_title | string | 否 | 关联合同标题 示例：生效合同 |
| procinstId | string | 否 | 流程实例ID 示例：bb217bed-12f4-11f1-8926-8ab6f1974798 |
| isReturnConfirm | string | 否 | 是否回传确认 示例：0 |
| creator | string | 否 | 创建人 示例：b14a0507-ca26-4ee1-8df7-f2484987019e |
| isBackDate | string | 否 | 是否倒签 示例：0 |
| changeCreateDate | string | 否 | 变更申请日期 示例：2026-02-26 |
| auditor | string | 否 | 审核人 示例：b14a0507-ca26-4ee1-8df7-f2484987019e |
| importantLevel | string | 否 | 重要程度 示例：2 |
| reDirection | string | 否 | 收支方向 示例：1 |
| rateType_code | string | 否 | 汇率类型编码 示例：01 |
| clmContractChange_changeTypeIdList | object | 是 | 合同变更变更类型 |
| customerId_name | string | 否 | 客户名称 示例：盐源县悦居智能酒店 |
| createTime | string | 否 | 创建时间 示例：2026-02-26 17:21:55 |
| sourceSys | string | 否 | 合同来源 示例：1 |
| oriCurrencyId_name | string | 否 | 原币名称 示例：人民币 |
| changeCreator_name | string | 否 | 变更申请人名称 示例：陈小诺 |
| oriCurrencyId_moneyDigit | number |
| 小数位数:0,最大长度:10 | 否 | 原币精度 示例：2 |
| currencyId_moneyRount | number |
| 小数位数:0,最大长度:10 | 否 | 本币精度 示例：1 |
| personId_name | string | 否 | 承办人名称 示例：陈小诺 |
| sourceId | string | 否 | 上游单据主表id 示例：2481610680515428357 |
| efileMode | string | 否 | 合同文件模式 示例：2 |
| type_name | string | 否 | 合同类型名称 示例：通用数智合同 |
| bustype_name | string | 否 | 交易类型名称 示例：标的物变更 |
| createMethod | string | 否 | 合同生成方式 示例：0 |
| modifier | string | 否 | 修改人 示例：b14a0507-ca26-4ee1-8df7-f2484987019e |
| oldSerialNumber | string | 否 | 旧序列号 示例：2026--000059 |
| creator_userName | string | 否 | 创建人名称 示例：陈小诺 |
| rateDate | string | 否 | 汇率日期 示例：2025-09-18 |
| oriCurrencyId_priceDigit | number |
| 小数位数:0,最大长度:10 | 否 | 原币币种精度 示例：2 |
| signDate | string | 否 | 合同签订日期 示例：2026-01-30 00:00:00 |
| dr | number |
| 小数位数:0,最大长度:10 | 否 | 删除标识 示例：0 |
| oriHaveTaxMny | number |
| 小数位数:2,最大长度:10 | 否 | 原币含税金额 示例：1.02 |
| changeVersion | number |
| 小数位数:0,最大长度:10 | 否 | 版本 示例：1 |
| beginningFlag | string | 否 | 期初标识 示例：0 |
| modifyTime | string | 否 | 修改时间 示例：2026-02-26 17:23:11 |
| exchangeRate | number |
| 小数位数:0,最大长度:10 | 否 | 汇率 示例：1 |
| oldBusType | string | 否 | 原合同交易类型 示例：2461350752831406086 |
| currTypeSign | string | 否 | 签署方式 示例：¥ |
| projectId_name | string | 否 | 项目名称 示例：工程项目的活动控制 |
| haveTaxMny | number |
| 小数位数:2,最大长度:10 | 否 | 本币含税金额 示例：1.02 |
| maintenanceType | string | 否 | 维护类型 示例：1 |
| contractId_sourceSys | string | 否 | 合同来源 示例：1 |
| modifier_userName | string | 否 | 修改人名称 示例：陈小诺 |
| billtypeId | string | 否 | 单据类型ID 示例：1694888773360287748 |
| serialNumber | string | 否 | 合同编号 示例：2026--000059202600011 |
| oriCurrencyId_moneyRount | number |
| 小数位数:0,最大长度:10 | 否 | 原币舍入方式 示例：1 |
| ytenantId | string | 否 | 租户id 示例：0000MFAHQVPJ8RS4D80000 |
| verifyState | number |
| 小数位数:0,最大长度:10 | 否 | 单据状态 示例：2 |
| changeCreator | string | 否 | 变更申请人 示例：2357430033404395530 |
| changeTimes | number |
| 小数位数:0,最大长度:10 | 否 | 变更次数 示例：1 |
| isHaveTax | string | 否 | 合同金额是否含税 示例：1 |
| changeStatus | string | 否 | 原变更状态 示例：4 |
| taxAmount | number |
| 小数位数:2,最大长度:10 | 否 | 本币税额 示例：0.02 |
| settleOrgid | string | 否 | 结算组织 示例：2354490368778043399 |
| projectId | string | 否 | 关联项目 示例：2358323730199871498 |
| sourceContractIdRef | string | 否 | 来源合同 示例：2481610680515428357 |
| contractJournalId | string | 否 | 合同台账ID 示例：2481610680515428357 |
| clm_contract_change_rectermList | object | 是 | 合同变更收款协议 |
| code | string | 否 | 状态码 示例：20260005 |
| exchangeRateOps | number |
| 小数位数:0,最大长度:10 | 否 | 汇率折算方式 示例：1 |
| title | string | 否 | 标题 示例：生效合同 |
| finalizeStatus | string | 否 | 定稿状态 示例：1 |
| currencyId_name | string | 否 | 本币名称 示例：人民币 |
| clm_contract_change_counterpartList | object | 是 | 合同变更相对方 |
| rateType_name | string | 否 | 汇率类型名称 示例：基准汇率 |
| currencyAmountAccuracy | number |
| 小数位数:0,最大长度:10 | 否 | 金额精度（货币） 示例：2 |
| isOpenContract | string | 否 | 是否开口合同 示例：0 |
| projectId_id | string | 否 | 关联项目 示例：2358323730199871498 |
| sourceContractId_id | string | 否 | 源合同id 示例：生效合同 |
| title_id | string | 否 | 合同名称 示例：生效合同 |
| sourceContractId_sourceSys | string | 否 | 合同来源 示例：1 |
| currencyId_priceRount | number |
| 小数位数:0,最大长度:10 | 否 | 单价舍入规则 示例：4 |
| transTypeKeyField | string | 否 | 交易类型关键字段 示例：bustype |
| way | string | 否 | 变更方式 示例：2 |
| bustype | string | 否 | 交易类型 示例：2354485223432388694 |
| bWatermark | string | 否 | 是否无水印 示例：1 |
| contractId_id | string | 否 | 合同ID 示例：2481610680515428357 |
| contractId | string | 否 | 合同 ID 示例：2481610680515428357 |
| mny | number |
| 小数位数:0,最大长度:10 | 否 | 本币合同金额 示例：0 |
| isMaterial | string | 否 | 物料分类合同 示例：0 |
| currencyPiceAccuracy | number |
| 小数位数:0,最大长度:10 | 否 | 单价精度（货币） 示例：2 |
| traceId | string | 否 | 链路追踪 ID |
| displayCode | string | 否 | 显示代码 |
| detailMsg | string | 否 | 详细信息 |
| level | string | 否 | 级别 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"errorDetail": "",
	"data": {
		"oldBusType_name": "通用交易",
		"oriCurrencyId": "2354483582747541857",
		"wbs": "2358323738765688844",
		"bizFlowMakeBillCode": "contractInfo2ContractChange",
		"sourceContractId_title": "生效合同",
		"type": "2357434543118483456",
		"valiDate": "2026-01-30",
		"signSubjectId": "2354490368778043399",
		"orgId_name": "用友网络",
		"econtractStatus": "0",
		"rateType": "0000MFAHQVPJ8RS4D80000",
		"bizFlowInstanceId": "szUgfYLdvu",
		"urgentLevel": "1",
		"noTaxMny": 1,
		"wbs_name": "工程项目的活动控制",
		"signType": "0",
		"state": "4",
		"id": "2481612475811758083",
		"sourceContractId": "2481610680515428357",
		"currencyId": "2354483582747541857",
		"isEcontract": "0",
		"billtypeCode": "clmContractChange",
		"sysEffectiveDate": "2026-02-26",
		"oriCurrencyId_priceRount": 4,
		"deptId": "2354490755325100041",
		"deptId_name": "项目云",
		"settleOrgid_name": "用友网络",
		"version": "0",
		"concludeType": "1",
		"oriNoTaxMny": 1,
		"auditTime": "2026-02-26 17:23:07",
		"personId": "2357430033404395530",
		"ctPeriod": "0",
		"status": "8",
		"auditor_name": "陈小诺",
		"orgId": "2354490368778043399",
		"oriTaxAmount": 0.02,
		"rateType_digit": 6,
		"contractFileStatus": "0",
		"customerId": "2357553771388076035",
		"ctClass": "1",
		"pubts": "2026-02-26 17:23:11",
		"signSubjectId_name": "用友网络",
		"contractId_title": "生效合同",
		"procinstId": "bb217bed-12f4-11f1-8926-8ab6f1974798",
		"isReturnConfirm": "0",
		"creator": "b14a0507-ca26-4ee1-8df7-f2484987019e",
		"isBackDate": "0",
		"changeCreateDate": "2026-02-26",
		"auditor": "b14a0507-ca26-4ee1-8df7-f2484987019e",
		"importantLevel": "2",
		"reDirection": "1",
		"rateType_code": "01",
		"clmContractChange_changeTypeIdList": [
			{
				"fkid_id": "2481612475811758083",
				"creator": "b14a0507-ca26-4ee1-8df7-f2484987019e",
				"createTime": "2026-02-26 17:21:55",
				"changeTypeId_name": "履行条件变更",
				"creator_userName": "陈小诺",
				"id": "2481612475811758086",
				"pubts": "2026-02-26 17:21:55",
				"fkid": "2481612475811758083",
				"changeTypeId": "2354485584212787225"
			}
		],
		"customerId_name": "盐源县悦居智能酒店",
		"createTime": "2026-02-26 17:21:55",
		"sourceSys": "1",
		"oriCurrencyId_name": "人民币",
		"changeCreator_name": "陈小诺",
		"oriCurrencyId_moneyDigit": 2,
		"currencyId_moneyRount": 1,
		"personId_name": "陈小诺",
		"sourceId": "2481610680515428357",
		"efileMode": "2",
		"type_name": "通用数智合同",
		"bustype_name": "标的物变更",
		"createMethod": "0",
		"modifier": "b14a0507-ca26-4ee1-8df7-f2484987019e",
		"oldSerialNumber": "2026--000059",
		"creator_userName": "陈小诺",
		"rateDate": "2025-09-18",
		"oriCurrencyId_priceDigit": 2,
		"signDate": "2026-01-30 00:00:00",
		"dr": 0,
		"oriHaveTaxMny": 1.02,
		"changeVersion": 1,
		"beginningFlag": "0",
		"modifyTime": "2026-02-26 17:23:11",
		"exchangeRate": 1,
		"oldBusType": "2461350752831406086",
		"currTypeSign": "¥",
		"projectId_name": "工程项目的活动控制",
		"haveTaxMny": 1.02,
		"maintenanceType": "1",
		"contractId_sourceSys": "1",
		"modifier_userName": "陈小诺",
		"billtypeId": "1694888773360287748",
		"serialNumber": "2026--000059202600011",
		"oriCurrencyId_moneyRount": 1,
		"ytenantId": "0000MFAHQVPJ8RS4D80000",
		"verifyState": 2,
		"changeCreator": "2357430033404395530",
		"changeTimes": 1,
		"isHaveTax": "1",
		"changeStatus": "4",
		"taxAmount": 0.02,
		"settleOrgid": "2354490368778043399",
		"projectId": "2358323730199871498",
		"sourceContractIdRef": "2481610680515428357",
		"contractJournalId": "2481610680515428357",
		"clm_contract_change_rectermList": [
			{
				"sourceId": "2481610680515428357",
				"creator": "b14a0507-ca26-4ee1-8df7-f2484987019e",
				"sourceChildId": "2481610680515428358",
				"type_name": "应收款",
				"clmContractChangeId": "2481612475811758083",
				"ytenantId": "0000MFAHQVPJ8RS4D80000",
				"type": "2354483591325941782",
				"planPaymentMny": 1.02,
				"issueNo": 1,
				"dr": 0,
				"planPaymentDate": "2025-09-18 00:00:00",
				"sourceCode": "clmContract",
				"paymentScale": 1,
				"createTime": "2026-02-26 17:21:55",
				"oriPlanPaymentMny": 1.02,
				"id": "2481612475811758084",
				"pubts": "2026-02-26 17:21:55",
				"type_code": "2"
			}
		],
		"code": "20260005",
		"exchangeRateOps": 1,
		"title": "生效合同",
		"finalizeStatus": "1",
		"currencyId_name": "人民币",
		"clm_contract_change_counterpartList": [
			{
				"creator": "b14a0507-ca26-4ee1-8df7-f2484987019e",
				"isMainCounterpart": "1",
				"address": "凉山彝族自治州盐源县太平下街36号",
				"clmContractChangeId": "2481612475811758083",
				"ytenantId": "0000MFAHQVPJ8RS4D80000",
				"clmCounterpartId_id": "2357614905975111681",
				"dr": 0,
				"customerId_name": "盐源县悦居智能酒店",
				"customerIdCreditcode": "92513423MABQJ89R4X",
				"createTime": "2026-02-26 17:21:55",
				"signAreaMappingTag": "",
				"customerId": "2357553771388076035",
				"id": "2481612475811758085",
				"pubts": "2026-02-26 17:21:55",
				"merchantType": "1",
				"clmCounterpartId": "2357614905975111681"
			}
		],
		"rateType_name": "基准汇率",
		"currencyAmountAccuracy": 2,
		"isOpenContract": "0",
		"projectId_id": "2358323730199871498",
		"sourceContractId_id": "生效合同",
		"title_id": "生效合同",
		"sourceContractId_sourceSys": "1",
		"currencyId_priceRount": 4,
		"transTypeKeyField": "bustype",
		"way": "2",
		"bustype": "2354485223432388694",
		"bWatermark": "1",
		"contractId_id": "2481610680515428357",
		"contractId": "2481610680515428357",
		"mny": 0,
		"isMaterial": "0",
		"currencyPiceAccuracy": 2
	},
	"traceId": "",
	"displayCode": "",
	"detailMsg": "",
	"level": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

500	服务异常	异常信息

999	接口调用错误	异常信息,请联系管理员

1001001000003	参数错误	异常信息,请检查数据


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

