---
title: "红票回调接口"
apiId: "1811985241391235077"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Invoicing Request"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Invoicing Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 红票回调接口

>  请求方式	POST | Invoicing Request (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/invoice/redcallback
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
data	string	否	否	data 示例：{bmbBbh:47.0,bz:交易编号:2328200000447840,corpId:et2dyyfj,ewm:01,10,041002200211,62732123,226.20,20231019,05343885047757632195,6D38,fhr:寇东博,sblx:bw,fpDm:041002200211,fpHm:62732123,fpjz:0,fplx:1,zsfs:0,fpMw:03890+90427<4/<103/38>8124>0948736*3>436/244*-*-<62+*7-099890+90427<4/<1038/558>127/1*62>-/*+>0153901994*<5/7>24,fpqqlsh:2375035411699728403,fpzt:2,bsDownLoadStatus:0,gmfDzdh:,gmfMc:个人,gmfYhzh:,hjje:226.20,hjse:28.75,jqbh:929911962596,jshj:254.95,jym:05343885047757632195,kplx:0,kpr:王敬,kprq:20231019183405,lyid:2328200000447840,lylx:2,skr:王敬,xsfDzdh:郑州市金水区经三路25号财政厅临街办公房 0371-65356000,xsfMc:河南省钱币有限公司,xsfNsrsbh:91410105735528850D,xsfYhzh:广发银行股份有限公司郑州龙子湖支行 9550880076841300115,zfbz:N,bred:N,tjrq:1697710812000,fpqqlshIsSysGen:false,bzLength:0,tspzs:[],lyqd:4,unUsedAndUnEntry:false,cepzs:[],items:[{dw:套,fphxz:0,hh:1,ggxh:,se:28.18,sl:0.130000,xmdj:43.3539823009,xmhsdj:48.99,xmje:216.77,xmjshj:244.95,xmmc:*工艺品*中国国家队签名徽章（国家队）,spbm:1060502990000000000,zxbm:10,yhzcbs:0,xmsl:5,withXmje:false,jajz:false},{dw:个,fphxz:0,hh:2,ggxh:,se:0.57,sl:0.060000,xmje:9.43,xmjshj:10.00,xmmc:*物流辅助服务*运费,spbm:3040409030000000000,zxbm:10,yhzcbs:0,withXmje:false,jajz:false}]}
code	string	否	否	code 示例：0000
msg	string	否	否	msg 示例：开票成功
fpqqlsh	string	否	否	fpqqlsh 示例：2375035411699728403
pdf	string	否	否	pdf
fileType	string	否	否	fileType 示例：pdf
shareurl	string	否	否	shareurl 示例：https://tax.diwork.com/output-tax/s/2f750be2383504b0054e201657daad76?tenantId=et2dyyfj
sharecode	string	否	否	sharecode 示例：9M11
corpid	string	否	否	corpid 示例：et2dyyfj
kpsj	string	否	否	kpsj 示例："2024-04-25 11:04:25"

## 3. 请求示例

Url: /yonbip/sd/invoice/redcallback?access_token=访问令牌
Body: {
	"data": "{bmbBbh:47.0,bz:交易编号:2328200000447840,corpId:et2dyyfj,ewm:01,10,041002200211,62732123,226.20,20231019,05343885047757632195,6D38,fhr:寇东博,sblx:bw,fpDm:041002200211,fpHm:62732123,fpjz:0,fplx:1,zsfs:0,fpMw:03890+90427<4/<103/38>8124>0948736*3>436/244*-*-<62+*7-099890+90427<4/<1038/558>127/1*62>-/*+>0153901994*<5/7>24,fpqqlsh:2375035411699728403,fpzt:2,bsDownLoadStatus:0,gmfDzdh:,gmfMc:个人,gmfYhzh:,hjje:226.20,hjse:28.75,jqbh:929911962596,jshj:254.95,jym:05343885047757632195,kplx:0,kpr:王敬,kprq:20231019183405,lyid:2328200000447840,lylx:2,skr:王敬,xsfDzdh:郑州市金水区经三路25号财政厅临街办公房 0371-65356000,xsfMc:河南省钱币有限公司,xsfNsrsbh:91410105735528850D,xsfYhzh:广发银行股份有限公司郑州龙子湖支行 9550880076841300115,zfbz:N,bred:N,tjrq:1697710812000,fpqqlshIsSysGen:false,bzLength:0,tspzs:[],lyqd:4,unUsedAndUnEntry:false,cepzs:[],items:[{dw:套,fphxz:0,hh:1,ggxh:,se:28.18,sl:0.130000,xmdj:43.3539823009,xmhsdj:48.99,xmje:216.77,xmjshj:244.95,xmmc:*工艺品*中国国家队签名徽章（国家队）,spbm:1060502990000000000,zxbm:10,yhzcbs:0,xmsl:5,withXmje:false,jajz:false},{dw:个,fphxz:0,hh:2,ggxh:,se:0.57,sl:0.060000,xmje:9.43,xmjshj:10.00,xmmc:*物流辅助服务*运费,spbm:3040409030000000000,zxbm:10,yhzcbs:0,withXmje:false,jajz:false}]}",
	"code": "0000",
	"msg": "开票成功",
	"fpqqlsh": "2375035411699728403",
	"pdf": "",
	"fileType": "pdf",
	"shareurl": "https://tax.diwork.com/output-tax/s/2f750be2383504b0054e201657daad76?tenantId=et2dyyfj",
	"sharecode": "9M11",
	"corpid": "et2dyyfj",
	"kpsj": "\"2024-04-25 11:04:25\""
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
code	long	否	code 示例：200
message	string	否	message 示例：ok

## 5. 正确返回示例

{
	"code": 200,
	"message": "ok"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

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

