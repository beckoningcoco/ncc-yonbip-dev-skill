---
title: "自动生成条码档案"
apiId: "2283971816046723076"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Barcode Generation"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Barcode Generation]
platform_version: "BIP"
source_type: community-api-docs
---

# 自动生成条码档案

> `ContentType	application/json` 请求方式	POST | 分类: Barcode Generation (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/barcode/yonbip-scm-stock/api/barcode/generate

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
| barcodeType | number |
| 小数位数:0,最大长度:1 | 否 | 是 | 条码类型，支持类型【0：条码，1：箱码】 示例：0 |
| barcodeBasis | string | 否 | 否 | 生成条码数依据，支持类型【1：数量，2：件数，3：条码包装量，4：手工指定】 示例：1 |
| product_cCode | string | 否 | 否 | 条码类型为条码时，物料编码，SKU、物料至少录入一个，如果同时录入 SKU、物料，则以 SKU 为准； 示例：0105000002 |
| productsku_cCode | string | 否 | 否 | SKU编码，条码类型为条码时，SKU编码、物料编码至少录入一个，如果同时录入则以SKU编码为准；若物料开启了SKU管理，且通过物料编码和自由项特征组匹配到SKU则SKU编码可不填，若匹配不到SKU则SKU编码必填； 示例：000025 |
| barcodeRule_code | string | 否 | 是 | 条码规则编码，条码类型=条码时，传入编码必须满足条件：建档式规则、已经分配给当前物料或物料所属分类、条码类型=条码，外部码=否，不传入时，生码取物料的默认条码规则。 条码类型=箱码时，传入规则编码必须满足条件：建档式规则、条码类型=箱码、外部码=否； 示例：barcoderule001 |
| barcodeTag_cCode | string | 否 | 否 | 条码标签编码，传入时以传入为准，没有传入，首先取条码规则的条码标签， 取不到则取系统预置标签 示例：barcodetag001 |
| tarQty | string | 否 | 否 | 应生码数量 示例：10 |
| tarSubQty | string | 否 | 否 | 应生码件数 示例：10 |
| qty | string | 否 | 否 | 数量 |
| subQty | string | 否 | 否 | 件数 |
| barcodePackingQuantity | string | 否 | 否 | 条码包装量 |
| barcodeQty | number |
| 小数位数:0,最大长度:10 | 否 | 否 | 条码个数，条码生成依据是“手工指定”时非空； |
| stockUnit_code | string | 否 | 否 | 库存单位编码 |
| batchno | string | 否 | 否 | 批次号 |
| snCode | string | 否 | 否 | 序列号 |
| producedate | string | 否 | 否 | 生产日期 示例：2025-06-19 |
| invaliddate | string | 否 | 否 | 有效期至 示例：2025-07-18 |
| custom_code | string | 否 | 否 | 客户编码 |

## 3. 请求示例

Url: /yonbip/scm/barcode/yonbip-scm-stock/api/barcode/generate?access_token=访问令牌
Body: {
	"barcodeType": 0,
	"barcodeBasis": "1",
	"product_cCode": "0105000002",
	"productsku_cCode": "000025",
	"barcodeRule_code": "barcoderule001",
	"barcodeTag_cCode": "barcodetag001",
	"tarQty": "10",
	"tarSubQty": "10",
	"qty": "",
	"subQty": "",
	"barcodePackingQuantity": "",
	"barcodeQty": 0,
	"stockUnit_code": "",
	"batchno": "",
	"snCode": "",
	"producedate": "2025-06-19",
	"invaliddate": "2025-07-18",
	"custom_code": ""
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
| url | string | 否 | 获取生码进度的接口url 示例：/api/barcode/generate/process |
| asyncKey | string | 否 | 异步生码键值 示例：apiGenerateBarcode_08c579d3-a38d-4cb3-ab7c-d2b230620637 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"url": "/api/barcode/generate/process",
		"asyncKey": "apiGenerateBarcode_08c579d3-a38d-4cb3-ab7c-d2b230620637"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	生码失败


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

