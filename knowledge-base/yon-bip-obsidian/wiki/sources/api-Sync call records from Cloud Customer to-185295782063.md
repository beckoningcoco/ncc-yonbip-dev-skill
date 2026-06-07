---
title: "云客向CRM同步通话记录"
apiId: "1852957820634791939"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "History"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, History]
platform_version: "BIP"
source_type: community-api-docs
---

# 云客向CRM同步通话记录

>  请求方式	POST | History (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/workPhone/callSyncToCrm
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
cspEnterpriseId	long	否	否	CSP平台企业ID 示例：12134
id	string	否	是	通话记录id 主键 示例：5B9B7D9354494D78950554CFF93FF317
userId	string	否	否	用户id 示例：1858383420897886209
userName	string	否	否	用户名 示例：张三
userPhone	string	否	是	用户手机号 示例：17001092352
createTime	string	否	否	通话时间 示例：2022-06-24 10:44:55
customerId	string	否	否	客户id 示例：1858384838237093892
phone	string	否	否	客户手机号 示例：15980228344
duration	int	否	否	时长-单位秒 示例：100
recordUrl	string	否	否	录音url 示例：http://yunke-pcfile.oss-cn-beijing.aliyuncs.com/call_record/aaaa/E07E88F950584E9E968354A6846D5726/2022/0624/xxx.mp3
tipName	string	否	否	二级标签 示例：优质用户
tipType	int	否	否	一级标签id 示例：0
tipTypeString	string	否	否	一级标签文字 示例：未标记
remark	string	否	否	通话备注 示例：沟通订单详情
direction	int	否	否	0呼出 1呼入 示例：0
nextContactTime	string	否	否	预约时间 示例：2022-10-01 10:44:16
callId	string	否	否	外呼id 使用接口外呼时返回的id 示例：1858390241303855107
through	boolean	否	否	是否接通 示例：false
simPhone	string	否	否	员工外呼SIM卡号码 示例：18823452345222222222
simNumber	string	否	否	员工外呼SIM卡的ICCID 示例：XXXXXX0MFSSYYGXXXXXX
progress	int	否	否	销售进度类型id（销售进度描述可以通过/open/customer/getSalesProgresses接口获取） 示例：0
ringSecond	int	否	否	响铃时长 示例：19
ringTime	string	否	否	开始响铃时间 示例：2022-06-24 10:44:50
isUpload	int	否	否	录音是否上传 0未上传 1已上传（未接通的通话显示为未上传） 示例：0

## 3. 请求示例

Url: /yonbip/crm/workPhone/callSyncToCrm?access_token=访问令牌
Body: [{
	"cspEnterpriseId": 12134,
	"id": "5B9B7D9354494D78950554CFF93FF317",
	"userId": "1858383420897886209",
	"userName": "张三",
	"userPhone": "17001092352",
	"createTime": "2022-06-24 10:44:55",
	"customerId": "1858384838237093892",
	"phone": "15980228344",
	"duration": 100,
	"recordUrl": "http://yunke-pcfile.oss-cn-beijing.aliyuncs.com/call_record/aaaa/E07E88F950584E9E968354A6846D5726/2022/0624/xxx.mp3",
	"tipName": "优质用户",
	"tipType": 0,
	"tipTypeString": "未标记",
	"remark": "沟通订单详情",
	"direction": 0,
	"nextContactTime": "2022-10-01 10:44:16",
	"callId": "1858390241303855107",
	"through": false,
	"simPhone": "18823452345222222222",
	"simNumber": "XXXXXX0MFSSYYGXXXXXX",
	"progress": 0,
	"ringSecond": 19,
	"ringTime": "2022-06-24 10:44:50",
	"isUpload": 0
}]

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
retCode	string	否	状态编码，200表示成功，其他表示失败
retMsg	string	否	状态描述，说明失败原因
data	object	否	请求返回数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"retCode": "",
		"retMsg": "",
		"data": {}
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

