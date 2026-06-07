---
title: "使用权资产变更提交"
apiId: "2455633498429456384"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Right-of-Use Asset Change"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Right-of-Use Asset Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 使用权资产变更提交

> `ContentType	application/json` 请求方式	POST | 分类: Right-of-Use Asset Change (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/FaLeaseChange/submit

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
| data | object | 否 | 是 | 业务数据 |
| id | string | 否 | 是 | 单据id 示例：1483387421116596230 |

## 3. 请求示例

Url: /yonbip/FCC/FaLeaseChange/submit?access_token=访问令牌
Body: {
	"data": {
		"id": "1483387421116596230"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| id | string | 否 | 使用权资产变更主键 示例：1483387421116596230 |
| verifyState | number |
| 小数位数:0,最大长度:6 | 否 | 审核状态 0开立态 1审核中 2已审核 3终止态 4驳回到制单 示例：1 |
| cBillNo | string | 否 | 单据编码 示例：FaLeaseChange |
| afLeasePayment | string | 否 | 变更后租赁付款金额 示例：99990 |
| pubts | string | 否 | 时间戳 示例：2025-01-02 14:48:31 |
| metaFullName | string | 否 | 元数据全称 示例：EFA.lease.FaLeaseChange |
| afTaxAmount | string | 否 | 变更后税额 示例：0 |
| afUnconfirmedFcAmount | string | 否 | 变更后未确认融资费用 示例：4349 |
| fullName | string | 否 | 全称 示例：EFA.lease.FaLeaseChange |
| _status | number |
| 小数位数:0,最大长度:10 | 否 | 状态 示例：0 |
| billTradeTypeId | string | 否 | 交易类型ID 示例：1747549719543939075 |
| verifystate | number |
| 小数位数:0,最大长度:6 | 否 | 审核状态 0开立态 1审核中 2已审核 3终止态 4驳回到制单 示例：1 |
| billTypeId | string | 否 | 单据类型ID |
| actionCode | string | 否 | 动作编码 示例：commit |
| leaseStartDate | string | 否 | 起租日期 示例：2021-01-01 |
| leaseEndDate | string | 否 | 止租日期 示例：2021-12-31 |
| oriBillId | string | 否 | 源头单据ID |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1483387421116596230",
		"verifyState": 1,
		"cBillNo": "FaLeaseChange",
		"afLeasePayment": "99990",
		"pubts": "2025-01-02 14:48:31",
		"metaFullName": "EFA.lease.FaLeaseChange",
		"afTaxAmount": "0",
		"afUnconfirmedFcAmount": "4349",
		"fullName": "EFA.lease.FaLeaseChange",
		"_status": 0,
		"billTradeTypeId": "1747549719543939075",
		"verifystate": 1,
		"billTypeId": "",
		"actionCode": "commit",
		"leaseStartDate": "2021-01-01",
		"leaseEndDate": "2021-12-31",
		"oriBillId": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

999	当前单据, 不允许提交!	请输入有效且未提交的单据id


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

