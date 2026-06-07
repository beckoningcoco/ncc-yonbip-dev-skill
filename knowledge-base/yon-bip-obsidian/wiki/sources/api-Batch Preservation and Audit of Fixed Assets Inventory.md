---
title: "固定资产盘点批量保存并审核"
apiId: "1975370049340309510"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Stocktaking"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Stocktaking]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产盘点批量保存并审核

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Stocktaking (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaInventory/batchSaveAndAudit

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
| accentity | string | 否 | 否 | 会计主体id，会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1563514751881838598 |
| accentityCode | string | 否 | 否 | 会计主体编码，会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：231 |
| sourceId | string | 否 | 是 | 来源单据号 示例：123 |
| code | string | 否 | 否 | 单据编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值；更新数据时需要传值) 示例：efapp122 |
| billDate | string | 否 | 是 | 盘点报告日期 格式 "yyyy-mm-dd" 示例：2023-04-11 |
| planInventoryDate | string | 否 | 是 | 计划盘点日期 格式 "yyyy-mm-dd" 示例：2023-04-11 |
| remarks | string | 否 | 否 | 备注 示例：顺丰是到付 |
| faInventoryDetailDTOList | object | 是 | 否 | 固定资产盘点明细信息 |
| assetId | string | 否 | 否 | 固定资产id 示例：123213213 |
| assetId_code | string | 否 | 否 | 固定资产code，以code为准 示例：gd01 |
| assetName | string | 否 | 否 | 固定资产名称，当assetId和assetId_code全为空是，该字段必填 示例：名称 |
| assetCategoryId | string | 否 | 否 | 固定资产类别id 示例：12312 |
| assetCategoryId_code | string | 否 | 否 | 固定资产类别编码，以code为准 示例：2131 |
| planInventoryUserId | string | 否 | 否 | 计划盘点人id 示例：张三 |
| planInventoryUserCode | string | 否 | 否 | 计划盘点人编码，以code为准，与id同时存在时已id为准 示例：2131 |
| inventoryUserId | string | 否 | 否 | 盘点人id 示例：张三 |
| inventoryUserCode | string | 否 | 否 | 盘点人编码，以code为准 示例：1231 |
| supervisor | string | 否 | 否 | 监盘人id 示例：123 |
| supervisorCode | string | 否 | 否 | 监盘人编码，以code为准 示例：123 |
| inventoryDate | string | 否 | 是 | 盘点日期 格式 "yyyy-mm-dd" 示例：2023-04-11 |
| fileCount | string | 否 | 否 | 附件id 示例：1232313 |
| afQuantity | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 盘点后数量 示例：1 |
| afUsageStateId | string | 否 | 否 | 盘点后使用状态id,盘点后使用状态id和盘点后使用状态编码不能同时为空，id和编码同时存在，以id为准 示例：923432 |
| afUsageStateCode | string | 否 | 否 | 盘点后使用状态编码,盘点后使用状态id和盘点后使用状态编码不能同时为空，id和编码同时存在，以code为准 示例：zt8 |
| afMgmtDeptId | string | 否 | 否 | 盘点后管理部门id 示例：2343242111 |
| afMgmtDeptCode | string | 否 | 否 | 盘点后管理部门编码，以code为准 示例：cod12 |
| afLocation | string | 否 | 否 | 盘点后存放地点 示例：二楼 |
| afPlaceId | string | 否 | 否 | 盘点后位置id 示例：11233213 |
| afPlaceCode | string | 否 | 否 | 盘点后位置编码，以code为准 示例：339 |
| afUserId | string | 否 | 否 | 盘点后使用人id 示例：114609988 |
| afUserCode | string | 否 | 否 | 盘点后使用人编码，以code为准 示例：user01 |
| afCustodianId | string | 否 | 否 | 盘点后保管人id 示例：114609988 |
| afCustodianCode | string | 否 | 否 | 盘点后保管人编码，以code为准 示例：i9 |
| faInventoryAfAsgmtDTOList | object | 是 | 否 | 盘点后分配信息 |

## 3. 请求示例

Url: /yonbip/EFI/FaInventory/batchSaveAndAudit?access_token=访问令牌
Body: [{
	"accentity": "1563514751881838598",
	"accentityCode": "231",
	"sourceId": "123",
	"code": "efapp122",
	"billDate": "2023-04-11",
	"planInventoryDate": "2023-04-11",
	"remarks": "顺丰是到付",
	"faInventoryDetailDTOList": [
		{
			"assetId": "123213213",
			"assetId_code": "gd01",
			"assetName": "名称",
			"assetCategoryId": "12312",
			"assetCategoryId_code": "2131",
			"planInventoryUserId": "张三",
			"planInventoryUserCode": "2131",
			"inventoryUserId": "张三",
			"inventoryUserCode": "1231",
			"supervisor": "123",
			"supervisorCode": "123",
			"inventoryDate": "2023-04-11",
			"fileCount": "1232313",
			"afQuantity": 1,
			"afUsageStateId": "923432",
			"afUsageStateCode": "zt8",
			"afMgmtDeptId": "2343242111",
			"afMgmtDeptCode": "cod12",
			"afLocation": "二楼",
			"afPlaceId": "11233213",
			"afPlaceCode": "339",
			"afUserId": "114609988",
			"afUserCode": "user01",
			"afCustodianId": "114609988",
			"afCustodianCode": "i9",
			"faInventoryAfAsgmtDTOList": [
				{
					"accentity": "123",
					"accentityCode": "12313",
					"assetId": "123",
					"assetId_code": "2131",
					"projectId": "123",
					"projectCode": "2131",
					"productId": "123",
					"productCode": "123",
					"usageDeptId": "123",
					"usageDeptCode": "3131",
					"usageCostCenterId": "123",
					"usageCostCenterCode": "1231",
					"usageProfitCenterId": "123",
					"usageProfitCenterCode": "12313",
					"asgmtRatio": "100"
				}
			]
		}
	]
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产使用状态信息 |
| success | object | 是 | 生成成功的数据 |
| failed | object | 是 | 生成失败的数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"success": [
			{
				"id": "1231231",
				"code": "PD12312",
				"sourceId": "12312"
			}
		],
		"failed": [
			{
				"sourceId": "1234567808",
				"message": "失败信息"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	会计主体不允许为空	请求参数中输入会计主体id


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-21

删除

请求参数 oriBillId

去除入参oriBillId【业务幂等id】

2	2025-12-10

新增

请求参数 oriBillId

添加入参oriBillId【业务幂等id】


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

