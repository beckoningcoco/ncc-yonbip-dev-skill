---
title: "开函登记销函"
apiId: "1669609867261771782"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "L/G Issuing Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, L/G Issuing Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 开函登记销函

> `ContentType	application/json` 请求方式	POST | 分类: L/G Issuing Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/lgmCancelLetterOpenApi/cancelForOpenedGuarantee

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
| guaranteeNumber | string | 否 | 是 | 保函的唯一编码 示例：SZABD12345678 |
| cancelDate | Date | 否 | 是 | 保函注销的日期 示例：2023-01-01 |

## 3. 请求示例

Url: /yonbip/ctm/lgmCancelLetterOpenApi/cancelForOpenedGuarantee?access_token=访问令牌
Body: {
	"guaranteeNumber": "SZABD12345678",
	"cancelDate": "2023-01-01"
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
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 操作执行结果 示例：销函成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "销函成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

100001	保函[保函编号]不存在！	请检查保函是否存在！

100002	保函[保函编号]已销函！	请检查保函是否已销函！

100003	销函日期[销函日期]不能早于开函日期[开函日期]！	请确认销函日期应晚于开函日期！

100004	参数[保函编号]输入有误，请检查！	请检查保函编号是否输入正确！

100005	参数[销函日期]输入有误，请检查！	请检查销函日期是否输入正确！

100006	保函[保函编号]未审批通过！	请检查保函编号是否输入正确！


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

