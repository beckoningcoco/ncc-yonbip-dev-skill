# |<<

**分布式节点扩展配置表 (bd_distsystemset / nc.vo.bd.distribute.BDDistSystemSetExtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/803.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distsystemset | 主键 | pk_distsystemset | char(20) | √ | 主键 (UFID) |
| 2 | distcode | 分布式节点编码 | distcode | varchar(100) |  | 字符串 (String) |
| 3 | distname | 分布式节点名称 | distname | varchar(100) |  | 字符串 (String) |
| 4 | systemstatus | 系统状态 | systemstatus | integer |  | 分布式节点状态 (DistSystemStatus) | 2 | 1=未启用; |