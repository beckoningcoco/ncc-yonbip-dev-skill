---
title: "固定资产调出列表查询"
apiId: "1899108506971668483"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Transfer-Out"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Transfer-Out]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产调出列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Fixed Asset Transfer-Out (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/EFI/FaAllocateOut/list

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | string | 否 | 是 | 当前页码 示例：1 默认值：1 |
| pageSize | string | 否 | 是 | 每页查询数据大小，限制500 示例：10 默认值：10 |
| accentity | string | 否 | 否 | 调出会计主体id 示例：1550299274967253000 |
| in_accentity_id | string | 否 | 否 | 调入会计主体id 示例：1550299274967253000 |
| code | string | 否 | 否 | 调出编码 示例：ZCDC001 |
| allocate_request_code | string | 否 | 否 | 调拨申请编码 示例：DBSQ002514 |
| open_vouchdate_begin | string | 否 | 否 | 调出日期开始(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2024-01-01 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 调出日期结束(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2024-01-01 00:00:00 |
| open_auditTime_begin | string | 否 | 否 | 审核时间开始(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2024-01-01 00:00:00 |
| open_auditTime_end | string | 否 | 否 | 审核时间结束(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2024-01-01 00:00:00 |
| verifyState | string | 否 | 否 | 审核状态, 枚举值(0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单) 示例：0 |
| busiPostStatus | string | 否 | 否 | 过账状态, 枚举值(0:未过账, 1:过账成功,2:过账失败3:过账中) 示例：0 |
| creator | string | 否 | 否 | 创建人 示例：创建人 |
| auditor | string | 否 | 否 | 审核人 示例：审核人 |
| simple | object | 否 | 否 | simple |
| open_pubts_begin | string | 否 | 否 | pubts开始时间(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2020-09-09 12:00:00 |
| open_pubts_end | string | 否 | 否 | pubts结束时间(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2020-09-09 12:00:00 |
| isSum | boolean | 否 | 否 | 是否汇总(true: 汇总, false: 不汇总展示明细 示例：true 默认值：true |

## 3. 请求示例

Url: /yonbip/EFI/FaAllocateOut/list?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "10",
	"accentity": "1550299274967253000",
	"in_accentity_id": "1550299274967253000",
	"code": "ZCDC001",
	"allocate_request_code": "DBSQ002514",
	"open_vouchdate_begin": "2024-01-01 00:00:00",
	"open_vouchdate_end": "2024-01-01 00:00:00",
	"open_auditTime_begin": "2024-01-01 00:00:00",
	"open_auditTime_end": "2024-01-01 00:00:00",
	"verifyState": "0",
	"busiPostStatus": "0",
	"creator": "创建人",
	"auditor": "审核人",
	"simple": {
		"open_pubts_begin": "2020-09-09 12:00:00",
		"open_pubts_end": "2020-09-09 12:00:00"
	},
	"isSum": true
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回固定资产调出单信息 |
| pageIndex | long | 否 | 当前页码 示例：1 |
| pageSize | long | 否 | 每页查询数据大小,限制500 示例：20 |
| recordCount | long | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 查询结果集 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"creator": "测试管理员",
				"code": "ZCDC012540",
				"inAccentityId": "1525795008955285506",
				"accentity": "1529213966133755907",
				"vouchdate": "2021-03-05",
				"allocatePriceType": "1",
				"createTime": "2024-01-03 20:25:46",
				"id": "1899103979875336197",
				"remarks": {
					"zh_CN": ""
				}
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

