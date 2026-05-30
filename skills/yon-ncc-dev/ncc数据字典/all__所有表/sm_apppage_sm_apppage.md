# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11516.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apppage | pk_apppage | pk_apppage | char(20) | √ |
| 2 | iscarddefault | iscarddefault | iscarddefault | char(1) |
| 3 | isdefault | isdefault | isdefault | char(1) |
| 4 | pagecode | pagecode | pagecode | varchar2(50) | √ |
| 5 | pagedesc | pagedesc | pagedesc | varchar2(200) |
| 6 | pagename | pagename | pagename | varchar2(300) | √ |
| 7 | pageurl | pageurl | pageurl | varchar2(500) |
| 8 | parentcode | parentcode | parentcode | varchar2(50) |  |  | '~' |
| 9 | parent_id | parent_id | parent_id | varchar2(50) | √ |
| 10 | resid | resid | resid | varchar2(100) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |