---
title: "租入运营数据保存"
apiId: "1663628944899309577"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-in Invoice"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-in Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 租入运营数据保存

>  请求方式	POST | Lease-in Invoice (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/rentinoperadata/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	租入运营数据
pk_org	string	否	是	承租组织id 示例：2113470926006779909
pk_org__name	string	否	否	承租组织名称 示例：HT资产组织
bill_code	string	否	否	单据编码 示例：ZRYY202508080001
pk_transitype__name	string	否	否	来源交易类型 示例：租入运营数据
pk_record_date	string	否	是	生效日期 示例：2025-08-08 16:19:55
contract	string	否	否	拉单合同 示例：2331661921837121537
customer_out__name	string	否	否	出租方 示例：HT新供应商001
pk_recorder__name	string	否	否	经办人 示例：HTRENT
pk_record_dept__name	string	否	否	经办部门 示例：技术部
bill_status	number
小数位数:0,最大长度:10	否	是	单据状态 示例：0
contract__bill_code	string	否	否	合同编码 示例：ZRHT202508080002
customer	string	否	否	承租方 示例：2127539288950702084
contract__contract_code	string	否	否	合同号 示例：20250808-200
customer_out	string	否	否	出租方 示例：2298379859472154633
contract__contract_name	string	否	否	合同名称 示例：20250808-200
pk_recorder	string	否	否	经办人 示例：2126008562609029120
pk_record_dept	string	否	否	经办部门 示例：2116509108564656132
customer__name	string	否	否	出租方 示例：协同客户
contract_way	number
小数位数:0,最大长度:10	否	否	租赁方式 示例：0
memo	string	否	否	备注 示例：777
transi_type	string	否	否	交易类型编码 示例：4A3G-01
pk_transitype	string	否	否	交易类型 示例：2107554909184851981
bill_type	string	否	否	单据类型 示例：4A3G
billmaker	string	否	否	制单人主键 示例：2f847281-6e57-4d90-85b7-0cc149d37667
billmaker__name	string	否	否	制单人 示例：HTRENT
billmaketime	string	否	否	制单时间 示例：2025-08-08 16:19:52
src_pk_bill	string	否	否	来源单据主键 示例：2331661921837121537
verifystate	number
小数位数:0,最大长度:10	否	否	审批状态 示例：0
origcurrtypeid	string	否	否	币种主键 示例：2107554866232033332
pk_currency	string	否	否	本币币种主键 示例：2107554866232033332
bodyvos	object	是	是	租入运营数据子表
_status	string	否	否	状态码 示例：Insert

## 3. 请求示例

Url: /yonbip/ACC/rentinoperadata/save?access_token=访问令牌
Body: {
	"data": {
		"pk_org": "2113470926006779909",
		"pk_org__name": "HT资产组织",
		"bill_code": "ZRYY202508080001",
		"pk_transitype__name": "租入运营数据",
		"pk_record_date": "2025-08-08 16:19:55",
		"contract": "2331661921837121537",
		"customer_out__name": "HT新供应商001",
		"pk_recorder__name": "HTRENT",
		"pk_record_dept__name": "技术部",
		"bill_status": 0,
		"contract__bill_code": "ZRHT202508080002",
		"customer": "2127539288950702084",
		"contract__contract_code": "20250808-200",
		"customer_out": "2298379859472154633",
		"contract__contract_name": "20250808-200",
		"pk_recorder": "2126008562609029120",
		"pk_record_dept": "2116509108564656132",
		"customer__name": "协同客户",
		"contract_way": 0,
		"memo": "777",
		"transi_type": "4A3G-01",
		"pk_transitype": "2107554909184851981",
		"bill_type": "4A3G",
		"billmaker": "2f847281-6e57-4d90-85b7-0cc149d37667",
		"billmaker__name": "HTRENT",
		"billmaketime": "2025-08-08 16:19:52",
		"src_pk_bill": "2331661921837121537",
		"verifystate": 0,
		"origcurrtypeid": "2107554866232033332",
		"pk_currency": "2107554866232033332",
		"bodyvos": [
			{
				"_status": "Insert",
				"src_pk_bill_b": "2331661921837121543",
				"contract_detail": "2331661921837121543",
				"equip_code": "LIM20250808000002",
				"equip_name": "5454645",
				"src_pk_bill": "2331661921837121537",
				"pk_category": "2297480871291650058",
				"pk_category__category_name": "自动售检票（AFC)",
				"rentin_operadata_body_equippack": [
					""
				],
				"expense_item": "",
				"expense_item__name": "租金",
				"pk_recorder_date": "2025-08-08",
				"pk_project__name": "111",
				"pk_project": "2252262931588186119",
				"pk_project__data_accuracy": 0,
				"num": 555,
				"memo": "666"
			}
		],
		"_status": "Insert"
	}
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	状态值 示例：操作成功！
data	object	否	租入运营数据
pk_org	string	否	承租组织 示例：2113470926006779909
pk_org__name	string	否	承租组织 示例：HT资产组织
bill_code	string	否	运营数据编码 示例：ZRYY202508080001
pk_transitype__name	string	否	交易类型 示例：租入运营数据
pk_record_date	string	否	工作日期 示例：2025-08-08 16:19:55
contract	string	否	租入合同主键 示例：2331661921837121537
customer_out__name	string	否	出租方 示例：HT新供应商001
pk_recorder__name	string	否	经办人 示例：HTRENT
pk_record_dept__name	string	否	经办部门 示例：技术部
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
contract__bill_code	string	否	合同编码 示例：ZRHT202508080002
customer	string	否	承租方 示例：2127539288950702084
contract__contract_code	string	否	合同号 示例：20250808-200
customer_out	string	否	出租方 示例：2298379859472154633
contract__contract_name	string	否	合同名称 示例：20250808-200
pk_recorder	string	否	经办人 示例：2126008562609029120
pk_record_dept	string	否	经办部门 示例：2116509108564656132
customer__name	string	否	承租方 示例：协同客户
contract_way	number
小数位数:0,最大长度:10	否	租赁方式 示例：0
memo	string	否	备注 示例：777
transi_type	string	否	交易类型编码 示例：4A3G-01
pk_transitype	string	否	交易类型 示例：2107554909184851981
bill_type	string	否	单据类型 示例：4A3G
billmaker	string	否	制单人主键 示例：2f847281-6e57-4d90-85b7-0cc149d37667
billmaker__name	string	否	制单人 示例：HTRENT
billmaketime	string	否	制单时间 示例：2025-08-08 16:20:07
src_pk_bill	string	否	来源单据主键 示例：2331661921837121537
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
origcurrtypeid	string	否	币种主键 示例：2107554866232033332
pk_currency	string	否	本币币种主键 示例：2107554866232033332
bodyvos	object	是	租入运营数据子表
_status	string	否	单据状态
id	string	否	子表主键 示例：2331662213894897669
sysid	string	否	系统标识 示例：LIM
creator	string	否	创建人主键 示例：2f847281-6e57-4d90-85b7-0cc149d37667
creator__name	string	否	创建人 示例：HTRENT
creationtime	string	否	创建时间 示例：2025-08-08 16:20:07
isWfControlled	boolean	否	是否审批流控制 示例：false
pubts	string	否	时间戳 示例：2025-08-08 16:20:08

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_org": "2113470926006779909",
		"pk_org__name": "HT资产组织",
		"bill_code": "ZRYY202508080001",
		"pk_transitype__name": "租入运营数据",
		"pk_record_date": "2025-08-08 16:19:55",
		"contract": "2331661921837121537",
		"customer_out__name": "HT新供应商001",
		"pk_recorder__name": "HTRENT",
		"pk_record_dept__name": "技术部",
		"bill_status": 0,
		"contract__bill_code": "ZRHT202508080002",
		"customer": "2127539288950702084",
		"contract__contract_code": "20250808-200",
		"customer_out": "2298379859472154633",
		"contract__contract_name": "20250808-200",
		"pk_recorder": "2126008562609029120",
		"pk_record_dept": "2116509108564656132",
		"customer__name": "协同客户",
		"contract_way": 0,
		"memo": "777",
		"transi_type": "4A3G-01",
		"pk_transitype": "2107554909184851981",
		"bill_type": "4A3G",
		"billmaker": "2f847281-6e57-4d90-85b7-0cc149d37667",
		"billmaker__name": "HTRENT",
		"billmaketime": "2025-08-08 16:20:07",
		"src_pk_bill": "2331661921837121537",
		"verifystate": 0,
		"origcurrtypeid": "2107554866232033332",
		"pk_currency": "2107554866232033332",
		"bodyvos": [
			{
				"_status": "",
				"src_pk_bill_b": "2331661921837121543",
				"contract_detail": "2331661921837121543",
				"equip_code": "LIM20250808000002",
				"equip_name": "5454645",
				"src_pk_bill": "2331661921837121537",
				"pk_category": "2297480871291650058",
				"pk_category__category_name": "自动售检票（AFC)",
				"expense_item": "2230494216271691784",
				"rentin_operadata_body_equippack": [
					""
				],
				"expense_item__name": "租金",
				"pk_recorder_date": "2025-08-08 00:00:00",
				"pk_project__name": "111",
				"pk_project": "2252262931588186119",
				"pk_project__data_accuracy": "0",
				"num": 555,
				"memo": "666",
				"id": "2331662213894897670",
				"main_id": "2331662213894897669",
				"pk_org": "2113470926006779909"
			}
		],
		"_status": "",
		"id": "2331662213894897669",
		"sysid": "LIM",
		"creator": "2f847281-6e57-4d90-85b7-0cc149d37667",
		"creator__name": "HTRENT",
		"creationtime": "2025-08-08 16:20:07",
		"isWfControlled": false,
		"pubts": "2025-08-08 16:20:08"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
code	服务端逻辑异常	服务端逻辑异常

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-10	
更新
请求说明
更新
请求参数 (5)
保存接口没有标明必输项

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

