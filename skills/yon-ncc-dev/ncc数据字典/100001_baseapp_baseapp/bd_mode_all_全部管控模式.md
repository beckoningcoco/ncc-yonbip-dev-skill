# |<<

**全部管控模式 (bd_mode_all / nc.vo.bd.config.BDModeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/913.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdmode | 模式主键 | pk_bdmode | char(20) | √ | 主键 (UFID) |
| 2 | ischecked | 选择 | ischecked | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 3 | mdclassid | 档案元数据主键 | mdclassid | char(36) | √ | 实体 (entity) |
| 4 | managemode | 管理模式 | managemode | smallint |  | 模式 (mode) |  | 1=全局; |