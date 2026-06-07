---
title: "减值准备详情查询"
apiId: "1975350893786169348"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Impairment Provision"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Impairment Provision]
platform_version: "BIP"
source_type: community-api-docs
---

# 减值准备详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Fixed Asset Impairment Provision (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/fixedassetimpairment/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 单据id    示例: 12321 |

## 3. 请求示例

Url: /yonbip/EFI/fixedassetimpairment/detail?access_token=访问令牌&id=12321

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 减值准备详情 |
| id | string | 否 | 减值准备主表id 示例：12312 |
| accentity | string | 否 | 会计主体id 示例：12312 |
| accentity_code | string | 否 | 会计主体code 示例：213 |
| accentity_name | string | 否 | 会计主体名称 示例：会计主体 |
| code | string | 否 | 减值准备单据编码 示例：11 |
| vouchdate | string | 否 | 减值单日期 示例：2021-01-01 |
| verifyState | string | 否 | 过账状态 示例：2 |
| busiPostFailureReason | string | 否 | 失败原因 示例：失败原因 |
| creator | string | 否 | 创建人id 示例：7533e49f-92ea-48d7-a45d-e983d45f4366 |
| creator_name | string | 否 | 创建人 示例：创建人 |
| createTime | string | 否 | 创建时间 示例：2022-07-07 18:30:11 |
| auditor | string | 否 | 审核人id 示例：7533e49f-92ea-48d7-a45d-e983d45f4366 |
| auditor_name | string | 否 | 审核人 示例：审核人 |
| auditTime | string | 否 | 审核时间 示例：审核时间 |
| bodies | object | 否 | 明细 |
| assignments | object | 否 | 分配信息详情 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "12312",
		"accentity": "12312",
		"accentity_code": "213",
		"accentity_name": "会计主体",
		"code": "11",
		"vouchdate": "2021-01-01",
		"verifyState": "2",
		"busiPostFailureReason": "失败原因",
		"creator": "7533e49f-92ea-48d7-a45d-e983d45f4366",
		"creator_name": "创建人",
		"createTime": "2022-07-07 18:30:11",
		"auditor": "7533e49f-92ea-48d7-a45d-e983d45f4366",
		"auditor_name": "审核人",
		"auditTime": "审核时间",
		"bodies": {
			"impairmentBillId": "2342",
			"assetId_code": "324",
			"assetId_name": "名称",
			"accbook_name": "账簿名称",
			"name": {
				"zh_CN": "减值名称-中文"
			},
			"impairmentType": "0",
			"impairmentDate": "2024-03-31",
			"impairmentUnitId_name": "单元",
			"impairmentReasonId_name": "原因",
			"accbookCurrtypeId_name": "人民币",
			"accruedAmount": 11,
			"oriImpairmentAmount": 11,
			"oriValue": 11,
			"scrapValue": 11,
			"deprAmount": 11,
			"impairmentAmount": 11,
			"netValue": 11,
			"netAmount": 11,
			"orgCurrtypeId_name": "人民币",
			"orgAccruedAmount": 11,
			"orgOriImpairmentAmount": 11,
			"orgOriValueAmount": 11,
			"orgScrapValueAmount": 11,
			"orgAccumDeprAmount": 11,
			"orgAccumImpAmount": 11,
			"orgNetValue": 11,
			"orgNetAmount": 11
		},
		"assignments": {
			"detailId_asset_code": "11",
			"detailId_impairmentUnitId_name": "减值单元",
			"orgAssignAmount": 11,
			"assignAmount": 11,
			"proportion": 1,
			"deptName": "使用部门名称",
			"deptCode": "使用部门编码",
			"costCenterName": "使用成本中心名称",
			"costCenterCode": "使用成本中心编码",
			"profitCenterName": "使用利润中心名称",
			"profitCenterCode": "使用利润中心编码",
			"projectName": "项目名称",
			"projectCode": "项目编码",
			"productName": "产品名称",
			"productCode": "产品编码"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据被删除或没有权限	查看请求单据是否存在或请求用户是否有权限


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

