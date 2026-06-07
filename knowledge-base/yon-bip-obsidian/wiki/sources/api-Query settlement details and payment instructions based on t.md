---
title: "根据业务单据明细据id查询结算明细以及支付指令"
apiId: "2108828521628434433"
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

# 根据业务单据明细据id查询结算明细以及支付指令

> `ContentType	application/json` 请求方式	POST | 分类: Payment Instruction (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/api/query/settlementdetail

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
| data | object | 否 | 否 | 数据 |
| businessdetailsids | string | 是 | 否 | 业务单据明细id |

## 3. 请求示例

Url: /yonbip/ctm/api/query/settlementdetail?access_token=访问令牌
Body: {
	"data": {
		"businessdetailsids": [
			""
		]
	}
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
| data | object | 是 | data |
| settled_id | number |
| 小数位数:0,最大长度:20 | 否 | 待结算数据id 示例：2111141335742808148 |
| settled_code | string | 否 | 待结算数据code 示例：SD224101500001203 |
| settled_businessId | string | 否 | 待结算数据来源单据id 示例：2111141258408230923 |
| settled_businessdetailsid | string | 否 | 待结算数据来源单据明细id 示例：2111141258408230923 |
| settled_business_bill_num | string | 否 | 待结算数据来源单据编号 示例：FDP20241015000742 |
| settlebench_id | number |
| 小数位数:0,最大长度:20 | 否 | 结算工作台id 示例：2111146618552582152 |
| settlebench_code | string | 否 | 结算工作台code 示例：00ST2241015000848 |
| settlebench_statementstatus | number |
| 小数位数:0,最大长度:2 | 否 | 结算单状态 示例：4 |
| settlebench_b_settlemode | string | 否 | 结算模式 示例：1 |
| settlebench_b_isrefund | number |
| 小数位数:0,最大长度:2 | 否 | 是否退票 示例：0 |
| settlebench_b_counterpartybankacc | string | 否 | 对方银行账户类型 示例：1563456363645645640 |
| settlebench_b_dataSettledId | string | 否 | 待结算数据id 示例：2111141335742808148 |
| settlebench_b_bizbilldetailid | string | 否 | 业务单据明细id 示例：2111141258408230923 |
| settlebench_b_counterpartytype | string | 否 | 对方类型 示例：2 |
| settlebench_b_bizbillno | string | 否 | 业务单据编号 示例：FDP20241015000742 |
| settlebench_b_relatedstatementno | string | 否 | 关联结算单号 示例：00ST2241015000848 |
| settlebench_b_statementdetailstatus | number |
| 小数位数:0,最大长度:2 | 否 | 结算明细状态 示例：2 |
| payindex_indexstatus | number |
| 小数位数:0,最大长度:2 | 否 | 指令状态 示例：0 |
| payindex_indexdate | string | 否 | 指令日期 示例：2024-10-15 13:23:43 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"settled_id": 2111141335742808148,
			"settled_code": "SD224101500001203",
			"settled_businessId": "2111141258408230923",
			"settled_businessdetailsid": "2111141258408230923",
			"settled_business_bill_num": "FDP20241015000742",
			"settlebench_id": 2111146618552582152,
			"settlebench_code": "00ST2241015000848",
			"settlebench_statementstatus": 4,
			"settlebench_b_settlemode": "1",
			"settlebench_b_isrefund": 0,
			"settlebench_b_counterpartybankacc": "1563456363645645640",
			"settlebench_b_dataSettledId": "2111141335742808148",
			"settlebench_b_bizbilldetailid": "2111141258408230923",
			"settlebench_b_counterpartytype": "2",
			"settlebench_b_bizbillno": "FDP20241015000742",
			"settlebench_b_relatedstatementno": "00ST2241015000848",
			"settlebench_b_statementdetailstatus": 2,
			"payindex_indexstatus": 0,
			"payindex_indexdate": "2024-10-15 13:23:43"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	传入的业务单据明细id为空，请检查！	检查传入参数


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

