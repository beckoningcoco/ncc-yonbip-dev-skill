---
title: "不良品处理保存"
apiId: "2004371515345731588"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Defective Product Processing Document"
domain: "QMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Defective Product Processing Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 不良品处理保存

>  请求方式	POST | Defective Product Processing Document (QMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/QMS_QIT/rejectbill/save
请求方式	POST
ContentType	application/json
应用场景	开放API
API类别	单条保存/更新
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
id	string	否	否	不良品处理id，_status为Insert时可空；_status为Update时，code和id任一不为空，都有值默认取id 示例：2014736431077392390
code	string	否	否	不良品处理单号，_status为Insert时可空，非空时根据编码规则控制确定是否取code值；_status为Update时，code和id任一不为空，都有值默认取id，更新编码为code值，仅code有值根据code获取不良品数据 示例：BL20230501001
processDate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	不良品处理日期，默认值为当前日期
inspectOrderId	string	否	否	检验单id，_status为Insert时检验单id和检验单编码任一不为空，都有值默认取id；_status为Update时，为空 示例：1500396737134067715
inspectOrderCode	string	否	否	检验单号，_status为Insert时检验单id和检验单编码任一不为空，都有值默认取id；_status为Update时，为空 示例：CPJY20240304234
inspectOrderResultId	string	是	否	检验单处理结果行id，_status为Insert时推对应符合条件的检验单处理结果行数据生成不良品，_status为Update时为空 示例：[1961392207123447809,1961392207123447829] 最大请求量：256
_status	string	否	是	操作标识：Insert为新增，Update为更新，Delete为删除 示例：Insert
rejectbillb	object	是	否	不良品处理单详细信息：_status为Insert时子表信息无效，更新时id或code都为空字段将更新为空值。

## 3. 请求示例

Url: /yonbip/QMS_QIT/rejectbill/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "2014736431077392390",
		"code": "BL20230501001",
		"processDate": "2026-06-07 13:18:19",
		"inspectOrderId": "1500396737134067715",
		"inspectOrderCode": "CPJY20240304234",
		"inspectOrderResultId": [
			1961392207123447809,
			1961392207123447829
		],
		"_status": "Insert",
		"rejectbillb": [
			{
				"id": "1519045416410677253",
				"processJudgmentId": "1500425710867054598",
				"processJudgmentType": "04",
				"responsibleParty": "outsourceduty",
				"badReasonId": 1500425710867054598,
				"badReason": "长度不符合",
				"isStorage": "0",
				"chargeDeptId": "2014736740315037710",
				"chargeDeptCode": "thirdDept",
				"chargePersonId": "2014735322972160010",
				"chargePersonCode": "person",
				"batchCode": "ty444567",
				"stockStateId": "2011607392799162376",
				"stockStateCode": "01",
				"judgeNum": 3,
				"judgeAstNum": 6,
				"inspectOrderResultId": "2014736740315037710",
				"_status": "Update"
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
pk_org	string	否	质检组织id 示例：1503239447124639752
pk_org_name	string	否	质检组织 示例：星之国
pk_pu_org	string	否	采购/委外组织id 示例：1503239447124639752
pk_pu_org_name	string	否	采购/委外组织 示例：星之国
pk_apply_org	string	否	请检组织id 示例：1503239447124639752
pk_apply_org_name	string	否	请检组织 示例：星之国
pk_supplier	long	否	供应商id 示例：1503239447124639752
pk_supplier_name	string	否	供应商/委外商 示例：星之国
factory	string	否	工厂id 示例：1503239447124639752
factory_name	string	否	工厂 示例：星之国
pk_inspect_dept	string	否	检验部门id 示例：1503239936753532936
pk_inspect_dept_name	string	否	检验部门 示例：质检部
pk_pu_dept	string	否	采购/委外部门id 示例：1769915804801302537
pk_pu_dept_name	string	否	采购/委外部门 示例：采购部
creatorId	long	否	创建人id 示例：1503246490875723783
creator	string	否	创建人 示例：张三
createTime	DateTime	否	创建时间 示例：2023-11-02 13:50:48
modifierId	long	否	修改人id 示例：1768148966910722049
modifier	string	否	修改人 示例：李四
modifyTime	DateTime	否	修改时间 示例：2023-12-25 10:44:22
initinspectorder_id	string	否	初始检验单id 示例：1852885373117530115
initinspectorder_code	string	否	初始检验单编码 示例：LLJY202311020002
pk_inspectorder	string	否	检验单id 示例：1993808558698790915
inspectorderno	string	否	检验单编码 示例：LLJY202405100004
pk_checkapply	string	否	检验申请单id 示例：1846260016694165513
pk_checkapply_code	string	否	检验申请编码 示例：LLQJ202405100004
vsrcid	string	否	请检来源单据id 示例：1815090966611623937
vsrcrowno	string	否	请检来源单据行id 示例：1815090966611623938
vsrcbid	string	否	请检来源单据行号 示例：10
vsrccode	string	否	请检来源单据号 示例：WWDH202309120001
vsrctype	string	否	请检来源单据类型：pu_arrivalorder-采购到货单、po_osm_arrive_order-委外到货、po_finishedreport-完工报告、IMPSFC_proceTaskReport-工序任务汇报、voucher_delivery-发货单、voucher_salereturn-退货单、JY001-来料检验单、JY002-产品检验单、JY003-在库检验单、JY004-发退货检验单、JY006-其他检验单、JY007-工序检验单、BL001-不良品处理单、XCL001-现存量。 示例：po_osm_arrive_order
pk_order	string	否	请检源头单据id 示例：1815090288006791175
ordercode	string	否	请检源头单据号 示例：WWDD20230912000001
orderrowno	string	否	请检源头行号 示例：10
pk_order_billtype	string	否	请检源头单据类型：po_production_order-生产订单、po_subcontract_order-委外订单、po_finishedreport-完工报告。 示例：po_subcontract_order
sourceOrderLineNo	string	否	请检来源订单行号 示例：10
sourceOrderCode	string	否	请检来源订单号 示例：ew5555
sourceOrderType	string	否	请检来源订单类型 示例：PO23432432
id	string	否	不良品id 示例：1852885373117530115
pubts	DateTime	否	时间戳 示例：2023-12-25 10:44:22
code	string	否	不良品处理单号 示例：BL202405100004
inspectiontype	string	否	检验类型：001-来料检验、002-产品检验、003-在库检验、004-发货检验、005-退货检验、006-其他检验、007-工序检验、008-委外检验、009-工序委外检验。 示例：001
combine	string	否	合并检验：1-是、0-否。 示例：false
verifystate	int	否	单据状态：0-开立、1-审核中、2-已审批、4-已驳回。 示例：0
sn	string	否	序列号 示例：234334
isSnManage	int	否	序列号管理 是：1否：0 示例：0
single_inspection	string	否	单件检验 是：1 否：0 示例：0
printCount	int	否	打印次数 示例：0
directPrintCount	int	否	直接打印次数 示例：0
previewPrintCount	int	否	预览打印次数 示例：0
returncount	int	否	退回次数 示例：0
vtranstypeid	string	否	交易类型id 示例：1499805938599592507
vtranstypeid_name	string	否	交易类型 示例：来料检验
processdate	DateTime	否	不良品处理日期 示例：2023-11-02 00:00:00
inspectdate	date
格式:yyyy-MM-dd HH:mm:ss	否	检验日期 示例：2023-11-02 00:00:00
manufacturedate	DateTime	否	生产日期 示例：2023-09-12 00:00:00
validatedate	DateTime	否	有效期至 示例：2024-10-05 00:00:00
busiperiod	string	否	业务期间 示例：2023-09-12~2023-09-12
pk_material	long	否	物料id 示例：1550007766943793156
pk_material_code	string	否	物料编码 示例：001197
pk_material_name	string	否	物料名称 示例：发动机
pk_material_model	string	否	型号 示例：FDJ001
unprocessnum	BigDecimal	否	待处理不良品数量 示例：10
unprocessastnum	BigDecimal	否	待处理不良品件数 示例：21
unitid	long	否	主单位id 示例：1500425710867054598
unitid_name	string	否	主单位名称 示例：千克
pk_material_modelDescription	string	否	规格说明 示例：发动机001
unitid_precision	int	否	主单位精度 示例：2
astunitid	long	否	辅单位id 示例：1500425710867054598
astunitid_name	string	否	辅单位名称 示例：吨
astunitid_precision	int	否	辅单位精度 示例：2
pk_inspect_plan	string	否	检验方案id 示例：1768921287939850249
pk_inspect_plan_name	string	否	检验方案 示例：发动机检验方案
pk_inspect_plandetail	string	否	检验方案明细id 示例：1769913055998115986
pk_inspect_plan_qualityLevel	string	否	质量等级组id 示例：156785333224345
isExternalSource	int	否	是否外部请检：1-是、0-否。 示例：0
inspectionStepConfig	string	否	检验步骤配置id 示例：16533632829903404
productionType	string	否	产出类型：0-主产品、1-联产品、2-副产品。 示例：0
expiredunit	long	否	保质期单位 示例：1769913055998115986
expiredno	int	否	保质期 示例：360
applynum	BigDecimal	否	检验数量 示例：1
applyastnum	BigDecimal	否	检验件数 示例：1
qty	BigDecimal	否	到货数量 示例：5
vbatchcode	string	否	批次号 示例：PC001
inspectionrule	string	否	检验规则：0-按物料检验、1-按检验项目检验。 示例：1
vchangerate	string	否	换算率 示例：1/1
warehouse	long	否	仓库id 示例：189812399293923
warehouse_name	string	否	仓库 示例：仓库1
rack	long	否	货位id 示例：189812399293923
rack_name	string	否	货位 示例：货位1
state	string	否	库存状态id 示例：18645623423
state_statusName	string	否	库存状态 示例：正常
reservedobj_name	string	否	预留对象 示例：预留对象
reservedobj	long	否	预留对象id 示例：18645623423
frozeState	string	否	质检冻结状态ID 示例：17896786785
frozeState_statusName	string	否	质检冻结状态 示例：冻结
autoFreezeInventory	string	否	自动冻结库存 示例：冻结
exchangeRate	int	否	库存换算率 示例：1
stockUnit	long	否	库存单位id 示例：178567474564
stockUnit_name	string	否	库存单位 示例：单
pk_workcenter_name	string	否	工作中心 示例：工作中心
pk_workcenter	string	否	工作中心id 示例：1896786786
customId_name	string	否	客户 示例：客户1
customId	string	否	客户id 示例：14546564564
pk_prod_dept	string	否	生产部门id 示例：1567567467456
pk_prod_dept_name	string	否	生产部门 示例：生产部门1
projectId	string	否	项目ID 示例：21231231231
projectCode	string	否	项目编码 示例：676
projectName	string	否	项目 示例：项目1
wbs	string	否	wbs主键 示例：15645645
wbsCode	string	否	WBS任务编码 示例：12
wbsName	string	否	wbs 示例：wbs1
activity	long	否	活动ID 示例：17567567567
activityCode	string	否	活动编码 示例：12
activityName	string	否	活动 示例：活动1
note	string	否	备注 示例：备注1
rejectnote	string	否	不良品情况说明 示例：不良品情况说明
orderprocessno	string	否	工序顺序号 示例：20
pk_orderprocess	long	否	工序ID 示例：2662320442642688
orderProcessName	string	否	工序 示例：委外工序
spectb	object	是	检验信息
rejectbillb	object	是	处理结果明细

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pk_org": "1503239447124639752",
		"pk_org_name": "星之国",
		"pk_pu_org": "1503239447124639752",
		"pk_pu_org_name": "星之国",
		"pk_apply_org": "1503239447124639752",
		"pk_apply_org_name": "星之国",
		"pk_supplier": 1503239447124639752,
		"pk_supplier_name": "星之国",
		"factory": "1503239447124639752",
		"factory_name": "星之国",
		"pk_inspect_dept": "1503239936753532936",
		"pk_inspect_dept_name": "质检部",
		"pk_pu_dept": "1769915804801302537",
		"pk_pu_dept_name": "采购部",
		"creatorId": 1503246490875723783,
		"creator": "张三",
		"createTime": "2023-11-02 13:50:48",
		"modifierId": 1768148966910722049,
		"modifier": "李四",
		"modifyTime": "2023-12-25 10:44:22",
		"initinspectorder_id": "1852885373117530115",
		"initinspectorder_code": "LLJY202311020002",
		"pk_inspectorder": "1993808558698790915",
		"inspectorderno": "LLJY202405100004",
		"pk_checkapply": "1846260016694165513",
		"pk_checkapply_code": "LLQJ202405100004",
		"vsrcid": "1815090966611623937",
		"vsrcrowno": "1815090966611623938",
		"vsrcbid": "10",
		"vsrccode": "WWDH202309120001",
		"vsrctype": "po_osm_arrive_order",
		"pk_order": "1815090288006791175",
		"ordercode": "WWDD20230912000001",
		"orderrowno": "10",
		"pk_order_billtype": "po_subcontract_order",
		"sourceOrderLineNo": "10",
		"sourceOrderCode": "ew5555",
		"sourceOrderType": "PO23432432",
		"id": "1852885373117530115",
		"pubts": "2023-12-25 10:44:22",
		"code": "BL202405100004",
		"inspectiontype": "001",
		"combine": "false",
		"verifystate": 0,
		"sn": "234334",
		"isSnManage": 0,
		"single_inspection": "0",
		"printCount": 0,
		"directPrintCount": 0,
		"previewPrintCount": 0,
		"returncount": 0,
		"vtranstypeid": "1499805938599592507",
		"vtranstypeid_name": "来料检验",
		"processdate": "2023-11-02 00:00:00",
		"inspectdate": "2023-11-02 00:00:00",
		"manufacturedate": "2023-09-12 00:00:00",
		"validatedate": "2024-10-05 00:00:00",
		"busiperiod": "2023-09-12~2023-09-12",
		"pk_material": 1550007766943793156,
		"pk_material_code": "001197",
		"pk_material_name": "发动机",
		"pk_material_model": "FDJ001",
		"unprocessnum": 10,
		"unprocessastnum": 21,
		"unitid": 1500425710867054598,
		"unitid_name": "千克",
		"pk_material_modelDescription": "发动机001",
		"unitid_precision": 2,
		"astunitid": 1500425710867054598,
		"astunitid_name": "吨",
		"astunitid_precision": 2,
		"pk_inspect_plan": "1768921287939850249",
		"pk_inspect_plan_name": "发动机检验方案",
		"pk_inspect_plandetail": "1769913055998115986",
		"pk_inspect_plan_qualityLevel": "156785333224345",
		"isExternalSource": 0,
		"inspectionStepConfig": "16533632829903404",
		"productionType": "0",
		"expiredunit": 1769913055998115986,
		"expiredno": 360,
		"applynum": 1,
		"applyastnum": 1,
		"qty": 5,
		"vbatchcode": "PC001",
		"inspectionrule": "1",
		"vchangerate": "1/1",
		"warehouse": 189812399293923,
		"warehouse_name": "仓库1",
		"rack": 189812399293923,
		"rack_name": "货位1",
		"state": "18645623423",
		"state_statusName": "正常",
		"reservedobj_name": "预留对象",
		"reservedobj": 18645623423,
		"frozeState": "17896786785",
		"frozeState_statusName": "冻结",
		"autoFreezeInventory": "冻结",
		"exchangeRate": 1,
		"stockUnit": 178567474564,
		"stockUnit_name": "单",
		"pk_workcenter_name": "工作中心",
		"pk_workcenter": "1896786786",
		"customId_name": "客户1",
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
		"note": "备注1",
		"rejectnote": "不良品情况说明",
		"orderprocessno": "20",
		"pk_orderprocess": 2662320442642688,
		"orderProcessName": "委外工序",
		"spectb": [
			{
				"id": "1500425710867054598",
				"rownum": 10,
				"inspecttime": "2023-11-17 18:32:42",
				"inspectdate": "2023-11-17 00:00:00",
				"pk_inspectorder_h": "1852885373117530115",
				"pk_inspectorder_h_castunitid": 1500425710867054598,
				"pk_inspectorder_h_castunitid_precision": 2,
				"inspectionitembId": 1769913055998115993,
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
				"spotcheck_rate": 10,
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
				"checkPlan_version": "v1.0"
			}
		],
		"rejectbillb": [
			{
				"pk_rejectbill": "1533222222223",
				"state": 1499806969404325926,
				"state_statusName": "不合格",
				"astunitid": 0,
				"astunitid_precision": 2,
				"unitid": 1500425710867054598,
				"unitid_precision": 2,
				"changeType": "",
				"vbchangerate": "1/1",
				"judgeastnum": 100,
				"judgenum": 100,
				"id": "1883447406939340804",
				"pk_material_h": "1550007766943793156",
				"pk_material_h_name": "hm特征物料1-批次",
				"pk_material_h_code": "0087",
				"finaljudge": "2",
				"fprocessjudge": "16576567454",
				"fprocessjudge_type": "04",
				"fprocessjudge_name": "拒收",
				"instockbatchcode": "212",
				"qualitylvjudge": "不合格",
				"is_storage": "0",
				"qualityGrade": 12,
				"party_responsible": "a方",
				"producedate": "2023-09-09",
				"qualitynum": "12",
				"qualityunit": "1",
				"validatedate": "2025-04-13 00:00:00",
				"vbnote": "备注",
				"pk_chargepsn": 12836764748784,
				"pk_chargepsn_name": "责任人",
				"pk_chargedept": 15733333445646,
				"pk_chargedept_name": ""
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
999	不良品处理单保存异常	返回错误信息

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

