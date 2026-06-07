---
title: "租出运营数据保存"
apiId: "2319001784060215305"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lease-out Operation Data"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lease-out Operation Data]
platform_version: "BIP"
source_type: community-api-docs
---

# 租出运营数据保存

>  请求方式	POST | Lease-out Operation Data (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/rentoutoperadata/save
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
data	object	否	是	租出运营数据
bill_code	string	否	否	单据编码 示例：ZCYY202507220001
pk_record_date	date
格式:yyyy-MM-dd	否	否	生效日期 示例：2025-07-22 14:50:10
contract_way	number
小数位数:0,最大长度:10	否	否	租赁方式 示例：0
bill_status	number
小数位数:0,最大长度:10	否	是	单据状态 示例：0
verifystate	number
小数位数:0,最大长度:10	否	否	获取审批状态 示例：0
pk_org	string	否	是	出租组织id 示例：2113470926006779909
contract	string	否	否	拉单合同 示例：2318994242204598276
customer_way	number
小数位数:0,最大长度:10	否	否	承租对象类型 示例：1
pk_recorder	string	否	否	经办人 示例：2126008562609029120
pk_record_dept	string	否	否	经办部门 示例：2116509108564656132
transi_type	string	否	否	交易类型 示例：4BLG-01
pk_transitype	string	否	否	来源交易类型主键 示例：2107554909184851977
bill_type	string	否	否	租入运营数据单据类型 示例：4BLG
billmaker	string	否	否	制单人 示例：2f847281-6e57-4d90-85b7-0cc149d37667
billmaketime	string	否	否	制单时间 示例：2025-07-22 14:50:08
src_pk_bill	string	否	否	来源单据表头主键 示例：2318994242204598276
origcurrtypeid	string	否	否	原币币种 示例：2107554866232033332
origcurrtypeid__moneyDigit	number
小数位数:2,最大长度:10	否	否	原币币种精度 示例：2
origcurrtypeid__priceDigit	number
小数位数:2,最大长度:10	否	否	原币币种单价精度 示例：3
pk_currency	string	否	否	本币币种 示例：2107554866232033332
pk_currency__moneyDigit	number
小数位数:0,最大长度:10	否	否	本币币种精度 示例：2
pk_currency__priceDigit	number
小数位数:0,最大长度:10	否	否	本币币种单价精度 示例：3
bodyvos	object	是	是	租出运营数据子表
_status	string	否	否	状态码 示例：Insert

## 3. 请求示例

Url: /yonbip/ACC/rentoutoperadata/save?access_token=访问令牌
Body: {
	"data": {
		"bill_code": "ZCYY202507220001",
		"pk_record_date": "2025-07-22 14:50:10",
		"contract_way": 0,
		"bill_status": 0,
		"verifystate": 0,
		"pk_org": "2113470926006779909",
		"contract": "2318994242204598276",
		"customer_way": 1,
		"pk_recorder": "2126008562609029120",
		"pk_record_dept": "2116509108564656132",
		"transi_type": "4BLG-01",
		"pk_transitype": "2107554909184851977",
		"bill_type": "4BLG",
		"billmaker": "2f847281-6e57-4d90-85b7-0cc149d37667",
		"billmaketime": "2025-07-22 14:50:08",
		"src_pk_bill": "2318994242204598276",
		"origcurrtypeid": "2107554866232033332",
		"origcurrtypeid__moneyDigit": 2,
		"origcurrtypeid__priceDigit": 3,
		"pk_currency": "2107554866232033332",
		"pk_currency__moneyDigit": 2,
		"pk_currency__priceDigit": 3,
		"bodyvos": [
			{
				"_status": "Insert",
				"src_pk_bill_b": "2318995298758688774",
				"pk_equip": "2318261177199624204",
				"pk_equip__equip_code": "EAM-2025072100000006",
				"pk_equip__equip_name": "共享卡片0721",
				"src_pk_bill": "2318994242204598276",
				"pk_equip__pk_category": "2167631382723428357",
				"expense_item": "2123999668964163589",
				"rent_detail_equippack": [
					{
						"_status": "Insert",
						"src_pk_bill": "2318995298758688799",
						"sub_flag": 0,
						"pk_equip": "2318864422538838017",
						"pk_category": "2167631382723428357",
						"equip_code": "EAM-2025072200000003",
						"equip_name": "HT共享资产0722-2",
						"spec": "11-001",
						"model": "22-002",
						"pk_used_status": "PRESET01_0000M232Z6A20YFPC30000",
						"pk_priority": "PRESET02_0000M232Z6A20YFPC30000"
					}
				],
				"pk_recorder_date": "2025-07-22",
				"pk_project": "2252262931588186119",
				"num": 77,
				"pk_rent_object": ""
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
data	object	否	租出运营数据
pk_org__name	string	否	出租组织 示例：HT资产组织
bill_code	string	否	单据编码 示例：ZCYY202507220001
pk_record_date	string	否	生效日期 示例：2025-07-22 14:50:10
contract__bill_code	string	否	合同单据编码 示例：ZCHT202507220002
contract__contract_code	string	否	合同编号 示例：20250722-2020
contract__contract_name	string	否	合同名称 示例：20250722-2028
customer__name	string	否	承租方 示例：测试开票客户
pk_transitype__name	string	否	交易类型编码 示例：租出运营数据
contract_way	number
小数位数:0,最大长度:10	否	承租对象类型 示例：0
pk_recorder__name	string	否	经办人 示例：HTRENT
pk_record_dept__name	string	否	经办部门 示例：技术部
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
verifystate	number
小数位数:0,最大长度:10	否	获取审批状态 示例：0
pk_org	string	否	出租组织 示例：2113470926006779909
contract	string	否	租出合同 示例：2318994242204598276
customer	string	否	承租方 示例：2141468615207026691
customer_way	number
小数位数:0,最大长度:10	否	承租对象类型 示例：1
pk_recorder	string	否	经办人 示例：2126008562609029120
pk_record_dept	string	否	经办部门 示例：2116509108564656132
transi_type	string	否	交易类型编码 示例：4BLG-01
pk_transitype	string	否	来源交易类型主键 示例：2107554909184851977
bill_type	string	否	租出运营数据单据类型 示例：4BLG
billmaker	string	否	制单人 示例：2f847281-6e57-4d90-85b7-0cc149d37667
billmaker__name	string	否	制单人 示例：HTRENT
billmaketime	string	否	制单时间 示例：2025-07-22 14:50:27
src_pk_bill	string	否	来源单据表头主键 示例：2318994242204598276
origcurrtypeid	string	否	原币币种 示例：2107554866232033332
origcurrtypeid__name	string	否	原币币种 示例：人民币
origcurrtypeid__moneyDigit	string	否	原币币种精度 示例：2
origcurrtypeid__priceDigit	string	否	原币币种单价精度 示例：3
pk_currency	string	否	本币币种 示例：2107554866232033332
pk_currency__name	string	否	本币币种 示例：人民币
pk_currency__moneyDigit	string	否	本币币种精度 示例：2
pk_currency__priceDigit	string	否	本币币种单价精度 示例：3
bodyvos	object	是	租出运营数据子表
_status	string	否	单据状态
id	string	否	主键 示例：2318999095537565701
sysid	string	否	应用标识 示例：LOM
creator	string	否	创建人 示例：2f847281-6e57-4d90-85b7-0cc149d37667
creator__name	string	否	创建人 示例：HTRENT
creationtime	string	否	创建时间 示例：2025-07-22 14:50:27
isWfControlled	boolean	否	是否审批流控制 示例：false
bizFlow	string	否	流程Id
isFlowCoreBill	string	否	是否流程核心单据
bizFlow_name	string	否	流程名称
bizFlow_version	string	否	版本信息
pubts	string	否	时间戳 示例：2025-07-22 14:50:27

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_org__name": "HT资产组织",
		"bill_code": "ZCYY202507220001",
		"pk_record_date": "2025-07-22 14:50:10",
		"contract__bill_code": "ZCHT202507220002",
		"contract__contract_code": "20250722-2020",
		"contract__contract_name": "20250722-2028",
		"customer__name": "测试开票客户",
		"pk_transitype__name": "租出运营数据",
		"contract_way": 0,
		"pk_recorder__name": "HTRENT",
		"pk_record_dept__name": "技术部",
		"bill_status": 0,
		"verifystate": 0,
		"pk_org": "2113470926006779909",
		"contract": "2318994242204598276",
		"customer": "2141468615207026691",
		"customer_way": 1,
		"pk_recorder": "2126008562609029120",
		"pk_record_dept": "2116509108564656132",
		"transi_type": "4BLG-01",
		"pk_transitype": "2107554909184851977",
		"bill_type": "4BLG",
		"billmaker": "2f847281-6e57-4d90-85b7-0cc149d37667",
		"billmaker__name": "HTRENT",
		"billmaketime": "2025-07-22 14:50:27",
		"src_pk_bill": "2318994242204598276",
		"origcurrtypeid": "2107554866232033332",
		"origcurrtypeid__name": "人民币",
		"origcurrtypeid__moneyDigit": "2",
		"origcurrtypeid__priceDigit": "3",
		"pk_currency": "2107554866232033332",
		"pk_currency__name": "人民币",
		"pk_currency__moneyDigit": "2",
		"pk_currency__priceDigit": "3",
		"bodyvos": [
			{
				"_status": "",
				"src_pk_bill_b": "2318995298758688774",
				"contract_detail": "2318995298758688774",
				"pk_equip": "2318261177199624204",
				"pk_equip__equip_code": "EAM-2025072100000006",
				"pk_equip__equip_name": "共享卡片0721",
				"src_pk_bill": "2318994242204598276",
				"pk_equip__pk_category": "2167631382723428357",
				"pk_equip__pk_category__category_name": "HTzu",
				"expense_item": "2123999668964163589",
				"expense_item__name": "装卸费",
				"rent_detail_equippack": [
					{
						"_status": "",
						"src_pk_bill": "2318995298758688799",
						"sub_flag": false,
						"pk_equip": "2318864422538838017",
						"pk_equip__equip_code": "EAM-2025072200000003",
						"pk_equip__equip_name": "HT共享资产0722-2",
						"pk_equip__pk_used_status": "PRESET01_0000M232Z6A20YFPC30000",
						"pk_equip__pk_used_status__status_name": "在用",
						"pk_category": "2167631382723428357",
						"pk_category__category_name": "HTzu",
						"pk_equip__spec": "11-001",
						"pk_equip__model": "22-002",
						"pk_equip__pk_priority": "PRESET02_0000M232Z6A20YFPC30000",
						"pk_equip__pk_priority__priority_name": "重点资产",
						"equip_code": "EAM-2025072200000003",
						"equip_name": "HT共享资产0722-2",
						"spec": "11-001",
						"model": "22-002",
						"pk_used_status": "PRESET01_0000M232Z6A20YFPC30000",
						"pk_priority": "PRESET02_0000M232Z6A20YFPC30000",
						"pk_priority__priority_name": "重点资产",
						"id": "2318999095537565703",
						"lease_out_details": "2318999095537565702"
					}
				],
				"pk_recorder_date": "2025-07-22 00:00:00",
				"pk_project__name": "111",
				"pk_project": "2252262931588186119",
				"pk_project__data_accuracy": "0",
				"num": 77,
				"id": "2318999095537565702",
				"main_id": "2318999095537565701",
				"pk_org": "2113470926006779909"
			}
		],
		"_status": "",
		"id": "2318999095537565701",
		"sysid": "LOM",
		"creator": "2f847281-6e57-4d90-85b7-0cc149d37667",
		"creator__name": "HTRENT",
		"creationtime": "2025-07-22 14:50:27",
		"isWfControlled": false,
		"bizFlow": "",
		"isFlowCoreBill": "",
		"bizFlow_name": "",
		"bizFlow_version": "",
		"pubts": "2025-07-22 14:50:27"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

