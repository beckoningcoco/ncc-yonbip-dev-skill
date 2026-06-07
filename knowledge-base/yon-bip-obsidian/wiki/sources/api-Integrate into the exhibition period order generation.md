---
title: "融入展期生单"
apiId: "2120715694017871875"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lending Extension"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lending Extension]
platform_version: "BIP"
source_type: community-api-docs
---

# 融入展期生单

> `ContentType	application/json` 请求方式	POST | 分类: Lending Extension (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/financingrollover/openapi/create

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
| code | string | 否 | 否 | code 示例：RZFF2411150001 |
| accentity | string | 否 | 否 | 资金组织 示例：用友网络科技股份有限公司 |
| protocol | string | 否 | 否 | 协议号 示例：提前还本测试付息-001 |
| rolloverProtocolNo | string | 否 | 否 | 展期协议号（展期信息） 示例：提前还本测试付息-001 |
| debtcode | string | 否 | 否 | 借据号 示例：提前还本测试付息-0010001 |
| rolloverBeginDate | string | 否 | 否 | 展期日期 示例：2024-11-01 |
| rolloverAmount | number |
| 小数位数:6,最大长度:16 | 否 | 否 | 展期金额 示例：66666.67 |
| rolloverStartDate | string | 否 | 否 | 展期开始日 示例：2026-01-01 |
| rolloverTermNumber | string | 否 | 否 | 展期期限(整数) 示例：2 |
| rolloverEndDate | string | 否 | 否 | 展期后到期日 示例：2026-03-01 |
| baseInterestRate | number |
| 小数位数:6,最大长度:10 | 否 | 否 | 基准利率（%） 示例：7.300000 |
| floatMethod | string | 否 | 否 | 浮动方式。枚举值：加减点（0）、比例（1） 示例：1 |
| floatValue | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 浮动值 示例：2 |
| rolloverInterestRate | number |
| 小数位数:8,最大长度:10 | 否 | 否 | 展期利率（%） 示例：7.446 |
| firstRepaymentDate | string | 否 | 否 | 首次还本日 示例：2026-04-31 |
| monthAdjustDate | string | 否 | 否 | 月末日期调整（还本） |
| firstPayInterestDate | string | 否 | 否 | 首次付息日 示例：2026-04-31 |
| monthInterestAdjustDate | string | 否 | 否 | 月末日期调整（付息） |
| rolloverReason | string | 否 | 否 | 展期原因 示例：额度不足，申请展期 |
| vouchdate | string | 否 | 否 | vouchdate 示例：2024-11-15 00:00:00 |
| auditStatus | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 单据状态 示例：1 |
| isWfControlled | boolean | 否 | 否 | isWfControlled 示例：false |

## 3. 请求示例

Url: /yonbip/ctm/fm/financingrollover/openapi/create?access_token=访问令牌
Body: {
	"code": "RZFF2411150001",
	"accentity": "用友网络科技股份有限公司",
	"protocol": "提前还本测试付息-001",
	"rolloverProtocolNo": "提前还本测试付息-001",
	"debtcode": "提前还本测试付息-0010001",
	"rolloverBeginDate": "2024-11-01",
	"rolloverAmount": 66666.67,
	"rolloverStartDate": "2026-01-01",
	"rolloverTermNumber": "2",
	"rolloverEndDate": "2026-03-01",
	"baseInterestRate": 7.3,
	"floatMethod": "1",
	"floatValue": 2,
	"rolloverInterestRate": 7.446,
	"firstRepaymentDate": "2026-04-31",
	"monthAdjustDate": "",
	"firstPayInterestDate": "2026-04-31",
	"monthInterestAdjustDate": "",
	"rolloverReason": "额度不足，申请展期",
	"vouchdate": "2024-11-15 00:00:00",
	"auditStatus": 1,
	"isWfControlled": false
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
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：0 |
| data | object | 否 | data |
| code | string | 否 | code 示例：ZQ2411220002 |
| statusMsg | string | 否 | statusMsg 示例：保存成功 |
| message | string | 否 | message |
| timestamp | string | 否 | timestamp 示例：1732265723706 |

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"code": "ZQ2411220002",
		"statusMsg": "保存成功"
	},
	"message": "",
	"timestamp": "1732265723706"
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

