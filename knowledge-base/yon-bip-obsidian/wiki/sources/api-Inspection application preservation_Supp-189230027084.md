---
title: "检验申请保存"
apiId: "1892300270841888773"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Application"
domain: "QMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验申请保存

>  请求方式	POST | Inspection Application (QMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/QMS_QIT/checkapply/save
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
_status	string	否	是	操作标识：Insert为新增，Update为更新 示例：Insert
checkType	string	否	否	检验申请类型：001-采购检验，002-产品检验，003-在库检验，004-发货检验，005-退货检验，006-其他检验，007-委外检验，008-工序检验，009-工序委外检验 示例：008
isExternalSource	string	否	否	是否外部请检：0-否 1-是，在库检和工序检其他检目前支持外部请检，产品检采购检其他检委外检支持内部请检 示例: 1 默认值: 1 示例：1 默认值：1
id	string	否	否	检验申请id，新增时不填，修改时必填
code	string	否	否	检验申请编码，同一租户下不可重复，当编码规则为手动编码时必填，自动编码时非必填，当勾选自动编码且勾选手动可改时以填入值为准，未勾选手动可改时填入值不生效
bustype	string	否	否	交易类型id：编码和id 任一不为空，都有值的话取id； 在库检验传值的交易类型参数必须为临时检验，工序检传值交易类型参数必须属于工序检单据类型 示例：1499805938599592906
bustypeCode	string	否	否	交易类型编码：编码和id 任一不为空，都有值的话取id；在库检验传值的交易类型参数必须为临时检验，工序检传值交易类型参数必须属于工序检单据类型 示例：ZKQJ-003
checkOrg	string	否	否	请检组织id：编码和id 任一不为空，都有值的话取id 示例：1504009491836305414
checkOrgCode	string	否	否	请检组织编码：编码和id 任一不为空，都有值的话取id
checkDept	string	否	否	请检部门id：请检部门必须属于请检组织，否则提示请检部门必须属于请检组织！ 示例：1504009826843754501
checkDeptCode	string	否	否	请检部门编码：请检部门必须属于请检组织，否则提示请检部门必须属于请检组织！ 示例：121211
checkPeople	string	否	否	请检人id：请检人必须在请检组织中任职，否则提示请检人必须在请检组织中任职，如果请检部门不为空，则请检人同时需要在请检部门中任职，否则提示请检人必须在请检部门中任职 示例：1504011776756285445
checkPeopleCode	string	否	否	请检人编码：请检人必须在请检组织中任职，否则提示请检人必须在请检组织中任职，如果请检部门不为空，则请检人同时需要在请检部门中任职，否则提示请检人必须在请检部门中任职 示例：000000000000000000000045
warehouse	long	否	否	仓库id：编码和id 任一不为空，都有值的话取id,仅在在库检时生效
warehouseCode	string	否	否	仓库编码：编码和id 任一不为空，都有值的话取id,仅在在库检时生效
cargospace	long	否	否	货位id：编码和id 任一不为空，都有值的话取id；仓库启用货位管理时必输，仅在在库检时生效
cargospaceCode	string	否	否	货位编码：编码和id 任一不为空，都有值的话取id；仓库启用货位管理时必输，仅在在库检时生效
product	long	否	否	物料id:编码和id 任一不为空，都有值的话取id；质检组织必须有物料的使用权限，否则提示质检组织不在物料适配范围内 示例：1503987424184238086
productCode	string	否	否	物料编码:编码和id 任一不为空，都有值的话取id；质检组织必须有物料的使用权限，否则提示质检组织不在物料适配范围内
batchnoid	string	否	否	批次id：编码和id 任一不为空，都有值的话取id；物料是批次管理时必输
batchNum	string	否	否	批次编码：编码和id 任一不为空，都有值的话取id；物料是批次管理时必输
stockstatus	long	否	否	库存状态id:编码和id 任一不为空，都有值的话取id，仅在在库检时生效
stockstatusCode	string	否	否	库存状态编码:编码和id 任一不为空，都有值的话取id，仅在在库检时生效
checkNumber	string	否	否	请检数量：请检数量需为正数，否则提示请检数量不符合规范 示例：15
exchangeRate	string	否	否	库存换算率：物料为浮动换算率时必输；物料为固定换算率时取物料上的固定换算率，仅在在库检时生效
inspectFrozenStatus	long	否	否	质检冻结状态id：编码和id 任一不为空，都有值的话取id，仅在在库检时生效
inspectFrozenStatusCode	string	否	否	质检冻结状态编码：编码和id 任一不为空，都有值的话取id，仅在在库检时生效
checkPlan	string	否	否	检验方案id：编码和id 任一不为空，都有值的话取id；物料检验规则必须设置为按检验项目检验，否则输入无效；必须符合检验方案匹配规则，否则提示检验方案参数不在检验方案的匹配范围内 示例：1601226763769741319
checkPlanCode	string	否	否	检验方案编码：编码和id 任一不为空，都有值的话取id；物料检验规则必须设置为按检验项目检验，否则输入无效检验方案必须符合检验方案匹配规则，否则提示检验方案参数不在检验方案的匹配范围内
reservedObj	long	否	否	预留对象，仅在在库检时生效
standardProcessId	long	否	否	工序id，工序检时必输，仅在工序检时生效 示例：1508527900562292738
operationSequence	string	否	否	工序顺序号，仅在工序检时生效 示例：10
workcenterId	string	否	否	工作中心，仅在工序检时生效 示例：1508526070906224648
outSysId	string	否	否	外部来源线索
outSysCode	string	否	否	外部来源编码
outSysVersion	string	否	否	外部来源版本
outSysType	string	否	否	外部来源类型
LLSourceInformationList	object	是	否	来源数据列表，工序检时必输输入一条，在库检验时不输
billnum	string	否	是	由于该接口为多种检验申请共用，因此需要根据不同类型传递不同参数，在库检验申请：qms_stockcheckapply_card，工序检验申请：qms_gxCheckApply_card，来料检验申请：qms_LLCheckApply_card,其他检验申请：qms_othercheckapply_card，产品检验申请：qms_prodcheckapply_card，发退货检验申请：qms_deliveryCheckApply_card 示例：qms_gxCheckApply_card 默认值：qms_gxCheckApply_card

## 3. 请求示例

Url: /yonbip/QMS_QIT/checkapply/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"_status": "Insert",
		"checkType": "008",
		"isExternalSource": "1",
		"id": "",
		"code": "",
		"bustype": "1499805938599592906",
		"bustypeCode": "ZKQJ-003",
		"checkOrg": "1504009491836305414",
		"checkOrgCode": "",
		"checkDept": "1504009826843754501",
		"checkDeptCode": "121211",
		"checkPeople": "1504011776756285445",
		"checkPeopleCode": "000000000000000000000045",
		"warehouse": 0,
		"warehouseCode": "",
		"cargospace": 0,
		"cargospaceCode": "",
		"product": 1503987424184238086,
		"productCode": "",
		"batchnoid": "",
		"batchNum": "",
		"stockstatus": 0,
		"stockstatusCode": "",
		"checkNumber": "15",
		"exchangeRate": "",
		"inspectFrozenStatus": 0,
		"inspectFrozenStatusCode": "",
		"checkPlan": "1601226763769741319",
		"checkPlanCode": "",
		"reservedObj": 0,
		"standardProcessId": 1508527900562292738,
		"operationSequence": "10",
		"workcenterId": "1508526070906224648",
		"outSysId": "",
		"outSysCode": "",
		"outSysVersion": "",
		"outSysType": "",
		"LLSourceInformationList": [
			{
				"orderBillType": "",
				"sourcebillTypeb": "pu_arrivalorder",
				"sourcebillNumb": "SFTR20221122000001",
				"orderbillNum": "SCDD20221122000001",
				"orderbillIndex": "10",
				"sourcebillIndex": "",
				"arrivalId": "1596756261218549766",
				"orderbill": "1596748822350397442",
				"arrivalBId": "",
				"_status": "Insert",
				"id": 0
			}
		]
	},
	"billnum": "qms_gxCheckApply_card"
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
operationSequence	string	否	工序顺序号 示例：10
sampMethod	string	否	取样方式ID 示例：1624193173677408268
isMany	long	否	是否多质量等级 示例：0
mergeTest	boolean	否	是否合并检验 示例：false
checkPlan	string	否	检验方案id 示例：1757769010224037901
id	string	否	id 示例：1863979823402582025
definect_h	object	否	自定义项
checkType	string	否	检验类型 示例：008
sampleUnitName	string	否	取样单位 示例：千克
checkNumber	long	否	请检数量 示例：100
mainUnit	long	否	主单位id 示例：1500425710867054600
isInspectionItemConfirm	string	否	是否单一取样方式 示例：1
standardProcessId	long	否	工序id 示例：1505468621059522600
spotchekastnum	long	否	本单抽检件数 示例：0
isWfControlled	boolean	否	是否审批流控制 示例：false
checkOrg	string	否	请检组织id 示例：1504009491836305414
check_method	string	否	检验方式 示例：1
castunitid	long	否	检验单位ID 示例：1500425710867054600
samplingUnit	string	否	取样单位(检验方案带出) 示例：1
version	string	否	检验方案版本 示例：1.0
inspectastnum	long	否	请检件数 示例：100
sampMethod_name	string	否	取样方式 示例：测试啊啊擦
status	long	否	单据状态 示例：0
verifystate	long	否	审批状态 示例：0
sourcebillId	string	否	来源单据id 示例：11
checkPlan_name	string	否	检验方案名称 示例：10002
code	string	否	单据编码 示例：GXQJ202311170001
inspectionrule	long	否	检验规则 示例：1
isExternalSource	long	否	是否外部请检 示例：1
castunitid_precision	long	否	辅单位精度 示例：2
sampleUnit	string	否	取样单位id 示例：1500425710867054598
creatorId	long	否	创建人id 示例：1503246490875723800
exchangeType	long	否	换算率类型 示例：0
reexamination	boolean	否	是否复检 示例：false
spotcheknum	long	否	本单抽检数量 示例：0
freect_h	object	否	自由项特征
LLSourceInformationList	object	是	来源子表
checkDept	string	否	请检单位id 示例：1504009826843754501
checkPlanDetailId	string	否	检验方案详情id 示例：1757769010224037902
workcenterId	long	否	工作中心id 示例：1505471464320532500
pubts	string	否	时间戳 示例：2023-11-17 12:36:52
createDate	string	否	创建时间 示例：2023-11-17 12:36:52
castunitid_name	string	否	检验单位 示例：千克
product	long	否	物料id 示例：1503987424184238000
creator	string	否	创建人 示例：昵称-hm
vchangerate	string	否	质检换算率 示例：1/1
notTestNumber	long	否	未检验数量 示例：100
qualityinSpectionCenter	string	否	质检组织id 示例：1504009491836305414
checkDate	string	否	请检日期 示例：2023-11-17 12:36:47
bustype	string	否	交易类型id 示例：1499805938599592335
checkPlan_code	string	否	检验方案编码 示例：Q02120hm1
createTime	string	否	创建时间 示例：2023-11-17 12:36:52
LLCheckInformationList	object	是	检验项目表体
productCode	string	否	物料编码
sourcebillNum	string	否	来源单据号
sourcebillIndex	string	否	来源单据行号

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"operationSequence": "10",
		"sampMethod": "1624193173677408268",
		"isMany": 0,
		"mergeTest": false,
		"checkPlan": "1757769010224037901",
		"id": "1863979823402582025",
		"definect_h": {},
		"checkType": "008",
		"sampleUnitName": "千克",
		"checkNumber": 100,
		"mainUnit": 1500425710867054600,
		"isInspectionItemConfirm": "1",
		"standardProcessId": 1505468621059522600,
		"spotchekastnum": 0,
		"isWfControlled": false,
		"checkOrg": "1504009491836305414",
		"check_method": "1",
		"castunitid": 1500425710867054600,
		"samplingUnit": "1",
		"version": "1.0",
		"inspectastnum": 100,
		"sampMethod_name": "测试啊啊擦",
		"status": 0,
		"verifystate": 0,
		"sourcebillId": "11",
		"checkPlan_name": "10002",
		"code": "GXQJ202311170001",
		"inspectionrule": 1,
		"isExternalSource": 1,
		"castunitid_precision": 2,
		"sampleUnit": "1500425710867054598",
		"creatorId": 1503246490875723800,
		"exchangeType": 0,
		"reexamination": false,
		"spotcheknum": 0,
		"freect_h": {},
		"LLSourceInformationList": [
			{
				"sourceid": 11,
				"arrivalId": "11",
				"conversionType": 0,
				"checkUnit": 1500425710867054600,
				"checkNumberb": 100,
				"parent_id": "1863979823402582025",
				"checkmNumberb": 100,
				"id": "1863979823402582029",
				"pubts": "2023-11-17 12:36:52",
				"mainUnitb": 1500425710867054600,
				"conversion": "1/1",
				"orderBillType": "",
				"orderbill": "",
				"orderbillIndex": "",
				"orderbillNum": "",
				"sourcebillIndex": "",
				"sourcebillNumb": "",
				"sourcebillTypeb": ""
			}
		],
		"checkDept": "1504009826843754501",
		"checkPlanDetailId": "1757769010224037902",
		"workcenterId": 1505471464320532500,
		"pubts": "2023-11-17 12:36:52",
		"createDate": "2023-11-17 12:36:52",
		"castunitid_name": "千克",
		"product": 1503987424184238000,
		"creator": "昵称-hm",
		"vchangerate": "1/1",
		"notTestNumber": 100,
		"qualityinSpectionCenter": "1504009491836305414",
		"checkDate": "2023-11-17 12:36:47",
		"bustype": "1499805938599592335",
		"checkPlan_code": "Q02120hm1",
		"createTime": "2023-11-17 12:36:52",
		"LLCheckInformationList": [
			{
				"sampleMethod": "1624193173677408268",
				"checkProject": "1503990405002690562",
				"flag": 1,
				"standardDes": "每支装量与标示装量（10ml/支）相比较，少于标示装量的应不得多于1支，并不得少于标示装量的97%。",
				"rule": "1",
				"destroyInspect": 0,
				"checkProjectClass": "1503987939691462657",
				"inspectionitembId": 1757769010224038000,
				"samplingUnitName": "千克",
				"coord": true,
				"decimalNumber": 2,
				"inspectiontype": "0",
				"attachmentId": "c3c5d09c-38de-4e51-9334-dd685cfb3fa0",
				"id": "1863979823402582026",
				"pubts": "2023-11-17 12:36:52",
				"samplePlanType": "0",
				"cruxProject": "1",
				"samplingUnit": "1500425710867054598",
				"vrowno": 10,
				"sampleMethod_checkMethod": "1",
				"parent_id": "1863979823402582025",
				"additionalSample": "0",
				"testMethod": 1500547327287361500,
				"sampleValue": "0",
				"qualitynature": "0",
				"samplingPrecision": 2,
				"statutoryStandard": "",
				"testBasis": ""
			}
		],
		"productCode": "",
		"sourcebillNum": "",
		"sourcebillIndex": ""
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
999	id不可为空	返回错误信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-30	
更新
请求说明
更新
请求参数 (28)
检验申请，保存OpenAPI接口，检验申请类型描述缺少工序委外检验
	2	2026-01-04	
更新
请求说明
更新
请求参数 checkType
更新
请求参数 billnum
	3	2025-06-26	
新增
请求参数 isExternalSource
更新
请求参数 checkType
更新
请求参数 sourcebillTypeb
更新
请求参数 billnum

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

