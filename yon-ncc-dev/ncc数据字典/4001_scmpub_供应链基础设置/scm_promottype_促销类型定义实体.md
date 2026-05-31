# |<<

**促销类型定义实体 (scm_promottype / nc.vo.scmf.promottype.entity.PromotTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5224.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_promottype | 促销类型主键 | pk_promottype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_集团 (group) |
| 4 | vcode | 促销类型编码 | vcode | varchar(40) | √ | 字符串 (String) |
| 5 | vname | 促销类型名称 | vname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |