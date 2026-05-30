# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9884.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_src | pk_src | pk_src | char(20) | √ |
| 2 | cdmoid | cdmoid | cdmoid | varchar2(20) |
| 3 | dplanstartdate | dplanstartdate | dplanstartdate | char(19) |
| 4 | nplanoutnum | nplanoutnum | nplanoutnum | number(28, 8) |
| 5 | pk_dmo | pk_dmo | pk_dmo | char(20) | √ |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 9 | vdmocode | vdmocode | vdmocode | varchar2(40) |
| 10 | vsrccode | vsrccode | vsrccode | varchar2(40) |
| 11 | vsrcid | vsrcid | vsrcid | varchar2(20) |
| 12 | vsrcrowid | vsrcrowid | vsrcrowid | varchar2(20) |
| 13 | vsrcrowno | vsrcrowno | vsrcrowno | varchar2(20) |
| 14 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 15 | vsrctrantypeid | vsrctrantypeid | vsrctrantypeid | varchar2(20) |  |  | '~' |
| 16 | vsrctype | vsrctype | vsrctype | varchar2(20) |  |  | '~' |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |