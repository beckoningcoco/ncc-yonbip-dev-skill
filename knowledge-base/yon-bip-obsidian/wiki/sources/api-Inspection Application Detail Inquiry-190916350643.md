---
title: "检验申请详情查询"
apiId: "1909163506436931584"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Inspection Application"
domain: "QMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验申请详情查询

>  请求方式	GET | Inspection Application (QMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/QMS_QIT/checkapply/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
API类别	详情查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
billnum	string	query	是	由于该接口为多种检验申请共用，因此需要根据不同类型传递不同参数，在库检验申请：qms_stockcheckapply_card,工序检验申请：qms_gxCheckApply_card,产品检验申请：qms_prodcheckapply_card,来料检验申请：qms_LLCheckApply_card，其他检验申请：qms_othercheckapply_card，发退货检验申请：qms_deliveryCheckApply_card，工序检验申请：qms_gxCheckApply_card    示例: qms_LLCheckApply_card    默认值: qms_LLCheckApply_card
id	string	query	否	主键    示例: 186445462213
code	string	query	否	单据编码    示例: LLQJ202401170056

## 3. 请求示例

Url: /yonbip/QMS_QIT/checkapply/detail?access_token=访问令牌&billnum=qms_LLCheckApply_card&id=186445462213&code=LLQJ202401170056

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
code	string	否	响应码 示例：200
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
message	string	否	返回信息 示例：操作成功
data	object	否	数据
sourcebillIndex	string	否	来源单据行号 示例：10.00000000
documentNumber	string	否	源头单据号 示例：CGDD-20240111006416
bustype_name	string	否	交易类型 示例：来料检验申请
originalRecord	long	否	原始记录0否1是 示例：1
source	string	否	上游单据类型 示例：upu.pu_arrivalorder
mergeTest	boolean	否	合并检验 true 是 false 否 示例：false
checkPlan	string	否	默认检验方案id 示例：1852065412345233413
mainUnit_name	string	否	主计量 示例：吨
supplier	string	否	供应商id 示例：1855940202964451331
sumNumber	number
小数位数:1,最大长度:28	否	累计检验数量 示例：0
containStep	string	否	是否设置检验方案 0否 1 是 示例：0
sourcebillType	string	否	来源单据类型：pu_arrivalorder-采购到货单、po_osm_arrive_order-委外到货、po_finishedreport-完工报告、IMPSFC_proceTaskReport-工序任务汇报、voucher_delivery-发货单、voucher_salereturn-退货单、JY001-来料检验单、JY002-产品检验单、JY003-在库检验单、JY004-发退货检验单、JY006-其他检验单、JY007-工序检验单、BL001-不良品处理单、XCL001-现存量。 示例：pu_arrivalorder
id	string	否	id 示例：1904888390462472193
purchOrg_name	string	否	采购委外组织 示例：宋驰
checkType	string	否	检验类型：001-来料检验、002-产品检验、003-在库检验、004-发货检验、005-退货检验、006-其他检验、007-工序检验、008-委外检验、009-工序委外检验。 示例：001
sampleUnitName	string	否	取样单位 示例：吨
expireDateNo	long	否	保质期 示例：1
mainUnit	string	否	主单位ID 示例：1471409676319981575
checkNumber	number
小数位数:8,最大长度:28	否	请检数量 示例：100
isInspectionItemConfirm	string	否	单一取样方式 0否 1是 示例：0
mainUnit_precision	long	否	主单位精度 示例：6
spotchekastnum	number
小数位数:1,最大长度:28	否	本单抽检件数 示例：0
isWfControlled	boolean	否	是否审批流控制 true 是 false 否 示例：false
checkOrg	string	否	请检组织id 示例：1852041549484916745
sampling	long	否	取样0否1是 示例：0
sampleNum	number
小数位数:8,最大长度:28	否	已取样个数 示例：0
makingSample	long	否	制样0否1是 示例：0
castunitid	string	否	检验单位ID 示例：1471409676319981575
samplingUnit	string	否	取样单位(检验方案带出) 0同检验单位1自选计量单位 示例：0
version	string	否	检验方案版本 示例：1.0
product_name	string	否	物料名称 示例：宋驰特征2
inspectastnum	number
小数位数:1,最大长度:28	否	请检件数 示例：100
qty	number
小数位数:1,最大长度:28	否	到货数量 示例：100
purchOrg	string	否	采购组织id 示例：1852041549484916745
terminate	boolean	否	终止 true 是 false 否 示例：false
documentIndex	string	否	源头单据行号 示例：10.00000000
returncount	long	否	退回次数 示例：0
verifystate	long	否	单据状态：0-开立，1-审核中，2-已审核，4-开立 示例：2
sourcebillId	string	否	来源单据id 示例：1904888270201815049
checkPlan_recordValue	string	否	记录样本值 示例：2
code	string	否	编码 示例：LLQJ202401110001
checkPlan_name	string	否	检验方案 示例：宋驰
inspectionrule	string	否	检验规则0按物料检验1按检验项目检验 示例：1
sampleUnit	string	否	取样单位Id 示例：1471409676319981575
castunitid_precision	long	否	辅单位精度 示例：6
creatorId	string	否	创建人id 示例：1852040802170568714
expireDateUnit	long	否	保质期单位 示例：6
exchangeType	long	否	换算率类型 示例：0
reexamination	boolean	否	复检 true 是 false 否 示例：false
product_code	string	否	物料编码 示例：789292
spotcheknum	number
小数位数:8,最大长度:28	否	本单抽检数量 示例：0
audit_time	string	否	审批时间 示例：2024-01-11 15:29:57
LLSourceInformationList	object	是	源单信息子表
qualityinSpectionCenter_name	string	否	质检组织 示例：宋驰
sourcebillNum	string	否	来源单据号 示例：DH240111000001
documentStatus	string	否	源头单据类型 示例：st_purchaseorder
checkPlanDetailId	string	否	检验方案明细id 示例：1852065412345233414
pubts	string	否	时间戳 示例：2024-01-11 15:30:31
supplier_name	string	否	供应商 示例：内部供应商2
currentStage	string	否	当前检验阶段 示例：1
castunitid_name	string	否	检验单位 示例：吨
product	string	否	物料 示例：1881909662613241865
creator	string	否	创建人 示例：宋驰
vchangerate	string	否	质检换算率 示例：1/1
sourcebillbId	string	否	到货单子表ID 示例：1904888270201815050
directPrintCount	long	否	直接打印次数 示例：0
businessStart	string	否	业务日期起 示例：2024-01-11 00:00:00
auditor	string	否	审核人 示例：宋驰
checkOrg_name	string	否	请检组织 示例：宋驰
qualityinSpectionCenter	string	否	质检组织id 示例：1852041549484916745
notTestNumber	number
小数位数:8,最大长度:28	否	未检验数量 示例：100
checkDate	string	否	请检日期 示例：2024-01-11 00:00:00
bustype	string	否	交易类型id 示例：1468336043126686219
businessPeriod	string	否	业务期间 示例：2024-01-11~2024-01-11
createTime	string	否	创建时间 示例：2024-01-11 15:29:55
documentId	string	否	订单单据id 示例：1904887918014496770
businessEnd	string	否	业务日期止 示例：2024-01-11 00:00:00
LLCheckInformationList	object	是	申请信息子表
pk_proddept	string	否	生产部门id 示例：178768567
pk_proddept_name	string	否	生产部门名称 示例：生产1
activity	string	否	项目活动 示例：1564563534
activityCode	string	否	活动编码 示例：53
activityName	string	否	活动名称 示例：活动1
projectId	string	否	项目id 示例：167657657
projectCode	string	否	项目编码 示例：2342
projectName	string	否	项目名称 示例：项目1
wbs	string	否	wbs 示例：16745645345
wbsCode	string	否	WBS任务编码 示例：123
wbsName	string	否	WBS任务名称 示例：任务1
LLCheckApplyExt!out_sys_id	string	否	外部来源线索
LLCheckApplyExt!out_sys_code	string	否	外部来源编码
LLCheckApplyExt!out_sys_type	string	否	外部来源类型
LLCheckApplyExt!out_sys_version	string	否	外部来源版本

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"sourcebillIndex": "10.00000000",
		"documentNumber": "CGDD-20240111006416",
		"bustype_name": "来料检验申请",
		"originalRecord": 1,
		"source": "upu.pu_arrivalorder",
		"mergeTest": false,
		"checkPlan": "1852065412345233413",
		"mainUnit_name": "吨",
		"supplier": "1855940202964451331",
		"sumNumber": 0,
		"containStep": "0",
		"sourcebillType": "pu_arrivalorder",
		"id": "1904888390462472193",
		"purchOrg_name": "宋驰",
		"checkType": "001",
		"sampleUnitName": "吨",
		"expireDateNo": 1,
		"mainUnit": "1471409676319981575",
		"checkNumber": 100,
		"isInspectionItemConfirm": "0",
		"mainUnit_precision": 6,
		"spotchekastnum": 0,
		"isWfControlled": false,
		"checkOrg": "1852041549484916745",
		"sampling": 0,
		"sampleNum": 0,
		"makingSample": 0,
		"castunitid": "1471409676319981575",
		"samplingUnit": "0",
		"version": "1.0",
		"product_name": "宋驰特征2",
		"inspectastnum": 100,
		"qty": 100,
		"purchOrg": "1852041549484916745",
		"terminate": false,
		"documentIndex": "10.00000000",
		"returncount": 0,
		"verifystate": 2,
		"sourcebillId": "1904888270201815049",
		"checkPlan_recordValue": "2",
		"code": "LLQJ202401110001",
		"checkPlan_name": "宋驰",
		"inspectionrule": "1",
		"sampleUnit": "1471409676319981575",
		"castunitid_precision": 6,
		"creatorId": "1852040802170568714",
		"expireDateUnit": 6,
		"exchangeType": 0,
		"reexamination": false,
		"product_code": "789292",
		"spotcheknum": 0,
		"audit_time": "2024-01-11 15:29:57",
		"LLSourceInformationList": [
			{
				"arrivalBId": "1904888270201815050",
				"sourcebillIndex": "10.00000000",
				"source": "upu.pu_arrivalorder",
				"conversionType": 0,
				"sourcebillTypeb": "pu_arrivalorder",
				"businessDate": "2024-01-11 00:00:00",
				"checkUnit_precision": 6,
				"orderBillType": "st_purchaseorder",
				"id": "1904888390462472197",
				"pubts": "2024-01-11 15:29:56",
				"mainUnitb": "1471409676319981575",
				"conversion": "1/1",
				"sourceid": "1904888270201815049",
				"arrivalId": "1904888270201815049",
				"checkUnit": "1471409676319981575",
				"mainUnitb_precision": 6,
				"sourceautoid": "1904888270201815050",
				"mainUnitb_name": "吨",
				"orderbillIndex": "10.00000000",
				"checkNumberb": 100,
				"parent_id": "1904888390462472193",
				"upcode": "DH240111000001",
				"qty": 100,
				"orderbillNum": "CGDD-20240111006416",
				"checkmNumberb": 100,
				"orderbill": "1904887918014496770",
				"sourcebillNumb": "DH240111000001",
				"checkUnit_name": "吨"
			}
		],
		"qualityinSpectionCenter_name": "宋驰",
		"sourcebillNum": "DH240111000001",
		"documentStatus": "st_purchaseorder",
		"checkPlanDetailId": "1852065412345233414",
		"pubts": "2024-01-11 15:30:31",
		"supplier_name": "内部供应商2",
		"currentStage": "1",
		"castunitid_name": "吨",
		"product": "1881909662613241865",
		"creator": "宋驰",
		"vchangerate": "1/1",
		"sourcebillbId": "1904888270201815050",
		"directPrintCount": 0,
		"businessStart": "2024-01-11 00:00:00",
		"auditor": "宋驰",
		"checkOrg_name": "宋驰",
		"qualityinSpectionCenter": "1852041549484916745",
		"notTestNumber": 100,
		"checkDate": "2024-01-11 00:00:00",
		"bustype": "1468336043126686219",
		"businessPeriod": "2024-01-11~2024-01-11",
		"createTime": "2024-01-11 15:29:55",
		"documentId": "1904887918014496770",
		"businessEnd": "2024-01-11 00:00:00",
		"LLCheckInformationList": [
			{
				"sampleMethod": "1852064098085240837",
				"checkProject": "1852064484632297479",
				"flag": "1",
				"checkPlan_name": "宋驰",
				"standardDes": "1",
				"rule": "1",
				"originalRecord": 1,
				"inspectionPlanClass": "1852064647841054726",
				"testBasis": "1876684903618707461",
				"destroyInspect": 0,
				"checkProject_name": "宋驰",
				"checkProjectClass": "1852064252704063497",
				"samplingUnitName": "吨",
				"checkPlan": "1852065412345233413",
				"inspectionitembId": "1852065412345233410",
				"standardFormula": "{\"id\":\"\\\"(\\\"+2*(Code_1852767648088064005+2),20+\\\"]\\\"\",\"name\":\"\\\"(\\\"+2*(宋驰1+2),20+\\\"]\\\"\"}",
				"coord": true,
				"calFormula": "{\"id\":\"5+Code_1852767648088064005\",\"name\":\"5+宋驰1\"}",
				"decimalNumber": 1,
				"sampleMethod_name": "宋驰全检",
				"checkProjectClass_name": "宋驰",
				"inspectiontype": "0",
				"attachmentId": "c90b565b-d29a-497b-af34-1e8ce8fa4ca9",
				"id": "1904888390462472194",
				"checkPlanDetailId": "1852065412345233414",
				"pubts": "2024-01-11 15:29:56",
				"testBasis_name": "花1",
				"cruxProject": "1",
				"checkPlan_version": "1.0",
				"sampling": 0,
				"inspectionPlanClass_name": "宋驰",
				"checkProject_code": "宋驰",
				"makingSample": 0,
				"samplingUnit": "1471409676319981575",
				"checkPlan_code": "Q06013",
				"testBasis_attachmentId": "db8d7259-f69b-49a9-9f28-2a9ee3218c72",
				"testMethod_method": "花检测方法",
				"isGeneOriRecord": 0,
				"vrowno": 10,
				"sampleMethod_checkMethod": "0",
				"parent_id": "1904888390462472193",
				"additionalSample": "0",
				"statutoryStandard": "2",
				"testMethod": "1876695177180479495",
				"sampleValue": "0",
				"qualitynature": "0",
				"samplingPrecision": 6
			}
		],
		"pk_proddept": "178768567",
		"pk_proddept_name": "生产1",
		"activity": "1564563534",
		"activityCode": "53",
		"activityName": "活动1",
		"projectId": "167657657",
		"projectCode": "2342",
		"projectName": "项目1",
		"wbs": "16745645345",
		"wbsCode": "123",
		"wbsName": "任务1",
		"LLCheckApplyExt!out_sys_id": "",
		"LLCheckApplyExt!out_sys_code": "",
		"LLCheckApplyExt!out_sys_type": "",
		"LLCheckApplyExt!out_sys_version": ""
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
999	查询失败	

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

