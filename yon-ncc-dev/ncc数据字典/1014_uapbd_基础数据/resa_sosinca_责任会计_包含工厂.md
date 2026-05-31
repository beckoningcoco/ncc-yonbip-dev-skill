# |<<

**责任会计_包含工厂 (resa_sosinca / nc.vo.resa.controlarea.SOsInCAVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4916.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sosinca | 管控工厂对象标识 | pk_sosinca | char(20) | √ | 主键 (UFID) |
| 2 | pk_factory | 工厂 | pk_factory | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |