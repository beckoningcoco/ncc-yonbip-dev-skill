---
title: "会员保存V3"
apiId: "1495037090388770824"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Member File"
domain: "MemberServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Member File]
platform_version: "BIP"
source_type: community-api-docs
---

# 会员保存V3

>  请求方式	POST | Member File (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/member/save
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
data	object	否	是	数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
cCountryCode	string	否	是	移动电话国家区号(60:马来西亚,62:印尼,63:菲律宾,65:新加坡,66:泰国,852:中国香港,853:中国澳门,86:中国,886:中国台湾,95:缅甸) 示例：86 默认值：86
cPhone	string	否	是	手机号 示例：16211111111
cRealName	string	否	否	姓名 示例：姓名
iSex	string	否	否	性别（0：保密，1：男，2：女） 示例：0
iIdentityType	string	否	否	证件类型（1:身份证,2:护照,3:教师证,4:警官证,100:其他） 示例：1
bInBlackList	int	否	否	列入黑名单(1:是,0：否) 示例：1
iIdentityNum	string	否	否	证件号码 示例：111111111
cEmail	string	否	否	邮箱
iStop	string	否	否	是否停用（0：否，1：是） 示例：0
cZipCode	string	否	否	邮编 示例：邮编
iBirthdayType	string	否	否	生日类型（0：公历，1：农历） 示例：1
dBirthdayDate	string	否	否	生日(格式：yyyy-MM-dd ) 示例：2010-02-04
cQQ	string	否	否	QQ号码
iSourceType	long	否	否	注册来源（0:U会员,1:U8,2:零售系统,3:U商城,9:友零售,10:U订货,11:T+,13:淘宝,14:京东,18:自动化营销,99:U8C,102:薪福社,999:商家自用）
cRecommendPhone	string	否	否	推荐人手机号 示例：13020001023
iStoreID	string	否	否	归属门店id/code 示例：1836576755126528
cCardNo	string	否	否	卡号 示例：220817000000022
iStoreEmployeeID	string	否	否	归属店员id/code 示例：1850834455695616
iMemberProperty	string	否	否	会员类型（1：个人会员，2：企业会员） 示例：1
dReceiveDate	string	否	否	领卡时间(格式：yyyy-MM-dd ) 示例：2022-08-17
bStorageExemptPwd	long	否	否	是否开启免密支付（0：否，1：是）
cUserName	string	否	否	会员名 示例：16211111111
_status	string	否	是	保存类型（Insert：新增，Update：修改) 示例：Insert 默认值：Insert
memberattach	object	否	否	赊销信息
memberaddress	object	是	否	收货地址
membercontact	object	是	否	关联人
membermemo	object	是	否	会员备注
id	string	否	否	会员id（新增时无需填写，修改时必填）
membersDefine	object	否	否	表头自定义项
membersFreeDefine	object	否	否	自由自定义项
appId	string	否	否	会籍id(多会籍租户必传) 示例：yl_z5nqc7bDikBX

## 3. 请求示例

Url: /yonbip/sd/member/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"cCountryCode": "86",
		"cPhone": "16211111111",
		"cRealName": "姓名",
		"iSex": "0",
		"iIdentityType": "1",
		"bInBlackList": 1,
		"iIdentityNum": "111111111",
		"cEmail": "",
		"iStop": "0",
		"cZipCode": "邮编",
		"iBirthdayType": "1",
		"dBirthdayDate": "2010-02-04",
		"cQQ": "",
		"iSourceType": 0,
		"cRecommendPhone": "13020001023",
		"iStoreID": "1836576755126528",
		"cCardNo": "220817000000022",
		"iStoreEmployeeID": "1850834455695616",
		"iMemberProperty": "1",
		"dReceiveDate": "2022-08-17",
		"bStorageExemptPwd": 0,
		"cUserName": "16211111111",
		"_status": "Insert",
		"memberattach": {
			"bCreditSale": 1,
			"bControlCredit": 1,
			"fCreditAmount": 111,
			"fAvailableCreditAmount": 111,
			"_status": "Insert",
			"id": 0
		},
		"memberaddress": [
			{
				"iLabelType": "0",
				"bDefault": 1,
				"cStreet": "",
				"cAddress": "",
				"cMobile": "13111111111",
				"cReceiver": "131231",
				"_status": "Insert",
				"cRegionCode": "210681000000",
				"id": 0
			}
		],
		"membercontact": [
			{
				"iSex": "0",
				"cPhone": "13020001023",
				"cRealName": "lrb2",
				"cContactRelation": "0",
				"_status": "Insert",
				"cCountryCode": "",
				"id": 0
			}
		],
		"membermemo": [
			{
				"dRecordDate": 1660665600,
				"dMemoDate": 1660665600,
				"iStoreID": "1836576755126528",
				"iStoreEmpID": "1850834455695616",
				"cTitle": "123",
				"iMemoType": "1",
				"cContent": "qwe",
				"_status": "Insert",
				"id": 0
			}
		],
		"id": "",
		"membersDefine": {
			"_status": "Insert",
			"id": "",
			"define1": ""
		},
		"membersFreeDefine": {
			"_status": "Insert",
			"id": "",
			"define1": ""
		},
		"appId": "yl_z5nqc7bDikBX"
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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	返回码，成功时返回200 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	接口返回信息 示例：操作成功
data	object	否	数据
id	long	否	会员id 示例：1492821900895191041
pubts	string	否	时间戳 示例：2022-07-08 14:09:32
bStorageExemptPwd	int	否	是否开启免密支付（0：未开启，1：开启） 示例：0
iPoints	long	否	积分 示例：0
iStorageExemptMoney	long	否	免密金额 示例：0
bReceiveEMail	int	否	是否接收邮件（0：不接收，1：接收） 示例：0
bReceiveSMS	int	否	是否接收短信（0：不接收，1：接收） 示例：0
bReceiveWXMsg	int	否	是否接收公众号消息（0：不接收，1：接收） 示例：0
cCountryCode	string	否	移动电话国家地区码（60:马来西亚,62:印尼,63:菲律宾,65:新加坡,66:泰国,852:中国香港,853:中国澳门,86:中国,886:中国台湾,95:缅甸） 示例：86
cPhone	string	否	手机号 示例：14755523336
iStop	int	否	状态（0：启用，1：停用） 示例：0
iBirthdayType	long	否	生日类型（0：公历，1：农历） 示例：0
dBirthdayMonth	long	否	生日月份 示例：0
fConsumeAmount	BigDecimal	否	历史交易金额 示例：0
iMemberProperty	int	否	会员类型（1:个人会员,2:企业会员） 示例：1
memberaddress	object	是	收货地址
membermemo	object	是	会员备注
iSourceType	long	否	注册来源（0:U会员,1:U8,2:零售系统,3:U商城,9:友零售,10:U订货,11:T+,13:淘宝,14:京东,18:自动化营销,99:U8C,102:薪福社,999:商家自用） 示例：0
cAppID	string	否	会籍code 示例：yl_G6TE35px1Hrg
createTime	long	否	创建时间 示例：1657260572
membersDefine	object	否	表头自定义项
membersFreeDefine	object	否	自由自定义项

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 1492821900895191041,
		"pubts": "2022-07-08 14:09:32",
		"bStorageExemptPwd": 0,
		"iPoints": 0,
		"iStorageExemptMoney": 0,
		"bReceiveEMail": 0,
		"bReceiveSMS": 0,
		"bReceiveWXMsg": 0,
		"cCountryCode": "86",
		"cPhone": "14755523336",
		"iStop": 0,
		"iBirthdayType": 0,
		"dBirthdayMonth": 0,
		"fConsumeAmount": 0,
		"iMemberProperty": 1,
		"memberaddress": [
			{
				"region": "001",
				"cStreet": "123",
				"cAddress": "123",
				"cMobile": "123",
				"cReceiver": "123",
				"cRegionCode": "001",
				"cAppID": "yl_G6TE35px1Hrg",
				"iRegionID": 2264401063907584,
				"cCountry": "中国",
				"cProvince": "北京市",
				"cCity": "市辖区",
				"cArea": "东城区",
				"id": 1495168928714326018,
				"iMemberID": 1492821900895191041,
				"membercorp": 9060,
				"yTenantId": "cn51p8g3"
			}
		],
		"membermemo": [
			{
				"dRecordDate": 1657123200,
				"dMemoDate": 1657209600,
				"cStoreName": "自动化网站",
				"iStoreID": 2618232392274176,
				"cTitle": "123",
				"iMemoType": 1,
				"cContent": "123",
				"cAppID": "yl_G6TE35px1Hrg",
				"id": 1495168928714326019,
				"iMemberID": 1492821900895191041,
				"membercorp": 9060,
				"yTenantId": "cn51p8g3"
			}
		],
		"iSourceType": 0,
		"cAppID": "yl_G6TE35px1Hrg",
		"createTime": 1657260572,
		"membersDefine": {
			"id": 1702145395563429895,
			"define1": ""
		},
		"membersFreeDefine": {
			"id": 1702145395563429896,
			"define1": ""
		}
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
0	未传入优惠券档案id	coupon_id值填写有误
999	服务端逻辑异常!	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-16	
更新
请求说明
新增
请求参数 appId
	2	2025-06-25	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

