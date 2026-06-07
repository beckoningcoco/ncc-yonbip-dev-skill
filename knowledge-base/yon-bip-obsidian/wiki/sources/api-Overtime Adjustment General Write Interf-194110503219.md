---
title: "加班调整通用写入接口"
apiId: "1941105032190492676"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "O/T Adjustment Document"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, O/T Adjustment Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 加班调整通用写入接口

>  请求方式	POST | O/T Adjustment Document (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/api/time/overtimerevoke/generaterevokebill
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
overtimeOffMainApiInfo	object	否	是	调整单写入请求体主表
id	string	否	否	id，非必填，如果填了，必须保证唯一且不得超过36个字符。传入用该值，不传入系统生成 示例：1955194492007481350
userId	string	否	是	用户userId，可在员工信息节点找到 示例：bf810f9e-35f4-4799-b79d-9a7b6bfc45f3
remark	string	否	否	备注，最多200个字符 示例：加班调整B0601
mainId	string	否	是	需要调整的那条加班单的主键id，OA单据编号 示例：1955194492007481353
code	string	否	否	单据编码
offSource	number
小数位数:0,最大长度:10	否	是	调整单来源 ?1：加班单的调整单，2：代申请的调整单，只有这两个值 示例：1
offType	string	否	是	加班调整类型 1 调整为未加班； 2 部分调整，只有这两个值 示例：1
modifiedtime	string	否	否	更新时间，格式：yyyy-MM-dd HH:mm:ss 示例：2024-03-05 09:49:00
approveStatus	number
小数位数:0,最大长度:10	否	否	审批状态 1 待提交 4审批通过 默认值4 示例：1
details	object	是	否	调整单请求体子表

## 3. 请求示例

Url: /yonbip/hrcloud/api/time/overtimerevoke/generaterevokebill?access_token=访问令牌
Body: {
	"overtimeOffMainApiInfo": {
		"id": "1955194492007481350",
		"userId": "bf810f9e-35f4-4799-b79d-9a7b6bfc45f3",
		"remark": "加班调整B0601",
		"mainId": "1955194492007481353",
		"code": "",
		"offSource": 1,
		"offType": "1",
		"modifiedtime": "2024-03-05 09:49:00",
		"approveStatus": 1,
		"details": [
			{
				"id": "1955194492007481350",
				"userId": "bf810f9e-35f4-4799-b79d-9a7b6bfc45f3",
				"overtimebegintime": "2024-03-05 00:00:00",
				"overtimeendtime": "2024-03-05 02:00:00",
				"overtimelen": 2,
				"actuallen": 1.6,
				"restSwitch": true,
				"isAllNight": 0,
				"remark": "加班原因",
				"otSettleInfo": [
					{
						"date": "2024-03-05 00:00:00",
						"dateType": 1,
						"otRuleSettleType": "2",
						"otTurnRate": 100,
						"otRuleId": "123456789-123456789",
						"otActualSettleType": "2"
					}
				],
				"restScopes": [
					{
						"restBeginTime": "2022-07-03 12:00:00",
						"restEndTime": "2022-07-03 13:00:00"
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
id	string	否	成功时，返回主表主键 示例：123456789-123456789-123456787
msg	string	否	失败时，返回的错误信息
status	long	否	状态码，0=写入成功，1=写入失败 示例：0
details	object	是	子表返回结果集

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "123456789-123456789-123456787",
		"msg": "",
		"status": 0,
		"details": [
			{
				"id": "123456789-123456789-123456787-01",
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
500	{ "code": "500", "message": "解析加班调整单JSON失败", "data": null }	检查调整单json
300	示例：参数JSON中缺少overtimebegintime！	自定义抛出的一些异常提示信息

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

