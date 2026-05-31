# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8415.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_permission_org | pk_permission_org | pk_permission_org | char(20) | √ |
| 2 | permissiontype | permissiontype | permissiontype | number(38, 0) |
| 3 | pk_fathermember | pk_fathermember | pk_fathermember | varchar2(20) |  |  | '~' |
| 4 | pk_fatherorg | pk_fatherorg | pk_fatherorg | varchar2(20) |  |  | '~' |
| 5 | pk_fmsmember | pk_fmsmember | pk_fmsmember | varchar2(20) |  |  | '~' |
| 6 | pk_fundmanasystem | pk_fundmanasystem | pk_fundmanasystem | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_permission_role | pk_permission_role | pk_permission_role | char(20) |
| 9 | pk_role | pk_role | pk_role | varchar2(20) |  |  | '~' |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |