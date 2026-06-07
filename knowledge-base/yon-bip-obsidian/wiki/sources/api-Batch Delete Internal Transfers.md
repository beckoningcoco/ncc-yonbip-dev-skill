---
title: "内部转账批量删除"
apiId: "2266375377997791235"
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

# 内部转账批量删除

> `ContentType	application/json` 请求方式	POST | 分类: Internal Transfer (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/stct/openapi/deleteBatchInternalTransfer

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
| requestCode | string | 否 | 是 | 请求编码（支持请求流水号和单据编码） |

## 3. 请求示例

Url: /yonbip/ctm/stct/openapi/deleteBatchInternalTransfer?access_token=访问令牌
Body: [{
	"requestCode": ""
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
| code | string | 否 | 返回码 示例：200 |
| message | string | 否 | 返回信息 示例：抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或联系技术支持。 |
| data | object | 否 | 返回数据 |
| status | string | 否 | 返回码，全部失败时返回FAIL,全部成功时返回SUCCESS，部分成功时返回PARTSUCCESS 示例：PARTSUCCESS |
| total | string | 否 | 返回执行总数 示例：1 |
| successNum | string | 否 | 返回成功数量 示例：1 |
| errorNum | string | 否 | 返回失败数量 示例：0 |
| resultDataVOs | object | 是 | 返回数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或联系技术支持。",
	"data": {
		"status": "PARTSUCCESS",
		"total": "1",
		"successNum": "1",
		"errorNum": "0",
		"resultDataVOs": [
			{
				"requestSeqNo": "",
				"code": "200",
				"message": "删除成功"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	抱歉，服务出现异常，请稍后再试。如果问题持续，请上报或者联系技术支持！

400	保存失败：根据单据编码未查询到内部转账数据！


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

