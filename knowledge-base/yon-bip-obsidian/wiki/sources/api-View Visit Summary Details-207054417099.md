---
title: "查看拜访小结详情"
apiId: "2070544170991747076"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Visit Summary"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Visit Summary]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看拜访小结详情

>  请求方式	GET | Visit Summary (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/visitsummary/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	拜访小结主键    示例: 2023753010563776518

## 3. 请求示例

Url: /yonbip/crm/visitsummary/getbyid?access_token=访问令牌&id=2023753010563776518

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
code	number
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据信息
reviewReuslt	number
小数位数:0,最大长度:10	否	检核结果 示例：2
displayPicture	string	否	展示照片 示例：0d1d7629-3b87-4d45-9e5a-606e390f553b
picture9	string	否	图9 示例：32709de3-2df6-46fe-b534-a33e93f432b8
dept_code	string	否	部门编码 示例：BJCP
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：1
picture8	string	否	图8 示例：a6bc2efb-4385-40e1-8145-ea340cab579f
picture7	string	否	图7 示例：8f23d497-2ed5-4ccc-926b-fef492c69563
code	string	否	编码 示例：20240619140141
picture6	string	否	图6 示例：f5ad012b-a254-44e8-85c7-d733c8cc44ff
bustype_name	string	否	交易类型 示例：拜访小结
picture1	string	否	图1 示例：d28fa7fc-9eb1-420a-abed-a25e091a316d
reformStatus	number
小数位数:0,最大长度:10	否	整改状态 示例：0
picture5	string	否	图5 示例：316f5cb6-0287-4e9c-872a-266a03fb8b34
picture4	string	否	图4 示例：30bd1958-ecc0-465c-815b-1dec6cdcaaa5
picture3	string	否	图3 示例：b73bedd9-0408-4f32-b551-4f95644c9d7f
picture2	string	否	图2 示例：fcac8a8b-3e1b-476d-aa0a-515d80a0db20
ower_name	string	否	负责人 示例：李雨珊
id	string	否	id 示例：2023753010563776518
pubts	string	否	时间戳 示例：2024-08-07 09:36:05
org_name	string	否	组织 示例：集团
owerShow	string	否	负责人展示 示例：李雨珊
terminalShow	string	否	终端展示 示例：铁锅扁豆焖面
bustype_code	string	否	交易类型编码 示例：00000123
ower	string	否	负责人 示例：1800973563700707336
creator	string	否	创建人 示例：昵称-李雨珊
taskBustypeName	string	否	任务交易类型 示例：终端任务
org	string	否	组织 示例：1686561321477734406
isWfControlled	boolean	否	是否审批流 示例：true
nextTaskTransType_bustype	string	否	下次任务类型 示例：1737161714193924100
dept_name	string	否	部门 示例：昌平事业部
terminal	string	否	终端 示例：1810590948969676802
dept	string	否	部门 示例：1811240253549182980
bustype	string	否	交易类型 示例：1733475524147150858
picture10	string	否	图9 示例：254c1858-8e27-4844-b6d0-b74deaca43a8
terminal_name	string	否	终端名称 示例：铁锅扁豆焖面
createTime	string	否	创建时间 示例：2024-06-19 19:17:38
actionId	string	否	行动ID 示例：2023730470548144130
org_code	string	否	组织编码 示例：JT01
terminalTitle	string	否	终端标题 示例：终端
customerTitle	string	否	客户标题 示例：客户
reviewReusltTitle	string	否	检核状态 示例：检核状态
reformStatusTitle	string	否	整改状态 示例：整改状态
owerTitle	string	否	执行人 示例：执行人
recentReviewerTitle	string	否	最近检核人 示例：最近检核人

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"reviewReuslt": 2,
		"displayPicture": "0d1d7629-3b87-4d45-9e5a-606e390f553b",
		"picture9": "32709de3-2df6-46fe-b534-a33e93f432b8",
		"dept_code": "BJCP",
		"verifystate": 1,
		"picture8": "a6bc2efb-4385-40e1-8145-ea340cab579f",
		"picture7": "8f23d497-2ed5-4ccc-926b-fef492c69563",
		"code": "20240619140141",
		"picture6": "f5ad012b-a254-44e8-85c7-d733c8cc44ff",
		"bustype_name": "拜访小结",
		"picture1": "d28fa7fc-9eb1-420a-abed-a25e091a316d",
		"reformStatus": 0,
		"picture5": "316f5cb6-0287-4e9c-872a-266a03fb8b34",
		"picture4": "30bd1958-ecc0-465c-815b-1dec6cdcaaa5",
		"picture3": "b73bedd9-0408-4f32-b551-4f95644c9d7f",
		"picture2": "fcac8a8b-3e1b-476d-aa0a-515d80a0db20",
		"ower_name": "李雨珊",
		"id": "2023753010563776518",
		"pubts": "2024-08-07 09:36:05",
		"org_name": "集团",
		"owerShow": "李雨珊",
		"terminalShow": "铁锅扁豆焖面",
		"bustype_code": "00000123",
		"ower": "1800973563700707336",
		"creator": "昵称-李雨珊",
		"taskBustypeName": "终端任务",
		"org": "1686561321477734406",
		"isWfControlled": true,
		"nextTaskTransType_bustype": "1737161714193924100",
		"dept_name": "昌平事业部",
		"terminal": "1810590948969676802",
		"dept": "1811240253549182980",
		"bustype": "1733475524147150858",
		"picture10": "254c1858-8e27-4844-b6d0-b74deaca43a8",
		"terminal_name": "铁锅扁豆焖面",
		"createTime": "2024-06-19 19:17:38",
		"actionId": "2023730470548144130",
		"org_code": "JT01",
		"terminalTitle": "终端",
		"customerTitle": "客户",
		"reviewReusltTitle": "检核状态",
		"reformStatusTitle": "整改状态",
		"owerTitle": "执行人",
		"recentReviewerTitle": "最近检核人"
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

