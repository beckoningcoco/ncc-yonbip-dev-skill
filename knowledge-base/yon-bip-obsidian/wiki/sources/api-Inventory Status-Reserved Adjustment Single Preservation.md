---
title: "库存状态/预留调整单个保存"
apiId: "1430631444324024320"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Adjustment Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Adjustment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 库存状态/预留调整单个保存

> `ContentType	application/json` 请求方式	POST | 分类: Adjustment Document (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/stockstatuschange/single/save

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 调整单参数 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 否 | 主键ID，编辑时使用 示例：123456789 |
| org | string | 否 | 是 | 库存组织id或code |
| operator | string | 否 | 否 | 业务员id或code |
| stockMgr | string | 否 | 否 | 库管员id或code |
| code | string | 否 | 否 | 单据编码（为空时，系统自动生成） 示例：TZD20220412000006 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2022-04-12 00:00:00 |
| changeType | string | 否 | 是 | 单据类型（库存状态调整使用statuschange，预留调整使用reservechange） 示例：statuschange 默认值：statuschange |
| adjustType | string | 否 | 否 | 调整类型（预留调整使用字段，0代表其他，1代表预留到期日调整） |
| memo | string | 否 | 否 | 备注 示例：11 |
| accountOrg | string | 否 | 否 | 会计主体id或code 示例：2371682382681600 |
| department | string | 否 | 否 | 部门id或code 示例：2371694750454016 |
| stockStatusChanges | object | 是 | 是 | 子表数据集 |
| _status | string | 否 | 是 | 操作标识，Insert：新增，Update：更新 示例：Insert 默认值：Insert |

## 3. 请求示例

Url: /yonbip/scm/stockstatuschange/single/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 123456789,
		"org": "",
		"operator": "",
		"stockMgr": "",
		"code": "TZD20220412000006",
		"vouchdate": "2022-04-12 00:00:00",
		"changeType": "statuschange",
		"adjustType": "",
		"memo": "11",
		"accountOrg": "2371682382681600",
		"department": "2371694750454016",
		"stockStatusChanges": [
			{
				"id": 123456789,
				"_status": "Insert",
				"source": "stockanalysis_statuschange_list",
				"makeRuleCode": "stockanalysisTostockStatusChangeReceive",
				"org": "2371682382681600",
				"warehouse": "2495109869785856",
				"product": "2493786441257472",
				"product_cCode": "000180",
				"productsku": "2493786449252864",
				"productsku_cCode": "000180",
				"invExchRate": 1,
				"batchno": "PCDA20211028000003",
				"outStockStatusDoc": "2346257360557210",
				"inStockStatusDoc": "2346257360557210",
				"outreserveid": "",
				"inreserveid": 0,
				"isExpiryDateManage": false,
				"isBatchManage": true,
				"isSerialNoManage": false,
				"stockUnitId": "2371707067273472",
				"unitExchangeType": 0,
				"outgoodsposition": "",
				"producedate": "",
				"invaliddate": "",
				"qty": 1,
				"subQty": 1,
				"stockReserveDays": "",
				"sourceReserveExpiryDate": "2022-04-12 00:00:00",
				"destinationReserveExpiryDate": "2022-04-12 00:00:00",
				"stockStatusChangesSNs": [
					{
						"_status": "",
						"sn": ""
					}
				]
			}
		],
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
| code | string | 否 | 请求响应码，200时表示成功 示例：200 |
| message | string | 否 | 请求响应信息 示例：操作成功 |
| data | object | 否 | 请求响应数据 |
| org | string | 否 | 库存组织id 示例：2371682382681600 |
| org_name | string | 否 | 库存组织名称 示例：95总公司 |
| code | string | 否 | 单据编码 示例：TZD20220412000003 |
| vouchdate | string | 否 | 单据日期 示例：2022-04-12 00:00:00 |
| status | long | 否 | 单据状态，0:开立状态；3:审核中；1:已审核； |
| changeType | string | 否 | 单据类型 示例：statuschange |
| adjustType | string | 否 | 调整类型 |
| creator | string | 否 | 创建人 示例：柴守娥 |
| createTime | string | 否 | 创建时间 示例：2022-04-12 14:00:14 |
| createDate | string | 否 | 创建日期 示例：2022-04-12 14:00:14 |
| creatorId | long | 否 | 创建人id 示例：2353514945827072 |
| accountOrg | string | 否 | 会计主体id 示例：2371682382681600 |
| stockStatusChanges | object | 是 | 库存状态调整单子表数据集 |
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 库存状态调整单主键 示例：2728644019851776 |
| pubts | string | 否 | 时间戳 示例：2022-04-12 14:00:15 |
| tenant | long | 否 | 租户ID 示例：2352473431068928 |
| yTenantId | string | 否 | 租户编码 示例：0000KRC0XGM102S8HV0000 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"org": "2371682382681600",
		"org_name": "95总公司",
		"code": "TZD20220412000003",
		"vouchdate": "2022-04-12 00:00:00",
		"status": 0,
		"changeType": "statuschange",
		"adjustType": "",
		"creator": "柴守娥",
		"createTime": "2022-04-12 14:00:14",
		"createDate": "2022-04-12 14:00:14",
		"creatorId": 2353514945827072,
		"accountOrg": "2371682382681600",
		"stockStatusChanges": [
			{
				"source": "stockanalysis_statuschange_list",
				"makeRuleCode": "stockanalysisTostockStatusChangeReceive",
				"warehouse": 2371753029308672,
				"warehouse_name": "95序列号仓01",
				"product": 2602484540625408,
				"product_cCode": "000508",
				"product_cName": "95普通物料49",
				"productsku": 2602484544754176,
				"productsku_cCode": "000508",
				"unit": 2371707067273472,
				"product_unitName": "盎司",
				"invExchRate": 1,
				"outStockStatusDoc": 2346257360557210,
				"org": "2371682382681600",
				"org_name": "95总公司",
				"outreserveid": 0,
				"preretailqty": 0,
				"inreserveid": 0,
				"inStockStatusDoc": 2346257360557211,
				"isExpiryDateManage": false,
				"isBatchManage": false,
				"isSerialNoManage": false,
				"stockUnitId": 2371707067273472,
				"stockUnit_name": "盎司",
				"stockUnitId_Precision": 2,
				"unitExchangeType": 0,
				"lineno": 10,
				"qty": 11,
				"subQty": 11,
				"id": 2728644019851777,
				"mainid": 2728644019851776,
				"warehouse_iSerialManage": true,
				"pubts": "2022-04-12 14:00:14",
				"yTenantId": "0000KRC0XGM102S8HV0000",
				"bodyItem": {
					"id": 0,
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": ""
				},
				"stockReserveDays": "",
				"sourceReserveExpiryDate": "",
				"destinationReserveExpiryDate": "",
				"stockStatusChangesSNs": [
					{
						"sn": "",
						"id": 0,
						"detailid": 0,
						"grandpaid": 0,
						"pubts": "",
						"yTenantId": ""
					}
				]
			}
		],
		"resubmitCheckKey": "st_stockstatuschange_push_ab8f8a30-ba25-11ec-a3cd-5da090622321",
		"id": 2728644019851776,
		"pubts": "2022-04-12 14:00:15",
		"tenant": 2352473431068928,
		"yTenantId": "0000KRC0XGM102S8HV0000"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	联系技术人员


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

