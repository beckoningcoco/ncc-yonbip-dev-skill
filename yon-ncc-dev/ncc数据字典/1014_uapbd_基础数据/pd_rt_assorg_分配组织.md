# |<<

**分配组织 (pd_rt_assorg / nc.vo.bd.rt.rt0008.entity.AssOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4377.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crt_assorgid | 分配组织 | crt_assorgid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 3 | pk_org_v | 所属组织（多版本） | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 4 | pk_useorg | 使用组织 | pk_useorg | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_useorg_v | 使用组织（多版本） | pk_useorg_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |