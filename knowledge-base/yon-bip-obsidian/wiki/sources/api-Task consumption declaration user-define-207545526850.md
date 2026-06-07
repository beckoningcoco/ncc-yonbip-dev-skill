---
title: "作业耗用申报保存"
apiId: "2075455268503683072"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Resource consumption declaration"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Resource consumption declaration]
platform_version: "BIP"
source_type: community-api-docs
---

# 作业耗用申报保存

>  请求方式	POST | Resource consumption declaration (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/activityreport/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	否	id，编辑时为必输字段
orgId	string	否	否	工厂id，工厂id和工厂编码不能同时为空，id和编码同时存在，以id为准。当申报方式（reportMethod）为临时申报、工作中心申报时工厂组织信息为空无法保存。其他申报方式会根据生成所需的数据自动填充组织信息，此时如果传入组织信息，会被自动忽略。 示例：2039264214421760
orgCode	string	否	否	工厂编码，可以提供工厂id或code,多组织下不能为空。当申报方式（reportMethod）为临时申报、工作中心申报时工厂组织信息为空无法保存。其他申报方式会根据生成所需的数据自动填充组织信息，此时如果传入组织信息，会被自动忽略。 示例：0701
transTypeId	string	否	是	交易类型id，可以提供交易类型的id或code，交易类型不可为空 示例：1420990582716628992
code	string	否	否	单据编号，设置手工编号时必输，自动编号时输入无效 示例：RCR2022041200002
productionDepartmentId	string	否	否	生产部门id，可以提供生产部门的id或code。工作中心申报、临时申报时必填 示例：2659083286122752
operatorId	string	否	否	汇报人，支持ID或编码，非必输，如果进行输入，会校验输入是否正确和是否可用 示例：19910216364
workCenterId	string	否	否	工作中心，支持ID或编码，当申报方式为工作中心申报时（reportMethod = "1"），为必输字段。其他申报方式会自动置空，忽略输入值。 示例：2325505713575680
orderCode	string	否	否	生产订单，支持编码或ID，当申报方式为临时申报（reportMethod = "0"）、参照生产订单新增（reportMethod = "2"）、红冲（reportMethod = "3"）时，接口会自动校验订单信息是否合法，字段必输。申报方式为工作中心申报时（reportMethod = "1"），此字段会被置空，输入会被忽略。 示例：2046494423617792
orderProductId	string	否	否	生产订单行，支持ID或行号，当申报方式为临时申报（reportMethod = "0"）、参照生产订单新增（reportMethod = "2"）、红冲（reportMethod = "3"）时，接口会自动校验订单行信息是否合法，字段必输。申报方式为工作中心申报时（reportMethod = "1"），此字段会被置空，输入会被忽略。 示例：2222
quantity	BigDecimal	否	否	数量，新建时参照生产订单汇报及临时汇报时，默认=订单数量，可改 工作中心汇报=Null 示例：4
vouchdate	Date	否	否	汇报日期 示例：2022-08-03
memo	string	否	否	备注，长度超过512位只保存前512位 示例：i am remark
reportMethod	string	否	否	申报方式，临时申报："0"，工作中心申报："1"，参照生产订单汇报："2"，资源申报红冲："3"。申报方式为判定保存场景优先级最高的参数。更新场景此入参无效。 示例："1"
activityReportUserdefItem	object	否	否	固定自定义项（1-60）
activityReportExtItem	object	否	否	自由自定义项（1-60）
_status	string	否	是	操作类型（Insert,Update） 示例：Insert
activityReportDetail	object	是	否	资源耗用申报明细

## 3. 请求示例

Url: /yonbip/mfg/activityreport/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 0,
		"orgId": "2039264214421760",
		"orgCode": "0701",
		"transTypeId": "1420990582716628992",
		"code": "RCR2022041200002",
		"productionDepartmentId": "2659083286122752",
		"operatorId": "19910216364",
		"workCenterId": "2325505713575680",
		"orderCode": "2046494423617792",
		"orderProductId": "2222",
		"quantity": 4,
		"vouchdate": "2022-08-03",
		"memo": "i am remark",
		"reportMethod": "\"1\"",
		"activityReportUserdefItem": {
			"id": 1420990582716628992,
			"define1": "资源耗用申报固定自定义项1"
		},
		"activityReportExtItem": {
			"id": 1420990582716628992,
			"define1": "资源耗用申报自由自定义项1"
		},
		"_status": "Insert",
		"activityReportDetail": [
			{
				"id": 0,
				"opSn": 1,
				"orderActivityId": 2723032095085833,
				"activityId": "2650754759315968",
				"workCenterId": "",
				"actualUsageQty": 20,
				"activityType": 0,
				"departmentId": "",
				"activityReportDetailUserdefItem": {
					"id": 2650754759315968,
					"define1": "资源耗用申报详情固定自定义项1"
				},
				"activityReportDetailExtItem": {
					"id": 2650754759315968,
					"define1": "资源耗用申报详情自由自定义项1"
				},
				"_status": "Insert"
			}
		]
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
pubts	string	否	时间戳 示例：2022-04-11 21:42:33
id	long	否	id 示例：2725586282730240
orgId	string	否	组织ID 示例：2036615013323008
orgCode	string	否	组织编码
orgName	string	否	组织名称 示例：Amy测试
transTypeId	string	否	交易类型ID 示例：1420990582716628992
transTypeName	string	否	交易类型名称 示例：资源耗用申报
transTypeCode	string	否	交易类型编码 示例：RCR01
activityReportType	long	否	汇报类型，"0"，工作中心申报："1"，参照生产订单汇报："2"，资源申报红冲："3"，其他推单："4" 示例：0
code	string	否	编码 示例：RCR2022041000001
status	long	否	单据状态，0：开立；1：已审核；3：审核中 示例：0
productionDepartmentId	string	否	部门 示例："2558519233794304"
departmentName	string	否	部门名称
operatorCode	string	否	报告人
operatorId	string	否	报告人ID 示例：40828938811230208
operatorIdName	string	否	报告人名称 示例：苏红敏
vouchdate	string	否	单据日期 示例：2022-04-10 00:00:00
workCenterId	long	否	工作中心id 示例：2729804253844225
workCenterCode	string	否	工作中心编码
workCenterName	string	否	工作中心名称
orderId	long	否	生产订单ID 示例：2724762405524224
orderCode	string	否	订单编码
orderProductId	long	否	产品订单行ID 示例：2724762405524225
orderProductIdLineNo	BigDecimal	否	生产订单行号 示例：10
materialName	string	否	物料名称 示例：台式机
materialId	long	否	制造物料 示例：2037661323661568
productCode	string	否	物料编码
productId	long	否	物料ID 示例：2037661108424960
skuId	long	否	skuId 示例：2037661108424961
quantity	BigDecimal	否	数量 示例：14
productQuantity	BigDecimal	否	生产数量 示例：19
mainUnitId	long	否	主计量单位 示例：2008299568156928
mainUnitIdName	string	否	主计量单位名称 示例：台
mainUnitIdPrecision	long	否	主计量单位精度 示例：3
reportMethod	string	否	申报方式，临时申报："0"，工作中心申报："1"，参照生产订单汇报："2"，资源申报红冲："3"，其他推单："4"。 示例：0
memo	string	否	备注
createDate	string	否	创建日期 示例：2022-04-10 00:00:00
modifyDate	string	否	修改日期 示例：2022-04-11 00:00:00
auditDate	string	否	审核日期 示例：2022-04-18 00:00:00
isWfControlled	boolean	否	是否审批流控制 true:是，false：否 示例：false
verifystate	int	否	审批状态 示例：0
returncount	int	否	退回次数 示例：0
barCode	string	否	条形码 示例：po_activity_report|2725586282730240
creatorId	long	否	创建人ID 示例：2035345314517248
creator	string	否	创建人名称 示例：17600591290
createTime	string	否	创建时间 示例：2022-04-10 10:09:44
modifierId	long	否	修改人ID 示例：2035345314517248
modifier	string	否	修改人名称 示例：17600591290
modifyTime	string	否	修改时间 示例：2022-04-11 21:42:33
activityReportUserdefItem	object	否	固定自定义项(1-60)
writeOffEnable	number
小数位数:0,最大长度:1	否	启用冲销，0：否，1：是 示例：0
activityReportExtItem	object	否	自由自定义项(1-60)
activityReportDetail	object	是	资源耗用申报明细
writeOffSourceid	string	否	冲销线索主表id
writeOffStatus	string	否	冲销状态。0：未冲销，1：已冲销，，2：冲销单
writeOffReason	string	否	冲销原因
writeOffUpcode	string	否	冲销单据号
fiEventAccountingDate	string	否	会计事务记账日期 示例：2025-06-18

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pubts": "2022-04-11 21:42:33",
		"id": 2725586282730240,
		"orgId": "2036615013323008",
		"orgCode": "",
		"orgName": "Amy测试",
		"transTypeId": "1420990582716628992",
		"transTypeName": "资源耗用申报",
		"transTypeCode": "RCR01",
		"activityReportType": 0,
		"code": "RCR2022041000001",
		"status": 0,
		"productionDepartmentId": "\"2558519233794304\"",
		"departmentName": "",
		"operatorCode": "",
		"operatorId": "40828938811230208",
		"operatorIdName": "苏红敏",
		"vouchdate": "2022-04-10 00:00:00",
		"workCenterId": 2729804253844225,
		"workCenterCode": "",
		"workCenterName": "",
		"orderId": 2724762405524224,
		"orderCode": "",
		"orderProductId": 2724762405524225,
		"orderProductIdLineNo": 10,
		"materialName": "台式机",
		"materialId": 2037661323661568,
		"productCode": "",
		"productId": 2037661108424960,
		"skuId": 2037661108424961,
		"quantity": 14,
		"productQuantity": 19,
		"mainUnitId": 2008299568156928,
		"mainUnitIdName": "台",
		"mainUnitIdPrecision": 3,
		"reportMethod": "0",
		"memo": "",
		"createDate": "2022-04-10 00:00:00",
		"modifyDate": "2022-04-11 00:00:00",
		"auditDate": "2022-04-18 00:00:00",
		"isWfControlled": false,
		"verifystate": 0,
		"returncount": 0,
		"barCode": "po_activity_report|2725586282730240",
		"creatorId": 2035345314517248,
		"creator": "17600591290",
		"createTime": "2022-04-10 10:09:44",
		"modifierId": 2035345314517248,
		"modifier": "17600591290",
		"modifyTime": "2022-04-11 21:42:33",
		"activityReportUserdefItem": {
			"id": 2725586282730241,
			"define1": "固定自定义项1"
		},
		"writeOffEnable": 0,
		"activityReportExtItem": {
			"id": 2725586282730241,
			"define1": "自由自定义项1"
		},
		"activityReportDetail": [
			{
				"lineno": "10",
				"pubts": "2022-04-17 14:51:59",
				"id": 2725586282730241,
				"activityReportId": 2725586282730240,
				"orderProcessId": 2724762405524227,
				"opSn": 10,
				"workCenterId": 0,
				"workCenterName": "",
				"workCenterCode": "",
				"workcenterdetailId": 0,
				"operationCode": "",
				"operationName": "",
				"orderActivityId": "",
				"orderActivityIdLineNum": "",
				"usageBasis": "",
				"activityId": 2570260312215808,
				"activityIdCode": "",
				"activityIdName": "资源类型1",
				"activityClass": 0,
				"activityType": 0,
				"actualUsageQty": 1,
				"costCenterId": 44499807074,
				"costCenterCode": "CB3909238",
				"costCenterName": "成本中心名称",
				"supplyVirtualAccbodyId": 88907097663,
				"supplyVirtualAccbodyCode": "LR9977473",
				"supplyVirtualAccbodyName": "供方利润中心名称",
				"usageUnit": 1998025388839168,
				"source": "po_production_order",
				"sourceid": 2734456567780096,
				"upcode": "WGBG20220418000001",
				"sourceautoid": 2734456567763712,
				"sourceLinenum": "",
				"sourceGrandchildId": 2734456567780100,
				"makeRuleCode": "productionOrderToActivityReport",
				"departmentId": 10980374097624,
				"departmentCode": "BM09045334",
				"departmentName": "测试部门",
				"activityReportDetailUserdefItem": {
					"id": 2734456567780100,
					"define1": "固定自定义项1"
				},
				"activityReportDetailExtItem": {
					"id": 2734456567780100,
					"define1": "自由自定义项1"
				},
				"writeOffUpcode": "",
				"writeOffSourceid": "",
				"writeOffSourceautoid": "",
				"writeOffUplineno": ""
			}
		],
		"writeOffSourceid": "",
		"writeOffStatus": "",
		"writeOffReason": "",
		"writeOffUpcode": "",
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
999	不同错误类型返回不同的错误信息	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-09-02	
更新
请求说明
更新
请求参数 (9)
更新
返回参数 (11)
	2	2025-06-25	
新增
返回参数 (10)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

