# |<<

**助销员 (dcm_helpseller / nc.vo.scmf.dcm.helpseller.entity.HelpSellerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1695.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cseller | 主键 | pk_cseller | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | csellclassid | 助销员分类 | csellclassid | varchar(20) |  | 助销员分类 (dcm_helpsellclass) |
| 5 | vcode | 助销员编码 | vcode | varchar(50) |  | 字符串 (String) |
| 6 | vname | 助销员名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |