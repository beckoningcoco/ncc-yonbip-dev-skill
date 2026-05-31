# |<<

**绩效报表数据同步配置 (sscpfa_transconfig / nc.vo.sscpfa.pfareport.TransConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5567.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transconfig | 主键 | pk_transconfig | char(20) | √ | 主键 (UFID) |
| 2 | beforetime | 同步偏移时间（分钟） | beforetime | int |  | 整数 (Integer) | 10 |
| 3 | property | 同步内容 | property | varchar(50) |  | 字符串 (String) |
| 4 | lasttranstime | 上次同步时间 | lasttranstime | char(19) |  | 日期时间 (UFDateTime) |
| 5 | pk_sscunit | 共享中心 | pk_sscunit | varchar(50) |  | 字符串 (String) |