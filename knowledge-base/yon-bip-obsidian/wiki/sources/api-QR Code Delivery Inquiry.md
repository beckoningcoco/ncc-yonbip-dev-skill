---
title: "二维码交付查询"
apiId: "2117764853893955589"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Outbound Enterprise Invoice Folder"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Outbound Enterprise Invoice Folder]
platform_version: "BIP"
source_type: community-api-docs
---

# 二维码交付查询

> `ContentType	application/json` 请求方式	POST | 分类: Outbound Enterprise Invoice Folder (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxot/api/invoice-his/qrcode

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
| data | object | 否 | 是 | 数据体 |
| fpqqlsh | string | 否 | 否 | 发票请求流水号 示例：123456 |
| fpHm | string | 否 | 否 | 发票号码，如果有发票请求流水号，会通过发票请求流水号查询，发票号码不用填写，如果没有发票请求流水号，发票号码必填 示例：123456 |
| fpDm | string | 否 | 否 | 发票代码 示例：123456 |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxot/api/invoice-his/qrcode?access_token=访问令牌
Body: {
	"data": {
		"fpqqlsh": "123456",
		"fpHm": "123456",
		"fpDm": "123456"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 响应码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| msg | string | 否 | 响应信息 示例：操作成功 |
| datas | string | 否 | 响应数据体 示例：https://bip-daily.yonyoucloud.com/yonbip-fi-taxweb/ucf-wh/ent-views/fpExtract/share_qr.html?fpqqlsh=xxx&corp=xxx&date=xxx |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": "0000",
		"msg": "操作成功",
		"datas": "https://bip-daily.yonyoucloud.com/yonbip-fi-taxweb/ucf-wh/ent-views/fpExtract/share_qr.html?fpqqlsh=xxx&corp=xxx&date=xxx"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1001	查询参数错误

1002	未找到该发票


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-03

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

