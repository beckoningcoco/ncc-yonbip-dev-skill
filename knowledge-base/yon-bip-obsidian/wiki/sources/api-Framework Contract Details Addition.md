---
title: "合同涉税信息-框架合同明细新增"
apiId: "1758108123646132230"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Tax Related Data Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Tax Related Data Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同涉税信息-框架合同明细新增

> `ContentType	application/json` 请求方式	POST | 分类: Tax Related Data Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip-fi-taxbd/bd/api/contract/insertitem

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
| code | string | 否 | 是 | 合同的编号 示例：2233 |
| billNo | string | 否 | 是 | 单据编号 示例：2233wwqdggs |
| startDate | string | 否 | 否 | 开始日期，日期格式yyyy-MM-dd 示例：2023-05-01 |
| endDate | string | 否 | 否 | 结束日期，日期格式yyyy-MM-dd 示例：2023-05-01 |
| busiDate | string | 否 | 否 | 合同金额发生日期，日期格式yyyy-MM-dd 示例：2023-05-01 |
| busiAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 发生金额(含税)（发生金额（含税）和发生金额（不含税）不能同时为空） 示例：1234 |
| busiExcTaxAmount | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 发生金额（不含税）（发生金额（含税）和发生金额（不含税）不能同时为空） 示例：3432 |
| stampStatus | string | 否 | 否 | 印花税申报状态，0-初始化，2-已申报 示例：0 |
| voucherNo | string | 否 | 否 | 凭证号 示例：2234543 |
| itemNote | string | 否 | 否 | 明细备注 示例：备注 |
| generateStamp | boolean | 否 | 否 | 是否自动生成印花税（true：自动生成，false：不进行生成） 示例：true |
| relativeName | string | 否 | 否 | 合同相对方名称 示例：相对方名称 |
| relativeNsrsbh | string | 否 | 否 | 合同相对方税号 示例：898578985 |
| taxPeriod | number |
| 小数位数:0,最大长度:3 | 否 | 否 | 填报周期，3-年，4-次，1-季 示例：1 |
| contractDetailDefineTerm | object | 否 | 否 | 合同子表特征项 示例：{"key":"value"} |

## 3. 请求示例

Url: /yonbip/tax/yonbip-fi-taxbd/bd/api/contract/insertitem?access_token=访问令牌
Body: [{
	"code": "2233",
	"billNo": "2233wwqdggs",
	"startDate": "2023-05-01",
	"endDate": "2023-05-01",
	"busiDate": "2023-05-01",
	"busiAmount": 1234,
	"busiExcTaxAmount": 3432,
	"stampStatus": "0",
	"voucherNo": "2234543",
	"itemNote": "备注",
	"generateStamp": true,
	"relativeName": "相对方名称",
	"relativeNsrsbh": "898578985",
	"taxPeriod": 1,
	"contractDetailDefineTerm": {
		"key": "value"
	}
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 信息 示例：合同的执行明细同步成功 |
| datas | object | 是 | 响应数据 |
| contractCode | string | 否 | 合同编号 示例：213321 |
| contractDetailId | string | 否 | 合同明细id 示例：222 |
| stampId | string | 否 | 印花税id 示例：5252 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "合同的执行明细同步成功",
	"datas": [
		{
			"contractCode": "213321",
			"contractDetailId": "222",
			"stampId": "5252"
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1001	删除的合同执行明细为空，请进行检查或删除的合同执行明细超过了100，请减少通过的数量	数据量校验

9999	系统异常	系统异常

8002	错误提示	提示生成印花税台账中不符合的字段报错信息


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-26

更新

请求说明

更新

请求参数 busiAmount

更新

请求参数 busiExcTaxAmount

2	2025-09-01

新增

请求参数 stampStatus

1015迭代

3	2025-07-08

新增

请求参数 contractDetailDefineTerm

20250715-添加特征


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

