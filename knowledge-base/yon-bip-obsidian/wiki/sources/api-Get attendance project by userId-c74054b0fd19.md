---
title: "通过userId获取考勤项目"
apiId: "c74054b0fd194a16be7657d58a723aba1"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Attendance Items"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Attendance Items]
platform_version: "BIP"
source_type: community-api-docs
---

# 通过userId获取考勤项目

>  请求方式	GET | Attendance Items (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/attendScheme/getAttendItemByUserId
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
type	string	query	是	0:日报 1:月报    示例: 0    默认值: 0
userId	string	query	否	用户userId（staffId 或 userId 必填其一，建议 staffId）    默认值: 5a029887-a6dd-4b16-82c7-2f3dc6bfe3da
staffId	string	query	否	员工id（staffId 和 userId取其一，有 staffId 优先用 staffId）

## 3. 请求示例

Url: /yonbip/hrcloud/time/attendScheme/getAttendItemByUserId?access_token=访问令牌&type=0&userId=&staffId=

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
id	string	否	主键 示例：71a7cec3ba4b4af89b1108741027affd
ts	long	否	时间戳 示例：1600737945000
es	long	否	是否支持 ElasticSearch，0=不支持，1=支持 示例：0
creator	string	否	创建人 示例：4a143f32-aea4-4d3f-be23-7d9bba6d0190
tenantid	string	否	租户id 示例：e1dpehzh
code	string	否	编码 示例：actualworkhours
dbcode	string	否	项目的数据库字段编码 示例：actualworkhours
mainId	string	否	主键id 示例：0cfdba0f90654e5487fb5f39b28c235c
refId	string	否	引用id 示例：e1dpehzhTIMEITEMDAY00001
name	string	否	名称 示例：实出勤小时
memo	string	否	备注
enablestate	long	否	是否启用，0=停用，1=启用 示例：1
iflddecimal	long	否	小数位数 示例：2
idatatype	long	否	数据类型，0=整型，1=数值型，2=字符型，3=布尔型，4=日期型 示例：0
idatatypeName	string	否	数据类型名称 示例：数值型
trunType	long	否	舍位方式 0:四舍五入 1:进位 2:舍位 示例：0
ifromflag	string	否	数据来源 示例：0
ifromflagName	string	否	数据来源名称 示例：公式计算
vformula	string	否	公式 示例：[tsattenddata.actualworkhours]
vformulastr	string	否	公式显示 示例：[考勤数据.实出勤小时]
userdefflag	boolean	否	是否用户自定义，true=是，false=否 示例：false
userdefflagName	string	否	用户定义名称 示例：系统预置
showorder	long	否	显示顺序 示例：1
icomputeseq	long	否	计算顺序 示例：1
itemtype	long	否	日月报标志，0=日报，1=月报 示例：0
ytenantId	string	否	友互通租户id 示例：e1dpehzh
referenceFlag	int	否	是否引用，0:否 1:是 示例：0
showFlag	boolean	否	是否显示，true=是，false=否 示例：true

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "71a7cec3ba4b4af89b1108741027affd",
			"ts": 1600737945000,
			"es": 0,
			"creator": "4a143f32-aea4-4d3f-be23-7d9bba6d0190",
			"tenantid": "e1dpehzh",
			"code": "actualworkhours",
			"dbcode": "actualworkhours",
			"mainId": "0cfdba0f90654e5487fb5f39b28c235c",
			"refId": "e1dpehzhTIMEITEMDAY00001",
			"name": "实出勤小时",
			"memo": "",
			"enablestate": 1,
			"iflddecimal": 2,
			"idatatype": 0,
			"idatatypeName": "数值型",
			"trunType": 0,
			"ifromflag": "0",
			"ifromflagName": "公式计算",
			"vformula": "[tsattenddata.actualworkhours]",
			"vformulastr": "[考勤数据.实出勤小时]",
			"userdefflag": false,
			"userdefflagName": "系统预置",
			"showorder": 1,
			"icomputeseq": 1,
			"itemtype": 0,
			"ytenantId": "e1dpehzh",
			"referenceFlag": 0,
			"showFlag": true
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
310078	后端接口响应超时，请稍后重试！	确认租户信息

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

