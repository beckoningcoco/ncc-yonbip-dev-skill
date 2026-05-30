# |<<

**上机日志配置规则 (sm_log_operatelogrule / nc.bs.sm.logconfig.vo.OperatelogRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5316.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_operateconfig | 主键 | pk_operateconfig | char(20) | √ | 主键 (UFID) |
| 2 | pk_funcnode | 功能节点主键 | pk_funcnode | varchar(36) |  | 功能实体 (functionEntity) |
| 3 | pk_group | 集团主键 | pk_group | varchar(36) |  | 组织_集团 (group) |
| 4 | type | 节点类型 | type | varchar(1) |  | 字符串 (String) |