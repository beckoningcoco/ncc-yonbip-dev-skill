---
title: "不良品处理列表查询"
apiId: "2007261641794650117"
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

# 不良品处理列表查询

>  请求方式	POST | Defective Product Processing Document (QMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/QMS_QIT/rejectbill/list
请求方式	POST
ContentType	application/json
应用场景	开放API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
orgId	string	否	否	质检组织id 示例：1499805938599592541
orgCode	string	否	否	质检组织编码 示例：411611
simple	object	否	否	不良处理日期
open_processDate_begin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	不良品处理日期起 示例：2024-01-08 00:00:00
open_processDate_end	date
格式:yyyy-MM-dd HH:mm:ss	否	否	不良品处理日期止 示例：2024-01-08 15:00:00
code	string	否	否	不良品处理单号 示例：BL202206070002
inspectionType	string	否	否	检验类型,来料检验= 001，产品检验=002，在库检验=003，发货检验=004，退货检验= 005，其他检验=006，委外检验=007，工序检验=008，工序委外检验=009，采购入库检验=010 示例：001
status	string	否	否	单据状态：0-开立、3-审核中、1-已审核。 示例：1
transTypeId	string	否	否	交易类型 示例：2013792199717158913
transTypeCode	string	否	否	交易类型编码 示例：BL002
materialId	string	否	否	物料id 示例：1564283310510702596
materialCode	string	否	否	物料编码 示例：5-1-1---411611
batchCode	string	否	否	批次号 示例：v19829
sourceCode	string	否	否	来源单据号 示例：CPJY202405050002
inspectDeptId	string	否	否	检验部门 示例：189112232445487
inspectDeptCode	string	否	否	检验部门编码 示例：dept002
pageIndex	number
小数位数:0,最大长度:10	否	否	页号 默认值:1 示例：0 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	否	每页查询数据大小，范围 1-500，限制小于等于 500 示例：10 默认值：10
isSum	boolean	否	否	查询表头，还是表头+表体，true 是表头，false 是表头+表体，默认为 false，非必填 示例：false 默认值：false
pubts	string	否	否	时间戳，格式 "yyyy-MM-dd HH:mm:ss" 示例：2023-05-26 19:03:15

## 3. 请求示例

Url: /yonbip/QMS_QIT/rejectbill/list?access_token=访问令牌
Body: {
	"orgId": "1499805938599592541",
	"orgCode": "411611",
	"simple": {
		"open_processDate_begin": "2024-01-08 00:00:00",
		"open_processDate_end": "2024-01-08 15:00:00"
	},
	"code": "BL202206070002",
	"inspectionType": "001",
	"status": "1",
	"transTypeId": "2013792199717158913",
	"transTypeCode": "BL002",
	"materialId": "1564283310510702596",
	"materialCode": "5-1-1---411611",
	"batchCode": "v19829",
	"sourceCode": "CPJY202405050002",
	"inspectDeptId": "189112232445487",
	"inspectDeptCode": "dept002",
	"pageIndex": 0,
	"pageSize": 10,
	"isSum": false,
	"pubts": "2023-05-26 19:03:15"
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
applyPersonId	string	否	请检人员 示例：1257888975433
applyPersonId_name	string	否	请检人员名称 示例：请检人员名称
pk_supplier	long	否	供应商id 示例：1503239447124639752
pk_supplier_name	string	否	供应商/委外商 示例：星之国
factory	string	否	工厂id 示例：1503239447124639752
factory_name	string	否	工厂 示例：星之国
pk_inspecter	string	否	检验员id 示例：1503246482288410629
pk_inspecter_name	string	否	检验员 示例：艾斯
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
isWfControlled	boolean	否	是否审批流控制：true-是、false-否。 示例：false
combine	boolean	否	合并检验：true-是、false-否。 示例：false
verifystate	int	否	单据状态：11-开立、0-待检、10-检验完成、1-审批中、2-已审批、4-已驳回。 示例：0
sn	string	否	序列号 示例：234334
isSnManage	number
小数位数:-,最大长度:-	否	序列号管理 是：1否：0 示例：0
single_inspection	boolean	否	单件检验 是：true 否：false 示例：false
printCount	int	否	打印次数 示例：0
directPrintCount	int	否	直接打印次数 示例：0
previewPrintCount	int	否	预览打印次数 示例：0
returncount	int	否	退回次数 示例：0
vtranstypeid	string	否	交易类型id 示例：1499805938599592507
vtranstypeid_name	string	否	交易类型 示例：来料检验
processdate	DateTime	否	不良品处理日期 示例：2023-11-02 00:00:00
inspectdate	date
格式:-	否	检验日期 示例：2023-11-02 00:00:00
manufacturedate	DateTime	否	生产日期 示例：2023-09-12 00:00:00
validatedate	DateTime	否	有效期至 示例：2024-10-05 00:00:00
busiperiod	string	否	业务期间 示例：2023-09-12~2023-09-12
pk_material	long	否	物料id 示例：1550007766943793156
pk_material_code	string	否	物料编码 示例：001197
pk_material_name	string	否	物料名称 示例：发动机
pk_material_model	string	否	型号 示例：FDJ001
unprocessnum	number
小数位数:-,最大长度:-	否	待处理不良品数量 示例：10
unprocessastnum	number
小数位数:-,最大长度:-	否	待处理不良品件数 示例：21
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
		"applyPersonId": "1257888975433",
		"applyPersonId_name": "请检人员名称",
		"pk_supplier": 1503239447124639752,
		"pk_supplier_name": "星之国",
		"factory": "1503239447124639752",
		"factory_name": "星之国",
		"pk_inspecter": "1503246482288410629",
		"pk_inspecter_name": "艾斯",
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
		"isWfControlled": false,
		"combine": false,
		"verifystate": 0,
		"sn": "234334",
		"isSnManage": 0,
		"single_inspection": false,
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
		"orderProcessName": "委外工序"
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
999	查询异常	返回错误信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-01-21	
更新
返回参数 inspectiontype
更新
返回参数 fprocessjudge_type
文档描述增加退货处理方式、采购入库检验类型的描述

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

