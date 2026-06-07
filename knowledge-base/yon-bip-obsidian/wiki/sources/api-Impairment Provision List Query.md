---
title: "减值准备列表查询"
apiId: "1975243897560891401"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Impairment Provision"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Impairment Provision]
platform_version: "BIP"
source_type: community-api-docs
---

# 减值准备列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Impairment Provision (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/fixedassetimpairment/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 当前页码 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页查询数据大小，限制500 示例：10 默认值：10 |
| accentity | string | 否 | 否 | 会计主体id 示例：1231231 |
| accbook | string | 否 | 否 | 账簿id 示例：123213 |
| code | string | 否 | 否 | 减值单编码 示例：11 |
| impairmentType | string | 否 | 否 | 减值类型。 0：减值计提,1：减值转回 示例：0 |
| impairmentReasonId | string | 否 | 否 | 减值原因id 示例：12321312 |
| impairmentUnitId | string | 否 | 否 | 减值单元id 示例：123123 |
| assetId_code | string | 否 | 否 | 固定资产编码 示例：123213 |
| assetId_tagno | string | 否 | 否 | 标签号 示例：123 |
| creator | string | 否 | 否 | 创建人 示例：创建人 |
| verifyState | string | 否 | 否 | 审核状态。0:开立态,1:审核中,2:已审核,3:终止态,4:驳回到制单 示例：0 |
| auditor | string | 否 | 否 | 审核人 示例：审核人 |
| busiPostStatus | string | 否 | 否 | 过账状态。0:未过账,1:过账成功,2:过账失败,3:过账中,4:不过账 示例：0 |
| simple | object | 否 | 否 | 查询条件 |
| open_vouchdate_begin | string | 否 | 否 | 减值单开始日期(格式:yyyy-MM-dd) 示例：2024-04-04 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 减值单结束日期(格式:yyyy-MM-dd) 示例：2024-04-10 23:59:59 |
| open_auditTime_begin | string | 否 | 否 | 审核开始日期(格式:yyyy-MM-dd HH:mm:ss) 示例：2024-03-31 00:00:00 |
| open_auditTime_end | string | 否 | 否 | 审核结束日期(格式:yyyy-MM-dd HH:mm:ss) 示例：2024-03-31 23:59:59 |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:29 |
| accentity.code | string | 否 | 否 | 会计主体编码 示例：111 |
| bodies.calculateId.accbook.code | string | 否 | 否 | 账簿编码 示例：123 |

## 3. 请求示例

Url: /yonbip/EFI/fixedassetimpairment/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"accentity": "1231231",
	"accbook": "123213",
	"code": "11",
	"impairmentType": "0",
	"impairmentReasonId": "12321312",
	"impairmentUnitId": "123123",
	"assetId_code": "123213",
	"assetId_tagno": "123",
	"creator": "创建人",
	"verifyState": "0",
	"auditor": "审核人",
	"busiPostStatus": "0",
	"simple": {
		"open_vouchdate_begin": "2024-04-04 00:00:00",
		"open_vouchdate_end": "2024-04-10 23:59:59",
		"open_auditTime_begin": "2024-03-31 00:00:00",
		"open_auditTime_end": "2024-03-31 23:59:59",
		"open_pubts_begin": "2023-04-13 14:59:24",
		"open_pubts_end": "2023-04-13 14:59:29",
		"accentity.code": "111",
		"bodies.calculateId.accbook.code": "123"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回减值准备列表数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页查询数据大小,限制500 示例：200 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 查询结果集 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 200,
		"recordCount": 1,
		"recordList": [
			{
				"code": "11",
				"accentity_name": "会计主体",
				"accentity": "1232123",
				"isCgu": "0",
				"accbook_name": "账簿",
				"impairmentType": "0",
				"name": "减值名称",
				"impairmentReasonId": "12321",
				"impairmentReasonId_name": "减值原因",
				"impairmentUnitId": "213",
				"impairmentUnitId_name": "减值单元",
				"assetId": "123321",
				"assetId_code": "12312",
				"assetId_name": "固定资产名称",
				"accbookCurrtypeId": "1231",
				"accbookCurrtypeId_name": "人民币",
				"oriValue": 11,
				"scrapValue": 10,
				"deprAmount": 11,
				"accruedAmount": 11,
				"impairmentAmount": 11,
				"netAmount": 11,
				"orgCurrtypeId_name": "12321",
				"orgOriValueAmount": 11,
				"orgScrapValueAmount": 11,
				"orgAccumDeprAmount": 11,
				"orgAccruedAmount": 11,
				"orgAccumImpAmount": 11,
				"orgNetAmount": 11,
				"impairmentDate": "2024-03-31",
				"vouchdate": "2024-03-31",
				"verifyState": 0,
				"creator_name": "创建人",
				"auditor_name": "审核人",
				"busiPostStatus": "0",
				"busiPostFailureReason": "失败原因",
				"auditTime": "2024-01-11 00:00:00"
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

