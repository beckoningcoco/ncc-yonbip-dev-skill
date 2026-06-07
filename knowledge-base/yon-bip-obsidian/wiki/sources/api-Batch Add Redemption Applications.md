---
title: "批量新增赎回申请"
apiId: "2093379584373293064"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Redemption Application"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Redemption Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 批量新增赎回申请

> `ContentType	application/json` 请求方式	POST | 分类: Redemption Application (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/tlmRedemapplyOpenApi/batchSave

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
| purchaseCode | string | 否 | 是 | 申购单号 示例：定期存款-0001 |
| isPlanRedem | string | 否 | 否 | 是否计划赎回（含逾期） 示例：no 默认值：no |
| drawAppointNum | string | 否 | 否 | 支取预约单 示例：num11131 |
| investredemDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 赎回日期 示例：1725612423136 |
| appointmentDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 预约日期 示例：1725612423136 |
| investredemAmount | number |
| 小数位数:0,最大长度:28 | 否 | 是 | 赎回金额（协议币种） 示例：1111 |
| isSettleAndReceiveInterest | string | 否 | 否 | 是否同时结息收息 示例：yes 默认值：yes |
| balanceRepeating | string | 否 | 否 | 余额是否转存 示例：no 默认值：no |
| interestCollectionEndDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 是 | 收息止息日 示例：1725612423136 |
| InterestCollectionAmount | number |
| 小数位数:0,最大长度:28 | 否 | 是 | 收息金额（协议币种） 示例：2222 |
| adjustInterestAmount | number |
| 小数位数:0,最大长度:28 | 否 | 是 | 调整后收息金额（协议币种) 示例：3333 |
| localAcc | string | 否 | 是 | 本方银行账户ID 示例：2076159960971476996 |
| fixedNotifyAccountStr | string | 否 | 否 | 定期/通知账户（虚拟户） 示例：99999999999 |
| remarks | string | 否 | 否 | 备注 示例：赎回申请 |

## 3. 请求示例

Url: /yonbip/ctm/tlmRedemapplyOpenApi/batchSave?access_token=访问令牌
Body: [{
	"purchaseCode": "定期存款-0001",
	"isPlanRedem": "no",
	"drawAppointNum": "num11131",
	"investredemDate": "1725612423136",
	"appointmentDate": "1725612423136",
	"investredemAmount": 1111,
	"isSettleAndReceiveInterest": "yes",
	"balanceRepeating": "no",
	"interestCollectionEndDate": "1725612423136",
	"InterestCollectionAmount": 2222,
	"adjustInterestAmount": 3333,
	"localAcc": "2076159960971476996",
	"fixedNotifyAccountStr": "99999999999",
	"remarks": "赎回申请"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 状态码 示例：0 |
| message | string | 否 | 消息提示 |

## 5. 正确返回示例

{
	"code": "0",
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

