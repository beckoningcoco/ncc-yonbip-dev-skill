# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10750.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costfactor | pk_costfactor | pk_costfactor | char(20) | √ |
| 2 | bentercost | bentercost | bentercost | char(1) |  |  | 'N' |
| 3 | fapportionmode | fapportionmode | fapportionmode | number(38, 0) |  |  | 0 |
| 4 | ifactororder | ifactororder | ifactororder | number(38, 0) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_org_v | pk_org_v | pk_org_v | char(20) |
| 8 | vfactorname | vfactorname | vfactorname | varchar2(300) |
| 9 | vfactorname2 | vfactorname2 | vfactorname2 | varchar2(300) |
| 10 | vfactorname3 | vfactorname3 | vfactorname3 | varchar2(300) |
| 11 | vfactorname4 | vfactorname4 | vfactorname4 | varchar2(300) |
| 12 | vfactorname5 | vfactorname5 | vfactorname5 | varchar2(300) |
| 13 | vfactorname6 | vfactorname6 | vfactorname6 | varchar2(300) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |