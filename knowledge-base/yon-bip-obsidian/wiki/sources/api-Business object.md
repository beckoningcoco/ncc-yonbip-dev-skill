---
title: "指令平台-批量更新指令状态"
apiId: "1900434646843785220"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Instruction"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Instruction]
platform_version: "BIP"
source_type: community-api-docs
---

# 指令平台-批量更新指令状态

> `ContentType	application/json` 请求方式	POST | 分类: Payment Instruction (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/instructOpenApi/syncAccountInfo

请求方式	POST

ContentType	application/json

应用场景	开放API

API类别	详情查询

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| tran_seq_no | string | 否 | 是 | 交易流水号 |
| oper_type | string | 否 | 是 | 操作类型（1开户管理；2变更管理;3销户管理） |
| acct_no | string | 否 | 否 | 账号 |
| acct_name | string | 否 | 是 | 账户名称 |
| acct_status | string | 否 | 否 | 账户状态（3正常、4销户、5冻结、6久悬户） |
| agency_acct_no | string | 否 | 否 | 代理户账号 |
| agency_acct_name | string | 否 | 否 | 代理户名称 |
| agency_bank_type | string | 否 | 否 | 代理户所属银行 |
| agency_brch_name | string | 否 | 否 | 代理银行开户行 |
| agency_acct_status | string | 否 | 否 | 代理账户状态（3正常、4销户） |
| is_connect | string | 否 | 否 | 是否直连（1是、2否） |
| connect_time | string | 否 | 否 | 直连授权时间（YYYYMMDDhhmmss） |
| del_date | string | 否 | 否 | 销户日期（格式为：YYYYMMDD 操作类型为销户管理时必传） |
| acct_open_date | string | 否 | 否 | 账户开户日期（yyyyMMdd 操作类型为开户时必传） |
| change_date | string | 否 | 否 | 变更日期（yyyyMMdd 操作类型为变更时必传） |
| Is_auth_acct_no | string | 否 | 否 | 是否归集账号（1是 2否） |
| auth_status | string | 否 | 否 | 授权状态（0未授权、1查询、2查询支付） |
| bank_seq_no | string | 否 | 否 | 银行流水号 |
| status | string | 否 | 是 | 处理状态（1成功、2失败、3处理中） |
| status_desc | string | 否 | 否 | 处理状态描述 |
| fail_type | string | 否 | 否 | 失败类型（1驳回重走审批流 2驳回不重走审批流 3拒绝） |
| fail_resion | string | 否 | 否 | 失败原因 |

## 3. 请求示例

Url: /yonbip/ctm/api/instructOpenApi/syncAccountInfo?access_token=访问令牌
Body: [{
	"tran_seq_no": "",
	"oper_type": "",
	"acct_no": "",
	"acct_name": "",
	"acct_status": "",
	"agency_acct_no": "",
	"agency_acct_name": "",
	"agency_bank_type": "",
	"agency_brch_name": "",
	"agency_acct_status": "",
	"is_connect": "",
	"connect_time": "",
	"del_date": "",
	"acct_open_date": "",
	"change_date": "",
	"Is_auth_acct_no": "",
	"auth_status": "",
	"bank_seq_no": "",
	"status": "",
	"status_desc": "",
	"fail_type": "",
	"fail_resion": ""
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

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

500	服务端异常	服务端异常


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

