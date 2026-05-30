# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10867.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_appcategory | pk_appcategory | pk_appcategory | varchar2(20) | √ |
| 2 | appcategory | appcategory | appcategory | varchar2(50) | √ |
| 3 | apptype | apptype | apptype | varchar2(30) | √ |
| 4 | ordercolumn | ordercolumn | ordercolumn | number(38, 0) | √ |
| 5 | parentcategory | parentcategory | parentcategory | varchar2(50) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |