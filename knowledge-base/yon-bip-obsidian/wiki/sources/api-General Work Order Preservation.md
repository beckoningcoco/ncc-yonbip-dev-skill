---
title: "通用工单保存"
apiId: "2039236822928719873"
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

# 通用工单保存

> `ContentType	application/json` 请求方式	POST | 分类: General Work Order (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ssc/generalWorkOrder/save

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
| id | string | 否 | 否 | 单据id 示例：2044402586260340745 |
| bizUnit | string | 否 | 是 | 业务单元(支持id和code) 示例：1525652227072458756 |
| code | string | 否 | 否 | 单据编号(设置手工编号时必输，自动编号时输入无效) 示例：TYGD240709000008 |
| transType | string | 否 | 是 | 交易类型(支持id和code) 示例：2352325289186048 |
| vouchdate | string | 否 | 是 | 单据日期(格式：yyyy-MM-dd) 示例：2024-07-10 |
| subject | string | 否 | 否 | 主题 示例：财务 |
| currency | string | 否 | 否 | 币种(支持id和code) 示例：1623643074168094746 |
| amount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 金额 示例：1000 |
| billMaker | string | 否 | 否 | 创建人（用户id或手机号） 示例：1580398259745062918 |
| workOrderStep | object | 是 | 否 | 表体 |

## 3. 请求示例

Url: /yonbip/ssc/generalWorkOrder/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "2044402586260340745",
		"bizUnit": "1525652227072458756",
		"code": "TYGD240709000008",
		"transType": "2352325289186048",
		"vouchdate": "2024-07-10",
		"subject": "财务",
		"currency": "1623643074168094746",
		"amount": 1000,
		"billMaker": "1580398259745062918",
		"workOrderStep": [
			{
				"id": "2044991812800610317",
				"stepNum": "1",
				"stepName": "步骤一",
				"stepDescribe": "",
				"stepDate": "2024-07-12 04:20:00",
				"stepStatus": "0",
				"remarks": ""
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
| bizUnit | string | 否 | 业务单元 示例：1525652227072458756 |
| code | string | 否 | 单据编号 示例：TYGD240709000008 |
| transType | string | 否 | 交易类型 示例：2352325289186048 |
| vouchdate | string | 否 | 单据日期 示例：2024-07-10 |
| isWfControlled | boolean | 否 | 是否被审批流控制，true：已被审批流控制，false：未被审批流控制 示例：false |
| verifystate | number |
| 小数位数:0,最大长度:6 | 否 | 审批状态，0：待提交，1：审批中，2：审批完成，3：不通过流程终止，4：驳回到制单 示例：1 |
| returncount | number |
| 小数位数:0,最大长度:6 | 否 | 退回次数 示例：0 |
| status | number |
| 小数位数:0,最大长度:6 | 否 | 单据状态，0：待提交，1：审批完成，2：已关闭，3：审批中，4：锁定 示例：0 |
| creator | string | 否 | 创建人 示例：张三 |
| creatorId | number |
| 小数位数:0,最大长度:20 | 否 | 创建人id 示例：1608755635182632967 |
| pubts | string | 否 | 时间戳 示例：2024-07-12 11:07:28 |
| subject | string | 否 | 主题 示例：财务 |
| currency | string | 否 | 币种 示例：1623643074168094746 |
| amount | number |
| 小数位数:2,最大长度:23 | 否 | 金额 示例：100 |
| createTime | string | 否 | 创建时间 示例：2024-07-12 11:07:28 |
| createDate | string | 否 | 创建日期 示例：2024-07-12 11:07:28 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 单据id 示例：2040570238281449480 |
| barCode | string | 否 | 条形码 示例：ssc_general_work_order|2040570238281449480 |
| workOrderStep | object | 是 | 子表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"bizUnit": "1525652227072458756",
		"code": "TYGD240709000008",
		"transType": "2352325289186048",
		"vouchdate": "2024-07-10",
		"isWfControlled": false,
		"verifystate": 1,
		"returncount": 0,
		"status": 0,
		"creator": "张三",
		"creatorId": 1608755635182632967,
		"pubts": "2024-07-12 11:07:28",
		"subject": "财务",
		"currency": "1623643074168094746",
		"amount": 100,
		"createTime": "2024-07-12 11:07:28",
		"createDate": "2024-07-12 11:07:28",
		"resubmitCheckKey": "21321323424",
		"id": "2040570238281449480",
		"barCode": "ssc_general_work_order|2040570238281449480",
		"workOrderStep": [
			{
				"stepNum": "",
				"stepName": "",
				"stepDescribe": "",
				"stepDate": "",
				"stepStatus": "",
				"remarks": "工单保存",
				"id": "2040570238281449481",
				"workOrder": "2040570238281449480",
				"pubts": "2024-07-12 11:07:28"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1023000500036	服务端逻辑异常	请联系系统管理员

1023010500005	生成单据失败

1023020400078	参数校验失败	参数不可以为空或不合法

1023010100025	单据编码不能为空	编码规则为手工编码时，单据编号必输

1023010100026	单据编号不允许更新


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

