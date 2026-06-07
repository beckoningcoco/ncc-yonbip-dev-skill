---
title: "入库调整新增"
apiId: "2017725668209459205"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Gain/Loss Receipt Adjustment"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Gain/Loss Receipt Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 入库调整新增

> `ContentType	application/json` 请求方式	POST | 分类: Gain/Loss Receipt Adjustment (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/inadjustBll/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 入库调整信息 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 单据id，更新单据时必填 示例：3322 |
| remarks | string | 否 | 否 | 备注 示例：fdds |
| accentity | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1563514751881838598 |
| accentity_code | string | 否 | 否 | 会计主体编码,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：fa2 |
| periodStatus | string | 否 | 否 | 是否期末调整 1否 2是 示例：1 默认值：1 |
| accbook | string | 否 | 否 | 账簿id,账簿id和账簿编码二选一必填，id和编码同时存在，以id为准 示例：1570037501541220371 |
| accbook_code | string | 否 | 否 | 账簿编码,账簿id和账簿编码二选一必填，id和编码同时存在，以id为准 示例：e11 |
| busiBillDate | string | 否 | 是 | 业务单据日期 格式yyyy-mm-dd 示例：2024-06-11 |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, Update更新) 示例：Insert 默认值：Insert |
| bodies | object | 是 | 是 | 入库调整新增明细信息 |

## 3. 请求示例

Url: /yonbip/EFI/inadjustBll/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "3322",
		"remarks": "fdds",
		"accentity": "1563514751881838598",
		"accentity_code": "fa2",
		"periodStatus": "1",
		"accbook": "1570037501541220371",
		"accbook_code": "e11",
		"busiBillDate": "2024-06-11",
		"_status": "Insert",
		"bodies": [
			{
				"stockOrg": "23443",
				"stockOrg_code": "1112",
				"warehouse": "3123",
				"warehouse_code": "22",
				"materialId": "3123123",
				"material_code": "121",
				"batchNo": "1",
				"orgAmount": 1,
				"accbookAmount": 25,
				"_status": "Insert",
				"profitCenter_code": "see",
				"remarksB": "fsdf",
				"orgThisCostAmount": "1",
				"header": "3322",
				"id": "1233",
				"accbookThisCostAmount": 1,
				"profitCenter": "1570033764909711360",
				"oppProfitCenter_code": "uyi",
				"oppProfitCenter": "1942710791616593926",
				"busiCostCenter_code": "QZP11",
				"busiCostCenter": "2013865068138070017",
				"customer_code": "AA11",
				"customer": "2013865068138070019",
				"busiDept_code": "AA12",
				"busiDept": "2013865068138070080",
				"costElements": [
					{
						"componentId": "1564985907040223235",
						"componentId_code": "E5005",
						"costElementId_costelementId_code": "6601",
						"_status": "Insert",
						"costElementId_maMaterialSku_materialId_code": "edaa",
						"costElementId_activityId_code": "ERT",
						"num": 1,
						"accbookAmount": 2,
						"accbookThisCostAmount": 1,
						"orgThisCostAmount": "1",
						"orgAmount": "1",
						"id": "456678",
						"detail": "123321"
					}
				],
				"supplierId_code": "AA13",
				"supplierId": "1941101458764070916",
				"invoiceSupplierId_code": "AA14",
				"invoiceSupplierId": "1941101458764070917",
				"projectId_code": "00000028",
				"projectId": "1991597415025082422"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 入库调整详情信息 |
| code | string | 否 | 入库调整单编码 示例：IA24240529012741 |
| id | string | 否 | 单据id 示例：1699951268584226817 |
| accentity | string | 否 | 会计主体id 示例：1570033155012821001 |
| period | string | 否 | 期间id 示例：1550375020881510407 |
| bookDate | string | 否 | 记账日期 示例：2023-09-01 |
| busiBillDate | string | 否 | 业务单据日期 示例：2023-09-01 |
| periodStatus | string | 否 | 是否期末调整 1否 2是 示例：1 |
| pubts | string | 否 | 时间戳 示例：2024-06-04 11:06:05 |
| accbook | string | 否 | 账簿id 示例：1550289989236424710 |
| remarks | string | 否 | 备注 示例：调整用 |
| bodies | object | 是 | 子表信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "IA24240529012741",
		"id": "1699951268584226817",
		"accentity": "1570033155012821001",
		"period": "1550375020881510407",
		"bookDate": "2023-09-01",
		"busiBillDate": "2023-09-01",
		"periodStatus": "1",
		"pubts": "2024-06-04 11:06:05",
		"accbook": "1550289989236424710",
		"remarks": "调整用",
		"bodies": [
			{
				"stockOrg": "1525652227072458756",
				"warehouse": "123213212",
				"priceMethod": "2",
				"costDomainId": "1908705499608514565",
				"accbookAmount": 60,
				"materialId": "1526410752645660678",
				"batchNo": "100",
				"pubts": "2024-06-04 11:06:05",
				"accbookCurrtypeId": "1550290015006228493",
				"header": "1550290015006228493",
				"id": "2012367112268939275"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	会计主体不允许为空	查看请求数据是否正确


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-22

更新

请求参数 (7)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

