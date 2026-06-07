---
title: "新增黑名单"
apiId: "1959795578803060743"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Blacklist Management"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Blacklist Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 新增黑名单

>  请求方式	POST | Blacklist Management (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/addBlacklist
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
data	object	否	是	整体数据
id	string	否	否	黑名单主表id。非必填，操作update时 必填 示例：2304007344492800
name	string	否	是	姓名 示例：name1
certtype	string	否	是	证件类型 传入id或code 示例：0002-e756-4390-8c50-251e26b06594
certno	string	否	是	证件号 示例：1231231231
validityPeriodStart	Date	否	是	加入日期 示例：1999-07-01
validityPeriodEnd	Date	否	否	结束日期 示例：2021-07-10
blacklistOrgidList	object	是	是	黑名单适用范围
addBlacklistReason	string	否	否	加入黑名单原因 1:违反公司规章制度/法律法规,2:失职或营私舞弊,3:应届生未报到未解约,4:体检不合格,5:多次入职/离职,6:虚假应聘,7:员工关系事件,8:辞退,9:公司不续签,10:劝退,11:协商解除,12:用工异常,99:其他原因
remarks	string	否	否	备注 示例：当天离职
_status	string	否	是	操作标识，Insert：新增；Update：更新 示例：Insert

## 3. 请求示例

Url: /yonbip/hrcloud/addBlacklist?access_token=访问令牌
Body: {
	"data": {
		"id": "2304007344492800",
		"name": "name1",
		"certtype": "0002-e756-4390-8c50-251e26b06594",
		"certno": "1231231231",
		"validityPeriodStart": "1999-07-01",
		"validityPeriodEnd": "2021-07-10",
		"blacklistOrgidList": [
			{
				"id": "2308086666645997",
				"rangeOrgid": "2311452439269632",
				"_status": "Insert"
			}
		],
		"addBlacklistReason": "",
		"remarks": "当天离职",
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
code	string	否	响应参数 示例：200
message	string	否	整体响应信息 示例：操作成功
data	object	否	整体数据
id	string	否	黑名单主表id。非必填，操作update时 必填 示例：2304007344492800
name	string	否	姓名 示例：name1
certtype	object	否	证件类型 id或code 示例：0002-e756-4390-8c50-251e26b06594
certno	string	否	证件号 示例：1231231231
validityPeriodStart	Date	否	加入日期 示例：1999-07-01
validityPeriodEnd	Date	否	结束日期 示例：2021-07-10
blacklistOrgidList	object	否	blacklistOrgidList
addBlacklistReason	string	否	加入黑名单原因 示例：违反公司规章制度/法律法规
remarks	string	否	备注 示例：当天离职
blacklistcardTZDefine	object	否	特征

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "2304007344492800",
		"name": "name1",
		"certtype": "0002-e756-4390-8c50-251e26b06594",
		"certno": "1231231231",
		"validityPeriodStart": "1999-07-01",
		"validityPeriodEnd": "2021-07-10",
		"blacklistOrgidList": {
			"id": "2308086666645997",
			"rangeOrgid": "2311452439269632"
		},
		"addBlacklistReason": "违反公司规章制度/法律法规",
		"remarks": "当天离职",
		"blacklistcardTZDefine": {}
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
999	后台逻辑异常	联系管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-05-08	
新增
请求参数 addBlacklistReason
新增
返回参数 addBlacklistReason
新增加入黑名单原因字段 调整备注字段顺序

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

