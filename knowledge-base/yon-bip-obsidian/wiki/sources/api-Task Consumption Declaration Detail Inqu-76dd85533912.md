---
title: "作业耗用申报详情查询"
apiId: "76dd855339124d66b9f1aec19f9368ef"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Resource consumption declaration"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Resource consumption declaration]
platform_version: "BIP"
source_type: community-api-docs
---

# 作业耗用申报详情查询

>  请求方式	GET | Resource consumption declaration (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/activityreport/detail
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	单据id，id和code同时传入时，以id为准，无论id是否正确。优先级：id > code    示例: 1
code	string	query	否	单据code，id和code同时传入时，以id为准，无论id是否正确。优先级：id > code    示例: testCode

## 3. 请求示例

Url: /yonbip/mfg/activityreport/detail?access_token=访问令牌&id=1&code=testCode

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
code	string	否	返回编码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	否	响应数据
pubts	string	否	时间戳 示例：2022-04-11 21:42:33
id	long	否	id 示例：2725586282730240
orgId	string	否	组织ID 示例：2036615013323008
orgCode	string	否	组织编码 示例：XY002
orgName	string	否	组织名称 示例：Amy测试
transTypeId	string	否	交易类型ID 示例：1420990582716628992
transTypeName	string	否	交易类型名称 示例：资源耗用申报
transTypeCode	string	否	交易类型编码 示例：RCR01
activityReportType	long	否	汇报类型，"0"，工作中心申报："1"，参照生产订单汇报："2"，资源耗用申报红冲："3"，其他推单："4" 示例：0
code	string	否	编码 示例：RCR2022041000001
status	long	否	单据状态，0：开立；1：已审核；3：审核中 示例：0
productionDepartmentId	string	否	部门 示例：2558519233794304
productionDepartmentCode	string	否	部门编码 示例：202012091718
productionDepartmentName	string	否	部门名称 示例：Amy测试部门
operatorCode	string	否	报告人
operatorId	string	否	报告人ID 示例：40828938811230208
operatorName	string	否	报告人名称 示例：苏红敏
vouchdate	string	否	单据日期 示例：2022-04-10 00:00:00
workCenterId	long	否	工作中心id 示例：2729804253844225
workCenterCode	string	否	工作中心编码 示例：111
workCenterName	string	否	工作中心名称 示例：西柚test工作中心"
orderId	long	否	生产订单ID 示例：2724762405524224
orderCode	string	否	订单编码 示例：CCCC220520024028
masterOrgKeyField	string	否	主组织字段 示例：orgId
orderProductId	long	否	产品订单行ID 示例：2724762405524225
orderProductIdLineNo	BigDecimal	否	生产订单行号 示例：10
materialName	string	否	物料名称 示例：台式机
materialId	long	否	制造物料 示例：2037661323661568
productCode	string	否	物料编码 示例：1035000012
productId	long	否	物料ID 示例：2037661108424960
skuId	long	否	skuId 示例：2037661108424961
quantity	BigDecimal	否	数量 示例：14
productQuantity	BigDecimal	否	生产数量 示例：19
mainUnitId	long	否	主计量单位 示例：2008299568156928
mainUnitIdName	string	否	主计量单位名称 示例：台
mainUnitIdPrecision	long	否	主计量单位精度 示例：3
direction	int	否	方向，0：正向，1：红冲 示例：0
reportMethod	string	否	申报方式，临时申报："0"，工作中心申报："1"，参照生产订单汇报："2"，资源申报红冲："3"，其他推单："4"。 示例：0
memo	string	否	备注 示例：remark
createDate	string	否	创建日期 示例：2022-04-10 00:00:00
modifyDate	string	否	修改日期 示例：2022-04-11 00:00:00
auditDate	string	否	审核日期 示例：2022-04-18 00:00:00
isWfControlled	boolean	否	是否审批流控制 true:是，false：否 示例：false
verifystate	int	否	审批状态，-1：驳回；0：开立；1：已提交；2：已审批 示例：0
returncount	int	否	退回次数 示例：0
barCode	string	否	条形码 示例：po_activity_report|2725586282730240
isFlowCoreBill	boolean	否	是否流程核心单据，true：是，false：否 示例：false
creatorId	long	否	创建人ID 示例：2035345314517248
creator	string	否	创建人名称 示例：17600591290
createTime	string	否	创建时间 示例：2022-04-10 10:09:44
modifierId	long	否	修改人ID 示例：2035345314517248
modifier	string	否	修改人名称 示例：17600591290
modifyTime	string	否	修改时间 示例：2022-04-11 21:42:33
auditor	string	否	审批人 示例：17600591290
auditorId	long	否	审批人ID 示例：2035345314517248
auditTime	string	否	审批时间 示例：2022-04-18 17:36:41
transTypeKeyField	string	否	交易类型字段 示例：transTypeId
postAccountStatus	int	否	过账状态，0：不过账，1：过账中，2：过账成功，3：过账失败，99：未过账 示例：99
postAccountVersion	long	否	过账版本
printCount	int	否	打印次数 示例：5
writeOffEnable	number
小数位数:0,最大长度:1	否	启用冲销 示例：0
activityReportUserdefItem	object	否	固定自定义项（1-60）
writeOffStatus	number
小数位数:0,最大长度:1	否	冲销状态。0：未冲销，1：已冲销，2：冲销单
activityReportExtItem	object	否	自由自定义项（1-60）
activityReportDetail	object	是	资源耗用申报明细
writeOffUpcode	string	否	冲销单据号
writeOffSourceid	string	否	冲销线索主表id
writeOffReason	string	否	冲销原因
fiEventAccountingDate	string	否	会计事务记账日期 示例：2025-06-18

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pubts": "2022-04-11 21:42:33",
		"id": 2725586282730240,
		"orgId": "2036615013323008",
		"orgCode": "XY002",
		"orgName": "Amy测试",
		"transTypeId": "1420990582716628992",
		"transTypeName": "资源耗用申报",
		"transTypeCode": "RCR01",
		"activityReportType": 0,
		"code": "RCR2022041000001",
		"status": 0,
		"productionDepartmentId": "2558519233794304",
		"productionDepartmentCode": "202012091718",
		"productionDepartmentName": "Amy测试部门",
		"operatorCode": "",
		"operatorId": "40828938811230208",
		"operatorName": "苏红敏",
		"vouchdate": "2022-04-10 00:00:00",
		"workCenterId": 2729804253844225,
		"workCenterCode": "111",
		"workCenterName": "西柚test工作中心\"",
		"orderId": 2724762405524224,
		"orderCode": "CCCC220520024028",
		"masterOrgKeyField": "orgId",
		"orderProductId": 2724762405524225,
		"orderProductIdLineNo": 10,
		"materialName": "台式机",
		"materialId": 2037661323661568,
		"productCode": "1035000012",
		"productId": 2037661108424960,
		"skuId": 2037661108424961,
		"quantity": 14,
		"productQuantity": 19,
		"mainUnitId": 2008299568156928,
		"mainUnitIdName": "台",
		"mainUnitIdPrecision": 3,
		"direction": 0,
		"reportMethod": "0",
		"memo": "remark",
		"createDate": "2022-04-10 00:00:00",
		"modifyDate": "2022-04-11 00:00:00",
		"auditDate": "2022-04-18 00:00:00",
		"isWfControlled": false,
		"verifystate": 0,
		"returncount": 0,
		"barCode": "po_activity_report|2725586282730240",
		"isFlowCoreBill": false,
		"creatorId": 2035345314517248,
		"creator": "17600591290",
		"createTime": "2022-04-10 10:09:44",
		"modifierId": 2035345314517248,
		"modifier": "17600591290",
		"modifyTime": "2022-04-11 21:42:33",
		"auditor": "17600591290",
		"auditorId": 2035345314517248,
		"auditTime": "2022-04-18 17:36:41",
		"transTypeKeyField": "transTypeId",
		"postAccountStatus": 99,
		"postAccountVersion": 0,
		"printCount": 5,
		"writeOffEnable": 0,
		"activityReportUserdefItem": {
			"id": 2725586282730241,
			"define1": "define1"
		},
		"writeOffStatus": 0,
		"activityReportExtItem": {
			"id": 2725586282730241,
			"define1": "define1"
		},
		"activityReportDetail": [
			{
				"lineno": 10,
				"pubts": "2022-04-17 14:51:59",
				"id": 2725586282730241,
				"activityReportId": 2725586282730240,
				"orderProcessId": 2724762405524227,
				"opSn": 10,
				"workCenterId": 2550552316875264,
				"workCenterName": "工作中心",
				"workCenterCode": "testCode",
				"workcenterDetailId": 2749880472229121,
				"workcenterDetailLineNo": 10,
				"operationCode": "alot_seq2",
				"operationName": "标准工序-淬火",
				"orderActivityId": 1458690293855420431,
				"orderActivityIdLineNum": "20",
				"usageBasis": "0",
				"activityId": 2570260312215808,
				"activityIdCode": "ZZCJ",
				"activityIdName": "资源类型1",
				"activityClass": 0,
				"activityType": 0,
				"planUsageQty": 0,
				"actualUsageQty": 1,
				"usageUnit": 1998025388839168,
				"usageUnitName": "箱",
				"usageUnitPrecision": 5,
				"source": "po_production_order",
				"sourceid": 2734456567780096,
				"upcode": "WGBG20220418000001",
				"sourceautoid": 2734456567763712,
				"sourceLinenum": "20",
				"sourceGrandchildId": 2734456567780100,
				"makeRuleCode": "productionOrderToActivityReport",
				"rowno": 10,
				"costCenterId": 25526989433464987,
				"costCenterCode": "CB0022158",
				"costCenterName": "成本中心名称",
				"supplyVirtualAccbodyId": 23405828907,
				"supplyVirtualAccbodyCode": "LR3980847",
				"supplyVirtualAccbodyName": "利润中心名称",
				"activityReportDetailUserdefItem": {
					"id": 25526989433464987,
					"define1": "define1"
				},
				"activityReportDetailExtItem": {
					"id": 25526989433464987,
					"define1": "define1"
				},
				"writeOffUpcode": "",
				"writeOffSourceid": "",
				"writeOffSourceautoid": "",
				"writeOffUplineno": ""
			}
		],
		"writeOffUpcode": "",
		"writeOffSourceid": "",
		"writeOffReason": "",
		"fiEventAccountingDate": "2025-06-18"
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
999	不同的错误类型返回不同的错误信息	

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

