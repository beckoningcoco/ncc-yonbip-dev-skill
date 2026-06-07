---
title: "工时汇报详情查询"
apiId: "1429873528601575424"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Working Hrs Report"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Working Hrs Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 工时汇报详情查询

>  请求方式	GET | Working Hrs Report (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/workhoursmaintain/detail
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	单据id，单据id与单据code必输一个，都存在时以id为准    示例: 2232347838257823744
code	string	query	否	单据code，即工时汇报编号，单据id与单据code必输一个，都存在时以id为准    示例: WH20250327000011

## 3. 请求示例

Url: /yonbip/mfg/workhoursmaintain/detail?access_token=访问令牌&id=2232347838257823744&code=WH20250327000011

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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	string	否	返回状态code 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	data
id	string	否	主键 示例：2740176022868224
code	string	否	单据编号 示例：WH20250320000002
status	string	否	单据状态 示例：1
orgId	string	否	工厂id 示例：2036615013323008
orgIdName	string	否	组织名称 示例：Amy测试
vouchdate	string	否	业务日期 示例：2022-04-20 00:00:00
pubts	string	否	时间戳 示例：2025-03-20 09:01:29
transTypeId	string	否	交易类型id 示例：1997611082204054307
transTypeName	string	否	交易类型 示例：工时汇报
transTypeCode	string	否	交易类型code 示例：WH01
remarks	string	否	备注 示例：工时汇报备注
createType	string	否	创建方式 示例：0
verifystate	string	否	审批状态 示例：2
isWfControlled	string	否	是否审批流控制 示例：false
creatorId	string	否	创建人id 示例：1998343502991196166
creator	string	否	创建人 示例：张三
createTime	string	否	创建时间 示例：2025-03-20 09:01:28
createDate	string	否	创建日期 示例：2025-03-20 00:00:00
modifierId	string	否	最后修改人id 示例：1998343502991196166
modifier	string	否	最后修改人 示例：张三
modifyTime	string	否	最后修改时间 示例：2025-03-20 09:01:28
modifyDate	string	否	最后修改日期 示例：2025-03-20 00:00:00
auditorId	string	否	审核人id 示例：1998343502991196166
auditor	string	否	审核人 示例：张三
auditTime	string	否	审核时间 示例：2025-03-20 09:01:28
auditDate	string	否	审核日期 示例：2025-03-20 00:00:00
workHourReportDetail	object	是	工时汇报详情

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "2740176022868224",
		"code": "WH20250320000002",
		"status": "1",
		"orgId": "2036615013323008",
		"orgIdName": "Amy测试",
		"vouchdate": "2022-04-20 00:00:00",
		"pubts": "2025-03-20 09:01:29",
		"transTypeId": "1997611082204054307",
		"transTypeName": "工时汇报",
		"transTypeCode": "WH01",
		"remarks": "工时汇报备注",
		"createType": "0",
		"verifystate": "2",
		"isWfControlled": "false",
		"creatorId": "1998343502991196166",
		"creator": "张三",
		"createTime": "2025-03-20 09:01:28",
		"createDate": "2025-03-20 00:00:00",
		"modifierId": "1998343502991196166",
		"modifier": "张三",
		"modifyTime": "2025-03-20 09:01:28",
		"modifyDate": "2025-03-20 00:00:00",
		"auditorId": "1998343502991196166",
		"auditor": "张三",
		"auditTime": "2025-03-20 09:01:28",
		"auditDate": "2025-03-20 00:00:00",
		"workHourReportDetail": [
			{
				"id": "2226790116211294214",
				"lineno": "10",
				"productOrderId": "2740176022868224",
				"productOrderIdCode": "SCDD20250319000047",
				"orderCode": "SCDD20250319000047",
				"productOrderLineId": "2740176022868225",
				"orderLineNo": "10",
				"productOrderAuditDate": "2025-03-20 00:00:00",
				"productDeptId": "2036615013323008",
				"productDeptIdName": "生产一部",
				"productId": "1997611082204054307",
				"productName": "铝合金板材",
				"productCode": "WL20250320001",
				"productIdModelDescription": "厚度10mm，宽度1000mm",
				"productIdModel": "AL-1000",
				"orderProcessId": "2740176022868226",
				"orderProcessIdSn": "1",
				"snOperationName": "切割",
				"workCenter": "2740176022868227",
				"workCenterName": "加工中心A区",
				"batchNo": "PC20250320001",
				"consumptionCategory": "1",
				"costCenterId": "2740176022868228",
				"costCenterName": "成本中心A",
				"virtualAccbodyId": "2740176022868229",
				"virtualAccbodyName": "利润中心A",
				"financeOrgIdName": "会计主体A",
				"financeOrgId": "2740176022868230",
				"workCategory": "1",
				"teamId": "2740176022868231",
				"teamIdName": "班组A",
				"teamIdCode": "BZ20250320001",
				"staffId": "2740176022868232",
				"staffIdName": "张三",
				"staffIdCode": "RY20250320001",
				"deviceId": "2740176022868233",
				"deviceIdName": "切割机001",
				"deviceIdCode": "SB20250320001",
				"actualPrepareTime": "2.5",
				"actualProcessTime": "5.0",
				"planProcessTime": "4.5",
				"planPrepareTime": "2.0",
				"timeUnit": "1",
				"sourceDocType": "4",
				"sourceDocId": "2740176022868234",
				"sourceDocLineId": "10",
				"sourceDocCode": "SCDD20250319000047",
				"projectId": "2740176022868235",
				"projectCode": "XM20250320001",
				"projectName": "新生产线建设项目",
				"wbs": "2740176022868236",
				"wbsCode": "WBS20250320001",
				"wbsName": "设备安装调试",
				"activity": "2740176022868237",
				"activityCode": "ACT20250320001",
				"activityTaskName": "设备安装",
				"shiftId": "2266129602882568220",
				"shiftIdName": "班次A"
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
0	未传入优惠券档案id	coupon_id值填写有误
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
新增
返回参数 shiftId
新增
返回参数 shiftIdName

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

