---
title: "发包履约义务金额更新"
apiId: "2388952816911646724"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contracting Performance Obligation"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contracting Performance Obligation]
platform_version: "BIP"
source_type: community-api-docs
---

# 发包履约义务金额更新

> `ContentType	application/json` 请求方式	POST | 分类: Contracting Performance Obligation (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/EFI/RVN/rclEmployPerformanceObligation/updateMoney

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
| data | object | 否 | 否 | 入参 |
| extSrcBillCode | string | 否 | 否 | 来源单据编码 示例：XMLX2312181102000003 |
| srcBillVersion | string | 否 | 否 | 来源单据版本 示例：2 |
| rclPerformanceBaseInfoList | object | 是 | 否 | 基本信息行 |

## 3. 请求示例

Url: /yonbip/FCC/EFI/RVN/rclEmployPerformanceObligation/updateMoney?access_token=访问令牌
Body: {
	"data": {
		"extSrcBillCode": "XMLX2312181102000003",
		"srcBillVersion": "2",
		"rclPerformanceBaseInfoList": [
			{
				"extSrcBodyId": "",
				"orimnyNotax": 0,
				"orimnyTax": 0,
				"orimny": 0,
				"localmnyNotax": 0,
				"localmny": 0,
				"localmnyTax": 0
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| contract | object | 否 | 发包履约义务 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"contract": {}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

