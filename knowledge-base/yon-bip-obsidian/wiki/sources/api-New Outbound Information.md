---
title: "出库信息新增"
apiId: "2034652220208709633"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Issue Information"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Issue Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 出库信息新增

> `ContentType	application/json` 请求方式	POST | 分类: Issue Information (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/fiercl/rcloutboundinfo/add

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
| bustype | string | 否 | 否 | 交易类型id 示例：1956122350884225033 |
| bustypeCode | string | 否 | 否 | 交易类型编码 示例：rcl_outboundInfo |
| customer | string | 否 | 否 | 客户id 示例：1590794786419769346 |
| customerCode | string | 否 | 否 | 客户编码 示例：yl-kh |
| billDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 单据日期 示例：2024-07-23 |
| code | string | 否 | 否 | 单据编号(手动编码时必输) |
| exchangeRateType | string | 否 | 否 | 汇率类型id 示例：0000LBC4W3H13EZ4LE0000 |
| exchangeRateTypeCode | string | 否 | 否 | 汇率类型编码 示例：01 |
| exchangeRateDate | Date | 否 | 否 | 汇率日期 示例：2023-05-23 |
| exchRateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式 示例：1:×,2:÷ |
| exchangeRate | BigDecimal | 否 | 否 | 汇率 示例：1 |
| extSrcBillId | string | 否 | 是 | 来源单据id(外) 示例：12345678 |
| extSrcSystem | string | 否 | 是 | 来源系统(外) 示例：客开 |
| extSrcBillNo | string | 否 | 是 | 来源单据号(外) 示例：SEI20230918002002 |
| extSrcBilltypeCode | string | 否 | 否 | 来源单据类型编码(外) 示例：履约义务信息 |
| extSrcTranstypeCode | string | 否 | 否 | 来源交易类型编码(外) |
| _status | string | 否 | 是 | 接口类型(Insert新增) 示例：Insert 默认值：Insert |
| RclOutboundInfoBodyList | object | 是 | 是 | 出库信息子表 |

## 3. 请求示例

Url: /yonbip/EFI/fiercl/rcloutboundinfo/add?access_token=访问令牌
Body: {
	"data": [
		{
			"bustype": "1956122350884225033",
			"bustypeCode": "rcl_outboundInfo",
			"customer": "1590794786419769346",
			"customerCode": "yl-kh",
			"billDate": "2024-07-23",
			"code": "",
			"exchangeRateType": "0000LBC4W3H13EZ4LE0000",
			"exchangeRateTypeCode": "01",
			"exchangeRateDate": "2023-05-23",
			"exchRateOps": NaN,
			"exchangeRate": 1,
			"extSrcBillId": "12345678",
			"extSrcSystem": "客开",
			"extSrcBillNo": "SEI20230918002002",
			"extSrcBilltypeCode": "履约义务信息",
			"extSrcTranstypeCode": "",
			"_status": "Insert",
			"RclOutboundInfoBodyList": [
				{
					"rclRevenueContractNo": "1731055206999261192",
					"rclRevenueContractId": "1731055206999261192",
					"rclRevenueContractBaseInfoId": "1731055206999261194",
					"dept": "1592418009182371849",
					"deptCode": "000014",
					"employee": "1592418009182371849",
					"employeeCode": "000014",
					"quantity": 10,
					"unitId": "1528655706284097500",
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
					"costCenterId": "1556810883353018400",
					"procenterId": "1526217092562944002",
					"oppProcenterId": "1540512453146181634",
					"extSrcSystem": "履约义务信息",
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
| messages | object | 是 | messages |
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
				"code": "RODI20240719000133",
				"extSrcSystem": "客开",
				"extSrcBilltypeCode": "履约义务信息",
				"billType_name": "出库信息",
				"accentity_name": "收入中台演示销售组织1",
				"accentity": "1525652227072458756",
				"orimnyNoTax": 200,
				"extSrcBillId": "12345678",
				"orgCurrtype_name": "人民币2jklifhd",
				"exchangeRate": 1,
				"id": "2045770069368635395",
				"pubts": "2024-07-19 11:16:21",
				"oriCurrtype_name": "人民币2jklifhd",
				"orimnyTax": 0,
				"srcBillId": "2045256142165114882",
				"localmny": 200,
				"extSrcBillNo": "SEI20230918002002",
				"extSrcTranstypeCode": "",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"orgCurrtype": "1525643705855773169",
				"localmnyNotax": 200,
				"billType": "2035491078766329859",
				"auditor": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"billDate": "2024-07-19",
				"bustype": "2035493294969454599",
				"oriCurrtype": "1525643705855773169",
				"verifyState": 0,
				"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
				"orimny": 200,
				"exchangeRateDate": "2024-07-19",
				"auditTime": "2024-07-19 00:00:00",
				"createTime": "2024-07-19 11:16:21",
				"localmnyTax": 0,
				"exchangeRateType_name": "基准汇率",
				"customer_name": "内部客户",
				"customer": "1529267825030463489",
				"RclOutboundInfoBodyList": [
					{
						"rclRevenueContractBaseInfoNo": "1.00000000",
						"extSrcSystem": "履约义务信息",
						"extSrcBilltypeCode": "rcl_businessct",
						"oriUnitprice": 40,
						"oriCurrencyId": "1525643705855773169",
						"rclRevenueContractNo": "RECONRECON20240718008271",
						"accentity_name": "收入中台演示销售组织1",
						"accentity": "1525652227072458756",
						"orimnyNoTax": 200,
						"extSrcBillId": "1822350311630045193",
						"exchangeRate": 1,
						"taxRateId_name": "0%",
						"unitId": "1525645209096421378",
						"id": "2045770069368635396",
						"taxRateId": "1525643714445705232",
						"pubts": "2024-07-19 11:16:21",
						"orimnyTax": 0,
						"localmny": 200,
						"extSrcBillNo": "SEI20230918002002",
						"extSrcTranstypeCode": "rcl_businessct",
						"rclRevenueContractName": "0718出库信息演示",
						"quantity": 5,
						"localmnyNotax": 200,
						"extOriBilltypeCode": "rcl_businessct",
						"rclOutboundInfoId": "2045770069368635395",
						"extSrcBillRowId": "1822350311630045193",
						"oriUnitpriceNotax": 40,
						"localUnitprice": 40,
						"unitId_name": "小时",
						"taxRate": 0,
						"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
						"orimny": 200,
						"extOriBillNo": "SEI20230918002002",
						"exchangeRateDate": "2024-07-19",
						"rclRevenueContractId": "2045256142165114882",
						"oriCurrencyId_name": "人民币2jklifhd",
						"localmnyTax": 0,
						"rclOutboundInfoId_id": "2045770069368635395",
						"exchangeRateType_name": "基准汇率",
						"rclRevenueContractBaseInfoId": "2045256142165114884",
						"localUnitpriceNotax": 40
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

1	2025-09-10

新增

请求参数 exchRateOps

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

