---
title: "补签卡申请写入"
apiId: "48f706be2bab46bb8902c2974bf2354"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Processing Application Document"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Processing Application Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 补签卡申请写入

>  请求方式	POST | Processing Application Document (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/sign/fillAttendance/generateBill
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
userId	string	否	是	操作人userId 示例：7e734edb-dab4-4e89-a026-c139cb4a3a4a
data	object	是	否	请求体
userId	string	否	否	操作人userId，来源通常是友互通ID 示例：7e734edb-dab4-4e89-a026-c139cb4a3a4a
staffId	string	否	否	申请员工id（建议使用），可通过员工信息相关接口获取 示例：2350447534658048
staffCode	string	否	否	申请员工编码，可通过员工信息相关接口获取 示例：00000010
fillTypeId	string	否	是	补考勤类型，可通过"获取补签卡类型"api获取 示例：5c1ebff4ff564b93a0bf448ecb5a68dc
code	string	否	否	编码 示例：CAE20241030000001
fillTime	long	否	是	补考勤时间 示例：1614061800000
fillDate	string	否	是	补考勤日期 示例：2021-02-23
fillReason	string	否	是	补考勤原因 示例：sonia0223下午14：00点补考勤测试
id	string	否	否	id，非必填，若填了，必须唯一且不得超过36个字符 示例：123456-01
detailId	string	否	否	detailId，非必填，若填了，必须唯一且不得超过36个字符
modifiedtime	long	否	否	更新时间 示例：1615187674000
approveStatus	boolean	否	否	是否需要审批 true 需要审批 false 不需要审批

## 3. 请求示例

Url: /yonbip/hrcloud/time/sign/fillAttendance/generateBill?access_token=访问令牌
Body: {
	"userId": "7e734edb-dab4-4e89-a026-c139cb4a3a4a",
	"data": [
		{
			"userId": "7e734edb-dab4-4e89-a026-c139cb4a3a4a",
			"staffId": "2350447534658048",
			"staffCode": "00000010",
			"fillTypeId": "5c1ebff4ff564b93a0bf448ecb5a68dc",
			"code": "CAE20241030000001",
			"fillTime": 1614061800000,
			"fillDate": "2021-02-23",
			"fillReason": "sonia0223下午14：00点补考勤测试",
			"id": "123456-01",
			"detailId": "",
			"modifiedtime": 1615187674000,
			"approveStatus": true
		}
	]
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
message	string	否	返回信息 示例：操作成功
data	object	是	返回结果集
id	string	否	id（调用方主表主键） 示例：123456-01
detailId	string	否	调用方子表主键 示例：123456-01-01
yonyouId	string	否	BIP主键 示例：123456-01
msg	string	否	错误信息
status	long	否	状态码，0=写入成功，1=写入失败 示例：0
staffId	string	否	员工id 示例：001002003110
staffName	string	否	员工姓名 示例：张三
staffCode	string	否	员工编码 示例：0003
fillTime	string	否	补卡时间 示例：2024-06-03 23:12:23

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "123456-01",
			"detailId": "123456-01-01",
			"yonyouId": "123456-01",
			"msg": "",
			"status": 0,
			"staffId": "001002003110",
			"staffName": "张三",
			"staffCode": "0003",
			"fillTime": "2024-06-03 23:12:23"
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
500	解析补考勤单据JSON失败	检查json
300	新增OpenApi补考勤单据失败	检查入参是否正确

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-02-02	
更新
请求说明
新增
请求参数 staffCode
更新
请求参数 data
更新
请求参数 detailId
更新
请求参数 approveStatus
	2	2025-06-25	
新增
请求参数 approveStatus

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

