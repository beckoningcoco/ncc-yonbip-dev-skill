---
title: "担保合同更新"
apiId: "2429687978967171078"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Guarantee Contract"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Guarantee Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 担保合同更新

> `ContentType	application/json` 请求方式	POST | 分类: Guarantee Contract (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/grmOpenApi/updateGuaranteeContract

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
| 小数位数:0,最大长度:19 | 否 | 否 | 担保合同id 示例：1111111 |
| guaranteeApplyId | number |
| 小数位数:0,最大长度:20 | 否 | 否 | 担保合同申请id 示例：22222 |
| contractCode | string | 否 | 否 | 合同编号 示例：11111 |
| amount | number |
| 小数位数:1,最大长度:10 | 否 | 否 | 金额 示例：100 |
| startDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 开始日期 示例：2025-11-01 |
| termNumber | number |
| 小数位数:1,最大长度:10 | 否 | 否 | 期限数量 示例：10 |
| termUnit | number |
| 小数位数:1,最大长度:10 | 否 | 否 | 期限单位，枚举（1:年，2:月：3日） 示例：1 |
| endDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 到期日期 示例：2025-11-10 |

## 3. 请求示例

Url: /yonbip/FCC/grmOpenApi/updateGuaranteeContract?access_token=访问令牌
Body: {
	"id": 1111111,
	"guaranteeApplyId": 22222,
	"contractCode": "11111",
	"amount": 100,
	"startDate": "2025-11-01",
	"termNumber": 10,
	"termUnit": 1,
	"endDate": "2025-11-10"
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
| code | string | 否 | code 示例：200 |
| message | string | 否 | message |

## 5. 正确返回示例

{
	"code": "200",
	"message": ""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

