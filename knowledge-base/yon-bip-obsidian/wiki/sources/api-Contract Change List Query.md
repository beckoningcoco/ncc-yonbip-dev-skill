---
title: "合同变更列表查询"
apiId: "2481590382414004226"
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

# 合同变更列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Contract Change (CLMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/CLMS/CLM/clmContractChange/v1.0/contract/list

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
| page | object | 否 | 否 | 分页 |
| pageIndex | long | 否 | 否 | 起始页 示例：1 默认值：1 |
| pageSize | long | 否 | 否 | 页数 示例：10 默认值：10 |
| extraCondition | object | 否 | 否 | 查询方案 |
| conditions | object | 是 | 否 | 条件组 |

## 3. 请求示例

Url: /yonbip/FCC/CLMS/CLM/clmContractChange/v1.0/contract/list?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 10
	},
	"extraCondition": {
		"conditions": [
			{
				"items": [
					{
						"name": "title",
						"op": "like",
						"v1": "234567"
					}
				],
				"op": "and"
			}
		]
	}
}

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
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页条数 示例：10 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 记录总数 示例：43 |
| recordList | object | 是 | 返回列表 |
| sumRecordList | string | 是 | 汇总记录列表 |
| viewmodel | string | 否 | 视图模型 |
| viewApplication | string | 否 | 视图应用程序 |
| querySchema | string | 否 | 查询方案 |
| name | string | 否 | 名称 |
| staticReportName | string | 否 | 静态报表名称 |
| groupSchemaId | string | 否 | 分组模式 ID |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 总页数 示例：5 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 起始页码 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 结束页码 示例：5 |
| pubts | string | 否 | 发布时间戳 |
| tablename | string | 否 | 表名 |
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
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 43,
		"recordList": [
			{
				"oriCurrencyId": "2354483582747541857",
				"sourceContractId_title": "辅助信息显示测试8848",
				"bizFlowMakeBillCode": "contractInfo2ContractChange",
				"type": "2354485584212787209",
				"valiDate": "2025-09-26",
				"signSubjectId": "华为技术有限公司",
				"orgId_name": "用友网络",
				"econtractStatus": "0",
				"rateType": "0000MFAHQVPJ8RS4D80000",
				"bizFlowInstanceId": "dkwVHlHGeH",
				"urgentLevel": "1",
				"noTaxMny": 1,
				"signType": "2",
				"state": "2",
				"id": "2377529432356159492",
				"sourceContractId": "2368096979792166917",
				"currencyId": "2354483582747541857",
				"isEcontract": "0",
				"oriCurrencyId_priceRount": 4,
				"orgId_id": "2354490368778043399",
				"deptId": "2354490755325100041",
				"deptId_name": "项目云",
				"version": "0",
				"concludeType": "1",
				"oriNoTaxMny": 1,
				"personId": "2355249048999428102",
				"ctPeriod": "0",
				"status": "2",
				"submitCsFile": "d60fa131-a4c0-11f0-be62-ff37fc1f88be",
				"orgId": "2354490368778043399",
				"oriTaxAmount": 0,
				"rateType_digit": 6,
				"contractFileStatus": "0",
				"ctClass": "1",
				"pubts": "2026-02-02 16:19:19",
				"contractId_title": "辅助信息显示测试8848",
				"procinstId": "de2a00d5-000f-11f1-bb1a-26647b656e4e",
				"creator": "914b3d3a-aa0e-4b09-89d1-ea42c6e80659",
				"isBackDate": "0",
				"type_id": "2354485584212787209",
				"changeCreateDate": "2025-10-09",
				"importantLevel": "2",
				"reDirection": "0",
				"rateType_code": "01",
				"clmContractChange_changeTypeIdList": [
					{
						"fkid_id": "2377529432356159492",
						"creator": "914b3d3a-aa0e-4b09-89d1-ea42c6e80659",
						"createTime": "2025-10-09 11:34:14",
						"creator_userName": "李振宇",
						"id": "2377529432356159493",
						"pubts": "2025-10-09 11:34:14",
						"fkid": "2377529432356159492",
						"changeTypeId": "2354485584212787223"
					}
				],
				"currencyId_currTypeSign": "¥",
				"createTime": "2025-10-09 11:34:14",
				"sourceSys": "1",
				"changeCreator_name": "李振宇",
				"oriCurrencyId_moneyDigit": 2,
				"currencyId_moneyRount": 1,
				"personId_name": "李振宇",
				"sourceId": "2368096979792166917",
				"efileMode": "1",
				"signAddress": "北京",
				"type_name": "采购合同",
				"currencyId_moneyDigit": 2,
				"bustype_name": "标的物变更",
				"createMethod": "0",
				"rateDate": "2025-09-25",
				"oriCurrencyId_priceDigit": 2,
				"signDate": "2013-07-02 00:00:00",
				"dr": 0,
				"oriHaveTaxMny": 1,
				"changeVersion": 1,
				"beginningFlag": "0",
				"exchangeRate": 1,
				"oldBusType": "2354485223432388681",
				"invaliDate": "2025-09-26 00:00:00",
				"haveTaxMny": 1,
				"maintenanceType": "1",
				"contractId_sourceSys": "1",
				"oriCurrencyId_moneyRount": 1,
				"ytenantId": "0000MFAHQVPJ8RS4D80000",
				"verifyState": 1,
				"changeCreator": "2355249048999428102",
				"changeTimes": 1,
				"isHaveTax": "1",
				"taxAmount": 0,
				"contractJournalId": "2368096979792166917",
				"code": "20250081",
				"title": "辅助信息显示测试8848",
				"currencyId_name": "人民币",
				"finalizeStatus": "0",
				"mnyWords": "贰拾叁万元整",
				"isOpenContract": "0",
				"sourceContractId_id": "2368096979792166917",
				"currencyId_priceRount": 4,
				"way": "2",
				"bustype": "2354485223432388694",
				"bWatermark": "1",
				"contractId_id": "2368096979792166917",
				"contractId": "2368096979792166917",
				"mny": 0,
				"isMaterial": "0",
				"creator_name": "李振宇",
				"datasource2_clmContractChangeListYnfList": [
					{
						"creator": "914b3d3a-aa0e-4b09-89d1-ea42c6e80659",
						"auditor_name": "李振宇",
						"approvalActivityId": "approveUserTask_f24b9991becb49eb8533bcc31872f09a",
						"auditor": "914b3d3a-aa0e-4b09-89d1-ea42c6e80659",
						"approvalTime": "2026-02-02 16:19:18",
						"ytenantId": "0000MFAHQVPJ8RS4D80000",
						"dr": 0,
						"clmContractChange_id": "2377529432356159492",
						"createTime": "2026-02-02 16:19:19",
						"approvalActivityName": "普通环节1",
						"id": "2463768123643789316",
						"approvalInstId": "de2a00d5-000f-11f1-bb1a-26647b656e4e",
						"pubts": "2026-02-02 16:19:19",
						"taskId": "de42b91a-000f-11f1-bb1a-26647b656e4e",
						"taskStatus": "create"
					}
				]
			}
		],
		"sumRecordList": [
			""
		],
		"viewmodel": "",
		"viewApplication": "",
		"querySchema": "",
		"name": "",
		"staticReportName": "",
		"groupSchemaId": "",
		"pageCount": 5,
		"beginPageIndex": 1,
		"endPageIndex": 5,
		"pubts": "",
		"tablename": ""
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

