# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12213.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_indicatormanager | pk_indicatormanager | pk_indicatormanager | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | billmaketime | billmaketime | billmaketime | char(19) |
| 4 | capitalinflow | capitalinflow | capitalinflow | number(28, 8) |
| 5 | capitaloutflow | capitaloutflow | capitaloutflow | number(28, 8) |
| 6 | cashflow | cashflow | cashflow | varchar2(50) |
| 7 | economicactivity | economicactivity | economicactivity | varchar2(50) |
| 8 | indicatorcode | indicatorcode | indicatorcode | varchar2(200) |
| 9 | indicatorname | indicatorname | indicatorname | varchar2(200) |
| 10 | isbackgroundtask | isbackgroundtask | isbackgroundtask | char(1) |
| 11 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_indicatorlibrary | pk_indicatorlibrary | pk_indicatorlibrary | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | remark | remark | remark | varchar2(1024) |
| 17 | splitcolumn | splitcolumn | splitcolumn | varchar2(50) |
| 18 | src_billdate | src_billdate | src_billdate | char(19) |
| 19 | src_billtypecode | src_billtypecode | src_billtypecode | varchar2(50) |
| 20 | src_billtypename | src_billtypename | src_billtypename | varchar2(50) |
| 21 | src_pkid | src_pkid | src_pkid | char(20) |
| 22 | src_pk_billtypeid | src_pk_billtypeid | src_pk_billtypeid | varchar2(20) |  |  | '~' |
| 23 | src_vbillno | src_vbillno | src_vbillno | varchar2(50) |
| 24 | transactiondate | transactiondate | transactiondate | char(19) |
| 25 | transactioner | transactioner | transactioner | varchar2(20) |
| 26 | transactionername | transactionername | transactionername | varchar2(500) |
| 27 | vbillno | vbillno | vbillno | varchar2(50) |
| 28 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 29 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 30 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 31 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 32 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 33 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 34 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 35 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 36 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 37 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 38 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 39 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 40 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 41 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 42 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 43 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 44 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 45 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 46 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 47 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 48 | creationtime | creationtime | creationtime | char(19) |
| 49 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 52 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |