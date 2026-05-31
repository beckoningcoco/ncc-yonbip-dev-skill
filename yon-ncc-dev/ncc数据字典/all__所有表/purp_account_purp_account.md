# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11054.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account | pk_account | pk_account | char(20) | √ |
| 2 | bdefault | bdefault | bdefault | char(1) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 6 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 7 | vmailaddr | vmailaddr | vmailaddr | varchar2(50) |
| 8 | vpassword | vpassword | vpassword | varchar2(200) |
| 9 | vrecvaddr | vrecvaddr | vrecvaddr | varchar2(50) |
| 10 | vsendaddr | vsendaddr | vsendaddr | varchar2(50) |
| 11 | vusername | vusername | vusername | varchar2(50) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |