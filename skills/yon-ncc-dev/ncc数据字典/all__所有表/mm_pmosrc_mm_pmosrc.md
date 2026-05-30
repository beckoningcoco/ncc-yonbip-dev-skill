# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9930.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_src | pk_src | pk_src | char(20) | √ |
| 2 | cmoid | cmoid | cmoid | char(20) | √ |
| 3 | cpmoid | cpmoid | cpmoid | varchar2(20) |
| 4 | cpmorowid | cpmorowid | cpmorowid | varchar2(20) |
| 5 | dplanstartdate | dplanstartdate | dplanstartdate | char(19) |
| 6 | nplanoutnum | nplanoutnum | nplanoutnum | number(28, 8) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 10 | vpmocode | vpmocode | vpmocode | varchar2(40) |
| 11 | vpmorowno | vpmorowno | vpmorowno | varchar2(20) |
| 12 | vsrccode | vsrccode | vsrccode | varchar2(40) |
| 13 | vsrcid | vsrcid | vsrcid | varchar2(20) |
| 14 | vsrcrowid | vsrcrowid | vsrcrowid | varchar2(20) |
| 15 | vsrcrowno | vsrcrowno | vsrcrowno | varchar2(20) |
| 16 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 17 | vsrctrantypeid | vsrctrantypeid | vsrctrantypeid | varchar2(20) |  |  | '~' |
| 18 | vsrctype | vsrctype | vsrctype | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |