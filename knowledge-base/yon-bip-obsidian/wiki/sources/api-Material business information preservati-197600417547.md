---
title: "物料业务信息保存V2"
apiId: "1976004175479177225"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material"
domain: "MD"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 物料业务信息保存V2

>  请求方式	POST | Material (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/product/productApplyData/saveFromIdempotent
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	物料id，与物料编码必传其一，两个都传以物料id为准 示例：2001401828850794505
code	string	否	否	物料编码，与物料id必传其一，两个都传以物料id为准 示例：0012000467
orgId	string	否	否	物料管理组织id，与管理组织编码必传其一，两个都传以管理组织id为准 示例：666666
orgId_Code	string	否	否	物料管理组织编码，与物料管理组织id必传其一，两个都传以管理组织id为准 示例：global00
belogOrg	string	否	否	物料使用组织id，与使用组织编码必传其一，两个都传以使用组织id为准 示例：0612001
belogOrg_Code	string	否	否	物料使用组织编码，与使用组织id必传其一，两个都传以使用组织id为准 示例：2156216
detail	object	否	是	物料使用信息详情数据

## 3. 请求示例

Url: /yonbip/digitalModel/product/productApplyData/saveFromIdempotent?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "2001401828850794505",
		"code": "0012000467",
		"orgId": "666666",
		"orgId_Code": "global00",
		"belogOrg": "0612001",
		"belogOrg_Code": "2156216",
		"detail": {
			"shortName": "物料简称",
			"fNoTaxCostPrice": 21,
			"mnemonicCode": "助记码",
			"barCode": "条形码",
			"receiptName": "开票名称",
			"receiptSpec": "开票规格",
			"receiptModel": "开票型号",
			"fMarkPrice": 15,
			"fSalePrice": 14,
			"fMarketPrice": 14,
			"fPrimeCosts": 16,
			"safetyStock": 155,
			"highestStock": 1550,
			"lowestStock": 15,
			"arrivalAllowErrorLimit": 60,
			"invoiceAllowErrorLimit": 30,
			"inStoreLessLimit": 20,
			"outStoreLessLimit": 10,
			"storageLossRate": 5,
			"lInventoryCount": 80,
			"fSettleAccountsRate": 70,
			"iBaseSaleCount": 50,
			"frontLeadTime": 10,
			"behindLeadTime": 5,
			"leadTimeCoefficient": 30,
			"leadTimeQuantity": 8,
			"rejectRate": 0.1,
			"omsWarehouse": 1689721154595454979,
			"omsWarehouseCode": "000036",
			"returnWarehouse": 1689721154595454979,
			"returnWarehouseCode": "000036",
			"deliveryWarehouse": 1689721154595454979,
			"deliveryWarehouseCode": "000036",
			"receiptWarehouse": 1689721154595454979,
			"receiptWarehouseCode": "000036",
			"inspectionType": 0,
			"warehousingByResult": false,
			"testRule": 1,
			"enableStockPeriodRecheck": 0,
			"enableStockExpireCheck": 0,
			"returnInspection": 0,
			"sendInspection": 0,
			"singleInspection": 0,
			"planCheckDays": 1,
			"isBatchManage": false,
			"checkByBatch": false,
			"planDefaultAttribute": 1,
			"isSerialNoManage": false
		}
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信 示例：操作成功
data	object	否	调用成功时的返回数据
id	number
小数位数:0,最大长度:0	否	物料id 示例：1530992761288786000

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 1530992761288786000
	}
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	服务端逻辑异常

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-17	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

