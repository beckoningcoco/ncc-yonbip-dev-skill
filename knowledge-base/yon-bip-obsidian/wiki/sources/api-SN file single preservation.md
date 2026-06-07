---
title: "序列号档案单个保存"
apiId: "9509ff03394147a6a124f8788db2b329"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sequence Number"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sequence Number]
platform_version: "BIP"
source_type: community-api-docs
---

# 序列号档案单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Sequence Number (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/SNstate/save

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
| data | object | 否 | 是 | 序列号档案保存请求数据 |
| batchno | string | 否 | 否 | 批次号，批次管理商品必输 示例：20240412003 |
| producedate | string | 否 | 否 | 生产日期，效期管理商品必输，如"2021-10-08" 示例：2024-10-08 |
| invaliddate | string | 否 | 否 | 有效期至，效期管理商品必输，如："2021-10-08" 示例：2024-10-08 |
| sn | string | 否 | 是 | 序列号 示例：testta013 |
| snstate | string | 否 | 是 | 序列号状态，1代表在库，2表示出库 示例：2 |
| createDate | string | 否 | 否 | 创建日期，如“2021-08-10” 示例：2021-10-08 |
| org | string | 否 | 是 | 库存组织，传入id或者code 示例：2345083323961856 |
| warehouse | string | 否 | 是 | 仓库，传入id或code 示例：2345141612155136 |
| location | string | 否 | 否 | 货位，传入id或code，仓库开启货位记存量时必输 示例：16953564984 |
| product | string | 否 | 是 | 物料，传入id或code 示例：2346447753138432 |
| productsku | string | 否 | 否 | 物料SKU，传入id或code（未启用特征必填） 示例：2346447759315200 |
| propertiesValue | string | 否 | 否 | 规格 示例：3213213 |
| product_model | string | 否 | 否 | 型号 示例：213213 |
| product_modelDescription | string | 否 | 否 | 规格说明 示例：test |
| reserveid | string | 否 | 否 | 预留对象，传入id或code 示例：1234565678745 |
| inventoryowner | string | 否 | 否 | 货主传入id或code 示例：1567867865687 |
| _status | string | 否 | 是 | 操作标识，Insert:新增 示例：Insert |

## 3. 请求示例

Url: /yonbip/scm/SNstate/save?access_token=访问令牌
Body: {
	"data": {
		"batchno": "20240412003",
		"producedate": "2024-10-08",
		"invaliddate": "2024-10-08",
		"sn": "testta013",
		"snstate": "2",
		"createDate": "2021-10-08",
		"org": "2345083323961856",
		"warehouse": "2345141612155136",
		"location": "16953564984",
		"product": "2346447753138432",
		"productsku": "2346447759315200",
		"propertiesValue": "3213213",
		"product_model": "213213",
		"product_modelDescription": "test",
		"reserveid": "1234565678745",
		"inventoryowner": "1567867865687",
		"_status": "Insert"
	}
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
| code | string | 否 | 请求返回编码 示例：200 |
| message | string | 否 | 请求返回消息 示例：操作成功 |
| data | object | 否 | 返回数据集 |
| successCountAI | string | 否 | 成功 示例：1 |
| failCountAI | string | 否 | 失败 示例：0 |
| sucessCount | string | 否 | 成功次数 示例：1 |
| failCount | string | 否 | 失败次数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"successCountAI": "1",
		"failCountAI": "0",
		"sucessCount": "1",
		"failCount": "0",
		"messages": [
			""
		],
		"infos": [
			{
				"id": 1876286767517952,
				"sn": "00002",
				"product": "1870940199702784",
				"product_modelDescription": "大",
				"product_cCode": "01000002",
				"stockStatusDoc": "2006555827382222",
				"reserveid": "",
				"reserveid_name": "",
				"inventoryowner": "0",
				"warehouse": "仓库ID",
				"updatecount": "4",
				"productsku": "1870940205322496",
				"snstate": "2",
				"org": "1849708902551808",
				"product_model": "小",
				"createDate": "2020-08-21 00:00:00",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"store": "",
				"location": "",
				"fromApi_ustock": "true",
				"warehouse_isGoodsPositionStock": "false",
				"warehouse_iSerialManage": "true",
				"bwhsnctl": "true",
				"pubts": "2020-12-22 11:12:54",
				"tenant": "1848118557348096",
				"yTenantId": "qk8j0gzi"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

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

