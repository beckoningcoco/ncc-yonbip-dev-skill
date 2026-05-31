# |<<

**分布式令牌控制配置子表 (bd_disttokenset_b / nc.vo.bd.distribute.BDDistTokenSetBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/807.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disttokenset_b | 子表主键 | pk_disttokenset_b | char(20) | √ | 主键 (UFID) |
| 2 | ctrlsystemcode | 控制节点编码 | ctrlsystemcode | varchar(100) |  | 字符串 (String) |
| 3 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |