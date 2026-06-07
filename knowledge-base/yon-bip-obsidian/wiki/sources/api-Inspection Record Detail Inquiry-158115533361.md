---
title: "publishUser	string	否	发布人 示例：hm"
apiId: "1581155333610930182"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Inspection Record"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Record]
platform_version: "BIP"
source_type: community-api-docs
---

# publishUser	string	否	发布人 示例：hm

>  请求方式	GET | Inspection Record (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/checkRecord/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	检验记录ID, ，检验记录ID和检验记录检验单号不能同时为空，ID和单号同时存在，以ID为准
code	string	query	否	检验记录检验单号

## 3. 请求示例

Url: /yonbip/imcs/checkRecord/detail?access_token=访问令牌&id=&code=

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
code	long	否	返回码，成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	是	调用成功时的返回数据
qmsDfmCheckInfo	object	是	检验信息集合
qmsDfmCheckSimple	object	是	样本记录集合
qmsInspectResult	object	是	处理结果明细集合
pkOrg_name	string	否	质检组织 示例：hm1
checkType	string	否	检验类型 示例：001
billCode	string	否	检验单号 示例：LLJY202210190003
pk_material	string	否	物料 示例：1503987424184238086
pkMaterial_name	string	否	物料名称 示例：hm2
pk_batchcode	string	否	批次号 示例：1503987424184238086
inspectastNum	string	否	检验数量 示例：100
inspectDate	string	否	检验日期 示例：2022-10-19 00:00:00
combineCheck	string	否	合并检验 示例：false
applyBilltype	string	否	请检来源单据类型 示例：po_osm_arrive_order
applyBillNo	string	否	请检来源单据号 示例：WWDH202210190001
busDate	string	否	业务日期 示例：2022-10-19 00:00:00
billSourceNum	string	否	请检来源数量 示例：10
qualifiedNum	string	否	合格数量 示例：2
unqualifiedNum	string	否	不合格数量 示例：1
coordStatus	string	否	协同状态 示例：1
purchaseRemark	string	否	供应商反馈 示例：222
checkNum	string	否	检验件数 示例：10
checkUnit	string	否	检验单位id 示例：1500425710867054598
checkUnitName	string	否	检验单位名称 示例：千克
samplingQuaility	string	否	抽样数量 示例：10
samplingNum	string	否	抽样件数 示例：10
supplierContacts	string	否	供应商联系人 示例：hm
purchaseOrg	string	否	采购/委外组织id 示例：1500425710867054598
purchaseUser	string	否	采购/委外业务员id 示例：1500425710867054598
publishDate	string	否	发布时间 示例：2022-10-19 00:00:00
id	string	否	检验记录id 示例：1581472516959371273
pkMaterialsku	string	否	物料sku 示例：1581472516959371273
pkMaterialsku_name	string	否	物料sku名称 示例：hm
pkSupplier_name	string	否	供应商/委外商 示例：供应商A
inspectvalueUnit	string	否	计量单位 示例：1500425710867054598
inspectvalueUnit_name	string	否	计量单位名称 示例：千克
recheck	string	否	复检 示例：false
qicSourceBillType	string	否	来源单据类型 示例：001
qicSourceBillNo	string	否	来源单据号 示例：LLJY202210190003
applySourceNo	string	否	请检源头单据号 示例：LLJY202210190003
pk_applycheckorg_name	string	否	请检组织 示例：hm
sourcerowno	string	否	请检来源单据行号 示例：2500425710867054598
vorderrowno	string	否	请检源头单据行号 示例：2500425710867054598
create_method	string	否	创建方式 示例：1
pkMaterial_code	string	否	物料编码 示例：15814725169593712
pkSupplier	string	否	供应商id 示例：1581472516959371273
inspectvalueUnit_id	string	否	计量单位id 示例：15814759371273
purchaseUserName	string	否	采购业务员名称 示例：hm
purchaseOrgName	string	否	采购/委外组织名称 示例：hm
purchaseUserMobile	string	否	采购业务员手机号 示例：13566668888
qicSourceBillId	string	否	来源单据id 示例：1582762862567227399
pk_applycheckorg	string	否	请检组织id 示例：1504009491836305414
pk_applycheckorg_code	string	否	请检组织code 示例：hm1
upstream_id	string	否	上游id 示例：2702001946170624
pkApplyBillId	string	否	请检来源单据id 示例：1575495142241468418
pkOrg	string	否	质检组织id 示例：1504009491836305414
pkSourceBillRowId	string	否	请检来源单据行id 示例：1575495142241468419
pkApplySourceId	string	否	请检源头单据id 示例：1571487946362060802
pkOrg_code	string	否	质检组织code 示例：hm1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"qmsDfmCheckInfo": [
				{
					"inspectItemName": "hmjianyanxianmu",
					"check_number": "8",
					"recordValue": "[1,30]",
					"inspectvalueActually": "24.00",
					"qualifiedNumber": "3",
					"unqualifiedNumber": "2",
					"judgmentResult": "1",
					"characteristic_name": "",
					"rowNum": "1",
					"inspectvalueUnit_name_info": "升",
					"inspectMaxValue": "3",
					"inspectMinValue": "1",
					"inspectAvgValue": "2",
					"qmsDfmCheckBadItem": {
						"id_baditem": "1593198224353525768",
						"pkCheckInfoRowId": "1590800137952165898",
						"pkDfmCheckInfo": "1593198224353525767",
						"badNumber": "4",
						"pk_baditem": "1482480659029557254"
					},
					"note": "hm",
					"inspectorName": "hm",
					"inspectTime_info": "2022-10-19 11:34:41",
					"pkInspectItem": "1503988738555379716",
					"samplingUnit": "0",
					"pkInspectItemName": "hmjianyanxianmu特征01",
					"pkInspectItemCode": "hmjianyanxianmu01",
					"pkDfmCheckRecord_info": "1591865092276748312"
				}
			],
			"qmsDfmCheckSimple": [
				{
					"pk_inspectorder_simple": "LLJY202210190003",
					"inspectValue": "3",
					"sampleInspectResult": "1-合格、2-不合格",
					"inspectTime": "2022-10-19 11:34:41",
					"pk_inspect_item_code": "hm瓶检验",
					"pk_inspect_item": "2665044332368128",
					"pkDfmCheckRecord": "1591865092276748312",
					"id_slm": "1591865092276748316"
				}
			],
			"qmsInspectResult": [
				{
					"is_qualified": "true",
					"treat_methodName": "合格",
					"treat_method_code": "04",
					"treat_method_name": "拒收",
					"main_num": "30",
					"pk_unitName": "1",
					"qualifyGradeResult": "1",
					"pk_inventorystate": "1500425710867054598",
					"pk_inventorystateName": "1",
					"is_storage": "true",
					"pk_baditemName": "hm",
					"insres_sourcetype": "JY001",
					"insres_sourcenum": "LLJY202210190003",
					"createTime": "2022-11-01 21:00:33",
					"pk_materialName": "hm",
					"pk_initmaterialName": "hm",
					"scrapLeaderIdName": "hm",
					"idResult": "1500425710867054598",
					"pkDfmCheckRecord": "1581472516959371273",
					"pk_baditem_name": "请我企鹅",
					"pk_baditem_code": "额",
					"pk_initmaterial": "1529451237397757960"
				}
			],
			"pkOrg_name": "hm1",
			"checkType": "001",
			"billCode": "LLJY202210190003",
			"pk_material": "1503987424184238086",
			"pkMaterial_name": "hm2",
			"pk_batchcode": "1503987424184238086",
			"inspectastNum": "100",
			"inspectDate": "2022-10-19 00:00:00",
			"combineCheck": "false",
			"applyBilltype": "po_osm_arrive_order",
			"applyBillNo": "WWDH202210190001",
			"busDate": "2022-10-19 00:00:00",
			"billSourceNum": "10",
			"qualifiedNum": "2",
			"unqualifiedNum": "1",
			"coordStatus": "1",
			"purchaseRemark": "222",
			"checkNum": "10",
			"checkUnit": "1500425710867054598",
			"checkUnitName": "千克",
			"samplingQuaility": "10",
			"samplingNum": "10",
			"supplierContacts": "hm",
			"purchaseOrg": "1500425710867054598",
			"purchaseUser": "1500425710867054598",
			"publishUser": "hm",
			"publishDate": "2022-10-19 00:00:00",
			"id": "1581472516959371273",
			"pkMaterialsku": "1581472516959371273",
			"pkMaterialsku_name": "hm",
			"pkSupplier_name": "供应商A",
			"inspectvalueUnit": "1500425710867054598",
			"inspectvalueUnit_name": "千克",
			"recheck": "false",
			"qicSourceBillType": "001",
			"qicSourceBillNo": "LLJY202210190003",
			"applySourceNo": "LLJY202210190003",
			"pk_applycheckorg_name": "hm",
			"sourcerowno": "2500425710867054598",
			"vorderrowno": "2500425710867054598",
			"create_method": "1",
			"pkMaterial_code": "15814725169593712",
			"pkSupplier": "1581472516959371273",
			"inspectvalueUnit_id": "15814759371273",
			"purchaseUserName": "hm",
			"purchaseOrgName": "hm",
			"purchaseUserMobile": "13566668888",
			"qicSourceBillId": "1582762862567227399",
			"pk_applycheckorg": "1504009491836305414",
			"pk_applycheckorg_code": "hm1",
			"upstream_id": "2702001946170624",
			"pkApplyBillId": "1575495142241468418",
			"pkOrg": "1504009491836305414",
			"pkSourceBillRowId": "1575495142241468419",
			"pkApplySourceId": "1571487946362060802",
			"pkOrg_code": "hm1"
		}
	]
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
999	ID和CODE不能同时为空	ID和CODE不能同时为空

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

