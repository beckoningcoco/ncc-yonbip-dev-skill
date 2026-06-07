---
title: "工时定额新增"
apiId: "2412509355309006850"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Cost Center Accounting"
domain: "CO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Cost Center Accounting]
platform_version: "BIP"
source_type: community-api-docs
---

# 工时定额新增

> `ContentType	application/json` 请求方式	POST | 分类: Cost Center Accounting (CO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/ecc/saveQuoTime

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
| accentity | string | 否 | 否 | 会计主体ID |
| factoryorg | string | 否 | 否 | 工厂ID |
| quover | string | 否 | 否 | 定额方案ID |
| maMaterialSku | string | 否 | 否 | 核算物料ID |
| accpurpose | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 核算目的ID 示例：0 |
| id | string | 否 | 否 | 主键,修改时候必传 |
| operationTimes | object | 是 | 否 | 子表 |
| operation | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 标准工序ID 示例：0 |
| opSn | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 工序序号 示例：0 |
| personTimeQuantity | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 人工工时(单位是: 秒) |
| machineTimeQuantity | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 机器工时(单位是: 秒) 示例：0 |
| otherTimeQuantity | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 其他工时(单位是: 秒) 示例：0 |
| _status | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 状态; 修改=1, 新增=3 示例：1 默认值：1 |
| _status | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 状态; 修改=1, 新增=3 示例：1 默认值：1 |

## 3. 请求示例

Url: /yonbip/FCC/ecc/saveQuoTime?access_token=访问令牌
Body: {
	"accentity": "",
	"factoryorg": "",
	"quover": "",
	"maMaterialSku": "",
	"accpurpose": 0,
	"id": "",
	"operationTimes": [
		{
			"operation": 0,
			"opSn": 0,
			"personTimeQuantity": 0,
			"machineTimeQuantity": 0,
			"otherTimeQuantity": 0,
			"_status": 1
		}
	],
	"_status": 1
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

暂时没有数据哦~


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

