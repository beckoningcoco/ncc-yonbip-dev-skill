# |<<

**基础档案翻译器信息 (xx_exsystemdoc / nc.vo.pfxx.exsystem.ExsystemDocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6387.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exsystemdoc | 基础档案翻译器信息主键 | pk_exsystemdoc | char(20) | √ | 主键 (UFID) |
| 2 | basicdatatypecode | 基础档案编码 | basicdatatypecode | varchar(36) | √ | 实体 (entity) |
| 3 | basicdoctranslator | 基础档案匹配规则 | basicdoctranslator | decimal(1, 0) | √ | 匹配规则 (enum) |  | 0=仅按对照表; |