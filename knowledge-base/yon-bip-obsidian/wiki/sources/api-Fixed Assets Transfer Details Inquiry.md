---
title: "固定资产转移详情查询"
apiId: "1741774148268982279"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Fixed Asset Transfer"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Transfer]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产转移详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Fixed Asset Transfer (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/TransferBill/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 单据id    示例: 1467807598848770048 |

## 3. 请求示例

Url: /yonbip/EFI/TransferBill/detail?access_token=访问令牌&id=1467807598848770048

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| errorDetail | string | 否 | 错误信息 |
| data | object | 否 | 固定资产转移单据信息 |
| creator | string | 否 | 创建人ID 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| code | string | 否 | 转移单编码 示例：ZY024526 |
| auditor_name | string | 否 | 审核人名称 示例：测试管理员 |
| busiPostFailureReason | string | 否 | 过账失败原因 |
| auditor | string | 否 | 审核人ID 示例：99ea7655-00a2-4bda-b23c-19ade37ea574 |
| accentity_name | string | 否 | 会计主体名称 示例：GWL001 |
| accentity | string | 否 | 会计主体ID 示例：1732666910555766785 |
| accentity_code | string | 否 | 会计主体编码 示例：FE_GWL001 |
| verifyState | long | 否 | 审核状态 0开立态 1审核中 2已审核 3终止态 4驳回到制单 示例：2 |
| vouchdate | string | 否 | 单据日期 示例：2023-05-30 |
| busiPostStatus | string | 否 | 过账状态 示例：1 |
| createTime | string | 否 | 创建时间 示例：2023-05-30 16:30:35 |
| auditTime | string | 否 | 审核时间 示例：2023-06-03 13:36:00 |
| creator_name | string | 否 | 创建人名称 示例：测试管理员 |
| details | object | 是 | 转移单明细信息 |
| id | string | 否 | 转移单ID 示例：1737189579741462533 |
| pubts | string | 否 | 时间戳 示例：2023-06-03 13:36:28 |
| remarks | object | 否 | 转移原因 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"errorDetail": "",
	"data": {
		"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"code": "ZY024526",
		"auditor_name": "测试管理员",
		"busiPostFailureReason": "",
		"auditor": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"accentity_name": "GWL001",
		"accentity": "1732666910555766785",
		"accentity_code": "FE_GWL001",
		"verifyState": 2,
		"vouchdate": "2023-05-30",
		"busiPostStatus": "1",
		"createTime": "2023-05-30 16:30:35",
		"auditTime": "2023-06-03 13:36:00",
		"creator_name": "测试管理员",
		"details": [
			{
				"assetId_name": "gwlzy001",
				"assetId": "1737165519334670336",
				"assetId_code": "0041230530153616",
				"id": "1737189579741462535",
				"transferbillId": "1737189579741462533",
				"pubts": "2023-05-30 16:31:24",
				"rows": [
					{
						"deltaProportion": -10,
						"afProportion": 50,
						"deptName": "人力",
						"deptId": "1732670758838075393",
						"assignmentId": "1737165519334670340",
						"beProportion": 60,
						"assetId": "1737165519334670336",
						"id": "1737189579741462536",
						"transferbillDtlId": "1737189579741462535",
						"pubts": "2023-05-30 16:31:24",
						"deptCode": "FE-1001",
						"remarks": {
							"zh_CN": ""
						}
					}
				],
				"remarks": {
					"zh_CN": "test"
				}
			}
		],
		"id": "1737189579741462533",
		"pubts": "2023-06-03 13:36:28",
		"remarks": {
			"zh_CN": "test"
		}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	单据详情查询失败，未获取到单据id	查看请求单据是否存在或请求用户是否有权限


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

