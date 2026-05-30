# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10497.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccondid | ccondid | ccondid | char(20) | √ |
| 2 | cwkid | cwkid | cwkid | varchar2(20) |  |  | '~' |
| 3 | dbegindate | dbegindate | dbegindate | char(19) |
| 4 | dcalendardate | dcalendardate | dcalendardate | char(19) |
| 5 | denddate | denddate | denddate | char(19) |
| 6 | icirclenum | icirclenum | icirclenum | number(38, 0) |
| 7 | ishiftcircle | ishiftcircle | ishiftcircle | number(38, 0) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |