---
title: "盘点差异单详情查询"
apiId: "94312e047ba54c578510a56487900cc0"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Inventory Variance Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inventory Variance Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 盘点差异单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Inventory Variance Document (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/storecheckdifference/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID    示例: 2245687257830144 |

## 3. 请求示例

Url: /yonbip/scm/storecheckdifference/detail?access_token=访问令牌&id=2245687257830144

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
| message | string | 否 | 返回消息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| returncount | long | 否 | 驳回次数 示例：0 |
| verifystate | long | 否 | 审核状态 0：开立、1：审核中、2：已审核 示例：0 |
| code | string | 否 | 单据编码 示例：PDCYD20210428000005 |
| masterOrgKeyField | string | 否 | 主组织key 示例：stockOrg |
| stockOrg_name | string | 否 | 库存状态名称 示例：王章宇全职能 |
| warehouse_isGoodsPositionStock | boolean | 否 | 仓库是否货位记存量管理 示例：false |
| businesstype | string | 否 | 业务类型id 示例：2178228647530752 |
| vouchdate | string | 否 | 单据日期 示例：2021-04-28 00:00:00 |
| isGoodsPosition | boolean | 否 | 是否货位管理 示例：false |
| details | object | 是 | 详情列表 |
| id | long | 否 | 主表id 示例：2234489781949696 |
| pubts | string | 否 | 时间戳 示例：2021-04-28 12:00:49 |
| createDate | string | 否 | 创建日期 示例：2021-04-28 00:00:00 |
| auditDate | string | 否 | 审批日期 示例：2021-04-28 00:00:00 |
| creator | string | 否 | 创建人 示例：王章宇 |
| isWfControlled | boolean | 否 | 是否开通审批流 示例：true |
| stockOrg | string | 否 | 库存组织id 示例：1916459579707648 |
| auditor | string | 否 | 审批人 示例：王章宇 |
| accountOrg | string | 否 | 会计主体id 示例：1916459579707648 |
| warehouse | long | 否 | 仓库id 示例：1916475579748608 |
| warehouse_iSerialManage | boolean | 否 | 仓库是否序列号管理 示例：false |
| transTypeKeyField | string | 否 | 业务类型key 示例：businesstype |
| warehouse_name | string | 否 | 仓库名称 示例：王章宇门店仓1 |
| warehouse_isInvertedScour | boolean | 否 | 是否倒冲仓 示例：false |
| createTime | string | 否 | 创建时间 示例：2021-04-28 12:00:33 |
| auditTime | string | 否 | 审批时间 示例：2021-04-28 12:00:49 |
| businesstype_name | string | 否 | 业务类型名称 示例：普通盘点 |
| department | long | 否 | 部门id 示例：1916475579748611 |
| department_name | string | 否 | 部门名称 示例：测试部门 |
| operator | long | 否 | 业务员id 示例：1916475579748622 |
| operator_name | string | 否 | 业务员名称 示例：测试业务员 |
| stockMgr | string | 否 | 库管员id 示例：1916475579748633 |
| stockMgr_name | string | 否 | 库管员名称 示例：测试库管员 |
| status | long | 否 | 单据状态 0：开立、1：已审核、3：审核中 示例：0 |
| modifier | string | 否 | 修改人 示例：王章宇 |
| modifyTime | string | 否 | 修改时间 示例：2021-04-28 12:00:33 |
| modifyDate | string | 否 | 修改日期 示例：2021-04-28 00:00:00 |
| storecheckplan | long | 否 | 盘点计划id 示例：1916475579748644 |
| memo | string | 否 | 备注 示例：备注 |
| storeCheckDifferenceCustomItem | object | 否 | 表头自定义项 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"returncount": 0,
		"verifystate": 0,
		"code": "PDCYD20210428000005",
		"masterOrgKeyField": "stockOrg",
		"stockOrg_name": "王章宇全职能",
		"warehouse_isGoodsPositionStock": false,
		"businesstype": "2178228647530752",
		"vouchdate": "2021-04-28 00:00:00",
		"isGoodsPosition": false,
		"details": [
			{
				"productClass_name": "租户级分类1",
				"stockUnit_name": "件（精度2）",
				"reserveid": 0,
				"accountNUM": 0,
				"product_cCode": "0000000001",
				"stockStatusDoc": 2006555827382146,
				"profitlossnumber": 1,
				"stockStatusDoc_name": "合格",
				"productsku_cName": "sm店内加工成品444（订制）",
				"occurredqty": 0,
				"number": 0,
				"product_cName": "sm店内加工成品444（订制）",
				"accountQty": 0,
				"isBatchManage": false,
				"isExpiryDateManage": false,
				"stockUnitId_Precision": 2,
				"id": 2234489781966080,
				"mainid": 2234489781949696,
				"isSerialNoManage": false,
				"rowno": 1,
				"product": 1955747133018368,
				"quantity": 0,
				"unitName": "件（精度2）",
				"profitlossqty": 1,
				"unitExchangeType": 0,
				"unit": 1836523958194432,
				"productsku": 1955747158315264,
				"productsku_cCode": "0000000001",
				"unit_Precision": 2,
				"occurrednum": 0,
				"goodsposition_name": "测试货位",
				"goodsposition": 1955747158315277,
				"batchno": "123",
				"expireDateUnit": "天",
				"expireDateNo": "10",
				"invaliddate": "2021-05-08 00:00:00",
				"producedate": "2021-04-28 00:00:00",
				"invExchRate": 1,
				"upcode": "1955747158315277",
				"source": "st_storecheckplan",
				"sourceid": 1955747158315255,
				"memo": "备注",
				"storeCheckDifferenceDetailSNs": {
					"id": 2245747539809025,
					"detailid": 2245747539809024,
					"grandpaid": 2245747539792640,
					"sn": "22",
					"pubts": "2021-05-06 10:52:32"
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
				}
			}
		],
		"id": 2234489781949696,
		"pubts": "2021-04-28 12:00:49",
		"createDate": "2021-04-28 00:00:00",
		"auditDate": "2021-04-28 00:00:00",
		"creator": "王章宇",
		"isWfControlled": true,
		"stockOrg": "1916459579707648",
		"auditor": "王章宇",
		"accountOrg": "1916459579707648",
		"warehouse": 1916475579748608,
		"warehouse_iSerialManage": false,
		"transTypeKeyField": "businesstype",
		"warehouse_name": "王章宇门店仓1",
		"warehouse_isInvertedScour": false,
		"createTime": "2021-04-28 12:00:33",
		"auditTime": "2021-04-28 12:00:49",
		"businesstype_name": "普通盘点",
		"department": 1916475579748611,
		"department_name": "测试部门",
		"operator": 1916475579748622,
		"operator_name": "测试业务员",
		"stockMgr": "1916475579748633",
		"stockMgr_name": "测试库管员",
		"status": 0,
		"modifier": "王章宇",
		"modifyTime": "2021-04-28 12:00:33",
		"modifyDate": "2021-04-28 00:00:00",
		"storecheckplan": 1916475579748644,
		"memo": "备注",
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
		}
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

