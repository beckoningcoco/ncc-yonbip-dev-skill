---
title: "id	string	否	转正单主键 示例：2552161948537088"
apiId: "2546723999535071236"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee Management - Self-Service"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee Management - Self-Service]
platform_version: "BIP"
source_type: community-api-docs
---

# id	string	否	转正单主键 示例：2552161948537088

>  请求方式	POST | Employee Management - Self-Service (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/smart_reg/getStaffRegBill
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token

## 3. 请求示例

Url: /yonbip/HCC/smart_reg/getStaffRegBill?access_token=访问令牌

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
code	string	否	响应参数 示例：200
message	string	否	整体响应信息 示例：操作成功
data	object	否	整体数据
verifystate	string	否	审批状态 示例：1
code	string	否	员工编号 示例：HR001
bizFlowId	string	否	业务流ID 示例：2552161948537088
deptvid	string	否	所属部门(时间轴) 示例：2522268611859456
deptid	string	否	所属部门id 示例：2522268611859456
orgvid	string	否	所属公司(时间轴) 示例：2522268046496768
dr	string	否	删除标记 示例：0
regorgvid	string	否	所属公司(时间轴) 示例：2522268046496768
applydate	string	否	申请日期 示例：2021-12-08 21:53:23
attachment	string	否	附件 示例：0658f610-e37e-11eb-becb-2f9fc7063872
entrydate	string	否	入职日期 示例：2021-07-13
chgtypeid	string	否	转正类型 示例：2522040356099234
applicantname	string	否	申请人姓名 示例：YonSuite默认用户
staffJobId	string	否	员工任职ID 示例：2530775934898432
regorgid	string	否	所属公司 示例：2522268046496768
bizFlowName	string	否	业务流名称 示例：员工调动流程
pubts	string	否	发布时间 示例：2021-12-09 10:00:00
staffid	string	否	人员id 示例：2534691055587584
tenant	string	否	租户ID 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
trialResult	string	否	试用结果 示例：通过
isImport	string	否	是否导入 示例：false
bJobWeaken	string	否	任职关系弱化 示例：0
creator	string	否	创建人ID 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
isWfControlled	string	否	是否审批流控制 示例：true
ytenant	string	否	租户ID 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
regdeptvid	string	否	所属部门(时间轴) 示例：2522268611859456
orgid	string	否	所属公司id 示例：2522268046496768
regdeptid	string	否	所属部门 示例：2522268611859456
billstate	number
小数位数:0,最大长度:38	否	单据状态 1. 未提交 3. 审批中 4. 审批通过 6. 已生效 7. 生效失败 10. 已撤销 12. 已驳回 13. 已终止 示例：1
employerId	string	否	雇主 示例：1695465931135778822
instanceid	string	否	流程实例ID 示例：2552291209793792
regbegindate	string	否	转正日期 示例：2022-01-13 00:00:00
bDealContract	string	否	是否处理合同 示例：true
createTime	string	否	创建时间 示例：2021-12-08 21:53:23
employerVId	string	否	雇主(时间轴) 示例：1685782291738525707
name	string	否	姓名 示例：员工调动单
billcode	string	否	单据编号 示例：DT20211208001
singleMode	string	否	单任职模式 示例：0
submitdate	string	否	提交日期 示例：2021-12-09 09:00:00
creationtime	string	否	创建时间 示例：2021-12-08 21:53:23
psnclid	string	否	人员类别id 示例：bdd1fec5738a4413b4cd18ac907e5d3a
applicantid	string	否	申请人id 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
fastaudit	string	否	快速审批 示例：false
newRegFlag	string	否	是否是新的转正单据标识 示例：0
chgtypeid_name	string	否	转正类型名称 示例：员工调动
bpmAuditorInfo	object	是	当前审批人
handoverItemInfo	object	是	转单信息
translateInfo	object	否	翻译信息
traceId	string	否	追踪ID 示例：8f9e7d6c5b4a3210-1234567890abcdef
uploadable	string	否	是否可上传 示例：true

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"verifystate": "1",
		"code": "HR001",
		"bizFlowId": "2552161948537088",
		"deptvid": "2522268611859456",
		"deptid": "2522268611859456",
		"orgvid": "2522268046496768",
		"dr": "0",
		"regorgvid": "2522268046496768",
		"applydate": "2021-12-08 21:53:23",
		"attachment": "0658f610-e37e-11eb-becb-2f9fc7063872",
		"entrydate": "2021-07-13",
		"chgtypeid": "2522040356099234",
		"applicantname": "YonSuite默认用户",
		"staffJobId": "2530775934898432",
		"regorgid": "2522268046496768",
		"bizFlowName": "员工调动流程",
		"id": "2552161948537088",
		"pubts": "2021-12-09 10:00:00",
		"staffid": "2534691055587584",
		"tenant": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"trialResult": "通过",
		"isImport": "false",
		"bJobWeaken": "0",
		"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"isWfControlled": "true",
		"ytenant": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"regdeptvid": "2522268611859456",
		"orgid": "2522268046496768",
		"regdeptid": "2522268611859456",
		"billstate": 1,
		"employerId": "1695465931135778822",
		"instanceid": "2552291209793792",
		"regbegindate": "2022-01-13 00:00:00",
		"bDealContract": "true",
		"createTime": "2021-12-08 21:53:23",
		"employerVId": "1685782291738525707",
		"name": "员工调动单",
		"billcode": "DT20211208001",
		"singleMode": "0",
		"submitdate": "2021-12-09 09:00:00",
		"creationtime": "2021-12-08 21:53:23",
		"psnclid": "bdd1fec5738a4413b4cd18ac907e5d3a",
		"applicantid": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"fastaudit": "false",
		"newRegFlag": "0",
		"chgtypeid_name": "员工调动",
		"bpmAuditorInfo": [
			{
				"billid": "2553421434209697800",
				"id": "395644b1-e776-4e0e-b539-8ebfd67a8f38",
				"name": "李晶晶"
			}
		],
		"handoverItemInfo": [
			{
				"handStatus": "1",
				"handStatusName": "办理中",
				"handlerName": "李",
				"isFinish": "false",
				"itemId": "2553421494339239941",
				"itemName": "固定资产、办公用品准备",
				"itemType": "2"
			}
		],
		"translateInfo": {
			"姓名": "陈宇",
			"员工编码": "00000097",
			"主管": "头头",
			"人员类别": "自有员工",
			"所属部门": "人力云产品部",
			"工作关系主体": "树叶组织",
			"试用信息": [
				{
					"开始日期": "2026-03-30 00:00:00",
					"期限单位": "Month",
					"结束日期": "2026-06-28 00:00:00",
					"试用期限": "2",
					"转正日期": "2026-06-29 00:00:00"
				}
			]
		}
	},
	"traceId": "8f9e7d6c5b4a3210-1234567890abcdef",
	"uploadable": "true"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

