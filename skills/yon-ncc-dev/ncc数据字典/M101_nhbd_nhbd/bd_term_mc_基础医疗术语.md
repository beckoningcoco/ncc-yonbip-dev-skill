# |<<

**基础医疗术语 (bd_term_mc / com.yonyou.yh.nhis.bd.mcterm.vo.MCTermVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1007.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mc | 医疗术语主键 | pk_mc | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | mcsrc | 术语来源 | mcsrc | varchar(50) |  | 基础医疗术语枚举 (enum) |  | 0=患者就诊; |