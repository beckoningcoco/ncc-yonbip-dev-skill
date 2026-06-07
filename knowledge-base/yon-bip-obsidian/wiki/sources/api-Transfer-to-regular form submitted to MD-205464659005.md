---
title: "转正单提交MDD"
apiId: "2054646590055383042"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "End of Probation"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, End of Probation]
platform_version: "BIP"
source_type: community-api-docs
---

# 转正单提交MDD

>  请求方式	POST | End of Probation (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/bill/staffregsubmit
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
data	object	否	是	数据结构体
billId	string	否	是	转正单据id 示例：2053376422009110529

## 3. 请求示例

Url: /yonbip/hrcloud/bill/staffregsubmit?access_token=访问令牌
Body: {
	"data": {
		"billId": "2053376422009110529"
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
code	string	否	响应编码 示例：200
message	string	否	响应消息 示例：操作成功
data	object	否	提交成功的单据信息
employerId	string	否	工作关系主体 示例：1921019591859372041
employerVId	string	否	时间轴工作关系主体 示例：1921019591859372041
bizFlowId	string	否	业务流ID 示例：-1
bizFlowName	string	否	流程名称 示例：--
deptvid	string	否	时间轴部门 示例：1921022091530338308
orgvid	string	否	时间轴转正前所属公司id 示例：1921019591859372041
ytenant	string	否	租户 示例：0000LS2V0212337QDR0000
regdeptvid	string	否	时间轴部门 示例：1921022091530338308
fastaudit	number
小数位数:0,最大长度:10	否	是否直批 示例：0
regorgvid	string	否	时间轴组织 示例：1921019591859372041
singleMode	number
小数位数:0,最大长度:10	否	转单模式 示例：2
applicantstaffid	string	否	申请人用户Id 示例：1921022735779102721
staffRegDefines	object	否	转正单特征数据
applicantid	string	否	申请人id 示例：e0ad2608-c5dc-48f4-8ccf-10e86e683a60
creationtime	string	否	创建时间 示例：2024-07-31 19:55:46
creator	string	否	创建人 示例：1921022744370610181
instanceid	string	否	流程id 示例：68647b3c-52f7-11ef-8db2-be0c1ff8b5b8
isImport	boolean	否	是否导入 示例：false
newRegFlag	boolean	否	是否是新的转正单据标识 示例：true
pubts	string	否	时间戳 示例：2024-08-05 14:53:24
submitdate	string	否	提交日期 示例：2024-08-05 14:53:22
tenant	string	否	租户 示例：0000LS2V0212337QDR0000
billcode	string	否	单据编号 示例：SR252604
billstate	number
小数位数:0,最大长度:10	否	单据状态 示例：3
applydate	string	否	申请日期 示例：2024-07-31 00:00:00
id	string	否	单据id 示例：2054943801788071938
staffid	string	否	员工id 示例：1935866881478492191
name	string	否	姓名 示例：测试B048
code	string	否	员工编号 示例：B0048
entrydate	string	否	入职日期 示例：2022-06-01 00:00:00
orgid	string	否	组织id 示例：1921019591859372041
deptid	string	否	部门id 示例：1921022091530338308
psnclid	string	否	人员类别id 示例：bd478110d3b74b2c8bb33893ef160cf0
rptrel	string	否	主管id 示例：1935866847118753795
regbegindate	string	否	转正日期 示例：2024-07-10 00:00:00
chgtypeid	string	否	转正类型 示例：1920455731351913829
dr	number
小数位数:0,最大长度:10	否	逻辑删除标记 示例：0
bJobWeaken	number
小数位数:0,最大长度:10	否	档案关系弱化 示例：0
regorgid	string	否	组织id 示例：1921019591859372041
regdeptid	string	否	部门id 示例：1921022091530338308
regpsnclid	string	否	人员类别 示例：bd478110d3b74b2c8bb33893ef160cf0
regrptrel	string	否	主管 示例：1935866847118753795
trialResult	number
小数位数:0,最大长度:10	否	试用结果 示例：1
bDealContract	boolean	否	是否处理合同 示例：false
attachment	string	否	附件 示例：9197f7b1-3b1f-4dd4-8ec6-a3abdaf7a2ca
verifystate	number
小数位数:0,最大长度:10	否	流程状态 示例：1
applicantname	string	否	申请人姓名 示例：LY
applicantemail	string	否	申请人邮箱 示例：19599990001@qq.com
StaffRegJob	object	是	转正子表信息
mobileBillNo	string	否	移动端单据编码 示例：staffregcardMobileArchive
mobileBillType	string	否	移动端单据类型 示例：yyarchive
status	number
小数位数:0,最大长度:10	否	单据状态 示例：3

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"employerId": "1921019591859372041",
		"employerVId": "1921019591859372041",
		"bizFlowId": "-1",
		"bizFlowName": "--",
		"deptvid": "1921022091530338308",
		"orgvid": "1921019591859372041",
		"ytenant": "0000LS2V0212337QDR0000",
		"regdeptvid": "1921022091530338308",
		"fastaudit": 0,
		"regorgvid": "1921019591859372041",
		"singleMode": 2,
		"applicantstaffid": "1921022735779102721",
		"staffRegDefines": {
			"ytenant": "0000LS2V0212337QDR0000",
			"id": "2054943801788071941",
			"pubts": "2024-07-31 19:55:46",
			"dr": 0
		},
		"applicantid": "e0ad2608-c5dc-48f4-8ccf-10e86e683a60",
		"creationtime": "2024-07-31 19:55:46",
		"creator": "1921022744370610181",
		"instanceid": "68647b3c-52f7-11ef-8db2-be0c1ff8b5b8",
		"isImport": false,
		"newRegFlag": true,
		"pubts": "2024-08-05 14:53:24",
		"submitdate": "2024-08-05 14:53:22",
		"tenant": "0000LS2V0212337QDR0000",
		"billcode": "SR252604",
		"billstate": 3,
		"applydate": "2024-07-31 00:00:00",
		"id": "2054943801788071938",
		"staffid": "1935866881478492191",
		"name": "测试B048",
		"code": "B0048",
		"entrydate": "2022-06-01 00:00:00",
		"orgid": "1921019591859372041",
		"deptid": "1921022091530338308",
		"psnclid": "bd478110d3b74b2c8bb33893ef160cf0",
		"rptrel": "1935866847118753795",
		"regbegindate": "2024-07-10 00:00:00",
		"chgtypeid": "1920455731351913829",
		"dr": 0,
		"bJobWeaken": 0,
		"regorgid": "1921019591859372041",
		"regdeptid": "1921022091530338308",
		"regpsnclid": "bd478110d3b74b2c8bb33893ef160cf0",
		"regrptrel": "1935866847118753795",
		"trialResult": 1,
		"bDealContract": false,
		"attachment": "9197f7b1-3b1f-4dd4-8ec6-a3abdaf7a2ca",
		"verifystate": 1,
		"applicantname": "LY",
		"applicantemail": "19599990001@qq.com",
		"StaffRegJob": [
			{
				"dr": 0,
				"extension": "{\"dr\":0}",
				"staffid": "1935866881478492191",
				"regbegindate": "2024-07-10 00:00:00",
				"chgtypeid": "1920455731351913829",
				"regpsnclid": "bd478110d3b74b2c8bb33893ef160cf0",
				"bJobWeaken": 0,
				"jobinfoattachment": "9197f7b1-3b1f-4dd4-8ec6-a3abdaf7a2ca",
				"trialResult": 1,
				"regrptrelid": "1935866847118753795",
				"regorgid": "1921019591859372041",
				"regorgvid": "1921019591859372041",
				"regdeptid": "1921022091530338308",
				"regdeptvid": "1921022091530338308",
				"ytenant": "0000LS2V0212337QDR0000",
				"tenant": "0000LS2V0212337QDR0000",
				"billId": "2054943801788071938",
				"id": "2054943801788071939",
				"staffRegJobDefines": {
					"ytenant": "0000LS2V0212337QDR0000",
					"id": "2054943801788071940",
					"pubts": "2024-07-31 19:55:46",
					"dr": 0
				}
			}
		],
		"mobileBillNo": "staffregcardMobileArchive",
		"mobileBillType": "yyarchive",
		"status": 3
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
999	活动[普通审核]上找不到用户	工作流节点上不能设置发起人 应该设置指定的明确的用户

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

