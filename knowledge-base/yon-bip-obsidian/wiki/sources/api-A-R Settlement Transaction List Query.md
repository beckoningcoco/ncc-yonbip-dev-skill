---
title: "应收核销事务列表查询"
apiId: "2019993668615143427"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "A/R Settlement"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, A/R Settlement]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收核销事务列表查询

> `ContentType	application/json` 请求方式	POST | 分类: A/R Settlement (EFI)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/EFI/arverifyevent/list

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	列表查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页数据量，限制500 示例：10 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 当前页码 示例：1 |
| code | string | 否 | 否 | 核销事务编号 示例："AR16240326000001" |
| financeOrg | string | 是 | 否 | 会计主体ID 示例：["1795054471704215553"] |
| accPeriodCode | string | 否 | 否 | 会计期间（英文逗号","分割起始期间和截止期间） 示例："2024-01,2024-12" |
| open_busDate_begin | string | 否 | 否 | 核销日期开始日期 示例："2024-01-01" |
| open_busDate_end | string | 否 | 否 | 核销日期结束日期 示例："2024-12-31" |
| bodyItem.grandsonItem.srcGrandson.body.oriCurrency | string | 是 | 否 | 币种ID 示例：["1780959454188011554"] |
| verifyCurrRule | string | 是 | 否 | 币种核销规则（枚举值 0：同币种核销；1：异币种核销） 示例：["0", "1"] |
| bodyItem.grandsonItem.srcGrandson.event.objectType | string | 是 | 否 | 往来对象类型（枚举值 1：客户；2：员工；3：资金往来对象） 示例：["1", "2", "3"] |
| bodyItem.grandsonItem.srcGrandson.event.customer | string | 是 | 否 | 客户ID 示例：["1795155102808932354"] |
| bodyItem.grandsonItem.srcGrandson.event.funder | string | 是 | 否 | 资金业务对象ID 示例：["1878918415468462085"] |
| arapEventType | string | 是 | 否 | 核销事务（枚举值 211：应收核销；221：应收应付核销；226：应付应收核销） 示例：["211", "221", "226"] |
| batchno | string | 否 | 否 | 核销批次号 示例："1960584323790798855" |
| verifyType | string | 是 | 否 | 核销分类（枚举值 11：应收红蓝对冲；12：收款红蓝对冲；13：收款核销应收；14：收款退款核销收款；15：收款退款核销应收（负）；16：收款退款红蓝对冲；31：应付核销应收；32：收款核销付款；33：收款退款核销付款退款） 示例：["11", "12", "13", "14", "15", "16", "31", "32", "33"] |
| bodyItem.grandsonItem.srcGrandson.event.srcBillType | string | 是 | 否 | 业务事项ID 示例：["2614099822008320"] |
| bodyItem.grandsonItem.srcGrandson.event.bustype | string | 是 | 否 | 交易类型ID 示例：["1780959419839808968"] |
| bodyItem.grandsonItem.srcGrandson.arSubject | string | 是 | 否 | 应收账款科目ID 示例：["1795059144642789385"] |
| bodyItem.grandsonItem.srcGrandson.settleMode | string | 是 | 否 | 结算方式ID 示例：["1780961558736666747"] |
| bodyItem.grandsonItem.srcGrandson.proCenter | string | 是 | 否 | 利润中心ID 示例：["1783123430507806730"] |
| bodyItem.grandsonItem.srcGrandson.costCenter | string | 是 | 否 | 成本中心ID 示例：["1795010199188668418"] |
| verifyWay | string | 是 | 否 | 核销方式（枚举值 1：关联核销；2：自动方案核销；3：手工方案核销；4：手工核销；5：定时方案核销） 示例：["1","2"] |
| bodyItem.grandsonItem.srcGrandson.event.code | string | 否 | 否 | 会计事务编号 示例："ARXXXXX" |
| bodyItem.grandsonItem.srcGrandson.event.employee | string | 是 | 否 | 员工ID 示例：["1690229773323730952"] |
| bodyItem.grandsonItem.srcGrandson.body.expenseItem | string | 是 | 否 | 费用项目ID 示例：["1810698400468828161"] |
| bodyItem.grandsonItem.srcGrandson.body.srcBillNo | string | 否 | 否 | 单据编号 示例："OAR240510307520" |
| bodyItem.grandsonItem.srcGrandson.body.invoiceNo | string | 否 | 否 | 发票号 示例："111111" |
| bodyItem.grandsonItem.srcGrandson.body.contractNo | string | 否 | 否 | 合同编号 示例："22222" |
| bodyItem.grandsonItem.srcGrandson.body.orderNo | string | 否 | 否 | 订单编号 示例："33333" |
| bodyItem.grandsonItem.srcGrandson.body.staff | string | 是 | 否 | 业务员ID 示例：["1729028051135627267"] |
| bodyItem.grandsonItem.srcGrandson.body.dept | string | 是 | 否 | 部门ID 示例：["1729028051135627267"] |
| bodyItem.grandsonItem.srcGrandson.body.project | string | 是 | 否 | 项目ID 示例：["1586302379490279430"] |
| postState | string | 是 | 否 | 过账状态（枚举值 0：未过账；1：过账中；2：过账成功；3：过账失败；4：不过账） 示例：["0","1"] |
| isSum | boolean | 否 | 否 | 是否仅查询表头，若是true时只查询表头，若是false查询表头+表体，默认为false 示例：false 默认值：false |
| simple | object | 否 | 否 | 扩展查询 |
| financeOrg.code | string | 是 | 否 | 会计主体编码 示例：["9998"] |
| bodyItem.grandsonItem.srcGrandson.body.oriCurrency.code | string | 是 | 否 | 币种简称 示例：["CNY"] |
| bodyItem.grandsonItem.srcGrandson.event.customer.code | string | 是 | 否 | 客户编码 示例：["00000000000002"] |
| bodyItem.grandsonItem.srcGrandson.arSubject.code | string | 是 | 否 | 应收账款科目编码 示例：["1002"] |
| open_pubts_begin | string | 否 | 否 | 时间戳开始时间 示例：2023-04-13 14:59:24 |
| open_pubts_end | string | 否 | 否 | 时间戳结束时间 示例：2023-04-13 14:59:24 |

## 3. 请求示例

Url: /yonbip/EFI/arverifyevent/list?access_token=访问令牌
Body: {
	"pageSize": 10,
	"pageIndex": 1,
	"code": "\"AR16240326000001\"",
	"financeOrg": [
		"1795054471704215553"
	],
	"accPeriodCode": "\"2024-01,2024-12\"",
	"open_busDate_begin": "\"2024-01-01\"",
	"open_busDate_end": "\"2024-12-31\"",
	"bodyItem.grandsonItem.srcGrandson.body.oriCurrency": [
		"1780959454188011554"
	],
	"verifyCurrRule": [
		"0",
		"1"
	],
	"bodyItem.grandsonItem.srcGrandson.event.objectType": [
		"1",
		"2",
		"3"
	],
	"bodyItem.grandsonItem.srcGrandson.event.customer": [
		"1795155102808932354"
	],
	"bodyItem.grandsonItem.srcGrandson.event.funder": [
		"1878918415468462085"
	],
	"arapEventType": [
		"211",
		"221",
		"226"
	],
	"batchno": "\"1960584323790798855\"",
	"verifyType": [
		"11",
		"12",
		"13",
		"14",
		"15",
		"16",
		"31",
		"32",
		"33"
	],
	"bodyItem.grandsonItem.srcGrandson.event.srcBillType": [
		"2614099822008320"
	],
	"bodyItem.grandsonItem.srcGrandson.event.bustype": [
		"1780959419839808968"
	],
	"bodyItem.grandsonItem.srcGrandson.arSubject": [
		"1795059144642789385"
	],
	"bodyItem.grandsonItem.srcGrandson.settleMode": [
		"1780961558736666747"
	],
	"bodyItem.grandsonItem.srcGrandson.proCenter": [
		"1783123430507806730"
	],
	"bodyItem.grandsonItem.srcGrandson.costCenter": [
		"1795010199188668418"
	],
	"verifyWay": [
		"1",
		"2"
	],
	"bodyItem.grandsonItem.srcGrandson.event.code": "\"ARXXXXX\"",
	"bodyItem.grandsonItem.srcGrandson.event.employee": [
		"1690229773323730952"
	],
	"bodyItem.grandsonItem.srcGrandson.body.expenseItem": [
		"1810698400468828161"
	],
	"bodyItem.grandsonItem.srcGrandson.body.srcBillNo": "\"OAR240510307520\"",
	"bodyItem.grandsonItem.srcGrandson.body.invoiceNo": "\"111111\"",
	"bodyItem.grandsonItem.srcGrandson.body.contractNo": "\"22222\"",
	"bodyItem.grandsonItem.srcGrandson.body.orderNo": "\"33333\"",
	"bodyItem.grandsonItem.srcGrandson.body.staff": [
		"1729028051135627267"
	],
	"bodyItem.grandsonItem.srcGrandson.body.dept": [
		"1729028051135627267"
	],
	"bodyItem.grandsonItem.srcGrandson.body.project": [
		"1586302379490279430"
	],
	"postState": [
		"0",
		"1"
	],
	"isSum": false,
	"simple": {
		"financeOrg.code": [
			"9998"
		],
		"bodyItem.grandsonItem.srcGrandson.body.oriCurrency.code": [
			"CNY"
		],
		"bodyItem.grandsonItem.srcGrandson.event.customer.code": [
			"00000000000002"
		],
		"bodyItem.grandsonItem.srcGrandson.arSubject.code": [
			"1002"
		],
		"open_pubts_begin": "2023-04-13 14:59:24",
		"open_pubts_end": "2023-04-13 14:59:24"
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回应收核销事务列表数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 当前页码 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页数据量，限制500 示例：20 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总记录数 示例：1 |
| recordList | object | 是 | 查询结果集 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 总页数 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 起始页码 示例：1 |
| endPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 截止页码 示例：1 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"id": "1960509015834230797",
				"code": "AR16240326000001",
				"accDate": "2024-03-26",
				"blnWriteOff": false,
				"writeOffState": "0",
				"verifyWay": "1",
				"financeOrg": "1795054471704215553",
				"financeOrg_name": "收付组织",
				"busDate": "2024-03-26",
				"verifyCurrRule": "0",
				"batchno": "1960509024424165390",
				"verifyType": "13",
				"oriDCurrency": "1780959454188011554",
				"oriDCurrency_name": "欧元",
				"oriDCurrency_moneyDigit": 2,
				"oriDAmount": 2.34,
				"oriCCurrency": "1780959454188011554",
				"oriCCurrency_name": "欧元",
				"oriCCurrency_moneyDigit": 2,
				"oriCAmount": 2.34,
				"accCurrency": "1780959454188011553",
				"accCurrency_moneyDigit": 2,
				"accDAmount": 2.34,
				"accCAmount": 2.34,
				"orgCurrency": "1780959454188011553",
				"orgCurrency_name": "欧元",
				"orgCurrency_moneyDigit": 2,
				"orgDAmount": 2.34,
				"orgCAmount": 2.34,
				"gblCurrency": "1780959454188011553",
				"gblCurrency_name": "欧元",
				"gblCurrency_moneyDigit": 2,
				"gblDAmount": 2.34,
				"gblCAmount": 2.34,
				"bodyItem_grandsonItem_srcGrandson_event_srcBillType": "2614099822008320",
				"bodyItem_grandsonItem_srcGrandson_event_srcBillType_name": "应收发票",
				"bodyItem_grandsonItem_digest": "251",
				"bodyItem_grandsonItem_srcGrandson_event_arapEventType": "113",
				"bodyItem_grandsonItem_srcGrandson_event_code": "AR0601230120000001",
				"bodyItem_grandsonItem_srcGrandson_event_srcBillCode": "OARar230120000538",
				"bodyItem_grandsonItem_srcGrandson_event_srcBillDate": "2024-06-29",
				"creator_userName": "",
				"accBook_ratetype_digit": 3,
				"debitVerifyRate": 5.889,
				"debitOriAmount": 1336,
				"debitAccAmount": 7867.7,
				"creditVerifyRate": 5.889,
				"creditOriAmount": 0,
				"creditAccAmount": 7867.7,
				"bodyItem_grandsonItem_srcGrandson_event_customer_name": "客户2",
				"bodyItem_grandsonItem_srcGrandson_event_employee_name": "员工1",
				"bodyItem_grandsonItem_srcGrandson_event_supplier_name": "供应商1",
				"bodyItem_grandsonItem_srcGrandson_event_funder_fundbusinobjtypename": "资金业务对象1",
				"bodyItem_grandsonItem_srcGrandson_body_project_name": "项目1",
				"bodyItem_grandsonItem_srcGrandson_body_dept_name": "部门1",
				"bodyItem_grandsonItem_srcGrandson_body_staff_name": "业务员1",
				"bodyItem_grandsonItem_srcGrandson_body_expenseItem_name": "费用1",
				"bodyItem_grandsonItem_srcGrandson_body_quickType_name": "应收款",
				"bodyItem_grandsonItem_srcGrandson_arSubjectVid_name": "应收账款",
				"bodyItem_grandsonItem_srcGrandson_apSubjectVid_name": "应付账款",
				"bodyItem_grandsonItem_gainLossSubjectVid_name": "",
				"bodyItem_grandsonItem_srcGrandson_body_material_name": "",
				"bodyItem_grandsonItem_srcGrandson_settleMode_name": "支票结算调度",
				"bodyItem_grandsonItem_srcGrandson_proCenter_name": "利润中心1",
				"bodyItem_grandsonItem_srcGrandson_costCenter_name": "成本中心1",
				"ratetype": "0000LKMAE85K35S5J90000"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

