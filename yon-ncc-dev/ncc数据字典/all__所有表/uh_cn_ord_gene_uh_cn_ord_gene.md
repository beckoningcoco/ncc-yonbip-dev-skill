# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12512.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | flag_ge | flag_ge | flag_ge | char(1) |
| 2 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 3 | pk_ord | pk_ord | pk_ord | varchar2(20) |
| 4 | pk_ordgene | pk_ordgene | pk_ordgene | char(20) | √ |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_pd | pk_pd | pk_pd | varchar2(20) |  |  | '~' |
| 7 | reason | reason | reason | varchar2(500) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |