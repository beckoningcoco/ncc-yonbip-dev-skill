# |<<

**业务日志配置规则 (sm_log_busilogrule / nc.bs.sm.busilog.BusiLogRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5313.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiconfig | 主键 | pk_busiconfig | char(20) | √ | 主键 (UFID) |
| 2 | pk_metadata | 业务实体主键 | pk_metadata | varchar(36) |  | 实体 (entity) |
| 3 | pk_operation | 操作主键 | pk_operation | varchar(20) |  | 组织关系_操作 (operate) |
| 4 | pk_group | 集体主键 | pk_group | varchar(20) |  | 组织_集团 (group) |