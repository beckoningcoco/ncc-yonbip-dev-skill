---
title: "固定资产盘点保存"
apiId: "1700777843608256518"
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

# 固定资产盘点保存

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Stocktaking (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaInventory/save

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
| data | object | 否 | 是 | 固定资产盘点数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| accentity | string | 否 | 否 | 会计主体id，会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：1563514751881838598 |
| accentityCode | string | 否 | 否 | 会计主体编码，会计主体id和会计主体编码不能同时为空，id和编码同时存在，以id为准 示例：231 |
| code | string | 否 | 否 | 单据编号 (设置自动编码时按编码规则取值，接口不用传值；手工编码时需要传值；更新数据时需要传值) 示例：efapp122 |
| assetCategoryIdCombine | string | 否 | 否 | 固定资产类别id 示例：1594672583550173186 |
| assetCategoryCombineCode | string | 否 | 否 | 固定资产类别code 示例：777 |
| usageStateIdCombine | string | 否 | 否 | 使用状态id 示例：1550289997826359313 |
| usageStateIdCombineCode | string | 否 | 否 | 使用状态code 示例：14423213 |
| mgmtDeptIdCombine | string | 否 | 否 | 管理部门id 示例：1563515198566301705 |
| mgmtDeptCombineCode | string | 否 | 否 | 管理部门code 示例：453 |
| usageDeptIdCombine | string | 否 | 否 | 使用部门id 示例：1563515198566301705 |
| usageDeptCombineCode | string | 否 | 否 | 使用部门code 示例：456 |
| billDate | string | 否 | 是 | 盘点报告日期 格式 "yyyy-mm-dd" 示例：2023-04-11 |
| planInventoryDate | string | 否 | 是 | 计划盘点日期 格式 "yyyy-mm-dd" 示例：2023-04-11 |
| remarks | string | 否 | 否 | 备注 示例：顺丰是到付 |
| _status | string | 否 | 是 | 操作标识 (Insert:新增, 本接口只支持单据保存，不支持编辑更新。如果数据错误请调用删除接口删除数据后重新保存) 示例：Insert 默认值：Insert |
| FaInventoryDetailList | object | 是 | 是 | 固定资产盘点明细信息 |

## 3. 请求示例

Url: /yonbip/EFI/FaInventory/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"accentity": "1563514751881838598",
		"accentityCode": "231",
		"code": "efapp122",
		"assetCategoryIdCombine": "1594672583550173186",
		"assetCategoryCombineCode": "777",
		"usageStateIdCombine": "1550289997826359313",
		"usageStateIdCombineCode": "14423213",
		"mgmtDeptIdCombine": "1563515198566301705",
		"mgmtDeptCombineCode": "453",
		"usageDeptIdCombine": "1563515198566301705",
		"usageDeptCombineCode": "456",
		"billDate": "2023-04-11",
		"planInventoryDate": "2023-04-11",
		"remarks": "顺丰是到付",
		"_status": "Insert",
		"FaInventoryDetailList": [
			{
				"assetId": "123213213",
				"assetId_code": "gd01",
				"assetName": "电脑",
				"planInventoryUserId": "张三",
				"inventoryUserId": "张三",
				"inventoryDate": "2023-04-11",
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
				"assetCategoryId": "1594672583550173186",
				"assetCategoryCode": "m09",
				"_status": "Insert"
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
| data | object | 否 | 返回固定资产使用状态信息 |
| id | string | 否 | 单据id 示例：1629396775637352454 |
| code | string | 否 | 盘点单编码 示例：PD001003 |
| accentity | string | 否 | 会计主体id 示例：1572524545313079302 |
| remarks | object | 否 | 备注 |
| planInventoryDate | string | 否 | 计划盘点日期 示例：2022-09-30 |
| billDate | string | 否 | 盘点报告日期 示例：2022-09-30 |
| verifyState | int | 否 | 审核状态 0开立态 1审核中 2已审核 3终止态 4驳回到制单 示例：2 |
| creator_userName | string | 否 | 创建人 示例：昵称-梦梦 |
| createTime | string | 否 | 创建时间 示例：2023-01-05 10:44:20 |
| FaInventoryDetailList | object | 是 | 固定资产盘点明细 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1629396775637352454",
		"code": "PD001003",
		"accentity": "1572524545313079302",
		"remarks": {
			"zh_CN": "哈喽1"
		},
		"planInventoryDate": "2022-09-30",
		"billDate": "2022-09-30",
		"verifyState": 2,
		"creator_userName": "昵称-梦梦",
		"createTime": "2023-01-05 10:44:20",
		"FaInventoryDetailList": [
			{
				"assetName": {
					"zh_CN": "折旧1"
				},
				"planInventoryUserId": "昵称-财务测试管理员",
				"inventoryUserId": "昵称-财务测试管理员",
				"inventoryResult": "2",
				"afQuantity": 2,
				"afLocation": {
					"zh_CN": "2楼"
				}
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

3	2025-06-26

更新

返回参数 (22)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

