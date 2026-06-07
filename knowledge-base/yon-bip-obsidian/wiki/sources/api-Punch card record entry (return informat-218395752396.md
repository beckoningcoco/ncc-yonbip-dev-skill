---
title: "打卡记录写入(返回信息可按条展示)"
apiId: "2183957523967508481"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Comprehensive Check-in Details Card"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Comprehensive Check-in Details Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 打卡记录写入(返回信息可按条展示)

>  请求方式	POST | Comprehensive Check-in Details Card (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/sign/attend/saveAttendRecordBackDetail
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
matchType	int	否	是	人员匹配方式:1按考勤卡号；2按员工编号；4按员工id处理 示例：2 默认值：2
isDeduplicated	boolean	否	否	是否去重:true是,false否.为空时默认true 示例：true 默认值：true
data	object	是	是	业务数据
sourceUnique	string	否	否	系统标识
staffCode	string	否	是	员工编号或考勤卡号或员工id,根据matchType匹配 示例：001005
date	string	否	是	打卡日期 示例：2019-10-04
code	string	否	否	编码 示例：FW20241030000001
time	string	否	是	打卡时间 示例：09:00
placeId	string	否	否	打卡地点档案中的打卡地点ID 示例：2356886101550432260
placeType	string	否	否	打卡地点类型，0-GPS；1-WiFi；2-蓝牙。要与placeId字段匹配，不传或传其他值均默认为0，只与GPS打卡地点档案匹配 示例：0 默认值：0
addressDetail	string	否	否	打卡详细地址
importInstructions	string	否	否	说明 示例：备注
timeZone	string	否	否	时区编码Id 示例：Asia/Shanghai
filePath	string	否	否	附件UUID，来源是附件上传到协同云附件服务后返回的 示例：806ca82a-ba9b-4d3f-a7d8-6142f644aaef
outside	boolean	否	否	是否外勤卡:true是,false否.为空时默认false 示例：false 默认值：false
typeId	string	否	否	外勤类型ID,字段outside=true时有效,如果需要审批则必填 示例：0000LO6R6HYU48W2DG00000000001
approveStatus	boolean	否	否	是否需要审批 true 需要审批 false 不需要审批

## 3. 请求示例

Url: /yonbip/hrcloud/time/sign/attend/saveAttendRecordBackDetail?access_token=访问令牌
Body: {
	"matchType": 2,
	"isDeduplicated": true,
	"data": [
		{
			"sourceUnique": "",
			"staffCode": "001005",
			"date": "2019-10-04",
			"code": "FW20241030000001",
			"time": "09:00",
			"placeId": "2356886101550432260",
			"placeType": "0",
			"addressDetail": "",
			"importInstructions": "备注",
			"timeZone": "Asia/Shanghai",
			"filePath": "806ca82a-ba9b-4d3f-a7d8-6142f644aaef",
			"outside": false,
			"typeId": "0000LO6R6HYU48W2DG00000000001",
			"approveStatus": true
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
message	string	否	提示信息 示例：操作成功!
data	object	否	详情信息
count	number
小数位数:0,最大长度:10	否	总数
successCount	number
小数位数:0,最大长度:10	否	成功总数
failCount	number
小数位数:0,最大长度:10	否	失败总数
messages	string	是	错误信息
failInfos	object	是	错误数据列表
infos	object	是	数据列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功!",
	"data": {
		"count": 0,
		"successCount": 0,
		"failCount": 0,
		"messages": [
			""
		],
		"failInfos": [
			{}
		],
		"infos": [
			{}
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-06	
新增
请求参数 isDeduplicated
新增
请求参数 placeId
新增
请求参数 placeType
	2	2025-06-25	
新增
请求参数 approveStatus
更新
请求参数 typeId

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

