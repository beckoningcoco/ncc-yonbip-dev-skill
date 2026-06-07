---
title: "入库通知单详情查询"
apiId: "1674105529772277768"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Receipt Notice"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Receipt Notice]
platform_version: "BIP"
source_type: community-api-docs
---

# 入库通知单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Receipt Notice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/stock/storenotice/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 单据id(当id和code同时传值以id优先级)    示例: 1671135997942300711 |
| code | string | query | 否 | 单据编号(当id和code同时传值以id优先级)    示例: RKTZ001320230302000003 |

## 3. 请求示例

Url: /yonbip/sd/stock/storenotice/detail?access_token=访问令牌&id=1671135997942300711&code=RKTZ001320230302000003

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 状态码 示例：200 |
| message | string | 否 | 状态消息 示例：操作成功 |
| data | object | 否 | 返回结果 |
| outaccount_name | string | 否 | 调出会计主体名称 示例：福建品品香茶业有限公司 |
| outorg_name | string | 否 | 调出组织名称 示例：福建品品香茶业有限公司 |
| code | string | 否 | 单据编号 示例：RKTZ001320230302000003 |
| masterOrgKeyField | string | 否 | 主组织字段 示例：inorg |
| bustype_name | string | 否 | 交易类型名称 示例：补货通知 |
| outorg | string | 否 | 调出组织ID 示例：2213458687529217 |
| memo | string | 否 | 备注 示例：YHSQ001320230302000001_2023-03-02 11:47:23_来自福州金源店 |
| inStore_name | string | 否 | 调入门店名称 示例：福州金源店 |
| inorg_name | string | 否 | 调入组织名称 示例：金源店 |
| srcBill | string | 否 | 来源单据ID 示例：1001A1100000002FDOO9 |
| outWarehouse_name | string | 否 | 调出仓库ID 示例：包装成品仓 |
| inaccount_name | string | 否 | 调入会计主体名称 示例：金源店 |
| inaccount | string | 否 | 调入会计主体ID 示例：2213458687529216 |
| vouchdate | string | 否 | 单据日期 示例：2023-03-02 00:00:00 |
| inWarehouse_iSerialManage | boolean | 否 | 调入仓库是否序列号管理 示例：false |
| bizstatus | long | 否 | 业务状态(0待入库1已完成2已关闭) 示例：0 |
| inStore | long | 否 | 调入门店ID 示例：2214978517425152 |
| inWarehouse_name | string | 否 | 调入仓库名称 示例：福州金源店仓库 |
| details | object | 是 | 明细集合 |
| id | long | 否 | 通知单id 示例：1671135997942300711 |
| warehouse_isGoodsPosition | boolean | 否 | 是否货位管理(true是,false否） 示例：false |
| pubts | DateTime | 否 | 时间戳 示例：2023-03-04 17:49:13 |
| tplid | long | 否 | 模版id 示例：0 |
| bustype_extend_attrs_json | string | 否 | 交易类型扩展属性 示例：{"storeNoticeType":"1"} |
| createDate | DateTime | 否 | 创建日期 示例：2023-03-02 00:00:00 |
| outWarehouse | long | 否 | 调出仓库id 示例：2216271173079296 |
| creator | string | 否 | 创建人 示例：默认用户 |
| inWarehouse | long | 否 | 调入仓库id 示例：2284683049308928 |
| srcTop | string | 否 | 源头单据id 示例：1669700868972740608 |
| srcTopNO | string | 否 | 源头单据号 示例：YHSQ001320230228000001 |
| inorg | string | 否 | 调入组织id 示例：2213458687529216 |
| outaccount | string | 否 | 调出会计主体id 示例：2213458687529217 |
| srcBillNO | string | 否 | 来源单据号 示例：DC2023030200011279 |
| store | long | 否 | 门店id 示例：2214978517425152 |
| srcBillType | long | 否 | 来源单据标识 示例：0 |
| transTypeKeyField | string | 否 | 交易类型key 示例：bustype |
| bustype | string | 否 | 交易类型id 示例：2084417272566038 |
| createTime | DateTime | 否 | 创建时间 示例：2023-03-02 16:30:36 |
| status | long | 否 | 单据状态(0待入库1已完成2已关闭) 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"outaccount_name": "福建品品香茶业有限公司",
		"outorg_name": "福建品品香茶业有限公司",
		"code": "RKTZ001320230302000003",
		"masterOrgKeyField": "inorg",
		"bustype_name": "补货通知",
		"outorg": "2213458687529217",
		"memo": "YHSQ001320230302000001_2023-03-02 11:47:23_来自福州金源店",
		"inStore_name": "福州金源店",
		"inorg_name": "金源店",
		"srcBill": "1001A1100000002FDOO9",
		"outWarehouse_name": "包装成品仓",
		"inaccount_name": "金源店",
		"inaccount": "2213458687529216",
		"vouchdate": "2023-03-02 00:00:00",
		"inWarehouse_iSerialManage": false,
		"bizstatus": 0,
		"inStore": 2214978517425152,
		"inWarehouse_name": "福州金源店仓库",
		"details": [
			{
				"product_modelDescription": "120g（6g*20）",
				"batchno": "2023022001540301",
				"stockUnit_name": "套",
				"oriTax": 0,
				"product_cCode": "401020040008",
				"inqty": 4,
				"natTax": 0,
				"productsku_cName": "山海2013白毫银针",
				"subQty": 4,
				"product_cName": "山海2013白毫银针",
				"isBatchManage": true,
				"isExpiryDateManage": false,
				"isGift": false,
				"stockUnitId_Precision": 2,
				"id": 1671135997942300712,
				"mainid": 1671135997942300711,
				"pubts": "2023-03-04 17:49:13",
				"isSerialNoManage": false,
				"closeqty": 0,
				"rowno": 0,
				"product": 1529210470083854351,
				"unitName": "套",
				"productsku_modelDescription": "120g（6g*20）",
				"oriSum": 0,
				"detailid": 1671135997942300712,
				"oriUnitPrice": 0,
				"natSum": 0,
				"taxRate": 0,
				"unit": 2214821695774464,
				"productsku": 1529210478673788945,
				"productsku_cCode": "401020040008",
				"unit_Precision": 2,
				"qty": 4,
				"srcBillRow": "1001A1100000002FDOOH",
				"oriTaxUnitPrice": 0,
				"oriMoney": 0,
				"invExchRate": 1,
				"srcTopRow": "1669700868972740609",
				"natTaxUnitPrice": 0,
				"natMoney": 0,
				"stockUnitId": 2214821695774464,
				"natUnitPrice": 0
			}
		],
		"id": 1671135997942300711,
		"warehouse_isGoodsPosition": false,
		"pubts": "2023-03-04 17:49:13",
		"tplid": 0,
		"bustype_extend_attrs_json": "{\"storeNoticeType\":\"1\"}",
		"createDate": "2023-03-02 00:00:00",
		"outWarehouse": 2216271173079296,
		"creator": "默认用户",
		"inWarehouse": 2284683049308928,
		"srcTop": "1669700868972740608",
		"srcTopNO": "YHSQ001320230228000001",
		"inorg": "2213458687529216",
		"outaccount": "2213458687529217",
		"srcBillNO": "DC2023030200011279",
		"store": 2214978517425152,
		"srcBillType": 0,
		"transTypeKeyField": "bustype",
		"bustype": "2084417272566038",
		"createTime": "2023-03-02 16:30:36",
		"status": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	错误信息	请联系管理员


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

