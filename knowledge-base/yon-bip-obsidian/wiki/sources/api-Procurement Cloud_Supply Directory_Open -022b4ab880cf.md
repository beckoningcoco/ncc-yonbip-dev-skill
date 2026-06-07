---
title: "采购云_供货目录_开放查询API"
apiId: "022b4ab880cf4246a44ff506190ca790"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supply Catalog"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supply Catalog]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购云_供货目录_开放查询API

>  请求方式	POST | Supply Catalog (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/cpu-base/bill/querycategory
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
ids	long	是	否	供货目录IDs 示例：[1,2,3]
organizationId	long	否	是	组织ID 示例：1
materialClassIds	long	是	否	物料分类IDs 示例：[1,2]
purchaseClassIds	long	是	否	采购品类IDs 示例：[1,2]
materialIds	long	是	否	物料IDs 示例：[1,2,3]
materialSkuIds	long	是	否	物料sku IDs 示例：[1,2]
supplyDocIds	long	是	否	供应商档案IDs 示例：[1,2,4]
status	string	否	否	供货目录状态(APPROVING：审批中 CONFIRMED：已确认 DELETED：电商删除 INVALID：失效 INVISIBLE：电商下架 OFFSHELFED：下架 ONSHELFED：在架 REJECTED：已拒绝 TOCOMMIT：待提交 TOCONFIRM：待确认 TOSHELF：生效) 示例：TOSHELF 默认值：TOSHELF
open_pubts_begin	string	否	否	时间戳开始时间 示例：2020-10-28 13:37:10
open_pubts_end	string	否	否	时间戳截至时间 示例：2020-10-28 13:37:10

## 3. 请求示例

Url: /yonbip/cpu/cpu-base/bill/querycategory?access_token=访问令牌
Body: {
	"ids": [
		1,
		2,
		3
	],
	"organizationId": 1,
	"materialClassIds": [
		1,
		2
	],
	"purchaseClassIds": [
		1,
		2
	],
	"materialIds": [
		1,
		2,
		3
	],
	"materialSkuIds": [
		1,
		2
	],
	"supplyDocIds": [
		1,
		2,
		4
	],
	"status": "TOSHELF",
	"open_pubts_begin": "2020-10-28 13:37:10",
	"open_pubts_end": "2020-10-28 13:37:10"
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
data	object	否	数据集
code	long	否	查询结果响应码 示例：200
message	string	否	查询结果提示 示例：操作成功
data	object	是	详细数据

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"code": 200,
		"message": "操作成功",
		"data": [
			{
				"materialClassId_code": "00002",
				"materialSkuId_code": "000002",
				"memo": "beizhu",
				"supplyDocId_name": "自营",
				"supplyDocId": 2216404898844928,
				"source": "1",
				"materialId_cCode": "0001000001",
				"purchaseOrgId_name": "九州科技",
				"productName": "g物料名称",
				"purchaseOrgId_code": "default_org",
				"materialId_cName": "普通小草",
				"materialClassId_name": "猎获物资",
				"materialUnit_name": "斤",
				"id": 2356768701354240,
				"validtime": "2021-07-30 21:09:06",
				"pubts": "2021-07-23 21:09:06",
				"productSpec": "xinghao",
				"busiScope": "1",
				"supplyDocId_code": "myselft",
				"materialClassId": 2076255194190080,
				"materialSkuId_name": "西域止血甘",
				"applyScope": "1",
				"materialSkuId": 2077477975118082,
				"purchaseOrgId": "1709634857373952",
				"purchaseClassId": 1851479535737896962,
				"purchaseClassId_code": "ghml-wudong--002",
				"purchaseClassId_name": "供货目录-002",
				"materialId": 2076258708214016,
				"materialUnit": 2076258198638848,
				"productCode": "code",
				"status": "TOSHELF"
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
999	异常错误	确认服务是否正常
310008	参数异常	确认传参是否正确

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-12	
更新
请求说明
更新
返回参数 busiScope
	2	2025-04-01	
更新
请求参数 purchaseClassIds
更新
返回参数 purchaseClassId
更新
返回参数 purchaseClassId_code
更新
返回参数 purchaseClassId_name

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

