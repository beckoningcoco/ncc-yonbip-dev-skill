# |<<

**助销员分类 (dcm_helpsellclass / nc.vo.scmf.dcm.helpsellclass.entity.HelpSellClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1694.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sellclass | 助销员分类 | pk_sellclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 3 | vcode | 助销员分类编码 | vcode | varchar(40) |  | 字符串 (String) |
| 4 | vname | 助销员分类名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |