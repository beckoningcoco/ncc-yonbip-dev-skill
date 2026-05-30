# |<<

**产出物类型 (pm_outcometype / nc.vo.pmbd.outcometype.OutcomeTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4499.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_outcometype | 产出物类型主键 | pk_outcometype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | type_code | 类型编码 | type_code | varchar(40) | √ | 字符串 (String) |
| 5 | type_name | 类型名称 | type_name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | property | 产出物属性 | property | int | √ | 产出物类型属性 (typeproperty) |  | 1=实物; |