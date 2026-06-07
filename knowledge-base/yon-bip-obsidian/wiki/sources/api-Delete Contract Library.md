---
title: "合同库删除"
apiId: "2031927870918492166"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Center"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同库删除

> `ContentType	application/json` 请求方式	POST | 分类: Contract Center (CLMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/CLMS/v1.0/contractLib/deleteById

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 合同库ID    示例: 1858682436506353673 |

## 3. 请求示例

Url: /yonbip/CLMS/v1.0/contractLib/deleteById?access_token=访问令牌&id=1858682436506353673

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 状态信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 合同库ID 示例：18586828582528 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "18586828582528"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1200	参数错误	无有效删除数据

500	服务异常	异常信息

999	接口调用错误	异常信息，请联系管理员

1001001000003	参数错误	异常信息，请检查数据


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-06-21

更新

请求说明

新增

错误码 1200

重新发布


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

