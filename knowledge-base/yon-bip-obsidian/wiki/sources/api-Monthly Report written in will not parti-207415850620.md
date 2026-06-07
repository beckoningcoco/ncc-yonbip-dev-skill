---
title: "月报写入后不参与计算"
apiId: "2074158506204200960"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Monthly Report"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Monthly Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 月报写入后不参与计算

>  请求方式	POST | Monthly Report (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/report/open-api/report/attendExternal/batchSaveMonthData
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
schemeId	string	否	是	假勤方案id，可通过"获取假勤方案"api获取 示例：1
orgId	string	否	否	组织id 示例：1775733611008256
deptId	string	否	否	部门id 示例：1821309884322048
year	string	否	是	考勤年 示例：2024
month	string	否	是	考勤月 示例：10
data	object	是	是	月报数据集合，严格按照考勤项目code填充对应属性及值
staffCode	string	否	是	员工编码 示例：1001
workdays	number
小数位数:2,最大长度:10	否	否	应出勤天数 示例：21
f_v_1	string	否	否	自定义字符型项目 示例：北京
f_b_1	boolean	否	否	自定义布尔型项目 示例：true
f_n_1	number
小数位数:2,最大长度:10	否	否	自定义数值型项目，小数位数根据项目确定 示例：1.21
f_i_1	number
小数位数:0,最大长度:10	否	否	自定义整型项目 示例：10
f_d_1	date
格式:yyyy-MM-dd HH:mm:ss	否	否	自定义日期型项目，具体日期格式由项目确定 示例：2024-12-10 12:10:11

## 3. 请求示例

Url: /yonbip/hrcloud/time/report/open-api/report/attendExternal/batchSaveMonthData?access_token=访问令牌
Body: {
	"schemeId": "1",
	"orgId": "1775733611008256",
	"deptId": "1821309884322048",
	"year": "2024",
	"month": "10",
	"data": [
		{
			"staffCode": "1001",
			"workdays": 21,
			"f_v_1": "北京",
			"f_b_1": true,
			"f_n_1": 1.21,
			"f_i_1": 10,
			"f_d_1": "2024-12-10 12:10:11"
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
data	object	否	返回数据，当前接口无返回值

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
500	系统异常	系统未知异常

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-31	
更新
请求说明
新增
请求参数 orgId
新增
请求参数 deptId

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

