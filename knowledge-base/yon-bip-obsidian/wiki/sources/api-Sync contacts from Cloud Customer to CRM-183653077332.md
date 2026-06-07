---
title: "云客向CRM同步联系人"
apiId: "1836530773320007689"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Contact"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contact]
platform_version: "BIP"
source_type: community-api-docs
---

# 云客向CRM同步联系人

>  请求方式	POST | Contact (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/contact/contactSyncToCrm
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
id	string	否	是	云客联系人ID 示例：3627E0DFEA664AB393DE5BE51B977F52
providerId	string	否	否	CRM跟进人联系人ID 示例：1896336148844800
userId	string	否	否	跟进人Id（云客） 示例：3627E0DFEA664AB393DE5BE51B977F53
userPhone	string	否	否	跟进人手机号 示例：17001092352
partnerId	string	否	否	跟进人Id（甲方） 示例：1858229858635087873
name	string	否	否	联系人姓名 示例：张三
phone	string	否	否	联系人手机号 示例：15980228344
company	string	否	否	联系人公司名称 示例：用友网络科技有限公司
position	string	否	否	职位 示例：经理
telephone	string	否	否	座机 示例：0551-63837200
phone2	string	否	否	备用号码 示例：15980228345
address	string	否	否	地址 示例：北京市海淀区用友软件园
lastContactTime	string	否	否	上次沟通时间(yyyy-MM-dd HH:mm:ss) 示例：2023-02-07 10:36:08
lastContactRemark	string	否	否	上次沟通备注 示例：下次沟通订单详情
lastContactIntent	int	否	否	上次沟通意向 123457 分别代表有意向/无意向/资料错误/二次外呼/无关电话/未明确 空表示未标记结果 示例：1
lastContactTag	string	否	否	上次沟通小标签 示例：完成前期准备
createTime	string	否	否	添加时间 示例：2022-02-07 10:36:08
nextContactTime	string	否	否	下次沟通时间 示例：2024-02-17 10:36:08
followTime	string	否	否	跟进时间 示例：2023-02-07 10:36:08
wechatId	string	否	否	微信id 示例：15980228344
updateTime	string	否	否	此联系人信息更新时间 示例：2023-02-07 10:36:18
progress	int	否	否	销售进度id 示例：0
progressDesc	string	否	否	销售进度展示文本 示例：已经谈妥需求
remark	string	否	否	备注 示例：客户希望减少审批流程

## 3. 请求示例

Url: /yonbip/crm/contact/contactSyncToCrm?access_token=访问令牌
Body: [{
	"id": "3627E0DFEA664AB393DE5BE51B977F52",
	"providerId": "1896336148844800",
	"userId": "3627E0DFEA664AB393DE5BE51B977F53",
	"userPhone": "17001092352",
	"partnerId": "1858229858635087873",
	"name": "张三",
	"phone": "15980228344",
	"company": "用友网络科技有限公司",
	"position": "经理",
	"telephone": "0551-63837200",
	"phone2": "15980228345",
	"address": "北京市海淀区用友软件园",
	"lastContactTime": "2023-02-07 10:36:08",
	"lastContactRemark": "下次沟通订单详情",
	"lastContactIntent": 1,
	"lastContactTag": "完成前期准备",
	"createTime": "2022-02-07 10:36:08",
	"nextContactTime": "2024-02-17 10:36:08",
	"followTime": "2023-02-07 10:36:08",
	"wechatId": "15980228344",
	"updateTime": "2023-02-07 10:36:18",
	"progress": 0,
	"progressDesc": "已经谈妥需求",
	"remark": "客户希望减少审批流程"
}]

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
code	string	否	请求返回编码 示例：200
message	string	否	请求返回消息 示例：操作成功
data	object	否	请求返回数据
retCode	string	否	传给云客的状态编码，200表示成功，其他表示失败 示例：200
retMsg	string	否	传给云客的状态描述，说明失败原因 示例：成功
data	object	否	返回数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"retCode": "200",
		"retMsg": "成功",
		"data": {
			"id": "3627E0DFEA664AB393DE5BE51B977F52",
			"providerId": "1858192363572690953"
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
暂时没有数据哦~

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

