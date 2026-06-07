---
title: "offer单提交MDD"
apiId: "2201580977368596487"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Offer Management Center"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Offer Management Center]
platform_version: "BIP"
source_type: community-api-docs
---

# offer单提交MDD

>  请求方式	POST | Offer Management Center (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/bill/offersubmit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
serviceCode	string	query	否	offer单据的serviceCode    默认值: HRRZMD140
Body参数
名称	类型	数组	必填	描述
data	object	否	是	数据结构体
billId	string	否	是	offer单据id 示例：2053376422009110529

## 3. 请求示例

Url: /yonbip/hrcloud/bill/offersubmit?access_token=访问令牌&serviceCode=
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
id	string	否	id 示例：2201583356784148481
name	string	否	姓名 示例：高昂202502140952
selfEmail	string	否	个人邮箱 示例：gaoang202502140952@163.com
transtypeName	string	否	交易类型 示例：正式员工录用
psnclId	string	否	人员类别Id 示例：42b5bb3ab66147f7b194bb27ea54ae78
founderId	string	否	制单人Id 示例：2022115210577313792
psnclIdName	string	否	人员类别 示例：实习生
verifystate	number
小数位数:0,最大长度:10	否	审批状态 0-未提交,1-审批中,2-已审核,3-已终止,4-已驳回 示例：1
founderName	string	否	制单人 示例：测试环境管理员
createTime	string	否	创建时间 示例：2025-02-14 09:53:57
transtypeId	string	否	Offer类型 示例：1921775059325682470
candidateIdEntrySchemeId	string	否	候选人入职方案id 示例：1980644956260794371
pubts	string	否	时间戳 示例：2025-02-14 09:56:28
certType	string	否	证件类型 示例：2075535472617586692
hrOfferTZDefines	object	否	特征
bizFlowId	string	否	业务流ID 示例：-1
candidateCode	string	否	候选人编码 示例：用友网络人【2025】第【069】号
entrySchemeId	string	否	入职方案 示例：1980644956260794371
orgId	string	否	所属组织 示例：1921226540467093515
dr	number
小数位数:0,最大长度:10	否	逻辑删除标记 示例：0
shopAssisTag	boolean	否	店员 示例：false
bizFlowName	string	否	流程名称 示例：--
schemeCategoryId	string	否	入职方案类别 示例：1980581803061673990
creator	string	否	创建人 示例：99ea7655-00a2-4bda-b23c-19ade37ea574
deptVid	string	否	部门(时间轴) 示例：1994697780018806789
isWfControlled	boolean	否	是否审批流控制 示例：true
ytenant	string	否	租户id 示例：0000LS304VH0A3GMBL0000
bizManTag	boolean	否	业务员 示例：false
mobile	string	否	手机号 示例：+86-18522345671
deptId	string	否	部门 示例：1994697780018806789
orgVid	string	否	组织(时间轴) 示例：1921226540467093515
offerStatus	number
小数位数:0,最大长度:10	否	Offer状态 0-待发offer,1-已发offer,2-已接收offer,3-已拒绝offer,4-已失效offfer,5-录用终止 示例：0
lockFlag	boolean	否	是否锁定 示例：false
certNo	string	否	证件号 示例：gaoang202502140952
singleMode	number
小数位数:0,最大长度:10	否	转单模式 示例：3
candidateId	string	否	候选人Id 示例：2201583331007004684
probation	string	是	试用期工资
hrofferJob	object	是	offer任职信息
orgRel	object	是	工作关系
salaryDoc	string	是	定调薪信息
socialInsurance	string	是	社保增员
submitdate	string	否	submitdate 示例：2025-02-14 00:00:00
mobileBillNo	string	否	mobileBillNo 示例：hr_offer_cardMobileArchive
mobileBillType	string	否	mobileBillType 示例：yyarchive
status	number
小数位数:0,最大长度:10	否	status 示例：3
code	string	否	编码 示例：LYD250214234
submitResponse	object	否	submitResponse
traceId	string	否	traceId 示例：54033c8c8a1b7a4a
uploadable	string	否	uploadable 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2201583356784148481",
		"name": "高昂202502140952",
		"selfEmail": "gaoang202502140952@163.com",
		"transtypeName": "正式员工录用",
		"psnclId": "42b5bb3ab66147f7b194bb27ea54ae78",
		"founderId": "2022115210577313792",
		"psnclIdName": "实习生",
		"verifystate": 1,
		"founderName": "测试环境管理员",
		"createTime": "2025-02-14 09:53:57",
		"transtypeId": "1921775059325682470",
		"candidateIdEntrySchemeId": "1980644956260794371",
		"pubts": "2025-02-14 09:56:28",
		"certType": "2075535472617586692",
		"hrOfferTZDefines": {
			"ytenant": "0000LS304VH0A3GMBL0000",
			"id": "2201583356784148484",
			"pubts": "2025-02-14 09:53:57",
			"dr": 0
		},
		"bizFlowId": "-1",
		"candidateCode": "用友网络人【2025】第【069】号",
		"entrySchemeId": "1980644956260794371",
		"orgId": "1921226540467093515",
		"dr": 0,
		"shopAssisTag": false,
		"bizFlowName": "--",
		"schemeCategoryId": "1980581803061673990",
		"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
		"deptVid": "1994697780018806789",
		"isWfControlled": true,
		"ytenant": "0000LS304VH0A3GMBL0000",
		"bizManTag": false,
		"mobile": "+86-18522345671",
		"deptId": "1994697780018806789",
		"orgVid": "1921226540467093515",
		"offerStatus": 0,
		"lockFlag": false,
		"certNo": "gaoang202502140952",
		"singleMode": 3,
		"candidateId": "2201583331007004684",
		"probation": [
			""
		],
		"hrofferJob": [
			{
				"trnsEvent": "1",
				"empform": "1921249003122982921",
				"deptVid": "1994697780018806789",
				"ytenant": "0000LS304VH0A3GMBL0000",
				"deptId": "1994697780018806789",
				"orgVid": "1921226540467093515",
				"orgId": "1921226540467093515",
				"dr": 0,
				"hrofferId": "2201583356784148481",
				"beginDate": "2025-02-28 00:00:00",
				"id": "2201583356784148482",
				"psnclId": "42b5bb3ab66147f7b194bb27ea54ae78",
				"trnsType": "1921775059325682365",
				"isweaken": false
			}
		],
		"orgRel": [
			{
				"isReturn": false,
				"ytenant": "0000LS304VH0A3GMBL0000",
				"id": "2201583356784148483",
				"yTenantId": "0000LS304VH0A3GMBL0000",
				"dr": 0,
				"hrofferId": "2201583356784148481"
			}
		],
		"salaryDoc": [
			""
		],
		"socialInsurance": [
			""
		],
		"submitdate": "2025-02-14 00:00:00",
		"mobileBillNo": "hr_offer_cardMobileArchive",
		"mobileBillType": "yyarchive",
		"status": 3,
		"code": "LYD250214234",
		"submitResponse": {
			"id": "e572ef62-ea76-11ef-b604-9eff1acf25db",
			"businessKey": "hr_offer_card_2201583356784148481",
			"processDefinitionId": "pc_importe3ff2956:4:00b792af-c265-11ee-b2c3-e6b9ce3d995d",
			"startTime": "2025-02-14 09:56:24",
			"startUserId": "99ea7655-00a2-4bda-b23c-19ade37ea574",
			"variables": [
				""
			],
			"tenantId": "0000LS304VH0A3GMBL0000_HREM",
			"name": "offer办理LYD250214234",
			"hasTaskFinished": false,
			"withdrawAll": false,
			"source": "HREM",
			"bpmCallbackRequestTs": 1739498187970
		}
	},
	"traceId": "54033c8c8a1b7a4a",
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
999	未找到流程定义,请检查单据对应交易类型、单据类型和组织下是否存在对应的流程模型	

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

