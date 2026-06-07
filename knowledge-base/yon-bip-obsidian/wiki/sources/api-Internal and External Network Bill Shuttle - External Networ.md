---
title: "内外网账单摆渡-外网账单查询"
apiId: "1982651977416835075"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Personal Invoices"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Personal Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 内外网账单摆渡-外网账单查询

> `ContentType	application/json` 请求方式	POST | 分类: Personal Invoices (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/billcommon/getBatchInvoiceData

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| ids | number |
| 小数位数:0,最大长度:19 | 是 | 否 | ids，单次请求最大支持20个id 示例：[1971555800545493000] |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/billcommon/getBatchInvoiceData?access_token=访问令牌
Body: {
	"ids": [
		1971555800545493000
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | code 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | message 示例：操作成功 |
| data | object | 是 | data |
| tallydataVO | object | 否 | tallydataVO |
| ocrInvoiceVO | object | 否 | ocrInvoiceVO |
| invoiceAuditResultVOList | object | 是 | invoiceAuditResultVOList |
| invoiceFileVOList | object | 是 | invoiceFileVOList |
| tallydataTaxDeductVOList | object | 是 | tallydataTaxDeductVOList |
| invoiceCheckDataList | object | 是 | invoiceCheckDataList |
| tallydataAmountBVOList | object | 是 | tallydataAmountBVOList |
| tallydataBusBVOList | object | 否 | tallydataBusBVOList |
| tallydataTaxBVOList | object | 否 | tallydataTaxBVOList |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": [
		{
			"tallydataVO": {
				"_realtype": "true",
				"_entityName": "znbzbx.tallydata.TallydataVO",
				"_keyName": "id",
				"iinvoicestatus": 0,
				"vstampinfo": "北京滴滴出行科技有限公司,91110108MA01G0FB09",
				"bused": false,
				"igatherstatus": 1,
				"vprovince": "北京市",
				"ichecktype": 0,
				"nuntaxmny": "1310.96",
				"nfuelsurcharge": "",
				"vregion": "[95,19,1641,1061]",
				"path": "znbzbx_tallydata/1971555800545492993/1712719297245.JPG",
				"vimgsize": "1920,1080",
				"ndeducttaxmny": "39.33",
				"voperatorid": 1851461771861164041,
				"bocrmodify": false,
				"isagentmark": false,
				"id": 1971555800545492993,
				"tenant": "3504408309013696",
				"vattachmentass": "b60d7b6f247e4e75b6fda12f84d8d1dd",
				"iselecvmatched": 3,
				"iscitytraffic": false,
				"vbuyname": "用友网络科技股份有限公司",
				"dcostdate": "2023-12-07 00:00:00",
				"isrefund": false,
				"icheckstatus": 1,
				"filename": "1712719297245.JPG",
				"vbuytaxid": "91110000600001760P",
				"ntaxmny": "39.33",
				"isourcesystem": 0,
				"vseller_bank_account": "招商银行股份有限公司北京东三环支行110936504210806",
				"status": 12,
				"vimageid": "1847f1baee92d877bf12aa202404jpeg",
				"vinvoicetypecode": "10102",
				"dupdate": "2024-04-10 00:00:00",
				"pk_invoicetype": 9996,
				"isdeduct": true,
				"pk_consumekind": 9998,
				"creatorId": 1851461771861164041,
				"pk_ocrinvoice": 1971555809135427589,
				"ibusistatus": 0,
				"vcurrency": "1837319999347752994",
				"isEleInvoice": 1,
				"vpicturefileid": "661605c549308f2485a98baf",
				"vinvoiceno": "10556199",
				"cfinaceorg": "1837963849289957378",
				"duploadtime": "2024-04-10 11:21:41",
				"nservicetaxmny": "",
				"pk_costaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"pubts": "2024-04-10 11:21:44",
				"vinvoicetypename": "增值税电子普通发票",
				"createDate": "2024-04-10 00:00:00",
				"creator": "吕文博",
				"vstampcusttaxid": "91110108MA01G0FB09",
				"orientation": 0,
				"vinvoicecode": "011002301111",
				"iauditresult": 1,
				"vseller_addr_tel": "北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275",
				"ytenant": "0000LNMSTNR5E7BNR70000",
				"icompanyseal": 1,
				"vqrcode": "[01,10,011002301111,10556199,1310.96,20231207,13250180506951701215,CE01,]",
				"vinvoicecheckno": "13250180506951701215",
				"nchecknum": "1",
				"dopendate": "2023-12-07 00:00:00",
				"imanualauditresult": 0,
				"vcusttaxid": "91110108MA01G0FB09",
				"createTime": "2024-04-10 11:21:44",
				"istranssettle": false,
				"vcustname": "北京滴滴出行科技有限公司",
				"nmny": "1350.29",
				"collectionWay": 0,
				"vstampcustname": "北京滴滴出行科技有限公司",
				"_status": "Unchanged",
				"tspz": "通行费",
				"overall_amount": 0,
				"medical_record_number": "",
				"inpatient_number": "",
				"medical_insurance_number": "",
				"visit_date": "2026-06-07 12:00:25",
				"medical_insurance_type": "",
				"gender": "",
				"other_payments": 0,
				"personal_account_payment": 0,
				"cash_payment": 0,
				"personal_expense": 0,
				"personal_payment": 0,
				"personal_self1": 0,
				"personal_self2": 0,
				"inpatient_department": "",
				"admission_date": "2026-06-07 12:00:25",
				"discharge_date": "2026-06-07 12:00:25",
				"annual_health_insurance_coverage": 0,
				"annual_outpatient_catastrophic_payment": 0
			},
			"ocrInvoiceVO": {
				"_realtype": "true",
				"_entityName": "znbzbx.ocrinvoice.OCRInvoiceVO",
				"_keyName": "id",
				"seller": "北京滴滴出行科技有限公司",
				"code": "011002301111",
				"company_seal": 1,
				"vnumber": "10556199",
				"creatorId": 1851461771861164041,
				"vdate": "2023年12月07日",
				"item_names": "*运输服务*客运服务费,*运输服务*客运服务费",
				"currency_code": "CNY",
				"issuer": "于秋红",
				"stamp_info": "[{pk_ocrinvoice:null,vinvoicetypecode:null,vinvoicecode:0.999,vinvoiceno:0.999,vcustname:0.999,vcusttaxid:0.9922,vbuyname:0.999,vbuytaxid:0.9964,vseller_addr_tel:null,vseller_bank_account:null,vbuyer_addr_tel:null,vbuyer_bank_account:null}]",
				"buyer_tax_id": "91110000600001760P",
				"seller_tax_id": "91110108MA01G0FB09",
				"vocrdata": "{imageId:1847f1baee92d877bf12aa202404jpeg,identify_type:1,bill_type:invoice,type:10102,desc:增值税电子普通发票,orientation:0,region:[95,19,1641,1061],image_size:[1920,1080],page:0,coordinate:{degree:0,endX:0,endY:0,sourceHeight:0,sourceWidth:0,startX:0,startY:0},details:{fplx:1,title:北京增值税电子普通发票,currency_code:CNY,item_names:*运输服务*客运服务费,*运输服务*客运服务费,invoice_type:10102,date:2023年12月07日,electronic_mark:1,commodity_name:[*运输服务*客运服务费,*运输服务*客运服务费],code:011002301111,number:10556199,code_confirm:011002301111,number_confirm:,pretax_amount:1310.96,total:1350.29,total_cn:壹仟叁佰伍拾圆贰角玖分,tax:39.33,check_code:13250180506951701215,machine_code:499098498382,seller:北京滴滴出行科技有限公司,seller_tax_id:91110108MA01G0FB09,seller_addr_tel:北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275,seller_bank_account:招商银行股份有限公司北京东三环支行110936504210806,buyer:用友网络科技股份有限公司,buyer_tax_id:91110000600001760P,buyer_bank_account:,buyer_addr_tel:,company_seal:1,tax_seal:,seal_flag:,seal_seller_name:,seal_seller_tax_id:,overlap:,form_type:,form_name:,kind:交通,ciphertext:03/6/12>>/7742+7*>-90/524>88,-7>197+4<**4<3<2<750/+5804/+,/6/*6647<67+*5+2-2<6+9>17292,<>4+22++9/01+6<419>72<9<5*43,travel_tax:,receiptor:杜洪亮,reviewer:赵笑林,issuer:于秋红,province:北京市,city:,remark:,agent_mark:,acquisition_mark:,service_name:运输服务,company_seal_mark:1,transit_mark:,vehicle_mark:0,oil_mark:,stamp_info:北京滴滴出行科技有限公司,91110108MA01G0FB09,producer_stamp:国家税务总局,block_chain:,zfbz:,return_red_flag:,electronic_number:,angle:,items:[{project_code:null,name:*运输服务*客运服务费,unit:次,standard_of_charge:null,specification:无,quantity:1,price:1526.59,total:1526.59,tax_rate:3%,tax:45.80,duty_no:null,tax_paid:null,comment:null,license_plate:null},{project_code:null,name:*运输服务*客运服务费,unit:,standard_of_charge:null,specification:,quantity:,price:,total:-215.63,tax_rate:3%,tax:-6.47,duty_no:null,tax_paid:null,comment:null,license_plate:null}],page_count:0,page_number:0},confidences:{date:0.999,seller:0.999,code:0.999,tax:0.999,buyer:0.999,buyer_tax_id:0.9964,seller_tax_id:0.9922,number:0.999,total:0.999,check_code:0.999,pretax_amount:0.999,seller_addr_tel:0.9968,seller_bank_account:0.9948},extra:{check_code_candidates:[],check_code_last_six:[],number_order_error:[],qrcode:[01,10,011002301111,10556199,1310.96,20231207,13250180506951701215,CE01,],barcode:null},billType:10101,imageSize:1920,1080}",
				"total": "1350.29",
				"vtallydata": "{bocrmodify:false,bused:false,cfinaceorg:1837963849289957378,createDate:2024-04-10,createTime:2024-04-10 11:21:41,creator:吕文博,creatorId:1851461771861164041,currency_code:CNY,dcostdate:2023-12-07 00:00:00,dopendate:2023-12-07 00:00:00,dupdate:2024-04-10,duploadtime:2024-04-10 11:21:41,_status:Unchanged,filename:1712719297245.JPG,iauditresult:1,ibusistatus:0,icheckstatus:0,ichecktype:0,icompanyseal:1,igatherstatus:1,imanualauditresult:0,isagentmark:false,iscitytraffic:false,isdeduct:false,isourcesystem:0,isrefund:false,istranssettle:false,nmny:1350.29,ntaxmny:39.33,nuntaxmny:1310.96000000,orientation:0,path:1712719297245.JPG,pk_consumekind:9998,pk_costaddr:bfad101d-5cf3-11e9-817e-7cd30abea0c0,pk_invoicetype:9996,pk_ocrinvoice:1971555809135427589,pubts:2024-04-10 11:21:41,_realtype:true,status:0,tenant:3504408309013696,vattachmentass:b60d7b6f247e4e75b6fda12f84d8d1dd,vbuyname:用友网络科技股份有限公司,vbuytaxid:91110000600001760P,vcurrency:1837319999347752994,vcustname:北京滴滴出行科技有限公司,vcusttaxid:91110108MA01G0FB09,vimageid:1847f1baee92d877bf12aa202404jpeg,vimgsize:1920,1080,vinvoicecheckno:13250180506951701215,vinvoicecode:011002301111,vinvoiceno:10556199,vinvoicetypecode:10102,vinvoicetypename:增值税电子普通发票,vmemo:,voperatorid:1851461771861164041,vpicturefileid:661605c549308f2485a98baf,vprovince:北京市,vqrcode:[01,10,011002301111,10556199,1310.96,20231207,13250180506951701215,CE01,],vregion:[95,19,1641,1061],vstampcustname:北京滴滴出行科技有限公司,vstampcusttaxid:91110108MA01G0FB09,vstampinfo:北京滴滴出行科技有限公司,91110108MA01G0FB09,vconsumekindname:交通,vconsumekindcode:YZ003,collectionWay:0,vcurrency_name:人民币,vcurrency_moneyDigit:2,vcurrency_currTypeSign:?,id:1971555800545492993}",
				"province": "北京市",
				"cfinaceorg": "1837963849289957378",
				"brelate": true,
				"check_code": "13250180506951701215",
				"extra": "{check_code_candidates:[],check_code_last_six:[],number_order_error:[],qrcode:[01,10,011002301111,10556199,1310.96,20231207,13250180506951701215,CE01,],barcode:null}",
				"pretax_amount": "1310.96",
				"id": 1971555809135427589,
				"pubts": "2024-04-10 11:21:44",
				"seller_bank_account": "招商银行股份有限公司北京东三环支行110936504210806",
				"tenant": "3504408309013696",
				"createDate": "2024-04-10 00:00:00",
				"ciphertext": "03/6/12>>/7742+7*>-90/524>88,-7>197+4<**4<3<2<750/+5804/+,/6/*6647<67+*5+2-2<6+9>17292,<>4+22++9/01+6<419>72<9<5*43",
				"creator": "吕文博",
				"ytenant": "0000LNMSTNR5E7BNR70000",
				"kind": "交通",
				"isgraphics": false,
				"tax": "39.33",
				"reviewer": "赵笑林",
				"buyer": "用友网络科技股份有限公司",
				"machine_code": "499098498382",
				"createTime": "2024-04-10 11:21:44",
				"ibusitype": 0,
				"receiptor": "杜洪亮",
				"seller_addr_tel": "北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275",
				"vinvoicetype": "10102",
				"_status": "Unchanged"
			},
			"invoiceAuditResultVOList": [
				{
					"_realtype": "true",
					"_entityName": "znbzbx.invoiceauditresult.InvoiceAuditResultVO",
					"_keyName": "id",
					"iauditresult": 1,
					"vinnercode": "INVC010113",
					"ytenant": "0000LNMSTNR5E7BNR70000",
					"pk_auditclass": 9990,
					"igatherstatus": 1,
					"pk_auditrule": 9982,
					"pk_invauditrule": 9856,
					"imanualauditresult": 0,
					"cfinaceorg": "1837963849289957378",
					"createTime": "2024-04-10 11:21:43",
					"vsourceaction": "票据采集",
					"pk_tallydata": 1971555800545492993,
					"icontrolprop": 2,
					"id": 1971555800545492994,
					"pubts": "2021-03-26 11:25:26",
					"tenant": "3504408309013696",
					"createDate": "2024-04-10 00:00:00",
					"_status": "Unchanged"
				}
			],
			"invoiceFileVOList": [
				{
					"_realtype": "true",
					"_entityName": "znbzbx.invoicefile.InvoiceFileVO",
					"_keyName": "id",
					"vimageid": "1847f1baee92d877bf12aa202404jpeg",
					"creator": "吕文博",
					"orientation": 0,
					"vattachmentass": "b60d7b6f247e4e75b6fda12f84d8d1dd",
					"ytenant": "0000LNMSTNR5E7BNR70000",
					"inecessity": 0,
					"vfileid": "661605c549308f2485a98baf",
					"path": "znbzbx_tallydata/1971555800545492993/1712719297245.JPG",
					"ipagecount": 1,
					"cfinaceorg": "1837963849289957378",
					"createTime": "2024-04-10 11:21:44",
					"filelength": "534027",
					"ifiletype": 1,
					"id": 1971555809135427591,
					"pubts": "2024-04-10 11:21:41",
					"isfolder": false,
					"tenant": "3504408309013696",
					"createDate": "2024-04-10 00:00:00",
					"_status": "Unchanged"
				}
			],
			"tallydataTaxDeductVOList": [
				{
					"_realtype": "true",
					"_entityName": "znbzbx.tallydata.TallydataTaxDeductVO",
					"_keyName": "id",
					"ytenant": "0000LNMSTNR5E7BNR70000",
					"pk_consumekind": 9998,
					"nuntaxmny": "1526.59",
					"iscandeduct": true,
					"pk_invoicecheck_b": 1971555809135427593,
					"ndeducttaxmny": "45.8",
					"ntaxmny": "45.8",
					"nmny": "1572.39",
					"ndeducttaxrate": "3",
					"pk_tallydata": 1971555800545492993,
					"id": 1971555809135427596,
					"pubts": "2024-04-10 11:21:44",
					"tenant": "3504408309013696",
					"_status": "Unchanged"
				}
			],
			"invoiceCheckDataList": [
				{
					"invoiceCheckVO": {
						"_realtype": "true",
						"_entityName": "znbzbx.invoicecheck.InvoiceCheckVO",
						"_keyName": "id",
						"vcheckstatus": "OK",
						"creatorId": 1851461771861164041,
						"vselladdrphone": "北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275",
						"vouchdate": "2024-04-10 00:00:00",
						"vselltaxpayerid": "91110108MA01G0FB09",
						"iinvoicetype": 1,
						"vinvoiceno": "10556199",
						"cfinaceorg": "1837963849289957378",
						"checkcount": "1",
						"pk_checkman": 1851461771861164041,
						"vsellbankaccount": "招商银行股份有限公司北京东三环支行110936504210806",
						"id": 1971555809135427592,
						"pubts": "2024-04-10 11:21:44",
						"vcheckcode": "13250180506951701215",
						"tenant": "3504408309013696",
						"vinvoicetypename": "增值税电子普通发票",
						"createDate": "2024-04-10 00:00:00",
						"creator": "吕文博",
						"decodedata": "{airVo:null,attachs:null,checkdata:{\\data\\:{\\amount\\:\\1310.96\\,\\buyer\\:{\\address\\:\\\\,\\bank\\:\\\\,\\code\\:\\91110000600001760P\\,\\name\\:\\用友网络科技股份有限公司\\},\\commodities\\:[{\\amount\\:\\1526.59\\,\\name\\:\\*运输服务*客运服务费\\,\\numberplate\\:null,\\price\\:\\1526.59\\,\\quantity\\:\\1\\,\\spec\\:\\无\\,\\tax_amount\\:\\45.80\\,\\tax_rate\\:\\3\\,\\toll_end_date\\:null,\\toll_start_date\\:null,\\tolltype\\:null,\\uom\\:\\次\\},{\\amount\\:\\-215.63\\,\\name\\:\\*运输服务*客运服务费\\,\\numberplate\\:null,\\price\\:null,\\quantity\\:null,\\spec\\:\\\\,\\tax_amount\\:\\-6.47\\,\\tax_rate\\:\\3\\,\\toll_end_date\\:null,\\toll_start_date\\:null,\\tolltype\\:null,\\uom\\:\\\\}],\\date\\:\\20231207\\,\\district\\:null,\\inv_code\\:\\011002301111\\,\\inv_number\\:\\10556199\\,\\inv_status\\:\\0\\,\\remark\\:\\\\,\\seller\\:{\\address\\:\\北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275\\,\\bank\\:\\招商银行股份有限公司北京东三环支行110936504210806\\,\\code\\:\\91110108MA01G0FB09\\,\\name\\:\\北京滴滴出行科技有限公司\\},\\sum_amount\\:\\1350.29\\,\\tax_amount\\:\\39.33\\,\\type_code\\:\\10\\,\\type_name\\:\\增值税电子普通发票\\,\\verify_code\\:\\13250180506951701215\\},\\err\\:null,\\isthrowerror\\:null,\\pk_tallydata\\:null,\\result\\:\\OK\\},code:null,custPayCertiVO:null,fileName:null,fiscalNonTaxVO:null,fpDm:null,fpHm:null,imageId:null,invoice:{bz:,currencyType:null,fhr:null,fpDm:011002301111,fpHm:10556199,fpMw:null,fpjz:null,fplx:1,gmfDzdh:,gmfMc:用友网络科技股份有限公司,gmfNsrsbh:91110000600001760P,gmfYhzh:,hjje:null,hjse:39.33,icodeanalytype:null,invoiceType:null,ipdfanalytype:null,issuspect:null,items:[{dw:次,ggxh:无,se:45.80,sl:3,txfCph:null,txfLx:null,txfTxrqq:null,txfTxrqz:null,xmdj:1526.59,xmje:1526.59,xmjshj:null,xmmc:*运输服务*客运服务费,xmsl:1},{dw:,ggxh:,se:-6.47,sl:3,txfCph:null,txfLx:null,txfTxrqq:null,txfTxrqz:null,xmdj:null,xmje:-215.63,xmjshj:null,xmmc:*运输服务*客运服务费,xmsl:null}],jqbh:null,jshj:1350.29,jym:13250180506951701215,kpr:null,kprq:2023-12-07,skr:null,submitter:null,xsfDzdh:北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275,xsfMc:北京滴滴出行科技有限公司,xsfNsrsbh:91110108MA01G0FB09,xsfYhzh:招商银行股份有限公司北京东三环支行110936504210806,zfbz:null},invoiceType:null,machineVO:null,msg:null,pdfSignatureVO:null,repeatFlag:null,trainVo:null,verify:null,vqrcode:null}",
						"vinvoicecode": "011002301111",
						"ytenant": "0000LNMSTNR5E7BNR70000",
						"dcheckdate": "2024-04-10 00:00:00",
						"iinvoiceformtype": 1,
						"vsellname": "北京滴滴出行科技有限公司",
						"dopendate": "2023-12-07 00:00:00",
						"createTime": "2024-04-10 11:21:44",
						"ntaxmny": "39.33",
						"vcustname": "用友网络科技股份有限公司",
						"nmny": "1350.29",
						"pk_tallydata": 1971555800545492993,
						"checkdata": "{data:{amount:1310.96,buyer:{address:,bank:,code:91110000600001760P,name:用友网络科技股份有限公司},commodities:[{amount:1526.59,name:*运输服务*客运服务费,numberplate:null,price:1526.59,quantity:1,spec:无,tax_amount:45.80,tax_rate:3,toll_end_date:null,toll_start_date:null,tolltype:null,uom:次},{amount:-215.63,name:*运输服务*客运服务费,numberplate:null,price:null,quantity:null,spec:,tax_amount:-6.47,tax_rate:3,toll_end_date:null,toll_start_date:null,tolltype:null,uom:}],date:20231207,district:null,inv_code:011002301111,inv_number:10556199,inv_status:0,remark:,seller:{address:北京市海淀区唐家岭北环路6号院1号楼C座四层408010-83456275,bank:招商银行股份有限公司北京东三环支行110936504210806,code:91110108MA01G0FB09,name:北京滴滴出行科技有限公司},sum_amount:1350.29,tax_amount:39.33,type_code:10,type_name:增值税电子普通发票,verify_code:13250180506951701215},err:null,isthrowerror:null,pk_tallydata:null,result:OK}",
						"isdelete": false,
						"vcusttaxpayerid": "91110000600001760P",
						"_status": "Unchanged"
					},
					"invoiceCheckBVOList": [
						{
							"_realtype": "true",
							"_entityName": "znbzbx.invoicecheck.InvoiceCheckBVO",
							"_keyName": "id",
							"pk_invoicecheck": 1971555809135427592,
							"ytenant": "0000LNMSTNR5E7BNR70000",
							"nnum": "1",
							"vgoodsunit": "次",
							"vgoodsname": "*运输服务*客运服务费",
							"nprice": "1526.59",
							"vgoodsspec": "无",
							"ntaxmny": "45.8",
							"ntaxrate": "3",
							"nmny": "1526.59",
							"id": 1971555809135427593,
							"pubts": "2024-04-10 11:21:44",
							"ntotalmny": "1572.39",
							"tenant": "3504408309013696",
							"_status": "Unchanged"
						}
					]
				}
			],
			"tallydataAmountBVOList": [
				{
					"pk_tallydata": 1851461771861164042,
					"ocr_or_tax_parse": "",
					"project_name": "",
					"specification_model": "",
					"unit": "",
					"quantity": 0,
					"unit_price": 0,
					"nuntaxmny": 0,
					"nmny": 0,
					"amount": 0,
					"tax_rate": 0,
					"tax_amount": 0,
					"pk_consumekind": 0,
					"vlicenseplate": "",
					"vvehicletype": "",
					"toll_start_date": "2026-06-07",
					"toll_end_date": "2026-06-07",
					"remarks": "",
					"pk_carrier": 0,
					"vflighttrainnum": "",
					"pk_seatgrade": 0,
					"pk_start_address": 0,
					"pk_end_address": 0,
					"travel_date": "2026-06-07",
					"travel_time": "12:00:25",
					"ticket_class": "",
					"ticket_effective_date": "2026-06-07",
					"ticket_expiry_date": "2026-06-07",
					"free_baggage": "",
					"passenger": "",
					"tax_identification": "",
					"dutiable_amount": 0,
					"original_voucher_no": "",
					"type_tax": "",
					"tax_item_name": "",
					"period_of_tax": "",
					"deposit_date": "2026-06-07",
					"actual_amount": 0,
					"paid_amount": 0,
					"standard": "",
					"projectno": "",
					"start_date": "2026-06-07",
					"end_date": "2026/06/07",
					"costdate": "2026-06-07",
					"start_time": "12:00:25",
					"quantity_unit": "",
					"mileage": "",
					"time_geton": "12:00:25",
					"city": "",
					"iscandeduct": true,
					"ndeducttaxmny": 0,
					"ndeducttaxrate": 0,
					"nservicetaxmny": 0,
					"nservicetaxrate": 0,
					"pk_invoicecheck_b": 0,
					"pk_deducttax": 0,
					"carrier": "",
					"vseatlevel": "",
					"carbin_class": "",
					"start_address_name": "",
					"end_address_name": "",
					"batchno": "",
					"materialno": "",
					"vdiscount": ""
				}
			],
			"tallydataBusBVOList": {
				"pk_tallydata": 0,
				"ocr_or_tax_parse": "",
				"traveler": "",
				"card_no": "",
				"travel_date": "2026-06-07",
				"vstartaddr": "",
				"vendaddr": "",
				"vclass": "",
				"pk_vtraffic_type": 0,
				"vtransport_type": "",
				"vtransport_no": "",
				"vstartaddr_transport": "",
				"vendaddr_transport": "",
				"vgoods_name_transport": ""
			},
			"tallydataTaxBVOList": {
				"tax_name": "",
				"tax_value": 0,
				"tax_percentage": 0,
				"tax_base": 0,
				"pk_tallydata": 0
			}
		}
	]
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-30

新增

返回参数 (25)

更新

返回参数 (102)

2	2025-12-08

更新

请求说明

新增

返回参数 tspz

更新

返回参数 vimageid

更新

返回参数 vtallydata

更新

返回参数 vimageid

3	2025-08-21

新增

返回参数 (80)

4	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

