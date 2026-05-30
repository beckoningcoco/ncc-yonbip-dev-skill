# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9818.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | industry | industry | industry | varchar2(50) | √ |
| 3 | value | value | value | varchar2(512) | √ |
| 4 | versiontype | versiontype | versiontype | number(38, 0) | √ |
| 5 | description | description | description | varchar2(512) |
| 6 | enumsequence | enumsequence | enumsequence | number(38, 0) |
| 7 | hidden | hidden | hidden | char(1) |
| 8 | name | name | name | varchar2(512) |
| 9 | resid | resid | resid | varchar2(90) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |