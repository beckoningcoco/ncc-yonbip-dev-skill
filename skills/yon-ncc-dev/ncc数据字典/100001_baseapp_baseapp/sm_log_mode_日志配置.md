# |<<

**日志配置 (sm_log_mode / nc.bs.sm.logconfig.LogModeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5314.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logconfig | 主键 | pk_logconfig | char(20) | √ | 主键 (UFID) |
| 2 | recordmodel | 记录模式 | recordmodel | int |  | 整数 (Integer) |
| 3 | type | 日志类型 | type | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集体主键 | pk_group | varchar(36) |  | 组织_集团 (group) |