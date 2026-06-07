---
title: "VMI补货看板ERP新增"
apiId: "32b0353bb8dd43a59f9cfad95183541c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procure-to-Pay"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procure-to-Pay]
platform_version: "BIP"
source_type: community-api-docs
---

# VMI补货看板ERP新增

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/cpu-vmi/vmi/fillupdata
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	erp传来的数据
materialErpId	string	否	是	Erp物料Id 示例：1001A110000000011NMP
purOrgCode	string	否	是	采购组织erpcode 示例：01010102
purPersonCode	string	否	是	采购员code 示例：FH005878
stockUpper	BigDecimal	否	是	库存上限 示例：101772
storeOrgCode	string	否	是	库存组织编码 示例：01010102
supDocErpId	string	否	是	供应商档案ERP主键 示例：1001A11000000000QRCO
erpUnitID	string	否	否	erp单位id 示例：0001Z0100000000000XI
unitName	string	否	否	单位名称 示例：吨
fillUpPoint	BigDecimal	否	否	补货点（vmi配置，是否启用补货点来校验必填） 示例：76329
materialCode	string	否	否	物料编码 示例：R204101101
ohNum	BigDecimal	否	否	现存量 示例：44
purOrgErpId	string	否	否	Erp采购组织id 示例：0001A1100000000034AZ
purPersonErpId	string	否	否	Erp采购员id 示例：0001A110000000003GT1
stockLower	BigDecimal	否	否	库存下限 示例：38164
storeOrgErpId	string	否	否	库存组织ERP主键 示例：0001A1100000000034AZ
supDocCode	string	否	否	供应商档案code 示例：S206418
whId	long	否	否	仓库id 示例：1124
whName	string	否	否	仓库名称 示例：测试仓库
whErpId	string	否	否	ERP仓库Id 示例：1001A91000000000H1HO
whCode	string	否	否	仓库code 示例：TL001
supEnterpriseName	string	否	否	供应商名称 示例：供应商88890
supDocId	long	否	否	供应商档案id 示例：357473
supDocName	string	否	否	供应商档案name 示例：供应商88890
storeOrgId	long	否	否	库存组织id 示例：439246
storeOrgName	string	否	否	库存组织Name 示例：瓮福（集团）有限责任公司
materialId	long	否	否	物料id 示例：1000421632
materialName	string	否	否	物料名称 示例：活性炭
materialDesc	string	否	否	物料描述 示例： 规格 : 粒径：12X40目DCS-BB
spec	string	否	否	物料规格 示例：粒径：12X40目DCS-BB
model	string	否	否	物料型号 示例：12X40目DCS-BB
unitId	long	否	否	单位id 示例：124663
deliveryTime	string	否	否	交货周期（天） 示例：22
delTimeNeedNum	BigDecimal	否	否	交货周期预计需求量 示例：11
fillUpUpperNum	BigDecimal	否	否	补货上限 示例：12
intransitNum	BigDecimal	否	否	在途量 示例：1
purOrgId	long	否	否	采购组织id 示例：439246
purOrgName	string	否	否	采购组织name 示例：瓮福（集团）有限责任公司
purPersonId	long	否	否	采购员id 示例：590866
purPersonName	string	否	否	采购员Name 示例：韦君才
purPersonUserId	long	否	否	采购员对应的用户id 示例：2393479
purPersonMobile	string	否	否	采购员联系电话 示例：15262356235
receiverId	long	否	否	收货人Id 示例：590866
receiverName	string	否	否	收货人Name 示例：韦君才
receiverErpId	string	否	否	Erp收货人id 示例：1001A11000000000QRCO
receiverCode	string	否	否	收货人code 示例：FH005878
receiverOrgId	long	否	否	收货组织id 示例：439246
receiverOrgCode	string	否	否	收货组织编码 示例：A01
receiverOrgName	string	否	否	收货组织名称 示例：瓮福（集团）有限责任公司
receiverMobile	string	否	否	收货人联系电话 示例：15623562563
receiveAddress	string	否	否	收货地址 示例：北京市海淀区
warnLevel	string	否	否	预警级别 示例：1
remark	string	否	否	备注 示例：备注
myPhoneNum	string	否	否	默认联系人电话 示例：14562356236
myUserName	string	否	否	默认联系人 示例：韦君才
planDeliverDate	string	否	否	计划到货时间 示例：2021-03-31 15:52:22
taskNumber	string	否	否	任务号，同一批次上传的数据必须保持任务号一致，否则根据粒度会被覆盖 示例：2021-03-31 15:52:22
erpCurrencyId	string	否	否	erp币种id 示例：1002Z0100000000001K1
currencyId	string	否	否	币种id 示例：G001ZM0000DEFAULTCURRENCT00000000001
currencyCode	string	否	否	币种编码 示例：CNY
currencyName	string	否	否	币种名称 示例：人民币
currencySymbol	string	否	否	币种符号 示例：￥

## 3. 请求示例

Url: /yonbip/cpu/cpu-vmi/vmi/fillupdata?access_token=访问令牌
Body: {
	"data": [
		{
			"materialErpId": "1001A110000000011NMP",
			"purOrgCode": "01010102",
			"purPersonCode": "FH005878",
			"stockUpper": 101772,
			"storeOrgCode": "01010102",
			"supDocErpId": "1001A11000000000QRCO",
			"erpUnitID": "0001Z0100000000000XI",
			"unitName": "吨",
			"fillUpPoint": 76329,
			"materialCode": "R204101101",
			"ohNum": 44,
			"purOrgErpId": "0001A1100000000034AZ",
			"purPersonErpId": "0001A110000000003GT1",
			"stockLower": 38164,
			"storeOrgErpId": "0001A1100000000034AZ",
			"supDocCode": "S206418",
			"whId": 1124,
			"whName": "测试仓库",
			"whErpId": "1001A91000000000H1HO",
			"whCode": "TL001",
			"supEnterpriseName": "供应商88890",
			"supDocId": 357473,
			"supDocName": "供应商88890",
			"storeOrgId": 439246,
			"storeOrgName": "瓮福（集团）有限责任公司",
			"materialId": 1000421632,
			"materialName": "活性炭",
			"materialDesc": " 规格 : 粒径：12X40目DCS-BB",
			"spec": "粒径：12X40目DCS-BB",
			"model": "12X40目DCS-BB",
			"unitId": 124663,
			"deliveryTime": "22",
			"delTimeNeedNum": 11,
			"fillUpUpperNum": 12,
			"intransitNum": 1,
			"purOrgId": 439246,
			"purOrgName": "瓮福（集团）有限责任公司",
			"purPersonId": 590866,
			"purPersonName": "韦君才",
			"purPersonUserId": 2393479,
			"purPersonMobile": "15262356235",
			"receiverId": 590866,
			"receiverName": "韦君才",
			"receiverErpId": "1001A11000000000QRCO",
			"receiverCode": "FH005878",
			"receiverOrgId": 439246,
			"receiverOrgCode": "A01",
			"receiverOrgName": "瓮福（集团）有限责任公司",
			"receiverMobile": "15623562563",
			"receiveAddress": "北京市海淀区",
			"warnLevel": "1",
			"remark": "备注",
			"myPhoneNum": "14562356236",
			"myUserName": "韦君才",
			"planDeliverDate": "2021-03-31 15:52:22",
			"taskNumber": "2021-03-31 15:52:22",
			"erpCurrencyId": "1002Z0100000000001K1",
			"currencyId": "G001ZM0000DEFAULTCURRENCT00000000001",
			"currencyCode": "CNY",
			"currencyName": "人民币",
			"currencySymbol": "￥"
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
code	string	否	成功编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
msg	string	否	返回信息 示例：成功
result	string	否	返回结果 示例：success
successNum	long	否	成功条数 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"msg": "成功",
		"result": "success",
		"successNum": 0
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
201	错误详细信息	

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

