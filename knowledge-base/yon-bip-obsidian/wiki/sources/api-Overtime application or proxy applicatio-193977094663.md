---
title: "加班申请或代申请校验"
apiId: "1939770946630975495"
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

# 加班申请或代申请校验

>  请求方式	POST | O/T Application (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/overtime/common/check
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
id	string	否	否	申请id，传入用该值，不传入系统生成，传入请输入36位唯一字符串 示例：test_20240222_main_1
staffId	string	否	否	申请人员工id（可在假勤档案节点查询到）；applyType为2时，userId和staffId两则必传其一 示例：1737740314994540546
userId	string	否	否	申请人用户id（可在员工信息节点查询到），applyType为1时，userId必传；applyType为2时，userId和staffId两则必传其一 示例：18b1ffca-b45c-453d-94c7-220aca807b5d
applyType	string	否	是	申请类型 1：加班申请 2：加班代申请，只有这两个值 示例：2
details	object	是	是	被申请人员详细信息
remark	string	否	否	加班说明，最多200个字符 示例：加班说明
id	string	否	否	id,传入用该值，不传入系统生成，传入请输入36位唯一字符串 示例：test_20240222_ori_1
userId	string	否	否	用户id（可在员工信息节点查询到），applyType为1时，userId必传；applyType为2时，userId和staffId两则必传其一 示例：18b1ffca-b45c-453d-94c7-220aca807b5d
staffId	string	否	否	员工id（可在假勤档案节点查询到），applyType为2时，userId和staffId两则必传其一 示例：1737740314994540546
overTimeBeginTime	date
格式:yyyy-MM-dd HH:mm:ss	否	是	加班开始时间 示例：2024-02-06 01:30:00
overTimeEndTime	date
格式:yyyy-MM-dd HH:mm:ss	否	是	加班结束时间 示例：2024-02-07 00:30:00
isAllNight	string	否	是	是否通宵加班 0:非通宵加班 1:通宵加班，只有这两个值 示例：0
overTimeLen	number
小数位数:2,最大长度:10	否	否	申请时长，传入系统用该值，不传系统计算该值，拆单每张单据都计入该值 示例：4
actualLen	number
小数位数:2,最大长度:10	否	否	实际时长，传入系统用该值，不传系统计算该值，拆单计入第二张单据，第一张单据为0 示例：2
restSwitch	boolean	否	是	休息时段开关，true+restScopes适配restScopes；true适配默认休息时段；false不处理休息时段; 示例：true
otSettleInfo	object	是	否	结算方式，涉及拆单单据，要么两天都传入，要么不要传，否则会被校验到，不传取加班规则的，传入按传入设置
restScopes	object	是	否	休息时段

## 3. 请求示例

Url: /yonbip/hrcloud/time/overtime/common/check?access_token=访问令牌
Body: {
	"id": "test_20240222_main_1",
	"staffId": "1737740314994540546",
	"userId": "18b1ffca-b45c-453d-94c7-220aca807b5d",
	"applyType": "2",
	"details": [
		{
			"remark": "加班说明",
			"id": "test_20240222_ori_1",
			"userId": "18b1ffca-b45c-453d-94c7-220aca807b5d",
			"staffId": "1737740314994540546",
			"overTimeBeginTime": "2024-02-06 01:30:00",
			"overTimeEndTime": "2024-02-07 00:30:00",
			"isAllNight": "0",
			"overTimeLen": 4,
			"actualLen": 2,
			"restSwitch": true,
			"otSettleInfo": [
				{
					"date": "2024-02-06 08:55:21",
					"otRuleSettleType": "0",
					"otTurnRate": 100,
					"otActualSettleType": "0",
					"dateType": "1"
				}
			],
			"restScopes": [
				{
					"restBeginTime": "2024-02-06 09:30:00",
					"restEndTime": "2024-02-06 10:30:00"
				}
			]
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
message	string	否	返回信息
data	object	否	返回结果集
id	string	否	申请主表id，和传入参数保持一致
msg	string	否	错误信息
status	number
小数位数:0,最大长度:10	否	状态码，0=写入成功，1=写入失败
details	object	是	子表返回结果集

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"id": "",
		"msg": "",
		"status": 0,
		"details": [
			{
				"id": "",
				"msg": "",
				"status": 0
			}
		]
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
500	加班结算方式不能为空!	检查加班结算方式

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

