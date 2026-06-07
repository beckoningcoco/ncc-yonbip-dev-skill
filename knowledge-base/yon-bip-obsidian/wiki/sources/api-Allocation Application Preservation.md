---
title: "调拨申请保存"
apiId: "3585e8d863284ed0b329b13c717d79b9"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer Application"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 调拨申请保存

> `ContentType	application/json` 请求方式	POST | 分类: Transfer Application (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/transferreq/save

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
| data | object | 否 | 是 | 调拨申请单主表[st.demandapply.DemandApply] |
| outorg | string | 否 | 是 | 调出组织id，或者调出组织code 示例：2182377400471808 |
| outaccount | string | 否 | 否 | 调出会计主体id,或调出会计主体code（非必填，可以由调出组织带出） 示例：2182377400471808 |
| code | string | 否 | 是 | 单据编号 示例：DBSQ202106262106000001 |
| vouchdate | string | 否 | 是 | 单据日期 示例：2021-06-26 |
| businesstype | string | 否 | 是 | 交易类型id，或者交易类型code 示例：10000019 |
| breturn | boolean | 否 | 否 | 调拨退货,枚举项（false:否,true:是） 示例：false |
| outWarehouse | string | 否 | 否 | 出库仓库主键id,或出库仓库code 示例：1852501626065152 |
| demandWarehouse | string | 否 | 是 | 调入仓库主键id，或调入仓库code 示例：1852501626065152 |
| merchant | string | 否 | 否 | 商家id,或者商家code 示例：1909084892139776 |
| store | string | 否 | 否 | 门店id,或者门店code 示例：1780782733556449280 |
| outdepartment | string | 否 | 否 | 调出部门id,或者code 示例：1345403029377280 |
| inorg | string | 否 | 是 | 调入组织id,或者code 示例：1852501626065152 |
| inaccount | string | 否 | 否 | 调入会计主体id,或者code(非必填，可由调入组织带出) 示例：1852501626065152 |
| indepartment | string | 否 | 否 | 调入部门id,或者code 示例：2233198207209728 |
| inbizperson | string | 否 | 否 | 调入业务员id,或者code 示例：2233198207209728 |
| dplanshipmentdate | string | 否 | 否 | 计划发货日期 示例：2021-06-26 |
| dplanarrivaldate | string | 否 | 是 | 计划到货日期 示例：2021-06-26 |
| memo | string | 否 | 否 | 备注 |
| srcBillType | string | 否 | 是 | 来源类型(调拨申请单须输入 st_transferreq ) |
| outbizperson | string | 否 | 否 | 调出业务员ID或者编码 |
| creator | string | 否 | 否 | 创建人名称 |
| createTime | string | 否 | 否 | 创建时间 示例：2021-05-27 00:00:00 |
| createDate | string | 否 | 否 | 创建日期 示例：2021-05-27 |
| modifier | string | 否 | 否 | 修改人名称 |
| modifyDate | string | 否 | 否 | 修改日期 示例：2021-05-27 |
| modifyTime | string | 否 | 否 | 修改时间 示例：2021-05-27 00:00:00 |
| id | string | 否 | 否 | 调拨申请单据ID 新增时无需填写，修改时必填 |
| headItem | object | 否 | 否 | 表头固定自定义项 |
| totalQuantity | int | 否 | 否 | 整单数量 |
| recieveDateTop | string | 否 | 否 | 希望到货日期 示例：2021-07-01 |
| closer | string | 否 | 否 | 关闭人名称 |
| closeTime | string | 否 | 否 | 关闭时间 示例：2021-05-27 00:00:00 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、 Update:更新 |
| demandapplydetails | object | 是 | 是 | 调拨申请单子表[st.demandapply.DemandApplyDetail] |
| out_sys_id | string | 否 | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 否 | 外部来源类型 |

## 3. 请求示例

Url: /yonbip/scm/transferreq/save?access_token=访问令牌
Body: {
	"data": {
		"outorg": "2182377400471808",
		"outaccount": "2182377400471808",
		"code": "DBSQ202106262106000001",
		"vouchdate": "2021-06-26",
		"businesstype": "10000019",
		"breturn": false,
		"outWarehouse": "1852501626065152",
		"demandWarehouse": "1852501626065152",
		"merchant": "1909084892139776",
		"store": "1780782733556449280",
		"outdepartment": "1345403029377280",
		"inorg": "1852501626065152",
		"inaccount": "1852501626065152",
		"indepartment": "2233198207209728",
		"inbizperson": "2233198207209728",
		"dplanshipmentdate": "2021-06-26",
		"dplanarrivaldate": "2021-06-26",
		"memo": "",
		"srcBillType": "",
		"outbizperson": "",
		"creator": "",
		"createTime": "2021-05-27 00:00:00",
		"createDate": "2021-05-27",
		"modifier": "",
		"modifyDate": "2021-05-27",
		"modifyTime": "2021-05-27 00:00:00",
		"id": "",
		"headItem": {
			"id": "",
			"define1": "",
			"define2": "",
			"define3": "",
			"define4": "",
			"define5": ""
		},
		"totalQuantity": 0,
		"recieveDateTop": "2021-07-01",
		"closer": "",
		"closeTime": "2021-05-27 00:00:00",
		"_status": "",
		"demandapplydetails": [
			{
				"demandapply": "",
				"product": "",
				"productsku": "",
				"outreserveid": "",
				"outreserveid_reservecust": "",
				"inreserveid": "",
				"inreserveid_reservecust": "",
				"isBatchManage": true,
				"batchno": "CSE1122",
				"producedate": "2021-05-27",
				"invaliddate": "2021-07-01",
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
				"define30": "",
				"qty": 1,
				"unit": "",
				"invExchRate": "1",
				"subQty": 1,
				"stockUnitId": "",
				"approvePcs": 1,
				"approveNum": 1,
				"recieveDate": "2021-07-01",
				"project": "",
				"id": "",
				"memo": "",
				"bodyItem": {
					"id": "",
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
					"define30": "",
					"define31": "",
					"define32": "",
					"define33": "",
					"define34": "",
					"define35": "",
					"define36": "",
					"define37": "",
					"define38": "",
					"define39": "",
					"define40": "",
					"define41": "",
					"define42": "",
					"define43": "",
					"define44": "",
					"define45": "",
					"define46": "",
					"define47": "",
					"define48": "",
					"define49": "",
					"define50": "",
					"define51": "",
					"define52": "",
					"define53": "",
					"define54": "",
					"define55": "",
					"define56": "",
					"define57": "",
					"define58": "",
					"define59": "",
					"define60": ""
				},
				"linecloseTime": "",
				"linecloser": "",
				"_status": "",
				"out_sys_rowno": "",
				"out_sys_lineid": ""
			}
		],
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": ""
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息描述 示例：操作成功 |
| data | object | 否 | 返回数据 |
| count | long | 否 | 总条数 示例：1 |
| sucessCount | long | 否 | 成功条数 示例：1 |
| failCount | long | 否 | 失败条数 示例：0 |
| messages | object | 是 | 错误数据信息 |
| infos | object | 是 | 成功数据信息 |
| failInfos | object | 否 | 错误信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			{}
		],
		"infos": [
			{
				"outorg": "",
				"outaccount": "",
				"code": "",
				"vouchdate": "",
				"businesstype": "",
				"breturn": true,
				"outWarehouse": 0,
				"demandWarehouse": 0,
				"merchant": "",
				"store": "",
				"outdepartment": "",
				"inorg": "",
				"inaccount": "",
				"indepartment": "",
				"inbizperson": "",
				"dplanshipmentdate": "",
				"dplanarrivaldate": "",
				"barCode": "",
				"memo": "",
				"status": 0,
				"srcBillType": "",
				"outbizperson": "",
				"creator": "",
				"createTime": "",
				"createDate": "",
				"modifier": "",
				"modifyDate": "",
				"modifyTime": "",
				"pubts": "",
				"id": 0,
				"headItem": {
					"id": "",
					"define1": ""
				},
				"totalQuantity": 0,
				"demandapplydetails": [
					{
						"demandapply": 0,
						"product": 0,
						"product_cCode": "",
						"product_model": "",
						"modelDescription": "",
						"product_productProps": {
							"define1": ""
						},
						"productsku": 0,
						"productsku_cCode": "",
						"productsku_productSkuProps": {
							"define1": ""
						},
						"free1": "",
						"outreserveid_demandtype": "",
						"outreserveid": 0,
						"outreserveid_reservecust": "",
						"outreserveid_reservecust_code": "",
						"inreserveid": 0,
						"inreserveid_reservecust": "",
						"inreserveid_reservecust_code": "",
						"inreserveid_demandtype": "",
						"isBatchManage": 0,
						"batchno": "",
						"producedate": "",
						"invaliddate": "",
						"expireDateUnit": 0,
						"expireDateNo": 0,
						"define1": "",
						"qty": 0,
						"unit": 0,
						"unitName": "",
						"invExchRate": 0,
						"subQty": 0,
						"stockUnitId": 0,
						"stockUnit_name": "",
						"approvePcs": 0,
						"approveNum": 0,
						"recieveDate": "",
						"unit_Precision": 0,
						"stockUnitId_Precision": 0,
						"project": "",
						"pubts": "",
						"id": 0,
						"memo": "",
						"bodyItem": {
							"id": "",
							"define1": ""
						},
						"out_sys_rowno": "",
						"out_sys_lineid": ""
					}
				],
				"out_sys_id": "",
				"out_sys_code": "",
				"out_sys_version": "",
				"out_sys_type": ""
			}
		],
		"failInfos": {}
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	根据返回提示信息做相应处理


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

