---
title: "问题整改单详情查询"
apiId: "1580649678532247561"
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

# 问题整改单详情查询

>  请求方式	POST | Problem Remediation (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/synergy/rectificationDetail
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
id	long	否	否	问题整改单id 示例：2958514546348288
code	string	否	否	问题整改单编号 示例：PRCA202210130001

## 3. 请求示例

Url: /yonbip/cpu/synergy/rectificationDetail?access_token=访问令牌
Body: {
	"id": 2958514546348288,
	"code": "PRCA202210130001"
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
message	string	否	返回状态 示例：操作成功
data	object	否	业务数据
erpId	string	否	外部系统单据的id 示例：2985061875060992
id	long	否	问题整改单主键id 示例：2985061875060992
code	string	否	单据编码 示例：RD202211010003
vouchdate	DateTime	否	单据日期 示例：2022-11-04 00:00:00
rectificationTitle	string	否	整改标题 示例：问题整改标题
status	int	否	状态（开立：0,已审核：1,审核中：3） 示例：1
synergyStatus	string	否	协同状态（待发布：10，待受理：11，待ICA反馈：12，ICA驳回：13，已提交：14，待PCA反馈：15，PCA驳回：16，PCA已提交：17，完成报告：18，已执行：19，验证不通过：20，问题关闭：21） 示例：10
transType_name	string	否	交易类型名称 示例：普通交易
transType	string	否	交易类型ID 示例：1563311599920873477
purEnterpriseName	string	否	采购商 示例：0427日常mdd融合
purchaseOrg_name	string	否	采购组织名称 示例：采购组织名称
purchaseOrg	string	否	采购组织ID 示例：1450503124116570113
purchaser_name	string	否	采购员名称 示例：采购员名称
purchaser	string	否	采购员ID 示例：1457388515050389511
purchaser_mobile	string	否	采购员联系电话 示例：13366666666
supplier_name	string	否	供应商名称 示例：供应商名称
supplier	long	否	供应商ID 示例：1572532817287970822
supplierContact_contactname	string	否	供方联系人名称 示例：供方联系人名称
supplierContact	long	否	供方联系人ID 示例：1580689355343134727
supplierContact_contactmobile	string	否	供方联系电话 示例：18989999223
remark	string	否	备注 示例：备注
creator	string	否	创建人 示例：创建人
createTime	DateTime	否	创建时间 示例：创建时间
qmpuProblemRectificationAttrextItem	object	否	表头自定义项（define1-define60）
isClaim	boolean	否	是否生成索赔扣款单 示例：1
icaRequestTime	DateTime	否	ICA要求时间 示例：2022-10-09 14:16:18
pcaRequestTime	DateTime	否	PCA要求时间 示例：2022-10-09 14:16:18
completionRequestTime	DateTime	否	整改要求完成时间 示例：2022-10-09 14:16:18
icaFeedbackTime	DateTime	否	ICA反馈时间 示例：2022-10-09 14:16:18
pcaFeedbackTime	DateTime	否	PCA反馈时间 示例：2022-10-09 14:16:18
completionTime	DateTime	否	整改完成时间 示例：2022-10-09 14:16:18
associationList	object	是	表体信息-关联信息
materialList	object	是	表体信息-物料信息
problemType_name	string	否	问题类型名称 示例：普通问题
problemType	long	否	问题类型ID 示例：1557554101790179328
problemType_code	string	否	问题类型编码 示例：001
defectType_name	string	否	缺陷类型名称 示例：缺陷类型名称
defectType	long	否	缺陷类型ID 示例：1557554634366124033
defectType_code	string	否	缺陷类型编码 示例：00101
emergencyLevel	string	否	紧急程度（非常紧急：1，紧急：2，一般：3） 示例：2
importanceDegree	string	否	重视程度（极高：1，高：2，一般：3） 示例：1
problemTime	DateTime	否	问题发生时间 示例：2022-11-04 14:16:18
problemFinder	string	否	问题发现人员 示例：张三
problemLocationOccur	string	否	问题发生地点 示例：北京中关村
problemBriefDescription	string	否	问题简述 示例：此单据很重要
problemDescription	string	否	问题描述 示例：此单据很重要
identifyCause	string	否	识别原因 示例：填写原因
memberList	object	是	表体信息-小组成员
measureTemporaryList	object	是	表体信息-临时措施
rootCauseList	object	是	表体信息-根本原因
measurePermanentList	object	是	表体信息-永久措施
icaSuggestion	string	否	ICA意见 示例：ICA意见
icaAttachment	string	否	ICA附件 示例：0aaa6ab0-4844-11ed-ab99-1de2123e5770
icaConfirmor	string	否	确认人 示例：张三
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
pcaSuggestion	string	否	PCA意见 示例：PCA意见
pcaAttachment	string	否	PCA附件 示例：0aaa6ab0-4844-11ed-ab99-1de2123e5770
pcaConfirmor	string	否	确认人 示例：张三
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
executeVerificationList	object	是	表体信息-执行措施
measurePreventionList	object	是	表体信息-预防措施
problemSummary	string	否	总结陈词 示例：问题总结
validationResult	string	否	验证结果（验证不通过：0，验证通过：1） 示例：1
validationResultDescription	string	否	验证结果描述 示例：验证结果描述
validator	string	否	验证人 示例：张三
validateTime	DateTime	否	验证时间 示例：2022-09-26 00:00:00

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"erpId": "2985061875060992",
		"id": 2985061875060992,
		"code": "RD202211010003",
		"vouchdate": "2022-11-04 00:00:00",
		"rectificationTitle": "问题整改标题",
		"status": 1,
		"synergyStatus": "10",
		"transType_name": "普通交易",
		"transType": "1563311599920873477",
		"purEnterpriseName": "0427日常mdd融合",
		"purchaseOrg_name": "采购组织名称",
		"purchaseOrg": "1450503124116570113",
		"purchaser_name": "采购员名称",
		"purchaser": "1457388515050389511",
		"purchaser_mobile": "13366666666",
		"supplier_name": "供应商名称",
		"supplier": 1572532817287970822,
		"supplierContact_contactname": "供方联系人名称",
		"supplierContact": 1580689355343134727,
		"supplierContact_contactmobile": "18989999223",
		"remark": "备注",
		"creator": "创建人",
		"createTime": "创建时间",
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
		"isClaim": "",
		"icaRequestTime": "2022-10-09 14:16:18",
		"pcaRequestTime": "2022-10-09 14:16:18",
		"completionRequestTime": "2022-10-09 14:16:18",
		"icaFeedbackTime": "2022-10-09 14:16:18",
		"pcaFeedbackTime": "2022-10-09 14:16:18",
		"completionTime": "2022-10-09 14:16:18",
		"associationList": [
			{
				"associationBillType": "1",
				"associationBillTitle": "关联单据标题",
				"associationBillNo": "No20221104",
				"associationBillDate": "2022-11-04"
			}
		],
		"materialList": [
			{
				"sourceBillType": "来源单据类型内容",
				"sourceBillNo": "LLJY202209072007",
				"sourceBillDate": "2022-11-01 19:44:39",
				"material": 1455938113192853510,
				"material_name": "1455938113192853510",
				"material_code": "000023",
				"involvedNumber": 20,
				"unit": 1455938113192853511,
				"unit_name": "钢铁",
				"unit_code": "TNE"
			}
		],
		"problemType_name": "普通问题",
		"problemType": 1557554101790179328,
		"problemType_code": "001",
		"defectType_name": "缺陷类型名称",
		"defectType": 1557554634366124033,
		"defectType_code": "00101",
		"emergencyLevel": "2",
		"importanceDegree": "1",
		"problemTime": "2022-11-04 14:16:18",
		"problemFinder": "张三",
		"problemLocationOccur": "北京中关村",
		"problemBriefDescription": "此单据很重要",
		"problemDescription": "此单据很重要",
		"identifyCause": "填写原因",
		"memberList": [
			{
				"representative": "1",
				"participateProcess": "质检协同",
				"name": "李四",
				"isLeader": NaN,
				"contact": "15188888888",
				"mail": "xxx@163.com",
				"duty": "小组成员的职责",
				"remark": "填写备注内容"
			}
		],
		"measureTemporaryList": [
			{
				"measureDetail": "措施详述",
				"responsible": "张三",
				"completeTime": "2022-09-26 00:00:00",
				"temporaryMeasureAttachment": "0aaa6ab0-4844-11ed-ab99-1de2123e5770"
			}
		],
		"rootCauseList": [
			{
				"causeType": 1564135254392307713,
				"causeType_reason": "质量不合格",
				"occurCause": "发生原因",
				"outflowCause": "流出原因",
				"unpreventedCause": "未预防原因",
				"rootCauseAttachment": "0aaa6ab0-4844-11ed-ab99-1de2123e5770"
			}
		],
		"measurePermanentList": [
			{
				"measureDetail": "措施描述",
				"responsible": "张三",
				"completeTime": "2022-09-26 00:00:00",
				"permanentMeasureAttachment": "0aaa6ab0-4844-11ed-ab99-1de2123e5770"
			}
		],
		"icaSuggestion": "ICA意见",
		"icaAttachment": "0aaa6ab0-4844-11ed-ab99-1de2123e5770",
		"icaConfirmor": "张三",
		"icaConfirmTime": "2022-09-26 00:00:00",
		"pcaSuggestion": "PCA意见",
		"pcaAttachment": "0aaa6ab0-4844-11ed-ab99-1de2123e5770",
		"pcaConfirmor": "张三",
		"executeVerificationList": [
			{
				"measureDetail": "措施描述",
				"validator": "张三",
				"validateTime": "2022-09-26 00:00:00",
				"validateAttachment": "0aaa6ab0-4844-11ed-ab99-1de2123e5770"
			}
		],
		"measurePreventionList": [
			{
				"measureDetail": "措施描述",
				"responsible": "张三",
				"completionTime": "2022-09-26 00:00:00",
				"preventionMeasureAttachment": "0aaa6ab0-4844-11ed-ab99-1de2123e5770"
			}
		],
		"problemSummary": "问题总结",
		"validationResult": "1",
		"validationResultDescription": "验证结果描述",
		"validator": "张三",
		"validateTime": "2022-09-26 00:00:00"
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
999	服务端逻辑异常	找对应的开发人员

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

