# |<<

**维度数据结构 (tb_mbrreadstruct / nc.vo.mdm.dim.MemberReadSqlStruct)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5728.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | joins | 连接 | joins | varchar(50) |  | 字符串 (String) |
| 3 | objname | 名称 | objname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | orders | 顺序 | orders | varchar(50) |  | 字符串 (String) |
| 5 | pk_dimhier | 汇总结构PK | pk_dimhier | char(20) |  | 主键 (UFID) |
| 6 | readadjusterargs | 调整参数 | readadjusterargs | varchar(50) |  | 字符串 (String) |
| 7 | readadjusterclass | 调整类 | readadjusterclass | varchar(50) |  | 字符串 (String) |
| 8 | sqlpart | SQL片段 | sqlpart | varchar(50) |  | 字符串 (String) |
| 9 | state | 状态 | state | varchar(50) |  | 字符串 (String) |
| 10 | system | 系统 | system | varchar(50) |  | 字符串 (String) |
| 11 | tables | 表名 | tables | varchar(50) |  | 字符串 (String) |
| 12 | updatehiertype | 更新类型 | updatehiertype | varchar(50) |  | 字符串 (String) |
| 13 | updatetime | 更新时间 | updatetime | char(20) |  | 主键 (UFID) |
| 14 | usetime | 使用时间 | usetime | char(20) |  | 主键 (UFID) |
| 15 | wheres | WHERE条件 | wheres | varchar(50) |  | 字符串 (String) |
| 16 | dr | 启用 | dr | varchar(50) |  | 字符串 (String) |