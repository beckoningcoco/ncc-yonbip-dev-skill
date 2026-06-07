---
title: "内部转账批量生单"
apiId: "2177970657394950151"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Internal Transfer"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Internal Transfer]
platform_version: "BIP"
source_type: community-api-docs
---

# 内部转账批量生单

> `ContentType	application/json` 请求方式	POST | 分类: Internal Transfer (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/stct/openapi/createBatchInternalTransfer

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
| requestSeqNo | string | 否 | 是 | 请求流水号（保证唯一性） 示例："1000L6YQ8AVLFUZPXD0001" |
| settlementCenter | string | 否 | 是 | 结算中心（支持编码和名称） 示例："JT000000001"或者"集团结算中心" |
| bustype | string | 否 | 是 | 交易类型（支持编码，枚举类型：stct_internaltransfer-内部转账单、stct_internaltransfer_coll-特转收、stct_internaltransfer_pay-特转付） 示例："stct_internaltransfer" |
| vouchdate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 单据日期 示例：2025-01-01 |
| billStatus | string | 否 | 否 | 单据状态（为空时生成已复核的单据 枚举值："2"-待复核、"3"-已复核；） 示例："2" |
| originalcurrency | string | 否 | 是 | 原币币种（支持编码和名称） 示例："CNY"或者"人民币" |
| originalcurrencyamt | string | 否 | 是 | 原币金额 示例：10000.00 |
| exchangerateType | string | 否 | 否 | 汇率类型（支持编码和名称） 示例："01"或者"基准汇率" |
| exchangerateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 汇率折算方式（枚举类型，1为*；2为÷） 示例：1 |
| exchangerate | number |
| 小数位数:8,最大长度:16 | 否 | 否 | 汇率 示例：1.12 |
| expsetdate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 期望结算日期 示例：2025-01-01 |
| settlementDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 结算日期 示例：2025-01-01 |
| expenseItem | string | 否 | 否 | 费用项目（支持编码和名称） 示例："FFA00001"或者"市内交通费" |
| project | string | 否 | 否 | 项目（支持编码和名称） 示例："000000003"或者"资金流入流出" |
| notes | string | 否 | 否 | 备注 示例："字段描述" |
| accpayentity | string | 否 | 否 | 付方资金组织（支持编码和名称，当交易类型=内部转账、特转收时必填） 示例："JSZX00002"或者"二级结算中心" |
| inneracc | string | 否 | 否 | 付方内部账号（支持账号和名称，当交易类型=内部转账、特转收时必填） 示例："INT0000001000000031"或者"STCT0002" |
| payProject | string | 否 | 否 | 转出项目（支持编码和名称） 示例："000000004"或者"资金流出" |
| accrecentity | string | 否 | 否 | 收方资金组织（支持编码和名称，当交易类型=内部转账、特转付时必填） 示例："JSZX00001"或者"一级结算中心" |
| colinneracc | string | 否 | 否 | 收方内部账号（支持账号和名称，当交易类型=内部转账、特转付时必填） 示例："INT0000001000000030"或者"STCT0001" |
| recProject | string | 否 | 否 | 转入项目（支持编码和名称） 示例："000000005"或者"资金流入" |

## 3. 请求示例

Url: /yonbip/ctm/stct/openapi/createBatchInternalTransfer?access_token=访问令牌
Body: [{
	"requestSeqNo": "\"1000L6YQ8AVLFUZPXD0001\"",
	"settlementCenter": "\"JT000000001\"或者\"集团结算中心\"",
	"bustype": "\"stct_internaltransfer\"",
	"vouchdate": "2025-01-01",
	"billStatus": "\"2\"",
	"originalcurrency": "\"CNY\"或者\"人民币\"",
	"originalcurrencyamt": "10000.00",
	"exchangerateType": "\"01\"或者\"基准汇率\"",
	"exchangerateOps": 1,
	"exchangerate": 1.12,
	"expsetdate": "2025-01-01",
	"settlementDate": "2025-01-01",
	"expenseItem": "\"FFA00001\"或者\"市内交通费\"",
	"project": "\"000000003\"或者\"资金流入流出\"",
	"notes": "\"字段描述\"",
	"accpayentity": "\"JSZX00002\"或者\"二级结算中心\"",
	"inneracc": "\"INT0000001000000031\"或者\"STCT0002\"",
	"payProject": "\"000000004\"或者\"资金流出\"",
	"accrecentity": "\"JSZX00001\"或者\"一级结算中心\"",
	"colinneracc": "\"INT0000001000000030\"或者\"STCT0001\"",
	"recProject": "\"000000005\"或者\"资金流入\""
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
| code | string | 否 | code 示例：200 |
| message | string | 否 | message 示例：抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或联系技术支持。 |
| data | object | 否 | data 示例：{ status: FAIL-全部失败；SUCCESS-全部成功；PARTSUCCESS-部分成功, total: 1, errorNum: 1, successNum: 0, resultDataVOs: [ { requestSeqNo: 1, code: 999, message: "保存失败：根据项目名称或编码未查询到启用的档案数据！" } ] } |

## 5. 正确返回示例

{
	"code": "200",
	"message": "抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或联系技术支持。",
	"data": {
		"status": "FAIL-全部失败；SUCCESS-全部成功；PARTSUCCESS-部分成功",
		"total": 1,
		"errorNum": 1,
		"successNum": 0,
		"resultDataVOs": [
			{
				"requestSeqNo": 1,
				"code": 999,
				"message": "保存失败：根据项目名称或编码未查询到启用的档案数据！"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或者联系技术支持！


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-11-13

更新

请求说明

新增

请求参数 billStatus

新增

请求参数 exchangerateOps

新增

请求参数 exchangerate

更新

返回参数 code

更新

返回参数 message

更新

返回参数 data


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

