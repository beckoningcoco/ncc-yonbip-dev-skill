# |<<

**物料组合主实体 (sr_marcombine / nc.vo.scmf.marcombine.entity.MarCombineHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5454.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_marcombine | 物料组合主实体主键 | pk_marcombine | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 主键 (UFID) |
| 4 | vname | 物料组合名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | fmarclassflag | 物料分类方式 | fmarclassflag | int |  | 物料分类方式 (MartialClassType) | 3 | 3=物料基本分类; |