# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6772.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bizeventlog | pk_bizeventlog | pk_bizeventlog | char(20) | √ |
| 2 | eventtype | eventtype | eventtype | varchar2(50) |
| 3 | eventtypename | eventtypename | eventtypename | varchar2(50) |
| 4 | opertime | opertime | opertime | char(19) |
| 5 | sourceid | sourceid | sourceid | varchar2(50) |
| 6 | sourcename | sourcename | sourcename | varchar2(50) |
| 7 | userid | userid | userid | varchar2(20) |  |  | '~' |
| 8 | userobject | userobject | userobject | blob |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |