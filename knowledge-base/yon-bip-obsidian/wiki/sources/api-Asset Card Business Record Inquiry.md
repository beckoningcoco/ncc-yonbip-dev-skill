---
title: "资产卡片业务记录查询"
apiId: "2331681274859094018"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Information"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Information]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产卡片业务记录查询

> `ContentType	application/json` 请求方式	POST | 分类: Asset Information (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ACC/equipcardbusiinfo/query

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
| data | object | 否 | 是 | 参数 |
| id | string | 否 | 否 | 资产卡片ID,要求和资产卡片编码 不能同时为空 示例：11212312312123 |
| code | string | 否 | 否 | 资产卡片编码，要求和ID不能同时为空 示例：EAX-202022201021 |
| key | string | 否 | 是 | 业务类型，只能输入以下几种 1、card_sparepartlist ，代表上机备件清单 2、card_maintenance ，代表 维修工单 3、card_pointcheckvos ，代表点检记录 4、card_failurevo ，代表故障记录 5、card_oil ,代表润滑历史 6、card_equipalter ，代表资产异动，不支持分页 7、card_rentout ，代表租出合同 8、card_gradinghistory ,代表定级历史 ，不支持分页 示例：card_maintenance |
| custMap | object | 否 | 是 | 参数 |
| page | object | 否 | 是 | 分页信息，注意，如果单据不支持分页，设置了下面分页信息页不生效 |

## 3. 请求示例

Url: /yonbip/ACC/equipcardbusiinfo/query?access_token=访问令牌
Body: {
	"data": {
		"id": "11212312312123",
		"code": "EAX-202022201021",
		"key": "card_maintenance"
	},
	"custMap": {
		"page": {
			"pageIndex": "1",
			"pageSize": "50"
		}
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 |
| data | object | 否 | 返回数据 |
| card_sparepartlist | object | 否 | 上机备件清单数据 |
| card_maintenance | object | 否 | 维修工单数据 |
| card_pointcheckvos | object | 否 | 点检记录数据 |
| card_failurevo | object | 否 | 故障记录数据 |
| card_oil | object | 否 | 润滑历史数据 |
| card_equipalter | object | 否 | 资产异动数据 |
| card_rentout | object | 否 | 租出合同数据 |
| card_gradinghistory | object | 否 | 定级历史数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"card_sparepartlist": {
			"pageIndex": 1,
			"pageSize": 50,
			"recordCount": 22,
			"pageCount": 1,
			"beginPageIndex": 1,
			"endPageIndex": 1,
			"recordList": [
				{
					"bill_code": "HSUJJAK-109001",
					"pk_material__code": "JJSKA-00000911",
					"pk_material__name": "物料000001",
					"pk_material__modelDescription": "规格1",
					"pk_material__model": "型号1",
					"status_date": "2025-08-25 16:54:43",
					"sp_attribute": 1,
					"up_part": "上机部位",
					"memo": "备注",
					"pk_provider__name": "供应商1",
					"facturer_name": "生产商1",
					"brand": "品牌1",
					"produce_place": "产地1",
					"factory_number": "出厂编号1",
					"service_life": 10,
					"life_unit": 1,
					"technical_state": "",
					"stockUnit__name": "件",
					"unit__name": "小时",
					"batchno": "批次号1",
					"serial_num": "序列号1",
					"src_bill_code": "来源编码1",
					"src_pk_transitype__name": "来源类型1",
					"billmaker__name": "小A",
					"billmaketime": "2025-09-09 00:00:00",
					"modifier__name": "小A",
					"modifiedtime": "2025-09-09 00:00:00",
					"auditor__name": "小C",
					"audittime": "2025-09-09 00:00:00"
				}
			]
		},
		"card_maintenance": {
			"pageIndex": 1,
			"pageSize": 50,
			"recordCount": 22,
			"pageCount": 1,
			"beginPageIndex": 1,
			"endPageIndex": 1,
			"recordList": [
				{
					"bill_code": "WXGD20200102",
					"pk_org__name": "维修组织1",
					"wo_content": "工作内容111",
					"pk_wo_status__name": "已批准",
					"pk_worktype__name": "紧急维修",
					"pk_executor__name": "老刘",
					"consign_flag": false,
					"pk_provider__name": "供应商A",
					"pk_transitype__name": "交易类型B"
				}
			]
		},
		"card_pointcheckvos": {
			"pageIndex": 1,
			"pageSize": 50,
			"recordCount": 22,
			"pageCount": 1,
			"beginPageIndex": 1,
			"endPageIndex": 1,
			"recordList": [
				{
					"bill_code": "DJJL99000991",
					"bill_status": 0,
					"pk_duty__name": "AAAAA",
					"disbug_status": "处理中",
					"pc_opinion": "ZZSS",
					"billmaker__name": "AAAA",
					"billmaketime": "2020-09-09 11:11:11",
					"auditor__name": "BBBB",
					"audittime": "2025-09-09 11:11:11",
					"modifier__name": "CCCC",
					"modifiedtime": "2025-09-09 11:11:11",
					"verifystate": 1,
					"creator__name": "CCCC",
					"creationtime": "2025-09-09 11:11:11"
				}
			]
		},
		"card_failurevo": {
			"pageIndex": 1,
			"pageSize": 50,
			"recordCount": 22,
			"pageCount": 1,
			"beginPageIndex": 1,
			"endPageIndex": 1,
			"recordList": [
				{
					"bill_code": "GZJL0009901",
					"pk_recorder__name": "ZZZZ",
					"record_date": "2025-09-09",
					"trouble_location": "XXX",
					"failure_time": "2025-09-09 11:11:11",
					"failure_expound": "XXXXXXXXXXX",
					"pk_failure_type__name": "类别AAA",
					"failure_scene": "",
					"pk_failure_detect__name": "巡检",
					"pk_failure_symptom__name": "xxxx",
					"intend_repair_time": "2025-09-09 11:11:11",
					"restore_time": "2025-09-09 11:11:11",
					"pk_failure_reason__name": "xxxxx",
					"pk_service_step__name": "XXXX",
					"deal_result": "处理结果11",
					"direct_loss": "11111",
					"indirect_loss": "999999",
					"pk_project__name": "项目1",
					"pk_wo__pk_wo_status__name": "",
					"memo": "备注111",
					"pk_maintainorg__name": "维修组织1",
					"src_bill_type": "",
					"src_pk_transitype__name": "来源类型1",
					"upcode": "来源单据1"
				}
			]
		},
		"card_oil": {
			"pageIndex": 1,
			"pageSize": 50,
			"recordCount": 22,
			"pageCount": 1,
			"beginPageIndex": 1,
			"endPageIndex": 1,
			"recordList": [
				{
					"bill_code": "RH1000011",
					"business_type": 1,
					"bill_status": 1,
					"lubrication_part": "XXX",
					"lubrication_points": 100,
					"pk_lubrication_method__name": "XXX",
					"pk_provide_oil__bill_code": "99#",
					"pk_provide_oil__name": "1号润滑油",
					"pk_provide_oil__oilbrand_code": "油牌号11",
					"pk_provide_oil__pk_measdoc__name": "升",
					"standard_oil_volume": 100.11,
					"pk_oli_team__name": "1班",
					"pk_oli_principal__name": "小A",
					"act_oil_time": "2025-09-09 11:11:11",
					"next_oil_time": "2025-09-09",
					"memo": "备注111"
				}
			]
		},
		"card_equipalter": {
			"pageIndex": 1,
			"pageSize": 50,
			"recordCount": 22,
			"pageCount": -1,
			"beginPageIndex": 1,
			"endPageIndex": 1,
			"recordList": [
				{
					"bill_code": "HT001ZCDC202507290003",
					"service_date": "2025-09-09",
					"pk_recorder__name": "小A",
					"pk_transitype__name": "责任人变动",
					"creationtime": "2025-07-29 15:02:52"
				}
			]
		},
		"card_rentout": {
			"pageIndex": 1,
			"pageSize": 50,
			"recordCount": 22,
			"pageCount": 1,
			"beginPageIndex": 1,
			"endPageIndex": 1,
			"recordList": [
				{
					"bill_code": "ZCHT00909901",
					"contract_code": "HTKSKI-01909-11112",
					"contract_name": "租出合同111",
					"customer__name": "A公司",
					"pk_psndoc__name": "A",
					"settlement_amount": 980019,
					"calculate_rent": "9800.00",
					"effective_date": "2025-09-09",
					"pk_org__name": "A组织",
					"bill_status": 1,
					"contract_way": 1,
					"plan_effective_date": "2025-09-09",
					"signed_date": "2025-09-09",
					"end_date": "2027-09-09",
					"actual_end_date": "2026-09-08",
					"cycle": 365,
					"pk_fiorg__name": "会计主体",
					"pk_raorg__name": "利润中心",
					"pk_mandept__name": "经办部门1",
					"pk_recorder__name": "小A",
					"pk_jobmngfil__name": "项目A",
					"renewed": true,
					"memo": "备注",
					"taxation_flag": false,
					"taxation_result": "异常信息1",
					"verifystate": 1,
					"customer_way": 0,
					"pk_org_in__name": "承租组织1",
					"retail_tenant": "散户承租方1",
					"origcurrtypeid__name": "人民币",
					"currrate": 9.99,
					"currrate_date": "2006-09-09",
					"deposit": 2000,
					"deposit_currency": "2000.00",
					"deposit_collection": "2000.00"
				}
			]
		},
		"card_gradinghistory": {
			"pageIndex": 1,
			"pageSize": 50,
			"recordCount": 22,
			"pageCount": -1,
			"beginPageIndex": 1,
			"endPageIndex": 1,
			"recordList": [
				{
					"bill_code": "YWDJ99880912",
					"pk_grading_level__name": "1级",
					"grading_time": "2024-09-09 11:11:11",
					"memo": "优秀资产",
					"pk_recorder__name": "小A",
					"billmaker__name": "小A",
					"billmaketime": "2025-09-09 11:11:11",
					"auditor__name": "小C",
					"audittime": "2025-09-09 11:11:11"
				}
			]
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	报错具体提示信息	报错具体提示信息


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

