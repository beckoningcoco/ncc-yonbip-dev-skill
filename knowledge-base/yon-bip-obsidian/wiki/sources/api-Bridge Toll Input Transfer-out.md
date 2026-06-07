---
title: "桥闸通行费进项转出"
apiId: "1760335158697787397"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Value-added Tax"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Value-added Tax]
platform_version: "BIP"
source_type: community-api-docs
---

# 桥闸通行费进项转出

> `ContentType	application/json` 请求方式	POST | 分类: Value-added Tax (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/deduction/outdetail/rollout-tolls

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
| invoiceDeductibles | object | 是 | 是 | 转出信息 |
| billType | string | 否 | 是 | 票据类型（quota-定额发票；machine-机打发票；tolls-过路费；other-其他发票） 示例：tolls |
| fpDm | string | 否 | 是 | 发票代码 示例：1234 |
| fpHm | string | 否 | 是 | 发票号码 示例：00006543 |
| outMoney | BigDecimal | 否 | 是 | 转出税额 示例：1.08 |
| reason | int | 否 | 是 | 转出原因 1-免税项目用；2-集体福利、个人消费；3-非正常损失；4-简易计税方法征税项目用；5-红字专用发票信息表注明的进项税额；6-其他应作进项税额转出的情形(其他进项转出明细：601-贷款服务及直接相关费用；602-非应税交易项目；603-用于简易计税、免税项目和非应税交易无法划分年度清算调整；604-长期资产进项税额转出额；605-其他进项税额转出)；7-免抵退税办法不得抵扣的进项税额；8-纳税检查调减进项税额；9-上期留抵税额抵减欠税；10-上期留抵税额退税；11-异常凭证转出进项税额 示例：1 |
| outDate | string | 否 | 否 | 转出⽇期（yyyy-MM-dd） 转出⽇期和转出所属期不能同时为空，两个都传⼊值时，以转出所属期为准 示例：2023-06-07 |
| outPeriod | string | 否 | 否 | 转出所属期（yyyy-MM）转出⽇期和转出所属期不能同时为空，两个都传⼊值时，以转出所属期为准 示例：2023-01 |
| operator | string | 否 | 是 | 操作员 示例：王丽 |
| voucherId | string | 否 | 否 | 凭证号（凭证号长度不能超过50） 示例：2345 |
| vnote | string | 否 | 否 | 备注（备注长度不能超过180） 示例：备注xxx |
| accountDate | Date | 否 | 否 | 记账⽇期（yyyy-MM-dd） 示例：2022-09-08 |
| srcBillcode | string | 否 | 否 | 来源单据号（票据来源单据号长度不能超过200） 示例：12567 |
| voucherAccId | string | 否 | 否 | 凭证ID 示例：1 |
| orgCode | string | 否 | 是 | 组织编码 示例：1245 |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/deduction/outdetail/rollout-tolls?access_token=访问令牌
Body: {
	"invoiceDeductibles": [
		{
			"billType": "tolls",
			"fpDm": "1234",
			"fpHm": "00006543",
			"outMoney": 1.08,
			"reason": 1,
			"outDate": "2023-06-07",
			"outPeriod": "2023-01",
			"operator": "王丽",
			"voucherId": "2345",
			"vnote": "备注xxx",
			"accountDate": "2022-09-08",
			"srcBillcode": "12567",
			"voucherAccId": "1"
		}
	],
	"orgCode": "1245"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	未知错误	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-10

更新

请求说明

更新

请求参数 reason


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

