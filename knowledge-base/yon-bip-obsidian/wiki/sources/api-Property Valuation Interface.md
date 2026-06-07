---
title: "物权评估价值接口"
apiId: "2278964184833589250"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Security Interest"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Security Interest]
platform_version: "BIP"
source_type: community-api-docs
---

# 物权评估价值接口

> `ContentType	application/json` 请求方式	POST | 分类: Security Interest (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/grmOpenApi/assess

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| accentity | string | 否 | 是 | 资金组织 示例：宝可梦宇宙 |
| code | string | 否 | 是 | 担保物权编码 示例：GRMREM250529001 |
| assessPrice | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 评估价值 示例：1.00 |
| rate | string | 否 | 是 | 抵质押率%(大于0） 示例：50 默认值：100 |
| assessDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 评估日期(需要小于到期日期) 示例：2025-05-29 |
| assessUnit | string | 否 | 是 | 评估机构名称 示例：中国人民银行 |
| remark | string | 否 | 否 | 备注 示例：评估价值更新 |

## 3. 请求示例

Url: /yonbip/ctm/grmOpenApi/assess?access_token=访问令牌
Body: {
	"accentity": "宝可梦宇宙",
	"code": "GRMREM250529001",
	"assessPrice": 1,
	"rate": "50",
	"assessDate": "2025-05-29",
	"assessUnit": "中国人民银行",
	"remark": "评估价值更新"
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
| message | string | 否 | message 示例：操作成功 |
| data | string | 否 | data 示例：GRMREM230308000003 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "GRMREM230308000003"
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

