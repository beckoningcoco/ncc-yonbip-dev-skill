# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7497.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayintstbank_b | pk_repayintstbank_b | pk_repayintstbank_b | char(20) | √ |
| 2 | actratio | actratio | actratio | number(28, 8) |
| 3 | actrepaymny | actrepaymny | actrepaymny | number(28, 8) |
| 4 | actrepayolcmny | actrepayolcmny | actrepayolcmny | number(28, 8) |
| 5 | bankid | bankid | bankid | varchar2(20) |  |  | '~' |
| 6 | banktype | banktype | banktype | varchar2(50) |  |  | '~' |
| 7 | contractbankid | contractbankid | contractbankid | varchar2(200) |
| 8 | fsrcbilltypecode | fsrcbilltypecode | fsrcbilltypecode | varchar2(50) |
| 9 | glcrate | glcrate | glcrate | number(28, 8) |
| 10 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 11 | olcrate | olcrate | olcrate | number(28, 8) |
| 12 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 13 | pk_fsrcbill | pk_fsrcbill | pk_fsrcbill | varchar2(50) |
| 14 | pk_fsrcbilltypeid | pk_fsrcbilltypeid | pk_fsrcbilltypeid | varchar2(50) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_repayintst | pk_repayintst | pk_repayintst | char(20) | √ |
| 19 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 20 | pk_srcbillrowid | pk_srcbillrowid | pk_srcbillrowid | varchar2(50) |
| 21 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 22 | remark | remark | remark | varchar2(200) |
| 23 | rowno | rowno | rowno | varchar2(50) |
| 24 | sourcesystypecode | sourcesystypecode | sourcesystypecode | varchar2(50) |
| 25 | srcbillno | srcbillno | srcbillno | varchar2(50) |
| 26 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 27 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 28 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 29 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 30 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 31 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 32 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 33 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 34 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 35 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 36 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 37 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 38 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 39 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 40 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 41 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 42 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 43 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 44 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 45 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 46 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |