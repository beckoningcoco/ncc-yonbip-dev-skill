# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9012.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_iexecute_b | pk_iexecute_b | pk_iexecute_b | char(20) | √ |
| 2 | busidate | busidate | busidate | char(19) |
| 3 | exectmark | exectmark | exectmark | varchar2(50) |
| 4 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 5 | glcpayinterest | glcpayinterest | glcpayinterest | number(28, 8) |
| 6 | glcrate | glcrate | glcrate | number(28, 8) |
| 7 | glcrepayamount | glcrepayamount | glcrepayamount | number(28, 8) |
| 8 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 9 | gllcpayinterest | gllcpayinterest | gllcpayinterest | number(28, 8) |
| 10 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 11 | gllcrepayamount | gllcrepayamount | gllcrepayamount | number(28, 8) |
| 12 | initialflag | initialflag | initialflag | char(1) |
| 13 | interest | interest | interest | number(28, 8) |
| 14 | isadvance | isadvance | isadvance | char(1) |
| 15 | ispaytotalintst | ispaytotalintst | ispaytotalintst | char(1) |
| 16 | leftinterest | leftinterest | leftinterest | number(28, 8) |
| 17 | leftrepayamount | leftrepayamount | leftrepayamount | number(28, 8) |
| 18 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 19 | olcpayinterest | olcpayinterest | olcpayinterest | number(28, 8) |
| 20 | olcrate | olcrate | olcrate | number(28, 8) |
| 21 | olcrepayamount | olcrepayamount | olcrepayamount | number(28, 8) |
| 22 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 23 | payinterest | payinterest | payinterest | number(28, 8) |
| 24 | paytotalintsglltmny | paytotalintsglltmny | paytotalintsglltmny | number(28, 8) |
| 25 | paytotalintstglmny | paytotalintstglmny | paytotalintstglmny | number(28, 8) |
| 26 | paytotalintstmny | paytotalintstmny | paytotalintstmny | number(28, 8) |
| 27 | paytotalintstolmny | paytotalintstolmny | paytotalintstolmny | number(28, 8) |
| 28 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 29 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 30 | pk_innerloanpay | pk_innerloanpay | pk_innerloanpay | char(20) | √ |
| 31 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 32 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 33 | pk_repayplans | pk_repayplans | pk_repayplans | blob |
| 34 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 35 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 36 | repayamount | repayamount | repayamount | number(28, 8) |
| 37 | serialno | serialno | serialno | number(38, 0) |
| 38 | summary | summary | summary | varchar2(50) |
| 39 | vbillno | vbillno | vbillno | varchar2(50) |
| 40 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 41 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 42 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 43 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 44 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 45 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 46 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 47 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 48 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 49 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 50 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 51 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 52 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 53 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 54 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 55 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 56 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 57 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 58 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 59 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 60 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 61 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |