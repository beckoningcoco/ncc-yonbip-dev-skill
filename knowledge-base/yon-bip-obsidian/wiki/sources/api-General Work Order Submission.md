---
title: "通用工单提交"
apiId: "2095743027566870535"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "General Work Order"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Work Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 通用工单提交

> `ContentType	application/json` 请求方式	POST | 分类: General Work Order (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/generalWorkOrder/submit

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
| data | object | 否 | 是 | 单据数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 是 | 单据id 示例：2044402586260340745 |

## 3. 请求示例

Url: /yonbip/ssc/generalWorkOrder/submit?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "2044402586260340745"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 单据id 示例：2095736945957142530 |
| pubts | string | 否 | pubts 示例：2024-09-24 19:04:55 |
| bizUnit | string | 否 | 业务单元 示例：1455861190276153345 |
| code | string | 否 | 单据编号 示例：TYGD2409240001 |
| barCode | string | 否 | 单据条码 示例：ssc_general_work_order_card|2095736945957142530 |
| vouchdate | string | 否 | 单据日期 示例：2024-09-24 00:00:00 |
| transType | string | 否 | 交易类型 示例：1455840084805289958 |
| billType | string | 否 | 单据类型 示例：2333826110575360 |
| creator | string | 否 | 创建人 示例：用户-张宝文 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：true |
| verifystate | number |
| 小数位数:0,最大长度:10 | 否 | 审批状态(0:初始开立;1:审批中;2:审批完成;3:不通过流程终止;4:驳回到制单) 示例：1 |
| returncount | number |
| 小数位数:0,最大长度:10 | 否 | 驳回次数 示例：0 |
| status | number |
| 小数位数:0,最大长度:10 | 否 | 审批状态(0:待提交;1:审批完成;3:审批中) 示例：3 |
| createTime | string | 否 | 创建时间 示例：2024-09-24 19:04:51 |
| creatorId | number |
| 小数位数:0,最大长度:16 | 否 | 创建人id 示例：2776838815537408 |
| workOrderStep | object | 是 | 工单步骤 |
| tenant | number |
| 小数位数:0,最大长度:16 | 否 | 租户id 示例：2776792889413712 |
| ytenant | string | 否 | 租户id 示例：0000L38C6FT6CVAARV0000 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2095736945957142530",
		"pubts": "2024-09-24 19:04:55",
		"bizUnit": "1455861190276153345",
		"code": "TYGD2409240001",
		"barCode": "ssc_general_work_order_card|2095736945957142530",
		"vouchdate": "2024-09-24 00:00:00",
		"transType": "1455840084805289958",
		"billType": "2333826110575360",
		"creator": "用户-张宝文",
		"isWfControlled": true,
		"verifystate": 1,
		"returncount": 0,
		"status": 3,
		"createTime": "2024-09-24 19:04:51",
		"creatorId": 2776838815537408,
		"workOrderStep": [
			{
				"workOrder": "2095736945957142530",
				"stepName": "开始步骤1",
				"stepDate": "2024-09-25 00:00:00"
			}
		],
		"tenant": 2776792889413712,
		"ytenant": "0000L38C6FT6CVAARV0000"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023000500036	服务端逻辑异常	请联系系统管理员

1023020400088	非待提交状态，无法正常提交单据


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

