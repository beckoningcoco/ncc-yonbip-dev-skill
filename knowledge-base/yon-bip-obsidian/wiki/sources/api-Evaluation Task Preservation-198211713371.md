---
title: "评价任务保存"
apiId: "1982117133717340162"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Evaluation Task"
domain: "PROSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Evaluation Task]
platform_version: "BIP"
source_type: community-api-docs
---

# 评价任务保存

>  请求方式	POST | Evaluation Task (PROSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/api/evaluateapply/save
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
data	object	否	是	评价任务数据
supConOrgId	string	否	否	管理组织id
parentApplyId	string	否	否	父任务ID
rootApplyId	string	否	否	主任务ID
applyTitle	string	否	是	标题
code	string	否	否	编码
applyCode	string	否	否	评价任务编码
source	string	否	否	来源单据类型(采购合同：cpu-contract.yccontract)
sourceid	string	否	否	来源单据主表id
makeRuleCode	string	否	否	生单规则编号(采购合同生单：yccontract_to_evaluate)
applyPsnId	string	否	是	发起人id
applyOrgId	string	否	是	发起组织id
chargeOrgId	string	否	是	评价组织id
chargePsnId	string	否	是	评价负责人id
evaAutoDuration	string	否	否	考评周期
evaAutoYear	string	否	否	周期（年）
evaAutoSeason	string	否	否	周期（季）
evaAutoMonth	object	否	否	周期（月）
businessStartDate	date
格式:yyyy-MM-dd	否	否	业务开始日期
businessEndDate	date
格式:yyyy-MM-dd	否	否	业务截止日期
applyDate	date
格式:yyyy-MM-dd	否	是	申请日期
evaStartDate	date
格式:yyyy-MM-dd HH:mm:ss	否	是	任务开始时间
evaEndDate	date
格式:yyyy-MM-dd HH:mm:ss	否	是	任务结束时间
evaWeightType	string	否	是	评分方式（1：满分制 2：百分制） 默认值：1
summaryRule	string	否	是	汇总规则（1：全部打分 2：允许部分打分 3： 组内合计打分） 默认值：1
supSynergy	string	否	是	是否需要供应商反馈（0：否 1：是） 默认值：0
evaObjectType	string	否	是	考评颗粒度（0： 供应商 1：供应商+物料分类 2： 供应商+物料 3： 业务单据） 默认值：0
evaBillNum	string	否	否	业务单据
evaAbilityId	string	否	是	等级体系ID
enableIndClassWeight	string	否	否	是否启用指标分类权重
evaOrgType	string	否	是	评价结果更新范围（0：管理组织 1： 使用组织 2： 评价组织） 默认值：0
evaIndicatorType	string	否	否	是否包含自动指标
memo	string	否	否	备注
fileId	string	否	否	说明文件
status	string	否	否	状态 默认值：0
isRoot	string	否	否	任务类型
trasferName	string	否	否	转派人
evaObjectRef	string	否	否	评价对象参照
materialRef	string	否	否	物料参照
materialClassRef	string	否	否	物料分类参照
verifystate	string	否	否	审批流状态
returncount	string	否	否	退回次数
isWfControlled	string	否	否	是否审批流控制
auditor	string	否	否	审批人
auditTime	date
格式:yyyy-MM-dd HH:mm:ss	否	否	审批时间
evaObjectList	object	是	是	评价对象
evaOrgList	object	是	是	评价组织
evaIndicatorList	object	是	是	评价指标
evaExtraList	object	是	否	补充项
billnum	string	否	是	评价任务单据编码 默认值：cpu_evaluate_apply
_fromApi	boolean	否	是	api保存表示 默认值：true

## 3. 请求示例

Url: /yonbip/cpu/api/evaluateapply/save?access_token=访问令牌
Body: {
	"data": {
		"supConOrgId": "",
		"parentApplyId": "",
		"rootApplyId": "",
		"applyTitle": "",
		"code": "",
		"applyCode": "",
		"source": "",
		"sourceid": "",
		"makeRuleCode": "",
		"applyPsnId": "",
		"applyOrgId": "",
		"chargeOrgId": "",
		"chargePsnId": "",
		"evaAutoDuration": "",
		"evaAutoYear": "",
		"evaAutoSeason": "",
		"evaAutoMonth": {},
		"businessStartDate": "2026-06-07",
		"businessEndDate": "2026-06-07",
		"applyDate": "2026-06-07",
		"evaStartDate": "2026-06-07 13:06:11",
		"evaEndDate": "2026-06-07 13:06:11",
		"evaWeightType": "",
		"summaryRule": "",
		"supSynergy": "",
		"evaObjectType": "",
		"evaBillNum": "",
		"evaAbilityId": "",
		"enableIndClassWeight": "",
		"evaOrgType": "",
		"evaIndicatorType": "",
		"memo": "",
		"fileId": "",
		"status": "",
		"isRoot": "",
		"trasferName": "",
		"evaObjectRef": "",
		"materialRef": "",
		"materialClassRef": "",
		"verifystate": "",
		"returncount": "",
		"isWfControlled": "",
		"auditor": "",
		"auditTime": "2026-06-07 13:06:11",
		"evaObjectList": [
			{
				"id": 0,
				"_status": "",
				"evaApplyId": "",
				"objectType": "",
				"objectBillNum": "",
				"objectBillId": "",
				"supplyDocId_code": "",
				"supplyDocId_name": "",
				"supplyDocId": "",
				"materialClass_code": "",
				"wechat": "",
				"materialClass_name": "",
				"materialClass": "",
				"material_code": "",
				"material_name": "",
				"material": "",
				"vendorTenant": "",
				"makeRule": "",
				"makeRuleCode": "",
				"source": "",
				"sourceid": "",
				"purchaseClassId": "",
				"purchaseClassId_code": "",
				"purchaseClassId_name": ""
			}
		],
		"evaOrgList": [
			{
				"id": 0,
				"_status": "Insert",
				"evaApplyId": "",
				"platCountryId_code": "",
				"evaOrgId": "",
				"evaOrgPsnId": "",
				"memo": "",
				"weight": "",
				"agentPublish": "",
				"status": "",
				"downApplyId": ""
			}
		],
		"evaIndicatorList": [
			{
				"id": 0,
				"_status": "Insert",
				"evaApplyId": "",
				"indicatorClassId": "",
				"indicatorId": "",
				"indicatorType": "",
				"indicatorDes": "",
				"indicatorScoreStd": "",
				"vetoItem": "",
				"vetoItemScore": "",
				"reduce": "",
				"weight": "",
				"indicatorMaxScore": "",
				"isRequired": "",
				"isPartake": "",
				"indClassWeight": "",
				"indClassWeightType": "",
				"evaMemberList": [
					{
						"id": 0,
						"_status": "Insert",
						"evaApplyId": "",
						"evaApplyIndId": "",
						"personId": "",
						"groupId": "",
						"type": "",
						"weight": ""
					}
				],
				"haveMember": "",
				"memberInfo": ""
			}
		],
		"evaExtraList": [
			{
				"id": "",
				"_status": "Insert",
				"evaApplyId": "",
				"extraItem": "",
				"type": "",
				"memo": ""
			}
		]
	},
	"billnum": "",
	"_fromApi": true
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
小数位数:0,最大长度:3	否	状态码 示例：200
message	string	否	执行结果信息 示例：success

## 5. 正确返回示例

{
	"code": 200,
	"message": "success"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	error	单据保存失败

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-18	
更新
请求说明
新增
请求参数 (13)
更新
请求参数 indicatorMaxScore

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

