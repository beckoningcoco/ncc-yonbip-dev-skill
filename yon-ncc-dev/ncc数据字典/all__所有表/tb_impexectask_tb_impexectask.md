# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12030.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exectask | pk_exectask | pk_exectask | char(20) | √ |
| 2 | createtime | createtime | createtime | char(19) |
| 3 | isexec | isexec | isexec | char(1) |
| 4 | modifytime | modifytime | modifytime | char(19) |
| 5 | pk_imptask | pk_imptask | pk_imptask | varchar2(20) | √ |
| 6 | pk_sysreg | pk_sysreg | pk_sysreg | varchar2(20) | √ |
| 7 | taskname | taskname | taskname | varchar2(200) |
| 8 | tasktype | tasktype | tasktype | char(1) |
| 9 | creator | creator | creator | varchar2(20) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifier | modifier | modifier | varchar2(20) |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |