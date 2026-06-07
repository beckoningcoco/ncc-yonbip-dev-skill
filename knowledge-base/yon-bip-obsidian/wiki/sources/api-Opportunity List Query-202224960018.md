---
title: "商机列表查询"
apiId: "2022249600184745985"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opportunity"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opportunity]
platform_version: "BIP"
source_type: community-api-docs
---

# 商机列表查询

>  请求方式	POST | Opportunity (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/oppt/bill/list
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
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:4	否	是	每页行数 示例：10 默认值：10
code	string	否	否	商机编码 示例：20240617000442
name	string	否	否	商机名称 示例：北分伙伴商机
opptState	string	否	否	商机状态：0-进行中；1-暂停；2-作废；3-关闭 示例：0
winLoseOrderState	string	否	否	赢丢单状态：0-赢单；1-丢单；2-未定；3-部分赢单 示例：2
opptTransType.bustype.code	string	否	否	交易类型编码 示例：oppt01
opptTransType.bustype.name	string	否	否	交易类型名称 示例：普通商机
customer.code	string	否	否	客户编码 示例：cust001
customer.name	string	否	否	客户名称 示例：mjc正式客户01
opptStage.code	string	否	否	商机阶段编码 示例：SJJD005
opptStage.name	string	否	否	商机阶段名称 示例：挖掘商机
opptSource.code	string	否	否	商机来源编码 示例：employee_recommend
opptSource.name	string	否	否	商机来源名称 示例：员工推荐
ower.code	string	否	否	负责人编码 示例：000000000000000000000002213
ower.name	string	否	否	负责人名称 示例：张三
dept.code	string	否	否	部门编码 示例：bm001
dept.name	string	否	否	部门名称 示例：销管一部
saleArea.code	string	否	否	销售区域编码 示例：001
saleArea.name	string	否	否	销售区域名称 示例：华东区
org.code	string	否	否	销售组织编码 示例：001
org.name	string	否	否	销售组织名称 示例：集团
isSum	string	否	否	查询表头:true-表头；false-表头+明细 示例：true 默认值：true
simpleVOs	object	是	否	查询条件
field	string	否	否	可作为查询条件的参数如：1:createTime(创建时间),2:modifyTime(修改时间),3:winningRate(赢单率),4:opptDate(商机日期),5:expectSignDate(预计签单日期),6:expectSignMoney(预计签单金额) 示例：createTime
op	string	否	否	逻辑符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空） 示例：between
value1	string	否	否	查询条件值1 示例：2022-12-01 00:00:00
value2	string	否	否	查询条件值2 示例：2024-12-01 00:00:00

## 3. 请求示例

Url: /yonbip/crm/oppt/bill/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "20240617000442",
	"name": "北分伙伴商机",
	"opptState": "0",
	"winLoseOrderState": "2",
	"opptTransType.bustype.code": "oppt01",
	"opptTransType.bustype.name": "普通商机",
	"customer.code": "cust001",
	"customer.name": "mjc正式客户01",
	"opptStage.code": "SJJD005",
	"opptStage.name": "挖掘商机",
	"opptSource.code": "employee_recommend",
	"opptSource.name": "员工推荐",
	"ower.code": "000000000000000000000002213",
	"ower.name": "张三",
	"dept.code": "bm001",
	"dept.name": "销管一部",
	"saleArea.code": "001",
	"saleArea.name": "华东区",
	"org.code": "001",
	"org.name": "集团",
	"isSum": "true",
	"simpleVOs": [
		{
			"field": "createTime",
			"op": "between",
			"value1": "2022-12-01 00:00:00",
			"value2": "2024-12-01 00:00:00"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	number
小数位数:0,最大长度:10	否	返回编码(200:成功，其他：失败) 示例：200
message	string	否	返回状态信息 示例：操作成功
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页数 示例：1
pageSize	number
小数位数:0,最大长度:10	否	条数 示例：80
recordCount	number
小数位数:0,最大长度:10	否	总数 示例：1
recordList	object	是	商机列表
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	开始页数 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页数 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 80,
		"recordCount": 1,
		"recordList": [
			{
				"process_versionCode": 5,
				"saleUnit_precision": 0,
				"modifier": "昵称-秦利娜",
				"num": 12,
				"modifierId": "1935996151415701505",
				"discount": 100,
				"opptDate": "2024-06-17 00:00:00",
				"saleUnit": "1869243589296914439",
				"winOrderDuration": "未赢单",
				"modifyTime": "2024-06-17 19:28:08",
				"receFollowContent": "新增商机：商机617（编码: 20240617000442）",
				"process_name": "商机_普通商机_005",
				"receFollowUpTime": "2024-06-17 16:27:45",
				"id": "2022181112638341126",
				"winningRate": 0,
				"stageDuration": "0天3小时",
				"ower": "1873799286893314054",
				"settleCustomer": "1936811585303478274",
				"modifyDate": "2024-06-17 00:00:00",
				"stageStartTime": "2024-06-17 16:25:15",
				"expectDeliveryDate": "2024-06-28 00:00:00",
				"saleArea": "2003460647293550597",
				"winLoseOrderState": 2,
				"expectSignDate": "2024-06-17 00:00:00",
				"firstStageStartTime": "2024-06-17 16:25:15",
				"product_name": "物料01",
				"currTotalDuration": "0天3小时",
				"transType": "1869243563519774305",
				"saleUnit_name": "小时",
				"name": "商机617",
				"code": "20240617000442",
				"creatorId": "1873799286874963972",
				"opptTransType_name": "普通商机",
				"remark": "12",
				"product_code": "0001000002",
				"opptState": 0,
				"opptItemId": "2022274081526644736",
				"settleCustomer_name": "客户申请测试022303",
				"followId": "2022181121228275716",
				"manageClass_name": "食物",
				"ower_name": "马继铖",
				"nonFollowUpDuration": "0天3小时",
				"opptStage_name": "挖掘商机",
				"expectSignMoney": 144,
				"manageClass": "1936787327328190471",
				"opptTransType": "1873863668431585288",
				"pubts": "2024-06-17 19:28:08",
				"org_name": "CRM集团",
				"expectSignNum": 12,
				"createDate": "2024-06-17 00:00:00",
				"creator": "昵称-马继铖",
				"product": "1936794474153771008",
				"org": "1873789786421985284",
				"saleArea_name": "北京区",
				"processStage": "2013084758469771274",
				"dept_name": "销管一部",
				"bidContentLink": "{\"linkText\":\"\",\"linkAddress\":\"\"}",
				"dept": "1873791092092043270",
				"discountMoney": 0,
				"receFollowPersion": "马继铖",
				"opptTransType_bustype": "1869243563519774305",
				"money": 144,
				"createTime": "2024-06-17 16:27:45",
				"opptStage": "1869243597876888647",
				"customer_name": "客户申请测试022303",
				"customer": "1936811585303478274"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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

