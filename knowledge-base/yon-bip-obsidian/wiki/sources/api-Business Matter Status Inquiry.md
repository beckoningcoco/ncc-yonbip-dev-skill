---
title: "业务事项状态查询"
apiId: "1597732077720043524"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Business Event"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Event]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务事项状态查询

> `ContentType	application/json` 请求方式	GET | 分类: Business Event (AMP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/AMP/api/v1/busievent/{busiObjCode}/{busiid}

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| busiObjCode | string | path | 是 | 业务对象编码    示例: LX-202212-000001 |
| busiid | string | path | 是 | 业务单据ID    示例: 233423234131 |

## 3. 请求示例

Url: /yonbip/AMP/api/v1/busievent/LX-202212-000001/233423234131?access_token=访问令牌

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 状态码，200-成功，500-失败，404-未找到，208-已处理过，209-忽略 示例：200 |
| message | string | 否 | 返回信息 示例：核算规则:公式执行出错。公式：[!bodies.blnWholeDisposal]，错误：[EL1001E: Type conversion problem, cannot convert from null to boolean]" |

## 5. 正确返回示例

{
	"code": "200",
	"message": "核算规则:公式执行出错。公式：[!bodies.blnWholeDisposal]，错误：[EL1001E: Type conversion problem, cannot convert from null to boolean]\""
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

1020182501500	核算规则:公式执行出错	检查核算规则配置信息


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

