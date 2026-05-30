# |<<

**计划方案 (mm_ps / nc.vo.mmpps.calc.entity.schema.SchemaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3753.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpsid | 计划方案 | cpsid | char(20) | √ | 主键 (UFID) |
| 2 | vpsname | 方案名称 | vpsname | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | vpscode | 方案编码 | vpscode | varchar(30) |  | 字符串 (String) |
| 7 | fpstype | 方案类型 | fpstype | int |  | 方案类型 (SchemaType) |  | 0=MPS; |