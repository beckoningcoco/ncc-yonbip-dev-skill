---
title: "其他任职写入MDD"
apiId: "2108995733283667971"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Other Employment Processing"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Other Employment Processing]
platform_version: "BIP"
source_type: community-api-docs
---

# 其他任职写入MDD

>  请求方式	POST | Other Employment Processing (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/staffotherjob/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	数据结构体
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
verifystate	number
小数位数:0,最大长度:10	否	否	审批状态，0开立 1审批中 2审批完成 示例：0
id	string	否	否	单据ID，更新时需要
code	string	否	否	单据编码，更新时需要
bizFlowId	string	否	否	业务流ID 示例：-1
bizFlowName	string	否	否	业务流名称 示例：--
singleMode	number
小数位数:0,最大长度:10	否	否	转单模式 2 转单2 3转单3 示例：2
staffId	string	否	是	员工id(员工id和员工编码不能同时为空) 示例：1913855586458927112
staffName	string	否	否	员工名称 示例：自动化_假勤员工
staffCode	string	否	否	员工编码 示例：ZDH_JQYG
sex	string	否	否	性别 1男 2女
orgId	string	否	是	组织id 示例：1913852897819885573
orgIdName	string	否	否	组织名称 示例：自动化_假勤组织
deptId	string	否	是	变更后部门id 示例：1913855294411636740
deptIdName	string	否	否	部门名称 示例：自动化_假勤部门
businesstypeid_name	string	否	否	交易类型ID 示例：兼职开始
changeEvent	string	否	是	变动事件 5. 兼职开始 6. 兼职变更 7. 兼职结束 8. 借调开始 9. 借调变更 10. 借调结束 11. 挂职开始 12. 挂职变更 13. 挂职结束 14. 外派开始 15. 外派变更 16. 外派结束 17. 轮岗开始 18. 轮岗变更 19. 轮岗结束 示例：5 默认值：5
OperateTypeEnum	number
小数位数:0,最大长度:10	否	是	操作类型 1. 新增 2. 变更 3. 结束 示例：1
businesstypeid	string	否	是	交易类型id 示例：1913835382948495907
operatetype	string	否	是	操作类型 1新增 2延期 3结束 示例：1
staffParttimeOtherJob	object	是	是	其他任职单其他任职信息(仅能新增一个内容)
_status	string	否	是	_status Insert 新增 Update更新 示例：Insert
billStatus	number
小数位数:0,最大长度:10	否	是	单据状态.新增时固定为1 示例：1
billType	number
小数位数:0,最大长度:10	否	否	单据类型，新增时固定为1 示例：1
tpAbnormalState	number
小数位数:0,最大长度:10	否	是	异动状态新增时固定为1 示例：1
vouchdate	string	否	是	单据日期 示例：2025-01-08

## 3. 请求示例

Url: /yonbip/hrcloud/staffotherjob/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"verifystate": 0,
		"id": "",
		"code": "",
		"bizFlowId": "-1",
		"bizFlowName": "--",
		"singleMode": 2,
		"staffId": "1913855586458927112",
		"staffName": "自动化_假勤员工",
		"staffCode": "ZDH_JQYG",
		"sex": "",
		"orgId": "1913852897819885573",
		"orgIdName": "自动化_假勤组织",
		"deptId": "1913855294411636740",
		"deptIdName": "自动化_假勤部门",
		"businesstypeid_name": "兼职开始",
		"changeEvent": "5",
		"OperateTypeEnum": 1,
		"businesstypeid": "1913835382948495907",
		"operatetype": "1",
		"staffParttimeOtherJob": [
			{
				"bJobWeaken": false,
				"businesstypeid": "1913835382948495907",
				"businesstypeid_name": "兼职开始",
				"changeEvent": "5",
				"chgreasonid_name": "",
				"chgreasonid": "",
				"tempOrgName": "BZGL预制组织_编制分解",
				"tempOrgId": "1913852777560801291",
				"tempOrgvid": "1913852777560801291",
				"tempJobName": "",
				"tempDeptName": "",
				"tempJobId": "",
				"tempDeptId": "",
				"_status": "Insert",
				"outerOrgName": "",
				"id": "",
				"memo": "",
				"effectiveDate": "2025-07-30",
				"planEndDate": "2025-07-30"
			}
		],
		"_status": "Insert",
		"billStatus": 1,
		"billType": 1,
		"tpAbnormalState": 1,
		"vouchdate": "2025-01-08"
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
code	string	否	编码 示例：200
message	string	否	提示信息 示例：操作成功
data	object	否	返回数据
count	number
小数位数:0,最大长度:10	否	总数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败 示例：0
messages	string	是	提示信息
infos	object	是	其他任职单数据
failInfos	string	是	失败原因

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"staffId": "2154449990654099457",
				"orgId": "2154446400062488583",
				"deptId": "2154446632000684034",
				"businesstypeid": "2148457437527015498",
				"changeEvent": "5",
				"OperateTypeEnum": "1",
				"staffParttimeOtherJob": [
					{
						"businesstypeid": "2148457437527015498",
						"changeEvent": 5,
						"tempOrgId": "2154446400062488583",
						"beginDate": "2025-01-07 00:00:00",
						"bJobWeaken": false,
						"assigType": 1,
						"attachmentId": "1e4bdca2-d0c6-4623-ab01-f92d2af7b341",
						"businesstypeid_name": "兼职开始",
						"tempOrgName": "shixj3组织",
						"tempOrgvid": "2154446400062488583",
						"operatetype": 1,
						"tempOrgId_name": "shixj3组织",
						"id": 2173528596159660040,
						"staffParttimeId": 2173528596159660039,
						"pubts": "2025-01-07 14:40:31",
						"tenant": "0000M49TWWKV4MAHAM0000",
						"ytenant": "0000M49TWWKV4MAHAM0000",
						"effectiveDate": "2025-07-30",
						"planEndDate": "2025-07-30"
					}
				],
				"verifystate": 0,
				"bizFlowId": "-1",
				"bizFlowName": "--",
				"singleMode": 2,
				"staffName": "晓金",
				"staffCode": "shixj3",
				"orgIdName": "shixj3组织",
				"deptIdName": "shixj3部门",
				"businesstypeid_name": "兼职开始",
				"operatetype": 1,
				"workFlag": 0,
				"lastFlag": 1,
				"billStatus": 1,
				"billType": 1,
				"tpAbnormalState": 1,
				"vouchdate": "2025-01-07 00:00:00",
				"code": "PART000008",
				"applicantid": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"applicantname": "默认用户",
				"applydate": "2025-01-07 00:00:00",
				"createDate": "2025-01-07 14:40:31",
				"creatorName": "默认用户",
				"creatorId": 2148456234947706886,
				"createTime": "2025-01-07 14:40:31",
				"orgvid": "2154446400062488583",
				"orgId_name": "shixj3组织",
				"deptvid": "2154446632000684034",
				"deptId_name": "shixj3部门",
				"id": 2173528596159660039,
				"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"isWfControlled": true,
				"pubts": "2025-01-07 14:40:32",
				"tenant": "0000M49TWWKV4MAHAM0000",
				"ytenant": "0000M49TWWKV4MAHAM0000"
			}
		],
		"failInfos": [
			""
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
999	后台逻辑异常	联系管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-30	
新增
请求参数 effectiveDate
新增
请求参数 planEndDate
删除
请求参数 assigType
删除
请求参数 beginDate
新增
返回参数 effectiveDate
新增
返回参数 planEndDate

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

