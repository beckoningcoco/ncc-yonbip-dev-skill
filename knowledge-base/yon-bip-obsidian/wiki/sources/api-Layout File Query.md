---
title: "版式文件查询"
apiId: "1847888797142876169"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Outbound Enterprise Invoice Folder"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Outbound Enterprise Invoice Folder]
platform_version: "BIP"
source_type: community-api-docs
---

# 版式文件查询

> `ContentType	application/json` 请求方式	POST | 分类: Outbound Enterprise Invoice Folder (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/output-tax/api/einvoice/getbsfile

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
| nsrsbh | string | 否 | 否 | 纳税人识别号 示例：213232 |
| fplx | string | 否 | 否 | 1：增值税电子普通发票； 2：增值税电子专用发票； 3：增值税普通发票； 4：增值税专用发票 、增值税专用发票(机动车)； 5：机动车销售统一发票； 8：增值税电子普通发票（成品油）； 10：成品油普通发票； 11：成品油专用发票； 15：二手车销售统一发票； 31：数电专用发票； 32：数电普通发票； 33：数电纸质发票(增值税专用发票)； 34：数电纸质发票(普通发票)； 示例：1 |
| slfphm | string | 否 | 否 | 数电发票号码；数电发票号码与发票号码+发票代码，不能同时为空 示例：12212323 |
| fpdm | string | 否 | 否 | 发票代码；数电发票号码与发票号码+发票代码，不能同时为空 示例：12132302 |
| fphm | string | 否 | 否 | 发票号码；数电发票号码与发票号码+发票代码，不能同时为空 示例：12232 |
| dataType | string | 否 | 否 | 文件返回类型。1、base64文件流 2、下载地址 3、两者皆返回。默认为1。 示例：1 |
| yypdf | string | 否 | 否 | 用友自画pdf；税控电子普通发票有该版式。取值范围：0-无需返回，1-需要返回，空值默认为0 示例：1 |
| taxpdf | string | 否 | 否 | 税局pdf；取值范围：0-无需返回，1-需要返回，空值默认为0 示例：1 |
| taxofd | string | 否 | 否 | 税局ofd；取值范围：0-无需返回，1-需要返回，空值默认为0 示例：1 |
| taxxml | string | 否 | 否 | 税局xml；取值范围：0-无需返回，1-需要返回，空值默认为0 示例：1 |

## 3. 请求示例

Url: /yonbip/tax/output-tax/api/einvoice/getbsfile?access_token=访问令牌
Body: {
	"nsrsbh": "213232",
	"fplx": "1",
	"slfphm": "12212323",
	"fpdm": "12132302",
	"fphm": "12232",
	"dataType": "1",
	"yypdf": "1",
	"taxpdf": "1",
	"taxofd": "1",
	"taxxml": "1"
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回状态码 示例：200 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| yypdf | string | 否 | 用友自画pdf 示例：文件流base64字符串 |
| taxpdf | string | 否 | 税务pdf 示例：文件流base64字符串 |
| taxofd | string | 否 | 税局ofd 示例：文件流base64字符串 |
| taxxml | string | 否 | 税局xml 示例：文件流base64字符串 |
| yypdfUrl | string | 否 | PDF（有发票章）下载地址 示例：http://yonbip-pre.yonyoucloud.com/111 |
| taxpdfUrl | string | 否 | PDF（无发票章）下载地址 示例：http://yonbip-pre.yonyoucloud.com/111 |
| taxofdUrl | string | 否 | OFD下载地址 示例：http://yonbip-pre.yonyoucloud.com/111 |
| taxxmlUrl | string | 否 | XML下载地址 示例：http://yonbip-pre.yonyoucloud.com/111 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"yypdf": "文件流base64字符串",
		"taxpdf": "文件流base64字符串",
		"taxofd": "文件流base64字符串",
		"taxxml": "文件流base64字符串",
		"yypdfUrl": "http://yonbip-pre.yonyoucloud.com/111",
		"taxpdfUrl": "http://yonbip-pre.yonyoucloud.com/111",
		"taxofdUrl": "http://yonbip-pre.yonyoucloud.com/111",
		"taxxmlUrl": "http://yonbip-pre.yonyoucloud.com/111"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	数电发票号码为空！发票代码和发票号码是必填项目	请按照提示修改


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-10-13

新增

请求参数 dataType

更新

请求参数 (4)

新增

返回参数 (4)

2	2025-07-03

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

