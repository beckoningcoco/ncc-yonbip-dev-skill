---
title: "B2C商城获取退货信息"
apiId: "603f4175bead47aaa3d1faba67100579"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Return/Refund Document"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Return/Refund Document]
platform_version: "BIP"
source_type: community-api-docs
---

# B2C商城获取退货信息

>  请求方式	GET | Return/Refund Document (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/b2c/orders/salereturnsdetail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
sale_return_nos	string	query	是	退货单号 使用英文逗号隔离

## 3. 请求示例

Url: /yonbip/b2c/orders/salereturnsdetail?access_token=访问令牌&sale_return_nos=

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
code	int	否	是否成功标记 示例：200
message	string	否	请求成功消息 示例：操作成功
data	object	是	数据对象信息
iCorpId	long	否	企业ID 示例：1717
iAgentId	long	否	代理id 示例：1968938181333249
iMemberId	long	否	会员id 示例：1968938181333249
oMemeber	object	否	会员数据对象
iCurrentStatus	long	否	当前在第几个状态 示例：0
cSaleReturnNo	string	否	退款单号 示例：R-6febd24e21101-20210910-001
cOrderNo	string	否	订单编号 示例：O-6febd24e211010910002
cSaleReturnStatus	string	否	退货状态 SUBMITSALERETURN待退货审批”,CONFIRMSALERETURNORDER待买家退货, BUYERRETURN退货中,SALERETURNING退货中,ENDSALERETURN已完成,OPPOSESALERETURN卖家驳回 示例：ENDSALERETURN
cStatusName	string	否	退款状态名称 示例：已完成
storeId	long	否	门店id 示例：0
iTagType	long	否	订单终端类型 0 平台型 1 直营门店 2 加盟店 3 示例：0
iTagId	long	否	终端id 示例：29847362
promotionCode	string	否	推广码
promoter	string	否	推广商
saleReturnType	long	否	退款类型，1自动退款，2手工退款，3钱包退款 示例：3
ytenantId	string	否	友户通id 示例：nhg3wb5q
oSaleReturnDetails	object	是	退款详情数据
cReceiver	string	否	收货人 示例：马利文 用友测试
cReceiveMobile	string	否	收货人手机号 示例：13693267208
cReceiveTelePhone	string	否	收货人固定电话 和手机号必居其一 示例：1111
cReceiveAddress	string	否	收货地址 示例：中国 北京市 市辖区 海淀区 用友产业园 111
cReceiveZipCode	string	否	收货人邮编 示例：100089
dCreatedTime	string	否	创建时间 示例：2021-09-10 11:11:30
dComplateTime	string	否	退款完成时间 示例：2021-09-10 11:28:16
iSaleReturnMemoId	long	否	退货单备注id 示例：38010
iFeedBackMemoId	long	否	反馈备注id 示例：0
iFeedBack	long	否	反馈:满意1;不满意0 -1无反馈 示例：-1
iReturnType	long	否	退货类型：先付款(0只退款1退货并退款);先发货(2只退货3退款并退货) 4：周期购退订 示例：1
iSubmitUserId	long	否	提交人 示例：1968938181333249
iConfirmUserId	long	否	确认人 示例：2037662264004866
returnPoint	long	否	积分商品当前退款单订单需要退的积分 示例：0
oAttachments	string	否	订单附件
dailyStatus	string	否	日报状态 0未生成 1已生成 示例：0
refundDailyStatus	string	否	收款日报状态 0未生成 1已生成 示例：0
iReturnSource	long	否	退款类型： 0：用户提交的退款申请，1：管理端生成的退款申请 示例：0
refundStatus	string	否	退货状态 UNKNOW 未知；REFUNDING 退款处理中；REFUND_SUCCESS 退款成功；REFUND_FAIL 退款失败；HAND_REFUND 手工退款 示例：HAND_REFUND
refundDate	string	否	退款时间 示例：2021-09-10 11:26:30
iDelete	long	否	删除标记 0未删除 1已删除 示例：0
productAttribute	long	否	商品的销售方式 1:现金购买 2:积分换购 示例：0
realProductAttribute	long	否	商品属性 1:普通商品 2:虚拟商品 示例：1
iOrderType	long	否	订单类型 0普通订单 1团购 2周期购3拼团购订单 示例：0
returnDetail	object	是	计算各个支付方式退款金额详情
cAfterMarketStatus	string	否	售后阶段 发货前退货or发货后退货 BEFORE/AFTER 示例：AFTERSALES
dReviewDate	string	否	退货审核时间 示例：2021-09-10 11:16:50
pubuts	string	否	时间戳 示例：2021-09-10 11:28:17.000
id	long	否	退货单id 示例：38842

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": [
		{
			"iCorpId": 1717,
			"iAgentId": 1968938181333249,
			"iMemberId": 1968938181333249,
			"oMemeber": {
				"cPhone": "13693267208",
				"cOpenID": "ojYehtw4mgo9QcUJmbIdM9PIhGkE",
				"iMemberLevelId": 1838225904275712,
				"cMemberLevelName": "钻石会员",
				"cMemberLevelCode": "009",
				"is_corporate_member": 0,
				"cRealName": "马利文",
				"countryCode": "86",
				"cUserName": "13693267208",
				"dReceiveTime": 1611244800,
				"iPoints": 4276,
				"fConsumeAmount": 588,
				"cSource": "3",
				"cSourceDetail": 2,
				"iTotalPoints": 4307,
				"dCreateTime": 1603468800,
				"dUpdateTime": "2021-09-10 14:14:16",
				"cQrcodeUrl": "https://ylres.yonyoucloud.com/res/code/2530/members/qrcode/2020-10-24/1603526739886.png",
				"cBarcodeUrl": "https://ylres.yonyoucloud.com/res/code/2530/members/barcode/2020-10-24/1603526740232.png",
				"iStop": 0,
				"dStopTime": "2021-07-14 12:00:53",
				"cPortrait": "http://thirdwx.qlogo.cn/mmopen/gXjBGbVdMuksW27gPDnltFjWc0SdWicvKvo78CibA7tS2X9KUkSnEfXG5HgI9FFhXubcqLQDJpdYCbHyMm9unXQ6gzgN5pZM9v/132",
				"label": ",动作1,动作2,动作3,B01,B02,",
				"fRealConsumeAmount": 588,
				"dRegisterTime": 1603468800,
				"labelIds": [
					"2245741768036608",
					"2245741971656960",
					"2245744586182912",
					"2247162251038976",
					"2247162507612416"
				],
				"ts": "2021-09-10 14:14:16",
				"id": 1968938181333249,
				"iCorpId": 1717
			},
			"iCurrentStatus": 0,
			"cSaleReturnNo": "R-6febd24e21101-20210910-001",
			"cOrderNo": "O-6febd24e211010910002",
			"cSaleReturnStatus": "ENDSALERETURN",
			"cStatusName": "已完成",
			"storeId": 0,
			"iTagType": 0,
			"iTagId": 29847362,
			"promotionCode": "",
			"promoter": "",
			"saleReturnType": 3,
			"ytenantId": "nhg3wb5q",
			"oSaleReturnDetails": [
				{
					"iCorpId": 1717,
					"cSaleReturnNo": "R-6febd24e21101-20210910-001",
					"cLogisticsNo": "3435353",
					"iDeliveryCorpId": 1831352133275905,
					"cDeliveryCorpName": "顺丰速运",
					"cDeliveryCorpCode": "shunfeng",
					"cOrderNo": "O-6febd24e211010910002",
					"iSKUId": 1894929255305472,
					"iDetailId": 10261,
					"iProductId": 1894929249112320,
					"ytenantId": "nhg3wb5q",
					"cProductCode": "002000023",
					"cProductName": "红薯红",
					"cSkuCode": "002000023",
					"cSkuName": "红薯红",
					"cSpecDescription": "",
					"fOrderDetailMoney": 3,
					"fSalePrice": 1,
					"fReturnQuantity": 3,
					"fAlreadyQuantity": 0,
					"fAlreadyMoney": 0,
					"fReturnMoney": 3,
					"bEnable": true,
					"reason": "货物不好，退了",
					"description": " ",
					"productAttribute": 1,
					"fRetailReturnMoney": 0,
					"cCourierName": "",
					"cCourierPhone": "",
					"iDelete": 0,
					"fSendQuantity": 0,
					"fSendMoney": 0,
					"dCreatedTime": "2021-09-10 11:11:30",
					"virtualProductAttribute": 0,
					"pubuts": "2021-09-10 11:26:30.000",
					"id": 37800
				}
			],
			"cReceiver": "马利文 用友测试",
			"cReceiveMobile": "13693267208",
			"cReceiveTelePhone": "1111",
			"cReceiveAddress": "中国 北京市 市辖区 海淀区 用友产业园 111",
			"cReceiveZipCode": "100089",
			"dCreatedTime": "2021-09-10 11:11:30",
			"dComplateTime": "2021-09-10 11:28:16",
			"iSaleReturnMemoId": 38010,
			"iFeedBackMemoId": 0,
			"iFeedBack": -1,
			"iReturnType": 1,
			"iSubmitUserId": 1968938181333249,
			"iConfirmUserId": 2037662264004866,
			"returnPoint": 0,
			"oAttachments": "",
			"dailyStatus": "0",
			"refundDailyStatus": "0",
			"iReturnSource": 0,
			"refundStatus": "HAND_REFUND",
			"refundDate": "2021-09-10 11:26:30",
			"iDelete": 0,
			"productAttribute": 0,
			"realProductAttribute": 1,
			"iOrderType": 0,
			"returnDetail": [
				{
					"iCorpId": 1717,
					"iSaleReturnId": 38842,
					"cSaleReturnNo": "R-6febd24e21101-20210910-001",
					"detailid": 10261,
					"paytypecode": "storagecard",
					"detailmoney": 3,
					"storagediscount": 0,
					"cOrderNo": "O-6febd24e211010910002",
					"cPaytypeErpCode": "1899206140842240",
					"cProductProperty": "BUSINESS",
					"dpaydate": "2021-09-10 11:08:59.0",
					"walletDetail": "",
					"cRetailVoucher": "R-6febd24e21101-20210910-001",
					"paytypename": "线上商城收款",
					"returntype": 1,
					"storeId": 0,
					"pubuts": "2021-09-10 11:11:41.000",
					"id": 24511
				}
			],
			"cAfterMarketStatus": "AFTERSALES",
			"dReviewDate": "2021-09-10 11:16:50",
			"pubuts": "2021-09-10 11:28:17.000",
			"id": 38842
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
998	无效的参数或非法的请求！	正确传token值
999	保存退货分摊金额订单不能为空	正确传退款单号

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

