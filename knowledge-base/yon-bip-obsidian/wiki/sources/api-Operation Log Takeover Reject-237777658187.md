---
title: "运行日志接班确认保存"
apiId: "2377776581874024454"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Running Log"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Running Log]
platform_version: "BIP"
source_type: community-api-docs
---

# 运行日志接班确认保存

>  请求方式	POST | Running Log (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/aomoperationlogcard/takeoverconfirm
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
billnum	string	否	是	单据编码 示例：aom_operationlog_card 默认值：aom_operationlog_card
data	object	是	是	运行日志参数对象
pk_org	string	否	是	业务单元id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1524200639876825094
bill_code	string	否	是	日志编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输，最大传参长度：50 示例：YXRZ202608020004
bill_name	string	否	是	日志名称 示例：日志名称
transi_type	string	否	是	交易类型编码（运行日志是4B16-01），最大传参长度：50 示例：4B16-01 默认值：4B16-01
edit_time	date
格式:yyyy-MM-dd	否	否	日志日期 示例：2025-01-01
operdutycate	string	否	是	运行值班类别id 示例：15161165161656
operschedule	string	否	是	运行排班id 示例：15161165161656
executeshift	string	否	是	执行班次id 示例：15161165161656
executeteam	string	否	是	执行班组id 示例：15161165161656
dutyleader	string	否	是	值班组长id 示例：15161165161656
nextopersched	string	否	是	下一班运行排班id 示例：15161165161656
nextshift	string	否	是	下一班接班班次id 示例：15161165161656
nextteam	string	否	是	下一班接班班组id 示例：15161165161656
nextleader	string	否	是	下一班接班组长id 示例：15161165161656
memo	string	否	否	备注，最大传参长度：100 示例：备注...
sourcecode	string	否	是	来源单据编码 示例：YXRZ202510090004
recordvos	object	否	是	运行日志详细信息对象集合
_status	string	否	是	状态（新增：Insert） 示例：Insert 默认值：Insert
externalData	object	否	是	扩展数据
dutyleader	string	否	是	值班组长 示例：张三
psnId	string	否	是	操作人 示例：1430601748862468097
recivepoint	string	否	否	接班概述 示例：概述
sourceid	string	否	是	来源单据id 示例：1430601748862468097
sourcename	string	否	是	来源单据名称 示例：来源单据名称

## 3. 请求示例

Url: /yonbip/ACC/aomoperationlogcard/takeoverconfirm?access_token=访问令牌
Body: {
	"billnum": "aom_operationlog_card",
	"data": [
		{
			"pk_org": "1524200639876825094",
			"bill_code": "YXRZ202608020004",
			"bill_name": "日志名称",
			"transi_type": "4B16-01",
			"edit_time": "2025-01-01",
			"operdutycate": "15161165161656",
			"operschedule": "15161165161656",
			"executeshift": "15161165161656",
			"executeteam": "15161165161656",
			"dutyleader": "15161165161656",
			"nextopersched": "15161165161656",
			"nextshift": "15161165161656",
			"nextteam": "15161165161656",
			"nextleader": "15161165161656",
			"memo": "备注...",
			"sourcecode": "YXRZ202510090004",
			"recordvos": {
				"id": "1430601748862468097",
				"main_id": "1430601748862468096",
				"pubts": "2023-02-09 17:43:27",
				"happentime": "2025-01-01 00:00:00",
				"operationtype": "15161165161656",
				"content": "内容",
				"isimport": true,
				"ispayrecive": true,
				"recorder": "15161165161656",
				"memo": "表体备注...",
				"_status": "Insert"
			},
			"_status": "Insert"
		}
	],
	"externalData": {
		"dutyleader": "张三",
		"psnId": "1430601748862468097",
		"recivepoint": "概述",
		"sourceid": "1430601748862468097",
		"sourcename": "来源单据名称"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
data	object	是	运行日志参数对象
id	string	否	运行日志主表id（新增时不填，更新时必填） 示例：1430601748862468096
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳（新增时不填，更新时必填，值为上次保存的pubts），传参格式为：yyyy-MM-dd HH:mm:ss 示例：2023-02-09 17:43:27
pk_org	string	否	业务单元id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1524200639876825094
bill_code	string	否	日志编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输，最大传参长度：50 示例：YXRZ202608020004
bill_name	string	否	日志名称 示例：日志名称
bill_status	string	否	单据状态（0：开立，3：审核中，1：已审核，2：已关闭） 示例：0 默认值：0
payrecive_status	string	否	交接班状态（1:未交接,2:交接中,3:交接驳回,4:交接完成,5:不需交接） 示例：1 默认值：1
bill_type	string	否	单据类型编码，传固定值：4B16 示例：4B16 默认值：4B16
transi_type	string	否	交易类型编码（运行日志是4B16-01），最大传参长度：50 示例：4B16-01 默认值：4B16-01
edit_time	date
格式:yyyy-MM-dd	否	日志日期 示例：2025-01-01
operdutycate	string	否	运行值班类别id 示例：15161165161656
operschedule	string	否	运行排班id 示例：15161165161656
executeshift	string	否	执行班次id 示例：15161165161656
executeteam	string	否	执行班组id 示例：15161165161656
dutyleader	string	否	值班组长id 示例：15161165161656
nextopersched	string	否	下一班运行排班id 示例：15161165161656
nextshift	string	否	下一班接班班次id 示例：15161165161656
nextteam	string	否	下一班接班班组id 示例：15161165161656
nextleader	string	否	下一班接班组长id 示例：15161165161656
paytime	date
格式:yyyy-MM-dd HH:mm:ss	否	交班时间 示例：2025-01-01 00:00:00
recivetime	date
格式:yyyy-MM-dd HH:mm:ss	否	接班时间 示例：2025-01-01 00:00:00
memo	string	否	备注，最大传参长度：100 示例：备注...
recordvos	object	是	运行日志详细信息对象集合
_status	string	否	状态（新增：Insert，更新：Update） 示例：Insert

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"data": [
			{
				"id": "1430601748862468096",
				"pubts": "2023-02-09 17:43:27",
				"pk_org": "1524200639876825094",
				"bill_code": "YXRZ202608020004",
				"bill_name": "日志名称",
				"bill_status": "0",
				"payrecive_status": "1",
				"bill_type": "4B16",
				"transi_type": "4B16-01",
				"edit_time": "2025-01-01",
				"operdutycate": "15161165161656",
				"operschedule": "15161165161656",
				"executeshift": "15161165161656",
				"executeteam": "15161165161656",
				"dutyleader": "15161165161656",
				"nextopersched": "15161165161656",
				"nextshift": "15161165161656",
				"nextteam": "15161165161656",
				"nextleader": "15161165161656",
				"paytime": "2025-01-01 00:00:00",
				"recivetime": "2025-01-01 00:00:00",
				"memo": "备注...",
				"recordvos": [
					{
						"id": "1430601748862468097",
						"main_id": "1430601748862468096",
						"pubts": "2023-02-09 17:43:27",
						"happentime": "2025-01-01 00:00:00",
						"operationtype": "15161165161656",
						"content": "内容",
						"isimport": true,
						"ispayrecive": true,
						"recorder": "15161165161656",
						"memo": "表体备注...",
						"_status": "Insert"
					}
				],
				"_status": "Insert"
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
0	未传入优惠券档案id	coupon_id值填写有误
999	输入的长度不能超过40位	请检查传入数据的正确性

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

