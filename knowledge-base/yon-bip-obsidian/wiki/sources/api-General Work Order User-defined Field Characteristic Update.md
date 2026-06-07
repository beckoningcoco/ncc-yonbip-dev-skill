---
title: "通用工单自定义项特征更新"
apiId: "2096515468857704448"
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

# 通用工单自定义项特征更新

> `ContentType	application/json` 请求方式	POST | 分类: General Work Order (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/generalWorkOrder/defineCharacterUpdate

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
| workOrderStep | object | 是 | 否 | 表体 |

## 3. 请求示例

Url: /yonbip/ssc/generalWorkOrder/defineCharacterUpdate?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "2044402586260340745",
		"workOrderStep": [
			{
				"id": "2044991812800610317"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| isWfControlled | boolean | 否 | 是否被审批流控制，true：已被审批流控制，false：未被审批流控制 示例：false |
| verifystate | number |
| 小数位数:0,最大长度:6 | 否 | 审批状态，0：待提交，1：审批中，2：审批完成，3：不通过流程终止，4：驳回到制单 示例：1 |
| returncount | number |
| 小数位数:0,最大长度:6 | 否 | 退回次数 示例：0 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 单据id 示例：2040570238281449480 |
| barCode | string | 否 | 条形码 示例：ssc_general_work_order|2040570238281449480 |
| workOrderStep | object | 是 | 子表 |
| modifier | string | 否 | 修改人 示例：用户张三 |
| modifierId | string | 否 | 修改人id 示例：1826971705015795713 |
| modifyTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 修改时间 示例：2024-09-25 19:07:48 |
| modifyDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 修改日期 示例：2024-09-25 19:07:48 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"isWfControlled": false,
		"verifystate": 1,
		"returncount": 0,
		"resubmitCheckKey": "21321323424",
		"id": "2040570238281449480",
		"barCode": "ssc_general_work_order|2040570238281449480",
		"workOrderStep": [
			{
				"id": "2040570238281449481",
				"workOrder": "2040570238281449480"
			}
		],
		"modifier": "用户张三",
		"modifierId": "1826971705015795713",
		"modifyTime": "2024-09-25 19:07:48",
		"modifyDate": "2024-09-25 19:07:48"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023000500036	服务端逻辑异常	请联系系统管理员

1023020400074	更新失败，单据不存在

1023010100026	单据编号不允许更新

1023020400096	单据更新失败


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

