---
title: "固定资产盘点列表查询"
apiId: "1700094437006770182"
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

# 固定资产盘点列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Stocktaking (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaInventory/list

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
| pageSize | int | 否 | 是 | 每页查询数据大小，限制500 示例：10 默认值：10 |
| pageIndex | int | 否 | 是 | 当前页码 示例：1 默认值：1 |
| verifyState | string | 否 | 否 | 审核状态 0开立态 1审核中 2已审核 3终止态 4驳回到制单 示例：1 |
| code | string | 否 | 否 | 盘点单编码 示例：123edsfd |
| accentity | string | 否 | 否 | 会计主体id 示例：1231231231 |
| FaInventoryDetailList_planInventoryUserId | string | 否 | 否 | 计划盘点人id 示例：1663667547978858501 |
| isSum | boolean | 否 | 否 | 表头-true,表头明细-false 示例：true 默认值：true |
| simple | object | 否 | 否 | 查询条件 |
| open_planInventoryDate_begin | string | 否 | 否 | 计划盘点日期开始日期(大于等于), 格式为:yyyy-MM-dd 示例：2023-04-13 |
| open_planInventoryDate_end | string | 否 | 否 | 计划盘点日期结束日期(小于等于), 格式为:yyyy-MM-dd 示例：2023-04-13 |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |

## 3. 请求示例

Url: /yonbip/EFI/FaInventory/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"verifyState": "1",
	"code": "123edsfd",
	"accentity": "1231231231",
	"FaInventoryDetailList_planInventoryUserId": "1663667547978858501",
	"isSum": true,
	"simple": {
		"open_planInventoryDate_begin": "2023-04-13",
		"open_planInventoryDate_end": "2023-04-13",
		"open_pubts_begin": "2023-04-13 14:59:24",
		"open_pubts_end": "2023-04-13 14:59:24"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产使用状态信息 |
| pageIndex | int | 否 | 当前页码 示例：1 |
| recordCount | int | 否 | 总记录数 示例：100 |
| pageSize | int | 否 | 每页查询数据大小，限制500 示例：1 |
| recordList | object | 是 | 查询结果集 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"recordCount": 100,
		"pageSize": 1,
		"recordList": [
			{
				"id": "1629396775637352454",
				"code": "PD001003",
				"accentity": "1572524545313079302",
				"accentity_name": "固定资产会计主体",
				"remarks": {
					"zh_CN": "热热我让"
				},
				"planInventoryDate": "2022-09-30",
				"billDate": "2022-09-30",
				"inventoryEndDate": "2022-09-30",
				"creator_userName": "昵称-梦梦",
				"createTime": "2023-01-05 10:44:20",
				"auditor_userName": "昵称-梦梦",
				"auditTime": "2023-01-05 12:41:15",
				"pubts": "2022-10-24 17:59:46",
				"verifyState": 2,
				"inventoryTotalCount": 5,
				"unInventoryCount": 3,
				"alreadyInventoryCount": 2,
				"matchCount": 1,
				"disagreeCount": 1,
				"inventoryLossCount": 1,
				"inventoryProfitCount": 1,
				"inventoryRate": 50,
				"inventoryLossRate": 50,
				"inventoryProfitRate": 50,
				"FaInventoryDetailList_id": "2074059086130839565",
				"FaInventoryDetailList_assetId": "1773484209561665542",
				"FaInventoryDetailList_assetId_name": "树形结构-新增",
				"FaInventoryDetailList_assetId_code": "6401230718163743",
				"FaInventoryDetailList_assetCategoryId": "1772804178800803849",
				"FaInventoryDetailList_assetCategoryId_name": "树形四级",
				"FaInventoryDetailList_planInventoryUserId": "1663667547978858501",
				"FaInventoryDetailList_planInventoryUserId_name": "昵称-盘点人",
				"FaInventoryDetailList_inventoryUserId": "1663667547978858501",
				"FaInventoryDetailList_inventoryUserId_name": "昵称-盘点人",
				"FaInventoryDetailList_supervisor": "1663667547978858501",
				"FaInventoryDetailList_supervisor_name": "昵称-监盘人",
				"FaInventoryDetailList_inventoryDate": "2022-03-01",
				"FaInventoryDetailList_inventoryResult": "3",
				"FaInventoryDetailList_beUsageStateId": "1741444973293731819",
				"FaInventoryDetailList_beUsageStateId_name": "在用",
				"FaInventoryDetailList_afUsageStateId": "1741444973293731819",
				"FaInventoryDetailList_afUsageStateId_name": "在用",
				"FaInventoryDetailList_beQuantity": 2,
				"FaInventoryDetailList_afQuantity": 3,
				"FaInventoryDetailList_beMgmtDeptId": "1781222973177715442",
				"FaInventoryDetailList_beMgmtDeptId_name": "固定资产部门1",
				"FaInventoryDetailList_afMgmtDeptId": "1741444973731819541",
				"FaInventoryDetailList_afMgmtDeptId_name": "固定资产部门2",
				"FaInventoryDetailList_beLocation": "盘盈存放地点",
				"FaInventoryDetailList_afLocation": "盘亏存放地点",
				"FaInventoryDetailList_bePlaceId": "184973293731819351",
				"FaInventoryDetailList_bePlaceId_name": "盘点位置1",
				"FaInventoryDetailList_afPlaceId": "1739583749210485731",
				"FaInventoryDetailList_afPlaceId_name": "盘点位置2",
				"FaInventoryDetailList_beUserId": "1772804178800803849",
				"FaInventoryDetailList_beUserId_name": "昵称-使用人1",
				"FaInventoryDetailList_afUserId": "1571082759049838592",
				"FaInventoryDetailList_afUserId_name": "昵称-使用人2",
				"FaInventoryDetailList_beCustodianId": "2074059086130839554",
				"FaInventoryDetailList_beCustodianId_name": "昵称-保管人1",
				"FaInventoryDetailList_afCustodianId": "1663667547978858501",
				"FaInventoryDetailList_afCustodianId_name": "昵称-保管人2",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_id": "2074059086130839566",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_usageDeptId": "1769111786818109440",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_usageDeptId_name": "研发部门1",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_projectId": "1535891386155401216",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_projectId_name": "生产项目",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_usageCostCenterId": "1741444973293731819",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_usageCostCenterId_name": "测试成本中心",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_wbs": "1772967688203141127",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_wbs_name": "项目订单",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_activity": "1525795008955285506",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_activity_name": "项目活动",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_productId": "1664420198039945216",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_productId_name": "一号物料",
				"FaInventoryDetailList_FaInventoryAfAsgmtList_asgmtRatio": 50
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

310036	非法token	token过期或者无效，使用有效的token


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-03-27

新增

请求参数 FaInventoryDetailList_planInventoryUserId

新增

请求参数 isSum

新增

返回参数 (64)

更新

返回参数 (20)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

