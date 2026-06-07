---
title: "采购需求卡片查询"
apiId: "1942186865721344008"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Purchase Demand"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Demand]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购需求卡片查询

>  请求方式	GET | Purchase Demand (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/purchase/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	主键id

## 3. 请求示例

Url: /yonbip/cpu/purchase/detail?access_token=访问令牌&id=

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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
planDeptName	string	否	计划部门名称 示例：计划部门名称
corpSubAccount	string	否	企业子账号（erp采购员编码） 示例：YHT-1714-19651636961125973
corpAccountname	string	否	外系统组织or集团名称 示例：230616日常旗舰新架构广乘1
wbs	string	否	WBS 示例：1869230214775046156
wbsName	string	否	WBS名称 示例：打豆豆
reqdate	string	否	需求日期 示例：2023-08-09 00:00:00
purchaseUnitCode	string	否	采购单位code 示例：KGM
productName	string	否	产品名称 示例：赛霸乳清蛋白粉
reqOrgDocId	string	否	需求组织id 示例：1751832437691777029
jsid	string	否	jsid 示例：1874285502941102090
erpProductVersion	string	否	erp产品及版本 示例：PRAYBILL
id	string	否	单据主键id 示例：1874285502941102090
productDocId_name	string	否	产品名称 示例：赛霸乳清蛋白粉
sourcerowno	string	否	来源单据行号 示例：2
mainUnitId	string	否	主单位主键 示例：1751843449992118281
reqUapProjectId	string	否	项目Id 示例：1869230206171480067
productId	string	否	产品主键 示例：1751866565523406852
currencyNameDiwork	string	否	BIP币种名称 示例：人民币
mainUnitName	string	否	主单位名称 示例：千克
currencyIdDiwork_priceRount	number
小数位数:0,最大长度:10	否	BIP币种四舍五入位 示例：4
purchaseUnitId_precision	number
小数位数:0,最大长度:10	否	BIP币种精度 示例：3
reqOrgId_name	string	否	需求组织名称 示例：采购云
receiveOrgId_name	string	否	收货组织名称 示例：采购云
headBillId	string	否	源头单据主表id 示例：1790028363530240000
phone	string	否	电话 示例：17604667537
headBillType	string	否	源头单据类型 示例：ycReqManagement.ycpraybill
mainUnitId_truncationType	number
小数位数:0,最大长度:10	否	主单位交易类型类型 示例：4
productDocId	string	否	物料主键 示例：1751866565523406852
mainUnitId_name	string	否	主单位名称 示例：千克
sourcehid	string	否	来源单据id 示例：1790028363530240000
sourcecode	string	否	来源单据号 示例：PB230809000002
invPriceExchRate	number
小数位数:0,最大长度:10	否	计价换算率 示例：1
currencyIdDiwork	string	否	BIP币种id 示例：1749959505543168034
mainUnitId_precision	number
小数位数:0,最大长度:10	否	主单位精度 示例：3
mainUnitCode	string	否	主单位code 示例：KGM
headBillCode	string	否	源头单据号 示例：PB230809000002
pubts	string	否	时间戳 示例：2023-12-01 09:52:30
reqOrgId	string	否	需求组织主键 示例：1751832437691777029
enterpriseName	string	否	租户名称 示例：230616日常旗舰新架构广乘1
purchaseUnitId_truncationType	number
小数位数:0,最大长度:10	否	采购单位舍位方式 示例：4
creator	string	否	创建人 示例：2429181
materialClassId	string	否	物料分类 示例：1751843063445061636
receiveOrgName	string	否	收货组织名称 示例：采购云
receivePersonName	string	否	收货人姓名 示例：某某某
receivePersonTel	string	否	receivePersonTel 示例：17604667537
unitid_precision	number
小数位数:0,最大长度:10	否	计价单位精度 示例：3
productCode	string	否	产品编码 示例：0001000002
createTime	string	否	创建时间 示例：2023-12-01 09:52:27
headBillTypeShow	string	否	源头单据类型名称 示例：需求申请
unitid_truncationType	number
小数位数:0,最大长度:10	否	计价单位舍位方式 示例：4
unitid	string	否	计价单位主键 示例：1751843449992118281
enterpriseId	string	否	租户id 示例：1749959505545265159
purchaseNum	number
小数位数:0,最大长度:10	否	采购数量 示例：18
currencyIdDiwork_priceDigit	number
小数位数:0,最大长度:10	否	BIP币种单价精度 示例：2
currencyCode	string	否	币种编码 示例：CNY
unitid_name	string	否	计价单位名称 示例：千克
masterOrgKeyField	string	否	主组织字段名称 示例：puorgDocId
materialClassName	string	否	物料分类名称 示例：广汽物资
mainNum	number
小数位数:0,最大长度:10	否	主数量 示例：18
erpReqDeptName	string	否	需求部门名称 示例：采购云质量部
subject	string	否	采购需求标题(询价单标题) 示例：lhy230809-2111
sourceTypeFormId	string	否	来源单据类型 示例：ycReqManagement.ycpraybill
headBillRowno	string	否	源头单据行号 示例：2
wbsCode	string	否	wbs编码 示例：32443558
purchaseUnitId	string	否	采购单位id 示例：1751843449992118281
reqContact	string	否	需求联系人名称 示例：某某某
receivePersonId	string	否	收货人Id 示例：1751835564424298505
reqUapProjectId_name	string	否	项目名称 示例：打豆豆
puorgDocId_name	string	否	采购组织名称 示例：采购云
puorgDocId	string	否	采购组织Id 示例：1751832437691777029
unit	string	否	计价单位id 示例：1751843449992118281
planDeptId_name	string	否	计划部门名称 示例：采购云质量部
currencyIdDiwork_moneyRount	number
小数位数:0,最大长度:10	否	BIP币种金额舍入规则 示例：4
invPurExchRate	number
小数位数:0,最大长度:10	否	采购换算率 示例：1
receivePersonId_name	string	否	收货人名称 示例：某某某
code	string	否	编码 示例：REQ2312010002
reqDeptId	string	否	需求部门Id 示例：1751835177880911877
corpSubAccountname	string	否	外系统人员名称(采购员名称) 示例：李崇辉
planDeptId	string	否	计划部门 示例：1751835177880911877
reqContactId_name	string	否	需求联系人名称 示例：某某某
sourcebid	string	否	sourcebid 示例：1790028363530240003
currencyIdDiwork_moneyDigit	number
小数位数:0,最大长度:10	否	currencyIdDiwork_moneyDigit 示例：2
returningErp	boolean	否	returningErp 示例：false
currencyName	string	否	currencyName 示例：人民币
erpVender	string	否	erpVender 示例：yuncai
ipuPuReqFreeCharacteristics	object	否	ipuPuReqFreeCharacteristics
puorgname	string	否	puorgname 示例：采购云
planPsnId_name	string	否	planPsnId_name 示例：李崇辉
orderedQuantity	number
小数位数:0,最大长度:10	否	orderedQuantity 示例：0
receiveOrgId	string	否	receiveOrgId 示例：1751832437691777029
planPsnId	string	否	planPsnId 示例：1751835564424298505
quantity	number
小数位数:0,最大长度:10	否	quantity 示例：18
headBillBId	string	否	headBillBId 示例：1790028363530240003
reqDeptId_name	string	否	reqDeptId_name 示例：采购云质量部
reqContactId	string	否	reqContactId 示例：1751835564424298505
transTypeKeyField	string	否	transTypeKeyField 示例：transactionTypeId
purchaseUnitName	string	否	purchaseUnitName 示例：千克
ecProcessStatus	string	否	电商处理状态 示例：0
currencyid	string	否	外系统币种的标识 示例：1749959505543168034
businessType	string	否	业务类型 示例：0
purchaseUnitId_name	string	否	采购单位名称 示例：千克
invPurExchRateType	number
小数位数:0,最大长度:10	否	采购换算率 示例：0
invPriceExchRateType	number
小数位数:0,最大长度:10	否	计价换算率 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"planDeptName": "计划部门名称",
		"corpSubAccount": "YHT-1714-19651636961125973",
		"corpAccountname": "230616日常旗舰新架构广乘1",
		"wbs": "1869230214775046156",
		"wbsName": "打豆豆",
		"reqdate": "2023-08-09 00:00:00",
		"purchaseUnitCode": "KGM",
		"productName": "赛霸乳清蛋白粉",
		"reqOrgDocId": "1751832437691777029",
		"jsid": "1874285502941102090",
		"erpProductVersion": "PRAYBILL",
		"id": "1874285502941102090",
		"productDocId_name": "赛霸乳清蛋白粉",
		"sourcerowno": "2",
		"mainUnitId": "1751843449992118281",
		"reqUapProjectId": "1869230206171480067",
		"productId": "1751866565523406852",
		"currencyNameDiwork": "人民币",
		"mainUnitName": "千克",
		"currencyIdDiwork_priceRount": 4,
		"purchaseUnitId_precision": 3,
		"reqOrgId_name": "采购云",
		"receiveOrgId_name": "采购云",
		"headBillId": "1790028363530240000",
		"phone": "17604667537",
		"headBillType": "ycReqManagement.ycpraybill",
		"mainUnitId_truncationType": 4,
		"productDocId": "1751866565523406852",
		"mainUnitId_name": "千克",
		"sourcehid": "1790028363530240000",
		"sourcecode": "PB230809000002",
		"invPriceExchRate": 1,
		"currencyIdDiwork": "1749959505543168034",
		"mainUnitId_precision": 3,
		"mainUnitCode": "KGM",
		"headBillCode": "PB230809000002",
		"pubts": "2023-12-01 09:52:30",
		"reqOrgId": "1751832437691777029",
		"enterpriseName": "230616日常旗舰新架构广乘1",
		"purchaseUnitId_truncationType": 4,
		"creator": "2429181",
		"materialClassId": "1751843063445061636",
		"receiveOrgName": "采购云",
		"receivePersonName": "某某某",
		"receivePersonTel": "17604667537",
		"unitid_precision": 3,
		"productCode": "0001000002",
		"createTime": "2023-12-01 09:52:27",
		"headBillTypeShow": "需求申请",
		"unitid_truncationType": 4,
		"unitid": "1751843449992118281",
		"enterpriseId": "1749959505545265159",
		"purchaseNum": 18,
		"currencyIdDiwork_priceDigit": 2,
		"currencyCode": "CNY",
		"unitid_name": "千克",
		"masterOrgKeyField": "puorgDocId",
		"materialClassName": "广汽物资",
		"mainNum": 18,
		"erpReqDeptName": "采购云质量部",
		"subject": "lhy230809-2111",
		"sourceTypeFormId": "ycReqManagement.ycpraybill",
		"headBillRowno": "2",
		"wbsCode": "32443558",
		"purchaseUnitId": "1751843449992118281",
		"reqContact": "某某某",
		"receivePersonId": "1751835564424298505",
		"reqUapProjectId_name": "打豆豆",
		"puorgDocId_name": "采购云",
		"puorgDocId": "1751832437691777029",
		"unit": "1751843449992118281",
		"planDeptId_name": "采购云质量部",
		"currencyIdDiwork_moneyRount": 4,
		"invPurExchRate": 1,
		"receivePersonId_name": "某某某",
		"code": "REQ2312010002",
		"reqDeptId": "1751835177880911877",
		"corpSubAccountname": "李崇辉",
		"planDeptId": "1751835177880911877",
		"reqContactId_name": "某某某",
		"sourcebid": "1790028363530240003",
		"currencyIdDiwork_moneyDigit": 2,
		"returningErp": false,
		"currencyName": "人民币",
		"erpVender": "yuncai",
		"ipuPuReqFreeCharacteristics": {
			"id": "1874285502941102091",
			"pubts": "2023-08-09 21:12:20",
			"ytenant": "0000LIYLRLSG75DLOH0000"
		},
		"puorgname": "采购云",
		"planPsnId_name": "李崇辉",
		"orderedQuantity": 0,
		"receiveOrgId": "1751832437691777029",
		"planPsnId": "1751835564424298505",
		"quantity": 18,
		"headBillBId": "1790028363530240003",
		"reqDeptId_name": "采购云质量部",
		"reqContactId": "1751835564424298505",
		"transTypeKeyField": "transactionTypeId",
		"purchaseUnitName": "千克",
		"ecProcessStatus": "0",
		"currencyid": "1749959505543168034",
		"businessType": "0",
		"purchaseUnitId_name": "千克",
		"invPurExchRateType": 0,
		"invPriceExchRateType": 0
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
暂时没有数据哦~

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

