---
title: "盘点差异单列表查询"
apiId: "2512c94e22ef4b1489282105e94e83a9"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inventory Variance Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inventory Variance Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 盘点差异单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Inventory Variance Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storecheckdifference/list

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
| status | int | 否 | 否 | 单据类型：0：开立、1：已审核、3：审核中 示例：0 |
| code | string | 否 | 否 | 单据编码 示例：PDCYD20210428000004 |
| stockOrg_name | long | 否 | 否 | 库存组织ID 示例：1916459579707648 |
| warehouse | long | 否 | 否 | 仓库ID 示例：2078745182310656 |
| details.product | long | 否 | 否 | 物料ID 示例：2172112037679360 |
| details.productsku | long | 否 | 否 | 物料skuID 示例：2172112046969088 |
| operator | long | 否 | 否 | 业务员id |
| pageIndex | int | 否 | 是 | 行号 示例：1 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 示例：10 默认值：10 |
| open_vouchdate_begin | string | 否 | 否 | 单据开始日期 示例：2021-04-27 00:00:00 |
| open_vouchdate_end | string | 否 | 否 | 单据截止日期 示例：2021-04-28 00:00:00 |
| isSum | boolean | 否 | 否 | 查询表头 示例：false 默认值：false |
| simpleVOs | object | 是 | 否 | 扩展查询条件 |
| field | string | 否 | 否 | 属性名(条件)，1：id(主表id)、2：details.batchno(批次号)、3：details.goodsposition(货位id) 、4：details.product.manageClass.name(物料分类名称)、5：pubts(时间戳)等等 示例：id |
| op | string | 否 | 否 | 比较符(条件)，1：eq(等于)、2：gt(大于)、3：lt(小于)等等 示例：eq |
| value1 | string | 否 | 否 | 值1(条件) 示例：2234488172844288 |
| value2 | string | 否 | 否 | 值2(条件) |

## 3. 请求示例

Url: /yonbip/scm/storecheckdifference/list?access_token=访问令牌
Body: {
	"status": 0,
	"code": "PDCYD20210428000004",
	"stockOrg_name": 1916459579707648,
	"warehouse": 2078745182310656,
	"details.product": 2172112037679360,
	"details.productsku": 2172112046969088,
	"operator": 0,
	"pageIndex": 1,
	"pageSize": 10,
	"open_vouchdate_begin": "2021-04-27 00:00:00",
	"open_vouchdate_end": "2021-04-28 00:00:00",
	"isSum": false,
	"simpleVOs": [
		{
			"field": "id",
			"op": "eq",
			"value1": "2234488172844288",
			"value2": ""
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | long | 否 | 当前页 示例：1 |
| pageSize | long | 否 | 分页大小 示例：10 |
| recordCount | long | 否 | 记录条数 示例：10 |
| recordList | object | 是 | 返回结果对象 |
| sumRecordList | object | 是 | 返回汇总对象 |
| storeCheckDifferenceCustomItem | object | 否 | 表头自定义项 |
| storeCheckDifferenceDetailCustomItem | object | 否 | 表体自定义项 |
| pageCount | long | 否 | 总页数 示例：1 |
| beginPageIndex | long | 否 | 开始页 示例：1 |
| endPageIndex | long | 否 | 结束页 示例：1 |
| pubts | string | 否 | 时间戳 示例：2021-04-28 15:24:43 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 10,
		"recordList": [
			{
				"productClass_name": "H-子类01-01",
				"stockUnit_name": "个（精度2）",
				"accountNUM": 0,
				"details_stockUnitId": 1836502351286528,
				"product_cCode": "0101000223",
				"stockOrg_name": "王章宇全职能",
				"profitlossnumber": -1,
				"warehouse_isGoodsPositionStock": true,
				"stockStatusDoc_name": "合格",
				"businesstype": "2178228647530752",
				"number": 0,
				"invaliddate": "2022-03-30 00:00:00",
				"product_cName": "效期物料子类01",
				"goodsposition": 2098776510124288,
				"isGoodsPosition": true,
				"stockUnitId_Precision": 2,
				"id": 2234488172844288,
				"details_unit": 1836502351286528,
				"unitName": "个（精度2）",
				"isWfControlled": true,
				"warehouse": 2078745182310656,
				"goodsposition_name": "名称1-1",
				"warehouse_isInvertedScour": false,
				"warehouse_name": "wzy货位仓",
				"productsku_cCode": "0101000223",
				"auditTime": "2021-04-28 11:59:19",
				"accountOrg_name": "王章宇全职能",
				"unit_Precision": 2,
				"status": 0,
				"returncount": 0,
				"verifystate": 0,
				"batchno": "123",
				"code": "PDCYD20210428000004",
				"reserveid": 0,
				"producedate": "2021-03-31 00:00:00",
				"stockStatusDoc": 2006555827382146,
				"details_productsku": 2172112046969088,
				"occurredqty": 0,
				"productsku_cName": "效期物料子类01",
				"vouchdate": "2021-04-28 00:00:00",
				"accountQty": 0,
				"pubts": "2021-04-28 11:59:19",
				"auditDate": "2021-04-28 00:00:00",
				"creator": "王章宇",
				"modifier": "王章宇",
				"modifyTime": "2021-04-28 11:59:19",
				"quantity": 0,
				"profitlossqty": -1,
				"stockOrg": "1916459579707648",
				"auditor": "王章宇",
				"accountOrg": "1916459579707648",
				"warehouse_iSerialManage": true,
				"details_id": 2234488172860672,
				"createTime": "2021-04-28 11:58:54",
				"businesstype_name": "普通盘点",
				"details_product": 2172112037679360,
				"occurrednum": 0,
				"department": 2172112037679322,
				"department_name": "测试部门",
				"operator": 2172112037679311,
				"operator_name": "测试业务员",
				"stockMgr": 2172112037679333,
				"stockMgr_name": "测试库管员",
				"memo": "备注",
				"storecheckplan": 2172112037679333,
				"propertiesValue": "123",
				"sourceid": 2172112037679344,
				"source": "st_storecheckplan",
				"upcode": "2172112037679366",
				"lineno": 10
			}
		],
		"sumRecordList": [
			{
				"number": 0,
				"quantity": 0,
				"accountQty": 0,
				"accountNUM": 0,
				"profitlossqty": 2,
				"profitlossnumber": 2,
				"occurredqty": 0,
				"occurrednum": 0
			}
		],
		"storeCheckDifferenceCustomItem": {
			"id": 0,
			"define1": "",
			"define2": "",
			"define3": "",
			"define4": "",
			"define5": "",
			"define6": "",
			"define7": "",
			"define8": "",
			"define9": "",
			"define10": "",
			"define11": "",
			"define12": "",
			"define13": "",
			"define14": "",
			"define15": "",
			"define16": "",
			"define17": "",
			"define18": "",
			"define19": "",
			"define20": "",
			"define21": "",
			"define22": "",
			"define23": "",
			"define24": "",
			"define25": "",
			"define26": "",
			"define27": "",
			"define28": "",
			"define29": "",
			"define30": ""
		},
		"storeCheckDifferenceDetailCustomItem": {
			"id": 0,
			"define1": "",
			"define2": "",
			"define3": "",
			"define4": "",
			"define5": "",
			"define6": "",
			"define7": "",
			"define8": "",
			"define9": "",
			"define10": "",
			"define11": "",
			"define12": "",
			"define13": "",
			"define14": "",
			"define15": "",
			"define16": "",
			"define17": "",
			"define18": "",
			"define19": "",
			"define20": "",
			"define21": "",
			"define22": "",
			"define23": "",
			"define24": "",
			"define25": "",
			"define26": "",
			"define27": "",
			"define28": "",
			"define29": "",
			"define30": ""
		},
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"pubts": "2021-04-28 15:24:43"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	入参错误等异常	根据返回错误信息做出相应调整


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

