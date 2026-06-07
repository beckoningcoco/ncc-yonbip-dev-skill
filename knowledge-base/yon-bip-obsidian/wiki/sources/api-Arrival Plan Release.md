---
title: "到货计划发布"
apiId: "1819620155655192578"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 到货计划发布

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/arrivalPlan/publish

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
| data | object | 是 | 否 | 数据对象 |
| arrivalPlans_id | string | 否 | 否 | 到货计划Id 示例：1997515132662972422 |
| erpArrivalPlanId | string | 否 | 否 | ERP到货计划ID 示例：1997515132662972423 |
| orderRowNO | string | 否 | 否 | 订单行号 示例：10 |
| memo | string | 否 | 否 | 备注 示例：到货计划测试 |
| purUOM | string | 否 | 否 | 采购单位id 示例：1997515424714981381 |
| product | string | 否 | 否 | 物料id 示例：1997515424714981382 |
| recieveDate | string | 否 | 否 | 收货日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-15 00:00:00 |
| subQty | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 采购到货数量，最多是20位数，最大精度为8位 示例：12 |
| purOrderId | string | 否 | 否 | 采购订单主表id 示例：1997516275118505993 |
| isContract | boolean | 否 | 否 | 是否需要与供应商协同：true or false 示例：true |
| unit | string | 否 | 否 | 单位id 示例：1997516275118505994 |
| priceUOM | string | 否 | 否 | 计价单位id 示例：1997516627311591430 |
| productsku | string | 否 | 否 | 物料skuid 示例：1997516696025300996 |
| priceQty | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 计价到货数量，最多是20位数，最大精度为8位 示例：12 |
| invPriceExchRate | number |
| 小数位数:8,最大长度:19 | 否 | 否 | 计价换算率，最多是11位数，最大精度为8位 示例：1 |
| qty | number |
| 小数位数:8,最大长度:19 | 否 | 否 | 到货数量，最多是20位数，最大精度为8位 示例：12 |
| orderCode | string | 否 | 否 | 订单编号 示例：CG2024051500001 |
| id | string | 否 | 否 | 采购订单主表id 示例：1997516696025300997 |
| mainid | string | 否 | 否 | 采购订单子表id 示例：1997517675283611650 |
| pubts | string | 否 | 否 | 时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2024-05-15 00:00:00 |
| invExchRate | number |
| 小数位数:8,最大长度:19 | 否 | 否 | 采购单位换算率，最多是11位数，最大精度为8位 示例：1 |
| orderCollaborationStatus | string | 否 | 否 | 协同状态：1：待发布、10：买方已审批、11：已签收、12：已废弃、13：订单已关闭、14：部分签收、15：买方已接受、16：买方已拒绝变更、17：买方已作废、18：买方已拒绝、19：待买方确认、2：待买方确认、20：打开待卖方确认、21：关闭待卖方确认、22：卖方拒绝关闭、23：买方已关闭、3：买方变更中、4：待卖方确认、5：卖方变更中、6：卖方已变更、7：卖方已接受、8：卖方已拒绝、9：买方审批中 示例：1 |
| purQty | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 订单主数量，最多是20位数，最大精度为8位 示例：12 |
| purSubQty | number |
| 小数位数:8,最大长度:28 | 否 | 否 | 订单采购数量，最多是20位数，最大精度为8位 示例：12 |
| status | int | 否 | 否 | 到货计划状态：1：开立态、2：执行态、3：结束态 示例：2 |

## 3. 请求示例

Url: /yonbip/scm/arrivalPlan/publish?access_token=访问令牌
Body: {
	"data": [
		{
			"arrivalPlans_id": "1997515132662972422",
			"erpArrivalPlanId": "1997515132662972423",
			"orderRowNO": "10",
			"memo": "到货计划测试",
			"purUOM": "1997515424714981381",
			"product": "1997515424714981382",
			"recieveDate": "2024-05-15 00:00:00",
			"subQty": 12,
			"purOrderId": "1997516275118505993",
			"isContract": true,
			"unit": "1997516275118505994",
			"priceUOM": "1997516627311591430",
			"productsku": "1997516696025300996",
			"priceQty": 12,
			"invPriceExchRate": 1,
			"qty": 12,
			"orderCode": "CG2024051500001",
			"id": "1997516696025300997",
			"mainid": "1997517675283611650",
			"pubts": "2024-05-15 00:00:00",
			"invExchRate": 1,
			"orderCollaborationStatus": "1",
			"purQty": 12,
			"purSubQty": 12,
			"status": 2
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-01-23

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

