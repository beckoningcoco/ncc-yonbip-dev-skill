---
title: "离职单提交MDD"
apiId: "2053323396529258498"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Offboarding"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Offboarding]
platform_version: "BIP"
source_type: community-api-docs
---

# 离职单提交MDD

>  请求方式	POST | Offboarding (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/bill/submit
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
billId	string	否	是	离职单据id 示例：1846128272698769410

## 3. 请求示例

Url: /yonbip/hrcloud/bill/submit?access_token=访问令牌
Body: {
	"data": {
		"billId": "1846128272698769410"
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
deptvid	string	否	部门id 示例：1921022091530338308
employerid	string	否	工作关系主体id 示例：1921019591859372041
employervid	string	否	工作关系主体id 示例：1921019591859372041
orgvid	string	否	时间轴组织id 示例：1921019591859372041
bFirstApprove	boolean	否	第一环节是否已审批 示例：false
applicantstaffid	string	否	申请人用户Id 示例：1921022735779102721
bizFlowId	string	否	业务流ID 示例：-1
bizFlowName	string	否	流程名称 示例：--
singleMode	number
小数位数:0,最大长度:10	否	转单模式 示例：2
applicantid	string	否	申请人id 示例：e0ad2608-c5dc-48f4-8ccf-10e86e683a60
established	boolean	否	是否已占用编制 示例：false
pubts	string	否	时间戳 示例：2024-08-01 10:58:16
tenant	string	否	租户 示例：0000LS2V0212337QDR0000
fastaudit	number
小数位数:0,最大长度:10	否	是否直批 示例：0
billcode	string	否	单据编号 示例：LZ219553
id	string	否	主键 示例：2055406962473959431
billstate	number
小数位数:0,最大长度:10	否	单据状态 示例：3
name	string	否	姓名 示例：测试B031
code	string	否	员工编号 示例：B0031
entrydate	string	否	入职日期 示例：2022-06-01 00:00:00
orgid	string	否	所属组织 示例：1921019591859372041
applicantname	string	否	申请人姓名 示例：LY
deptid	string	否	所属部门 示例：1921022091530338308
applicantemail	string	否	申请人邮箱 示例：19599990001@qq.com
applydate	string	否	申请日期 示例：2024-08-01 00:00:00
dimissiontype	string	否	离职类型 示例：1920455731351913830
creator	string	否	创建人 示例：1921022744370610181
creationtime	string	否	创建时间 示例：2024-08-01 10:54:25
staffid	string	否	员工id 示例：1935866864298623071
cfmenddate	string	否	最后工作日 示例：2024-08-01 00:00:00
wastopdata	string	否	离职截薪日 示例：2024-08-01 00:00:00
psnclid	string	否	人员类别 示例：bd478110d3b74b2c8bb33893ef160cf0
cfmdistype	string	否	确认离职类型 示例：1920455731351913830
cfmtrnsreason	string	否	确认离职原因 示例：1920456040601092105
execagree	boolean	否	履行竞业限制协议 示例：false
returntype	string	否	返聘类型 示例：1920455731351913826
enddate	string	否	最后工作日 示例：2024-08-01 00:00:00
trnsreason	string	否	变动原因 示例：1920456040601092105
mobile	string	否	手机号码 示例：+86-17692990031
dr	number
小数位数:0,最大长度:10	否	逻辑删除标记 示例：0
attachment	string	否	附件Id 示例：bf804078-3e73-4d7e-8060-d570453141f5
verifystate	number
小数位数:0,最大长度:10	否	流程状态 示例：1
dimissionDefines	object	否	主表特征字段
ytenant	string	否	ytenant 示例：0000LS2V0212337QDR0000
dimissionbillJob	object	是	任职子表信息
submitdate	string	否	提交日期 示例：2024-08-01 10:58:13
mobileBillNo	string	否	移动端单据编码 示例：dimissionbillcardMobileArchive
mobileBillType	string	否	移动端单据类型 示例：yyarchive
status	number
小数位数:0,最大长度:10	否	单据状态 示例：3
instanceid	string	否	流程id 示例：e59ea65f-4fb1-11ef-9a2e-522370d548cc

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"deptvid": "1921022091530338308",
		"employerid": "1921019591859372041",
		"employervid": "1921019591859372041",
		"orgvid": "1921019591859372041",
		"bFirstApprove": false,
		"applicantstaffid": "1921022735779102721",
		"bizFlowId": "-1",
		"bizFlowName": "--",
		"singleMode": 2,
		"applicantid": "e0ad2608-c5dc-48f4-8ccf-10e86e683a60",
		"established": false,
		"pubts": "2024-08-01 10:58:16",
		"tenant": "0000LS2V0212337QDR0000",
		"fastaudit": 0,
		"billcode": "LZ219553",
		"id": "2055406962473959431",
		"billstate": 3,
		"name": "测试B031",
		"code": "B0031",
		"entrydate": "2022-06-01 00:00:00",
		"orgid": "1921019591859372041",
		"applicantname": "LY",
		"deptid": "1921022091530338308",
		"applicantemail": "19599990001@qq.com",
		"applydate": "2024-08-01 00:00:00",
		"dimissiontype": "1920455731351913830",
		"creator": "1921022744370610181",
		"creationtime": "2024-08-01 10:54:25",
		"staffid": "1935866864298623071",
		"cfmenddate": "2024-08-01 00:00:00",
		"wastopdata": "2024-08-01 00:00:00",
		"psnclid": "bd478110d3b74b2c8bb33893ef160cf0",
		"cfmdistype": "1920455731351913830",
		"cfmtrnsreason": "1920456040601092105",
		"execagree": false,
		"returntype": "1920455731351913826",
		"enddate": "2024-08-01 00:00:00",
		"trnsreason": "1920456040601092105",
		"mobile": "+86-17692990031",
		"dr": 0,
		"attachment": "bf804078-3e73-4d7e-8060-d570453141f5",
		"verifystate": 1,
		"dimissionDefines": {
			"ytenant": "0000LS2V0212337QDR0000",
			"id": "2055406962473959434",
			"pubts": "2024-08-01 10:54:26",
			"dr": 0
		},
		"ytenant": "0000LS2V0212337QDR0000",
		"dimissionbillJob": [
			{
				"newdeptvid": "1921022091530338308",
				"neworgvid": "1921019591859372041",
				"bJobWeaken": 0,
				"cfmenddate": "2024-08-01 00:00:00",
				"dimissionJobDefines": {
					"ytenant": "0000LS2V0212337QDR0000",
					"id": "2055406962473959433",
					"pubts": "2024-08-01 10:54:26",
					"dr": 0
				},
				"dimissiontypeid": "1920455731351913830",
				"enddate": "2024-08-01 00:00:00",
				"execagree": false,
				"newdeptid": "1921022091530338308",
				"neworgid": "1921019591859372041",
				"newpsnclid": "bd478110d3b74b2c8bb33893ef160cf0",
				"trnsreasonid": "1920456040601092105",
				"wastopdata": "2024-08-01 00:00:00",
				"billId": "2055406962473959431",
				"dr": 0,
				"extension": "{\"ZY101304\":false,\"dr\":0}",
				"id": "2055406962473959432",
				"tenant": "0000LS2V0212337QDR0000",
				"ytenant": "0000LS2V0212337QDR0000"
			}
		],
		"submitdate": "2024-08-01 10:58:13",
		"mobileBillNo": "dimissionbillcardMobileArchive",
		"mobileBillType": "yyarchive",
		"status": 3,
		"instanceid": "e59ea65f-4fb1-11ef-9a2e-522370d548cc"
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
	1	2025-06-04	
更新
请求参数 dimissionbillJob
修改文档任职说明为数组类型

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

