# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7966.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_authorize | pk_authorize | pk_authorize | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 3 | enddate | enddate | enddate | char(19) |
| 4 | keyword | keyword | keyword | char(20) |
| 5 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_operator | pk_operator | pk_operator | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_roler | pk_roler | pk_roler | varchar2(20) |  |  | '~' |
| 10 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 11 | startdate | startdate | startdate | char(19) |
| 12 | type | type | type | number(38, 0) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |