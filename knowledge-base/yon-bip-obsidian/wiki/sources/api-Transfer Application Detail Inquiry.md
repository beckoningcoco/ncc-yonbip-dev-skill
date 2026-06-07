---
title: "调拨申请详情查询"
apiId: "906d135099d8473586501e49d601c85e"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Transfer Application"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 调拨申请详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Transfer Application (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/transferreq/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 是 | 业务数据ID    示例: 2322371085046784 |

## 3. 请求示例

Url: /yonbip/scm/transferreq/detail?access_token=访问令牌&id=2322371085046784

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| returncount | string | 否 | 退回次数 |
| vouchdate | string | 否 | 单据日期 |
| outaccount | string | 否 | 调出会计主体主键 |
| outaccount_name | string | 否 | 调出会计主体名称 |
| inaccount | string | 否 | 调入会计主体主键 |
| inaccount_name | string | 否 | 调入会计主体名称 |
| businesstype_name | string | 否 | 交易类型名称 |
| demandWarehouse | string | 否 | 调入仓库主键 |
| demandWarehouse_name | string | 否 | 调入仓库名称 |
| store | string | 否 | 门店主键 |
| outorg | string | 否 | 调出组织主键 |
| outorg_name | string | 否 | 调出组织名称 |
| inorg | string | 否 | 调入组织主键 |
| inorg_name | string | 否 | 调入组织名称 |
| indepartment | string | 否 | 调入部门id |
| transTypeKeyField | string | 否 | 交易类型字段key |
| dplanshipmentdate | string | 否 | 计划发货日期 |
| masterOrgKeyField | string | 否 | 主组织字段key |
| status | string | 否 | 单据状态 枚举值说明：0:开立,1:已审核,2:已关闭,3:审核中,4:已出库 |
| breturn | string | 否 | 调拨退货 (false:否,true:是) |
| outbizperson | string | 否 | 调出业务员id |
| outbizperson_name | string | 否 | 调出业务员名称 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifyTime | string | 否 | 修改时间 |
| verifystate | string | 否 | 审批状态 （0：未提交 1：已提交 2：已审核） |
| pubts | string | 否 | 时间戳 |
| bizstatus | string | 否 | 单据状态 （0:开立,1:已审核,2:关闭,3:审核中,4:已出库） |
| dplanarrivaldate | string | 否 | 计划到货日期 |
| outWarehouse | string | 否 | 调出仓库主键 |
| outWarehouse_name | string | 否 | 调出仓库名称 |
| outdepartment | string | 否 | 调出部门主键 |
| outdepartment_name | string | 否 | 调出部门名称 |
| businesstype | string | 否 | 交易类型主键 |
| indepartment_name | string | 否 | 调入部门主键 |
| modifier | string | 否 | 修改人 |
| modifyDate | string | 否 | 修改日期 |
| isWfControlled | string | 否 | 是否审批流控制（true :是，false:否） |
| recieveDateTop | string | 否 | 希望到货日期 |
| srcBillType | string | 否 | 来源类型 (st_transferreq:调拨申请) |
| inbizperson | string | 否 | 调入业务员id |
| inbizperson_name | string | 否 | 调入业务员名称 |
| creator | string | 否 | 创建人 |
| barCode | string | 否 | 单据条码 |
| demandapplydetails | object | 是 | 调拨申请单子表[st.demandapply.DemandApplyDetail] |
| headItem | object | 否 | 单据头自定义项 |
| sourceorders | object | 是 | 调拨申请单据来源[st.demandapply.DemandApplySourceOrder] |
| out_sys_id | string | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 外部来源类型 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"returncount": "",
		"vouchdate": "",
		"outaccount": "",
		"outaccount_name": "",
		"inaccount": "",
		"inaccount_name": "",
		"businesstype_name": "",
		"demandWarehouse": "",
		"demandWarehouse_name": "",
		"store": "",
		"outorg": "",
		"outorg_name": "",
		"inorg": "",
		"inorg_name": "",
		"indepartment": "",
		"transTypeKeyField": "",
		"dplanshipmentdate": "",
		"masterOrgKeyField": "",
		"status": "",
		"breturn": "",
		"outbizperson": "",
		"outbizperson_name": "",
		"createTime": "",
		"createDate": "",
		"modifyTime": "",
		"verifystate": "",
		"pubts": "",
		"bizstatus": "",
		"dplanarrivaldate": "",
		"outWarehouse": "",
		"outWarehouse_name": "",
		"outdepartment": "",
		"outdepartment_name": "",
		"businesstype": "",
		"indepartment_name": "",
		"modifier": "",
		"modifyDate": "",
		"isWfControlled": "",
		"recieveDateTop": "",
		"srcBillType": "",
		"inbizperson": "",
		"inbizperson_name": "",
		"creator": "",
		"barCode": "",
		"demandapplydetails": [
			{
				"product": "",
				"product_cCode": "",
				"product_cName": "",
				"product_productOfflineRetail_mnemonicCode": "",
				"modelDescription": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"reservation": true,
				"propertiesValue": "",
				"free1": "",
				"outreserveid": "",
				"outreserveid_reservecust": "",
				"outreserveid_reservecust_name": "",
				"inreserveid": "",
				"inreserveid_name": "",
				"inreserveid_reservecust_code": "",
				"inreserveid_demandtype": "",
				"producedate": "",
				"expireDateUnit": "",
				"define1": "",
				"productStyle": "",
				"productStyle_cCode": "",
				"qty": 0,
				"subQty": "",
				"unitName": "",
				"invExchRate": "",
				"stockUnitId": "",
				"stockUnit_name": "",
				"stockUnitId_Precision": "",
				"approvePcs": 0,
				"transferNum": 0,
				"unit": "",
				"saleQty": 0,
				"innoticeQty": 0,
				"storeOrderUnitKey": "",
				"oUnitId": "",
				"erpnum": 0,
				"maxInventoryCount": 0,
				"reorderPoint": 0,
				"unit_Precision": "",
				"project": "",
				"pubts": "",
				"memo": "",
				"isBatchManage": "",
				"linecloseTime": "",
				"mnemonicCode": "",
				"approveNum": "",
				"rowno": "",
				"unitExchangeType": "",
				"num": "",
				"demandapply": "",
				"isSerialNoManage": "",
				"bodyItem": {
					"id": "",
					"define1": ""
				},
				"product_productProps": {
					"define1": ""
				},
				"productsku_productSkuProps": {
					"define1": ""
				},
				"out_sys_rowno": "",
				"out_sys_lineid": ""
			}
		],
		"headItem": {
			"id": "",
			"define1": ""
		},
		"sourceorders": [
			{}
		],
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": ""
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	入参格式错误等异常	根据返回错误信息做出相应调整


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

