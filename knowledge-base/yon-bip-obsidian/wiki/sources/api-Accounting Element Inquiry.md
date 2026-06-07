---
title: "会计要素查询"
apiId: "0142d957c7e148b2b0c0aefcc837aa99"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounting Element Table"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounting Element Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 会计要素查询

> `ContentType	application/json` 请求方式	POST | 分类: Accounting Element Table (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/fipub/accproperty/getProperty

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
| accelement | string | 否 | 是 | 会计要素表id（可根据科目表查询接口获取） |

## 3. 请求示例

Url: /yonbip/fi/fipub/accproperty/getProperty?access_token=访问令牌
Body: {
	"accelement": ""
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
| data | object | 是 | data |
| code | string | 否 | 会计要素编码 示例：0101 |
| name | string | 否 | 会计要素名称 示例：流动资产 |
| id | string | 否 | 会计要素id 示例：19aca3ad-56fc-11eb-92ca-0646ec0005a6 |
| code | long | 否 | 访问成功编码 示例：1 |

## 5. 正确返回示例

{
	"data": [
		{
			"code": "0101",
			"name": "流动资产",
			"id": "19aca3ad-56fc-11eb-92ca-0646ec0005a6"
		}
	],
	"code": 1
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

code=0,success=false	表示查询有报错	查看message的信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-28

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

