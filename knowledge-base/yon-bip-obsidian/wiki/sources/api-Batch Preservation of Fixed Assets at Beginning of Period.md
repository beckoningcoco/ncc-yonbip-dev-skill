---
title: "固定资产期初批量保存"
apiId: "1790733717420376068"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Opening"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Opening]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产期初批量保存

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Opening (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/InitiationBill/save

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
| data | object | 否 | 是 | 固定资产调整信息 |
| accentity | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1563514751881838598 |
| accentity_code | string | 否 | 否 | 会计主体编码,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：fa2 |
| code | string | 否 | 否 | 新增单编码（手工编码方式时必输） 示例：xz098 |
| assetCode | string | 否 | 否 | 固定资产编码(手工编码方式时必输) 示例：sdd333 |
| beginTime | string | 否 | 是 | 开始使用日期 格式yyyy-MM-dd 示例：2022-09-30 |
| name | string | 否 | 是 | 固定资产名称 示例：mm09 |
| specification | string | 否 | 否 | 固定资产规格 示例：11 |
| assetModel | string | 否 | 否 | 固定资产型号 示例：model |
| addWayId | string | 否 | 否 | 增加方式id，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准 示例：1550289989236424709 |
| addWayCode | string | 否 | 否 | 增加方式编码,，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准 示例：123 |
| usageStateId | string | 否 | 否 | 使用状态id，使用状态id和使用状态编码不能同时为空，id和编码同时存在，以id为准 示例：1550289997826359313 |
| usageStateCode | string | 否 | 否 | 使用状态编码,，使用状态id和使用状态编码不能同时为空，id和编码同时存在，以id为准 示例：332 |
| mgmtDeptId | string | 否 | 否 | 管理部门id 示例：12321321 |
| mgmtDeptId_code | string | 否 | 否 | 管理部门编码 示例：122 |
| placeId | string | 否 | 否 | 位置id 示例：213123 |
| placeCode | string | 否 | 否 | 位置编码 示例：21 |
| assetSubcategoryId | string | 否 | 否 | 固定资产子类别id 示例：12321 |
| assetSubcategoryCode | string | 否 | 否 | 固定资产子类别编码 示例：01 |
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
| vendorId | string | 否 | 否 | 供应商id 示例：32432423 |
| mgmtCostCenterId | string | 否 | 否 | 管理成本中心id 示例：155028 |
| mgmtCostCenterId_code | string | 否 | 否 | 管理成本中心编码 示例：1550 |
| oriCurrtypeId | string | 否 | 否 | 原币币种id，币种id和币种编码不能同时为空，id和编码同时存在，以id为准 示例：1550289628449210390 |
| oriCurrtypeId_code | string | 否 | 否 | 原币币种编码，币种id和币种编码不能同时为空，id和编码同时存在，以id为准 示例：CNY |
| fcOriValue | BigDecimal | 否 | 是 | 原币原值 示例：1000 |
| _status | string | 否 | 否 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存), 不支持修改 示例：Insert 默认值：Insert |
| quantity | int | 否 | 是 | 数量(系統参数设置为一物一卡时必填1，其余情况必须大于0) 示例：1 默认值：1 |
| blnTaxAcceleratedDepr | boolean | 否 | 否 | 税收加速折旧标识 示例：false 默认值：false |
| bodies | object | 是 | 是 | 固定资产新增明细信息 |
| assignments | object | 是 | 是 | 分配信息(部门，产品，成本/利润中心，项目均根据系统参数的设置展示或是否必填) |
| devices | object | 是 | 否 | 设备信息 |
| costrecords | object | 是 | 否 | 费用记录 |
| id | string | 否 | 否 | 主键 示例：5800094837 |
| srcProjectIdCombine | string | 否 | 否 | 来源项目 示例：NC65 |
| srcBillNoCombine | string | 否 | 否 | 来源单据号 示例：2930000TNC9300000 |

## 3. 请求示例

Url: /yonbip/EFI/InitiationBill/save?access_token=访问令牌
Body: {
	"data": {
		"accentity": "1563514751881838598",
		"accentity_code": "fa2",
		"code": "xz098",
		"assetCode": "sdd333",
		"beginTime": "2022-09-30",
		"name": "mm09",
		"specification": "11",
		"assetModel": "model",
		"addWayId": "1550289989236424709",
		"addWayCode": "123",
		"usageStateId": "1550289997826359313",
		"usageStateCode": "332",
		"mgmtDeptId": "12321321",
		"mgmtDeptId_code": "122",
		"placeId": "213123",
		"placeCode": "21",
		"assetSubcategoryId": "12321",
		"assetSubcategoryCode": "01",
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
		"vendorId": "32432423",
		"mgmtCostCenterId": "155028",
		"mgmtCostCenterId_code": "1550",
		"oriCurrtypeId": "1550289628449210390",
		"oriCurrtypeId_code": "CNY",
		"fcOriValue": 1000,
		"_status": "Insert",
		"quantity": 1,
		"blnTaxAcceleratedDepr": false,
		"bodies": [
			{
				"assetBookCategoryId": "1594672102513836041",
				"accbook": "1570037501541220371",
				"accbook_code": "e",
				"orgCurrtypeId": "1550289628449210394",
				"orgCurrtypeIdCode": "300e0",
				"exchangeRateType": "1550290015006228502",
				"exchangeRateType_code": "432",
				"orgRate": 1,
				"exchangeRate": 7,
				"oriValue": 25,
				"fcOriValue": 3,
				"taxItemId": "12321321312",
				"taxRate": 12,
				"addedTaxAmount": 1,
				"orgAddedTaxAmount": 1,
				"accbookStartDate": "2022-09-30",
				"orgScrapValueAmount": 1,
				"orgYearDeprAmount": 0,
				"orgAccumDeprAmount": 0,
				"orgCurYearImpAmount": 0,
				"orgAccumImpAmount": 0,
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
				"orgRateTypeId": "4467433",
				"deprConventionCode": "12",
				"disposalConvention": "1122221121",
				"disposalConventionCode": "12e",
				"amortiAdjustDate": "2022-10-01",
				"totalWorkload": 23,
				"existingWorkload": 22,
				"workloadUnit": "天",
				"monthWorkload": 1,
				"createAssetDate": "2022-10-01",
				"orgRateOps": 1,
				"subjects": [
					{
						"subjectId": "1564985907040223235",
						"_status": "Insert",
						"subjectCode": "230094"
					}
				],
				"impairmentAmount": 0,
				"period": "2023-01",
				"taxItemCode": "be",
				"isAllowamortize": false,
				"deprStartDate": "2021-01-31",
				"recoverableCostAmount": 632.7,
				"assetCategoryName": "测试名称",
				"orgRateTypeCode": "ab",
				"exchangeRateOps": 1
			}
		],
		"assignments": [
			{
				"deptId": "1570033764909711360",
				"deptCode": "cg",
				"productId": "1551753868707627014",
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
		],
		"id": "5800094837",
		"srcProjectIdCombine": "NC65",
		"srcBillNoCombine": "2930000TNC9300000"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 状态码 示例：200 |
| message | string | 否 | 返回值 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | string | 是 | 返回信息明细 |
| failInfos | string | 是 | 失败信息明细 |
| infos | object | 是 | 返回数据明细 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"failInfos": [
			""
		],
		"infos": [
			{
				"assignments": [
					{
						"proportion": 100,
						"accentity": "1721730403489284099",
						"id": "1817352593281646603",
						"creator": "d4f2821b-eddd-4de4-92a0-f11cc6a55ac6",
						"deptId": "1721730944643104770",
						"additionBillId": "1817352593281646601",
						"createTime": "2023-09-15 16:48:07",
						"costCenterId": "234563",
						"productId": "43634567",
						"projectId": "557433236"
					}
				],
				"accentity": "1721730403489284099",
				"blnTaxAcceleratedDepr": false,
				"addWayId": "1625145496765988874",
				"beginTime": "2023-01-31",
				"id": "1817352593281646601",
				"assetCode": "mm4230915010580",
				"billTradeTypeId": "1625145041486348505",
				"blnLease": false,
				"name": {
					"zh_CN": "测试固定资产001"
				},
				"assetCategoryId": "1748124180121387015",
				"code": "QC012513",
				"bodies": [
					{
						"accumImpAmount": 0,
						"initOrgAccumDeprAmount": 0,
						"accbookStartDate": "2023-01-31",
						"accentity": "1721730403489284099",
						"oriValue": 30000,
						"id": "1817352593281646604",
						"orgYearDeprAmount": 0,
						"period": "2023-02",
						"lifeMonth": 4,
						"residualWorkload": 0,
						"accbook": "1748142837448835090",
						"booktype": "2",
						"createAssetDate": "2023-01-31",
						"isDepr": true,
						"monthWorkload": 0,
						"monthDeprRate": 0,
						"accbookCurrtypeId": "1721723737695322121",
						"orgAddedTaxAmount": 0,
						"orgScrapValueAmount": 150,
						"orgAccumDeprAmount": 0,
						"accountStatus": "0",
						"periodId": "1658321095469039620",
						"creator": "d4f2821b-eddd-4de4-92a0-f11cc6a55ac6",
						"recoverableCostAmount": 29850,
						"totalWorkload": 0,
						"lifeYear": 4,
						"additionBillId": "1817352593281646601",
						"isMonthdepr": false,
						"createTime": "2023-09-15 16:48:07",
						"scrapValueType": "1",
						"assetBookCategoryId": "1748143352855396386",
						"oricostAmount": 30000,
						"orgRateTypeId": "1721726993301504004",
						"orgCurYearImpAmount": 0,
						"exchangeRate": 1,
						"deprMethodId": "1625145505355923545",
						"curYearImpAmount": 0,
						"addedTaxAmount": 0,
						"orgCurrtypeId": "1721723737695322121",
						"deprAmount": 0,
						"netValue": 30000,
						"orgRecoverableCostAmount": 29850,
						"taxRate": 0,
						"existingWorkload": 0,
						"assetCategoryId": "1748124180121387015",
						"yearDeprAmount": 0,
						"initDeprAmount": 0,
						"accRateDate": "2023-01-31",
						"unitDeprAmount": 0,
						"fixedStatus": "1",
						"fcOriValue": 30000,
						"scrapValue": 150,
						"extractedPeriod": 0,
						"netAmount": 30000,
						"monthDeprAmount": 0,
						"exchangeRateType": "1721726993301504004",
						"orgAccumImpAmount": 0,
						"oriCurrtypeId": "1721723737695322121",
						"deprStatus": "0",
						"isInit": true,
						"endDayOfPeriod": "2023-02-28",
						"isNotCapitalization": true,
						"impairmentAmount": 0,
						"exchangeRateType_digit": 5,
						"accbookCurrtypeId_moneyDigit": 4,
						"beginDayOfPeriod": "2023-02-01",
						"oriCurrtypeId_moneyDigit": 4
					}
				],
				"assetId": "1817352593281646599",
				"fcOriValue": 30000,
				"billTypeId": "1406273920226557952",
				"creator": "d4f2821b-eddd-4de4-92a0-f11cc6a55ac6",
				"quantity": 1,
				"usageStateId": "1625145505355923470",
				"createTime": "2023-09-15 16:48:07",
				"oriCurrtypeId": "1721723737695322121",
				"assetBookCategoryId": "1748143352855396386",
				"oriCurrtypeId_moneyDigit": 4,
				"placeId": "5454556",
				"vendorId": "43645745",
				"mgmtDeptId": "49034096",
				"assetSubcategoryId": "435645645",
				"taxItemId": "436345654",
				"tagno": "1029",
				"unitId": "43464567",
				"custodian": "3463456",
				"impairmentunitId": "4365345645",
				"mgmtCostCenterId": "42356346"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	会计主体不允许为空	补充会计主体入参


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

请求参数 orgRateOps

新增

请求参数 exchangeRateOps

4	2025-06-26

更新

请求参数 (9)

删除

请求参数 amortiAdjustMark

更新

返回参数 isMonthdepr

删除

返回参数 (4)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

