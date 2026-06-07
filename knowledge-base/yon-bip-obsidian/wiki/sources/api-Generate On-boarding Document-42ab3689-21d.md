---
title: "生成入职单"
apiId: "42ab3689-21d9-4f74-84ea-ba518d44cc4c"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Offer and Others"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Offer and Others]
platform_version: "BIP"
source_type: community-api-docs
---

# 生成入职单

>  请求方式	POST | Offer and Others (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/HRCloud/employ
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Content-Type	string	header	是	Content-Type    默认值: application/json
Body参数
名称	类型	数组	必填	描述
highestqualification	string	否	是	最高学历
applyId	string	否	是	applyId(申请人id)
corpCode	string	否	是	corpCode
mobile	string	否	是	联系电话
orgid	string	否	是	组织ID
deptid	string	否	否	部门ID
userName	string	否	是	大易用户名
sex	string	否	是	性别，1 男、2 女
password	string	否	是	大易密码
birthdate	string	否	否	出生日期（yyyy-mm-dd）
selfemail	string	否	是	个人邮箱
certtype	string	否	否	证件类型 默认值：身份证
certno	string	否	否	证件号
name	string	否	是	拟录用人员名字
applicantid	string	否	是	diwork申请人友互通id
resumeurl	string	否	否	简历链接
evaluationurl	string	否	否	面试评价链接
assessurl	string	否	否	测评链接
recruitmenttype	string	否	否	招聘类型
recruitmentitem	string	否	否	招聘项目
resumesource	string	否	否	简历来源
reemployment	string	否	否	是否二次入职
marriageandchildbirth	string	否	否	婚育情况
examinationresults	string	否	否	笔试成绩链接
personnelinformation	string	否	否	人员信息采集表链接
postid	string	否	否	岗位id 示例：1933484981522695
begindate	string	否	否	预计入职日期（yyyy-mm-dd） 示例：2022-01-01
joinworkdate	string	否	否	参加工作日期（yyyy-mm-dd） 示例：2015-01-01

## 3. 请求示例

Url: /yonbip/hrcloud/HRCloud/employ?access_token=访问令牌
Header: 
	Content-Type : ""
Body: {
	"highestqualification": "",
	"applyId": "",
	"corpCode": "",
	"mobile": "",
	"orgid": "",
	"deptid": "",
	"userName": "",
	"sex": "",
	"password": "",
	"birthdate": "",
	"selfemail": "",
	"certtype": "",
	"certno": "",
	"name": "",
	"applicantid": "",
	"resumeurl": "",
	"evaluationurl": "",
	"assessurl": "",
	"recruitmenttype": "",
	"recruitmentitem": "",
	"resumesource": "",
	"reemployment": "",
	"marriageandchildbirth": "",
	"examinationresults": "",
	"personnelinformation": "",
	"postid": "1933484981522695",
	"begindate": "2022-01-01",
	"joinworkdate": "2015-01-01"
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
code	string	否	编码
message	string	否	信息
data	object	否	返回数据

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
2000	保存录用单成功,单据ID+单据号	
5000	新增录用单失败	
5001	参数JSON中缺少corpCode	
5002	参数JSON中缺少userName	
5003	参数JSON中缺少password	
5004	P_YS_HR_HRYG_0000153859	
5006	未查询到推单人的diwork账号	

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

