---
title: "问题整改单保存"
apiId: "1581241542194495490"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Problem Remediation"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Problem Remediation]
platform_version: "BIP"
source_type: community-api-docs
---

# 问题整改单保存

>  请求方式	POST | Problem Remediation (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/synergy/rectificationSave
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
data	object	否	是	业务数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	long	否	否	问题整改主键id（_status=Update时必填） 示例：2985061875060992
code	string	否	否	单据编码（以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输，最大长度50） 示例：RD202211010003
status	number
小数位数:0,最大长度:2	否	否	状态(0：开立，1：已审批。非必输，只能填开立或已审批，默认已审批) 示例：1 默认值：1
rectificationTitle	string	否	是	整改标题（最大长度50） 示例：问题整改标题
createType	long	否	否	创建方式（1：云采自建，2：ERP上传） 示例：2 默认值：2
erpId	string	否	是	外部系统单据的id 示例：ERP20222209
vouchdate	DateTime	否	是	单据日期 示例：2022-11-04 00:00:00
transType	string	否	否	交易类型ID（交易类型ID和交易类型编码不能同时为空） 示例：1563311599920873477
transType_code	string	否	否	交易类型编码（交易类型ID和交易类型编码不能同时为空） 示例：0002
purEnterpriseName	string	否	是	采购商（最大长度50） 示例：0427日常mdd融合
purchaseOrg	string	否	否	采购组织ID（采购组织ID和采购组织编码不能同时为空） 示例：1450503124116570113
purchaseOrg_code	string	否	否	采购组织编码（采购组织ID和采购组织编码不能同时为空） 示例：org01
purchaser	string	否	否	采购员ID（采购员ID和采购员编码不能同时为空） 示例：1457388515050389511
purchaser_code	string	否	否	采购员编码（采购员ID和采购员编码不能同时为空） 示例：00000012
bsynergy	number
小数位数:0,最大长度:1	否	否	是否需要与供应商协同（0：问题整改单不与供应商进行协同； 1：问题整改单需要与供应商进行协同。 默认取供应商档案的“是否协同”字段的值） 示例：1
supplier	long	否	否	供应商ID（供应商ID和供应商编码不能同时为空） 示例：1572532817287970822
supplier_code	string	否	否	供应商编码（供应商ID和供应商编码不能同时为空） 示例：0000000099
supplierContact	long	否	否	供方联系人ID 示例：1580689355343134727
qmpuProblemRectificationAttrextItem	object	否	否	表头自定义项（define1-define60）
remark	string	否	否	备注（最大长度256） 示例：随便填
icaRequestTime	DateTime	否	否	ICA要求时间 示例：2022-10-09 14:16:18
pcaRequestTime	DateTime	否	否	PCA要求时间 示例：2022-10-09 14:16:18
completionRequestTime	DateTime	否	否	整改要求完成时间 示例：2022-10-09 14:16:18
associationList	object	是	否	表体信息-关联信息
materialList	object	是	否	表体信息-物料信息
problemType	long	否	否	问题类型ID（问题类型ID和问题类型编码不能同时为空；来源档案：采购业务档案-缺陷类型，第一级） 示例：1557554101790179328
problemType_code	string	否	否	问题类型编码（问题类型ID和问题类型编码不能同时为空；来源档案：采购业务档案-缺陷类型，第一级） 示例：001
defectType	long	否	否	缺陷类型ID（缺陷类型ID和缺陷类型编码不能同时为空；采购业务档案-缺陷类型，问题类型的下级） 示例：1557554634366124033
defectType_code	string	否	否	缺陷类型编码（缺陷类型ID和缺陷类型编码不能同时为空；采购业务档案-缺陷类型，问题类型的下级） 示例：00101
emergencyLevel	long	否	否	紧急程度（非常紧急：1，紧急：2，一般：3） 示例：2
importanceDegree	long	否	否	重视程度（极高：1，高：2，一般：3） 示例：1
problemTime	DateTime	否	否	问题发生时间 示例：2022-11-04 14:16:18
problemFinder	string	否	否	问题发现人员（最大长度20） 示例：张三
problemLocationOccur	string	否	否	问题发生地点（最大长度50） 示例：北京中关村
problemBriefDescription	string	否	否	问题简述（最大长度200） 示例：此单据很重要
problemDescription	string	否	是	问题描述 示例：此单据很重要
identifyCause	string	否	否	识别原因（最大长度100） 示例：填写原因
memberList	object	是	否	表体信息-小组成员
_status	string	否	是	该条数据状态（新增：Insert，修改：Update） 示例：Insert

## 3. 请求示例

Url: /yonbip/cpu/synergy/rectificationSave?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2985061875060992,
		"code": "RD202211010003",
		"status": 1,
		"rectificationTitle": "问题整改标题",
		"createType": 2,
		"erpId": "ERP20222209",
		"vouchdate": "2022-11-04 00:00:00",
		"transType": "1563311599920873477",
		"transType_code": "0002",
		"purEnterpriseName": "0427日常mdd融合",
		"purchaseOrg": "1450503124116570113",
		"purchaseOrg_code": "org01",
		"purchaser": "1457388515050389511",
		"purchaser_code": "00000012",
		"bsynergy": 1,
		"supplier": 1572532817287970822,
		"supplier_code": "0000000099",
		"supplierContact": 1580689355343134727,
		"qmpuProblemRectificationAttrextItem": {
			"define1": "",
			"define2": "",
			"define3": "",
			"define4": "",
			"define5": "",
			"define6": "",
			"define7": "",
			"define8": "",
			"define9": "",
			"define10": "",
			"define11": "",
			"define12": "",
			"define13": "",
			"define14": "",
			"define15": "",
			"define16": "",
			"define17": "",
			"define18": "",
			"define19": "",
			"define20": "",
			"define21": "",
			"define22": "",
			"define23": "",
			"define24": "",
			"define25": "",
			"define26": "",
			"define27": "",
			"define28": "",
			"define29": "",
			"define30": "",
			"define31": "",
			"define32": "",
			"define33": "",
			"define34": "",
			"define35": "",
			"define36": "",
			"define37": "",
			"define38": "",
			"define39": "",
			"define40": "",
			"define41": "",
			"define42": "",
			"define43": "",
			"define44": "",
			"define45": "",
			"define46": "",
			"define47": "",
			"define48": "",
			"define49": "",
			"define50": "",
			"define51": "",
			"define52": "",
			"define53": "",
			"define54": "",
			"define55": "",
			"define56": "",
			"define57": "",
			"define58": "",
			"define59": "",
			"define60": ""
		},
		"remark": "随便填",
		"icaRequestTime": "2022-10-09 14:16:18",
		"pcaRequestTime": "2022-10-09 14:16:18",
		"completionRequestTime": "2022-10-09 14:16:18",
		"associationList": [
			{
				"associationBillType": "1",
				"associationBillNo": "No20221104",
				"associationBillTitle": "关联单据标题",
				"associationBillDate": "2022-11-04"
			}
		],
		"materialList": [
			{
				"material": "1455938113192853510",
				"material_code": "000023",
				"involvedNumber": 20,
				"unit": "1455938113192853511",
				"unit_code": "TNE"
			}
		],
		"problemType": 1557554101790179328,
		"problemType_code": "001",
		"defectType": 1557554634366124033,
		"defectType_code": "00101",
		"emergencyLevel": 2,
		"importanceDegree": 1,
		"problemTime": "2022-11-04 14:16:18",
		"problemFinder": "张三",
		"problemLocationOccur": "北京中关村",
		"problemBriefDescription": "此单据很重要",
		"problemDescription": "此单据很重要",
		"identifyCause": "填写原因",
		"memberList": [
			{
				"representative": 1,
				"participateProcess": NaN,
				"name": "李四",
				"isLeader": true,
				"contact": "15188888888",
				"mail": "xxx@163.com",
				"duty": "小组成员的职责",
				"remark": "填写备注内容",
				"problemSummary": "总结问题"
			}
		],
		"_status": "Insert"
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
code	string	否	状态码 示例：200
message	string	否	状态返回值 示例：操作成功
data	object	否	业务数据
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
id	long	否	问题整改主键id 示例：2985061875060992
code	string	否	单据编码 示例：RD202211010003
rectificationTitle	string	否	整改标题 示例：问题整改标题
status	number
小数位数:0,最大长度:2	否	示例: 状态（0：开立，1：已审批） 示例：1
createType	long	否	创建方式（1：云采自建，2：ERP上传） 示例：2 默认值：2
erpId	string	否	外部系统单据的id 示例：ERP20222209
vouchdate	DateTime	否	单据日期 示例：2022-11-04 00:00:00
transType	string	否	交易类型ID（交易类型ID和交易类型编码不能同时为空） 示例：1563311599920873477
transType_code	string	否	交易类型编码（交易类型ID和交易类型编码不能同时为空） 示例：0002
purEnterpriseName	string	否	采购商 示例：0427日常mdd融合
purchaseOrg	string	否	采购组织ID（采购组织ID和采购组织编码不能同时为空） 示例：1450503124116570113
purchaseOrg_code	string	否	采购组织编码（采购组织ID和采购组织编码不能同时为空） 示例：org01
purchaser	string	否	采购员ID（采购员ID和采购员编码不能同时为空） 示例：1457388515050389511
purchaser_code	string	否	采购员编码（采购员ID和采购员编码不能同时为空） 示例：00000012
supplier	long	否	供应商ID（供应商ID和供应商编码不能同时为空） 示例：1572532817287970822
supplier_code	string	否	供应商编码（供应商ID和供应商编码不能同时为空） 示例：0000000099
supplierContact	long	否	供方联系人ID 示例：1580689355343134727
qmpuProblemRectificationAttrextItem	object	否	表头自定义项（define1-define60）
remark	string	否	备注 示例：随便填
icaRequestTime	DateTime	否	ICA要求时间 示例：2022-10-09 14:16:18
pcaRequestTime	DateTime	否	PCA要求时间 示例：2022-10-09 14:16:18
completionRequestTime	DateTime	否	整改要求完成时间 示例：2022-10-09 14:16:18
associationList	object	是	表体信息-关联信息
materialList	object	是	表体信息-物料信息
problemType	long	否	问题类型ID（问题类型ID和问题类型编码不能同时为空） 示例：1557554101790179328
problemType_code	string	否	问题类型编码（问题类型ID和问题类型编码不能同时为空） 示例：001
defectType	long	否	缺陷类型ID（缺陷类型ID和缺陷类型编码不能同时为空） 示例：1557554634366124033
defectType_code	string	否	缺陷类型编码（缺陷类型ID和缺陷类型编码不能同时为空） 示例：00101
emergencyLevel	long	否	紧急程度（非常紧急：1，紧急：2，一般：3） 示例：2
importanceDegree	long	否	重视程度（极高：1，高：2，一般：3） 示例：1
problemTime	DateTime	否	问题发生时间 示例：2022-11-04 14:16:18
problemFinder	string	否	问题发现人员 示例：张三
problemLocationOccur	string	否	问题发生地点 示例：北京中关村
problemBriefDescription	string	否	问题简述 示例：此单据很重要
problemDescription	string	否	问题描述 示例：此单据很重要
identifyCause	string	否	识别原因 示例：填写原因
memberList	object	是	表体信息-小组成员

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2985061875060992,
		"code": "RD202211010003",
		"rectificationTitle": "问题整改标题",
		"status": 1,
		"createType": 2,
		"erpId": "ERP20222209",
		"vouchdate": "2022-11-04 00:00:00",
		"transType": "1563311599920873477",
		"transType_code": "0002",
		"purEnterpriseName": "0427日常mdd融合",
		"purchaseOrg": "1450503124116570113",
		"purchaseOrg_code": "org01",
		"purchaser": "1457388515050389511",
		"purchaser_code": "00000012",
		"supplier": 1572532817287970822,
		"supplier_code": "0000000099",
		"supplierContact": 1580689355343134727,
		"qmpuProblemRectificationAttrextItem": {
			"define1": "3047197506588928",
			"define2": "3047197506588928",
			"define3": "3047197506588928",
			"define4": "3047197506588928",
			"define5": "3047197506588928",
			"define6": "3047197506588928",
			"define7": "3047197506588928",
			"define8": "3047197506588928",
			"define9": "3047197506588928",
			"define10": "3047197506588928",
			"define11": "3047197506588928",
			"define12": "3047197506588928",
			"define13": "3047197506588928",
			"define14": "3047197506588928",
			"define15": "3047197506588928",
			"define16": "3047197506588928",
			"define17": "3047197506588928",
			"define18": "3047197506588928",
			"define19": "3047197506588928",
			"define20": "3047197506588928",
			"define21": "3047197506588928",
			"define22": "3047197506588928",
			"define23": "3047197506588928",
			"define24": "3047197506588928",
			"define25": "3047197506588928",
			"define26": "3047197506588928",
			"define27": "3047197506588928",
			"define28": "3047197506588928",
			"define29": "3047197506588928",
			"define30": "3047197506588928",
			"define31": "3047197506588928",
			"define32": "3047197506588928",
			"define33": "3047197506588928",
			"define34": "3047197506588928",
			"define35": "3047197506588928",
			"define36": "3047197506588928",
			"define37": "3047197506588928",
			"define38": "3047197506588928",
			"define39": "3047197506588928",
			"define40": "3047197506588928",
			"define41": "3047197506588928",
			"define42": "3047197506588928",
			"define43": "3047197506588928",
			"define44": "3047197506588928",
			"define45": "3047197506588928",
			"define46": "3047197506588928",
			"define47": "3047197506588928",
			"define48": "3047197506588928",
			"define49": "3047197506588928",
			"define50": "3047197506588928",
			"define51": "3047197506588928",
			"define52": "3047197506588928",
			"define53": "3047197506588928",
			"define54": "3047197506588928",
			"define55": "3047197506588928",
			"define56": "3047197506588928",
			"define57": "3047197506588928",
			"define58": "3047197506588928",
			"define59": "3047197506588928",
			"define60": "3047197506588928"
		},
		"remark": "随便填",
		"icaRequestTime": "2022-10-09 14:16:18",
		"pcaRequestTime": "2022-10-09 14:16:18",
		"completionRequestTime": "2022-10-09 14:16:18",
		"associationList": [
			{
				"associationBillType": "1",
				"associationBillNo": "No20221104",
				"associationBillTitle": "关联单据标题",
				"associationBillDate": "2022-11-04"
			}
		],
		"materialList": [
			{
				"material": 1455938113192853510,
				"material_code": "000023",
				"involvedNumber": 20,
				"unit": 1455938113192853511,
				"unit_code": "TNE"
			}
		],
		"problemType": 1557554101790179328,
		"problemType_code": "001",
		"defectType": 1557554634366124033,
		"defectType_code": "00101",
		"emergencyLevel": 2,
		"importanceDegree": 1,
		"problemTime": "2022-11-04 14:16:18",
		"problemFinder": "张三",
		"problemLocationOccur": "北京中关村",
		"problemBriefDescription": "此单据很重要",
		"problemDescription": "此单据很重要",
		"identifyCause": "填写原因",
		"memberList": [
			{
				"representative": 1,
				"participateProcess": NaN,
				"name": "李四",
				"isLeader": true,
				"contact": "15188888888",
				"mail": "xxx@163.com",
				"duty": "小组成员的职责",
				"remark": "填写备注内容",
				"problemSummary": "总结问题"
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
999	系统异常，请联系管理员查看后台日志	联系开发人员排查

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

