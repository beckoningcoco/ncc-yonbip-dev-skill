# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11590.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgtype | pk_msgtype | pk_msgtype | char(20) | √ |
| 2 | clickaction | clickaction | clickaction | varchar2(200) |
| 3 | displocation | displocation | displocation | varchar2(10) |
| 4 | typecode | typecode | typecode | varchar2(50) |
| 5 | typename | typename | typename | varchar2(75) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |