---
title: "资产借用申请详情查询"
apiId: "2542595419268972552"
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

# 资产借用申请详情查询

>  请求方式	POST | Asset Borrowing Application (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/borrowapply/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	是	资产借用申请主表主键 示例：2286573509772050436

## 3. 请求示例

Url: /yonbip/ACC/borrowapply/detail?access_token=访问令牌
Body: {
	"id": "2286573509772050436"
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
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
bill_code	string	否	单据编码 示例：JYSQ202502250001
bill_date	date
格式:yyyy-MM-dd	否	申请时间 示例：2025-02-25 00:00:00
bill_status	string	否	枚举: 0 开立, 3 审核中, 1 已审核, 2 已关闭 示例：2
bill_type	string	否	单据类型 示例：4A38
borrow_dept	string	否	资产借出部门主键
borrow_dept__name	string	否	资产借出部门
borrow_mode	string	否	枚举: 0 部门借用, 1 集中管理 示例：1
busi_type	string	否	业务类型
complete_flag	string	否	完成标记 示例：false
id	string	否	主键 示例：2209742420375502849
isWfControlled	string	否	是否审批流控制 示例：false
lender	string	否	借出人主键
lender__name	string	否	借出人
memo	string	否	申请说明
pk_applier	string	否	申请人主键
pk_applier__name	string	否	申请人
pk_appydept	string	否	申请部门主键
pk_appydept_v__name	string	否	申请部门版本
pk_appydept__name	string	否	申请部门
pk_group	string	否	集团主键
pk_org	string	否	资产组织主键 示例：2107557314389606404
pk_org_v__name	string	否	资产组织版本
pk_org__name	string	否	资产组织 示例：资产服务
pk_transitype	string	否	交易类型主键 示例：2107554909184852088
pk_transitype__name	string	否	交易类型 示例：借用申请
pk_unit_used	string	否	使用权主键
pk_unit_used_v__name	string	否	使用权版本
pk_unit_used__name	string	否	使用权
pk_usedept	string	否	申请部门主键 示例：2107557537696972808
pk_usedept_v__name	string	否	借用部门版本
pk_usedept__name	string	否	申请部门 示例：销售部门
pk_user	string	否	申请人主键 示例：2123070315341283332
pk_user__name	string	否	申请人 示例：郝小侠
pubts	string	否	时间戳 示例：2026-05-15 10:56:03
reason	string	否	原因理由
returncount	string	否	退回次数 示例：0
sysid	string	否	系统标识 示例：AUM
transi_type	string	否	交易类型编码 示例：4A38-01
verifystate	string	否	枚举: 0 开立, 1 审批中, 2 审批通过, 3 流程终止, 4 退回制单 示例：2
auditor	string	否	审核人主键 示例：1e6c32a2-8ee0-4ee6-9d62-f7c21388ac16
auditor__name	string	否	审核人 示例：郝小侠
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	审核时间 示例：2025-07-17 16:21:42
billmaker	string	否	制单人主键 示例：4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2
billmaker__name	string	否	制单人
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	制单时间 示例：2025-02-25 09:44:35
check_opinion	string	否	审核意见
creationtime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间 示例：2025-02-25 09:44:35
creator	string	否	创建人主键 示例：4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2
creator__name	string	否	创建人
modifiedtime	date
格式:yyyy-MM-dd HH:mm:ss	否	最后修改时间
modifier	string	否	最后修改人主键
modifier__name	string	否	最后修改人
msg21	string	否	测试
bodyvos	object	是	表体信息
detail	object	是	子表 detail

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"bill_code": "JYSQ202502250001",
		"bill_date": "2025-02-25 00:00:00",
		"bill_status": "2",
		"bill_type": "4A38",
		"borrow_dept": "",
		"borrow_dept__name": "",
		"borrow_mode": "1",
		"busi_type": "",
		"complete_flag": "false",
		"id": "2209742420375502849",
		"isWfControlled": "false",
		"lender": "",
		"lender__name": "",
		"memo": "",
		"pk_applier": "",
		"pk_applier__name": "",
		"pk_appydept": "",
		"pk_appydept_v__name": "",
		"pk_appydept__name": "",
		"pk_group": "",
		"pk_org": "2107557314389606404",
		"pk_org_v__name": "",
		"pk_org__name": "资产服务",
		"pk_transitype": "2107554909184852088",
		"pk_transitype__name": "借用申请",
		"pk_unit_used": "",
		"pk_unit_used_v__name": "",
		"pk_unit_used__name": "",
		"pk_usedept": "2107557537696972808",
		"pk_usedept_v__name": "",
		"pk_usedept__name": "销售部门",
		"pk_user": "2123070315341283332",
		"pk_user__name": "郝小侠",
		"pubts": "2026-05-15 10:56:03",
		"reason": "",
		"returncount": "0",
		"sysid": "AUM",
		"transi_type": "4A38-01",
		"verifystate": "2",
		"auditor": "1e6c32a2-8ee0-4ee6-9d62-f7c21388ac16",
		"auditor__name": "郝小侠",
		"audittime": "2025-07-17 16:21:42",
		"billmaker": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
		"billmaker__name": "",
		"billmaketime": "2025-02-25 09:44:35",
		"check_opinion": "",
		"creationtime": "2025-02-25 09:44:35",
		"creator": "4c4c966a-b9c1-4fc1-bada-1e2aa7fa98e2",
		"creator__name": "",
		"modifiedtime": "2026-06-07 13:21:48",
		"modifier": "",
		"modifier__name": "",
		"msg21": "",
		"bodyvos": [
			{
				"borrow_quantity": 1,
				"close_flag": "true",
				"end_date": "2026-06-07",
				"expect_end_date": "2026-06-07",
				"expect_start_date": "2026-06-07",
				"id": "2209742420375502850",
				"main_id": "2209742420375502849",
				"memo": "",
				"model": "",
				"nonissue_quantity": 0,
				"pk_category": "2108096667780644870",
				"pk_category__category_name": "电子设备",
				"pk_category__innercode": "RHQD",
				"pk_equip": "2195677957258739722",
				"pk_equip__card_code": "",
				"pk_equip__equip_code": "EAM-2025020600000002",
				"pk_equip__equip_name": "测试验证计量卡片",
				"pk_equip__is_pre": "false",
				"pk_group": "",
				"pk_jobmngfil": "",
				"pk_jobmngfil__name": "",
				"pk_material": "",
				"pk_material_v__code": "",
				"pk_material__code": "",
				"pk_org": "2107557314389606404",
				"pk_org_v__name": "",
				"pk_org__name": "资产服务",
				"pk_warehouse": "",
				"pk_warehouse__name": "",
				"processing_status": "1",
				"pubts": "2026-05-15 10:56:03",
				"quantity": 1,
				"rowno": "10",
				"serial_num": "",
				"spec": "测试验证计量卡片",
				"start_date": "2025-02-25",
				"sysid": "",
				"untreated_quantity": 0
			}
		],
		"detail": [
			{
				"borrow": "2539302888840101895",
				"borrow_b": "2539302888840101896",
				"facturer_name": "",
				"id": "2539302888840101902",
				"main_id": "2209742420375502849",
				"pk_category": "2108096667780644870",
				"pk_category__category_name": "电子设备",
				"pk_equip": "2195677957258739722",
				"pk_equip__equip_code": "EAM-2025020600000002",
				"pk_equip__equip_name": "测试验证计量卡片",
				"pk_equip__model": "",
				"pk_equip__pk_location": "",
				"pk_equip__pk_location__location_name": "",
				"pk_equip__spec": "",
				"pk_jobmngfil": "",
				"pk_jobmngfil__name": "",
				"pk_manager": "",
				"pk_manager__name": "",
				"pk_mandept": "2107557537696972808",
				"pk_mandept__name": "销售部门",
				"pk_ownerorg": "2107557314389606404",
				"pk_ownerorg__name": "资产服务",
				"pk_ownerunit": "2107557314389606404",
				"pk_ownerunit__name": "资产服务",
				"pk_supplier": "",
				"pk_supplier__name": "",
				"pk_usedept": "2107557537696972808",
				"pk_usedept__name": "销售部门",
				"pk_usedorg": "2107557314389606404",
				"pk_usedorg__name": "资产服务",
				"pk_user": "2123070315341283332",
				"pk_user__name": "郝小侠",
				"src_bill_type": "",
				"src_pk_bill": "2539302888840101895",
				"src_pk_bill_b": "2539302888840101896",
				"src_pk_transitype": "",
				"src_transitype": "",
				"start_used_date": "2025-02-06"
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
999	系统异常	

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

