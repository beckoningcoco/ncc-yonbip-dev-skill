---
title: "到单交单更新核销占用金额"
apiId: "2117019891820134404"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Received Document Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Received Document Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 到单交单更新核销占用金额

> `ContentType	application/json` 请求方式	POST | 分类: Received Document Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/arrivebill/updatemoney

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
| datatype | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 占用/释放，如果是选单保存，则占用到单/交单金额，如果删除所选到单/交单，则释放 1：占用，2：释放 |
| businesstype | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 业务类型，预占/核销 1：预占，2：核销 |
| money | number |
| 小数位数:8,最大长度:30 | 否 | 是 | 金额：本次占用或者核销金额，释放时本字段无效，以占用时的金额为准 |
| billtype | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 单据类型1：到单登记，2：交单办理 |
| arrorpreid | number |
| 小数位数:0,最大长度:32 | 否 | 是 | 交单/到单ID，到单登记查询和交单办理查询到单/交单id |
| businessheadid | string | 否 | 是 | 业务表头主键,单据主键，必填，需传给司库-待结算数据，如果是释放，传原占用时的表头主键 示例：2116389261598261257 |
| businessdetailid | string | 否 | 是 | 业务表体主键.表体明细的ID，必填，需传给司库-待结算数据，如果是释放，传原占用时的表体主键 示例：2116389261598261257 |

## 3. 请求示例

Url: /yonbip/ctm/arrivebill/updatemoney?access_token=访问令牌
Body: {
	"datatype": 0,
	"businesstype": 0,
	"money": 0,
	"billtype": 0,
	"arrorpreid": 0,
	"businessheadid": "2116389261598261257",
	"businessdetailid": "2116389261598261257"
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
| message | string | 否 | 描述信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
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

