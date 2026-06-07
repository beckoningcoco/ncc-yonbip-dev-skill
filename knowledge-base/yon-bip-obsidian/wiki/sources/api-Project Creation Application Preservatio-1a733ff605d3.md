---
title: "报警中心保存"
apiId: "1a733ff605d34efea2b7d8b1d65227cf"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project Initiation Application"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project Initiation Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 报警中心保存

>  请求方式	POST | Project Initiation Application (PMPP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/eiotalarmcenterlist/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	报警中心参数对象
pk_equip	string	否	是	资产卡片id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：202308140001
pk_measure_point	string	否	否	资产卡片的测量点id或编码，最大传参长度：id（最大36位），编码（最大40位） 示例：CLD0001
alarm_value	string	否	否	报警值，最大传参长度：36 示例：报警值信息
pk_alarmlevel	string	否	否	报警等级id或编码(预制报警等级编码有：01严重,02警告,03一般，其他见报警等级档案)，最大传参长度：id（最大36位），编码（最大50位） 示例：03
fault_code	string	否	否	故障代码，最大传参长度：50 示例：A01
alarm_status	string	否	否	报警状态，最大传参长度：36 示例：报警状态信息
alarm_time	DateTime	否	否	报警时间（格式yyyy-MM-dd HH:mm:ss） 示例：2023-04-04 11:38:52
alarm_desc	string	否	否	报警描述，最大传参长度：200 示例：报警描述信息
alarm_rule	string	否	否	报警规则，最大传参长度：200 示例：报警规则
alarm_group	string	否	否	报警分组，最大传参长度：100 示例：报警分组
alarm_id	string	否	否	报警id 示例：2354470173755834370
alarm_type	string	否	否	数据类型(0:开始/1:恢复） 示例：0 默认值：0

## 3. 请求示例

Url: /yonbip/am/eiotalarmcenterlist/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_equip": "202308140001",
			"pk_measure_point": "CLD0001",
			"alarm_value": "报警值信息",
			"pk_alarmlevel": "03",
			"fault_code": "A01",
			"alarm_status": "报警状态信息",
			"alarm_time": "2023-04-04 11:38:52",
			"alarm_desc": "报警描述信息",
			"alarm_rule": "报警规则",
			"alarm_group": "报警分组",
			"alarm_id": "2354470173755834370",
			"alarm_type": "0"
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
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
count	long	否	总数 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
failInfos	object	是	错误详细信息
messages	object	是	返回详细信息
infos	object	是	数据详细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"failInfos": [
			{}
		],
		"messages": [
			{}
		],
		"infos": [
			{
				"id": "1691758214627459078",
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"creator__name": "YonSuite默认用户",
				"creationtime": "2022-12-06 11:29:30",
				"pk_org": "1549948023821303815",
				"pk_org__name": "资产测试集团",
				"pk_equip": "1608794401562689542",
				"pk_equip__equip_code": "资产编码信息",
				"pk_equip__equip_name": "资产名称信息",
				"pk_measure_point": "1853754897759469577",
				"pk_measure_point__measure_point_code": "CLD0001",
				"pk_measure_point__measure_point_name": "部位2",
				"alarm_value": "报警值信息",
				"pk_alarmlevel": "报警等级",
				"pk_alarmlevel__code": "报警等级编码信息(预制报警等级编码有：01严重,02警告,03一般，其他见报警等级档案)",
				"pk_alarmlevel__name": "报警等级名称信息",
				"do_not_disturb": 0,
				"fault_code": "A01",
				"alarm_status": "报警状态信息",
				"alarm_time": "2023-04-04 12:34:52",
				"alarm_desc": "报警描述信息",
				"alarm_rule": "报警规则信息",
				"alarm_group": "报警分组信息",
				"process_result": 0,
				"alarm_id": "2354470173755834370",
				"alarm_type": "0"
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
999	输入数据检查异常	请检查传入数据的正确性

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-04	
更新
请求说明
新增
请求参数 alarm_id
新增
请求参数 alarm_type
新增
返回参数 alarm_id
新增
返回参数 alarm_type
取消alarm_id、alarm_type字段必填

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

