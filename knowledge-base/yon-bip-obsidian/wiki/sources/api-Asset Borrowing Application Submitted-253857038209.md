---
title: "资产借用申请保存"
apiId: "2538570382092795908"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Borrowing Application"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Borrowing Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产借用申请保存

>  请求方式	POST | Asset Borrowing Application (GAM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/ACC/borrowapplycard/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	资产借用申请对象
pk_org__name	string	否	否	资产组织 示例：资产组织
id	string	否	否	资产借用申请主表id
bill_code	string	否	否	单据编码 示例：JYSQ202507040002
pk_transitype__name	string	否	否	交易类型名称 示例：借用申请
bill_status	number
小数位数:0,最大长度:10	否	否	单据状态 示例：0 默认值：0
borrow_mode	number
小数位数:0,最大长度:10	否	否	借用模式 示例：1
borrow_dept__name	string	否	否	资产借出部门
lender__name	string	否	否	借出人
pk_usedept__name	string	否	否	借用部门 示例：测试部门
bill_type	string	否	是	单据类型 示例：4A38 默认值：4A38
transi_type	string	否	是	交易类型 示例：4A38-01 默认值：4A38-01
pk_org	string	否	是	资产组织主键 示例：2217359261467934726
pk_transitype	string	否	否	单据类型主键 示例：2084475473001185382
billmaker	string	否	否	制单人主键 示例：11d49b2d-4f1d-4865-a2a8-1d2156a4a6ea
billmaker__name	string	否	否	制单人 示例：刘龙
billmaketime	string	否	否	制单时间 示例：2025-07-04 16:08:39
pk_user	string	否	是	申请人主键 示例：2221809706592108548
pk_user__name	string	否	否	申请人 示例：白璇
memo	string	否	否	申请说明 示例：test
bill_date	date
格式:yyyy-MM-dd	否	否	申请时间 示例：2025-07-04
pk_usedept	string	否	否	申请部门主键 示例：2217359716720836612
complete_flag	boolean	否	否	完成标记 示例：false
verifystate	number
小数位数:0,最大长度:10	否	否	审批状态 示例：0
bodyvos	object	是	否	资产借用申请表体
_status	string	否	是	状态（若Update需要填主子表id） 示例：Insert或Update 默认值：Insert

## 3. 请求示例

Url: /yonbip/ACC/borrowapplycard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_org__name": "资产组织",
			"id": "",
			"bill_code": "JYSQ202507040002",
			"pk_transitype__name": "借用申请",
			"bill_status": 0,
			"borrow_mode": 1,
			"borrow_dept__name": "",
			"lender__name": "",
			"pk_usedept__name": "测试部门",
			"bill_type": "4A38",
			"transi_type": "4A38-01",
			"pk_org": "2217359261467934726",
			"pk_transitype": "2084475473001185382",
			"billmaker": "11d49b2d-4f1d-4865-a2a8-1d2156a4a6ea",
			"billmaker__name": "刘龙",
			"billmaketime": "2025-07-04 16:08:39",
			"pk_user": "2221809706592108548",
			"pk_user__name": "白璇",
			"memo": "test",
			"bill_date": "2025-07-04",
			"pk_usedept": "2217359716720836612",
			"complete_flag": false,
			"verifystate": 0,
			"bodyvos": [
				{
					"quantity": 1,
					"processing_status": "0",
					"borrow_quantity": 0,
					"nonissue_quantity": 0,
					"untreated_quantity": 1,
					"start_date": "2025-07-04",
					"pk_equip__equip_code": "EAM-2025070300004",
					"pk_equip": "2305036749606748164",
					"spec": "aaa",
					"pk_category": "2087437480019099657",
					"pk_category__category_name": "自动化_资产类别_技术参数",
					"pk_equip__equip_name": "aaa",
					"model": "test",
					"expect_end_date": "2025-07-26",
					"_status": "Insert或Update",
					"memo": "test",
					"id": "",
					"main_id": ""
				}
			],
			"_status": "Insert或Update"
		}
	]
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功！
data	object	否	data
_entityName	string	否	_entityName
pk_org__name	string	否	pk_org__name 示例：资产组织
bill_code	string	否	bill_code 示例：JYSQ202507040002
pk_transitype__name	string	否	pk_transitype__name 示例：借用申请
bill_status	number
小数位数:0,最大长度:10	否	bill_status 示例：0
borrow_mode	number
小数位数:0,最大长度:10	否	borrow_mode 示例：1
borrow_dept__name	string	否	borrow_dept__name
lender__name	string	否	lender__name
pk_usedept__name	string	否	pk_usedept__name 示例：测试部门
bill_type	string	否	bill_type 示例：4A38
transi_type	string	否	transi_type 示例：4A38-01
pk_org	string	否	pk_org 示例：2217359261467934726
pk_transitype	string	否	pk_transitype 示例：2084475473001185382
billmaker	string	否	billmaker 示例：11d49b2d-4f1d-4865-a2a8-1d2156a4a6ea
billmaker__name	string	否	billmaker__name 示例：刘龙
billmaketime	string	否	billmaketime 示例：2025-07-04 16:10:08
pk_user	string	否	pk_user 示例：2221809706592108548
pk_user__name	string	否	pk_user__name 示例：白璇
memo	string	否	memo 示例：test
bill_date	string	否	bill_date 示例：2025-07-04 00:00:00
pk_usedept	string	否	pk_usedept 示例：2217359716720836612
complete_flag	boolean	否	complete_flag 示例：false
verifystate	number
小数位数:0,最大长度:10	否	verifystate 示例：0
bodyvos	object	是	bodyvos
_convert_bodyvos	string	否	_convert_bodyvos
_status	string	否	_status
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
detail	string	否	detail
_convert_detail	string	否	_convert_detail
msg	string	否	msg
id	string	否	id 示例：2305681106382880769
sysid	string	否	sysid 示例：AUM
creator	string	否	creator 示例：11d49b2d-4f1d-4865-a2a8-1d2156a4a6ea
creator__name	string	否	creator__name 示例：刘龙
creationtime	string	否	creationtime 示例：2025-07-04 16:10:08
isWfControlled	boolean	否	isWfControlled 示例：false
pubts	string	否	pubts 示例：2025-07-04 16:10:08
errorDetail	string	否	errorDetail

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"_entityName": "",
		"pk_org__name": "资产组织",
		"bill_code": "JYSQ202507040002",
		"pk_transitype__name": "借用申请",
		"bill_status": 0,
		"borrow_mode": 1,
		"borrow_dept__name": "",
		"lender__name": "",
		"pk_usedept__name": "测试部门",
		"bill_type": "4A38",
		"transi_type": "4A38-01",
		"pk_org": "2217359261467934726",
		"pk_transitype": "2084475473001185382",
		"billmaker": "11d49b2d-4f1d-4865-a2a8-1d2156a4a6ea",
		"billmaker__name": "刘龙",
		"billmaketime": "2025-07-04 16:10:08",
		"pk_user": "2221809706592108548",
		"pk_user__name": "白璇",
		"memo": "test",
		"bill_date": "2025-07-04 00:00:00",
		"pk_usedept": "2217359716720836612",
		"complete_flag": false,
		"verifystate": 0,
		"bodyvos": [
			{
				"_entityName": "",
				"quantity": 1,
				"processing_status": 0,
				"borrow_quantity": 0,
				"nonissue_quantity": 0,
				"untreated_quantity": 1,
				"hasDefaultInit": true,
				"rowno": "10",
				"start_date": "2025-07-04 00:00:00",
				"pk_equip__equip_code": "EAM-2025070300004",
				"pk_equip": "2305036749606748164",
				"spec": "aaa",
				"pk_category": "2087437480019099657",
				"pk_category__category_name": "自动化_资产类别_技术参数",
				"pk_equip__equip_name": "aaa",
				"model": "test",
				"expect_end_date": "2025-07-26 00:00:00",
				"_status": "",
				"ttt_id": "rowId_8",
				"id": "2305681106382880770",
				"main_id": "2305681106382880769",
				"pk_org": "2217359261467934726"
			}
		],
		"_convert_bodyvos": "",
		"_status": "",
		"resubmitCheckKey": "aum_borrowapply_card_add_5c0f365d-d29f-44b3-b505-42200c5c991c",
		"detail": "",
		"_convert_detail": "",
		"msg": "",
		"id": "2305681106382880769",
		"sysid": "AUM",
		"creator": "11d49b2d-4f1d-4865-a2a8-1d2156a4a6ea",
		"creator__name": "刘龙",
		"creationtime": "2025-07-04 16:10:08",
		"isWfControlled": false,
		"pubts": "2025-07-04 16:10:08"
	},
	"errorDetail": ""
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
	1	2026-05-20	
更新
请求说明
资产借用申请支持用户级

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

