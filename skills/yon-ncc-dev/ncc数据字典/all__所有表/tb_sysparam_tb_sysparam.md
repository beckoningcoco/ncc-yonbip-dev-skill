# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12114.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysparam | pk_sysparam | pk_sysparam | char(20) | √ |
| 2 | description | description | description | varchar2(150) |
| 3 | enumclass | enumclass | enumclass | varchar2(100) |
| 4 | paramdatatype | paramdatatype | paramdatatype | char(1) |
| 5 | paramname | paramname | paramname | varchar2(20) |
| 6 | paramvalue | paramvalue | paramvalue | varchar2(100) |
| 7 | pk_sysreg | pk_sysreg | pk_sysreg | varchar2(20) | √ |
| 8 | refmodel | refmodel | refmodel | varchar2(100) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |