---
title: "离职单写入MDD"
apiId: "1966363124969242630"
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

# 离职单写入MDD

>  请求方式	POST | Offboarding (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/dimission/save
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
id	string	否	否	数据id 插入非必填会自动生成 更新必填 示例：1846339731318112262
staffid	string	否	否	员工id 示例：1950777650710577179
staffcode	string	否	否	员工编码 示例：00000006
name	string	否	否	姓名 示例：分离10-证件类型不同
orgid	string	否	否	所属组织 示例：1950850398865588231
orgidcode	string	否	否	所属组织编码 示例：banshichu
deptidcode	string	否	否	所属部门编码 示例：jh2
deptid	string	否	否	所属部门 示例：1950850527727714307
majorcorpid	string	否	否	合同主体 示例：1957581574717308936
majorcorpidcode	string	否	否	合同主体编码
rptrel	string	否	否	主管id 示例：1859232046338304
rptrelcode	string	否	否	主管编码
jobid	string	否	否	职务id 示例：97ec0ce84ea84f6fafd7dd150ece9f17
jobidcode	string	否	否	职务编码
postid	string	否	否	岗位 示例：1849594528731392
postidcode	string	否	否	岗位编码
jobpostidcode	string	否	否	职位编码
dimissiontypecode	string	否	否	离职类型编码
trnsreasoncode	string	否	否	离职原因编码
dispositoncode	string	否	否	离职去向编码
disexplain	string	否	否	离职说明 示例：更改为地点
mobile	string	否	否	联系电话 示例：+86-13404150010
selfemail	string	否	否	个人邮箱 示例：920902076@qq.com
address	string	否	否	通讯地址 示例：北京海淀
psnclaftercode	string	否	否	离职后人员类别编码
cfmdistypecode	string	否	否	确认离职类型编码
cfmtrnsreasoncode	string	否	否	确认离职原因编码
cfmdispositoncode	string	否	否	确认离职去向编码
locationidcode	string	否	否	工作地点编码
psnclidcode	string	否	否	人员类别编码
bizFlowId	string	否	否	业务流id 示例：-1
employerid	string	否	否	工作关系主体 示例：1950850398865588231
employeridcode	string	否	否	工作关系主体编码
accountorgidcode	string	否	否	会计主体编码
education	string	否	否	学历id 示例：ff683bf3-da6f-4449-bc73-b6c6f4735b79
educationcode	string	否	否	学历编码
_status	string	否	是	数据操作方式Insert(插入)\Update(更新) 示例：Insert
dimissionbillJob	object	是	是	离职单据任职
dimissionctrtList	object	是	否	离职合同信息

## 3. 请求示例

Url: /yonbip/hrcloud/dimission/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1846339731318112262",
		"staffid": "1950777650710577179",
		"staffcode": "00000006",
		"name": "分离10-证件类型不同",
		"orgid": "1950850398865588231",
		"orgidcode": "banshichu",
		"deptidcode": "jh2",
		"deptid": "1950850527727714307",
		"majorcorpid": "1957581574717308936",
		"majorcorpidcode": "",
		"rptrel": "1859232046338304",
		"rptrelcode": "",
		"jobid": "97ec0ce84ea84f6fafd7dd150ece9f17",
		"jobidcode": "",
		"postid": "1849594528731392",
		"postidcode": "",
		"jobpostidcode": "",
		"dimissiontypecode": "",
		"trnsreasoncode": "",
		"dispositoncode": "",
		"disexplain": "更改为地点",
		"mobile": "+86-13404150010",
		"selfemail": "920902076@qq.com",
		"address": "北京海淀",
		"psnclaftercode": "",
		"cfmdistypecode": "",
		"cfmtrnsreasoncode": "",
		"cfmdispositoncode": "",
		"locationidcode": "",
		"psnclidcode": "",
		"bizFlowId": "-1",
		"employerid": "1950850398865588231",
		"employeridcode": "",
		"accountorgidcode": "",
		"education": "ff683bf3-da6f-4449-bc73-b6c6f4735b79",
		"educationcode": "",
		"_status": "Insert",
		"dimissionbillJob": [
			{
				"id": "",
				"enddate": "2024-04-15",
				"cfmenddate": "2024-04-15",
				"dimissiontypeid": "hrem_dimission1",
				"trnsreasonid": "4001001",
				"neworgid": "1950850398865588231",
				"newdeptid": "1950850527727714307",
				"newpsnclid": "f5eb2b764d9e452d922abcdb8d28be81",
				"jobinfoattachment": "6056c780-2e98-11ed-a362-efdfa26e7978",
				"dispositonid": "2182238455337481",
				"cfmdispositonid": "2182238455337481",
				"disexplain": "离职说明test01",
				"dimissiontypeidcode": "",
				"_status": "Insert",
				"newempformidcode": "",
				"trnsreasonidcode": "",
				"neworgidcode": "",
				"newdeptidcode": "",
				"newpsnclidcode": "",
				"newpostidcode": "",
				"newjobpostidcode": "",
				"newjobtypeidcode": "",
				"newjobidcode": "",
				"newjobgradeidcode": "",
				"newjobrankidcode": "",
				"newrptrelidcode": "",
				"newworkaddridcode": "",
				"retiretypeidcode": "",
				"dispositonidcode": "",
				"cfmdispositonidcode": "",
				"newwageGroupidcode": "",
				"newpoststateidcode": "",
				"afterLocalOrgIdcode": "",
				"beforeLocalOrgIdcode": ""
			}
		],
		"dimissionctrtList": [
			{
				"id": "",
				"conttype": "4",
				"relievedate": "2024-04-15",
				"presenter": "2",
				"unchreason": "1947196292245487745",
				"contractcode": "",
				"neconomy": "1111",
				"breachmoney": "1111",
				"memo": "",
				"contractnum": "CTRT06",
				"signdate": "2024-04-15 00:00:00",
				"termtype": "1",
				"begindate": "2024-04-15 00:00:00",
				"termmonth": "11",
				"ctrtenddate": "2025-03-14 00:00:00",
				"majorcorpid": "1957581574717308936",
				"workaddr": "1950857038883454978",
				"oldmemo": "",
				"attachmentctrt": "",
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
code	string	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
count	number
小数位数:0,最大长度:10	否	数据总数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功的数据数量 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败的数据数量 示例：0
messages	string	是	返回消息
infos	object	是	数据详情集合
failInfos	string	是	错误的数据集合

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
				"_entityName": "ss.mdddimissionbill.dimissionbill",
				"_keyName": "id",
				"id": "1975454204921118723",
				"applicantname": "默认用户",
				"applydate": "2024-04-15 17:25:37",
				"billstate": 1,
				"staffid": "1975234757877301252",
				"name": "分离10-证件类型不同",
				"code": "00000045",
				"entrydate": "2024-04-15 00:00:00",
				"orgid": "1950850398865588231",
				"deptid": "1950850527727714307",
				"majorcorpid": "1957581574717308936",
				"dimissiontype": "1947196283663418760",
				"mobile": "+86-13404150010",
				"attachment": "70caf9cd-399e-4d5d-923f-e0acc348ebdc",
				"psnclid": "f5eb2b764d9e452d922abcdb8d28be81",
				"returntype": "1947196283663418099",
				"bizFlowId": "-1",
				"bizFlowName": "--",
				"singleMode": 2,
				"employerid": "1950850398865588231",
				"employervid": "1950850398865588231",
				"billcode": "LZ212601",
				"_status": "Insert",
				"dimissionbillJob": [
					{
						"_entityName": "ss.mdddimissionbill.dimissionbillJob",
						"_keyName": "id",
						"enddate": "2024-04-15 00:00:00",
						"cfmenddate": "2024-04-15 00:00:00",
						"dimissiontypeid": "1947196283663418760",
						"trnsreasonid": "1947196764689793037",
						"neworgid": "1950850398865588231",
						"newdeptid": "1950850527727714307",
						"newpsnclid": "f5eb2b764d9e452d922abcdb8d28be81",
						"bJobWeaken": false,
						"execagree": false,
						"_status": "Insert",
						"newdeptid_name": "菊花部门1",
						"newpsnclid_name": "自有员工",
						"neworgid_name": "菊花组织",
						"dimissiontypeid_name": "员工主动离职",
						"trnsreasonid_name": "工作氛围",
						"wastopdata": "2024-04-15 00:00:00",
						"neworgvid": "1950850398865588231",
						"newdeptvid": "1950850527727714307",
						"id": "1975454204921118726",
						"billId": "1975454204921118723",
						"dr": 0,
						"yTenantId": "0000LTICFE3BAEJTVM0000",
						"creator": "00001951-7ca3-47ac-a462-d5a66e3e6724",
						"createTime": "2024-04-15 17:25:37",
						"tenant": "0000LTICFE3BAEJTVM0000"
					}
				],
				"dimissionctrtList": [
					{
						"_entityName": "ss.mdddimissionbill.dimissionctrt",
						"_keyName": "id",
						"conttype": 4,
						"relievedate": "2024-04-15 00:00:00",
						"presenter": 2,
						"contractnum": "CTRT06",
						"signdate": "2024-04-15 00:00:00",
						"termtype": 1,
						"begindate": "2024-04-15 00:00:00",
						"termmonth": 11,
						"ctrtenddate": "2025-03-14 00:00:00",
						"majorcorpid": "1957581574717308936",
						"workaddr": "1950857038883454978",
						"_status": "Insert",
						"id": "1779803253412859904",
						"billId": "1975454204921118723",
						"creator": 1947195665165058000,
						"creationtime": "2024-04-15 17:25:37",
						"dr": 0
					}
				],
				"dimissiontype_name": "员工主动离职",
				"staffid_name": "分离10-证件类型不同",
				"psnclid_name": "自有员工",
				"majorcorpid_name": "主体1",
				"orgid_name": "菊花组织",
				"employerid_name": "菊花组织",
				"deptid_name": "菊花部门1",
				"execagree": false,
				"trnsreason": "1947196764689793037",
				"enddate": "2024-04-15 00:00:00",
				"cfmenddate": "2024-04-15 00:00:00",
				"orgvid": "1950850398865588231",
				"deptvid": "1950850527727714307",
				"applicantid": "00001951-7ca3-47ac-a462-d5a66e3e6724",
				"established": false,
				"cfmtrnsreason": "1947196764689793037",
				"cfmdistype": "1947196283663418760",
				"creator": 1947195665165058000,
				"creationtime": "2024-04-15 17:25:37",
				"dr": 0
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
999	后端逻辑异常	联系管理员

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

