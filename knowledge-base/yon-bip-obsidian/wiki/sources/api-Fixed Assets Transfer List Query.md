---
title: "固定资产转移列表查询"
apiId: "1741757939062407168"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Transfer"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Transfer]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产转移列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Transfer (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/TransferBill/list

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
| pageSize | long | 否 | 是 | 每页查询数据大小，限制500 示例：10 默认值：10 |
| pageIndex | long | 否 | 是 | 当前页码 示例：1 默认值：1 |
| verifyState | string | 否 | 否 | 审核状态 0开立态 1审核中 2已审核 3终止态 4驳回到制单 示例：1 |
| code | string | 否 | 否 | 转移编码 示例：ZY001027 |
| assetId_code | string | 否 | 否 | 固定资产编码 示例：1232131 |
| accentity | string | 否 | 否 | 会计主体ID 示例：432423111111 |
| creator | string | 否 | 否 | 创建人ID 示例：12321321 |
| auditor | string | 否 | 否 | 审核人ID 示例：11234354351 |
| busiPostStatus | string | 否 | 否 | 过账状态 0未过账 1过账成功 2过账失败 3过帐中 示例：1 |
| simple | object | 否 | 否 | 查询条件 |
| open_auditTime_begin | string | 否 | 否 | 审核日期开始日期(大于等于), 格式为yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_auditTime_end | string | 否 | 否 | 审核日期结束日期(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_vouchdate_begin | string | 否 | 否 | 转移日期开始日期(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_vouchdate_end | string | 否 | 否 | 转移日期结束日期(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_begin | string | 否 | 否 | pubts开始时间(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2020-09-09 12:00:00 |
| open_pubts_end | string | 否 | 否 | pubts结束时间(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2020-09-09 12:00:00 |

## 3. 请求示例

Url: /yonbip/EFI/TransferBill/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"verifyState": "1",
	"code": "ZY001027",
	"assetId_code": "1232131",
	"accentity": "432423111111",
	"creator": "12321321",
	"auditor": "11234354351",
	"busiPostStatus": "1",
	"simple": {
		"open_auditTime_begin": "2023-04-13 14:59:24",
		"open_auditTime_end": "2023-04-13 14:59:24",
		"open_vouchdate_begin": "2023-04-13 14:59:24",
		"open_vouchdate_end": "2023-04-13 14:59:24",
		"open_pubts_begin": "2020-09-09 12:00:00",
		"open_pubts_end": "2020-09-09 12:00:00"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | long | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| errorDetail | string | 否 | 错误信息 |
| total | long | 否 | 总条数 示例：1 |
| data | object | 否 | 返回固定资产转移信息 |
| pageIndex | long | 否 | 当前页码 示例：1 |
| pageSize | long | 否 | 每页查询数据大小，限制500 示例：10 |
| recordCount | long | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 查询结果集 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"errorDetail": "",
	"total": 1,
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"code": "ZY024526",
				"auditor_name": "测试管理员",
				"busiPostFailureReason": "",
				"auditor": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"accentity_name": "GWL001",
				"accentity": "1732666910555766785",
				"verifyState": 2,
				"vouchdate": "2023-05-30",
				"busiPostStatus": "1",
				"createTime": "2023-05-30 16:30:35",
				"creator_name": "测试管理员",
				"id": "1737189579741462533",
				"pubts": "2023-06-03 13:36:28",
				"remarks": {
					"zh_CN": "test"
				},
				"auditDate": "2023-06-03 13:36:00"
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

暂时没有数据哦~


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

