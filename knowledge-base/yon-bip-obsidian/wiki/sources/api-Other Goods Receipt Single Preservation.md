---
title: "其他入库单个保存V2"
apiId: "6343c74699484c0b82e942fefc70c8fc"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Other Goods Receipt Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Other Goods Receipt Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 其他入库单个保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Other Goods Receipt Document (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/othinrecord/single/save

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
| data | object | 否 | 是 | 其他入库单[st.othinrecord.OthInRecord] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | long | 否 | 否 | 主表id，更新操作时必填 |
| needCalcLines | boolean | 否 | 否 | 表体行计算标识：不传或传入false时不对子表进行二次计算，需调用方保证数据的完整及正确性；为true时，以数量反算件数、以成本金额反算单价。 示例：false |
| code | string | 否 | 否 | 单据编号，以系统编码规则配置为准，系统设置为手工编号时必输，系统设置为自动编号时非必输；更新操作时必填 示例：QTRK0000001 |
| org | string | 否 | 是 | 库存组织，传入id或code 示例：wzyqzn |
| accountOrg | string | 否 | 是 | 会计主体，传入id或code 示例：wzyqzn |
| vouchdate | string | 否 | 是 | 单据日期,时间戳 示例：2021-03-05 |
| bustype | string | 否 | 是 | 交易类型，传入id或code 示例：A08001 |
| store | string | 否 | 否 | 门店，传入id或code 示例：store_code_01 |
| warehouse | string | 否 | 是 | 仓库，传入id或code 示例：ck01 |
| department | string | 否 | 否 | 部门，传入id或code 示例：dept01 |
| stockMgr | string | 否 | 否 | 库管员，传入id或code 示例：operator_01 |
| operator | string | 否 | 否 | 业务员，传入id或code 示例：operator_01 |
| memo | string | 否 | 否 | 备注 示例：XXX |
| out_sys_id | string | 否 | 否 | 外部来源线索 示例：xx |
| out_sys_code | string | 否 | 否 | 外部来源编码 示例：xx |
| out_sys_version | string | 否 | 否 | 外部来源版本 示例：xx |
| out_sys_type | string | 否 | 否 | 外部来源类型 示例：xx |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| lendType | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 借用对象类型 0:客户 1:部门 2:供应商 3:人员 (借入出库必填) 示例：0 |
| lendCustom | string | 否 | 否 | 借用客户id或code 示例：2370369475350784 |
| lendDept | string | 否 | 否 | 借用部门id或code 示例：2374771464655104 |
| lendUser | string | 否 | 否 | 借用人员id或code 示例：2364653363433728 |
| lendSupplier | string | 否 | 否 | 借用供应商id或code 示例：1758687566287077376 |
| headParallel!returnDifferenceFlag | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 差异归还标识 0:否 1:是 示例：0 |
| headItem | object | 否 | 否 | 表头自定义项（1-60） |
| defines | object | 否 | 否 | 表头自由自定义项（1-60） |
| othInRecords | object | 是 | 是 | 其他入库单子表 |

## 3. 请求示例

Url: /yonbip/scm/othinrecord/single/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 0,
		"needCalcLines": false,
		"code": "QTRK0000001",
		"org": "wzyqzn",
		"accountOrg": "wzyqzn",
		"vouchdate": "2021-03-05",
		"bustype": "A08001",
		"store": "store_code_01",
		"warehouse": "ck01",
		"department": "dept01",
		"stockMgr": "operator_01",
		"operator": "operator_01",
		"memo": "XXX",
		"out_sys_id": "xx",
		"out_sys_code": "xx",
		"out_sys_version": "xx",
		"out_sys_type": "xx",
		"_status": "Insert",
		"lendType": 0,
		"lendCustom": "2370369475350784",
		"lendDept": "2374771464655104",
		"lendUser": "2364653363433728",
		"lendSupplier": "1758687566287077376",
		"headParallel!returnDifferenceFlag": 0,
		"headItem": {
			"id": "",
			"define1": "自定义项1",
			"define2": "1891079656820992"
		},
		"defines": {
			"id": "",
			"define1": "自由自定义项1",
			"define2": "1891079656820993"
		},
		"othInRecords": [
			{
				"id": 0,
				"rowno": 1,
				"product": "PD0817000001",
				"productsku": "PD08170000010004",
				"free1": "红色",
				"free2": "100ml",
				"batchno": "SH01",
				"producedate": "2020-09-24 00:00:00",
				"invaliddate": "2020-09-24 00:00:00",
				"define1": "SH01_属性1",
				"define2": "SH01_属性2",
				"contactsQuantity": 10,
				"contactsPieces": 10,
				"qty": 10,
				"unit": "KGM",
				"subQty": 10,
				"invExchRate": 1,
				"stockUnitId": "KGM",
				"natUnitPrice": 10,
				"natMoney": 100,
				"goodsposition": "ck01_hw01",
				"project": "2411545234969600",
				"unitExchangeType": 1,
				"autoCalcCost": false,
				"isBatchManage": false,
				"isExpiryDateManage": false,
				"memo": "XXX",
				"_status": "Insert",
				"bodyItem": {
					"id": "",
					"define1": "自定义项1",
					"define2": "自定义项2"
				},
				"defines": {
					"id": "",
					"define1": "自由自定义项1",
					"define2": "自由自定义项2"
				},
				"othInRecordsSNs": [
					{
						"id": 0,
						"sn": "SN_001",
						"_status": "Insert",
						"pubts": ""
					}
				],
				"out_sys_rowno": "xx",
				"out_sys_lineid": "xx",
				"returnDate": "2025-01-15"
			}
		]
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| tenant | string | 否 | 租户 |
| id | string | 否 | 主表id |
| org | string | 否 | 库存组织id |
| org_name | string | 否 | 库存组织名称 |
| accountOrg | string | 否 | 会计主体id |
| accountOrg_name | string | 否 | 会计主体名称 |
| code | string | 否 | 单据编号 |
| vouchdate | string | 否 | 单据日期 |
| bustype | string | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| store | string | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| warehouse | string | 否 | 仓库id |
| warehouse_name | string | 否 | 仓库名称 |
| department | string | 否 | 部门id |
| department_name | string | 否 | 部门名称 |
| stockMgr | string | 否 | 库管员IDid |
| stockMgr_name | string | 否 | 库管员名称 |
| operator | string | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| bustype_extend_attrs_json | string | 否 | 入库类型 |
| totalQuantity | int | 否 | 整单数量 |
| totalPieces | int | 否 | 整单件数 |
| status | int | 否 | 单据状态, 0:未提交、1:已提交、 |
| memo | string | 否 | 备注 |
| warehouse_iSerialManage | string | 否 | 仓库是否序列号严格管理 |
| warehouse_isGoodsPosition | string | 否 | 仓库是否货位管理 |
| pubts | string | 否 | 时间戳 |
| tplid | string | 否 | 模板id |
| natCurrency | string | 否 | 本币 |
| natCurrency_priceDigit | string | 否 | 币种单价精度 |
| natCurrency_moneyDigit | string | 否 | 币种金额精度 |
| isCopy | string | 否 | 是否复制, true:是、false:否、 |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 修改日期 |
| auditor | string | 否 | 提交人 |
| auditTime | string | 否 | 提交时间 |
| auditDate | string | 否 | 提交日期 |
| creatorId | string | 否 | 创建人 |
| modifierId | string | 否 | 修改人id |
| auditorId | string | 否 | 审批人id |
| costStart | string | 否 | 成本期初, true:是、false:否、 |
| stockStart | string | 否 | 库存期初, true:是、false:否、 |
| othInRecords | object | 是 | 其他入库单子表[st.othinrecord.OthInRecords] |
| out_sys_id | string | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 外部来源类型 |
| lendType | number |
| 小数位数:0,最大长度:1 | 否 | 借用对象类型 0:客户 1:部门 2:供应商 3:人员 示例：0 |
| lendCustom | number |
| 小数位数:0,最大长度:20 | 否 | 借用客户id 示例：2370369475350784 |
| lendDept | string | 否 | 借用部门id 示例：2374771464655104 |
| lendUser | string | 否 | 借用人员id 示例：2364653363433728 |
| lendSupplier | number |
| 小数位数:0,最大长度:20 | 否 | 借用供应商id 示例：1758687566287077376 |
| headParallel!returnDifferenceFlag | number |
| 小数位数:0,最大长度:1 | 否 | 差异归还标识 0:否 1:是 示例：0 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"tenant": "",
		"id": "",
		"org": "",
		"org_name": "",
		"accountOrg": "",
		"accountOrg_name": "",
		"code": "",
		"vouchdate": "",
		"bustype": "",
		"bustype_name": "",
		"store": "",
		"store_name": "",
		"warehouse": "",
		"warehouse_name": "",
		"department": "",
		"department_name": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"operator": "",
		"operator_name": "",
		"bustype_extend_attrs_json": "",
		"totalQuantity": 0,
		"totalPieces": 0,
		"status": 0,
		"memo": "",
		"warehouse_iSerialManage": "",
		"warehouse_isGoodsPosition": "",
		"pubts": "",
		"tplid": "",
		"natCurrency": "",
		"natCurrency_priceDigit": "",
		"natCurrency_moneyDigit": "",
		"isCopy": "",
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"creatorId": "",
		"modifierId": "",
		"auditorId": "",
		"costStart": "",
		"stockStart": "",
		"othInRecords": [
			{
				"warehouseMaterialCheckRule": "",
				"othInRecordsSNs": [
					{
						"id": 0,
						"grandpaid": 0,
						"pubts": "",
						"detailid": 0,
						"sn": ""
					}
				],
				"unit_name": "",
				"id": "",
				"mainid": "",
				"rowno": "",
				"isSerialNoManage": "",
				"product": "",
				"product_cCode": "",
				"product_cName": "",
				"product_model": "",
				"modelDescription": "",
				"prodefine1": "",
				"prodefine2": "",
				"prodefine3": "",
				"prodefine4": "",
				"prodefine5": "",
				"prodefine6": "",
				"prodefine7": "",
				"prodefine8": "",
				"prodefine9": "",
				"prodefine10": "",
				"prodefine11": "",
				"prodefine12": "",
				"prodefine13": "",
				"prodefine14": "",
				"prodefine15": "",
				"prodefine16": "",
				"prodefine17": "",
				"prodefine18": "",
				"prodefine19": "",
				"prodefine20": "",
				"prodefine21": "",
				"prodefine22": "",
				"prodefine23": "",
				"prodefine24": "",
				"prodefine25": "",
				"prodefine26": "",
				"prodefine27": "",
				"prodefine28": "",
				"prodefine29": "",
				"prodefine30": "",
				"productsku": "",
				"productsku_cCode": "",
				"productsku_cName": "",
				"skudefine1": "",
				"skudefine2": "",
				"skudefine3": "",
				"skudefine4": "",
				"skudefine5": "",
				"skudefine6": "",
				"returnDate": "2025-01-15 00:00:00",
				"out_sys_rowno": "",
				"skudefine7": "",
				"skudefine8": "",
				"skudefine9": "",
				"skudefine10": "",
				"skudefine11": "",
				"skudefine12": "",
				"skudefine13": "",
				"skudefine14": "",
				"skudefine15": "",
				"skudefine16": "",
				"skudefine17": "",
				"skudefine18": "",
				"skudefine19": "",
				"skudefine20": "",
				"skudefine21": "",
				"skudefine22": "",
				"skudefine23": "",
				"skudefine24": "",
				"skudefine25": "",
				"skudefine26": "",
				"skudefine27": "",
				"skudefine28": "",
				"skudefine29": "",
				"skudefine30": "",
				"skudefine31": "",
				"skudefine32": "",
				"skudefine33": "",
				"skudefine34": "",
				"skudefine35": "",
				"skudefine36": "",
				"skudefine37": "",
				"skudefine38": "",
				"skudefine39": "",
				"skudefine40": "",
				"skudefine41": "",
				"skudefine42": "",
				"skudefine43": "",
				"skudefine44": "",
				"skudefine45": "",
				"skudefine46": "",
				"skudefine47": "",
				"skudefine48": "",
				"skudefine49": "",
				"skudefine50": "",
				"skudefine51": "",
				"skudefine52": "",
				"skudefine53": "",
				"skudefine54": "",
				"skudefine55": "",
				"skudefine56": "",
				"skudefine57": "",
				"skudefine58": "",
				"skudefine59": "",
				"skudefine60": "",
				"propertiesValue": "",
				"out_sys_lineid": "",
				"free1": "",
				"free2": "",
				"free3": "",
				"free4": "",
				"free5": "",
				"free6": "",
				"free7": "",
				"free8": "",
				"free9": "",
				"free10": "",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"expireDateNo": "",
				"expireDateUnit": "",
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
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"qty": 0,
				"unit": "",
				"product_unitName": "",
				"subQty": 0,
				"invExchRate": 0,
				"stockUnitId": "",
				"stockUnit_name": "",
				"unit_Precision": "",
				"stockUnitId_Precision": "",
				"recorddate": "",
				"natUnitPrice": 0,
				"natMoney": 0,
				"goodsposition": "",
				"goodsposition_cName": "",
				"group_number": "",
				"project": "",
				"project_code": "",
				"project_name": "",
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"upcode": "",
				"makeRuleCode": "",
				"memo": "",
				"unitExchangeType": "",
				"autoCalcCost": "",
				"pubts": "",
				"isBatchManage": "",
				"isExpiryDateManage": ""
			}
		],
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": "",
		"lendType": 0,
		"lendCustom": 2370369475350784,
		"lendDept": "2374771464655104",
		"lendUser": "2364653363433728",
		"lendSupplier": 1758687566287077376,
		"headParallel!returnDifferenceFlag": 0
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	系统异常	请联系管理员处理


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

