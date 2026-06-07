---
title: "资产归还保存"
apiId: "1847853561231179776"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Return"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Return]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产归还保存

>  请求方式	POST | Asset Return (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/returncard/save
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
data	object	否	是	资产归还主表
pk_recorder	string	否	否	经办人主键 示例：1783915319468752903
pk_usedorg	string	否	否	使用单位主键 示例：1782615585063960581
bill_code	string	否	否	单据编码 示例：ZCGH202308230001
pk_org	string	否	是	资产组织主键 示例：1782615585063960581
pk_transitype	string	否	否	交易类型主键 示例：1780776772122445005
bill_type	string	否	是	单据类型 示例：4A11 默认值：4A11
pk_taker	string	否	是	归还人主键 示例：1783895803137359881
take_date	Date	否	是	归还日期 示例：2023-08-23
transi_type	string	否	是	交易类型编码 示例：4A11-01 默认值：4A11-01
bodyvos	object	是	否	资产归还子表
busi_type	string	否	否	业务类型
memo	string	否	否	备注 示例：资产归还主表备注

## 3. 请求示例

Url: /yonbip/am/returncard/save?access_token=访问令牌
Body: {
	"data": {
		"pk_recorder": "1783915319468752903",
		"pk_usedorg": "1782615585063960581",
		"bill_code": "ZCGH202308230001",
		"pk_org": "1782615585063960581",
		"pk_transitype": "1780776772122445005",
		"bill_type": "4A11",
		"pk_taker": "1783895803137359881",
		"take_date": "2023-08-23",
		"transi_type": "4A11-01",
		"bodyvos": [
			{
				"src_pk_bill": "1800237973336752131",
				"pk_usedept_after": "1783879782917734401",
				"src_bill_type": "4A15",
				"pk_usedorg": "1782615585063960581",
				"stock_out_flag": false,
				"src_pk_bill_b": "1800237973336752132",
				"pk_org": "1782615585063960581",
				"return_way": "1",
				"bill_code_src": "ZCJY202308230001",
				"pk_category": "1798726720368410629",
				"pk_location_after": "1801559259869085698",
				"pk_user_after": "1783895803137359881",
				"pk_equip": "1800224306729320467",
				"pk_jobmngfil": "1806914534343442462",
				"stock_in_flag": false,
				"return_date": "2023-08-23",
				"memo": "资产归还子表备注",
				"pk_unit_used_after": "1806914534343442463",
				"pk_location_before": "180691453434344223",
				"pk_unit_used_before": "1806914534342232323",
				"pk_usedept_before": "2318069145343422323",
				"pk_user_before": "23180691453434223232",
				"status_date_before": "2023-08-23",
				"status_date_after": "2023-08-23",
				"pk_status_before": "1806914534343442462",
				"pk_status_after": "23180691453434223232",
				"pk_warehouse": "180691453434344223",
				"pk_icorg_in": "1806914534342232323",
				"srcBillType": "4B12",
				"pk_jobmngfil_before": "1806914534342232323",
				"pk_costcenter_before": "23180691453434223232",
				"pk_costcenter_after": "1806914534343442462",
				"pk_profitcenter_after": "23180691453434223232",
				"pk_profitcenter_before": "180691453434344223"
			}
		],
		"busi_type": "",
		"memo": "资产归还主表备注"
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
data	object	否	返回数据
returncount	long	否	退回次数 示例：0
pk_recorder	string	否	经办人主键 示例：1795729735062388736
verifystate	long	否	审批状态 （0：开立，1：审批中，2：审批通过，3：流程终止，4：退回制单） 示例：0
pk_usedorg	string	否	使用单位主键 示例：1795612044357009415
bill_code	string	否	单据编码 示例：ZCGH202310270001
modifier	string	否	最后修改人主键 示例：1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b
pk_org	string	否	资产组织主键 示例：1795612044357009415
pk_transitype	string	否	交易类型 示例：1785361014001239575
modifiedtime	string	否	最后修改时间 示例：2023-10-27 18:09:51
bill_type	string	否	单据类型 示例：4A11
id	string	否	主表主键 示例：1848333446516572163
pubts	string	否	主表时间戳 示例：2023-10-27 18:09:51
creator__name	string	否	创建人 示例：默认用户
pk_taker__name	string	否	归还人 示例：李坤-员工-01[Myself]
creator	string	否	创建人主键 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
pk_usedorg__name	string	否	使用单位 示例：likun-OrgName-All
billmaketime	string	否	制单时间 示例：2023-10-27 10:38:53
isWfControlled	boolean	否	是否审批流控制 示例：false
pk_org__name	string	否	资产组织 示例：likun-OrgName-All
pk_transitype__name	string	否	交易类型 示例：资产归还
pk_taker	string	否	归还人主键 示例：1795729735062388736
billmaker__name	string	否	制单人 示例：默认用户
bill_status	long	否	单据状态（0：开立，1：已审核 ，2：已关闭 ，3：审核中） 示例：0
modifier__name	string	否	最后修改人 示例：昵称-武慧峰
pk_recorder__name	string	否	经办人 示例：李坤-员工-01[Myself]
take_date	string	否	业务日期 示例：2023-10-24
billmaker	string	否	制单人主键 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
transi_type	string	否	交易类型编码 示例：4A11-01
creationtime	string	否	创建时间 示例：2023-10-27 10:38:53
bodyvos	object	是	详细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"returncount": 0,
		"pk_recorder": "1795729735062388736",
		"verifystate": 0,
		"pk_usedorg": "1795612044357009415",
		"bill_code": "ZCGH202310270001",
		"modifier": "1cf8f2e0-28fe-462d-a8f3-01a6b50b3a2b",
		"pk_org": "1795612044357009415",
		"pk_transitype": "1785361014001239575",
		"modifiedtime": "2023-10-27 18:09:51",
		"bill_type": "4A11",
		"id": "1848333446516572163",
		"pubts": "2023-10-27 18:09:51",
		"creator__name": "默认用户",
		"pk_taker__name": "李坤-员工-01[Myself]",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"pk_usedorg__name": "likun-OrgName-All",
		"billmaketime": "2023-10-27 10:38:53",
		"isWfControlled": false,
		"pk_org__name": "likun-OrgName-All",
		"pk_transitype__name": "资产归还",
		"pk_taker": "1795729735062388736",
		"billmaker__name": "默认用户",
		"bill_status": 0,
		"modifier__name": "昵称-武慧峰",
		"pk_recorder__name": "李坤-员工-01[Myself]",
		"take_date": "2023-10-24",
		"billmaker": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"transi_type": "4A11-01",
		"creationtime": "2023-10-27 10:38:53",
		"bodyvos": [
			{
				"src_pk_bill": "1846176969211772928",
				"pk_equip__spec": "大黄蜂",
				"pk_usedept_after": "1795617808203120640",
				"src_bill_type": "4A15",
				"pk_usedorg": "1795612044357009415",
				"pk_status_before__status_name": "在用",
				"pk_user_before": "1795729735062388736",
				"pk_location_before": "1795818254347796485",
				"pk_status_after__status_name": "闲置",
				"status_date_after": "2023-10-24",
				"stock_out_flag": false,
				"src_pk_bill_b": "1846176969211772929",
				"pk_usedept_after__name": "likun-DP.Name-01",
				"pk_org": "1795612044357009415",
				"pk_user_before__name": "李坤-员工-01[Myself]",
				"pk_equip__equip_code": "EAM-DAILY-202308170142",
				"return_way": "1",
				"id": "1848333446516572164",
				"pubts": "2023-10-27 10:38:54",
				"pk_jobmngfil_before": "1795806099578290177",
				"pk_status_after": "PRESET03_0000LKUKLMA0B7RHFL0000",
				"pk_equip__model": "250型",
				"pk_status_before": "PRESET01_0000LKUKLMA0B7RHFL0000",
				"bill_code_src": "ZCJY202310240004",
				"pk_category__category_name": "LIKUNTEST-军事设备",
				"pk_usedept_before": "1795617808203120640",
				"pk_usedorg__name": "likun-OrgName-All",
				"pk_org__name": "likun-OrgName-All",
				"status_date_before": "2023-08-17",
				"pk_jobmngfil__name": "LIKUNTEST-外星人探索",
				"main_id": "1848333446516572163",
				"pk_category": "1795822231487512579",
				"pk_location_after": "1795818675228901382",
				"pk_user_after": "1795729735062388736",
				"pk_location_before__location_name": "昌平区乐多港万达",
				"pk_location_after__location_name": "西单商业街更新场",
				"pk_equip": "1795843671964254212",
				"pk_user_after__name": "李坤-员工-01[Myself]",
				"pk_jobmngfil": "1795806099578290177",
				"pk_equip__equip_name": "likun-TestCard-起重机",
				"stock_in_flag": false,
				"pk_usedept_before__name": "likun-DP.Name-01",
				"return_date": "2023-10-24"
			}
		]
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

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

