---
title: "出库申请更新自定义项特征"
apiId: "1890073330272174089"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Issue Application"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Issue Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 出库申请更新自定义项特征

>  请求方式	POST | Issue Application (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/scm/pickingrequisition/update
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	出库申请[st.pickingrequisition.PickingRequisition]
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	否	主表id 如果状态是update，id要必传 示例：2430202243059968
requisitionDetail	object	是	是	出库申请子表[st.pickingrequisition.PickingRequisitionDetail]
_status	string	否	是	操作标识, Update:更新 示例：Update

## 3. 请求示例

Url: /yonbip/scm/pickingrequisition/update?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2430202243059968,
		"requisitionDetail": [
			{
				"id": 2430202243059969,
				"_status": "Update"
			}
		],
		"_status": "Update"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	返回单据
orgId	string	否	申请组织id
orgName	string	否	申请组织名称
transTypeId	string	否	交易类型id
transTypeName	string	否	交易类型名称
transTypeCode	string	否	交易类型编码
bizFlow	string	否	业务流流程ID
isFlowCoreBill	boolean	否	是否核心单据
bizFlow_name	string	否	流程名称
bizFlow_version	string	否	流程版本
vouchdate	string	否	申请日期
code	string	否	申请单编号
status	long	否	单据状态0：开立；1：已审核；2：已关闭；3：审核中
requisitionType	string	否	申请类型1：出库申请；2：领料申请
isWfControlled	boolean	否	是否审批流控制false：否；true：是
verifystate	long	否	审核状态0:初始开立,1:审批中,2:审批完成,3:不通过流程终止,4:驳回到制单
returncount	long	否	退回次数
barCode	string	否	单据条码
creatorId	long	否	创建人Id
creator	string	否	创建人姓名
createTime	string	否	创建时间
requisitionDetail	object	是	出库申请子表
id	long	否	出库申请主表ID
pubts	string	否	操作时间
createDate	string	否	创建时间
tenant	long	否	租户ID
yTenantId	string	否	租户编码

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"orgId": "",
		"orgName": "",
		"transTypeId": "",
		"transTypeName": "",
		"transTypeCode": "",
		"bizFlow": "",
		"isFlowCoreBill": true,
		"bizFlow_name": "",
		"bizFlow_version": "",
		"vouchdate": "",
		"code": "",
		"status": 0,
		"requisitionType": "",
		"isWfControlled": true,
		"verifystate": 0,
		"returncount": 0,
		"barCode": "",
		"creatorId": 0,
		"creator": "",
		"createTime": "",
		"requisitionDetail": [
			{
				"orgId": "",
				"orgName": "",
				"materialCode": "",
				"materialId": 0,
				"productId": 0,
				"materialName": "",
				"mainUnit": 0,
				"mainUnitName": "",
				"mainUnitPrecision": 0,
				"stockUnitId": 0,
				"stockUnitName": "",
				"stockUnitPrecision": 0,
				"changeRate": 0,
				"changeType": 0,
				"skuId": 0,
				"skuCode": "",
				"skuName": "",
				"batchno": "",
				"producedate": "",
				"invaliddate": "",
				"isBatchManage": true,
				"quantity": 0,
				"auxiliaryQuantity": 0,
				"warehouseName": "",
				"warehouseId": 0,
				"id": 0,
				"requisitionId": 0,
				"reserveid": 0,
				"pubts": "",
				"yTenantId": "",
				"expenseItems": 0,
				"expenseItems_name": "",
				"expenseItems_code": "",
				"budgetUnitPrice": 0,
				"budgetMoney": 0,
				"pickingRequisitionDetailExtend": {
					"id": 0,
					"returnStockReasonId": 0
				}
			}
		],
		"id": 0,
		"pubts": "",
		"createDate": "",
		"tenant": 0,
		"yTenantId": ""
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
1001001000003	交易类型与申请类型不匹配	根据返回提示信息做相应处理

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

