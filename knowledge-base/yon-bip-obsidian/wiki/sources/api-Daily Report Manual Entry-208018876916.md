---
title: "日报手工项写入"
apiId: "2080188769167212549"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Daily Report"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Daily Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 日报手工项写入

>  请求方式	POST | Daily Report (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/report/open-api/report/attendExternal/dayManualItem/batchUpdate
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
schemeId	string	否	是	假勤方案id，可通过"获取假勤方案"api获取 示例：0000M0M29GVS3KRJML00000000000001
calculateFlag	number
小数位数:0,最大长度:1	否	否	是否重新计算日报 0 不重新计算 1 重新计算 示例：1 默认值：1
dataList	object	是	是	dataList
staffCode	string	否	是	员工编号 示例：123456
belongingDate	number
小数位数:0,最大长度:14	否	是	日报所属日期时间戳 示例：1725365384000
f_v_1	string	否	否	自定义字符型项目 示例：abc
f_b_1	boolean	否	否	自定义布尔型项目 示例：true
f_n_1	number
小数位数:4,最大长度:16	否	否	自定义数值型项目 示例：3.14
f_i_1	number
小数位数:0,最大长度:11	否	否	自定义整型项目 示例：1
f_d_1	date
格式:yyyy-MM-dd HH:mm:ss	否	否	自定义日期项目 示例：2024-01-01 00:00:00

## 3. 请求示例

Url: /yonbip/hrcloud/time/report/open-api/report/attendExternal/dayManualItem/batchUpdate?access_token=访问令牌
Body: {
	"schemeId": "0000M0M29GVS3KRJML00000000000001",
	"calculateFlag": 1,
	"dataList": [
		{
			"staffCode": "123456",
			"belongingDate": 1725365384000,
			"f_v_1": "abc",
			"f_b_1": true,
			"f_n_1": 3.14,
			"f_i_1": 1,
			"f_d_1": "2024-01-01 00:00:00"
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
message	string	否	提示信息 示例：本次共写入2条数据，成功1条,失败1条。失败明细：人员：xxxx，日期：2025-05-27，员工编号不正确或员工不属于当前假勤方案；
data	object	是	返回结果集
msg	string	否	写入结果详情 示例：员工编号不正确或员工不属于当前假勤方案
staffCode	string	否	员工编码 示例：123
belongingDate	string	否	写入日报日期 示例：2025-05-27

## 5. 正确返回示例

{
	"code": "200",
	"message": "本次共写入2条数据，成功1条,失败1条。失败明细：人员：xxxx，日期：2025-05-27，员工编号不正确或员工不属于当前假勤方案；",
	"data": [
		{
			"msg": "员工编号不正确或员工不属于当前假勤方案",
			"staffCode": "123",
			"belongingDate": "2025-05-27"
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
500	日报数据不存在，请先生成日报！	日报数据不存在，请先生成日报！

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-03	
更新
请求说明
更新
返回参数 (6)
	2	2025-06-18	
新增
请求参数 calculateFlag
新增
返回参数 msg
新增
返回参数 staffCode
新增
返回参数 belongingDate
更新
返回参数 code
更新
返回参数 message
更新
返回参数 data

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

