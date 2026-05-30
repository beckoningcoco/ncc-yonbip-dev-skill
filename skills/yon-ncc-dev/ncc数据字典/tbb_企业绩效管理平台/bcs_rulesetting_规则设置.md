# |<<

**规则设置 (bcs_rulesetting / c.vo.bcs.hbscheme.RuleSettingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/283.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | 规则主键 | pk_rule | char(20) | √ | 主键 (UFID) |
| 2 | name | 规则名称 | name | varchar(50) |  | 字符串 (String) |
| 3 | note | 规则说明 | note | varchar(50) |  | 字符串 (String) |
| 4 | calcflag | 保存时计算 | calcflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | queryflag | 规则可查询 | queryflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_ref_rule | 关联规则 | pk_ref_rule | varchar(50) |  | 字符串 (String) |
| 7 | pk_taskhead | 所属任务 | pk_taskhead | char(20) |  | 字符串 (String) |