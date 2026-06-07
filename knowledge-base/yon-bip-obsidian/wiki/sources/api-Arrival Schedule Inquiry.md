---
title: "到货计划查询"
apiId: "1619812788050329603"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Purchase Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 到货计划查询

> `ContentType	application/json` 请求方式	GET | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purchaseorder/getArrivalPlan

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| orderNo | string | query | 否 | 采购订单编号    示例: CGDD000892 |

## 3. 请求示例

Url: /yonbip/scm/purchaseorder/getArrivalPlan?access_token=访问令牌&orderNo=CGDD000892

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 是 | 单据信息 |
| purUOM | long | 否 | 采购单位id 示例：1539690173043834881 |
| product | long | 否 | 物料id 示例：1555292904473755654 |
| productskun | long | 否 | 物料skuid 示例：1555292913063690241 |
| ytenant | string | 否 | 租户ytenant_id 示例：0000L6YQ8AVLFUZPXD0000 |
| recieveDate | string | 否 | 收货日期，格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-12 00:00:00 |
| subQty | number |
| 小数位数:8,最大长度:28 | 否 | 采购到货数量 示例：1 |
| purOrderId | long | 否 | 采购订单主表id 示例：1576197326358183939 |
| isContract | boolean | 否 | 是否需要与供应商协同：true or false 示例：false |
| unit | long | 否 | 单位id 示例：1539690173043834881 |
| priceUOM | long | 否 | 计价单位id 示例：1539690173043834881 |
| productsku | long | 否 | 物料skuid 示例：1555292913063690241 |
| productn | long | 否 | 物料id 示例：1555292904473755654 |
| priceQty | number |
| 小数位数:8,最大长度:28 | 否 | 计价到货数量 示例：0 |
| invPriceExchRate | number |
| 小数位数:8,最大长度:19 | 否 | 计价换算率 示例：1 |
| qty | number |
| 小数位数:8,最大长度:28 | 否 | 到货数量 示例：1 |
| orderCode | string | 否 | 订单编号 示例：2022-10000147 |
| id | long | 否 | 子表id 示例：1612462750285955073 |
| mainid | long | 否 | 主表id 示例：1576197326358183940 |
| pubts | string | 否 | 时间戳，格式为:yyyy-MM-dd HH:mm:ss 示例：2022-12-13 15:09:30 |
| invExchRate | number |
| 小数位数:8,最大长度:19 | 否 | 采购单位换算率 示例：1 |
| tenant | long | 否 | 租户id 示例：2909930715861584 |
| status | long | 否 | 到货计划状态：1：开立态、2：执行态、3：结束态 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"purUOM": 1539690173043834881,
			"product": 1555292904473755654,
			"productskun": 1555292913063690241,
			"ytenant": "0000L6YQ8AVLFUZPXD0000",
			"recieveDate": "2022-12-12 00:00:00",
			"subQty": 1,
			"purOrderId": 1576197326358183939,
			"isContract": false,
			"unit": 1539690173043834881,
			"priceUOM": 1539690173043834881,
			"productsku": 1555292913063690241,
			"productn": 1555292904473755654,
			"priceQty": 0,
			"invPriceExchRate": 1,
			"qty": 1,
			"orderCode": "2022-10000147",
			"id": 1612462750285955073,
			"mainid": 1576197326358183940,
			"pubts": "2022-12-13 15:09:30",
			"invExchRate": 1,
			"tenant": 2909930715861584,
			"status": 1
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


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

