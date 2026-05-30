# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11494.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundtransferapply_b | pk_fundtransferapply_b | pk_fundtransferapply_b | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |
| 3 | applytransferdate | applytransferdate | applytransferdate | char(19) |
| 4 | bankacccode_r | bankacccode_r | bankacccode_r | varchar2(40) |
| 5 | bankaccname_r | bankaccname_r | bankaccname_r | varchar2(200) |
| 6 | bankname_p | bankname_p | bankname_p | varchar2(20) |  |  | '~' |
| 7 | bankname_r | bankname_r | bankname_r | varchar2(20) |  |  | '~' |
| 8 | disusedate | disusedate | disusedate | char(19) |
| 9 | disuser | disuser | disuser | varchar2(20) |  |  | '~' |
| 10 | disusetime | disusetime | disusetime | char(19) |
| 11 | fundtype | fundtype | fundtype | varchar2(20) |  |  | '~' |
| 12 | glcamount | glcamount | glcamount | number(28, 8) |
| 13 | glcrate | glcrate | glcrate | number(15, 8) |
| 14 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 15 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 16 | isnetpay | isnetpay | isnetpay | char(1) |
| 17 | isreceipttally | isreceipttally | isreceipttally | char(1) |
| 18 | olcamount | olcamount | olcamount | number(28, 8) |
| 19 | olcrate | olcrate | olcrate | number(15, 8) |
| 20 | paytype | paytype | paytype | varchar2(50) |
| 21 | pk_accid_p | pk_accid_p | pk_accid_p | varchar2(20) |  |  | '~' |
| 22 | pk_balatype | pk_balatype | pk_balatype | varchar2(20) |  |  | '~' |
| 23 | pk_bankacc_p | pk_bankacc_p | pk_bankacc_p | varchar2(20) |  |  | '~' |
| 24 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 25 | pk_fundtransferapply_h | pk_fundtransferapply_h | pk_fundtransferapply_h | char(20) | √ |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_r | pk_org_r | pk_org_r | varchar2(20) |  |  | '~' |
| 29 | pk_org_r_v | pk_org_r_v | pk_org_r_v | varchar2(20) |  |  | '~' |
| 30 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 31 | pk_planitem_p | pk_planitem_p | pk_planitem_p | varchar2(20) |  |  | '~' |
| 32 | recordstatus | recordstatus | recordstatus | number(38, 0) |
| 33 | remark | remark | remark | varchar2(400) |
| 34 | rowno | rowno | rowno | varchar2(50) |
| 35 | successmoney | successmoney | successmoney | varchar2(50) |
| 36 | successolcmoney | successolcmoney | successolcmoney | varchar2(50) |
| 37 | successolgmoney | successolgmoney | successolgmoney | varchar2(50) |
| 38 | successollmoney | successollmoney | successollmoney | varchar2(50) |
| 39 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(101) |
| 40 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(101) |
| 41 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(101) |
| 42 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(101) |
| 43 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(101) |
| 44 | vuserdef6 | vuserdef6 | vuserdef6 | varchar2(101) |
| 45 | vuserdef7 | vuserdef7 | vuserdef7 | varchar2(101) |
| 46 | vuserdef8 | vuserdef8 | vuserdef8 | varchar2(101) |
| 47 | vuserdef9 | vuserdef9 | vuserdef9 | varchar2(101) |
| 48 | vuserdef10 | vuserdef10 | vuserdef10 | varchar2(101) |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |