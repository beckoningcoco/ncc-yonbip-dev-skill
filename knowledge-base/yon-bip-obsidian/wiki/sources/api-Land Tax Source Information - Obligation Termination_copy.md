---
title: "土地税源信息-撤销终止"
apiId: "2420068489163702277"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Land tax source information"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Land tax source information]
platform_version: "BIP"
source_type: community-api-docs
---

# 土地税源信息-撤销终止

> `ContentType	application/json` 请求方式	POST | 分类: Land tax source information (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/TAX/TAXOHTER/LandInfo/other-tax/api/land-tax/revoke-terminate

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
| id | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 税务云数据id，租户下唯一 （税务云id、来源业务id和土地税源编号不可同时为空，同时上送时需要校验匹配关系，用于识别土地税源） 示例：15622146464894 |
| code | string | 否 | 否 | 土地税源在税务云自动生成的编号，租户下唯一 （税务云id、来源业务id和土地税源编号不可同时为空，同时上送时需要校验匹配关系，用于识别土地税源） 示例：TDSY20240725000001 |
| lyid | string | 否 | 否 | 来源业务id，租户下唯一 （税务云id、来源业务id和土地税源编号不可同时为空，同时上送时需要校验匹配关系，用于识别土地税源） 示例：15455115457 |

## 3. 请求示例

Url: /yonbip/FCC/TAX/TAXOHTER/LandInfo/other-tax/api/land-tax/revoke-terminate?access_token=访问令牌
Body: [{
	"id": 15622146464894,
	"code": "TDSY20240725000001",
	"lyid": "15455115457"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 消息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	按返回信息处理


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

