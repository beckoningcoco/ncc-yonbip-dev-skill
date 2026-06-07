---
title: "单个新增外部条码档案"
apiId: "4fa6c3d832ee4896aefd261aa2fec0f5"
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

# 单个新增外部条码档案

> `ContentType	application/json` 请求方式	POST | 分类: Barcode Generation (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/barcode/file/save

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
| data | object | 是 | 否 | data |
| barcode | string | 否 | 是 | 条码 示例：000003000003012 |
| barcodeType | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 条码类型，支持类型【0-条码，1-箱码】，默认为条码 示例：0 默认值：0 |
| barcodeRule_name | string | 否 | 否 | 条码规则编码，条码类型=条码时，传入编码必须满足条件：建档式规则、已经分配给当前物料或物料所属分类、条码类型=条码，外部码=是，不传入时，生码取物料的默认条码规则。 条码类型=箱码时，条码规则编码非必填，若传入规则编码此规则必须满足条件：建档式规则、条码类型=箱码、外部码=是； 示例：BCD001 |
| product_cCode | string | 否 | 否 | 物料编码，SKU编码、物料编码至少录入一个，如果同时录入则以SKU编码为准 示例：000001 |
| productsku_cCode | string | 否 | 否 | SKU编码，SKU编码、物料编码至少录入一个，如果同时录入则以SKU编码为准；若物料开启了SKU管理，且通过物料编码和自由项特征组匹配到SKU则SKU编码可不填，若匹配不到SKU则SKU编码必填； 示例：000003 |
| free1 | string | 否 | 否 | 规格1（支持free1-10） 示例：free1 |
| barcodeTag_cCode | string | 否 | 否 | 条码标签，传入时以传入为准，没有传入，首先取条码规则的条码标签， 取不到则取系统预置标签 示例：000456 |
| qty | string | 否 | 否 | 数量，条码类型为条码时必填 示例：1.00 |
| subQty | string | 否 | 否 | 件数 示例：2 |
| stockUnit_code | string | 否 | 否 | 库存单位编码 示例：LTR |
| custom_code | string | 否 | 否 | 客户编码 示例：TMDA20240526 |
| sourceid | string | 否 | 否 | 上游单据主表id，有来源时必输 示例：2056309970742280198 |
| sourceautoid | string | 否 | 否 | 上游单据子表id，有来源时必输 示例：2058492870715768838 |
| source | string | 否 | 否 | 来源单据类型，voucher_delivery:销售发货,st_storeprorecord:产品入库,st_purinrecord:采购入库,st_osminrecord:委外入库单,st_othoutrecord:其他出库单,st_salesout:销售出库单,st_storeout:调出单,st_purchaseorder:采购订单,po_finished_report:完工报告,reservechange:存量生码,sfc_proceTaskReport:工序任务汇报 示例：st_storeprorecord |
| upcode | string | 否 | 否 | 来源单据号，有来源必输 示例：XSCK20230306000009 |

## 3. 请求示例

Url: /yonbip/scm/barcode/file/save?access_token=访问令牌
Body: {
	"data": [
		{
			"barcode": "000003000003012",
			"barcodeType": 0,
			"barcodeRule_name": "BCD001",
			"product_cCode": "000001",
			"productsku_cCode": "000003",
			"free1": "free1",
			"barcodeTag_cCode": "000456",
			"qty": "1.00",
			"subQty": "2",
			"stockUnit_code": "LTR",
			"custom_code": "TMDA20240526",
			"sourceid": "2056309970742280198",
			"sourceautoid": "2058492870715768838",
			"source": "st_storeprorecord",
			"upcode": "XSCK20230306000009"
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
| code | long | 否 | 请求返回编码 示例：200 |
| message | string | 否 | 请求返回消息 示例：操作成功 |
| data | object | 否 | 返回数据集 |
| count | long | 否 | 记录总数 示例：1 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | object | 是 | 失败信息 |
| infos | object | 是 | 成功信息 |
| failInfos | string | 是 | 错误信息 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{
				"key": "",
				"message": ""
			}
		],
		"infos": [
			{
				"key": "123456"
			}
		],
		"failInfos": [
			""
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	条码：xxx已经存在，请检查！	填写不在库的条码

"failCount": 1	数量只能为正数，请检查导入数据！	数量填写正数


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-05-30

更新

请求说明

更新

请求参数 barcodeType

1


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

