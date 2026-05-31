# |<<

**转正项目定义 (hi_reg_itemset / nc.vo.trn.regitem.TrnRegItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2602.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reg_itemset | 主键 | pk_reg_itemset | char(20) | √ | 主键 (UFID) |
| 2 | pk_infoset | 信息集主键 | pk_infoset | char(20) |  | 主键 (UFID) |
| 3 | pk_infoset_item | 信息项主键 | pk_infoset_item | char(20) |  | 主键 (UFID) |
| 4 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 5 | pk_org | 所属组织 | pk_org | char(20) |  | 主键 (UFID) |
| 6 | itemkey | 项目键值 | itemkey | varchar(128) |  | 字符串 (String) |
| 7 | itemname | 项目显示名称 | itemname | varchar(128) |  | 字符串 (String) |
| 8 | disorder | 显示顺序 | disorder | int |  | 整数 (Integer) |
| 9 | probation_type | 试用类型 | probation_type | int | √ | 试用类型 (TrialType) |  | 1=入职试用; |