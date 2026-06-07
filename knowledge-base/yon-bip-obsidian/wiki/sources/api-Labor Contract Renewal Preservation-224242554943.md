---
title: "劳动合同续签保存"
apiId: "2242425549431504897"
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

# 劳动合同续签保存

>  请求方式	POST | Contract Management [Offline Later] (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/contract/renewal/saveRenewal
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
data	object	否	是	合同续签[hrcm.renewal.renewal]
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	是	来源系统单据主键
name	string	否	否	员工姓名
staffCode	string	否	否	员工编号
staffId	string	否	是	员工id
orgid	string	否	是	所属公司id
orgName	string	否	否	所属公司
deptid	string	否	是	所属部门id
deptName	string	否	否	所属部门
newsigndate	string	否	否	签订日期
newtermtype	string	否	是	合同期限类型(1:固定期限;2:无固定期限;3:以完成一定工作任务为期限)
newbegindate	string	否	是	合同开始日期
newtermmonth	int	否	否	合同期限
newTermUnit	string	否	否	期限单位(0:年;1:月)
newenddate	string	否	否	合同结束日期(合同类型为固定期限时必填)
newmajorcorpid	string	否	是	合同主体单位id
newmajorcorpname	string	否	否	合同主体单位
newworkaddr	string	否	否	工作地点id
newworkaddrname	string	否	否	工作地点
newmemo	string	否	否	备注

## 3. 请求示例

Url: /yonbip/hrcloud/contract/renewal/saveRenewal?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"name": "",
		"staffCode": "",
		"staffId": "",
		"orgid": "",
		"orgName": "",
		"deptid": "",
		"deptName": "",
		"newsigndate": "",
		"newtermtype": "",
		"newbegindate": "",
		"newtermmonth": 0,
		"newTermUnit": "",
		"newenddate": "",
		"newmajorcorpid": "",
		"newmajorcorpname": "",
		"newworkaddr": "",
		"newworkaddrname": "",
		"newmemo": ""
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
code	long	否	请求状态码(200:接口正常返回;999:服务异常) 示例：200
message	string	否	请求状态信息 示例：操作成功
data	object	否	data
id	string	否	单据id 示例：2175207153619200
pubts	string	否	时间戳 示例：2021-02-26 16:38:40
creator	string	否	创建人 示例：述蒙
createTime	string	否	创建时间 示例：2021-03-17 14:55:08
code	string	否	单据编码 示例：RT00000154
name	string	否	员工姓名 示例：石岩
staffCode	string	否	员工编码 示例：000002
staffId	string	否	员工id 示例：2009571336081664
orgid	string	否	组织id 示例：1970035925242368
orgName	string	否	组织名称 示例：合同测试公司
deptid	string	否	部门id 示例：1970036662145536
deptName	string	否	部门名称 示例：测试部门
newcontractnum	string	否	合同编码 示例：HRCMAl20210106000074
newsigndate	string	否	签订日期 示例：2021-03-17 14:48:12
newtermtype	long	否	合同期限类型(1:固定期限;2:无固定期限;3:以完成一定工作任务为期限) 示例：1
newbegindate	string	否	合同开始日期 示例：2021-11-01 00:00:00
newtermmonth	long	否	合同期限 示例：10
newTermUnit	string	否	期限单位 示例：1
newenddate	string	否	合同结束日期 示例：2021-11-30 00:00:00
newmajorcorpid	string	否	合同主体单位id 示例：2050687232856320
newmajorcorpname	string	否	合同主体单位 示例：1219合同主体1
newworkaddr	string	否	工作地点id 示例：2060640580735232
newworkaddrname	string	否	工作地点 示例：1226地点1
newmemo	string	否	备注 示例：20210317
billstate	long	否	人力合同单据状态(1:未提交;2:已提交;3:审核中;4:审核通过;5:审核未通过;6:已生效;7:生效失败;10:已撤回;12:已驳回;13:终止;) 示例：1
sendtc	boolean	否	是否发送电子合同 示例：true
oldcontractnum	string	否	原合同编码 示例：HRCMAl20210106000074
oldsigndate	string	否	原签订日期 示例：2021-02-26 00:00:00
oldtermtype	long	否	原合同期限类型(1:固定期限;2:无固定期限;3:以完成一定工作任务为期限) 示例：1
oldbegindate	string	否	原合同开始日期 示例：2021-10-01 00:00:00
oldtermmonth	long	否	原合同期限 示例：1
oldenddate	string	否	原合同结束日期 示例：2021-10-31 00:00:00
oldmajorcorpid	string	否	原合同主体单位id 示例：2050687232856320
oldmajorcorpname	string	否	原合同主体单位 示例：1219合同主体1
oldworkaddr	string	否	原工作地点id 示例：2060640580735232
oldworkaddrname	string	否	原工作地点 示例：1226地点1
newconttype	long	否	合同业务类型(1:签订;2:续签;3:变更;4:解除;5:终止;6:续签意见征询) 示例：2
creatorId	long	否	创建者 示例：2015611647316224
createDate	string	否	创建日期 示例：2021-03-17 14:55:08
status	long	否	单据状态(0:开立;1:已审核;2:已关闭;3:审核中;4:锁定) 示例：0
isWfControlled	boolean	否	是否支持审批流(true:支持;false:不支持) 示例：true
verifystate	long	否	单据审批状态(0:未提交;1:已提交;2:已审批) 示例：0
tenant	string	否	租户 示例：pkln5bpu
renewalAttrextItem	object	否	自定义项

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2175207153619200",
		"pubts": "2021-02-26 16:38:40",
		"creator": "述蒙",
		"createTime": "2021-03-17 14:55:08",
		"code": "RT00000154",
		"name": "石岩",
		"staffCode": "000002",
		"staffId": "2009571336081664",
		"orgid": "1970035925242368",
		"orgName": "合同测试公司",
		"deptid": "1970036662145536",
		"deptName": "测试部门",
		"newcontractnum": "HRCMAl20210106000074",
		"newsigndate": "2021-03-17 14:48:12",
		"newtermtype": 1,
		"newbegindate": "2021-11-01 00:00:00",
		"newtermmonth": 10,
		"newTermUnit": "1",
		"newenddate": "2021-11-30 00:00:00",
		"newmajorcorpid": "2050687232856320",
		"newmajorcorpname": "1219合同主体1",
		"newworkaddr": "2060640580735232",
		"newworkaddrname": "1226地点1",
		"newmemo": "20210317",
		"billstate": 1,
		"sendtc": true,
		"oldcontractnum": "HRCMAl20210106000074",
		"oldsigndate": "2021-02-26 00:00:00",
		"oldtermtype": 1,
		"oldbegindate": "2021-10-01 00:00:00",
		"oldtermmonth": 1,
		"oldenddate": "2021-10-31 00:00:00",
		"oldmajorcorpid": "2050687232856320",
		"oldmajorcorpname": "1219合同主体1",
		"oldworkaddr": "2060640580735232",
		"oldworkaddrname": "1226地点1",
		"newconttype": 2,
		"creatorId": 2015611647316224,
		"createDate": "2021-03-17 14:55:08",
		"status": 0,
		"isWfControlled": true,
		"verifystate": 0,
		"tenant": "pkln5bpu",
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
			"id": "2175207153619200",
			"pubts": "2021-02-26 16:38:40",
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

