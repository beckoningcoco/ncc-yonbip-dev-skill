---
title: "固定资产合并批量保存并审核"
apiId: "1964864318801969155"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Consolidation"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产合并批量保存并审核

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Consolidation (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/merge/batchSaveAndAudit

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
| sourceId | string | 否 | 是 | 来源单据id 示例：11 |
| accentity | string | 否 | 否 | 会计主体id,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：135246 |
| accentity_code | string | 否 | 否 | 会计主体编码,会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：kal |
| vouchdate | string | 否 | 是 | 单据日期 示例：2024-03-01 |
| remarks | string | 否 | 否 | 备注 示例：合并资产 |
| mergeDtlAssetDTOList | object | 是 | 是 | 被合并卡片 |
| assetId | string | 否 | 否 | 卡片id,卡片id和卡片编码不能同时为空，id和编码同时存在，以id为准 示例：123 |
| assetId_code | string | 否 | 否 | 卡片编码,卡片id和卡片编码不能同时为空，id和编码同时存在，以id为准 示例：www |
| mergeAdditionDTO | object | 否 | 是 | 合并后卡片信息 |
| name | object | 否 | 是 | 固定资产名称 示例：合并后资产 |
| assetCategoryId | string | 否 | 否 | 固定资产类别id 示例：123 |
| assetCategoryCode | string | 否 | 否 | 固定资产类别编码，固定资产类别id和固定资产类别编码不能同时为空，id和编码同时存在，以id为准 示例：lb |
| addWayId | string | 否 | 否 | 增加方式id，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准 示例：123 |
| addWayCode | string | 否 | 否 | 增加方式编码，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准 示例：09 |
| usageStateId | string | 否 | 否 | 使用状态id，使用状态id和使用状态编码不能同时为空，id和编码同时存在，以id为准 示例：123 |
| usageStateCode | string | 否 | 否 | 使用状态编码，使用状态id和使用状态编码不能同时为空，id和编码同时存在，以id为准 示例：009 |
| beginTime | string | 否 | 是 | 开始使用日期，格式yyyy-MM-dd 示例：2024-03-01 |
| tagno | string | 否 | 否 | 标签号 示例：333 |
| specification | object | 否 | 否 | 固定资产规格 |
| assetModel | object | 否 | 否 | 固定资产型号 |
| assetSubcategoryId | string | 否 | 否 | 固定资产子类别id，与固定资产子类别id和固定资产子类别编码同时存在，以id为准 示例：123 |
| assetSubcategoryId_code | string | 否 | 否 | 固定资产子类别编码，与固定资产子类别id和固定资产子类别编码同时存在，以id为准 示例：009 |
| userId | string | 否 | 否 | 使用人id，如果使用人id和使用人编码同时存在，以id为准 示例：123 |
| userCode | string | 否 | 否 | 使用人编码，如果使用人id和使用人编码同时存在，以id为准 示例：002 |
| mgmtDeptId | string | 否 | 否 | 管理部门id，如果管理部门编码和管理部门id同时存在，以id为准 示例：123 |
| mgmtDeptId_code | string | 否 | 否 | 管理部门编码，如果管理部门编码和管理部门id同时存在，以id为准 示例：002 |
| mgmtCostCenterId | string | 否 | 否 | 管理成本中心id，如果管理成本中心编码和管理成本中心id同时存在，以id为准 示例：123 |
| mgmtCostCenterId_code | string | 否 | 否 | 管理成本中心编码，如果管理成本中心编码和管理成本中心id同时存在，以id为准 示例：123 |
| profitCenterId | string | 否 | 否 | 管理利润中心id，如果管理利润中心编码与管理利润中心id同时存在，以id为准 示例：123 |
| profitCenterId_code | string | 否 | 否 | 管理利润中心编码，如果管理利润中心编码与管理利润中心id同时存在，以id为准 示例：aaa |
| custodian | string | 否 | 否 | 保管人id，如果保管人编码和保管人id同时存在，以id为准 示例：111 |
| custodianCode | string | 否 | 否 | 保管人编码，如果保管人编码和保管人id同时存在，以id为准 示例：008 |
| location | object | 否 | 否 | 存放地点 |
| placeId | string | 否 | 否 | 位置id，如果位置id与位置编码同时存在，以id为准 示例：123 |
| placeCode | string | 否 | 否 | 位置编码，如果位置id与位置编码同时存在，以id为准 示例：008 |
| vendorId | string | 否 | 否 | 供应商id，如果供应商id与供应商编码同时存在，以id为准 示例：123 |
| vendorCode | string | 否 | 否 | 供应商编码，如果供应商id与供应商编码同时存在，以id为准 示例：009 |
| impairmentunitId | string | 否 | 否 | 减值单元id，如果减值单元id和减值单元编码同时存在，以id为准 示例：123 |
| impairmentUnitCode | string | 否 | 否 | 减值单元编码，如果减值单元id和减值单元编码同时存在，以id为准 示例：007 |
| bodies | object | 是 | 否 | 核算信息 |
| assignments | object | 是 | 否 | 分配信息 |
| mergeDtlAccbookDTOList | object | 是 | 否 | 账簿信息 |
| accbook | string | 否 | 否 | 账簿id 示例：123 |
| blnBelongToBeforeCard | boolean | 否 | 否 | 折旧是否归属合并前卡片 |
| addWayId | string | 否 | 否 | 增加方式（增加方式id，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准） 示例：123 |
| reduceWayId | string | 否 | 否 | 减少方式（减少方式id，减少方式id和减少方式编码不能同时为空，id和编码同时存在，以id为准） 示例：123 |
| addWayId_code | string | 否 | 否 | 增加方式编码（增加方式编码，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准） |
| reduceWayId_code | string | 否 | 否 | 减少方式编码（减少方式编码，减少方式id和减少方式编码不能同时为空，id和编码同时存在，以id为准） |

## 3. 请求示例

Url: /yonbip/EFI/merge/batchSaveAndAudit?access_token=访问令牌
Body: [{
	"sourceId": "11",
	"accentity": "135246",
	"accentity_code": "kal",
	"vouchdate": "2024-03-01",
	"remarks": "合并资产",
	"mergeDtlAssetDTOList": [
		{
			"assetId": "123",
			"assetId_code": "www"
		}
	],
	"mergeAdditionDTO": {
		"name": {
			"0": "合",
			"1": "并",
			"2": "后",
			"3": "资",
			"4": "产",
			"zh_CN": "中文"
		},
		"assetCategoryId": "123",
		"assetCategoryCode": "lb",
		"addWayId": "123",
		"addWayCode": "09",
		"usageStateId": "123",
		"usageStateCode": "009",
		"beginTime": "2024-03-01",
		"tagno": "333",
		"specification": {
			"zh_CN": "中文"
		},
		"assetModel": {
			"zh_CN": "中文"
		},
		"assetSubcategoryId": "123",
		"assetSubcategoryId_code": "009",
		"userId": "123",
		"userCode": "002",
		"mgmtDeptId": "123",
		"mgmtDeptId_code": "002",
		"mgmtCostCenterId": "123",
		"mgmtCostCenterId_code": "123",
		"profitCenterId": "123",
		"profitCenterId_code": "aaa",
		"custodian": "111",
		"custodianCode": "008",
		"location": {
			"zh_CN": "英文"
		},
		"placeId": "123",
		"placeCode": "008",
		"vendorId": "123",
		"vendorCode": "009",
		"impairmentunitId": "123",
		"impairmentUnitCode": "007",
		"bodies": [
			{
				"accbook": "123",
				"accbook_code": "aab",
				"assetCategoryId": "123",
				"assetCategoryCode": "00a",
				"totalWorkload": 0,
				"existingWorkload": 0,
				"monthWorkload": 0,
				"assetBookCategoryId": "123",
				"assetBookCategoryCode": "002",
				"deprMethodId": "123",
				"subjects": [
					{
						"subjectId": "123"
					}
				]
			}
		],
		"assignments": [
			{
				"proportion": "1",
				"projectId": "123",
				"projectCode": "aaa",
				"productId": "123",
				"productCode": "aaa",
				"deptId": "123",
				"deptCode": "bbb",
				"costCenterId": "123",
				"costCenterCode": "bbb",
				"profitCenterId": "123",
				"profitCenterCode": "bbb"
			}
		]
	},
	"mergeDtlAccbookDTOList": [
		{
			"accbook": "123",
			"blnBelongToBeforeCard": true
		}
	],
	"addWayId": "123",
	"reduceWayId": "123",
	"addWayId_code": "",
	"reduceWayId_code": ""
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 否 | data |
| success | object | 是 | 成功信息 |
| failed | object | 是 | 失败信息 |
| traceId | string | 否 | 链路追踪id 示例：0000L6YQ8AVLFUZPXD0000 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"success": [
			{
				"id": "1965608395947900933",
				"code": "HB080219",
				"sourceId": "aabbcc"
			}
		],
		"failed": [
			{
				"sourceId": "aabbcc",
				"message": "失败"
			}
		]
	},
	"traceId": "0000L6YQ8AVLFUZPXD0000"
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

2	2025-12-11

更新

请求说明

新增

请求参数 oriBillId

3	2025-08-15

更新

请求参数 (4)

增加方式，减少方式，默认值修改


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

