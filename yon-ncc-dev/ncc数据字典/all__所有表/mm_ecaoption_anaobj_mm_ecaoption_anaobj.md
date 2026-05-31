# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9893.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ecaoption_anaobj | pk_ecaoption_anaobj | pk_ecaoption_anaobj | char(20) | √ |
| 2 | ecaobjecttype | ecaobjecttype | ecaobjecttype | number(38, 0) |
| 3 | isanalyze | isanalyze | isanalyze | char(1) |  |  | 'N' |
| 4 | pk_ecaoption | pk_ecaoption | pk_ecaoption | char(20) | √ |
| 5 | vanalyzeorder | vanalyzeorder | vanalyzeorder | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |