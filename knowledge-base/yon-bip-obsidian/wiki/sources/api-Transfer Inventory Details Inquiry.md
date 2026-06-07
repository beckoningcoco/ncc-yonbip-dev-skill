---
title: "转库详情查询"
apiId: "9932d88c7cb247abaa3e72b98175cef2"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Stock Transfer Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Stock Transfer Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 转库详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Stock Transfer Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storetransfer/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 业务数据ID，注意ID与单据编号不能同时为空 |
| code | string | query | 否 | 单据编号，注意ID与单据编号不能同时为空 |

## 3. 请求示例

Url: /yonbip/scm/storetransfer/detail?access_token=访问令牌&id=&code=

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
| message | string | 否 | 响应结果描述信息 示例：操作成功 |
| data | object | 否 | 转库单详情 |
| totalPieces | float | 否 | 整单件数 示例：1 |
| verifystate | int | 否 | 审批状态，0：初始开立；1：审核中；2:已审核；4：提交后驳回开立态； 示例：2 |
| code | string | 否 | 单据编号 示例：ZK20220402000001 |
| shop | long | 否 | 商家id 示例：-1 |
| outWarehouse_name | string | 否 | 出库仓库名称 示例：CSE普仓1 |
| businesstype | string | 否 | 交易类型ID 示例：2352475250577923 |
| vouchdate | string | 否 | 单据日期（格式：yyyy-MM-dd HH:mm:ss） 示例：2022-04-02 00:00:00 |
| inWarehouse_iSerialManage | boolean | 否 | 入库仓是否序列号严格管理，true：是；false：否； 示例：false |
| totalQuantity | long | 否 | 整单数量 示例：1 |
| inWarehouse_name | string | 否 | 入库仓库名称 示例：95普通仓01 |
| details | object | 是 | 转库单子表数据 |
| id | long | 否 | 转库单ID 示例：2714695188681728 |
| warehouse_isGoodsPosition | boolean | 否 | 出仓库是否货位管理，true：是；false：否； 示例：false |
| org_name | string | 否 | 库存组织 示例：95总公司 |
| outWarehouse_isGoodsPositionStock | boolean | 否 | 出库仓库货位是否记存量，true：是；false：否； 示例：false |
| pubts | string | 否 | 时间戳（格式yyyy-MM-dd HH:mm:ss） 示例：2022-04-02 17:30:51 |
| createDate | string | 否 | 创建日期（格式yyyy-MM-dd HH:mm:ss） 示例：2022-04-02 00:00:00 |
| auditDate | string | 否 | 审核日期（格式yyyy-MM-dd HH:mm:ss） 示例：2022-04-02 00:00:00 |
| outWarehouse | long | 否 | 出库仓库id 示例：2355082071216384 |
| outWarehouse_iSerialManage | boolean | 否 | 出库仓是否序列号严格管理，true：是；false：否； 示例：false |
| creator | string | 否 | 创建人 示例：zhouchunbo |
| inWarehouse | long | 否 | 入库仓库id 示例：2371751753961728 |
| org | string | 否 | 组织id 示例：2371682382681600 |
| isWfControlled | boolean | 否 | 是否为审批流控制，true：是；false：否； 示例：false |
| auditor | string | 否 | 审核者 示例：zhouchunbo |
| accountOrg | string | 否 | 会计主体id 示例：2371682382681600 |
| transTypeKeyField | string | 否 | 交易类型字段 示例：businesstype |
| inWarehouse_isGoodsPosition | boolean | 否 | 入库仓是否货位管理，true：是；false：否； 示例：false |
| barCode | string | 否 | 单据条码 示例：st_storetransfer|2714695188681728 |
| createTime | string | 否 | 创建时间（格式yyyy-MM-dd HH:mm:ss） 示例：2022-04-02 17:30:45 |
| auditTime | string | 否 | 审核时间（格式yyyy-MM-dd HH:mm:ss） 示例：2022-04-02 17:30:51 |
| accountOrg_name | string | 否 | 会计主体名称 示例：95总公司 |
| ownertype | long | 否 | 货权归属，0:自有； |
| inWarehouse_isGoodsPositionStock | boolean | 否 | 入库仓库货位是否记存量，true：是；false：否； 示例：false |
| businesstype_name | string | 否 | 交易类型名称 示例：转库单 |
| inventoryowner | long | 否 | 货主对象 |
| status | long | 否 | 单据状态，0:开立状态；3:审核中；1:已审核； 示例：1 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"totalPieces": 1,
		"verifystate": 2,
		"code": "ZK20220402000001",
		"shop": -1,
		"outWarehouse_name": "CSE普仓1",
		"businesstype": "2352475250577923",
		"vouchdate": "2022-04-02 00:00:00",
		"inWarehouse_iSerialManage": false,
		"totalQuantity": 1,
		"inWarehouse_name": "95普通仓01",
		"details": [
			{
				"stockUnit_name": "个",
				"product_cCode": "000003",
				"productsku_cName": "CSE普通物料1",
				"subQty": 1,
				"outStockStatusDoc_name": "合格",
				"product_cName": "CSE普通物料1",
				"isBatchManage": false,
				"isExpiryDateManage": false,
				"stockUnitId_Precision": 2,
				"id": 2714695188681729,
				"mainid": 2714695188681728,
				"pubts": "2022-04-02 17:30:46",
				"isSerialNoManage": false,
				"outStockStatusDoc": 2346257360557210,
				"product": 2353530315116800,
				"unitName": "个",
				"unitExchangeType": 0,
				"inStockStatusDoc": 2346257360557210,
				"unit": 2353530000216320,
				"lineno": 10,
				"productsku": 2353530322587904,
				"productsku_cCode": "000003",
				"ownertype": 0,
				"qty": 1,
				"unit_Precision": 2,
				"detailsid": 2714695188681729,
				"inStockStatusDoc_name": "合格",
				"invExchRate": 1,
				"inventoryowner": 0,
				"stockUnitId": 2353530000216320,
				"storeTransDetailSNs": {
					"id": 0,
					"detailid": 0,
					"grandpaid": 0,
					"sn": "",
					"pubts": ""
				}
			}
		],
		"id": 2714695188681728,
		"warehouse_isGoodsPosition": false,
		"org_name": "95总公司",
		"outWarehouse_isGoodsPositionStock": false,
		"pubts": "2022-04-02 17:30:51",
		"createDate": "2022-04-02 00:00:00",
		"auditDate": "2022-04-02 00:00:00",
		"outWarehouse": 2355082071216384,
		"outWarehouse_iSerialManage": false,
		"creator": "zhouchunbo",
		"inWarehouse": 2371751753961728,
		"org": "2371682382681600",
		"isWfControlled": false,
		"auditor": "zhouchunbo",
		"accountOrg": "2371682382681600",
		"transTypeKeyField": "businesstype",
		"inWarehouse_isGoodsPosition": false,
		"barCode": "st_storetransfer|2714695188681728",
		"createTime": "2022-04-02 17:30:45",
		"auditTime": "2022-04-02 17:30:51",
		"accountOrg_name": "95总公司",
		"ownertype": 0,
		"inWarehouse_isGoodsPositionStock": false,
		"businesstype_name": "转库单",
		"inventoryowner": 0,
		"status": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

310008	参数校验失败，参数[pageSize]是必填的。	输入pagesize参数即可


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

