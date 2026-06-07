---
title: "固定资产新增"
apiId: "1722163722730864643"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "New FA"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, New FA]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产新增

> `ContentType	application/json` 请求方式	POST | 分类: New FA (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/AdditionBill/save

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
| data | object | 否 | 是 | 固定资产调整信息 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| accentity | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1563514751881838598 |
| accentity_code | string | 否 | 否 | 会计主体编码,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：fa2 |
| code | string | 否 | 否 | 新增单编码（手工编码方式时必输） 示例：xz098 |
| assetCode | string | 否 | 否 | 固定资产编码(手工编码方式时必输) 示例：sdd333 |
| beginTime | string | 否 | 是 | 开始使用日期 格式yyyy-MM-dd 示例：2022-09-30 |
| name | string | 否 | 是 | 固定资产名称 示例：mm09 |
| specification | string | 否 | 否 | 固定资产规格 示例：11 |
| assetModel | string | 否 | 否 | 固定资产型号 示例：model |
| blnPreAdd | boolean | 否 | 否 | 是否预建 true是 false否 示例：true |
| addWayId | string | 否 | 否 | 增加方式id，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准 示例：1550289989236424709 |
| addWayCode | string | 否 | 否 | 增加方式编码,，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准 示例：123 |
| usageStateId | string | 否 | 否 | 使用状态id，使用状态id和使用状态编码不能同时为空，id和编码同时存在，以id为准 示例：1550289997826359313 |
| usageStateCode | string | 否 | 否 | 使用状态编码,，使用状态id和使用状态编码不能同时为空，id和编码同时存在，以id为准 示例：332 |
| mgmtDeptId | string | 否 | 否 | 管理部门id 示例：12321321 |
| mgmtDeptId_code | string | 否 | 否 | 管理部门编码 示例：122 |
| placeId | string | 否 | 否 | 位置id 示例：213123 |
| placeCode | string | 否 | 否 | 位置编码 示例：21 |
| assetSubcategoryId | string | 否 | 否 | 固定资产子类别id 示例：12321 |
| assetSubcategoryId_code | string | 否 | 否 | 固定资产子类别编码 示例：02 |
| location | string | 否 | 否 | 存放地点 示例：2楼 |
| userId | string | 否 | 否 | 使用人id 示例：155028999 |
| userCode | string | 否 | 否 | 使用人编码 示例：121 |
| custodian | string | 否 | 否 | 保管人id 示例：155028999 |
| custodianCode | string | 否 | 否 | 保管人编码 示例：8999 |
| tagno | string | 否 | 否 | 标签号 示例：090 |
| profitCenterId | string | 否 | 否 | 管理利润中心id 示例：155028 |
| profitCenterId_code | string | 否 | 否 | 管理利润中心编码 示例：111 |
| unitId | string | 否 | 否 | 计量单位id 示例：5434564563 |
| unitId_code | string | 否 | 否 | 计量单位编码 示例：e67 |
| impairmentunitId | string | 否 | 否 | 减值单元id 示例：155028243 |
| impairmentunitId_code | string | 否 | 否 | 减值单元编码 示例：15502 |
| vendorId | string | 否 | 否 | 供应商id 示例：32432423 |
| vendorCode | string | 否 | 否 | 供应商编码 示例：12321 |
| mgmtCostCenterId | string | 否 | 否 | 管理成本中心id 示例：155028 |
| mgmtCostCenterId_code | string | 否 | 否 | 管理成本中心编码 示例：1550 |
| oriCurrtypeId | string | 否 | 否 | 原币币种id，币种id和币种编码不能同时为空，id和编码同时存在，以id为准 示例：1550289628449210390 |
| oriCurrtypeId_code | string | 否 | 否 | 原币币种编码，币种id和币种编码不能同时为空，id和编码同时存在，以id为准 示例：CNY |
| fcOriValue | BigDecimal | 否 | 是 | 原币原值 示例：1000 |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert 默认值：Insert |
| quantity | int | 否 | 是 | 数量(系統参数设置为一物一卡时必填1，其余情况必须大于0) 示例：1 默认值：1 |
| bodies | object | 是 | 是 | 固定资产新增明细信息 |
| assignments | object | 是 | 是 | 分配信息(部门，产品，成本/利润中心，项目均根据系统参数的设置展示或是否必填) |
| devices | object | 是 | 否 | 设备信息 |
| sources | object | 是 | 否 | 来源信息 |
| costrecords | object | 是 | 否 | 费用记录 |

## 3. 请求示例

Url: /yonbip/EFI/AdditionBill/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"accentity": "1563514751881838598",
		"accentity_code": "fa2",
		"code": "xz098",
		"assetCode": "sdd333",
		"beginTime": "2022-09-30",
		"name": "mm09",
		"specification": "11",
		"assetModel": "model",
		"blnPreAdd": true,
		"addWayId": "1550289989236424709",
		"addWayCode": "123",
		"usageStateId": "1550289997826359313",
		"usageStateCode": "332",
		"mgmtDeptId": "12321321",
		"mgmtDeptId_code": "122",
		"placeId": "213123",
		"placeCode": "21",
		"assetSubcategoryId": "12321",
		"assetSubcategoryId_code": "02",
		"location": "2楼",
		"userId": "155028999",
		"userCode": "121",
		"custodian": "155028999",
		"custodianCode": "8999",
		"tagno": "090",
		"profitCenterId": "155028",
		"profitCenterId_code": "111",
		"unitId": "5434564563",
		"unitId_code": "e67",
		"impairmentunitId": "155028243",
		"impairmentunitId_code": "15502",
		"vendorId": "32432423",
		"vendorCode": "12321",
		"mgmtCostCenterId": "155028",
		"mgmtCostCenterId_code": "1550",
		"oriCurrtypeId": "1550289628449210390",
		"oriCurrtypeId_code": "CNY",
		"fcOriValue": 1000,
		"_status": "Insert",
		"quantity": 1,
		"bodies": [
			{
				"assetBookCategoryId": "1594672102513836041",
				"accbook": "1570037501541220371",
				"accbook_code": "e",
				"exchangeRateType": "1550290015006228502",
				"exchangeRateType_code": "432",
				"exchangeRate": 7,
				"oriValue": 25,
				"fcOriValue": 3,
				"taxItemId": "12321321312",
				"taxItemCode": "NT",
				"taxRate": 12,
				"addedTaxAmount": 1,
				"accbookStartDate": "2022-09-30",
				"yearDeprAmount": 1,
				"deprAmount": 300,
				"curYearImpAmount": 0,
				"accumImpAmount": 12,
				"scrapValueType": "0",
				"scrapValueRate": 12,
				"scrapValue": 5000,
				"accbookCurrtypeId": "232321231",
				"accbookCurrtypeId_code": "CNY",
				"oriCurrtypeId": "23443",
				"oriCurrtypeId_code": "1112",
				"assetCategoryId": "3123",
				"assetCategoryCode": "22",
				"deprMethodId": "3123123",
				"deprMethodId_code": "121",
				"lifeYear": 12,
				"lifeMonth": 1,
				"extractedPeriod": 1,
				"isMonthdepr": true,
				"isDepr": false,
				"deprConvention": "1122221121",
				"deprConventionCode": "12",
				"disposalConvention": "1122221121",
				"disposalConventionCode": "12e",
				"amortiAdjustDate": "2022-10-01",
				"totalWorkload": 23,
				"existingWorkload": 22,
				"workloadUnit": "天",
				"monthWorkload": 1,
				"createAssetDate": "2022-10-01",
				"_status": "Insert",
				"exchangeRateOps": 1,
				"orgRateOps": 1,
				"subjects": [
					{
						"subjectId": "1564985907040223235",
						"_status": "Insert",
						"subjectCode": "6601"
					}
				]
			}
		],
		"assignments": [
			{
				"deptId": "1570033764909711360",
				"deptCode": "cg",
				"productId": "1551753868707627014",
				"productCode": "00001",
				"proportion": 1,
				"costCenterId": "32423423",
				"costCenterCode": "23",
				"profitCenterId": "12321312",
				"profitCenterCode": "3213",
				"projectId": "1267659679875",
				"projectCode": "123",
				"remarks": {
					"zh_CN": "1212"
				},
				"_status": "Insert"
			}
		],
		"devices": [
			{
				"code": "123",
				"name": {
					"zh_CN": "电脑"
				},
				"model": {
					"zh_CN": "型号1"
				},
				"usageState": {
					"zh_CN": "111"
				},
				"value": 2,
				"measuringUnitId": "34231213123",
				"measuringUnitId_code": "323",
				"useDate": "2023-05-23",
				"changeDate": "2023-05-23",
				"quantity": 1,
				"remarks": {
					"zh_CN": "备注1"
				},
				"_status": "Insert"
			}
		],
		"sources": [
			{
				"srcAppId": "117",
				"srcProjectId": "1571459427756670982",
				"srcProjectCode": "222",
				"_status": "Insert"
			}
		],
		"costrecords": [
			{
				"occurDate": "2023-05-23",
				"balanceProject": {
					"zh_CN": "ree"
				},
				"amount": 500,
				"remarks": {
					"zh_CN": "213"
				},
				"_status": "Insert",
				"digest": {
					"zh_CN": "111"
				}
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
| data | object | 否 | 返回固定资产卡片查询详情信息 |
| code | string | 否 | 固定资产编码 示例：0000230410003151 |
| id | string | 否 | 单据id 示例：1699951268584226817 |
| accentity | string | 否 | 会计主体id 示例：1570033155012821001 |
| name | object | 否 | 固定资产名称 |
| tagno | string | 否 | 标签号 示例：123 |
| specification | object | 否 | 固定资产规格 |
| assetModel | object | 否 | 固定资产型号 |
| beginTime | string | 否 | 开始使用日期 示例：2022-09-01 |
| quantity | BigDecimal | 否 | 数量 示例：2 |
| fcOriValue | BigDecimal | 否 | 原币原值 示例：1000 |
| oriCurrtypeId | string | 否 | 原币币种id 示例：1550289628449210394 |
| addWayId | string | 否 | 增加方式id 示例：1550289989236424710 |
| location | object | 否 | 存放地点 |
| usageStateId | string | 否 | 使用状态id 示例：1550289997826359315 |
| bodies | object | 是 | 子表信息 |
| assignments | object | 是 | 分配信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "0000230410003151",
		"id": "1699951268584226817",
		"accentity": "1570033155012821001",
		"name": {
			"zh_CN": "多账簿23"
		},
		"tagno": "123",
		"specification": {
			"zh_CN": "规格1"
		},
		"assetModel": {
			"zh_CN": "型号1"
		},
		"beginTime": "2022-09-01",
		"quantity": 2,
		"fcOriValue": 1000,
		"oriCurrtypeId": "1550289628449210394",
		"addWayId": "1550289989236424710",
		"location": {
			"zh_CN": "12楼"
		},
		"usageStateId": "1550289997826359315",
		"bodies": [
			{
				"accbookStartDate": "2022-09-01",
				"oriCurrtypeId": "123213212",
				"exchangeRateType": "0000L8A6ELW126E96Q0000",
				"yearDeprAmount": 12,
				"deprAmount": 60,
				"accumImpAmount": 80,
				"curYearImpAmount": 11,
				"netValue": 100,
				"netAmount": 200,
				"oricostAmount": 100,
				"oriValue": 9,
				"lifeMonth": 12,
				"lifeYear": 1,
				"scrapValueType": "1",
				"scrapValue": 5,
				"extractedPeriod": 0,
				"deprMethodId": "1550290015006228493",
				"assetBookCategoryId": "1594672600730042376"
			}
		],
		"assignments": [
			{
				"deptCode": "cg",
				"proportion": "1"
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

1	2026-01-21

删除

请求参数 oriBillId

去除入参oriBillId【业务幂等id】

2	2025-12-10

更新

请求说明

新增

请求参数 oriBillId

添加入参oriBillId【业务幂等id】

3	2025-09-18

新增

请求参数 exchangeRateOps

新增

请求参数 orgRateOps

4	2025-06-26

更新

请求参数 (9)

删除

请求参数 amortiAdjustMark

更新

返回参数 accbookStartDate


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

