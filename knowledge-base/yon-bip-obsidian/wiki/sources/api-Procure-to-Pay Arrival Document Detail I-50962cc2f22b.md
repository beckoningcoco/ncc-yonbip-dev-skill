---
title: "采购协同到货单详情查询"
apiId: "50962cc2f22b4636a61a09041f610203"
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

# 采购协同到货单详情查询

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/arriveorder/getarriveorder
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
arriveOrderId	long	否	否	协同到货单主键id（arriveOrderId，arriveOrderCode选其一必填） 示例：123456
arriveOrderCode	string	否	否	协同到货单号（arriveOrderId，arriveOrderCode选其一必填） 示例：DH20210303122636747001

## 3. 请求示例

Url: /yonbip/cpu/arriveorder/getarriveorder?access_token=访问令牌
Body: {
	"arriveOrderId": 123456,
	"arriveOrderCode": "DH20210303122636747001"
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
code	long	否	返回成功编码 示例：200
message	string	否	返回信息 示例：获取到货单详情成功！
data	object	否	返回数据
id	long	否	到货单ID 示例：13123
createTime	string	否	创建时间 示例：2022-01-17 10:05:22
ts	string	否	时间戳 示例：2022-01-17 15:36:05
arriveOrderType	string	否	到货单类型 ：0：来源云采销售订单 1：来源第三方电商 2：来源云采超市 3：来源交货计划单 示例：2
arriveOrderCode	string	否	到货单号 示例：DH20220117100522104001
deliveryOrderCode	string	否	发货单号 示例：9876543210
supEnterpriseId	long	否	供应商id 示例：72080
supEnterpriseName	string	否	供应商名称 示例：云采测试用供应商02(yctest_gys02)
purEnterpriseId	long	否	采购商id 示例：2556365
purEnterpriseName	string	否	采购商名称 示例：0914采购云友企连
purchaseOrgId	long	否	采购组织id 示例：2431343938015489
purchaseOrgCode	string	否	采购组织编码 示例：ORG001
purchaseOrgName	string	否	采购组织名称 示例：天海总公司
totalNum	long	否	总数量 示例：1
status	string	否	到货单状态 ：0：已发货 1：已签收 2： 拒签 4：退货中 5：退换货完成 6：内审中 7：部分签收 8：签收审批中 示例：1
transportType	string	否	运输方式 0：火车 1.汽车 2.轮船 3.飞机 4.物流 5.其他 示例：第三方物流
logisticalInfo	string	否	物流信息 示例：[{"content":"供应商已发货","msgTime":"2022-01-17 10:05:22","operator":"云采测试用供应商02(yctest_gys02)"}]
orderId	long	否	采购订单id 示例：100135984
orderCode	string	否	采购订单单据号 示例：202201170001
saleOrderId	long	否	云采销售订单id 示例：2601426554327389
saleOrderCode	string	否	销售订单单据号 示例：202201170001
deliveryOrderId	long	否	发货单ID 示例：2608089026793728
memo	string	否	发货备注 示例：测试发货单生成酥梨02
details	object	是	到货单详情
sendErpRsmsg	string	否	发送erp信息 示例：到货单发送ERP失败,请重试： [0Mcc4V6Jk759gFazNLLYVQ]:网关已离线
accountStatus	string	否	对账状态字段 -1 未对账 1 已对账 示例：1
deliveryDate	string	否	发货日期 示例：2022-01-17
receiveMemo	string	否	签收备注 示例：测试到货单签收酥梨02
signUser	string	否	签收人 示例：yc_18989999102
signTime	string	否	签收时间 示例：2022-01-17 14:01:05
projectDocId	long	否	项目Id 示例：2435453798273280
projectDocName	string	否	项目名称 示例：项目2
projectDocCode	string	否	项目编码 示例：00000002
isPushERP	string	否	是否自动推送ERP 0 : 不推送 1：推送，默认推送 示例：1
statusName	string	否	状态显示 示例：已签收
supplierid	long	否	供应商档案ID 示例：2431351087436032
supplierName	string	否	供应商档案名称 示例：云采测试专用供应商02（yctest_gys02)
supplierCode	string	否	供应商编码 示例：gys02
supplierShortName	string	否	供应商简称 示例：云采测试专用供应商02（yctest_gys02)
priceType	string	否	价格类型 1.实价 2浮动价格 3浮动比例 示例：1
isDelivered	string	否	是否妥投 0否 1是 示例：0
isDeliveryBrand	string	否	供应商发货，是否允许反馈发货品牌 0：不允许 1：允许 示例：0
taxAmountShow	string	否	显示含税金额 示例：*
amountShow	string	否	显示金额 示例：*
invoiceInfo	string	否	发票信息 示例：测试发货单生成酥梨02
sendErpCode	string	否	发送到ERP的成功失败标记字段 2：发送erp失败 3：发送erp成功 示例：2
isYcReceive	string	否	是否云采签收 0：不在云采签收 1：在云采签收 示例：1
signUserId	long	否	签收人id 示例：2090517
isDeliveryProxy	string	否	是否代发货 1 是 0 否 示例：0
supTenantId	string	否	供应商TenantId 示例：ufs76h7m

## 5. 正确返回示例

{
	"code": 200,
	"message": "获取到货单详情成功！",
	"data": {
		"id": 13123,
		"createTime": "2022-01-17 10:05:22",
		"ts": "2022-01-17 15:36:05",
		"arriveOrderType": "2",
		"arriveOrderCode": "DH20220117100522104001",
		"deliveryOrderCode": "9876543210",
		"supEnterpriseId": 72080,
		"supEnterpriseName": "云采测试用供应商02(yctest_gys02)",
		"purEnterpriseId": 2556365,
		"purEnterpriseName": "0914采购云友企连",
		"purchaseOrgId": 2431343938015489,
		"purchaseOrgCode": "ORG001",
		"purchaseOrgName": "天海总公司",
		"totalNum": 1,
		"status": "1",
		"transportType": "第三方物流",
		"logisticalInfo": "[{\"content\":\"供应商已发货\",\"msgTime\":\"2022-01-17 10:05:22\",\"operator\":\"云采测试用供应商02(yctest_gys02)\"}]",
		"orderId": 100135984,
		"orderCode": "202201170001",
		"saleOrderId": 2601426554327389,
		"saleOrderCode": "202201170001",
		"deliveryOrderId": 2608089026793728,
		"memo": "测试发货单生成酥梨02",
		"details": [
			{
				"id": 1958032,
				"arriveOrderId": 13123,
				"purnum": 1,
				"num": 1,
				"productSubject": "20冲压弯",
				"unit": "个",
				"materialId": 2432537515135232,
				"materialName": "20冲压弯",
				"materialCode": "Y16030541",
				"materialModel": "型号",
				"erpMaterialId": "2432537515135232",
				"deliveryOrderDetailId": 2608089026810112,
				"orderId": 100135984,
				"orderCode": "202201170001",
				"orderDetailId": 1904636,
				"saleOrderId": 2601426554327389,
				"saleOrderCode": "202201170001",
				"saleOrderDetailId": 2601426554360175,
				"status": "1",
				"planArriveDate": "2022-01-18",
				"signNum": 1,
				"inwhNum": 0,
				"currInwhNum": 0,
				"lastSignDiffNum": 0,
				"lastDiffReceiveDiffNum": 0,
				"lastReplenishDiffNum": 0,
				"lastDiffStorageDiffNum": 0,
				"diffReceivedNum": 0,
				"diffStorageNum": 0,
				"purchaseSignNum": 1,
				"purchaseInwhNum": 0,
				"priceSignNum": 1,
				"priceInwhNum": 0,
				"diffPriceReceivedNum": 0,
				"diffPriceStorageNum": 0,
				"replenishNum": 0,
				"receiveMemo": "",
				"lineNum": 1,
				"orderCodeLineNum": "202201170001-1",
				"purchaseId": 2090517,
				"purchaseName": "王采购员",
				"blargess": false,
				"deliveryBrand": "华为",
				"taxPriceShow": "0",
				"priceShow": "0",
				"isBarcodeMng": 0,
				"isSerialnoMng": 0,
				"isPeriodMng": 0,
				"isBatchMng": 0,
				"isVerifyCert": 0,
				"isVerifyAuthorization": 0,
				"detailAccountStatus": "-1",
				"purchaseNum": 1,
				"purchaseUnitId": "2431348742246912",
				"purchaseUnitCode": "EA",
				"purchaseUnitName": "个",
				"purchaseExchRate": 1,
				"mainNum": 1,
				"mainMetrologyId": "2431348742246912",
				"mainMetrologyCode": "EA",
				"mainMetrologyName": "个",
				"unitid": "2431348742246912",
				"unitCode": "EA",
				"priceExchRate": 1
			}
		],
		"sendErpRsmsg": "到货单发送ERP失败,请重试： [0Mcc4V6Jk759gFazNLLYVQ]:网关已离线",
		"accountStatus": "1",
		"deliveryDate": "2022-01-17",
		"receiveMemo": "测试到货单签收酥梨02",
		"signUser": "yc_18989999102",
		"signTime": "2022-01-17 14:01:05",
		"projectDocId": 2435453798273280,
		"projectDocName": "项目2",
		"projectDocCode": "00000002",
		"isPushERP": "1",
		"statusName": "已签收",
		"supplierid": 2431351087436032,
		"supplierName": "云采测试专用供应商02（yctest_gys02)",
		"supplierCode": "gys02",
		"supplierShortName": "云采测试专用供应商02（yctest_gys02)",
		"priceType": "1",
		"isDelivered": "0",
		"isDeliveryBrand": "0",
		"taxAmountShow": "*",
		"amountShow": "*",
		"invoiceInfo": "测试发货单生成酥梨02",
		"sendErpCode": "2",
		"isYcReceive": "1",
		"signUserId": 2090517,
		"isDeliveryProxy": "0",
		"supTenantId": "ufs76h7m"
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
201	协同到货单主键和到货单号不能同时为空	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-24	
新增
请求参数 (11)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

