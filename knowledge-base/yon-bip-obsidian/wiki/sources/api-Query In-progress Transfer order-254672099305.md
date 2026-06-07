---
title: "查询在途调动单"
apiId: "2546720993057964036"
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

# 查询在途调动单

>  请求方式	POST | Employee Management - Self-Service (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/smart_change/getStaffChangeBill
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

Url: /yonbip/HCC/smart_change/getStaffChangeBill?access_token=访问令牌

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
traceId	string	否	追踪ID 示例：8f9e7d6c5b4a3210-abcdef1234567890
data	object	否	整体数据
oldorgid	string	否	变更前公司 示例：2522268046496768
newpsnclid	string	否	变更后人员类别 示例：bdd1fec5738a4413b4cd18ac907e5d3a
bizFlowId	string	否	业务流程ID 示例：2552161948537089
isSendContract	boolean	否	发送电子合同 示例：true
deptvid	string	否	时间轴所属部门 示例：2522268611859457
olddeptid	string	否	变更前部门 示例：2522268611859456
newworkaddr	string	否	变更后工作地点 示例：2523379873108224
staffname	string	否	姓名 示例：张三
oldEmployerVId	string	否	调动前时间轴雇主 示例：1695465931135778823
dr	number
小数位数:0,最大长度:38	否	删除标识（0未删除 1已删除） 示例：0
staffcode	string	否	员工编码 示例：000000000000000000000045
whetherDeal	boolean	否	是否处理合同 示例：true
chgtypeid	string	否	变动类型 示例：2522040356099234
newChangeFlag	boolean	否	是否是新的调动单据标识 示例：false
applicantname	string	否	申请人姓名 示例：YonSuite默认用户
bizFlowName	string	否	业务流程名称 示例：员工调动审批流程
id	string	否	单据id 示例：2552161948537088
tenant	string	否	租户ID 示例：00001951-7ca3-47ac-a462-d5a66e3e6725
bJobWeaken	boolean	否	档案关系弱化 示例：false
isWfControlled	boolean	否	是否审批流控制 示例：true
neworgid	string	否	变更后公司 示例：2522268046496768
oldpostid	string	否	变更前岗位 示例：2547705032758016
orgid	string	否	所属公司 示例：2522268046496768
applicantstaffid	string	否	申请人员工ID 示例：2534691055587585
oldpostvid	string	否	时间轴变更前岗位 示例：2547705032758017
newpostvid	string	否	时间轴变更后岗位 示例：2547705032758018
creationtime	string	否	创建时间 示例：2021-12-08 21:53:23
applicantid	string	否	申请人id 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
psnclid	string	否	人员类别 示例：bdd1fec5738a4413b4cd18ac907e5d3a
applicantemail	string	否	申请人邮箱 示例：123654@22.com
ischangectrt	boolean	否	调整合同协议 示例：true
verifystate	number
小数位数:0,最大长度:38	否	审批状态 示例：1
code	string	否	合同编码 示例：hrem_change1001
deptid	string	否	所属部门 示例：2522268611859456
isprobation	boolean	否	是否试用 示例：true
effectivedate	string	否	生效日期 示例：2022-01-13 00:00:00
orgvid	string	否	时间轴所属公司 示例：2522268046496769
oldEmployerId	string	否	调动前雇主 示例：1695465931135778822
applydate	string	否	申请日期 示例：2021-12-08 21:53:23
oldworkaddr	string	否	变更前工作地点 示例：2523379873108224
pubts	string	否	时间戳 示例：20240520102030
email	string	否	工作邮箱 示例：123654@22.com
isImport	boolean	否	是否导入 示例：false
creator	string	否	创建人 示例：YonSuite默认用户
isStop	boolean	否	是否解除/终止合同 示例：false
ytenant	string	否	租户 示例：00001951-7ca3-47ac-a462-d5a66e3e6726
oldpsnclid	string	否	变更前人员类别 示例：bdd1fec5738a4413b4cd18ac907e5d3a
neworgvid	string	否	时间轴变更后公司 示例：2522268046496770
newdeptid	string	否	变更后部门 示例：2522268611859456
newdeptvid	string	否	时间轴变更后部门 示例：2522268611859458
oldorgvid	string	否	时间轴变更前公司 示例：2522268046496771
billstate	number
小数位数:0,最大长度:38	否	单据状态 1. 未提交 3. 审批中 4. 审批通过 6. 已生效 7. 生效失败 10. 已撤销 12. 已驳回 13. 已终止 示例：1
newpostid	string	否	变更后岗位 示例：2547705032758016
olddeptvid	string	否	时间轴变更前部门 示例：2522268611859459
beginDate	string	否	合同开始日期 示例：2022-02-18 00:00:00
createTime	string	否	创建时间 示例：2021-12-08 21:53:23
chgreasonid	string	否	变动原因 示例：2522040384786688
billcode	string	否	申请单编号 示例：HREM20240520001
singleMode	boolean	否	是否单模式 示例：true
businessType	string	否	处理合同业务类型 示例：员工调动
fastaudit	boolean	否	是否快速审核 示例：false
staffId	string	否	调动员工id 示例：2534691055587584
isChange	boolean	否	是否签订/变更合同 示例：true
chgtypeid_name	string	否	变动类型名称 示例：部门调动
chgreasonid_name	string	否	变动原因名称 示例：业务调整
bpmAuditorInfo	object	是	当前审批人
handoverItemInfo	object	是	转单信息
translateInfo	object	否	翻译信息
uploadable	boolean	否	是否可上传 示例：true

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"traceId": "8f9e7d6c5b4a3210-abcdef1234567890",
	"data": {
		"oldorgid": "2522268046496768",
		"newpsnclid": "bdd1fec5738a4413b4cd18ac907e5d3a",
		"bizFlowId": "2552161948537089",
		"isSendContract": true,
		"deptvid": "2522268611859457",
		"olddeptid": "2522268611859456",
		"newworkaddr": "2523379873108224",
		"staffname": "张三",
		"oldEmployerVId": "1695465931135778823",
		"dr": 0,
		"staffcode": "000000000000000000000045",
		"whetherDeal": true,
		"chgtypeid": "2522040356099234",
		"newChangeFlag": false,
		"applicantname": "YonSuite默认用户",
		"bizFlowName": "员工调动审批流程",
		"id": "2552161948537088",
		"tenant": "00001951-7ca3-47ac-a462-d5a66e3e6725",
		"bJobWeaken": false,
		"isWfControlled": true,
		"neworgid": "2522268046496768",
		"oldpostid": "2547705032758016",
		"orgid": "2522268046496768",
		"applicantstaffid": "2534691055587585",
		"oldpostvid": "2547705032758017",
		"newpostvid": "2547705032758018",
		"creationtime": "2021-12-08 21:53:23",
		"applicantid": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"psnclid": "bdd1fec5738a4413b4cd18ac907e5d3a",
		"applicantemail": "123654@22.com",
		"ischangectrt": true,
		"verifystate": 1,
		"code": "hrem_change1001",
		"deptid": "2522268611859456",
		"isprobation": true,
		"effectivedate": "2022-01-13 00:00:00",
		"orgvid": "2522268046496769",
		"oldEmployerId": "1695465931135778822",
		"applydate": "2021-12-08 21:53:23",
		"oldworkaddr": "2523379873108224",
		"pubts": "20240520102030",
		"email": "123654@22.com",
		"isImport": false,
		"creator": "YonSuite默认用户",
		"isStop": false,
		"ytenant": "00001951-7ca3-47ac-a462-d5a66e3e6726",
		"oldpsnclid": "bdd1fec5738a4413b4cd18ac907e5d3a",
		"neworgvid": "2522268046496770",
		"newdeptid": "2522268611859456",
		"newdeptvid": "2522268611859458",
		"oldorgvid": "2522268046496771",
		"billstate": 1,
		"newpostid": "2547705032758016",
		"olddeptvid": "2522268611859459",
		"beginDate": "2022-02-18 00:00:00",
		"createTime": "2021-12-08 21:53:23",
		"chgreasonid": "2522040384786688",
		"billcode": "HREM20240520001",
		"singleMode": true,
		"businessType": "员工调动",
		"fastaudit": false,
		"staffId": "2534691055587584",
		"isChange": true,
		"chgtypeid_name": "部门调动",
		"chgreasonid_name": "业务调整",
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
			"调动人员": "陈宇",
			"员工编码": "00000097",
			"组织": "树叶组织",
			"部门": "人力云产品部",
			"主管": "头头",
			"职务类别": "职务类别1",
			"职务": "职务1",
			"调动后任职信息": [
				{
					"变动类型": "组织内变动",
					"生效日期": "2026-06-28 00:00:00",
					"调动后组织": "树叶组织",
					"调动后部门": "树叶部门北方大区",
					"调动后岗位": "树叶岗位1",
					"调动后主管": "头头"
				}
			]
		}
	},
	"uploadable": true
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

