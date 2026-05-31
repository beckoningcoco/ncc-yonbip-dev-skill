# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8566.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_subtoass | pk_subtoass | pk_subtoass | char(20) | √ |
| 2 | checktype | checktype | checktype | char(20) |
| 3 | checkvalue | checkvalue | checkvalue | char(20) |
| 4 | freevalueid | freevalueid | freevalueid | char(20) |
| 5 | pk_creditsubject | pk_creditsubject | pk_creditsubject | char(20) |
| 6 | pk_debitsubject | pk_debitsubject | pk_debitsubject | char(20) |
| 7 | pk_subrelation | pk_subrelation | pk_subrelation | char(20) | √ |
| 8 | valuecode | valuecode | valuecode | varchar2(100) |
| 9 | valuename | valuename | valuename | varchar2(100) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |