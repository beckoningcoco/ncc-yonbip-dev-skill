# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10854.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agent_classify | pk_agent_classify | pk_agent_classify | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(20) |  |  | NULL |
| 3 | name | name | name | varchar2(256) |  |  | '~' |
| 4 | parent | parent | parent | char(20) |  |  | NULL |
| 5 | pk_group | pk_group | pk_group | char(20) |  |  | NULL |
| 6 | pk_user | pk_user | pk_user | char(22) |  |  | NULL |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |