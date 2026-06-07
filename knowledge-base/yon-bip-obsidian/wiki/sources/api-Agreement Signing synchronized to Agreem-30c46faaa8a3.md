---
title: "协议签订同步至协议台账"
apiId: "30c46faaa8a34c91bae8fe6223c60c72"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Agreement [Offline Later]"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Agreement [Offline Later]]
platform_version: "BIP"
source_type: community-api-docs
---

# 协议签订同步至协议台账

>  请求方式	POST | Agreement [Offline Later] (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/agreement/sign
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
data	object	否	是	协议签订卡片[hrcm.agreement.Agreement]
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	是	OA系统中单据id
staffId	string	否	是	员工id
staffCode	string	否	否	员工编号
orgid	string	否	是	公司id
orgCode	string	否	否	公司编码
deptid	string	否	是	部门id
deptCode	string	否	否	部门编码
agreementtype	string	否	是	协议类型id
agreementTypeName	string	否	否	协议类型
newagreementnum	string	否	是	协议编码
newsigndate	string	否	否	签订日期
newbegindate	string	否	是	协议开始日期
newenddate	string	否	是	协议结束日期
newtermmonth	int	否	否	协议期限
newTermUnit	string	否	否	期限单位
newmajorcorpid	string	否	是	协议主体单位id
newmajorcorpname	string	否	否	协议主体单位
newworkaddr	string	否	否	业务发生地点id(香雪没有工作地点)
newworkaddrname	string	否	否	业务发生地点
newmemo	string	否	否	备注
extension	string	否	否	扩展字段(json格式的自定义项集合) 示例：{"attrext11":"test"}
agreementAttrextItem	object	否	否	自定义项

## 3. 请求示例

Url: /yonbip/hrcloud/agreement/sign?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"staffId": "",
		"staffCode": "",
		"orgid": "",
		"orgCode": "",
		"deptid": "",
		"deptCode": "",
		"agreementtype": "",
		"agreementTypeName": "",
		"newagreementnum": "",
		"newsigndate": "",
		"newbegindate": "",
		"newenddate": "",
		"newtermmonth": 0,
		"newTermUnit": "",
		"newmajorcorpid": "",
		"newmajorcorpname": "",
		"newworkaddr": "",
		"newworkaddrname": "",
		"newmemo": "",
		"extension": "{\"attrext11\":\"test\"}",
		"agreementAttrextItem": {
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
code	long	否	请求状态码(200:正确;999:后台处理异常) 示例：200
message	string	否	请求信息 示例：操作成功
data	object	否	data
id	string	否	单据id 示例：2245713194225920
code	string	否	单据编码 示例：CT00000022
staffId	string	否	员工id 示例：1974158138265856
staffCode	string	否	员工编码 示例：A000741
name	string	否	员工姓名 示例：gu230
orgid	string	否	组织id 示例：1970035925242368
orgName	string	否	组织名称 示例：合同测试公司
deptid	string	否	部门id 示例：1970036662145536
deptName	string	否	部门名称 示例：测试部门
agreementtype	string	否	协议类型 示例：1968601003380995
agreementTypeName	string	否	协议类型名称 示例：保密协议
newagreementnum	string	否	协议编码 示例：自动生成
newsigndate	string	否	协议签订日期 示例：2021-05-06 10:09:26
newbegindate	string	否	协议开始日期 示例：2021-05-06 10:09:26
newenddate	string	否	协议结束日期 示例：2021-08-05 00:00:00
newtermmonth	long	否	协议期限 示例：3
newTermUnit	string	否	期限单位 示例：1
newmajorcorpid	string	否	协议主体单位id 示例：1974398665019648
newmajorcorpname	string	否	协议主体单位 示例：用友网络科技股份有限公司
newworkaddr	string	否	业务发生地点id 示例：1970063377010944
newworkaddrname	string	否	业务发生地点 示例：李超-测试地点
billstate	long	否	人力合同单据状态 (1:未提交;2:已提交;3:审核中;4:审核通过;5:审核未通过;6:已生效;7:生效失败;10:已撤回;12:已驳回;13:终止) 示例：1
creator	string	否	创建人 示例：19904568888
createTime	string	否	创建时间 示例：2021-05-06 10:17:35
agreementAttachments	string	是	agreementAttachments
newbusinesstype	long	否	协议业务类型(1:签订;2:续签;3:变更;4:解除;5:终止;6:续签意见征询) 示例：1
creatorId	long	否	创建人id 示例：1968600639475968
createDate	string	否	创建日期 示例：2021-05-06 10:17:35
status	long	否	单据状态(0:开立;1:已审核;2:已关闭;3:审核中;4:锁定) 示例：0
isWfControlled	boolean	否	支持审批流(true:支持; false:不支持) 示例：true
verifystate	long	否	单据审批状态(0:未提交;1:已提交;2:已审批) 示例：0
pubts	string	否	时间戳 示例：2021-05-06 10:17:36
tenant	string	否	租户 示例：pkln5bpu
yTenantId	string	否	新租户字段 示例：pkln5bpu
agreementAttrextItem	object	否	自定义项

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2245713194225920",
		"code": "CT00000022",
		"staffId": "1974158138265856",
		"staffCode": "A000741",
		"name": "gu230",
		"orgid": "1970035925242368",
		"orgName": "合同测试公司",
		"deptid": "1970036662145536",
		"deptName": "测试部门",
		"agreementtype": "1968601003380995",
		"agreementTypeName": "保密协议",
		"newagreementnum": "自动生成",
		"newsigndate": "2021-05-06 10:09:26",
		"newbegindate": "2021-05-06 10:09:26",
		"newenddate": "2021-08-05 00:00:00",
		"newtermmonth": 3,
		"newTermUnit": "1",
		"newmajorcorpid": "1974398665019648",
		"newmajorcorpname": "用友网络科技股份有限公司",
		"newworkaddr": "1970063377010944",
		"newworkaddrname": "李超-测试地点",
		"billstate": 1,
		"creator": "19904568888",
		"createTime": "2021-05-06 10:17:35",
		"agreementAttachments": [
			""
		],
		"newbusinesstype": 1,
		"creatorId": 1968600639475968,
		"createDate": "2021-05-06 10:17:35",
		"status": 0,
		"isWfControlled": true,
		"verifystate": 0,
		"pubts": "2021-05-06 10:17:36",
		"tenant": "pkln5bpu",
		"yTenantId": "pkln5bpu",
		"agreementAttrextItem": {
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
			"id": "2245713194225920",
			"pubts": "2021-05-06 10:17:36",
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

