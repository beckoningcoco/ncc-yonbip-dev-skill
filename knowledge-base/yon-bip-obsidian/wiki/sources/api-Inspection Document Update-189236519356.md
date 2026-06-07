---
title: "检验单更新"
apiId: "1892365193567535107"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Document"
domain: "QMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验单更新

>  请求方式	POST | Inspection Document (QMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/QMS_QIT/inspectorder/update
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	业务数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	检验单id： 示例：1539608448409796618
code	string	否	否	检验单号：优先按编码规则，编码规则若为自动编码（不可改），按自动编码规则生成，若为自动编码（可改），以输入为准 若为手工编码，以输入为准，后台保存时校验必输。 示例：LLJY202301010001
pk_inspecter	string	否	否	检验员id 示例：1503246482288410629
pk_inspecter_code	string	否	否	检验员编码
inspectDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	检验开始日期 示例：2023-11-02 00:00:00
note	string	否	否	备注
autoComplete	string	否	否	自动检验完成：0-否、1-是，传空默认自动检验完成 示例：1 默认值：1
qms_qit_incominspectorder_bList	object	是	否	检验信息
qms_qit_inspectorder_sim_recordList_fixed	object	是	否	样本记录
qms_qit_incominspectorder_resultList	object	是	否	处理结果
qms_qit_incominspectorder_sourcelistList	object	是	否	源单信息

## 3. 请求示例

Url: /yonbip/QMS_QIT/inspectorder/update?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1539608448409796618",
		"code": "LLJY202301010001",
		"pk_inspecter": "1503246482288410629",
		"pk_inspecter_code": "",
		"inspectDate": "2023-11-02 00:00:00",
		"note": "",
		"autoComplete": "1",
		"qms_qit_incominspectorder_bList": [
			{
				"id": "1500425710867054598",
				"samplingUnit": "",
				"samplingUnitCode": "",
				"checkNumber": 0,
				"qualifiedNumber": 1,
				"unQualifiedNumber": 1,
				"inspectValue": "2",
				"judgmentResult": 1,
				"inspectorId": "",
				"inspectorCode": "",
				"inspectDate": "2026-06-07 13:18:33",
				"inspectTime": "2026-06-07 13:18:33",
				"note": "",
				"coord": true,
				"qmsEquipIdName": "",
				"qms_qit_inspectorder_sim_recordList_fixed2": [
					{
						"sampleCode": "",
						"inspectValue": ""
					}
				],
				"qms_qit_bad_itemsList": [
					{
						"badItemsCode": "",
						"number": 0
					}
				]
			}
		],
		"qms_qit_inspectorder_sim_recordList_fixed": [
			{
				"pk_inspectorder_b": "1500425710867054598",
				"sample_code": "",
				"inspect_value": ""
			}
		],
		"qms_qit_incominspectorder_resultList": [
			{
				"handleType": "",
				"handleTypeCode": "",
				"handleTypeType": "",
				"nnum": 0,
				"inspectResult": "",
				"isStorage": "",
				"stockStatus": 0,
				"stockStatusCode": "",
				"inStockBatchCode": "",
				"produceDate": "2026-06-07 13:18:33",
				"validityDate": "2026-06-07 13:18:33",
				"destroySimpleResult": 0,
				"baditemFlag": "",
				"qualityGrade": 0,
				"qualifyGrade": "",
				"badReasonId": "",
				"scrapProcessCode": "",
				"reworkProcessCode": "",
				"scrapLeaderId": "",
				"scrapLeaderCode": "",
				"note": "",
				"qms_qit_incom_bad_itemsList": [
					{
						"badItemsCode": "",
						"number": 0
					}
				],
				"qms_qit_incominspectorder_resultSn": [
					{
						"sn": ""
					}
				]
			}
		],
		"qms_qit_incominspectorder_sourcelistList": [
			{
				"sourceautoid": "",
				"qms_qit_incominspectorder_detailresultList": [
					{
						"handleType": "",
						"handleTypeCode": "",
						"handleTypeType": "",
						"nnum": 0,
						"inspectResult": "",
						"isStorage": "",
						"stockStatus": 0,
						"stockStatusCode": "",
						"inStockBatchCode": "",
						"produceDate": "2026-06-07 13:18:33",
						"validityDate": "2026-06-07 13:18:33",
						"destroySimpleResult": 0,
						"baditemFlag": "",
						"qualityGrade": 0,
						"qualifyGrade": "",
						"badReasonId": "",
						"scrapProcessCode": "",
						"reworkProcessCode": "",
						"scrapLeaderId": "",
						"scrapLeaderCode": "",
						"note": "",
						"qms_qit_detailresult_bad_itemsList": [
							{
								"badItemsCode": "",
								"number": 0
							}
						]
					}
				]
			}
		]
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
code	string	否	返回编码 示例：200
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
data	object	否	返回数据
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
pk_org	string	否	质检组织id 示例：1503239447124639752
pk_org_name	string	否	质检组织 示例：星之国
pk_purchase_org	string	否	采购组织id 示例：1503239447124639752
pk_purchase_org_name	string	否	采购组织 示例：星之国
pk_applycheckorg	string	否	请检组织id 示例：1503239447124639752
pk_applycheckorg_name	string	否	请检组织 示例：星之国
pk_outsupplier	number
小数位数:0,最大长度:28	否	供应商id 示例：1503239447124639752
pk_outsupplier_name	string	否	供应商 示例：星之国
factory	string	否	工厂id 示例：1503239447124639752
factory_name	string	否	工厂 示例：星之国
pk_inspecter	string	否	检验员id 示例：1503246482288410629
pk_inspecter_name	string	否	检验员 示例：艾斯
pk_inspectdept	string	否	检验部门id 示例：1503239936753532936
pk_inspectdept_name	string	否	检验部门 示例：质检部
pk_purchase_dept	string	否	采购部门id 示例：1769915804801302537
pk_purchase_dept_name	string	否	采购部门 示例：采购部
creatorId	string	否	创建人id 示例：1503246490875723783
creator	string	否	创建人 示例：张三
createTime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间 示例：2023-11-02 13:50:48
modifierId	string	否	修改人id 示例：1768148966910722049
modifier	string	否	修改人 示例：李四
modifyTime	date
格式:yyyy-MM-dd HH:mm:ss	否	修改时间 示例：2023-12-25 10:44:22
initinspectorder_id	string	否	初始检验单id 示例：1852885373117530115
initinspectorder_code	string	否	初始检验单编码 示例：LLJY202311020002
pk_applycheck	string	否	检验申请单id 示例：1846260016694165513
vapplycheckcode	string	否	检验申请单号 示例：LLQJ202310240001
pk_sourcebill	string	否	请检来源单据id 示例：1815090966611623937
pk_sourcebill_b	string	否	请检来源单据行id 示例：1815090966611623938
sourcerowno	string	否	请检来源单据行号 示例：10
sourcebilltype	string	否	请检来源单据类型：pu_arrivalorder-采购到货单、po_osm_arrive_order-委外到货、po_finishedreport-完工报告、IMPSFC_proceTaskReport-工序任务汇报、voucher_delivery-发货单、voucher_salereturn-退货单、JY001-来料检验单、JY002-产品检验单、JY003-在库检验单、JY004-发退货检验单、JY006-其他检验单、JY007-工序检验单、BL001-不良品处理单、XCL001-现存量。 示例：po_osm_arrive_order
pk_orderbill	string	否	请检源头单据id 示例：1815090288006791175
vordercode	string	否	请检源头单据号 示例：WWDD20230912000001
vorderrowno	string	否	请检源头行号 示例：10
orderbilltype	string	否	请检源头单据类型：po_production_order-生产订单、po_subcontract_order-委外订单、po_finishedreport-完工报告。 示例：po_subcontract_order
id	string	否	检验单id 示例：1852885373117530115
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳 示例：2023-12-25 10:44:22
code	string	否	检验单号 示例：LLJY202311020002
billtype	string	否	检验类型：001-来料检验、002-产品检验、003-在库检验、004-发货检验、005-退货检验、006-其他检验、007-工序检验、008-委外检验、009-工序委外检验。 示例：001
recheck	boolean	否	复检：true-是、false-否。 示例：false
terminate	boolean	否	终止：true-是、false-否。 示例：false
isWfControlled	boolean	否	是否审批流控制：true-是、false-否。 示例：false
inspectionplanSingle	boolean	否	是否单一取样：true-是、false-否。 示例：false
combinecheck	boolean	否	合并检验：true-是、false-否。 示例：false
saveSnFlag	boolean	否	是否保存序列号：true-是、false-否。 示例：false
status	number
小数位数:0,最大长度:28	否	单据状态：11-开立、0-待检、10-检验完成、1-审批中、2-已审批。 示例：0
verifystate	number
小数位数:0,最大长度:28	否	单据状态：11-开立、0-待检、10-检验完成、1-审批中、2-已审批、4-已驳回。 示例：0
printCount	number
小数位数:0,最大长度:28	否	打印次数 示例：0
directPrintCount	number
小数位数:0,最大长度:28	否	直接打印次数 示例：0
previewPrintCount	number
小数位数:0,最大长度:28	否	预览打印次数 示例：0
originalRecord	number
小数位数:0,最大长度:28	否	原始记录：1-是、0-否。 示例：0
returncount	number
小数位数:0,最大长度:28	否	退回次数 示例：0
trantype	string	否	交易类型id 示例：1499805938599592507
trantype_name	string	否	交易类型 示例：来料检验
inspectDate	date
格式:yyyy-MM-dd HH:mm:ss	否	检验日期 示例：2023-11-02 00:00:00
manufacture_date	date
格式:yyyy-MM-dd HH:mm:ss	否	生产日期 示例：2023-09-12 00:00:00
applycheckDate	date
格式:yyyy-MM-dd HH:mm:ss	否	请检日期 示例：2023-10-24 00:00:00
applyAuditTime	date
格式:yyyy-MM-dd HH:mm:ss	否	检验申请审核日期 示例：2023-11-02 13:50:41
validityDate	date
格式:yyyy-MM-dd HH:mm:ss	否	有效期至 示例：2024-10-05 00:00:00
planEndDate	date
格式:yyyy-MM-dd HH:mm:ss	否	计划检验结束日期 示例：2023-11-02 13:50:41
busiendDate	date
格式:yyyy-MM-dd HH:mm:ss	否	业务日期止 示例：2023-09-12 00:00:00
busistartDate	date
格式:yyyy-MM-dd HH:mm:ss	否	业务日期起 示例：2023-09-12 00:00:00
pk_busiperiod	string	否	业务期间 示例：2023-09-12~2023-09-12
pk_material	number
小数位数:0,最大长度:28	否	物料id 示例：1550007766943793156
pk_material_code	string	否	物料编码 示例：001197
pk_material_name	string	否	物料名称 示例：发动机
pk_material_model	string	否	型号 示例：FDJ001
pk_material_modelDescription	string	否	规格说明 示例：发动机001
cunitid	number
小数位数:8,最大长度:28	否	主单位id 示例：1500425710867054598
cunitid_name	string	否	主单位名称 示例：千克
cunitid_precision	number
小数位数:0,最大长度:28	否	主单位精度 示例：2
castunitid	number
小数位数:0,最大长度:28	否	辅单位id 示例：1500425710867054598
castunitid_name	string	否	辅单位名称 示例：吨
castunitid_precision	string	否	辅单位精度 示例：2
pk_inspectionplan	string	否	检验方案id 示例：1768921287939850249
pk_inspectionplan_name	string	否	检验方案 示例：发动机检验方案
checkPlanDetailId	string	否	检验方案明细id 示例：1769913055998115986
inspectionplanMethod	string	否	检验方案质量等级 示例：优等
isExternalSource	number
小数位数:0,最大长度:28	否	是否外部请检：1-是、0-否。 示例：0
productionType	string	否	产出类型：0-主产品、1-联产品、2-副产品。 示例：0
warranty_date	number
小数位数:0,最大长度:28	否	保质期 示例：360
warranty_unit	string	否	保质期单位 示例：1769913055998115986
spotcheknum	number
小数位数:8,最大长度:28	否	抽检主数量 示例：1
spotchekastnum	number
小数位数:8,最大长度:28	否	抽检件数 示例：1
vsourcecode	string	否	请检来源单据号 示例：WWDH202309120001
inspectnum	number
小数位数:8,最大长度:28	否	检验数量 示例：1
inspectastnum	number
小数位数:8,最大长度:28	否	检验件数 示例：1
qty	number
小数位数:8,最大长度:28	否	到货数量 示例：5
pk_batchcode	string	否	批次号 示例：PC001
inspectRule	number
小数位数:0,最大长度:28	否	检验规则：0-按物料检验、1-按检验项目检验。 示例：1
applycheckbillType	string	否	检验申请单类型：QJ001-来料检验申请、QJ002-产品检验申请、QJ003-在库检验申请、QJ004-发退货检验申请、QJ006-其他检验申请、QJ007-工序检验申请。 示例：QJ001
currentStage	string	否	当前检验阶段：1-正常、2-加严、3-放宽。 示例：1
vchangerate	string	否	换算率 示例：1/1
unitExchangeType	number
小数位数:0,最大长度:28	否	固定换算率：0-固定换算、1-浮动换算、2-未启用辅计量。 示例：2
inspect_result_source	number
小数位数:0,最大长度:28	否	检验结果来源：0-企业自检、1-供应商、2-第三方机构。 示例：0
inspectionplanVersion	string	否	检验方案版本 示例：5.0
pk_sample	string	否	取样方式id 示例：1503992526716534811
pk_sample_name	string	否	取样方式 示例：国标取样
samplingUnit	string	否	取样单位id 示例：1500425710867054598
samplingUnitName	string	否	取样单位 示例：千克
destroySimpleNum	number
小数位数:8,最大长度:28	否	破坏样本数量 示例：0
stockCheckType	string	否	在库检验类型 示例：001
warehouse_name	string	否	仓库 示例：仓库1
cargospace_name	string	否	货位 示例：货位1
warehouse	string	否	仓库id 示例：189812399293923
cargospace	string	否	货位id 示例：189812399293923
pk_stockstatus	string	否	库存状态id 示例：18645623423
pk_stockstatus_statusName	string	否	库存状态 示例：正常
reserved_obj_name	string	否	预留对象 示例：预留对象
reserved_obj	string	否	预留对象id 示例：18645623423
frozeState	string	否	质检冻结状态ID 示例：17896786785
frozeState_statusName	string	否	质检冻结状态 示例：冻结
exchangeRate	number
小数位数:8,最大长度:28	否	库存换算率 示例：1
stockUnit	number
小数位数:0,最大长度:28	否	库存单位id 示例：178567474564
stockUnit_name	string	否	库存单位 示例：单
workCenterName	string	否	工作中心 示例：工作中心1
workCenterId	number
小数位数:0,最大长度:28	否	工作中心id 示例：1896786786
custom	string	否	客户 示例：客户1
customId	string	否	客户id 示例：14546564564
pk_prod_dept	string	否	生产部门id 示例：1567567467456
pk_prod_dept_name	string	否	生产部门 示例：生产部门1
projectId	string	否	项目ID 示例：21231231231
projectCode	string	否	项目编码 示例：676
projectName	string	否	项目 示例：项目1
wbs	string	否	wbs主键 示例：15645645
wbsCode	string	否	WBS任务编码 示例：12
wbsName	string	否	wbs 示例：wbs1
activity	number
小数位数:8,最大长度:28	否	活动ID 示例：17567567567
activityCode	string	否	活动编码 示例：12
activityName	string	否	活动 示例：活动1
inspectResult	string	否	整单判定结果：1-合格、2-不合格 示例：2
qastnum	number
小数位数:8,最大长度:28	否	合格件数 示例：1
nqastnum	number
小数位数:8,最大长度:28	否	不合格件数 示例：1
qnum	number
小数位数:8,最大长度:28	否	合格数量 示例：1
nqnum	number
小数位数:8,最大长度:28	否	不合格数量 示例：1
qrate	number
小数位数:8,最大长度:28	否	合格率 示例：1
samnum	number
小数位数:0,最大长度:28	否	样本合格数 示例：1
unsamnum	number
小数位数:0,最大长度:28	否	样本不合格数 示例：1
chnum	number
小数位数:8,最大长度:28	否	改判数量 示例：1
chastnum	number
小数位数:8,最大长度:28	否	改判件数 示例：1
chrate	number
小数位数:8,最大长度:28	否	改判率 示例：1
rnote	string	否	备注 示例：备注1
planDays	number
小数位数:8,最大长度:28	否	计划检验天数 示例：1
realityEndDate	date
格式:yyyy-MM-dd HH:mm:ss	否	实际检验结束日期 示例：2023-01-01
realityInspectDays	number
小数位数:8,最大长度:28	否	实际检验天数 示例：1
terminalPersonName	string	否	终止人 示例：abc
terminalTime	date
格式:yyyy-MM-dd HH:mm:ss	否	终止时间 示例：2023-01-01 00:00:00
pk_purchaser_name	string	否	采购/委外业务员 示例：业务1
orderProcessId	number
小数位数:8,最大长度:28	否	工序ID 示例：2662320442642688
destroySimpleMagType	number
小数位数:0,最大长度:28	否	破坏样本管理方式：0-丢弃、1-按废品管理 示例：0
destroySimpleResp	number
小数位数:0,最大长度:28	否	破坏样本承担方：0-我方、1-供应商 示例：0
inspectstepGroup	string	否	检验步骤分组 示例：21
inspectstepId	number
小数位数:8,最大长度:28	否	检验步骤id 示例：15345243242
inspectstepName	string	否	检验步骤 示例：步骤1
qms_qit_incominspectorder_bList	object	是	检验信息
qms_qit_incominspectorder_resultList	object	是	处理结果明细
qms_qit_incominspectorder_sourcelistList	object	是	源单信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pk_org": "1503239447124639752",
		"pk_org_name": "星之国",
		"pk_purchase_org": "1503239447124639752",
		"pk_purchase_org_name": "星之国",
		"pk_applycheckorg": "1503239447124639752",
		"pk_applycheckorg_name": "星之国",
		"pk_outsupplier": 1503239447124639752,
		"pk_outsupplier_name": "星之国",
		"factory": "1503239447124639752",
		"factory_name": "星之国",
		"pk_inspecter": "1503246482288410629",
		"pk_inspecter_name": "艾斯",
		"pk_inspectdept": "1503239936753532936",
		"pk_inspectdept_name": "质检部",
		"pk_purchase_dept": "1769915804801302537",
		"pk_purchase_dept_name": "采购部",
		"creatorId": "1503246490875723783",
		"creator": "张三",
		"createTime": "2023-11-02 13:50:48",
		"modifierId": "1768148966910722049",
		"modifier": "李四",
		"modifyTime": "2023-12-25 10:44:22",
		"initinspectorder_id": "1852885373117530115",
		"initinspectorder_code": "LLJY202311020002",
		"pk_applycheck": "1846260016694165513",
		"vapplycheckcode": "LLQJ202310240001",
		"pk_sourcebill": "1815090966611623937",
		"pk_sourcebill_b": "1815090966611623938",
		"sourcerowno": "10",
		"sourcebilltype": "po_osm_arrive_order",
		"pk_orderbill": "1815090288006791175",
		"vordercode": "WWDD20230912000001",
		"vorderrowno": "10",
		"orderbilltype": "po_subcontract_order",
		"id": "1852885373117530115",
		"pubts": "2023-12-25 10:44:22",
		"code": "LLJY202311020002",
		"billtype": "001",
		"recheck": false,
		"terminate": false,
		"isWfControlled": false,
		"inspectionplanSingle": false,
		"combinecheck": false,
		"saveSnFlag": false,
		"status": 0,
		"verifystate": 0,
		"printCount": 0,
		"directPrintCount": 0,
		"previewPrintCount": 0,
		"originalRecord": 0,
		"returncount": 0,
		"trantype": "1499805938599592507",
		"trantype_name": "来料检验",
		"inspectDate": "2023-11-02 00:00:00",
		"manufacture_date": "2023-09-12 00:00:00",
		"applycheckDate": "2023-10-24 00:00:00",
		"applyAuditTime": "2023-11-02 13:50:41",
		"validityDate": "2024-10-05 00:00:00",
		"planEndDate": "2023-11-02 13:50:41",
		"busiendDate": "2023-09-12 00:00:00",
		"busistartDate": "2023-09-12 00:00:00",
		"pk_busiperiod": "2023-09-12~2023-09-12",
		"pk_material": 1550007766943793156,
		"pk_material_code": "001197",
		"pk_material_name": "发动机",
		"pk_material_model": "FDJ001",
		"pk_material_modelDescription": "发动机001",
		"cunitid": 1500425710867054598,
		"cunitid_name": "千克",
		"cunitid_precision": 2,
		"castunitid": 1500425710867054598,
		"castunitid_name": "吨",
		"castunitid_precision": "2",
		"pk_inspectionplan": "1768921287939850249",
		"pk_inspectionplan_name": "发动机检验方案",
		"checkPlanDetailId": "1769913055998115986",
		"inspectionplanMethod": "优等",
		"isExternalSource": 0,
		"productionType": "0",
		"warranty_date": 360,
		"warranty_unit": "1769913055998115986",
		"spotcheknum": 1,
		"spotchekastnum": 1,
		"vsourcecode": "WWDH202309120001",
		"inspectnum": 1,
		"inspectastnum": 1,
		"qty": 5,
		"pk_batchcode": "PC001",
		"inspectRule": 1,
		"applycheckbillType": "QJ001",
		"currentStage": "1",
		"vchangerate": "1/1",
		"unitExchangeType": 2,
		"inspect_result_source": 0,
		"inspectionplanVersion": "5.0",
		"pk_sample": "1503992526716534811",
		"pk_sample_name": "国标取样",
		"samplingUnit": "1500425710867054598",
		"samplingUnitName": "千克",
		"destroySimpleNum": 0,
		"stockCheckType": "001",
		"warehouse_name": "仓库1",
		"cargospace_name": "货位1",
		"warehouse": "189812399293923",
		"cargospace": "189812399293923",
		"pk_stockstatus": "18645623423",
		"pk_stockstatus_statusName": "正常",
		"reserved_obj_name": "预留对象",
		"reserved_obj": "18645623423",
		"frozeState": "17896786785",
		"frozeState_statusName": "冻结",
		"exchangeRate": 1,
		"stockUnit": 178567474564,
		"stockUnit_name": "单",
		"workCenterName": "工作中心1",
		"workCenterId": 1896786786,
		"custom": "客户1",
		"customId": "14546564564",
		"pk_prod_dept": "1567567467456",
		"pk_prod_dept_name": "生产部门1",
		"projectId": "21231231231",
		"projectCode": "676",
		"projectName": "项目1",
		"wbs": "15645645",
		"wbsCode": "12",
		"wbsName": "wbs1",
		"activity": 17567567567,
		"activityCode": "12",
		"activityName": "活动1",
		"inspectResult": "2",
		"qastnum": 1,
		"nqastnum": 1,
		"qnum": 1,
		"nqnum": 1,
		"qrate": 1,
		"samnum": 1,
		"unsamnum": 1,
		"chnum": 1,
		"chastnum": 1,
		"chrate": 1,
		"rnote": "备注1",
		"planDays": 1,
		"realityEndDate": "2023-01-01",
		"realityInspectDays": 1,
		"terminalPersonName": "abc",
		"terminalTime": "2023-01-01 00:00:00",
		"pk_purchaser_name": "业务1",
		"orderProcessId": 2662320442642688,
		"destroySimpleMagType": 0,
		"destroySimpleResp": 0,
		"inspectstepGroup": "21",
		"inspectstepId": 15345243242,
		"inspectstepName": "步骤1",
		"qms_qit_incominspectorder_bList": [
			{
				"id": "1500425710867054598",
				"rownum": 10,
				"inspecttime": "2023-11-17 18:32:42",
				"inspectdate": "2023-11-17 00:00:00",
				"pk_inspectorder_h": "1852885373117530115",
				"pk_inspectorder_h_castunitid": "1500425710867054598",
				"pk_inspectorder_h_castunitid_precision": "2",
				"inspectionitembId": "1769913055998115993",
				"pk_inspect_item": "1503989211001782280",
				"pk_inspect_item_code": "JYXM001",
				"pk_inspect_item_name": "汽车外观检验",
				"pk_inspect_itemclass": "1503987939691462657",
				"pk_inspect_itemclass_name": "外观检验",
				"feature": "1503476572297887748",
				"feature_code": "YS001",
				"feature_name": "颜色",
				"pk_sample_method": "1503992526716534811",
				"pk_sample_method_name": "国标取样",
				"samplingUnit": "1500425710867054598",
				"samplingUnitName": "千克",
				"coord": true,
				"inspect_type": "0",
				"inspectvalue_type": "0",
				"inspectvalue_actually": "2",
				"accuracy": 2,
				"destroyInspect": 0,
				"judgmentState": 10,
				"judgment_result": "1",
				"keyitem_b": "1",
				"badItemFlag": "0",
				"index_nature": "0",
				"round_off_rule": "0",
				"record_value_b": "0",
				"attach_sample_b": "0",
				"attachmentId": "9311d7a4-15fb-448c-8a86-8644d929967e",
				"attacheImage": "1852885373117530116",
				"multisample_inspectval_type": "1",
				"formula": "a8b",
				"standardFormula": "a-b",
				"pk_inspect_detectbasis_name": "检测依据",
				"pk_inspect_detectbasis": "15756756756",
				"vnote": "123",
				"spotcheck_rate": "10",
				"fixed_samples": 8,
				"check_number": 43.4783,
				"inspectvalue_unit_name": "千克",
				"standardDes": "12",
				"statutoryStandard": "500",
				"standard_value": "优秀:(3,4];良好:(1,2];及格:(2,3];",
				"qualified_number": 78,
				"unqualified_number": 12,
				"qualify_grade_result": "合格",
				"unqualified_proj": "不良1",
				"ac_value": 44,
				"re_value": 44,
				"inspect_max_value": 12,
				"inspect_min_value": 1,
				"inspect_avg_value": 3,
				"pk_inspect_method_method": "方法1",
				"inspector_name": "江燕",
				"inspectStep": "12",
				"dynamicInspectPlanName": "姜堰1",
				"dynamicInspectPlanVersion": "v1.0",
				"dynamicInspectPlanId": "186756756756",
				"checkPlan": "1232131231",
				"checkPlan_name": "检验12",
				"checkPlan_version": "v1.0",
				"qms_qit_inspectorder_sim_recordList_fixed2": [
					{
						"id": 1567657456456,
						"pk_inspectorder_simple": "1881972858742636559",
						"pk_inspectorder_simple_sample_code": "12",
						"inspect_value": "121212",
						"sample_inspect_result": "12121"
					}
				]
			}
		],
		"qms_qit_incominspectorder_resultList": [
			{
				"pk_stockstatus": 1499806969404325926,
				"pk_stockstatus_statusName": "不合格",
				"cbastunitid_precision": 2,
				"nastnum": 100,
				"id": 1883447406939340804,
				"pk_material_h_name": "hm特征物料1-批次",
				"pk_material_h": 1550007766943793156,
				"vbchangerate": "1/1",
				"inspectResult": "2",
				"cbunitid_precision": 2,
				"cbunitid": 1500425710867054598,
				"nnum": 100,
				"handleType_type": "04",
				"handleType": 16576567454,
				"cbastunitid": 1243534534,
				"pk_instockbatchcode": "212",
				"pk_instockbatchcodeId": 1678567567,
				"pk_qualify_grade": "不合格",
				"baditemFlag": "1",
				"is_storage": "0",
				"qualityGrade": 12,
				"pk_material_h_code": "0087",
				"handleType_name": "拒收",
				"party_responsible": "a方",
				"producedate": "2023-09-09",
				"storage": "12",
				"pk_storageunit": "1",
				"validityDate": "2025-04-13 00:00:00",
				"destroySimpleResult": "0",
				"vbnote": "备注",
				"qms_qit_incom_bad_itemsList": [
					{
						"badItemsCode": "",
						"number": 0
					}
				],
				"qms_qit_incominspectorder_resultSn": [
					{
						"sn": ""
					}
				]
			}
		],
		"qms_qit_incominspectorder_sourcelistList": [
			{
				"sourceautoid": "",
				"qms_qit_incominspectorder_resultList": [
					{
						"handleType": "",
						"handleTypeCode": "",
						"handleTypeType": "",
						"nnum": 0,
						"inspectResult": "",
						"isStorage": "",
						"stockStatus": 0,
						"stockStatusCode": "",
						"inStockBatchCode": "",
						"produceDate": "2026-06-07 13:18:33",
						"validityDate": "2026-06-07 13:18:33",
						"destroySimpleResult": 0,
						"baditemFlag": "",
						"qualityGrade": 0,
						"qualifyGrade": "",
						"badReasonId": "",
						"scrapProcessCode": "",
						"reworkProcessCode": "",
						"scrapLeaderId": "",
						"scrapLeaderCode": "",
						"note": "",
						"qms_qit_detailresult_bad_itemsList": [
							{
								"badItemsCode": "",
								"number": 0
							}
						]
					}
				]
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
999	检验单id、检验单号不能同时为空	返回错误信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-02-04	
更新
请求说明
新增
请求参数 qmsEquipIdName
更新
请求参数 (82)
删除
返回参数 (22)
检验仪器设备只保留一个字段
	2	2025-08-27	
新增
请求参数 (30)
更新
请求参数 qms_qit_incom_bad_itemsList
新增
返回参数 (31)
qms_qit_incominspectorder_detailresultList

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

