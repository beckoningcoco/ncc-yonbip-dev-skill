---
title: "固定资产盘点详情查询"
apiId: "1700099127111057417"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Stocktaking"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Stocktaking]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产盘点详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Fixed Asset Stocktaking (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaInventory/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 单据id    示例: 1629396775637352454 |

## 3. 请求示例

Url: /yonbip/EFI/FaInventory/detail?access_token=访问令牌&id=1629396775637352454

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
| auditor_userName | string | 否 | 审核人(单据审核后才有值) 示例：昵称-梦梦 |
| auditTime | string | 否 | 审核时间(单据审核后才有值) 示例：2023-01-05 12:41:15 |
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
			"zh_CN": "阿斯顿发射点"
		},
		"planInventoryDate": "2022-09-30",
		"billDate": "2022-09-30",
		"verifyState": 2,
		"creator_userName": "昵称-梦梦",
		"createTime": "2023-01-05 10:44:20",
		"auditor_userName": "昵称-梦梦",
		"auditTime": "2023-01-05 12:41:15",
		"FaInventoryDetailList": [
			{
				"assetCategoryId_categoryFullName": "资产类别02",
				"assetName": {
					"zh_CN": "电脑"
				},
				"planInventoryUserId": "昵称-财务测试管理员",
				"inventoryUserId": "昵称-财务测试管理员",
				"inventoryResult": "2",
				"afUsageStateId_name": "使用",
				"beUsageStateId_name": "未使用",
				"afQuantity": 2,
				"beQuantity": 1,
				"beMgmtDeptId_name": "部门1",
				"afMgmtDeptId_name": "部门2",
				"beLocation": {
					"zh_CN": "2楼"
				},
				"afLocation": {
					"zh_CN": "2楼"
				},
				"beUserId_name": "咪咪",
				"afUserId_name": "哈哈",
				"beCustodianId_name": "米哈游",
				"afCustodianId_name": "王者荣耀",
				"assetId_code": "12312321"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据被删除或没有权限	查看请求数据是否正确


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-26

更新

返回参数 (37)


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

