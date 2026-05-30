# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7373.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | pk_version | pk_version | char(20) | √ |
| 2 | amortizedgllmny | amortizedgllmny | amortizedgllmny | number(28, 8) |
| 3 | amortizedglmny | amortizedglmny | amortizedglmny | number(28, 8) |
| 4 | amortizedmny | amortizedmny | amortizedmny | number(28, 8) |
| 5 | amortizedolmny | amortizedolmny | amortizedolmny | number(28, 8) |
| 6 | busidate | busidate | busidate | char(19) |
| 7 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 8 | glcpayinterest | glcpayinterest | glcpayinterest | number(28, 8) |
| 9 | glcrate | glcrate | glcrate | number(28, 8) |
| 10 | glcrepayamount | glcrepayamount | glcrepayamount | number(28, 8) |
| 11 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 12 | gllcpayinterest | gllcpayinterest | gllcpayinterest | number(28, 8) |
| 13 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 14 | gllcrepayamount | gllcrepayamount | gllcrepayamount | number(28, 8) |
| 15 | initialflag | initialflag | initialflag | char(1) |
| 16 | interest | interest | interest | number(28, 8) |
| 17 | isadvance | isadvance | isadvance | char(1) |
| 18 | isclearintst | isclearintst | isclearintst | char(1) |
| 19 | ispaytotalintst | ispaytotalintst | ispaytotalintst | char(1) |
| 20 | leftinterest | leftinterest | leftinterest | number(28, 8) |
| 21 | leftrepayamount | leftrepayamount | leftrepayamount | number(28, 8) |
| 22 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 23 | olcpayinterest | olcpayinterest | olcpayinterest | number(28, 8) |
| 24 | olcrate | olcrate | olcrate | number(28, 8) |
| 25 | olcrepayamount | olcrepayamount | olcrepayamount | number(28, 8) |
| 26 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 27 | payinterest | payinterest | payinterest | number(28, 8) |
| 28 | paytotalintsglltmny | paytotalintsglltmny | paytotalintsglltmny | number(28, 8) |
| 29 | paytotalintstglmny | paytotalintstglmny | paytotalintstglmny | number(28, 8) |
| 30 | paytotalintstmny | paytotalintstmny | paytotalintstmny | number(28, 8) |
| 31 | paytotalintstolmny | paytotalintstolmny | paytotalintstolmny | number(28, 8) |
| 32 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 33 | pk_bondissueregister | pk_bondissueregister | pk_bondissueregister | char(20) | √ |
| 34 | pk_bond_exec | pk_bond_exec | pk_bond_exec | varchar2(50) | √ |
| 35 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 36 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 37 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 38 | pk_repayplans | pk_repayplans | pk_repayplans | blob |
| 39 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 40 | pk_srcbilltypeid | pk_srcbilltypeid | pk_srcbilltypeid | varchar2(50) |
| 41 | repayamount | repayamount | repayamount | number(28, 8) |
| 42 | serialno | serialno | serialno | number(38, 0) |
| 43 | summary | summary | summary | varchar2(50) |
| 44 | vbillno | vbillno | vbillno | varchar2(50) |
| 45 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 46 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 47 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 48 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 49 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 50 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 51 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 52 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 53 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 54 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 55 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 56 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |