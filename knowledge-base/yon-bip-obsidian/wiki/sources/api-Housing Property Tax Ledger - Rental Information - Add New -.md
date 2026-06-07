---
title: "房产税台账-从租信息-新增-第2版"
apiId: "2114158971160363012"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Real estate tax account"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Real estate tax account]
platform_version: "BIP"
source_type: community-api-docs
---

# 房产税台账-从租信息-新增-第2版

> `ContentType	application/json` 请求方式	POST | 分类: Real estate tax account (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxoth/api/house-rent/v2/add

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
| orgCode | string | 否 | 是 | 税务组织编码 示例：123123123 |
| code | string | 否 | 否 | 房产税源编号 示例：示例: FCSY20240808000001 （房产税源来源业务id和房产税源编号不可同时为空，且不能同时填写） |
| lyid | string | 否 | 否 | 房产税源来源业务id 示例：示例: FCSY20240808000001 （房产税源来源业务id和房产税源编号不可同时为空，且不能同时填写） |
| rentArea | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 合同出租总面积 示例：12.22 |
| sbRentStart | string | 否 | 是 | 申报租金所属期起，日期格式：yyyy-MM-dd 示例：2023-01 |
| sbRentEnd | string | 否 | 是 | 申报租金所属期止，日期格式：yyyy-MM-dd 示例：2023-01 |
| sbRentIncome | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 申报租金收入 示例：122.12 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxoth/api/house-rent/v2/add?access_token=访问令牌
Body: [{
	"orgCode": "123123123",
	"code": "示例: FCSY20240808000001 （房产税源来源业务id和房产税源编号不可同时为空，且不能同时填写）",
	"lyid": "示例: FCSY20240808000001 （房产税源来源业务id和房产税源编号不可同时为空，且不能同时填写）",
	"rentArea": 12.22,
	"sbRentStart": "2023-01",
	"sbRentEnd": "2023-01",
	"sbRentIncome": 122.12
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 编码 示例：0000 |
| message | string | 否 | 消息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统异常	错误提示信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

更新

请求参数 orgCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

