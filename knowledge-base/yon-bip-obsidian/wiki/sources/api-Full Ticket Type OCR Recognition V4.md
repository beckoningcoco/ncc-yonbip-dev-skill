---
title: "全票种ocr识别V4V3"
apiId: "2060927799320379397"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Input Tax Invoice Management"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Input Tax Invoice Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 全票种ocr识别V4V3

> `ContentType	application/json` 请求方式	POST | 分类: Input Tax Invoice Management (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/input-tax/api/ocr/v4/recognise

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
| nsrsbh | string | 否 | 否 | 纳税人识别号，可选参数，若传值则必须传对，否则会提示未找到纳税主体；和orgcode一起，二者只需传其一，二者都传的时候，以orgcode优先；若不传，则票据识别统计菜单将统计不到会计主体 示例：9133021261028176X3 |
| orgcode | string | 否 | 否 | 税务组织的编码，可选参数，若传值则必须传对，否则会提示未找到纳税主体；和nsrsbh一起，二者只需传其一，二者都传的时候，以orgcode优先；若不传，则票据识别统计菜单将统计不到会计主体 示例：0101 |
| file | string | 否 | 是 | 图片、pdf、ofd的base64编码字符串，字符串大小不得超过8M |

## 3. 请求示例

Url: /yonbip/tax/input-tax/api/ocr/v4/recognise?access_token=访问令牌
Body: {
	"nsrsbh": "9133021261028176X3",
	"orgcode": "0101",
	"file": ""
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
| message | string | 否 | 状态描述 |
| data | object | 是 | ocr识别结果 |
| imageId | string | 否 | 文件的id，传入图片被上传后产生的文件id |
| billType | string | 否 | 票据类型，invoice:增值税发票tolls:过路费train:火车票quota:定额发票machine:机打发票taxi:出租车发票passenger:客运发票air:航空电子行程单other:其他发票nontax:非税发票custbook:海关缴款书tax_payment_proof:完税证明 示例：invoice |
| data | object | 否 | 票据对象实际数据，不同的票据，字段不一样；发票信息 见开放平台接口信息补充描述-进项发票管理fapiao.yonyoucloud.com/apidoc/appendix/ |
| coordinate | object | 否 | 切图坐标信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": [
		{
			"imageId": "",
			"billType": "invoice",
			"data": {},
			"coordinate": {
				"startX": 0,
				"startY": 0,
				"endX": 1579,
				"endY": 1039
			}
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-11

更新

请求说明

接口请求头增加常量参数

2	2025-07-04

更新

请求参数 orgcode

更新

请求参数 file

会计主体的称呼改为税务组织


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

