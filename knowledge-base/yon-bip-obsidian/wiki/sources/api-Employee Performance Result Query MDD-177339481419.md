---
title: "员工绩效结果查询MDD"
apiId: "1773394814192582660"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee Performance"
domain: "PFMM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Performance]
platform_version: "BIP"
source_type: community-api-docs
---

# 员工绩效结果查询MDD

>  请求方式	POST | Employee Performance (PFMM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/pmcore/queryPerformScoreResultInfo
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
periodcode	string	是	是	期间code 示例：["2022"]
evaobj	object	是	是	查询对象
staffid	string	否	否	人员id，与人员code二选一必填 示例：2193374437839104
staffcode	string	否	否	人员code，与人员id二选一必填 示例：00001
deptcode	string	否	否	部门code，与部门id二选一必填 示例：010001
deptid	string	否	否	部门id，与部门code二选一必填 示例：2235814299292416
schememode	string	是	否	方案类型,0=PBC考核，1=360度评估，4=价值观，10=汇总方案，20=中期回顾 示例：["0"]
schemename	string	是	否	方案名称 示例：["2021年度考核"]

## 3. 请求示例

Url: /yonbip/hrcloud/pmcore/queryPerformScoreResultInfo?access_token=访问令牌
Body: {
	"periodcode": [
		"2022"
	],
	"evaobj": [
		{
			"staffid": "2193374437839104",
			"staffcode": "00001",
			"deptcode": "010001",
			"deptid": "2235814299292416"
		}
	],
	"schememode": [
		"0"
	],
	"schemename": [
		"2021年度考核"
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
code	string	否	返回码 示例：成功：200，失败：999
message	string	否	信息描述 示例：操作成功!
data	object	是	结果集
staffid	string	否	人员id 示例：2193374437839104
staffcode	string	否	人员code
deptid	string	否	部门id 示例：2235814299292416
deptcode	string	否	部门code
score	object	是	绩效结果集
displayCode	string	否	异常码 示例：123-001-661162

## 5. 正确返回示例

{
	"code": "成功：200，失败：999",
	"message": "操作成功!",
	"data": [
		{
			"staffid": "2193374437839104",
			"staffcode": "",
			"deptid": "2235814299292416",
			"deptcode": "",
			"score": [
				{
					"schemeid": "360c54ccc7724adbb4617b91776fc600",
					"schemename": "1026业务代理人",
					"schememodename": "PBC",
					"schememode": 0,
					"periodcode": "2022",
					"pyear": 2022,
					"numvalue": 4,
					"text": "A"
				}
			]
		}
	],
	"displayCode": "123-001-661162"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	期间信息不存在	核对参数信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-27	
新增
返回参数 displayCode
更新
返回参数 code
新增
错误码 999
删除
错误码 401

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

