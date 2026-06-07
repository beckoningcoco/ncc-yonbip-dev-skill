---
title: "所有权调出保存"
apiId: "2066696155161952264"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Ownership Transfer-out"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Ownership Transfer-out]
platform_version: "BIP"
source_type: community-api-docs
---

# 所有权调出保存

>  请求方式	POST | Ownership Transfer-out (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/deployout/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	所有权调出主表
pk_recorder	string	否	否	调出经办人主键 示例：1690352042455334917
pk_ownerunit_out	string	否	是	调出所有权主键 示例：1686786111486558212
bill_date	Date	否	否	调拨日期 示例：2023-11-28
memo	string	否	否	备注 示例：表头备注信息
pk_ownerorg_out	string	否	是	调出资产管理组织主键 示例：1686786111486558212
taxpayer_name	string	否	否	调出纳税人名称 示例：wuhf003名称
pk_costcenter_manage_in	string	否	否	调入成本中心主键 示例：1756469327346794499
pk_org	string	否	否	资产组织主键（和调出资产管理组织主键相同） 示例：1686786111486558212
pk_recorder_in	string	否	否	调入经办人主键 示例：1690351664498212867
pk_ownerunit_in	string	否	是	调入所有权主键 示例：1686786764321587206
bill_type	string	否	是	单据类型 示例：4A33 默认值：4A33
pk_currency	string	否	否	财务币种主键 示例：1686671470216347676
pk_ownerorg_in	string	否	是	调入资产管理组织主键 示例：1686786764321587206
pk_costcenter_manage	string	否	否	调出成本中心主键 示例：1732800097592279044
deploy_in_title	string	否	否	调入发票抬头 示例：wuhf0001名称
total_amount	BigDecimal	否	否	含税金额合计 示例：1000
billmaker	string	否	否	制单人主键 示例：1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b
pk_usedorg_out	string	否	否	调出使用单位主键 示例：1686786111486558212
creationtime	DateTime	否	否	创建时间 示例：2023-11-28 10:37:17
bodyvos	object	是	是	所有权调出表体
deploy_in_taxNo	string	否	否	调入纳税人识别号 示例：wuhf0001
pk_usedorg_in	string	否	否	调入使用单位主键 示例：1686786764321587206
tax_bill_type	string	否	否	发票类型（1：增值税电子普通发票，2：增值税电子专用发票，3：增值税普通发票，4：增值税专用发票） 示例：3
total_amount_tax	BigDecimal	否	否	税额合计 示例：0
notaxtotal_amount	BigDecimal	否	否	无税金额合计 示例：1000
actual_invoice_amount	BigDecimal	否	否	实开发票总额 示例：0
taxpayer_type	string	否	否	调出纳税人类型（1：一般纳税人，2：小规模纳税人） 示例：1
creator	string	否	否	创建人主键 示例：1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b
billmaketime	DateTime	否	否	制单时间 示例：2023-11-28 10:37:17
pk_customer	string	否	否	内部客户主键 示例：1757921283974627329
transi_type	string	否	是	交易类型编码 示例：4A33-01 默认值：4A33-01
taxpayer_id	string	否	否	调出纳税人识别号 示例：wuhf003
integratedAssetFlag	boolean	否	否	混合云插件标志 示例：false 默认值：false

## 3. 请求示例

Url: /yonbip/am/deployout/save?access_token=访问令牌
Body: {
	"data": {
		"pk_recorder": "1690352042455334917",
		"pk_ownerunit_out": "1686786111486558212",
		"bill_date": "2023-11-28",
		"memo": "表头备注信息",
		"pk_ownerorg_out": "1686786111486558212",
		"taxpayer_name": "wuhf003名称",
		"pk_costcenter_manage_in": "1756469327346794499",
		"pk_org": "1686786111486558212",
		"pk_recorder_in": "1690351664498212867",
		"pk_ownerunit_in": "1686786764321587206",
		"bill_type": "4A33",
		"pk_currency": "1686671470216347676",
		"pk_ownerorg_in": "1686786764321587206",
		"pk_costcenter_manage": "1732800097592279044",
		"deploy_in_title": "wuhf0001名称",
		"total_amount": 1000,
		"billmaker": "1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b",
		"pk_usedorg_out": "1686786111486558212",
		"creationtime": "2023-11-28 10:37:17",
		"bodyvos": [
			{
				"pk_usedept_after": "1686787236772184071",
				"real_opening_amount": 0,
				"collection_tax": 0,
				"pk_manager_after": "1690351664498212867",
				"memo": "表体备注信息",
				"pk_costcenter_manage_in": "1756469327346794499",
				"pk_org": "1686786111486558212",
				"notaxassets_amount": 1000,
				"assets_amount_tax": 0,
				"pk_status_after": "PRESET01_0000LFKR1FFVBMGQH10000",
				"pk_mandept_after": "1686787236772184071",
				"amount_received": 0,
				"pk_usedorg_out": "1686786111486558212",
				"pk_addreducestyle": "1686671401512599591",
				"pk_costcenter_used_in": "1756469327346794499",
				"invoicing_flag": true,
				"expense_item": "1690372615322468353",
				"pk_usedorg_in": "1686786764321587206",
				"pk_reason": "1736424706373320710",
				"status_date_after": "2023-11-28",
				"material_name": "住房物料",
				"assets_amount": 1000,
				"pk_category": "1706830088206024710",
				"pk_location_after": "1809866121695199233",
				"pk_user_after": "1690351664498212867",
				"pk_equip": "1742409588675706899",
				"material_tax": "0.0",
				"tax_classification_code": "5010101000000000000"
			}
		],
		"deploy_in_taxNo": "wuhf0001",
		"pk_usedorg_in": "1686786764321587206",
		"tax_bill_type": "3",
		"total_amount_tax": 0,
		"notaxtotal_amount": 1000,
		"actual_invoice_amount": 0,
		"taxpayer_type": "1",
		"creator": "1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b",
		"billmaketime": "2023-11-28 10:37:17",
		"pk_customer": "1757921283974627329",
		"transi_type": "4A33-01",
		"taxpayer_id": "wuhf003",
		"integratedAssetFlag": false
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
data	object	否	返回数据
pk_recorder	string	否	调入经办人主键 示例：1690352042455334917
pk_ownerunit_out	string	否	调出所有权主键 示例：1686786111486558212
pk_currency__moneyRount	long	否	金额舍入原则 示例：4
bill_date	Date	否	调拨日期 示例：2023-11-28
memo	string	否	表头备注信息 示例：表头备注信息
pk_ownerorg_out	string	否	调出资产管理组织主键 示例：1686786111486558212
taxpayer_name	string	否	调出纳税人名称 示例：wuhf003名称
pk_costcenter_manage_in	string	否	调入管理成本中心 示例：1756469327346794499
pk_org	string	否	资产组织主键 示例：1686786111486558212
pk_recorder_in	string	否	调入经办人主键 示例：1690351664498212867
pk_transitype	string	否	交易类型 示例：1686671478792652171
pk_ownerunit_in	string	否	调入所有权主键 示例：1686786764321587206
bill_type	string	否	单据类型 示例：4A33
pk_usedorg_out__name	string	否	调出使用单位 示例：WUHF调出方组织
id	string	否	主表主键 示例：1872082073054871555
pk_ownerunit_in__name	string	否	调入所有权 示例：WUHF调入方组织
creator__name	string	否	创建人 示例：昵称-武慧峰
pk_customer__name	string	否	内部客户 示例：WUHF调入方内部客户
pk_currency__name	string	否	财务币种 示例：人民币
push_status	long	否	固资对接生单状态(0：没有推固定资产 1：下游正在生单 2：下游生单成功 3：下游生单失败) 示例：0
pk_currency	string	否	财务币种主键 示例：1686671470216347676
pk_ownerorg_in	string	否	调入资产管理组织主键 示例：1686786764321587206
pk_org__name	string	否	资产组织 示例：WUHF调出方组织
pk_transitype__name	string	否	交易类型 示例：所有权调出
pk_ownerunit_out__name	string	否	调出所有权 示例：WUHF调出方组织
pk_ownerorg_out__name	string	否	调出资产管理组织 示例：WUHF调出方组织
pk_costcenter_manage_in__name	string	否	调入管理成本中心 示例：WUHF调入成本中心
pk_costcenter_manage	string	否	调出成本中心主键 示例：1732800097592279044
billmaker__name	string	否	制单人 示例：昵称-武慧峰
deploy_in_title	string	否	调入发票抬头 示例：wuhf0001名称
pk_recorder_in__name	string	否	调入经办人 示例：调入人员
pk_recorder__name	string	否	调出经办人 示例：调出人员
total_amount	BigDecimal	否	含税金额合计 示例：1000
billmaker	string	否	制单人主键 示例：1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b
pk_usedorg_out	string	否	调出使用单位主键 示例：1686786111486558212
creationtime	string	否	创建时间 示例：2023-11-28 10:37:17
bodyvos	object	是	详细信息
deploy_in_taxNo	string	否	调入纳税人识别号 示例：wuhf0001
returncount	long	否	退回次数 示例：0
verifystate	long	否	审批状态 示例：0
pk_costcenter_manage__name	string	否	调出成本中心 示例：WUHF调出成本中心
bill_code	string	否	调出单号 示例：ZCDC202311280001
pk_usedorg_in	string	否	调入使用单位主键 示例：1686786764321587206
pk_currency__priceRount	long	否	单价舍入原则 示例：1
bizFlow	string	否	流程主键 示例：949dfaf3-c947-11ed-a3ad-98039b6e2f80
tax_bill_type	string	否	发票类型（1：增值税电子普通发票，2：增值税电子专用发票，3：增值税普通发票，4：增值税专用发票） 示例：3
postAccountStatus	long	否	过账状态（99：未过账，2：过账成功） 示例：99
modifiedtime	DateTime	否	最后修改时间 示例：2023-11-28 10:39:49
pk_currency__digit	long	否	币种精度 示例：2
pk_usedorg_in__name	string	否	调入使用单位 示例：WUHF调入方组织
total_amount_tax	BigDecimal	否	税额合计 示例：0
notaxtotal_amount	BigDecimal	否	无税金额合计 示例：1000
pk_ownerorg_in__name	string	否	调入资产管理组织 示例：WUHF调入方组织
pubts	string	否	表体时间戳 示例：2023-11-28 10:39:49
actual_invoice_amount	long	否	实开发票总额 示例：0
isFlowCoreBill	boolean	否	是否流程核心单据（true：是，false：否） 示例：true
taxpayer_type	string	否	调出纳税人类型（1：一般纳税人，2：小规模纳税人） 示例：1
creator	string	否	创建人主键 示例：1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b
billmaketime	DateTime	否	制单时间 示例：2023-11-28 10:37:17
pk_customer	string	否	内部客户主键 示例：1757921283974627329
bill_status	long	否	单据状态（0：开立，1：已审核 ，2：已关闭 ，3：审核中） 示例：0
transi_type	string	否	交易类型编码 示例：4A33-01
taxpayer_id	string	否	调出纳税人识别号 示例：wuhf003
step	long	否	步骤条 示例：1
bizFlow_name	string	否	流程名称 示例：所有权调出推单所有权调入

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pk_recorder": "1690352042455334917",
		"pk_ownerunit_out": "1686786111486558212",
		"pk_currency__moneyRount": 4,
		"bill_date": "2023-11-28",
		"memo": "表头备注信息",
		"pk_ownerorg_out": "1686786111486558212",
		"taxpayer_name": "wuhf003名称",
		"pk_costcenter_manage_in": "1756469327346794499",
		"pk_org": "1686786111486558212",
		"pk_recorder_in": "1690351664498212867",
		"pk_transitype": "1686671478792652171",
		"pk_ownerunit_in": "1686786764321587206",
		"bill_type": "4A33",
		"pk_usedorg_out__name": "WUHF调出方组织",
		"id": "1872082073054871555",
		"pk_ownerunit_in__name": "WUHF调入方组织",
		"creator__name": "昵称-武慧峰",
		"pk_customer__name": "WUHF调入方内部客户",
		"pk_currency__name": "人民币",
		"push_status": 0,
		"pk_currency": "1686671470216347676",
		"pk_ownerorg_in": "1686786764321587206",
		"pk_org__name": "WUHF调出方组织",
		"pk_transitype__name": "所有权调出",
		"pk_ownerunit_out__name": "WUHF调出方组织",
		"pk_ownerorg_out__name": "WUHF调出方组织",
		"pk_costcenter_manage_in__name": "WUHF调入成本中心",
		"pk_costcenter_manage": "1732800097592279044",
		"billmaker__name": "昵称-武慧峰",
		"deploy_in_title": "wuhf0001名称",
		"pk_recorder_in__name": "调入人员",
		"pk_recorder__name": "调出人员",
		"total_amount": 1000,
		"billmaker": "1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b",
		"pk_usedorg_out": "1686786111486558212",
		"creationtime": "2023-11-28 10:37:17",
		"bodyvos": [
			{
				"isapprove_deployin": false,
				"pk_addreducestyle__name": "调拨调出",
				"pk_usedept_after": "1686787236772184071",
				"real_opening_amount": 0,
				"pk_status_before__status_name": "在用",
				"collection_tax": 0,
				"pk_manager_after__name": "调入人员",
				"pk_manager_after": "1690351664498212867",
				"memo": "表体备注信息",
				"equip_model": "liuqiangsc_调拨开票",
				"pk_costcenter_manage_in": "1756469327346794499",
				"stock_out_flag": false,
				"pk_usedept_after__name": "WUHF调入方部门",
				"pk_org": "1686786111486558212",
				"notaxassets_amount": 1000,
				"pk_equip__equip_code": "202306060016",
				"pk_manager_before__name": "调出人员",
				"assets_amount_tax": 0,
				"pk_warehouse_in__name": "WUHF入库仓库1",
				"pk_manager_before": "1690352042455334917",
				"pk_location_after__name": "test_liu_66",
				"pk_usedorg_out__name": "WUHF调出方组织",
				"id": "1872082073054871556",
				"pk_status_after": "PRESET01_0000LFKR1FFVBMGQH10000",
				"pk_reason__name": "报废原因",
				"pk_usedept_before": "1686787090743296005",
				"pk_mandept_after": "1686787236772184071",
				"amount_received": 0,
				"status_date_before": "2023-06-06",
				"equip_name": "liuqiangsc_调拨开票",
				"pk_costcenter_manage_in__name": "WUHF调入成本中心",
				"pk_mandept_before": "1686787090743296005",
				"expense_item__name": "费用项目名称001",
				"associate_status_flag_before": false,
				"pk_costcenter_used_in__name": "WUHF调入成本中心",
				"pk_usedorg_out": "1686786111486558212",
				"pk_addreducestyle": "1686671401512599591",
				"pk_costcenter_used_in": "1756469327346794499",
				"invoicing_flag": true,
				"stock_in_flag": false,
				"pk_usedept_before__name": "WUHF调出方部门",
				"expense_item": "1690372615322468353",
				"pk_user_before": "1690352042455334917",
				"pk_usedorg_in": "1686786764321587206",
				"pk_reason": "1736424706373320710",
				"pk_status_after__status_name": "在用",
				"status_date_after": "2023-11-28",
				"pk_user_before__name": "调出人员",
				"pk_icorg_in__name": "WUHF集团资产",
				"pk_icorg_in": "1692487242479566852",
				"associate_flag_before": false,
				"pk_usedorg_in__name": "WUHF调入方组织",
				"pk_mandept_before__name": "WUHF调出方部门",
				"pk_warehouse_in": "1780151759847030790",
				"pubts": "2023-11-28 10:39:49",
				"material_name": "住房物料",
				"pk_status_before": "PRESET01_0000LFKR1FFVBMGQH10000",
				"pk_category__category_name": "123",
				"pk_mandept_after__name": "WUHF调入方部门",
				"assets_amount": 1000,
				"invoicing_generated": 0,
				"main_id": "1872082073054871555",
				"pk_category": "1706830088206024710",
				"pk_location_after": "1809866121695199233",
				"pk_user_after": "1690351664498212867",
				"pk_equip": "1742409588675706899",
				"pk_user_after__name": "调入人员",
				"material_tax": "0.0",
				"tax_classification_code": "5010101000000000000",
				"equip_spec": "liuqiangsc_调拨开票"
			}
		],
		"deploy_in_taxNo": "wuhf0001",
		"returncount": 0,
		"verifystate": 0,
		"pk_costcenter_manage__name": "WUHF调出成本中心",
		"bill_code": "ZCDC202311280001",
		"pk_usedorg_in": "1686786764321587206",
		"pk_currency__priceRount": 1,
		"bizFlow": "949dfaf3-c947-11ed-a3ad-98039b6e2f80",
		"tax_bill_type": "3",
		"postAccountStatus": 99,
		"modifiedtime": "2023-11-28 10:39:49",
		"pk_currency__digit": 2,
		"pk_usedorg_in__name": "WUHF调入方组织",
		"total_amount_tax": 0,
		"notaxtotal_amount": 1000,
		"pk_ownerorg_in__name": "WUHF调入方组织",
		"pubts": "2023-11-28 10:39:49",
		"actual_invoice_amount": 0,
		"isFlowCoreBill": true,
		"taxpayer_type": "1",
		"creator": "1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b",
		"billmaketime": "2023-11-28 10:37:17",
		"pk_customer": "1757921283974627329",
		"bill_status": 0,
		"transi_type": "4A33-01",
		"taxpayer_id": "wuhf003",
		"step": 1,
		"bizFlow_name": "所有权调出推单所有权调入"
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
999	报错具体提示信息，例如：服务端逻辑异常	查看日志找对应异常服务定位产生原因

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求说明
新增
请求参数 bill_type
新增
请求参数 integratedAssetFlag

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

