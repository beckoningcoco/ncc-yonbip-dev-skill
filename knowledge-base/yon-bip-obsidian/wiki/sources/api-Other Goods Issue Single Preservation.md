---
title: "其他出库单个保存V2"
apiId: "0b22fac4f84d4d9587f792ea5ffc7fcb"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Other Goods Issue Document"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Other Goods Issue Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 其他出库单个保存V2

> `ContentType	application/json` 请求方式	POST | 分类: Other Goods Issue Document (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/othoutrecord/single/save

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
| data | object | 否 | 是 | 其他出库单[st.othoutrecord.OthOutRecord] |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| id | string | 否 | 否 | 主表id，更新操作时必填 |
| code | string | 否 | 否 | 单据编号，以系统编码规则配置为准，系统设置为手工编号时必输，系统设置为自动编号时非必输；更新操作时必填 示例：QTCK0000001 |
| org | string | 否 | 是 | 库存组织，传入id或code 示例：wzyqzn |
| accountOrg | string | 否 | 是 | 会计主体，传入id或code 示例：wzyqzn |
| vouchdate | string | 否 | 是 | 单据日期，日期格式:yyyy-MM-dd 示例：2021-03-05 |
| bustype | string | 否 | 是 | 交易类型，传入id或code 示例：A10001 |
| store | string | 否 | 否 | 门店，id或code 示例：store_code_01 |
| warehouse | string | 否 | 是 | 仓库，传入id或code 示例：ck01 |
| department | string | 否 | 否 | 部门，传入id或code 示例：dept01 |
| operator | string | 否 | 否 | 业务员，传入id或code 示例：operator_01 |
| stockMgr | string | 否 | 否 | 库管员，传入id或code 示例：operator_02 |
| memo | string | 否 | 否 | 备注 示例：单子备注 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例：Insert |
| srcBillType | string | 否 | 否 | 来源上级单据类型，有来源时必填：出库申请退库：applyoutToOthoutrecordReturn；出库申请出库：applyoutToOthoutrecord；借出申请生成借出出库:lendapplyToLendoutrecord；借用未还单转借入归还出库:lendrecordToOtherOutRecord；借出转其他出库:lendrecordToOthoutrecord |
| headItem | object | 否 | 否 | 表头自定义项（1-60） |
| defines | object | 否 | 否 | 表头自由自定义项（1-60） |
| othOutRecords | object | 是 | 是 | 其他出库单子表[st.othoutrecord.OthOutRecords] |
| out_sys_id | string | 否 | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 否 | 外部来源类型 |
| lendType | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 借用对象类型 0:客户 1:部门 2:人员 3:供应商(借出业务必填) 示例：0 |
| lendCustom | string | 否 | 否 | 借用客户id或code 示例：2370369475350784 |
| lendDept | string | 否 | 否 | 借用部门id或code 示例：2374771464655104 |
| lendUser | string | 否 | 否 | 借用人员id或code 示例：2364653363433728 |
| lendSupplier | string | 否 | 否 | 借用供应商id或code 示例：1758687566287077376 |

## 3. 请求示例

Url: /yonbip/scm/othoutrecord/single/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"code": "QTCK0000001",
		"org": "wzyqzn",
		"accountOrg": "wzyqzn",
		"vouchdate": "2021-03-05",
		"bustype": "A10001",
		"store": "store_code_01",
		"warehouse": "ck01",
		"department": "dept01",
		"operator": "operator_01",
		"stockMgr": "operator_02",
		"memo": "单子备注",
		"_status": "Insert",
		"srcBillType": "",
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
		"othOutRecords": [
			{
				"id": "",
				"product": "PD0817000001",
				"productsku": "PD08170000010004",
				"batchno": "SH01",
				"producedate": "2020-09-24 00:00:00",
				"invaliddate": "2020-10-24 00:00:00",
				"contactsQuantity": 10,
				"contactsPieces": 10,
				"qty": 10,
				"subQty": 10,
				"unit": "KGM",
				"invExchRate": 1,
				"unitExchangeType": 0,
				"stockUnitId": "KGM",
				"goodsposition": "ck01_hw01",
				"project": "project01",
				"expenseItems": "fy001",
				"budgetUnitPrice": 10,
				"budgetMoney": 10,
				"memo": "备注信息",
				"_status": "Insert",
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"returnDate": "2025-01-15",
				"upcode": "",
				"makeRuleCode": "",
				"autoCalcCost": "",
				"bodyItem": {
					"id": "",
					"define1": "自定义项1",
					"define2": "2411545234969601"
				},
				"defines": {
					"id": "",
					"define1": "自由项1",
					"define2": "2411545234969603"
				},
				"othOutRecordsSNs": [
					{
						"id": 0,
						"sn": "SN01",
						"_status": "Insert"
					}
				],
				"bodyParallel": {
					"id": 0,
					"returnStockReasonId": 1834229126116933638
				},
				"out_sys_rowno": "",
				"out_sys_lineid": ""
			}
		],
		"out_sys_id": "",
		"out_sys_code": "",
		"out_sys_version": "",
		"out_sys_type": "",
		"lendType": 0,
		"lendCustom": "2370369475350784",
		"lendDept": "2374771464655104",
		"lendUser": "2364653363433728",
		"lendSupplier": "1758687566287077376"
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
| tenant | long | 否 | 租户 |
| accountOrg | string | 否 | 会计主体id |
| accountOrg_name | string | 否 | 会计主体名称 |
| org | string | 否 | 库存组织id |
| org_name | string | 否 | 库存组织名称 |
| code | string | 否 | 出库单编号 |
| vouchdate | string | 否 | 出库日期 |
| bustype | string | 否 | 交易类型id |
| bustype_name | string | 否 | 交易类型名称 |
| store | string | 否 | 门店id |
| store_name | string | 否 | 门店名称 |
| warehouse | long | 否 | 仓库id |
| warehouse_name | string | 否 | 仓库名称 |
| warehouse_iSerialManage | boolean | 否 | 仓库是否序列号管理 |
| warehouse_isGoodsPosition | boolean | 否 | 仓库是否货位管理 |
| department | string | 否 | 部门id |
| department_name | string | 否 | 部门名称 |
| status | int | 否 | 单据状态, 0:未提交、1:已提交、 |
| operator | string | 否 | 业务员id |
| operator_name | string | 否 | 业务员名称 |
| stockMgr | string | 否 | 库管员IDid |
| stockMgr_name | string | 否 | 库管员名称 |
| bustype_extend_attrs_json | string | 否 | 出库类型 |
| totalQuantity | BigDecimal | 否 | 整单数量 |
| totalPieces | BigDecimal | 否 | 整单件数 |
| memo | string | 否 | 备注 |
| id | long | 否 | 主表id |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| tplid | string | 否 | 模板id |
| natCurrency_priceDigit | int | 否 | 币种单价精度 |
| natCurrency_moneyDigit | int | 否 | 币种金额精度 |
| natCurrency | string | 否 | 本币 |
| source | string | 否 | 上游单据类型 |
| upcode | string | 否 | 上游单据编号 |
| isCopy | boolean | 否 | 是否复制, true:是、false:否、 |
| sourceid | string | 否 | 上游单据主表id |
| creatorId | long | 否 | 创建人 |
| modifierId | long | 否 | 修改人id |
| auditorId | long | 否 | 审批人id |
| creator | string | 否 | 创建人 |
| createTime | string | 否 | 创建时间 |
| createDate | string | 否 | 创建日期 |
| modifier | string | 否 | 修改人 |
| modifyTime | string | 否 | 修改时间 |
| modifyDate | string | 否 | 修改日期 |
| auditor | string | 否 | 提交人 |
| auditTime | string | 否 | 提交时间 |
| auditDate | string | 否 | 提交日期 |
| othOutRecords | object | 是 | 其他出库单子表[st.othoutrecord.OthOutRecords] |
| out_sys_id | string | 否 | 外部来源线索 |
| out_sys_code | string | 否 | 外部来源编码 |
| out_sys_version | string | 否 | 外部来源版本 |
| out_sys_type | string | 否 | 外部来源类型 |
| lendType | number |
| 小数位数:0,最大长度:1 | 否 | 借用对象类型 0:客户 1:部门 2:人员 3:供应商 示例：0 |
| lendCustom | number |
| 小数位数:0,最大长度:20 | 否 | 借用客户id 示例：2370369475350784 |
| lendDept | string | 否 | 借用部门id 示例：2374771464655104 |
| lendUser | string | 否 | 借用人员id 示例：2364653363433728 |
| lendSupplier | number |
| 小数位数:0,最大长度:20 | 否 | 借用供应商id 示例：1758687566287077376 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"tenant": 0,
		"accountOrg": "",
		"accountOrg_name": "",
		"org": "",
		"org_name": "",
		"code": "",
		"vouchdate": "",
		"bustype": "",
		"bustype_name": "",
		"store": "",
		"store_name": "",
		"warehouse": 0,
		"warehouse_name": "",
		"warehouse_iSerialManage": true,
		"warehouse_isGoodsPosition": true,
		"department": "",
		"department_name": "",
		"status": 0,
		"operator": "",
		"operator_name": "",
		"stockMgr": "",
		"stockMgr_name": "",
		"bustype_extend_attrs_json": "",
		"totalQuantity": 0,
		"totalPieces": 0,
		"memo": "",
		"id": 0,
		"pubts": "",
		"tplid": "",
		"natCurrency_priceDigit": 0,
		"natCurrency_moneyDigit": 0,
		"natCurrency": "",
		"source": "",
		"upcode": "",
		"isCopy": true,
		"sourceid": "",
		"creatorId": 0,
		"modifierId": 0,
		"auditorId": 0,
		"creator": "",
		"createTime": "",
		"createDate": "",
		"modifier": "",
		"modifyTime": "",
		"modifyDate": "",
		"auditor": "",
		"auditTime": "",
		"auditDate": "",
		"othOutRecords": [
			{
				"rowno": "",
				"unit_name": "",
				"warehouseMaterialCheckRule": "",
				"isSerialNoManage": true,
				"product": 0,
				"product_cCode": "",
				"product_cName": "",
				"product_model": "",
				"modelDescription": "",
				"productsku": 0,
				"productsku_cCode": "",
				"productsku_cName": "",
				"propertiesValue": "",
				"isBatchManage": true,
				"isExpiryDateManage": true,
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"expireDateNo": "",
				"expireDateUnit": "",
				"contactsQuantity": 0,
				"contactsPieces": 0,
				"qty": 0,
				"unit": 0,
				"product_unitName": "",
				"mainid": 0,
				"recorddate": "",
				"subQty": 0,
				"invExchRate": 0,
				"unitExchangeType": 0,
				"stockUnitId": 0,
				"stockUnit_name": "",
				"unit_Precision": 0,
				"stockUnitId_Precision": 0,
				"goodsposition": 0,
				"goodsposition_cName": "",
				"natUnitPrice": 0,
				"natMoney": 0,
				"group_number": "",
				"project_code": "",
				"project_name": "",
				"out_sys_rowno": "",
				"project": "",
				"expenseItems": 0,
				"expenseItems_name": "",
				"expenseItems_code": "",
				"budgetUnitPrice": 0,
				"budgetMoney": 0,
				"sourceid": "",
				"sourceautoid": "",
				"source": "",
				"upcode": "",
				"makeRuleCode": "",
				"autoCalcCost": true,
				"memo": "",
				"id": 0,
				"pubts": "",
				"othOutRecordsSNs": [
					{
						"id": 0,
						"sn": "",
						"pubts": ""
					}
				],
				"bodyParallel": {
					"id": 0,
					"returnStockReasonId": 0
				},
				"out_sys_lineid": "",
				"returnDate": "2025-01-15 00:00:00"
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
		"lendSupplier": 1758687566287077376
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	系统异常	根据返回提示信息做相应处理


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

