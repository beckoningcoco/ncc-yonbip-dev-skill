---
title: "采购需求保存"
apiId: "2137138635336056835"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Demand"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Demand]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购需求保存

>  请求方式	POST | Purchase Demand (STC)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/pureq/batchSave
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	采购需求编码(编码规则中设置为自动编号时不填，有值时也不生效，设置为手工编号时必填) 示例：REQ202301010001
productDocId	string	否	否	物料id 示例：1241241111
productCode	string	否	是	物料编码 示例：WL01
purchaseUnitCode	string	否	是	采购单位编码
unit_name	string	否	是	计价单位编码或名字
purchaseNum	number
小数位数:2,最大长度:8	否	是	采购数量
currencyCodeDiwork	string	否	是	币种编码 示例：CNY 默认值：CNY
currencyIdDiwork	string	否	否	币种id 示例：12412
planPrice	number
小数位数:2,最大长度:8	否	否	计划价
productDesc	string	否	否	物料描述 示例：这是描述
reqdate	date
格式:yyyy-MM-dd HH:mm:ss	否	否	需求时间 示例：2023-01-01
reqOrgId	string	否	否	需求组织id（需求组织id与需求组织编码2选1必填） 示例：1241211
reqOrgCode	string	否	否	需求组织编码（需求组织id与需求组织编码2选1必填） 示例：dept01
brand	string	否	否	品牌 示例：这是品牌
puorgDocId	string	否	否	采购组织id(采购组织id与编码二选一必填) 示例：12412412
puorgcode	string	否	否	采购组织编码(采购组织id与编码二选一必填) 示例：org01
erpCpuPsnId	string	否	否	采购员id 示例：12412412
erpCpuPsnCode	string	否	否	采购员编码 示例：psn01
transactionTypeId	string	否	否	交易类型id 示例：12412412
transactionTypeCode	string	否	否	交易类型编码 示例：jylx01
reqProjectCode	string	否	否	项目名称编码 示例：pro01
reqUapProjectId	string	否	否	项目名称id 示例：1243123
reqContactId	string	否	否	需求人id 示例：123412123
reqContactCode	string	否	否	需求人编码 示例：psn01
reqDeptId	string	否	否	需求部门id 示例：1241241
reqDeptCode	string	否	否	需求部门编码 示例：dept01
receivePersonId	string	否	否	收货人id 示例：1241241241
receivePersonCode	string	否	否	收货人编码 示例：psn01
receiveOrgId	string	否	否	收货组织id 示例：214124121
receiveOrgCode	string	否	否	收货组织编码 示例：org01
receivePersonTel	string	否	否	收货人联系方式 示例：13488889999
receiveAddress	string	否	否	收货地址 示例：这是收货地址
planPsnId	string	否	否	计划员id 示例：12412412
planPsnCode	string	否	否	计划员编码 示例：psn01
planDeptId	string	否	否	计划部门id 示例：12412412
planDeptCode	string	否	否	计划部门编码 示例：dept01
phone	string	否	否	联系电话 示例：13488889999
memo	string	否	否	备注 示例：这是备注
sourcecode	string	否	否	来源单据号（如果需要标识为外系统的单据，此字段必填） 示例：QG2023011600000256
sourcehid	string	否	否	来源单据id（如果需要标识为外系统的单据，此字段必填） 示例：12412412412412
sourcerowno	string	否	否	来源单据行号（如果需要标识为外系统的单据，此字段必填） 示例：10
sourcebid	string	否	否	来源行id（如果需要标识为外系统的单据，此字段必填） 示例：124124124
erpProductVersion	string	否	否	erp产品及版本（如果需要标识为外系统的单据，此字段必填） 示例：SupplyChain(公有云供应链请购单)，PRAYBILL(公有云需求申请)， U9 Cloud（u9c），NC6.5(nc65)，NCYonBIP V3 (R1_2207_1 Premium) 20220831(ncc高级版，后可跟小版本号)
id	string	否	否	采购需求id（修改采购需求时必填） 示例：1111111
_status	string	否	是	操作标识：Insert:新增、Update:更新 示例: Insert 示例：Insert

## 3. 请求示例

Url: /yonbip/cpu/pureq/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"code": "REQ202301010001",
			"productDocId": "1241241111",
			"productCode": "WL01",
			"purchaseUnitCode": "",
			"unit_name": "",
			"purchaseNum": 0,
			"currencyCodeDiwork": "CNY",
			"currencyIdDiwork": "12412",
			"planPrice": 0,
			"productDesc": "这是描述",
			"reqdate": "2023-01-01",
			"reqOrgId": "1241211",
			"reqOrgCode": "dept01",
			"brand": "这是品牌",
			"puorgDocId": "12412412",
			"puorgcode": "org01",
			"erpCpuPsnId": "12412412",
			"erpCpuPsnCode": "psn01",
			"transactionTypeId": "12412412",
			"transactionTypeCode": "jylx01",
			"reqProjectCode": "pro01",
			"reqUapProjectId": "1243123",
			"reqContactId": "123412123",
			"reqContactCode": "psn01",
			"reqDeptId": "1241241",
			"reqDeptCode": "dept01",
			"receivePersonId": "1241241241",
			"receivePersonCode": "psn01",
			"receiveOrgId": "214124121",
			"receiveOrgCode": "org01",
			"receivePersonTel": "13488889999",
			"receiveAddress": "这是收货地址",
			"planPsnId": "12412412",
			"planPsnCode": "psn01",
			"planDeptId": "12412412",
			"planDeptCode": "dept01",
			"phone": "13488889999",
			"memo": "这是备注",
			"sourcecode": "QG2023011600000256",
			"sourcehid": "12412412412412",
			"sourcerowno": "10",
			"sourcebid": "124124124",
			"erpProductVersion": "SupplyChain(公有云供应链请购单)，PRAYBILL(公有云需求申请)， U9 Cloud（u9c），NC6.5(nc65)，NCYonBIP V3 (R1_2207_1 Premium) 20220831(ncc高级版，后可跟小版本号)",
			"id": "1111111",
			"_status": "Insert"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
puorgDocId	string	否	采购组织id 示例：1753605503279693830
puorgDocId_name	string	否	采购组织 示例：采购云
erpCpuPsnId	string	否	采购员id 示例：1756591338764107785
erpCpuPsnId_name	string	否	采购员
productDocId	string	否	物料id 示例：1772636039501316104
productDocId_name	string	否	物料名称 示例：这是物料名称
productCode	string	否	物料编码 示例：0001000009
productDesc	string	否	物料描述 示例：规格: 型号:
materialClassId	string	否	物料分类id 示例：1975243708597010439
materialClassCode	string	否	物料分类编码 示例：000013
materialClassName	string	否	物料分类名称 示例：这是物料分类名称
currencyIdDiwork	string	否	币种id 示例：1753541800320040992
currencyTypeSignDiwork	string	否	币种符号 示例：?
currencyCodeDiwork	string	否	币种编码 示例：CNY
currencyNameDiwork	string	否	币种名称 示例：人民币
currencyIdDiwork_priceDigit	string	否	单价精度 示例：4
purchaseUnitId	string	否	采购单位id 示例：1753668373007302672
purchaseUnitId_name	string	否	采购单位 示例：克
purchaseUnitId_precision	string	否	采购单位精度 示例：2
purchaseUnitId_truncationType	string	否	采购单位舍入规则 示例：4
invPurExchRateType	string	否	采购换算率类型 示例：0
invPurExchRate	number
小数位数:0,最大长度:10	否	采购单位换算率 示例：1
mainUnitId	string	否	主单位id 示例：1753668373007302672
mainUnitCode	string	否	主单位编码 示例：GRM
mainUnitId_name	string	否	主单位 示例：克
mainUnit_Precision	string	否	主单位精度 示例：2
mainUnitId_precision	string	否	主单位精度 示例：2
mainUnitId_truncationType	string	否	主单位舍入规则 示例：4
unitid	string	否	计价单位id 示例：1753668373007302672
unitcode	string	否	计价单位编码 示例：GRM
unitid_name	string	否	计价单位 示例：克
unitid_precision	string	否	计价单位精度 示例：2
unitid_truncationType	string	否	计价单位舍入规则 示例：4
invPriceExchRate	number
小数位数:0,最大长度:10	否	计价单位换算率 示例：1
invPriceExchRateType	string	否	计价换算率类型 示例：0
code	string	否	编码 示例：REQ241119000001
reqContactId_name	string	否	需求人
reqOrgId	string	否	需求组织id 示例：1753605503279693830
reqOrgId_name	string	否	需求组织 示例：采购云
reqDeptId_name	string	否	需求部门
purchaseNum	number
小数位数:0,最大长度:10	否	采购数量 示例：11
mainNum	number
小数位数:0,最大长度:10	否	主数量 示例：11
quantity	number
小数位数:0,最大长度:10	否	计价数量 示例：11
fileId	string	否	附件id 示例：5e2b562e-25d9-4010-9780-fbc577e420cb
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
creator	string	否	创建人id 示例：1579145065582821376
creatorName	string	否	创建人 示例：这是创建人
createTime	string	否	创建时间 示例：2024-11-19 13:56:22
ecProcessStatus	string	否	状态 示例：0
dr	number
小数位数:0,最大长度:10	否	删除标识 示例：0
corpSubAccountUserId	string	否	需求提人的用户id 示例：1579145065582821376
id	string	否	采购需求id 示例：2137139494340001800
pubts	string	否	时间戳 示例：2024-11-19 13:56:23
ytenant	string	否	租户id 示例：这是租户id

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"puorgDocId": "1753605503279693830",
		"puorgDocId_name": "采购云",
		"erpCpuPsnId": "1756591338764107785",
		"erpCpuPsnId_name": "",
		"productDocId": "1772636039501316104",
		"productDocId_name": "这是物料名称",
		"productCode": "0001000009",
		"productDesc": "规格: 型号:",
		"materialClassId": "1975243708597010439",
		"materialClassCode": "000013",
		"materialClassName": "这是物料分类名称",
		"currencyIdDiwork": "1753541800320040992",
		"currencyTypeSignDiwork": "?",
		"currencyCodeDiwork": "CNY",
		"currencyNameDiwork": "人民币",
		"currencyIdDiwork_priceDigit": "4",
		"purchaseUnitId": "1753668373007302672",
		"purchaseUnitId_name": "克",
		"purchaseUnitId_precision": "2",
		"purchaseUnitId_truncationType": "4",
		"invPurExchRateType": "0",
		"invPurExchRate": 1,
		"mainUnitId": "1753668373007302672",
		"mainUnitCode": "GRM",
		"mainUnitId_name": "克",
		"mainUnit_Precision": "2",
		"mainUnitId_precision": "2",
		"mainUnitId_truncationType": "4",
		"unitid": "1753668373007302672",
		"unitcode": "GRM",
		"unitid_name": "克",
		"unitid_precision": "2",
		"unitid_truncationType": "4",
		"invPriceExchRate": 1,
		"invPriceExchRateType": "0",
		"code": "REQ241119000001",
		"reqContactId_name": "",
		"reqOrgId": "1753605503279693830",
		"reqOrgId_name": "采购云",
		"reqDeptId_name": "",
		"purchaseNum": 11,
		"mainNum": 11,
		"quantity": 11,
		"fileId": "5e2b562e-25d9-4010-9780-fbc577e420cb",
		"resubmitCheckKey": "reqcard_add_ae97c172-b2d7-4643-a43c-ee16e7ec04a6",
		"creator": "1579145065582821376",
		"creatorName": "这是创建人",
		"createTime": "2024-11-19 13:56:22",
		"ecProcessStatus": "0",
		"dr": 0,
		"corpSubAccountUserId": "1579145065582821376",
		"id": "2137139494340001800",
		"pubts": "2024-11-19 13:56:23",
		"ytenant": "这是租户id"
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
999	服务端逻辑异常	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-04	
更新
请求说明
更新
返回参数 currencyTypeSignDiwork
删除
返回参数 buyerTenant

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

