---
title: "消费税委托加工领用明细-新增"
apiId: "1900590322221056008"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Consumption Tax"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Consumption Tax]
platform_version: "BIP"
source_type: community-api-docs
---

# 消费税委托加工领用明细-新增

> `ContentType	application/json` 请求方式	POST | 分类: Consumption Tax (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxoth/api/consignment/receive-detail/batch-add

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
| records | object | 是 | 是 | 新增领用明细记录 |
| sourceId | string | 否 | 是 | 来源ID 示例：0123456789 |
| orgCode | string | 否 | 是 | 组织编码 示例：MT0000001 |
| period | string | 否 | 是 | 税款所属期，格式yyyy-MM 示例：2023-10 |
| goodsTaxName | string | 否 | 是 | 应税消费品名称 示例：白酒（复合计税） |
| productCode | string | 否 | 否 | 产品编码 示例：2534000004 |
| receiveNumber | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 账面领用数量，最大长度15，精度2。当计税方式为“从价定率“时，该字段为非必填 示例：100.00 |
| taxPaid | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 领用委托加工应税消费品已纳税款，最大长度15，精度2 示例：100.00 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/consignment/receive-detail/batch-add?access_token=访问令牌
Body: {
	"records": [
		{
			"sourceId": "0123456789",
			"orgCode": "MT0000001",
			"period": "2023-10",
			"goodsTaxName": "白酒（复合计税）",
			"productCode": "2534000004",
			"receiveNumber": 100,
			"taxPaid": 100
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 消息 示例：成功 |
| data | object | 否 | 数据 示例：[{"code":"1843482212234166276","sourceId":"0123456789"}] |
| code | string | 否 | 单据编号ID 示例：1843482212234166276 |
| sourceId | string | 否 | 来源ID 示例：0123456789 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "成功",
	"data": [
		{
			"code": "1843482212234166276",
			"sourceId": "0123456789"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	例如：单据编号: 123456,数据不存在	错误提示信息

1001	例如：组织编码不能为空	错误提示信息


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

