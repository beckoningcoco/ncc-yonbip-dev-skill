---
title: "检验记录新增"
apiId: "1581996348327591942"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Record"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验记录新增

>  请求方式	POST | Inspection Record (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/checkRecord/save
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
data	object	否	是	检验记录数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
pkOrg	string	否	是	质检组织，可以传入ID或编码 示例：1504009491836305414
billCode	string	否	是	检验单号，任意字符，业务主键，唯一不可重复。 示例：LLJY202211220001
checkType	string	否	否	检验类型,001-采购检验;007-委外检验; 示例：007
pkMaterial	string	否	是	物料，可以传入ID或编码 示例：1503987424184238086
pk_batchcode	string	否	否	物料批次号，任意字符，不检查档案正确性。 示例：PICI0000000045202303154714
pkSupplier	string	否	是	供应商，可以传入ID或编码 示例：1508739874217263110
inspectastNum	BigDecimal	否	是	检验数量 示例：100
inspectvalueUnit	string	否	否	计量单位，可以传入ID或编码 示例：1500425710867054598
samplingQuaility	BigDecimal	否	否	抽样数量 示例：100
samplingNum	BigDecimal	否	否	抽样件数 示例：100
checkNum	BigDecimal	否	否	检验件数 示例：100
checkUnit	string	否	否	检验单位，可以传入ID或编码 示例：1500425710867054598
inspector	string	否	否	检验员，可以传入ID或编码
inspectDate	Date	否	是	检验日期 示例：2022-11-22
qualifiedNum	BigDecimal	否	是	合格数量 示例：10
unqualifiedNum	BigDecimal	否	是	不合格数量 示例：90
pk_applycheckorg	string	否	否	请检组织，可以传入ID或编码 示例：1504009491836305414
purchaseOrg	string	否	否	采购/委外组织，可以传入ID或编码 示例：1504009491836305414
vchangerate	string	否	否	换算率，任意字符，不做校验。 示例：1/1
applyBilltype	string	否	否	请检来源单据类型,po_osm_arrive_order-委外到货单;pu_arrivalorder-到货单; 示例：pu_arrivalorder
applyBillNo	string	否	否	请检来源单据号，任意字符，不做检查。 示例：DH000117
sourcerowno	string	否	否	请检来源单据行号，任意字符，不做检查。 示例：10
billSourceNum	BigDecimal	否	否	请检来源数量 示例：20
busDate	Date	否	否	业务日期 示例：2022-11-22
orderbilltype	string	否	否	请检源头单据类型,po_osm_arrive_order-委外到货单;pu_arrivalorder-到货单; 示例：pu_arrivalorder
applySourceNo	string	否	否	请检源头单据号，任意字符，不做检查。 示例：CGDD221019000001
vorderrowno	string	否	否	请检源头单据行号，任意字符，不做检查。 示例：10
qicSourceBillType	string	否	否	来源单据类型，001-采购检验;007-委外检验; 示例：001
qicSourceBillNo	string	否	否	来源单据号，任意字符，不做检查。 示例：LLJY202211220001
pkApplyBillId	string	否	否	请检来源单据id
pkSourceBillRowId	string	否	否	请检来源单据行id
throwExists	string	否	否	重复插入时是否抛出异常，0否，1是，默认否 示例：0
qmsDfmCheckInfo	object	是	否	检验记录信息
qmsDfmCheckSimple	object	是	否	检验记录样本
qmsInspectResult	object	是	否	质检信息明细集合

## 3. 请求示例

Url: /yonbip/imcs/checkRecord/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"pkOrg": "1504009491836305414",
		"billCode": "LLJY202211220001",
		"checkType": "007",
		"pkMaterial": "1503987424184238086",
		"pk_batchcode": "PICI0000000045202303154714",
		"pkSupplier": "1508739874217263110",
		"inspectastNum": 100,
		"inspectvalueUnit": "1500425710867054598",
		"samplingQuaility": 100,
		"samplingNum": 100,
		"checkNum": 100,
		"checkUnit": "1500425710867054598",
		"inspector": "",
		"inspectDate": "2022-11-22",
		"qualifiedNum": 10,
		"unqualifiedNum": 90,
		"pk_applycheckorg": "1504009491836305414",
		"purchaseOrg": "1504009491836305414",
		"vchangerate": "1/1",
		"applyBilltype": "pu_arrivalorder",
		"applyBillNo": "DH000117",
		"sourcerowno": "10",
		"billSourceNum": 20,
		"busDate": "2022-11-22",
		"orderbilltype": "pu_arrivalorder",
		"applySourceNo": "CGDD221019000001",
		"vorderrowno": "10",
		"qicSourceBillType": "001",
		"qicSourceBillNo": "LLJY202211220001",
		"pkApplyBillId": "",
		"pkSourceBillRowId": "",
		"throwExists": "0",
		"qmsDfmCheckInfo": [
			{
				"inspect_item_name": "含水量",
				"check_number": 8,
				"inspectvalueUnit": "1502439792950902789",
				"recordValue": "[1,30]",
				"standardDes": "123456",
				"inspectvalueActually": "2.00",
				"samplingUnit": "1502439792950902789",
				"inspectMaxValue": 6,
				"inspectMinValue": 1,
				"qualifiedNumber": 3,
				"unqualifiedNumber": 2,
				"judgmentResult": "1",
				"inspector": "1503246482288410629",
				"inspectTime": "2022-10-19 11:34:41",
				"ac": "2",
				"re": "3",
				"note": "备注1025"
			}
		],
		"qmsDfmCheckSimple": [
			{
				"inspect_item_name": "含水量",
				"pk_inspectorder_simple": "2",
				"inspectValue": "2.00",
				"sampleInspectResult": "1",
				"pkQualifyGrade": "中",
				"note": "备注示例",
				"inspector": "1503246482288410629",
				"checkTime": "2022-11-22 11:22:33"
			}
		],
		"qmsInspectResult": [
			{
				"insres_sourcetype": "JY001",
				"insres_sourcenum": "LLJY202211220001",
				"pk_initmaterial": "1503987424184238086",
				"is_qualified": true,
				"treat_method_name": "改判",
				"main_num": 30,
				"pk_unit": "1500425874182766600",
				"qualifyGradeResult": "中",
				"pk_baditem": "1508719687961149447",
				"is_storage": true,
				"pk_material": "1503987424184238086",
				"check_sourcetype": "pu_arrivalorder",
				"check_sourcetnum": "DH000117",
				"check_sourcetindex": "10",
				"check_firstbilltype": "pu_arrivalorder",
				"check_firstbillcode": "CGDD221019000001",
				"check_firstrowno": "10"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口调用返回数据
sucessCount	long	否	成功数 示例：1
failCount	long	否	失败数 示例：0
count	long	否	记录总数 示例：1
messages	object	是	失败信息
infos	object	是	成功信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"sucessCount": 1,
		"failCount": 0,
		"count": 1,
		"messages": [
			{}
		],
		"infos": [
			{
				"id": 2251405962776832,
				"pkOrg": "1504009491836305414",
				"pkOrg_name": "天海总公司",
				"billCode": "LLJY202211220001",
				"checkType": "007",
				"pkMaterial": 1503987424184238086,
				"pkMaterial_name": "螺丝刀",
				"pk_batchcode": "001",
				"pkSupplier": 1508739874217263110,
				"pkSupplier_name": "协同供应商",
				"inspectastNum": 100,
				"inspectvalueUnit": 1500425710867054598,
				"inspectvalueUnit_name": "元",
				"samplingQuaility": 100,
				"samplingNum": 100,
				"checkNum": 100,
				"checkUnit": 1500425710867054598,
				"checkUnitName": "小时",
				"vchangerate": "1",
				"inspectDate": "2022-11-17 00:00:00",
				"inspector": "1503246482288410629",
				"inspectorName": "总部采购",
				"qualifiedNum": 10,
				"unqualifiedNum": 90,
				"pk_applycheckorg": "1504009491836305414",
				"applycheckorgCode": "hm1",
				"applycheckorgrName": "hm1",
				"applyBilltype": "pu_arrivalorder",
				"applyBillNo": "DH000117",
				"sourcerowno": "10",
				"billSourceNum": 20,
				"busDate": "2022-11-17 00:00:00",
				"orderbilltype": "pu_arrivalorder",
				"applySourceNo": "CGDD221019000001",
				"vorderrowno": "10",
				"qicSourceBillType": "001",
				"qicSourceBillNo": "LLJY202211220001",
				"purchaseOrg": "1504009491836305414",
				"purchaseOrgCode": "hm1",
				"purchaseOrgName": "hm1",
				"create_method": "1",
				"qmsDfmCheckInfo": [
					{
						"id": 2251405962776832,
						"inspect_item_name": "检验项目1",
						"check_number": 8,
						"inspectvalueUnit": 1450537939134054427,
						"inspectvalueUnitName": "元",
						"recordValue": "[1,30]",
						"standardDes": "123456",
						"inspectvalueActually": "2.00",
						"samplingUnit": 1450537939134054427,
						"samplingUnitName": "小时",
						"inspectMaxValue": 6,
						"inspectMinValue": 0,
						"qualifiedNumber": 3,
						"unqualifiedNumber": 2,
						"judgmentResult": "1",
						"inspector": "1503246482288410629",
						"inspectorName": "总部采购",
						"inspectTime": "2022-10-19 11:34:41",
						"ac": "1",
						"re": "1",
						"note": "备注1025"
					}
				],
				"qmsDfmCheckSimple": [
					{
						"id": 2251405962776832,
						"inspect_item_name": "hmjianyanxianmu01",
						"pk_inspectorder_simple": "001",
						"inspectValue": "2.00",
						"sampleInspectResult": "1",
						"pkQualifyGrade": "中",
						"note": "备注示例",
						"inspector": "1503246482288410629",
						"checkTime": "2022-11-22 11:22:33"
					}
				],
				"qmsInspectResult": [
					{
						"id": "2251405962776832",
						"insres_sourcetype": "JY001",
						"insres_sourcenum": "LLJY202211220001",
						"createTime": "2022-11-22 11:22:33",
						"pk_initmaterial": 1503987424184238086,
						"pk_initmaterial_name": "000236",
						"is_qualified": true,
						"treat_method_name": "1499808043151917243",
						"main_num": 30,
						"pk_unit": 1450537939134054427,
						"qualifyGradeResult": "中",
						"pk_baditem": "1508719687961149447",
						"pk_baditem_name": "额1",
						"pk_material": 1503987424184238086,
						"pk_material_name": "000236",
						"check_sourcetype": "pu_arrivalorder",
						"check_sourcetnum": "DH000117",
						"check_sourcetindex": "10",
						"check_firstbilltype": "st_purchaseorder",
						"check_firstbillcode": "CGDD221019000001",
						"check_firstrowno": "10",
						"createmethod": "2"
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
999	取决于错误类型，不同错误信息不同	

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

