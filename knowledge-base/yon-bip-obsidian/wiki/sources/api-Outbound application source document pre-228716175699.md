---
title: "出库申请来源生单保存"
apiId: "2287161756991619081"
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

# 出库申请来源生单保存

>  请求方式	POST | Issue Application (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/scm/pickingrequisition/mergeSourceData/save
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
_status	string	否	是	操作标识, Insert:新增 默认值：Insert
mergeSourceData	boolean	否	是	合并上游数据，固定值传入true。 默认值：true
vouchdate	date
格式:yyyy-MM-dd HH:mm:ss	否	是	单据日期，日期格式:YYYYMMDD HHMMSS
code	string	否	否	单据编号：以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输
transTypeId	string	否	否	交易类型id或交易类型code，不传会根据单据转换规则中申请类型匹配对应交易类型
remark	string	否	否	备注
requisitionDetail	object	否	是	出库申请子表[st.pickingrequisition.PickingRequisitionDetail]
isExcess	boolean	否	否	是否超额。订单超额申领/申退业务
canBackFlush	boolean	否	否	允许倒冲。允许订单材料发料方式为倒冲的材料申领/申退

## 3. 请求示例

Url: /yonbip/scm/pickingrequisition/mergeSourceData/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"_status": "",
		"mergeSourceData": true,
		"vouchdate": "2026-06-07 12:56:39",
		"code": "",
		"transTypeId": "",
		"remark": "",
		"requisitionDetail": {
			"_status": "",
			"makeRuleCode": "",
			"sourceid": "",
			"sourceautoid": "",
			"sourceGrandchildrenId": "",
			"batchno": "",
			"goodsposition": "",
			"quantity": 0,
			"changeRate": 0,
			"stockUnitId": "",
			"materialReqType": "",
			"skuId": "",
			"warehouseId": "",
			"remark": "",
			"pickingRequisitionDetailExtend": {},
			"returnStockReasonId": ""
		},
		"isExcess": true,
		"canBackFlush": true
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
code	number
小数位数:0,最大长度:10	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
costAccountingMethod	number
小数位数:0,最大长度:10	否	委外成本核算方式
transTypeId	string	否	交易类型ID
id	string	否	主表主键ID
tenant	number
小数位数:0,最大长度:16	否	租户主键ID
departmentName	string	否	申请部门名称
orgName	string	否	申请组织名称
isWfControlled	boolean	否	是否审批流控制
srcBillType	string	否	主表记录来源单据类型
yTenantId	string	否	租户ID
barCode	string	否	单据条码
requisitionDefineCharacter	object	否	表头自定义项特征组
status	number
小数位数:0,最大长度:10	否	单据状态
verifystate	number
小数位数:0,最大长度:10	否	审批状态
code	string	否	单据编码
creatorId	string	否	创建人ID
remark	string	否	备注
orgId	string	否	申请组织ID
vouchdate	string	否	单据日期
requisitionType	string	否	申请类型
pubts	string	否	时间戳
createDate	string	否	创建日期
creator	string	否	创建人名称
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
createTime	string	否	创建时间
requisitionDetail	object	是	子表key
productionDepartmentId	string	否	申请部门ID
transTypeId_name	string	否	交易类型名称
transTypeCode	string	否	交易类型编码

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"costAccountingMethod": 0,
		"transTypeId": "",
		"id": "",
		"tenant": 0,
		"departmentName": "",
		"orgName": "",
		"isWfControlled": true,
		"srcBillType": "",
		"yTenantId": "",
		"barCode": "",
		"requisitionDefineCharacter": {
			"id": "",
			"pubts": ""
		},
		"status": 0,
		"verifystate": 0,
		"code": "",
		"creatorId": "",
		"remark": "",
		"orgId": "",
		"vouchdate": "",
		"requisitionType": "",
		"pubts": "",
		"createDate": "",
		"creator": "",
		"resubmitCheckKey": "",
		"createTime": "",
		"requisitionDetail": [
			{
				"auxiliaryQuantity": 0,
				"collaborationType": 0,
				"requisitionDetailCharacteristics": {
					"pubts": "",
					"id": ""
				},
				"firstsource": "",
				"firstupcode": "",
				"stockUnitName": "",
				"firstuplineno": 0,
				"isExpiryDateManage": true,
				"mainUnitPrecision": "",
				"mainUnit": "",
				"orgName": "",
				"productId": "",
				"requisitionDetailDefineCharacter": {
					"id": ""
				},
				"isWip": true,
				"orderProductId": "",
				"yTenantId": "",
				"mainUnitName": "",
				"materialName": "",
				"sourceType": "",
				"requirementDate": "",
				"stockUnitId": "",
				"reserveid": 0,
				"sourceGrandchildrenId": "",
				"firstsourceautoid": "",
				"makeRuleCode": "",
				"stockUnitPrecision": "",
				"orgId": "",
				"requisitionId": "",
				"sourceOrderProductRowno": 0,
				"isBatchManage": true,
				"firstsourceid": "",
				"changeRate": 0,
				"pubts": "",
				"sourceid": "",
				"rowno": 0,
				"quantity": 0,
				"changeType": 0,
				"sourceOrderlineno": 0,
				"materialCode": "",
				"isExcess": true,
				"sourceautoid": "",
				"lineno": 0,
				"upcode": "",
				"uplineno": 0,
				"isLineClose": true,
				"pickingRequisitionDetailExtend!costCenter_name": "",
				"pickingRequisitionDetailExtend!costCenter_code": "",
				"pickingRequisitionDetailExtend!costCenter": "",
				"pickingRequisitionDetailExtend!id": "",
				"pickingRequisitionDetailExtend!pubts": "",
				"source": ""
			}
		],
		"productionDepartmentId": "",
		"transTypeId_name": "",
		"transTypeCode": ""
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
	1	2025-08-04	
更新
请求说明
新增
请求参数 materialReqType
更新
请求参数 (4)
优化领料类型描述

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

