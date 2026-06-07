---
title: "同步终止单据至台账"
apiId: "1414354ce0084ddea0e5d325710b9c1e"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contract Management [Offline Later]"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Management [Offline Later]]
platform_version: "BIP"
source_type: community-api-docs
---

# 同步终止单据至台账

>  请求方式	POST | Contract Management [Offline Later] (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/contract/terminate
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
data	object	否	是	合同终止卡片[hrcm.renewal.renewal]
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	是	oa系统中的单据ID，需保证唯一
staffId	string	否	是	员工id
name	string	否	否	员工姓名
staffCode	string	否	否	员工编号
orgid	string	否	是	所属公司id
orgName	string	否	否	所属公司
deptid	string	否	是	所属部门id
deptName	string	否	否	所属部门
newmajorcorpid	string	否	否	合同主体单位id
newmajorcorpname	string	否	否	合同主体单位
newcontractnum	string	否	是	合同编码
relievedate	string	否	是	终止日期(不能早于合同开始日期，不得晚于合同结束日期后一天)
newpresenter	string	否	否	终止解除提出方(1:用人单位;2:劳动者)
newunchreason	string	否	否	终止原因id
newunchreasonName	string	否	否	终止原因
newneconomy	int	否	否	经济补偿金
newbreachmoney	int	否	否	赔偿金
newmemo	string	否	否	备注
newcontractcode	string	否	否	终止合同证明编号
newsigndate	string	否	否	业务发生日期
newworkaddr	string	否	否	工作地点
newbegindate	string	否	否	当前合同开始日期
newenddate	string	否	否	当前合同结束日期
extension	string	否	否	扩展字段(json格式的自定义项集合) 示例：{"attrext11":"test"}
renewalAttrextItem	object	否	否	自定义项

## 3. 请求示例

Url: /yonbip/hrcloud/contract/terminate?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"staffId": "",
		"name": "",
		"staffCode": "",
		"orgid": "",
		"orgName": "",
		"deptid": "",
		"deptName": "",
		"newmajorcorpid": "",
		"newmajorcorpname": "",
		"newcontractnum": "",
		"relievedate": "",
		"newpresenter": "",
		"newunchreason": "",
		"newunchreasonName": "",
		"newneconomy": 0,
		"newbreachmoney": 0,
		"newmemo": "",
		"newcontractcode": "",
		"newsigndate": "",
		"newworkaddr": "",
		"newbegindate": "",
		"newenddate": "",
		"extension": "{\"attrext11\":\"test\"}",
		"renewalAttrextItem": {
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
code	long	否	请求状态码(200:正常返回;999:服务异常) 示例：200
message	string	否	请求状态信息 示例：操作成功
data	object	否	data
id	string	否	单据id 示例：2246232625238272
pubts	string	否	时间戳 示例：2021-04-09 14:15:34
billstate	long	否	人力合同状态 示例：1
status	long	否	单据状态(0:开立;1:已审核;2:已关闭;3:审核中;4:锁定) 示例：0
staffId	string	否	员工id 示例：1974158125928704
name	string	否	员工姓名 示例：gu223
staffCode	string	否	员工编码 示例：A000738
orgid	string	否	组织id 示例：1970035925242368
orgName	string	否	组织名称 示例：合同测试公司
deptid	string	否	部门id 示例：1970036662145536
deptName	string	否	部门名称 示例：测试部门
newmajorcorpid	string	否	合同主体单位id 示例：2049001441677568
newmajorcorpname	string	否	合同主体单位 示例：1218合同主体1
newcontractnum	string	否	合同编码 示例：AAAA202104090000035
relievedate	string	否	合同终止日期 示例：2021-05-06 00:00:00
newpresenter	long	否	终止解除提出方(1:用人单位;2:劳动者) 示例：1
newunchreason	string	否	终止原因id 示例：1968601022107910
newunchreasonName	string	否	终止原因 示例：劳动合同期满
newneconomy	long	否	经济补偿金 示例：12
newbreachmoney	long	否	赔偿金 示例：3
newmemo	string	否	备注 示例：12
newconttype	long	否	业务类型 示例：5
newcontractcode	string	否	终止合同证明编号 示例：123
creator	string	否	创建人 示例：13681311431
createTime	string	否	创建时间 示例：2021-05-06 19:05:59
modifyTime	string	否	修改时间 示例：2021-05-06 20:56:32
isWfControlled	boolean	否	是否支持审批流(true支持;false:不支持) 示例：true
verifystate	long	否	单据审批状态(0:未提交;1:已提交;2:已审批) 示例：0
newsigndate	string	否	业务发生日期 示例：2021-04-09 00:00:00
newbegindate	string	否	当前合同开始日期 示例：2021-04-09 00:00:00
newenddate	string	否	当前合同结束日期 示例：2022-04-08 00:00:00
newtermtype	long	否	合同期限类型(1:固定期限;2:无固定期限;3:以完成一定工作任务为期限) 示例：1
newtermmonth	long	否	当前合同期限(月) 示例：12
modifier	string	否	修改人 示例：13681311431
modifierId	long	否	修改人id 示例：2065923095712000
modifyDate	string	否	修改日期 示例：2021-05-06 20:56:32
tenant	string	否	租户 示例：pkln5bpu
code	string	否	单据编码 示例：ZZ00000052
renewalAttrextItem	object	否	自定义项

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2246232625238272",
		"pubts": "2021-04-09 14:15:34",
		"billstate": 1,
		"status": 0,
		"staffId": "1974158125928704",
		"name": "gu223",
		"staffCode": "A000738",
		"orgid": "1970035925242368",
		"orgName": "合同测试公司",
		"deptid": "1970036662145536",
		"deptName": "测试部门",
		"newmajorcorpid": "2049001441677568",
		"newmajorcorpname": "1218合同主体1",
		"newcontractnum": "AAAA202104090000035",
		"relievedate": "2021-05-06 00:00:00",
		"newpresenter": 1,
		"newunchreason": "1968601022107910",
		"newunchreasonName": "劳动合同期满",
		"newneconomy": 12,
		"newbreachmoney": 3,
		"newmemo": "12",
		"newconttype": 5,
		"newcontractcode": "123",
		"creator": "13681311431",
		"createTime": "2021-05-06 19:05:59",
		"modifyTime": "2021-05-06 20:56:32",
		"isWfControlled": true,
		"verifystate": 0,
		"newsigndate": "2021-04-09 00:00:00",
		"newbegindate": "2021-04-09 00:00:00",
		"newenddate": "2022-04-08 00:00:00",
		"newtermtype": 1,
		"newtermmonth": 12,
		"modifier": "13681311431",
		"modifierId": 2065923095712000,
		"modifyDate": "2021-05-06 20:56:32",
		"tenant": "pkln5bpu",
		"code": "ZZ00000052",
		"renewalAttrextItem": {
			"define1": "自定项",
			"define2": "自定项",
			"define3": "自定项",
			"define4": "自定项",
			"define5": "自定项",
			"define6": "自定项",
			"define7": "自定项",
			"define8": "自定项",
			"define9": "自定项",
			"define10": "自定项",
			"define11": "自定项",
			"define12": "自定项",
			"define13": "自定项",
			"define14": "自定项",
			"define15": "自定项",
			"define16": "自定项",
			"define17": "自定项",
			"define18": "自定项",
			"define19": "自定项",
			"define20": "自定项",
			"define21": "自定项",
			"define22": "自定项",
			"define23": "自定项",
			"define24": "自定项",
			"define25": "自定项",
			"define26": "自定项",
			"define27": "自定项",
			"define28": "自定项",
			"define29": "自定项",
			"define30": "自定项",
			"define31": "自定项",
			"define32": "自定项",
			"define33": "自定项",
			"define34": "自定项",
			"define35": "自定项",
			"define36": "自定项",
			"define37": "自定项",
			"define38": "自定项",
			"define39": "自定项",
			"define40": "自定项",
			"define41": "自定项",
			"define42": "自定项",
			"define43": "自定项",
			"define44": "自定项",
			"define45": "自定项",
			"define46": "自定项",
			"define47": "自定项",
			"define48": "自定项",
			"define49": "自定项",
			"define50": "自定项",
			"define51": "自定项",
			"define52": "自定项",
			"define53": "自定项",
			"define54": "自定项",
			"define55": "自定项",
			"define56": "自定项",
			"define57": "自定项",
			"define58": "自定项",
			"define59": "自定项",
			"define60": "自定项",
			"id": "2246232625238272",
			"pubts": "2021-04-09 14:15:34",
			"yTenantId": "pkln5bpu"
		}
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
999	后台服务异常	

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

