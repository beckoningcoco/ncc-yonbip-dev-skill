---
title: "上游业务单据一键退回"
apiId: "2325132858462568457"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Data Pending Settlement"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Data Pending Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 上游业务单据一键退回

> `ContentType	application/json` 请求方式	POST | 分类: Data Pending Settlement (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/settlement/autoRebackByBizInfo

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| businessBillType | string | 否 | 是 | 枚举：0:转账付款单 1:转账收款单 2:通用报销单 3:退款单 6:其他收款单 7:收款单 8:其他单笔付款单 9:其他批量付款单 10:付款单 11:差旅费报销单 12:对公预付单 13:还款单 14:个人借款单 15:薪资发放单 16:代理付款单 17:代理收款单 18:内部账户结息单 161:投资收款单 162:投资付款单 163:融资收款单 164:融资付款单 165:衍生品收款单 166:衍生品付款单 167:融入登记单 168:融资还本单 169:融资付息单 170:融资付费单 171:申购 示例：3 |
| businessBillId | string | 否 | 是 | 业务单据ID 示例：1232432434444 |
| backReason | string | 否 | 否 | 退回原因 示例：自动退回 |

## 3. 请求示例

Url: /yonbip/ctm/api/settlement/autoRebackByBizInfo?access_token=访问令牌
Body: {
	"businessBillType": "3",
	"businessBillId": "1232432434444",
	"backReason": "自动退回"
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
| code | string | 否 | 200:成功 示例：200 |
| message | string | 否 | 操作成功 示例：操作成功 |
| data | object | 否 | 返回数据 示例：null |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": "null"
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

