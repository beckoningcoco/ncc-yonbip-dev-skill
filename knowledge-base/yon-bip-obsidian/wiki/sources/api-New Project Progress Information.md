---
title: "项目进度信息新增"
apiId: "1957530679341744136"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Progress Information"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Progress Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目进度信息新增

> `ContentType	application/json` 请求方式	POST | 分类: Project Progress Information (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/AMP/fiercl/projectscheduleinfo/add

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
| data | object | 是 | 是 | 入参 |
| accentityCode | string | 否 | 否 | 会计主体编码(编码和id必输其一，同时输入id优先) 示例：xmhs-RMB |
| accentity | string | 否 | 否 | 会计主体id(编码和id必输其一，同时输入id优先) 示例：1783771334923255818 |
| bustype | string | 否 | 否 | 交易类型id(编码和id必输其一，同时输入id优先) 示例：1956122350884225033 |
| bustypeCode | string | 否 | 否 | 交易类型编码(编码和id必输其一，同时输入id优先) 示例：rcl_projectschedule |
| code | string | 否 | 否 | 单据编号(手动编码时必输) |
| projectId | string | 否 | 否 | 项目id(编码和id必输其一，同时输入id优先) 示例：1648936755152289796 |
| projectCode | string | 否 | 否 | 项目编码(编码和id必输其一，同时输入id优先) 示例：yy001 |
| blnAcceptance | boolean | 否 | 否 | 是否验收(true--是;false--否) 示例：false 默认值：false |
| acceptanceDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 验收日期 示例：2024-03-22 |
| handleTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 经办时间 示例：2022-01-01 08:00:00 |
| extBillMaker | string | 否 | 否 | 外部制单人 示例：Tom |
| extBillMakeDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 外部制单日期 示例：2024-03-22 |
| auditTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 否 | 审核时间 示例：2024-03-22 08:00:00 |
| extFinalAuditor | string | 否 | 否 | 外部终审人 示例：Tom |
| extBlnFinalAudit | boolean | 否 | 否 | 外部是否终审 默认值：true |
| extSrcBillId | string | 否 | 是 | 来源单据id(外) 示例：12345678 |
| extSrcSystem | string | 否 | 是 | 来源系统(外) 示例：客开 |
| extSrcBillNo | string | 否 | 是 | 来源单据号(外) 示例：SEI20230918002002 |
| extSrcBilltypeCode | string | 否 | 否 | 来源单据类型编码(外) 示例：收入合同 |
| extSrcTranstypeCode | string | 否 | 否 | 来源交易类型编码(外) |
| _status | string | 否 | 是 | 接口类型(Insert新增) 示例：Insert 默认值：Insert |
| rclProjectScheduleInfoBodyList | object | 是 | 是 | 项目进度信息子表 |

## 3. 请求示例

Url: /yonbip/AMP/fiercl/projectscheduleinfo/add?access_token=访问令牌
Body: {
	"data": [
		{
			"accentityCode": "xmhs-RMB",
			"accentity": "1783771334923255818",
			"bustype": "1956122350884225033",
			"bustypeCode": "rcl_projectschedule",
			"code": "",
			"projectId": "1648936755152289796",
			"projectCode": "yy001",
			"blnAcceptance": false,
			"acceptanceDate": "2024-03-22",
			"handleTime": "2022-01-01 08:00:00",
			"extBillMaker": "Tom",
			"extBillMakeDate": "2024-03-22",
			"auditTime": "2024-03-22 08:00:00",
			"extFinalAuditor": "Tom",
			"extBlnFinalAudit": true,
			"extSrcBillId": "12345678",
			"extSrcSystem": "客开",
			"extSrcBillNo": "SEI20230918002002",
			"extSrcBilltypeCode": "收入合同",
			"extSrcTranstypeCode": "",
			"_status": "Insert",
			"rclProjectScheduleInfoBodyList": [
				{
					"wbs": "2054654987542154",
					"wbsCode": "WBS001",
					"rclRevenueContractId": "1731055206999261192",
					"rclRevenueContractBaseInfoId": "1731055206999261194",
					"scheduleRatio": 10,
					"oriCurrencyId": "1607403072771850274",
					"oriCurrencyCode": "CNY",
					"orimny": 100,
					"orimnyNoTax": 100,
					"orimnyTax": 100,
					"localmny": 100,
					"localmnyNotax": 100,
					"localmnyTax": 100,
					"exchangeRateType": "0000LBC4W3H13EZ4LE0000",
					"exchangeRateTypeCode": "01",
					"exchangeRateDate": "2023-05-23",
					"exchRateOps": NaN,
					"exchangeRate": 1,
					"taxRateId": "13435465714214241",
					"taxRateCode": "",
					"extSrcSystem": "收入合同",
					"extSrcBillNo": "SEI20230918002002",
					"extSrcBilltypeCode": "rcl_businessct",
					"extSrcTranstypeCode": "rcl_businessct",
					"extSrcBillId": "1822350311630045193",
					"extSrcBillRowId": "1822350311630045193",
					"extOriBillNo": "SEI20230918002002",
					"extOriBilltypeCode": "rcl_businessct",
					"extOriTranstypeCode": "rcl_businessct",
					"extOriBillId": "1821063530835607552",
					"extOriBillRowId": "1821063539425542157",
					"accCost": "100",
					"preCost": "100",
					"preLiability": "100",
					"_status": "Insert"
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
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| count | number |
| 小数位数:0,最大长度:10 | 否 | count 示例：2 |
| successCount | number |
| 小数位数:0,最大长度:10 | 否 | successCount 示例：1 |
| failCount | number |
| 小数位数:0,最大长度:10 | 否 | failCount 示例：1 |
| messages | object | 是 | 失败数据信息 |
| infos | object | 是 | infos |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"successCount": 1,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "202302130001",
				"message": "删除失败"
			}
		],
		"infos": [
			{
				"accentity": "1525652227072458756",
				"acceptanceDate": "2024-04-09",
				"auditTime": "2024-04-09 00:00:01",
				"blnAcceptance": true,
				"blnPushBackward": true,
				"bustype": "1590925387798413317",
				"code": "RPSI20240409000022",
				"confirmStatus": "4",
				"createTime": "2024-04-09 20:16:01",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"dr": 0,
				"extBillMakeDate": "2024-04-09",
				"extBillMaker": "Tom",
				"extBlnFinalAudit": true,
				"extFinalAuditor": "Tom",
				"extSrcBillId": "R00120240407001-011",
				"extSrcBillNo": "001",
				"extSrcBilltypeCode": "extSrcBilltypeCode",
				"extSrcSystem": "axf-测试",
				"extSrcTranstypeCode": "extSrcTranstypeCode",
				"fullName": "RCL.RCL.RclProjectScheduleInfoHeader",
				"handleTime": "2024-04-09 00:00:01",
				"id": "1971089006228144137",
				"localmny": 10,
				"localmnyNotax": 10,
				"localmnyTax": 0,
				"orimny": 10,
				"orimnyNoTax": 10,
				"orimnyTax": 0,
				"postStatus": "2",
				"projectId": "1970821068982583298",
				"pubts": "2024-04-09 20:16:02",
				"verifyState": 0,
				"ytenantId": "0000L6YQ8AVLFUZPXD0000",
				"rclProjectScheduleInfoBodyList": [
					{
						"accentity": "1525652227072458756",
						"createTime": "2024-04-09 20:16:01",
						"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
						"dr": 0,
						"exchangeRate": 1,
						"exchangeRateDate": "2024-04-09",
						"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
						"extOriBillId": "extOriBillId",
						"extOriBillNo": "extOriBillNo",
						"extOriBilltypeCode": "extOriBilltypeCode",
						"extSrcBillId": "extSrcBillId",
						"extSrcBillNo": "001",
						"extSrcBillRowId": "001",
						"extSrcBilltypeCode": "001",
						"extSrcSystem": "axf-测试",
						"extSrcTranstypeCode": "001",
						"fullName": "RCL.RCL.RclProjectScheduleInfoBody",
						"id": "1971089006228144138",
						"localmny": 10,
						"localmnyNotax": 10,
						"localmnyTax": 0,
						"oriCurrencyId": "1525643705855773169",
						"orimny": 10,
						"orimnyNoTax": 10,
						"orimnyTax": 0,
						"pubts": "2024-04-09 20:16:01",
						"rclProjectScheduleInfoId": "1971089006228144137",
						"rclRevenueContractBaseInfoId": "1970908342725378052",
						"rclRevenueContractId": "1970908342725378051",
						"rclRevenueContractNo": "RECONRECON20240409007562",
						"scheduleRatio": 100,
						"ytenantId": "0000L6YQ8AVLFUZPXD0000"
					}
				],
				"data": {
					"sourceUnique": "",
					"targetUnique": ""
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	无效的入参！	如果是新增，检查参照格式、参数编码是否正确；如果是删除，确认参照格式、参数编码是否正确，确认要删除数据是否已删除


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-05

更新

请求说明

新增

请求参数 accCost

新增

请求参数 preCost

新增

请求参数 preLiability

新增累计成本相关字段

2	2025-09-10

新增

请求参数 exchRateOps


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

