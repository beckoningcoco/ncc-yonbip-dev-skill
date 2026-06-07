---
title: "加班申请写入"
apiId: "12345555"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "O/T Application"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, O/T Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 加班申请写入

>  请求方式	POST | O/T Application (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/overtime/generateOvertimeBill
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
overtimeMainBillInfo	object	否	是	加班单写入请求体主表
userId	string	否	否	用户userId，可在员工信息节点查询到。(userId、staffId、staffCode，三者必须填一个) 示例：bf810f9e-35f4-4799-b79d-9a7b6bfc45f3
staffId	string	否	否	用户staffid,可在假勤档案中查找。(userId、staffId、staffCode，三者必须填一个) 示例：2278150606460289030
staffCode	string	否	否	用户Code,可在员工信息节点查找。(userId、staffId、staffCode，三者必须填一个) 示例：RYBH122132
remark	string	否	否	备注，最多200个字符 示例：加班申请B0601
id	string	否	否	id，非必填，如果填了，必须保证唯一且不得超过36个字符。传入用该值，不传入系统生成 示例：123456789-123456789-123456786
code	string	否	否	单据编码
modifiedtime	long	否	否	更新时间 示例：1612344671000
approveStatus	number
小数位数:2,最大长度:10	否	否	加班单审批状态 1 待提交 4 审批通过 默认审批通过 示例：4
details	object	是	否	加班单请求体子表

## 3. 请求示例

Url: /yonbip/hrcloud/time/overtime/generateOvertimeBill?access_token=访问令牌
Body: {
	"overtimeMainBillInfo": {
		"userId": "bf810f9e-35f4-4799-b79d-9a7b6bfc45f3",
		"staffId": "2278150606460289030",
		"staffCode": "RYBH122132",
		"remark": "加班申请B0601",
		"id": "123456789-123456789-123456786",
		"code": "",
		"modifiedtime": 1612344671000,
		"approveStatus": 4,
		"details": [
			{
				"userId": "bf810f9e-35f4-4799-b79d-9a7b6bfc45f3",
				"staffId": "2278150606460289030",
				"staffCode": "RYBH122132",
				"overtimebegintime": 1615027260000,
				"overtimeendtime": 1615034460000,
				"overtimelen": 2,
				"actuallen": 1.6,
				"remark": "0306加班申请(open-api)B0601detail",
				"id": "123456789-123456789-123456786-01",
				"restSwitch": true,
				"isallnight": 1,
				"otSettleInfo": [
					{
						"date": 1615027260000,
						"dateType": 1,
						"otRuleSettleType": "1",
						"otTurnRate": 100,
						"otRuleId": "1271234567876345",
						"otActualSettleType": "1"
					}
				],
				"restScopes": [
					{
						"restBeginTime": 1615027260000,
						"restEndTime": 1615034460000
					}
				]
			}
		]
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
code	string	否	状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回结果集
id	string	否	主表主键 示例：123456789-123456789-123456787
msg	string	否	错误信息
details	object	是	子表返回结果集
status	long	否	状态码，0=写入成功，1=写入失败 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "123456789-123456789-123456787",
		"msg": "",
		"details": [
			{
				"id": "123456789-123456789-123456787-01",
				"msg": "",
				"status": 0
			}
		],
		"status": 0
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
500	解析加班单JSON失败！	检查加班单json

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-13	
新增
请求参数 OvertimeMainDefine
新增
请求参数 OvertimeOriDefine
更新
请求参数 approveStatus
	2	2025-11-27	
新增
请求参数 approveStatus
调整字段顺序
	3	2025-06-25	
新增
请求参数 (4)
更新
请求参数 userId
更新
请求参数 userId

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

