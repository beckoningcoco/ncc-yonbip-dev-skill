---
title: "条码扫描明细报表查询"
apiId: "1ec0c01f8b554134bbd23dd1eeabbf65"
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

# 条码扫描明细报表查询

> `ContentType	application/json` 请求方式	POST | 分类: Barcode Generation (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/barcode/record/list

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
| pageIndex | long | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | long | 否 | 是 | 每页行数，最大500 示例：10 默认值：10 |
| barcode | string | 否 | 否 | 条码 示例：00000111 |
| Product | string | 否 | 否 | 物料id 示例：1242535432135435 |
| Product_code | string | 否 | 否 | 物料编码 示例：0001123 |
| ProductSKU | string | 否 | 否 | 物料SKUid 示例：1425645675245354 |
| ProductSKU_code | string | 否 | 否 | 物料SKU编码 示例：0000111 |
| batchno | string | 否 | 否 | 批次号 示例：20240516003 |
| scanUser | string | 否 | 否 | 用户id 示例：1942565445464546 |
| scanType | int | 否 | 否 | 扫码类型，0-扫码；1-验货 示例：0 |
| vouchType | string | 否 | 否 | 单据类型（st_boxingrecord:装箱单;st_materialout:材料出库;st_osminrecord:委外入库;st_othinrecord:其他入库;st_othoutrecord:其他出库;st_purinrecord:采购入库;st_salesout:销售出库;st_storein:调拨入库;st_storeout:调拨出库;st_storeprorecord:产品入库;voucher_salereturn:销售退货） 示例：st_boxingrecord |
| org | string | 否 | 否 | 库存组织id 示例：1656466329652 |
| org_code | string | 否 | 否 | 库存组织编码 示例：0009556 |
| warehouse_code | string | 否 | 否 | 仓库编码 示例：0000545848 |
| warehouse | string | 否 | 否 | 仓库id 示例：119656523545656 |
| vouchdate_begin | string | 否 | 否 | 单据开始日期，日期格式：YYYY-MM-DD 示例：2021-11-19 |
| vouchdate_end | string | 否 | 否 | 单据结束日期，日期格式：YYYY-MM-DD 示例：2021-11-20 |
| code | string | 否 | 否 | 单据编号 示例：CGDD20221306110 |
| manageClass | string | 否 | 否 | 物料分类id 示例：1698956598953 |
| manageClass_code | string | 否 | 否 | 物料分类编码 示例：06958652 |
| shop | string | 否 | 否 | 商家id 示例：1656565979865526 |
| shop_code | string | 否 | 否 | 商家编码 示例：5456132 |

## 3. 请求示例

Url: /yonbip/scm/barcode/record/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"barcode": "00000111",
	"Product": "1242535432135435",
	"Product_code": "0001123",
	"ProductSKU": "1425645675245354",
	"ProductSKU_code": "0000111",
	"batchno": "20240516003",
	"scanUser": "1942565445464546",
	"scanType": 0,
	"vouchType": "st_boxingrecord",
	"org": "1656466329652",
	"org_code": "0009556",
	"warehouse_code": "0000545848",
	"warehouse": "119656523545656",
	"vouchdate_begin": "2021-11-19",
	"vouchdate_end": "2021-11-20",
	"code": "CGDD20221306110",
	"manageClass": "1698956598953",
	"manageClass_code": "06958652",
	"shop": "1656565979865526",
	"shop_code": "5456132"
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
| code | long | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | long | 否 | 当前页 示例：1 |
| pageSize | long | 否 | 分页大小 示例：20 |
| recordCount | long | 否 | 总记录数 示例：1 |
| pageCount | long | 否 | 页数 示例：1 |
| beginPageIndex | long | 否 | 查询开始页码 示例：1 |
| endPageIndex | long | 否 | 查询结束页 示例：1 |
| recordList | object | 是 | 返回结果对象 |
| sumRecordList | object | 否 | 返回汇总对象 |
| tablename | string | 否 | 报表临时表名 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordList": [
			{
				"warehouse": "",
				"invaliddate": "",
				"producedate": "",
				"batchno": "",
				"code": "DCCK20211222000001",
				"boxCode": "",
				"barcode": "00017707",
				"org": "2353524568904192",
				"org_name": "CSE全职能组织",
				"product": 2493727167960064,
				"product_cName": "条码档案打印01",
				"product_cCode": "000177",
				"productsku": 2493727167960065,
				"productsku_cCode": "123133",
				"productsku_cName": "条码档案打印01CSE蓝中",
				"qty": 1,
				"scanTime": "2021-12-22 13:49:29",
				"scanType": "1",
				"scanUser": "xxx",
				"propertiesValue": "",
				"free1": "",
				"stockUnit": 2353298199974144,
				"stockUnit_name": "11",
				"subQty": 1,
				"unit": 2353298199974144,
				"unit_name": "11",
				"unit_precision": 2,
				"vouchId": 2571504296366336,
				"vouchType": "st_storeout",
				"vouchdate": "2021-10-29 00:00:00",
				"warehouse_name": "",
				"skudefine1": "",
				"stockUnit_precision": 2
			}
		],
		"sumRecordList": {
			"subQty": 1,
			"stockUnit_precision": 2,
			"qty": 1,
			"unit_precision": 2
		},
		"tablename": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	单据结束日期需要大于等于单据开始日期	单据结束日期改为大于单据开始日期


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

