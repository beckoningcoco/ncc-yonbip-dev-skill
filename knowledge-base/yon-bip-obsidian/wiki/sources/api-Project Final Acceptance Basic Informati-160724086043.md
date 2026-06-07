---
title: "项目终验基本信息变更"
apiId: "1607240860438626304"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Acceptance Document"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Acceptance Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目终验基本信息变更

>  请求方式	POST | Acceptance Document (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/yonbip-pm-project/projectAcceptance/updateProjectAcceptance
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	否	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
projectId	string	否	否	项目ID，项目ID和编码至少录入一项，项目ID和项目编码同时存在，以项目ID为准 示例：1510824531168591880
projectCode	string	否	否	项目编码 示例：00000003
accepter	string	否	否	验收人 示例：csm项目接收人
handoverPerson	string	否	否	交接人ID，交接人ID和编码至少录入一项，交接人ID和交接人编码同时存在，以交接人ID为准 示例：1486892595463323653
handoverPersonCode	string	否	否	交接人编码 示例：000000000000000000000034
opinion	string	否	否	验收意见 示例：变更项目终验信息
isSubmit	boolean	否	否	保存后是否提交 示例：false
acceptDate	Date	否	是	验收日期 示例：2022-12-13
defines	object	否	否	固定自定义项

## 3. 请求示例

Url: /yonbip/pm/yonbip-pm-project/projectAcceptance/updateProjectAcceptance?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"projectId": "1510824531168591880",
		"projectCode": "00000003",
		"accepter": "csm项目接收人",
		"handoverPerson": "1486892595463323653",
		"handoverPersonCode": "000000000000000000000034",
		"opinion": "变更项目终验信息",
		"isSubmit": false,
		"acceptDate": "2022-12-13",
		"defines": {
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
		}
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
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	long	否	请求响应编码 示例：200
message	string	否	请求响应描述 示例：操作成功
data	string	否	返回数据 示例：更新成功！

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": "更新成功！"
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
1032001990093	项目ID和项目编码不允许同时为空	检查入参项目ID和编码是否存在
1032001990092	交接人ID和编码不允许同时为空	检查入参接收人ID和编码是否存在
1032001990094	非开立态单据不允许修改	选择其他开立态单据进行变更
1032001990099	其他异常	联系接口开发人员
1032001990091	更新操作特征ID不能为空	输入特征ID
1032001990096	项目对应单据不存在	检查项目输入是否正确
1032001990088	特征ID与单据特征ID不匹配	检查特征ID是否正确

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

