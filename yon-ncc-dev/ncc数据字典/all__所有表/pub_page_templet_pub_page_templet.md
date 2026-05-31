# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10954.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_page_templet | pk_page_templet | pk_page_templet | char(20) | √ |
| 2 | appcode | appcode | appcode | varchar2(50) |
| 3 | clazz | clazz | clazz | varchar2(200) |
| 4 | code | code | code | varchar2(200) |
| 5 | headcode | headcode | headcode | varchar2(50) |
| 6 | isdefault | isdefault | isdefault | char(1) |
| 7 | metaid | metaid | metaid | varchar2(200) |
| 8 | name | name | name | varchar2(200) |
| 9 | pagecode | pagecode | pagecode | varchar2(50) |
| 10 | parentid | parentid | parentid | varchar2(50) |
| 11 | pk_group | pk_group | pk_group | varchar2(50) |
| 12 | pk_org | pk_org | pk_org | varchar2(50) |
| 13 | resid | resid | resid | varchar2(50) |
| 14 | resmodule | resmodule | resmodule | varchar2(100) |
| 15 | templetdesc | templetdesc | templetdesc | varchar2(800) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |