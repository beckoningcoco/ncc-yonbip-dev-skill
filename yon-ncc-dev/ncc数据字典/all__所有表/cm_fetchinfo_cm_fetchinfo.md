# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7621.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfetchinfoid | cfetchinfoid | cfetchinfoid | char(20) | √ |
| 2 | bfetched | bfetched | bfetched | char(1) |
| 3 | cbilltype | cbilltype | cbilltype | number(38, 0) |
| 4 | ccostcenterid | ccostcenterid | ccostcenterid | varchar2(20) |  |  | '~' |
| 5 | cperiod | cperiod | cperiod | varchar2(20) |  |  | '~' |
| 6 | ctranstypeid | ctranstypeid | ctranstypeid | varchar2(20) |  |  | '~' |
| 7 | dbegindate | dbegindate | dbegindate | char(19) |
| 8 | denddate | denddate | denddate | char(19) |
| 9 | ifetchobjtype | ifetchobjtype | ifetchobjtype | number(38, 0) |  |  | 1 |
| 10 | ifetchscheme | ifetchscheme | ifetchscheme | number(38, 0) |  |  | 1 |
| 11 | nday | nday | nday | number(38, 0) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pulldatatype | pulldatatype | pulldatatype | number(38, 0) |  |  | 1 |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |