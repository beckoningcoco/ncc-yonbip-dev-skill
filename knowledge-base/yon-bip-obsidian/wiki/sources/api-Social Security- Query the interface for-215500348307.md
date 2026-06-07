---
title: "社保：查询业务办理待减员接口"
apiId: "2155003483075903492"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Processing - To be Terminated"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Processing - To be Terminated]
platform_version: "BIP"
source_type: community-api-docs
---

# 社保：查询业务办理待减员接口

>  请求方式	POST | Business Processing - To be Terminated (CPSM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/insuranceArchive/queryStaffReduceData
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情批量查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
ids	string	是	否	主表id，单独传时，返回全部主子表数据 示例：["1950779385794002950"]
detailIds	string	是	否	子表id，单独传只查子表数据

## 3. 请求示例

Url: /yonbip/hrcloud/insuranceArchive/queryStaffReduceData?access_token=访问令牌
Body: {
	"ids": [
		"1950779385794002950"
	],
	"detailIds": [
		""
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	是	data
insArcId	string	否	社保档案主表id 示例：1950779385794003110
deptId	string	否	部门id 示例：2022081800003
staffReduceDetail	object	是	减员子表集合
id	string	否	减员主表id 示例：2154204206744469510
staffId	string	否	人员id 示例：1547209243451981824
orgId	string	否	组织id 示例：1525652227072458756
traceId	string	否	traceId 示例：0ac73bbdcc0ce97e
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"insArcId": "1950779385794003110",
			"deptId": "2022081800003",
			"staffReduceDetail": [
				{
					"mainId": "2154204206744469510",
					"insArcInsDtlId": "2132762845260546051",
					"isReduced": "0",
					"id": "2154204206744469510"
				}
			],
			"id": "2154204206744469510",
			"staffId": "1547209243451981824",
			"orgId": "1525652227072458756"
		}
	],
	"traceId": "0ac73bbdcc0ce97e",
	"uploadable": "0"
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

