# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8838.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hr_sort | pk_hr_sort | pk_hr_sort | char(20) | √ |
| 2 | func_code | func_code | func_code | varchar2(60) | √ |
| 3 | group_code | group_code | group_code | varchar2(150) | √ |
| 4 | pk_corp | pk_corp | pk_corp | varchar2(20) | √ |  | '~' |
| 5 | pk_user | pk_user | pk_user | varchar2(20) | √ |  | '~' |
| 6 | remark | remark | remark | varchar2(1500) |
| 7 | var1 | var1 | var1 | varchar2(100) |
| 8 | var2 | var2 | var2 | varchar2(100) |
| 9 | var3 | var3 | var3 | varchar2(100) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |