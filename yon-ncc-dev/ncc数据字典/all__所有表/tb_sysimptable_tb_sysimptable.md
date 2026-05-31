# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12111.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_imptable | pk_imptable | pk_imptable | char(20) | √ |
| 2 | isstarted | isstarted | isstarted | char(1) |
| 3 | pk_sysbo | pk_sysbo | pk_sysbo | varchar2(20) | √ |
| 4 | pk_sysreg | pk_sysreg | pk_sysreg | varchar2(20) | √ |
| 5 | tablekey | tablekey | tablekey | varchar2(10) | √ |
| 6 | taskname | taskname | taskname | varchar2(50) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |