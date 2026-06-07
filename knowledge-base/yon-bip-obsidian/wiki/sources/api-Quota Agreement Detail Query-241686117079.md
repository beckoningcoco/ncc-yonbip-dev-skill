---
title: "配额协议详情查询"
apiId: "2416861170794758147"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Quota Agreement"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Quota Agreement]
platform_version: "BIP"
source_type: community-api-docs
---

# 配额协议详情查询

>  请求方式	POST | Quota Agreement (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/PCC/quotaAgreement/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	配额协议ID
code	string	否	否	配额协议编码

## 3. 请求示例

Url: /yonbip/PCC/quotaAgreement/detail?access_token=访问令牌
Body: {
	"id": "",
	"code": ""
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
小数位数:0,最大长度:10	否	返回状态码 示例：200
message	string	否	返回说明 示例：操作成功
data	object	否	返回数据
id	string	否	主键
code	string	否	配额协议编码
name	string	否	配额协议名称
orgId	string	否	组织ID
orgCode	string	否	组织编码
orgName	string	否	组织名称
materialId	string	否	物料ID
materialCode	string	否	物料编码
materialName	string	否	物料名称
businessType	string	否	业务场景：0：采购下单；3：委外下单
agreeTemplateId	string	否	配额协议模板ID
agreeTemplateCode	string	否	配额协议模板编码
enable	string	否	启用状态：0：停用；1：启用
minSplitNum	string	否	最小拆分量
agreeTemplateName	string	否	配额协议模板名称
mainUnit	string	否	主单位ID
mainUnit_name	string	否	主单位
effectStartDate	string	否	有效起始日期
effectEndDate	string	否	有效截止日期
quotaAgreeChmId	object	否	物料自由项特征组
memo	string	否	备注
isWfControlled	number
小数位数:0,最大长度:10	否	是否开启审批流
creator	string	否	创建人ID
creator_name	string	否	创建人
createTime	string	否	创建时间
modifier	string	否	更新人ID
modifier_name	string	否	更新人
modifyTime	string	否	更新时间
status	number
小数位数:0,最大长度:10	否	单据状态：0：开立；1：已审核；3：审核中
isMaterialClass	string	否	是否物料分类协议：0：否；1：是
allotplan	string	否	分配方案：50：固定比例分配
controlMethod	string	否	控制方式：1：数量；2：含税金额；3：无税金额
overControl	string	否	配额超量控制：1：不控制；2：检查提示；3：严格控制
QuotaAgreeAllotVOList	object	是	配额分配信息
manageClassCode	string	否	物料分类编码
QuotaAgreeOrgVOList	object	是	适用范围
manageClassId	string	否	物料分类id
manageClassName	string	否	物料分类
purchaseClassId	string	否	采购品类id
purchaseClassId_code	string	否	采购品类编码
purchaseClassId_name	string	否	采购品类名称
quotaAgreeChdId	object	否	配额协议自定义项
exchRateType	string	否	汇率类型id
exchRateTypeCode	string	否	汇率类型编码
exchRateTypeName	string	否	汇率类型名称
currency	string	否	币种Id
currency_name	string	否	币种

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "",
		"code": "",
		"name": "",
		"orgId": "",
		"orgCode": "",
		"orgName": "",
		"materialId": "",
		"materialCode": "",
		"materialName": "",
		"businessType": "",
		"agreeTemplateId": "",
		"agreeTemplateCode": "",
		"enable": "",
		"minSplitNum": "",
		"agreeTemplateName": "",
		"mainUnit": "",
		"mainUnit_name": "",
		"effectStartDate": "",
		"effectEndDate": "",
		"quotaAgreeChmId": {},
		"memo": "",
		"isWfControlled": 0,
		"creator": "",
		"creator_name": "",
		"createTime": "",
		"modifier": "",
		"modifier_name": "",
		"modifyTime": "",
		"status": 0,
		"isMaterialClass": "",
		"allotplan": "",
		"controlMethod": "",
		"overControl": "",
		"QuotaAgreeAllotVOList": [
			{
				"id": "",
				"agreeId": "",
				"iorder": 0,
				"supplyDocId": "",
				"supplyDocId_code": "",
				"supplyDocId_name": "",
				"quota": 0,
				"quotaAdjustNum": 0,
				"totalMaxOrderNum": 0,
				"execMoney": "",
				"sMaxPuMum": "",
				"quotaAdjustMoney": 0,
				"sMinPuNum": "",
				"totalMaxOrderMoney": 0,
				"puMultiNum": "",
				"actualQuota": 0,
				"quotaAgreeAllotChdId": {}
			}
		],
		"manageClassCode": "",
		"QuotaAgreeOrgVOList": [
			{
				"id": "",
				"agreeId": "",
				"orgId": "",
				"orgCode": "",
				"orgName": ""
			}
		],
		"manageClassId": "",
		"manageClassName": "",
		"purchaseClassId": "",
		"purchaseClassId_code": "",
		"purchaseClassId_name": "",
		"quotaAgreeChdId": {},
		"exchRateType": "",
		"exchRateTypeCode": "",
		"exchRateTypeName": "",
		"currency": "",
		"currency_name": ""
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
	1	2026-01-29	
新增
返回参数 (28)
更新
返回参数 effectEndDate

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

