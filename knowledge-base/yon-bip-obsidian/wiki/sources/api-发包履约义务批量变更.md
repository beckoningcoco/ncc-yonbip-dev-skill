---
title: "发包履约义务批量变更"
apiId: "2382849900316459012"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contracting Performance Obligation"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contracting Performance Obligation]
platform_version: "BIP"
source_type: community-api-docs
---

# 发包履约义务批量变更

> `ContentType	application/json` 请求方式	POST | 分类: Contracting Performance Obligation (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/FCC/EFI/RVN/rclEmployPerformanceObligation/fiercl/employperformance/batchUpdate

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
| accentity | string | 否 | 否 | 会计主体id 示例：1525772228455038981 |
| accentity_code | string | 否 | 是 | 会计主体编码 示例：1208 |
| id | string | 否 | 是 | 主表id 示例：1628654459275444227 |
| name | string | 否 | 是 | 名称 示例：名称 |
| billDate | string | 否 | 是 | 单据日期 示例：2022-10-13 |
| orimnyNotax | BigDecimal | 否 | 是 | 无税金额 示例：0.0 |
| orimnyTax | BigDecimal | 否 | 否 | 税额 示例：0.0 |
| orimny | BigDecimal | 否 | 是 | 含税金额 示例：0.0 |
| exchangeRateType | string | 否 | 否 | 汇率类型id(id和code必输其一,同时输入,id优先) 示例：0000L6YQ8AVLFUZPXD0000 |
| exchangeRateType_code | string | 否 | 否 | 汇率类型code(id和code必输其一,同时输入,id优先) 示例：01 |
| exchangeRateDate | string | 否 | 是 | 汇率日期 示例：2022-10-13 |
| exchangeRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式 示例：1:×,2:÷ |
| exchangeRate | BigDecimal | 否 | 是 | 汇率 示例：1 |
| localmnyNotax | BigDecimal | 否 | 是 | 本币无税金额 示例：100.0 |
| localmny | BigDecimal | 否 | 是 | 本币含税金额 示例：100.0 |
| localmnyTax | BigDecimal | 否 | 否 | 本币税额 示例：200.0 |
| signDate | string | 否 | 是 | 签订日期 示例：2022-10-13 |
| deptId | string | 否 | 否 | 部门id 示例：1525655517005348867 |
| deptCode | string | 否 | 否 | 部门code 示例：bu1 |
| employee | string | 否 | 否 | 人员id 示例：1563528487077150729 |
| employee_code | string | 否 | 否 | 人员code 示例：00000001 |
| signOrgId | string | 否 | 否 | 签约组织id 示例：1556193765280972809 |
| signOrgCode | string | 否 | 否 | 签约组织code 示例：1208 |
| blnOpenContract | boolean | 否 | 否 | 是否敞口(true--是;false--否) 示例：false 默认值：false |
| version | BigDecimal | 否 | 是 | 版本号 示例：2 |
| srcBillVersion | BigDecimal | 否 | 是 | 来源单据版本号 示例：2 |
| pubts | DateTime | 否 | 否 | 时间戳 示例：2023-01-10 14:51:11 |
| receiptPlanDimension | string | 否 | 否 | 收款计划维度(0：履约义务；1：履约义务行) 示例：0 默认值：0 |
| _status | string | 否 | 是 | 接口类型(Update) 示例：Update 默认值：Update |
| extSrcSystems | string | 否 | 否 | 来源单据系统(外) |
| extSrcBillCode | string | 否 | 否 | 来源单据编码(外) |
| rclPerformanceBaseInfoList | object | 是 | 否 | 发包履约基本信息 |
| rclCostPeriodPlanList | object | 是 | 否 | 分期成本计划 |
| rclEmployChangeBaseList | object | 是 | 是 | 变更历史子实体 |
| isAsync | boolean | 否 | 否 | 是否异步 示例：false 默认值：false |

## 3. 请求示例

Url: /yonbip/FCC/EFI/RVN/rclEmployPerformanceObligation/fiercl/employperformance/batchUpdate?access_token=访问令牌
Body: {
	"data": [
		{
			"accentity": "1525772228455038981",
			"accentity_code": "1208",
			"id": "1628654459275444227",
			"name": "名称",
			"billDate": "2022-10-13",
			"orimnyNotax": 0,
			"orimnyTax": 0,
			"orimny": 0,
			"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
			"exchangeRateType_code": "01",
			"exchangeRateDate": "2022-10-13",
			"exchangeRateOps": NaN,
			"exchangeRate": 1,
			"localmnyNotax": 100,
			"localmny": 100,
			"localmnyTax": 200,
			"signDate": "2022-10-13",
			"deptId": "1525655517005348867",
			"deptCode": "bu1",
			"employee": "1563528487077150729",
			"employee_code": "00000001",
			"signOrgId": "1556193765280972809",
			"signOrgCode": "1208",
			"blnOpenContract": false,
			"version": 2,
			"srcBillVersion": 2,
			"pubts": "2023-01-10 14:51:11",
			"receiptPlanDimension": "0",
			"_status": "Update",
			"extSrcSystems": "",
			"extSrcBillCode": "",
			"rclPerformanceBaseInfoList": [
				{
					"id": "1633297155701080077",
					"rowNo": 1,
					"materialTypeId": 1539617287450919000,
					"materialTypeCode": "000001",
					"materialId": 1526402386049368000,
					"materialCode": "000001",
					"projectId": "16074030727718548",
					"projectCode": "XM0001",
					"wbs": "20555847984014610",
					"wbsCode": "WBS001",
					"costCenterId": 1556810883353018400,
					"costCenterCode": "0001",
					"expenseItemId": 1550263660986237000,
					"expenseItemCode": "00001",
					"beginDate": "2022-10-13",
					"endDate": "2022-10-14",
					"quantity": 10,
					"unitId": 1528655706284097500,
					"unitCode": "1002",
					"currency": "1622076364663816198",
					"currency_code": "11",
					"oriUnitpriceNotax": 100,
					"oriUnitprice": 113,
					"orimnyNotax": 1000,
					"orimny": 1130,
					"taxRateEntity": "1607403072771850289",
					"taxRateEntity_code": "NO VAT",
					"orimnyTax": 130,
					"exchangeRatetype": "汇率类型",
					"exchangeRatetype_code": "01",
					"exchangeRateDate": "2022-10-13",
					"exchangeRateOps": NaN,
					"exchangeRate": 1,
					"localUnitprice": 113,
					"localUnitpriceNotax": 100,
					"localmnyNotax": 1000,
					"localmnyTax": 130,
					"localmny": 1130,
					"financeIncome": 1000,
					"memo": "备注",
					"pubts": "2023-01-10 16:53:35",
					"_status": "Insert",
					"extBeginBillId": "",
					"extSrcBillCode": "",
					"extSrcBodyId": "",
					"extBeginBillNo": "",
					"extSrcBillId": "",
					"extBeginBodyId": "",
					"extSrcTranstypeCode": "",
					"extBeginBilltypeCode": "",
					"extBeginTranstypeCode": "",
					"extSrcSystems": "",
					"extSrcBilltypeCode": ""
				}
			],
			"rclCostPeriodPlanList": [
				{
					"id": "1633231846435717126",
					"_status": "Insert",
					"blnDiscountIncluded": true
				}
			],
			"rclEmployChangeBaseList": [
				{
					"version": 2,
					"modifyReason": "变更原因",
					"blnTraceAdjust": true,
					"contractModifier": "47a6d56e-27bb-4eb0-a97b-ce267bec37a2",
					"contractModifyTime": "2023-12-04",
					"_status": "Insert"
				}
			],
			"isAsync": false
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 消息 示例：操作成功 |
| data | object | 否 | 后端返回data |
| count | number |
| 小数位数:0,最大长度:1 | 否 | 记录数 示例：5 |
| sucessCount | number |
| 小数位数:0,最大长度:1 | 否 | 成功数 示例：3 |
| failCount | number |
| 小数位数:0,最大长度:1 | 否 | 失败数 示例：2 |
| messages | object | 是 | 失败原因 示例：{ "sourceUnique":"数据唯一标识", "message":"错误数据描述" } |
| infos | object | 是 | 数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 5,
		"sucessCount": 3,
		"failCount": 2,
		"messages": [
			{
				"sourceUnique": "数据唯一标识",
				"message": "错误数据描述"
			}
		],
		"infos": [
			{
				"busiObj": "rclEmployPerformanceObligation",
				"signDate": "2023-01-04",
				"employee": "1610101678025474057",
				"accentity": "1607417838875705352",
				"dr": 0,
				"exchangeRate": 1,
				"id": "1628821215692455937",
				"signOrgId": "1614623273556901896",
				"metaFullName": "RCL.RCL.rclEmployPerformanceObligation",
				"orimny": 1130,
				"deptId": "1614623273556901896",
				"billDate": "2023-01-04",
				"ytenantId": "0000LBC4W3H13EZ4LE0000",
				"_status": 0,
				"version": 1,
				"blnOpenContract": false,
				"verifyState": 0,
				"name": "openApi测试1",
				"localmnyTax": 130,
				"localmny": 1130,
				"projectId": "1607837087783976969",
				"srcSystem": "收入合同台账",
				"code": "RECON20230104006869",
				"currType": "1607403072771850274",
				"cBillNo": "rclRevenueContract",
				"orimnyNotax": 1000,
				"orimnyTax": 130,
				"supplierId": "1607427184715628553",
				"srcBillCode": "202301041112",
				"pubts": "2023-01-04 16:09:06",
				"billTypeId": "1570189715179044871",
				"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
				"localmnyNotax": 1000,
				"bustype": "1607403021234340397",
				"exchangeRateType": "0000LBC4W3H13EZ4LE0000",
				"exchangeRateDate": "2023-01-04",
				"createTime": "2023-01-04 16:09:06",
				"rclContractBaseInfoList": [
					{
						"expenseItemId": "1608642033386258437",
						"endDate": "2023-01-31",
						"localmny": 1130,
						"memo": "备注",
						"dr": 0,
						"exchangeRate": 1,
						"id": "1628821215692455942",
						"metaFullName": "RCL.RCL.rclContractBaseInfo",
						"localUnitprice": 113,
						"ytenantId": "0000LBC4W3H13EZ4LE0000",
						"materialId": "1607839252471611399",
						"_status": 0,
						"taxRate": 13,
						"localUnitpriceNotax": 100,
						"localmnyTax": 130,
						"rowNo": 1,
						"exchangeRatetype": "0000LBC4W3H13EZ4LE0000",
						"materialTypeId": "1607432476115337218",
						"orimnyNotax": 1000,
						"relRevenuecontractId": "1628821215692455937",
						"orimnyTax": 130,
						"costCenterId": "1609384650402693123",
						"unitId": "1607434176922386433",
						"currency": "1607403072771850274",
						"pubts": "2023-01-04 16:09:06",
						"orimny": 1130,
						"creator": "e73dba5f-bb3a-4e36-8c64-9efc3a1d6012",
						"quantity": 10,
						"oriUnitprice": 113,
						"localmnyNotax": 1000,
						"beginDate": "2023-01-04",
						"exchangeRateDate": "2023-01-04",
						"oriUnitpriceNotax": 100,
						"createTime": "2023-01-04 16:09:06"
					}
				],
				"data": {
					"sourceUnique": "15489875421215",
					"targetUnique": "15454811234565"
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据不是最新状态，请刷新重试。


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-10-29

删除

请求参数 (5)

发包履约义务批量变更后端入口改为change


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

