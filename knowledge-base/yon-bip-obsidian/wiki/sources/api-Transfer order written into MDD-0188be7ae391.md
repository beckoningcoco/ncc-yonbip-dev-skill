---
title: "调动单写入MDD"
apiId: "0188be7ae3914ac8ad175bb8c5bc6eb6"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Transfer"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Transfer]
platform_version: "BIP"
source_type: community-api-docs
---

# 调动单写入MDD

>  请求方式	POST | Transfer (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/staffchange/save
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
id	string	否	否	调动单据id(更新必填) 示例：2534691055587584
staffId	string	否	否	调动人员id
staffcode	string	否	否	调动员工编码(调动员工id和调动
_status	string	否	是	主表操作类型(Insert插入、Update更新) 示例：Insert
salarychgdocList	object	是	否	定调薪子表
staffChangeWorkingRelList	object	是	否	调动单工作关系(仅能新增一个内容)
staffchangeNewInfo	object	是	否	调动单任职变更后(仅能新增一个内容)
probation	object	是	否	调动后试用信息(仅能新增一个内容）
contract	object	是	否	合同协议调整(仅能新增一个内容)

## 3. 请求示例

Url: /yonbip/hrcloud/staffchange/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "2534691055587584",
		"staffId": "",
		"staffcode": "",
		"_status": "Insert",
		"salarychgdocList": [
			{
				"id": "2555194553618689",
				"billId": "2534691055587584",
				"newBeginDate": "2022-01-13",
				"newEndDate": "2023-01-13",
				"newPkWaItem": "7df9b433738f487d9ae07a87de6cb2fb",
				"newPkWaItemcode": "f_n_28",
				"newNegotiation": "false",
				"newSalaryStandardType": "e88299ca7fb948ca97d01d905091c25c",
				"newSalaryStandardTypecode": "0056",
				"newSalaryStandard": "1eb3793fa56645b692a99579e42e91f8",
				"newSalary": "30000",
				"_status": "Insert"
			}
		],
		"staffChangeWorkingRelList": [
			{
				"id": "2555194553618686",
				"billId": "2534691055587584",
				"staffcode": "000000000000000000000045",
				"startDate": "2022-02-18",
				"groupDate": "2020-05-09",
				"groupAgeAdjType": "1",
				"groupAgeAdjYea": "1",
				"groupAgeAdjMon": "2",
				"groupAgeAdjDay": "3",
				"groupWorkAgeAdj": "4",
				"seniorityDate": "2020-05-09",
				"seniorityAdj": "8",
				"seniorityAdjType": "0",
				"seniorityAdjYea": "4",
				"seniorityAdjMon": "5",
				"seniorityAdjDay": "6",
				"_status": "Insert"
			}
		],
		"staffchangeNewInfo": [
			{
				"id": "",
				"billId": "",
				"effectivedate": "2025-05-09",
				"chgtypeid": "343546578900",
				"chgtypecode": "hrem_change1",
				"chgreasonid": "",
				"chgreasoncode": "",
				"neworgid": "",
				"neworgidcode": "",
				"newdeptid": "",
				"newdeptcode": "",
				"newpsnclid": "",
				"newpsnclcode": "",
				"bJobWeaken": false,
				"newpostid": "2547705032758016",
				"newpostcode": "00000004",
				"newjobtypeid": "2530774638825728",
				"newjobtypecode": "test01",
				"newjobpostid": "2530774917419267",
				"newjobpostidcode": "zhiwei 001",
				"newjobid": "2530775934898432",
				"newjobcode": "test01",
				"newjobgradeid": "2530775537275136",
				"newjobgradecode": "test03",
				"newjobrankid": "2530774917419264",
				"newjobrankcode": "test02",
				"newempformid": "2523412072730881",
				"newempformidcode": "test05",
				"newrptrelid": "2523412072730880",
				"newrptrelidcode": "000000000000000000000001",
				"newworkaddrid": "2547705032758016",
				"newworkaddridcode": "test06",
				"newsocialinsuraddrid": "547705032758425",
				"newsocialinsuraddridcode": "adaw001",
				"newwastruct": "123242425307759",
				"jobinfoattachment": "",
				"newcountry": "",
				"newtimezone": "",
				"newaccountorgid": "224242530775922",
				"newaccountorgidcode": "wewe001",
				"newwageGroupid": "542425307759225",
				"newwageGroupidcode": "xinzi001",
				"newpoststateid": "177050327584252",
				"newpoststateidcode": "zaigang001",
				"newstaffFte": "14%",
				"newmemo": "",
				"jobMgrGradeId": "370503275842523",
				"jobMgrGradeIdcode": "guanl99",
				"ischangeorg": true,
				"ischangedept": "false",
				"_status": "Insert"
			}
		],
		"probation": [
			{
				"id": "",
				"billId": "",
				"beginDate": "2025-09-12",
				"endDate": "2025-09-12",
				"probationTerm": "1",
				"termUnit": "",
				"memo": "",
				"_status": "Insert"
			}
		],
		"contract": [
			{
				"id": "",
				"billId": "",
				"mainCtrtId": "",
				"beginDate": "2025-09-12",
				"endDate": "2025-09-12",
				"majorCorp": "",
				"majorCorpcode": "",
				"contractNum": "",
				"contractType": "",
				"contractTypecode": "",
				"adjustType": "",
				"termType": "",
				"term": "",
				"termUnit": "",
				"workAddr": "",
				"workAddrcode": "",
				"signDate": "2026-06-07 13:00:36",
				"memo": "",
				"attachment": "",
				"relieveDate": "",
				"relieveProposer": "",
				"cmpDissReason": "",
				"cmpDissReasoncode": "",
				"relieveReason": "",
				"relieveReasoncode": "",
				"neconoMoney": "",
				"breachMoney": "",
				"relieveMemo": "",
				"relieveAttachment": "",
				"_status": "Insert"
			}
		]
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
code	string	否	响应参数 示例：200
message	string	否	整体响应信息 示例：操作成功
data	object	否	整体数据
count	long	否	总数据条数 示例：1
sucessCount	long	否	成功数据条数 示例：1
failCount	long	否	失败数据条数 示例：0
messages	string	是	响应信息
infos	object	是	数据

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
				"id": "2552161948537088",
				"billstate": 1,
				"applicantname": "YonSuite默认用户",
				"applydate": "2021-12-08 21:53:23",
				"applicantid": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"chgtypeid": "2522040356099234",
				"chgtypecode": "hrem_change1",
				"chgreasonid": "2522040384786688",
				"chgreasoncode": "3001001",
				"effectivedate": "2022-01-13 00:00:00",
				"staffId": "2534691055587584",
				"staffId_name": "张三",
				"staffcode": "000000000000000000000045",
				"orgid": "2522268046496768",
				"orgid_name": "大连花心",
				"oldorgid": "2522268046496768",
				"oldorgid_name": "大连花心",
				"deptid": "大连花心",
				"deptid_name": "BIP事业部",
				"olddeptid": "2522268611859456",
				"olddeptid_name": "BIP事业部",
				"email": "123654@22.com",
				"psnclid": "bdd1fec5738a4413b4cd18ac907e5d3a",
				"psnclid_name": "自有员工",
				"oldpsnclid": "bdd1fec5738a4413b4cd18ac907e5d3a",
				"oldpsnclid_name": "自有员工",
				"rptrel": "2523412072730880",
				"rptrel_name": "小天使",
				"postid": "2547705032758016",
				"oldrptrel": "2523412072730880",
				"oldrptrel_name": "小天使",
				"oldpostid": "2547705032758016",
				"oldpostid_name": "test周",
				"oldjobid": "2530775934898432",
				"oldjobid_name": "test职务",
				"oldjobgradeid": "2530775537275136",
				"oldjobgradeid_name": "test职级",
				"oldjobrankid": "2530774917419264",
				"oldjobrankid_name": "test职等",
				"oldworkaddr": "2523379873108224",
				"oldworkaddr_name": "北京",
				"oldsocialinsuraddr": "2523379873108224",
				"oldsocialinsuraddr_name": "北京",
				"oldjobtypeid": "2530774638825728",
				"oldpoststateid": "0000KW36P4TH42M9LO00001000000ffp",
				"oldpoststateid_name": "正常在岗",
				"newsocialinsuraddrcode": "0001",
				"newsocialinsuraddr": "2523379873108224",
				"newworkaddr": "2523379873108224",
				"newworkaddrcode": "0001",
				"neworgid": "2522268046496768",
				"neworgidcode": "003",
				"oldEmployerId": "1695465931135778822",
				"oldEmployerId_name": "zmy组织",
				"newdeptid": "2522268611859456",
				"newdeptcode": "00301",
				"newpsnclid": "bdd1fec5738a4413b4cd18ac907e5d3a",
				"newpsnclcode": "01",
				"newpostid": "2547705032758016",
				"newpostcode": "00000004",
				"newjobtypeid": "2530774638825728",
				"newjobtypecode": "test01",
				"newjobid": "2530775934898432",
				"newjobcode": "test01",
				"newjobgradeid": "2530775537275136",
				"newjobgradecode": "test03",
				"newjobrankid": "2530774917419264",
				"newjobrankcode": "test02",
				"newrptrel": "2523412072730880",
				"newrptrelcode": "000000000000000000000001",
				"isprobation": true,
				"probationbegindate": "2021-07-13",
				"probationperiod": 3,
				"probationunit": 2,
				"probationenddate": "2021-10-12",
				"attachment": "0658f610-e37e-11eb-becb-2f9fc7063872",
				"salarychgdocList": [
					{
						"newBeginDate": "2022-01-13 00:00:00",
						"newEndDate": "2022-03-13 00:00:00",
						"newPkWaItem": "7df9b433738f487d9ae07a87de6cb2fb",
						"newNegotiation": "false",
						"newSalaryStandardType": "35a00159775b40fdb586f8b8969b894a",
						"newSalaryStandardTypecode": "0056",
						"newSalary": 30000,
						"newSalaryStandard": "1eb3793fa56645b692a99579e42e91f8",
						"newSalaryStandard_value": 30000,
						"newSalaryLevelScope": "30000",
						"oldSalary": "10000",
						"oldSalaryStandardType_name": "周测03",
						"oldSalaryStandard_name": "薪级1/薪档1",
						"oldSalaryLevelScope": "10000.00",
						"billId": "2552291209793792",
						"id": "2552291209793793"
					}
				],
				"staffChangeWorkingRelList": [
					{
						"employerId": "1685782291738525707",
						"employerId_name": "大碗组织",
						"staffcode": "000000000000000000000045",
						"startDate": "2022-02-18",
						"groupDate": "2020-05-09",
						"groupWorkAgeAdj": 1,
						"seniorityAdj": 3,
						"seniorityDate": "2020-05-09"
					}
				],
				"probation": {
					"id": "91738525707235566",
					"billId": "1173852570711344",
					"beginDate": "2020-05-09",
					"endDate": "2020-05-09",
					"probationTerm": "1",
					"termUnit": "1",
					"memo": ""
				},
				"contract": {
					"id": "",
					"billId": "",
					"mainCtrtId": "",
					"beginDate": "2020-05-09",
					"endDate": "2020-05-09",
					"majorCorp": "",
					"contractNum": "",
					"contractType": "",
					"adjustType": "",
					"termType": "",
					"term": "",
					"termUnit": "",
					"signDate": "",
					"workAddr": "",
					"memo": "",
					"attachment": "",
					"relieveDate": "2026-06-07 13:00:36",
					"relieveProposer": "",
					"cmpDissReason": "",
					"cmpDissReasoncode": "",
					"relieveReason": "",
					"relieveReasoncode": "",
					"neconoMoney": "",
					"breachMoney": "",
					"relieveMemo": "",
					"relieveAttachment": ""
				},
				"staffchangeNewInfo": {
					"id": "",
					"billId": "2013946930014453764",
					"effectivedate": "2025-09-30",
					"chgtypeid": "",
					"chgtypeid_name": "",
					"chgreasonid": "2055454567791853578",
					"chgreasonid_name": "",
					"neworgid": "2055454567791853578",
					"neworgid_name": "",
					"newdeptid": "2055454567791853578",
					"newdeptid_name": "",
					"newpsnclid": "1944060794209042439",
					"newpsnclid_name": "",
					"bJobWeaken": true,
					"newpostid": "1944060794209042439",
					"newpostid_name": "",
					"newjobtypeid": "1944060794209042439",
					"newjobtypeid_name": "",
					"newjobpostid": "2013946930014453764",
					"newjobpostid_name": "",
					"newjobid": "2290046549079621640",
					"newjobid_name": "",
					"newjobgradeid": "2290046549079621640",
					"newjobgradeid_name": "",
					"newjobrankid": "2055454567791853578",
					"newjobrankid_name": "",
					"newempformid": "1921252902976356362",
					"newempformid_name": "",
					"newrptrelid": "1921252902976356362",
					"newrptrelid_name": "",
					"newworkaddrid": "1921252902976356362",
					"newworkaddrid_name": "",
					"newsocialinsuraddrid": "1941372909204799506",
					"newsocialinsuraddrid_name": "",
					"newwastruct": "",
					"jobinfoattachment": "",
					"newcountry": "",
					"newtimezone": "",
					"newaccountorgid": "1921775505983930373",
					"newaccountorgid_name": "",
					"newwageGroupid": "1921252902976356362",
					"newwageGroupid_name": "",
					"newpoststateid": "2210666439518978049",
					"newpoststateid_name": "",
					"newstaffFte": "14%",
					"newmemo": "",
					"jobMgrGradeId": "2055454567791853578",
					"jobMgrGradeId_name": "",
					"ischangedept": true,
					"ischangeorg": false
				}
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
999	后台逻辑异常	联系管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-11	
新增
请求参数 (5)
移动领域
	2	2025-07-09	
新增
请求参数 (5)
更新
请求参数 (33)
增加示例
	3	2025-06-30	
新增
请求参数 (92)
更新
请求参数 staffId
更新
请求参数 staffcode
更新
请求参数 _status
删除
请求参数 (34)
新增
返回参数 (86)
修改目录
	4	2025-06-28	
新增
请求参数 (92)
更新
请求参数 staffId
更新
请求参数 staffcode
更新
请求参数 _status
删除
请求参数 (34)
新增
返回参数 (86)
	5	2025-05-13	
新增
请求参数 (8)
更新
请求参数 groupDate
更新
请求参数 groupWorkAgeAdj
更新
请求参数 seniorityAdj

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

