# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8744.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | contractnum | contractnum | contractnum | varchar2(42) |
| 2 | id | id | id | number(38, 0) |
| 3 | pk_majorcorp | pk_majorcorp | pk_majorcorp | char(20) |
| 4 | pk_psndoc | pk_psndoc | pk_psndoc | char(20) |
| 5 | pk_psnorg | pk_psnorg | pk_psnorg | char(20) |
| 6 | pk_tag | pk_tag | pk_tag | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |