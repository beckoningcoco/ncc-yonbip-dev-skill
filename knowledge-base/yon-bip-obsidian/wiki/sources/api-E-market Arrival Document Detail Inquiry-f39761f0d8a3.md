---
title: "云采超市到货单详情查询"
apiId: "f39761f0d8a343d5ab024ba79cf7c1e4"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "youGo Supermarket"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, youGo Supermarket]
platform_version: "BIP"
source_type: community-api-docs
---

# 云采超市到货单详情查询

>  请求方式	POST | youGo Supermarket (SMK)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/yonbip-cpu-mall/openapi/queryMallArriveorder
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
mallOrderId	long	否	否	超市订单id（与超市订单编码二选一必填） 示例：100002647
mallOrderCode	string	否	否	超市订单编码（与超市订单id二选一必填） 示例：20220124110002
arriveOrderId	long	否	否	超市到货单id（与超市到货单编码二选一必填） 示例：13152
arriveOrderCode	string	否	否	超市到货单编码（与超市到货单id二选一必填） 示例：DH20220127141410088001

## 3. 请求示例

Url: /yonbip/cpu/yonbip-cpu-mall/openapi/queryMallArriveorder?access_token=访问令牌
Body: {
	"mallOrderId": 100002647,
	"mallOrderCode": "20220124110002",
	"arriveOrderId": 13152,
	"arriveOrderCode": "DH20220127141410088001"
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
code	string	否	响应码 示例：200
message	string	否	查询结果 示例：操作成功
data	object	否	数据
yc_arriveid	string	否	超市到货单id 示例：13152
yc_arrivecode	string	否	超市到货单编码 示例：DH20220127141410088001
erp_arriveid	string	否	外系统到货单id
erp_arrivecode	string	否	外系统到货单编码
arriveOrderType	string	否	到货单类型(0:来源云采销售订单;1:来源第三方电商;2:来源云采超市) 示例：2
creatorName	string	否	制单人姓名 示例：18210528371
erp_usercode	string	否	erp用户编码
deliveryDate	long	否	发货日期 示例：1643212800000
yc_supplyCode	string	否	云采供应商编码 示例：myselft
erp_supplyCode	string	否	外系统供应商编码 示例：myselft
erp_purOrgCode	string	否	外系统采购组织编码 示例：default_org
headmemo	string	否	订单备注
supplierMemo	string	否	供应商备注
invoiceInfo	string	否	发票信息 示例：{}
linkpsn	string	否	联系人 示例：123213
linktype	string	否	联系方式 示例：213123
signTime	long	否	签收时间 示例：1643264077000
signUserCode	string	否	签收用户编码 示例：tmu9eu6r_1587547830787
transportType	string	否	运输方式(0:火车;1:汽车;2:轮船;3:飞机;4:物流;5:其他) 示例：2
logisticalComp	string	否	物流公司
logisticalCompCode	string	否	物流公司编码
logisticalCode	string	否	物流单号
transportCode	string	否	车牌号
trainCode	string	否	火车列车号
yc_deliveryOrderId	string	否	云采发货单id 示例：2610133387710747
yc_deliveryOrderCode	string	否	云采发货单编码 示例：FHD2201270008
yc_receiveAddress	string	否	云采收货地址 示例：河南新乡市延津县新建的地址
yc_receiveOrgCode	string	否	云采收货组织编码 示例：default_org
yc_receiveOrgName	string	否	云采收货组织名称 示例：九州科技
erp_receiveOrgCode	string	否	外系统收货组织编码 示例：default_org
erp_receiveOrgName	string	否	外系统收货组织名称 示例：九州科技
yc_receivePersonCode	string	否	云采收货人编码 示例：code
yc_receivePersonName	string	否	云采收货人姓名 示例：周采购
yc_receivePersonTel	string	否	收货人员电话
fileIdList	string	是	附件id 示例：["13123123"]
status	string	否	到货单状态(0:已发货;1:已签收;2:拒签;4:退货中;5:退换货完成;) 示例：0
bodys	object	是	明细

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"yc_arriveid": "13152",
		"yc_arrivecode": "DH20220127141410088001",
		"erp_arriveid": "",
		"erp_arrivecode": "",
		"arriveOrderType": "2",
		"creatorName": "18210528371",
		"erp_usercode": "",
		"deliveryDate": 1643212800000,
		"yc_supplyCode": "myselft",
		"erp_supplyCode": "myselft",
		"erp_purOrgCode": "default_org",
		"headmemo": "",
		"supplierMemo": "",
		"invoiceInfo": "{}",
		"linkpsn": "123213",
		"linktype": "213123",
		"signTime": 1643264077000,
		"signUserCode": "tmu9eu6r_1587547830787",
		"transportType": "2",
		"logisticalComp": "",
		"logisticalCompCode": "",
		"logisticalCode": "",
		"transportCode": "",
		"trainCode": "",
		"yc_deliveryOrderId": "2610133387710747",
		"yc_deliveryOrderCode": "FHD2201270008",
		"yc_receiveAddress": "河南新乡市延津县新建的地址",
		"yc_receiveOrgCode": "default_org",
		"yc_receiveOrgName": "九州科技",
		"erp_receiveOrgCode": "default_org",
		"erp_receiveOrgName": "九州科技",
		"yc_receivePersonCode": "code",
		"yc_receivePersonName": "周采购",
		"yc_receivePersonTel": "",
		"fileIdList": [
			"13123123"
		],
		"status": "0",
		"bodys": [
			{
				"yc_materialId": "2312321",
				"erp_materialId": "",
				"skuId": "",
				"skuCode": "",
				"skuName": "",
				"skuUnit": "斤",
				"yc_purOrderDetailId": "11031",
				"erp_purOrderDetailId": "orderDetail.getOuterDetailId",
				"yc_arriveDetailId": "1958461",
				"erp_arriveDetailId": "",
				"yc_purOrderId": "100002647",
				"materialDesc": "复古vvuv测试",
				"planArriveDate": 1642953600000,
				"deliveryNum": 20,
				"purNum": 20,
				"signnum": 20,
				"taxRate": 0,
				"taxPrice": 342,
				"supplierLineMemo": "",
				"signTaxAmount": 6840
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
999	订单不存在或参数异常	检查传入的参数

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

