---
title: "其他任职单提交MDD"
apiId: "2109138085679726592"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Other Employment Processing"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Other Employment Processing]
platform_version: "BIP"
source_type: community-api-docs
---

# 其他任职单提交MDD

>  请求方式	POST | Other Employment Processing (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/bill/otherjobsubmit
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
data	object	否	是	数据结构体
billId	string	否	是	其他任职单据id 示例：1552573795327016966

## 3. 请求示例

Url: /yonbip/hrcloud/bill/otherjobsubmit?access_token=访问令牌
Body: {
	"data": {
		"billId": "1552573795327016966"
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
code	string	否	编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
id	number
小数位数:0,最大长度:19	否	id 示例：2173665416637841409
billStatus	number
小数位数:0,最大长度:10	否	单据状态 示例：3
vouchdate	string	否	单据日期 示例：2025-01-07 00:00:00
bizFlowId	string	否	关联业务流 示例：-1
deptvid	string	否	时间轴部门 示例：2154446632000684034
instanceid	string	否	instanceid 示例：00b7286c-cd6c-11ef-a0ee-da7af44cbed1
orgvid	string	否	时间轴组织 示例：2154446400062488583
applicantid	string	否	申请人ID 示例：55ab8133-84af-46aa-8baf-84d336133a48
applicantname	string	否	申请人名称 示例：昵称-人力测试管理员
applydate	string	否	申请日期 示例：2025-01-07 00:00:00
creatorName	string	否	制单人 示例：昵称-人力测试管理员
dr	number
小数位数:0,最大长度:10	否	dr 示例：0
bizFlowName	string	否	关联业务流名称 示例：--
tenant	string	否	tenant 示例：0000M49TWWKV4MAHAM0000
isWfControlled	boolean	否	是否控制审批流 示例：true
applicantstaffid	string	否	申请人对应的员工id 示例：2173623592238972932
ytenant	string	否	ytenant 示例：0000M49TWWKV4MAHAM0000
singleMode	number
小数位数:0,最大长度:10	否	转单类型 示例：2
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：1
pubts	string	否	时间戳 示例：2025-01-08 10:55:26
tpAbnormalState	number
小数位数:0,最大长度:10	否	异动状态 示例：1
lastFlag	number
小数位数:0,最大长度:10	否	最新标识 示例：1
workFlag	number
小数位数:0,最大长度:10	否	单据生效标志 示例：0
billType	number
小数位数:0,最大长度:10	否	上游单据类型 示例：1
staffId	string	否	兼职人 示例：2160176968767111177
creatorId	number
小数位数:0,最大长度:19	否	创建人 示例：2148456234947706885
orgId	string	否	组织 示例：2154446400062488583
deptId	string	否	部门 示例：2154446632000684034
businesstypeid	string	否	交易类型 示例：2148457437527015498
changeEvent	number
小数位数:0,最大长度:10	否	变动类型 示例：5
operatetype	number
小数位数:0,最大长度:10	否	操作类型 示例：1
creator	string	否	创建者 示例：55ab8133-84af-46aa-8baf-84d336133a48
createTime	string	否	创建时间 示例：2025-01-07 19:06:00
createDate	string	否	创建日期 示例：2025-01-07 00:00:00
staffParttimeOtherJob	object	是	子表
code	string	否	单据编码 示例：PART000007

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2173665416637841409,
		"billStatus": 3,
		"vouchdate": "2025-01-07 00:00:00",
		"bizFlowId": "-1",
		"deptvid": "2154446632000684034",
		"instanceid": "00b7286c-cd6c-11ef-a0ee-da7af44cbed1",
		"orgvid": "2154446400062488583",
		"applicantid": "55ab8133-84af-46aa-8baf-84d336133a48",
		"applicantname": "昵称-人力测试管理员",
		"applydate": "2025-01-07 00:00:00",
		"creatorName": "昵称-人力测试管理员",
		"dr": 0,
		"bizFlowName": "--",
		"tenant": "0000M49TWWKV4MAHAM0000",
		"isWfControlled": true,
		"applicantstaffid": "2173623592238972932",
		"ytenant": "0000M49TWWKV4MAHAM0000",
		"singleMode": 2,
		"verifystate": 1,
		"pubts": "2025-01-08 10:55:26",
		"tpAbnormalState": 1,
		"lastFlag": 1,
		"workFlag": 0,
		"billType": 1,
		"staffId": "2160176968767111177",
		"creatorId": 2148456234947706885,
		"orgId": "2154446400062488583",
		"deptId": "2154446632000684034",
		"businesstypeid": "2148457437527015498",
		"changeEvent": 5,
		"operatetype": 1,
		"creator": "55ab8133-84af-46aa-8baf-84d336133a48",
		"createTime": "2025-01-07 19:06:00",
		"createDate": "2025-01-07 00:00:00",
		"staffParttimeOtherJob": [
			{
				"id": 2173665416637841410,
				"assigType": 1,
				"changeEvent": 5,
				"businesstypeid": "2148457437527015498",
				"tempOrgId": "2160182088364982275",
				"staffParttimeId": 2173665416637841409,
				"operatetype": "1",
				"tenant": "0000M49TWWKV4MAHAM0000",
				"ytenant": "0000M49TWWKV4MAHAM0000",
				"tempDeptvid": "2160182354661867521",
				"tempJobvid": "2160210606941536262",
				"tempOrgvid": "2160182088364982275",
				"tempDeptId": "2160182354661867521",
				"tempJobId": "2160210606941536262",
				"beginDate": "2025-01-01 00:00:00",
				"memo": "yyyyyyyyyyy",
				"planEndDate": "2025-01-31 00:00:00",
				"bJobWeaken": 0
			}
		],
		"code": "PART000007"
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
999	活动[普通审核]上找不到用户	工作流节点上不能设置发起人 应该设置指定的明确的用户

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

