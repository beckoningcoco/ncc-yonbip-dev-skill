# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9819.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_md_index | pk_md_index | pk_md_index | varchar2(50) | √ |
| 2 | indexdisplayname | indexdisplayname | indexdisplayname | varchar2(90) |
| 3 | indexname | indexname | indexname | varchar2(50) |
| 4 | resid | resid | resid | varchar2(90) |
| 5 | tableid | tableid | tableid | varchar2(50) |
| 6 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |