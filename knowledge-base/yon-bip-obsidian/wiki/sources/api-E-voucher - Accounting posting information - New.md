---
title: "电子凭证-会计入账信息-新增"
apiId: "2352390993834147844"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Archive Accession"
domain: "EAF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Archive Accession]
platform_version: "BIP"
source_type: community-api-docs
---

# 电子凭证-会计入账信息-新增

> `ContentType	application/json` 请求方式	POST | 分类: Archive Accession (EAF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/FCC/v1/api/voucherEntry/batchInsert

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| orgCode | string | query | 是 | 全宗编码 |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| voucherEntryList | object | 是 | 是 | 电子凭证入账信息列表 最大请求量：10 |
| billType | string | 否 | 是 | 票据类型 1、增值税电子普通发票 2、增值税电子专用发票 16、铁路电子客票 17、非税收入一般缴款书 18、银行电子回单 19、收费公路通行费增值税电子普通发票 20-航空运输电子客票行程单；21-财政电子票据；22-数电票(增值税普通发票)；23-数电票(增值税专用发票) 示例：1 |
| billNum | string | 否 | 是 | 票据号码 示例：FP1234567890 |
| billAmount | number |
| 小数位数:6,最大长度:20 | 否 | 否 | 票据金额 示例：1000.000000 |
| issueDate | string | 否 | 否 | 开票日期 示例：2023-05-20 |
| accountEntityName | string | 否 | 否 | 会计主体名称 示例：某某公司 |
| accountDocumentNum | string | 否 | 否 | 记账凭证编号 示例：JZ20230520001 |
| postDate | string | 否 | 否 | 记账日期 示例：2023-05-20 |
| accountPeriod | string | 否 | 否 | 会计期间 示例：202305 |
| accountDocumentSummary | string | 否 | 否 | 记账凭证摘要 示例：差旅费报销 |
| guid | string | 否 | 否 | 凭证的外键唯一标识guid 示例：sdfsdfsdf |
| archiveStatus | string | 否 | 否 | 归档状态 0-未归档 30-已归档 示例：30 |
| archiveType | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 入账信息采集配置项 0--按照电子凭证匹配归档，1--按照记账凭证匹配归档 示例：0 |
| srcFileName | string | 否 | 是 | 文件名称 示例：voucher.pdf |
| filePath | string | 否 | 是 | 文件路径 示例：/files/voucher_20230520.pdf |
| realFileSize | number |
| 小数位数:0,最大长度:19 | 否 | 否 | 文件真实大小 示例：102400 |
| fileType | string | 否 | 否 | 文件类型 示例：pdf |

## 3. 请求示例

Url: /yonbip/FCC/v1/api/voucherEntry/batchInsert?access_token=访问令牌&orgCode=
Body: {
	"voucherEntryList": [
		{
			"billType": "1",
			"billNum": "FP1234567890",
			"billAmount": 1000,
			"issueDate": "2023-05-20",
			"accountEntityName": "某某公司",
			"accountDocumentNum": "JZ20230520001",
			"postDate": "2023-05-20",
			"accountPeriod": "202305",
			"accountDocumentSummary": "差旅费报销",
			"guid": "sdfsdfsdf",
			"archiveStatus": "30",
			"archiveType": 0,
			"srcFileName": "voucher.pdf",
			"filePath": "/files/voucher_20230520.pdf",
			"realFileSize": 102400,
			"fileType": "pdf"
		}
	]
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

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-17

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

